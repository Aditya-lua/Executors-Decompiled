
/* WARNING: Removing unreachable block (ram,0x0052e758) */
/* WARNING: Removing unreachable block (ram,0x0052e760) */
/* WARNING: Removing unreachable block (ram,0x0052e940) */
/* WARNING: Removing unreachable block (ram,0x0052e764) */
/* WARNING: Removing unreachable block (ram,0x0052e788) */
/* WARNING: Removing unreachable block (ram,0x0052e944) */
/* WARNING: Removing unreachable block (ram,0x0052e9d0) */
/* WARNING: Removing unreachable block (ram,0x0052e9d4) */

void FUN_0052e324(undefined8 param_1,undefined8 param_2,undefined *param_3,undefined8 param_4,
                 long param_5)

{
  long lVar1;
  long **pplVar2;
  long *plVar3;
  code *pcVar4;
  int iVar5;
  undefined8 *puVar6;
  long **pplVar7;
  long lVar8;
  undefined8 uVar9;
  ulong uVar10;
  long ***extraout_x1;
  undefined *puVar11;
  long *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  long lVar12;
  long lVar13;
  long **pplVar14;
  long *plVar15;
  long lVar16;
  undefined1 auVar17 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack_168;
  undefined2 *puStack_160;
  undefined8 uStack_158;
  long *plStack_150;
  undefined *puStack_148;
  long *plStack_140;
  undefined8 uStack_138;
  undefined1 auStack_120 [24];
  long lStack_108;
  undefined2 *puStack_100;
  undefined8 uStack_f8;
  long ***ppplStack_88;
  undefined2 *puStack_80;
  undefined8 uStack_78;
  undefined8 ****ppppuStack_70;
  undefined2 *puStack_68;
  long lStack_60;
  undefined1 uStack_51;
  
  if (in_stack_00000008 != 0) {
    param_3 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000010);
  }
  __Unwind_Resume();
  puVar6 = (undefined8 *)func_0x00187bd0(0x20,8);
  if (puVar6 != (undefined8 *)0x0) {
    *puVar6 = &UNK_009eada8;
    puVar6[1] = &UNK_009eae08;
    puVar6[2] = &UNK_009eae08;
    puVar6[3] = &UNK_009eae68;
    return;
  }
  func_0x007a1f18(8,0x20);
  if (param_5 == 0) {
code_r0x0052e4bc:
    if (param_3 == (undefined *)0x0) {
      puStack_68 = (undefined2 *)func_0x00187bd0(3,1);
      if (puStack_68 == (undefined2 *)0x0) goto LAB_0052e660;
      *(undefined1 *)(puStack_68 + 1) = 0x2e;
      *puStack_68 = 0x2e2e;
      lStack_60 = 3;
      ppppuStack_70 = (undefined8 ****)0x3;
    }
    else {
      ppplStack_88 = (long ***)0x0;
      puStack_80 = (undefined2 *)((long)&MACH_HEADER.magic + 1);
      lStack_60 = 0xe0000020;
      ppppuStack_70 = &ppplStack_88;
      uStack_78 = 0;
      puStack_68 = (undefined2 *)&UNK_009ea9f0;
      iVar5 = func_0x0050f9f0(param_3,&ppppuStack_70);
      if (iVar5 != 0) {
        func_0x007a2810(&UNK_008a7f30,0x37,&uStack_51,&UNK_009eaa50,&UNK_009eaa20);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x52e63c);
        (*pcVar4)();
      }
      puStack_68 = puStack_80;
      lStack_60 = uStack_78;
      ppppuStack_70 = (undefined8 ****)ppplStack_88;
    }
    ppplStack_88 = (undefined8 ***)0x0;
    puStack_80 = (undefined2 *)0x1;
    uStack_78 = 0;
    lVar8 = func_0x0051ba54(extraout_x1,&ppplStack_88,8,0,&ppppuStack_70);
