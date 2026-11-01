
void FUN_0020c398(void)

{
  ushort uVar1;
  long *plVar2;
  undefined1 *puVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined *puVar7;
  undefined8 in_x3;
  ulong in_x4;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  undefined *puVar8;
  undefined1 unaff_w24;
  ulong uVar9;
  ulong uVar10;
  long unaff_x25;
  long unaff_x27;
  undefined8 uVar11;
  long unaff_x28;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000018;
  undefined1 *in_stack_00000020;
  long in_stack_00000028;
  undefined *puStack_f8;
  undefined8 uStack_f0;
  ushort **ppuStack_e8;
  undefined8 uStack_e0;
  undefined *puStack_d8;
  undefined8 uStack_d0;
  ushort *puStack_c8;
  undefined *puStack_c0;
  ushort uStack_b2;
  long **pplStack_b0;
  undefined *puStack_a8;
  long lStack_a0;
  long lStack_98;
  undefined8 uStack_90;
  long *plStack_60;
  undefined *puStack_58;
  long lStack_50;
  
  lVar5 = (unaff_x27 - unaff_x28) + 10;
  if (lVar5 < 0) {
    uVar11 = 0;
  }
  else {
    if (lVar5 == 0) {
      uStack0000000000000018 = 0;
      in_stack_00000020 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
      in_stack_00000028 = 0;
      func_0x00458a18(&uStack0000000000000018,&UNK_009c65a0);
      *in_stack_00000020 = unaff_w24;
joined_r0x0020c420:
      if (uStack0000000000000018 == 1) {
        in_stack_00000028 = 1;
        func_0x00458a18(&uStack0000000000000018,&UNK_009c65b8);
      }
      in_stack_00000020[1] = -0x78 - (char)unaff_x28;
      in_stack_00000028 = 2;
      uVar9 = (unaff_x21 + 8) - unaff_x25;
      if (uStack0000000000000018 - 2U < uVar9) {
        func_0x0079b61c(&uStack0000000000000018,2,uVar9,1,1);
      }
      lVar5 = in_stack_00000028;
      _memcpy(in_stack_00000020 + in_stack_00000028);
      in_stack_00000028 = lVar5 + uVar9;
      if ((ulong)(uStack0000000000000018 - in_stack_00000028) < unaff_x22) {
        func_0x0079b61c(&uStack0000000000000018,in_stack_00000028);
      }
      lVar5 = in_stack_00000028;
      _memcpy(in_stack_00000020 + in_stack_00000028);
      in_stack_00000028 = lVar5 + unaff_x22;
      if ((ulong)(uStack0000000000000018 - in_stack_00000028) < unaff_x20) {
        func_0x0079b61c(&uStack0000000000000018,in_stack_00000028);
      }
      lVar5 = in_stack_00000028;
      _memcpy(in_stack_00000020 + in_stack_00000028,in_stack_00000008);
      unaff_x19[2] = lVar5 + unaff_x20;
      unaff_x19[1] = (long)in_stack_00000020;
      *unaff_x19 = uStack0000000000000018;
      return;
    }
    uVar11 = 1;
    puVar3 = (undefined1 *)func_0x00187bd0(lVar5,1);
    if (puVar3 != (undefined1 *)0x0) {
      *puVar3 = unaff_w24;
      uStack0000000000000018 = lVar5;
      in_stack_00000020 = puVar3;
      goto joined_r0x0020c420;
    }
  }
  puVar7 = &UNK_009c6588;
  uVar11 = func_0x007a1f00(uVar11,lVar5);
  if (uStack0000000000000018 != 0) {
    puVar7 = (undefined *)0x1;
    func_0x00187bd4(in_stack_00000020);
  }
  auVar12 = __Unwind_Resume(uVar11);
  plVar2 = (long *)((long)register0x00000008 + -0x10);
  uVar9 = (long)puVar7 << 1;
  lStack_50 = lVar5;
  if ((long)(uVar9 | (ulong)puVar7) < 0) {
    uVar11 = 0;
  }
  else {
    if (uVar9 == 0) {
      puVar8 = (undefined *)0x0;
      lVar4 = 1;
code_r0x0020c664:
      _memcpy(lVar4,auVar12._8_8_,uVar9);
      uVar9 = *auVar12._0_8_ + 0x7fffffffffffffff;
      if (4 < uVar9) {
        uVar9 = 1;
      }
      extraout_x8[2] = lVar4;
      extraout_x8[3] = puVar7;
      *(char *)(extraout_x8 + 4) = (char)(0x300020201 >> ((uVar9 & 7) << 3));
      *extraout_x8 = 0x8000000000000011;
      extraout_x8[1] = puVar8;
      return;
    }
    uVar11 = 1;
    lVar4 = func_0x00187bd0(uVar9,1);
    unaff_x25 = auVar12._8_8_;
    if (lVar4 != 0) {
      puVar8 = puVar7;
      goto code_r0x0020c664;
    }
  }
  puVar7 = &UNK_009c64a8;
  auVar12 = func_0x007a1f00(uVar11,uVar9);
  puStack_58 = &DAT_0020c6dc;
  lVar4 = *auVar12._0_8_;
  lStack_a0 = lVar5;
  lStack_98 = unaff_x25;
  uStack_90 = uVar11;
  plStack_60 = plVar2;
  if (lVar4 + 0x7fffffffffffffffU < 5) {
    in_x4 = (long)puVar7 << 1;
    if (-1 < (long)(in_x4 | (ulong)puVar7)) {
      if (in_x4 == 0) {
        puVar8 = (undefined *)0x0;
        lVar5 = 1;
      }
      else {
        uVar11 = 1;
        lVar5 = func_0x00187bd0(in_x4,1);
        if (lVar5 == 0)
        goto 
        __ZN67__LT_rustls__enums__ProtocolVersion_u20_as_u20_core__fmt__Debug_GT_3fmt17h33735ad045c9960cE
        ;
        puVar8 = puVar7;
      }
      uVar11 = 0x8000000000000011;
      _memcpy(lVar5,auVar12._8_8_,in_x4);
      extraout_x8_00[1] = puVar8;
      extraout_x8_00[2] = lVar5;
      extraout_x8_00[3] = puVar7;
      *(char *)(extraout_x8_00 + 4) = (char)(0x300020201 >> (lVar4 * 8 - 8U & 0x38));
      goto LAB_0020c81c;
    }
  }
  else {
    uVar9 = in_x4 << 1;
    if (-1 < (long)(uVar9 | in_x4)) {
      if (uVar9 == 0) {
        uVar10 = 0;
        lVar5 = 1;
      }
      else {
        uVar11 = 1;
        lVar5 = func_0x00187bd0(uVar9,1);
        if (lVar5 == 0) goto code_r0x0020c83c;
        uVar10 = in_x4;
      }
      _memcpy(lVar5,in_x3,uVar9);
      lVar4 = auVar12._0_8_[0x16];
      extraout_x8_00[1] = uVar10;
      extraout_x8_00[2] = lVar5;
      extraout_x8_00[3] = in_x4;
      *(short *)(extraout_x8_00 + 4) = (short)lVar4;
      uVar11 = 0x8000000000000012;
LAB_0020c81c:
      *extraout_x8_00 = uVar11;
      return;
    }
    uVar11 = 0;
code_r0x0020c83c:
    func_0x007a1f00(uVar11,uVar9,&UNK_009c64a8);
  }
  uVar11 = 0;
__ZN67__LT_rustls__enums__ProtocolVersion_u20_as_u20_core__fmt__Debug_GT_3fmt17h33735ad045c9960cE:
  auVar12 = func_0x007a1f00(uVar11,in_x4,&UNK_009c64a8);
  puVar6 = auVar12._8_8_;
  uVar1 = *auVar12._0_8_;
  pplStack_b0 = &plStack_60;
  if (uVar1 < 5) {
    if (uVar1 < 2) {
      if (uVar1 == 0) {
        puVar7 = &UNK_008222ba;
        uVar11 = 5;
      }
      else {
        puVar7 = &UNK_008222bf;
        uVar11 = 5;
      }
    }
    else if (uVar1 == 2) {
      puVar7 = &UNK_008222c4;
      uVar11 = 7;
    }
    else if (uVar1 == 3) {
      puVar7 = &UNK_008222cb;
      uVar11 = 7;
    }
    else {
      puVar7 = &UNK_008222d2;
      uVar11 = 7;
    }
  }
  else if (uVar1 < 7) {
    if (uVar1 == 5) {
      puVar7 = &UNK_008222d9;
      uVar11 = 7;
    }
    else {
      puVar7 = &UNK_008222e0;
      uVar11 = 8;
    }
  }
  else if (uVar1 == 7) {
    puVar7 = &UNK_008222e8;
    uVar11 = 8;
  }
  else {
    if (uVar1 != 8) {
      puStack_a8 = &
                   __ZN79__LT_rustls__versions__SupportedProtocolVersion_u20_as_u20_core__fmt__Debug_GT_3fmt17h314e1e876ec8ed27E
      ;
      uStack_b2 = auVar12._0_8_[1];
      puStack_c8 = &uStack_b2;
      puStack_c0 = &DAT_001ee810;
      puStack_f8 = &UNK_009c4a10;
      uStack_f0 = 2;
      puStack_d8 = &UNK_00820780;
      uStack_d0 = 1;
      ppuStack_e8 = &puStack_c8;
      uStack_e0 = 1;
      func_0x0046849c(*puVar6,puVar6[1],&puStack_f8);
      return;
    }
    puVar7 = &UNK_008222f0;
    uVar11 = 8;
  }
  puStack_a8 = &
               __ZN79__LT_rustls__versions__SupportedProtocolVersion_u20_as_u20_core__fmt__Debug_GT_3fmt17h314e1e876ec8ed27E
  ;
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(puVar6[1] + 0x18))(*puVar6,puVar7,uVar11);
  return;
}

