
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00570714(undefined8 param_1,long param_2)

{
  uint *puVar1;
  ulong *puVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  code *pcVar8;
  bool bVar9;
  byte bVar10;
  uint uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long *plVar15;
  undefined *puVar16;
  long extraout_x1;
  ulong uVar17;
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
  long lVar18;
  long *plVar19;
  long lVar20;
  uint *puVar21;
  uint *puVar22;
  long *plVar23;
  uint *puVar24;
  uint *puVar25;
  ulong uVar26;
  long lVar27;
  long lVar28;
  ulong uVar29;
  ulong uVar30;
  long *plVar31;
  undefined8 *puVar32;
  uint *puVar33;
  uint *puVar35;
  uint *puVar34;
  long lVar36;
  long unaff_x23;
  ulong unaff_x24;
  ulong unaff_x26;
  long *plVar37;
  long *unaff_x27;
  uint unaff_w28;
  long *plVar38;
  byte bVar39;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  undefined8 uVar40;
  byte bVar46;
  undefined1 auVar47 [16];
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
  uint *puVar48;
  uint *in_stack_00000218;
  undefined1 uStack_7ffffffe;
  undefined1 auStack_7ffffffd [2147483645];
  
code_r0x00570714:
  func_0x0056f78c((long)register0x00000008 + 0x210,param_2);
  func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,&uStack00000000000000e0);
  uVar17 = unaff_x27[2];
  if (uVar17 <= unaff_x24) {
    puVar16 = &UNK_009ef7e8;
code_r0x00571ee8:
    func_0x007a2570(unaff_x24,uVar17,puVar16);
code_r0x005720f8:
                    /* WARNING: Does not return */
    pcVar8 = (code *)SoftwareBreakpoint(1,0x5720fc);
    (*pcVar8)();
  }
  uVar11 = 0;
  lVar18 = unaff_x27[1] + unaff_x24 * 0x108;
  uVar17 = *(long *)(lVar18 + 0x18) - 0xc;
  if (0x14 < uVar17) {
    uVar17 = 9;
  }
  if ((long)uVar17 < 0xc) {
    if ((long)uVar17 < 4) {
      if (1 < uVar17 - 1) {
        if (uVar17 != 0) {
          uVar11 = func_0x005d8948(lVar18 + 0x20);
        }
        goto LAB_005707e4;
      }
    }
    else if ((4 < uVar17 - 7) && (1 < uVar17 - 4)) goto LAB_005707e4;
  }
  else {
    if (0x11 < (long)uVar17) {
      if (uVar17 == 0x13) {
        uVar11 = func_0x005cf518(lVar18 + 0x20);
      }
      goto LAB_005707e4;
    }
    if (4 < uVar17 - 0xd) {
      uVar11 = func_0x005dba2c(lVar18 + 0x20);
      goto LAB_005707e4;
    }
  }
  uVar11 = 1;
LAB_005707e4:
  unaff_w28 = unaff_w28 & (uVar11 ^ 1);
  puVar22 = in_stack_00000210;
code_r0x005707ec:
  in_stack_00000210 = in_stack_00000218;
  puVar48 = in_stack_00000210;
  if (unaff_x24 != 0) goto LAB_0056ff4c;
