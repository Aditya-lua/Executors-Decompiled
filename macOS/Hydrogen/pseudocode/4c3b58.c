
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c4fcc) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint FUN_004c3b58(long param_1,undefined8 param_2)

{
  uint uVar1;
  code *pcVar2;
  bool bVar3;
  undefined8 *puVar4;
  dword *pdVar5;
  undefined *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  undefined8 extraout_x1_02;
  undefined8 extraout_x1_03;
  undefined8 extraout_x1_04;
  undefined8 extraout_x1_05;
  undefined8 extraout_x1_06;
  undefined8 extraout_x1_07;
  undefined8 extraout_x1_08;
  undefined8 extraout_x1_09;
  undefined8 extraout_x1_10;
  undefined8 extraout_x1_11;
  undefined8 extraout_x1_12;
  ulong uVar9;
  ulong uVar10;
  ulong in_x4;
  dword dVar11;
  int *piVar12;
  long lVar13;
  dword *in_x9;
  long *plVar14;
  undefined1 *in_x10;
  uint in_w11;
  dword dVar15;
  undefined1 *puVar16;
  undefined1 *in_x12;
  undefined1 *puVar17;
  ulong in_x13;
  uint uVar18;
  uint in_w14;
  uint uVar19;
  uint uVar20;
  ulong in_x16;
  long lVar21;
  ulong uVar22;
  ulong in_x17;
  ulong uVar23;
  ulong uVar24;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x25;
  long lVar25;
  char *pcVar26;
  long *unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 in_xzr;
  byte bVar28;
  byte bVar29;
  byte bVar30;
  byte bVar31;
  byte bVar32;
  long lVar27;
  long *plVar33;
  long *plVar34;
  long lVar35;
  byte bVar36;
  char cVar37;
  char cVar38;
  char cVar39;
  char cVar40;
  char cVar41;
  char cVar42;
  char cVar43;
  byte bVar44;
  byte bVar45;
  byte bVar47;
  undefined8 uVar46;
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [12];
  undefined *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  dword *in_stack_00000048;
  undefined8 in_stack_00000060;
  ulong in_stack_00000068;
  dword in_stack_00000070;
  dword *in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c0;
  uint in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  undefined8 in_stack_000000f8;
  ulong in_stack_00000100;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000138;
  long in_stack_000001a0;
  undefined8 in_stack_000001a8;
  long in_stack_000001f0;
  dword *in_stack_000001f8;
  long in_stack_00000410;
  int *in_stack_00000418;
  long in_stack_00000420;
  long in_stack_00000530;
  uint uVar51;
  undefined8 in_stack_00000538;
  long in_stack_00000548;
  ulong in_stack_00000550;
  long in_stack_00000670;
  dword *in_stack_00000678;
  ulong in_stack_00000680;
  long in_stack_00000688;
  undefined8 in_stack_00000690;
  int iVar52;
  undefined8 in_stack_00000698;
  undefined8 in_stack_000006a0;
  undefined8 in_stack_000006a8;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
code_r0x004c3b58:
  if ((in_x16 & 1) == 0) goto LAB_004c3a0c;
code_r0x004c3b60:
  uVar20 = (uint)in_x17;
  if (uVar20 == in_stack_000000c8) {
    if (in_stack_000000c8 != in_w14) goto LAB_004c3a0c;
  }
  else {
    lVar21 = 0;
    uVar23 = in_x17 & 0xffffffff ^ in_stack_000000c0;
    uVar7 = uVar23 + in_stack_000000e8 ^ (in_stack_000000c0 >> 0x30 | uVar23 << 0x10);
    uVar23 = uVar23 + in_stack_000000d8;
    uVar9 = uVar23 ^ in_stack_000000d0;
    uVar8 = uVar7 + in_stack_000000e0 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
    uVar7 = (uVar7 + in_stack_000000e0 ^ (in_x17 & 0xffffffff | 0x400000000000000)) + uVar9;
    uVar10 = uVar7 ^ (uVar9 >> 0x33 | uVar9 << 0xd);
    uVar23 = ((uVar23 >> 0x20 | uVar23 << 0x20) ^ 0xff) + uVar8;
    uVar9 = uVar10 + uVar23;
    uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
    uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
    uVar7 = uVar23 + (uVar7 >> 0x20 | uVar7 << 0x20);
    uVar8 = uVar10 + uVar7;
    uVar7 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
    uVar10 = uVar8 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
    uVar23 = uVar7 + (uVar9 >> 0x20 | uVar9 << 0x20);
    uVar9 = uVar10 + uVar23;
    uVar23 = uVar23 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
    uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
    uVar7 = uVar23 + (uVar8 >> 0x20 | uVar8 << 0x20);
    uVar24 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
    uVar8 = uVar10 + uVar7 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
    uVar7 = uVar24 + (uVar9 >> 0x20 | uVar9 << 0x20);
    uVar23 = uVar8 + uVar7;
    uVar7 = uVar7 ^ (uVar24 >> 0x30 | uVar24 << 0x10);
    uVar23 = (uVar8 >> 0x2f | uVar8 << 0x11) ^ (uVar7 >> 0x2b | uVar7 << 0x15) ^
             (uVar23 >> 0x20 | uVar23 << 0x20) ^ uVar23;
    bVar36 = (byte)(uVar23 >> 0x39);
    while( true ) {
      in_x17 = uVar23 & in_stack_00000100;
      uVar46 = *(undefined8 *)(in_stack_000000f0 + in_x17);
      bVar45 = (byte)((ulong)uVar46 >> 8);
      bVar44 = (byte)((ulong)uVar46 >> 0x10);
      bVar28 = (byte)((ulong)uVar46 >> 0x18);
      bVar29 = (byte)((ulong)uVar46 >> 0x20);
      bVar30 = (byte)((ulong)uVar46 >> 0x28);
      bVar31 = (byte)((ulong)uVar46 >> 0x30);
      bVar32 = (byte)((ulong)uVar46 >> 0x38);
      for (uVar23 = CONCAT17(-(bVar32 == bVar36),
                             CONCAT16(-(bVar31 == bVar36),
                                      CONCAT15(-(bVar30 == bVar36),
                                               CONCAT14(-(bVar29 == bVar36),
                                                        CONCAT13(-(bVar28 == bVar36),
                                                                 CONCAT12(-(bVar44 == bVar36),
                                                                          CONCAT11(-(bVar45 ==
                                                                                    bVar36),-((byte)
                                                  uVar46 == bVar36)))))))) & 0x8080808080808080;
          uVar23 != 0; uVar23 = uVar23 - 1 & uVar23) {
        uVar7 = (uVar23 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar23 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = in_x17 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & in_stack_00000100;
        if (uVar20 == *(uint *)(in_stack_000000b8 + uVar7 * -8)) {
          in_x17 = (ulong)*(uint *)(in_stack_000000a8 + uVar7 * -8);
          in_x16 = 1;
          goto joined_r0x004c3b54;
        }
      }
      bVar45 = NEON_umaxv(CONCAT17(-(bVar32 == 0xff),
                                   CONCAT16(-(bVar31 == 0xff),
                                            CONCAT15(-(bVar30 == 0xff),
                                                     CONCAT14(-(bVar29 == 0xff),
                                                              CONCAT13(-(bVar28 == 0xff),
                                                                       CONCAT12(-(bVar44 == 0xff),
                                                                                CONCAT11(-(bVar45 ==
                                                                                          0xff),-((
                                                  byte)uVar46 == 0xff)))))))),1);
      if ((bVar45 & 1) != 0) break;
      lVar21 = lVar21 + 8;
      uVar23 = in_x17 + lVar21;
    }
    in_x16 = 0;
joined_r0x004c3b54:
    if (uVar20 != in_w14) goto code_r0x004c3b58;
  }
  bVar3 = false;
  in_x17 = unaff_x20;
  param_1 = in_stack_00000670;
  in_x9 = in_stack_00000678;
LAB_004c3d50:
  func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
  func_0x004d0228(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000066e,&UNK_009e5910);
  auVar48 = func_0x005847cc(in_stack_000000f8,in_stack_000000b0);
  uVar46 = auVar48._8_8_;
  lVar21 = auVar48._0_8_;
  if (lVar21 != 0) {
    if (*(long *)(lVar21 + 0x10) != 0) {
      lVar21 = *(long *)(lVar21 + 8) + *(long *)(lVar21 + 0x10) * 0x108;
      dVar15 = (dword)in_x17;
      if (lVar21 != 0x108) {
        plVar14 = (long *)(lVar21 + -0xe8);
        if (plVar14 == (long *)0x0 || *(long *)(lVar21 + -0xf0) != 0x10) {
          uVar20 = 0;
          goto LAB_004c43c8;
        }
        dVar11 = (dword)in_stack_000000a0;
        if (dVar11 == (dword)unaff_x25) {
          lVar13 = in_stack_00000420 << 2;
          piVar12 = in_stack_00000418;
          do {
            if (lVar13 == 0) {
              if ((unaff_x22 & 1) == 0) {
                in_stack_00000688 = func_0x00187bd0(0x108,8);
                uVar46 = 0x108;
                if (in_stack_00000688 == 0) goto LAB_004c4fe0;
                *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
                auVar48 = func_0x00187bd0(0x28,8);
                plVar33 = auVar48._0_8_;
                if (plVar33 != (long *)0x0) {
                  plVar33[1] = (long)in_stack_00000048;
                  *plVar33 = in_stack_00000040;
                  plVar33[3] = in_stack_00000688;
                  plVar33[2] = 1;
                  plVar33[4] = 1;
                  puVar4 = (undefined8 *)(lVar21 + -0xa8);
                  lVar13 = *(long *)*puVar4;
                  *(long *)*puVar4 = lVar13 + -1;
                  LORelease();
                  if (lVar13 == 1) {
                    in_xzr = *(undefined8 *)*puVar4;
                    func_0x005d2c74(puVar4);
                    auVar48._8_8_ = extraout_x1_00;
                    auVar48._0_8_ = plVar33;
                  }
                  goto LAB_004c3f5c;
                }
                func_0x007a1f18(8,0x28);
                goto LAB_004c5940;
              }
              break;
            }
            iVar52 = *piVar12;
            lVar13 = lVar13 + -4;
            piVar12 = piVar12 + 1;
          } while (iVar52 != (int)in_stack_000000b0);
        }
        uVar20 = 0;
        if (dVar11 == in_stack_00000070) {
          uVar20 = in_stack_00000060._4_4_;
        }
        if ((uVar20 & 1) == 0) {
          uVar20 = 0;
joined_r0x004c3ec0:
          if (dVar15 == (dword)unaff_x25) {
            lVar13 = in_stack_00000420 << 2;
            piVar12 = in_stack_00000418;
            do {
              if (lVar13 == 0) {
                if (!bVar3) {
                  in_stack_00000688 = func_0x00187bd0(0x108,8);
                  uVar46 = 0x108;
                  if (in_stack_00000688 == 0) goto LAB_004c4fe0;
                  *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1c;
                  auVar49 = func_0x00187bd0(0x28,8);
                  plVar33 = auVar49._0_8_;
                  if (plVar33 != (long *)0x0) {
                    plVar33[1] = (long)in_stack_00000048;
                    *plVar33 = in_stack_00000040;
                    plVar33[3] = in_stack_00000688;
                    plVar33[2] = 1;
                    plVar33[4] = 1;
                    puVar4 = (undefined8 *)(lVar21 + -0xa0);
                    lVar13 = *(long *)*puVar4;
                    *(long *)*puVar4 = lVar13 + -1;
                    LORelease();
                    if (lVar13 == 1) {
                      in_xzr = *(undefined8 *)*puVar4;
                      func_0x005d2c74(puVar4);
                      auVar49._8_8_ = extraout_x1_02;
                      auVar49._0_8_ = plVar33;
                    }
                    goto code_r0x004c40dc;
                  }
                  func_0x007a1f18(8,0x28);
                  goto LAB_004c5940;
                }
                break;
              }
              iVar52 = *piVar12;
              lVar13 = lVar13 + -4;
              piVar12 = piVar12 + 1;
            } while (iVar52 != (int)in_stack_000000b0);
          }
          uVar1 = 0;
          if (dVar15 == in_stack_00000070) {
            uVar1 = in_stack_00000060._4_4_;
          }
          if ((uVar1 & 1) != 0) {
            in_stack_00000688 = func_0x00187bd0(0x108,8);
            uVar46 = 0x108;
            if (in_stack_00000688 == 0) goto LAB_004c4fe0;
            *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
            auVar49 = func_0x00187bd0(0x28,8);
            plVar33 = auVar49._0_8_;
            if (plVar33 == (long *)0x0) {
              func_0x007a1f18(8,0x28);
              goto LAB_004c5940;
            }
            plVar33[1] = (long)in_stack_00000048;
            *plVar33 = in_stack_00000040;
            plVar33[3] = in_stack_00000688;
            plVar33[2] = 1;
            plVar33[4] = 1;
            puVar4 = (undefined8 *)(lVar21 + -0xa0);
            lVar13 = *(long *)*puVar4;
            *(long *)*puVar4 = lVar13 + -1;
            LORelease();
            if (lVar13 == 1) {
              in_xzr = *(undefined8 *)*puVar4;
              func_0x005d2c74(puVar4);
              auVar49._8_8_ = extraout_x1_01;
              auVar49._0_8_ = plVar33;
            }
code_r0x004c40dc:
            uVar46 = auVar49._8_8_;
            in_stack_00000690 = 1;
            in_stack_00000680 = 1;
            *(long *)(lVar21 + -0xa0) = auVar49._0_8_;
            uVar20 = 1;
            param_1 = in_stack_00000040;
            in_x9 = in_stack_00000048;
          }
          lVar13 = *(long *)(lVar21 + -0xa8);
          pcVar26 = (char *)(lVar13 + 8);
          if (*pcVar26 == '\0') {
            *pcVar26 = '\x01';
          }
          else {
            func_0x007aff64(pcVar26,uVar46,1000000000);
            uVar46 = extraout_x1_03;
          }
          cVar37 = *pcVar26;
          if (cVar37 == '\x01') {
            *pcVar26 = (char)in_xzr;
          }
          bVar3 = cVar37 == '\x01';
          if (*(long *)(lVar13 + 0x20) == 0) {
code_r0x004c4154:
            if (!bVar3) {
              func_0x007b05dc(pcVar26,0);
              uVar46 = extraout_x1_04;
            }
            lVar13 = *(long *)(lVar21 + -0xa8);
            pcVar26 = (char *)(lVar13 + 8);
            if (*pcVar26 == '\0') {
              *pcVar26 = '\x01';
            }
            else {
              func_0x007aff64(pcVar26,uVar46,1000000000);
              uVar46 = extraout_x1_05;
            }
            cVar37 = *pcVar26;
            if (cVar37 == '\x01') {
              *pcVar26 = (char)in_xzr;
            }
            bVar3 = cVar37 == '\x01';
            if (*(long *)(lVar13 + 0x20) == 0) {
              if (!bVar3) {
                func_0x007b05dc(pcVar26,0);
                uVar46 = extraout_x1_11;
              }
              lVar13 = *(long *)(lVar21 + -0xa0);
              pcVar26 = (char *)(lVar13 + 8);
              if (*pcVar26 == '\0') {
                *pcVar26 = '\x01';
              }
              else {
                func_0x007aff64(pcVar26,uVar46,1000000000);
                uVar46 = extraout_x1_12;
              }
              cVar37 = *pcVar26;
              if (cVar37 == '\x01') {
                *pcVar26 = (char)in_xzr;
              }
              bVar3 = cVar37 == '\x01';
              if (*(long *)(lVar13 + 0x20) != 0) {
                if (!bVar3) {
                  func_0x007b05dc(pcVar26,0);
                }
                func_0x004bd098(auStack_7ffffffe + 0x8000066e,plVar14);
                func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
                func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
                func_0x004bb4f4(plVar14);
                *(dword **)(lVar21 + -0xe0) = in_x9;
                *plVar14 = param_1;
                *(long *)(lVar21 + -0xd0) = in_stack_00000688;
                *(ulong *)(lVar21 + -0xd8) = in_stack_00000680;
                *(undefined8 *)(lVar21 + -0xc0) = in_stack_00000698;
                *(undefined8 *)(lVar21 + -200) = in_stack_00000690;
                *(undefined8 *)(lVar21 + -0xb0) = in_stack_000006a8;
                *(undefined8 *)(lVar21 + -0xb8) = in_stack_000006a0;
                uVar46 = *(undefined8 *)(lVar21 + -0xa8);
                *(undefined8 *)(lVar21 + -0xa8) = *(undefined8 *)(lVar21 + -0xa0);
                *(undefined8 *)(lVar21 + -0xa0) = uVar46;
                in_x9 = (dword *)func_0x00187bd0(0x28,8);
                uVar46 = 0x28;
                if (in_x9 == (dword *)0x0) goto LAB_004c4fe0;
                *in_x9 = dVar11;
                *(undefined8 *)(in_x9 + 2) = 0;
                *(undefined8 *)(in_x9 + 4) = 8;
                *(undefined8 *)(in_x9 + 6) = 0;
                *(undefined1 *)(in_x9 + 8) = 0;
                func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_000000b0,
                                auStack_7ffffffe + 0x8000066e);
                func_0x004ce364(&stack0x000001f0);
                goto code_r0x004c43a4;
              }
            }
            if (!bVar3) {
              func_0x007b05dc(pcVar26,0);
              uVar46 = extraout_x1_08;
            }
            lVar13 = *(long *)(lVar21 + -0xa8);
            pcVar26 = (char *)(lVar13 + 8);
            if (*pcVar26 == '\0') {
              *pcVar26 = '\x01';
            }
            else {
              func_0x007aff64(pcVar26,uVar46,1000000000);
              uVar46 = extraout_x1_09;
            }
            cVar37 = *pcVar26;
            if (cVar37 == '\x01') {
              *pcVar26 = (char)in_xzr;
            }
            bVar3 = cVar37 == '\x01';
            if (*(long *)(lVar13 + 0x20) != 0) {
              if (!bVar3) {
                func_0x007b05dc(pcVar26,0);
                uVar46 = extraout_x1_10;
              }
              lVar21 = *(long *)(lVar21 + -0xa0);
              pcVar26 = (char *)(lVar21 + 8);
              if (*pcVar26 == '\0') {
                *pcVar26 = '\x01';
              }
              else {
                func_0x007aff64(pcVar26,uVar46,1000000000);
              }
              cVar37 = *pcVar26;
              if (cVar37 == '\x01') {
                *pcVar26 = (char)in_xzr;
              }
              bVar3 = cVar37 == '\x01';
              if (*(long *)(lVar21 + 0x20) != 0) {
                if (!bVar3) {
                  func_0x007b05dc(pcVar26,0);
                }
                func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_000000b0);
                func_0x004ce364(auStack_7ffffffe + 0x8000066e);
                if (param_1 != 0) {
                  pdVar5 = in_x9;
                  lVar21 = param_1;
                  goto code_r0x004c43b4;
                }
                goto code_r0x004c43c4;
              }
            }
            if (!bVar3) {
              func_0x007b05dc(pcVar26,0);
            }
          }
          else {
            if (!bVar3) {
              func_0x007b05dc(pcVar26,0);
              uVar46 = extraout_x1_06;
            }
            lVar13 = *(long *)(lVar21 + -0xa0);
            pcVar26 = (char *)(lVar13 + 8);
            if (*pcVar26 == '\0') {
              *pcVar26 = '\x01';
            }
            else {
              func_0x007aff64(pcVar26,uVar46,1000000000);
              uVar46 = extraout_x1_07;
            }
            cVar37 = *pcVar26;
            if (cVar37 == '\x01') {
              *pcVar26 = (char)in_xzr;
            }
            bVar3 = cVar37 == '\x01';
            if (*(long *)(lVar13 + 0x20) != 0) goto code_r0x004c4154;
            if (!bVar3) {
              func_0x007b05dc(pcVar26,0);
            }
            in_x9 = (dword *)func_0x00187bd0(0x28,8);
            uVar46 = 0x28;
            if (in_x9 == (dword *)0x0) goto LAB_004c4fe0;
            *in_x9 = dVar15;
            *(undefined8 *)(in_x9 + 2) = 0;
            *(undefined8 *)(in_x9 + 4) = 8;
            in_x9[6] = 0;
            in_x9[7] = 0;
            *(undefined1 *)(in_x9 + 8) = 0;
            func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_000000b0,
                            auStack_7ffffffe + 0x8000066e);
            func_0x004ce364(&stack0x000001f0);
code_r0x004c43a4:
            in_stack_00000680 = 1;
            param_1 = 1;
            if (in_stack_000001f0 != 0) {
              pdVar5 = in_stack_000001f8;
              lVar21 = in_stack_000001f0;
code_r0x004c43b4:
              func_0x00187bd4(pdVar5,lVar21 * 0x28,8);
            }
code_r0x004c43c4:
            uVar20 = 1;
          }
LAB_004c43c8:
          if (in_stack_00000410 != 0) {
            func_0x00187bd4(in_stack_00000418,in_stack_00000410 << 2,4);
          }
code_r0x004c3298:
          unaff_x28 = unaff_x28 - 1 & unaff_x28;
          in_stack_00000098._4_4_ = in_stack_00000098._4_4_ | uVar20;
          in_stack_00000090 = in_stack_00000090 + -1;
          uVar20 = (uint)(in_stack_00000680 >> 0x20);
          in_w11 = (uint)in_stack_00000688;
          if (in_stack_00000090 == 0) {
            if ((in_stack_00000030 != 0) && (in_stack_00000020 != 0)) {
              func_0x00187bd4(in_stack_00000010,in_stack_00000020,in_stack_00000018);
            }
            func_0x00584800(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000138._4_4_)
            ;
            puVar16 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
            if (in_x9 <= puVar16) goto joined_r0x004c4568;
            lVar21 = param_1 + (long)puVar16 * 0x30;
            puVar16 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x20);
            uVar1 = *(uint *)(lVar21 + 0x2c);
            goto joined_r0x004c4538;
          }
          while (unaff_x28 == 0) {
            lVar21 = *unaff_x27;
            unaff_x23 = unaff_x23 + -0x20;
            unaff_x27 = unaff_x27 + 1;
            unaff_x28 = CONCAT17(-(-1 < lVar21),
                                 CONCAT16(-(-1 < (char)((ulong)lVar21 >> 0x30)),
                                          CONCAT15(-(-1 < (char)((ulong)lVar21 >> 0x28)),
                                                   CONCAT14(-(-1 < (char)((ulong)lVar21 >> 0x20)),
                                                            CONCAT13(-(-1 < (char)((ulong)lVar21 >>
                                                                                  0x18)),
                                                                     CONCAT12(-(-1 < (char)((ulong)
                                                  lVar21 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar21 >> 8)),
                                                           -(-1 < (char)lVar21)))))))) &
                        0x8080808080808080;
          }
          uVar23 = (unaff_x28 & 0xaaaaaaaaaaaaaaaa) >> 1 | (unaff_x28 & 0x5555555555555555) << 1;
          uVar23 = (uVar23 & 0xcccccccccccccccc) >> 2 | (uVar23 & 0x3333333333333333) << 2;
          uVar23 = (uVar23 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar23 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar23 = (uVar23 & 0xff00ff00ff00ff00) >> 8 | (uVar23 & 0xff00ff00ff00ff) << 8;
          uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
          uVar1 = *(uint *)((unaff_x23 -
                            ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 1 & 0x3c)) + -4);
          in_x4 = (ulong)uVar1;
          func_0x00584d50(auStack_7ffffffe + 0x8000052e,in_stack_000000f8);
          if (in_stack_00000530 == 0) {
            func_0x00584ec0(auStack_7ffffffe + 0x8000040e,in_stack_000000f8,in_x4);
            if (in_stack_00000410 != 0) {
              dVar15 = (dword)((ulong)in_stack_00000418 >> 0x20);
              if (dVar15 == in_stack_00000118._4_4_) {
                func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8);
                puVar17 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
                puVar16 = (undefined1 *)(ulong)uVar20;
                if (in_stack_00000088 == 0) {
                  do {
                    for (; puVar17 < in_x9;
                        puVar17 = (undefined1 *)
                                  (ulong)*(uint *)(param_1 + (long)puVar17 * unaff_x19 + 0x20)) {
                    }
                    do {
                      if (in_x9 <= puVar16) goto code_r0x004c3294;
                      lVar21 = param_1 + (long)puVar16 * unaff_x19;
                      puVar16 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
                    } while (*(uint *)(lVar21 + 0x28) == in_w11);
                  } while( true );
                }
                uVar23 = (in_x4 | 0x400000000000000) ^ in_stack_00000068;
                uVar7 = uVar23 + in_stack_000000e8 ^ (uVar23 >> 0x30 | uVar23 << 0x10);
                uVar23 = uVar23 + in_stack_000000d8;
                uVar9 = uVar23 ^ in_stack_000000d0;
                uVar8 = uVar7 + in_stack_000000e0 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
                uVar7 = (uVar7 + in_stack_000000e0 ^ (in_x4 | 0x400000000000000)) + uVar9;
                uVar10 = uVar7 ^ (uVar9 >> 0x33 | uVar9 << 0xd);
                uVar23 = ((uVar23 >> 0x20 | uVar23 << 0x20) ^ 0xff) + uVar8;
                uVar9 = uVar10 + uVar23;
                uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
                uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
                uVar7 = uVar23 + (uVar7 >> 0x20 | uVar7 << 0x20);
                uVar8 = uVar10 + uVar7;
                uVar7 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
                uVar10 = uVar8 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
                uVar23 = uVar7 + (uVar9 >> 0x20 | uVar9 << 0x20);
                uVar9 = uVar10 + uVar23;
                uVar23 = uVar23 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
                uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
                uVar7 = uVar23 + (uVar8 >> 0x20 | uVar8 << 0x20);
                uVar8 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
                uVar10 = uVar10 + uVar7 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
                uVar23 = uVar8 + (uVar9 >> 0x20 | uVar9 << 0x20);
                uVar7 = uVar10 + uVar23;
                uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
                uVar7 = (uVar10 >> 0x2f | uVar10 << 0x11) ^ (uVar23 >> 0x2b | uVar23 << 0x15) ^
                        (uVar7 >> 0x20 | uVar7 << 0x20) ^ uVar7;
                bVar36 = (byte)(uVar7 >> 0x39);
code_r0x004c376c:
                do {
                  if (puVar17 < in_x9) {
                    lVar21 = param_1 + (long)puVar17 * unaff_x19;
                    puVar17 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x20);
                    uVar20 = *(uint *)(lVar21 + 0x2c);
                  }
                  else {
                    do {
                      if (in_x9 <= puVar16) goto code_r0x004c3294;
                      lVar21 = param_1 + (long)puVar16 * unaff_x19;
                      puVar16 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
                      uVar20 = *(uint *)(lVar21 + 0x28);
                    } while (uVar20 == in_w11);
                  }
                  if (uVar20 != uVar1) {
                    lVar21 = 0;
                    uVar23 = uVar7;
                    while( true ) {
                      uVar23 = uVar23 & in_stack_00000100;
                      uVar46 = *(undefined8 *)(in_stack_000000f0 + uVar23);
                      bVar45 = (byte)((ulong)uVar46 >> 8);
                      bVar44 = (byte)((ulong)uVar46 >> 0x10);
                      bVar28 = (byte)((ulong)uVar46 >> 0x18);
                      bVar29 = (byte)((ulong)uVar46 >> 0x20);
                      bVar30 = (byte)((ulong)uVar46 >> 0x28);
                      bVar31 = (byte)((ulong)uVar46 >> 0x30);
                      bVar32 = (byte)((ulong)uVar46 >> 0x38);
                      for (uVar9 = CONCAT17(-(bVar32 == bVar36),
                                            CONCAT16(-(bVar31 == bVar36),
                                                     CONCAT15(-(bVar30 == bVar36),
                                                              CONCAT14(-(bVar29 == bVar36),
                                                                       CONCAT13(-(bVar28 == bVar36),
                                                                                CONCAT12(-(bVar44 ==
                                                                                          bVar36),
                                                  CONCAT11(-(bVar45 == bVar36),
                                                           -((byte)uVar46 == bVar36)))))))) &
                                   0x8080808080808080; uVar9 != 0; uVar9 = uVar9 - 1 & uVar9) {
                        uVar8 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
                        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 |
                                (uVar8 & 0xffff0000ffff) << 0x10;
                        if (uVar1 == *(uint *)(in_stack_000000b8 +
                                              (uVar23 + ((ulong)LZCOUNT(uVar8 >> 0x20 |
                                                                        uVar8 << 0x20) >> 3) &
                                              in_stack_00000100) * -8)) {
                          in_stack_000001f0 = CONCAT44(uVar1,1);
                          goto code_r0x004c383c;
                        }
                      }
                      bVar45 = NEON_umaxv(CONCAT17(-(bVar32 == 0xff),
                                                   CONCAT16(-(bVar31 == 0xff),
                                                            CONCAT15(-(bVar30 == 0xff),
                                                                     CONCAT14(-(bVar29 == 0xff),
                                                                              CONCAT13(-(bVar28 ==
                                                                                        0xff),
                                                  CONCAT12(-(bVar44 == 0xff),
                                                           CONCAT11(-(bVar45 == 0xff),
                                                                    -((byte)uVar46 == 0xff)))))))),1
                                         );
                      if ((bVar45 & 1) != 0) break;
                      lVar21 = lVar21 + 8;
                      uVar23 = uVar23 + lVar21;
                    }
                  }
                } while( true );
              }
              uVar20 = 0;
              if (dVar15 == in_stack_00000070) {
                uVar20 = in_stack_00000060._4_4_;
              }
              if ((uVar20 & 1) != 0) {
                plVar14 = (long *)func_0x005847cc(in_stack_000000f8,in_x4);
                if (plVar14 != (long *)0x0) {
                  in_stack_00000688 = 0x1d;
                  lVar21 = plVar14[2];
                  if (lVar21 == *plVar14) {
                    func_0x005bd0a4(plVar14,&UNK_009e5eb0);
                  }
                  _memcpy(plVar14[1] + lVar21 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
                  plVar14[2] = lVar21 + 1;
                  goto code_r0x004c3ccc;
                }
                goto code_r0x004c53fc;
              }
              goto code_r0x004c3ccc;
            }
            func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6540);
            goto LAB_004c5940;
          }
          uVar51 = (uint)((ulong)in_stack_00000538 >> 0x20);
          in_stack_000000a0 = (ulong)uVar51;
          in_x17 = in_stack_00000550 >> 0x20;
          unaff_x25 = (ulong)in_stack_00000118._4_4_;
          func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
          puVar16 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
          if (in_stack_00000088 == 0) {
            puVar17 = (undefined1 *)(ulong)uVar20;
            do {
              for (; puVar16 < in_x9;
                  puVar16 = (undefined1 *)
                            (ulong)*(uint *)(param_1 + (long)puVar16 * unaff_x19 + 0x20)) {
              }
              do {
                if (in_x9 <= puVar17) goto code_r0x004c3920;
                lVar21 = param_1 + (long)puVar17 * unaff_x19;
                puVar17 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
              } while (*(uint *)(lVar21 + 0x28) == in_w11);
            } while( true );
          }
          uVar23 = (in_stack_000000a0 | 0x400000000000000) ^ in_stack_00000068;
          uVar7 = uVar23 + in_stack_000000e8 ^ (uVar23 >> 0x30 | uVar23 << 0x10);
          uVar23 = uVar23 + in_stack_000000d8;
          uVar9 = uVar23 ^ in_stack_000000d0;
          uVar8 = uVar7 + in_stack_000000e0 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
          uVar7 = (uVar7 + in_stack_000000e0 ^ (in_stack_000000a0 | 0x400000000000000)) + uVar9;
          uVar10 = uVar7 ^ (uVar9 >> 0x33 | uVar9 << 0xd);
          uVar23 = ((uVar23 >> 0x20 | uVar23 << 0x20) ^ 0xff) + uVar8;
          uVar9 = uVar10 + uVar23;
          uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
          uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
          uVar7 = uVar23 + (uVar7 >> 0x20 | uVar7 << 0x20);
          uVar8 = uVar10 + uVar7;
          uVar7 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
          uVar10 = uVar8 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
          uVar23 = uVar7 + (uVar9 >> 0x20 | uVar9 << 0x20);
          uVar9 = uVar10 + uVar23;
          uVar23 = uVar23 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
          uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
          uVar7 = uVar23 + (uVar8 >> 0x20 | uVar8 << 0x20);
          uVar8 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
          uVar10 = uVar10 + uVar7 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
          uVar23 = uVar8 + (uVar9 >> 0x20 | uVar9 << 0x20);
          uVar7 = uVar10 + uVar23;
          uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
          uVar7 = (uVar10 >> 0x2f | uVar10 << 0x11) ^ (uVar23 >> 0x2b | uVar23 << 0x15) ^
                  (uVar7 >> 0x20 | uVar7 << 0x20) ^ uVar7;
          bVar36 = (byte)(uVar7 >> 0x39);
          puVar17 = (undefined1 *)(ulong)uVar20;
