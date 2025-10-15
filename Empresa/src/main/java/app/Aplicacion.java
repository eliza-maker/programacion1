package app;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa("Uniquindio", "123456789", "Calle 41 20-59, Calarcá, Quindio");

        while (true) {
            System.out.println("\n=== Sistema de Gestión Empresarial ===");
            System.out.println("1. Ingresar Cliente Corporativo");
            System.out.println("2. Ingresar Cliente Frecuente");
            System.out.println("3. Buscar Cliente");
            System.out.println("4. Actualizar Cliente");
            System.out.println("5. Eliminar Cliente");
            System.out.println("6. Ingresar Producto Alimenticio");
            System.out.println("7. Ingresar Producto Electrodoméstico");
            System.out.println("8. Buscar Producto");
            System.out.println("9. Actualizar Producto");
            System.out.println("10. Eliminar Producto");
            System.out.println("11. Generar Factura");
            System.out.println("12. Mostrar Facturas");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese cédula del cliente corporativo: ");
                        String cedula = scanner.nextLine();
                        System.out.print("Ingrese nombre del cliente: ");
                        String nombreCliente = scanner.nextLine();
                        System.out.print("Ingrese dirección del cliente: ");
                        String direccionCliente = scanner.nextLine();
                        System.out.print("Ingrese NIT: ");
                        String nit = scanner.nextLine();
                        System.out.print("Ingrese porcentaje de descuento: ");
                        double porcentDescuento = scanner.nextDouble();
                        scanner.nextLine();
                        Cliente clienteCorporativo = new ClienteCorporativo(nombreCliente, cedula, direccionCliente, nit, porcentDescuento);
                        System.out.println(empresa.ingresarCliente(clienteCorporativo));
                        break;

                    case 2:
                        System.out.print("Ingrese cédula del cliente frecuente: ");
                        cedula = scanner.nextLine();
                        System.out.print("Ingrese nombre del cliente: ");
                        nombreCliente = scanner.nextLine();
                        System.out.print("Ingrese dirección del cliente: ");
                        direccionCliente = scanner.nextLine();
                        System.out.print("Ingrese puntos de fidelidad: ");
                        int porcentFidelidad = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese porcentaje de descuento: ");
                        porcentDescuento = scanner.nextDouble();
                        scanner.nextLine();
                        Cliente clienteFrecuente = new ClienteFrecuente(nombreCliente, cedula, direccionCliente, porcentFidelidad, porcentDescuento);
                        System.out.println(empresa.ingresarCliente(clienteFrecuente));
                        break;

                    case 3:
                        System.out.print("Ingrese cédula del cliente: ");
                        cedula = scanner.nextLine();
                        empresa.buscarCliente(cedula).ifPresentOrElse(c -> System.out.println("Cliente encontrado: "
                                + c.getNombre() + ", " + c.getDireccion() + ", " + c.toString()), () -> System.out.println("Cliente no encontrado"));
                        break;

                    case 4:
                        System.out.print("Ingrese cédula del cliente: ");
                        cedula = scanner.nextLine();
                        System.out.print("Ingrese nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        System.out.print("Ingrese nueva dirección: ");
                        String nuevaDireccion = scanner.nextLine();
                        System.out.println(empresa.actualizarCliente(nuevoNombre, cedula, nuevaDireccion));
                        break;

                    case 5:
                        System.out.print("Ingrese cédula del cliente: ");
                        cedula = scanner.nextLine();
                        System.out.println(empresa.eliminarCliente(cedula));
                        break;

                    case 6:
                        System.out.print("Ingrese código del producto alimenticio: ");
                        String codigoProducto = scanner.nextLine();
                        System.out.print("Ingrese nombre del producto: ");
                        String nombreProducto = scanner.nextLine();
                        System.out.print("Ingrese precio del producto: ");
                        double precio = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Ingrese fecha de vencimiento (YYYY-MM-DD): ");
                        String fechaVencimientoStr = scanner.nextLine();
                        try {
                            LocalDate fechaVencimiento = LocalDate.parse(fechaVencimientoStr);
                            Producto productoAlimenticio = new ProductoAlimenticio(codigoProducto, nombreProducto, precio, fechaVencimiento);
                            System.out.println(empresa.ingresarProducto(productoAlimenticio));
                        } catch (java.time.format.DateTimeParseException e) {
                            System.out.println("Formato de fecha inválido. Use YYYY-MM-DD (ejemplo: 2025-12-31).");
                        }
                        break;

                    case 7:
                        System.out.print("Ingrese código del producto electrodoméstico: ");
                        codigoProducto = scanner.nextLine();
                        System.out.print("Ingrese nombre del producto: ");
                        nombreProducto = scanner.nextLine();
                        System.out.print("Ingrese precio del producto: ");
                        precio = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Ingrese meses de garantía: ");
                        int garantia = scanner.nextInt();
                        scanner.nextLine();
                        Producto productoElectrodomestico = new ProductoElectrodomestico(codigoProducto, nombreProducto, precio, garantia);
                        System.out.println(empresa.ingresarProducto(productoElectrodomestico));
                        break;

                    case 8:
                        System.out.print("Ingrese código del producto: ");
                        codigoProducto = scanner.nextLine();
                        empresa.buscarProducto(codigoProducto).ifPresentOrElse(p -> System.out.println("Producto encontrado: "
                                + p.getNombre() + ", $" + p.getPrecioUnidad() + ", " + p.toString()), () -> System.out.println("Producto no encontrado"));
                        break;

                    case 9:
                        System.out.print("Ingrese código del producto: ");
                        codigoProducto = scanner.nextLine();
                        System.out.print("Ingrese nuevo nombre: ");
                        nuevoNombre = scanner.nextLine();
                        System.out.print("Ingrese nuevo precio: ");
                        double nuevoPrecio = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println(empresa.actualizarProducto(codigoProducto, nuevoNombre, nuevoPrecio));
                        break;

                    case 10:
                        System.out.print("Ingrese código del producto: ");
                        codigoProducto = scanner.nextLine();
                        System.out.println(empresa.eliminarProducto(codigoProducto));
                        break;

                    case 11:
                        System.out.print("Ingrese código de la factura: ");
                        String codigoFactura = scanner.nextLine();
                        System.out.print("Ingrese cédula del cliente: ");
                        cedula = scanner.nextLine();
                        Optional<Cliente> clienteFactura = empresa.buscarCliente(cedula);
                        if (!clienteFactura.isPresent()) {
                            System.out.println("Cliente no encontrado");
                            break;
                        }
                        ArrayList<DetalleFactura> detalles = new ArrayList<>();
                        while (true) {
                            System.out.print("Ingrese código del producto (o 'fin' para terminar): ");
                            codigoProducto = scanner.nextLine();
                            if (codigoProducto.equalsIgnoreCase("fin")) break;
                            Optional<Producto> productoFactura = empresa.buscarProducto(codigoProducto);
                            if (!productoFactura.isPresent()) {
                                System.out.println("Producto no encontrado");
                                continue;
                            }
                            System.out.print("Ingrese cantidad: ");
                            try {
                                int cantidad = scanner.nextInt();
                                scanner.nextLine();
                                DetalleFactura detalle = new DetalleFactura(cantidad, productoFactura.get());
                                detalles.add(detalle);
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("Cantidad inválida. Ingrese un número entero.");
                                scanner.nextLine();
                            }
                        }
                        if (!detalles.isEmpty()) {
                            System.out.println(empresa.generarFactura(codigoFactura, clienteFactura.get(), detalles));
                        } else {
                            System.out.println("No se agregaron productos a la factura");
                        }
                        break;

                    case 12:
                        empresa.mostrarFacturas();
                        break;

                    case 13:
                        System.out.println("Saliendo del sistema...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida, por favoringrese un número válido.");
                scanner.nextLine();
            }
        }
    }
}