LAB_0057084c:
  unaff_x24 = unaff_x26;
  puVar48 = in_stack_00000210;
  if ((in_stack_000000e8 != (uint *)0x0) &&
     (lVar18 = (long)in_stack_000000e8 * 9 + 0x11, lVar18 != 0)) {
    func_0x00187bd4(uStack00000000000000e0 + (long)in_stack_000000e8 * -2 + -2,lVar18,8);
  }
  do {
    unaff_x24 = unaff_x24 + 1;
code_r0x0056ff24:
    if ((ulong)in_stack_00000080[2] <= unaff_x24) {
      do {
        do {
          in_stack_00000210 = *(uint **)(unaff_x23 + 0x38);
          puVar24 = *(uint **)(unaff_x23 + 0x40);
          puVar48 = (uint *)0x0;
          func_0x0055915c(&uStack0000000000000180,(long)register0x00000008 + 0x210,&UNK_009eeea8);
          puVar21 = in_stack_00000188;
          puVar22 = uStack0000000000000180;
          if (in_stack_00000190 != (uint *)0x0) {
            puVar1 = in_stack_00000188 + (long)in_stack_00000190;
            puVar25 = in_stack_00000188;
code_r0x0057100c:
            puVar33 = puVar25 + 1;
            uVar17 = (ulong)*puVar25;
            if ((uVar17 < *(ulong *)(unaff_x23 + 0x40)) &&
               (plVar31 = (long *)(*(long *)(unaff_x23 + 0x38) + uVar17 * 0x30),
               *plVar31 != -0x8000000000000000)) {
              puVar48 = (uint *)plVar31[1];
              in_stack_00000210 = puVar48 + plVar31[2] * 0x12;
              func_0x005588c8(&uStack00000000000000e0,(long)register0x00000008 + 0x210,&UNK_009eeea8
                             );
              puVar24 = in_stack_000000a8;
              if (in_stack_000000f0 != (long *)0x0) {
                plVar31 = (long *)0x0;
                plVar23 = extraout_x1_00;
code_r0x005710ac:
                plVar38 = in_stack_000000f0;
                in_stack_00000108 = _UNK_009ee240;
                uStack0000000000000100 = _UNK_009ee238;
                in_stack_00000118 = _UNK_009ee250;
                in_stack_00000110 = _UNK_009ee248;
                if ((in_stack_000000a0 < *(ulong *)(in_stack_00000090 + 0x28)) &&
                   (plVar37 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                      in_stack_000000a0 * 0x20), *plVar37 != -0x8000000000000000)) {
                  plVar37 = (long *)plVar37[2];
                  if (plVar37 != (long *)0x0) {
code_r0x005710dc:
                    do {
                      puVar25 = in_stack_000000e8;
                      if (plVar38 <= plVar31) {
                        puVar16 = &UNK_009ef2c0;
                        goto code_r0x00571e08;
                      }
                      plVar37 = (long *)((long)plVar37 + -1);
                      lVar18 = *(long *)(in_stack_000000e8 + (long)plVar31 * 6 + 4) << 3;
                      plVar19 = *(long **)(in_stack_000000e8 + (long)plVar31 * 6 + 2);
                      do {
                        if (lVar18 == 0) {
                          plVar31 = (long *)((long)plVar31 + 1);
                          goto code_r0x005718ec;
                        }
                        lVar20 = *plVar19;
                        lVar18 = lVar18 + -8;
                        plVar19 = plVar19 + 1;
                      } while (lVar20 == 0);
                      if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
                         (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                            in_stack_000000a0 * 0x20),
                         *plVar19 == -0x8000000000000000)) {
                        puVar16 = &UNK_009ef2d8;
                        goto code_r0x00571da8;
                      }
                      if ((long *)plVar19[2] <= plVar37) {
                        puVar16 = &UNK_009ef2f0;
                        plVar31 = plVar37;
                        plVar38 = (long *)plVar19[2];
code_r0x00571e08:
                        func_0x007a2570(plVar31,plVar38,puVar16);
                        goto code_r0x005720f8;
                      }
                      func_0x0056f78c((long)register0x00000008 + 0x210,
                                      plVar19[1] + (long)plVar37 * 0x108);
                      if ((puVar24 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
                        uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
                        uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
                        puVar34 = in_stack_00000210;
                        do {
                          puVar35 = puVar34 + 2;
                          lVar20 = **(long **)puVar34;
                          uVar26 = func_0x005787f4(uVar40,uVar3,lVar20);
                          lVar18 = 0;
                          uVar30 = uVar26 >> 0x39;
                          while( true ) {
                            uVar26 = uVar26 & *(ulong *)(in_stack_000000a8 + 8);
                            uVar12 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar26);
                            uVar29 = uVar12 ^ uVar30 * 0x101010101010101;
                            for (uVar29 = uVar29 + 0xfefefefefefefeff &
                                          (uVar29 ^ 0xffffffffffffffff) & 0x8080808080808080;
                                uVar29 != 0; uVar29 = uVar29 - 1 & uVar29) {
                              uVar14 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                              uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar14 & 0xffff0000ffff) << 0x10;
                              uVar14 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                                 (uVar26 + ((ulong)LZCOUNT(uVar14 >> 0x20 |
                                                                           uVar14 << 0x20) >> 3) &
                                                 *(ulong *)(in_stack_000000a8 + 8)) * -8);
                              if (*(ulong *)(in_stack_000000a8 + 4) <= uVar14) {
                                func_0x007a2570(uVar14,*(ulong *)(in_stack_000000a8 + 4),
                                                &UNK_009f0c60);
                                goto code_r0x005720f8;
                              }
                              if (lVar20 == *(long *)(*(long *)(in_stack_000000a8 + 2) +
                                                     uVar14 * 0x18)) {
                                if (puVar48 != (uint *)0x0) {
                                  func_0x00187bd4(in_stack_00000210,(long)puVar48 << 3,8);
                                }
                                plVar31 = (long *)((long)plVar31 + 1);
                                goto code_r0x005718ec;
                              }
                            }
                            if ((uVar12 & uVar12 << 1 & 0x8080808080808080) != 0) break;
                            lVar18 = lVar18 + 8;
                            uVar26 = lVar18 + uVar26;
                          }
                          puVar34 = puVar35;
                        } while (puVar35 != in_stack_00000210 + (long)puVar24 * 2);
                      }
                      if (puVar48 != (uint *)0x0) {
                        func_0x00187bd4(in_stack_00000210,(long)puVar48 << 3,8);
                      }
                      if ((long *)plVar19[2] <= plVar37) {
                        puVar16 = &UNK_009ef308;
                        plVar31 = plVar37;
                        plVar38 = (long *)plVar19[2];
                        goto code_r0x00571e08;
                      }
                      func_0x0056f6dc(&uStack0000000000000180,plVar19[1] + (long)plVar37 * 0x108);
                      puVar48 = in_stack_00000188;
                      puVar24 = uStack0000000000000180;
                      auVar47 = func_0x0059038c((long)register0x00000008 + 0x210,in_stack_00000088,
                                                &uStack0000000000000100);
                      plVar23 = auVar47._8_8_;
                      if ((auVar47._0_8_ & 1) == 0) {
                        if (puVar24 != (uint *)0x0) {
                          func_0x00187bd4(puVar48,(long)puVar24 << 3,8);
                          plVar23 = extraout_x1_02;
                        }
                        if ((long *)plVar19[2] <= plVar37) {
                          puVar16 = &UNK_009ef320;
                          plVar31 = plVar37;
                          plVar38 = (long *)plVar19[2];
                          goto code_r0x00571e08;
                        }
                        lVar18 = plVar19[1] + (long)plVar37 * 0x108;
                        if ((*(long *)(lVar18 + 0x18) == 0xf) && (*(long *)(lVar18 + 0x48) == 1)) {
                          plVar23 = *(long **)(lVar18 + 0x40);
                          lVar20 = *plVar23;
                          if (lVar20 < 6) {
                            if (lVar20 < 4) {
                              if (lVar20 - 1U < 3) goto code_r0x00571684;
                            }
                            else if (lVar20 != 4) {
                              uVar26 = func_0x005ca810(plVar23 + 1);
                              goto code_r0x005713b8;
                            }
                          }
                          else if (lVar20 < 9) {
                            if (lVar20 != 6) {
                              if (lVar20 == 7) goto code_r0x00571684;
                              uVar26 = func_0x005ca90c(plVar23 + 1);
                              goto code_r0x005713b8;
                            }
                          }
                          else if (lVar20 == 9) {
                            uVar26 = func_0x005c0b7c(plVar23 + 1);
code_r0x005713b8:
                            if ((uVar26 & 1) != 0) goto code_r0x00571684;
                          }
                          else if ((lVar20 != 10) && (plVar23[1] != -0x8000000000000000))
                          goto code_r0x00571684;
                          func_0x0056f330((long)register0x00000008 + 0x210,plVar23);
                          plVar23 = extraout_x1_03;
                          if ((puVar24 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0))
                          {
                            uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
                            uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
                            puVar34 = puVar48;
                            do {
                              lVar27 = **(long **)puVar34;
                              uVar26 = func_0x005787f4(uVar40,uVar3,lVar27);
                              lVar20 = 0;
                              plVar23 = *(long **)(in_stack_000000a8 + 4);
                              uVar30 = uVar26 >> 0x39;
                              while( true ) {
                                uVar26 = uVar26 & *(ulong *)(in_stack_000000a8 + 8);
                                uVar12 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar26);
                                uVar29 = uVar12 ^ uVar30 * 0x101010101010101;
                                for (uVar29 = uVar29 + 0xfefefefefefefeff &
                                              (uVar29 ^ 0xffffffffffffffff) & 0x8080808080808080;
                                    uVar29 != 0; uVar29 = uVar29 - 1 & uVar29) {
                                  uVar14 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                                  uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar14 & 0xffff0000ffff) << 0x10;
                                  plVar15 = *(long **)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                                      (uVar26 + ((ulong)LZCOUNT(uVar14 >> 0x20 |
                                                                                uVar14 << 0x20) >> 3
                                                                ) &
                                                      *(ulong *)(in_stack_000000a8 + 8)) * -8);
                                  if (plVar23 <= plVar15) {
                                    func_0x007a2570(plVar15,plVar23,&UNK_009f0c60);
                                    goto code_r0x005720f8;
                                  }
                                  if (lVar27 == *(long *)(*(long *)(in_stack_000000a8 + 2) +
                                                         (long)plVar15 * 0x18)) {
                                    if (puVar48 != (uint *)0x0) {
                                      func_0x00187bd4(puVar48,(long)puVar48 << 3,8);
                                      plVar23 = extraout_x1_05;
                                    }
                                    goto code_r0x00571684;
                                  }
                                }
                                if ((uVar12 & uVar12 << 1 & 0x8080808080808080) != 0) break;
                                lVar20 = lVar20 + 8;
                                uVar26 = lVar20 + uVar26;
                              }
                              puVar34 = puVar34 + 2;
                            } while (puVar34 != puVar48 + (long)puVar24 * 2);
                          }
                          if (puVar48 != (uint *)0x0) {
                            func_0x00187bd4(puVar48,(long)puVar48 << 3,8);
                            plVar23 = extraout_x1_04;
                          }
                          if (((*(long *)(lVar18 + 0x30) != 1) ||
                              (**(long **)(lVar18 + 0x28) != -0x8000000000000000)) ||
                             (lVar20 = *(long *)(puVar25 + (long)plVar31 * 6 + 4), lVar20 == 0))
                          goto code_r0x00571684;
                          lVar20 = lVar20 << 3;
                          plVar15 = *(long **)(puVar25 + (long)plVar31 * 6 + 2);
                          while( true ) {
                            if ((*plVar15 != 0) && (*plVar15 == (*(long **)(lVar18 + 0x28))[1]))
                            break;
                            lVar20 = lVar20 + -8;
                            plVar15 = plVar15 + 1;
                            if (lVar20 == 0) goto code_r0x00571684;
                          }
                          if ((long *)plVar19[2] <= plVar37) {
                            puVar16 = &UNK_009ef338;
                            plVar31 = plVar37;
                            plVar38 = (long *)plVar19[2];
                            goto code_r0x00571e08;
                          }
                          lVar18 = plVar19[1] + (long)plVar37 * 0x108;
                          if (*(long *)(lVar18 + 0x18) != 0xf) {
                            puVar16 = &UNK_009ef350;
                            goto code_r0x00571da8;
                          }
                          if (*(long *)(lVar18 + 0x48) == 0) {
code_r0x00571f7c:
                            puVar16 = &UNK_009ef368;
                            goto code_r0x00571da8;
                          }
                          lVar20 = *(long *)(lVar18 + 0x48) + -1;
                          *(long *)(lVar18 + 0x48) = lVar20;
                          puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
                          puVar48 = (uint *)*puVar32;
                          if (puVar48 == &MACH_HEADER.filetype) goto code_r0x00571f7c;
                          in_stack_000001b8 = puVar32[7];
                          in_stack_000001b0 = puVar32[6];
                          in_stack_000001a8 = puVar32[5];
                          in_stack_000001a0 = puVar32[4];
                          in_stack_00000198 = puVar32[3];
                          in_stack_00000190 = (uint *)puVar32[2];
                          in_stack_00000188 = (uint *)puVar32[1];
                          uStack0000000000000180 = puVar48;
                          if ((*(ulong *)(in_stack_00000090 + 0x40) <= uVar17) ||
                             (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x38) + uVar17 * 0x30
                                                ), *plVar19 == -0x8000000000000000)) {
                            puVar16 = &UNK_009ef380;
                            goto code_r0x00571d88;
                          }
                          plVar23 = (long *)plVar19[2];
                          if (plVar23 <= plVar31) {
code_r0x00571f98:
                            func_0x007a2570(plVar31,plVar23,in_stack_00000008);
                            goto code_r0x005720f8;
                          }
                          if (*plVar15 == 0) {
                            puVar16 = &UNK_009ef3b0;
                            goto code_r0x00571d88;
                          }
                          lVar18 = plVar19[1] + (long)plVar31 * 0x48;
                          puVar2 = (ulong *)(lVar18 + 8);
                          puVar48 = (uint *)((long)register0x00000008 + 0x200);
                          in_stack_00000210 = (uint *)&uStack0000000000000180;
                          puVar24 = (uint *)((long)register0x00000008 + 0x20f);
                          bVar10 = func_0x0056f968((long)register0x00000008 + 0x210,0,puVar2);
                          if (bVar10 == 2) {
                            uVar26 = *puVar2;
                            if ((long)uVar26 < 6) {
                              if ((long)uVar26 < 3) {
                                if (uVar26 < 2) goto code_r0x005717c4;
                                lVar18 = 8;
code_r0x0057177c:
                                bVar10 = func_0x005866f4((long)puVar2 + lVar18,
                                                         (long)register0x00000008 + 0x210);
                              }
                              else if (uVar26 == 3) {
code_r0x00571790:
                                bVar10 = func_0x00585ff4(lVar18 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                              }
                              else {
                                if (uVar26 == 4) goto code_r0x005717c4;
                                bVar10 = func_0x005860f4(lVar18 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                              }
code_r0x005717b8:
                              if (bVar10 != 2) goto code_r0x005717e0;
                            }
                            else if ((long)uVar26 < 9) {
                              if (uVar26 != 6) {
                                if (uVar26 == 7) {
                                  bVar10 = func_0x00580428(lVar18 + 0x10,
                                                           (long)register0x00000008 + 0x210);
                                }
                                else {
                                  bVar10 = func_0x005865f4(lVar18 + 0x10,
                                                           (long)register0x00000008 + 0x210);
                                }
                                goto code_r0x005717b8;
                              }
                            }
                            else {
                              if (uVar26 == 9) {
                                bVar10 = func_0x00585ef4(lVar18 + 0x10,
                                                         (long)register0x00000008 + 0x210);
                                goto code_r0x005717b8;
                              }
                              if (uVar26 != 10) {
                                uVar26 = *(ulong *)(lVar18 + 0x10) ^ 0x8000000000000000;
                                if (1 < uVar26) {
                                  uVar26 = 2;
                                }
                                if (uVar26 != 0) {
                                  if (uVar26 == 2) goto code_r0x00571790;
                                  lVar18 = 0x10;
                                  goto code_r0x0057177c;
                                }
                              }
                            }
code_r0x005717c4:
                            bVar10 = func_0x0056f968((long)register0x00000008 + 0x210,1,puVar2);
                            if (bVar10 != 2) goto code_r0x005717e0;
code_r0x005717e4:
                            uVar7 = in_stack_000001b8;
                            uVar6 = in_stack_000001b0;
                            uVar5 = in_stack_000001a8;
                            uVar3 = in_stack_000001a0;
                            uVar40 = in_stack_00000198;
                            uVar26 = (ulong)in_stack_00000190;
                            puVar48 = in_stack_00000188;
                            puVar24 = uStack0000000000000180;
                            if ((in_stack_000000a0 < *(ulong *)(in_stack_00000090 + 0x28)) &&
                               (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                                  in_stack_000000a0 * 0x20),
                               *plVar19 != -0x8000000000000000)) {
                              plVar23 = (long *)plVar19[2];
                              if (plVar23 <= plVar37) {
                                in_stack_00000008 = &UNK_009ef3e0;
                                goto code_r0x00571f94;
                              }
                              lVar18 = plVar19[1] + (long)plVar37 * 0x108;
                              if (*(long *)(lVar18 + 0x18) == 0xf) {
                                if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                                  func_0x007a23bc(&UNK_009ef410);
                                  goto code_r0x005720f8;
                                }
                                lVar20 = *(long *)(lVar18 + 0x48);
                                if (lVar20 == *(long *)(lVar18 + 0x38)) {
                                  func_0x00582ff0((long *)(lVar18 + 0x38),&UNK_009ef428);
                                  plVar23 = extraout_x1_07;
                                }
                                puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
                                puVar32[5] = uVar5;
                                puVar32[4] = uVar3;
                                puVar32[7] = uVar7;
                                puVar32[6] = uVar6;
                                puVar32[1] = puVar48;
                                *puVar32 = puVar24;
                                puVar32[3] = uVar40;
                                puVar32[2] = uVar26;
                                *(long *)(lVar18 + 0x48) = lVar20 + 1;
                                uVar26 = *(ulong *)(in_stack_00000090 + 0x28);
                                goto joined_r0x005718a8;
                              }
                              puVar16 = &UNK_009ef3f8;
                            }
                            else {
                              puVar16 = &UNK_009ef3c8;
                            }
code_r0x00571d88:
                            func_0x007a23bc(puVar16);
                            goto code_r0x005720f8;
                          }
code_r0x005717e0:
                          if ((bVar10 & 1) == 0) goto code_r0x005717e4;
                          if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                            func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef440);
                            goto code_r0x005720f8;
                          }
                          if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
                             (plVar38 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                                in_stack_000000a0 * 0x20),
                             *plVar38 == -0x8000000000000000)) {
                            puVar16 = &UNK_009ef458;
                            goto code_r0x00571d88;
                          }
                          plVar23 = (long *)plVar38[2];
                          if (plVar23 <= plVar37) {
                            in_stack_00000008 = &UNK_009ef470;
code_r0x00571f94:
                            plVar31 = plVar37;
                            goto code_r0x00571f98;
                          }
                          func_0x0056f6dc((long)register0x00000008 + 0x210,
                                          plVar38[1] + (long)plVar37 * 0x108);
                          if (puVar24 != (uint *)0x0) {
                            puVar25 = in_stack_00000210;
code_r0x00571a44:
                            if (in_stack_00000068[3] != 0) {
                              lVar18 = 0;
                              puVar34 = puVar25 + 2;
                              uVar26 = (**(long **)puVar25 + 8) * 0x517cc1b727220a95;
                              lVar20 = *in_stack_00000068;
                              bVar10 = (byte)(uVar26 >> 0x39);
                              while( true ) {
                                uVar26 = uVar26 & in_stack_00000068[1];
                                uVar40 = *(undefined8 *)(lVar20 + uVar26);
                                bVar39 = (byte)((ulong)uVar40 >> 8);
                                bVar41 = (byte)((ulong)uVar40 >> 0x10);
                                bVar42 = (byte)((ulong)uVar40 >> 0x18);
                                bVar43 = (byte)((ulong)uVar40 >> 0x20);
                                bVar44 = (byte)((ulong)uVar40 >> 0x28);
                                bVar45 = (byte)((ulong)uVar40 >> 0x30);
                                bVar46 = (byte)((ulong)uVar40 >> 0x38);
                                for (uVar30 = CONCAT17(-(bVar46 == bVar10),
                                                       CONCAT16(-(bVar45 == bVar10),
                                                                CONCAT15(-(bVar44 == bVar10),
                                                                         CONCAT14(-(bVar43 == bVar10
                                                                                   ),CONCAT13(-(
                                                  bVar42 == bVar10),
                                                  CONCAT12(-(bVar41 == bVar10),
                                                           CONCAT11(-(bVar39 == bVar10),
                                                                    -((byte)uVar40 == bVar10))))))))
                                              & 0x8080808080808080; uVar30 != 0;
                                    uVar30 = uVar30 - 1 & uVar30) {
                                  uVar29 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                                  uVar29 = (uVar29 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar29 & 0xffff0000ffff) << 0x10;
                                  uVar29 = uVar26 + ((ulong)LZCOUNT(uVar29 >> 0x20 | uVar29 << 0x20)
                                                    >> 3) & in_stack_00000068[1];
                                  if (**(long **)puVar25 ==
                                      *(long *)(lVar20 + -0x10 + uVar29 * -0x10)) {
                                    lVar20 = lVar20 + uVar29 * -0x10;
                                    lVar27 = *(long *)(lVar20 + -8);
                                    lVar18 = 0;
                                    if (lVar27 != 0) {
                                      lVar18 = lVar27 + -1;
                                    }
                                    *(long *)(lVar20 + -8) = lVar18;
                                    puVar25 = puVar34;
                                    if (puVar34 == in_stack_00000210 + (long)puVar24 * 2)
                                    goto code_r0x00571a8c;
                                    goto code_r0x00571a44;
                                  }
                                }
                                bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                                             CONCAT16(-(bVar45 == 0xff),
                                                                      CONCAT15(-(bVar44 == 0xff),
                                                                               CONCAT14(-(bVar43 ==
                                                                                         0xff),
                                                  CONCAT13(-(bVar42 == 0xff),
                                                           CONCAT12(-(bVar41 == 0xff),
                                                                    CONCAT11(-(bVar39 == 0xff),
                                                                             -((byte)uVar40 == 0xff)
                                                                            ))))))),1);
                                if ((bVar39 & 1) != 0) break;
                                lVar18 = lVar18 + 8;
                                uVar26 = uVar26 + lVar18;
                              }
                            }
                            func_0x007a23bc(&UNK_009ef4a0);
                            goto code_r0x005720f8;
                          }
