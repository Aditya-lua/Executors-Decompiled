
long * FUN_0013b298(undefined8 param_1,undefined8 param_2,long *param_3)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 extraout_x8;
  long *plVar5;
  long *plVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  long *plVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  undefined1 auVar15 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined1 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 uStack_98;
  long *plStack_90;
  undefined8 uStack_88;
  long lStack_80;
  undefined *puStack_78;
  long *plStack_68;
  long *plStack_60;
  long *plStack_58;
  long *plStack_50;
  long *plStack_48;
  
  uVar2 = __Unwind_Resume();
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  func_0x0014a65c(&uStack0000000000000038,in_stack_00000040);
  auVar15 = __Unwind_Resume(uVar2);
  plVar11 = auVar15._0_8_;
  lVar8 = *plVar11;
  plVar5 = (long *)plVar11[1];
  lVar1 = (auVar15._8_8_ - lVar8) / 0x18;
  plVar10 = (long *)(lVar8 + lVar1 * 0x18);
  plVar12 = plVar11 + 2;
  if (plVar5 < (long *)*plVar12) {
    plVar12 = plVar10;
    if (plVar10 == plVar5) {
      *plVar10 = 0;
      plVar10[1] = 0;
      plVar10[2] = 0;
      lVar13 = *param_3;
      plVar10[1] = param_3[1];
      *plVar10 = lVar13;
      *(long *)(lVar8 + lVar1 * 0x18 + 0x10) = param_3[2];
      *param_3 = 0;
      param_3[1] = 0;
      param_3[2] = 0;
      plVar11[1] = (long)(plVar10 + 3);
    }
    else {
      plVar4 = plVar5 + -3;
      if (plVar4 < plVar5) {
        plVar6 = plVar5;
        plVar7 = plVar4;
        do {
          *plVar6 = 0;
          plVar6[1] = 0;
          plVar6[2] = 0;
          lVar13 = *plVar7;
          plVar6[1] = plVar7[1];
          *plVar6 = lVar13;
          plVar6[2] = plVar7[2];
          *plVar7 = 0;
          plVar7[1] = 0;
          plVar7[2] = 0;
          plVar6 = plVar6 + 3;
          plVar7 = plVar7 + 3;
        } while (plVar7 < plVar5);
        plVar11[1] = (long)plVar6;
      }
      else {
        plVar11[1] = (long)plVar5;
      }
      if (plVar5 != plVar10 + 3) {
        lVar13 = ((long)plVar5 - (long)(plVar10 + 3) >> 3) << 3;
        do {
          if (*plVar4 != 0) {
            plVar4[1] = *plVar4;
            __ZdlPv();
            *plVar4 = 0;
            plVar4[1] = 0;
            plVar4[2] = 0;
          }
          plVar5 = (long *)((long)plVar10 + lVar13 + -0x18);
          lVar14 = *plVar5;
          plVar4[1] = *(long *)((long)plVar10 + lVar13 + -0x10);
          *plVar4 = lVar14;
          plVar4[2] = *(long *)((long)plVar10 + lVar13 + -8);
          *plVar5 = 0;
          *(undefined8 *)((long)plVar10 + lVar13 + -0x10) = 0;
          *(undefined8 *)((long)plVar10 + lVar13 + -8) = 0;
          plVar4 = plVar4 + -3;
          lVar13 = lVar13 + -0x18;
        } while (lVar13 != 0);
      }
      if (*plVar10 != 0) {
        *(long *)(lVar8 + lVar1 * 0x18 + 8) = *plVar10;
        __ZdlPv();
        *plVar10 = 0;
        plVar10[1] = 0;
        plVar10[2] = 0;
      }
      lVar13 = *param_3;
      plVar10[1] = param_3[1];
      *plVar10 = lVar13;
      *(long *)(lVar8 + lVar1 * 0x18 + 0x10) = param_3[2];
      *param_3 = 0;
      param_3[1] = 0;
      param_3[2] = 0;
    }
  }
  else {
    uVar3 = ((long)plVar5 - lVar8 >> 3) * -0x5555555555555555 + 1;
    if (0xaaaaaaaaaaaaaaa < uVar3) {
      func_0x00017f90(plVar11);
code_r0x0013b630:
      uVar2 = func_0x00017514();
      func_0x00147900(&plStack_68);
      lVar8 = __Unwind_Resume(uVar2);
      puStack_78 = &DAT_0013b648;
      plStack_90 = plVar11;
      uStack_88 = uVar2;
      lStack_80 = (long)register0x00000008 + -0x10;
      uStack_98 = func_0x00137dcc(lVar8,lVar8 + 0x30);
      plVar10 = (long *)func_0x0013b68c(extraout_x8,lVar8,&uStack_98);
      return plVar10;
    }
    lVar8 = *plVar12 - lVar8 >> 3;
    uVar9 = lVar8 * 0x5555555555555556;
    if (uVar9 <= uVar3) {
      uVar9 = uVar3;
    }
    if (0x555555555555554 < (ulong)(lVar8 * -0x5555555555555555)) {
      uVar9 = 0xaaaaaaaaaaaaaaa;
    }
    plStack_48 = plVar12;
    if (uVar9 == 0) {
      plStack_68 = (long *)0x0;
    }
    else {
      if (0xaaaaaaaaaaaaaaa < uVar9) goto code_r0x0013b630;
      plStack_68 = (long *)__Znwm(uVar9 * 0x18);
    }
    plStack_60 = plStack_68 + lVar1 * 3;
    plStack_50 = plStack_68 + uVar9 * 3;
    plStack_58 = plStack_60;
    func_0x001498fc(&plStack_68,param_3);
    plVar12 = plStack_60;
    plVar5 = (long *)*plVar11;
    if (plVar5 != plVar10) {
      plVar4 = plStack_60;
      plVar6 = plVar10;
      do {
        plStack_60 = plVar4 + -3;
        *plStack_60 = 0;
        plVar4[-2] = 0;
        plVar4[-1] = 0;
        plVar7 = plVar6 + -3;
        lVar8 = *plVar7;
        plVar4[-2] = plVar6[-2];
        *plStack_60 = lVar8;
        plVar4[-1] = plVar6[-1];
        *plVar7 = 0;
        plVar6[-2] = 0;
        plVar6[-1] = 0;
        plVar4 = plStack_60;
        plVar6 = plVar7;
      } while (plVar7 != plVar5);
    }
    plVar5 = (long *)plVar11[1];
    if (plVar5 != plVar10) {
      do {
        *plStack_58 = 0;
        plStack_58[1] = 0;
        plStack_58[2] = 0;
        lVar8 = *plVar10;
        plStack_58[1] = plVar10[1];
        *plStack_58 = lVar8;
        plStack_58[2] = plVar10[2];
        *plVar10 = 0;
        plVar10[1] = 0;
        plVar10[2] = 0;
        plStack_58 = plStack_58 + 3;
        plVar10 = plVar10 + 3;
      } while (plVar10 != plVar5);
      plVar10 = (long *)plVar11[1];
    }
    plVar5 = (long *)*plVar11;
    *plVar11 = (long)plStack_60;
    plVar11[1] = (long)plStack_58;
    lVar8 = plVar11[2];
    plVar11[2] = (long)plStack_50;
    plStack_68 = plVar5;
    plStack_60 = plVar5;
    plStack_50 = (long *)lVar8;
    plStack_58 = plVar10;
    while (plVar11 = plStack_58, plStack_58 != plVar5) {
      while( true ) {
        plStack_58 = plVar11 + -3;
        if (*plStack_58 != 0) break;
        plVar11 = plStack_58;
        plVar10 = plStack_68;
        if (plStack_58 == plVar5) goto joined_r0x0013b544;
      }
      plVar11[-2] = *plStack_58;
      __ZdlPv();
      plVar10 = plStack_68;
    }
joined_r0x0013b544:
    if (plVar10 != (long *)0x0) {
      __ZdlPv(plVar10);
    }
  }
  return plVar12;
}

