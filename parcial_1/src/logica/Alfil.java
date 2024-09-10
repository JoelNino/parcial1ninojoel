package logica;

public class Alfil extends Ficha {
    
    public Alfil(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCantidadCasillas() {
        int cantidad = 0;
        
        // Movimientos  (↘️)
        int movimientosAbajoDerecha = Math.min(8 - fila, 8 - columna);
        
        // Movimientos (↗️)
        int movimientosArribaDerecha = Math.min(8 - fila, columna - 1);
        
        // Movimientos (↙️)
        int movimientosAbajoIzquierda = Math.min(fila - 1, 8 - columna);
        
        // Movimientos (↖️)
        int movimientosArribaIzquierda = Math.min(fila - 1, columna - 1);
        
        cantidad = movimientosArribaDerecha + movimientosArribaIzquierda + movimientosAbajoDerecha + movimientosAbajoIzquierda;
        
        return cantidad;
    }
}
