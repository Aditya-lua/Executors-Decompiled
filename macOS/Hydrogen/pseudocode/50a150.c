
ulong FUN_0050a150(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  byte *pbVar4;
  undefined *puVar5;
  undefined8 *puVar6;
  undefined8 *extraout_x8;
  long *extraout_x8_00;
  long extraout_x9;
  long extraout_x9_00;
  long *plVar7;
  long extraout_x9_01;
  long extraout_x9_02;
  long extraout_x10;
  long extraout_x10_00;
  ulong uVar8;
  long extraout_x11;
  long extraout_x11_00;
  long lVar9;
  ulong uVar10;
  byte *unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  ulong uVar11;
  undefined8 *unaff_x22;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long unaff_x29;
  undefined1 auVar16 [16];
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 *puStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack_e8;
  byte *pbStack_e0;
  undefined8 uStack_d8;
  byte *pbStack_d0;
  undefined8 *puStack_c8;
  undefined1 auStack_c0 [16];
  undefined8 *puStack_b0;
  ulong uStack_a8;
  undefined *puStack_a0;
  undefined8 uStack_98;
  undefined8 **ppuStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 *puStack_70;
  undefined *puStack_68;
  undefined8 **ppuStack_60;
  undefined *puStack_58;
  
  puStack0000000000000060 = &uStack0000000000000028;
  uStack0000000000000068 = 1;
  uStack0000000000000070 = 0;
  func_0x007a2420(&uStack0000000000000050,&UNK_009e8e00);
  pbVar4 = &UNK_009e9b68;
  _in_stack_00000030 = func_0x007a2570();
  uStack0000000000000028 = 0;
  *(undefined8 **)(unaff_x29 + -0x60) = &uStack0000000000000018;
  *(undefined **)(unaff_x29 + -0x58) = &DAT_00519924;
  *(undefined8 **)(unaff_x29 + -0x50) = &uStack0000000000000028;
  *(undefined **)(unaff_x29 + -0x48) =
       &
       __ZN80__LT_clap_builder__parser__error__MatchesError_u20_as_u20_core__fmt__Display_GT_3fmt17h25c683212ee20945E
  ;
  uStack0000000000000050 = &UNK_009ea228;
  in_stack_00000058 = 2;
  uStack0000000000000068 = 2;
  uStack0000000000000070 = 0;
  puStack0000000000000060 = (undefined8 *)(unaff_x29 + -0x60);
  auVar16 = func_0x007a2420(&uStack0000000000000050,&UNK_009ea248);
  uVar3 = auVar16._8_8_;
  lVar9 = auVar16._0_8_;
  uStack_e8 = uVar3;
  pbStack_e0 = pbVar4;
  if (*(long *)(lVar9 + 0x10) != 0) {
    lVar12 = 0;
    unaff_x21 = 0;
    unaff_x22 = (undefined8 *)(*(long *)(lVar9 + 8) + 8);
    lVar14 = *(long *)(lVar9 + 0x10) << 4;
    do {
      unaff_x19 = pbVar4;
      unaff_x20 = uVar3;
      if ((byte *)*unaff_x22 == pbVar4) {
        iVar1 = _memcmp(unaff_x22[-1],uVar3,pbVar4);
        if (iVar1 == 0) {
          if (*(ulong *)(lVar9 + 0x28) <= unaff_x21) goto LAB_0050a380;
          unaff_x22 = (undefined8 *)0xf4422d85a423c218;
          unaff_x21 = 0xb3f9e9b015b11d7e;
          lVar12 = *(long *)(lVar9 + 0x20) + lVar12;
          puVar5 = (undefined *)0xb3f9e9b015b11d7e;
          auStack_c0 = func_0x00512f18(lVar12,0xf4422d85a423c218);
          if (auStack_c0._0_8_ != -0xbbdd27a5bdc3de8 || auStack_c0._8_8_ != -0x4c06164fea4ee282)
          goto LAB_0050a390;
          lVar9 = *(long *)(lVar12 + 0x38);
          puVar6 = (undefined8 *)(lVar9 + -0x10);
          lVar12 = *(long *)(lVar12 + 0x40) * 0x18;
          goto LAB_0050a2bc;
        }
      }
      unaff_x22 = unaff_x22 + 2;
      lVar12 = lVar12 + 0x68;
      unaff_x21 = unaff_x21 + 1;
      lVar14 = lVar14 + -0x10;
    } while (lVar14 != 0);
  }
  goto LAB_0050a340;
LAB_0050a5d0:
  do {
    if ((undefined *)*puVar6 == puVar5) {
      uVar2 = _memcmp(puVar6[-1],auVar16._8_8_,puVar5);
      lVar12 = extraout_x9_02;
      if ((int)uVar2 == 0) {
        if (*(ulong *)(uVar8 + 0x28) <= uVar11) {
          puVar5 = &UNK_009e9b68;
          auVar16 = func_0x007a2570(uVar11);
          lVar9 = *(long *)(auVar16._0_8_ + 0x10);
          if (lVar9 == 0) {
            return 0;
          }
          puVar6 = (undefined8 *)(*(long *)(auVar16._0_8_ + 8) + 8);
          lVar9 = lVar9 << 4;
          do {
            if ((undefined *)*puVar6 == puVar5) {
              iVar1 = _memcmp(puVar6[-1],auVar16._8_8_,puVar5);
              if (iVar1 == 0) {
                return 1;
              }
            }
            puVar6 = puVar6 + 2;
            lVar9 = lVar9 + -0x10;
          } while (lVar9 != 0);
          return 0;
        }
        lVar14 = *(long *)(uVar8 + 0x20) + lVar14;
        lVar9 = *(long *)(lVar14 + 0x50);
        lVar12 = lVar9 + *(long *)(lVar14 + 0x58) * 0x18;
        goto LAB_0050a618;
      }
    }
    puVar6 = puVar6 + 2;
    lVar14 = lVar14 + 0x68;
    uVar11 = uVar11 + 1;
    lVar9 = lVar9 + -0x10;
  } while (lVar9 != 0);
  lVar9 = 0;
LAB_0050a618:
  *extraout_x8_00 = lVar9;
  extraout_x8_00[1] = lVar12;
  extraout_x8_00[2] = (long)&DAT_00507d68;
  return uVar2;
  while( true ) {
    plVar7 = (long *)(lVar9 + 0x10);
    lVar9 = lVar9 + 0x18;
    puVar6 = puVar6 + 3;
    lVar12 = lVar12 + -0x18;
    if (*plVar7 != 0) break;
LAB_0050a2bc:
    if (lVar12 == 0) goto LAB_0050a340;
  }
  lVar9 = ((long *)*puVar6)[1];
  unaff_x19 = (byte *)(*(long *)*puVar6 + (*(long *)(lVar9 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10
                      );
  auVar16 = (**(code **)(lVar9 + 0x18))(unaff_x19);
  if (auVar16._0_8_ == -0xbbdd27a5bdc3de8 && auVar16._8_8_ == -0x4c06164fea4ee282) {
    if (unaff_x19 != (byte *)0x0) {
      return (ulong)*unaff_x19;
    }
  }
  else {
    func_0x007a23d8(&UNK_008a4c57,99,&UNK_009e8e50);
  }
LAB_0050a340:
  puStack_c8 = &uStack_e8;
  auStack_c0._0_8_ = &DAT_00519924;
  puStack_a0 = &UNK_009e8e18;
  uStack_98 = 2;
  ppuStack_90 = &puStack_c8;
  uStack_88 = 1;
  uStack_80 = 0;
  func_0x007a2420(&puStack_a0,&UNK_009e8e38);
LAB_0050a380:
  puVar5 = &UNK_009e9b68;
  auStack_c0 = func_0x007a2570(unaff_x21);
LAB_0050a390:
  puStack_c8 = (undefined8 *)0x0;
  puStack_70 = &uStack_d8;
  puStack_68 = &DAT_00519924;
  ppuStack_60 = &puStack_c8;
  puStack_58 = &
               __ZN80__LT_clap_builder__parser__error__MatchesError_u20_as_u20_core__fmt__Display_GT_3fmt17h25c683212ee20945E
  ;
  puStack_a0 = &UNK_009ea228;
  uStack_98 = 2;
  uStack_88 = 2;
  uStack_80 = 0;
  ppuStack_90 = &puStack_70;
  uStack_d8 = unaff_x20;
  pbStack_d0 = unaff_x19;
  puStack_b0 = unaff_x22;
  uStack_a8 = unaff_x21;
  auVar16 = func_0x007a2420(&puStack_a0,&UNK_009ea248);
  uVar8 = auVar16._0_8_;
  uVar2 = uVar8;
  lVar12 = extraout_x9;
  lVar14 = extraout_x10;
  lVar9 = extraout_x11;
  if (*(long *)(uVar8 + 0x10) != 0) {
    lVar13 = 0;
    uVar11 = 0;
    lVar12 = *(long *)(uVar8 + 8);
    puVar6 = (undefined8 *)(lVar12 + 8);
    lVar15 = *(long *)(uVar8 + 0x10) << 4;
    do {
      if ((undefined *)*puVar6 == puVar5) {
        uVar2 = _memcmp(puVar6[-1],auVar16._8_8_,puVar5);
        lVar12 = extraout_x9_00;
        lVar14 = extraout_x10_00;
        lVar9 = extraout_x11_00;
        if ((int)uVar2 == 0) {
          if (*(ulong *)(uVar8 + 0x28) <= uVar11) {
            puVar5 = &UNK_009e9b68;
            auVar16 = func_0x007a2570(uVar11);
            uVar8 = auVar16._0_8_;
            lVar9 = 0;
            uVar2 = uVar8;
            lVar12 = extraout_x9_01;
            if (*(long *)(uVar8 + 0x10) == 0) goto LAB_0050a618;
            lVar14 = 0;
            uVar11 = 0;
            lVar12 = *(long *)(uVar8 + 8);
            puVar6 = (undefined8 *)(lVar12 + 8);
            lVar9 = *(long *)(uVar8 + 0x10) << 4;
            goto LAB_0050a5d0;
          }
          lVar13 = *(long *)(uVar8 + 0x20) + lVar13;
          uVar8 = *(ulong *)(lVar13 + 0x40);
          if (uVar8 == 0) {
            lVar9 = 0;
            goto LAB_0050a528;
          }
          if (uVar8 < 4) {
            lVar9 = 0;
            uVar11 = 0;
            goto LAB_0050a508;
          }
          lVar9 = 0;
          lVar12 = 0;
          lVar14 = 0;
          lVar15 = 0;
          uVar11 = uVar8 & 0xfffffffffffffffc;
          plVar7 = (long *)(*(long *)(lVar13 + 0x38) + 0x40);
          uVar10 = uVar11;
          do {
            lVar9 = plVar7[-6] + lVar9;
            lVar12 = plVar7[-3] + lVar12;
            uVar2 = plVar7[3];
            lVar14 = *plVar7 + lVar14;
            lVar15 = uVar2 + lVar15;
            plVar7 = plVar7 + 0xc;
            uVar10 = uVar10 - 4;
          } while (uVar10 != 0);
          lVar9 = lVar15 + lVar14 + lVar12 + lVar9;
          if (uVar8 != uVar11) {
LAB_0050a508:
            lVar12 = uVar8 - uVar11;
            plVar7 = (long *)(*(long *)(lVar13 + 0x38) + uVar11 * 0x18 + 0x10);
            do {
              lVar9 = *plVar7 + lVar9;
              lVar12 = lVar12 + -1;
              plVar7 = plVar7 + 3;
            } while (lVar12 != 0);
          }
LAB_0050a528:
          lVar12 = *(long *)(lVar13 + 0x50);
          lVar14 = lVar12 + *(long *)(lVar13 + 0x58) * 0x18;
          puVar5 = &DAT_00507b4c;
          goto LAB_0050a53c;
        }
      }
      puVar6 = puVar6 + 2;
      lVar13 = lVar13 + 0x68;
      uVar11 = uVar11 + 1;
      lVar15 = lVar15 + -0x10;
    } while (lVar15 != 0);
  }
  puVar5 = (undefined *)0x0;
LAB_0050a53c:
  *extraout_x8 = puVar5;
  extraout_x8[1] = lVar12;
  extraout_x8[2] = lVar14;
  extraout_x8[3] = 0;
  extraout_x8[5] = 0;
  extraout_x8[7] = lVar9;
  return uVar2;
}