code_r0x004c3408:
          do {
            if (puVar16 < in_x9) {
              lVar21 = param_1 + (long)puVar16 * unaff_x19;
              puVar16 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x20);
              uVar18 = *(uint *)(lVar21 + 0x2c);
            }
            else {
              do {
                if (in_x9 <= puVar17) goto code_r0x004c3920;
                lVar21 = param_1 + (long)puVar17 * unaff_x19;
                puVar17 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
                uVar18 = *(uint *)(lVar21 + 0x28);
              } while (uVar18 == in_w11);
            }
            if (uVar18 != uVar1) {
              lVar21 = 0;
              uVar23 = uVar7;
              while( true ) {
                uVar23 = uVar23 & in_stack_00000100;
                uVar46 = *(undefined8 *)(in_stack_000000f0 + uVar23);
                bVar45 = (byte)((ulong)uVar46 >> 8);
                bVar44 = (byte)((ulong)uVar46 >> 0x10);
                bVar28 = (byte)((ulong)uVar46 >> 0x18);
                bVar29 = (byte)((ulong)uVar46 >> 0x20);
                bVar30 = (byte)((ulong)uVar46 >> 0x28);
                bVar31 = (byte)((ulong)uVar46 >> 0x30);
                bVar32 = (byte)((ulong)uVar46 >> 0x38);
                for (uVar9 = CONCAT17(-(bVar32 == bVar36),
                                      CONCAT16(-(bVar31 == bVar36),
                                               CONCAT15(-(bVar30 == bVar36),
                                                        CONCAT14(-(bVar29 == bVar36),
                                                                 CONCAT13(-(bVar28 == bVar36),
                                                                          CONCAT12(-(bVar44 ==
                                                                                    bVar36),CONCAT11
                                                  (-(bVar45 == bVar36),-((byte)uVar46 == bVar36)))))
                                                  ))) & 0x8080808080808080; uVar9 != 0;
                    uVar9 = uVar9 - 1 & uVar9) {
                  uVar8 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                          (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
                  if (uVar51 == *(uint *)(in_stack_000000b8 +
                                         (uVar23 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >>
                                                   3) & in_stack_00000100) * -8)) {
                    uVar23 = in_stack_000000a0;
                    goto code_r0x004c3568;
                  }
                }
                bVar45 = NEON_umaxv(CONCAT17(-(bVar32 == 0xff),
                                             CONCAT16(-(bVar31 == 0xff),
                                                      CONCAT15(-(bVar30 == 0xff),
                                                               CONCAT14(-(bVar29 == 0xff),
                                                                        CONCAT13(-(bVar28 == 0xff),
                                                                                 CONCAT12(-(bVar44 
                                                  == 0xff),CONCAT11(-(bVar45 == 0xff),
                                                                    -((byte)uVar46 == 0xff)))))))),1
                                   );
                if ((bVar45 & 1) != 0) break;
                lVar21 = lVar21 + 8;
                uVar23 = uVar23 + lVar21;
              }
            }
          } while( true );
        }
        in_stack_00000688 = func_0x00187bd0(0x108,8);
        uVar46 = 0x108;
        if (in_stack_00000688 == 0) {
LAB_004c4fe0:
          func_0x007a1f18(8,uVar46);
        }
        else {
          *(undefined8 *)(in_stack_00000688 + 0x18) = 0x1d;
          auVar48 = func_0x00187bd0(0x28,8);
          plVar33 = auVar48._0_8_;
          if (plVar33 != (long *)0x0) {
            plVar33[1] = (long)in_stack_00000048;
            *plVar33 = in_stack_00000040;
            plVar33[3] = in_stack_00000688;
            plVar33[2] = 1;
            plVar33[4] = 1;
            puVar4 = (undefined8 *)(lVar21 + -0xa8);
            lVar13 = *(long *)*puVar4;
            *(long *)*puVar4 = lVar13 + -1;
            LORelease();
            if (lVar13 == 1) {
              in_xzr = *(undefined8 *)*puVar4;
              func_0x005d2c74(puVar4);
              auVar48._8_8_ = extraout_x1;
              auVar48._0_8_ = plVar33;
            }
LAB_004c3f5c:
            uVar46 = auVar48._8_8_;
            in_stack_00000690 = 1;
            in_stack_00000680 = 1;
            *(long *)(lVar21 + -0xa8) = auVar48._0_8_;
            uVar20 = 1;
            param_1 = in_stack_00000040;
            in_x9 = in_stack_00000048;
            goto joined_r0x004c3ec0;
          }
          func_0x007a1f18(8,0x28);
        }
        goto LAB_004c5940;
      }
    }
    in_stack_00000008 = &UNK_009e5f10;
  }
  func_0x007a23bc(in_stack_00000008);
  goto LAB_004c5940;
