/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bd380
 */

void FUN_008bd380(long param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  undefined4 *puVar6;
  ulong uVar7;
  ulong uVar8;
  
  uVar1 = *(uint *)(param_1 + 8);
  uVar3 = (ulong)uVar1;
  if (0 < (int)uVar1) {
    lVar5 = *(long *)(param_1 + 0x20);
    if (uVar1 == 1) {
      uVar7 = 0;
    }
    else {
      uVar7 = uVar3 & 0x7ffffffe;
      puVar6 = (undefined4 *)(lVar5 + 0x1c);
      uVar8 = uVar7;
      do {
        uVar8 = uVar8 - 2;
        puVar6[-4] = 0;
        *puVar6 = 0;
        puVar6 = puVar6 + 8;
      } while (uVar8 != 0);
      if (uVar7 == uVar3) goto LAB_008bd3ec;
    }
    lVar4 = uVar3 - uVar7;
    puVar6 = (undefined4 *)(lVar5 + uVar7 * 0x10 + 0xc);
    do {
      lVar4 = lVar4 + -1;
      *puVar6 = 0;
      puVar6 = puVar6 + 4;
    } while (lVar4 != 0);
  }
LAB_008bd3ec:
  if (*(int *)(param_1 + 0xc) < 1) {
    *(undefined4 *)(param_1 + 0xc) = 0;
  }
  lVar5 = *(long *)(param_1 + 0x28);
  if ((DAT_00d1fc90 & 1) == 0) {
    iVar2 = __cxa_guard_acquire(&DAT_00d1fc90);
    if (iVar2 != 0) {
                    /* try { // try from 008bd4b0 to 008bd4b3 has its CatchHandler @ 008bd4d4 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
  }
  if (lVar5 != (long)&DWORD_007f3700 + DAT_00d1fc88) {
    uVar1 = 1 << (ulong)(*(byte *)(param_1 + 5) & 0x1f);
    *(uint *)(param_1 + 0xc) = uVar1;
    if (*(byte *)(param_1 + 5) != 0x1f) {
      lVar5 = 0;
      if ((int)uVar1 < 2) {
        uVar1 = 1;
      }
      do {
        lVar4 = *(long *)(param_1 + 0x28) + lVar5;
        lVar5 = lVar5 + 0x20;
        *(undefined4 *)(lVar4 + 0xc) = 0;
        *(undefined4 *)(lVar4 + 0x1c) = 0;
      } while ((ulong)uVar1 * 0x20 != lVar5);
    }
  }
  *(undefined1 *)(param_1 + 6) = 0xff;
  return;
}

