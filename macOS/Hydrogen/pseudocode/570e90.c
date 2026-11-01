
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00570e90(uint *param_1)

{
  uint *puVar1;
  ulong *puVar2;
  uint *puVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  code *pcVar9;
  bool bVar10;
  byte bVar11;
  uint uVar12;
  ulong uVar13;
  long lVar14;
  ulong uVar15;
  long *plVar16;
  undefined *puVar17;
  long extraout_x1;
  long *extraout_x1_00;
  long *extraout_x1_01;
  long *extraout_x1_02;
  long *extraout_x1_03;
  long *extraout_x1_04;
  long *extraout_x1_05;
  long *extraout_x1_06;
  long *extraout_x1_07;
  long *extraout_x1_08;
  long *extraout_x1_09;
  long *plVar18;
  long *plVar19;
  long lVar20;
  uint *puVar21;
  uint *puVar22;
  long *plVar23;
  long lVar24;
  uint *puVar25;
  long lVar26;
  uint *in_x11;
  uint *puVar27;
  ulong uVar28;
  long lVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  undefined8 *puVar33;
  uint *unaff_x19;
  uint *puVar34;
  uint *puVar36;
  uint *puVar35;
  long lVar37;
  uint *unaff_x21;
  uint *unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long *unaff_x25;
  ulong unaff_x26;
  long *plVar38;
  uint *unaff_x27;
  uint uVar39;
  long *plVar40;
  byte bVar41;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  byte bVar46;
  byte bVar47;
  undefined8 uVar42;
  byte bVar48;
  undefined1 auVar49 [16];
  undefined *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  uint *in_stack_00000048;
  long *in_stack_00000068;
  long *in_stack_00000080;
  undefined8 in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  ulong in_stack_000000a0;
  uint *in_stack_000000a8;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  uint *in_stack_000000e8;
  long *in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 uStack0000000000000100;
  uint *in_stack_00000108;
  long *in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 uStack0000000000000180;
  uint *in_stack_00000188;
  uint *in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  uint *in_stack_00000210;
  uint *in_stack_00000218;
  uint *in_stack_00000220;
  undefined1 uStack_7ffffffe;
  undefined1 auStack_7ffffffd [2147483645];
  
code_r0x00570e90:
  if (unaff_x25[3] != 0) {
    lVar24 = 0;
    puVar22 = in_x11 + 2;
    uVar31 = (**(long **)in_x11 + 8) * 0x517cc1b727220a95;
    lVar20 = *unaff_x25;
    bVar11 = (byte)(uVar31 >> 0x39);
    while( true ) {
      uVar31 = uVar31 & unaff_x25[1];
      uVar42 = *(undefined8 *)(lVar20 + uVar31);
      bVar41 = (byte)((ulong)uVar42 >> 8);
      bVar43 = (byte)((ulong)uVar42 >> 0x10);
      bVar44 = (byte)((ulong)uVar42 >> 0x18);
      bVar45 = (byte)((ulong)uVar42 >> 0x20);
      bVar46 = (byte)((ulong)uVar42 >> 0x28);
      bVar47 = (byte)((ulong)uVar42 >> 0x30);
      bVar48 = (byte)((ulong)uVar42 >> 0x38);
      for (uVar28 = CONCAT17(-(bVar48 == bVar11),
                             CONCAT16(-(bVar47 == bVar11),
                                      CONCAT15(-(bVar46 == bVar11),
                                               CONCAT14(-(bVar45 == bVar11),
                                                        CONCAT13(-(bVar44 == bVar11),
                                                                 CONCAT12(-(bVar43 == bVar11),
                                                                          CONCAT11(-(bVar41 ==
                                                                                    bVar11),-((byte)
                                                  uVar42 == bVar11)))))))) & 0x8080808080808080;
          uVar28 != 0; uVar28 = uVar28 - 1 & uVar28) {
        uVar32 = (uVar28 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar28 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar32 = (uVar32 & 0xffff0000ffff0000) >> 0x10 | (uVar32 & 0xffff0000ffff) << 0x10;
        uVar32 = uVar31 + ((ulong)LZCOUNT(uVar32 >> 0x20 | uVar32 << 0x20) >> 3) & unaff_x25[1];
        if (**(long **)in_x11 == *(long *)(lVar20 + -0x10 + uVar32 * -0x10)) {
          lVar20 = lVar20 + uVar32 * -0x10;
          lVar26 = *(long *)(lVar20 + -8);
          lVar24 = 0;
          if (lVar26 != 0) {
            lVar24 = lVar26 + -1;
          }
          *(long *)(lVar20 + -8) = lVar24;
          in_x11 = puVar22;
          if (puVar22 == param_1) goto code_r0x00570ed4;
          goto code_r0x00570e90;
        }
      }
      bVar41 = NEON_umaxv(CONCAT17(-(bVar48 == 0xff),
                                   CONCAT16(-(bVar47 == 0xff),
                                            CONCAT15(-(bVar46 == 0xff),
                                                     CONCAT14(-(bVar45 == 0xff),
                                                              CONCAT13(-(bVar44 == 0xff),
                                                                       CONCAT12(-(bVar43 == 0xff),
                                                                                CONCAT11(-(bVar41 ==
                                                                                          0xff),-((
                                                  byte)uVar42 == 0xff)))))))),1);
      if ((bVar41 & 1) != 0) break;
      lVar24 = lVar24 + 8;
      uVar31 = uVar31 + lVar24;
    }
  }
  func_0x007a23bc(&UNK_009ef698);
code_r0x005720f8:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x5720fc);
  (*pcVar9)();
code_r0x00570ed4:
  if (unaff_x22 != (uint *)0x0) {
    func_0x00187bd4(unaff_x19,(long)unaff_x22 << 3,8);
  }
  if (unaff_x24 < (ulong)in_stack_00000080[2]) {
    lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
    func_0x0056dcac(lVar24);
    _memcpy(lVar24,(long)register0x00000008 + 0x210,0x108);
    plVar18 = *(long **)unaff_x21;
    if (plVar18 != (long *)0x0) {
      lVar24 = *plVar18;
      *plVar18 = lVar24 + -1;
      LORelease();
      if (lVar24 == 1) {
        func_0x005d2ac4(unaff_x21);
      }
    }
    unaff_x21[0] = 0;
    unaff_x21[1] = 0;
    if (uStack0000000000000100 != &MACH_HEADER.filetype) {
      func_0x0056d75c(&uStack0000000000000100);
    }
code_r0x0057081c:
    lVar24 = (long)in_stack_000000e8 * 9 + 0x11;
    if (in_stack_000000e8 != (uint *)0x0 && lVar24 != 0) {
      func_0x00187bd4(uStack00000000000000e0 + (long)in_stack_000000e8 * -2 + -2,lVar24,8);
    }
code_r0x0056ff24:
    if ((ulong)in_stack_00000080[2] <= unaff_x26) {
      do {
        do {
          in_stack_00000210 = *(uint **)(unaff_x23 + 0x38);
          puVar21 = *(uint **)(unaff_x23 + 0x40);
          puVar22 = (uint *)0x0;
          func_0x0055915c(&uStack0000000000000180,(long)register0x00000008 + 0x210,&UNK_009eeea8);
          puVar1 = in_stack_00000188;
          puVar25 = uStack0000000000000180;
          if (in_stack_00000190 != (uint *)0x0) {
            puVar3 = in_stack_00000188 + (long)in_stack_00000190;
            puVar27 = in_stack_00000188;
code_r0x0057100c:
            puVar34 = puVar27 + 1;
            uVar31 = (ulong)*puVar27;
            if ((uVar31 < *(ulong *)(unaff_x23 + 0x40)) &&
               (plVar18 = (long *)(*(long *)(unaff_x23 + 0x38) + uVar31 * 0x30),
               *plVar18 != -0x8000000000000000)) {
              puVar22 = (uint *)plVar18[1];
              in_stack_00000210 = puVar22 + plVar18[2] * 0x12;
              func_0x005588c8(&uStack00000000000000e0,(long)register0x00000008 + 0x210,&UNK_009eeea8
                             );
              puVar21 = unaff_x27;
              if (in_stack_000000f0 != (long *)0x0) {
                plVar18 = (long *)0x0;
                plVar23 = extraout_x1_00;
code_r0x005710ac:
                plVar40 = in_stack_000000f0;
                in_stack_00000108 = _UNK_009ee240;
                uStack0000000000000100 = _UNK_009ee238;
                in_stack_00000118 = _UNK_009ee250;
                in_stack_00000110 = _UNK_009ee248;
                if ((in_stack_000000a0 < *(ulong *)(in_stack_00000090 + 0x28)) &&
                   (plVar38 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                      in_stack_000000a0 * 0x20), *plVar38 != -0x8000000000000000)) {
                  plVar38 = (long *)plVar38[2];
                  if (plVar38 != (long *)0x0) {
code_r0x005710dc:
                    do {
                      puVar27 = in_stack_000000e8;
                      if (plVar40 <= plVar18) {
                        puVar17 = &UNK_009ef2c0;
                        goto code_r0x00571e08;
                      }
                      plVar38 = (long *)((long)plVar38 + -1);
                      lVar24 = *(long *)(in_stack_000000e8 + (long)plVar18 * 6 + 4) << 3;
                      plVar19 = *(long **)(in_stack_000000e8 + (long)plVar18 * 6 + 2);
                      do {
                        if (lVar24 == 0) {
                          plVar18 = (long *)((long)plVar18 + 1);
                          goto code_r0x005718ec;
                        }
                        lVar20 = *plVar19;
                        lVar24 = lVar24 + -8;
                        plVar19 = plVar19 + 1;
                      } while (lVar20 == 0);
                      if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
                         (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                            in_stack_000000a0 * 0x20),
                         *plVar19 == -0x8000000000000000)) {
                        puVar17 = &UNK_009ef2d8;
                        goto code_r0x00571da8;
                      }
                      if ((long *)plVar19[2] <= plVar38) {
                        puVar17 = &UNK_009ef2f0;
                        plVar18 = plVar38;
                        plVar40 = (long *)plVar19[2];
code_r0x00571e08:
                        func_0x007a2570(plVar18,plVar40,puVar17);
                        goto code_r0x005720f8;
                      }
                      func_0x0056f78c((long)register0x00000008 + 0x210,
                                      plVar19[1] + (long)plVar38 * 0x108);
                      if ((puVar21 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
                        uVar42 = *(undefined8 *)(in_stack_000000a8 + 0xe);
                        uVar4 = *(undefined8 *)(in_stack_000000a8 + 0x10);
                        puVar35 = in_stack_00000210;
                        do {
                          puVar36 = puVar35 + 2;
                          lVar20 = **(long **)puVar35;
                          uVar28 = func_0x005787f4(uVar42,uVar4,lVar20);
                          lVar24 = 0;
                          uVar32 = uVar28 >> 0x39;
                          while( true ) {
                            uVar28 = uVar28 & *(ulong *)(in_stack_000000a8 + 8);
                            uVar13 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar28);
                            uVar30 = uVar13 ^ uVar32 * 0x101010101010101;
                            for (uVar30 = uVar30 + 0xfefefefefefefeff &
                                          (uVar30 ^ 0xffffffffffffffff) & 0x8080808080808080;
                                uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
                              uVar15 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar15 & 0xffff0000ffff) << 0x10;
                              uVar15 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                                 (uVar28 + ((ulong)LZCOUNT(uVar15 >> 0x20 |
                                                                           uVar15 << 0x20) >> 3) &
                                                 *(ulong *)(in_stack_000000a8 + 8)) * -8);
                              if (*(ulong *)(in_stack_000000a8 + 4) <= uVar15) {
                                func_0x007a2570(uVar15,*(ulong *)(in_stack_000000a8 + 4),
                                                &UNK_009f0c60);
                                goto code_r0x005720f8;
                              }
                              if (lVar20 == *(long *)(*(long *)(in_stack_000000a8 + 2) +
                                                     uVar15 * 0x18)) {
                                if (puVar22 != (uint *)0x0) {
                                  func_0x00187bd4(in_stack_00000210,(long)puVar22 << 3,8);
                                }
                                plVar18 = (long *)((long)plVar18 + 1);
                                goto code_r0x005718ec;
                              }
                            }
                            if ((uVar13 & uVar13 << 1 & 0x8080808080808080) != 0) break;
                            lVar24 = lVar24 + 8;
                            uVar28 = lVar24 + uVar28;
                          }
                          puVar35 = puVar36;
                        } while (puVar36 != in_stack_00000210 + (long)puVar21 * 2);
                      }
                      if (puVar22 != (uint *)0x0) {
                        func_0x00187bd4(in_stack_00000210,(long)puVar22 << 3,8);
                      }
                      if ((long *)plVar19[2] <= plVar38) {
                        puVar17 = &UNK_009ef308;
                        plVar18 = plVar38;
                        plVar40 = (long *)plVar19[2];
                        goto code_r0x00571e08;
                      }
                      func_0x0056f6dc(&uStack0000000000000180,plVar19[1] + (long)plVar38 * 0x108);
                      puVar22 = in_stack_00000188;
                      puVar21 = uStack0000000000000180;
                      auVar49 = func_0x0059038c((long)register0x00000008 + 0x210,in_stack_00000088,
                                                &uStack0000000000000100);
                      plVar23 = auVar49._8_8_;
                      if ((auVar49._0_8_ & 1) == 0) {
                        if (puVar21 != (uint *)0x0) {
                          func_0x00187bd4(puVar22,(long)puVar21 << 3,8);
                          plVar23 = extraout_x1_02;
                        }
                        if ((long *)plVar19[2] <= plVar38) {
                          puVar17 = &UNK_009ef320;
                          plVar18 = plVar38;
                          plVar40 = (long *)plVar19[2];
                          goto code_r0x00571e08;
                        }
                        lVar24 = plVar19[1] + (long)plVar38 * 0x108;
                        if ((*(long *)(lVar24 + 0x18) == 0xf) && (*(long *)(lVar24 + 0x48) == 1)) {
                          plVar23 = *(long **)(lVar24 + 0x40);
                          lVar20 = *plVar23;
                          if (lVar20 < 6) {
                            if (lVar20 < 4) {
                              if (lVar20 - 1U < 3) goto code_r0x00571684;
                            }
                            else if (lVar20 != 4) {
                              uVar28 = func_0x005ca810(plVar23 + 1);
                              goto code_r0x005713b8;
                            }
                          }
                          else if (lVar20 < 9) {
                            if (lVar20 != 6) {
                              if (lVar20 == 7) goto code_r0x00571684;
                              uVar28 = func_0x005ca90c(plVar23 + 1);
                              goto code_r0x005713b8;
                            }
                          }
                          else if (lVar20 == 9) {
                            uVar28 = func_0x005c0b7c(plVar23 + 1);
code_r0x005713b8:
                            if ((uVar28 & 1) != 0) goto code_r0x00571684;
                          }
                          else if ((lVar20 != 10) && (plVar23[1] != -0x8000000000000000))
                          goto code_r0x00571684;
                          func_0x0056f330((long)register0x00000008 + 0x210,plVar23);
                          plVar23 = extraout_x1_03;
                          if ((puVar21 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0))
                          {
                            uVar42 = *(undefined8 *)(in_stack_000000a8 + 0xe);
                            uVar4 = *(undefined8 *)(in_stack_000000a8 + 0x10);
                            puVar35 = puVar22;
                            do {
                              lVar26 = **(long **)puVar35;
                              uVar28 = func_0x005787f4(uVar42,uVar4,lVar26);
                              lVar20 = 0;
                              plVar23 = *(long **)(in_stack_000000a8 + 4);
                              uVar32 = uVar28 >> 0x39;
                              while( true ) {
                                uVar28 = uVar28 & *(ulong *)(in_stack_000000a8 + 8);
                                uVar13 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar28);
                                uVar30 = uVar13 ^ uVar32 * 0x101010101010101;
                                for (uVar30 = uVar30 + 0xfefefefefefefeff &
                                              (uVar30 ^ 0xffffffffffffffff) & 0x8080808080808080;
                                    uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
                                  uVar15 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                                  uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar15 & 0xffff0000ffff) << 0x10;
                                  plVar16 = *(long **)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                                      (uVar28 + ((ulong)LZCOUNT(uVar15 >> 0x20 |
                                                                                uVar15 << 0x20) >> 3
                                                                ) &
                                                      *(ulong *)(in_stack_000000a8 + 8)) * -8);
                                  if (plVar23 <= plVar16) {
                                    func_0x007a2570(plVar16,plVar23,&UNK_009f0c60);
                                    goto code_r0x005720f8;
                                  }
                                  if (lVar26 == *(long *)(*(long *)(in_stack_000000a8 + 2) +
                                                         (long)plVar16 * 0x18)) {
                                    if (puVar22 != (uint *)0x0) {
                                      func_0x00187bd4(puVar22,(long)puVar22 << 3,8);
                                      plVar23 = extraout_x1_05;
                                    }
                                    goto code_r0x00571684;
                                  }
                                }
                                if ((uVar13 & uVar13 << 1 & 0x8080808080808080) != 0) break;
                                lVar20 = lVar20 + 8;
                                uVar28 = lVar20 + uVar28;
                              }
                              puVar35 = puVar35 + 2;
                            } while (puVar35 != puVar22 + (long)puVar21 * 2);
                          }
                          if (puVar22 != (uint *)0x0) {
                            func_0x00187bd4(puVar22,(long)puVar22 << 3,8);
                            plVar23 = extraout_x1_04;
                          }
                          if (((*(long *)(lVar24 + 0x30) != 1) ||
                              (**(long **)(lVar24 + 0x28) != -0x8000000000000000)) ||
                             (lVar20 = *(long *)(puVar27 + (long)plVar18 * 6 + 4), lVar20 == 0))
                          goto code_r0x00571684;
                          lVar20 = lVar20 << 3;
                          plVar16 = *(long **)(puVar27 + (long)plVar18 * 6 + 2);
                          while( true ) {
                            if ((*plVar16 != 0) && (*plVar16 == (*(long **)(lVar24 + 0x28))[1]))
                            break;
                            lVar20 = lVar20 + -8;
                            plVar16 = plVar16 + 1;
                            if (lVar20 == 0) goto code_r0x00571684;
                          }
                          if ((long *)plVar19[2] <= plVar38) {
                            puVar17 = &UNK_009ef338;
                            plVar18 = plVar38;
                            plVar40 = (long *)plVar19[2];
                            goto code_r0x00571e08;
                          }
                          lVar24 = plVar19[1] + (long)plVar38 * 0x108;
                          if (*(long *)(lVar24 + 0x18) != 0xf) {
                            puVar17 = &UNK_009ef350;
                            goto code_r0x00571da8;
                          }
                          if (*(long *)(lVar24 + 0x48) == 0) {
code_r0x00571f7c:
                            puVar17 = &UNK_009ef368;
                            goto code_r0x00571da8;
                          }
                          lVar20 = *(long *)(lVar24 + 0x48) + -1;
                          *(long *)(lVar24 + 0x48) = lVar20;
                          puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
                          puVar22 = (uint *)*puVar33;
                          if (puVar22 == &MACH_HEADER.filetype) goto code_r0x00571f7c;
                          in_stack_000001b8 = puVar33[7];
                          in_stack_000001b0 = puVar33[6];
                          in_stack_000001a8 = puVar33[5];
                          in_stack_000001a0 = puVar33[4];
                          in_stack_00000198 = puVar33[3];
                          in_stack_00000190 = (uint *)puVar33[2];
                          in_stack_00000188 = (uint *)puVar33[1];
                          uStack0000000000000180 = puVar22;
                          if ((*(ulong *)(in_stack_00000090 + 0x40) <= uVar31) ||
                             (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x38) + uVar31 * 0x30
                                                ), *plVar19 == -0x8000000000000000)) {
                            puVar17 = &UNK_009ef380;
                            goto code_r0x00571d88;
                          }
                          plVar23 = (long *)plVar19[2];
                          if (plVar23 <= plVar18) {
code_r0x00571f98:
                            func_0x007a2570(plVar18,plVar23,in_stack_00000008);
                            goto code_r0x005720f8;
                          }
                          if (*plVar16 == 0) {
                            puVar17 = &UNK_009ef3b0;
                            goto code_r0x00571d88;
                          }
                          lVar24 = plVar19[1] + (long)plVar18 * 0x48;
                          puVar2 = (ulong *)(lVar24 + 8);
                          puVar22 = (uint *)((long)register0x00000008 + 0x200);
                          in_stack_00000210 = (uint *)&uStack0000000000000180;
                          puVar21 = (uint *)((long)register0x00000008 + 0x20f);
                          bVar11 = func_0x0056f968((long)register0x00000008 + 0x210,0,puVar2);
                          if (bVar11 == 2) {
                            uVar28 = *puVar2;
                            if ((long)uVar28 < 6) {
                              if ((long)uVar28 < 3) {
                                if (uVar28 < 2) goto code_r0x005717c4;
                                lVar24 = 8;
code_r0x0057177c:
                                bVar11 = func_0x005866f4((long)puVar2 + lVar24,
                                                         (long)register0x00000008 + 0x210);
                              }
                              else if (uVar28 == 3) {
code_r0x00571790:
                                bVar11 = func_0x00585ff4(lVar24 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                              }
                              else {
                                if (uVar28 == 4) goto code_r0x005717c4;
                                bVar11 = func_0x005860f4(lVar24 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                              }
code_r0x005717b8:
                              if (bVar11 != 2) goto code_r0x005717e0;
                            }
                            else if ((long)uVar28 < 9) {
                              if (uVar28 != 6) {
                                if (uVar28 == 7) {
                                  bVar11 = func_0x00580428(lVar24 + 0x10,
                                                           (long)register0x00000008 + 0x210);
                                }
                                else {
                                  bVar11 = func_0x005865f4(lVar24 + 0x10,
                                                           (long)register0x00000008 + 0x210);
                                }
                                goto code_r0x005717b8;
                              }
                            }
                            else {
                              if (uVar28 == 9) {
                                bVar11 = func_0x00585ef4(lVar24 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                                goto code_r0x005717b8;
                              }
                              if (uVar28 != 10) {
                                uVar28 = *(ulong *)(lVar24 + 0x10) ^ 0x8000000000000000;
                                if (1 < uVar28) {
                                  uVar28 = 2;
                                }
                                if (uVar28 != 0) {
                                  if (uVar28 == 2) goto code_r0x00571790;
                                  lVar24 = 0x10;
                                  goto code_r0x0057177c;
                                }
                              }
                            }
code_r0x005717c4:
                            bVar11 = func_0x0056f968((long)register0x00000008 + 0x210,1,puVar2);
                            if (bVar11 != 2) goto code_r0x005717e0;
code_r0x005717e4:
                            uVar8 = in_stack_000001b8;
                            uVar7 = in_stack_000001b0;
                            uVar6 = in_stack_000001a8;
                            uVar4 = in_stack_000001a0;
                            uVar42 = in_stack_00000198;
                            uVar28 = (ulong)in_stack_00000190;
                            puVar22 = in_stack_00000188;
                            puVar21 = uStack0000000000000180;
                            if ((in_stack_000000a0 < *(ulong *)(in_stack_00000090 + 0x28)) &&
                               (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                                  in_stack_000000a0 * 0x20),
                               *plVar19 != -0x8000000000000000)) {
                              plVar23 = (long *)plVar19[2];
                              if (plVar23 <= plVar38) {
                                in_stack_00000008 = &UNK_009ef3e0;
                                goto code_r0x00571f94;
                              }
                              lVar24 = plVar19[1] + (long)plVar38 * 0x108;
                              if (*(long *)(lVar24 + 0x18) == 0xf) {
                                if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                                  func_0x007a23bc(&UNK_009ef410);
                                  goto code_r0x005720f8;
                                }
                                lVar20 = *(long *)(lVar24 + 0x48);
                                if (lVar20 == *(long *)(lVar24 + 0x38)) {
                                  func_0x00582ff0((long *)(lVar24 + 0x38),&UNK_009ef428);
                                  plVar23 = extraout_x1_07;
                                }
                                puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
                                puVar33[5] = uVar6;
                                puVar33[4] = uVar4;
                                puVar33[7] = uVar8;
                                puVar33[6] = uVar7;
                                puVar33[1] = puVar22;
                                *puVar33 = puVar21;
                                puVar33[3] = uVar42;
                                puVar33[2] = uVar28;
                                *(long *)(lVar24 + 0x48) = lVar20 + 1;
                                uVar28 = *(ulong *)(in_stack_00000090 + 0x28);
                                goto joined_r0x005718a8;
                              }
                              puVar17 = &UNK_009ef3f8;
                            }
                            else {
                              puVar17 = &UNK_009ef3c8;
                            }
code_r0x00571d88:
                            func_0x007a23bc(puVar17);
                            goto code_r0x005720f8;
                          }
code_r0x005717e0:
                          if ((bVar11 & 1) == 0) goto code_r0x005717e4;
                          if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                            func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef440);
                            goto code_r0x005720f8;
                          }
                          if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
                             (plVar40 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                                in_stack_000000a0 * 0x20),
                             *plVar40 == -0x8000000000000000)) {
                            puVar17 = &UNK_009ef458;
                            goto code_r0x00571d88;
                          }
                          plVar23 = (long *)plVar40[2];
                          if (plVar23 <= plVar38) {
                            in_stack_00000008 = &UNK_009ef470;
code_r0x00571f94:
                            plVar18 = plVar38;
                            goto code_r0x00571f98;
                          }
                          func_0x0056f6dc((long)register0x00000008 + 0x210,
                                          plVar40[1] + (long)plVar38 * 0x108);
                          if (puVar21 != (uint *)0x0) {
                            puVar27 = in_stack_00000210;
code_r0x00571a44:
                            if (in_stack_00000068[3] != 0) {
                              lVar24 = 0;
                              puVar35 = puVar27 + 2;
                              uVar28 = (**(long **)puVar27 + 8) * 0x517cc1b727220a95;
                              lVar20 = *in_stack_00000068;
                              bVar11 = (byte)(uVar28 >> 0x39);
                              while( true ) {
                                uVar28 = uVar28 & in_stack_00000068[1];
                                uVar42 = *(undefined8 *)(lVar20 + uVar28);
                                bVar41 = (byte)((ulong)uVar42 >> 8);
                                bVar43 = (byte)((ulong)uVar42 >> 0x10);
                                bVar44 = (byte)((ulong)uVar42 >> 0x18);
                                bVar45 = (byte)((ulong)uVar42 >> 0x20);
                                bVar46 = (byte)((ulong)uVar42 >> 0x28);
                                bVar47 = (byte)((ulong)uVar42 >> 0x30);
                                bVar48 = (byte)((ulong)uVar42 >> 0x38);
                                for (uVar32 = CONCAT17(-(bVar48 == bVar11),
                                                       CONCAT16(-(bVar47 == bVar11),
                                                                CONCAT15(-(bVar46 == bVar11),
                                                                         CONCAT14(-(bVar45 == bVar11
                                                                                   ),CONCAT13(-(
                                                  bVar44 == bVar11),
                                                  CONCAT12(-(bVar43 == bVar11),
                                                           CONCAT11(-(bVar41 == bVar11),
                                                                    -((byte)uVar42 == bVar11))))))))
                                              & 0x8080808080808080; uVar32 != 0;
                                    uVar32 = uVar32 - 1 & uVar32) {
                                  uVar30 = (uVar32 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar32 >> 7 & 0xff00ff00ff00ff) << 8;
                                  uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar30 & 0xffff0000ffff) << 0x10;
                                  uVar30 = uVar28 + ((ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20)
                                                    >> 3) & in_stack_00000068[1];
                                  if (**(long **)puVar27 ==
                                      *(long *)(lVar20 + -0x10 + uVar30 * -0x10)) {
                                    lVar20 = lVar20 + uVar30 * -0x10;
                                    lVar26 = *(long *)(lVar20 + -8);
                                    lVar24 = 0;
                                    if (lVar26 != 0) {
                                      lVar24 = lVar26 + -1;
                                    }
                                    *(long *)(lVar20 + -8) = lVar24;
                                    puVar27 = puVar35;
                                    if (puVar35 == in_stack_00000210 + (long)puVar21 * 2)
                                    goto code_r0x00571a8c;
                                    goto code_r0x00571a44;
                                  }
                                }
                                bVar41 = NEON_umaxv(CONCAT17(-(bVar48 == 0xff),
                                                             CONCAT16(-(bVar47 == 0xff),
                                                                      CONCAT15(-(bVar46 == 0xff),
                                                                               CONCAT14(-(bVar45 ==
                                                                                         0xff),
                                                  CONCAT13(-(bVar44 == 0xff),
                                                           CONCAT12(-(bVar43 == 0xff),
                                                                    CONCAT11(-(bVar41 == 0xff),
                                                                             -((byte)uVar42 == 0xff)
                                                                            ))))))),1);
                                if ((bVar41 & 1) != 0) break;
                                lVar24 = lVar24 + 8;
                                uVar28 = uVar28 + lVar24;
                              }
                            }
                            func_0x007a23bc(&UNK_009ef4a0);
                            goto code_r0x005720f8;
                          }