code_r0x00571a8c:
                          if (puVar48 != (uint *)0x0) {
                            func_0x00187bd4(in_stack_00000210,(long)puVar48 * 8,8);
                          }
                          if ((long *)plVar38[2] <= plVar37) {
                            func_0x007a2570(plVar37,(long *)plVar38[2],&UNK_009ef488);
                            goto code_r0x005720f8;
                          }
                          lVar18 = plVar38[1] + (long)plVar37 * 0x108;
                          func_0x0056dcac(lVar18);
                          _memcpy(lVar18,(long)register0x00000008 + 0x210,0x108);
                          plVar23 = (long *)*plVar15;
                          if (plVar23 != (long *)0x0) {
                            lVar18 = *plVar23;
                            *plVar23 = lVar18 + -1;
                            LORelease();
                            if (lVar18 == 1) {
                              func_0x005d2ac4(plVar15);
                            }
                          }
                          *plVar15 = 0;
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
                        uVar26 = *(ulong *)(in_stack_00000090 + 0x28);
                        puVar24 = puVar48;
joined_r0x005718a8:
                        if ((in_stack_000000a0 < uVar26) &&
                           (plVar19 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                              in_stack_000000a0 * 0x20),
                           *plVar19 != -0x8000000000000000)) {
                          if ((long *)plVar19[2] <= plVar37) {
                            puVar16 = &UNK_009ef4d0;
                            plVar31 = plVar37;
                            plVar38 = (long *)plVar19[2];
                            goto code_r0x00571e08;
                          }
                          func_0x0056f78c((long)register0x00000008 + 0x210,
                                          plVar19[1] + (long)plVar37 * 0x108);
                          func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,
                                          &uStack0000000000000100);
                          plVar23 = extraout_x1_06;
                          goto code_r0x005716f4;
                        }
                        puVar16 = &UNK_009ef4b8;
                        goto code_r0x00571da8;
                      }
                      if (puVar24 == (uint *)0x0) goto code_r0x005716f4;
                      func_0x00187bd4(puVar48,(long)puVar24 << 3,8);
                      plVar23 = extraout_x1_01;
                      in_stack_00000210 = puVar48;
                    } while (plVar37 != (long *)0x0);
                    goto code_r0x00571928;
                  }
                  goto code_r0x00571094;
                }
                puVar16 = &UNK_009ef2a8;