code_r0x004c3294:
  uVar20 = 0;
  goto code_r0x004c3298;
  while (auVar50._8_4_ != uVar20) {
code_r0x004c383c:
    auVar50 = func_0x004d3904(&stack0x000001f0);
    if ((auVar50._0_8_ & 1) == 0) break;
  }
  in_stack_000001f8 = in_stack_00000080;
  if ((auVar50._0_8_ & 1) != 0) goto code_r0x004c3854;
  goto code_r0x004c376c;
code_r0x004c3854:
  plVar14 = (long *)func_0x005847cc(in_stack_000000f8,in_x4);
  if (plVar14 == (long *)0x0) {
    in_stack_00000000 = &UNK_009e5ec8;
code_r0x004c53fc:
    func_0x007a23bc(in_stack_00000000);
    goto LAB_004c5940;
  }
  in_stack_00000688 = 0x1c;
  lVar21 = plVar14[2];
  if (lVar21 == *plVar14) {
    func_0x005bd0a4(plVar14,&UNK_009e5ee0);
  }
  _memcpy(plVar14[1] + lVar21 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  plVar14[2] = lVar21 + 1;
code_r0x004c3ccc:
  param_1 = 0;
  in_x9 = &MACH_HEADER.cpusubtype;
  in_stack_00000680 = 0;
  func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_x4,auStack_7ffffffe + 0x8000066e);
  func_0x004ce364(&stack0x000001f0);
  if (in_stack_000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,in_stack_000001f0 * 0x28,8);
  }
  uVar20 = 1;
  goto code_r0x004c3298;
