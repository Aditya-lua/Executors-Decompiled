
/* WARNING: Removing unreachable block (ram,0x00568874) */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte FUN_005686b4(ulong param_1)

{
  bool bVar1;
  undefined1 uVar2;
  code *pcVar3;
  bool bVar4;
  bool bVar5;
  long lVar6;
  long lVar7;
  byte bVar8;
  int iVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  dword *pdVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  dword *pdVar15;
  undefined *puVar16;
  undefined1 extraout_w1;
  undefined1 extraout_w1_00;
  undefined *puVar17;
  long *plVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong in_x10;
  ulong uVar23;
  long *plVar24;
  long *plVar25;
  long *plVar26;
  ulong uVar27;
  ulong uVar28;
  long lVar29;
  int iVar30;
  long *plVar31;
  long lVar32;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar33;
  ulong *puVar34;
  long *plVar35;
  long lVar36;
  bool bVar37;
  ulong uVar38;
  undefined8 *puVar39;
  long unaff_x24;
  dword *pdVar40;
  ulong unaff_x25;
  undefined8 *puVar41;
  undefined8 *unaff_x26;
  byte unaff_w27;
  undefined4 uVar42;
  ulong unaff_x28;
  long unaff_x29;
  dword *pdVar43;
  dword *pdVar44;
  dword *pdVar45;
  dword *pdVar46;
  dword *pdVar47;
  dword *pdVar48;
  dword *pdVar49;
  undefined1 auVar50 [16];
  uint uStack0000000000000008;
  dword dStack000000000000000c;
  byte in_stack_00000018;
  undefined *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined *in_stack_00000030;
  undefined *in_stack_00000038;
  dword *in_stack_00000040;
  dword *in_stack_00000048;
  undefined *in_stack_00000058;
  undefined *in_stack_00000060;
  undefined *in_stack_00000068;
  undefined *in_stack_00000070;
  undefined *in_stack_00000078;
  undefined8 *in_stack_00000080;
  ulong in_stack_00000088;
  uint in_stack_00000090;
  undefined8 uStack0000000000000098;
  undefined8 in_stack_000000a0;
  long in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  dword *in_stack_00000100;
  dword *in_stack_00000108;
  dword *in_stack_00000110;
  dword *in_stack_00000118;
  undefined8 in_stack_00000120;
  long in_stack_00000128;
  undefined4 uStack0000000000000130;
  uint uStack0000000000000134;
  undefined8 uStack0000000000000138;
  dword *in_stack_00000140;
  dword *in_stack_00000148;
  dword *in_stack_00000150;
  dword *in_stack_00000158;
  dword *in_stack_00000160;
  undefined8 in_stack_00000168;
  long in_stack_00000170;
  undefined8 uStack0000000000000180;
  dword *in_stack_00000188;
  dword *in_stack_00000190;
  dword *in_stack_00000198;
  undefined8 uStack00000000000001a0;
  dword *in_stack_000001a8;
  undefined8 in_stack_000001b0;
  long in_stack_000001b8;
  undefined1 uStack00000000000001c0;
  undefined4 uStack00000000000001c4;
  ulong in_stack_000001c8;
  dword *in_stack_00000208;
  dword *pdVar51;
  dword *in_stack_00000210;
  uint uVar52;
  dword *in_stack_00000218;
  dword *in_stack_00000220;
  dword *pdVar53;
  uint uVar54;
  dword *in_stack_00000320;
  dword *in_stack_00000328;
  dword *in_stack_00000330;
  dword *in_stack_00000338;
  dword *in_stack_00000340;
  dword *in_stack_00000348;
  undefined8 in_stack_00000350;
  long in_stack_00000358;
  dword *pdVar55;
  dword *in_stack_00000360;
  dword *pdVar56;
  dword *in_stack_00000368;
  dword *pdVar57;
  dword *in_stack_00000370;
  dword *pdVar58;
  dword *in_stack_00000378;
  dword *pdVar59;
  dword *in_stack_00000380;
  dword *pdVar60;
  dword *in_stack_00000388;
  undefined8 in_stack_00000390;
  long in_stack_00000398;
  dword *in_stack_000003c0;
  dword *in_stack_000003c8;
  dword *in_stack_000003d0;
  dword *in_stack_000003d8;
  dword *in_stack_000003e0;
  dword *in_stack_000003e8;
  undefined8 in_stack_000003f0;
  long in_stack_000003f8;
  dword *in_stack_00000400;
  dword *in_stack_00000408;
  dword *in_stack_00000410;
  dword *in_stack_00000418;
  dword *in_stack_00000420;
  dword *in_stack_00000428;
  undefined8 in_stack_00000430;
  long in_stack_00000438;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x005686b4:
  if ((in_x10 < param_1) &&
     (puVar13 = (undefined8 *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
     (undefined8 *)*puVar13 != unaff_x26)) {
    uVar21 = (ulong)*(uint *)((long)puVar13 + 0x1c);
    uVar23 = *(ulong *)(unaff_x20 + 0x40);
  }
  else {
    uVar21 = 0xffffffff;
    uVar23 = *(ulong *)(unaff_x20 + 0x40);
  }
  if (uVar23 >> 0x20 == 0) {
LAB_005687e4:
    if (uVar21 < uVar23) goto code_r0x005687ec;
    func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_stack_00000088);
    if (in_stack_00000210 != (dword *)unaff_x26) {
      pdVar40 = (dword *)((long)in_stack_00000220 + 1);
      pdVar45 = in_stack_00000218;
      while (pdVar40 = (dword *)((long)pdVar40 + -1), pdVar40 != (dword *)0x0) {
        func_0x00554164(pdVar45);
        pdVar45 = pdVar45 + 0x42;
      }
      unaff_x24 = 1;
      if (in_stack_00000210 != (dword *)0x0) {
        func_0x00187bd4(in_stack_00000218,(long)in_stack_00000210 * 0x108,8);
      }
    }
    param_1 = *(ulong *)(unaff_x20 + 0x28);
  }
LAB_005689cc:
  if ((unaff_x19 < param_1) &&
     (puVar34 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     (undefined8 *)*puVar34 != unaff_x26)) {
    if ((puVar34[2] == 0) || (lVar36 = puVar34[1] + puVar34[2] * 0x108, lVar36 == 0x108)) {
      in_stack_00000058 = &UNK_009ee9c8;
      goto LAB_0056a314;
    }
    if (lVar36 == 0xe8 || *(long *)(lVar36 + -0xf0) != 0x10) {
      in_stack_00000058 = &UNK_009ee9e0;
      goto LAB_0056a314;
    }
    lVar7 = *(long *)in_stack_00000208;
    *(long *)in_stack_00000208 = lVar7 + unaff_x24;
    if (lVar7 < 0) {
LAB_0056a25c:
      func_0x007a05dc();
    }
    else {
      func_0x005649d4();
      *(undefined8 *)(lVar36 + -0xe8) = 0;
      *(dword **)(lVar36 + -0xe0) = in_stack_00000208;
      uVar21 = puVar34[2];
      puVar13 = (undefined8 *)func_0x00187bd0(0x18,8);
      if (puVar13 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x18);
      }
      else {
        *puVar13 = unaff_x26;
        puVar13[1] = in_stack_00000208;
        *(long *)(unaff_x29 + -0xf8) = unaff_x24;
        *(undefined8 **)(unaff_x29 + -0xf0) = puVar13;
        *(long *)(unaff_x29 + -0xe8) = unaff_x24;
        puVar13 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar13 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x40);
        }
        else {
          uVar21 = uVar21 - 1;
          puVar13[1] = in_stack_000003c8;
          *puVar13 = in_stack_000003c0;
          puVar13[3] = in_stack_000003d8;
          puVar13[2] = in_stack_000003d0;
          puVar13[5] = in_stack_000003e8;
          puVar13[4] = in_stack_000003e0;
          puVar13[7] = in_stack_000003f8;
          puVar13[6] = in_stack_000003f0;
          pdVar12 = *(dword **)(unaff_x29 + -0xf0);
          pdVar45 = *(dword **)(unaff_x29 + -0xf8);
          uVar19 = *(undefined8 *)(unaff_x29 + -0xe8);
          pdVar40 = (dword *)((long)&MACH_HEADER.filetype + 3);
          uVar23 = puVar34[2];
          if (uVar21 <= uVar23) {
            if (uVar23 == *puVar34) {
              func_0x005bd0a4(puVar34,&UNK_009ee9f8);
            }
            lVar36 = puVar34[1] + uVar21 * 0x108;
            if (uVar21 <= uVar23 && uVar23 - uVar21 != 0) {
              _memmove(lVar36 + 0x108,lVar36,(uVar23 - uVar21) * 0x108);
            }
            _memcpy(lVar36,auStack_7ffffffe + 0x8000020e,0x108);
            puVar34[2] = uVar23 + 1;
            pdVar51 = in_stack_00000210;
            pdVar15 = in_stack_00000218;
            lVar36 = unaff_x24;
LAB_00569000:
            uVar52 = 0;
            if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
              uVar52 = in_stack_00000090;
            }
            pdVar43 = pdVar51;
            pdVar46 = pdVar15;
            pdVar48 = in_stack_00000220;
            pdVar53 = pdVar40;
            pdVar44 = pdVar45;
            pdVar55 = in_stack_00000360;
            pdVar56 = in_stack_00000368;
            pdVar57 = in_stack_00000370;
            pdVar58 = in_stack_00000378;
            pdVar59 = in_stack_00000380;
            pdVar60 = in_stack_00000388;
            uVar14 = in_stack_00000390;
            lVar7 = in_stack_00000398;
            if ((uVar52 & 1) != 0) {
              func_0x005649d4(&uStack00000000000000f0);
              func_0x005649d4(&uStack0000000000000138);
            }
code_r0x00569028:
            unaff_w27 = in_stack_00000018 | unaff_w27;
            uVar21 = *(ulong *)(unaff_x20 + 0x28);
            pdVar49 = pdVar53;
            pdVar47 = pdVar12;
            uVar20 = uVar19;
            lVar6 = lVar36;
            in_stack_00000360 = pdVar55;
            in_stack_00000368 = pdVar56;
            in_stack_00000370 = pdVar57;
            in_stack_00000378 = pdVar58;
            in_stack_00000380 = pdVar59;
            in_stack_00000388 = pdVar60;
            in_stack_00000390 = uVar14;
            in_stack_00000398 = lVar7;
            do {
              if ((uVar21 <= unaff_x19) ||
                 (puVar39 = (undefined8 *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
                 (undefined8 *)*puVar39 == unaff_x26)) {
                puVar16 = &UNK_009ee5f0;
                goto code_r0x0056a0b0;
              }
              if (puVar39[2] != 0) {
                lVar36 = puVar39[1] + puVar39[2] * 0x108;
                if (lVar36 != 0x108) {
                  if (*(long *)(lVar36 + -0xf0) == 0x10) {
                    func_0x00566040(auStack_7ffffffe + 0x8000031e,lVar36 + -0xe8);
                    func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                    if (pdVar43 == (dword *)0x0) {
                      func_0x007a23bc(&UNK_009ee608);
                      goto code_r0x0056a5ec;
                    }
                    uVar21 = *(ulong *)(unaff_x20 + 0x28);
                    if (((ulong)pdVar46 >> 0x20 < uVar21) &&
                       (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) +
                                          ((ulong)pdVar46 >> 0x20) * 0x20),
                       *plVar35 != -0x8000000000000000)) {
                      uVar23 = (ulong)*(uint *)((long)plVar35 + 0x1c);
                    }
                    else {
                      uVar23 = 0xffffffff;
                    }
                    lVar7 = 0;
                    uVar52 = (uint)((ulong)pdVar44 >> 0x20);
                    uVar27 = 0xffffffff;
                    lVar36 = *(long *)(unaff_x20 + 0x38);
                    uVar38 = *(ulong *)(unaff_x20 + 0x40);
                    if (0xffffffff < uVar38) goto code_r0x00569138;
                    while (uVar23 < uVar38) {
                      lVar29 = lVar36 + uVar23 * unaff_x25;
                      uVar23 = (ulong)*(uint *)(lVar29 + 0x24);
                      if (*(int *)(lVar29 + 0x28) != -1) {
                        for (; lVar7 = lVar7 + 1, uVar27 < uVar38;
                            uVar27 = (ulong)*(uint *)(lVar36 + uVar27 * unaff_x25 + 0x20)) {
code_r0x00569138:
                        }
                      }
                    }
                    uVar42 = (undefined4)unaff_x28;
                    uVar54 = (uint)((ulong)pdVar46 >> 0x20);
                    if ((lVar7 != 1) || (*(long *)(pdVar43 + 4) != 0)) {
                      bVar4 = false;
                      pdVar45 = _UNK_009efac0;
                      pdVar12 = _UNK_009efac8;
                      pdVar51 = _UNK_009efad8;
                      pdVar40 = pdVar43;
                      pdVar15 = pdVar48;
                      pdVar55 = pdVar49;
joined_r0x00569168:
                      pdVar48 = _UNK_009efad0;
                      if (uVar52 < uVar21) {
                        plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + (ulong)uVar52 * 0x20);
                        if (*plVar35 == -0x8000000000000000) {
                          uVar21 = 0xffffffff;
                        }
                        else {
                          uVar21 = (ulong)*(uint *)((long)plVar35 + 0x1c);
                        }
                      }
                      else {
                        uVar21 = 0xffffffff;
                      }
                      uVar23 = 0xffffffff;
                      lVar7 = 0;
                      if (uVar38 < 0x100000000) goto code_r0x00569240;
                      do {
                        do {
                          uVar23 = (ulong)*(uint *)(lVar36 + uVar23 * unaff_x25 + 0x20);
                          lVar7 = lVar7 + 1;
                        } while (uVar23 < uVar38);
code_r0x00569240:
                        do {
                          if (uVar38 <= uVar21) {
                            _UNK_009efac0 = pdVar45;
                            _UNK_009efac8 = pdVar12;
                            _UNK_009efad0 = pdVar48;
                            _UNK_009efad8 = pdVar51;
                            if (lVar7 == 1) {
                              if (*(long *)(pdVar49 + 4) != 0) goto code_r0x005692f8;
                              lVar36 = *(long *)(pdVar43 + 2);
                              lVar7 = *(long *)(pdVar43 + 4);
                              if (lVar7 != 0) {
                                func_0x007a5f8c(auStack_7ffffffe + 0x8000020e,lVar7,
                                                auStack_7ffffffe + 0x8000022e,1);
                              }
                              func_0x00585744(lVar36,lVar36 + lVar7 * 0x48,
                                              auStack_7ffffffe + 0x8000020e);
                              *(dword **)(unaff_x29 + -0x90) = pdVar12;
                              *(dword **)(unaff_x29 + -0x98) = pdVar45;
                              *(dword **)(unaff_x29 + -0x80) = pdVar51;
                              *(dword **)(unaff_x29 + -0x88) = pdVar48;
                              *(uint *)(unaff_x29 + -0xa0) = uVar52;
                              *(uint *)(unaff_x29 + -0x9c) = uVar54;
                              func_0x00567190(auStack_7ffffffe + 0x8000020e);
                              pdVar40 = pdVar45;
                              pdVar46 = pdVar12;
                              pdVar15 = pdVar48;
                              pdVar55 = pdVar51;
                              if (pdVar45 == &MACH_HEADER.filetype) goto code_r0x005692f8;
                              func_0x00584d50(unaff_x29 + -0xa0);
                              if (*(long *)(unaff_x29 + -0xa0) == 0) {
                                func_0x007a23bc(&UNK_009ee638);
                                goto code_r0x0056a5ec;
                              }
                              bVar5 = uVar54 != *(uint *)(unaff_x29 + -0x94);
                              if (bVar5) {
                                uVar19 = func_0x005cb804(unaff_x29 + -0xa0,0);
                                *(undefined1 *)(unaff_x29 + -0xd0) = extraout_w1_00;
                                *(undefined8 *)(unaff_x29 + -0xe0) = 8;
                                *(undefined8 *)(unaff_x29 + -0xd8) = uVar19;
                                func_0x005c1d84(unaff_x29 + -0xf8,unaff_x29 + -0xe0,
                                                unaff_x29 + -0xa0,0xd);
                                in_stack_00000100 = *(dword **)(unaff_x29 + -0xf0);
                                uStack00000000000000f8 = *(dword **)(unaff_x29 + -0xf8);
                                in_stack_00000108 = *(dword **)(unaff_x29 + -0xe8);
                              }
                              else {
                                func_0x005c1d84(unaff_x29 + -0xf8,unaff_x29 + -0xe0,
                                                unaff_x29 + -0xa0,0xe);
                                in_stack_00000100 = *(dword **)(unaff_x29 + -0xf0);
                                uStack00000000000000f8 = *(dword **)(unaff_x29 + -0xf8);
                                in_stack_00000108 = *(dword **)(unaff_x29 + -0xe8);
                                in_stack_000003c0 = in_stack_00000320;
                                in_stack_000003c8 = in_stack_00000328;
                                in_stack_000003d0 = in_stack_00000330;
                                in_stack_000003d8 = in_stack_00000338;
                                in_stack_000003e0 = in_stack_00000340;
                                in_stack_000003e8 = in_stack_00000348;
                                in_stack_000003f0 = in_stack_00000350;
                                in_stack_000003f8 = in_stack_00000358;
                              }
                              bVar37 = false;
                              uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
                              bVar1 = false;
                              if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                                bVar1 = bVar4;
                              }
                              uStack0000000000000130 = uVar42;
                              uStack0000000000000134 = uVar52;
                              uStack0000000000000138._0_4_ = uVar54;
                              uStack0000000000000138._4_1_ = (char)puVar13;
                              uStack0000000000000138._5_1_ = bVar5;
                              pdVar43 = pdVar45;
                              in_stack_00000360 = pdVar45;
                              in_stack_00000368 = pdVar12;
                              in_stack_00000370 = pdVar48;
                              in_stack_00000378 = pdVar51;
                              in_stack_00000380 = pdVar44;
                              in_stack_00000388 = pdVar47;
                              in_stack_00000390 = uVar20;
                              in_stack_00000398 = lVar6;
                              in_stack_00000400 = pdVar45;
                              in_stack_00000408 = pdVar12;
                              in_stack_00000410 = pdVar48;
                              in_stack_00000418 = pdVar51;
                              in_stack_00000420 = pdVar44;
                              in_stack_00000428 = pdVar47;
                              in_stack_00000430 = uVar20;
                              in_stack_00000438 = lVar6;
                              if (bVar1) goto code_r0x00569324;
                            }
                            else {
code_r0x005692f8:
                              pdVar51 = pdVar55;
                              pdVar48 = pdVar15;
                              pdVar12 = pdVar46;
                              pdVar45 = pdVar40;
                              uStack00000000000000f0 = &MACH_HEADER.filetype;
                              func_0x005649d4(auStack_7ffffffe + 0x8000031e);
                              bVar37 = true;
                              bVar5 = false;
                              if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                                bVar5 = bVar4;
                              }
                              pdVar43 = pdVar45;
                              if (bVar5) {
code_r0x00569324:
                                func_0x005649d4(&uStack0000000000000180);
                                pdVar43 = pdVar45;
                              }
                            }
                            unaff_x26 = (undefined8 *)0x8000000000000000;
                            pdVar46 = pdVar12;
                            pdVar49 = pdVar51;
                            if (bVar37) goto code_r0x005676c0;
                            goto code_r0x00569330;
                          }
                          lVar29 = lVar36 + uVar21 * unaff_x25;
                          uVar21 = (ulong)*(uint *)(lVar29 + 0x24);
                        } while ((*(int *)(lVar29 + 0x28) == -1) ||
                                (lVar7 = lVar7 + 1, uVar38 <= uVar23));
                      } while( true );
                    }
                    lVar36 = *(long *)(pdVar49 + 2);
                    lVar7 = *(long *)(pdVar49 + 4);
                    in_stack_00000188 = _UNK_009efac8;
                    uStack0000000000000180 = _UNK_009efac0;
                    in_stack_00000198 = _UNK_009efad8;
                    in_stack_00000190 = _UNK_009efad0;
                    if (lVar7 != 0) {
                      func_0x007a5f8c(&uStack0000000000000180,lVar7,&uStack00000000000001a0,1);
                    }
                    func_0x00585744(lVar36,lVar36 + lVar7 * 0x48,&uStack0000000000000180);
                    pdVar56 = in_stack_00000198;
                    pdVar55 = in_stack_00000190;
                    pdVar15 = in_stack_00000188;
                    pdVar46 = uStack0000000000000180;
                    pdVar40 = (dword *)CONCAT44(uVar52,uVar54);
                    func_0x00567190(&uStack0000000000000180);
                    lVar36 = in_stack_000001b8;
                    uVar19 = in_stack_000001b0;
                    pdVar57 = in_stack_000001a8;
                    pdVar44 = uStack00000000000001a0;
                    pdVar51 = in_stack_00000198;
                    pdVar48 = in_stack_00000190;
                    pdVar12 = in_stack_00000188;
                    pdVar45 = uStack0000000000000180;
                    if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                      lVar36 = *(long *)(unaff_x20 + 0x38);
                      uVar38 = *(ulong *)(unaff_x20 + 0x40);
                      bVar4 = true;
                      uVar21 = *(ulong *)(unaff_x20 + 0x28);
                      pdVar45 = _UNK_009efac0;
                      pdVar12 = _UNK_009efac8;
                      pdVar51 = _UNK_009efad8;
                      pdVar44 = pdVar56;
                      goto joined_r0x00569168;
                    }
                    uVar2 = uStack00000000000001c0;
                    func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                    if (pdVar40 == (dword *)0x0) {
                      func_0x007a23bc(&UNK_009ee620);
                      goto code_r0x0056a5ec;
                    }
                    bVar4 = (uint)((ulong)pdVar46 >> 0x20) != uVar52;
                    if (bVar4) {
                      func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,
                                      auStack_7ffffffe + 0x8000020e,0xd);
                      in_stack_00000400 = in_stack_00000320;
                      in_stack_00000408 = in_stack_00000328;
                      in_stack_00000410 = in_stack_00000330;
                      in_stack_00000418 = in_stack_00000338;
                      in_stack_00000420 = in_stack_00000340;
                      in_stack_00000428 = in_stack_00000348;
                      in_stack_00000430 = in_stack_00000350;
                      in_stack_00000438 = in_stack_00000358;
                    }
                    else {
                      uVar14 = func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
                      *(undefined1 *)(unaff_x29 + -0x90) = extraout_w1;
                      *(undefined8 *)(unaff_x29 + -0xa0) = 8;
                      *(undefined8 *)(unaff_x29 + -0x98) = uVar14;
                      func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,
                                      auStack_7ffffffe + 0x8000020e,0xe);
                    }
                    uStack0000000000000138._5_1_ = !bVar4;
                    uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
                    uStack0000000000000138._4_1_ = uVar2;
                    uStack0000000000000130 = uVar42;
                    uStack0000000000000134 = uVar54;
                    uStack0000000000000138._0_4_ = uVar52;
                    pdVar43 = pdVar45;
                    pdVar47 = pdVar57;
                    uVar20 = uVar19;
                    lVar6 = lVar36;
                    in_stack_000003c0 = pdVar45;
                    in_stack_000003c8 = pdVar12;
                    in_stack_000003d0 = pdVar48;
                    in_stack_000003d8 = pdVar51;
                    in_stack_000003e0 = pdVar44;
                    in_stack_000003e8 = pdVar57;
                    in_stack_000003f0 = uVar19;
                    in_stack_000003f8 = lVar36;
