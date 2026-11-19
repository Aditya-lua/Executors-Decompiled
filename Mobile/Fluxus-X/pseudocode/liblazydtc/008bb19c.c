/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bb19c
 */

long FUN_008bb19c(long param_1,int param_2)

{
  uint uVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  double dVar5;
  
  if (param_2 - 1U < *(uint *)(param_1 + 8)) {
    lVar4 = *(long *)(param_1 + 0x20) + (long)(int)(param_2 - 1U) * 0x10;
  }
  else {
    lVar4 = *(long *)(param_1 + 0x28);
    if (((DAT_00d1fc90 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1fc90), iVar2 != 0)) {
                    /* try { // try from 008bb32c to 008bb32f has its CatchHandler @ 008bb398 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
    if (lVar4 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008bb368 to 008bb36b has its CatchHandler @ 008bb384 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
    }
    else {
      dVar5 = (double)param_2;
      uVar3 = (uint)((ulong)dVar5 >> 0x20) & 0x7fffffff;
      uVar1 = (SUB84(dVar5,0) ^ uVar3 >> 0x12) * 0x5bd1e995;
      uVar3 = (uVar3 ^ uVar1 >> 0x16) * 0x5bd1e995;
      lVar4 = *(long *)(param_1 + 0x28) +
              (ulong)((uVar3 ^ (uVar1 ^ uVar3 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                     (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
      while( true ) {
        uVar1 = *(uint *)(lVar4 + 0x1c);
        if (((uVar1 & 0xf) == 3) && (*(double *)(lVar4 + 0x10) == dVar5)) {
          return lVar4;
        }
        if (uVar1 < 0x10) break;
        lVar4 = lVar4 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
      }
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008bb2a8 to 008bb2ab has its CatchHandler @ 008bb388 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
    }
    lVar4 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
  }
  return lVar4;
}

