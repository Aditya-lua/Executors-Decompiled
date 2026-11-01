
/* WARNING: Possible PIC construction at 0x00457524: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00457528) */
/* WARNING: Removing unreachable block (ram,0x0045752c) */

byte * FUN_004574f4(undefined8 param_1)

{
  byte bVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  byte *pbVar7;
  undefined8 uVar8;
  byte *extraout_x1;
  byte *extraout_x1_00;
  dword *pdVar9;
  undefined *puVar10;
  long lVar11;
  undefined8 *extraout_x8;
  byte *pbVar12;
  dword *pdVar13;
  long lVar14;
  byte *pbVar15;
  byte *extraout_x9;
  undefined8 uVar16;
  byte *pbVar17;
  byte *extraout_x13;
  byte *pbVar18;
  byte *pbVar19;
  uint uVar20;
  undefined8 *unaff_x19;
  dword *pdVar21;
  uint unaff_w21;
  byte *unaff_x23;
  byte *unaff_x24;
  ushort unaff_w25;
  uint unaff_w27;
  uint uVar22;
  char cVar23;
  undefined8 unaff_x29;
  undefined1 auVar24 [16];
  uint uStack0000000000000000;
  uint uStack0000000000000004;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  ushort uStack0000000000000038;
  byte bStack000000000000003a;
  byte bStack000000000000003b;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined1 uStack00000000000000a0;
  byte *pbStack_c0;
  byte *pbStack_b8;
  byte *pbStack_b0;
  undefined4 uStack_a8;
  undefined4 uStack_a4;
  ulong uStack_a0;
  undefined4 uStack_98;
  undefined4 uStack_94;
  byte *pbStack_88;
  long lStack_78;
  byte *pbStack_70;
  long lStack_68;
  byte *pbStack_60;
  long lStack_58;
  dword *pdStack_50;
  byte *pbStack_40;
  byte *pbStack_38;
  
  uStack0000000000000028 = param_1;
LAB_004574f8:
  uVar5 = func_0x0045275c(&uStack0000000000000008);
  uVar20 = (uint)uVar5;
  if (uVar20 == unaff_w21) {
    uVar8 = 0x22;
    register0x00000008 = (BADSPACEBASE *)&uStack00000000000000a0;
    unaff_x29 = in_stack_00000090;
    uVar16 = in_stack_00000098;
code_r0x0046a9ac:
    *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = uVar16;
                    /* WARNING: Could not recover jumptable at 0x0046a9c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pbVar7 = (byte *)(**(code **)(unaff_x19[1] + 0x20))(*unaff_x19,uVar8);
    return pbVar7;
  }
  if (uVar20 != 0x110000) {
    if (uVar20 != 0x27) {
      if ((int)uVar20 < 0xd) {
        if (uVar20 == 0) {
          uStack0000000000000000 = 0x30;
        }
        else if (uVar20 == 9) {
          uVar5 = 0;
          uStack0000000000000000 = 0x74;
        }
        else {
          if (uVar20 != 10) goto LAB_004576a0;
          uVar5 = 0;
          uStack0000000000000000 = 0x6e;
        }
      }
      else if (uVar20 == 0xd) {
        uVar5 = 0;
        uStack0000000000000000 = 0x72;
      }
      else {
        if (uVar20 != 0x22) {
          if (uVar20 == 0x5c) {
            unaff_x23 = (byte *)0x0;
            unaff_w25 = 0;
            uVar5 = 0;
            uStack0000000000000004 = 0;
            uStack0000000000000000 = 0x5c;
            unaff_w27 = 2;
            uStack0000000000000030._0_1_ = '\\';
            goto LAB_0045760c;
          }
LAB_004576a0:
          if ((uVar20 < 0x300) || (iVar4 = func_0x00478eb0(uVar5), iVar4 == 0)) {
            uVar6 = func_0x0046eae0(uVar5);
            if ((uVar6 & 1) == 0) {
              func_0x00452f28(&uStack0000000000000030,uVar5);
              uStack0000000000000000 = (uint)uStack0000000000000030._1_1_;
              unaff_x23 = (byte *)((ulong)uStack0000000000000030._2_6_ & 0xffff);
              uVar5 = CONCAT26(uStack0000000000000038,uStack0000000000000030._2_6_) >> 0x10;
              uStack0000000000000004 = (uint)bStack000000000000003a;
              unaff_w27 = (uint)bStack000000000000003b;
              unaff_w25 = uStack0000000000000038;
            }
            else {
              uStack0000000000000030._0_1_ = -0x80;
              unaff_x23 = unaff_x24;
            }
          }
          else {
            func_0x00452f28(&uStack0000000000000030,uVar5);
            uStack0000000000000000 = (uint)uStack0000000000000030._1_1_;
            uVar5 = CONCAT26(uStack0000000000000038,uStack0000000000000030._2_6_) >> 0x10;
            uStack0000000000000004 = (uint)bStack000000000000003a;
            unaff_w27 = (uint)bStack000000000000003b;
            unaff_x23 = (byte *)((ulong)uStack0000000000000030._2_6_ & 0xffff);
            unaff_w25 = uStack0000000000000038;
          }
          goto LAB_0045760c;
        }
        uVar5 = 0;
        uStack0000000000000000 = 0x22;
      }
      uStack0000000000000030._0_1_ = '\\';
      uStack0000000000000004 = 0;
      unaff_w27 = 2;
      unaff_x23 = (byte *)0x0;
      unaff_w25 = 0;
LAB_0045760c:
      uStack0000000000000030._1_1_ = (byte)uStack0000000000000000;
      uStack0000000000000038 = (ushort)((ulong)unaff_x23 >> 0x30) | unaff_w25;
      uStack0000000000000030._2_6_ = (uint6)unaff_x23 | (uint6)((uVar5 & 0xffffffff) << 0x10);
      uVar20 = uStack0000000000000004;
      uVar22 = unaff_w27;
      cVar23 = (char)uStack0000000000000030;
      do {
        if (cVar23 == -0x80) {
          cVar23 = '\0';
          uVar22 = 0;
          uVar20 = 0;
          uStack0000000000000038 = 0;
          uStack0000000000000030._0_1_ = '\0';
          uStack0000000000000030._1_1_ = 0;
          uStack0000000000000030._2_6_ = 0;
        }
        else {
          if (uVar22 <= uVar20) goto LAB_00457688;
          uVar20 = uVar20 + 1;
        }
        iVar4 = func_0x0046a9ac();
        if (iVar4 != 0) {
          return (byte *)((long)&MACH_HEADER.magic + 1);
        }
      } while( true );
    }
    uVar8 = 0x27;
    uVar16 = 0x457528;
    goto code_r0x0046a9ac;
  }
  auVar24 = func_0x007a2810(&UNK_00890a2a,0x2b,&uStack0000000000000030,&UNK_009defd8,&UNK_009def18);
  pdVar21 = auVar24._8_8_;
  auVar24._0_8_ = auVar24._0_8_;
  pbStack_40 = unaff_x24;
  pbStack_38 = unaff_x23;
  pbVar7 = (byte *)func_0x0046ce54(&pbStack_c0,auVar24._0_8_,pdVar21,&UNK_00890c6e,6);
  if (((ulong)pbStack_c0 & 1) == 0) goto LAB_004578a4;
  pbVar17 = pbStack_60 + -1;
  if (pbStack_88 != (byte *)0xffffffffffffffff) {
    pdVar9 = (dword *)CONCAT44(uStack_94,uStack_98);
    pbVar7 = (byte *)((long)pdVar9 + (long)pbVar17);
    if (pbStack_70 <= pbVar7) goto LAB_00457a8c;
    goto LAB_004577f0;
  }
  pdStack_50 = (dword *)CONCAT44(uStack_94,uStack_98);
  pbVar12 = (byte *)((long)pdStack_50 + (long)pbVar17);
  if (pbStack_70 <= pbVar12) goto LAB_00457a8c;
  pbVar7 = pbStack_60 + -(long)pbStack_b8;
  pbVar19 = (byte *)0x0;
  if (pbStack_b8 <= pbStack_60) {
    pbVar19 = pbVar7;
  }
  goto LAB_0045791c;
LAB_00457688:
  unaff_w21 = 0x110001;
  unaff_x24 = unaff_x23;
  goto LAB_004574f8;
LAB_004578a4:
  do {
    pbVar7 = (byte *)func_0x00453120(&lStack_58,&pbStack_c0);
  } while (lStack_58 == 1);
  if (lStack_58 == 0) {
LAB_004578c4:
    pdVar9 = (dword *)((long)pdStack_50 + 6);
    if (pdVar9 != (dword *)0x0) {
      if (pdVar9 < pdVar21) {
        if ((char)*(byte *)((long)auVar24._0_8_ + (long)pdVar9) < -0x40) goto LAB_004578e0;
      }
      else if (pdVar9 != pdVar21) {
LAB_004578e0:
        puVar10 = &UNK_009df430;
        goto LAB_0045817c;
      }
    }
    pbVar17 = (byte *)((long)auVar24._0_8_ + (long)pdVar9);
    do {
      if (pbVar17 == (byte *)((long)auVar24._0_8_ + (long)pdVar21)) {
LAB_00457a60:
        if (pdStack_50 == (dword *)0x0) {
          pdVar21 = (dword *)0x0;
          goto LAB_00457dc0;
        }
        if (pdStack_50 < pdVar21) {
          if (-0x41 < (char)*(byte *)((long)auVar24._0_8_ + (long)pdStack_50)) {
            pdVar21 = pdStack_50;
            break;
          }
        }
        else if (pdStack_50 == pdVar21) break;
        func_0x007a297c(auVar24._0_8_,pdVar21,0,pdStack_50,&UNK_009df448);
        goto LAB_00458144;
      }
      pbVar12 = pbVar17 + 1;
      uVar20 = (uint)*pbVar17;
      if ((char)*pbVar17 < '\0') {
        if (uVar20 < 0xe0) {
          pbVar12 = pbVar17 + 2;
          uVar20 = pbVar17[1] & 0x3f | (uVar20 & 0x1f) << 6;
        }
        else {
          uVar22 = pbVar17[2] & 0x3f | (pbVar17[1] & 0x3f) << 6;
          if (uVar20 < 0xf0) {
            pbVar12 = pbVar17 + 3;
            uVar20 = uVar22 | (uVar20 & 0x1f) << 0xc;
          }
          else {
            uVar20 = pbVar17[3] & 0x3f | uVar22 << 6 | (uVar20 & 7) << 0x12;
            if (uVar20 == 0x110000) goto LAB_00457a60;
            pbVar12 = pbVar17 + 4;
          }
        }
      }
      pbVar17 = pbVar12;
    } while (0xfffffff8 < uVar20 - 0x47 || 0xfffffff5 < uVar20 - 0x3a);
  }
  goto LAB_00457a8c;
  while( true ) {
    pbVar7 = pbVar7 + -1;
    if (pbStack_60 <= pbVar7) goto LAB_004580dc;
    pbVar12 = pbVar7 + (long)pdVar9;
    if (pbStack_70 <= pbVar12) goto LAB_004580ec;
    if (pbVar7[lStack_68] != pbVar12[lStack_78]) break;
LAB_00457858:
    pdStack_50 = pdVar9;
    if (pbVar7 <= pbStack_88) goto LAB_004578c4;
  }
  pdVar9 = (dword *)((long)pdVar9 + CONCAT44(uStack_a4,uStack_a8));
  pbStack_88 = pbStack_60 + -CONCAT44(uStack_a4,uStack_a8);
  while (pbVar7 = (byte *)((long)pdVar9 + (long)pbVar17), pbVar7 < pbStack_70) {
LAB_004577f0:
    if ((uStack_a0 >> ((ulong)pbVar7[lStack_78] & 0x3f) & 1) == 0) {
      pbStack_88 = (byte *)0x0;
      pdVar9 = (dword *)((long)pdVar9 + (long)pbStack_60);
    }
    else {
      pbVar7 = pbStack_88;
      if (pbStack_88 <= pbStack_b8) {
        pbVar7 = pbStack_b8;
      }
      auVar24._8_8_ = pbStack_70;
      auVar24._0_8_ = pbVar7;
      pbVar12 = (byte *)((long)pdVar9 + (long)pbVar7);
      pdVar13 = (dword *)(pbVar12 + -(long)pbStack_b8);
      lVar11 = 0;
      if (pbVar7 <= pbStack_60) {
        lVar11 = (long)pbStack_60 - (long)pbVar7;
      }
      pbVar7 = pbVar7 + lStack_68;
      do {
        if (lVar11 == 0) {
          pbVar7 = pbStack_b8;
          goto LAB_00457858;
        }
        if (pbStack_70 <= pbVar12) goto LAB_004580d4;
        bVar1 = *pbVar7;
        pbVar19 = pbVar12 + lStack_78;
        pdVar13 = (dword *)((long)pdVar13 + 1);
        pbVar12 = pbVar12 + 1;
        lVar11 = lVar11 + -1;
        pbVar7 = pbVar7 + 1;
      } while (bVar1 == *pbVar19);
      pdVar9 = pdVar13;
      pbStack_88 = (byte *)0x0;
    }
  }
  goto LAB_00457a8c;
LAB_004580dc:
  func_0x007a2570(pbVar7,pbStack_60,&UNK_009def30);
  pbStack_70 = extraout_x1;
  pdStack_50 = pdVar9;
  pbVar12 = extraout_x9;
LAB_004580ec:
  func_0x007a2570(pbVar12,pbStack_70,&UNK_009def48);
  pbStack_70 = extraout_x1_00;
  pbVar18 = extraout_x13;
LAB_004580fc:
  pbVar18 = (byte *)((long)pdStack_50 + (long)pbVar18);
LAB_00458100:
  pbVar7 = pbStack_70;
  if (pbStack_70 <= pbVar18) {
    pbVar7 = pbVar18;
  }
  func_0x007a2570(pbVar7,pbStack_70,&UNK_009def60);
  goto LAB_00458114;
  while( true ) {
    uVar5 = 0;
    while (uVar22 = uVar20 - 0x30, uVar22 < 10) {
      auVar3._8_8_ = 0;
      auVar3._0_8_ = uVar5;
      if (((SUB168(auVar3 * ZEXT816(10),8) != 0) || (CARRY8(uVar5 * 10,(ulong)uVar22))) ||
         (pbVar15 == pbVar19)) goto LAB_00457c04;
      pbVar18 = pbVar15 + 1;
      uVar20 = (uint)*pbVar15;
      if ((char)*pbVar15 < '\0') {
        if (uVar20 < 0xe0) {
          pbVar18 = pbVar15 + 2;
          uVar20 = pbVar15[1] & 0x3f | (uVar20 & 0x1f) << 6;
        }
        else {
          uVar2 = pbVar15[2] & 0x3f | (pbVar15[1] & 0x3f) << 6;
          if (uVar20 < 0xf0) {
            pbVar18 = pbVar15 + 3;
            uVar20 = uVar2 | (uVar20 & 0x1f) << 0xc;
          }
          else {
            pbVar18 = pbVar15 + 4;
            uVar20 = pbVar15[3] & 0x3f | uVar2 << 6 | (uVar20 & 7) << 0x12;
          }
        }
      }
      uVar5 = uVar5 * 10 + (ulong)uVar22;
      pbVar15 = pbVar18;
      if (uVar20 == 0x110000) goto LAB_00457c04;
    }
    for (; uVar5 != 0; uVar5 = uVar5 - 1) {
      if (pbVar15 == pbVar19) goto LAB_00457c04;
      pbVar18 = pbVar15 + 1;
      uVar20 = (uint)*pbVar15;
      if ((char)*pbVar15 < '\0') {
        if (uVar20 < 0xe0) {
          pbVar18 = pbVar15 + 2;
          uVar20 = pbVar15[1] & 0x3f | (uVar20 & 0x1f) << 6;
        }
        else {
          uVar22 = pbVar15[2] & 0x3f | (pbVar15[1] & 0x3f) << 6;
          if (uVar20 < 0xf0) {
            pbVar18 = pbVar15 + 3;
            uVar20 = uVar22 | (uVar20 & 0x1f) << 0xc;
          }
          else {
            uVar20 = pbVar15[3] & 0x3f | uVar22 << 6 | (uVar20 & 7) << 0x12;
            if (uVar20 == 0x110000) goto LAB_00457c04;
            pbVar18 = pbVar15 + 4;
          }
        }
      }
      pbVar15 = pbVar18;
    }
    unaff_x23 = unaff_x23 + 1;
    if (uVar20 == 0x45) break;
LAB_00457e14:
    if (9 < uVar20 - 0x30) goto LAB_00457c04;
  }
LAB_00457e00:
  lVar11 = (long)pbVar19 - (long)pbVar15;
joined_r0x00457e04:
  if (lVar11 == 0) {
LAB_004580a8:
    uVar16 = 1;
    goto LAB_00457dd4;
  }
  if (*pbVar15 == 0x2e) {
    uVar20 = 0x2e;
    uVar16 = 1;
    pbVar19 = pbVar15;
    do {
      pbVar19 = pbVar19 + 1;
      while( true ) {
        pbVar7 = (byte *)(ulong)(uVar20 - 0x30);
        if ((((0x19 < (uVar20 & 0x1fffdf) - 0x41 && 9 < uVar20 - 0x30) && 0xe < uVar20 - 0x21) &&
            ((0x26 < uVar20 - 0x3a || ((1L << ((ulong)(uVar20 - 0x3a) & 0x3f) & 0x7e0000007fU) == 0)
             ))) && (3 < uVar20 - 0x7b)) goto LAB_004580a4;
        if (pbVar19 == pbVar15 + lVar11) goto LAB_00457dd4;
        uVar20 = (uint)*pbVar19;
        if (-1 < (char)*pbVar19) break;
        pbVar7 = pbVar19 + 1;
        if (uVar20 < 0xe0) {
          pbVar19 = pbVar19 + 2;
          uVar20 = *pbVar7 & 0x3f | (uVar20 & 0x1f) << 6;
        }
        else {
          uVar22 = pbVar19[2] & 0x3f | (*pbVar7 & 0x3f) << 6;
          pbVar7 = (byte *)(ulong)uVar22;
          if (uVar20 < 0xf0) {
            pbVar19 = pbVar19 + 3;
            uVar20 = uVar22 | (uVar20 & 0x1f) << 0xc;
          }
          else {
            uVar20 = pbVar19[3] & 0x3f | uVar22 << 6 | (uVar20 & 7) << 0x12;
            if (uVar20 == 0x110000) goto LAB_004580a8;
            pbVar19 = pbVar19 + 4;
          }
        }
      }
    } while( true );
  }
  goto LAB_004580a4;
  while( true ) {
    pdVar9 = pdStack_50;
    if (pbStack_60 <= pbStack_b8 + -1) goto LAB_004580dc;
    pbVar12 = (byte *)((long)pdStack_50 + (long)pbVar7);
    if (pbStack_70 <= pbVar12) goto LAB_004580ec;
    pbVar12 = pbVar7 + lStack_68;
    pbVar15 = (byte *)((long)pdStack_50 + lStack_78) + (long)pbVar7;
    pbVar7 = pbVar7 + -1;
    if (*pbVar12 != *pbVar15) break;
LAB_00457978:
    if (pbVar7 == (byte *)0xffffffffffffffff) goto LAB_004578c4;
  }
  pdStack_50 = (dword *)((long)pdStack_50 + CONCAT44(uStack_a4,uStack_a8));
  while( true ) {
    pbVar12 = (byte *)((long)pdStack_50 + (long)pbVar17);
    if (pbStack_70 <= pbVar12) break;
LAB_0045791c:
    if ((uStack_a0 >> ((ulong)pbVar12[lStack_78] & 0x3f) & 1) == 0) {
      pdStack_50 = (dword *)((long)pdStack_50 + (long)pbStack_60);
    }
    else {
      lVar11 = -(long)pdStack_50;
      pbVar7 = pbStack_b8 + (long)pdStack_50;
      pbVar12 = pbVar19;
      pbVar15 = pbStack_b8 + lStack_68;
      do {
        if (pbVar12 == (byte *)0x0) {
          pbVar7 = pbStack_b8 + -1;
          goto LAB_00457978;
        }
        pbVar18 = pbStack_b8;
        if (pbStack_70 <= pbVar7) goto LAB_004580fc;
        bVar1 = *pbVar15;
        pbVar18 = pbVar7 + lStack_78;
        lVar11 = lVar11 + -1;
        pbVar7 = pbVar7 + 1;
        pbVar12 = pbVar12 + -1;
        pbVar15 = pbVar15 + 1;
      } while (bVar1 == *pbVar18);
      pdStack_50 = (dword *)-lVar11;
    }
  }
LAB_00457a8c:
  if (pdVar21 < (byte *)((long)&MACH_HEADER.magic + 3)) {
    if (pdVar21 == (dword *)((long)&MACH_HEADER.magic + 2)) {
      if ((short)*auVar24._0_8_ == 0x4e5a) {
        pdVar21 = (dword *)((long)&MACH_HEADER.magic + 2);
        goto LAB_00457b4c;
      }
LAB_00457c44:
      pdVar21 = (dword *)((long)&MACH_HEADER.magic + 2);
      if ((char)*auVar24._0_8_ == 'R') goto LAB_00457c54;
    }
  }
  else {
    if ((short)*auVar24._0_8_ == 0x5a5f && *(char *)((long)auVar24._0_8_ + 2) == 'N') {
      if ((pdVar21 != (dword *)((long)&MACH_HEADER.magic + 3)) &&
         (*(char *)((long)auVar24._0_8_ + 3) < -0x40)) {
        puVar10 = &UNK_009df0a8;
        goto LAB_00458170;
      }
      lVar11 = -3;
      lVar14 = 3;
LAB_00457b50:
      pbVar17 = (byte *)((long)pdVar21 + lVar11);
      pbVar12 = (byte *)((long)auVar24._0_8_ + lVar14);
      pbVar19 = pbVar12 + (long)pbVar17;
      pbVar15 = pbVar17;
      pbVar18 = pbVar12;
      do {
        if (pbVar15 == (byte *)0x0) {
          if (pbVar17 != (byte *)0x0) {
            pbVar15 = pbVar12 + 1;
            uVar20 = (uint)*pbVar12;
            if ((char)*pbVar12 < '\0') {
              if (uVar20 < 0xe0) {
                pbVar15 = pbVar12 + 2;
                uVar20 = pbVar12[1] & 0x3f | (uVar20 & 0x1f) << 6;
              }
              else {
                uVar22 = pbVar12[2] & 0x3f | (pbVar12[1] & 0x3f) << 6;
                if (uVar20 < 0xf0) {
                  pbVar15 = pbVar12 + 3;
                  uVar20 = uVar22 | (uVar20 & 0x1f) << 0xc;
                }
                else {
                  pbVar15 = pbVar12 + 4;
                  uVar20 = pbVar12[3] & 0x3f | uVar22 << 6 | (uVar20 & 7) << 0x12;
                }
              }
            }
            if (uVar20 == 0x45) {
              unaff_x23 = (byte *)0x0;
              goto LAB_00457e00;
            }
            if (uVar20 != 0x110000) {
              unaff_x23 = (byte *)0x0;
              goto LAB_00457e14;
            }
          }
          break;
        }
        bVar1 = *pbVar18;
        pbVar15 = pbVar15 + -1;
        pbVar18 = pbVar18 + 1;
      } while (-1 < (char)bVar1);
LAB_00457c04:
      if (pdVar21 < (byte *)((long)&MACH_HEADER.magic + 3)) {
        if (pdVar21 == (dword *)((long)&MACH_HEADER.magic + 2)) goto LAB_00457c44;
        goto LAB_00457dc0;
      }
    }
    else {
      if ((short)*auVar24._0_8_ == 0x4e5a) {
        if (*(char *)((long)auVar24._0_8_ + 2) < -0x40) {
          puVar10 = &UNK_009df090;
          goto LAB_00458158;
        }
LAB_00457b4c:
        lVar11 = -2;
        lVar14 = 2;
        goto LAB_00457b50;
      }
      if ((pdVar21 != (dword *)((long)&MACH_HEADER.magic + 3)) && (*auVar24._0_8_ == 0x4e5a5f5f)) {
        if (pdVar21 < (byte *)((long)&MACH_HEADER.cputype + 1)) {
          pdVar21 = &MACH_HEADER.cputype;
        }
        else if ((char)auVar24._0_8_[1] < -0x40) {
          puVar10 = &UNK_009df078;
          pdVar9 = &MACH_HEADER.cputype;
          goto LAB_0045817c;
        }
        lVar11 = -4;
        lVar14 = 4;
        goto LAB_00457b50;
      }
    }
    if ((short)*auVar24._0_8_ == 0x525f) {
      pbVar17 = (byte *)((long)auVar24._0_8_ + 2);
      if ((char)*pbVar17 < -0x40) {
LAB_00458144:
        puVar10 = &UNK_009df288;
LAB_00458158:
        pdVar9 = (dword *)((long)&MACH_HEADER.magic + 2);
        goto LAB_0045817c;
      }
      uVar20 = (uint)*pbVar17;
      lVar11 = -2;
    }
    else {
      if ((char)*auVar24._0_8_ != 'R') {
        if (pdVar21 != (dword *)((long)&MACH_HEADER.magic + 3)) goto LAB_00457da4;
        pbVar17 = (byte *)0x0;
        pbVar12 = (byte *)0x0;
LAB_004580a4:
        uVar16 = 0;
        lVar11 = 0;
        pbVar15 = (byte *)((long)&MACH_HEADER.magic + 1);
        goto LAB_00457dd4;
      }
LAB_00457c54:
      pbVar17 = (byte *)((long)auVar24._0_8_ + 1);
      if ((char)*pbVar17 < -0x40) {
LAB_00458114:
        puVar10 = &UNK_009df270;
        pdVar9 = (dword *)((long)&MACH_HEADER.magic + 1);
        goto LAB_0045817c;
      }
      uVar20 = (uint)*pbVar17;
      lVar11 = -1;
    }
    while (uVar20 - 0x41 < 0x1a) {
      pbVar12 = (byte *)0x0;
      unaff_x23 = (byte *)((long)pdVar21 + lVar11);
      while (unaff_x23 != pbVar12) {
        pbVar19 = pbVar17 + (long)pbVar12;
        pbVar12 = pbVar12 + 1;
        if ((char)*pbVar19 < '\0') {
          pbVar17 = (byte *)0x0;
          pbVar12 = (byte *)0x0;
          goto LAB_004580a4;
        }
      }
      pbStack_b0 = (byte *)0x0;
      uStack_a8 = 0;
      uStack_a0 = 0;
      uStack_98 = 0;
      pbStack_c0 = pbVar17;
      pbStack_b8 = unaff_x23;
      iVar4 = func_0x00455c78(&pbStack_c0,0);
      if (iVar4 != 0) {
LAB_004580b0:
        pdVar9 = (dword *)&UNK_009def98;
        auVar24 = func_0x007a2810(&UNK_00890b0c,0x3d,&lStack_58,&UNK_009def98,&UNK_009df2a0);
LAB_004580d4:
        pbStack_70 = auVar24._8_8_;
        pbVar18 = (byte *)(auVar24._0_8_ + (long)pdVar9);
        goto LAB_00458100;
      }
      pbVar7 = pbStack_c0;
      if (pbStack_c0 == (byte *)0x0) break;
      if ((pbStack_b0 < pbStack_b8) && (pbStack_c0[(long)pbStack_b0] - 0x41 < 0x1a)) {
        uStack_a0 = 0;
        uStack_98 = 0;
        iVar4 = func_0x00455c78(&pbStack_c0,0);
        if (iVar4 != 0) goto LAB_004580b0;
        pbVar7 = pbStack_c0;
        if (pbStack_c0 == (byte *)0x0) break;
      }
      if (pbStack_b0 == (byte *)0x0) {
LAB_00457f98:
        pbVar12 = (byte *)0x0;
        pbVar15 = pbStack_c0 + (long)pbStack_b0;
        lVar11 = (long)pbStack_b8 - (long)pbStack_b0;
        pbVar7 = pbStack_c0;
        goto joined_r0x00457e04;
      }
      if (pbStack_b0 < pbStack_b8) {
        if (-0x41 < (char)pbStack_c0[(long)pbStack_b0]) goto LAB_00457f98;
      }
      else if (pbStack_b8 == pbStack_b0) goto LAB_00457f98;
      pbVar7 = (byte *)func_0x007a297c();
LAB_00457da4:
      if ((short)*auVar24._0_8_ != 0x5f5f || *(char *)((long)auVar24._0_8_ + 2) != 'R') break;
      pbVar17 = (byte *)((long)auVar24._0_8_ + 3);
      if ((char)*pbVar17 < -0x40) {
        do {
          puVar10 = &UNK_009df258;
LAB_00458170:
          pdVar9 = (dword *)((long)&MACH_HEADER.magic + 3);
LAB_0045817c:
          func_0x007a297c(auVar24._0_8_,pdVar21,pdVar9,pdVar21,puVar10);
        } while( true );
      }
      lVar11 = -3;
      uVar20 = (uint)*pbVar17;
    }
  }
LAB_00457dc0:
  pbVar17 = (byte *)0x0;
  pbVar12 = (byte *)0x0;
  uVar16 = 0;
  lVar11 = 0;
  pbVar15 = (byte *)((long)&MACH_HEADER.magic + 1);
LAB_00457dd4:
  *extraout_x8 = uVar16;
  extraout_x8[1] = pbVar12;
  extraout_x8[2] = pbVar17;
  extraout_x8[3] = unaff_x23;
  extraout_x8[4] = auVar24._0_8_;
  extraout_x8[5] = pdVar21;
  extraout_x8[6] = pbVar15;
  extraout_x8[7] = lVar11;
  return pbVar7;
}