code_r0x00571da8:
                func_0x007a23bc(puVar16,plVar23);
                goto code_r0x005720f8;
              }
              goto code_r0x00571bc8;
            }
            func_0x007a23bc(&UNK_009ef290);
            goto code_r0x005720f8;
          }
code_r0x00571be8:
          if (puVar22 != (uint *)0x0) {
            func_0x00187bd4(puVar21,(long)puVar22 << 2,4);
          }
          uVar17 = in_stack_000000d8;
          lVar18 = in_stack_000000d0;
          if (in_stack_000000d8 != 0) {
            uVar26 = 0;
            do {
              plVar31 = (long *)(lVar18 + uVar26 * 0x18);
              if (plVar31[2] != 0) {
                puVar32 = (undefined8 *)plVar31[1];
                lVar20 = 1 - plVar31[2];
                do {
                  plVar23 = (long *)*puVar32;
                  if (plVar23 != (long *)0x0) {
                    lVar27 = *plVar23;
                    *plVar23 = lVar27 + -1;
                    LORelease();
                    if (lVar27 == 1) {
                      func_0x005d2ac4(puVar32);
                    }
                  }
                  puVar32 = puVar32 + 1;
                  lVar20 = lVar20 + 1;
                } while (lVar20 != 1);
              }
              if (*plVar31 != 0) {
                func_0x00187bd4(plVar31[1],*plVar31 << 3,8);
              }
              uVar26 = uVar26 + 1;
            } while (uVar26 != uVar17);
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
          puVar22 = in_stack_00000048 + 1;
          in_stack_000000a0 = (ulong)*in_stack_00000048;
          if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
             (in_stack_00000080 =
                   (long *)(*(long *)(in_stack_00000090 + 0x20) + in_stack_000000a0 * 0x20),
             *in_stack_00000080 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009ef260);
            goto code_r0x005720f8;
          }
          uVar17 = in_stack_00000080[2];
          if (uVar17 == 0) {
            in_stack_000000d0 = 8;
            lVar18 = in_stack_00000080[2];
          }
          else {
            lVar20 = func_0x00187bd0(uVar17 * 0x18,8);
            if (lVar20 == 0) {
              func_0x007a1f00(8,uVar17 * 0x18,&UNK_009ef278);
              goto code_r0x005720f8;
            }
            lVar18 = in_stack_00000080[2];
            in_stack_000000d0 = lVar20;
          }
          in_stack_000000d8 = 0;
          unaff_x23 = in_stack_00000090;
          in_stack_00000048 = puVar22;
          uStack00000000000000c8 = uVar17;
        } while (lVar18 == 0);
        in_stack_000000d8 = 0;
        lVar20 = in_stack_00000080[1];
        lVar18 = lVar18 * 0x108;
        do {
          puVar22 = puVar48;
          func_0x0056f6dc((long)register0x00000008 + 0x210,lVar20);
          in_stack_00000190 = in_stack_00000210 + (long)puVar24 * 2;
          uStack0000000000000180 = (uint *)in_stack_00000088;
          in_stack_00000188 = (uint *)in_stack_00000030;
          func_0x005905b4((long)register0x00000008 + 0x210,in_stack_00000210,in_stack_00000210,
                          &uStack0000000000000180);
          uVar17 = in_stack_000000d8;
          in_stack_00000190 = (uint *)((ulong)(extraout_x1 - (long)in_stack_00000210) >> 3);
          uStack0000000000000180 = puVar22;
          in_stack_00000188 = in_stack_00000210;
          if (in_stack_000000d8 == uStack00000000000000c8) {
            func_0x00582b88(&uStack00000000000000c8,&UNK_009ef800);
          }
          puVar32 = (undefined8 *)(in_stack_000000d0 + uVar17 * 0x18);
          puVar32[1] = in_stack_00000188;
          *puVar32 = uStack0000000000000180;
          puVar32[2] = in_stack_00000190;
          in_stack_000000d8 = uVar17 + 1;
          lVar20 = lVar20 + 0x108;
          lVar18 = lVar18 + -0x108;
          puVar48 = in_stack_00000210;
          puVar24 = puVar22;
        } while (lVar18 != 0);
      } while (in_stack_00000080[2] == 0);
      unaff_x24 = 0;
    }
    in_stack_000000e8 = _UNK_009ee240;
    uStack00000000000000e0 = _UNK_009ee238;
    in_stack_000000f8 = _UNK_009ee250;
    in_stack_000000f0 = _UNK_009ee248;
    if (unaff_x24 != 0) {
      unaff_w28 = 1;
      unaff_x26 = unaff_x24;
      unaff_x27 = in_stack_00000080;
LAB_0056ff4c:
      do {
        if (in_stack_000000d8 <= unaff_x26) {
          puVar16 = &UNK_009ef4e8;
          uVar17 = in_stack_000000d8;
          unaff_x24 = unaff_x26;
          goto code_r0x00571ee8;
        }
        unaff_x24 = unaff_x24 - 1;
        lVar18 = in_stack_000000d0 + unaff_x26 * 0x18;
        lVar20 = *(long *)(lVar18 + 0x10) << 3;
        plVar31 = *(long **)(lVar18 + 8);
        do {
          if (lVar20 == 0) {
            unaff_x26 = unaff_x26 + 1;
            goto code_r0x0057081c;
          }
          lVar18 = *plVar31;
          lVar20 = lVar20 + -8;
          plVar31 = plVar31 + 1;
        } while (lVar18 == 0);
        if ((ulong)unaff_x27[2] <= unaff_x24) {
          puVar16 = &UNK_009ef500;
          uVar17 = unaff_x27[2];
          goto code_r0x00571ee8;
        }
        func_0x0056f78c((long)register0x00000008 + 0x210,unaff_x27[1] + unaff_x24 * 0x108);
        if ((puVar22 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
          uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
          uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
          puVar24 = puVar48;
          do {
            puVar21 = puVar24 + 2;
            lVar20 = **(long **)puVar24;
            uVar17 = func_0x005787f4(uVar40,uVar3,lVar20);
            lVar18 = 0;
            uVar26 = uVar17 >> 0x39;
            while( true ) {
              uVar17 = uVar17 & *(ulong *)(in_stack_000000a8 + 8);
              uVar29 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar17);
              uVar30 = uVar29 ^ uVar26 * 0x101010101010101;
              for (uVar30 = uVar30 + 0xfefefefefefefeff & (uVar30 ^ 0xffffffffffffffff) &
                            0x8080808080808080; uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
                uVar12 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                         (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
                uVar12 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                   (uVar17 + ((ulong)LZCOUNT(uVar12 >> 0x20 | uVar12 << 0x20) >> 3)
                                   & *(ulong *)(in_stack_000000a8 + 8)) * -8);
                if (*(ulong *)(in_stack_000000a8 + 4) <= uVar12) {
                  func_0x007a2570(uVar12,*(ulong *)(in_stack_000000a8 + 4),&UNK_009f0c60);
                  goto code_r0x005720f8;
                }
                if (lVar20 == *(long *)(*(long *)(in_stack_000000a8 + 2) + uVar12 * 0x18)) {
                  unaff_w28 = 0;
                  goto code_r0x0057004c;
                }
              }
              if ((uVar29 & uVar29 << 1 & 0x8080808080808080) != 0) break;
              lVar18 = lVar18 + 8;
              uVar17 = lVar18 + uVar17;
            }
code_r0x0057004c:
            puVar24 = puVar21;
          } while (puVar21 != puVar48 + (long)puVar22 * 2);
        }
        if (in_stack_00000210 != (uint *)0x0) {
          func_0x00187bd4(puVar48,(long)in_stack_00000210 << 3,8);
        }
        if ((ulong)in_stack_00000080[2] <= unaff_x24) {
          puVar16 = &UNK_009ef518;
          uVar17 = in_stack_00000080[2];
          goto code_r0x00571ee8;
        }
        func_0x0056f6dc(&uStack0000000000000180,in_stack_00000080[1] + unaff_x24 * 0x108);
        in_stack_00000210 = in_stack_00000188;
        puVar22 = uStack0000000000000180;
        uVar17 = func_0x0059038c((long)register0x00000008 + 0x210,in_stack_00000088,
                                 &uStack00000000000000e0);
        in_stack_00000218 = in_stack_00000210;
        unaff_x27 = in_stack_00000080;
        if ((uVar17 & 1) == 0) goto code_r0x00570128;
        unaff_x23 = in_stack_00000090;
        if (puVar22 == (uint *)0x0) goto code_r0x005707ec;
        func_0x00187bd4(in_stack_00000210,(long)puVar22 << 3,8);
        puVar48 = in_stack_00000210;
        if (unaff_x24 == 0) goto LAB_0057084c;
      } while( true );
    }
  } while( true );
