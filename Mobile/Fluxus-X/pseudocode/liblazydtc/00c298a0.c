/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c298a0
 */

long __cxa_current_primary_exception(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
                    /* try { // try from 00c298b0 to 00c298b3 has its CatchHandler @ 00c2991c */
  plVar1 = (long *)__cxa_get_globals_fast();
  lVar2 = 0;
  if (plVar1 != (long *)0x0) {
    lVar3 = *plVar1;
    if ((lVar3 == 0) || (*(ulong *)(lVar3 + 0x60) >> 8 != 0x434c4e47432b2b)) {
      lVar2 = 0;
    }
    else {
      if ((*(ulong *)(lVar3 + 0x60) & 0xff) == 1) {
        lVar3 = *(long *)(lVar3 + 8) + -0x80;
      }
      lVar2 = lVar3 + 0x80;
      FUN_00c2bd10(1,lVar3 + 8);
    }
  }
  return lVar2;
}