code_r0x00571a8c:
                          if (puVar22 != (uint *)0x0) {
                            func_0x00187bd4(in_stack_00000210,(long)puVar22 * 8,8);
                          }
                          if ((long *)plVar40[2] <= plVar38) {
                            func_0x007a2570(plVar38,(long *)plVar40[2],&UNK_009ef488);
                            goto code_r0x005720f8;
                          }
                          lVar24 = plVar40[1] + (long)plVar38 * 0x108;
                          func_0x0056dcac(lVar24);
                          _memcpy(lVar24,(long)register0x00000008 + 0x210,0x108);
                          plVar23 = (long *)*plVar16;
                          if (plVar23 != (long *)0x0) {
                            lVar24 = *plVar23;
                            *plVar23 = lVar24 + -1;
                            LORelease();
                            if (lVar24 == 1) {
                              func_0x005d2ac4(plVar16);
                            }
                          }
                          *plVar16 = 0;
                          if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                            func_0x0056d75c(&uStack0000000000000180);
                          }
code_r0x005718ec:
                          plVar23 = (long *)((long)in_stack_00000108 * 9 + 0x11);
                          if (!(in_stack_00000108 == (uint *)0x0 || plVar23 == (long *)0x0)) {
                            func_0x00187bd4(uStack0000000000000100 +
                                            (long)in_stack_00000108 * -2 + -2,plVar23,8);
                            plVar23 = extraout_x1_08;
                          }
                          goto code_r0x0057109c;
                        }