code_r0x004c3920:
  unaff_x22 = 1;
code_r0x004c3924:
  func_0x0058485c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,unaff_x25);
  in_x10 = (undefined1 *)(in_stack_00000680 & 0xffffffff);
  in_x12 = (undefined1 *)(ulong)uVar20;
  in_stack_000000b0 = in_x4;
  in_stack_00000670 = param_1;
  in_stack_00000678 = in_x9;
  if (in_stack_00000088 == 0) {
    do {
      for (; in_x10 < in_x9;
          in_x10 = (undefined1 *)(ulong)*(uint *)(param_1 + (long)in_x10 * unaff_x19 + 0x20)) {
      }
      do {
        if (in_x9 <= in_x12) goto code_r0x004c3d4c;
        lVar21 = param_1 + (long)in_x12 * unaff_x19;
        in_x12 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
      } while (*(uint *)(lVar21 + 0x28) == in_w11);
    } while( true );
  }
  uVar23 = (in_x17 | 0x400000000000000) ^ in_stack_00000068;
  uVar7 = uVar23 + in_stack_000000e8 ^ (uVar23 >> 0x30 | uVar23 << 0x10);
  uVar23 = uVar23 + in_stack_000000d8;
  uVar9 = uVar23 ^ in_stack_000000d0;
  uVar8 = uVar7 + in_stack_000000e0 ^ (uVar7 >> 0x2b | uVar7 << 0x15);
  uVar7 = (uVar7 + in_stack_000000e0 ^ (in_x17 | 0x400000000000000)) + uVar9;
  uVar10 = uVar7 ^ (uVar9 >> 0x33 | uVar9 << 0xd);
  uVar23 = ((uVar23 >> 0x20 | uVar23 << 0x20) ^ 0xff) + uVar8;
  uVar9 = uVar10 + uVar23;
  uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
  uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
  uVar7 = uVar23 + (uVar7 >> 0x20 | uVar7 << 0x20);
  uVar8 = uVar10 + uVar7;
  uVar7 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
  uVar10 = uVar8 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
  uVar23 = uVar7 + (uVar9 >> 0x20 | uVar9 << 0x20);
  uVar9 = uVar10 + uVar23;
  uVar23 = uVar23 ^ (uVar7 >> 0x30 | uVar7 << 0x10);
  uVar10 = uVar9 ^ (uVar10 >> 0x2f | uVar10 << 0x11);
  uVar7 = uVar23 + (uVar8 >> 0x20 | uVar8 << 0x20);
  uVar8 = uVar7 ^ (uVar23 >> 0x2b | uVar23 << 0x15);
  uVar10 = uVar10 + uVar7 ^ (uVar10 >> 0x33 | uVar10 << 0xd);
  uVar23 = uVar8 + (uVar9 >> 0x20 | uVar9 << 0x20);
  uVar7 = uVar10 + uVar23;
  uVar23 = uVar23 ^ (uVar8 >> 0x30 | uVar8 << 0x10);
  in_x13 = (uVar10 >> 0x2f | uVar10 << 0x11) ^ (uVar23 >> 0x2b | uVar23 << 0x15) ^
           (uVar7 >> 0x20 | uVar7 << 0x20) ^ uVar7;
  bVar36 = (byte)(in_x13 >> 0x39);
  param_2 = CONCAT17(bVar36,CONCAT16(bVar36,CONCAT15(bVar36,CONCAT14(bVar36,CONCAT13(bVar36,CONCAT12
                                                  (bVar36,CONCAT11(bVar36,bVar36)))))));
  unaff_x20 = in_x17;
