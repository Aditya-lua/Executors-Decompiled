
long FUN_006a82cc(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  long unaff_x29;
  undefined1 auVar13 [16];
  
  ___cxa_free_exception();
  func_0x00087574(unaff_x29 + -0x50);
  __Unwind_Resume();
  uVar5 = func_0x0001753c();
  func_0x00087574(unaff_x29 + -0x50);
  auVar13 = __Unwind_Resume(uVar5);
  lVar8 = auVar13._8_8_;
  lVar6 = auVar13._0_8_;
  lVar1 = lVar6 + 0x108;
  if (lVar1 == lVar8) {
    return lVar1;
  }
  uVar9 = *(ulong *)(lVar6 + 0x120);
  lVar7 = *(long *)(lVar8 + 0x20);
  if ((uVar9 == *(ulong *)(lVar8 + 0x18)) &&
     (*(long *)(lVar7 + (uVar9 & 0x3ffffffffffffffe) * 4) != 0)) {
    lVar4 = *(long *)(lVar6 + 0x128);
    uVar12 = uVar9;
    if (lVar4 == lVar7) goto code_r0x005ffdc4;
  }
  else {
    uVar12 = *(ulong *)(lVar8 + 0x18);
    do {
      uVar11 = 0;
      if (uVar12 == 0) goto code_r0x005ffd44;
      uVar11 = uVar12 - 1;
      lVar4 = uVar12 * 8;
      uVar12 = uVar11;
    } while (*(long *)(lVar7 + -8 + lVar4) == 0);
    uVar10 = (int)uVar11 + 1;
    uVar11 = (ulong)uVar10;
    if (uVar10 < 9) {
code_r0x005ffd44:
      uVar12 = (ulong)*(uint *)(&UNK_008babcc + uVar11 * 4);
    }
    else if (uVar11 < 0x11) {
      uVar12 = 0x10;
    }
    else if (uVar11 < 0x21) {
      uVar12 = 0x20;
    }
    else if (uVar11 < 0x41) {
      uVar12 = 0x40;
    }
    else {
      uVar10 = 0;
      uVar12 = 0x40;
      do {
        uVar3 = uVar10 + (uint)uVar12 >> 1;
        uVar2 = uVar3;
        if (uVar11 - 1 >> ((ulong)uVar3 & 0x3f) != 0) {
          uVar2 = (uint)uVar12;
          uVar10 = uVar3;
        }
        uVar12 = (ulong)uVar2;
      } while (1 < uVar2 - uVar10);
      uVar12 = 1L << (uVar12 & 0x3f);
    }
    lVar4 = *(long *)(lVar6 + 0x128);
    if (uVar9 != uVar12) {
      if (lVar4 != 0) {
        if (uVar9 != 0) {
          do {
            *(undefined8 *)(lVar4 + -8 + uVar9 * 8) = 0;
            uVar9 = uVar9 - 1;
          } while (uVar9 != 0);
        }
        func_0x00611644();
      }
      func_0x006108a0(uVar12);
      if (uVar12 == 0) {
        lVar4 = 0;
      }
      else {
        lVar4 = func_0x006115d0(uVar12 << 3);
      }
    }
    *(ulong *)(lVar6 + 0x120) = uVar12;
    *(long *)(lVar6 + 0x128) = lVar4;
    *(undefined8 *)(lVar6 + 0x118) = 0x1fffffffffffffff;
    lVar7 = *(long *)(lVar8 + 0x20);
    if (lVar4 == lVar7) goto code_r0x005ffdc4;
  }
  _memcpy(lVar4,lVar7,uVar12 << 3);
code_r0x005ffdc4:
  *(undefined4 *)(lVar6 + 0x130) = *(undefined4 *)(lVar8 + 0x28);
  return lVar1;
}