code_r0x00571684:
                        uVar28 = *(ulong *)(in_stack_00000090 + 0x28);
                        puVar21 = puVar22;
joined_r0x005718a8:
                        if ((in_stack_000000a0 < uVar28) &&
                           (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                              in_stack_000000a0 * 0x20),
                           *plVar19 != -0x8000000000000000)) {
                          if ((long *)plVar19[2] <= plVar38) {
                            puVar17 = &UNK_009ef4d0;
                            plVar18 = plVar38;
                            plVar40 = (long *)plVar19[2];
                            goto code_r0x00571e08;
                          }
                          func_0x0056f78c((long)register0x00000008 + 0x210,
                                          plVar19[1] + (long)plVar38 * 0x108);
                          func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,
                                          &uStack0000000000000100);
                          plVar23 = extraout_x1_06;
                          goto code_r0x005716f4;
                        }
                        puVar17 = &UNK_009ef4b8;
                        goto code_r0x00571da8;
                      }
                      if (puVar21 == (uint *)0x0) goto code_r0x005716f4;
                      func_0x00187bd4(puVar22,(long)puVar21 << 3,8);
                      plVar23 = extraout_x1_01;
                      in_stack_00000210 = puVar22;
                    } while (plVar38 != (long *)0x0);
                    goto code_r0x00571928;
                  }
                  goto code_r0x00571094;
                }
                puVar17 = &UNK_009ef2a8;
