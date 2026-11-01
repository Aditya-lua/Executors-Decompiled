
long * FUN_0064bd08(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000008;
  long lStack_68;
  long lStack_60;
  long *plStack_58;
  long lStack_50;
  long *plStack_48;
  
  *(long *)(unaff_x19 + 8) = unaff_x21;
  lVar4 = __Unwind_Resume();
  if (unaff_x20 != -0x30) {
    lVar9 = unaff_x20 + 0x30;
    do {
      (*(code *)**(undefined8 **)(unaff_x21 + lVar9))();
      lVar9 = lVar9 + 0x30;
    } while (lVar9 != 0);
  }
  func_0x0064b2f0(&uStack0000000000000008);
  auVar12 = __Unwind_Resume(lVar4);
  plVar6 = auVar12._0_8_;
  lVar7 = plVar6[1] - *plVar6 >> 4;
  lVar9 = lVar7 * -0x5555555555555555;
  uVar1 = lVar9 + 1;
  if (0x555555555555555 < uVar1) {
    func_0x00017f90(plVar6);
code_r0x0064bec8:
    uVar5 = func_0x00017514();
    func_0x0064b2f0(&lStack_68);
    uVar5 = __Unwind_Resume(uVar5);
    if (lVar9 != -0x30) {
      lVar9 = lVar9 + 0x30;
      do {
        (*(code *)**(undefined8 **)(lVar4 + lVar9))();
        lVar9 = lVar9 + 0x30;
      } while (lVar9 != 0);
    }
    func_0x0064b2f0(&lStack_68);
    plVar6 = (long *)__Unwind_Resume(uVar5);
    func_0x0064c1b0(plVar6,plVar6[1]);
    if (*plVar6 != 0) {
      __ZdlPv();
    }
    return plVar6;
  }
  plStack_48 = plVar6 + 2;
  lVar4 = *plStack_48 - *plVar6 >> 4;
  uVar8 = lVar4 * 0x5555555555555556;
  if (uVar8 <= uVar1) {
    uVar8 = uVar1;
  }
  if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar4 * -0x5555555555555555)) {
    uVar8 = 0x555555555555555;
  }
  if (uVar8 == 0) {
    lStack_68 = 0;
  }
  else {
    lVar4 = auVar12._8_8_;
    if (0x555555555555555 < uVar8) goto code_r0x0064bec8;
    lStack_68 = __Znwm(uVar8 * 0x30);
  }
  lStack_60 = lStack_68 + lVar7 * 0x10;
  lStack_50 = lStack_68 + uVar8 * 0x30;
  plStack_58 = (long *)lStack_60;
  func_0x005fe0b4(lStack_60,auVar12._8_8_);
  lVar7 = lStack_60;
  lVar10 = 0;
  plStack_58 = (long *)((long)plStack_58 + 0x30);
  lVar4 = *plVar6;
  lVar9 = plVar6[1];
  while (plVar3 = plStack_58, lVar9 + lVar10 != lVar4) {
    lVar10 = lVar10 + -0x30;
    func_0x005fe0b4(lVar10 + lVar7,lVar10 + lVar9);
  }
  puVar2 = (undefined8 *)*plVar6;
  puVar11 = (undefined8 *)plVar6[1];
  *plVar6 = lVar7 + lVar10;
  plVar6[2] = lStack_50;
  plVar6[1] = (long)plStack_58;
  while (puVar11 != puVar2) {
    puVar11 = puVar11 + -6;
    (**(code **)*puVar11)(puVar11);
  }
  if (puVar2 != (undefined8 *)0x0) {
    __ZdlPv(puVar2);
  }
  return plVar3;
}

