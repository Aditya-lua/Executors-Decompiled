
/* WARNING: Removing unreachable block (ram,0x0052e758) */
/* WARNING: Removing unreachable block (ram,0x0052e760) */
/* WARNING: Removing unreachable block (ram,0x0052e940) */
/* WARNING: Removing unreachable block (ram,0x0052e764) */
/* WARNING: Removing unreachable block (ram,0x0052e788) */
/* WARNING: Removing unreachable block (ram,0x0052e944) */
/* WARNING: Removing unreachable block (ram,0x0052e9d0) */
/* WARNING: Removing unreachable block (ram,0x0052e9d4) */

void FUN_0052e594(undefined2 *param_1)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  undefined *puVar9;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  long lVar10;
  undefined8 *unaff_x19;
  long *plVar11;
  long lVar12;
  undefined1 auVar13 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack_d8;
  undefined2 *puStack_d0;
  undefined8 uStack_c8;
  long *plStack_c0;
  undefined *puStack_b8;
  long *plStack_b0;
  undefined8 uStack_a8;
  undefined1 auStack_90 [24];
  long lStack_78;
  undefined2 *puStack_70;
  undefined8 uStack_68;
  
  if (param_1 != (undefined2 *)0x0) {
    *(undefined1 *)(param_1 + 1) = 0x2e;
    *param_1 = 0x2e2e;
    uVar5 = func_0x0051ba54();
    *unaff_x19 = 0x8000000000000000;
    unaff_x19[1] = uVar5;
    return;
  }
  puVar9 = &UNK_009eaac8;
  uVar5 = func_0x007a1f00(1,3);
  if (in_stack_00000008 != 0) {
    puVar9 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000010);
  }
  auVar13 = __Unwind_Resume(uVar5);
  lVar8 = auVar13._8_8_;
  lVar6 = auVar13._0_8_;
  if (puVar9 == (undefined *)0x0) {
    puStack_d0 = (undefined2 *)func_0x00187bd0(2,1);
    if (puStack_d0 == (undefined2 *)0x0) {
      uVar5 = func_0x007a1f00(1,2,&UNK_009eaac8);
      func_0x00529a8c(lVar8);
      __Unwind_Resume(uVar5);
      *extraout_x8_00 = 0;
      extraout_x8_00[1] = 0;
      extraout_x8_00[2] = 0;
      extraout_x8_00[3] = 0xff;
      return;
    }
    *puStack_d0 = 0x2e2e;
    lStack_d8 = 2;
    uStack_c8 = 2;
    lVar12 = *(long *)(lVar6 + 0x18);
    if (lVar12 != 0) goto code_r0x0052e724;
code_r0x0052e7d4:
    plStack_c0 = (long *)0x8000000000000000;
  }
  else {
    lStack_78 = 0;
    puStack_70 = (undefined2 *)((long)&MACH_HEADER.magic + 1);
    uStack_68 = 0;
    plStack_b0 = (long *)0xe0000020;
    plStack_c0 = &lStack_78;
    puStack_b8 = &UNK_009ea9f0;
    iVar4 = func_0x0050f9f0(puVar9,&plStack_c0);
    if (iVar4 != 0) {
      func_0x007a2810(&UNK_008a7f30,0x37,auStack_90,&UNK_009eaa50,&UNK_009eaa20);
      goto code_r0x0052e9f4;
    }
    lStack_d8 = lStack_78;
    puStack_d0 = puStack_70;
    uStack_c8 = uStack_68;
    lVar12 = *(long *)(lVar6 + 0x18);
    if (lVar12 == 0) goto code_r0x0052e7d4;
code_r0x0052e724:
    plVar11 = *(long **)(lVar6 + 0x20);
    if ((long)plVar11 < 0) {
      uVar5 = 0;
LAB_0052e9b8:
      func_0x007a1f00(uVar5,plVar11,&UNK_009eaac8);
      goto code_r0x0052e9f4;
    }
    if (plVar11 == (long *)0x0) {
      puVar9 = (undefined *)0x1;
    }
    else {
      uVar5 = 1;
      puVar9 = (undefined *)func_0x00187bd0(plVar11,1);
      if (puVar9 == (undefined *)0x0) goto LAB_0052e9b8;
    }
    _memcpy(puVar9,lVar12,plVar11);
    uStack_a8 = 0x8000000000000000;
    plStack_c0 = plVar11;
    puStack_b8 = puVar9;
    plStack_b0 = plVar11;
  }
  lVar12 = 0;
  lVar10 = *(long *)(lVar8 + 0xf0) << 4;
  uVar7 = 0xffffffffffffffff;
  plVar11 = *(long **)(lVar8 + 0xe8);
  do {
    if (lVar10 == 0) {
      puVar9 = (undefined *)0x0;
      goto code_r0x0052e8b0;
    }
    lVar1 = *plVar11;
    plVar2 = plVar11 + 1;
    uVar7 = uVar7 + 1;
    lVar12 = lVar12 + 0x20;
    lVar10 = lVar10 + -0x10;
    plVar11 = plVar11 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (uVar7 < *(ulong *)(lVar8 + 0x108)) {
    lVar12 = *(long *)(lVar8 + 0x100) + lVar12;
    lVar10 = *(long *)(lVar12 + -0x18);
    puVar9 = (undefined *)
             (*(long *)(lVar12 + -0x20) + (*(long *)(lVar10 + 0x10) - 1U & 0xfffffffffffffff0) +
             0x10);
    auVar13 = (**(code **)(lVar10 + 0x18))(puVar9);
    if (auVar13._0_8_ == 0x1414db8803bc16e0 && auVar13._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0052e8b0:
      puStack_70 = (undefined2 *)&UNK_008a7b62;
      if (puVar9 != (undefined *)0x0) {
        puStack_70 = (undefined2 *)puVar9;
      }
      uStack_68 = 0;
      lStack_78 = lVar8;
      func_0x00525f7c(auStack_90,&lStack_78,8,0);
      uVar5 = func_0x0051d650(lVar8,&lStack_d8,&plStack_c0,0,auStack_90);
      func_0x004e4220(&lStack_78,lVar6,&UNK_009eaed8);
      plStack_b0 = (long *)puStack_70;
      puStack_b8 = (undefined *)lStack_78;
      uStack_a8 = uStack_68;
      plStack_c0 = (long *)CONCAT71(plStack_c0._1_7_,5);
      uVar5 = func_0x0051b078(uVar5,0xe,&plStack_c0);
      *extraout_x8 = 0x8000000000000000;
      extraout_x8[1] = uVar5;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar7,*(ulong *)(lVar8 + 0x108),&UNK_009e9b68);
  }
code_r0x0052e9f4:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x52e9f8);
  (*pcVar3)();
}

