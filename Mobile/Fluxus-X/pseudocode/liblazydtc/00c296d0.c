/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c296d0
 */

void __cxa_decrement_exception_refcount(long param_1)

{
  long lVar1;
  
  if ((param_1 != 0) && (lVar1 = FUN_00c2bd10(0xffffffffffffffff,param_1 + -0x78), lVar1 == 1)) {
    if (*(code **)(param_1 + -0x68) != (code *)0x0) {
                    /* try { // try from 00c29704 to 00c2970b has its CatchHandler @ 00c29724 */
      (**(code **)(param_1 + -0x68))(param_1);
    }
                    /* try { // try from 00c29710 to 00c29713 has its CatchHandler @ 00c29728 */
    FUN_00c29ce0(param_1 + -0x80);
  }
  return;
}