code_r0x0052e5d4:
    *extraout_x8 = -0x8000000000000000;
    extraout_x8[1] = lVar8;
    return;
  }
  func_0x0046b8d0(&ppppuStack_70,param_4,param_5);
  if (((uint)ppppuStack_70 & 1) == 0) {
    if (lStack_60 < 0) {
      uVar9 = 0;
    }
    else {
      if (lStack_60 == 0) {
        lVar8 = 1;
code_r0x0052e5e4:
        _memcpy(lVar8,puStack_68,lStack_60);
        *extraout_x8 = lStack_60;
        extraout_x8[1] = lVar8;
        extraout_x8[2] = lStack_60;
        return;
      }
      uVar9 = 1;
      lVar8 = func_0x00187bd0(lStack_60,1);
      if (lVar8 != 0) goto code_r0x0052e5e4;
    }
    auVar17 = func_0x007a1f00(uVar9,lStack_60,&UNK_009eaac8);
  }
  else {
    lVar12 = (long)extraout_x1[0x1e] << 4;
    pplVar7 = (long **)0xffffffffffffffff;
    lVar8 = 0;
    pplVar14 = extraout_x1[0x1d];
    do {
      lVar16 = lVar8;
      if (lVar12 == 0) {
        puVar11 = (undefined *)0x0;
        goto code_r0x0052e540;
      }
      plVar15 = *pplVar14;
      pplVar2 = pplVar14 + 1;
      pplVar7 = (long **)((long)pplVar7 + 1);
      lVar12 = lVar12 + -0x10;
      lVar8 = lVar16 + 0x20;
      pplVar14 = pplVar14 + 2;
    } while (plVar15 != (long *)0x1414db8803bc16e0 || *pplVar2 != (long *)0x4f7557bbe08e4383);
    auVar17._8_8_ = extraout_x1[0x21];
    auVar17._0_8_ = pplVar7;
    if (pplVar7 < extraout_x1[0x21]) {
      lVar8 = *(long *)((long)extraout_x1[0x20] + lVar16 + 8);
      puVar11 = (undefined *)
                (*(long *)((long)extraout_x1[0x20] + lVar16) +
                 (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      auVar17 = (**(code **)(lVar8 + 0x18))(puVar11);
      if (auVar17._0_8_ == 0x1414db8803bc16e0 && auVar17._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0052e540:
        puStack_68 = (undefined2 *)&UNK_008a7b62;
        if (puVar11 != (undefined *)0x0) {
          puStack_68 = (undefined2 *)puVar11;
        }
        lStack_60 = 0;
        ppppuStack_70 = (undefined8 ****)extraout_x1;
        func_0x00525f7c(&ppplStack_88,&ppppuStack_70,8,0);
        lVar8 = func_0x0051ca70(extraout_x1,&ppplStack_88);
        goto code_r0x0052e5d4;
      }
      param_3 = &UNK_009e9990;
      func_0x007a23d8(&UNK_008a6820,0x22);
      goto code_r0x0052e4bc;
    }
  }
  func_0x007a2570(auVar17._0_8_,auVar17._8_8_,&UNK_009e9b68);
LAB_0052e660:
  puVar11 = &UNK_009eaac8;
  uVar9 = func_0x007a1f00(1,3);
  if (ppplStack_88 != (undefined8 ***)0x0) {
    puVar11 = (undefined *)0x1;
    func_0x00187bd4(puStack_80);
  }
  auVar17 = __Unwind_Resume(uVar9);
  lVar12 = auVar17._8_8_;
  lVar8 = auVar17._0_8_;
  if (puVar11 == (undefined *)0x0) {
    puStack_160 = (undefined2 *)func_0x00187bd0(2,1);
    if (puStack_160 == (undefined2 *)0x0) {
      uVar9 = func_0x007a1f00(1,2,&UNK_009eaac8);
      func_0x00529a8c(lVar12);
      __Unwind_Resume(uVar9);
      *extraout_x8_01 = 0;
      extraout_x8_01[1] = 0;
      extraout_x8_01[2] = 0;
      extraout_x8_01[3] = 0xff;
      return;
    }
    *puStack_160 = 0x2e2e;
    lStack_168 = 2;
    uStack_158 = 2;
    lVar16 = *(long *)(lVar8 + 0x18);
    if (lVar16 != 0) goto code_r0x0052e724;
code_r0x0052e7d4:
    plStack_150 = (long *)0x8000000000000000;
  }
  else {
    lStack_108 = 0;
    puStack_100 = (undefined2 *)((long)&MACH_HEADER.magic + 1);
    uStack_f8 = 0;
    plStack_140 = (long *)0xe0000020;
    plStack_150 = &lStack_108;
    puStack_148 = &UNK_009ea9f0;
    iVar5 = func_0x0050f9f0(puVar11,&plStack_150);
    if (iVar5 != 0) {
      func_0x007a2810(&UNK_008a7f30,0x37,auStack_120,&UNK_009eaa50,&UNK_009eaa20);
      goto code_r0x0052e9f4;
    }
    lStack_168 = lStack_108;
    puStack_160 = puStack_100;
    uStack_158 = uStack_f8;
    lVar16 = *(long *)(lVar8 + 0x18);
    if (lVar16 == 0) goto code_r0x0052e7d4;
code_r0x0052e724:
    plVar15 = *(long **)(lVar8 + 0x20);
    if ((long)plVar15 < 0) {
      uVar9 = 0;
LAB_0052e9b8:
      func_0x007a1f00(uVar9,plVar15,&UNK_009eaac8);
      goto code_r0x0052e9f4;
    }
    if (plVar15 == (long *)0x0) {
      puVar11 = (undefined *)0x1;
    }
    else {
      uVar9 = 1;
      puVar11 = (undefined *)func_0x00187bd0(plVar15,1);
      if (puVar11 == (undefined *)0x0) goto LAB_0052e9b8;
    }
    _memcpy(puVar11,lVar16,plVar15);
    uStack_138 = 0x8000000000000000;
    plStack_150 = plVar15;
    puStack_148 = puVar11;
    plStack_140 = plVar15;
  }
  lVar16 = 0;
  lVar13 = *(long *)(lVar12 + 0xf0) << 4;
  uVar10 = 0xffffffffffffffff;
  plVar15 = *(long **)(lVar12 + 0xe8);
  do {
    if (lVar13 == 0) {
      puVar11 = (undefined *)0x0;
      goto code_r0x0052e8b0;
    }
    lVar1 = *plVar15;
    plVar3 = plVar15 + 1;
    uVar10 = uVar10 + 1;
    lVar16 = lVar16 + 0x20;
    lVar13 = lVar13 + -0x10;
    plVar15 = plVar15 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
  if (uVar10 < *(ulong *)(lVar12 + 0x108)) {
    lVar16 = *(long *)(lVar12 + 0x100) + lVar16;
    lVar13 = *(long *)(lVar16 + -0x18);
    puVar11 = (undefined *)
              (*(long *)(lVar16 + -0x20) + (*(long *)(lVar13 + 0x10) - 1U & 0xfffffffffffffff0) +
              0x10);
    auVar17 = (**(code **)(lVar13 + 0x18))(puVar11);
    if (auVar17._0_8_ == 0x1414db8803bc16e0 && auVar17._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0052e8b0:
      puStack_100 = (undefined2 *)&UNK_008a7b62;
      if (puVar11 != (undefined *)0x0) {
        puStack_100 = (undefined2 *)puVar11;
      }
      uStack_f8 = 0;
      lStack_108 = lVar12;
      func_0x00525f7c(auStack_120,&lStack_108,8,0);
      uVar9 = func_0x0051d650(lVar12,&lStack_168,&plStack_150,0,auStack_120);
      func_0x004e4220(&lStack_108,lVar8,&UNK_009eaed8);
      plStack_140 = (long *)puStack_100;
      puStack_148 = (undefined *)lStack_108;
      uStack_138 = uStack_f8;
      plStack_150 = (long *)CONCAT71(plStack_150._1_7_,5);
      uVar9 = func_0x0051b078(uVar9,0xe,&plStack_150);
      *extraout_x8_00 = 0x8000000000000000;
      extraout_x8_00[1] = uVar9;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar10,*(ulong *)(lVar12 + 0x108),&UNK_009e9b68);
  }
code_r0x0052e9f4:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x52e9f8);
  (*pcVar4)();
}

