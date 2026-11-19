/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bb440
 */

long FUN_008bb440(long param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x28) +
          (ulong)(*(uint *)(param_2 + 0x10) &
                 (-1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f) ^ 0xffffffffU)) * 0x20;
  while( true ) {
    uVar1 = *(uint *)(lVar3 + 0x1c);
    if (((uVar1 & 0xf) == 5) && (*(long *)(lVar3 + 0x10) == param_2)) break;
    if (uVar1 < 0x10) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008bb4dc to 008bb4df has its CatchHandler @ 008bb4f4 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      return (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
    lVar3 = lVar3 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
  }
  return lVar3;
}