code_r0x00569330:
                    unaff_x26 = (undefined8 *)0x8000000000000000;
                    in_stack_000001c8 =
                         CONCAT26(uStack0000000000000138._6_2_,
                                  CONCAT15(uStack0000000000000138._5_1_,
                                           CONCAT14(uStack0000000000000138._4_1_,
                                                    (uint)uStack0000000000000138)));
                    _uStack00000000000001c0 =
                         (undefined8 *)CONCAT44(uStack0000000000000134,uStack0000000000000130);
                    in_stack_000001b8 = in_stack_00000128;
                    in_stack_000001b0 = in_stack_00000120;
                    in_stack_00000198 = in_stack_00000108;
                    in_stack_00000190 = in_stack_00000100;
                    in_stack_000001a8 = in_stack_00000118;
                    uStack00000000000001a0 = in_stack_00000110;
                    in_stack_00000188 = uStack00000000000000f8;
                    uStack0000000000000180 = uStack00000000000000f0;
                    if ((*(int *)(unaff_x20 + 0x78) == 1) &&
                       (uStack0000000000000134 == *(uint *)(unaff_x20 + 0x7c))) {
                      func_0x005649d4(&uStack0000000000000180);
                      pdVar46 = pdVar12;
                      pdVar49 = pdVar51;
                      goto code_r0x005676c0;
                    }
                    func_0x0055b5b8(unaff_x29 + -0xf8,auStack_7ffffffe + 0x8000020e,&UNK_009ee258);
                    if (*(long *)(unaff_x29 + -0xe8) != 1) {
                      func_0x007a247c(&UNK_008abfb8,0x2f,&UNK_009ee7d0);
                      goto code_r0x0056a5ec;
                    }
                    func_0x005578dc(auStack_7ffffffe + 0x8000031e,
                                    **(undefined8 **)(unaff_x29 + -0xf0),&UNK_009ee698);
                    if ((((ulong)_uStack00000000000001c0 & 0xffffffff) <
                         *(ulong *)(unaff_x20 + 0x28)) &&
                       (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) +
                                          ((ulong)_uStack00000000000001c0 & 0xffffffff) * 0x20),
                       *plVar35 != -0x8000000000000000)) {
                      lVar36 = plVar35[3];
                    }
                    else {
                      lVar36 = -1;
                    }
                    in_stack_000003c8 = *(dword **)(unaff_x20 + 0x38);
                    lVar7 = *(long *)(unaff_x20 + 0x40);
                    in_stack_000003c0 = (dword *)0x0;
                    uVar19 = CONCAT44((int)((ulong)pdVar44 >> 0x20),_uStack00000000000001c0);
                    func_0x0055b5b8(auStack_7ffffffe + 0x8000035e,auStack_7ffffffe + 0x8000020e,
                                    &UNK_009ee258);
                    if (in_stack_00000370 == (dword *)((long)&MACH_HEADER.magic + 1)) {
                      if (((ulong)in_stack_00000368[4] < *(ulong *)(unaff_x20 + 0x40)) &&
                         (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                            (ulong)in_stack_00000368[4] * (unaff_x25 & 0xffffffff)),
                         *plVar35 != -0x8000000000000000)) {
                        lVar29 = plVar35[2];
                        if (lVar29 != 0) {
                          puVar10 = (undefined8 *)plVar35[1];
                          puVar39 = puVar10 + 9;
                          puVar41 = puVar10;
                          pdVar40 = in_stack_000003c0;
                          do {
                            puVar11 = puVar39;
                            puVar39 = (undefined8 *)(in_stack_00000328 + -0x10);
                            lVar32 = (long)in_stack_00000330 * 0x48;
                            do {
                              in_stack_000003c0 = pdVar40;
                              if (lVar32 == 0) goto code_r0x005695f0;
                              in_stack_000003c0 = (dword *)puVar39[8];
                              puVar39 = puVar39 + 9;
                              lVar32 = lVar32 + -0x48;
                            } while (in_stack_000003c0 != (dword *)*puVar41);
                            lVar32 = *(long *)in_stack_000003c0;
                            *(long *)in_stack_000003c0 = lVar32 + 1;
                            if (lVar32 < 0) {
                              func_0x007a05dc();
                              goto code_r0x0056a5ec;
                            }
                            func_0x00566040(auStack_7ffffffe + 0x80000216);
                            lVar32 = *(long *)*puVar41;
                            *(long *)*puVar41 = lVar32 + -1;
                            LORelease();
                            if (lVar32 == 1) {
                              func_0x005d2ac4(puVar41);
                            }
                            func_0x005649d4(puVar41 + 1);
                            puVar41[1] = in_stack_000003c8;
                            *puVar41 = in_stack_000003c0;
                            puVar41[8] = puVar13;
                            puVar41[5] = in_stack_00000080;
                            puVar41[4] = uVar19;
                            puVar41[7] = lVar6;
                            puVar41[6] = uVar20;
                            puVar41[3] = lVar36;
                            puVar41[2] = lVar7;
code_r0x005695f0:
                            lVar32 = 0;
                            if (puVar11 != puVar10 + lVar29 * 9) {
                              lVar32 = 0x48;
                            }
                            puVar39 = (undefined8 *)((long)puVar11 + lVar32);
                            puVar41 = puVar11;
                            pdVar40 = in_stack_000003c0;
                          } while (puVar11 != puVar10 + lVar29 * 9);
                        }
                        func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                        if (in_stack_000003c0 == (dword *)0x0) {
                          puVar16 = &UNK_009ee6c8;
                        }
                        else {
                          iVar9 = func_0x0056c050();
                          if (iVar9 == 0) {
                            puVar16 = &UNK_008abf40;
                            uVar19 = 0x4a;
                            puVar17 = &UNK_009ee6e0;
                            goto code_r0x0056a11c;
                          }
                          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,
                                          uStack00000000000001c4);
                          lVar6 = in_stack_000001b8;
                          uVar20 = in_stack_000001b0;
                          pdVar47 = in_stack_000001a8;
                          pdVar44 = uStack00000000000001a0;
                          pdVar51 = in_stack_00000198;
                          pdVar12 = in_stack_00000190;
                          pdVar45 = in_stack_00000188;
                          pdVar40 = uStack0000000000000180;
                          if (in_stack_000003c0 != (dword *)0x8000000000000000) {
                            *(long *)(unaff_x29 + -0xd0) = lVar7;
                            uVar21 = (ulong)_uStack00000000000001c0 & 0xffffffff;
                            if ((in_stack_000001c8 & 0x100000000) == 0) {
                              if (lVar7 != 0) {
                                lVar29 = *(long *)(unaff_x29 + -0xd8);
                                lVar36 = lVar29 + lVar7 * 0x108;
                                if (lVar36 != 0x108) {
                                  puVar39 = (undefined8 *)(lVar36 + -0xe8);
                                  if (*(long *)(lVar36 + -0xf0) == 0x10 &&
                                      puVar39 != (undefined8 *)0x0) {
                                    func_0x005af378(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e)
                                    ;
                                    func_0x005649d4(puVar39);
                                    *(dword **)(lVar36 + -0xe0) = in_stack_00000408;
                                    *puVar39 = in_stack_00000400;
                                    *(dword **)(lVar36 + -0xd0) = in_stack_00000418;
                                    *(dword **)(lVar36 + -0xd8) = in_stack_00000410;
                                    *(dword **)(lVar36 + -0xc0) = in_stack_00000428;
                                    *(dword **)(lVar36 + -200) = in_stack_00000420;
                                    *(long *)(lVar36 + -0xb0) = in_stack_00000438;
                                    *(undefined8 *)(lVar36 + -0xb8) = in_stack_00000430;
                                    if ((in_stack_000001c8 & 0x10000000000) != 0)
                                    goto code_r0x00569860;
                                    goto code_r0x005698d4;
                                  }
                                  in_stack_00000078 = &UNK_009ee728;
                                }
                              }
                            }
                            else if (lVar7 == 0) {
                              in_stack_00000078 = &UNK_009ee740;
                            }
                            else {
                              lVar29 = *(long *)(unaff_x29 + -0xd8);
                              if (*(long *)(lVar29 + 0x18) == 0xf) {
                                puVar39 = (undefined8 *)func_0x00187bd0(0x40,8);
                                lVar6 = in_stack_000001b8;
                                uVar20 = in_stack_000001b0;
                                pdVar47 = in_stack_000001a8;
                                pdVar44 = uStack00000000000001a0;
                                pdVar51 = in_stack_00000198;
                                pdVar12 = in_stack_00000190;
                                pdVar45 = in_stack_00000188;
                                pdVar40 = uStack0000000000000180;
                                if (puVar39 == (undefined8 *)0x0) {
                                  func_0x007a1f18(8,0x40);
                                }
                                else {
                                  func_0x005af248(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                                  puVar39[1] = in_stack_00000408;
                                  *puVar39 = in_stack_00000400;
                                  puVar39[3] = in_stack_00000418;
                                  puVar39[2] = in_stack_00000410;
                                  puVar39[5] = in_stack_00000428;
                                  puVar39[4] = in_stack_00000420;
                                  puVar39[7] = in_stack_00000438;
                                  puVar39[6] = in_stack_00000430;
                                  lVar36 = *(long *)(lVar29 + 0x48) + 1;
                                  lVar32 = *(long *)(lVar29 + 0x40);
                                  while (lVar36 = lVar36 + -1, lVar36 != 0) {
                                    func_0x00553cb8(lVar32);
                                    lVar32 = lVar32 + 0x40;
                                  }
                                  if (*(long *)(lVar29 + 0x38) != 0) {
                                    func_0x00187bd4(*(undefined8 *)(lVar29 + 0x40),
                                                    *(long *)(lVar29 + 0x38) << 6,8);
                                  }
                                  *(undefined8 *)(lVar29 + 0x38) = 1;
                                  *(undefined8 **)(lVar29 + 0x40) = puVar39;
                                  *(undefined8 *)(lVar29 + 0x48) = 1;
                                  if ((in_stack_000001c8 & 0x10000000000) == 0) {
code_r0x005698d4:
                                    unaff_x26 = (undefined8 *)0x8000000000000000;
                                    if ((uVar21 < *(ulong *)(unaff_x20 + 0x28)) &&
                                       (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) +
                                                          uVar21 * 0x20),
                                       *plVar35 != -0x8000000000000000)) {
                                      if (plVar35[2] != 0) {
                                        lVar36 = plVar35[2] + -1;
                                        plVar35[2] = lVar36;
                                        _memmove(auStack_7ffffffe + 0x8000020e,
                                                 plVar35[1] + lVar36 * 0x108,0x108);
                                        if (pdVar51 !=
                                            (dword *)((long)&segment_command_00000020.cmd + 1)) {
                                          func_0x00564f24(auStack_7ffffffe + 0x8000020e);
                                        }
                                      }
                                      pdVar48 = *(dword **)(unaff_x29 + -0xe0);
                                      pdVar43 = *(dword **)(unaff_x29 + -0xd8);
                                      uVar21 = *(ulong *)(unaff_x29 + -0xd0);
                                      lVar36 = plVar35[2];
                                      if ((ulong)(*plVar35 - lVar36) < uVar21) {
                                        func_0x007abb04(plVar35,lVar36,uVar21,8,0x108);
                                        lVar36 = plVar35[2];
                                      }
                                      _memcpy(plVar35[1] + lVar36 * 0x108,pdVar43,uVar21 * 0x108);
                                      plVar35[2] = lVar36 + uVar21;
                                      func_0x00592e4c(auStack_7ffffffe + 0x8000020e);
                                      if (in_stack_00000360 != (dword *)0x0) {
                                        func_0x00187bd4(in_stack_00000368,
                                                        (long)in_stack_00000360 * 0x18,8);
                                      }
                                      func_0x00558024(auStack_7ffffffe + 0x8000031e);
                                      if (in_stack_00000320 != (dword *)0x0) {
                                        func_0x00187bd4(in_stack_00000328,
                                                        (long)in_stack_00000320 * 0x48,8);
                                      }
                                      if (*(long *)(unaff_x29 + -0xf8) != 0) {
                                        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xf0),
                                                        *(long *)(unaff_x29 + -0xf8) * 0x18,8);
                                      }
                                      unaff_w27 = 1;
                                      pdVar46 = pdVar43;
                                      pdVar49 = pdVar43;
                                      goto code_r0x005676c0;
                                    }
                                    in_stack_00000070 = &UNK_009ee7a0;
                                  }
                                  else {
code_r0x00569860:
                                    if ((lVar7 != 0) &&
                                       (lVar29 = lVar29 + lVar7 * 0x108, lVar29 != 0x108)) {
                                      puVar39 = (undefined8 *)(lVar29 + -0xe8);
                                      if (*(long *)(lVar29 + -0xf0) == 0x10 &&
                                          puVar39 != (undefined8 *)0x0) {
                                        func_0x00566040(auStack_7ffffffe + 0x8000020e,puVar39);
                                        func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
                                        func_0x005cb1c8(auStack_7ffffffe + 0x8000020e);
                                        func_0x005649d4(puVar39);
                                        *(dword **)(lVar29 + -0xe0) = pdVar45;
                                        *puVar39 = pdVar40;
                                        *(dword **)(lVar29 + -0xd0) = pdVar51;
                                        *(dword **)(lVar29 + -0xd8) = pdVar12;
                                        *(dword **)(lVar29 + -0xc0) = pdVar47;
                                        *(dword **)(lVar29 + -200) = pdVar44;
                                        *(long *)(lVar29 + -0xb0) = lVar6;
                                        *(undefined8 *)(lVar29 + -0xb8) = uVar20;
                                        goto code_r0x005698d4;
                                      }
                                      in_stack_00000070 = &UNK_009ee788;
                                    }
                                  }
                                  func_0x007a23bc(in_stack_00000070);
                                }
                                goto code_r0x0056a5ec;
                              }
                              in_stack_00000078 = &UNK_009ee758;
                            }
                            func_0x007a23bc(in_stack_00000078);
                            goto code_r0x0056a5ec;
                          }
                          puVar16 = &UNK_009ee6f8;
                        }
                      }
                      else {
                        puVar16 = &UNK_009ee6b0;
                      }
                      func_0x007a23bc(puVar16);
                    }
                    else {
                      puVar17 = &UNK_009ee7b8;
                      puVar16 = &UNK_008abf8a;
                      uVar19 = 0x2e;
code_r0x0056a11c:
                      func_0x007a247c(puVar16,uVar19,puVar17);
                    }
                    goto code_r0x0056a5ec;
                  }
                }
              }
