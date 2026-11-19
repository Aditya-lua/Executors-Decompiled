/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bb074
 */

void FUN_008bb074(undefined8 param_1,long param_2,undefined8 param_3)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_2 + 0x28);
  if ((DAT_00d1fc90 & 1) == 0) {
    iVar2 = __cxa_guard_acquire(&DAT_00d1fc90);
    if (iVar2 != 0) {
                    /* try { // try from 008bb160 to 008bb163 has its CatchHandler @ 008bb184 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
  }
  if (lVar3 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
    uVar1 = 1 << (ulong)(*(byte *)(param_2 + 5) & 0x1f);
    FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x28),
                 -(ulong)(uVar1 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar1 << 5,
                 *(undefined1 *)(param_2 + 1));
  }
  lVar3 = *(long *)(param_2 + 0x20);
  if (lVar3 != 0) {
    if ((*(byte *)(param_2 + 7) >> 1 & 1) == 0) {
      uVar1 = *(uint *)(param_2 + 8);
    }
    else {
      lVar3 = lVar3 + -0x150;
      uVar1 = *(int *)(param_2 + 8) + 0x15;
    }
    FUN_008b7a9c(param_1,lVar3,-(ulong)(uVar1 >> 0x1f) & 0xfffffff000000000 | (ulong)uVar1 << 4,
                 *(undefined1 *)(param_2 + 1));
  }
  FUN_008b7bd4(param_1,param_2,0x30,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

