
long * FUN_00650730(void)

{
  long *plVar1;
  long *plVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  long extraout_x1;
  ulong uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long unaff_x19;
  long unaff_x22;
  undefined8 *puVar11;
  long unaff_x23;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000008;
  long in_stack_00000018;
  long lStack_68;
  undefined8 *puStack_60;
  long *plStack_58;
  long lStack_50;
  long *plStack_48;
  
  lVar6 = unaff_x22 + unaff_x23;
  lVar9 = *(long *)(lVar6 + 0x20);
  uVar7 = *(ulong *)(lVar6 + 0x10);
  if (*(ulong *)(lVar6 + 0x18) <= *(ulong *)(lVar6 + 0x10)) {
    uVar7 = *(ulong *)(lVar6 + 0x18);
  }
  if (lVar9 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar9 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x19 + 8) = unaff_x22 + unaff_x23;
  uVar4 = __Unwind_Resume();
  lVar6 = unaff_x23 + unaff_x22;
  lVar9 = *(long *)(lVar6 + 0x20);
  uVar7 = *(ulong *)(lVar6 + 0x10);
  if (*(ulong *)(lVar6 + 0x18) <= *(ulong *)(lVar6 + 0x10)) {
    uVar7 = *(ulong *)(lVar6 + 0x18);
  }
  if (lVar9 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar9 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  in_stack_00000018 = unaff_x23 + unaff_x22;
  func_0x006503a4(&uStack0000000000000008);
  auVar12 = __Unwind_Resume(uVar4);
  lVar6 = auVar12._8_8_;
  plVar5 = auVar12._0_8_;
  lVar9 = plVar5[1] - *plVar5 >> 4;
  uVar7 = lVar9 * -0x3333333333333333 + 1;
  if (uVar7 < 0x333333333333334) {
    plVar1 = plVar5 + 2;
    lVar8 = *plVar1 - *plVar5 >> 4;
    uVar10 = lVar8 * -0x6666666666666666;
    if (uVar10 <= uVar7) {
      uVar10 = uVar7;
    }
    if (0x199999999999998 < (ulong)(lVar8 * -0x3333333333333333)) {
      uVar10 = 0x333333333333333;
    }
    plStack_48 = plVar1;
    if (uVar10 == 0) {
      lVar8 = 0;
    }
    else {
      if (0x333333333333333 < uVar10) goto LAB_00650954;
      lVar8 = __Znwm(uVar10 * 0x50);
    }
    puStack_60 = (undefined8 *)(lVar8 + lVar9 * 0x10);
    lStack_50 = lVar8 + uVar10 * 0x50;
    *puStack_60 = &UNK_00a09a70;
    lStack_68 = lVar8;
    plStack_58 = puStack_60;
    func_0x00675bac(puStack_60 + 1,lVar6 + 8);
    func_0x00675bac(lVar8 + lVar9 * 0x10 + 0x28,lVar6 + 0x28);
    *(undefined1 *)(lVar8 + lVar9 * 0x10 + 0x48) = *(undefined1 *)(lVar6 + 0x48);
    plVar2 = plStack_58 + 10;
    plStack_58 = plVar2;
    func_0x006503f8(plVar1,plVar5[1],plVar5[1],*plVar5,*plVar5,puStack_60,puStack_60);
    puVar3 = (undefined8 *)*plVar5;
    puVar11 = (undefined8 *)plVar5[1];
    *plVar5 = extraout_x1;
    plVar5[1] = (long)plVar2;
    plVar5[2] = lStack_50;
    while (puVar11 != puVar3) {
      puVar11 = puVar11 + -10;
      (**(code **)*puVar11)(puVar11);
    }
    if (puVar3 != (undefined8 *)0x0) {
      __ZdlPv(puVar3);
    }
    return plVar2;
  }
  func_0x00017f90(plVar5);
LAB_00650954:
  uVar4 = func_0x00017514();
  lVar9 = unaff_x22 + lVar9 * 0x10;
  lVar6 = *(long *)(lVar9 + 0x20);
  uVar7 = *(ulong *)(lVar9 + 0x10);
  if (*(ulong *)(lVar9 + 0x18) <= *(ulong *)(lVar9 + 0x10)) {
    uVar7 = *(ulong *)(lVar9 + 0x18);
  }
  if (lVar6 != 0) {
    if (uVar7 != 0) {
      do {
        *(undefined8 *)(lVar6 + -8 + uVar7 * 8) = 0;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    func_0x00611644();
  }
  func_0x006503a4(&lStack_68);
  plVar5 = (long *)__Unwind_Resume(uVar4);
  lVar6 = plVar5[1];
  lVar9 = plVar5[2];
  while (lVar9 != lVar6) {
    plVar5[2] = lVar9 + -0x80;
    func_0x00650db0();
    lVar9 = plVar5[2];
  }
  if (*plVar5 != 0) {
    __ZdlPv();
  }
  return plVar5;
}