code_r0x00571da8:
                func_0x007a23bc(puVar17,plVar23);
                goto code_r0x005720f8;
              }
              goto code_r0x00571bc8;
            }
            func_0x007a23bc(&UNK_009ef290);
            goto code_r0x005720f8;
          }
code_r0x00571be8:
          if (puVar25 != (uint *)0x0) {
            func_0x00187bd4(puVar1,(long)puVar25 << 2,4);
          }
          uVar31 = in_stack_000000d8;
          lVar24 = in_stack_000000d0;
          if (in_stack_000000d8 != 0) {
            uVar28 = 0;
            do {
              plVar18 = (long *)(lVar24 + uVar28 * 0x18);
              if (plVar18[2] != 0) {
                puVar33 = (undefined8 *)plVar18[1];
                lVar20 = 1 - plVar18[2];
                do {
                  plVar23 = (long *)*puVar33;
                  if (plVar23 != (long *)0x0) {
                    lVar26 = *plVar23;
                    *plVar23 = lVar26 + -1;
                    LORelease();
                    if (lVar26 == 1) {
                      func_0x005d2ac4(puVar33);
                    }
                  }
                  puVar33 = puVar33 + 1;
                  lVar20 = lVar20 + 1;
                } while (lVar20 != 1);
              }
              if (*plVar18 != 0) {
                func_0x00187bd4(plVar18[1],*plVar18 << 3,8);
              }
              uVar28 = uVar28 + 1;
            } while (uVar28 != uVar31);
          }
          if (uStack00000000000000c8 != 0) {
            func_0x00187bd4(in_stack_000000d0,uStack00000000000000c8 * 0x18,8);
          }
          if (in_stack_00000048 == in_stack_00000038) {
            if (in_stack_00000020 != 0) {
              func_0x00187bd4(in_stack_00000028,in_stack_00000020 << 2,4);
            }
            return;
          }
          puVar25 = in_stack_00000048 + 1;
          in_stack_000000a0 = (ulong)*in_stack_00000048;
          if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
             (in_stack_00000080 =
                   (long *)(*(long *)(in_stack_00000090 + 0x20) + in_stack_000000a0 * 0x20),
             *in_stack_00000080 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009ef260);
            goto code_r0x005720f8;
          }
          uVar31 = in_stack_00000080[2];
          if (uVar31 == 0) {
            in_stack_000000d0 = 8;
            lVar24 = in_stack_00000080[2];
          }
          else {
            lVar20 = func_0x00187bd0(uVar31 * 0x18,8);
            if (lVar20 == 0) {
              func_0x007a1f00(8,uVar31 * 0x18,&UNK_009ef278);
              goto code_r0x005720f8;
            }
            lVar24 = in_stack_00000080[2];
            in_stack_000000d0 = lVar20;
          }
          in_stack_000000d8 = 0;
          unaff_x23 = in_stack_00000090;
          in_stack_00000048 = puVar25;
          uStack00000000000000c8 = uVar31;
        } while (lVar24 == 0);
        in_stack_000000d8 = 0;
        lVar20 = in_stack_00000080[1];
        lVar24 = lVar24 * 0x108;
        do {
          in_stack_00000220 = puVar22;
          func_0x0056f6dc((long)register0x00000008 + 0x210,lVar20);
          in_stack_00000190 = in_stack_00000210 + (long)puVar21 * 2;
          uStack0000000000000180 = (uint *)in_stack_00000088;
          in_stack_00000188 = (uint *)in_stack_00000030;
          func_0x005905b4((long)register0x00000008 + 0x210,in_stack_00000210,in_stack_00000210,
                          &uStack0000000000000180);
          uVar31 = in_stack_000000d8;
          in_stack_00000190 = (uint *)((ulong)(extraout_x1 - (long)in_stack_00000210) >> 3);
          uStack0000000000000180 = in_stack_00000220;
          in_stack_00000188 = in_stack_00000210;
          if (in_stack_000000d8 == uStack00000000000000c8) {
            func_0x00582b88(&uStack00000000000000c8,&UNK_009ef800);
          }
          puVar33 = (undefined8 *)(in_stack_000000d0 + uVar31 * 0x18);
          puVar33[1] = in_stack_00000188;
          *puVar33 = uStack0000000000000180;
          puVar33[2] = in_stack_00000190;
          in_stack_000000d8 = uVar31 + 1;
          lVar20 = lVar20 + 0x108;
          lVar24 = lVar24 + -0x108;
          puVar22 = in_stack_00000210;
          puVar21 = in_stack_00000220;
        } while (lVar24 != 0);
      } while (in_stack_00000080[2] == 0);
      unaff_x26 = 0;
      in_stack_00000218 = in_stack_00000210;
    }
    in_stack_000000e8 = _UNK_009ee240;
    uStack00000000000000e0 = _UNK_009ee238;
    in_stack_000000f8 = _UNK_009ee250;
    in_stack_000000f0 = _UNK_009ee248;
    if (unaff_x26 == 0) goto code_r0x0056ff20;
    uVar39 = 1;
    unaff_x24 = unaff_x26;
