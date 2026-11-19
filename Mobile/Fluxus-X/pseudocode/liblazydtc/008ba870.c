/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ba870
 */

int FUN_008ba870(long param_1,int param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x28);
  if (((DAT_00d1fc90 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1fc90), iVar2 != 0)) {
                    /* try { // try from 008ba934 to 008ba937 has its CatchHandler @ 008ba950 */
    DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1fc90);
  }
  if (lVar3 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
    bVar1 = param_2 < *(int *)(param_1 + 8);
  }
  else {
    bVar1 = true;
  }
  do {
    do {
      iVar2 = param_2;
      param_2 = iVar2 + 1;
    } while (param_3 + -1 == iVar2);
  } while ((bVar1) && (lVar3 = FUN_008bb19c(param_1,param_2), *(int *)(lVar3 + 0xc) != 0));
  return iVar2;
}