code_r0x005676c0:
              bVar8 = func_0x0056c534();
              unaff_w27 = unaff_w27 | bVar8;
              auVar50 = func_0x0058c2d4(&uStack0000000000000098,unaff_x20 + 0x18);
              unaff_x28 = auVar50._8_8_;
              if ((auVar50._0_8_ & 1) == 0) {
                if (uStack0000000000000098 != 0) {
                  func_0x00187bd4(in_stack_000000a0,uStack0000000000000098 << 2,4);
                }
                if (in_stack_000000b0 != 0) {
                  func_0x00187bd4(in_stack_000000b8,in_stack_000000b0 << 2,4);
                }
                if (in_stack_000000d0 != 0) {
                  func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 << 2,4);
                }
                return unaff_w27 & 1;
              }
              unaff_x19 = unaff_x28 & 0xffffffff;
              if ((*(ulong *)(unaff_x20 + 0x28) <= unaff_x19) ||
                 (puVar39 = (undefined8 *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
                 (undefined8 *)*puVar39 == unaff_x26)) {
                puVar16 = &UNK_009ee5c0;
                goto code_r0x0056a0b0;
              }
              if (((puVar39[2] != 0) && (lVar36 = puVar39[1] + puVar39[2] * 0x108, lVar36 != 0x108))
                 && (*(long *)(lVar36 + -0xf0) == 0x10)) {
                puVar39 = (undefined8 *)(lVar36 + -0xe8);
                puVar41 = (undefined8 *)(lVar36 + -0xe0);
                if (puVar41 == (undefined8 *)0x0 || *(long *)(lVar36 + -0xe8) != 8) {
                  if (((puVar41 == (undefined8 *)0x0 || *(long *)(lVar36 + -0xe8) != 9) ||
                      (*(long *)*puVar41 != 6)) ||
                     (plVar35 = *(long **)(lVar36 + -0xd8), *plVar35 == 6)) goto code_r0x005679b4;
                  puVar10 = (undefined8 *)func_0x00187bd0(0x40,8);
                  if (puVar10 == (undefined8 *)0x0) goto code_r0x0056a134;
                  func_0x00566040(auStack_7ffffffe + 0x8000020e,plVar35);
                  puVar10[1] = pdVar46;
                  *puVar10 = pdVar43;
                  puVar10[3] = pdVar49;
                  puVar10[2] = pdVar48;
                  puVar10[5] = pdVar47;
                  puVar10[4] = pdVar44;
                  puVar10[7] = lVar6;
                  puVar10[6] = uVar20;
                  uStack00000000000000f8 = (dword *)puVar10[1];
                  uStack00000000000000f0 = (dword *)*puVar10;
                  in_stack_00000108 = (dword *)puVar10[3];
                  in_stack_00000100 = (dword *)puVar10[2];
                  in_stack_00000118 = (dword *)puVar10[5];
                  in_stack_00000110 = (dword *)puVar10[4];
                  in_stack_00000128 = puVar10[7];
                  in_stack_00000120 = puVar10[6];
                  uVar19 = *puVar41;
                  puVar11 = (undefined8 *)func_0x00187bd0(0x40,8);
                  if (puVar11 != (undefined8 *)0x0) {
                    func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar19);
                    puVar11[1] = pdVar46;
                    *puVar11 = pdVar43;
                    puVar11[3] = pdVar49;
                    puVar11[2] = pdVar48;
                    puVar11[5] = pdVar47;
                    puVar11[4] = pdVar44;
                    puVar11[7] = lVar6;
                    puVar11[6] = uVar20;
                    in_stack_00000188 = (dword *)puVar11[1];
                    uStack0000000000000180 = (dword *)*puVar11;
                    in_stack_00000198 = (dword *)puVar11[3];
                    in_stack_00000190 = (dword *)puVar11[2];
                    in_stack_000001a8 = (dword *)puVar11[5];
                    uStack00000000000001a0 = (dword *)puVar11[4];
                    in_stack_000001b8 = puVar11[7];
                    in_stack_000001b0 = puVar11[6];
                    uVar52 = *(byte *)(lVar36 + -0xd0) - 7;
                    if (5 < uVar52) {
                      func_0x005649d4(&uStack0000000000000180);
                      func_0x005649d4(&uStack00000000000000f0);
                      func_0x00187bd4(puVar11,0x40,8);
                      func_0x00187bd4(puVar10,0x40,8);
                      uVar21 = *(ulong *)(unaff_x20 + 0x28);
                      goto joined_r0x00568134;
                    }
                    func_0x005c1d84(unaff_x29 + -0xa0,&uStack00000000000000f0,
                                    &uStack0000000000000180,
                                    0xb0c090a0807 >> (((ulong)uVar52 & 7) << 3));
                    *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x90);
                    func_0x005649d4(puVar39);
                    *puVar39 = 9;
                    *(dword **)(lVar36 + -0xd8) = in_stack_00000408;
                    *puVar41 = in_stack_00000400;
                    *(undefined8 *)(lVar36 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xd0);
                    func_0x00187bd4(puVar11,0x40,8);
                    func_0x00187bd4(puVar10,0x40,8);
                    unaff_w27 = 1;
                    uVar21 = *(ulong *)(unaff_x20 + 0x28);
                    in_stack_000003c0 = in_stack_00000400;
                    in_stack_000003c8 = in_stack_00000408;
                    if (unaff_x19 < uVar21) goto code_r0x005679c0;
code_r0x0056a270:
                    puVar16 = &UNK_009ee830;
                    goto code_r0x0056a0b0;
                  }
                  func_0x007a1f18(8,0x40);
                  goto code_r0x0056a5ec;
                }
                if (*(char *)(lVar36 + -0xd8) != '\0') goto code_r0x005679b4;
                uVar19 = *puVar41;
                puVar41 = (undefined8 *)func_0x00187bd0(0x40,8);
                if (puVar41 != (undefined8 *)0x0) {
                  func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar19);
                  puVar41[1] = pdVar46;
                  *puVar41 = pdVar43;
                  puVar41[3] = pdVar49;
                  puVar41[2] = pdVar48;
                  puVar41[5] = pdVar47;
                  puVar41[4] = pdVar44;
                  puVar41[7] = lVar6;
                  puVar41[6] = uVar20;
                  pdVar46 = (dword *)puVar41[1];
                  pdVar43 = (dword *)*puVar41;
                  pdVar49 = (dword *)puVar41[3];
                  pdVar48 = (dword *)puVar41[2];
                  pdVar47 = (dword *)puVar41[5];
                  pdVar44 = (dword *)puVar41[4];
                  lVar6 = puVar41[7];
                  uVar20 = puVar41[6];
                  func_0x005649d4(puVar39);
                  *(dword **)(lVar36 + -0xe0) = pdVar46;
                  *puVar39 = pdVar43;
                  *(dword **)(lVar36 + -0xd0) = pdVar49;
                  *(dword **)(lVar36 + -0xd8) = pdVar48;
                  *(dword **)(lVar36 + -0xc0) = pdVar47;
                  *(dword **)(lVar36 + -200) = pdVar44;
                  *(long *)(lVar36 + -0xb0) = lVar6;
                  *(undefined8 *)(lVar36 + -0xb8) = uVar20;
                  func_0x00187bd4(puVar41,0x40,8);
                  func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                  if (pdVar43 != (dword *)0x0) {
                    if ((int)pdVar48 == (int)pdVar47) {
                      func_0x007a247c(&UNK_008ade0c,0x54,&UNK_009f1480);
                    }
                    else {
                      if (((ulong)pdVar48 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) {
                        plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                          ((ulong)pdVar48 & 0xffffffff) * (unaff_x25 & 0xffffffff));
                        if (*plVar35 != -0x8000000000000000) {
                          if ((((ulong)pdVar47 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) &&
                             (plVar18 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                ((ulong)pdVar47 & 0xffffffff) *
                                                (unaff_x25 & 0xffffffff)),
                             *plVar18 != -0x8000000000000000)) {
                            *(undefined1 *)(plVar35 + 3) = 2;
                            unaff_w27 = 1;
                            *(undefined1 *)(plVar18 + 3) = 1;
                            goto code_r0x005679b4;
                          }
                          in_stack_00000038 = &UNK_009f14b0;
                        }
                      }
                      func_0x007a23bc(in_stack_00000038);
                    }
                    goto code_r0x0056a5ec;
                  }
                  puVar16 = &UNK_009ee5d8;
                  goto code_r0x0056a0b0;
                }