code_r0x005716f4:
  in_stack_00000210 = puVar48;
  if (plVar37 == (long *)0x0) goto code_r0x00571928;
  goto code_r0x005710dc;
code_r0x00571928:
  in_stack_00000210 = puVar48;
  if (in_stack_00000108 != (uint *)0x0) {
    lVar18 = (long)in_stack_00000108 * 9 + 0x11;
    plVar23 = (long *)0x0;
    if (lVar18 != 0) {
      func_0x00187bd4(uStack0000000000000100 + (long)in_stack_00000108 * -2 + -2,lVar18,8);
      plVar23 = extraout_x1_09;
    }
  }
code_r0x00571094:
  plVar31 = (long *)((long)plVar31 + 1);
code_r0x0057109c:
  plVar38 = in_stack_000000f0;
  puVar25 = in_stack_000000e8;
  if (in_stack_000000f0 <= plVar31) goto code_r0x00571b28;
  goto code_r0x005710ac;
code_r0x00571b28:
  if (in_stack_000000f0 != (long *)0x0) {
    plVar31 = (long *)0x0;
    do {
      puVar34 = puVar25 + (long)plVar31 * 6;
      if (*(long *)(puVar34 + 4) != 0) {
        puVar32 = *(undefined8 **)(puVar34 + 2);
        lVar18 = 1 - *(long *)(puVar34 + 4);
        do {
          plVar23 = (long *)*puVar32;
          if (plVar23 != (long *)0x0) {
            lVar20 = *plVar23;
            *plVar23 = lVar20 + -1;
            LORelease();
            if (lVar20 == 1) {
              func_0x005d2ac4(puVar32);
            }
          }
          puVar32 = puVar32 + 1;
          lVar18 = lVar18 + 1;
        } while (lVar18 != 1);
      }
      if (*(long *)puVar34 != 0) {
        func_0x00187bd4(*(undefined8 *)(puVar34 + 2),*(long *)puVar34 << 3,8);
      }
      plVar31 = (long *)((long)plVar31 + 1);
    } while (plVar31 != plVar38);
  }
code_r0x00571bc8:
  if (uStack00000000000000e0 != (uint *)0x0) {
    func_0x00187bd4(in_stack_000000e8,(long)uStack00000000000000e0 * 0x18,8);
  }
  puVar25 = puVar33;
  unaff_x23 = in_stack_00000090;
  if (puVar33 == puVar1) goto code_r0x00571be8;
  goto code_r0x0057100c;
