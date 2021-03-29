package extensions_functions

import java.math.BigDecimal

//sem precisar herdar ou algum pathern
//escopo a mais de função, extendemos, criando novas funções

fun Array<BigDecimal>.somatoria()= this.reduce{
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty())BigDecimal.ZERO
else this.somatoria() / this.size.toBigDecimal()