
/* WARNING: Type propagation algorithm not settling */

void FUN_0005f660(undefined8 *param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  byte bVar1;
  code *pcVar2;
  bool in_ZR;
  long lVar3;
  undefined8 uVar4;
  byte *pbVar5;
  long *plVar6;
  byte *pbVar7;
  uint uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  uint uVar12;
  long *in_x9;
  ulong uVar13;
  long unaff_x19;
  long unaff_x21;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  long unaff_x29;
  undefined1 auVar17 [16];
  undefined1 auVar18 [12];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long lStack0000000000000028;
  long *plStack0000000000000040;
  byte *pbStack_70;
  byte *pbStack_68;
  
  if (in_ZR) {
    plStack0000000000000040 = &lStack0000000000000028;
    (**(code **)(*param_4 + 0x18))(param_4,&lStack0000000000000028);
  }
  else {
    *param_1 = 0;
    plStack0000000000000040 = in_x9;
  }
  lVar3 = _memchr();
  uStack0000000000000010 = unaff_x19 + unaff_x21;
  if (lVar3 != 0) {
    uStack0000000000000010 = lVar3;
  }
  uStack0000000000000018 = uStack0000000000000010 - unaff_x19;
  uStack0000000000000008 = unaff_x21 - uStack0000000000000018;
  if (uStack0000000000000008 != 0) {
    uStack0000000000000010 = uStack0000000000000010 + 1;
  }
  uStack0000000000000008 = uStack0000000000000008 - (ulong)(uStack0000000000000008 != 0);
  if (plStack0000000000000040 == (long *)0x0) {
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5f758);
    (*pcVar2)();
  }
  uVar8 = (uint)&uStack0000000000000018;
  puVar9 = &uStack0000000000000010;
  puVar10 = &uStack0000000000000008;
  (**(code **)(*plStack0000000000000040 + 0x30))(plStack0000000000000040,&uStack0000000000000020);
  if (plStack0000000000000040 == &lStack0000000000000028) {
    lVar3 = 4;
    plVar6 = &lStack0000000000000028;
LAB_0005f718:
    (**(code **)(*plVar6 + lVar3 * 8))();
  }
  else if (plStack0000000000000040 != (long *)0x0) {
    lVar3 = 5;
    plVar6 = plStack0000000000000040;
    goto LAB_0005f718;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar18 = ___stack_chk_fail();
  uVar4 = auVar18._0_8_;
  if (auVar18._8_4_ != 0) {
    uVar4 = func_0x0001753c(uVar4);
    if (plStack0000000000000040 == &lStack0000000000000028) {
      lVar3 = 4;
      plVar6 = &lStack0000000000000028;
    }
    else {
      if (plStack0000000000000040 == (long *)0x0) goto LAB_0005f7a0;
      lVar3 = 5;
      plVar6 = plStack0000000000000040;
    }
    (**(code **)(*plVar6 + lVar3 * 8))();
  }
LAB_0005f7a0:
  auVar17 = __Unwind_Resume(uVar4);
  pbVar7 = auVar17._8_8_;
  pbVar5 = auVar17._0_8_;
  uVar14 = (long)pbVar7 - (long)pbVar5;
  if (pbVar7 == (byte *)0x0) {
    uVar12 = (uint)*pbVar5;
    if (*pbVar5 == 0) {
      return;
    }
    uVar11 = 0;
    puVar16 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    uVar15 = 0;
    do {
      while ((uVar12 != (uVar8 & 0xff) || (puVar9 <= puVar16))) {
        uVar15 = uVar15 + 1;
        uVar12 = (uint)pbVar5[uVar15];
        if (pbVar5[uVar15] == 0) goto code_r0x0005f8d8;
      }
      if (uVar15 == 0) {
code_r0x0005f9bc:
        bVar1 = pbVar5[uVar15 + 1];
      }
      else {
        uVar13 = uVar15;
        do {
          if (pbVar5[uVar13 - 1] != 0x20 && pbVar5[uVar13 - 1] != 9) break;
          uVar13 = uVar13 - 1;
        } while (uVar13 != 0);
        if (uVar13 <= uVar11) goto code_r0x0005f9bc;
        pbStack_68 = pbVar5 + uVar11;
        pbStack_70 = pbVar5 + uVar13;
        plVar6 = (long *)puVar10[3];
        if (plVar6 == (long *)0x0) goto code_r0x0005fa40;
        (**(code **)(*plVar6 + 0x30))(plVar6,&pbStack_68,&pbStack_70);
        bVar1 = pbVar5[uVar15 + 1];
      }
      uVar12 = (uint)bVar1;
      puVar16 = (undefined8 *)((long)puVar16 + 1);
      uVar11 = uVar15 + 1;
      uVar15 = uVar11;
    } while (uVar12 != 0);
  }
  else {
    if (pbVar7 <= pbVar5) {
      return;
    }
    uVar11 = 0;
    puVar16 = (undefined8 *)((long)&MACH_HEADER.magic + 1);
    uVar15 = 0;
    do {
      while ((uint)pbVar5[uVar15] != (uVar8 & 0xff) || puVar9 <= puVar16) {
joined_r0x0005f884:
        uVar15 = uVar15 + 1;
        if (uVar15 == uVar14) goto code_r0x0005f8d4;
      }
      if (pbVar5 + uVar11 < pbVar7) {
        do {
          if (pbVar5[uVar11] != 0x20 && pbVar5[uVar11] != 9) goto code_r0x0005f84c;
          uVar11 = uVar11 + 1;
        } while (pbVar5 + uVar11 < pbVar7);
        uVar11 = uVar14;
      }
code_r0x0005f84c:
      if (uVar15 == 0) {
code_r0x0005f874:
        uVar11 = uVar15 + 1;
        puVar16 = (undefined8 *)((long)puVar16 + 1);
        goto joined_r0x0005f884;
      }
      uVar13 = uVar15;
      do {
        if (pbVar5[uVar13 - 1] != 0x20 && pbVar5[uVar13 - 1] != 9) break;
        uVar13 = uVar13 - 1;
      } while (uVar13 != 0);
      if (uVar13 <= uVar11) goto code_r0x0005f874;
      pbStack_68 = pbVar5 + uVar11;
      pbStack_70 = pbVar5 + uVar13;
      plVar6 = (long *)puVar10[3];
      if (plVar6 == (long *)0x0) goto code_r0x0005fa40;
      (**(code **)(*plVar6 + 0x30))(plVar6,&pbStack_68,&pbStack_70);
      uVar11 = uVar15 + 1;
      puVar16 = (undefined8 *)((long)puVar16 + 1);
      uVar15 = uVar11;
    } while (uVar11 != uVar14);
code_r0x0005f8d4:
    uVar15 = uVar14;
  }
code_r0x0005f8d8:
  uVar13 = uVar11;
  if (uVar15 != 0) {
    for (; (pbVar5 + uVar13 < pbVar7 &&
           (uVar11 = uVar13, pbVar5[uVar13] == 0x20 || pbVar5[uVar13] == 9)); uVar13 = uVar13 + 1) {
      uVar11 = uVar14;
    }
    do {
      if (pbVar5[uVar15 - 1] != 0x20 && pbVar5[uVar15 - 1] != 9) break;
      uVar15 = uVar15 - 1;
    } while (uVar15 != 0);
    if (uVar11 < uVar15) {
      pbStack_68 = pbVar5 + uVar11;
      pbStack_70 = pbVar5 + uVar15;
      plVar6 = (long *)puVar10[3];
      if (plVar6 == (long *)0x0) {
code_r0x0005fa40:
        func_0x00056004();
        return;
      }
      (**(code **)(*plVar6 + 0x30))(plVar6,&pbStack_68,&pbStack_70);
    }
  }
  return;
}

