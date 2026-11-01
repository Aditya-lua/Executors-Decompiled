
/* WARNING: Removing unreachable block (ram,0x00610b94) */

void FUN_00610b54(long param_1)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  uint uVar6;
  ulong uVar7;
  long unaff_x19;
  long unaff_x20;
  ulong uVar8;
  
  if ((*(undefined **)(param_1 + 8) == &UNK_008bab39) &&
     (uVar4 = func_0x0060dff4(), (uVar4 & 1) != 0)) {
    return;
  }
  func_0x0003eef0();
  if (unaff_x19 == unaff_x20 + 0x20) {
    return;
  }
  uVar4 = *(ulong *)(unaff_x19 + 0x18);
  lVar5 = *(long *)(unaff_x20 + 0x40);
  if ((uVar4 == *(ulong *)(unaff_x20 + 0x38)) &&
     (*(long *)(lVar5 + (uVar4 & 0x3ffffffffffffffe) * 4) != 0)) {
    lVar3 = *(long *)(unaff_x19 + 0x20);
    uVar8 = uVar4;
    if (lVar3 == lVar5) goto code_r0x005ffdc4;
  }
  else {
    uVar8 = *(ulong *)(unaff_x20 + 0x38);
    do {
      uVar7 = 0;
      if (uVar8 == 0) goto code_r0x005ffd44;
      uVar7 = uVar8 - 1;
      lVar3 = uVar8 * 8;
      uVar8 = uVar7;
    } while (*(long *)(lVar5 + -8 + lVar3) == 0);
    uVar6 = (int)uVar7 + 1;
    uVar7 = (ulong)uVar6;
    if (uVar6 < 9) {
code_r0x005ffd44:
      uVar8 = (ulong)*(uint *)(&UNK_008babcc + uVar7 * 4);
    }
    else if (uVar7 < 0x11) {
      uVar8 = 0x10;
    }
    else if (uVar7 < 0x21) {
      uVar8 = 0x20;
    }
    else if (uVar7 < 0x41) {
      uVar8 = 0x40;
    }
    else {
      uVar6 = 0;
      uVar8 = 0x40;
      do {
        uVar2 = uVar6 + (uint)uVar8 >> 1;
        uVar1 = uVar2;
        if (uVar7 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
          uVar1 = (uint)uVar8;
          uVar6 = uVar2;
        }
        uVar8 = (ulong)uVar1;
      } while (1 < uVar1 - uVar6);
      uVar8 = 1L << (uVar8 & 0x3f);
    }
    lVar3 = *(long *)(unaff_x19 + 0x20);
    if (uVar4 != uVar8) {
      if (lVar3 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(lVar3 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar8);
      if (uVar8 == 0) {
        lVar3 = 0;
      }
      else {
        lVar3 = func_0x006115d0(uVar8 << 3);
      }
    }
    *(ulong *)(unaff_x19 + 0x18) = uVar8;
    *(long *)(unaff_x19 + 0x20) = lVar3;
    *(undefined8 *)(unaff_x19 + 0x10) = 0x1fffffffffffffff;
    lVar5 = *(long *)(unaff_x20 + 0x40);
    if (lVar3 == lVar5) goto code_r0x005ffdc4;
  }
  _memcpy(lVar3,lVar5,uVar8 << 3);
code_r0x005ffdc4:
  *(undefined4 *)(unaff_x19 + 0x28) = *(undefined4 *)(unaff_x20 + 0x48);
  return;
}

