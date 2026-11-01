
void FUN_005bd89c(long *param_1,long *param_2,undefined8 param_3,ulong param_4)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  undefined *puVar7;
  long *extraout_x8;
  ulong uVar8;
  long *plVar9;
  undefined8 unaff_x21;
  long *plVar10;
  long lVar11;
  long lVar12;
  undefined8 uVar13;
  long *plVar14;
  bool bVar15;
  undefined1 auVar16 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  undefined8 uStack_100;
  undefined *puStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long *plStack_b0;
  undefined *puStack_a8;
  long **pplStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long *plStack_68;
  undefined *puStack_60;
  undefined1 uStack_51;
  long lStack_50;
  long lStack_48;
  undefined8 uStack_40;
  long lStack_38;
  long *plStack_30;
  undefined8 uStack_28;
  ulong uStack_20;
  long *plStack_18;
  long lStack_10;
  undefined8 uStack_8;
  
  lVar12 = (long)register0x00000008 + 0xc0;
  uStack0000000000000008 = *param_2;
  lVar6 = param_2[1];
  if (uStack0000000000000008 == lVar6) {
    *param_1 = 0;
    param_1[1] = 1;
    param_1[2] = 0;
    return;
  }
  lVar1 = uStack0000000000000008 + 8;
  *param_2 = lVar1;
  lVar11 = ((ulong)(lVar6 - lVar1) >> 3) * param_4;
  if (lVar11 < 0) {
    uVar13 = 0;
    param_3 = unaff_x21;
  }
  else {
    if (lVar11 == 0) {
      lVar4 = 1;
LAB_005bd928:
      in_stack_00000020 = 0;
      uStack0000000000000060 = &uStack0000000000000008;
      in_stack_00000068 = &DAT_005c91c4;
      uStack0000000000000030 = &UNK_008b4fb8;
      in_stack_00000038 = 1;
      in_stack_00000048 = 1;
      in_stack_00000050 = 0;
      in_stack_00000040 = &uStack0000000000000060;
      uStack0000000000000010 = lVar11;
      in_stack_00000018 = lVar4;
      iVar3 = func_0x0046849c(&uStack0000000000000010,&UNK_009f20e8,&uStack0000000000000030);
      if (iVar3 != 0) {
        puVar7 = &UNK_009f2198;
LAB_005bda70:
        func_0x007a2810(&UNK_008b4f10,0x2b,&uStack0000000000000030,&UNK_009f2130,puVar7);
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x5bda90);
        (*pcVar2)();
      }
      if (lVar1 != lVar6) {
        uStack0000000000000028 = lVar1;
        do {
          lVar12 = uStack0000000000000028 + 8;
          *param_2 = lVar12;
          if ((ulong)(uStack0000000000000010 - in_stack_00000020) < param_4) {
            func_0x007af5a0(&uStack0000000000000010,in_stack_00000020,param_4,1,1);
          }
          lVar1 = in_stack_00000020;
          _memcpy(in_stack_00000018 + in_stack_00000020,param_3,param_4);
          in_stack_00000020 = lVar1 + param_4;
          in_stack_00000068 = &DAT_005c91c4;
          uStack0000000000000030 = &UNK_008b4fb8;
          in_stack_00000038 = 1;
          in_stack_00000048 = 1;
          in_stack_00000050 = 0;
          in_stack_00000040 = &uStack0000000000000060;
          uStack0000000000000060 = &uStack0000000000000028;
          uVar8 = func_0x0046849c(&uStack0000000000000010,&UNK_009f20e8,&uStack0000000000000030);
          if ((uVar8 & 1) != 0) {
            puVar7 = &UNK_009f21b0;
            goto LAB_005bda70;
          }
          uStack0000000000000028 = lVar12;
        } while (lVar12 != lVar6);
      }
      param_1[1] = in_stack_00000018;
      *param_1 = uStack0000000000000010;
      param_1[2] = in_stack_00000020;
      return;
    }
    uVar13 = 1;
    lVar4 = func_0x00187bd0(lVar11,1);
    if (lVar4 != 0) goto LAB_005bd928;
  }
  puVar7 = &UNK_009f2180;
  plVar5 = (long *)func_0x007a1f00(uVar13,lVar11);
  if (uStack0000000000000010 != 0) {
    puVar7 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000018);
    param_1 = plVar5;
  }
  auVar16 = __Unwind_Resume(plVar5);
  uStack_100 = auVar16._8_8_;
  plVar5 = auVar16._0_8_;
  uStack_8 = 0x5bdadc;
  plVar10 = plVar5 + 3;
  lVar4 = *plVar10;
  puStack_f8 = puVar7;
  lStack_50 = lVar6;
  lStack_48 = lVar1;
  uStack_40 = uVar13;
  lStack_38 = lVar11;
  plStack_30 = param_2;
  uStack_28 = param_3;
  uStack_20 = param_4;
  plStack_18 = param_1;
  lStack_10 = lVar12;
  if (lVar4 == 0) {
LAB_005bdb78:
    lStack_d8 = *plVar5;
    if (lStack_d8 == -0x7fffffffffffffff) {
LAB_005bdbe8:
      *extraout_x8 = 0;
      extraout_x8[1] = 1;
      extraout_x8[2] = 0;
      return;
    }
    lStack_c0 = plVar5[2];
    lStack_c8 = plVar5[1];
    *plVar5 = -0x8000000000000000;
    if (lStack_d8 == -0x8000000000000000) goto LAB_005bdbe8;
    plVar9 = (long *)*plVar5;
    lStack_d0 = lStack_d8;
    if (plVar9 == (long *)0x8000000000000001) {
      uVar8 = 0;
      bVar15 = true;
      plVar14 = (long *)0x8000000000000001;
    }
    else {
      uVar8 = (ulong)(plVar9 != (long *)0x8000000000000000);
      bVar15 = true;
LAB_005bdc4c:
      plVar14 = plVar9;
    }
  }
  else {
    lVar12 = plVar5[4];
    if (lVar4 == lVar12) {
LAB_005bdb74:
      *plVar10 = 0;
      goto LAB_005bdb78;
    }
    *plVar10 = lVar4 + 8;
    plStack_b0 = &lStack_80;
    lStack_80 = 0;
    lStack_78 = 1;
    lStack_70 = 0;
    pplStack_a0 = (long **)0xe0000020;
    puStack_a8 = &UNK_009f20e8;
    iVar3 = func_0x005ca2ec(lVar4,&plStack_b0);
    if (iVar3 != 0) {
      func_0x007a2810(&UNK_008b4e6c,0x37,&uStack_51,&UNK_009f2130,&UNK_009f2118);
      goto LAB_005bddd8;
    }
    if (lStack_80 == -0x8000000000000000) goto LAB_005bdb74;
    lStack_d0 = lStack_80;
    lStack_c0 = lStack_70;
    lStack_c8 = lStack_78;
    plVar9 = (long *)*plVar5;
    uVar8 = (ulong)(lVar12 - (lVar4 + 8)) >> 3;
    plVar14 = (long *)0x8000000000000001;
    if (plVar9 != (long *)0x8000000000000001) {
      bVar15 = false;
      if (plVar9 != (long *)0x8000000000000000) {
        uVar8 = uVar8 + 1;
      }
      goto LAB_005bdc4c;
    }
    bVar15 = false;
  }
  lVar12 = uVar8 * (long)puVar7;
  lStack_f0 = lStack_c8;
  lStack_e8 = lStack_c0;
  if (lVar12 < 0) {
    uVar13 = 0;
LAB_005bddc4:
    func_0x007a1f00(uVar13,lVar12,&UNK_009f2180);
  }
  else {
    if (lVar12 == 0) {
      lVar6 = 1;
    }
    else {
      uVar13 = 1;
      lVar6 = func_0x00187bd0(lVar12,1);
      if (lVar6 == 0) goto LAB_005bddc4;
    }
    plStack_68 = &lStack_d0;
    lStack_70 = 0;
    puStack_60 = &DAT_005bd394;
    plStack_b0 = (long *)&UNK_008b4fb8;
    puStack_a8 = (undefined *)0x1;
    uStack_98 = 1;
    uStack_90 = 0;
    pplStack_a0 = &plStack_68;
    lStack_80 = lVar12;
    lStack_78 = lVar6;
    iVar3 = func_0x0046849c(&lStack_80,&UNK_009f20e8,&plStack_b0);
    if (iVar3 == 0) {
      plStack_68 = &lStack_80;
      puStack_60 = (undefined *)&uStack_100;
      if (!bVar15) {
        puStack_60 = (undefined *)&uStack_100;
        func_0x005d1830(plVar10,&plStack_68);
        plVar5[3] = 0;
        plVar14 = (long *)*plVar5;
      }
      if ((plVar14 != (long *)0x8000000000000001) &&
         (*plVar5 = -0x8000000000000000, plVar14 != (long *)0x8000000000000000)) {
        pplStack_a0 = (long **)plVar5[2];
        puStack_a8 = (undefined *)plVar5[1];
        plStack_b0 = plVar14;
        func_0x005bc4c4(plStack_68,puStack_60,&plStack_b0);
        *plVar5 = -0x8000000000000000;
      }
      extraout_x8[1] = lStack_78;
      *extraout_x8 = lStack_80;
      extraout_x8[2] = lStack_70;
      if (lStack_d0 != 0) {
        func_0x00187bd4(lStack_c8,lStack_d0,1);
      }
      return;
    }
    func_0x007a2810(&UNK_008b4f10,0x2b,&uStack_51,&UNK_009f2130,&UNK_009f2198);
  }
LAB_005bddd8:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5bdddc);
  (*pcVar2)();
}