code_r0x0056a134:
                func_0x007a1f18(8,0x40);
                goto code_r0x0056a5ec;
              }
code_r0x005679b4:
              uVar21 = *(ulong *)(unaff_x20 + 0x28);
joined_r0x00568134:
              if (uVar21 <= unaff_x19) goto code_r0x0056a270;
code_r0x005679c0:
              plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20);
              unaff_x26 = (undefined8 *)0x8000000000000000;
              if (*plVar35 == -0x8000000000000000) goto code_r0x0056a270;
            } while (((plVar35[2] == 0) ||
                     (lVar36 = plVar35[1] + plVar35[2] * 0x108, lVar36 == 0x108)) ||
                    (*(long *)(lVar36 + -0xf0) != 0x10));
            func_0x00584d50(auStack_7ffffffe + 0x8000020e);
            if (pdVar43 == (dword *)0x0) {
              puVar16 = &UNK_009ee848;
code_r0x0056a0b0:
              func_0x007a23bc(puVar16);
              goto code_r0x0056a5ec;
            }
            uVar38 = (ulong)pdVar48 & 0xffffffff;
            uVar52 = (uint)((ulong)pdVar46 >> 0x20);
            uVar23 = (ulong)uVar52;
            uVar54 = (uint)((ulong)pdVar44 >> 0x20);
            in_x10 = (ulong)uVar54;
            uVar21 = (ulong)pdVar47 & 0xffffffff;
            if (uVar52 == uVar54) {
              pdVar55 = in_stack_00000360;
              pdVar56 = in_stack_00000368;
              pdVar57 = in_stack_00000370;
              pdVar58 = in_stack_00000378;
              pdVar59 = in_stack_00000380;
              pdVar60 = in_stack_00000388;
              uVar14 = in_stack_00000390;
              lVar7 = in_stack_00000398;
              if (*(long *)(pdVar43 + 4) != 0) {
                plVar18 = *(long **)(pdVar43 + 2) + *(long *)(pdVar43 + 4) * 9;
                plVar35 = *(long **)(pdVar43 + 2);
                do {
                  plVar25 = plVar35 + 9;
                  plVar26 = (long *)*plVar35;
                  lVar36 = *(long *)(pdVar49 + 4) * 0x48;
                  plVar33 = *(long **)(pdVar49 + 2) + -8;
                  while (lVar36 != 0) {
                    plVar31 = plVar33 + 8;
                    plVar33 = plVar33 + 9;
                    lVar36 = lVar36 + -0x48;
                    if (plVar26 == (long *)*plVar31) goto code_r0x00567b28;
                  }
                  plVar35 = plVar25;
                } while (plVar25 != plVar18);
              }
code_r0x00567a98:
              in_stack_00000018 = 0;
              pdVar53 = pdVar49;
              pdVar12 = pdVar47;
              uVar19 = uVar20;
              lVar36 = lVar6;
              goto code_r0x00569028;
            }
            lVar29 = *(long *)(unaff_x20 + 0x38);
            uVar27 = *(ulong *)(unaff_x20 + 0x40);
            uVar22 = *(ulong *)(unaff_x20 + 0x28);
            if (*(long *)(pdVar43 + 4) != 0) {
code_r0x00567ab4:
              in_stack_00000090 = 0;
              lVar36 = *(long *)(pdVar49 + 4);
              pdVar51 = pdVar43;
              pdVar15 = pdVar46;
              in_stack_00000220 = pdVar48;
              pdVar40 = pdVar49;
              pdVar45 = pdVar44;
              goto joined_r0x00567abc;
            }
            if ((uVar23 < uVar22) &&
               (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
               *plVar35 != -0x8000000000000000)) {
              uVar28 = (ulong)*(uint *)((long)plVar35 + 0x1c);
              if (uVar27 >> 0x20 != 0) goto code_r0x00567e1c;
code_r0x00567f04:
              do {
                if (uVar27 <= uVar28) goto code_r0x00567ab4;
                lVar36 = lVar29 + uVar28 * unaff_x25;
                uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
              } while (*(int *)(lVar36 + 0x28) == -1);
              if (0xffffffff < uVar27) goto code_r0x00567ab4;
            }
            else {
              uVar28 = 0xffffffff;
              if (uVar27 >> 0x20 == 0) goto code_r0x00567f04;
code_r0x00567e1c:
              if (*(uint *)(lVar29 + 0x2ffffffff0) < uVar27) goto code_r0x00567ab4;
            }
            while (uVar28 < uVar27) {
              lVar36 = lVar29 + uVar28 * unaff_x25;
              uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
              if (*(int *)(lVar36 + 0x28) != -1) goto code_r0x00567ab4;
            }
            lVar36 = *(long *)(pdVar49 + 2);
            lVar7 = *(long *)(pdVar49 + 4);
            in_stack_00000188 = _UNK_009efac8;
            uStack0000000000000180 = _UNK_009efac0;
            in_stack_00000198 = _UNK_009efad8;
            in_stack_00000190 = _UNK_009efad0;
            if (lVar7 != 0) {
              func_0x007a5f8c(&uStack0000000000000180,lVar7,&uStack00000000000001a0,1);
            }
            func_0x00585744(lVar36,lVar36 + lVar7 * 0x48,&uStack0000000000000180);
            pdVar45 = in_stack_00000198;
            pdVar40 = in_stack_00000190;
            in_stack_00000220 = in_stack_00000188;
            pdVar15 = uStack0000000000000180;
            pdVar51 = (dword *)CONCAT44(uVar54,uVar52);
            func_0x0056b78c(&uStack00000000000000f0);
            lVar36 = in_stack_00000170;
            uVar19 = in_stack_00000168;
            pdVar12 = in_stack_00000160;
            pdVar44 = in_stack_00000158;
            pdVar53 = in_stack_00000150;
            pdVar48 = in_stack_00000148;
            pdVar46 = in_stack_00000140;
            lVar7 = in_stack_00000128;
            uVar14 = in_stack_00000120;
            pdVar60 = in_stack_00000118;
            pdVar59 = in_stack_00000110;
            pdVar58 = in_stack_00000108;
            pdVar57 = in_stack_00000100;
            pdVar56 = uStack00000000000000f8;
            pdVar55 = uStack00000000000000f0;
            lVar29 = *(long *)(unaff_x20 + 0x38);
            uVar27 = *(ulong *)(unaff_x20 + 0x40);
            uVar22 = *(ulong *)(unaff_x20 + 0x28);
            if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
              puVar39 = (undefined8 *)CONCAT44(uStack0000000000000134,uStack0000000000000130);
              pdVar43 = (dword *)CONCAT26(uStack0000000000000138._6_2_,
                                          CONCAT15(uStack0000000000000138._5_1_,
                                                   CONCAT14(uStack0000000000000138._4_1_,
                                                            (uint)uStack0000000000000138)));
              func_0x0055b13c(&uStack0000000000000180,auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
              if (in_stack_00000190 == (dword *)((long)&MACH_HEADER.magic + 1)) {
                dStack000000000000000c = in_stack_00000188[4];
                bVar4 = *(long *)in_stack_00000188 == 0;
              }
              else {
                bVar4 = true;
              }
              if (uStack0000000000000180 != (dword *)0x0) {
                func_0x00187bd4(in_stack_00000188,(long)uStack0000000000000180 * 0x18,8);
              }
              if (bVar4) {
                func_0x007a23bc(&UNK_009ee860);
                goto code_r0x0056a5ec;
              }
              plVar35 = (long *)*puVar39;
              lVar6 = *plVar35;
              *plVar35 = lVar6 + 1;
              if (lVar6 < 0) {
                func_0x007a05dc();
                goto code_r0x0056a5ec;
              }
              *(undefined8 *)(unaff_x29 + -0xf8) = *puVar39;
              in_stack_00000188 = pdVar56;
              uStack0000000000000180 = pdVar55;
              in_stack_00000198 = pdVar58;
              in_stack_00000190 = pdVar57;
              in_stack_000001a8 = pdVar60;
              uStack00000000000001a0 = pdVar59;
              in_stack_000001b8 = lVar7;
              in_stack_000001b0 = uVar14;
              func_0x0056b044(unaff_x29 + -0xa0,*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,&uStack0000000000000180,
                              auStack_7ffffffe + 0x8000020e);
              in_stack_000003c0 = pdVar43;
              in_stack_000003c8 = pdVar46;
              in_stack_000003d8 = pdVar53;
              in_stack_000003e0 = pdVar44;
              in_stack_000003e8 = pdVar12;
              in_stack_000003f0 = uVar19;
              in_stack_000003f8 = lVar36;
              if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
                lVar6 = **(long **)(unaff_x29 + -0xf8);
                **(long **)(unaff_x29 + -0xf8) = lVar6 + 1;
                uStack0000000000000180 = in_stack_00000400;
                in_stack_00000188 = in_stack_00000408;
                in_stack_00000190 = in_stack_00000410;
                in_stack_00000198 = in_stack_00000418;
                uStack00000000000001a0 = in_stack_00000420;
                in_stack_000001a8 = in_stack_00000428;
                in_stack_000001b0 = in_stack_00000430;
                in_stack_000001b8 = in_stack_00000438;
                if (lVar6 < 0) {
code_r0x0056a254:
                  func_0x007a05dc();
                }
                else {
                  uVar20 = *(undefined8 *)(unaff_x29 + -0xf8);
                  if (((ulong)dStack000000000000000c < *(ulong *)(unaff_x20 + 0x40)) &&
                     (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                        (ulong)dStack000000000000000c * (unaff_x25 & 0xffffffff)),
                     *plVar35 != -0x8000000000000000)) {
                    if (plVar35[2] == 0) {
                      func_0x007a2570(0,0,&UNK_009ee890);
                    }
                    else {
                      lVar6 = plVar35[1];
                      func_0x005649d4(lVar6 + 8);
                      *(long *)(lVar6 + 0x40) = lVar36;
                      *(undefined8 *)(lVar6 + 0x38) = uVar19;
                      *(dword **)(lVar6 + 0x30) = pdVar12;
                      *(dword **)(lVar6 + 0x28) = pdVar44;
                      *(dword **)(lVar6 + 0x20) = pdVar53;
                      *(dword **)(lVar6 + 0x18) = pdVar48;
                      *(undefined8 *)(lVar6 + 0x10) = uVar20;
                      *(undefined8 *)(lVar6 + 8) = 0;
                      lVar6 = **(long **)(unaff_x29 + -0xf8);
                      **(long **)(unaff_x29 + -0xf8) = lVar6 + 1;
                      if (lVar6 < 0) goto code_r0x0056a254;
                      in_stack_00000320 = *(dword **)(unaff_x29 + -0xf8);
                      if ((uVar21 < *(ulong *)(unaff_x20 + 0x40)) &&
                         (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                            uVar21 * (unaff_x25 & 0xffffffff)),
                         *plVar35 != -0x8000000000000000)) {
                        if (plVar35[2] == 0) {
                          func_0x007a2570(0,0,&UNK_009ee8c0);
                        }
                        else {
                          lVar6 = plVar35[1];
                          func_0x005649d4(lVar6 + 8);
                          *(long *)(lVar6 + 0x40) = lVar36;
                          *(undefined8 *)(lVar6 + 0x38) = uVar19;
                          *(dword **)(lVar6 + 0x30) = pdVar12;
                          *(dword **)(lVar6 + 0x28) = pdVar44;
                          *(dword **)(lVar6 + 0x20) = pdVar53;
                          *(dword **)(lVar6 + 0x18) = pdVar48;
                          *(dword **)(lVar6 + 0x10) = in_stack_00000320;
                          *(undefined8 *)(lVar6 + 8) = 0;
                          func_0x0056c050();
                          uVar21 = *(ulong *)(unaff_x20 + 0x28);
                          if ((uVar23 < uVar21) &&
                             (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
                             *plVar35 != -0x8000000000000000)) {
                            uVar38 = (ulong)*(uint *)((long)plVar35 + 0x1c);
                            uVar27 = *(ulong *)(unaff_x20 + 0x40);
                          }
                          else {
                            uVar38 = 0xffffffff;
                            uVar27 = *(ulong *)(unaff_x20 + 0x40);
                          }
                          if (uVar27 >> 0x20 == 0) {
code_r0x00568770:
                            if (uVar38 < uVar27) goto code_r0x00568778;
                            func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar23);
                            pdVar40 = (dword *)((long)pdVar48 + 1);
                            pdVar45 = in_stack_00000320;
                            while (pdVar40 = (dword *)((long)pdVar40 + -1), pdVar40 != (dword *)0x0)
                            {
                              func_0x00554164(pdVar45);
                              pdVar45 = pdVar45 + 0x42;
                            }
                            uVar21 = *(ulong *)(unaff_x20 + 0x28);
                          }
code_r0x0056888c:
                          if ((unaff_x19 < uVar21) &&
                             (puVar34 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
                             *puVar34 != 0x8000000000000000)) {
                            if ((puVar34[2] == 0) ||
                               (lVar36 = puVar34[1] + puVar34[2] * 0x108, lVar36 == 0x108)) {
                              in_stack_00000060 = &UNK_009ee8f0;
                              goto code_r0x0056a2c4;
                            }
                            if (lVar36 == 0xe8 || *(long *)(lVar36 + -0xf0) != 0x10) {
                              in_stack_00000060 = &UNK_009ee908;
                              goto code_r0x0056a2c4;
                            }
                            lVar6 = **(long **)(unaff_x29 + -0xf8);
                            **(long **)(unaff_x29 + -0xf8) = lVar6 + 1;
                            if (lVar6 < 0) goto code_r0x0056a254;
                            uVar19 = *(undefined8 *)(unaff_x29 + -0xf8);
                            func_0x005649d4();
                            *(undefined8 *)(lVar36 + -0xe8) = 0;
                            *(undefined8 *)(lVar36 + -0xe0) = uVar19;
                            uVar21 = puVar34[2];
                            pdVar12 = (dword *)func_0x00187bd0(0x18,8);
                            if (pdVar12 == (dword *)0x0) {
                              func_0x007a1f18(8,0x18);
                            }
                            else {
                              uVar19 = *(undefined8 *)(unaff_x29 + -0xf8);
                              *(undefined8 *)pdVar12 = 0x8000000000000000;
                              *(undefined8 *)(pdVar12 + 2) = uVar19;
                              pdVar40 = (dword *)((long)&MACH_HEADER.magic + 1);
                              in_stack_00000330 = (dword *)((long)&MACH_HEADER.magic + 1);
                              puVar13 = (undefined8 *)func_0x00187bd0(0x40,8);
                              if (puVar13 == (undefined8 *)0x0) {
                                func_0x007a1f18(8,0x40);
                              }
                              else {
                                uVar21 = uVar21 - 1;
                                puVar13[1] = in_stack_00000408;
                                *puVar13 = in_stack_00000400;
                                puVar13[3] = in_stack_00000418;
                                puVar13[2] = in_stack_00000410;
                                puVar13[5] = in_stack_00000428;
                                puVar13[4] = in_stack_00000420;
                                puVar13[7] = in_stack_00000438;
                                puVar13[6] = in_stack_00000430;
                                uVar23 = puVar34[2];
                                if (uVar21 <= uVar23) {
                                  in_stack_00000328 = pdVar12;
                                  if (uVar23 == *puVar34) {
                                    func_0x005bd0a4(puVar34,&UNK_009ee920);
                                  }
                                  goto code_r0x00567da8;
                                }
                                func_0x007a204c(uVar21,uVar23,&UNK_009ee920);
                              }
                            }
                          }
                          else {
code_r0x0056a2c4:
                            func_0x007a23bc(in_stack_00000060);
                          }
                        }
                      }
                      else {
                        func_0x007a23bc(&UNK_009ee8a8);
                      }
                    }
                  }
                  else {
                    func_0x007a23bc(&UNK_009ee878);
                  }
                }
                goto code_r0x0056a5ec;
              }
              lVar6 = **(long **)(unaff_x29 + -0xf8);
              **(long **)(unaff_x29 + -0xf8) = lVar6 + -1;
              LORelease();
              if (lVar6 == 1) {
                func_0x005d2ac4(unaff_x29 + -0xf8);
              }
              in_stack_00000018 = 0;
              in_stack_000003d0 = pdVar48;
              if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
                func_0x005649d4(unaff_x29 + -0xa0);
              }
              goto code_r0x00569028;
            }
            in_stack_00000090 = 1;
            lVar36 = *(long *)(pdVar49 + 4);
