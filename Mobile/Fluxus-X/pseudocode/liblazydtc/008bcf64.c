/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bcf64
 */

uint FUN_008bcf64(long param_1)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  uint uVar7;
  
  if (*(int *)(param_1 + 0xc) < 0) {
    uVar3 = *(uint *)(param_1 + 8);
    uVar7 = -*(int *)(param_1 + 0xc);
  }
  else {
    uVar3 = *(uint *)(param_1 + 8);
    uVar7 = uVar3;
    if ((int)uVar3 < 1) {
      return uVar3;
    }
  }
  if (*(int *)(*(long *)(param_1 + 0x20) + (long)(int)uVar3 * 0x10 + -4) != 0) {
    lVar5 = *(long *)(param_1 + 0x28);
    if (((DAT_00d1fc90 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1fc90), iVar2 != 0)) {
                    /* try { // try from 008bd130 to 008bd133 has its CatchHandler @ 008bd154 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
    uVar3 = *(uint *)(param_1 + 8);
    if (lVar5 == (long)&DWORD_007f3700 + DAT_00d1fc88) {
      return uVar3;
    }
  }
  if ((int)uVar7 < (int)uVar3) {
    lVar6 = *(long *)(param_1 + 0x20);
    lVar5 = lVar6 + (ulong)uVar7 * 0x10;
    if ((*(int *)(lVar5 + -4) != 0) && (*(int *)(lVar6 + (ulong)uVar7 * 0x10 + 0xc) == 0)) {
      return uVar7;
    }
    uVar4 = uVar7 - 1;
    if (*(int *)(lVar6 + (ulong)uVar4 * 0x10 + 0xc) != 0) goto LAB_008bd010;
    if ((1 < uVar7) && (*(int *)(lVar5 + -0x14) != 0)) {
      if (0 < *(int *)(param_1 + 0xc)) {
        return uVar4;
      }
      uVar7 = 1 - uVar7;
      goto LAB_008bd0e0;
    }
  }
  else {
LAB_008bd010:
    uVar4 = uVar7 + 1;
    if ((int)uVar4 < (int)uVar3) {
      if ((*(int *)(*(long *)(param_1 + 0x20) + (ulong)uVar7 * 0x10 + 0xc) != 0) &&
         (*(int *)(*(long *)(param_1 + 0x20) + (ulong)uVar4 * 0x10 + 0xc) == 0)) {
        if (0 < *(int *)(param_1 + 0xc)) {
          return uVar4;
        }
        uVar7 = ~uVar7;
        goto LAB_008bd0e0;
      }
    }
    else if ((int)uVar3 < 1) {
      return uVar3;
    }
  }
  lVar5 = *(long *)(param_1 + 0x20);
  if (*(int *)(lVar5 + (ulong)uVar3 * 0x10 + -4) != 0) {
    return uVar3;
  }
  lVar6 = lVar5;
  if (uVar3 != 1) {
    do {
      lVar1 = lVar6 + (long)((int)uVar3 >> 1) * 0x10;
      uVar3 = uVar3 - ((int)uVar3 >> 1);
      if (*(int *)(lVar1 + 0xc) != 0) {
        lVar6 = lVar1;
      }
    } while (1 < uVar3);
  }
  uVar4 = (uint)((ulong)(lVar6 - lVar5) >> 4);
  if (*(int *)(lVar6 + 0xc) != 0) {
    uVar4 = uVar4 + 1;
  }
  if (0 < *(int *)(param_1 + 0xc)) {
    return uVar4;
  }
  uVar7 = -uVar4;
LAB_008bd0e0:
  *(uint *)(param_1 + 0xc) = uVar7;
  return uVar4;
}