code_r0x0056ff4c:
    if (in_stack_000000d8 <= unaff_x26) {
      puVar17 = &UNK_009ef4e8;
      uVar31 = in_stack_000000d8;
      goto code_r0x00571ee8;
    }
    unaff_x24 = unaff_x24 - 1;
    lVar24 = in_stack_000000d0 + unaff_x26 * 0x18;
    lVar20 = *(long *)(lVar24 + 0x10) << 3;
    plVar18 = *(long **)(lVar24 + 8);
    do {
      if (lVar20 == 0) {
        unaff_x26 = unaff_x26 + 1;
        unaff_x27 = in_stack_000000a8;
        goto code_r0x0057081c;
      }
      lVar24 = *plVar18;
      lVar20 = lVar20 + -8;
      plVar18 = plVar18 + 1;
    } while (lVar24 == 0);
    if ((ulong)in_stack_00000080[2] <= unaff_x24) {
      puVar17 = &UNK_009ef500;
      uVar31 = in_stack_00000080[2];
      unaff_x26 = unaff_x24;
      goto code_r0x00571ee8;
    }
    func_0x0056f78c((long)register0x00000008 + 0x210,in_stack_00000080[1] + unaff_x24 * 0x108);
    if ((in_stack_00000220 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
      uVar42 = *(undefined8 *)(in_stack_000000a8 + 0xe);
      uVar4 = *(undefined8 *)(in_stack_000000a8 + 0x10);
      puVar22 = in_stack_00000218;
      do {
        puVar21 = puVar22 + 2;
        lVar20 = **(long **)puVar22;
        uVar31 = func_0x005787f4(uVar42,uVar4,lVar20);
        lVar24 = 0;
        uVar28 = uVar31 >> 0x39;
        while( true ) {
          uVar31 = uVar31 & *(ulong *)(in_stack_000000a8 + 8);
          uVar30 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar31);
          uVar32 = uVar30 ^ uVar28 * 0x101010101010101;
          for (uVar32 = uVar32 + 0xfefefefefefefeff & (uVar32 ^ 0xffffffffffffffff) &
                        0x8080808080808080; uVar32 != 0; uVar32 = uVar32 - 1 & uVar32) {
            uVar13 = (uVar32 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar32 >> 7 & 0xff00ff00ff00ff) << 8
            ;
            uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
            uVar13 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                               (uVar31 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) &
                               *(ulong *)(in_stack_000000a8 + 8)) * -8);
            if (*(ulong *)(in_stack_000000a8 + 4) <= uVar13) {
              func_0x007a2570(uVar13,*(ulong *)(in_stack_000000a8 + 4),&UNK_009f0c60);
              goto code_r0x005720f8;
            }
            if (lVar20 == *(long *)(*(long *)(in_stack_000000a8 + 2) + uVar13 * 0x18)) {
              uVar39 = 0;
              goto code_r0x0057004c;
            }
          }
          if ((uVar30 & uVar30 << 1 & 0x8080808080808080) != 0) break;
          lVar24 = lVar24 + 8;
          uVar31 = lVar24 + uVar31;
        }
