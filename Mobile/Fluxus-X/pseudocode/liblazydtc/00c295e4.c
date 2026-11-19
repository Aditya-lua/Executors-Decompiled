/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c295e4
 */

void __cxa_end_catch(void)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  
  plVar2 = (long *)__cxa_get_globals_fast();
  lVar3 = *plVar2;
  if (lVar3 == 0) {
    return;
  }
  if (*(ulong *)(lVar3 + 0x60) >> 8 == 0x434c4e47432b2b) {
    iVar1 = *(int *)(lVar3 + 0x38);
    if (-1 < iVar1) {
      *(int *)(lVar3 + 0x38) = iVar1 + -1;
      if (iVar1 + -1 != 0) {
        return;
      }
      *plVar2 = *(long *)(lVar3 + 0x30);
      lVar4 = lVar3;
      if (*(char *)(lVar3 + 0x60) == '\x01') {
        lVar4 = *(long *)(lVar3 + 8) + -0x80;
        FUN_00c29ce0(lVar3);
      }
      lVar3 = FUN_00c2bd10(0xffffffffffffffff,lVar4 + 8);
      if (lVar3 != 1) {
        return;
      }
      if (*(code **)(lVar4 + 0x18) != (code *)0x0) {
                    /* try { // try from 00c29678 to 00c2967f has its CatchHandler @ 00c296c8 */
        (**(code **)(lVar4 + 0x18))(lVar4 + 0x80);
      }
                    /* try { // try from 00c29680 to 00c29687 has its CatchHandler @ 00c296cc */
      FUN_00c29ce0(lVar4);
      return;
    }
    *(int *)(lVar3 + 0x38) = iVar1 + 1;
    if (iVar1 != -1) {
      return;
    }
    lVar3 = *(long *)(lVar3 + 0x30);
  }
  else {
    FUN_00c2c2d0((ulong *)(lVar3 + 0x60));
    lVar3 = 0;
  }
  *plVar2 = lVar3;
  return;
}

