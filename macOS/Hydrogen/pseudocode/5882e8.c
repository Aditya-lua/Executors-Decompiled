
/* WARNING: Possible PIC construction at 0x0058863c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00588514: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005883ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005883e4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005886ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0058871c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005887e4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005885b4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005885ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005885b8) */
/* WARNING: Removing unreachable block (ram,0x005885e0) */
/* WARNING: Removing unreachable block (ram,0x005887e8) */
/* WARNING: Removing unreachable block (ram,0x00588720) */
/* WARNING: Removing unreachable block (ram,0x005886b0) */
/* WARNING: Removing unreachable block (ram,0x005883e8) */
/* WARNING: Removing unreachable block (ram,0x005883b0) */
/* WARNING: Removing unreachable block (ram,0x00588870) */
/* WARNING: Removing unreachable block (ram,0x005883d8) */
/* WARNING: Removing unreachable block (ram,0x00588518) */
/* WARNING: Removing unreachable block (ram,0x00588640) */
/* WARNING: Removing unreachable block (ram,0x005885f0) */
/* WARNING: Type propagation algorithm not settling */

ulong * FUN_005882e8(void)

{
  byte *pbVar1;
  uint uVar2;
  long lVar3;
  uint uVar4;
  uint uVar5;
  undefined1 auVar6 [16];
  undefined1 *puVar7;
  long lVar8;
  ulong *puVar9;
  ulong *puVar10;
  undefined8 uVar11;
  byte *pbVar12;
  long lVar13;
  ulong uVar14;
  long *plVar15;
  ulong extraout_x10;
  ulong extraout_x10_00;
  ulong extraout_x10_01;
  ulong extraout_x10_02;
  ulong extraout_x10_03;
  ulong extraout_x10_04;
  ulong extraout_x10_05;
  ulong extraout_x10_06;
  byte *pbVar16;
  byte *pbVar17;
  byte *pbVar18;
  undefined8 unaff_x19;
  byte *pbVar19;
  undefined8 unaff_x20;
  ulong *puVar20;
  ulong *unaff_x21;
  ulong uVar21;
  byte *pbVar22;
  undefined *unaff_x22;
  code *pcVar23;
  byte *pbVar24;
  undefined8 unaff_x23;
  undefined8 uVar25;
  uint uVar26;
  code *pcVar27;
  undefined8 unaff_x24;
  byte *unaff_x25;
  uint uVar28;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined *puVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  byte bVar36;
  undefined1 auVar37 [16];
  
  auVar6._8_8_ = unaff_x20;
  auVar6._0_8_ = unaff_x19;
  __Unwind_Resume();
  puVar29 = (undefined *)0x5882f4;
  auVar37 = func_0x007a2668();
  puVar7 = (undefined1 *)register0x00000008;
  uVar21 = extraout_x10;
SUB_005882f4:
  do {
    while( true ) {
      puVar20 = auVar37._8_8_;
      puVar9 = auVar37._0_8_;
      *(undefined8 *)(puVar7 + -0x40) = unaff_x24;
      *(undefined8 *)(puVar7 + -0x38) = unaff_x23;
      *(undefined **)(puVar7 + -0x30) = unaff_x22;
      *(ulong **)(puVar7 + -0x28) = unaff_x21;
      *(long *)(puVar7 + -0x20) = auVar6._8_8_;
      *(long *)(puVar7 + -0x18) = auVar6._0_8_;
      *(undefined1 **)(puVar7 + -0x10) = unaff_x29;
      *(undefined **)(puVar7 + -8) = puVar29;
      unaff_x29 = puVar7 + -0x10;
      uVar14 = *puVar20;
      auVar6 = auVar37;
      if ((long)uVar14 < 6) break;
      if ((long)uVar14 < 9) {
        if (uVar14 == 6) {
          puVar10 = puVar20 + 1;
          uVar14 = *puVar10;
          uVar21 = uVar14 ^ 0x8000000000000000;
          if (4 < uVar21) {
            uVar21 = 3;
          }
          if ((long)uVar21 < 2) {
            if (uVar21 != 0) goto code_r0x00588778;
            uVar14 = 0x8000000000000000;
          }
          else {
            if ((uVar21 == 2) || (uVar21 != 3)) {
code_r0x00588778:
              uVar30 = puVar20[3];
              uVar21 = puVar20[2];
            }
            else {
              puVar10 = (ulong *)func_0x005575a4(puVar7 + -0x80,puVar10,&UNK_009f09f8);
              uVar14 = *(ulong *)(puVar7 + -0x80);
              uVar30 = *(ulong *)(puVar7 + -0x70);
              uVar21 = *(ulong *)(puVar7 + -0x78);
            }
            *(ulong *)(puVar7 + -0x98) = uVar30;
            *(ulong *)(puVar7 + -0xa0) = uVar21;
          }
          uVar21 = *(ulong *)(puVar7 + -0xa0);
          puVar9[3] = *(ulong *)(puVar7 + -0x98);
          puVar9[2] = uVar21;
          uVar21 = 6;
code_r0x00588834:
          *puVar9 = uVar21;
          puVar9[1] = uVar14;
          return puVar10;
        }
        if (uVar14 == 7) {
          unaff_x22 = &___rust_no_alloc_shim_is_unstable;
          unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
          if (unaff_x21 == (ulong *)0x0) goto LAB_00588850;
          auVar37._8_8_ = puVar20[1];
          auVar37._0_8_ = puVar7 + -0x80;
          puVar29 = &UNK_005883b0;
          puVar7 = puVar7 + -0xc0;
          uVar21 = extraout_x10_00;
        }
        else {
          unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
          if (unaff_x21 == (ulong *)0x0) goto LAB_00588850;
          auVar37._8_8_ = puVar20[1];
          auVar37._0_8_ = puVar7 + -0x80;
          puVar29 = &UNK_005886b0;
          puVar7 = puVar7 + -0xc0;
          uVar21 = extraout_x10_04;
        }
      }
      else if (uVar14 == 9) {
        unaff_x22 = &___rust_no_alloc_shim_is_unstable;
        unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
        if (unaff_x21 == (ulong *)0x0) goto LAB_00588850;
        auVar37._8_8_ = puVar20[1];
        auVar37._0_8_ = puVar7 + -0x80;
        puVar29 = &UNK_005885b8;
        puVar7 = puVar7 + -0xc0;
        uVar21 = extraout_x10_02;
      }
      else {
        if (uVar14 == 10) {
          plVar15 = (long *)puVar20[4];
          lVar8 = *plVar15;
          *plVar15 = lVar8 + 1;
          if (-1 < lVar8) {
            *(long **)(puVar7 + -0xa0) = plVar15;
            puVar20 = (ulong *)func_0x0055763c(puVar7 + -0x80,puVar20 + 1,&UNK_009f0c10);
            uVar21 = *(ulong *)(puVar7 + -0x80);
            puVar9[2] = *(ulong *)(puVar7 + -0x78);
            puVar9[1] = uVar21;
            puVar9[3] = *(ulong *)(puVar7 + -0x70);
            puVar9[4] = (ulong)plVar15;
            *puVar9 = 10;
            return puVar20;
          }
          goto code_r0x0058885c;
        }
        unaff_x21 = puVar20 + 1;
        uVar14 = *unaff_x21 ^ 0x8000000000000000;
        if (1 < uVar14) {
          uVar14 = 2;
        }
        if (uVar14 == 0) {
          uVar14 = 0x8000000000000000;
          uVar30 = *(ulong *)(puVar7 + -0xc0);
          puVar9[3] = *(ulong *)(puVar7 + -0xb8);
          puVar9[2] = uVar30;
          puVar9[4] = 2;
          puVar9[5] = (ulong)unaff_x21;
          puVar9[6] = uVar21;
          puVar9[7] = (ulong)unaff_x22;
          uVar21 = 0xb;
          puVar10 = puVar9;
          goto code_r0x00588834;
        }
        if (uVar14 == 2) {
          unaff_x22 = (undefined *)func_0x00187bd0(0x40,8);
          if (unaff_x22 == (undefined *)0x0) goto LAB_00588850;
          auVar37._8_8_ = puVar20[7];
          auVar37._0_8_ = puVar7 + -0x80;
          puVar29 = &UNK_00588720;
          puVar7 = puVar7 + -0xc0;
          uVar21 = extraout_x10_05;
        }
        else {
          unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
          if (unaff_x21 == (ulong *)0x0) goto LAB_00588850;
          auVar37._8_8_ = puVar20[5];
          auVar37._0_8_ = puVar7 + -0x80;
          puVar29 = &UNK_005887e8;
          puVar7 = puVar7 + -0xc0;
          uVar21 = extraout_x10_06;
        }
      }
    }
    if (2 < (long)uVar14) {
      if (uVar14 != 3) {
        puVar10 = puVar9;
        if (uVar14 != 4) {
          puVar10 = (ulong *)func_0x00557748(puVar9 + 1,puVar20 + 1,&UNK_009f0ac8);
          uVar14 = 5;
        }
        *puVar9 = uVar14;
        return puVar10;
      }
      unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
      if (unaff_x21 == (ulong *)0x0) {
LAB_00588850:
        func_0x007a1f18(8,0x40);
code_r0x0058885c:
        func_0x007a05dc();
        func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
        pcVar27 = (code *)SoftwareBreakpoint(1,0x588880);
        (*pcVar27)();
      }
      auVar37._8_8_ = puVar20[7];
      auVar37._0_8_ = puVar7 + -0x80;
      puVar29 = &UNK_00588518;
      puVar7 = puVar7 + -0xc0;
      uVar21 = extraout_x10_01;
      goto SUB_005882f4;
    }
    if (uVar14 == 0) {
      plVar15 = (long *)puVar20[1];
      lVar8 = *plVar15;
      *plVar15 = lVar8 + 1;
      if (-1 < lVar8) {
        *puVar9 = 0;
        puVar9[1] = (ulong)plVar15;
        return puVar9;
      }
      goto code_r0x0058885c;
    }
    if (uVar14 == 1) {
      uVar21 = puVar20[3];
      if ((long)uVar21 < 0) {
        uVar25 = 0;
      }
      else {
        puVar20 = (ulong *)puVar20[2];
        if (uVar21 == 0) {
          uVar14 = 1;
LAB_00588794:
          puVar20 = (ulong *)_memcpy(uVar14,puVar20,uVar21);
          puVar9[2] = uVar14;
          puVar9[3] = uVar21;
          *puVar9 = 1;
          puVar9[1] = uVar21;
          return puVar20;
        }
        uVar25 = 1;
        uVar14 = func_0x00187bd0(uVar21,1);
        if (uVar14 != 0) goto LAB_00588794;
      }
      uVar11 = func_0x007a1f00(uVar25,uVar21,&UNK_009edff0);
      if (*(long *)(puVar7 + -0xa0) != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar7 + -0x98),*(long *)(puVar7 + -0xa0),1);
      }
      func_0x00587ee8(puVar7 + -0xa8);
      __Unwind_Resume(uVar11);
      auVar37 = func_0x007a2668();
      pbVar18 = *(byte **)(auVar37._0_8_ + 8);
      pbVar16 = *(byte **)(auVar37._0_8_ + 0x10);
      *(undefined8 *)(puVar7 + -0x120) = unaff_x28;
      *(undefined8 *)(puVar7 + -0x118) = unaff_x27;
      *(undefined8 *)(puVar7 + -0x110) = unaff_x26;
      *(byte **)(puVar7 + -0x108) = unaff_x25;
      *(undefined8 *)(puVar7 + -0x100) = unaff_x24;
      *(undefined8 *)(puVar7 + -0xf8) = uVar25;
      *(undefined **)(puVar7 + -0xf0) = unaff_x22;
      *(ulong *)(puVar7 + -0xe8) = uVar21;
      *(ulong **)(puVar7 + -0xe0) = puVar20;
      *(undefined8 *)(puVar7 + -0xd8) = uVar11;
      *(undefined1 **)(puVar7 + -0xd0) = unaff_x29;
      *(undefined **)(puVar7 + -200) = &DAT_005889f8;
      uVar25 = *auVar37._8_8_;
      lVar8 = auVar37._8_8_[1];
      pcVar27 = *(code **)(lVar8 + 0x20);
      uVar21 = (*pcVar27)(uVar25,0x22);
      if ((uVar21 & 1) != 0) goto code_r0x0046ad50;
      if (pbVar16 != (byte *)0x0) {
        pbVar22 = (byte *)0x0;
        *(long *)(puVar7 + -0x148) = -(long)pbVar16;
        *(code **)(puVar7 + -0x140) = pcVar27;
        *(byte **)(puVar7 + -0x138) = pbVar18;
        pbVar19 = pbVar16;
        pbVar12 = (byte *)0x0;
        break;
      }
      pbVar24 = (byte *)0x0;
      pbVar22 = (byte *)0x0;
      goto code_r0x0046ad38;
    }
    unaff_x21 = (ulong *)func_0x00187bd0(0x40,8);
    if (unaff_x21 == (ulong *)0x0) goto LAB_00588850;
    auVar37._8_8_ = puVar20[4];
    auVar37._0_8_ = puVar7 + -0x80;
    puVar29 = &UNK_00588640;
    puVar7 = puVar7 + -0xc0;
    uVar21 = extraout_x10_03;
  } while( true );
  do {
    pbVar17 = (byte *)0x0;
    pbVar1 = pbVar18 + (long)pbVar19;
    while( true ) {
      bVar36 = pbVar18[(long)pbVar17];
      if (((bVar36 - 0x7f < 0xffffffa1) || (bVar36 == 0x22)) || (bVar36 == 0x5c)) break;
      pbVar17 = pbVar17 + 1;
      if (pbVar19 == pbVar17) {
        pbVar24 = pbVar19 + (long)pbVar12;
        goto code_r0x0046accc;
      }
    }
    pbVar24 = pbVar12 + (long)pbVar17;
    pbVar19 = pbVar18 + (long)pbVar17;
    uVar26 = (uint)*pbVar19;
    pcVar27 = (code *)(ulong)uVar26;
    if ((char)*pbVar19 < '\0') {
      unaff_x25 = pbVar19 + 2;
      uVar5 = pbVar19[1] & 0x3f;
      if (uVar26 < 0xe0) {
        pcVar27 = (code *)(ulong)(uVar5 | (uVar26 & 0x1f) << 6);
        goto code_r0x0046ab60;
      }
      pbVar19 = pbVar18 + (long)pbVar17;
      uVar5 = *unaff_x25 & 0x3f | uVar5 << 6;
      if (uVar26 < 0xf0) {
        pcVar27 = (code *)(ulong)(uVar5 | (uVar26 & 0x1f) << 0xc);
        unaff_x25 = pbVar19 + 3;
        goto code_r0x0046ab60;
      }
      pbVar18 = pbVar19 + 4;
      uVar26 = pbVar19[3] & 0x3f | uVar5 << 6 | (uVar26 & 7) << 0x12;
      pcVar27 = (code *)(ulong)uVar26;
      unaff_x25 = pbVar18;
      if (uVar26 != 0x110000) goto code_r0x0046ab60;
    }
    else {
      unaff_x25 = pbVar19 + 1;
code_r0x0046ab60:
      func_0x004623d8(puVar7 + -300,pcVar27,&UNK_00010001);
      uVar26 = (uint)pcVar27;
      if ((puVar7[-300] != -0x80) && ((char)(puVar7[-0x121] - puVar7[-0x122]) != '\x01')) {
        if (pbVar24 < pbVar22) goto code_r0x0046ad84;
        if (pbVar22 != (byte *)0x0) {
          if (pbVar22 < pbVar16) {
            if (-0x41 < (char)pbVar22[*(long *)(puVar7 + -0x138)]) goto code_r0x0046abc0;
          }
          else if (pbVar22 == pbVar16) goto code_r0x0046abc0;
          goto code_r0x0046ad84;
        }
code_r0x0046abc0:
        if (pbVar24 != (byte *)0x0) {
          if (pbVar24 < pbVar16) {
            if ((char)(pbVar12 + *(long *)(puVar7 + -0x138))[(long)pbVar17] < -0x40)
            goto code_r0x0046ad84;
          }
          else if (pbVar24 + *(long *)(puVar7 + -0x148) != (byte *)0x0) {
code_r0x0046ad84:
            func_0x007a297c(*(undefined8 *)(puVar7 + -0x138),pbVar16,pbVar22,pbVar12 + (long)pbVar17
                            ,&UNK_009e06f8);
            goto code_r0x0046ada0;
          }
        }
        pcVar23 = *(code **)(lVar8 + 0x18);
        uVar21 = (*pcVar23)(uVar25,pbVar22 + *(long *)(puVar7 + -0x138),
                            pbVar17 + ((long)pbVar12 - (long)pbVar22));
        if ((uVar21 & 1) != 0) goto code_r0x0046ad50;
        if (puVar7[-300] == -0x80) {
          uVar21 = (**(code **)(puVar7 + -0x140))(uVar25,*(undefined4 *)(puVar7 + -0x128));
        }
        else {
          uVar21 = (*pcVar23)(uVar25,puVar7 + ((ulong)(byte)puVar7[-0x122] - 300),
                              (ulong)(byte)puVar7[-0x121] - (ulong)(byte)puVar7[-0x122]);
        }
        if ((uVar21 & 1) != 0) goto code_r0x0046ad50;
        if (uVar26 < 0x80) {
          lVar13 = 1;
        }
        else if (uVar26 < 0x800) {
          lVar13 = 2;
        }
        else {
          lVar13 = 3;
          if (0xffff < uVar26) {
            lVar13 = 4;
          }
        }
        pbVar22 = pbVar12 + (long)pbVar17 + lVar13;
      }
      lVar13 = 3;
      if (0xffff < uVar26) {
        lVar13 = 4;
      }
      lVar3 = 2;
      if (0x7ff < uVar26) {
        lVar3 = lVar13;
      }
      lVar13 = 1;
      if (0x7f < uVar26) {
        lVar13 = lVar3;
      }
      pbVar24 = pbVar12 + (long)pbVar17 + lVar13;
      pbVar18 = unaff_x25;
    }
    pbVar19 = pbVar1 + -(long)pbVar18;
    unaff_x25 = pbVar18;
    pbVar12 = pbVar24;
  } while (pbVar19 != (byte *)0x0);