LAB_004c3a0c:
  do {
    in_x17 = unaff_x20;
    if (in_x10 < in_x9) {
      lVar21 = param_1 + (long)in_x10 * unaff_x19;
      in_x10 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x20);
      in_w14 = *(uint *)(lVar21 + 0x2c);
    }
    else {
      do {
        if (in_x9 <= in_x12) goto code_r0x004c3d4c;
        lVar21 = param_1 + (long)in_x12 * unaff_x19;
        in_x12 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
        in_w14 = *(uint *)(lVar21 + 0x28);
      } while (in_w14 == in_w11);
    }
    unaff_x20 = in_x17;
    if (in_w14 != (uint)in_x4) {
      lVar21 = 0;
      uVar23 = in_x13;
      while( true ) {
        uVar23 = uVar23 & in_stack_00000100;
        uVar46 = *(undefined8 *)(in_stack_000000f0 + uVar23);
        cVar37 = (char)((ulong)uVar46 >> 8);
        cVar38 = (char)((ulong)uVar46 >> 0x10);
        cVar39 = (char)((ulong)uVar46 >> 0x18);
        cVar40 = (char)((ulong)uVar46 >> 0x20);
        cVar41 = (char)((ulong)uVar46 >> 0x28);
        cVar42 = (char)((ulong)uVar46 >> 0x30);
        cVar43 = (char)((ulong)uVar46 >> 0x38);
        for (uVar7 = CONCAT17(-(cVar43 == (char)((ulong)param_2 >> 0x38)),
                              CONCAT16(-(cVar42 == (char)((ulong)param_2 >> 0x30)),
                                       CONCAT15(-(cVar41 == (char)((ulong)param_2 >> 0x28)),
                                                CONCAT14(-(cVar40 == (char)((ulong)param_2 >> 0x20))
                                                         ,CONCAT13(-(cVar39 ==
                                                                    (char)((ulong)param_2 >> 0x18)),
                                                                   CONCAT12(-(cVar38 ==
                                                                             (char)((ulong)param_2
                                                                                   >> 0x10)),
                                                                            CONCAT11(-(cVar37 ==
                                                                                      (char)((ulong)
                                                  param_2 >> 8)),-((char)uVar46 == (char)param_2))))
                                                  )))) & 0x8080808080808080; uVar7 != 0;
            uVar7 = uVar7 - 1 & uVar7) {
          uVar9 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
          if ((int)in_x17 ==
              *(int *)(in_stack_000000b8 +
                      (uVar23 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) &
                      in_stack_00000100) * -8)) goto code_r0x004c3b60;
        }
        bVar36 = NEON_umaxv(CONCAT17(-(cVar43 == -1),
                                     CONCAT16(-(cVar42 == -1),
                                              CONCAT15(-(cVar41 == -1),
                                                       CONCAT14(-(cVar40 == -1),
                                                                CONCAT13(-(cVar39 == -1),
                                                                         CONCAT12(-(cVar38 == -1),
                                                                                  CONCAT11(-(cVar37 
                                                  == -1),-((char)uVar46 == -1)))))))),1);
        if ((bVar36 & 1) != 0) break;
        lVar21 = lVar21 + 8;
        uVar23 = uVar23 + lVar21;
      }
    }
  } while( true );
