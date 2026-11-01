
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005712f4(void)

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
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  undefined *puVar15;
  long extraout_x1;
  long *plVar16;
  ulong uVar17;
  long lVar18;
  long *plVar19;
  uint *puVar20;
  uint *puVar21;
  long *plVar22;
  uint *puVar23;
  ulong uVar24;
  long lVar25;
  long *plVar26;
  ulong uVar27;
  long *plVar28;
  ulong uVar29;
  long lVar30;
  ulong uVar31;
  long lVar32;
  long *unaff_x20;
  uint *puVar33;
  long unaff_x21;
  undefined8 *puVar34;
  long unaff_x22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long lVar35;
  ulong unaff_x26;
  ulong unaff_x27;
  uint uVar36;
  ulong unaff_x28;
  uint *puVar37;
  uint *puVar38;
  byte bVar39;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  undefined8 uVar40;
  byte bVar46;
  undefined *in_stack_00000000;
  undefined *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  uint *in_stack_00000040;
  uint *in_stack_00000048;
  uint *in_stack_00000050;
  ulong in_stack_00000058;
  uint *in_stack_00000060;
  long *in_stack_00000068;
  uint *in_stack_00000070;
  undefined8 in_stack_00000088;
  long in_stack_00000090;
  undefined8 in_stack_00000098;
  ulong in_stack_000000a0;
  uint *in_stack_000000a8;
  undefined8 uStack00000000000000c8;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  long in_stack_000000e8;
  ulong in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 uStack0000000000000100;
  uint *in_stack_00000108;
  long in_stack_00000110;
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
  
