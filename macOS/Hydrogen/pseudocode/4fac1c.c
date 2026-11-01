
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004fac1c(void)

{
  uint uVar1;
  ulong uVar2;
  long *plVar3;
  undefined8 uVar4;
  code *pcVar5;
  bool bVar6;
  ulong uVar7;
  long lVar8;
  byte in_w8;
  undefined *puVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  ulong unaff_x19;
  undefined8 *puVar13;
  ulong unaff_x20;
  long *plVar14;
  long unaff_x21;
  ulong uVar15;
  long unaff_x23;
  byte *pbVar16;
  byte *pbVar17;
  long unaff_x24;
  ulong uVar18;
  undefined *unaff_x25;
  long lVar19;
  long lVar20;
  long unaff_x29;
  undefined1 auVar21 [16];
  ulong uStack0000000000000020;
  undefined1 uStack0000000000000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  ulong in_stack_00000060;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c0;
  
  bVar6 = (unaff_x21 != 0 & in_w8) != 0;
  uVar2 = 1;
  if (bVar6) {
    uVar2 = 2;
  }
  puVar9 = &UNK_008a404b;
  if (!bVar6) {
    puVar9 = unaff_x25;
  }
  if ((ulong)(uStack0000000000000050 - unaff_x24) < uVar2) {
    func_0x007a5594(&uStack0000000000000050);
    unaff_x24 = in_stack_00000060;
  }
  _memcpy(in_stack_00000058 + unaff_x24,puVar9,uVar2);
  in_stack_00000060 = unaff_x24 + uVar2;
  if (uStack0000000000000050 - in_stack_00000060 < unaff_x20) {
    func_0x007a5594(&uStack0000000000000050,in_stack_00000060);
  }
  lVar10 = in_stack_00000060;
  _memcpy(in_stack_00000058 + in_stack_00000060);
  in_stack_00000060 = lVar10 + unaff_x20;
  func_0x00511ec8(&uStack0000000000000050,1,0,in_stack_00000040,in_stack_00000048);
  uVar2 = in_stack_00000060;
  lVar10 = in_stack_00000058;
  plVar14 = *(long **)(unaff_x23 + 8);
  lVar19 = plVar14[2];
  if ((ulong)(*plVar14 - lVar19) < in_stack_00000060) {
    func_0x007a5594(plVar14,lVar19,in_stack_00000060,1,1);
    lVar19 = plVar14[2];
  }
  _memcpy(plVar14[1] + lVar19,lVar10,uVar2);
  plVar14[2] = lVar19 + uVar2;
  if (((unaff_x21 == 0) || ((*(byte *)(unaff_x21 + 0x250) >> 4 & 1) != 0)) ||
     (*(char *)(unaff_x23 + 0x29) != '\x01')) goto LAB_004fafac;
  uVar1 = *(uint *)(unaff_x21 + 0x10) & (uint)(*(long *)(unaff_x21 + 0x20) == 0);
  if (uVar1 == 0) {
    plVar3 = (long *)&
                     __ZN12clap_builder7builder3arg3Arg16get_value_parser7DEFAULT17h30dba9b248d4334fE
    ;
    if (*(long *)(unaff_x21 + 0x50) != 5) {
      plVar3 = (long *)(unaff_x21 + 0x50);
    }
    lVar10 = *plVar3;
    if (lVar10 < 2) {
      if (lVar10 == 0) {
        puVar9 = &UNK_009eaae0;
      }
      else {
        puVar9 = &UNK_009eab20;
      }
LAB_004fad7c:
      lVar10 = 1;
    }
    else {
      if (lVar10 == 2) {
        puVar9 = &UNK_009eab60;
        goto LAB_004fad7c;
      }
      if (lVar10 == 3) {
        puVar9 = &UNK_009eaba0;
        goto LAB_004fad7c;
      }
      lVar10 = plVar3[1];
      puVar9 = (undefined *)plVar3[2];
    }
    auVar21 = (**(code **)(puVar9 + 0x30))(lVar10);
    if (auVar21._0_8_ == 0) goto LAB_004fada4;
    func_0x004e9474(unaff_x29 + -0x88,auVar21._0_8_,auVar21._8_8_,&UNK_009e8e98);
    lVar10 = *(long *)(unaff_x29 + -0x80);
    lVar19 = *(long *)(unaff_x29 + -0x78);
  }
  else {
LAB_004fada4:
    lVar19 = 0;
    *(undefined8 *)(unaff_x29 + -0x88) = 0;
    lVar10 = 8;
  }
  lVar8 = lVar19 * 0x48;
  lVar11 = lVar10;
  do {
    lVar12 = lVar11;
    lVar20 = lVar8;
    if (lVar20 == 0) break;
    lVar8 = lVar20 + -0x48;
    lVar11 = lVar12 + 0x48;
  } while (((*(byte *)(lVar12 + 0x40) & 1) != 0) ||
          (*(long *)(lVar12 + 0x18) == -0x8000000000000000));
  if (lVar19 != 0) {
    puVar13 = (undefined8 *)(lVar10 + 0x20);
    do {
      lVar8 = puVar13[-1];
      if (lVar8 == -0x8000000000000000 || lVar8 == 0) {
        lVar8 = puVar13[-4];
      }
      else {
        func_0x00187bd4(*puVar13,lVar8,1);
        lVar8 = puVar13[-4];
      }
      if (lVar8 != 0) {
        func_0x00187bd4(puVar13[-3],lVar8 << 4,8);
      }
      puVar13 = puVar13 + 9;
      lVar19 = lVar19 + -1;
    } while (lVar19 != 0);
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    func_0x00187bd4(lVar10,*(long *)(unaff_x29 + -0x88) * 0x48,8);
  }
  if (lVar20 == 0) goto LAB_004fafac;
  if (uVar1 == 0) {
    plVar3 = (long *)&
                     __ZN12clap_builder7builder3arg3Arg16get_value_parser7DEFAULT17h30dba9b248d4334fE
    ;
    if (*(long *)(unaff_x21 + 0x50) != 5) {
      plVar3 = (long *)(unaff_x21 + 0x50);
    }
    lVar10 = *plVar3;
    if (lVar10 < 2) {
      if (lVar10 == 0) {
        puVar9 = &UNK_009eaae0;
      }
      else {
        puVar9 = &UNK_009eab20;
      }
LAB_004faed4:
      lVar10 = 1;
    }
    else {
      if (lVar10 == 2) {
        puVar9 = &UNK_009eab60;
        goto LAB_004faed4;
      }
      if (lVar10 == 3) {
        puVar9 = &UNK_009eaba0;
        goto LAB_004faed4;
      }
      lVar10 = plVar3[1];
      puVar9 = (undefined *)plVar3[2];
    }
    auVar21 = (**(code **)(puVar9 + 0x30))(lVar10);
    if (auVar21._0_8_ == 0) goto LAB_004faf84;
    func_0x004e9474(&uStack0000000000000070,auVar21._0_8_,auVar21._8_8_,&UNK_009e8e98);
    lVar10 = in_stack_00000080;
    lVar19 = in_stack_00000078;
    if (in_stack_00000080 == 0) goto LAB_004faf8c;
    uVar15 = in_stack_00000080 * 0x48;
    pbVar17 = (byte *)(in_stack_00000078 + 0x40);
    uVar18 = uVar15;
    do {
      pbVar16 = pbVar17;
      if (uVar18 == 0) {
        func_0x007a23d8(&UNK_008a40f5,0x1f,&UNK_009e8608);
        goto code_r0x004fb4d8;
      }
      pbVar17 = pbVar16 + 0x48;
      uVar18 = uVar18 - 0x48;
    } while ((*pbVar16 & 1) != 0);
    uStack0000000000000020 =
         func_0x00513134(*(undefined8 *)(pbVar16 + -0x10),*(undefined8 *)(pbVar16 + -8));
    if (uVar18 != 0) {
      uVar18 = uVar18 / 0x48;
      do {
        if ((*pbVar17 & 1) == 0) {
          uVar7 = func_0x00513134(*(undefined8 *)(pbVar17 + -0x10),*(undefined8 *)(pbVar17 + -8));
          if (uVar7 <= uStack0000000000000020) {
            uVar7 = uStack0000000000000020;
          }
          uStack0000000000000020 = uVar7;
        }
        pbVar17 = pbVar17 + 0x48;
        uVar18 = uVar18 - 1;
      } while (uVar18 != 0);
    }
    func_0x00509250(&uStack0000000000000088,&UNK_008a40f4,1,unaff_x19 + 2);
    if (uVar2 != 0) {
      if (unaff_x19 >> 0x10 != 0) {
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8630;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        *(undefined8 *)(unaff_x29 + -0x78) = 8;
        func_0x007a2420(unaff_x29 + -0x88,&UNK_009e8640);
code_r0x004fb4d8:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x4fb4dc);
        (*pcVar5)();
      }
      *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
      *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
      *(undefined8 *)(unaff_x29 + -0x98) = 0;
      *(short *)(unaff_x29 + -0x90) = (short)unaff_x19;
      *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8620;
      *(undefined8 *)(unaff_x29 + -0x80) = 1;
      *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
      *(undefined8 *)(unaff_x29 + -0x60) = 1;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
      *(undefined8 *)(unaff_x29 + -0x70) = 2;
      func_0x0046849c(plVar14,&UNK_009e84b0,unaff_x29 + -0x88);
    }
    lVar8 = plVar14[2];
    if ((ulong)(*plVar14 - lVar8) < 0x10) {
      func_0x007a5594(plVar14,lVar8,0x10,1,1);
      lVar8 = plVar14[2];
    }
    uVar4 = _UNK_008a4320;
    lVar11 = plVar14[1];
    ((undefined8 *)(lVar11 + lVar8))[1] = _UNK_008a4328;
    *(undefined8 *)(lVar11 + lVar8) = uVar4;
    puVar13 = (undefined8 *)(lVar19 + 0x20);
    plVar14[2] = lVar8 + 0x10;
    lVar8 = lVar19;
    for (; uVar15 != 0; uVar15 = uVar15 - 0x48) {
      if (*(char *)(lVar8 + 0x40) != '\x01') {
        uStack00000000000000a0 = puVar13[2];
        in_stack_000000a8 = puVar13[3];
        uStack00000000000000b0 = 0;
        in_stack_000000b8 = 1;
        in_stack_000000c0 = 0;
        *(undefined1 **)(unaff_x29 + -0xa8) = &uStack0000000000000028;
        *(undefined **)(unaff_x29 + -0xa0) = &DAT_00524310;
        *(undefined8 **)(unaff_x29 + -0x98) = &uStack00000000000000a0;
        *(undefined **)(unaff_x29 + -0x90) = &DAT_00519924;
        *(undefined **)(unaff_x29 + -0x88) = &UNK_008a41d8;
        *(undefined8 *)(unaff_x29 + -0x80) = 3;
        *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4050;
        *(undefined8 *)(unaff_x29 + -0x60) = 3;
        *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
        *(undefined8 *)(unaff_x29 + -0x70) = 2;
        func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
        if (puVar13[-1] == -0x8000000000000000) {
LAB_004fb1fc:
          uVar4 = in_stack_00000098;
          func_0x00511674(&uStack00000000000000b0);
          func_0x00511ec8(&uStack00000000000000b0,1,0,in_stack_00000090,uVar4);
          if (unaff_x19 >> 0x10 == 0) {
            *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
            *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
            *(undefined8 *)(unaff_x29 + -0x98) = 0;
            *(short *)(unaff_x29 + -0x90) = (short)unaff_x19;
            *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8680;
            *(undefined8 *)(unaff_x29 + -0x80) = 2;
            *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
            *(undefined8 *)(unaff_x29 + -0x60) = 1;
            *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
            *(undefined8 *)(unaff_x29 + -0x70) = 2;
            func_0x0046849c(plVar14,&UNK_009e84b0,unaff_x29 + -0x88);
            uVar2 = in_stack_000000c0;
            lVar11 = in_stack_000000b8;
            lVar20 = plVar14[2];
            if ((ulong)(*plVar14 - lVar20) < in_stack_000000c0) {
              func_0x007a5594(plVar14,lVar20,in_stack_000000c0,1,1);
              lVar20 = plVar14[2];
            }
            _memcpy(plVar14[1] + lVar20,lVar11,uVar2);
            plVar14[2] = lVar20 + uVar2;
            if (uStack00000000000000b0 != 0) {
              func_0x00187bd4(in_stack_000000b8,uStack00000000000000b0,1);
            }
            goto LAB_004fb0c0;
          }
          puVar9 = &UNK_009e86a0;
        }
        else {
          lVar11 = func_0x00513134(uStack00000000000000a0,in_stack_000000a8);
          if (uStack0000000000000020 - lVar11 >> 0x10 == 0) {
            *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
            *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
            *(undefined8 *)(unaff_x29 + -0x98) = 0;
            *(short *)(unaff_x29 + -0x90) = (short)(uStack0000000000000020 - lVar11);
            *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8658;
            *(undefined8 *)(unaff_x29 + -0x80) = 1;
            *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
            *(undefined8 *)(unaff_x29 + -0x60) = 1;
            *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
            *(undefined8 *)(unaff_x29 + -0x70) = 2;
            func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
            uVar4 = *puVar13;
            uVar2 = puVar13[1];
            if (uStack00000000000000b0 - in_stack_000000c0 < uVar2) {
              func_0x007a5594(&uStack00000000000000b0,in_stack_000000c0,uVar2,1,1);
            }
            uVar18 = in_stack_000000c0;
            _memcpy(in_stack_000000b8 + in_stack_000000c0,uVar4,uVar2);
            in_stack_000000c0 = uVar18 + uVar2;
            goto LAB_004fb1fc;
          }
          puVar9 = &UNK_009e8668;
        }
        *(undefined8 *)(unaff_x29 + -0x88) = &UNK_009e8630;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        *(undefined8 *)(unaff_x29 + -0x78) = 8;
        func_0x007a2420((undefined8 *)(unaff_x29 + -0x88),puVar9);
        goto code_r0x004fb4d8;
      }
LAB_004fb0c0:
      lVar8 = lVar8 + 0x48;
      puVar13 = puVar13 + 9;
    }
    if (uStack0000000000000088 != 0) {
      func_0x00187bd4(in_stack_00000090,uStack0000000000000088,1);
    }
    puVar13 = (undefined8 *)(lVar19 + 0x20);
    do {
      lVar8 = puVar13[-1];
      if (lVar8 == -0x8000000000000000 || lVar8 == 0) {
        lVar8 = puVar13[-4];
      }
      else {
        func_0x00187bd4(*puVar13,lVar8,1);
        lVar8 = puVar13[-4];
      }
      if (lVar8 != 0) {
        func_0x00187bd4(puVar13[-3],lVar8 << 4,8);
      }
      puVar13 = puVar13 + 9;
      lVar10 = lVar10 + -1;
    } while (lVar10 != 0);
  }
  else {
LAB_004faf84:
    uStack0000000000000070 = 0;
    in_stack_00000078 = 8;
LAB_004faf8c:
    lVar19 = in_stack_00000078;
  }
  if (uStack0000000000000070 != 0) {
    func_0x00187bd4(lVar19,uStack0000000000000070 * 0x48,8);
  }
LAB_004fafac:
  if (uStack0000000000000050 != 0) {
    func_0x00187bd4(in_stack_00000058,uStack0000000000000050,1);
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
  }
  return;
}

