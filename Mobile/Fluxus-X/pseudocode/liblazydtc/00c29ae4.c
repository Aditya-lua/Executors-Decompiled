/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29ae4
 */

undefined4 __cxa_uncaught_exceptions(void)

{
  undefined4 uVar1;
  long lVar2;
  
                    /* try { // try from 00c29af0 to 00c29af3 has its CatchHandler @ 00c29b08 */
  lVar2 = __cxa_get_globals_fast();
  uVar1 = 0;
  if (lVar2 != 0) {
    uVar1 = *(undefined4 *)(lVar2 + 8);
  }
  return uVar1;
}