joined_r0x00567abc:
            if (lVar36 == 0) {
              if ((in_x10 < uVar22) &&
                 (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
                 *plVar35 != -0x8000000000000000)) {
                uVar21 = (ulong)*(uint *)((long)plVar35 + 0x1c);
                if (uVar27 >> 0x20 != 0) goto code_r0x00568004;
code_r0x00568028:
                do {
                  if (uVar27 <= uVar21) goto code_r0x00567ac0;
                  lVar36 = lVar29 + uVar21 * unaff_x25;
                  uVar21 = (ulong)*(uint *)(lVar36 + 0x24);
                } while (*(int *)(lVar36 + 0x28) == -1);
                if (0xffffffff < uVar27) goto code_r0x00567ac0;
              }
              else {
                uVar21 = 0xffffffff;
                if (uVar27 >> 0x20 == 0) goto code_r0x00568028;
code_r0x00568004:
                if (*(uint *)(lVar29 + 0x2ffffffff0) < uVar27) goto code_r0x00567ac0;
              }
              do {
                if (uVar27 <= uVar21) {
                  lVar36 = *(long *)(pdVar43 + 2);
                  lVar7 = *(long *)(pdVar43 + 4);
                  uStack0000000000000180 = _UNK_009efac0;
                  in_stack_00000188 = _UNK_009efac8;
                  in_stack_00000190 = _UNK_009efad0;
                  in_stack_00000198 = _UNK_009efad8;
                  if (lVar7 != 0) {
                    func_0x007a5f8c(&uStack0000000000000180,lVar7,&uStack00000000000001a0,1);
                  }
                  func_0x00585744(lVar36,lVar36 + lVar7 * 0x48,&uStack0000000000000180);
                  pdVar55 = in_stack_00000198;
                  pdVar44 = in_stack_00000190;
                  pdVar46 = in_stack_00000188;
                  pdVar48 = uStack0000000000000180;
                  func_0x0056b78c(&uStack0000000000000180);
                  puVar39 = _uStack00000000000001c0;
                  lVar36 = in_stack_000001b8;
                  uVar19 = in_stack_000001b0;
                  pdVar12 = in_stack_000001a8;
                  pdVar45 = uStack00000000000001a0;
                  pdVar40 = in_stack_00000198;
                  in_stack_00000220 = in_stack_00000190;
                  pdVar15 = in_stack_00000188;
                  pdVar51 = uStack0000000000000180;
                  lVar29 = *(long *)(unaff_x20 + 0x38);
                  uVar27 = *(ulong *)(unaff_x20 + 0x40);
                  uVar22 = *(ulong *)(unaff_x20 + 0x28);
                  if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                    bVar4 = true;
                    pdVar15 = pdVar48;
                    in_stack_00000220 = pdVar46;
                    pdVar40 = pdVar44;
                    pdVar45 = pdVar55;
                    pdVar51 = (dword *)CONCAT44(uVar52,uVar54);
                    goto joined_r0x005680f4;
                  }
                  in_stack_00000368 = (dword *)in_stack_00000080[1];
                  in_stack_00000360 = (dword *)*in_stack_00000080;
                  in_stack_00000378 = (dword *)in_stack_00000080[3];
                  in_stack_00000370 = (dword *)in_stack_00000080[2];
                  in_stack_00000388 = (dword *)in_stack_00000080[5];
                  in_stack_00000380 = (dword *)in_stack_00000080[4];
                  in_stack_00000398 = in_stack_00000080[7];
                  in_stack_00000390 = in_stack_00000080[6];
                  unaff_x24 = 1;
                  func_0x0055b13c(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
                  if (*(long *)(unaff_x29 + -0x90) == 1) {
                    uStack0000000000000008 = *(uint *)(*(long **)(unaff_x29 + -0x98) + 2);
                    bVar4 = **(long **)(unaff_x29 + -0x98) == 0;
                  }
                  else {
                    bVar4 = true;
                  }
                  if (*(long *)(unaff_x29 + -0xa0) != 0) {
                    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x98),
                                    *(long *)(unaff_x29 + -0xa0) * 0x18,8);
                  }
                  if (bVar4) {
                    func_0x007a23bc(&UNK_009ee938);
                    goto code_r0x0056a5ec;
                  }
                  plVar35 = (long *)*puVar39;
                  lVar7 = *plVar35;
                  *plVar35 = lVar7 + 1;
                  if (lVar7 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0056a5ec;
                  }
                  in_stack_00000208 = (dword *)*puVar39;
                  func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                                  *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,unaff_x29 + -0xa0,
                                  auStack_7ffffffe + 0x8000020e);
                  in_stack_00000320 = pdVar51;
                  in_stack_00000328 = pdVar15;
                  in_stack_00000330 = in_stack_00000220;
                  in_stack_00000338 = pdVar40;
                  in_stack_00000340 = pdVar45;
                  in_stack_00000348 = pdVar12;
                  in_stack_00000350 = uVar19;
                  in_stack_00000358 = lVar36;
                  if (*(long *)(unaff_x29 + -0xe0) == 0xc) {
                    lVar7 = *(long *)in_stack_00000208;
                    *(long *)in_stack_00000208 = lVar7 + -1;
                    LORelease();
                    if (lVar7 == 1) {
                      func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                    }
                    in_stack_00000018 = 0;
                    in_stack_00000400 = in_stack_00000360;
                    in_stack_00000408 = in_stack_00000368;
                    in_stack_00000410 = in_stack_00000370;
                    in_stack_00000418 = in_stack_00000378;
                    in_stack_00000420 = in_stack_00000380;
                    in_stack_00000428 = in_stack_00000388;
                    in_stack_00000430 = in_stack_00000390;
                    in_stack_00000438 = in_stack_00000398;
                    if (*(long *)(unaff_x29 + -0xe0) != 0xc) {
                      func_0x005649d4(unaff_x29 + -0xe0);
                    }
                    goto LAB_00569000;
                  }
                  in_stack_00000018 = 1;
                  lVar7 = *(long *)in_stack_00000208;
                  *(long *)in_stack_00000208 = lVar7 + 1;
                  if (lVar7 < 0) goto LAB_0056a25c;
                  if ((*(ulong *)(unaff_x20 + 0x40) <= uVar38) ||
                     (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                        uVar38 * (unaff_x25 & 0xffffffff)),
                     *plVar35 == -0x8000000000000000)) {
                    func_0x007a23bc(&UNK_009ee950);
                    goto code_r0x0056a5ec;
                  }
                  if (plVar35[2] == 0) {
                    func_0x007a2570(0,0,&UNK_009ee968);
                    goto code_r0x0056a5ec;
                  }
                  lVar7 = plVar35[1];
                  func_0x005649d4(lVar7 + 8);
                  *(long *)(lVar7 + 0x40) = lVar36;
                  *(undefined8 *)(lVar7 + 0x38) = uVar19;
                  *(dword **)(lVar7 + 0x30) = pdVar12;
                  *(dword **)(lVar7 + 0x28) = pdVar45;
                  *(dword **)(lVar7 + 0x20) = pdVar40;
                  *(dword **)(lVar7 + 0x18) = in_stack_00000220;
                  *(dword **)(lVar7 + 0x10) = in_stack_00000208;
                  *(undefined8 *)(lVar7 + 8) = 0;
                  lVar7 = *(long *)in_stack_00000208;
                  *(long *)in_stack_00000208 = lVar7 + 1;
                  if (lVar7 < 0) goto LAB_0056a25c;
                  in_stack_00000210 = (dword *)0x0;
                  if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)uStack0000000000000008) ||
                     (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                        (ulong)uStack0000000000000008 * (unaff_x25 & 0xffffffff)),
                     *plVar35 == -0x8000000000000000)) {
                    func_0x007a23bc(&UNK_009ee980);
                    goto code_r0x0056a5ec;
                  }
                  if (plVar35[2] == 0) {
                    func_0x007a2570(0,0,&UNK_009ee998);
                    goto code_r0x0056a5ec;
                  }
                  lVar7 = plVar35[1];
                  func_0x005649d4(lVar7 + 8);
                  *(long *)(lVar7 + 0x40) = lVar36;
                  *(undefined8 *)(lVar7 + 0x38) = uVar19;
                  *(dword **)(lVar7 + 0x30) = pdVar12;
                  *(dword **)(lVar7 + 0x28) = pdVar45;
                  *(dword **)(lVar7 + 0x20) = pdVar40;
                  *(dword **)(lVar7 + 0x18) = in_stack_00000220;
                  *(dword **)(lVar7 + 0x10) = in_stack_00000208;
                  *(undefined8 *)(lVar7 + 8) = 0;
                  func_0x0056c050();
                  param_1 = *(ulong *)(unaff_x20 + 0x28);
                  in_stack_00000088 = in_x10;
                  in_stack_00000218 = in_stack_00000208;
                  in_stack_00000400 = in_stack_000003c0;
                  in_stack_00000408 = in_stack_000003c8;
                  in_stack_00000410 = in_stack_000003d0;
                  in_stack_00000418 = in_stack_000003d8;
                  in_stack_00000420 = in_stack_000003e0;
                  in_stack_00000428 = in_stack_000003e8;
                  in_stack_00000430 = in_stack_000003f0;
                  in_stack_00000438 = in_stack_000003f8;
                  goto code_r0x005686b4;
                }
                lVar36 = lVar29 + uVar21 * unaff_x25;
                uVar21 = (ulong)*(uint *)(lVar36 + 0x24);
              } while (*(int *)(lVar36 + 0x28) == -1);
            }