code_r0x004c3568:
  do {
    uVar19 = (uint)uVar23;
    if (uVar19 == in_stack_000000c8) {
      if (in_stack_000000c8 == uVar18) {
code_r0x004c3650:
        unaff_x22 = 0;
        goto code_r0x004c3924;
      }
      break;
    }
    lVar21 = 0;
    uVar9 = uVar23 & 0xffffffff ^ in_stack_000000c0;
    uVar8 = uVar9 + in_stack_000000e8 ^ (in_stack_000000c0 >> 0x30 | uVar9 << 0x10);
    uVar9 = uVar9 + in_stack_000000d8;
    uVar24 = uVar9 ^ in_stack_000000d0;
    uVar10 = uVar8 + in_stack_000000e0 ^ (uVar8 >> 0x2b | uVar8 << 0x15);
    uVar23 = (uVar8 + in_stack_000000e0 ^ (uVar23 & 0xffffffff | 0x400000000000000)) + uVar24;
    uVar24 = uVar23 ^ (uVar24 >> 0x33 | uVar24 << 0xd);
    uVar9 = ((uVar9 >> 0x20 | uVar9 << 0x20) ^ 0xff) + uVar10;
    uVar8 = uVar24 + uVar9;
    uVar9 = uVar9 ^ (uVar10 >> 0x30 | uVar10 << 0x10);
    uVar24 = uVar8 ^ (uVar24 >> 0x2f | uVar24 << 0x11);
    uVar23 = uVar9 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar10 = uVar24 + uVar23;
    uVar23 = uVar23 ^ (uVar9 >> 0x2b | uVar9 << 0x15);
    uVar24 = uVar10 ^ (uVar24 >> 0x33 | uVar24 << 0xd);
    uVar9 = uVar23 + (uVar8 >> 0x20 | uVar8 << 0x20);
    uVar8 = uVar24 + uVar9;
    uVar9 = uVar9 ^ (uVar23 >> 0x30 | uVar23 << 0x10);
    uVar24 = uVar8 ^ (uVar24 >> 0x2f | uVar24 << 0x11);
    uVar23 = uVar9 + (uVar10 >> 0x20 | uVar10 << 0x20);
    uVar22 = uVar23 ^ (uVar9 >> 0x2b | uVar9 << 0x15);
    uVar10 = uVar24 + uVar23 ^ (uVar24 >> 0x33 | uVar24 << 0xd);
    uVar9 = uVar22 + (uVar8 >> 0x20 | uVar8 << 0x20);
    uVar23 = uVar10 + uVar9;
    uVar9 = uVar9 ^ (uVar22 >> 0x30 | uVar22 << 0x10);
    uVar23 = (uVar10 >> 0x2f | uVar10 << 0x11) ^ (uVar9 >> 0x2b | uVar9 << 0x15) ^
             (uVar23 >> 0x20 | uVar23 << 0x20) ^ uVar23;
    bVar45 = (byte)(uVar23 >> 0x39);
    while( true ) {
      uVar23 = uVar23 & in_stack_00000100;
      uVar46 = *(undefined8 *)(in_stack_000000f0 + uVar23);
      bVar44 = (byte)((ulong)uVar46 >> 8);
      bVar28 = (byte)((ulong)uVar46 >> 0x10);
      bVar29 = (byte)((ulong)uVar46 >> 0x18);
      bVar30 = (byte)((ulong)uVar46 >> 0x20);
      bVar31 = (byte)((ulong)uVar46 >> 0x28);
      bVar32 = (byte)((ulong)uVar46 >> 0x30);
      bVar47 = (byte)((ulong)uVar46 >> 0x38);
      for (uVar9 = CONCAT17(-(bVar47 == bVar45),
                            CONCAT16(-(bVar32 == bVar45),
                                     CONCAT15(-(bVar31 == bVar45),
                                              CONCAT14(-(bVar30 == bVar45),
                                                       CONCAT13(-(bVar29 == bVar45),
                                                                CONCAT12(-(bVar28 == bVar45),
                                                                         CONCAT11(-(bVar44 == bVar45
                                                                                   ),-((byte)uVar46
                                                                                      == bVar45)))))
                                             ))) & 0x8080808080808080; uVar9 != 0;
          uVar9 = uVar9 - 1 & uVar9) {
        uVar8 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
        uVar8 = uVar23 + ((ulong)LZCOUNT(uVar8 >> 0x20 | uVar8 << 0x20) >> 3) & in_stack_00000100;
        if (uVar19 == *(uint *)(in_stack_000000b8 + uVar8 * -8)) {
          uVar23 = (ulong)*(uint *)(in_stack_000000a8 + uVar8 * -8);
          bVar3 = true;
          goto joined_r0x004c355c;
        }
      }
      bVar44 = NEON_umaxv(CONCAT17(-(bVar47 == 0xff),
                                   CONCAT16(-(bVar32 == 0xff),
                                            CONCAT15(-(bVar31 == 0xff),
                                                     CONCAT14(-(bVar30 == 0xff),
                                                              CONCAT13(-(bVar29 == 0xff),
                                                                       CONCAT12(-(bVar28 == 0xff),
                                                                                CONCAT11(-(bVar44 ==
                                                                                          0xff),-((
                                                  byte)uVar46 == 0xff)))))))),1);
      if ((bVar44 & 1) != 0) break;
      lVar21 = lVar21 + 8;
      uVar23 = uVar23 + lVar21;
    }
    bVar3 = false;
joined_r0x004c355c:
    if (uVar19 == uVar18) goto code_r0x004c3650;
  } while (bVar3);
  goto code_r0x004c3408;