code_r0x0046accc:
  if (pbVar24 < pbVar22) {
code_r0x0046ada0:
    pbVar18 = *(byte **)(puVar7 + -0x138);
    goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
  }
  if (pbVar22 == (byte *)0x0) {
    pcVar27 = *(code **)(puVar7 + -0x140);
    pbVar18 = *(byte **)(puVar7 + -0x138);
  }
  else {
    pbVar18 = *(byte **)(puVar7 + -0x138);
    if (pbVar22 < pbVar16) {
      pcVar27 = *(code **)(puVar7 + -0x140);
      if ((char)pbVar18[(long)pbVar22] < -0x40)
      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
    else {
      pcVar27 = *(code **)(puVar7 + -0x140);
      if (pbVar22 != pbVar16) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
  }
  if (pbVar24 != (byte *)0x0) {
    if (pbVar24 < pbVar16) {
      if ((char)pbVar18[(long)pbVar24] < -0x40)
      goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    }
    else if (pbVar24 != pbVar16) {
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
      pbVar12 = pbVar22;
      auVar37 = func_0x007a297c(pbVar18,pbVar16,pbVar22,pbVar24,&UNK_009e0710);
      pbVar19 = auVar37._8_8_;
      pbVar17 = auVar37._0_8_;
      *(undefined1 **)(puVar7 + -0x160) = puVar7 + -0xd0;
      *(undefined **)(puVar7 + -0x158) =
           &__ZN42__LT_str_u20_as_u20_core__fmt__Display_GT_3fmt17hacc299d5203beed5E;
      *(long *)(puVar7 + -0x1a0) = lVar8;
      *(byte **)(puVar7 + -0x198) = unaff_x25;
      *(code **)(puVar7 + -400) = pcVar27;
      *(byte **)(puVar7 + -0x188) = pbVar24;
      *(byte **)(puVar7 + -0x180) = pbVar22;
      *(byte **)(puVar7 + -0x178) = pbVar16;
      *(undefined8 *)(puVar7 + -0x170) = uVar25;
      *(byte **)(puVar7 + -0x168) = pbVar18;
      *(undefined8 *)(puVar7 + -0x160) = *(undefined8 *)(puVar7 + -0x160);
      *(undefined8 *)(puVar7 + -0x158) = *(undefined8 *)(puVar7 + -0x158);
      uVar26 = *(uint *)(pbVar12 + 0x10);
      if ((uVar26 & 0x18000000) != 0) {
        if ((uVar26 >> 0x1c & 1) == 0) {
          if (pbVar19 < (byte *)0x20) {
            if (pbVar19 == (byte *)0x0) {
              uVar21 = 0;
            }
            else {
              if ((byte *)0x7 < pbVar19) {
                pbVar18 = (byte *)((ulong)pbVar19 & 0x18);
                uVar25 = *(undefined8 *)pbVar17;
                uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x30)) & 1);
                uVar14 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x38)) & 1);
                uVar30 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x20)) & 1);
                uVar31 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x28)) & 1);
                uVar32 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x10)) & 1);
                uVar33 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 0x18)) & 1);
                uVar34 = (ulong)(-(-0x41 < (char)uVar25) & 1);
                uVar35 = (ulong)(-(-0x41 < (char)((ulong)uVar25 >> 8)) & 1);
                if (pbVar18 != (byte *)0x8) {
                  uVar25 = *(undefined8 *)(pbVar17 + 8);
                  bVar36 = -(-0x41 < (char)((ulong)uVar25 >> 0x28));
                  uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar25 >> 0x30)) & 1);
                  uVar14 = uVar14 + (-(-0x41 < (char)((ulong)uVar25 >> 0x38)) & 1);
                  uVar30 = uVar30 + ((ulong)((uint6)CONCAT14(bVar36,(uint)CONCAT12(bVar36,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar25 >> 0x20)))) &
                                            0xffff0000ffff) & 0xffffff01);
                  uVar31 = uVar31 + ((ulong)bVar36 & 0xffffff01);
                  uVar32 = uVar32 + (-(-0x41 < (char)((ulong)uVar25 >> 0x10)) & 1);
                  uVar33 = uVar33 + (-(-0x41 < (char)((ulong)uVar25 >> 0x18)) & 1);
                  uVar34 = uVar34 + (-(-0x41 < (char)uVar25) & 1);
                  uVar35 = uVar35 + (-(-0x41 < (char)((ulong)uVar25 >> 8)) & 1);
                  if (pbVar18 != (byte *)0x10) {
                    uVar25 = *(undefined8 *)(pbVar17 + 0x10);
                    bVar36 = -(-0x41 < (char)((ulong)uVar25 >> 0x28));
                    uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar25 >> 0x30)) & 1);
                    uVar14 = uVar14 + (-(-0x41 < (char)((ulong)uVar25 >> 0x38)) & 1);
                    uVar30 = uVar30 + ((ulong)((uint6)CONCAT14(bVar36,(uint)CONCAT12(bVar36,(ushort)
                                                  (byte)-(-0x41 < (char)((ulong)uVar25 >> 0x20)))) &
                                              0xffff0000ffff) & 0xffffff01);
                    uVar31 = uVar31 + ((ulong)bVar36 & 0xffffff01);
                    uVar32 = uVar32 + (-(-0x41 < (char)((ulong)uVar25 >> 0x10)) & 1);
                    uVar33 = uVar33 + (-(-0x41 < (char)((ulong)uVar25 >> 0x18)) & 1);
                    uVar34 = uVar34 + (-(-0x41 < (char)uVar25) & 1);
                    uVar35 = uVar35 + (-(-0x41 < (char)((ulong)uVar25 >> 8)) & 1);
                  }
                }
                uVar21 = uVar34 + uVar30 + uVar32 + uVar21 + uVar35 + uVar31 + uVar33 + uVar14;
                goto code_r0x00468ca4;
              }
              uVar21 = 0;
              pbVar18 = (byte *)0x0;
              do {
                if (-0x41 < (char)pbVar17[(long)pbVar18]) {
                  uVar21 = uVar21 + 1;
                }
                pbVar18 = pbVar18 + 1;
code_r0x00468ca4:
              } while (pbVar19 != pbVar18);
            }
          }
          else {
            uVar21 = func_0x0046bd58(pbVar17,pbVar19);
          }
        }
        else {
          uVar21 = (ulong)*(ushort *)(pbVar12 + 0x16);
          if (uVar21 == 0) {
            pbVar19 = (byte *)0x0;
            uVar14 = 0;
          }
          else {
            pbVar18 = pbVar17 + (long)pbVar19;
            pbVar19 = (byte *)0x0;
            uVar14 = uVar21;
            pbVar16 = pbVar17;
            do {
              if (pbVar16 == pbVar18) break;
              bVar36 = *pbVar16;
              pbVar22 = pbVar16 + 3;
              if (0xef < bVar36) {
                pbVar22 = pbVar16 + 4;
              }
              pbVar1 = pbVar16 + 2;
              if (0xdf < bVar36) {
                pbVar1 = pbVar22;
              }
              pbVar22 = pbVar16 + 1;
              if (((int)(char)bVar36 & 0x80000000U) != 0) {
                pbVar22 = pbVar1;
              }
              pbVar19 = pbVar22 + ((long)pbVar19 - (long)pbVar16);
              uVar14 = uVar14 - 1;
              pbVar16 = pbVar22;
            } while (uVar14 != 0);
          }
          uVar21 = uVar21 - uVar14;
        }
        if (uVar21 < *(ushort *)(pbVar12 + 0x14)) {
          uVar4 = (uint)*(ushort *)(pbVar12 + 0x14) - (int)uVar21;
          uVar28 = uVar26 >> 0x1d & 3;
          uVar5 = uVar4 >> 1 & 0x7fff;
          if (uVar28 != 2) {
            uVar5 = 0;
          }
          uVar2 = 0;
          if (uVar28 != 0) {
            uVar2 = uVar4;
          }
          if (uVar28 < 2) {
            uVar5 = uVar2;
          }
          uVar28 = 0;
          uVar25 = *(undefined8 *)pbVar12;
          lVar8 = *(long *)(pbVar12 + 8);
          do {
            if ((uVar5 & 0xffff) <= (uVar28 & 0xffff)) {
              uVar21 = (**(code **)(lVar8 + 0x18))(uVar25,pbVar17,pbVar19);
              if ((uVar21 & 1) == 0) {
                uVar28 = 0;
                do {
                  if ((uVar4 - uVar5 & 0xffff) <= (uVar28 & 0xffff)) {
                    return (ulong *)0x0;
                  }
                  uVar28 = uVar28 + 1;
                  uVar21 = (**(code **)(lVar8 + 0x20))(uVar25,uVar26 & 0x1fffff);
                } while ((uVar21 & 1) == 0);
                return (ulong *)0x1;
              }
              break;
            }
            uVar28 = uVar28 + 1;
            uVar21 = (**(code **)(lVar8 + 0x20))(uVar25,uVar26 & 0x1fffff);
          } while ((uVar21 & 1) == 0);
          return (ulong *)((long)&MACH_HEADER.magic + 1);
        }
      }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      puVar9 = (ulong *)(**(code **)(*(long *)(pbVar12 + 8) + 0x18))
                                  (*(undefined8 *)pbVar12,pbVar17,pbVar19);
      return puVar9;
    }
  }
code_r0x0046ad38:
  uVar21 = (**(code **)(lVar8 + 0x18))(uVar25,pbVar18 + (long)pbVar22,(long)pbVar24 - (long)pbVar22)
  ;
  if ((uVar21 & 1) == 0) {
    puVar9 = (ulong *)(*pcVar27)(uVar25,0x22);
  }
  else {
code_r0x0046ad50:
    puVar9 = (ulong *)((long)&MACH_HEADER.magic + 1);
  }
  return puVar9;
}