code_r0x005712f4:
  uVar31 = unaff_x26;
  uVar17 = unaff_x20[2];
  if (uVar17 <= uVar31) {
    puVar15 = &UNK_009ef320;
LAB_00571e08:
    func_0x007a2570(uVar31,uVar17,puVar15);
LAB_005720f8:
                    /* WARNING: Does not return */
    pcVar8 = (code *)SoftwareBreakpoint(1,0x5720fc);
    (*pcVar8)();
  }
  lVar30 = unaff_x20[1] + uVar31 * 0x108;
  if (*(long *)(lVar30 + 0x18) != 0xf) goto LAB_00571684;
  if (*(long *)(lVar30 + 0x48) != 1) goto LAB_00571684;
  plVar16 = *(long **)(lVar30 + 0x40);
  lVar18 = *plVar16;
  if (lVar18 < 6) {
    if (lVar18 < 4) {
      if (lVar18 - 1U < 3) goto LAB_00571684;
    }
    else if (lVar18 != 4) {
      uVar17 = func_0x005ca810(plVar16 + 1);
      goto LAB_005713b8;
    }
  }
  else if (lVar18 < 9) {
    if (lVar18 != 6) {
      if (lVar18 == 7) goto LAB_00571684;
      uVar17 = func_0x005ca90c(plVar16 + 1);
      goto LAB_005713b8;
    }
  }
  else if (lVar18 == 9) {
    uVar17 = func_0x005c0b7c(plVar16 + 1);
LAB_005713b8:
    if ((uVar17 & 1) != 0) goto LAB_00571684;
  }
  else if ((lVar18 != 10) && (plVar16[1] != unaff_x21)) goto LAB_00571684;
  func_0x0056f330((long)register0x00000008 + 0x210,plVar16);
  unaff_x24 = in_stack_000000a0;
  if ((in_stack_00000220 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
    uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
    uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
    puVar21 = in_stack_00000218;
    do {
      lVar35 = **(long **)puVar21;
      uVar17 = func_0x005787f4(uVar40,uVar3,lVar35);
      lVar18 = 0;
      uVar24 = uVar17 >> 0x39;
      while( true ) {
        uVar17 = uVar17 & *(ulong *)(in_stack_000000a8 + 8);
        uVar27 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar17);
        uVar29 = uVar27 ^ uVar24 * 0x101010101010101;
        for (uVar29 = uVar29 + 0xfefefefefefefeff & (uVar29 ^ 0xffffffffffffffff) &
                      0x8080808080808080; uVar29 != 0; uVar29 = uVar29 - 1 & uVar29) {
          uVar14 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
          uVar14 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                             (uVar17 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) &
                             *(ulong *)(in_stack_000000a8 + 8)) * -8);
          if (*(ulong *)(in_stack_000000a8 + 4) <= uVar14) {
            func_0x007a2570(uVar14,*(ulong *)(in_stack_000000a8 + 4),&UNK_009f0c60);
            goto LAB_005720f8;
          }
          if (lVar35 == *(long *)(*(long *)(in_stack_000000a8 + 2) + uVar14 * 0x18)) {
            if (in_stack_00000210 != (uint *)0x0) {
              func_0x00187bd4(in_stack_00000218,(long)in_stack_00000210 << 3,8);
            }
            unaff_x21 = -0x8000000000000000;
            unaff_x23 = (undefined8 *)&UNK_009ee238;
            unaff_x25 = in_stack_00000090;
            goto LAB_00571684;
          }
        }
        if ((uVar27 & uVar27 << 1 & 0x8080808080808080) != 0) break;
        lVar18 = lVar18 + 8;
        uVar17 = lVar18 + uVar17;
      }
      puVar21 = puVar21 + 2;
      unaff_x25 = in_stack_00000090;
    } while (puVar21 != in_stack_00000218 + (long)in_stack_00000220 * 2);
  }
  if (in_stack_00000210 != (uint *)0x0) {
    func_0x00187bd4(in_stack_00000218,(long)in_stack_00000210 << 3,8);
  }
  unaff_x21 = -0x8000000000000000;
  unaff_x23 = (undefined8 *)&UNK_009ee238;
  if (*(long *)(lVar30 + 0x30) == 1) {
    if (**(long **)(lVar30 + 0x28) == -0x8000000000000000) {
      if (*(long *)(unaff_x22 + 0x10) != 0) {
        lVar18 = *(long *)(unaff_x22 + 0x10) << 3;
        plVar16 = *(long **)(unaff_x22 + 8);
        do {
          if ((*plVar16 != 0) && (*plVar16 == (*(long **)(lVar30 + 0x28))[1])) {
            uVar17 = unaff_x20[2];
            if (uVar17 <= uVar31) {
              puVar15 = &UNK_009ef338;
              goto LAB_00571e08;
            }
            lVar30 = unaff_x20[1] + uVar31 * 0x108;
            if (*(long *)(lVar30 + 0x18) != 0xf) {
              puVar15 = &UNK_009ef350;
              goto LAB_00571da8;
            }
            if (*(long *)(lVar30 + 0x48) != 0) {
              lVar18 = *(long *)(lVar30 + 0x48) + -1;
              *(long *)(lVar30 + 0x48) = lVar18;
              puVar34 = (undefined8 *)(*(long *)(lVar30 + 0x40) + lVar18 * 0x40);
              puVar21 = (uint *)*puVar34;
              if (puVar21 != &MACH_HEADER.filetype) {
                in_stack_000001b8 = puVar34[7];
                in_stack_000001b0 = puVar34[6];
                in_stack_000001a8 = puVar34[5];
                in_stack_000001a0 = puVar34[4];
                in_stack_00000198 = puVar34[3];
                in_stack_00000190 = (uint *)puVar34[2];
                in_stack_00000188 = (uint *)puVar34[1];
                uStack0000000000000180 = puVar21;
                if ((*(ulong *)(unaff_x25 + 0x40) <= in_stack_00000058) ||
                   (plVar19 = (long *)(*(long *)(unaff_x25 + 0x38) +
                                      (in_stack_00000058 & 0xffffffff) * 0x30),
                   *plVar19 == -0x8000000000000000)) {
                  puVar15 = &UNK_009ef380;
                  goto LAB_00571d88;
                }
                uVar17 = plVar19[2];
                if (unaff_x27 < uVar17) {
                  if (*plVar16 == 0) {
                    puVar15 = &UNK_009ef3b0;
                    goto LAB_00571d88;
                  }
                  lVar30 = plVar19[1] + unaff_x27 * 0x48;
                  puVar2 = (ulong *)(lVar30 + 8);
                  in_stack_00000210 = (uint *)((long)register0x00000008 + 0x200);
                  puVar21 = (uint *)&uStack0000000000000180;
                  in_stack_00000220 = (uint *)((long)register0x00000008 + 0x20f);
                  bVar10 = func_0x0056f968((long)register0x00000008 + 0x210,0,puVar2);
                  if (bVar10 == 2) {
                    uVar17 = *puVar2;
                    if ((long)uVar17 < 6) {
                      if ((long)uVar17 < 3) {
                        if (uVar17 < 2) goto LAB_005717c4;
                        lVar30 = 8;
LAB_0057177c:
                        bVar10 = func_0x005866f4((long)puVar2 + lVar30,
                                                 (long)register0x00000008 + 0x210);
                      }
                      else if (uVar17 == 3) {
LAB_00571790:
                        bVar10 = func_0x00585ff4(lVar30 + 0x10,(long)register0x00000008 + 0x210);
                      }
                      else {
                        if (uVar17 == 4) goto LAB_005717c4;
                        bVar10 = func_0x005860f4(lVar30 + 0x10,(long)register0x00000008 + 0x210);
                      }
LAB_005717b8:
                      if (bVar10 != 2) goto LAB_005717e0;
                    }
                    else if ((long)uVar17 < 9) {
                      if (uVar17 != 6) {
                        if (uVar17 == 7) {
                          bVar10 = func_0x00580428(lVar30 + 0x10,(long)register0x00000008 + 0x210);
                        }
                        else {
                          bVar10 = func_0x005865f4(lVar30 + 0x10,(long)register0x00000008 + 0x210);
                        }
                        goto LAB_005717b8;
                      }
                    }
                    else {
                      if (uVar17 == 9) {
                        bVar10 = func_0x00585ef4(lVar30 + 0x10,(long)register0x00000008 + 0x210);
                        goto LAB_005717b8;
                      }
                      if (uVar17 != 10) {
                        uVar17 = *(ulong *)(lVar30 + 0x10) ^ 0x8000000000000000;
                        if (1 < uVar17) {
                          uVar17 = 2;
                        }
                        if (uVar17 != 0) {
                          if (uVar17 == 2) goto LAB_00571790;
                          lVar30 = 0x10;
                          goto LAB_0057177c;
                        }
                      }
                    }
LAB_005717c4:
                    bVar10 = func_0x0056f968((long)register0x00000008 + 0x210,1,puVar2);
                    if (bVar10 != 2) goto LAB_005717e0;
LAB_005717e4:
                    uVar7 = in_stack_000001b8;
                    uVar6 = in_stack_000001b0;
                    uVar5 = in_stack_000001a8;
                    uVar3 = in_stack_000001a0;
                    uVar40 = in_stack_00000198;
                    uVar24 = (ulong)in_stack_00000190;
                    in_stack_00000218 = in_stack_00000188;
                    in_stack_00000210 = uStack0000000000000180;
                    if ((in_stack_000000a0 < *(ulong *)(unaff_x25 + 0x28)) &&
                       (plVar16 = (long *)(*(long *)(unaff_x25 + 0x20) + in_stack_000000a0 * 0x20),
                       *plVar16 != -0x8000000000000000)) {
                      uVar17 = plVar16[2];
                      if (uVar17 <= uVar31) {
                        in_stack_00000008 = &UNK_009ef3e0;
                        goto LAB_00571f94;
                      }
                      lVar30 = plVar16[1] + uVar31 * 0x108;
                      if (*(long *)(lVar30 + 0x18) == 0xf) {
                        if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                          func_0x007a23bc(&UNK_009ef410);
                          goto LAB_005720f8;
                        }
                        lVar18 = *(long *)(lVar30 + 0x48);
                        if (lVar18 == *(long *)(lVar30 + 0x38)) {
                          func_0x00582ff0((long *)(lVar30 + 0x38),&UNK_009ef428);
                        }
                        puVar34 = (undefined8 *)(*(long *)(lVar30 + 0x40) + lVar18 * 0x40);
                        puVar34[5] = uVar5;
                        puVar34[4] = uVar3;
                        puVar34[7] = uVar7;
                        puVar34[6] = uVar6;
                        puVar34[1] = in_stack_00000218;
                        *puVar34 = in_stack_00000210;
                        puVar34[3] = uVar40;
                        puVar34[2] = uVar24;
                        *(long *)(lVar30 + 0x48) = lVar18 + 1;
                        if (*(ulong *)(unaff_x25 + 0x28) <= in_stack_000000a0) goto LAB_00571da0;
                        goto LAB_00571690;
                      }
                      puVar15 = &UNK_009ef3f8;
                    }
                    else {
                      puVar15 = &UNK_009ef3c8;
                    }
LAB_00571d88:
                    func_0x007a23bc(puVar15);
                    goto LAB_005720f8;
                  }
LAB_005717e0:
                  if ((bVar10 & 1) == 0) goto LAB_005717e4;
                  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                    func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef440);
                    goto LAB_005720f8;
                  }
                  if ((*(ulong *)(unaff_x25 + 0x28) <= in_stack_000000a0) ||
                     (plVar19 = (long *)(*(long *)(unaff_x25 + 0x20) + in_stack_000000a0 * 0x20),
                     *plVar19 == -0x8000000000000000)) {
                    puVar15 = &UNK_009ef458;
                    goto LAB_00571d88;
                  }
                  uVar17 = plVar19[2];
                  if (uVar31 < uVar17) {
                    func_0x0056f6dc((long)register0x00000008 + 0x210,plVar19[1] + uVar31 * 0x108);
                    if (in_stack_00000220 == (uint *)0x0) {
LAB_00571a8c:
                      if (in_stack_00000210 != (uint *)0x0) {
                        func_0x00187bd4(puVar21,(long)in_stack_00000210 * 8,8);
                      }
                      if (uVar31 < (ulong)plVar19[2]) {
                        lVar30 = plVar19[1] + uVar31 * 0x108;
                        func_0x0056dcac(lVar30);
                        _memcpy(lVar30,(long)register0x00000008 + 0x210,0x108);
                        plVar19 = (long *)*plVar16;
                        if (plVar19 != (long *)0x0) {
                          lVar30 = *plVar19;
                          *plVar19 = lVar30 + -1;
                          LORelease();
                          if (lVar30 == 1) {
                            func_0x005d2ac4(plVar16);
                          }
                        }
                        *plVar16 = 0;
                        unaff_x23 = (undefined8 *)&UNK_009ee238;
                        if (uStack0000000000000180 == &MACH_HEADER.filetype) goto LAB_005718ec;
                        func_0x0056d75c(&uStack0000000000000180);
                        goto LAB_005718ec;
                      }
                      func_0x007a2570(uVar31,plVar19[2],&UNK_009ef488);
                    }
                    else {
                      puVar23 = puVar21;
LAB_00571a44:
                      if (in_stack_00000068[3] != 0) {
                        lVar30 = 0;
                        puVar37 = puVar23 + 2;
                        uVar17 = (**(long **)puVar23 + 8) * 0x517cc1b727220a95;
                        lVar18 = *in_stack_00000068;
                        bVar10 = (byte)(uVar17 >> 0x39);
                        while( true ) {
                          uVar17 = uVar17 & in_stack_00000068[1];
                          uVar40 = *(undefined8 *)(lVar18 + uVar17);
                          bVar39 = (byte)((ulong)uVar40 >> 8);
                          bVar41 = (byte)((ulong)uVar40 >> 0x10);
                          bVar42 = (byte)((ulong)uVar40 >> 0x18);
                          bVar43 = (byte)((ulong)uVar40 >> 0x20);
                          bVar44 = (byte)((ulong)uVar40 >> 0x28);
                          bVar45 = (byte)((ulong)uVar40 >> 0x30);
                          bVar46 = (byte)((ulong)uVar40 >> 0x38);
                          for (uVar24 = CONCAT17(-(bVar46 == bVar10),
                                                 CONCAT16(-(bVar45 == bVar10),
                                                          CONCAT15(-(bVar44 == bVar10),
                                                                   CONCAT14(-(bVar43 == bVar10),
                                                                            CONCAT13(-(bVar42 ==
                                                                                      bVar10),
                                                  CONCAT12(-(bVar41 == bVar10),
                                                           CONCAT11(-(bVar39 == bVar10),
                                                                    -((byte)uVar40 == bVar10))))))))
                                        & 0x8080808080808080; uVar24 != 0;
                              uVar24 = uVar24 - 1 & uVar24) {
                            uVar29 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
                            uVar29 = (uVar29 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar29 & 0xffff0000ffff) << 0x10;
                            uVar29 = uVar17 + ((ulong)LZCOUNT(uVar29 >> 0x20 | uVar29 << 0x20) >> 3)
                                     & in_stack_00000068[1];
                            if (**(long **)puVar23 == *(long *)(lVar18 + -0x10 + uVar29 * -0x10)) {
                              lVar18 = lVar18 + uVar29 * -0x10;
                              lVar35 = *(long *)(lVar18 + -8);
                              lVar30 = 0;
                              if (lVar35 != 0) {
                                lVar30 = lVar35 + -1;
                              }
                              *(long *)(lVar18 + -8) = lVar30;
                              puVar23 = puVar37;
                              if (puVar37 != puVar21 + (long)in_stack_00000220 * 2)
                              goto LAB_00571a44;
                              goto LAB_00571a8c;
                            }
                          }
                          bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                                       CONCAT16(-(bVar45 == 0xff),
                                                                CONCAT15(-(bVar44 == 0xff),
                                                                         CONCAT14(-(bVar43 == 0xff),
                                                                                  CONCAT13(-(bVar42 
                                                  == 0xff),CONCAT12(-(bVar41 == 0xff),
                                                                    CONCAT11(-(bVar39 == 0xff),
                                                                             -((byte)uVar40 == 0xff)
                                                                            ))))))),1);
                          if ((bVar39 & 1) != 0) break;
                          lVar30 = lVar30 + 8;
                          uVar17 = uVar17 + lVar30;
                        }
                      }
                      func_0x007a23bc(&UNK_009ef4a0);
                    }
                    goto LAB_005720f8;
                  }
                  in_stack_00000008 = &UNK_009ef470;
LAB_00571f94:
                  unaff_x27 = uVar31;
                }
                func_0x007a2570(unaff_x27,uVar17,in_stack_00000008);
                goto LAB_005720f8;
              }
            }
            puVar15 = &UNK_009ef368;
            goto LAB_00571da8;
          }
          lVar18 = lVar18 + -8;
          plVar16 = plVar16 + 1;
        } while (lVar18 != 0);
      }
    }
  }