code_r0x004c3d4c:
  bVar3 = true;
  param_1 = in_stack_00000670;
  in_x9 = in_stack_00000678;
  goto LAB_004c3d50;
  while( true ) {
    lVar21 = param_1 + (long)(ulong)uVar20 * 0x30;
    uVar20 = *(uint *)(lVar21 + 0x24);
    uVar1 = *(uint *)(lVar21 + 0x28);
    if (uVar1 != in_w11) break;
joined_r0x004c4568:
    if (in_x9 <= (undefined1 *)(ulong)uVar20) goto code_r0x004c48f0;
  }
  in_stack_00000680 = (ulong)uVar20 << 0x20;
joined_r0x004c4538:
  if (in_x9 <= puVar16) {
    puVar16 = (undefined1 *)(in_stack_00000680 >> 0x20);
    while (puVar16 < in_x9) {
      lVar21 = param_1 + (long)puVar16 * 0x30;
      if (*(uint *)(lVar21 + 0x28) != in_w11) goto code_r0x004c48f0;
      puVar16 = (undefined1 *)(ulong)*(uint *)(lVar21 + 0x24);
    }
    uVar20 = 0;
    if (uVar1 == in_stack_00000028._4_4_) {
      uVar20 = in_stack_00000060._4_4_;
    }
    if ((uVar20 & 1) != 0) {
      lVar21 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
      if (lVar21 == 0) {
        puVar6 = &UNK_009e6330;
      }
      else {
        if (*(long *)(lVar21 + 0x10) != 0) {
          lVar13 = *(long *)(lVar21 + 0x10) + -1;
          *(long *)(lVar21 + 0x10) = lVar13;
          lVar21 = *(long *)(lVar21 + 8) + lVar13 * 0x108;
          uVar23 = *(ulong *)(lVar21 + 0x18);
          plVar33 = *(long **)(lVar21 + 0xa8);
          lVar13 = *(long *)(lVar21 + 0xa0);
          lVar27 = *(long *)(lVar21 + 0xb0);
          plVar34 = *(long **)(lVar21 + 0x68);
          plVar14 = *(long **)(lVar21 + 0x60);
          lVar25 = *(long *)(lVar21 + 0x20);
          uVar46 = *(undefined8 *)(lVar21 + 0x40);
          if (uVar23 != 0x21) {
            if (uVar23 != 0x10) {
              puVar4 = (undefined8 *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
              if (puVar4 == (undefined8 *)0x0) {
                func_0x007a23bc(&UNK_009e6420);
                goto LAB_004c5940;
              }
              lVar35 = puVar4[1];
              lVar21 = puVar4[2];
              *puVar4 = 0;
              puVar4[1] = 8;
              puVar4[2] = 0;
              auVar48 = func_0x004bf9d8(in_stack_000000f8,in_stack_00000118._4_4_);
              uVar46 = auVar48._0_8_;
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000138._4_4_);
              if (lVar25 == -0x8000000000000000) {
                func_0x007a23bc(&UNK_009e6438);
                goto LAB_004c5940;
              }
              lVar25 = lVar35 + lVar21 * 0x108;
              func_0x004cc814(auStack_7ffffffe + 0x8000031e,lVar35,lVar25,&UNK_009e6450);
              lVar21 = func_0x005847cc(in_stack_000000f8,uVar46);
              if (lVar21 == 0) {
                func_0x007a23bc(&UNK_009e6468);
                goto LAB_004c5940;
              }
              func_0x004ca0e0(lVar21,auStack_7ffffffe + 0x8000066e,&UNK_009e6480);
              if (uVar23 == 0x16) {
                func_0x004cc974(auStack_7ffffffe + 0x8000066e,lVar21,auVar48._8_8_,&UNK_009e6498);
                _memcpy(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,0x108);
                if (lVar25 - 0xcU < 0x15) {
                  _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
                  func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,
                                  &UNK_009e64b0);
                  goto LAB_004c5940;
                }
                _memcpy(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000052e,0x108);
                if (lVar13 != -0x8000000000000000) {
                  func_0x007a23bc(&UNK_009e64c8);
                  goto LAB_004c5940;
                }
                lVar13 = *plVar33;
                *plVar33 = lVar13 + 1;
                if (lVar13 < 0) {
                  func_0x007a05dc();
                  goto LAB_004c5940;
                }
                func_0x005db1b4(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x800004ee,
                                unaff_x29 + -0xd0,auStack_7ffffffe + 0x8000033e,plVar33,
                                unaff_x29 + -0xf0);
                func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
                func_0x004bb3f8(auStack_7ffffffe + 0x800006c6);
                func_0x004bb3f8(auStack_7ffffffe + 0x8000071e);
                func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
              }
              else {
                if (uVar23 != 0x19) {
                  func_0x007a247c(&UNK_008a2482,0x28,&UNK_009e6528);
                  goto LAB_004c5940;
                }
                func_0x004cc974(auStack_7ffffffe + 0x8000052e,lVar21,auVar48._8_8_,&UNK_009e64e0);
                if (in_stack_00000548 != 0x18) {
                  func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,
                                  &UNK_009e64f8);
                  goto LAB_004c5940;
                }
                func_0x004cea94(unaff_x29 + -0xd0,plVar33,plVar33 + lVar27 * 3,&UNK_009e5910);
                func_0x005dc404(auStack_7ffffffe + 0x8000066e,unaff_x29 + -0xd0,
                                auStack_7ffffffe + 0x80000546,auStack_7ffffffe + 0x8000033e);
                func_0x004bc9dc(auStack_7ffffffe + 0x8000052e);
                func_0x004bc780(auStack_7ffffffe + 0x8000040e);
              }
              func_0x004bdba4(lVar21,auStack_7ffffffe + 0x8000066e,&UNK_009e6510);
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000118._4_4_);
              func_0x004bcba8(auStack_7ffffffe + 0x8000066e);
              pdVar5 = (dword *)func_0x00187bd0(0x28,8);
              if (pdVar5 == (dword *)0x0) {
                func_0x007a1f18(8,0x28);
                goto LAB_004c5940;
              }
              *pdVar5 = in_stack_00000070;
              pdVar5[2] = 0;
              pdVar5[3] = 0;
              pdVar5[4] = 8;
              pdVar5[5] = 0;
              pdVar5[6] = 0;
              pdVar5[7] = 0;
              *(undefined1 *)(pdVar5 + 8) = 0;
              func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8,uVar46,
                              auStack_7ffffffe + 0x8000066e);
              func_0x004bb068(auStack_7ffffffe + 0x8000052e);
              func_0x004bea24(in_stack_000000f8,uVar46,1,in_stack_00000070);
code_r0x004c4f70:
              if ((0x19 < uVar23) || ((1L << (uVar23 & 0x3f) & 0x2410000U) == 0)) {
                func_0x004bba74(&stack0x000001f0);
              }
              in_stack_00000098._4_4_ = 1;
              if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
                func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
              }
              goto code_r0x004c2eb0;
            }
            func_0x00584d50(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_)
            ;
            if (lVar25 == 0) {
              puVar6 = &UNK_009e6360;
            }
            else {
              iVar52 = (int)((ulong)uVar46 >> 0x20);
              func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,
                              in_stack_00000138._4_4_);
              if (lVar25 != -0x8000000000000000) {
                lVar21 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                if (lVar21 == 0) {
                  puVar6 = &UNK_009e6390;
code_r0x004c5498:
                  func_0x007a23bc(puVar6);
                  goto LAB_004c5940;
                }
                if (*(long *)(lVar21 + 0x10) == 0) {
                  if (iVar52 == in_stack_00000138._4_4_) {
                    func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
                    func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
                  }
                  func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                                  unaff_x29 + -0xf0);
                }
                else {
                  puVar4 = (undefined8 *)func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                  if (puVar4 == (undefined8 *)0x0) {
                    puVar6 = &UNK_009e63a8;
                    goto code_r0x004c5498;
                  }
                  puVar4[2] = 0;
                  puVar4[1] = 8;
                  *puVar4 = 0;
                  if (iVar52 != in_stack_00000138._4_4_) {
                    func_0x005cb804(auStack_7ffffffe + 0x8000066e,0);
                    func_0x005cb1c8(auStack_7ffffffe + 0x8000066e);
                  }
                  lVar21 = func_0x00187bd0(0x108,8);
                  if (lVar21 == 0) {
                    func_0x007a1f18(8,0x108);
                    goto LAB_004c5940;
                  }
                  *(undefined8 *)(lVar21 + 0x18) = 0x1d;
                  func_0x005cee30(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000033e,
                                  unaff_x29 + -0xd0,auStack_7ffffffe + 0x80000656);
                  func_0x004bdba4(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                                  &UNK_009e63c0);
                  func_0x004ca0e0(auStack_7ffffffe + 0x800004ee,auStack_7ffffffe + 0x8000066e,
                                  &UNK_009e63d8);
                  func_0x005cf78c(auStack_7ffffffe + 0x8000052e,auStack_7ffffffe + 0x8000066e,
                                  unaff_x29 + -0xd0);
                }
                lVar21 = func_0x005847cc(in_stack_000000f8,in_stack_00000118._4_4_);
                if (lVar21 == 0) {
                  func_0x007a23bc(&UNK_009e63f0);
                  goto LAB_004c5940;
                }
                func_0x004bdba4(lVar21,auStack_7ffffffe + 0x8000066e,&UNK_009e6408);
                pdVar5 = (dword *)func_0x00187bd0(0x28,8);
                if (pdVar5 == (dword *)0x0) {
                  func_0x007a1f18(8,0x28);
                  goto LAB_004c5940;
                }
                *pdVar5 = in_stack_00000070;
                pdVar5[2] = 0;
                pdVar5[3] = 0;
                pdVar5[4] = 8;
                pdVar5[5] = 0;
                pdVar5[6] = 0;
                pdVar5[7] = 0;
                *(undefined1 *)(pdVar5 + 8) = 0;
                func_0x00584c34(unaff_x29 + -0xd0,in_stack_000000f8,in_stack_00000118._4_4_,
                                auStack_7ffffffe + 0x8000066e);
                func_0x004bb068(unaff_x29 + -0xd0);
                func_0x004bea24(in_stack_000000f8,in_stack_00000118._4_4_,1,in_stack_00000070);
                lVar21 = *plVar14;
                *plVar14 = lVar21 + -1;
                LORelease();
                if (lVar21 == 1) {
                  func_0x005d2c74(auStack_7ffffffe + 0x8000044e);
                }
                lVar21 = *plVar34;
                *plVar34 = lVar21 + -1;
                LORelease();
                if (lVar21 == 1) {
                  func_0x005d2c74(auStack_7ffffffe + 0x80000456);
                }
                goto code_r0x004c4f70;
              }
              puVar6 = &UNK_009e6378;
            }
            func_0x007a23bc(puVar6);
            goto LAB_004c5940;
          }
        }
        puVar6 = &UNK_009e6348;
      }
      func_0x007a23bc(puVar6);
LAB_004c5940:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x4c5944);
      (*pcVar2)();
    }
  }
code_r0x004c48f0:
  if (((in_stack_00000038 & 0x100000000) != 0) && (in_stack_000001a0 != 0)) {
    func_0x00187bd4(in_stack_000001a8,in_stack_000001a0 << 2,4);
  }
code_r0x004c2eb0:
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return in_stack_00000098._4_4_ & 1;
}

