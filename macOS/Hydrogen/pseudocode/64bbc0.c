
long * FUN_0064bbc0(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long *plVar4;
  undefined8 uVar5;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong uVar6;
  ulong in_x12;
  long *unaff_x19;
  long unaff_x20;
  long lVar7;
  long lVar8;
  long unaff_x21;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  long lStack_68;
  long lStack_60;
  long *plStack_58;
  long lStack_50;
  long *plStack_48;
  
  if ((in_x12 & 0xffffffffffff | 0x2aa000000000000) <= in_x10) {
    in_x11 = in_x9;
  }
  uStack0000000000000028 = param_1;
  if (in_x11 == 0) {
    uStack0000000000000008 = 0;
  }
  else {
    if (in_x9 < in_x11) {
      func_0x00017514();
      unaff_x19[1] = unaff_x21;
      lVar9 = __Unwind_Resume();
      if (unaff_x20 != -0x30) {
        lVar11 = unaff_x20 + 0x30;
        do {
          (*(code *)**(undefined8 **)(unaff_x21 + lVar11))();
          lVar11 = lVar11 + 0x30;
        } while (lVar11 != 0);
      }
      func_0x0064b2f0(&uStack0000000000000008);
      auVar13 = __Unwind_Resume(lVar9);
      plVar4 = auVar13._0_8_;
      lVar7 = plVar4[1] - *plVar4 >> 4;
      lVar11 = lVar7 * -0x5555555555555555;
      uVar1 = lVar11 + 1;
      if (0x555555555555555 < uVar1) {
        func_0x00017f90(plVar4);
LAB_0064bec8:
        uVar5 = func_0x00017514();
        func_0x0064b2f0(&lStack_68);
        uVar5 = __Unwind_Resume(uVar5);
        if (lVar11 != -0x30) {
          lVar11 = lVar11 + 0x30;
          do {
            (*(code *)**(undefined8 **)(lVar9 + lVar11))();
            lVar11 = lVar11 + 0x30;
          } while (lVar11 != 0);
        }
        func_0x0064b2f0(&lStack_68);
        plVar4 = (long *)__Unwind_Resume(uVar5);
        func_0x0064c1b0(plVar4,plVar4[1]);
        if (*plVar4 != 0) {
          __ZdlPv();
        }
        return plVar4;
      }
      plStack_48 = plVar4 + 2;
      lVar9 = *plStack_48 - *plVar4 >> 4;
      uVar6 = lVar9 * 0x5555555555555556;
      if (uVar6 <= uVar1) {
        uVar6 = uVar1;
      }
      if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar9 * -0x5555555555555555)) {
        uVar6 = 0x555555555555555;
      }
      if (uVar6 == 0) {
        lStack_68 = 0;
      }
      else {
        lVar9 = auVar13._8_8_;
        if (0x555555555555555 < uVar6) goto LAB_0064bec8;
        lStack_68 = __Znwm(uVar6 * 0x30);
      }
      lStack_60 = lStack_68 + lVar7 * 0x10;
      lStack_50 = lStack_68 + uVar6 * 0x30;
      plStack_58 = (long *)lStack_60;
      func_0x005fe0b4(lStack_60,auVar13._8_8_);
      lVar7 = lStack_60;
      lVar12 = 0;
      plStack_58 = (long *)((long)plStack_58 + 0x30);
      lVar9 = *plVar4;
      lVar11 = plVar4[1];
      while (plVar3 = plStack_58, lVar11 + lVar12 != lVar9) {
        lVar12 = lVar12 + -0x30;
        func_0x005fe0b4(lVar12 + lVar7,lVar12 + lVar11);
      }
      puVar2 = (undefined8 *)*plVar4;
      puVar10 = (undefined8 *)plVar4[1];
      *plVar4 = lVar7 + lVar12;
      plVar4[2] = lStack_50;
      plVar4[1] = (long)plStack_58;
      while (puVar10 != puVar2) {
        puVar10 = puVar10 + -6;
        (**(code **)*puVar10)(puVar10);
      }
      if (puVar2 != (undefined8 *)0x0) {
        __ZdlPv(puVar2);
      }
      return plVar3;
    }
    uStack0000000000000008 = __Znwm(in_x11 * 0x30);
  }
  lVar9 = uStack0000000000000008 + unaff_x21 * 0x30;
  in_stack_00000020 = uStack0000000000000008 + in_x11 * 0x30;
  lVar7 = unaff_x20 * 0x30;
  lVar11 = lVar9 + lVar7;
  in_stack_00000010 = lVar9;
  in_stack_00000018 = lVar9;
  do {
    plVar4 = (long *)func_0x005fdd18(lVar9);
    lVar12 = in_stack_00000010;
    lVar9 = lVar9 + 0x30;
    lVar7 = lVar7 + -0x30;
  } while (lVar7 != 0);
  lVar9 = *unaff_x19;
  lVar7 = unaff_x19[1];
  lVar8 = 0;
  in_stack_00000018 = lVar11;
  while (lVar7 + lVar8 != lVar9) {
    lVar8 = lVar8 + -0x30;
    plVar4 = (long *)func_0x005fe0b4(lVar8 + lVar12,lVar8 + lVar7);
  }
  puVar2 = (undefined8 *)*unaff_x19;
  puVar10 = (undefined8 *)unaff_x19[1];
  *unaff_x19 = lVar12 + lVar8;
  unaff_x19[2] = in_stack_00000020;
  unaff_x19[1] = in_stack_00000018;
  while (puVar10 != puVar2) {
    puVar10 = puVar10 + -6;
    plVar4 = (long *)(**(code **)*puVar10)(puVar10);
  }
  if (puVar2 == (undefined8 *)0x0) {
    return plVar4;
  }
  plVar4 = (long *)__ZdlPv(puVar2);
  return plVar4;
}