code_r0x0057004c:
        puVar22 = puVar21;
      } while (puVar21 != in_stack_00000218 + (long)in_stack_00000220 * 2);
    }
    if (in_stack_00000210 != (uint *)0x0) {
      func_0x00187bd4(in_stack_00000218,(long)in_stack_00000210 << 3,8);
    }
    if ((ulong)in_stack_00000080[2] <= unaff_x24) {
      puVar17 = &UNK_009ef518;
      uVar31 = in_stack_00000080[2];
      unaff_x26 = unaff_x24;
      goto code_r0x00571ee8;
    }
    func_0x0056f6dc(&uStack0000000000000180,in_stack_00000080[1] + unaff_x24 * 0x108);
    puVar22 = in_stack_00000188;
    in_stack_00000220 = uStack0000000000000180;
    uVar31 = func_0x0059038c((long)register0x00000008 + 0x210,in_stack_00000088,
                             &uStack00000000000000e0);
    in_stack_00000210 = puVar22;
    if ((uVar31 & 1) != 0) {
      if (in_stack_00000220 != (uint *)0x0) {
        func_0x00187bd4(puVar22,(long)in_stack_00000220 << 3,8);
      }
joined_r0x00570120:
      unaff_x23 = in_stack_00000090;
      in_stack_00000218 = in_stack_00000210;
      if (unaff_x24 == 0) goto code_r0x0057084c;
      goto code_r0x0056ff4c;
    }
    if (in_stack_00000220 != (uint *)0x0) {
      func_0x00187bd4(puVar22,(long)in_stack_00000220 << 3,8);
    }
    if ((ulong)in_stack_00000080[2] <= unaff_x24) {
      puVar17 = &UNK_009ef530;
      uVar31 = in_stack_00000080[2];
      unaff_x26 = unaff_x24;
      goto code_r0x00571ee8;
    }
    lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
    if ((*(long *)(lVar24 + 0x18) == 0xf) && (*(long *)(lVar24 + 0x48) == 1)) {
      plVar18 = *(long **)(lVar24 + 0x40);
      lVar20 = *plVar18;
      if (lVar20 < 6) {
        if (lVar20 < 4) {
          if (lVar20 - 1U < 3) goto code_r0x00570200;
        }
        else if (lVar20 != 4) {
          uVar31 = func_0x005ca810(plVar18 + 1);
          goto code_r0x005701fc;
        }
code_r0x0057020c:
        func_0x0056f330((long)register0x00000008 + 0x210,plVar18);
        lVar20 = 0;
        do {
          lVar26 = lVar20;
          if ((long)in_stack_00000220 * 8 == lVar26) break;
          lVar14 = func_0x0057851c(in_stack_000000a8,*(undefined8 *)((long)puVar22 + lVar26));
          lVar20 = lVar26 + 8;
        } while (lVar14 != 1);
        if (puVar22 != (uint *)0x0) {
          func_0x00187bd4(puVar22,(long)puVar22 << 3,8);
        }
        bVar10 = (long)in_stack_00000220 * 8 != lVar26;
        if (bVar10 && uVar39 == 0) goto code_r0x005706fc;
      }
      else {
        if (8 < lVar20) {
          if (lVar20 == 9) {
            uVar31 = func_0x005c0b7c(plVar18 + 1);
code_r0x005701fc:
            if ((uVar31 & 1) != 0) goto code_r0x00570200;
          }
          else if ((lVar20 != 10) && (plVar18[1] != -0x8000000000000000)) goto code_r0x00570200;
          goto code_r0x0057020c;
        }
        if (lVar20 == 6) goto code_r0x0057020c;
        if (lVar20 != 7) {
          uVar31 = func_0x005ca90c(plVar18 + 1);
          goto code_r0x005701fc;
        }
code_r0x00570200:
        if (uVar39 == 0) goto code_r0x005706fc;
        bVar10 = true;
      }
      plVar18 = *(long **)(lVar24 + 0x28);
      lVar24 = *(long *)(lVar24 + 0x30);
      if ((lVar24 == 1) && (*plVar18 == -0x8000000000000000)) {
        if (in_stack_000000d8 <= unaff_x26) {
          puVar17 = &UNK_009ef548;
          uVar31 = in_stack_000000d8;
          goto code_r0x00571ee8;
        }
        lVar26 = in_stack_000000d0 + unaff_x26 * 0x18;
        lVar20 = *(long *)(lVar26 + 0x10);
        if (lVar20 != 0) {
          lVar20 = lVar20 << 3;
          unaff_x21 = *(uint **)(lVar26 + 8);
          while( true ) {
            if ((*(long *)unaff_x21 != 0) && (*(long *)unaff_x21 == plVar18[1])) break;
            lVar20 = lVar20 + -8;
            unaff_x21 = unaff_x21 + 2;
            if (lVar20 == 0) goto code_r0x005703d0;
          }
          if ((ulong)in_stack_00000080[2] <= unaff_x24) {
            puVar17 = &UNK_009ef560;
            uVar31 = in_stack_00000080[2];
            unaff_x26 = unaff_x24;
            goto code_r0x00571ee8;
          }
          lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
          if (*(long *)(lVar24 + 0x18) != 0xf) {
            puVar17 = &UNK_009ef578;
            goto code_r0x00571e90;
          }
          if (*(long *)(lVar24 + 0x48) == 0) {
code_r0x00572028:
            puVar17 = &UNK_009ef590;
            goto code_r0x00571e90;
          }
          lVar20 = *(long *)(lVar24 + 0x48) + -1;
          *(long *)(lVar24 + 0x48) = lVar20;
          puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
          puVar22 = (uint *)*puVar33;
          if (puVar22 == &MACH_HEADER.filetype) goto code_r0x00572028;
          in_stack_00000138 = puVar33[7];
          in_stack_00000130 = puVar33[6];
          in_stack_00000128 = puVar33[5];
          in_stack_00000120 = puVar33[4];
          in_stack_00000118 = puVar33[3];
          in_stack_00000110 = (long *)puVar33[2];
          in_stack_00000108 = (uint *)puVar33[1];
          uVar31 = in_stack_00000080[2];
          uStack0000000000000100 = puVar22;
          if (uVar31 <= unaff_x26) goto code_r0x00572008;
          if (*(long *)unaff_x21 == 0) {
            puVar17 = &UNK_009ef5c0;
          }
          else {
            lVar24 = in_stack_00000080[1] + unaff_x26 * 0x108;
            in_stack_00000220 = (uint *)((long)register0x00000008 + 0x200);
            uStack0000000000000180 = unaff_x21;
            switch(*(undefined8 *)(lVar24 + 0x18)) {
            case 0xc:
            case 0x11:
            case 0x12:
            case 0x1c:
            case 0x1d:
            case 0x1e:
            case 0x20:
              goto code_r0x00570660;
            case 0xd:
              bVar11 = func_0x005861f4(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0xe:
              bVar11 = func_0x00585df4(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0xf:
              bVar11 = func_0x0057ab80(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x10:
              bVar11 = func_0x0057a880(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x13:
              bVar11 = func_0x0057a980(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x14:
              bVar11 = func_0x0057aa80(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            default:
              bVar11 = func_0x0057a468(lVar24,(long)register0x00000008 + 0x210);
              break;
            case 0x16:
              bVar11 = func_0x0057ad0c(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x17:
              bVar11 = func_0x0057a5f4(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x18:
              bVar11 = func_0x0057a6f4(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x19:
              bVar11 = func_0x0057ae98(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x1a:
              bVar11 = func_0x0057b024(lVar24 + 0x20,(long)register0x00000008 + 0x210);
              break;
            case 0x1b:
              bVar11 = func_0x005863f4(lVar24,(long)register0x00000008 + 0x210);
              break;
            case 0x1f:
              bVar11 = func_0x0057a368(lVar24 + 0x20,(long)register0x00000008 + 0x210);
            }
            if ((bVar11 != 2) && ((bVar11 & 1) != 0)) goto code_r0x00570bfc;
code_r0x00570660:
            uVar8 = in_stack_00000138;
            uVar7 = in_stack_00000130;
            uVar6 = in_stack_00000128;
            uVar4 = in_stack_00000120;
            uVar42 = in_stack_00000118;
            plVar18 = in_stack_00000110;
            in_stack_00000210 = in_stack_00000108;
            puVar22 = uStack0000000000000100;
            uVar31 = in_stack_00000080[2];
            if (uVar31 <= unaff_x24) {
              in_stack_00000000 = &UNK_009ef5d8;
              goto code_r0x00572004;
            }
            lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
            if (*(long *)(lVar24 + 0x18) == 0xf) {
              if (uStack0000000000000100 == &MACH_HEADER.filetype) {
                func_0x007a23bc(&UNK_009ef608);
                goto code_r0x005720f8;
              }
              lVar20 = *(long *)(lVar24 + 0x48);
              if (lVar20 == *(long *)(lVar24 + 0x38)) {
                func_0x00582ff0((long *)(lVar24 + 0x38),&UNK_009ef620);
              }
              puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
              puVar33[5] = uVar6;
              puVar33[4] = uVar4;
              puVar33[7] = uVar8;
              puVar33[6] = uVar7;
              puVar33[1] = in_stack_00000210;
              *puVar33 = puVar22;
              puVar33[3] = uVar42;
              puVar33[2] = plVar18;
              *(long *)(lVar24 + 0x48) = lVar20 + 1;
              goto code_r0x005706fc;
            }
            puVar17 = &UNK_009ef5f0;
          }
          func_0x007a23bc(puVar17);
          goto code_r0x005720f8;
        }
      }
code_r0x005703d0:
      uVar31 = in_stack_00000080[2];
      if (uVar31 <= unaff_x26) {
        puVar17 = &UNK_009ef6b0;
        goto code_r0x00571ee8;
      }
      lVar20 = in_stack_00000080[1] + unaff_x26 * 0x108;
      if (*(long *)(lVar20 + 0x18) == 0x18) {
        lVar29 = lVar24 * 0x18;
        lVar14 = *(long *)(lVar20 + 0x48);
        lVar37 = lVar14 * 0x40;
        lVar26 = lVar14 * -0x40;
        plVar23 = (long *)(*(long *)(lVar20 + 0x40) + lVar37);
        while ((lVar26 != 0 && (plVar23[-8] == 0))) {
          if ((lVar29 == 0) || (*(long *)((long)plVar18 + lVar29 + -0x18) != -0x8000000000000000))
          goto code_r0x005706fc;
          plVar40 = plVar23 + -7;
          lVar5 = lVar29 + -0x10;
          lVar29 = lVar29 + -0x18;
          lVar26 = lVar26 + 0x40;
          plVar23 = plVar23 + -8;
          if (*plVar40 != *(long *)((long)plVar18 + lVar5)) goto code_r0x005706fc;
        }
        if (lVar29 == 0) {
          if (lVar24 == 0) goto code_r0x005704c8;
          if (unaff_x26 < in_stack_000000d8) {
            lVar26 = in_stack_000000d0 + unaff_x26 * 0x18;
            plVar23 = plVar18;
            goto code_r0x0057047c;
          }
          if (*plVar18 == -0x8000000000000000) {
            puVar17 = &UNK_009ef818;
            uVar31 = in_stack_000000d8;
            goto code_r0x00571ee8;
          }
        }
      }
    }
code_r0x005706fc:
    if (unaff_x24 < (ulong)in_stack_00000080[2]) {
      func_0x0056f78c((long)register0x00000008 + 0x210,in_stack_00000080[1] + unaff_x24 * 0x108);
      func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,&uStack00000000000000e0);
      if (unaff_x24 < (ulong)in_stack_00000080[2]) {
        uVar12 = 0;
        lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
        uVar31 = *(long *)(lVar24 + 0x18) - 0xc;
        if (0x14 < uVar31) {
          uVar31 = 9;
        }
        if ((long)uVar31 < 0xc) {
          if ((long)uVar31 < 4) {
            if (uVar31 - 1 < 2) goto code_r0x005707e0;
            if (uVar31 != 0) {
              uVar12 = func_0x005d8948(lVar24 + 0x20);
            }
          }
          else if ((uVar31 - 7 < 5) || (uVar31 - 4 < 2)) {
code_r0x005707e0:
            uVar12 = 1;
          }
        }
        else if ((long)uVar31 < 0x12) {
          if (uVar31 - 0xd < 5) goto code_r0x005707e0;
          uVar12 = func_0x005dba2c(lVar24 + 0x20);
        }
        else if (uVar31 == 0x13) {
          uVar12 = func_0x005cf518(lVar24 + 0x20);
        }
        uVar39 = uVar39 & (uVar12 ^ 1);
        in_stack_00000220 = puVar22;
        goto joined_r0x00570120;
      }
      puVar17 = &UNK_009ef7e8;
      uVar31 = in_stack_00000080[2];
      unaff_x26 = unaff_x24;
    }
    else {
      puVar17 = &UNK_009ef7d0;
      uVar31 = in_stack_00000080[2];
      unaff_x26 = unaff_x24;
    }
    goto code_r0x00571ee8;
  }
  func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef680);
  goto code_r0x005720f8;
code_r0x005716f4:
  in_stack_00000210 = puVar22;
  if (plVar38 == (long *)0x0) goto code_r0x00571928;
  goto code_r0x005710dc;
code_r0x00571928:
  in_stack_00000210 = puVar22;
  if (in_stack_00000108 != (uint *)0x0) {
    lVar24 = (long)in_stack_00000108 * 9 + 0x11;
    plVar23 = (long *)0x0;
    if (lVar24 != 0) {
      func_0x00187bd4(uStack0000000000000100 + (long)in_stack_00000108 * -2 + -2,lVar24,8);
      plVar23 = extraout_x1_09;
    }
  }
code_r0x00571094:
  plVar18 = (long *)((long)plVar18 + 1);
code_r0x0057109c:
  plVar40 = in_stack_000000f0;
  puVar27 = in_stack_000000e8;
  if (in_stack_000000f0 <= plVar18) goto code_r0x00571b28;
  goto code_r0x005710ac;
code_r0x00571b28:
  if (in_stack_000000f0 != (long *)0x0) {
    plVar18 = (long *)0x0;
    do {
      puVar35 = puVar27 + (long)plVar18 * 6;
      if (*(long *)(puVar35 + 4) != 0) {
        puVar33 = *(undefined8 **)(puVar35 + 2);
        lVar24 = 1 - *(long *)(puVar35 + 4);
        do {
          plVar23 = (long *)*puVar33;
          if (plVar23 != (long *)0x0) {
            lVar20 = *plVar23;
            *plVar23 = lVar20 + -1;
            LORelease();
            if (lVar20 == 1) {
              func_0x005d2ac4(puVar33);
            }
          }
          puVar33 = puVar33 + 1;
          lVar24 = lVar24 + 1;
        } while (lVar24 != 1);
      }
      if (*(long *)puVar35 != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar35 + 2),*(long *)puVar35 << 3,8);
      }
      plVar18 = (long *)((long)plVar18 + 1);
    } while (plVar18 != plVar40);
  }
code_r0x00571bc8:
  if (uStack00000000000000e0 != (uint *)0x0) {
    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 * 0x18,8);
  }
  puVar27 = puVar34;
  unaff_x23 = in_stack_00000090;
  unaff_x27 = in_stack_000000a8;
  if (puVar34 == puVar3) goto code_r0x00571be8;
  goto code_r0x0057100c;
code_r0x00570bfc:
  if (uStack0000000000000100 != &MACH_HEADER.filetype) {
    func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef638);
    goto code_r0x005720f8;
  }
  uVar31 = in_stack_00000080[2];
  if (uVar31 <= unaff_x26) {
    in_stack_00000000 = &UNK_009ef650;
    unaff_x24 = unaff_x26;
    goto code_r0x00572004;
  }
  lVar24 = in_stack_00000080[1] + unaff_x26 * 0x108;
  unaff_x22 = (uint *)&uStack0000000000000180;
  in_x11 = (uint *)&uStack0000000000000100;
  switch(*(undefined8 *)(lVar24 + 0x18)) {
  case 0xc:
  case 0x11:
  case 0x12:
  case 0x1c:
  case 0x1d:
  case 0x1e:
  case 0x20:
    goto code_r0x00570dc8;
  case 0xd:
    func_0x005ce834((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0xe:
    func_0x005cea94((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0xf:
    func_0x005d8830((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x10:
    func_0x005cefd0((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x13:
    func_0x005cf868((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x14:
    func_0x005cf868((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  default:
    func_0x005da5fc((long)register0x00000008 + 0x210);
    break;
  case 0x16:
    func_0x005dadec((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x17:
    func_0x005db648((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x18:
    func_0x005dbb64((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x19:
    func_0x005dc058((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x1a:
    func_0x005dc67c((long)register0x00000008 + 0x210,lVar24 + 0x20);
    break;
  case 0x1b:
    func_0x005d7448((long)register0x00000008 + 0x210);
    break;
  case 0x1f:
    func_0x005cf5a0((long)register0x00000008 + 0x210,lVar24 + 0x20);
  }
  if (in_stack_00000220 != (uint *)0x0) {
    lVar24 = 0;
    lVar20 = (long)in_stack_00000220 * 8;
    do {
      puVar33 = *(undefined8 **)((long)&uStack0000000000000100 + lVar24);
      in_x11 = (uint *)puVar33[1];
      unaff_x22 = (uint *)*puVar33;
      in_stack_00000220 = (uint *)puVar33[2];
      puVar33[1] = in_stack_00000018;
      *puVar33 = in_stack_00000010;
      func_0x005af248(&uStack0000000000000180,(long)register0x00000008 + 0x210);
      func_0x0056d75c(puVar33);
      puVar33[1] = in_stack_00000188;
      *puVar33 = uStack0000000000000180;
      puVar33[3] = in_stack_00000198;
      puVar33[2] = in_stack_00000190;
      puVar33[5] = in_stack_000001a8;
      puVar33[4] = in_stack_000001a0;
      puVar33[7] = in_stack_000001b8;
      puVar33[6] = in_stack_000001b0;
      lVar24 = lVar24 + 8;
    } while (lVar20 != lVar24);
  }
  if ((uint *)&uStack0000000000000180 != (uint *)0x0) {
    func_0x00187bd4(&uStack0000000000000100,(long)&uStack0000000000000180 * 8,8);
  }
code_r0x00570dc8:
  uVar31 = in_stack_00000080[2];
  if (uVar31 <= unaff_x24) {
    in_stack_00000000 = &UNK_009ef668;
code_r0x00572004:
    unaff_x26 = unaff_x24;
code_r0x00572008:
    func_0x007a2570(unaff_x26,uVar31,in_stack_00000000);
    goto code_r0x005720f8;
  }
  func_0x0056f6dc((long)register0x00000008 + 0x210,in_stack_00000080[1] + unaff_x24 * 0x108);
  unaff_x19 = in_x11;
  unaff_x23 = in_stack_00000090;
  unaff_x27 = in_stack_000000a8;
  in_stack_00000210 = unaff_x22;
  in_stack_00000218 = in_x11;
  if (in_stack_00000220 != (uint *)0x0) goto code_r0x00570dfc;
  goto code_r0x00570ed4;
code_r0x00570dfc:
  param_1 = in_x11 + (long)in_stack_00000220 * 2;
  unaff_x25 = in_stack_00000068;
  goto code_r0x00570e90;
  while( true ) {
    lVar29 = lVar29 << 3;
    plVar38 = *(long **)(lVar26 + 8);
    while( true ) {
      if ((*plVar38 != 0) && (*plVar38 == plVar23[1])) break;
      lVar29 = lVar29 + -8;
      plVar38 = plVar38 + 1;
      if (lVar29 == 0) goto code_r0x005706fc;
    }
    plVar23 = plVar40;
    if (plVar40 == plVar18 + lVar24 * 3) break;
code_r0x0057047c:
    plVar40 = plVar23 + 3;
    if ((*plVar23 != -0x8000000000000000) || (lVar29 = *(long *)(lVar26 + 0x10), lVar29 == 0))
    goto code_r0x005706fc;
  }
code_r0x005704c8:
  uVar28 = lVar14 - lVar24;
  if ((bVar10) && (uVar28 != 0)) {
    plVar18 = (long *)(*(long *)(lVar20 + 0x40) + 8);
    uVar31 = lVar24 - lVar14;
    do {
      if (lVar37 == 0) goto code_r0x00570884;
      lVar24 = plVar18[-1];
      if (lVar24 < 7) {
        if (lVar24 < 5) {
          if ((lVar24 != 0) && (lVar24 != 4)) goto code_r0x005706fc;
        }
        else if (lVar24 == 5) {
          uVar32 = func_0x005ca810(plVar18);
          goto code_r0x005704e8;
        }
      }
      else {
        if (9 < lVar24) {
          if ((lVar24 == 10) || (*plVar18 == -0x8000000000000000)) goto code_r0x005704ec;
          goto code_r0x005706fc;
        }
        if (lVar24 == 8) {
          uVar32 = func_0x005ca90c(plVar18);
        }
        else {
          if (lVar24 != 9) goto code_r0x005706fc;
          uVar32 = func_0x005c0b7c(plVar18);
        }
code_r0x005704e8:
        if ((uVar32 & 1) != 0) goto code_r0x005706fc;
      }
code_r0x005704ec:
      plVar18 = plVar18 + 8;
      lVar37 = lVar37 + -0x40;
      bVar10 = 0xfffffffffffffffe < uVar31;
      uVar31 = uVar31 + 1;
      if (bVar10) {
code_r0x00570884:
        uVar31 = in_stack_00000080[2];
        break;
      }
    } while( true );
  }
  if (uVar31 <= unaff_x24) {
    puVar17 = &UNK_009ef6c8;
    unaff_x26 = unaff_x24;
code_r0x00571ee8:
    func_0x007a2570(unaff_x26,uVar31,puVar17);
    goto code_r0x005720f8;
  }
  lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
  if (*(long *)(lVar24 + 0x18) == 0xf) {
    if (*(long *)(lVar24 + 0x48) != 0) {
      lVar20 = *(long *)(lVar24 + 0x48) + -1;
      *(long *)(lVar24 + 0x48) = lVar20;
      puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
      puVar22 = (uint *)*puVar33;
      if (puVar22 != &MACH_HEADER.filetype) {
        in_stack_00000190 = (uint *)puVar33[2];
        in_stack_00000188 = (uint *)puVar33[1];
        in_stack_000001a0 = puVar33[4];
        in_stack_00000198 = puVar33[3];
        in_stack_000001b0 = puVar33[6];
        in_stack_000001a8 = puVar33[5];
        in_stack_000001b8 = puVar33[7];
        uStack0000000000000180 = puVar22;
        if ((ulong)in_stack_00000080[2] <= unaff_x26) {
          func_0x007a2570(unaff_x26,in_stack_00000080[2],&UNK_009ef710);
          goto code_r0x005720f8;
        }
        lVar24 = in_stack_00000080[1] + unaff_x26 * 0x108;
        if (*(long *)(lVar24 + 0x18) != 0x18) {
          func_0x007a23bc(&UNK_009ef728);
          goto code_r0x005720f8;
        }
        if (*(ulong *)(lVar24 + 0x48) < uVar28) {
          func_0x007a28bc(uVar28,*(ulong *)(lVar24 + 0x48),&UNK_009edf90);
          goto code_r0x005720f8;
        }
        *(ulong *)(lVar24 + 0x48) = uVar28;
        func_0x005595d0(&uStack0000000000000100,(long)register0x00000008 + 0x210,&UNK_009eeea8);
        uVar31 = (ulong)in_stack_00000190;
        puVar21 = in_stack_00000188;
        puVar22 = uStack0000000000000180;
        lVar20 = *(long *)(lVar24 + 0x48);
        if (lVar20 == *(long *)(lVar24 + 0x38)) {
          func_0x00582ff0(lVar24 + 0x38,&UNK_009ef740);
        }
        puVar33 = (undefined8 *)(*(long *)(lVar24 + 0x40) + lVar20 * 0x40);
        puVar33[5] = in_stack_000001a8;
        puVar33[4] = in_stack_000001a0;
        puVar33[7] = in_stack_000001b8;
        puVar33[6] = in_stack_000001b0;
        puVar33[1] = in_stack_00000188;
        *puVar33 = uStack0000000000000180;
        puVar33[3] = in_stack_00000198;
        puVar33[2] = in_stack_00000190;
        *(long *)(lVar24 + 0x48) = lVar20 + 1;
        if ((ulong)in_stack_00000080[2] <= unaff_x24) {
          func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef758);
          goto code_r0x005720f8;
        }
        func_0x0056f6dc((long)register0x00000008 + 0x210,in_stack_00000080[1] + unaff_x24 * 0x108);
        if (uVar31 == 0) goto code_r0x00570ac8;
        puVar25 = puVar21;
code_r0x00570a84:
        if (in_stack_00000068[3] != 0) {
          lVar24 = 0;
          puVar1 = puVar25 + 2;
          uVar28 = (**(long **)puVar25 + 8) * 0x517cc1b727220a95;
          lVar20 = *in_stack_00000068;
          bVar11 = (byte)(uVar28 >> 0x39);
          while( true ) {
            uVar28 = uVar28 & in_stack_00000068[1];
            uVar42 = *(undefined8 *)(lVar20 + uVar28);
            bVar41 = (byte)((ulong)uVar42 >> 8);
            bVar43 = (byte)((ulong)uVar42 >> 0x10);
            bVar44 = (byte)((ulong)uVar42 >> 0x18);
            bVar45 = (byte)((ulong)uVar42 >> 0x20);
            bVar46 = (byte)((ulong)uVar42 >> 0x28);
            bVar47 = (byte)((ulong)uVar42 >> 0x30);
            bVar48 = (byte)((ulong)uVar42 >> 0x38);
            for (uVar32 = CONCAT17(-(bVar48 == bVar11),
                                   CONCAT16(-(bVar47 == bVar11),
                                            CONCAT15(-(bVar46 == bVar11),
                                                     CONCAT14(-(bVar45 == bVar11),
                                                              CONCAT13(-(bVar44 == bVar11),
                                                                       CONCAT12(-(bVar43 == bVar11),
                                                                                CONCAT11(-(bVar41 ==
                                                                                          bVar11),-(
                                                  (byte)uVar42 == bVar11)))))))) &
                          0x8080808080808080; uVar32 != 0; uVar32 = uVar32 - 1 & uVar32) {
              uVar30 = (uVar32 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar32 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10;
              uVar30 = uVar28 + ((ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20) >> 3) &
                       in_stack_00000068[1];
              if (**(long **)puVar25 == *(long *)(lVar20 + -0x10 + uVar30 * -0x10)) {
                lVar20 = lVar20 + uVar30 * -0x10;
                lVar26 = *(long *)(lVar20 + -8);
                lVar24 = 0;
                if (lVar26 != 0) {
                  lVar24 = lVar26 + -1;
                }
                *(long *)(lVar20 + -8) = lVar24;
                puVar25 = puVar1;
                if (puVar1 == puVar21 + uVar31 * 2) goto code_r0x00570ac8;
                goto code_r0x00570a84;
              }
            }
            bVar41 = NEON_umaxv(CONCAT17(-(bVar48 == 0xff),
                                         CONCAT16(-(bVar47 == 0xff),
                                                  CONCAT15(-(bVar46 == 0xff),
                                                           CONCAT14(-(bVar45 == 0xff),
                                                                    CONCAT13(-(bVar44 == 0xff),
                                                                             CONCAT12(-(bVar43 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar41 == 0xff),-((byte)uVar42 == 0xff)
                                                          ))))))),1);
            if ((bVar41 & 1) != 0) break;
            lVar24 = lVar24 + 8;
            uVar28 = uVar28 + lVar24;
          }
        }
        func_0x007a23bc(&UNK_009ef7b8);
        goto code_r0x005720f8;
      }
    }
    puVar17 = &UNK_009ef6f8;
  }
  else {
    puVar17 = &UNK_009ef6e0;
  }
code_r0x00571e90:
  func_0x007a23bc(puVar17);
  goto code_r0x005720f8;
code_r0x00570ac8:
  if (puVar22 != (uint *)0x0) {
    func_0x00187bd4(puVar21,(long)puVar22 << 3,8);
  }
  if ((ulong)in_stack_00000080[2] <= unaff_x24) {
    func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef770);
    goto code_r0x005720f8;
  }
  lVar24 = in_stack_00000080[1] + unaff_x24 * 0x108;
  func_0x0056dcac(lVar24);
  _memcpy(lVar24,(long)register0x00000008 + 0x210,0x108);
  in_stack_00000210 = in_stack_00000108;
  in_stack_00000220 = uStack0000000000000100;
  puVar22 = in_stack_00000108 + (long)in_stack_00000110 * 2;
  puVar21 = in_stack_00000108;
  in_stack_00000218 = in_stack_00000108;
  if (in_stack_00000110 != (long *)0x0) {
    do {
      in_stack_00000218 = puVar21 + 2;
      plVar18 = *(long **)puVar21;
      if (in_stack_000000d8 <= unaff_x26) {
        func_0x007a2570(unaff_x26,in_stack_000000d8,&UNK_009ef788);
        goto code_r0x005720f8;
      }
      lVar20 = in_stack_000000d0 + unaff_x26 * 0x18;
      lVar24 = *(long *)(lVar20 + 0x10);
      if (lVar24 == 0) {
code_r0x00571f20:
        func_0x007a23bc(&UNK_009ef7a0);
        goto code_r0x005720f8;
      }
      puVar33 = *(undefined8 **)(lVar20 + 8);
      lVar24 = lVar24 << 3;
      while (plVar23 = (long *)*puVar33, plVar23 != plVar18) {
        puVar33 = puVar33 + 1;
        lVar24 = lVar24 + -8;
        if (lVar24 == 0) goto code_r0x00571f20;
      }
      lVar24 = *plVar23;
      *plVar23 = lVar24 + -1;
      LORelease();
      if (lVar24 == 1) {
        func_0x005d2ac4(puVar33);
      }
      *puVar33 = 0;
      lVar24 = *plVar18;
      *plVar18 = lVar24 + -1;
      LORelease();
      if (lVar24 == 1) {
        func_0x005d2ac4((long)register0x00000008 + 0x200);
      }
      puVar21 = in_stack_00000218;
    } while (in_stack_00000218 != puVar22);
  }
  func_0x005928cc((long)register0x00000008 + 0x210);
  unaff_x23 = in_stack_00000090;
  unaff_x27 = in_stack_000000a8;
  goto code_r0x0057081c;
code_r0x0057084c:
  unaff_x27 = in_stack_000000a8;
  if (in_stack_000000e8 != (uint *)0x0) {
    lVar24 = (long)in_stack_000000e8 * 9 + 0x11;
    if (lVar24 != 0) {
      func_0x00187bd4(uStack00000000000000e0 + (long)in_stack_000000e8 * -2 + -2,lVar24,8);
    }
  }
code_r0x0056ff20:
  unaff_x26 = unaff_x26 + 1;
  goto code_r0x0056ff24;
}