code_r0x00567ac0:
            bVar4 = false;
joined_r0x005680f4:
            uVar21 = unaff_x28;
            if ((uVar23 < uVar22) &&
               (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
               *plVar35 != -0x8000000000000000)) {
              uVar38 = (ulong)*(uint *)((long)plVar35 + 0x1c);
              if (uVar27 >> 0x20 == 0) goto code_r0x00567e40;
code_r0x00567aec:
              if (uVar27 <= *(uint *)(lVar29 + 0x2ffffffff0)) {
code_r0x00567e64:
                do {
                  if (uVar27 <= uVar38) {
                    if ((uVar23 < uVar22) &&
                       (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
                       *plVar35 != -0x8000000000000000)) {
                      uVar38 = (ulong)*(uint *)(plVar35 + 3);
                      if (uVar27 <= uVar38) goto code_r0x00568148;
                    }
                    else {
                      uVar38 = 0xffffffff;
                      if (uVar27 < 0x100000000) {
code_r0x00568148:
                        uVar28 = 0xffffffff;
                        goto code_r0x0056814c;
                      }
                    }
                    lVar36 = lVar29 + uVar38 * (unaff_x25 & 0xffffffff);
                    uVar38 = (ulong)*(uint *)(lVar36 + 0x20);
                    iVar9 = *(int *)(lVar36 + 0x2c);
                    uVar28 = 0xffffffff;
                    goto code_r0x00568164;
                  }
                  lVar36 = lVar29 + uVar38 * unaff_x25;
                  uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
                } while (*(int *)(lVar36 + 0x28) == -1);
              }
            }
            else {
              uVar38 = 0xffffffff;
              if (uVar27 >> 0x20 != 0) goto code_r0x00567aec;
code_r0x00567e40:
              do {
                if (uVar27 <= uVar38) goto code_r0x00568ec0;
                lVar36 = lVar29 + uVar38 * unaff_x25;
                uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
              } while (*(int *)(lVar36 + 0x28) == -1);
              if (uVar27 < 0x100000000) goto code_r0x00567e64;
            }
            goto code_r0x00568ec0;
          }
          func_0x007a204c(uVar21,uVar23,&UNK_009ee9f8);
        }
      }
    }
  }
  else {
LAB_0056a314:
    func_0x007a23bc(in_stack_00000058);
  }
code_r0x0056a5ec:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar3)();
code_r0x005687ec:
  lVar36 = *(long *)(unaff_x20 + 0x38) + uVar21 * unaff_x25;
  uVar21 = (ulong)*(uint *)(lVar36 + 0x24);
  if (*(int *)(lVar36 + 0x28) != -1) goto LAB_005689cc;
  goto LAB_005687e4;
code_r0x00567b28:
  if (plVar25 == plVar18) goto code_r0x00567b30;
  plVar24 = plVar25 + 9;
  lVar29 = *plVar25;
  lVar36 = *(long *)(pdVar49 + 4) * 0x48;
  plVar31 = *(long **)(pdVar49 + 2);
  while (plVar25 = plVar24, lVar36 != 0) {
    lVar32 = *plVar31;
    lVar36 = lVar36 + -0x48;
    plVar31 = plVar31 + 9;
    if (lVar29 == lVar32) goto code_r0x00567a98;
  }
  goto code_r0x00567b28;
