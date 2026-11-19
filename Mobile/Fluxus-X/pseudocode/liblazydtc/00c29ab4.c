/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c29ab4
 */

bool __cxa_uncaught_exception(void)

{
  bool bVar1;
  long lVar2;
  
                    /* try { // try from 00c29ac0 to 00c29ac3 has its CatchHandler @ 00c29ae0 */
  lVar2 = __cxa_get_globals_fast();
  bVar1 = false;
  if (lVar2 != 0) {
    bVar1 = *(int *)(lVar2 + 8) != 0;
  }
  return bVar1;
}

