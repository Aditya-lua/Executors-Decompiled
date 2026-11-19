/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aea7c
 */

long FUN_008aea7c(long param_1,int param_2)

{
  int iVar1;
  long lVar2;
  undefined8 *puVar4;
  undefined8 uVar3;
  long lVar5;
  
  if (param_2 == -0x2712) {
    lVar2 = *(long *)(param_1 + 0x60);
    uVar3 = *(undefined8 *)(param_1 + 0x78);
  }
  else {
    if (param_2 != -0x2711) {
      if (param_2 == -10000) {
        return *(long *)(param_1 + 0x60) + 0x620;
      }
      lVar2 = **(long **)(*(long *)(param_1 + 0x50) + 8);
      if (-param_2 - 0x2712U <= (uint)*(byte *)(lVar2 + 5)) {
        return lVar2 + (ulong)(-param_2 - 0x2713) * 0x10 + 0x30;
      }
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008aeb80 to 008aeb83 has its CatchHandler @ 008aeb98 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      return (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
    lVar2 = *(long *)(param_1 + 0x60);
    if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x20)) {
      puVar4 = (undefined8 *)(param_1 + 0x78);
    }
    else {
      puVar4 = (undefined8 *)(**(long **)(*(long *)(param_1 + 0x50) + 8) + 0x10);
    }
    uVar3 = *puVar4;
  }
  *(undefined8 *)(lVar2 + 0x610) = uVar3;
  lVar5 = *(long *)(param_1 + 0x60);
  *(undefined4 *)(lVar2 + 0x61c) = 6;
  return lVar5 + 0x610;
}