code_r0x00567b30:
  lVar36 = *plVar26;
  *plVar26 = lVar36 + 1;
  if (lVar36 < 0) {
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  in_stack_00000320 = (dword *)*plVar35;
  func_0x00566040(unaff_x29 + -0xe0,plVar35 + 1);
  func_0x00566040(unaff_x29 + -0xa0,plVar33);
  lVar36 = func_0x0056b044(&uStack00000000000000f0,*(undefined8 *)(unaff_x20 + 0x20),
                           *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,auStack_7ffffffe + 0x8000020e
                           ,unaff_x29 + -0xa0);
  pdVar48 = in_stack_000003d0;
  if (uStack00000000000000f0 == &MACH_HEADER.filetype) {
    lVar36 = *(long *)in_stack_00000320;
    *(long *)in_stack_00000320 = lVar36 + -1;
    LORelease();
    if (lVar36 == 1) {
      func_0x005d2ac4(auStack_7ffffffe + 0x8000031e);
    }
    in_stack_00000018 = 0;
    pdVar43 = in_stack_000003c0;
    pdVar46 = in_stack_000003c8;
    pdVar53 = in_stack_000003d8;
    pdVar44 = in_stack_000003e0;
    pdVar12 = in_stack_000003e8;
    uVar19 = in_stack_000003f0;
    lVar36 = in_stack_000003f8;
    if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
      func_0x005649d4(&uStack00000000000000f0);
    }
    goto code_r0x00569028;
  }
  in_stack_00000188 = uStack00000000000000f8;
  uStack0000000000000180 = uStack00000000000000f0;
  in_stack_00000198 = in_stack_00000108;
  in_stack_00000190 = in_stack_00000100;
  in_stack_000001a8 = in_stack_00000118;
  uStack00000000000001a0 = in_stack_00000110;
  in_stack_000001b8 = in_stack_00000128;
  in_stack_000001b0 = in_stack_00000120;
  lVar6 = *(long *)in_stack_00000320;
  *(long *)in_stack_00000320 = lVar6 + 1;
  if (-1 < lVar6) {
    if ((*(ulong *)(unaff_x20 + 0x40) <= uVar38) ||
       (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar38 * (unaff_x25 & 0xffffffff)),
       *plVar35 == -0x8000000000000000)) {
      func_0x007a23bc(&UNK_009eebc0);
      goto code_r0x0056a5ec;
    }
    if (plVar35[2] == 0) {
      func_0x007a2570(0,0,&UNK_009eebd8);
      goto code_r0x0056a5ec;
    }
    lVar6 = plVar35[1];
    lVar36 = func_0x005649d4(lVar6 + 8);
    *(long *)(lVar6 + 0x40) = in_stack_000003f8;
    *(undefined8 *)(lVar6 + 0x38) = in_stack_000003f0;
    *(dword **)(lVar6 + 0x30) = in_stack_000003e8;
    *(dword **)(lVar6 + 0x28) = in_stack_000003e0;
    *(dword **)(lVar6 + 0x20) = in_stack_000003d8;
    *(dword **)(lVar6 + 0x18) = in_stack_000003d0;
    *(dword **)(lVar6 + 0x10) = in_stack_00000320;
    *(undefined8 *)(lVar6 + 8) = 0;
    lVar6 = *(long *)in_stack_00000320;
    *(long *)in_stack_00000320 = lVar6 + 1;
    if (-1 < lVar6) {
      if ((*(ulong *)(unaff_x20 + 0x40) <= uVar21) ||
         (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar21 * (unaff_x25 & 0xffffffff)),
         *plVar35 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009eebf0);
        goto code_r0x0056a5ec;
      }
      if (plVar35[2] == 0) {
        func_0x007a2570(0,0,&UNK_009eec08);
        goto code_r0x0056a5ec;
      }
      lVar36 = plVar35[1];
      func_0x005649d4(lVar36 + 8);
      *(long *)(lVar36 + 0x40) = in_stack_000003f8;
      *(undefined8 *)(lVar36 + 0x38) = in_stack_000003f0;
      *(dword **)(lVar36 + 0x30) = in_stack_000003e8;
      *(dword **)(lVar36 + 0x28) = in_stack_000003e0;
      *(dword **)(lVar36 + 0x20) = in_stack_000003d8;
      *(dword **)(lVar36 + 0x18) = in_stack_000003d0;
      *(dword **)(lVar36 + 0x10) = in_stack_00000320;
      *(undefined8 *)(lVar36 + 8) = 0;
      if ((unaff_x19 < *(ulong *)(unaff_x20 + 0x28)) &&
         (puVar34 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
         *puVar34 != 0x8000000000000000)) {
        if ((puVar34[2] == 0) || (lVar6 = puVar34[1] + puVar34[2] * 0x108, lVar6 == 0x108)) {
          in_stack_00000068 = &UNK_009eec38;
        }
        else {
          lVar36 = lVar6 + -0xe8;
          if ((lVar36 != 0) && (*(long *)(lVar6 + -0xf0) == 0x10)) {
            lVar29 = *(long *)in_stack_00000320;
            *(long *)in_stack_00000320 = lVar29 + 1;
            if (-1 < lVar29) {
              func_0x005649d4();
              *(undefined8 *)(lVar6 + -0xe8) = 0;
              *(dword **)(lVar6 + -0xe0) = in_stack_00000320;
              uVar21 = puVar34[2];
              pdVar12 = (dword *)func_0x00187bd0(0x18,8);
              if (pdVar12 == (dword *)0x0) {
                func_0x007a1f18(8,0x18);
                goto code_r0x0056a5ec;
              }
              *(undefined8 *)pdVar12 = 0x8000000000000000;
              *(dword **)(pdVar12 + 2) = in_stack_00000320;
              pdVar55 = (dword *)((long)&MACH_HEADER.magic + 1);
              pdVar57 = (dword *)((long)&MACH_HEADER.magic + 1);
              puVar13 = (undefined8 *)func_0x00187bd0(0x40,8);
              if (puVar13 == (undefined8 *)0x0) {
                func_0x007a1f18(8,0x40);
                goto code_r0x0056a5ec;
              }
              uVar21 = uVar21 - 1;
              puVar13[1] = uStack00000000000000f8;
              *puVar13 = uStack00000000000000f0;
              puVar13[3] = in_stack_00000108;
              puVar13[2] = in_stack_00000100;
              puVar13[5] = in_stack_00000118;
              puVar13[4] = in_stack_00000110;
              puVar13[7] = in_stack_00000128;
              puVar13[6] = in_stack_00000120;
              uVar23 = puVar34[2];
              if (uVar23 < uVar21) {
                func_0x007a204c(uVar21,uVar23,&UNK_009eec68);
                goto code_r0x0056a5ec;
              }
              pdVar40 = in_stack_00000320;
              pdVar56 = pdVar12;
              if (uVar23 == *puVar34) {
                func_0x005bd0a4(puVar34,&UNK_009eec68);
              }
code_r0x00567da8:
              in_stack_00000018 = 1;
              lVar36 = puVar34[1] + uVar21 * 0x108;
              if (uVar21 <= uVar23 && uVar23 - uVar21 != 0) {
                _memmove(lVar36 + 0x108,lVar36,(uVar23 - uVar21) * 0x108);
              }
              _memcpy(lVar36,auStack_7ffffffe + 0x8000020e,0x108);
              puVar34[2] = uVar23 + 1;
              pdVar43 = (dword *)0x0;
              pdVar46 = in_stack_00000320;
              pdVar53 = (dword *)((long)&MACH_HEADER.filetype + 3);
              pdVar44 = (dword *)((long)&MACH_HEADER.magic + 1);
              uVar19 = 1;
              lVar36 = 1;
              in_stack_00000320 = pdVar40;
              in_stack_000003d0 = pdVar48;
              goto code_r0x00569028;
            }
            goto code_r0x0056a16c;
          }
        }
      }
      else {
        in_stack_00000068 = &UNK_009eec20;
      }
      func_0x007a23bc(in_stack_00000068);
      goto code_r0x0056a5ec;
    }
  }
code_r0x0056a16c:
  func_0x007a05dc(lVar36);
  goto code_r0x0056a5ec;
code_r0x00568778:
  lVar36 = *(long *)(unaff_x20 + 0x38) + uVar38 * unaff_x25;
  uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
  if (*(int *)(lVar36 + 0x28) != -1) goto code_r0x0056888c;
  goto code_r0x00568770;
  while( true ) {
    lVar36 = lVar29 + uVar28 * unaff_x25;
    uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
    iVar9 = *(int *)(lVar36 + 0x28);
    if (iVar9 != -1) break;
code_r0x0056814c:
    if (uVar27 <= uVar28) goto code_r0x00568ec0;
  }
code_r0x00568164:
  if (uVar27 <= uVar38) {
    do {
      if (uVar27 <= uVar28) {
        if (in_x10 < uVar22) {
          plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20);
          if (*plVar35 == -0x8000000000000000) {
            uVar38 = 0xffffffff;
          }
          else {
            uVar38 = (ulong)*(uint *)((long)plVar35 + 0x1c);
          }
        }
        else {
          uVar38 = 0xffffffff;
        }
        goto code_r0x00568724;
      }
      lVar36 = lVar29 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while (lVar36 = lVar29 + uVar38 * unaff_x25, uVar38 = (ulong)*(uint *)(lVar36 + 0x24),
        *(int *)(lVar36 + 0x28) == -1) {
code_r0x00568724:
    if (uVar27 <= uVar38) goto code_r0x00568ec0;
  }
  if (uVar27 >> 0x20 == 0) {
    do {
      if (uVar27 <= uVar38) {
        if ((in_x10 < uVar22) &&
           (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
           *plVar35 != -0x8000000000000000)) {
          uVar38 = (ulong)*(uint *)(plVar35 + 3);
        }
        else {
          uVar38 = 0xffffffff;
        }
        if (uVar27 <= uVar38) {
          uVar28 = 0xffffffff;
          goto code_r0x00568b50;
        }
        lVar36 = lVar29 + uVar38 * (unaff_x25 & 0xffffffff);
        uVar38 = (ulong)*(uint *)(lVar36 + 0x20);
        iVar30 = *(int *)(lVar36 + 0x2c);
        uVar28 = 0xffffffff;
        goto code_r0x00568b68;
      }
      lVar36 = lVar29 + uVar38 * unaff_x25;
      uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while( true ) {
    lVar36 = lVar29 + uVar28 * unaff_x25;
    uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
    iVar30 = *(int *)(lVar36 + 0x28);
    if (iVar30 != -1) break;
code_r0x00568b50:
    if (uVar27 <= uVar28) goto code_r0x00568ec0;
  }
code_r0x00568b68:
  if (uVar27 <= uVar38) {
    do {
      if (uVar27 <= uVar28) {
        if (iVar9 == iVar30) {
          if (uVar22 <= uVar23) goto code_r0x0056a4d0;
          lVar36 = *(long *)(unaff_x20 + 0x20);
          plVar35 = (long *)(lVar36 + uVar23 * 0x20);
          if (*plVar35 == -0x8000000000000000) goto code_r0x0056a4d0;
          if ((((plVar35[2] != 1) || (lVar7 = plVar35[1], *(long *)(lVar7 + 0x18) != 0xf)) ||
              (*(long *)(lVar7 + 0x30) != 1)) || (*(long *)(lVar7 + 0x48) != 1))
          goto code_r0x00568f3c;
          if ((uVar22 <= in_x10) ||
             (plVar35 = (long *)(lVar36 + in_x10 * 0x20), *plVar35 == -0x8000000000000000)) {
            in_stack_00000030 = &UNK_009eea28;
            goto code_r0x0056a4d0;
          }
          if (((((plVar35[2] != 1) || (lVar32 = plVar35[1], *(long *)(lVar32 + 0x18) != 0xf)) ||
               ((*(long *)(lVar32 + 0x30) != 1 ||
                (((*(long *)(lVar32 + 0x48) != 1 || (*(long *)(pdVar43 + 4) != 1)) ||
                 (puVar39 = *(undefined8 **)(pdVar43 + 2), puVar39[1] != 0)))))) ||
              ((*(long *)(pdVar49 + 4) != 1 ||
               (puVar41 = *(undefined8 **)(pdVar49 + 2), puVar41[1] != 0)))) ||
             ((plVar35 = (long *)*puVar39, plVar35 != (long *)*puVar41 ||
              (((**(long **)(lVar7 + 0x28) != -0x8000000000000000 ||
                ((*(long **)(lVar7 + 0x28))[1] != puVar39[2])) ||
               (**(long **)(lVar32 + 0x28) != -0x8000000000000000)))))) {
            uVar21 = unaff_x28 & 0xffffffff;
            goto code_r0x00568f3c;
          }
          uVar21 = unaff_x28 & 0xffffffff;
          if ((*(long **)(lVar32 + 0x28))[1] != puVar41[2]) goto code_r0x00568f3c;
          lVar36 = *plVar35;
          *plVar35 = lVar36 + 1;
          if (lVar36 < 0) {
            func_0x007a05dc();
            goto code_r0x0056a5ec;
          }
          pdVar15 = (dword *)*puVar39;
          if (*(long *)(lVar7 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea40);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar7 + 0x40));
          if (*(long *)(lVar32 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea58);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000035e,*(undefined8 *)(lVar32 + 0x40));
          func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
          if (pdVar51 != (dword *)0x0) {
            func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
            if (pdVar51 != (dword *)0x0) {
              func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x28 & 0xffffffff,
                              unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
              bVar5 = *(long *)(unaff_x29 + -0xe0) == 0xc;
              in_stack_00000018 = !bVar5;
              if (bVar5) {
                lVar36 = *(long *)pdVar15;
                *(long *)pdVar15 = lVar36 + -1;
                LORelease();
                if (lVar36 == 1) {
                  func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                }
                pdVar51 = in_stack_00000360;
                pdVar15 = in_stack_00000368;
                pdVar40 = in_stack_00000378;
                pdVar45 = in_stack_00000380;
                pdVar47 = in_stack_00000388;
                uVar20 = in_stack_00000390;
                lVar6 = in_stack_00000398;
                in_stack_00000400 = in_stack_00000320;
                in_stack_00000408 = in_stack_00000328;
                in_stack_00000410 = in_stack_00000330;
                in_stack_00000418 = in_stack_00000338;
                in_stack_00000420 = in_stack_00000340;
                in_stack_00000428 = in_stack_00000348;
                in_stack_00000430 = in_stack_00000350;
                in_stack_00000438 = in_stack_00000358;
                if (*(long *)(unaff_x29 + -0xe0) != 0xc) {
                  func_0x005649d4(unaff_x29 + -0xe0);
                }
                goto code_r0x0056a024;
              }
              lVar36 = *(long *)pdVar15;
              *(long *)pdVar15 = lVar36 + 1;
              if (lVar36 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)in_stack_00000220 & 0xffffffff)) ||
                 (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)in_stack_00000220 & 0xffffffff) *
                                    (unaff_x25 & 0xffffffff)), *plVar35 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eeaa0);
                goto code_r0x0056a5ec;
              }
              if (plVar35[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeab8);
                goto code_r0x0056a5ec;
              }
              lVar36 = plVar35[1];
              func_0x005649d4(lVar36 + 8);
              *(long *)(lVar36 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar36 + 0x38) = in_stack_00000390;
              *(dword **)(lVar36 + 0x30) = in_stack_00000388;
              *(dword **)(lVar36 + 0x28) = in_stack_00000380;
              *(dword **)(lVar36 + 0x20) = in_stack_00000378;
              *(dword **)(lVar36 + 0x18) = in_stack_00000370;
              *(dword **)(lVar36 + 0x10) = pdVar15;
              *(undefined8 *)(lVar36 + 8) = 0;
              lVar36 = *(long *)pdVar15;
              *(long *)pdVar15 = lVar36 + 1;
              if (lVar36 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)in_stack_00000220 & 0xffffffff)) ||
                 (plVar35 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)in_stack_00000220 & 0xffffffff) *
                                    (unaff_x25 & 0xffffffff)), *plVar35 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eead0);
                goto code_r0x0056a5ec;
              }
              if (plVar35[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeae8);
                goto code_r0x0056a5ec;
              }
              lVar36 = plVar35[1];
              func_0x005649d4(lVar36 + 8);
              *(long *)(lVar36 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar36 + 0x38) = in_stack_00000390;
              *(dword **)(lVar36 + 0x30) = in_stack_00000388;
              *(dword **)(lVar36 + 0x28) = in_stack_00000380;
              *(dword **)(lVar36 + 0x20) = in_stack_00000378;
              *(dword **)(lVar36 + 0x18) = in_stack_00000370;
              *(dword **)(lVar36 + 0x10) = pdVar15;
              *(undefined8 *)(lVar36 + 8) = 0;
              func_0x0056c050();
              if ((uVar23 < *(ulong *)(unaff_x20 + 0x28)) &&
                 (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
                 *plVar35 != -0x8000000000000000)) {
                uVar21 = (ulong)*(uint *)((long)plVar35 + 0x1c);
              }
              else {
                uVar21 = 0xffffffff;
              }
              if (*(ulong *)(unaff_x20 + 0x40) >> 0x20 != 0) goto code_r0x00569e80;
              goto code_r0x00569e4c;
            }
            in_stack_00000020 = &UNK_009eea88;
          }
          func_0x007a23bc(in_stack_00000020);
          goto code_r0x0056a5ec;
        }
        break;
      }
      lVar36 = lVar29 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
  }