LAB_00571684:
  if (unaff_x24 < *(ulong *)(unaff_x25 + 0x28)) {
LAB_00571690:
    plVar16 = (long *)(*(long *)(unaff_x25 + 0x20) + unaff_x24 * 0x20);
    if (*plVar16 != unaff_x21) {
      uVar17 = plVar16[2];
      if (uVar31 < uVar17) {
        func_0x0056f78c((long)register0x00000008 + 0x210,plVar16[1] + uVar31 * 0x108);
        func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,&uStack0000000000000100);
        unaff_x26 = uVar31;
        uVar31 = unaff_x27;
        uVar17 = unaff_x28;
        in_stack_00000220 = in_stack_00000210;
code_r0x005716f4:
        in_stack_00000210 = in_stack_00000218;
        unaff_x27 = uVar31;
        puVar21 = in_stack_00000210;
        if (unaff_x26 != 0) goto LAB_005710dc;
LAB_00571928:
        puVar21 = in_stack_00000210;
        if ((in_stack_00000108 != (uint *)0x0) &&
           (lVar30 = (long)in_stack_00000108 * 9 + 0x11, lVar30 != 0)) {
          func_0x00187bd4(uStack0000000000000100 + (long)in_stack_00000108 * -2 + -2,lVar30,8);
        }
        do {
          unaff_x27 = unaff_x27 + 1;
LAB_0057109c:
          uVar31 = in_stack_000000f0;
          lVar30 = in_stack_000000e8;
          if (in_stack_000000f0 <= unaff_x27) {
            if (in_stack_000000f0 != 0) {
              uVar17 = 0;
              do {
                plVar16 = (long *)(lVar30 + uVar17 * 0x18);
                if (plVar16[2] != 0) {
                  puVar34 = (undefined8 *)plVar16[1];
                  lVar18 = 1 - plVar16[2];
                  do {
                    plVar19 = (long *)*puVar34;
                    if (plVar19 != (long *)0x0) {
                      lVar35 = *plVar19;
                      *plVar19 = lVar35 + -1;
                      LORelease();
                      if (lVar35 == 1) {
                        func_0x005d2ac4(puVar34);
                      }
                    }
                    puVar34 = puVar34 + 1;
                    lVar18 = lVar18 + 1;
                  } while (lVar18 != 1);
                }
                if (*plVar16 != 0) {
                  func_0x00187bd4(plVar16[1],*plVar16 << 3,8);
                }
                uVar17 = uVar17 + 1;
              } while (uVar17 != uVar31);
            }
            do {
              if (uStack00000000000000e0 != 0) {
                func_0x00187bd4(in_stack_000000e8,uStack00000000000000e0 * 0x18,8);
              }
              if (in_stack_00000070 == in_stack_00000060) {
                do {
                  if (in_stack_00000040 != (uint *)0x0) {
                    func_0x00187bd4(in_stack_00000050,(long)in_stack_00000040 << 2,4);
                  }
                  uVar31 = in_stack_000000d8;
                  lVar30 = in_stack_000000d0;
                  if (in_stack_000000d8 != 0) {
                    uVar17 = 0;
                    do {
                      plVar16 = (long *)(lVar30 + uVar17 * 0x18);
                      if (plVar16[2] != 0) {
                        puVar34 = (undefined8 *)plVar16[1];
                        lVar18 = 1 - plVar16[2];
                        do {
                          plVar19 = (long *)*puVar34;
                          if (plVar19 != (long *)0x0) {
                            lVar35 = *plVar19;
                            *plVar19 = lVar35 + -1;
                            LORelease();
                            if (lVar35 == 1) {
                              func_0x005d2ac4(puVar34);
                            }
                          }
                          puVar34 = puVar34 + 1;
                          lVar18 = lVar18 + 1;
                        } while (lVar18 != 1);
                      }
                      if (*plVar16 != 0) {
                        func_0x00187bd4(plVar16[1],*plVar16 << 3,8);
                      }
                      uVar17 = uVar17 + 1;
                    } while (uVar17 != uVar31);
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
                  puVar23 = in_stack_00000048 + 1;
                  in_stack_000000a0 = (ulong)*in_stack_00000048;
                  if ((*(ulong *)(in_stack_00000090 + 0x28) <= in_stack_000000a0) ||
                     (plVar16 = (long *)(*(long *)(in_stack_00000090 + 0x20) +
                                        in_stack_000000a0 * 0x20), *plVar16 == -0x8000000000000000))
                  {
                    func_0x007a23bc(&UNK_009ef260);
                    goto LAB_005720f8;
                  }
                  uVar31 = plVar16[2];
                  if (uVar31 == 0) {
                    in_stack_000000d0 = 8;
                    lVar30 = plVar16[2];
                  }
                  else {
                    lVar18 = func_0x00187bd0(uVar31 * 0x18,8);
                    if (lVar18 == 0) {
                      func_0x007a1f00(8,uVar31 * 0x18,&UNK_009ef278);
                      goto LAB_005720f8;
                    }
                    lVar30 = plVar16[2];
                    in_stack_000000d0 = lVar18;
                  }
                  in_stack_000000d8 = 0;
                  uStack00000000000000c8 = uVar31;
                  if (lVar30 != 0) {
                    in_stack_000000d8 = 0;
                    lVar18 = plVar16[1];
                    lVar30 = lVar30 * 0x108;
                    do {
                      puVar37 = in_stack_00000210;
                      func_0x0056f6dc((long)register0x00000008 + 0x210,lVar18);
                      in_stack_00000190 = puVar21 + (long)in_stack_00000220 * 2;
                      uStack0000000000000180 = (uint *)in_stack_00000088;
                      in_stack_00000188 = (uint *)in_stack_00000030;
                      func_0x005905b4((long)register0x00000008 + 0x210,puVar21,puVar21,
                                      &uStack0000000000000180);
                      uVar31 = in_stack_000000d8;
                      in_stack_00000190 = (uint *)((ulong)(extraout_x1 - (long)puVar21) >> 3);
                      uStack0000000000000180 = puVar37;
                      in_stack_00000188 = puVar21;
                      if (in_stack_000000d8 == uStack00000000000000c8) {
                        func_0x00582b88(&uStack00000000000000c8,&UNK_009ef800);
                      }
                      puVar34 = (undefined8 *)(in_stack_000000d0 + uVar31 * 0x18);
                      puVar34[1] = in_stack_00000188;
                      *puVar34 = uStack0000000000000180;
                      puVar34[2] = in_stack_00000190;
                      in_stack_000000d8 = uVar31 + 1;
                      lVar18 = lVar18 + 0x108;
                      lVar30 = lVar30 + -0x108;
                      in_stack_00000210 = puVar21;
                      in_stack_00000220 = puVar37;
                    } while (lVar30 != 0);
                    if (plVar16[2] != 0) {
                      uVar31 = 0;
                      puVar38 = puVar21;
code_r0x0056ff34:
                      in_stack_000000e8 = _UNK_009ee240;
                      uStack00000000000000e0 = _UNK_009ee238;
                      in_stack_000000f8 = _UNK_009ee250;
                      in_stack_000000f0 = _UNK_009ee248;
                      if (uVar31 != 0) {
                        uVar36 = 1;
                        uVar17 = uVar31;
code_r0x0056ff4c:
                        do {
                          if (in_stack_000000d8 <= uVar31) {
                            puVar15 = &UNK_009ef4e8;
                            uVar24 = in_stack_000000d8;
                            goto code_r0x00571ee8;
                          }
                          uVar17 = uVar17 - 1;
                          lVar30 = in_stack_000000d0 + uVar31 * 0x18;
                          lVar18 = *(long *)(lVar30 + 0x10) << 3;
                          plVar19 = *(long **)(lVar30 + 8);
                          do {
                            if (lVar18 == 0) {
                              uVar31 = uVar31 + 1;
                              goto code_r0x0057081c;
                            }
                            lVar30 = *plVar19;
                            lVar18 = lVar18 + -8;
                            plVar19 = plVar19 + 1;
                          } while (lVar30 == 0);
                          if ((ulong)plVar16[2] <= uVar17) {
                            puVar15 = &UNK_009ef500;
                            uVar24 = plVar16[2];
                            uVar31 = uVar17;
                            goto code_r0x00571ee8;
                          }
                          func_0x0056f78c((long)register0x00000008 + 0x210,
                                          plVar16[1] + uVar17 * 0x108);
                          if ((puVar37 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0))
                          {
                            uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
                            uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
                            puVar33 = puVar38;
                            do {
                              puVar20 = puVar33 + 2;
                              lVar18 = **(long **)puVar33;
                              uVar24 = func_0x005787f4(uVar40,uVar3,lVar18);
                              lVar30 = 0;
                              uVar29 = uVar24 >> 0x39;
                              while( true ) {
                                uVar24 = uVar24 & *(ulong *)(in_stack_000000a8 + 8);
                                uVar14 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar24);
                                uVar27 = uVar14 ^ uVar29 * 0x101010101010101;
                                for (uVar27 = uVar27 + 0xfefefefefefefeff &
                                              (uVar27 ^ 0xffffffffffffffff) & 0x8080808080808080;
                                    uVar27 != 0; uVar27 = uVar27 - 1 & uVar27) {
                                  uVar13 = (uVar27 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar27 >> 7 & 0xff00ff00ff00ff) << 8;
                                  uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar13 & 0xffff0000ffff) << 0x10;
                                  uVar13 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                                                     (uVar24 + ((ulong)LZCOUNT(uVar13 >> 0x20 |
                                                                               uVar13 << 0x20) >> 3)
                                                     & *(ulong *)(in_stack_000000a8 + 8)) * -8);
                                  if (*(ulong *)(in_stack_000000a8 + 4) <= uVar13) {
                                    func_0x007a2570(uVar13,*(ulong *)(in_stack_000000a8 + 4),
                                                    &UNK_009f0c60);
                                    goto LAB_005720f8;
                                  }
                                  if (lVar18 == *(long *)(*(long *)(in_stack_000000a8 + 2) +
                                                         uVar13 * 0x18)) {
                                    uVar36 = 0;
                                    goto code_r0x0057004c;
                                  }
                                }
                                if ((uVar14 & uVar14 << 1 & 0x8080808080808080) != 0) break;
                                lVar30 = lVar30 + 8;
                                uVar24 = lVar30 + uVar24;
                              }
code_r0x0057004c:
                              puVar33 = puVar20;
                            } while (puVar20 != puVar38 + (long)puVar37 * 2);
                          }
                          if (puVar21 != (uint *)0x0) {
                            func_0x00187bd4(puVar38,(long)puVar21 << 3,8);
                          }
                          if ((ulong)plVar16[2] <= uVar17) {
                            puVar15 = &UNK_009ef518;
                            uVar24 = plVar16[2];
                            uVar31 = uVar17;
                            goto code_r0x00571ee8;
                          }
                          func_0x0056f6dc(&uStack0000000000000180,plVar16[1] + uVar17 * 0x108);
                          puVar21 = in_stack_00000188;
                          puVar37 = uStack0000000000000180;
                          uVar24 = func_0x0059038c((long)register0x00000008 + 0x210,
                                                   in_stack_00000088,&uStack00000000000000e0);
                          puVar38 = puVar21;
                          if ((uVar24 & 1) == 0) {
                            if (puVar37 != (uint *)0x0) {
                              func_0x00187bd4(puVar21,(long)puVar37 << 3,8);
                            }
                            if ((ulong)plVar16[2] <= uVar17) {
                              puVar15 = &UNK_009ef530;
                              uVar24 = plVar16[2];
                              uVar31 = uVar17;
                              goto code_r0x00571ee8;
                            }
                            lVar30 = plVar16[1] + uVar17 * 0x108;
                            if ((*(long *)(lVar30 + 0x18) == 0xf) && (*(long *)(lVar30 + 0x48) == 1)
                               ) {
                              plVar19 = *(long **)(lVar30 + 0x40);
                              lVar18 = *plVar19;
                              if (lVar18 < 6) {
                                if (lVar18 < 4) {
                                  if (lVar18 - 1U < 3) goto code_r0x00570200;
                                }
                                else if (lVar18 != 4) {
                                  uVar24 = func_0x005ca810(plVar19 + 1);
                                  goto code_r0x005701fc;
                                }
code_r0x0057020c:
                                func_0x0056f330((long)register0x00000008 + 0x210,plVar19);
                                lVar18 = 0;
                                do {
                                  lVar35 = lVar18;
                                  if ((long)puVar37 * 8 == lVar35) break;
                                  lVar12 = func_0x0057851c(in_stack_000000a8,
                                                           *(undefined8 *)((long)puVar21 + lVar35));
                                  lVar18 = lVar35 + 8;
                                } while (lVar12 != 1);
                                if (puVar21 != (uint *)0x0) {
                                  func_0x00187bd4(puVar21,(long)puVar21 << 3,8);
                                }
                                bVar9 = (long)puVar37 * 8 != lVar35;
                                if (bVar9 && uVar36 == 0) goto code_r0x005706fc;
                              }
                              else {
                                if (8 < lVar18) {
                                  if (lVar18 == 9) {
                                    uVar24 = func_0x005c0b7c(plVar19 + 1);
code_r0x005701fc:
                                    if ((uVar24 & 1) != 0) goto code_r0x00570200;
                                  }
                                  else if ((lVar18 != 10) && (plVar19[1] != -0x8000000000000000))
                                  goto code_r0x00570200;
                                  goto code_r0x0057020c;
                                }
                                if (lVar18 == 6) goto code_r0x0057020c;
                                if (lVar18 != 7) {
                                  uVar24 = func_0x005ca90c(plVar19 + 1);
                                  goto code_r0x005701fc;
                                }
code_r0x00570200:
                                if (uVar36 == 0) goto code_r0x005706fc;
                                bVar9 = true;
                              }
                              plVar19 = *(long **)(lVar30 + 0x28);
                              lVar30 = *(long *)(lVar30 + 0x30);
                              if ((lVar30 == 1) && (*plVar19 == -0x8000000000000000)) {
                                if (in_stack_000000d8 <= uVar31) {
                                  puVar15 = &UNK_009ef548;
                                  uVar24 = in_stack_000000d8;
                                  goto code_r0x00571ee8;
                                }
                                lVar35 = in_stack_000000d0 + uVar31 * 0x18;
                                lVar18 = *(long *)(lVar35 + 0x10);
                                if (lVar18 != 0) {
                                  lVar18 = lVar18 << 3;
                                  puVar33 = *(uint **)(lVar35 + 8);
code_r0x005702d0:
                                  if ((*(long *)puVar33 == 0) || (*(long *)puVar33 != plVar19[1]))
                                  goto code_r0x005702c4;
                                  if ((ulong)plVar16[2] <= uVar17) {
                                    puVar15 = &UNK_009ef560;
                                    uVar24 = plVar16[2];
                                    uVar31 = uVar17;
                                    goto code_r0x00571ee8;
                                  }
                                  lVar30 = plVar16[1] + uVar17 * 0x108;
                                  if (*(long *)(lVar30 + 0x18) != 0xf) {
                                    puVar15 = &UNK_009ef578;
                                    goto code_r0x00571e90;
                                  }
                                  if (*(long *)(lVar30 + 0x48) == 0) {
code_r0x00572028:
                                    puVar15 = &UNK_009ef590;
                                    goto code_r0x00571e90;
                                  }
                                  lVar18 = *(long *)(lVar30 + 0x48) + -1;
                                  *(long *)(lVar30 + 0x48) = lVar18;
                                  puVar34 = (undefined8 *)(*(long *)(lVar30 + 0x40) + lVar18 * 0x40)
                                  ;
                                  puVar21 = (uint *)*puVar34;
                                  if (puVar21 == &MACH_HEADER.filetype) goto code_r0x00572028;
                                  in_stack_00000138 = puVar34[7];
                                  in_stack_00000130 = puVar34[6];
                                  in_stack_00000128 = puVar34[5];
                                  in_stack_00000120 = puVar34[4];
                                  in_stack_00000118 = puVar34[3];
                                  in_stack_00000110 = puVar34[2];
                                  in_stack_00000108 = (uint *)puVar34[1];
                                  uVar24 = plVar16[2];
                                  uStack0000000000000100 = puVar21;
                                  if (uVar24 <= uVar31) goto code_r0x00572008;
                                  if (*(long *)puVar33 == 0) {
                                    puVar15 = &UNK_009ef5c0;
code_r0x00571e50:
                                    func_0x007a23bc(puVar15);
                                    goto LAB_005720f8;
                                  }
                                  lVar30 = plVar16[1] + uVar31 * 0x108;
                                  puVar37 = (uint *)((long)register0x00000008 + 0x200);
                                  uStack0000000000000180 = puVar33;
                                  switch(*(undefined8 *)(lVar30 + 0x18)) {
                                  case 0xc:
                                  case 0x11:
                                  case 0x12:
                                  case 0x1c:
                                  case 0x1d:
                                  case 0x1e:
                                  case 0x20:
                                    goto code_r0x00570660;
                                  case 0xd:
                                    bVar10 = func_0x005861f4(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0xe:
                                    bVar10 = func_0x00585df4(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0xf:
                                    bVar10 = func_0x0057ab80(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x10:
                                    bVar10 = func_0x0057a880(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x13:
                                    bVar10 = func_0x0057a980(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x14:
                                    bVar10 = func_0x0057aa80(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  default:
                                    bVar10 = func_0x0057a468(lVar30,(long)register0x00000008 + 0x210
                                                            );
                                    break;
                                  case 0x16:
                                    bVar10 = func_0x0057ad0c(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x17:
                                    bVar10 = func_0x0057a5f4(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x18:
                                    bVar10 = func_0x0057a6f4(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x19:
                                    bVar10 = func_0x0057ae98(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x1a:
                                    bVar10 = func_0x0057b024(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                    break;
                                  case 0x1b:
                                    bVar10 = func_0x005863f4(lVar30,(long)register0x00000008 + 0x210
                                                            );
                                    break;
                                  case 0x1f:
                                    bVar10 = func_0x0057a368(lVar30 + 0x20,
                                                             (long)register0x00000008 + 0x210);
                                  }
                                  if ((bVar10 != 2) && ((bVar10 & 1) != 0)) {
                                    if (uStack0000000000000100 != &MACH_HEADER.filetype) {
                                      func_0x007a247c(&UNK_008ac325,0x26,&UNK_009ef638);
                                      goto LAB_005720f8;
                                    }
                                    uVar24 = plVar16[2];
                                    if (uVar24 <= uVar31) {
                                      in_stack_00000000 = &UNK_009ef650;
                                      uVar17 = uVar31;
                                      goto code_r0x00572004;
                                    }
                                    lVar30 = plVar16[1] + uVar31 * 0x108;
                                    puVar21 = (uint *)&uStack0000000000000180;
                                    puVar38 = (uint *)&uStack0000000000000100;
                                    switch(*(undefined8 *)(lVar30 + 0x18)) {
                                    case 0xc:
                                    case 0x11:
                                    case 0x12:
                                    case 0x1c:
                                    case 0x1d:
                                    case 0x1e:
                                    case 0x20:
                                      goto code_r0x00570dc8;
                                    case 0xd:
                                      func_0x005ce834((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0xe:
                                      func_0x005cea94((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0xf:
                                      func_0x005d8830((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x10:
                                      func_0x005cefd0((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x13:
                                      func_0x005cf868((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x14:
                                      func_0x005cf868((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    default:
                                      func_0x005da5fc((long)register0x00000008 + 0x210);
                                      break;
                                    case 0x16:
                                      func_0x005dadec((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x17:
                                      func_0x005db648((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x18:
                                      func_0x005dbb64((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x19:
                                      func_0x005dc058((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x1a:
                                      func_0x005dc67c((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                      break;
                                    case 0x1b:
                                      func_0x005d7448((long)register0x00000008 + 0x210);
                                      break;
                                    case 0x1f:
                                      func_0x005cf5a0((long)register0x00000008 + 0x210,lVar30 + 0x20
                                                     );
                                    }
                                    if (puVar37 != (uint *)0x0) {
                                      lVar30 = 0;
                                      lVar18 = (long)puVar37 * 8;
                                      do {
                                        puVar34 = *(undefined8 **)
                                                   ((long)&uStack0000000000000100 + lVar30);
                                        puVar38 = (uint *)puVar34[1];
                                        puVar21 = (uint *)*puVar34;
                                        puVar37 = (uint *)puVar34[2];
                                        puVar34[1] = in_stack_00000018;
                                        *puVar34 = in_stack_00000010;
                                        func_0x005af248(&uStack0000000000000180,
                                                        (long)register0x00000008 + 0x210);
                                        func_0x0056d75c(puVar34);
                                        puVar34[1] = in_stack_00000188;
                                        *puVar34 = uStack0000000000000180;
                                        puVar34[3] = in_stack_00000198;
                                        puVar34[2] = in_stack_00000190;
                                        puVar34[5] = in_stack_000001a8;
                                        puVar34[4] = in_stack_000001a0;
                                        puVar34[7] = in_stack_000001b8;
                                        puVar34[6] = in_stack_000001b0;
                                        lVar30 = lVar30 + 8;
                                      } while (lVar18 != lVar30);
                                    }
                                    if ((uint *)&uStack0000000000000180 != (uint *)0x0) {
                                      func_0x00187bd4(&uStack0000000000000100,
                                                      (long)&uStack0000000000000180 * 8,8);
                                    }
code_r0x00570dc8:
                                    uVar24 = plVar16[2];
                                    if (uVar17 < uVar24) {
                                      func_0x0056f6dc((long)register0x00000008 + 0x210,
                                                      plVar16[1] + uVar17 * 0x108);
                                      if (puVar37 != (uint *)0x0) {
                                        puVar20 = puVar38;
code_r0x00570e90:
                                        if (in_stack_00000068[3] != 0) {
                                          lVar30 = 0;
                                          puVar1 = puVar20 + 2;
                                          uVar24 = (**(long **)puVar20 + 8) * 0x517cc1b727220a95;
                                          lVar18 = *in_stack_00000068;
                                          bVar10 = (byte)(uVar24 >> 0x39);
                                          while( true ) {
                                            uVar24 = uVar24 & in_stack_00000068[1];
                                            uVar40 = *(undefined8 *)(lVar18 + uVar24);
                                            bVar39 = (byte)((ulong)uVar40 >> 8);
                                            bVar41 = (byte)((ulong)uVar40 >> 0x10);
                                            bVar42 = (byte)((ulong)uVar40 >> 0x18);
                                            bVar43 = (byte)((ulong)uVar40 >> 0x20);
                                            bVar44 = (byte)((ulong)uVar40 >> 0x28);
                                            bVar45 = (byte)((ulong)uVar40 >> 0x30);
                                            bVar46 = (byte)((ulong)uVar40 >> 0x38);
                                            for (uVar29 = CONCAT17(-(bVar46 == bVar10),
                                                                   CONCAT16(-(bVar45 == bVar10),
                                                                            CONCAT15(-(bVar44 ==
                                                                                      bVar10),
                                                  CONCAT14(-(bVar43 == bVar10),
                                                           CONCAT13(-(bVar42 == bVar10),
                                                                    CONCAT12(-(bVar41 == bVar10),
                                                                             CONCAT11(-(bVar39 ==
                                                                                       bVar10),-((
                                                  byte)uVar40 == bVar10)))))))) & 0x8080808080808080
                                                ; uVar29 != 0; uVar29 = uVar29 - 1 & uVar29) {
                                              uVar27 = (uVar29 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                                                       (uVar29 >> 7 & 0xff00ff00ff00ff) << 8;
                                              uVar27 = (uVar27 & 0xffff0000ffff0000) >> 0x10 |
                                                       (uVar27 & 0xffff0000ffff) << 0x10;
                                              uVar27 = uVar24 + ((ulong)LZCOUNT(uVar27 >> 0x20 |
                                                                                uVar27 << 0x20) >> 3
                                                                ) & in_stack_00000068[1];
                                              if (**(long **)puVar20 ==
                                                  *(long *)(lVar18 + -0x10 + uVar27 * -0x10)) {
                                                lVar18 = lVar18 + uVar27 * -0x10;
                                                lVar35 = *(long *)(lVar18 + -8);
                                                lVar30 = 0;
                                                if (lVar35 != 0) {
                                                  lVar30 = lVar35 + -1;
                                                }
                                                *(long *)(lVar18 + -8) = lVar30;
                                                puVar20 = puVar1;
                                                if (puVar1 != puVar38 + (long)puVar37 * 2)
                                                goto code_r0x00570e90;
                                                goto code_r0x00570ed4;
                                              }
                                            }
                                            bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                                                         CONCAT16(-(bVar45 == 0xff),
                                                                                  CONCAT15(-(bVar44 
                                                  == 0xff),CONCAT14(-(bVar43 == 0xff),
                                                                    CONCAT13(-(bVar42 == 0xff),
                                                                             CONCAT12(-(bVar41 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar39 == 0xff),-((byte)uVar40 == 0xff)
                                                          ))))))),1);
                                            if ((bVar39 & 1) != 0) break;
                                            lVar30 = lVar30 + 8;
                                            uVar24 = uVar24 + lVar30;
                                          }
                                        }
                                        func_0x007a23bc(&UNK_009ef698);
                                        goto LAB_005720f8;
                                      }
code_r0x00570ed4:
                                      if (puVar21 != (uint *)0x0) {
                                        func_0x00187bd4(puVar38,(long)puVar21 << 3,8);
                                      }
                                      if ((ulong)plVar16[2] <= uVar17) {
                                        func_0x007a2570(uVar17,plVar16[2],&UNK_009ef680);
                                        goto LAB_005720f8;
                                      }
                                      lVar30 = plVar16[1] + uVar17 * 0x108;
                                      func_0x0056dcac(lVar30);
                                      _memcpy(lVar30,(long)register0x00000008 + 0x210,0x108);
                                      plVar19 = *(long **)puVar33;
                                      if (plVar19 != (long *)0x0) {
                                        lVar30 = *plVar19;
                                        *plVar19 = lVar30 + -1;
                                        LORelease();
                                        if (lVar30 == 1) {
                                          func_0x005d2ac4(puVar33);
                                        }
                                      }
                                      puVar33[0] = 0;
                                      puVar33[1] = 0;
                                      if (uStack0000000000000100 != &MACH_HEADER.filetype) {
                                        func_0x0056d75c(&uStack0000000000000100);
                                      }
                                      goto code_r0x0057081c;
                                    }
                                    in_stack_00000000 = &UNK_009ef668;
code_r0x00572004:
                                    uVar31 = uVar17;
code_r0x00572008:
                                    func_0x007a2570(uVar31,uVar24,in_stack_00000000);
                                    goto LAB_005720f8;
                                  }
code_r0x00570660:
                                  uVar7 = in_stack_00000138;
                                  uVar6 = in_stack_00000130;
                                  uVar5 = in_stack_00000128;
                                  uVar3 = in_stack_00000120;
                                  uVar40 = in_stack_00000118;
                                  lVar30 = in_stack_00000110;
                                  puVar38 = in_stack_00000108;
                                  puVar21 = uStack0000000000000100;
                                  uVar24 = plVar16[2];
                                  if (uVar24 <= uVar17) {
                                    in_stack_00000000 = &UNK_009ef5d8;
                                    goto code_r0x00572004;
                                  }
                                  lVar18 = plVar16[1] + uVar17 * 0x108;
                                  if (*(long *)(lVar18 + 0x18) != 0xf) {
                                    puVar15 = &UNK_009ef5f0;
                                    goto code_r0x00571e50;
                                  }
                                  if (uStack0000000000000100 == &MACH_HEADER.filetype) {
                                    func_0x007a23bc(&UNK_009ef608);
                                    goto LAB_005720f8;
                                  }
                                  lVar35 = *(long *)(lVar18 + 0x48);
                                  if (lVar35 == *(long *)(lVar18 + 0x38)) {
                                    func_0x00582ff0((long *)(lVar18 + 0x38),&UNK_009ef620);
                                  }
                                  puVar34 = (undefined8 *)(*(long *)(lVar18 + 0x40) + lVar35 * 0x40)
                                  ;
                                  puVar34[5] = uVar5;
                                  puVar34[4] = uVar3;
                                  puVar34[7] = uVar7;
                                  puVar34[6] = uVar6;
                                  puVar34[1] = puVar38;
                                  *puVar34 = puVar21;
                                  puVar34[3] = uVar40;
                                  puVar34[2] = lVar30;
                                  *(long *)(lVar18 + 0x48) = lVar35 + 1;
                                  goto code_r0x005706fc;
                                }
                              }
code_r0x005703d0:
                              uVar24 = plVar16[2];
                              if (uVar24 <= uVar31) {
                                puVar15 = &UNK_009ef6b0;
                                goto code_r0x00571ee8;
                              }
                              lVar18 = plVar16[1] + uVar31 * 0x108;
                              if (*(long *)(lVar18 + 0x18) == 0x18) {
                                lVar25 = lVar30 * 0x18;
                                lVar12 = *(long *)(lVar18 + 0x48);
                                lVar32 = lVar12 * 0x40;
                                lVar35 = lVar12 * -0x40;
                                plVar22 = (long *)(*(long *)(lVar18 + 0x40) + lVar32);
                                while ((lVar35 != 0 && (plVar22[-8] == 0))) {
                                  if ((lVar25 == 0) ||
                                     (*(long *)((long)plVar19 + lVar25 + -0x18) !=
                                      -0x8000000000000000)) goto code_r0x005706fc;
                                  plVar26 = plVar22 + -7;
                                  lVar4 = lVar25 + -0x10;
                                  lVar25 = lVar25 + -0x18;
                                  lVar35 = lVar35 + 0x40;
                                  plVar22 = plVar22 + -8;
                                  if (*plVar26 != *(long *)((long)plVar19 + lVar4))
                                  goto code_r0x005706fc;
                                }
                                if (lVar25 == 0) {
                                  if (lVar30 == 0) goto code_r0x005704c8;
                                  if (uVar31 < in_stack_000000d8) {
                                    lVar35 = in_stack_000000d0 + uVar31 * 0x18;
                                    plVar22 = plVar19;
                                    goto code_r0x0057047c;
                                  }
                                  if (*plVar19 == -0x8000000000000000) {
                                    puVar15 = &UNK_009ef818;
                                    uVar24 = in_stack_000000d8;
                                    goto code_r0x00571ee8;
                                  }
                                }
                              }
                            }
code_r0x005706fc:
                            if (uVar17 < (ulong)plVar16[2]) {
                              func_0x0056f78c((long)register0x00000008 + 0x210,
                                              plVar16[1] + uVar17 * 0x108);
                              func_0x0058febc((long)register0x00000008 + 0x210,in_stack_00000098,
                                              &uStack00000000000000e0);
                              if (uVar17 < (ulong)plVar16[2]) {
                                uVar11 = 0;
                                lVar30 = plVar16[1] + uVar17 * 0x108;
                                uVar24 = *(long *)(lVar30 + 0x18) - 0xc;
                                if (0x14 < uVar24) {
                                  uVar24 = 9;
                                }
                                if ((long)uVar24 < 0xc) {
                                  if ((long)uVar24 < 4) {
                                    if (uVar24 - 1 < 2) goto code_r0x005707e0;
                                    if (uVar24 != 0) {
                                      uVar11 = func_0x005d8948(lVar30 + 0x20);
                                    }
                                  }
                                  else if ((uVar24 - 7 < 5) || (uVar24 - 4 < 2)) {
code_r0x005707e0:
                                    uVar11 = 1;
                                  }
                                }
                                else if ((long)uVar24 < 0x12) {
                                  if (uVar24 - 0xd < 5) goto code_r0x005707e0;
                                  uVar11 = func_0x005dba2c(lVar30 + 0x20);
                                }
                                else if (uVar24 == 0x13) {
                                  uVar11 = func_0x005cf518(lVar30 + 0x20);
                                }
                                uVar36 = uVar36 & (uVar11 ^ 1);
                                puVar37 = puVar21;
                                goto code_r0x005707ec;
                              }
                              puVar15 = &UNK_009ef7e8;
                              uVar24 = plVar16[2];
                              uVar31 = uVar17;
                            }
                            else {
                              puVar15 = &UNK_009ef7d0;
                              uVar24 = plVar16[2];
                              uVar31 = uVar17;
                            }
                            goto code_r0x00571ee8;
                          }
                          if (puVar37 != (uint *)0x0) {
                            func_0x00187bd4(puVar21,(long)puVar37 << 3,8);
                            if (uVar17 == 0) break;
                            goto code_r0x0056ff4c;
                          }
code_r0x005707ec:
                          puVar21 = puVar38;
                          puVar38 = puVar21;
                        } while (uVar17 != 0);
                        puVar38 = puVar21;
                        if ((in_stack_000000e8 != 0) &&
                           (lVar30 = in_stack_000000e8 * 9 + 0x11, lVar30 != 0)) {
                          func_0x00187bd4(uStack00000000000000e0 + in_stack_000000e8 * -8 + -8,
                                          lVar30,8);
                        }
                      }
                      uVar31 = uVar31 + 1;
                      goto code_r0x0056ff24;
                    }
                  }
code_r0x00570f74:
                  puVar21 = *(uint **)(in_stack_00000090 + 0x38);
                  in_stack_00000220 = *(uint **)(in_stack_00000090 + 0x40);
                  in_stack_00000210 = (uint *)0x0;
                  func_0x0055915c(&uStack0000000000000180,(long)register0x00000008 + 0x210,
                                  &UNK_009eeea8);
                  in_stack_00000040 = uStack0000000000000180;
                  in_stack_00000050 = in_stack_00000188;
                  in_stack_00000048 = puVar23;
                } while (in_stack_00000190 == (uint *)0x0);
                in_stack_00000060 = in_stack_00000188 + (long)in_stack_00000190;
                in_stack_00000070 = in_stack_00000188;
              }
              puVar23 = in_stack_00000070 + 1;
              in_stack_00000058 = (ulong)*in_stack_00000070;
              if ((*(ulong *)(in_stack_00000090 + 0x40) <= in_stack_00000058) ||
                 (plVar16 = (long *)(*(long *)(in_stack_00000090 + 0x38) + in_stack_00000058 * 0x30)
                 , *plVar16 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009ef290);
                goto LAB_005720f8;
              }
              in_stack_00000210 = (uint *)plVar16[1];
              puVar21 = in_stack_00000210 + plVar16[2] * 0x12;
              func_0x005588c8(&uStack00000000000000e0,(long)register0x00000008 + 0x210,&UNK_009eeea8
                             );
              in_stack_00000070 = puVar23;
              in_stack_00000220 = in_stack_000000a8;
            } while (in_stack_000000f0 == 0);
            unaff_x27 = 0;
            unaff_x21 = -0x8000000000000000;
            unaff_x23 = (undefined8 *)&UNK_009ee238;
            unaff_x24 = in_stack_000000a0;
            unaff_x25 = in_stack_00000090;
          }
          in_stack_00000108 = (uint *)unaff_x23[1];
          uStack0000000000000100 = (uint *)*unaff_x23;
          in_stack_00000118 = unaff_x23[3];
          in_stack_00000110 = unaff_x23[2];
          if ((*(ulong *)(unaff_x25 + 0x28) <= unaff_x24) ||
             (plVar16 = (long *)(*(long *)(unaff_x25 + 0x20) + unaff_x24 * 0x20),
             *plVar16 == unaff_x21)) {
            puVar15 = &UNK_009ef2a8;
            goto LAB_00571da8;
          }
          unaff_x26 = plVar16[2];
          uVar31 = unaff_x27;
          uVar17 = in_stack_000000f0;
        } while (unaff_x26 == 0);
LAB_005710dc:
        if (uVar17 <= uVar31) {
          puVar15 = &UNK_009ef2c0;
          goto LAB_00571e08;
        }
        unaff_x26 = unaff_x26 - 1;
        unaff_x22 = in_stack_000000e8 + uVar31 * 0x18;
        lVar30 = *(long *)(unaff_x22 + 0x10) << 3;
        plVar16 = *(long **)(unaff_x22 + 8);
        while (lVar30 != 0) {
          lVar18 = *plVar16;
          lVar30 = lVar30 + -8;
          plVar16 = plVar16 + 1;
          if (lVar18 != 0) goto code_r0x00571110;
        }
        unaff_x27 = uVar31 + 1;
LAB_005718ec:
        lVar30 = (long)in_stack_00000108 * 9 + 0x11;
        if (!(in_stack_00000108 == (uint *)0x0 || lVar30 == 0)) {
          func_0x00187bd4(uStack0000000000000100 + (long)in_stack_00000108 * -2 + -2,lVar30,8);
        }
        goto LAB_0057109c;
      }
      puVar15 = &UNK_009ef4d0;
      goto LAB_00571e08;
    }
  }
LAB_00571da0:
  puVar15 = &UNK_009ef4b8;
LAB_00571da8:
  func_0x007a23bc(puVar15);
  goto LAB_005720f8;
code_r0x005702c4:
  lVar18 = lVar18 + -8;
  puVar33 = puVar33 + 2;
  if (lVar18 == 0) goto code_r0x005703d0;
  goto code_r0x005702d0;
  while( true ) {
    lVar25 = lVar25 << 3;
    plVar28 = *(long **)(lVar35 + 8);
    while( true ) {
      if ((*plVar28 != 0) && (*plVar28 == plVar22[1])) break;
      lVar25 = lVar25 + -8;
      plVar28 = plVar28 + 1;
      if (lVar25 == 0) goto code_r0x005706fc;
    }
    plVar22 = plVar26;
    if (plVar26 == plVar19 + lVar30 * 3) break;
code_r0x0057047c:
    plVar26 = plVar22 + 3;
    if ((*plVar22 != -0x8000000000000000) || (lVar25 = *(long *)(lVar35 + 0x10), lVar25 == 0))
    goto code_r0x005706fc;
  }
code_r0x005704c8:
  uVar29 = lVar12 - lVar30;
  if ((bVar9) && (uVar29 != 0)) {
    plVar19 = (long *)(*(long *)(lVar18 + 0x40) + 8);
    uVar24 = lVar30 - lVar12;
    do {
      if (lVar32 == 0) goto code_r0x00570884;
      lVar30 = plVar19[-1];
      if (lVar30 < 7) {
        if (lVar30 < 5) {
          if ((lVar30 != 0) && (lVar30 != 4)) goto code_r0x005706fc;
        }
        else if (lVar30 == 5) {
          uVar27 = func_0x005ca810(plVar19);
          goto code_r0x005704e8;
        }
      }
      else {
        if (9 < lVar30) {
          if ((lVar30 == 10) || (*plVar19 == -0x8000000000000000)) goto code_r0x005704ec;
          goto code_r0x005706fc;
        }
        if (lVar30 == 8) {
          uVar27 = func_0x005ca90c(plVar19);
        }
        else {
          if (lVar30 != 9) goto code_r0x005706fc;
          uVar27 = func_0x005c0b7c(plVar19);
        }
code_r0x005704e8:
        if ((uVar27 & 1) != 0) goto code_r0x005706fc;
      }
code_r0x005704ec:
      plVar19 = plVar19 + 8;
      lVar32 = lVar32 + -0x40;
      bVar9 = 0xfffffffffffffffe < uVar24;
      uVar24 = uVar24 + 1;
      if (bVar9) {
code_r0x00570884:
        uVar24 = plVar16[2];
        break;
      }
    } while( true );
  }
  if (uVar24 <= uVar17) {
    puVar15 = &UNK_009ef6c8;
    uVar31 = uVar17;
code_r0x00571ee8:
    func_0x007a2570(uVar31,uVar24,puVar15);
    goto LAB_005720f8;
  }
  lVar30 = plVar16[1] + uVar17 * 0x108;
  if (*(long *)(lVar30 + 0x18) == 0xf) {
    if (*(long *)(lVar30 + 0x48) != 0) {
      lVar18 = *(long *)(lVar30 + 0x48) + -1;
      *(long *)(lVar30 + 0x48) = lVar18;
      puVar34 = (undefined8 *)(*(long *)(lVar30 + 0x40) + lVar18 * 0x40);
      puVar21 = (uint *)*puVar34;
      if (puVar21 != &MACH_HEADER.filetype) {
        in_stack_00000190 = (uint *)puVar34[2];
        in_stack_00000188 = (uint *)puVar34[1];
        in_stack_000001a0 = puVar34[4];
        in_stack_00000198 = puVar34[3];
        in_stack_000001b0 = puVar34[6];
        in_stack_000001a8 = puVar34[5];
        in_stack_000001b8 = puVar34[7];
        uStack0000000000000180 = puVar21;
        if ((ulong)plVar16[2] <= uVar31) {
          func_0x007a2570(uVar31,plVar16[2],&UNK_009ef710);
          goto LAB_005720f8;
        }
        lVar30 = plVar16[1] + uVar31 * 0x108;
        if (*(long *)(lVar30 + 0x18) != 0x18) {
          func_0x007a23bc(&UNK_009ef728);
          goto LAB_005720f8;
        }
        if (*(ulong *)(lVar30 + 0x48) < uVar29) {
          func_0x007a28bc(uVar29,*(ulong *)(lVar30 + 0x48),&UNK_009edf90);
          goto LAB_005720f8;
        }
        *(ulong *)(lVar30 + 0x48) = uVar29;
        func_0x005595d0(&uStack0000000000000100,(long)register0x00000008 + 0x210,&UNK_009eeea8);
        uVar24 = (ulong)in_stack_00000190;
        puVar37 = in_stack_00000188;
        puVar21 = uStack0000000000000180;
        lVar18 = *(long *)(lVar30 + 0x48);
        if (lVar18 == *(long *)(lVar30 + 0x38)) {
          func_0x00582ff0(lVar30 + 0x38,&UNK_009ef740);
        }
        puVar34 = (undefined8 *)(*(long *)(lVar30 + 0x40) + lVar18 * 0x40);
        puVar34[5] = in_stack_000001a8;
        puVar34[4] = in_stack_000001a0;
        puVar34[7] = in_stack_000001b8;
        puVar34[6] = in_stack_000001b0;
        puVar34[1] = in_stack_00000188;
        *puVar34 = uStack0000000000000180;
        puVar34[3] = in_stack_00000198;
        puVar34[2] = in_stack_00000190;
        *(long *)(lVar30 + 0x48) = lVar18 + 1;
        if ((ulong)plVar16[2] <= uVar17) {
          func_0x007a2570(uVar17,plVar16[2],&UNK_009ef758);
          goto LAB_005720f8;
        }
        func_0x0056f6dc((long)register0x00000008 + 0x210,plVar16[1] + uVar17 * 0x108);
        if (uVar24 == 0) goto code_r0x00570ac8;
        puVar38 = puVar37;
code_r0x00570a84:
        if (in_stack_00000068[3] != 0) {
          lVar30 = 0;
          puVar33 = puVar38 + 2;
          uVar29 = (**(long **)puVar38 + 8) * 0x517cc1b727220a95;
          lVar18 = *in_stack_00000068;
          bVar10 = (byte)(uVar29 >> 0x39);
          while( true ) {
            uVar29 = uVar29 & in_stack_00000068[1];
            uVar40 = *(undefined8 *)(lVar18 + uVar29);
            bVar39 = (byte)((ulong)uVar40 >> 8);
            bVar41 = (byte)((ulong)uVar40 >> 0x10);
            bVar42 = (byte)((ulong)uVar40 >> 0x18);
            bVar43 = (byte)((ulong)uVar40 >> 0x20);
            bVar44 = (byte)((ulong)uVar40 >> 0x28);
            bVar45 = (byte)((ulong)uVar40 >> 0x30);
            bVar46 = (byte)((ulong)uVar40 >> 0x38);
            for (uVar27 = CONCAT17(-(bVar46 == bVar10),
                                   CONCAT16(-(bVar45 == bVar10),
                                            CONCAT15(-(bVar44 == bVar10),
                                                     CONCAT14(-(bVar43 == bVar10),
                                                              CONCAT13(-(bVar42 == bVar10),
                                                                       CONCAT12(-(bVar41 == bVar10),
                                                                                CONCAT11(-(bVar39 ==
                                                                                          bVar10),-(
                                                  (byte)uVar40 == bVar10)))))))) &
                          0x8080808080808080; uVar27 != 0; uVar27 = uVar27 - 1 & uVar27) {
              uVar14 = (uVar27 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                       (uVar27 >> 7 & 0xff00ff00ff00ff) << 8;
              uVar14 = (uVar14 & 0xffff0000ffff0000) >> 0x10 | (uVar14 & 0xffff0000ffff) << 0x10;
              uVar14 = uVar29 + ((ulong)LZCOUNT(uVar14 >> 0x20 | uVar14 << 0x20) >> 3) &
                       in_stack_00000068[1];
              if (**(long **)puVar38 == *(long *)(lVar18 + -0x10 + uVar14 * -0x10)) {
                lVar18 = lVar18 + uVar14 * -0x10;
                lVar35 = *(long *)(lVar18 + -8);
                lVar30 = 0;
                if (lVar35 != 0) {
                  lVar30 = lVar35 + -1;
                }
                *(long *)(lVar18 + -8) = lVar30;
                puVar38 = puVar33;
                if (puVar33 != puVar37 + uVar24 * 2) goto code_r0x00570a84;
                goto code_r0x00570ac8;
              }
            }
            bVar39 = NEON_umaxv(CONCAT17(-(bVar46 == 0xff),
                                         CONCAT16(-(bVar45 == 0xff),
                                                  CONCAT15(-(bVar44 == 0xff),
                                                           CONCAT14(-(bVar43 == 0xff),
                                                                    CONCAT13(-(bVar42 == 0xff),
                                                                             CONCAT12(-(bVar41 ==
                                                                                       0xff),
                                                  CONCAT11(-(bVar39 == 0xff),-((byte)uVar40 == 0xff)
                                                          ))))))),1);
            if ((bVar39 & 1) != 0) break;
            lVar30 = lVar30 + 8;
            uVar29 = uVar29 + lVar30;
          }
        }
        func_0x007a23bc(&UNK_009ef7b8);
        goto LAB_005720f8;
      }
    }
    puVar15 = &UNK_009ef6f8;
  }
  else {
    puVar15 = &UNK_009ef6e0;
  }
code_r0x00571e90:
  func_0x007a23bc(puVar15);
  goto LAB_005720f8;
code_r0x00570ac8:
  if (puVar21 != (uint *)0x0) {
    func_0x00187bd4(puVar37,(long)puVar21 << 3,8);
  }
  if ((ulong)plVar16[2] <= uVar17) {
    func_0x007a2570(uVar17,plVar16[2],&UNK_009ef770);
    goto LAB_005720f8;
  }
  lVar30 = plVar16[1] + uVar17 * 0x108;
  func_0x0056dcac(lVar30);
  _memcpy(lVar30,(long)register0x00000008 + 0x210,0x108);
  puVar21 = in_stack_00000108;
  puVar37 = uStack0000000000000100;
  puVar33 = in_stack_00000108 + in_stack_00000110 * 2;
  puVar20 = in_stack_00000108;
  puVar38 = in_stack_00000108;
  if (in_stack_00000110 != 0) {
    do {
      puVar38 = puVar20 + 2;
      plVar19 = *(long **)puVar20;
      if (in_stack_000000d8 <= uVar31) {
        func_0x007a2570(uVar31,in_stack_000000d8,&UNK_009ef788);
        goto LAB_005720f8;
      }
      lVar18 = in_stack_000000d0 + uVar31 * 0x18;
      lVar30 = *(long *)(lVar18 + 0x10);
      if (lVar30 == 0) {
code_r0x00571f20:
        func_0x007a23bc(&UNK_009ef7a0);
        goto LAB_005720f8;
      }
      puVar34 = *(undefined8 **)(lVar18 + 8);
      lVar30 = lVar30 << 3;
      while (plVar22 = (long *)*puVar34, plVar22 != plVar19) {
        puVar34 = puVar34 + 1;
        lVar30 = lVar30 + -8;
        if (lVar30 == 0) goto code_r0x00571f20;
      }
      lVar30 = *plVar22;
      *plVar22 = lVar30 + -1;
      LORelease();
      if (lVar30 == 1) {
        func_0x005d2ac4(puVar34);
      }
      *puVar34 = 0;
      lVar30 = *plVar19;
      *plVar19 = lVar30 + -1;
      LORelease();
      if (lVar30 == 1) {
        func_0x005d2ac4((long)register0x00000008 + 0x200);
      }
      puVar20 = puVar38;
    } while (puVar38 != puVar33);
  }
  func_0x005928cc((long)register0x00000008 + 0x210);
code_r0x0057081c:
  lVar30 = in_stack_000000e8 * 9 + 0x11;
  if (in_stack_000000e8 != 0 && lVar30 != 0) {
    func_0x00187bd4(uStack00000000000000e0 + in_stack_000000e8 * -8 + -8,lVar30,8);
  }
code_r0x0056ff24:
  if ((ulong)plVar16[2] <= uVar31) goto code_r0x00570f74;
  goto code_r0x0056ff34;
code_r0x00571110:
  if ((*(ulong *)(unaff_x25 + 0x28) <= unaff_x24) ||
     (unaff_x20 = (long *)(*(long *)(unaff_x25 + 0x20) + unaff_x24 * 0x20), *unaff_x20 == unaff_x21)
     ) {
    puVar15 = &UNK_009ef2d8;
    goto LAB_00571da8;
  }
  if ((ulong)unaff_x20[2] <= unaff_x26) {
    puVar15 = &UNK_009ef2f0;
    uVar31 = unaff_x26;
    uVar17 = unaff_x20[2];
    goto LAB_00571e08;
  }
  func_0x0056f78c((long)register0x00000008 + 0x210,unaff_x20[1] + unaff_x26 * 0x108);
  unaff_x24 = in_stack_000000a0;
  if ((in_stack_00000220 != (uint *)0x0) && (*(long *)(in_stack_000000a8 + 0xc) != 0)) {
    uVar40 = *(undefined8 *)(in_stack_000000a8 + 0xe);
    uVar3 = *(undefined8 *)(in_stack_000000a8 + 0x10);
    puVar23 = puVar21;
    do {
      puVar37 = puVar23 + 2;
      lVar18 = **(long **)puVar23;
      uVar24 = func_0x005787f4(uVar40,uVar3,lVar18);
      lVar30 = 0;
      uVar29 = uVar24 >> 0x39;
      while( true ) {
        uVar24 = uVar24 & *(ulong *)(in_stack_000000a8 + 8);
        uVar14 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + uVar24);
        uVar27 = uVar14 ^ uVar29 * 0x101010101010101;
        for (uVar27 = uVar27 + 0xfefefefefefefeff & (uVar27 ^ 0xffffffffffffffff) &
                      0x8080808080808080; uVar27 != 0; uVar27 = uVar27 - 1 & uVar27) {
          uVar13 = (uVar27 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar27 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar13 = *(ulong *)(*(long *)(in_stack_000000a8 + 6) + -8 +
                             (uVar24 + ((ulong)LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) >> 3) &
                             *(ulong *)(in_stack_000000a8 + 8)) * -8);
          if (*(ulong *)(in_stack_000000a8 + 4) <= uVar13) {
            func_0x007a2570(uVar13,*(ulong *)(in_stack_000000a8 + 4),&UNK_009f0c60);
            goto LAB_005720f8;
          }
          if (lVar18 == *(long *)(*(long *)(in_stack_000000a8 + 2) + uVar13 * 0x18)) {
            if (in_stack_00000210 != (uint *)0x0) {
              func_0x00187bd4(puVar21,(long)in_stack_00000210 << 3,8);
            }
            unaff_x27 = uVar31 + 1;
            unaff_x21 = -0x8000000000000000;
            unaff_x23 = (undefined8 *)&UNK_009ee238;
            unaff_x25 = in_stack_00000090;
            goto LAB_005718ec;
          }
        }
        if ((uVar14 & uVar14 << 1 & 0x8080808080808080) != 0) break;
        lVar30 = lVar30 + 8;
        uVar24 = lVar30 + uVar24;
      }
      puVar23 = puVar37;
      unaff_x25 = in_stack_00000090;
    } while (puVar37 != puVar21 + (long)in_stack_00000220 * 2);
  }
  if (in_stack_00000210 != (uint *)0x0) {
    func_0x00187bd4(puVar21,(long)in_stack_00000210 << 3,8);
  }
  unaff_x23 = (undefined8 *)&UNK_009ee238;
  if ((ulong)unaff_x20[2] <= unaff_x26) {
    puVar15 = &UNK_009ef308;
    uVar31 = unaff_x26;
    uVar17 = unaff_x20[2];
    goto LAB_00571e08;
  }
  func_0x0056f6dc(&uStack0000000000000180,unaff_x20[1] + unaff_x26 * 0x108);
  in_stack_00000210 = in_stack_00000188;
  in_stack_00000220 = uStack0000000000000180;
  unaff_x21 = -0x8000000000000000;
  uVar24 = func_0x0059038c((long)register0x00000008 + 0x210,in_stack_00000088,
                           &uStack0000000000000100);
  in_stack_00000218 = in_stack_00000210;
  unaff_x27 = uVar31;
  if ((uVar24 & 1) == 0) {
    unaff_x28 = uVar17;
    if (in_stack_00000220 != (uint *)0x0) {
      func_0x00187bd4(in_stack_00000210,(long)in_stack_00000220 << 3,8);
    }
    goto code_r0x005712f4;
  }
  if (in_stack_00000220 == (uint *)0x0) goto code_r0x005716f4;
  func_0x00187bd4(in_stack_00000210,(long)in_stack_00000220 << 3,8);
  puVar21 = in_stack_00000210;
  if (unaff_x26 == 0) goto LAB_00571928;
  goto LAB_005710dc;
}

