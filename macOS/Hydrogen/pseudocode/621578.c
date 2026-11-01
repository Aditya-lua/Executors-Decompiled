
void FUN_00621578(long param_1)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  uint uVar7;
  ulong uVar8;
  long unaff_x19;
  ulong uVar9;
  
  lVar4 = (**(code **)(**(long **)(param_1 + 8) + 0x80))();
  if (unaff_x19 == lVar4) {
    return;
  }
  uVar6 = *(ulong *)(unaff_x19 + 0x18);
  lVar5 = *(long *)(lVar4 + 0x20);
  if ((uVar6 == *(ulong *)(lVar4 + 0x18)) &&
     (*(long *)(lVar5 + (uVar6 & 0x3ffffffffffffffe) * 4) != 0)) {
    lVar3 = *(long *)(unaff_x19 + 0x20);
    uVar9 = uVar6;
    if (lVar3 == lVar5) goto code_r0x005ffdc4;
  }
  else {
    uVar9 = *(ulong *)(lVar4 + 0x18);
    do {
      uVar8 = 0;
      if (uVar9 == 0) goto code_r0x005ffd44;
      uVar8 = uVar9 - 1;
      lVar3 = uVar9 * 8;
      uVar9 = uVar8;
    } while (*(long *)(lVar5 + -8 + lVar3) == 0);
    uVar7 = (int)uVar8 + 1;
    uVar8 = (ulong)uVar7;
    if (uVar7 < 9) {
code_r0x005ffd44:
      uVar9 = (ulong)*(uint *)(&UNK_008babcc + uVar8 * 4);
    }
    else if (uVar8 < 0x11) {
      uVar9 = 0x10;
    }
    else if (uVar8 < 0x21) {
      uVar9 = 0x20;
    }
    else if (uVar8 < 0x41) {
      uVar9 = 0x40;
    }
    else {
      uVar7 = 0;
      uVar9 = 0x40;
      do {
        uVar2 = uVar7 + (uint)uVar9 >> 1;
        uVar1 = uVar2;
        if (uVar8 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
          uVar1 = (uint)uVar9;
          uVar7 = uVar2;
        }
        uVar9 = (ulong)uVar1;
      } while (1 < uVar1 - uVar7);
      uVar9 = 1L << (uVar9 & 0x3f);
    }
    lVar3 = *(long *)(unaff_x19 + 0x20);
    if (uVar6 != uVar9) {
      if (lVar3 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lVar3 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar9);
      if (uVar9 == 0) {
        lVar3 = 0;
      }
      else {
        lVar3 = func_0x006115d0(uVar9 << 3);
      }
    }
    *(ulong *)(unaff_x19 + 0x18) = uVar9;
    *(long *)(unaff_x19 + 0x20) = lVar3;
    *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
    lVar5 = *(long *)(lVar4 + 0x20);
    if (lVar3 == lVar5) goto code_r0x005ffdc4;
  }
  _memcpy(lVar3,lVar5,uVar9 << 3);
code_r0x005ffdc4:
  *(undefined4 *)(unaff_x19 + 0x28) = *(undefined4 *)(lVar4 + 0x28);
  return;
}