code_r0x00568ec0:
  if ((uVar23 < uVar22) &&
     (lVar36 = *(long *)(unaff_x20 + 0x20), *(long *)(lVar36 + uVar23 * 0x20) != -0x8000000000000000
     )) {
code_r0x00568f3c:
    uVar38 = (ulong)*(uint *)(lVar36 + uVar23 * 0x20 + 0x1c);
    if (uVar27 >> 0x20 != 0) goto code_r0x00568ee4;
code_r0x00568f4c:
    do {
      if (uVar27 <= uVar38) goto code_r0x00568fdc;
      lVar36 = lVar29 + uVar38 * unaff_x25;
      uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
    if (uVar27 < 0x100000000) {
code_r0x00568f70:
      do {
        if (uVar27 <= uVar38) {
          if (in_x10 < uVar22) {
            plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20);
            if (*plVar35 == -0x8000000000000000) {
              uVar38 = 0xffffffff;
            }
            else {
              uVar38 = (ulong)*(uint *)((long)plVar35 + 0x1c);
            }
          }
          else {
            uVar38 = 0xffffffff;
          }
          goto code_r0x00568fc0;
        }
        lVar36 = lVar29 + uVar38 * unaff_x25;
        uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
      } while (*(int *)(lVar36 + 0x28) == -1);
    }
  }
  else {
    uVar38 = 0xffffffff;
    if (uVar27 >> 0x20 == 0) goto code_r0x00568f4c;
code_r0x00568ee4:
    if (uVar27 <= *(uint *)(lVar29 + 0x2ffffffff0)) goto code_r0x00568f70;
  }
code_r0x00568fdc:
  in_stack_00000018 = false;
code_r0x00568fe0:
  unaff_x26 = (undefined8 *)0x8000000000000000;
  bVar5 = false;
  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
    bVar5 = bVar4;
  }
  unaff_x28 = uVar21;
  pdVar12 = pdVar47;
  uVar19 = uVar20;
  lVar36 = lVar6;
  if (bVar5) {
    func_0x005649d4(&uStack0000000000000180);
    func_0x005649d4(in_stack_00000080);
  }
  goto LAB_00569000;
  while (lVar36 = *(long *)(unaff_x20 + 0x38) + uVar21 * unaff_x25,
        uVar21 = (ulong)*(uint *)(lVar36 + 0x24), *(int *)(lVar36 + 0x28) == -1) {
code_r0x00569e4c:
    if (*(ulong *)(unaff_x20 + 0x40) <= uVar21) {
      func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar23);
      func_0x00565df4(auStack_7ffffffe + 0x8000020e);
      break;
    }
  }
code_r0x00569e80:
  func_0x0056c050();
  uVar21 = *(ulong *)(unaff_x20 + 0x28);
  if ((in_x10 < uVar21) &&
     (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
     *plVar35 != -0x8000000000000000)) {
    uVar23 = (ulong)*(uint *)((long)plVar35 + 0x1c);
  }
  else {
    uVar23 = 0xffffffff;
  }
  if (*(ulong *)(unaff_x20 + 0x40) >> 0x20 == 0) {
    do {
      if (*(ulong *)(unaff_x20 + 0x40) <= uVar23) {
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_x10);
        func_0x00565df4(auStack_7ffffffe + 0x8000020e);
        uVar21 = *(ulong *)(unaff_x20 + 0x28);
        break;
      }
      lVar36 = *(long *)(unaff_x20 + 0x38) + uVar23 * unaff_x25;
      uVar23 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
  }
  if ((unaff_x19 < uVar21) &&
     (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     *plVar35 != -0x8000000000000000)) {
    if ((plVar35[2] == 0) || (lVar36 = plVar35[1] + plVar35[2] * 0x108, lVar36 == 0x108)) {
      in_stack_00000028 = &UNK_009eeb18;
    }
    else {
      if (lVar36 != 0xe8 && *(long *)(lVar36 + -0xf0) == 0x10) {
        lVar7 = *(long *)pdVar15;
        *(long *)pdVar15 = lVar7 + 1;
        if (lVar7 < 0) {
code_r0x0056a520:
          func_0x007a05dc();
          goto code_r0x0056a5ec;
        }
        func_0x005649d4();
        *(undefined8 *)(lVar36 + -0xe8) = 0;
        *(dword **)(lVar36 + -0xe0) = pdVar15;
        lVar36 = plVar35[2];
        puVar13 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar13 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          goto code_r0x0056a5ec;
        }
        *puVar13 = 0x8000000000000000;
        puVar13[1] = pdVar15;
        *(undefined8 *)(unaff_x29 + -0xf8) = 1;
        *(undefined8 **)(unaff_x29 + -0xf0) = puVar13;
        *(undefined8 *)(unaff_x29 + -0xe8) = 1;
        puVar13 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar13 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x40);
          goto code_r0x0056a5ec;
        }
        puVar13[1] = in_stack_000003c8;
        *puVar13 = in_stack_000003c0;
        puVar13[3] = in_stack_000003d8;
        puVar13[2] = in_stack_000003d0;
        puVar13[5] = in_stack_000003e8;
        puVar13[4] = in_stack_000003e0;
        puVar13[7] = in_stack_000003f8;
        puVar13[6] = in_stack_000003f0;
        pdVar47 = *(dword **)(unaff_x29 + -0xf0);
        pdVar45 = *(dword **)(unaff_x29 + -0xf8);
        uVar20 = *(undefined8 *)(unaff_x29 + -0xe8);
        func_0x005564bc(plVar35,lVar36 + -1,auStack_7ffffffe + 0x8000020e,&UNK_009eeb48);
        pdVar51 = (dword *)0x0;
        pdVar40 = (dword *)((long)&MACH_HEADER.filetype + 3);
        lVar6 = 1;
        in_stack_00000400 = in_stack_000003c0;
        in_stack_00000408 = in_stack_000003c8;
        in_stack_00000410 = in_stack_000003d0;
        in_stack_00000418 = in_stack_000003d8;
        in_stack_00000420 = in_stack_000003e0;
        in_stack_00000428 = in_stack_000003e8;
        in_stack_00000430 = in_stack_000003f0;
        in_stack_00000438 = in_stack_000003f8;
code_r0x0056a024:
        uVar21 = unaff_x28 & 0xffffffff;
        in_stack_00000220 = in_stack_00000370;
        goto code_r0x00568fe0;
      }
      in_stack_00000028 = &UNK_009eeb30;
    }
  }
  func_0x007a23bc(in_stack_00000028);
  goto code_r0x0056a5ec;
  while (lVar36 = lVar29 + uVar38 * unaff_x25, uVar38 = (ulong)*(uint *)(lVar36 + 0x24),
        *(int *)(lVar36 + 0x28) == -1) {
code_r0x00568fc0:
    if (uVar27 <= uVar38) goto code_r0x00568fdc;
  }
  if (uVar27 >> 0x20 == 0) {
    do {
      if (uVar27 <= uVar38) {
        if ((uVar23 < uVar22) &&
           (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20),
           *plVar35 != -0x8000000000000000)) {
          if (*(uint *)(plVar35 + 3) < uVar27) goto code_r0x00568fdc;
        }
        else if (0xffffffff < uVar27) goto code_r0x00568fdc;
        uVar38 = 0xffffffff;
        goto code_r0x00569b50;
      }
      in_stack_00000018 = false;
      lVar36 = lVar29 + uVar38 * unaff_x25;
      uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
    } while (*(int *)(lVar36 + 0x28) == -1);
    goto code_r0x00568fe0;
  }
  goto code_r0x00568fdc;
  while( true ) {
    in_stack_00000018 = false;
    lVar36 = lVar29 + uVar38 * unaff_x25;
    uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
    if (*(int *)(lVar36 + 0x28) != -1) break;
code_r0x00569b50:
    if (uVar27 <= uVar38) {
      if ((in_x10 < uVar22) &&
         (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
         *plVar35 != -0x8000000000000000)) {
        uVar38 = (ulong)*(uint *)(plVar35 + 3);
      }
      else {
        uVar38 = 0xffffffff;
      }
      if (uVar38 < uVar27) goto code_r0x00568fdc;
      uVar38 = 0xffffffff;
      goto code_r0x00569ba8;
    }
  }
  goto code_r0x00568fe0;
code_r0x00569ba8:
  if (uVar38 < uVar27) {
    in_stack_00000018 = false;
    lVar36 = lVar29 + uVar38 * unaff_x25;
    uVar38 = (ulong)*(uint *)(lVar36 + 0x24);
    if (*(int *)(lVar36 + 0x28) != -1) goto code_r0x00568fe0;
    goto code_r0x00569ba8;
  }
  if (uVar23 < uVar22) {
    plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar23 * 0x20);
    if (*plVar35 != -0x8000000000000000) {
      if (((plVar35[2] != 1) || (lVar36 = plVar35[1], *(long *)(lVar36 + 0x18) != 0x1b)) ||
         (*(long *)(lVar36 + 0x10) != 1)) goto code_r0x00568fdc;
      if ((in_x10 < uVar22) &&
         (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + in_x10 * 0x20),
         *plVar35 != -0x8000000000000000)) {
        if ((plVar35[2] != 1) ||
           ((lVar7 = plVar35[1], *(long *)(lVar7 + 0x18) != 0x1b || (*(long *)(lVar7 + 0x10) != 1)))
           ) goto code_r0x00568fdc;
        uVar19 = *(undefined8 *)(lVar7 + 8);
        func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar36 + 8));
        func_0x00566040(auStack_7ffffffe + 0x8000035e,uVar19);
        func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                        *(undefined8 *)(unaff_x20 + 0x28),uVar21,auStack_7ffffffe + 0x8000020e,
                        auStack_7ffffffe + 0x8000035e);
        in_stack_00000018 = *(long *)(unaff_x29 + -0xe0) != 0xc;
        pdVar51 = in_stack_00000320;
        pdVar15 = in_stack_00000328;
        in_stack_00000220 = in_stack_00000330;
        pdVar40 = in_stack_00000338;
        pdVar45 = in_stack_00000340;
        pdVar47 = in_stack_00000348;
        uVar20 = in_stack_00000350;
        lVar6 = in_stack_00000358;
        if ((bool)in_stack_00000018) {
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar23);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_x10);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          if ((*(ulong *)(unaff_x20 + 0x28) <= unaff_x19) ||
             (plVar35 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
             *plVar35 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009eeb90);
            goto code_r0x0056a5ec;
          }
          if (plVar35[2] != 0) {
            lVar36 = plVar35[2] + -1;
            plVar35[2] = lVar36;
            _memcpy(auStack_7ffffffe + 0x8000020e,plVar35[1] + lVar36 * 0x108,0x108);
            if (in_stack_00000338 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
              func_0x00564f24(auStack_7ffffffe + 0x8000020e);
            }
          }
          pdVar15 = (dword *)func_0x00187bd0(0x40,8);
          if (pdVar15 == (dword *)0x0) {
            func_0x007a1f18(8,0x40);
            goto code_r0x0056a5ec;
          }
          *(dword **)(pdVar15 + 2) = in_stack_000003c8;
          *(dword **)pdVar15 = in_stack_000003c0;
          *(dword **)(pdVar15 + 6) = in_stack_000003d8;
          *(dword **)(pdVar15 + 4) = in_stack_000003d0;
          *(dword **)(pdVar15 + 10) = in_stack_000003e8;
          *(dword **)(pdVar15 + 8) = in_stack_000003e0;
          *(long *)(pdVar15 + 0xe) = in_stack_000003f8;
          *(undefined8 *)(pdVar15 + 0xc) = in_stack_000003f0;
          pdVar51 = (dword *)((long)&MACH_HEADER.magic + 1);
          func_0x00566eec(plVar35,auStack_7ffffffe + 0x8000020e);
          in_stack_00000220 = in_stack_00000040;
          pdVar40 = in_stack_00000048;
          in_stack_00000400 = in_stack_000003c0;
          in_stack_00000408 = in_stack_000003c8;
          in_stack_00000410 = in_stack_000003d0;
          in_stack_00000418 = in_stack_000003d8;
          in_stack_00000420 = in_stack_000003e0;
          in_stack_00000428 = in_stack_000003e8;
          in_stack_00000430 = in_stack_000003f0;
          in_stack_00000438 = in_stack_000003f8;
        }
        goto code_r0x00568fe0;
      }
      in_stack_00000030 = &UNK_009eeb78;
code_r0x0056a4d0:
      func_0x007a23bc(in_stack_00000030);
      goto code_r0x0056a5ec;
    }
  }
  in_stack_00000030 = &UNK_009eeb60;
  goto code_r0x0056a4d0;
}