code_r0x00570128:
  if (puVar22 != (uint *)0x0) {
    func_0x00187bd4(in_stack_00000210,(long)puVar22 << 3,8);
  }
  if ((ulong)in_stack_00000080[2] <= unaff_x24) {
    puVar16 = &UNK_009ef530;
    uVar17 = in_stack_00000080[2];
    goto code_r0x00571ee8;
  }
  lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
  if ((*(long *)(lVar18 + 0x18) != 0xf) || (*(long *)(lVar18 + 0x48) != 1)) goto code_r0x005706fc;
  plVar31 = *(long **)(lVar18 + 0x40);
  lVar20 = *plVar31;
  if (lVar20 < 6) {
    if (lVar20 < 4) {
      if (lVar20 - 1U < 3) goto code_r0x00570200;
    }
    else if (lVar20 != 4) {
      uVar17 = func_0x005ca810(plVar31 + 1);
      goto code_r0x005701fc;
    }
code_r0x0057020c:
    func_0x0056f330((long)register0x00000008 + 0x210,plVar31);
    lVar20 = 0;
    do {
      lVar27 = lVar20;
      if ((long)puVar22 * 8 == lVar27) break;
      lVar13 = func_0x0057851c(in_stack_000000a8,*(undefined8 *)((long)in_stack_00000210 + lVar27));
      lVar20 = lVar27 + 8;
    } while (lVar13 != 1);
    if (in_stack_00000210 != (uint *)0x0) {
      func_0x00187bd4(in_stack_00000210,(long)in_stack_00000210 << 3,8);
    }
    bVar9 = (long)puVar22 * 8 != lVar27;
    if (bVar9 && (unaff_w28 & 1) == 0) goto code_r0x005706fc;
  }
  else {
    if (8 < lVar20) {
      if (lVar20 == 9) {
        uVar17 = func_0x005c0b7c(plVar31 + 1);
code_r0x005701fc:
        if ((uVar17 & 1) != 0) goto code_r0x00570200;
      }
      else if ((lVar20 != 10) && (plVar31[1] != -0x8000000000000000)) goto code_r0x00570200;
      goto code_r0x0057020c;
    }
    if (lVar20 == 6) goto code_r0x0057020c;
    if (lVar20 != 7) {
      uVar17 = func_0x005ca90c(plVar31 + 1);
      goto code_r0x005701fc;
    }
code_r0x00570200:
    if ((unaff_w28 & 1) == 0) goto code_r0x005706fc;
    bVar9 = true;
  }
  plVar31 = *(long **)(lVar18 + 0x28);
  lVar18 = *(long *)(lVar18 + 0x30);
  if ((lVar18 == 1) && (*plVar31 == -0x8000000000000000)) {
    if (in_stack_000000d8 <= unaff_x26) {
      puVar16 = &UNK_009ef548;
      uVar17 = in_stack_000000d8;
      unaff_x24 = unaff_x26;
      goto code_r0x00571ee8;
    }
    lVar27 = in_stack_000000d0 + unaff_x26 * 0x18;
    lVar20 = *(long *)(lVar27 + 0x10);
    if (lVar20 != 0) {
      lVar20 = lVar20 << 3;
      puVar24 = *(uint **)(lVar27 + 8);
code_r0x005702d0:
      if ((*(long *)puVar24 == 0) || (*(long *)puVar24 != plVar31[1])) goto code_r0x005702c4;
      if ((ulong)in_stack_00000080[2] <= unaff_x24) {
        puVar16 = &UNK_009ef560;
        uVar17 = in_stack_00000080[2];
        goto code_r0x00571ee8;
      }
      lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
      if (*(long *)(lVar18 + 0x18) != 0xf) {
        puVar16 = &UNK_009ef578;
        goto code_r0x00571e90;
      }
      if (*(long *)(lVar18 + 0x48) == 0) {
code_r0x00572028:
        puVar16 = &UNK_009ef590;
        goto code_r0x00571e90;
      }
      lVar20 = *(long *)(lVar18 + 0x48) + -1;
      *(long *)(lVar18 + 0x48) = lVar20;
      puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
      puVar22 = (uint *)*puVar32;
      if (puVar22 == &MACH_HEADER.filetype) goto code_r0x00572028;
      in_stack_00000138 = puVar32[7];
      in_stack_00000130 = puVar32[6];
      in_stack_00000128 = puVar32[5];
      in_stack_00000120 = puVar32[4];
      in_stack_00000118 = puVar32[3];
      in_stack_00000110 = (long *)puVar32[2];
      in_stack_00000108 = (uint *)puVar32[1];
      uVar17 = in_stack_00000080[2];
      uStack0000000000000100 = puVar22;
      if (uVar17 <= unaff_x26) goto code_r0x00572008;
      if (*(long *)puVar24 == 0) {
        puVar16 = &UNK_009ef5c0;
code_r0x00571e50:
        func_0x007a23bc(puVar16);
        goto code_r0x005720f8;
      }
      lVar18 = in_stack_00000080[1] + unaff_x26 * 0x108;
      puVar22 = (uint *)((long)register0x00000008 + 0x200);
      uStack0000000000000180 = puVar24;
      switch(*(undefined8 *)(lVar18 + 0x18)) {
      case 0xc:
      case 0x11:
      case 0x12:
      case 0x1c:
      case 0x1d:
      case 0x1e:
      case 0x20:
        goto code_r0x00570660;
      case 0xd:
        bVar10 = func_0x005861f4(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0xe:
        bVar10 = func_0x00585df4(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0xf:
        bVar10 = func_0x0057ab80(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x10:
        bVar10 = func_0x0057a880(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x13:
        bVar10 = func_0x0057a980(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x14:
        bVar10 = func_0x0057aa80(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      default:
        bVar10 = func_0x0057a468(lVar18,(long)register0x00000008 + 0x210);
        break;
      case 0x16:
        bVar10 = func_0x0057ad0c(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x17:
        bVar10 = func_0x0057a5f4(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x18:
        bVar10 = func_0x0057a6f4(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x19:
        bVar10 = func_0x0057ae98(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x1a:
        bVar10 = func_0x0057b024(lVar18 + 0x20,(long)register0x00000008 + 0x210);
        break;
      case 0x1b:
        bVar10 = func_0x005863f4(lVar18,(long)register0x00000008 + 0x210);
        break;
      case 0x1f:
        bVar10 = func_0x0057a368(lVar18 + 0x20,(long)register0x00000008 + 0x210);
      }
      if ((bVar10 != 2) && ((bVar10 & 1) != 0)) {
        if (uStack0000000000000100 != &MACH_HEADER.filetype) {
          func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef638);
          goto code_r0x005720f8;
        }
        uVar17 = in_stack_00000080[2];
        if (uVar17 <= unaff_x26) {
          in_stack_00000000 = &UNK_009ef650;
          unaff_x24 = unaff_x26;
          goto code_r0x00572004;
        }
        lVar18 = in_stack_00000080[1] + unaff_x26 * 0x108;
        in_stack_00000210 = (uint *)&uStack0000000000000180;
        puVar48 = (uint *)&uStack0000000000000100;
        switch(*(undefined8 *)(lVar18 + 0x18)) {
        case 0xc:
        case 0x11:
        case 0x12:
        case 0x1c:
        case 0x1d:
        case 0x1e:
        case 0x20:
          goto code_r0x00570dc8;
        case 0xd:
          func_0x005ce834((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0xe:
          func_0x005cea94((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0xf:
          func_0x005d8830((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x10:
          func_0x005cefd0((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x13:
          func_0x005cf868((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x14:
          func_0x005cf868((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        default:
          func_0x005da5fc((long)register0x00000008 + 0x210);
          break;
        case 0x16:
          func_0x005dadec((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x17:
          func_0x005db648((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x18:
          func_0x005dbb64((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x19:
          func_0x005dc058((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x1a:
          func_0x005dc67c((long)register0x00000008 + 0x210,lVar18 + 0x20);
          break;
        case 0x1b:
          func_0x005d7448((long)register0x00000008 + 0x210);
          break;
        case 0x1f:
          func_0x005cf5a0((long)register0x00000008 + 0x210,lVar18 + 0x20);
        }
        if (puVar22 != (uint *)0x0) {
          lVar18 = 0;
          lVar20 = (long)puVar22 * 8;
          do {
            puVar32 = *(undefined8 **)((long)&uStack0000000000000100 + lVar18);
            puVar48 = (uint *)puVar32[1];
            in_stack_00000210 = (uint *)*puVar32;
            puVar22 = (uint *)puVar32[2];
            puVar32[1] = in_stack_00000018;
            *puVar32 = in_stack_00000010;
            func_0x005af248(&uStack0000000000000180,(long)register0x00000008 + 0x210);
            func_0x0056d75c(puVar32);
            puVar32[1] = in_stack_00000188;
            *puVar32 = uStack0000000000000180;
            puVar32[3] = in_stack_00000198;
            puVar32[2] = in_stack_00000190;
            puVar32[5] = in_stack_000001a8;
            puVar32[4] = in_stack_000001a0;
            puVar32[7] = in_stack_000001b8;
            puVar32[6] = in_stack_000001b0;
            lVar18 = lVar18 + 8;
          } while (lVar20 != lVar18);
        }
        if ((uint *)&uStack0000000000000180 != (uint *)0x0) {
          func_0x00187bd4(&uStack0000000000000100,(long)&uStack0000000000000180 * 8,8);
        }
code_r0x00570dc8:
        uVar17 = in_stack_00000080[2];
        if (unaff_x24 < uVar17) {
          func_0x0056f6dc((long)register0x00000008 + 0x210,in_stack_00000080[1] + unaff_x24 * 0x108)
          ;
          if (puVar22 != (uint *)0x0) {
            puVar21 = puVar48;
FUN_00570e90:
            if (in_stack_00000068[3] != 0) {
              lVar18 = 0;
              puVar1 = puVar21 + 2;
              uVar17 = (**(long **)puVar21 + 8) * 0x517cc1b727220a95;
              lVar20 = *in_stack_00000068;
              bVar10 = (byte)(uVar17 >> 0x39);
              while( true ) {
                uVar17 = uVar17 & in_stack_00000068[1];
                uVar40 = *(undefined8 *)(lVar20 + uVar17);
                bVar39 = (byte)((ulong)uVar40 >> 8);
                bVar41 = (byte)((ulong)uVar40 >> 0x10);
                bVar42 = (byte)((ulong)uVar40 >> 0x18);
                bVar43 = (byte)((ulong)uVar40 >> 0x20);
                bVar44 = (byte)((ulong)uVar40 >> 0x28);
                bVar45 = (byte)((ulong)uVar40 >> 0x30);
                bVar46 = (byte)((ulong)uVar40 >> 0x38);
                for (uVar26 = CONCAT17(-(bVar46 == bVar10),
                                       CONCAT16(-(bVar45 == bVar10),
                                                CONCAT15(-(bVar44 == bVar10),
                                                         CONCAT14(-(bVar43 == bVar10),
                                                                  CONCAT13(-(bVar42 == bVar10),
                                                                           CONCAT12(-(bVar41 ==
                                                                                     bVar10),
                                                  CONCAT11(-(bVar39 == bVar10),
                                                           -((byte)uVar40 == bVar10)))))))) &
                              0x8080808080808080; uVar26 != 0; uVar26 = uVar26 - 1 & uVar26) {
                  uVar30 = (uVar26 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                           (uVar26 >> 7 & 0xff00ff00ff00ff) << 8;
                  uVar30 = (uVar30 & 0xffff0000ffff0000) >> 0x10 | (uVar30 & 0xffff0000ffff) << 0x10
                  ;
                  uVar30 = uVar17 + ((ulong)LZCOUNT(uVar30 >> 0x20 | uVar30 << 0x20) >> 3) &
                           in_stack_00000068[1];
                  if (**(long **)puVar21 == *(long *)(lVar20 + -0x10 + uVar30 * -0x10)) {
                    lVar20 = lVar20 + uVar30 * -0x10;
                    lVar27 = *(long *)(lVar20 + -8);
                    lVar18 = 0;
                    if (lVar27 != 0) {
                      lVar18 = lVar27 + -1;
                    }
                    *(long *)(lVar20 + -8) = lVar18;
                    puVar21 = puVar1;
                    if (puVar1 == puVar48 + (long)puVar22 * 2) goto code_r0x00570ed4;
                    goto FUN_00570e90;
                  }
                }
                bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                             CONCAT16(-(bVar45 == 0xff),
                                                      CONCAT15(-(bVar44 == 0xff),
                                                               CONCAT14(-(bVar43 == 0xff),
                                                                        CONCAT13(-(bVar42 == 0xff),
                                                                                 CONCAT12(-(bVar41 
                                                  == 0xff),CONCAT11(-(bVar39 == 0xff),
                                                                    -((byte)uVar40 == 0xff)))))))),1
                                   );
                if ((bVar39 & 1) != 0) break;
                lVar18 = lVar18 + 8;
                uVar17 = uVar17 + lVar18;
              }
            }
            func_0x007a23bc(&UNK_009ef698);
            goto code_r0x005720f8;
          }
code_r0x00570ed4:
          if (in_stack_00000210 != (uint *)0x0) {
            func_0x00187bd4(puVar48,(long)in_stack_00000210 << 3,8);
          }
          if ((ulong)in_stack_00000080[2] <= unaff_x24) {
            func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef680);
            goto code_r0x005720f8;
          }
          lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
          func_0x0056dcac(lVar18);
          _memcpy(lVar18,(long)register0x00000008 + 0x210,0x108);
          plVar31 = *(long **)puVar24;
          if (plVar31 != (long *)0x0) {
            lVar18 = *plVar31;
            *plVar31 = lVar18 + -1;
            LORelease();
            if (lVar18 == 1) {
              func_0x005d2ac4(puVar24);
            }
          }
          puVar24[0] = 0;
          puVar24[1] = 0;
          unaff_x23 = in_stack_00000090;
          if (uStack0000000000000100 != &MACH_HEADER.filetype) {
            func_0x0056d75c(&uStack0000000000000100);
          }
          goto code_r0x0057081c;
        }
        in_stack_00000000 = &UNK_009ef668;
code_r0x00572004:
        unaff_x26 = unaff_x24;
code_r0x00572008:
        func_0x007a2570(unaff_x26,uVar17,in_stack_00000000);
        goto code_r0x005720f8;
      }
code_r0x00570660:
      uVar7 = in_stack_00000138;
      uVar6 = in_stack_00000130;
      uVar5 = in_stack_00000128;
      uVar3 = in_stack_00000120;
      uVar40 = in_stack_00000118;
      plVar31 = in_stack_00000110;
      in_stack_00000218 = in_stack_00000108;
      in_stack_00000210 = uStack0000000000000100;
      uVar17 = in_stack_00000080[2];
      if (uVar17 <= unaff_x24) {
        in_stack_00000000 = &UNK_009ef5d8;
        goto code_r0x00572004;
      }
      lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
      if (*(long *)(lVar18 + 0x18) != 0xf) {
        puVar16 = &UNK_009ef5f0;
        goto code_r0x00571e50;
      }
      if (uStack0000000000000100 == &MACH_HEADER.filetype) {
        func_0x007a23bc(&UNK_009ef608);
        goto code_r0x005720f8;
      }
      lVar20 = *(long *)(lVar18 + 0x48);
      if (lVar20 == *(long *)(lVar18 + 0x38)) {
        func_0x00582ff0((long *)(lVar18 + 0x38),&UNK_009ef620);
      }
      puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
      puVar32[5] = uVar5;
      puVar32[4] = uVar3;
      puVar32[7] = uVar7;
      puVar32[6] = uVar6;
      puVar32[1] = in_stack_00000218;
      *puVar32 = in_stack_00000210;
      puVar32[3] = uVar40;
      puVar32[2] = plVar31;
      *(long *)(lVar18 + 0x48) = lVar20 + 1;
      goto code_r0x005706fc;
    }
  }
code_r0x005703d0:
  uVar17 = in_stack_00000080[2];
  if (uVar17 <= unaff_x26) {
    puVar16 = &UNK_009ef6b0;
    unaff_x24 = unaff_x26;
    goto code_r0x00571ee8;
  }
  lVar20 = in_stack_00000080[1] + unaff_x26 * 0x108;
  if (*(long *)(lVar20 + 0x18) == 0x18) {
    lVar28 = lVar18 * 0x18;
    lVar13 = *(long *)(lVar20 + 0x48);
    lVar36 = lVar13 * 0x40;
    lVar27 = lVar13 * -0x40;
    plVar23 = (long *)(*(long *)(lVar20 + 0x40) + lVar36);
    while ((lVar27 != 0 && (plVar23[-8] == 0))) {
      if ((lVar28 == 0) || (*(long *)((long)plVar31 + lVar28 + -0x18) != -0x8000000000000000))
      goto code_r0x005706fc;
      plVar38 = plVar23 + -7;
      lVar4 = lVar28 + -0x10;
      lVar28 = lVar28 + -0x18;
      lVar27 = lVar27 + 0x40;
      plVar23 = plVar23 + -8;
      if (*plVar38 != *(long *)((long)plVar31 + lVar4)) goto code_r0x005706fc;
    }
    if (lVar28 == 0) {
      if (lVar18 != 0) {
        if (in_stack_000000d8 <= unaff_x26) {
          if (*plVar31 == -0x8000000000000000) {
            puVar16 = &UNK_009ef818;
            uVar17 = in_stack_000000d8;
            unaff_x24 = unaff_x26;
            goto code_r0x00571ee8;
          }
          goto code_r0x005706fc;
        }
        lVar27 = in_stack_000000d0 + unaff_x26 * 0x18;
        plVar23 = plVar31;
        do {
          plVar38 = plVar23 + 3;
          if ((*plVar23 != -0x8000000000000000) || (lVar28 = *(long *)(lVar27 + 0x10), lVar28 == 0))
          goto code_r0x005706fc;
          lVar28 = lVar28 << 3;
          plVar37 = *(long **)(lVar27 + 8);
          while( true ) {
            if ((*plVar37 != 0) && (*plVar37 == plVar23[1])) break;
            lVar28 = lVar28 + -8;
            plVar37 = plVar37 + 1;
            if (lVar28 == 0) goto code_r0x005706fc;
          }
          plVar23 = plVar38;
        } while (plVar38 != plVar31 + lVar18 * 3);
      }
      uVar26 = lVar13 - lVar18;
      if ((bVar9) && (uVar26 != 0)) {
        plVar31 = (long *)(*(long *)(lVar20 + 0x40) + 8);
        lVar18 = lVar18 - lVar13;
        do {
          if (lVar36 == 0) break;
          lVar20 = plVar31[-1];
          if (lVar20 < 7) {
            if (lVar20 < 5) {
              if ((lVar20 != 0) && (lVar20 != 4)) goto code_r0x005706fc;
            }
            else if (lVar20 == 5) {
              uVar17 = func_0x005ca810(plVar31);
              goto code_r0x005704e8;
            }
          }
          else if (lVar20 < 10) {
            if (lVar20 == 8) {
              uVar17 = func_0x005ca90c(plVar31);
            }
            else {
              if (lVar20 != 9) goto code_r0x005706fc;
              uVar17 = func_0x005c0b7c(plVar31);
            }
code_r0x005704e8:
            if ((uVar17 & 1) != 0) goto code_r0x005706fc;
          }
          else if ((lVar20 != 10) && (*plVar31 != -0x8000000000000000)) goto code_r0x005706fc;
          plVar31 = plVar31 + 8;
          lVar36 = lVar36 + -0x40;
          bVar9 = lVar18 != -1;
          lVar18 = lVar18 + 1;
        } while (bVar9);
        uVar17 = in_stack_00000080[2];
      }
      if (uVar17 <= unaff_x24) {
        puVar16 = &UNK_009ef6c8;
        goto code_r0x00571ee8;
      }
      lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
      if (*(long *)(lVar18 + 0x18) == 0xf) {
        if (*(long *)(lVar18 + 0x48) != 0) {
          lVar20 = *(long *)(lVar18 + 0x48) + -1;
          *(long *)(lVar18 + 0x48) = lVar20;
          puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
          puVar22 = (uint *)*puVar32;
          if (puVar22 != &MACH_HEADER.filetype) {
            in_stack_00000190 = (uint *)puVar32[2];
            in_stack_00000188 = (uint *)puVar32[1];
            in_stack_000001a0 = puVar32[4];
            in_stack_00000198 = puVar32[3];
            in_stack_000001b0 = puVar32[6];
            in_stack_000001a8 = puVar32[5];
            in_stack_000001b8 = puVar32[7];
            uStack0000000000000180 = puVar22;
            if ((ulong)in_stack_00000080[2] <= unaff_x26) {
              func_0x007a2570(unaff_x26,in_stack_00000080[2],&UNK_009ef710);
              goto code_r0x005720f8;
            }
            lVar18 = in_stack_00000080[1] + unaff_x26 * 0x108;
            if (*(long *)(lVar18 + 0x18) != 0x18) {
              func_0x007a23bc(&UNK_009ef728);
              goto code_r0x005720f8;
            }
            if (*(ulong *)(lVar18 + 0x48) < uVar26) {
              func_0x007a28bc(uVar26,*(ulong *)(lVar18 + 0x48),&UNK_009edf90);
              goto code_r0x005720f8;
            }
            *(ulong *)(lVar18 + 0x48) = uVar26;
            func_0x005595d0(&uStack0000000000000100,(long)register0x00000008 + 0x210,&UNK_009eeea8);
            uVar17 = (ulong)in_stack_00000190;
            puVar48 = in_stack_00000188;
            puVar22 = uStack0000000000000180;
            lVar20 = *(long *)(lVar18 + 0x48);
            if (lVar20 == *(long *)(lVar18 + 0x38)) {
              func_0x00582ff0(lVar18 + 0x38,&UNK_009ef740);
            }
            puVar32 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar20 * 0x40);
            puVar32[5] = in_stack_000001a8;
            puVar32[4] = in_stack_000001a0;
            puVar32[7] = in_stack_000001b8;
            puVar32[6] = in_stack_000001b0;
            puVar32[1] = in_stack_00000188;
            *puVar32 = uStack0000000000000180;
            puVar32[3] = in_stack_00000198;
            puVar32[2] = in_stack_00000190;
            *(long *)(lVar18 + 0x48) = lVar20 + 1;
            if ((ulong)in_stack_00000080[2] <= unaff_x24) {
              func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef758);
              goto code_r0x005720f8;
            }
            func_0x0056f6dc((long)register0x00000008 + 0x210,
                            in_stack_00000080[1] + unaff_x24 * 0x108);
            if (uVar17 != 0) {
              puVar24 = puVar48;
code_r0x00570a84:
              if (in_stack_00000068[3] != 0) {
                lVar18 = 0;
                puVar21 = puVar24 + 2;
                uVar26 = (**(long **)puVar24 + 8) * 0x517cc1b727220a95;
                lVar20 = *in_stack_00000068;
                bVar10 = (byte)(uVar26 >> 0x39);
                while( true ) {
                  uVar26 = uVar26 & in_stack_00000068[1];
                  uVar40 = *(undefined8 *)(lVar20 + uVar26);
                  bVar39 = (byte)((ulong)uVar40 >> 8);
                  bVar41 = (byte)((ulong)uVar40 >> 0x10);
                  bVar42 = (byte)((ulong)uVar40 >> 0x18);
                  bVar43 = (byte)((ulong)uVar40 >> 0x20);
                  bVar44 = (byte)((ulong)uVar40 >> 0x28);
                  bVar45 = (byte)((ulong)uVar40 >> 0x30);
                  bVar46 = (byte)((ulong)uVar40 >> 0x38);
                  for (uVar30 = CONCAT17(-(bVar46 == bVar10),
                                         CONCAT16(-(bVar45 == bVar10),
                                                  CONCAT15(-(bVar44 == bVar10),
                                                           CONCAT14(-(bVar43 == bVar10),
                                                                    CONCAT13(-(bVar42 == bVar10),
                                                                             CONCAT12(-(bVar41 ==
                                                                                       bVar10),
                                                  CONCAT11(-(bVar39 == bVar10),
                                                           -((byte)uVar40 == bVar10)))))))) &
                                0x8080808080808080; uVar30 != 0; uVar30 = uVar30 - 1 & uVar30) {
                    uVar29 = (uVar30 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                             (uVar30 >> 7 & 0xff00ff00ff00ff) << 8;
                    uVar29 = (uVar29 & 0xffff0000ffff0000) >> 0x10 |
                             (uVar29 & 0xffff0000ffff) << 0x10;
                    uVar29 = uVar26 + ((ulong)LZCOUNT(uVar29 >> 0x20 | uVar29 << 0x20) >> 3) &
                             in_stack_00000068[1];
                    if (**(long **)puVar24 == *(long *)(lVar20 + -0x10 + uVar29 * -0x10)) {
                      lVar20 = lVar20 + uVar29 * -0x10;
                      lVar27 = *(long *)(lVar20 + -8);
                      lVar18 = 0;
                      if (lVar27 != 0) {
                        lVar18 = lVar27 + -1;
                      }
                      *(long *)(lVar20 + -8) = lVar18;
                      puVar24 = puVar21;
                      if (puVar21 == puVar48 + uVar17 * 2) goto code_r0x00570ac8;
                      goto code_r0x00570a84;
                    }
                  }
                  bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                               CONCAT16(-(bVar45 == 0xff),
                                                        CONCAT15(-(bVar44 == 0xff),
                                                                 CONCAT14(-(bVar43 == 0xff),
                                                                          CONCAT13(-(bVar42 == 0xff)
                                                                                   ,CONCAT12(-(
                                                  bVar41 == 0xff),
                                                  CONCAT11(-(bVar39 == 0xff),-((byte)uVar40 == 0xff)
                                                          ))))))),1);
                  if ((bVar39 & 1) != 0) break;
                  lVar18 = lVar18 + 8;
                  uVar26 = uVar26 + lVar18;
                }
              }
              func_0x007a23bc(&UNK_009ef7b8);
              goto code_r0x005720f8;
            }
code_r0x00570ac8:
            if (puVar22 != (uint *)0x0) {
              func_0x00187bd4(puVar48,(long)puVar22 << 3,8);
            }
            if ((ulong)in_stack_00000080[2] <= unaff_x24) {
              func_0x007a2570(unaff_x24,in_stack_00000080[2],&UNK_009ef770);
              goto code_r0x005720f8;
            }
            lVar18 = in_stack_00000080[1] + unaff_x24 * 0x108;
            func_0x0056dcac(lVar18);
            _memcpy(lVar18,(long)register0x00000008 + 0x210,0x108);
            in_stack_00000210 = in_stack_00000108;
            puVar22 = uStack0000000000000100;
            puVar24 = in_stack_00000108 + (long)in_stack_00000110 * 2;
            puVar21 = in_stack_00000108;
            puVar48 = in_stack_00000108;
            if (in_stack_00000110 != (long *)0x0) {
              do {
                puVar48 = puVar21 + 2;
                plVar31 = *(long **)puVar21;
                if (in_stack_000000d8 <= unaff_x26) {
                  func_0x007a2570(unaff_x26,in_stack_000000d8,&UNK_009ef788);
                  goto code_r0x005720f8;
                }
                lVar20 = in_stack_000000d0 + unaff_x26 * 0x18;
                lVar18 = *(long *)(lVar20 + 0x10);
                if (lVar18 == 0) {
code_r0x00571f20:
                  func_0x007a23bc(&UNK_009ef7a0);
                  goto code_r0x005720f8;
                }
                puVar32 = *(undefined8 **)(lVar20 + 8);
                lVar18 = lVar18 << 3;
                while (plVar23 = (long *)*puVar32, plVar23 != plVar31) {
                  puVar32 = puVar32 + 1;
                  lVar18 = lVar18 + -8;
                  if (lVar18 == 0) goto code_r0x00571f20;
                }
                lVar18 = *plVar23;
                *plVar23 = lVar18 + -1;
                LORelease();
                if (lVar18 == 1) {
                  func_0x005d2ac4(puVar32);
                }
                *puVar32 = 0;
                lVar18 = *plVar31;
                *plVar31 = lVar18 + -1;
                LORelease();
                if (lVar18 == 1) {
                  func_0x005d2ac4((long)register0x00000008 + 0x200);
                }
                puVar21 = puVar48;
              } while (puVar48 != puVar24);
            }
            func_0x005928cc((long)register0x00000008 + 0x210);
            unaff_x23 = in_stack_00000090;
code_r0x0057081c:
            lVar18 = (long)in_stack_000000e8 * 9 + 0x11;
            unaff_x24 = unaff_x26;
            if (in_stack_000000e8 != (uint *)0x0 && lVar18 != 0) {
              func_0x00187bd4(uStack00000000000000e0 + (long)in_stack_000000e8 * -2 + -2,lVar18,8);
            }
            goto code_r0x0056ff24;
          }
        }
        puVar16 = &UNK_009ef6f8;
      }
      else {
        puVar16 = &UNK_009ef6e0;
      }
code_r0x00571e90:
      func_0x007a23bc(puVar16);
      goto code_r0x005720f8;
    }
  }
code_r0x005706fc:
  if ((ulong)in_stack_00000080[2] <= unaff_x24) {
    puVar16 = &UNK_009ef7d0;
    uVar17 = in_stack_00000080[2];
    goto code_r0x00571ee8;
  }
  param_2 = in_stack_00000080[1] + unaff_x24 * 0x108;
  unaff_x23 = in_stack_00000090;
  goto code_r0x00570714;
code_r0x005702c4:
  lVar20 = lVar20 + -8;
  puVar24 = puVar24 + 2;
  if (lVar20 == 0) goto code_r0x005703d0;
  goto code_r0x005702d0;
}

