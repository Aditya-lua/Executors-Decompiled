
/* WARNING: Removing unreachable block (ram,0x00568874) */
/* WARNING: Removing unreachable block (ram,0x005689b4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte FUN_00567da4(ulong *param_1,undefined *param_2)

{
  ulong *puVar1;
  bool bVar2;
  ulong uVar3;
  undefined1 uVar4;
  code *pcVar5;
  bool bVar6;
  bool bVar7;
  bool bVar8;
  byte bVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  dword *pdVar13;
  dword *pdVar14;
  undefined *puVar15;
  undefined1 extraout_w1;
  undefined1 extraout_w1_00;
  undefined *puVar16;
  long *plVar17;
  undefined8 uVar18;
  dword *pdVar19;
  ulong uVar20;
  dword *pdVar21;
  ulong uVar22;
  ulong uVar23;
  long *plVar24;
  long *plVar25;
  long lVar26;
  long *plVar27;
  ulong uVar28;
  ulong uVar29;
  long lVar30;
  long lVar31;
  int iVar32;
  long *plVar33;
  ulong unaff_x19;
  long unaff_x20;
  ulong uVar34;
  long *plVar35;
  ulong *unaff_x21;
  long *plVar36;
  ulong unaff_x22;
  undefined8 uVar37;
  long lVar38;
  undefined8 uVar39;
  undefined8 *puVar40;
  ulong unaff_x24;
  dword *pdVar41;
  ulong unaff_x25;
  undefined8 *puVar42;
  long unaff_x26;
  byte unaff_w27;
  undefined4 uVar43;
  ulong unaff_x28;
  long unaff_x29;
  dword *pdVar44;
  dword *pdVar45;
  dword *pdVar46;
  dword *pdVar47;
  dword *pdVar48;
  dword *pdVar49;
  dword *pdVar50;
  dword *pdVar51;
  dword *pdVar52;
  undefined1 auVar53 [16];
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
  dword *in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined4 uStack0000000000000130;
  uint uStack0000000000000134;
  undefined8 uStack0000000000000138;
  dword *in_stack_00000140;
  dword *in_stack_00000148;
  dword *in_stack_00000150;
  dword *in_stack_00000158;
  dword *in_stack_00000160;
  dword *in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 uStack0000000000000180;
  dword *in_stack_00000188;
  dword *in_stack_00000190;
  dword *in_stack_00000198;
  undefined8 uStack00000000000001a0;
  dword *in_stack_000001a8;
  dword *in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined1 uStack00000000000001c0;
  undefined4 uStack00000000000001c4;
  ulong in_stack_000001c8;
  dword *in_stack_00000210;
  dword *pdVar54;
  uint uVar55;
  dword *in_stack_00000218;
  dword *in_stack_00000220;
  dword *in_stack_00000228;
  dword *pdVar56;
  dword *pdVar57;
  dword *pdVar58;
  uint uVar59;
  dword *in_stack_00000230;
  dword *in_stack_00000238;
  dword *in_stack_00000240;
  undefined8 in_stack_00000248;
  undefined8 *in_stack_00000250;
  dword *in_stack_00000320;
  dword *in_stack_00000328;
  dword *in_stack_00000330;
  dword *in_stack_00000338;
  dword *pdVar60;
  dword *in_stack_00000340;
  dword *pdVar61;
  dword *in_stack_00000348;
  dword *pdVar62;
  dword *in_stack_00000350;
  dword *pdVar63;
  undefined8 in_stack_00000358;
  dword *in_stack_00000360;
  dword *in_stack_00000368;
  dword *in_stack_00000370;
  dword *in_stack_00000378;
  dword *in_stack_00000380;
  dword *in_stack_00000388;
  dword *in_stack_00000390;
  undefined8 in_stack_00000398;
  dword *in_stack_000003c0;
  dword *in_stack_000003c8;
  dword *in_stack_000003d0;
  dword *in_stack_000003d8;
  dword *in_stack_000003e0;
  dword *in_stack_000003e8;
  dword *in_stack_000003f0;
  undefined8 in_stack_000003f8;
  dword *in_stack_00000400;
  dword *in_stack_00000408;
  dword *in_stack_00000410;
  dword *in_stack_00000418;
  dword *in_stack_00000420;
  dword *in_stack_00000428;
  dword *in_stack_00000430;
  undefined8 in_stack_00000438;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x00567da4:
  func_0x005bd0a4(param_1,param_2);
  param_1 = unaff_x21;
  pdVar50 = in_stack_00000220;
  pdVar41 = in_stack_00000378;
  pdVar54 = in_stack_00000380;
  pdVar13 = in_stack_00000388;
  pdVar57 = in_stack_00000390;
  uVar37 = in_stack_00000398;
code_r0x00567da8:
  lVar38 = param_1[1] + unaff_x22 * 0x108;
  if (unaff_x22 <= unaff_x24 && unaff_x24 - unaff_x22 != 0) {
    _memmove(lVar38 + 0x108,lVar38,(unaff_x24 - unaff_x22) * 0x108);
  }
  _memcpy(lVar38,auStack_7ffffffe + 0x8000020e,0x108);
  param_1[2] = unaff_x24 + 1;
  pdVar44 = in_stack_00000210;
  pdVar14 = in_stack_00000218;
  pdVar56 = in_stack_00000228;
  pdVar45 = in_stack_00000230;
  pdVar49 = in_stack_00000238;
  pdVar19 = in_stack_00000240;
  uVar39 = in_stack_00000248;
  in_stack_00000220 = in_stack_000003d0;
LAB_00569028:
  unaff_w27 = in_stack_00000018 | unaff_w27;
  uVar20 = *(ulong *)(unaff_x20 + 0x28);
  pdVar52 = pdVar56;
  pdVar47 = pdVar49;
  pdVar21 = pdVar19;
  uVar18 = uVar39;
  pdVar46 = in_stack_00000360;
  pdVar48 = in_stack_00000368;
  pdVar51 = in_stack_00000370;
  in_stack_00000378 = pdVar41;
  in_stack_00000380 = pdVar54;
  in_stack_00000388 = pdVar13;
  in_stack_00000390 = pdVar57;
  in_stack_00000398 = uVar37;
  do {
    if ((uVar20 <= unaff_x19) ||
       (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20), *plVar36 == unaff_x26))
    {
      puVar15 = &UNK_009ee5f0;
      goto code_r0x0056a0b0;
    }
    if (plVar36[2] != 0) {
      lVar38 = plVar36[1] + plVar36[2] * 0x108;
      if (lVar38 != 0x108) {
        if (*(long *)(lVar38 + -0xf0) == 0x10) {
          func_0x00566040(auStack_7ffffffe + 0x8000031e,lVar38 + -0xe8);
          func_0x00584d50(auStack_7ffffffe + 0x8000020e);
          if (pdVar44 == (dword *)0x0) {
            func_0x007a23bc(&UNK_009ee608);
            goto code_r0x0056a5ec;
          }
          uVar20 = *(ulong *)(unaff_x20 + 0x28);
          if (((ulong)pdVar14 >> 0x20 < uVar20) &&
             (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + ((ulong)pdVar14 >> 0x20) * 0x20),
             *plVar36 != -0x8000000000000000)) {
            uVar23 = (ulong)*(uint *)((long)plVar36 + 0x1c);
          }
          else {
            uVar23 = 0xffffffff;
          }
          lVar26 = 0;
          uVar55 = (uint)((ulong)pdVar45 >> 0x20);
          uVar28 = 0xffffffff;
          lVar38 = *(long *)(unaff_x20 + 0x38);
          uVar34 = *(ulong *)(unaff_x20 + 0x40);
          if (0xffffffff < uVar34) goto code_r0x00569138;
          while (uVar23 < uVar34) {
            lVar31 = lVar38 + uVar23 * unaff_x25;
            uVar23 = (ulong)*(uint *)(lVar31 + 0x24);
            if (*(int *)(lVar31 + 0x28) != -1) {
              for (; lVar26 = lVar26 + 1, uVar28 < uVar34;
                  uVar28 = (ulong)*(uint *)(lVar38 + uVar28 * unaff_x25 + 0x20)) {
code_r0x00569138:
              }
            }
          }
          uVar43 = (undefined4)unaff_x28;
          uVar59 = (uint)((ulong)pdVar14 >> 0x20);
          if ((lVar26 != 1) || (*(long *)(pdVar44 + 4) != 0)) {
            bVar6 = false;
            pdVar54 = _UNK_009efac0;
            pdVar13 = _UNK_009efac8;
            pdVar57 = _UNK_009efad8;
            pdVar41 = pdVar44;
            pdVar56 = pdVar50;
            pdVar49 = pdVar52;
joined_r0x00569168:
            pdVar50 = _UNK_009efad0;
            if (uVar55 < uVar20) {
              plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + (ulong)uVar55 * 0x20);
              if (*plVar36 == -0x8000000000000000) {
                uVar20 = 0xffffffff;
              }
              else {
                uVar20 = (ulong)*(uint *)((long)plVar36 + 0x1c);
              }
            }
            else {
              uVar20 = 0xffffffff;
            }
            uVar23 = 0xffffffff;
            lVar26 = 0;
            if (uVar34 < 0x100000000) goto code_r0x00569240;
            do {
              do {
                uVar23 = (ulong)*(uint *)(lVar38 + uVar23 * unaff_x25 + 0x20);
                lVar26 = lVar26 + 1;
              } while (uVar23 < uVar34);
code_r0x00569240:
              do {
                if (uVar34 <= uVar20) {
                  _UNK_009efac0 = pdVar54;
                  _UNK_009efac8 = pdVar13;
                  _UNK_009efad0 = pdVar50;
                  _UNK_009efad8 = pdVar57;
                  if (lVar26 == 1) {
                    if (*(long *)(pdVar52 + 4) != 0) goto code_r0x005692f8;
                    lVar38 = *(long *)(pdVar44 + 2);
                    lVar26 = *(long *)(pdVar44 + 4);
                    if (lVar26 != 0) {
                      func_0x007a5f8c(auStack_7ffffffe + 0x8000020e,lVar26,
                                      auStack_7ffffffe + 0x8000022e,1);
                    }
                    func_0x00585744(lVar38,lVar38 + lVar26 * 0x48,auStack_7ffffffe + 0x8000020e);
                    *(dword **)(unaff_x29 + -0x90) = pdVar13;
                    *(dword **)(unaff_x29 + -0x98) = pdVar54;
                    *(dword **)(unaff_x29 + -0x80) = pdVar57;
                    *(dword **)(unaff_x29 + -0x88) = pdVar50;
                    *(uint *)(unaff_x29 + -0xa0) = uVar55;
                    *(uint *)(unaff_x29 + -0x9c) = uVar59;
                    func_0x00567190(auStack_7ffffffe + 0x8000020e);
                    pdVar41 = pdVar54;
                    pdVar14 = pdVar13;
                    pdVar56 = pdVar50;
                    pdVar49 = pdVar57;
                    if (pdVar54 == &MACH_HEADER.filetype) goto code_r0x005692f8;
                    func_0x00584d50(unaff_x29 + -0xa0);
                    if (*(long *)(unaff_x29 + -0xa0) == 0) {
                      func_0x007a23bc(&UNK_009ee638);
                      goto code_r0x0056a5ec;
                    }
                    bVar7 = uVar59 != *(uint *)(unaff_x29 + -0x94);
                    if (bVar7) {
                      uVar37 = func_0x005cb804(unaff_x29 + -0xa0,0);
                      *(undefined1 *)(unaff_x29 + -0xd0) = extraout_w1_00;
                      *(undefined8 *)(unaff_x29 + -0xe0) = 8;
                      *(undefined8 *)(unaff_x29 + -0xd8) = uVar37;
                      func_0x005c1d84(unaff_x29 + -0xf8,unaff_x29 + -0xe0,unaff_x29 + -0xa0,0xd);
                      in_stack_00000100 = *(dword **)(unaff_x29 + -0xf0);
                      uStack00000000000000f8 = *(dword **)(unaff_x29 + -0xf8);
                      in_stack_00000108 = *(dword **)(unaff_x29 + -0xe8);
                    }
                    else {
                      func_0x005c1d84(unaff_x29 + -0xf8,unaff_x29 + -0xe0,unaff_x29 + -0xa0,0xe);
                      in_stack_00000100 = *(dword **)(unaff_x29 + -0xf0);
                      uStack00000000000000f8 = *(dword **)(unaff_x29 + -0xf8);
                      in_stack_00000108 = *(dword **)(unaff_x29 + -0xe8);
                      in_stack_000003c0 = in_stack_00000320;
                      in_stack_000003c8 = in_stack_00000328;
                      in_stack_00000220 = in_stack_00000330;
                      in_stack_000003d8 = in_stack_00000338;
                      in_stack_000003e0 = in_stack_00000340;
                      in_stack_000003e8 = in_stack_00000348;
                      in_stack_000003f0 = in_stack_00000350;
                      in_stack_000003f8 = in_stack_00000358;
                    }
                    bVar8 = false;
                    uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
                    bVar2 = false;
                    if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                      bVar2 = bVar6;
                    }
                    uStack0000000000000130 = uVar43;
                    uStack0000000000000134 = uVar55;
                    uStack0000000000000138._0_4_ = uVar59;
                    uStack0000000000000138._4_1_ = (char)in_stack_00000250;
                    uStack0000000000000138._5_1_ = bVar7;
                    pdVar44 = pdVar54;
                    pdVar46 = pdVar54;
                    pdVar48 = pdVar13;
                    pdVar51 = pdVar50;
                    in_stack_00000378 = pdVar57;
                    in_stack_00000380 = pdVar45;
                    in_stack_00000388 = pdVar47;
                    in_stack_00000390 = pdVar21;
                    in_stack_00000398 = uVar18;
                    in_stack_00000400 = pdVar54;
                    in_stack_00000408 = pdVar13;
                    in_stack_00000410 = pdVar50;
                    in_stack_00000418 = pdVar57;
                    in_stack_00000420 = pdVar45;
                    in_stack_00000428 = pdVar47;
                    in_stack_00000430 = pdVar21;
                    in_stack_00000438 = uVar18;
                    if (bVar2) goto code_r0x00569324;
                  }
                  else {
code_r0x005692f8:
                    pdVar57 = pdVar49;
                    pdVar50 = pdVar56;
                    pdVar13 = pdVar14;
                    pdVar54 = pdVar41;
                    uStack00000000000000f0 = &MACH_HEADER.filetype;
                    func_0x005649d4(auStack_7ffffffe + 0x8000031e);
                    bVar8 = true;
                    bVar7 = false;
                    if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                      bVar7 = bVar6;
                    }
                    pdVar44 = pdVar54;
                    if (bVar7) {
code_r0x00569324:
                      func_0x005649d4(&uStack0000000000000180);
                      pdVar44 = pdVar54;
                    }
                  }
                  unaff_x26 = -0x8000000000000000;
                  pdVar14 = pdVar13;
                  pdVar52 = pdVar57;
                  if (!bVar8) goto code_r0x00569330;
                  goto code_r0x005676c0;
                }
                lVar31 = lVar38 + uVar20 * unaff_x25;
                uVar20 = (ulong)*(uint *)(lVar31 + 0x24);
              } while ((*(int *)(lVar31 + 0x28) == -1) || (lVar26 = lVar26 + 1, uVar34 <= uVar23));
            } while( true );
          }
          lVar38 = *(long *)(pdVar52 + 2);
          lVar26 = *(long *)(pdVar52 + 4);
          in_stack_00000188 = _UNK_009efac8;
          uStack0000000000000180 = _UNK_009efac0;
          in_stack_00000198 = _UNK_009efad8;
          in_stack_00000190 = _UNK_009efad0;
          if (lVar26 != 0) {
            func_0x007a5f8c(&uStack0000000000000180,lVar26,&uStack00000000000001a0,1);
          }
          func_0x00585744(lVar38,lVar38 + lVar26 * 0x48,&uStack0000000000000180);
          pdVar19 = in_stack_00000198;
          pdVar49 = in_stack_00000190;
          pdVar56 = in_stack_00000188;
          pdVar14 = uStack0000000000000180;
          pdVar41 = (dword *)CONCAT44(uVar55,uVar59);
          func_0x00567190(&uStack0000000000000180);
          uVar37 = in_stack_000001b8;
          pdVar60 = in_stack_000001b0;
          pdVar58 = in_stack_000001a8;
          pdVar45 = uStack00000000000001a0;
          pdVar57 = in_stack_00000198;
          pdVar50 = in_stack_00000190;
          pdVar13 = in_stack_00000188;
          pdVar54 = uStack0000000000000180;
          if (uStack0000000000000180 == &MACH_HEADER.filetype) {
            lVar38 = *(long *)(unaff_x20 + 0x38);
            uVar34 = *(ulong *)(unaff_x20 + 0x40);
            bVar6 = true;
            uVar20 = *(ulong *)(unaff_x20 + 0x28);
            pdVar54 = _UNK_009efac0;
            pdVar13 = _UNK_009efac8;
            pdVar57 = _UNK_009efad8;
            pdVar45 = pdVar19;
            goto joined_r0x00569168;
          }
          uVar4 = uStack00000000000001c0;
          func_0x00584d50(auStack_7ffffffe + 0x8000020e);
          if (pdVar41 == (dword *)0x0) {
            func_0x007a23bc(&UNK_009ee620);
            goto code_r0x0056a5ec;
          }
          bVar6 = (uint)((ulong)pdVar14 >> 0x20) != uVar55;
          if (bVar6) {
            func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                            0xd);
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
            uVar39 = func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
            *(undefined1 *)(unaff_x29 + -0x90) = extraout_w1;
            *(undefined8 *)(unaff_x29 + -0xa0) = 8;
            *(undefined8 *)(unaff_x29 + -0x98) = uVar39;
            func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                            0xe);
          }
          uStack0000000000000138._5_1_ = !bVar6;
          uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
          uStack0000000000000138._4_1_ = uVar4;
          uStack0000000000000130 = uVar43;
          uStack0000000000000134 = uVar59;
          uStack0000000000000138._0_4_ = uVar55;
          pdVar44 = pdVar54;
          pdVar47 = pdVar58;
          pdVar21 = pdVar60;
          uVar18 = uVar37;
          in_stack_000003c0 = pdVar54;
          in_stack_000003c8 = pdVar13;
          in_stack_00000220 = pdVar50;
          in_stack_000003d8 = pdVar57;
          in_stack_000003e0 = pdVar45;
          in_stack_000003e8 = pdVar58;
          in_stack_000003f0 = pdVar60;
          in_stack_000003f8 = uVar37;
code_r0x00569330:
          unaff_x26 = -0x8000000000000000;
          in_stack_000001c8 =
               CONCAT26(uStack0000000000000138._6_2_,
                        CONCAT15(uStack0000000000000138._5_1_,
                                 CONCAT14(uStack0000000000000138._4_1_,(uint)uStack0000000000000138)
                                ));
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
            pdVar14 = pdVar13;
            pdVar52 = pdVar57;
            goto code_r0x005676c0;
          }
          func_0x0055b5b8(unaff_x29 + -0xf8,auStack_7ffffffe + 0x8000020e,&UNK_009ee258);
          if (*(long *)(unaff_x29 + -0xe8) != 1) {
            func_0x007a247c(&UNK_008abfb8,0x2f,&UNK_009ee7d0);
            goto code_r0x0056a5ec;
          }
          func_0x005578dc(auStack_7ffffffe + 0x8000031e,**(undefined8 **)(unaff_x29 + -0xf0),
                          &UNK_009ee698);
          if ((((ulong)_uStack00000000000001c0 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x28)) &&
             (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) +
                                ((ulong)_uStack00000000000001c0 & 0xffffffff) * 0x20),
             *plVar36 != -0x8000000000000000)) {
            lVar38 = plVar36[3];
          }
          else {
            lVar38 = -1;
          }
          in_stack_000003c8 = *(dword **)(unaff_x20 + 0x38);
          lVar26 = *(long *)(unaff_x20 + 0x40);
          in_stack_000003c0 = (dword *)0x0;
          uVar37 = CONCAT44((int)((ulong)pdVar45 >> 0x20),_uStack00000000000001c0);
          func_0x0055b5b8(auStack_7ffffffe + 0x8000035e,auStack_7ffffffe + 0x8000020e,&UNK_009ee258)
          ;
          if (pdVar51 == (dword *)((long)&MACH_HEADER.magic + 1)) {
            if (((ulong)pdVar48[4] < *(ulong *)(unaff_x20 + 0x40)) &&
               (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                  (ulong)pdVar48[4] * (unaff_x25 & 0xffffffff)),
               *plVar36 != -0x8000000000000000)) {
              lVar31 = plVar36[2];
              if (lVar31 != 0) {
                puVar11 = (undefined8 *)plVar36[1];
                puVar40 = puVar11 + 9;
                puVar42 = puVar11;
                pdVar50 = in_stack_000003c0;
                do {
                  puVar12 = puVar40;
                  puVar40 = (undefined8 *)(in_stack_00000328 + -0x10);
                  lVar30 = (long)in_stack_00000330 * 0x48;
                  do {
                    in_stack_000003c0 = pdVar50;
                    if (lVar30 == 0) goto code_r0x005695f0;
                    in_stack_000003c0 = (dword *)puVar40[8];
                    puVar40 = puVar40 + 9;
                    lVar30 = lVar30 + -0x48;
                  } while (in_stack_000003c0 != (dword *)*puVar42);
                  lVar30 = *(long *)in_stack_000003c0;
                  *(long *)in_stack_000003c0 = lVar30 + 1;
                  if (lVar30 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0056a5ec;
                  }
                  func_0x00566040(auStack_7ffffffe + 0x80000216);
                  lVar30 = *(long *)*puVar42;
                  *(long *)*puVar42 = lVar30 + -1;
                  LORelease();
                  if (lVar30 == 1) {
                    func_0x005d2ac4(puVar42);
                  }
                  func_0x005649d4(puVar42 + 1);
                  puVar42[1] = in_stack_000003c8;
                  *puVar42 = in_stack_000003c0;
                  puVar42[8] = in_stack_00000250;
                  puVar42[5] = in_stack_00000080;
                  puVar42[4] = uVar37;
                  puVar42[7] = uVar18;
                  puVar42[6] = pdVar21;
                  puVar42[3] = lVar38;
                  puVar42[2] = lVar26;
code_r0x005695f0:
                  lVar30 = 0;
                  if (puVar12 != puVar11 + lVar31 * 9) {
                    lVar30 = 0x48;
                  }
                  puVar40 = (undefined8 *)((long)puVar12 + lVar30);
                  puVar42 = puVar12;
                  pdVar50 = in_stack_000003c0;
                } while (puVar12 != puVar11 + lVar31 * 9);
              }
              func_0x00584d50(auStack_7ffffffe + 0x8000020e);
              if (in_stack_000003c0 == (dword *)0x0) {
                puVar15 = &UNK_009ee6c8;
              }
              else {
                iVar10 = func_0x0056c050();
                if (iVar10 == 0) {
                  puVar15 = &UNK_008abf40;
                  uVar37 = 0x4a;
                  puVar16 = &UNK_009ee6e0;
                  goto code_r0x0056a11c;
                }
                func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,
                                uStack00000000000001c4);
                uVar18 = in_stack_000001b8;
                pdVar21 = in_stack_000001b0;
                pdVar47 = in_stack_000001a8;
                pdVar45 = uStack00000000000001a0;
                pdVar13 = in_stack_00000198;
                pdVar54 = in_stack_00000190;
                pdVar41 = in_stack_00000188;
                pdVar50 = uStack0000000000000180;
                if (in_stack_000003c0 != (dword *)0x8000000000000000) {
                  *(long *)(unaff_x29 + -0xd0) = lVar26;
                  uVar20 = (ulong)_uStack00000000000001c0 & 0xffffffff;
                  if ((in_stack_000001c8 & 0x100000000) == 0) {
                    if (lVar26 != 0) {
                      lVar31 = *(long *)(unaff_x29 + -0xd8);
                      lVar38 = lVar31 + lVar26 * 0x108;
                      if (lVar38 != 0x108) {
                        puVar40 = (undefined8 *)(lVar38 + -0xe8);
                        if (*(long *)(lVar38 + -0xf0) == 0x10 && puVar40 != (undefined8 *)0x0) {
                          func_0x005af378(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                          func_0x005649d4(puVar40);
                          *(dword **)(lVar38 + -0xe0) = in_stack_00000408;
                          *puVar40 = in_stack_00000400;
                          *(dword **)(lVar38 + -0xd0) = in_stack_00000418;
                          *(dword **)(lVar38 + -0xd8) = in_stack_00000410;
                          *(dword **)(lVar38 + -0xc0) = in_stack_00000428;
                          *(dword **)(lVar38 + -200) = in_stack_00000420;
                          *(undefined8 *)(lVar38 + -0xb0) = in_stack_00000438;
                          *(dword **)(lVar38 + -0xb8) = in_stack_00000430;
                          if ((in_stack_000001c8 & 0x10000000000) != 0) goto code_r0x00569860;
                          goto code_r0x005698d4;
                        }
                        in_stack_00000078 = &UNK_009ee728;
                      }
                    }
                  }
                  else if (lVar26 == 0) {
                    in_stack_00000078 = &UNK_009ee740;
                  }
                  else {
                    lVar31 = *(long *)(unaff_x29 + -0xd8);
                    if (*(long *)(lVar31 + 0x18) == 0xf) {
                      puVar40 = (undefined8 *)func_0x00187bd0(0x40,8);
                      uVar18 = in_stack_000001b8;
                      pdVar21 = in_stack_000001b0;
                      pdVar47 = in_stack_000001a8;
                      pdVar45 = uStack00000000000001a0;
                      pdVar13 = in_stack_00000198;
                      pdVar54 = in_stack_00000190;
                      pdVar41 = in_stack_00000188;
                      pdVar50 = uStack0000000000000180;
                      if (puVar40 == (undefined8 *)0x0) {
                        func_0x007a1f18(8,0x40);
                      }
                      else {
                        func_0x005af248(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                        puVar40[1] = in_stack_00000408;
                        *puVar40 = in_stack_00000400;
                        puVar40[3] = in_stack_00000418;
                        puVar40[2] = in_stack_00000410;
                        puVar40[5] = in_stack_00000428;
                        puVar40[4] = in_stack_00000420;
                        puVar40[7] = in_stack_00000438;
                        puVar40[6] = in_stack_00000430;
                        lVar38 = *(long *)(lVar31 + 0x48) + 1;
                        lVar30 = *(long *)(lVar31 + 0x40);
                        while (lVar38 = lVar38 + -1, lVar38 != 0) {
                          func_0x00553cb8(lVar30);
                          lVar30 = lVar30 + 0x40;
                        }
                        if (*(long *)(lVar31 + 0x38) != 0) {
                          func_0x00187bd4(*(undefined8 *)(lVar31 + 0x40),
                                          *(long *)(lVar31 + 0x38) << 6,8);
                        }
                        *(undefined8 *)(lVar31 + 0x38) = 1;
                        *(undefined8 **)(lVar31 + 0x40) = puVar40;
                        *(undefined8 *)(lVar31 + 0x48) = 1;
                        if ((in_stack_000001c8 & 0x10000000000) == 0) {
code_r0x005698d4:
                          unaff_x26 = -0x8000000000000000;
                          if ((uVar20 < *(ulong *)(unaff_x20 + 0x28)) &&
                             (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
                             *plVar36 != -0x8000000000000000)) {
                            if (plVar36[2] != 0) {
                              lVar38 = plVar36[2] + -1;
                              plVar36[2] = lVar38;
                              _memmove(auStack_7ffffffe + 0x8000020e,plVar36[1] + lVar38 * 0x108,
                                       0x108);
                              if (pdVar13 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
                                func_0x00564f24(auStack_7ffffffe + 0x8000020e);
                              }
                            }
                            pdVar50 = *(dword **)(unaff_x29 + -0xe0);
                            pdVar44 = *(dword **)(unaff_x29 + -0xd8);
                            uVar20 = *(ulong *)(unaff_x29 + -0xd0);
                            lVar38 = plVar36[2];
                            if ((ulong)(*plVar36 - lVar38) < uVar20) {
                              func_0x007abb04(plVar36,lVar38,uVar20,8,0x108);
                              lVar38 = plVar36[2];
                            }
                            _memcpy(plVar36[1] + lVar38 * 0x108,pdVar44,uVar20 * 0x108);
                            plVar36[2] = lVar38 + uVar20;
                            func_0x00592e4c(auStack_7ffffffe + 0x8000020e);
                            if (pdVar46 != (dword *)0x0) {
                              func_0x00187bd4(pdVar48,(long)pdVar46 * 0x18,8);
                            }
                            func_0x00558024(auStack_7ffffffe + 0x8000031e);
                            if (in_stack_00000320 != (dword *)0x0) {
                              func_0x00187bd4(in_stack_00000328,(long)in_stack_00000320 * 0x48,8);
                            }
                            if (*(long *)(unaff_x29 + -0xf8) != 0) {
                              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xf0),
                                              *(long *)(unaff_x29 + -0xf8) * 0x18,8);
                            }
                            unaff_w27 = 1;
                            pdVar14 = pdVar44;
                            pdVar52 = pdVar44;
                            goto code_r0x005676c0;
                          }
                          in_stack_00000070 = &UNK_009ee7a0;
                        }
                        else {
code_r0x00569860:
                          if ((lVar26 != 0) && (lVar31 = lVar31 + lVar26 * 0x108, lVar31 != 0x108))
                          {
                            puVar40 = (undefined8 *)(lVar31 + -0xe8);
                            if (*(long *)(lVar31 + -0xf0) == 0x10 && puVar40 != (undefined8 *)0x0) {
                              func_0x00566040(auStack_7ffffffe + 0x8000020e,puVar40);
                              func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
                              func_0x005cb1c8(auStack_7ffffffe + 0x8000020e);
                              func_0x005649d4(puVar40);
                              *(dword **)(lVar31 + -0xe0) = pdVar41;
                              *puVar40 = pdVar50;
                              *(dword **)(lVar31 + -0xd0) = pdVar13;
                              *(dword **)(lVar31 + -0xd8) = pdVar54;
                              *(dword **)(lVar31 + -0xc0) = pdVar47;
                              *(dword **)(lVar31 + -200) = pdVar45;
                              *(undefined8 *)(lVar31 + -0xb0) = uVar18;
                              *(dword **)(lVar31 + -0xb8) = pdVar21;
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
                puVar15 = &UNK_009ee6f8;
              }
            }
            else {
              puVar15 = &UNK_009ee6b0;
            }
            func_0x007a23bc(puVar15);
          }
          else {
            puVar16 = &UNK_009ee7b8;
            puVar15 = &UNK_008abf8a;
            uVar37 = 0x2e;
code_r0x0056a11c:
            func_0x007a247c(puVar15,uVar37,puVar16);
          }
          goto code_r0x0056a5ec;
        }
      }
    }
code_r0x005676c0:
    bVar9 = func_0x0056c534();
    unaff_w27 = unaff_w27 | bVar9;
    auVar53 = func_0x0058c2d4(&uStack0000000000000098,unaff_x20 + 0x18);
    unaff_x28 = auVar53._8_8_;
    if ((auVar53._0_8_ & 1) == 0) {
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
       (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20), *plVar36 == unaff_x26))
    {
      puVar15 = &UNK_009ee5c0;
      goto code_r0x0056a0b0;
    }
    if (((plVar36[2] != 0) && (lVar38 = plVar36[1] + plVar36[2] * 0x108, lVar38 != 0x108)) &&
       (*(long *)(lVar38 + -0xf0) == 0x10)) {
      puVar40 = (undefined8 *)(lVar38 + -0xe8);
      puVar42 = (undefined8 *)(lVar38 + -0xe0);
      if (puVar42 == (undefined8 *)0x0 || *(long *)(lVar38 + -0xe8) != 8) {
        if (((puVar42 == (undefined8 *)0x0 || *(long *)(lVar38 + -0xe8) != 9) ||
            (*(long *)*puVar42 != 6)) || (plVar36 = *(long **)(lVar38 + -0xd8), *plVar36 == 6))
        goto code_r0x005679b4;
        puVar11 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar11 == (undefined8 *)0x0) goto code_r0x0056a134;
        func_0x00566040(auStack_7ffffffe + 0x8000020e,plVar36);
        puVar11[1] = pdVar14;
        *puVar11 = pdVar44;
        puVar11[3] = pdVar52;
        puVar11[2] = pdVar50;
        puVar11[5] = pdVar47;
        puVar11[4] = pdVar45;
        puVar11[7] = uVar18;
        puVar11[6] = pdVar21;
        uStack00000000000000f8 = (dword *)puVar11[1];
        uStack00000000000000f0 = (dword *)*puVar11;
        in_stack_00000108 = (dword *)puVar11[3];
        in_stack_00000100 = (dword *)puVar11[2];
        in_stack_00000118 = (dword *)puVar11[5];
        in_stack_00000110 = (dword *)puVar11[4];
        in_stack_00000128 = puVar11[7];
        in_stack_00000120 = (dword *)puVar11[6];
        uVar37 = *puVar42;
        puVar12 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar12 != (undefined8 *)0x0) {
          func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar37);
          puVar12[1] = pdVar14;
          *puVar12 = pdVar44;
          puVar12[3] = pdVar52;
          puVar12[2] = pdVar50;
          puVar12[5] = pdVar47;
          puVar12[4] = pdVar45;
          puVar12[7] = uVar18;
          puVar12[6] = pdVar21;
          in_stack_00000188 = (dword *)puVar12[1];
          uStack0000000000000180 = (dword *)*puVar12;
          in_stack_00000198 = (dword *)puVar12[3];
          in_stack_00000190 = (dword *)puVar12[2];
          in_stack_000001a8 = (dword *)puVar12[5];
          uStack00000000000001a0 = (dword *)puVar12[4];
          in_stack_000001b8 = puVar12[7];
          in_stack_000001b0 = (dword *)puVar12[6];
          uVar55 = *(byte *)(lVar38 + -0xd0) - 7;
          if (uVar55 < 6) {
            func_0x005c1d84(unaff_x29 + -0xa0,&uStack00000000000000f0,&uStack0000000000000180,
                            0xb0c090a0807 >> (((ulong)uVar55 & 7) << 3));
            *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x90);
            func_0x005649d4(puVar40);
            *puVar40 = 9;
            *(dword **)(lVar38 + -0xd8) = in_stack_00000408;
            *puVar42 = in_stack_00000400;
            *(undefined8 *)(lVar38 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xd0);
            func_0x00187bd4(puVar12,0x40,8);
            func_0x00187bd4(puVar11,0x40,8);
            unaff_w27 = 1;
            uVar20 = *(ulong *)(unaff_x20 + 0x28);
            in_stack_000003c0 = in_stack_00000400;
            in_stack_000003c8 = in_stack_00000408;
            goto joined_r0x005678a4;
          }
          func_0x005649d4(&uStack0000000000000180);
          func_0x005649d4(&uStack00000000000000f0);
          func_0x00187bd4(puVar12,0x40,8);
          func_0x00187bd4(puVar11,0x40,8);
          uVar20 = *(ulong *)(unaff_x20 + 0x28);
          if (unaff_x19 < uVar20) goto code_r0x005679c0;
code_r0x0056a270:
          puVar15 = &UNK_009ee830;
          goto code_r0x0056a0b0;
        }
        func_0x007a1f18(8,0x40);
        goto code_r0x0056a5ec;
      }
      if (*(char *)(lVar38 + -0xd8) != '\0') goto code_r0x005679b4;
      uVar37 = *puVar42;
      puVar42 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar42 != (undefined8 *)0x0) {
        func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar37);
        puVar42[1] = pdVar14;
        *puVar42 = pdVar44;
        puVar42[3] = pdVar52;
        puVar42[2] = pdVar50;
        puVar42[5] = pdVar47;
        puVar42[4] = pdVar45;
        puVar42[7] = uVar18;
        puVar42[6] = pdVar21;
        pdVar14 = (dword *)puVar42[1];
        pdVar44 = (dword *)*puVar42;
        pdVar52 = (dword *)puVar42[3];
        pdVar50 = (dword *)puVar42[2];
        pdVar47 = (dword *)puVar42[5];
        pdVar45 = (dword *)puVar42[4];
        uVar18 = puVar42[7];
        pdVar21 = (dword *)puVar42[6];
        func_0x005649d4(puVar40);
        *(dword **)(lVar38 + -0xe0) = pdVar14;
        *puVar40 = pdVar44;
        *(dword **)(lVar38 + -0xd0) = pdVar52;
        *(dword **)(lVar38 + -0xd8) = pdVar50;
        *(dword **)(lVar38 + -0xc0) = pdVar47;
        *(dword **)(lVar38 + -200) = pdVar45;
        *(undefined8 *)(lVar38 + -0xb0) = uVar18;
        *(dword **)(lVar38 + -0xb8) = pdVar21;
        func_0x00187bd4(puVar42,0x40,8);
        func_0x00584d50(auStack_7ffffffe + 0x8000020e);
        if (pdVar44 != (dword *)0x0) {
          if ((int)pdVar50 == (int)pdVar47) {
            func_0x007a247c(&UNK_008ade0c,0x54,&UNK_009f1480);
          }
          else {
            if (((ulong)pdVar50 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) {
              plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                ((ulong)pdVar50 & 0xffffffff) * (unaff_x25 & 0xffffffff));
              if (*plVar36 != -0x8000000000000000) {
                if ((((ulong)pdVar47 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) &&
                   (plVar17 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                      ((ulong)pdVar47 & 0xffffffff) * (unaff_x25 & 0xffffffff)),
                   *plVar17 != -0x8000000000000000)) {
                  *(undefined1 *)(plVar36 + 3) = 2;
                  unaff_w27 = 1;
                  *(undefined1 *)(plVar17 + 3) = 1;
                  goto code_r0x005679b4;
                }
                in_stack_00000038 = &UNK_009f14b0;
              }
            }
            func_0x007a23bc(in_stack_00000038);
          }
          goto code_r0x0056a5ec;
        }
        puVar15 = &UNK_009ee5d8;
        goto code_r0x0056a0b0;
      }
code_r0x0056a134:
      func_0x007a1f18(8,0x40);
      goto code_r0x0056a5ec;
    }
code_r0x005679b4:
    uVar20 = *(ulong *)(unaff_x20 + 0x28);
joined_r0x005678a4:
    if (uVar20 <= unaff_x19) goto code_r0x0056a270;
code_r0x005679c0:
    plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20);
    unaff_x26 = -0x8000000000000000;
    if (*plVar36 == -0x8000000000000000) goto code_r0x0056a270;
  } while (((plVar36[2] == 0) || (lVar38 = plVar36[1] + plVar36[2] * 0x108, lVar38 == 0x108)) ||
          (*(long *)(lVar38 + -0xf0) != 0x10));
  func_0x00584d50(auStack_7ffffffe + 0x8000020e);
  if (pdVar44 == (dword *)0x0) {
    puVar15 = &UNK_009ee848;
code_r0x0056a0b0:
    func_0x007a23bc(puVar15);
    goto code_r0x0056a5ec;
  }
  uVar28 = (ulong)pdVar50 & 0xffffffff;
  uVar55 = (uint)((ulong)pdVar14 >> 0x20);
  uVar34 = (ulong)uVar55;
  uVar59 = (uint)((ulong)pdVar45 >> 0x20);
  uVar20 = (ulong)uVar59;
  uVar23 = (ulong)pdVar47 & 0xffffffff;
  if (uVar55 == uVar59) {
    in_stack_00000360 = pdVar46;
    in_stack_00000368 = pdVar48;
    in_stack_00000370 = pdVar51;
    pdVar41 = in_stack_00000378;
    pdVar54 = in_stack_00000380;
    pdVar13 = in_stack_00000388;
    pdVar57 = in_stack_00000390;
    uVar37 = in_stack_00000398;
    if (*(long *)(pdVar44 + 4) != 0) {
      plVar17 = *(long **)(pdVar44 + 2) + *(long *)(pdVar44 + 4) * 9;
      plVar36 = *(long **)(pdVar44 + 2);
      do {
        plVar25 = plVar36 + 9;
        plVar27 = (long *)*plVar36;
        lVar38 = *(long *)(pdVar52 + 4) * 0x48;
        plVar35 = *(long **)(pdVar52 + 2) + -8;
        while (lVar38 != 0) {
          plVar33 = plVar35 + 8;
          plVar35 = plVar35 + 9;
          lVar38 = lVar38 + -0x48;
          if (plVar27 == (long *)*plVar33) goto code_r0x00567b28;
        }
        plVar36 = plVar25;
      } while (plVar25 != plVar17);
    }
code_r0x00567a98:
    in_stack_00000018 = 0;
    pdVar56 = pdVar52;
    pdVar49 = pdVar47;
    pdVar19 = pdVar21;
    uVar39 = uVar18;
    goto LAB_00569028;
  }
  lVar38 = *(long *)(unaff_x20 + 0x38);
  uVar3 = *(ulong *)(unaff_x20 + 0x40);
  uVar22 = *(ulong *)(unaff_x20 + 0x28);
  if (*(long *)(pdVar44 + 4) == 0) {
    if ((uVar34 < uVar22) &&
       (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
       *plVar36 != -0x8000000000000000)) {
      uVar29 = (ulong)*(uint *)((long)plVar36 + 0x1c);
      if (uVar3 >> 0x20 == 0) goto code_r0x00567f04;
code_r0x00567e1c:
      if (*(uint *)(lVar38 + 0x2ffffffff0) < uVar3) goto code_r0x00567ab4;
    }
    else {
      uVar29 = 0xffffffff;
      if (uVar3 >> 0x20 != 0) goto code_r0x00567e1c;
code_r0x00567f04:
      do {
        if (uVar3 <= uVar29) goto code_r0x00567ab4;
        lVar26 = lVar38 + uVar29 * unaff_x25;
        uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
      } while (*(int *)(lVar26 + 0x28) == -1);
      if (0xffffffff < uVar3) goto code_r0x00567ab4;
    }
    do {
      if (uVar3 <= uVar29) {
        lVar38 = *(long *)(pdVar52 + 2);
        lVar26 = *(long *)(pdVar52 + 4);
        in_stack_00000188 = _UNK_009efac8;
        uStack0000000000000180 = _UNK_009efac0;
        in_stack_00000198 = _UNK_009efad8;
        in_stack_00000190 = _UNK_009efad0;
        if (lVar26 != 0) {
          func_0x007a5f8c(&uStack0000000000000180,lVar26,&uStack00000000000001a0,1);
        }
        func_0x00585744(lVar38,lVar38 + lVar26 * 0x48,&uStack0000000000000180);
        pdVar62 = in_stack_00000198;
        pdVar58 = in_stack_00000190;
        pdVar61 = in_stack_00000188;
        pdVar60 = uStack0000000000000180;
        func_0x0056b78c(&uStack00000000000000f0);
        uVar39 = in_stack_00000170;
        pdVar19 = in_stack_00000168;
        pdVar49 = in_stack_00000160;
        pdVar45 = in_stack_00000158;
        pdVar56 = in_stack_00000150;
        pdVar50 = in_stack_00000148;
        pdVar14 = in_stack_00000140;
        uVar37 = in_stack_00000128;
        pdVar57 = in_stack_00000120;
        pdVar13 = in_stack_00000118;
        pdVar54 = in_stack_00000110;
        pdVar41 = in_stack_00000108;
        in_stack_00000370 = in_stack_00000100;
        in_stack_00000368 = uStack00000000000000f8;
        in_stack_00000360 = uStack00000000000000f0;
        lVar38 = *(long *)(unaff_x20 + 0x38);
        uVar3 = *(ulong *)(unaff_x20 + 0x40);
        uVar22 = *(ulong *)(unaff_x20 + 0x28);
        if (uStack00000000000000f0 == &MACH_HEADER.filetype) {
          bVar6 = true;
          lVar26 = *(long *)(pdVar52 + 4);
          pdVar14 = pdVar60;
          pdVar50 = pdVar61;
          pdVar45 = pdVar62;
          pdVar41 = (dword *)CONCAT44(uVar59,uVar55);
          goto joined_r0x00567fd4;
        }
        puVar40 = (undefined8 *)CONCAT44(uStack0000000000000134,uStack0000000000000130);
        pdVar44 = (dword *)CONCAT26(uStack0000000000000138._6_2_,
                                    CONCAT15(uStack0000000000000138._5_1_,
                                             CONCAT14(uStack0000000000000138._4_1_,
                                                      (uint)uStack0000000000000138)));
        func_0x0055b13c(&uStack0000000000000180,auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
        if (in_stack_00000190 == (dword *)((long)&MACH_HEADER.magic + 1)) {
          dStack000000000000000c = in_stack_00000188[4];
          bVar6 = *(long *)in_stack_00000188 == 0;
        }
        else {
          bVar6 = true;
        }
        if (uStack0000000000000180 != (dword *)0x0) {
          func_0x00187bd4(in_stack_00000188,(long)uStack0000000000000180 * 0x18,8);
        }
        if (bVar6) {
          func_0x007a23bc(&UNK_009ee860);
          goto code_r0x0056a5ec;
        }
        plVar36 = (long *)*puVar40;
        lVar38 = *plVar36;
        *plVar36 = lVar38 + 1;
        if (lVar38 < 0) {
          func_0x007a05dc();
          goto code_r0x0056a5ec;
        }
        *(undefined8 *)(unaff_x29 + -0xf8) = *puVar40;
        in_stack_00000188 = in_stack_00000368;
        uStack0000000000000180 = in_stack_00000360;
        in_stack_00000198 = pdVar41;
        in_stack_00000190 = in_stack_00000370;
        in_stack_000001a8 = pdVar13;
        uStack00000000000001a0 = pdVar54;
        in_stack_000001b8 = uVar37;
        in_stack_000001b0 = pdVar57;
        func_0x0056b044(unaff_x29 + -0xa0,*(undefined8 *)(unaff_x20 + 0x20),
                        *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,&uStack0000000000000180,
                        auStack_7ffffffe + 0x8000020e);
        in_stack_000003c0 = pdVar44;
        in_stack_000003c8 = pdVar14;
        in_stack_000003d8 = pdVar56;
        in_stack_000003e0 = pdVar45;
        in_stack_000003e8 = pdVar49;
        in_stack_000003f0 = pdVar19;
        in_stack_000003f8 = uVar39;
        if (*(long *)(unaff_x29 + -0xa0) == 0xc) {
          lVar38 = **(long **)(unaff_x29 + -0xf8);
          **(long **)(unaff_x29 + -0xf8) = lVar38 + -1;
          LORelease();
          if (lVar38 == 1) {
            func_0x005d2ac4(unaff_x29 + -0xf8);
          }
          in_stack_00000018 = 0;
          in_stack_00000220 = pdVar50;
          if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
            func_0x005649d4(unaff_x29 + -0xa0);
          }
          goto LAB_00569028;
        }
        in_stack_00000018 = 1;
        lVar38 = **(long **)(unaff_x29 + -0xf8);
        **(long **)(unaff_x29 + -0xf8) = lVar38 + 1;
        uStack0000000000000180 = in_stack_00000400;
        in_stack_00000188 = in_stack_00000408;
        in_stack_00000190 = in_stack_00000410;
        in_stack_00000198 = in_stack_00000418;
        uStack00000000000001a0 = in_stack_00000420;
        in_stack_000001a8 = in_stack_00000428;
        in_stack_000001b0 = in_stack_00000430;
        in_stack_000001b8 = in_stack_00000438;
        if (lVar38 < 0) goto code_r0x0056a254;
        uVar18 = *(undefined8 *)(unaff_x29 + -0xf8);
        if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)dStack000000000000000c) ||
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                              (ulong)dStack000000000000000c * (unaff_x25 & 0xffffffff)),
           *plVar36 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009ee878);
          goto code_r0x0056a5ec;
        }
        if (plVar36[2] == 0) {
          func_0x007a2570(0,0,&UNK_009ee890);
          goto code_r0x0056a5ec;
        }
        lVar38 = plVar36[1];
        func_0x005649d4(lVar38 + 8);
        *(undefined8 *)(lVar38 + 0x40) = uVar39;
        *(dword **)(lVar38 + 0x38) = pdVar19;
        *(dword **)(lVar38 + 0x30) = pdVar49;
        *(dword **)(lVar38 + 0x28) = pdVar45;
        *(dword **)(lVar38 + 0x20) = pdVar56;
        *(dword **)(lVar38 + 0x18) = pdVar50;
        *(undefined8 *)(lVar38 + 0x10) = uVar18;
        *(undefined8 *)(lVar38 + 8) = 0;
        lVar38 = **(long **)(unaff_x29 + -0xf8);
        **(long **)(unaff_x29 + -0xf8) = lVar38 + 1;
        if (lVar38 < 0) goto code_r0x0056a254;
        in_stack_00000218 = *(dword **)(unaff_x29 + -0xf8);
        in_stack_00000210 = (dword *)0x0;
        if ((*(ulong *)(unaff_x20 + 0x40) <= uVar23) ||
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar23 * (unaff_x25 & 0xffffffff)),
           *plVar36 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009ee8a8);
          goto code_r0x0056a5ec;
        }
        if (plVar36[2] == 0) {
          func_0x007a2570(0,0,&UNK_009ee8c0);
          goto code_r0x0056a5ec;
        }
        lVar38 = plVar36[1];
        func_0x005649d4(lVar38 + 8);
        *(undefined8 *)(lVar38 + 0x40) = uVar39;
        *(dword **)(lVar38 + 0x38) = pdVar19;
        *(dword **)(lVar38 + 0x30) = pdVar49;
        *(dword **)(lVar38 + 0x28) = pdVar45;
        *(dword **)(lVar38 + 0x20) = pdVar56;
        *(dword **)(lVar38 + 0x18) = pdVar50;
        *(dword **)(lVar38 + 0x10) = in_stack_00000218;
        *(undefined8 *)(lVar38 + 8) = 0;
        func_0x0056c050();
        uVar20 = *(ulong *)(unaff_x20 + 0x28);
        if ((uVar34 < uVar20) &&
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
           *plVar36 != -0x8000000000000000)) {
          uVar23 = (ulong)*(uint *)((long)plVar36 + 0x1c);
          uVar28 = *(ulong *)(unaff_x20 + 0x40);
        }
        else {
          uVar23 = 0xffffffff;
          uVar28 = *(ulong *)(unaff_x20 + 0x40);
        }
        if (uVar28 >> 0x20 != 0) goto code_r0x0056888c;
        goto code_r0x00568770;
      }
      lVar26 = lVar38 + uVar29 * unaff_x25;
      uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
  }
code_r0x00567ab4:
  bVar6 = false;
  lVar26 = *(long *)(pdVar52 + 4);
  pdVar58 = pdVar52;
  pdVar41 = pdVar44;
joined_r0x00567fd4:
  if (lVar26 == 0) {
    if ((uVar20 < uVar22) &&
       (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
       *plVar36 != -0x8000000000000000)) {
      uVar23 = (ulong)*(uint *)((long)plVar36 + 0x1c);
      if (uVar3 >> 0x20 == 0) goto code_r0x00568028;
code_r0x00568004:
      if (*(uint *)(lVar38 + 0x2ffffffff0) < uVar3) goto code_r0x00567ac0;
    }
    else {
      uVar23 = 0xffffffff;
      if (uVar3 >> 0x20 != 0) goto code_r0x00568004;
code_r0x00568028:
      do {
        if (uVar3 <= uVar23) goto code_r0x00567ac0;
        lVar26 = lVar38 + uVar23 * unaff_x25;
        uVar23 = (ulong)*(uint *)(lVar26 + 0x24);
      } while (*(int *)(lVar26 + 0x28) == -1);
      if (0xffffffff < uVar3) goto code_r0x00567ac0;
    }
    do {
      if (uVar3 <= uVar23) {
        lVar38 = *(long *)(pdVar44 + 2);
        lVar26 = *(long *)(pdVar44 + 4);
        uStack0000000000000180 = _UNK_009efac0;
        in_stack_00000188 = _UNK_009efac8;
        in_stack_00000190 = _UNK_009efad0;
        in_stack_00000198 = _UNK_009efad8;
        if (lVar26 != 0) {
          func_0x007a5f8c(&uStack0000000000000180,lVar26,&uStack00000000000001a0,1);
        }
        func_0x00585744(lVar38,lVar38 + lVar26 * 0x48,&uStack0000000000000180);
        pdVar45 = in_stack_00000198;
        pdVar58 = in_stack_00000190;
        pdVar13 = in_stack_00000188;
        pdVar14 = uStack0000000000000180;
        pdVar41 = (dword *)CONCAT44(uVar55,uVar59);
        func_0x0056b78c(&uStack0000000000000180);
        puVar40 = _uStack00000000000001c0;
        uVar37 = in_stack_000001b8;
        pdVar63 = in_stack_000001b0;
        pdVar62 = in_stack_000001a8;
        pdVar61 = uStack00000000000001a0;
        pdVar60 = in_stack_00000198;
        pdVar50 = in_stack_00000190;
        pdVar57 = in_stack_00000188;
        pdVar54 = uStack0000000000000180;
        lVar38 = *(long *)(unaff_x20 + 0x38);
        uVar3 = *(ulong *)(unaff_x20 + 0x40);
        uVar22 = *(ulong *)(unaff_x20 + 0x28);
        if (uStack0000000000000180 == &MACH_HEADER.filetype) {
          bVar7 = true;
          pdVar50 = pdVar13;
          goto joined_r0x005680f4;
        }
        pdVar48 = (dword *)in_stack_00000080[1];
        pdVar46 = (dword *)*in_stack_00000080;
        in_stack_00000378 = (dword *)in_stack_00000080[3];
        pdVar51 = (dword *)in_stack_00000080[2];
        in_stack_00000388 = (dword *)in_stack_00000080[5];
        in_stack_00000380 = (dword *)in_stack_00000080[4];
        in_stack_00000398 = in_stack_00000080[7];
        in_stack_00000390 = (dword *)in_stack_00000080[6];
        func_0x0055b13c(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
        if (*(long *)(unaff_x29 + -0x90) == 1) {
          uStack0000000000000008 = *(uint *)(*(long **)(unaff_x29 + -0x98) + 2);
          bVar7 = **(long **)(unaff_x29 + -0x98) == 0;
        }
        else {
          bVar7 = true;
        }
        if (*(long *)(unaff_x29 + -0xa0) != 0) {
          func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x98),*(long *)(unaff_x29 + -0xa0) * 0x18,8);
        }
        if (bVar7) {
          func_0x007a23bc(&UNK_009ee938);
          goto code_r0x0056a5ec;
        }
        plVar36 = (long *)*puVar40;
        lVar38 = *plVar36;
        *plVar36 = lVar38 + 1;
        if (lVar38 < 0) {
          func_0x007a05dc();
          goto code_r0x0056a5ec;
        }
        pdVar14 = (dword *)*puVar40;
        func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                        *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,unaff_x29 + -0xa0,
                        auStack_7ffffffe + 0x8000020e);
        bVar7 = *(long *)(unaff_x29 + -0xe0) == 0xc;
        in_stack_00000018 = !bVar7;
        in_stack_00000330 = pdVar50;
        if (bVar7) {
          lVar38 = *(long *)pdVar14;
          *(long *)pdVar14 = lVar38 + -1;
          LORelease();
          if (lVar38 == 1) {
            func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
          }
          pdVar44 = pdVar54;
          pdVar14 = pdVar57;
          pdVar56 = pdVar60;
          pdVar45 = pdVar61;
          pdVar49 = pdVar62;
          pdVar19 = pdVar63;
          uVar39 = uVar37;
          in_stack_00000400 = pdVar46;
          in_stack_00000408 = pdVar48;
          in_stack_00000410 = pdVar51;
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
        lVar38 = *(long *)pdVar14;
        *(long *)pdVar14 = lVar38 + 1;
        if (lVar38 < 0) goto LAB_0056a25c;
        if ((*(ulong *)(unaff_x20 + 0x40) <= uVar28) ||
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar28 * (unaff_x25 & 0xffffffff)),
           *plVar36 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009ee950);
          goto code_r0x0056a5ec;
        }
        if (plVar36[2] == 0) {
          func_0x007a2570(0,0,&UNK_009ee968);
          goto code_r0x0056a5ec;
        }
        lVar38 = plVar36[1];
        func_0x005649d4(lVar38 + 8);
        *(undefined8 *)(lVar38 + 0x40) = uVar37;
        *(dword **)(lVar38 + 0x38) = pdVar63;
        *(dword **)(lVar38 + 0x30) = pdVar62;
        *(dword **)(lVar38 + 0x28) = pdVar61;
        *(dword **)(lVar38 + 0x20) = pdVar60;
        *(dword **)(lVar38 + 0x18) = pdVar50;
        *(dword **)(lVar38 + 0x10) = pdVar14;
        *(undefined8 *)(lVar38 + 8) = 0;
        lVar38 = *(long *)pdVar14;
        *(long *)pdVar14 = lVar38 + 1;
        if (lVar38 < 0) goto LAB_0056a25c;
        if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)uStack0000000000000008) ||
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                              (ulong)uStack0000000000000008 * (unaff_x25 & 0xffffffff)),
           *plVar36 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009ee980);
          goto code_r0x0056a5ec;
        }
        if (plVar36[2] == 0) {
          func_0x007a2570(0,0,&UNK_009ee998);
          goto code_r0x0056a5ec;
        }
        lVar38 = plVar36[1];
        func_0x005649d4(lVar38 + 8);
        *(undefined8 *)(lVar38 + 0x40) = uVar37;
        *(dword **)(lVar38 + 0x38) = pdVar63;
        *(dword **)(lVar38 + 0x30) = pdVar62;
        *(dword **)(lVar38 + 0x28) = pdVar61;
        *(dword **)(lVar38 + 0x20) = pdVar60;
        *(dword **)(lVar38 + 0x18) = pdVar50;
        *(dword **)(lVar38 + 0x10) = pdVar14;
        *(undefined8 *)(lVar38 + 8) = 0;
        func_0x0056c050();
        uVar23 = *(ulong *)(unaff_x20 + 0x28);
        if ((uVar20 < uVar23) &&
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
           *plVar36 != -0x8000000000000000)) {
          uVar34 = (ulong)*(uint *)((long)plVar36 + 0x1c);
          uVar28 = *(ulong *)(unaff_x20 + 0x40);
        }
        else {
          uVar34 = 0xffffffff;
          uVar28 = *(ulong *)(unaff_x20 + 0x40);
        }
        if (uVar28 >> 0x20 != 0) goto LAB_005689cc;
        goto LAB_005687e4;
      }
      lVar26 = lVar38 + uVar23 * unaff_x25;
      uVar23 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
  }
code_r0x00567ac0:
  bVar7 = false;
joined_r0x005680f4:
  uVar23 = unaff_x28;
  if ((uVar34 < uVar22) &&
     (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
     *plVar36 != -0x8000000000000000)) {
    uVar28 = (ulong)*(uint *)((long)plVar36 + 0x1c);
    if (uVar3 >> 0x20 == 0) goto code_r0x00567e40;
code_r0x00567aec:
    if (uVar3 <= *(uint *)(lVar38 + 0x2ffffffff0)) {
code_r0x00567e64:
      do {
        if (uVar3 <= uVar28) {
          if ((uVar34 < uVar22) &&
             (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
             *plVar36 != -0x8000000000000000)) {
            uVar28 = (ulong)*(uint *)(plVar36 + 3);
            if (uVar3 <= uVar28) goto code_r0x00568148;
          }
          else {
            uVar28 = 0xffffffff;
            if (uVar3 < 0x100000000) {
code_r0x00568148:
              uVar29 = 0xffffffff;
              goto code_r0x0056814c;
            }
          }
          lVar26 = lVar38 + uVar28 * (unaff_x25 & 0xffffffff);
          uVar28 = (ulong)*(uint *)(lVar26 + 0x20);
          iVar10 = *(int *)(lVar26 + 0x2c);
          uVar29 = 0xffffffff;
          goto code_r0x00568164;
        }
        lVar26 = lVar38 + uVar28 * unaff_x25;
        uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
      } while (*(int *)(lVar26 + 0x28) == -1);
    }
  }
  else {
    uVar28 = 0xffffffff;
    if (uVar3 >> 0x20 != 0) goto code_r0x00567aec;
code_r0x00567e40:
    do {
      if (uVar3 <= uVar28) goto code_r0x00568ec0;
      lVar26 = lVar38 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
    if (uVar3 < 0x100000000) goto code_r0x00567e64;
  }
  goto code_r0x00568ec0;
LAB_005687e4:
  if (uVar34 < uVar28) goto code_r0x005687ec;
  func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar20);
  pdVar41 = (dword *)((long)pdVar50 + 1);
  pdVar13 = pdVar14;
  while (pdVar41 = (dword *)((long)pdVar41 + -1), pdVar41 != (dword *)0x0) {
    func_0x00554164(pdVar13);
    pdVar13 = pdVar13 + 0x42;
  }
  uVar23 = *(ulong *)(unaff_x20 + 0x28);
LAB_005689cc:
  if ((uVar23 <= unaff_x19) ||
     (puVar1 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     *puVar1 == 0x8000000000000000)) {
LAB_0056a314:
    func_0x007a23bc(in_stack_00000058);
    goto code_r0x0056a5ec;
  }
  if ((puVar1[2] == 0) || (lVar38 = puVar1[1] + puVar1[2] * 0x108, lVar38 == 0x108)) {
    in_stack_00000058 = &UNK_009ee9c8;
    goto LAB_0056a314;
  }
  if (lVar38 == 0xe8 || *(long *)(lVar38 + -0xf0) != 0x10) {
    in_stack_00000058 = &UNK_009ee9e0;
    goto LAB_0056a314;
  }
  lVar26 = *(long *)pdVar14;
  *(long *)pdVar14 = lVar26 + 1;
  if (lVar26 < 0) {
LAB_0056a25c:
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  func_0x005649d4();
  *(undefined8 *)(lVar38 + -0xe8) = 0;
  *(dword **)(lVar38 + -0xe0) = pdVar14;
  uVar20 = puVar1[2];
  puVar40 = (undefined8 *)func_0x00187bd0(0x18,8);
  if (puVar40 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
    goto code_r0x0056a5ec;
  }
  *puVar40 = 0x8000000000000000;
  puVar40[1] = pdVar14;
  *(undefined8 *)(unaff_x29 + -0xf8) = 1;
  *(undefined8 **)(unaff_x29 + -0xf0) = puVar40;
  *(undefined8 *)(unaff_x29 + -0xe8) = 1;
  in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (in_stack_00000250 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    goto code_r0x0056a5ec;
  }
  uVar20 = uVar20 - 1;
  in_stack_00000250[1] = in_stack_000003c8;
  *in_stack_00000250 = in_stack_000003c0;
  in_stack_00000250[3] = in_stack_000003d8;
  in_stack_00000250[2] = in_stack_00000220;
  in_stack_00000250[5] = in_stack_000003e8;
  in_stack_00000250[4] = in_stack_000003e0;
  in_stack_00000250[7] = in_stack_000003f8;
  in_stack_00000250[6] = in_stack_000003f0;
  pdVar49 = *(dword **)(unaff_x29 + -0xf0);
  pdVar45 = *(dword **)(unaff_x29 + -0xf8);
  pdVar19 = *(dword **)(unaff_x29 + -0xe8);
  uVar23 = puVar1[2];
  if (uVar23 < uVar20) {
    func_0x007a204c(uVar20,uVar23,&UNK_009ee9f8);
    goto code_r0x0056a5ec;
  }
  if (uVar23 == *puVar1) {
    func_0x005bd0a4(puVar1,&UNK_009ee9f8);
  }
  lVar38 = puVar1[1] + uVar20 * 0x108;
  if (uVar20 <= uVar23 && uVar23 - uVar20 != 0) {
    _memmove(lVar38 + 0x108,lVar38,(uVar23 - uVar20) * 0x108);
  }
  _memcpy(lVar38,auStack_7ffffffe + 0x8000020e,0x108);
  puVar1[2] = uVar23 + 1;
  pdVar44 = (dword *)0x0;
  pdVar56 = (dword *)((long)&MACH_HEADER.filetype + 3);
  uVar39 = 1;
  in_stack_00000400 = in_stack_000003c0;
  in_stack_00000408 = in_stack_000003c8;
  in_stack_00000410 = in_stack_00000220;
  in_stack_00000418 = in_stack_000003d8;
  in_stack_00000420 = in_stack_000003e0;
  in_stack_00000428 = in_stack_000003e8;
  in_stack_00000430 = in_stack_000003f0;
  in_stack_00000438 = in_stack_000003f8;
  goto LAB_00569000;
code_r0x005687ec:
  lVar38 = *(long *)(unaff_x20 + 0x38) + uVar34 * unaff_x25;
  uVar34 = (ulong)*(uint *)(lVar38 + 0x24);
  if (*(int *)(lVar38 + 0x28) != -1) goto LAB_005689cc;
  goto LAB_005687e4;
  while( true ) {
    lVar26 = lVar38 + uVar29 * unaff_x25;
    uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
    iVar10 = *(int *)(lVar26 + 0x28);
    if (iVar10 != -1) break;
code_r0x0056814c:
    if (uVar3 <= uVar29) goto code_r0x00568ec0;
  }
code_r0x00568164:
  if (uVar3 <= uVar28) {
    do {
      if (uVar3 <= uVar29) {
        if (uVar20 < uVar22) {
          plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20);
          if (*plVar36 == -0x8000000000000000) {
            uVar28 = 0xffffffff;
          }
          else {
            uVar28 = (ulong)*(uint *)((long)plVar36 + 0x1c);
          }
        }
        else {
          uVar28 = 0xffffffff;
        }
        goto code_r0x00568724;
      }
      lVar26 = lVar38 + uVar29 * unaff_x25;
      uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while (lVar26 = lVar38 + uVar28 * unaff_x25, uVar28 = (ulong)*(uint *)(lVar26 + 0x24),
        *(int *)(lVar26 + 0x28) == -1) {
code_r0x00568724:
    if (uVar3 <= uVar28) goto code_r0x00568ec0;
  }
  if (uVar3 >> 0x20 == 0) {
    do {
      if (uVar3 <= uVar28) {
        if ((uVar20 < uVar22) &&
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
           *plVar36 != -0x8000000000000000)) {
          uVar28 = (ulong)*(uint *)(plVar36 + 3);
        }
        else {
          uVar28 = 0xffffffff;
        }
        if (uVar28 < uVar3) {
          lVar26 = lVar38 + uVar28 * (unaff_x25 & 0xffffffff);
          uVar28 = (ulong)*(uint *)(lVar26 + 0x20);
          iVar32 = *(int *)(lVar26 + 0x2c);
          uVar29 = 0xffffffff;
          goto code_r0x00568b68;
        }
        uVar29 = 0xffffffff;
        goto code_r0x00568b50;
      }
      lVar26 = lVar38 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while( true ) {
    lVar26 = lVar38 + uVar29 * unaff_x25;
    uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
    iVar32 = *(int *)(lVar26 + 0x28);
    if (iVar32 != -1) break;
code_r0x00568b50:
    if (uVar3 <= uVar29) goto code_r0x00568ec0;
  }
code_r0x00568b68:
  if (uVar3 <= uVar28) {
    do {
      if (uVar3 <= uVar29) {
        if (iVar10 == iVar32) {
          if (uVar22 <= uVar34) goto code_r0x0056a4d0;
          lVar26 = *(long *)(unaff_x20 + 0x20);
          plVar36 = (long *)(lVar26 + uVar34 * 0x20);
          if (*plVar36 == -0x8000000000000000) goto code_r0x0056a4d0;
          if ((((plVar36[2] != 1) || (lVar31 = plVar36[1], *(long *)(lVar31 + 0x18) != 0xf)) ||
              (*(long *)(lVar31 + 0x30) != 1)) || (*(long *)(lVar31 + 0x48) != 1))
          goto code_r0x00568f3c;
          if ((uVar22 <= uVar20) ||
             (plVar36 = (long *)(lVar26 + uVar20 * 0x20), *plVar36 == -0x8000000000000000)) {
            in_stack_00000030 = &UNK_009eea28;
            goto code_r0x0056a4d0;
          }
          if (((((plVar36[2] != 1) || (lVar30 = plVar36[1], *(long *)(lVar30 + 0x18) != 0xf)) ||
               ((*(long *)(lVar30 + 0x30) != 1 ||
                (((*(long *)(lVar30 + 0x48) != 1 || (*(long *)(pdVar44 + 4) != 1)) ||
                 (puVar40 = *(undefined8 **)(pdVar44 + 2), puVar40[1] != 0)))))) ||
              ((*(long *)(pdVar52 + 4) != 1 ||
               (puVar42 = *(undefined8 **)(pdVar52 + 2), puVar42[1] != 0)))) ||
             ((plVar36 = (long *)*puVar40, plVar36 != (long *)*puVar42 ||
              (((**(long **)(lVar31 + 0x28) != -0x8000000000000000 ||
                ((*(long **)(lVar31 + 0x28))[1] != puVar40[2])) ||
               (**(long **)(lVar30 + 0x28) != -0x8000000000000000)))))) {
            uVar23 = unaff_x28 & 0xffffffff;
            goto code_r0x00568f3c;
          }
          uVar23 = unaff_x28 & 0xffffffff;
          if ((*(long **)(lVar30 + 0x28))[1] != puVar42[2]) goto code_r0x00568f3c;
          lVar38 = *plVar36;
          *plVar36 = lVar38 + 1;
          if (lVar38 < 0) {
            func_0x007a05dc();
            goto code_r0x0056a5ec;
          }
          pdVar14 = (dword *)*puVar40;
          if (*(long *)(lVar31 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea40);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar31 + 0x40));
          if (*(long *)(lVar30 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea58);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000035e,*(undefined8 *)(lVar30 + 0x40));
          func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
          if (pdVar41 != (dword *)0x0) {
            func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
            if (pdVar41 != (dword *)0x0) {
              func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x28 & 0xffffffff,
                              unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
              bVar8 = *(long *)(unaff_x29 + -0xe0) == 0xc;
              in_stack_00000018 = !bVar8;
              if (bVar8) {
                lVar38 = *(long *)pdVar14;
                *(long *)pdVar14 = lVar38 + -1;
                LORelease();
                if (lVar38 == 1) {
                  func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                }
                pdVar41 = pdVar46;
                pdVar14 = pdVar48;
                pdVar58 = in_stack_00000378;
                pdVar45 = in_stack_00000380;
                pdVar47 = in_stack_00000388;
                pdVar21 = in_stack_00000390;
                uVar18 = in_stack_00000398;
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
              lVar38 = *(long *)pdVar14;
              *(long *)pdVar14 = lVar38 + 1;
              if (lVar38 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)pdVar50 & 0xffffffff)) ||
                 (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)pdVar50 & 0xffffffff) * (unaff_x25 & 0xffffffff)),
                 *plVar36 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eeaa0);
                goto code_r0x0056a5ec;
              }
              if (plVar36[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeab8);
                goto code_r0x0056a5ec;
              }
              lVar38 = plVar36[1];
              func_0x005649d4(lVar38 + 8);
              *(undefined8 *)(lVar38 + 0x40) = in_stack_00000398;
              *(dword **)(lVar38 + 0x38) = in_stack_00000390;
              *(dword **)(lVar38 + 0x30) = in_stack_00000388;
              *(dword **)(lVar38 + 0x28) = in_stack_00000380;
              *(dword **)(lVar38 + 0x20) = in_stack_00000378;
              *(dword **)(lVar38 + 0x18) = pdVar51;
              *(dword **)(lVar38 + 0x10) = pdVar14;
              *(undefined8 *)(lVar38 + 8) = 0;
              lVar38 = *(long *)pdVar14;
              *(long *)pdVar14 = lVar38 + 1;
              if (lVar38 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)pdVar50 & 0xffffffff)) ||
                 (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)pdVar50 & 0xffffffff) * (unaff_x25 & 0xffffffff)),
                 *plVar36 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eead0);
                goto code_r0x0056a5ec;
              }
              if (plVar36[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeae8);
                goto code_r0x0056a5ec;
              }
              lVar38 = plVar36[1];
              func_0x005649d4(lVar38 + 8);
              *(undefined8 *)(lVar38 + 0x40) = in_stack_00000398;
              *(dword **)(lVar38 + 0x38) = in_stack_00000390;
              *(dword **)(lVar38 + 0x30) = in_stack_00000388;
              *(dword **)(lVar38 + 0x28) = in_stack_00000380;
              *(dword **)(lVar38 + 0x20) = in_stack_00000378;
              *(dword **)(lVar38 + 0x18) = pdVar51;
              *(dword **)(lVar38 + 0x10) = pdVar14;
              *(undefined8 *)(lVar38 + 8) = 0;
              func_0x0056c050();
              if ((uVar34 < *(ulong *)(unaff_x20 + 0x28)) &&
                 (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
                 *plVar36 != -0x8000000000000000)) {
                uVar23 = (ulong)*(uint *)((long)plVar36 + 0x1c);
              }
              else {
                uVar23 = 0xffffffff;
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
      lVar26 = lVar38 + uVar29 * unaff_x25;
      uVar29 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
  }
code_r0x00568ec0:
  if ((uVar34 < uVar22) &&
     (lVar26 = *(long *)(unaff_x20 + 0x20), *(long *)(lVar26 + uVar34 * 0x20) != -0x8000000000000000
     )) {
code_r0x00568f3c:
    uVar28 = (ulong)*(uint *)(lVar26 + uVar34 * 0x20 + 0x1c);
    if (uVar3 >> 0x20 == 0) goto code_r0x00568f4c;
code_r0x00568ee4:
    if (uVar3 <= *(uint *)(lVar38 + 0x2ffffffff0)) {
code_r0x00568f70:
      do {
        if (uVar3 <= uVar28) {
          if (uVar20 < uVar22) {
            plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20);
            if (*plVar36 == -0x8000000000000000) {
              uVar28 = 0xffffffff;
            }
            else {
              uVar28 = (ulong)*(uint *)((long)plVar36 + 0x1c);
            }
          }
          else {
            uVar28 = 0xffffffff;
          }
          goto code_r0x00568fc0;
        }
        lVar26 = lVar38 + uVar28 * unaff_x25;
        uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
      } while (*(int *)(lVar26 + 0x28) == -1);
    }
  }
  else {
    uVar28 = 0xffffffff;
    if (uVar3 >> 0x20 != 0) goto code_r0x00568ee4;
code_r0x00568f4c:
    do {
      if (uVar3 <= uVar28) goto code_r0x00568fdc;
      lVar26 = lVar38 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
    if (uVar3 < 0x100000000) goto code_r0x00568f70;
  }
code_r0x00568fdc:
  in_stack_00000018 = false;
code_r0x00568fe0:
  bVar8 = false;
  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
    bVar8 = bVar7;
  }
  unaff_x28 = uVar23;
  pdVar44 = pdVar41;
  pdVar56 = pdVar58;
  pdVar49 = pdVar47;
  pdVar19 = pdVar21;
  uVar39 = uVar18;
  pdVar54 = in_stack_00000320;
  pdVar57 = in_stack_00000328;
  pdVar60 = in_stack_00000338;
  pdVar61 = in_stack_00000340;
  pdVar62 = in_stack_00000348;
  pdVar63 = in_stack_00000350;
  uVar37 = in_stack_00000358;
  if (bVar8) {
    func_0x005649d4(&uStack0000000000000180);
    func_0x005649d4(in_stack_00000080);
  }
LAB_00569000:
  unaff_x26 = -0x8000000000000000;
  bVar7 = false;
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    bVar7 = bVar6;
  }
  in_stack_00000320 = pdVar54;
  in_stack_00000328 = pdVar57;
  in_stack_00000338 = pdVar60;
  in_stack_00000340 = pdVar61;
  in_stack_00000348 = pdVar62;
  in_stack_00000350 = pdVar63;
  in_stack_00000358 = uVar37;
  in_stack_00000360 = pdVar46;
  in_stack_00000368 = pdVar48;
  in_stack_00000370 = pdVar51;
  pdVar41 = in_stack_00000378;
  pdVar54 = in_stack_00000380;
  pdVar13 = in_stack_00000388;
  pdVar57 = in_stack_00000390;
  uVar37 = in_stack_00000398;
  if (bVar7) {
    func_0x005649d4(&uStack00000000000000f0);
    func_0x005649d4(&uStack0000000000000138);
  }
  goto LAB_00569028;
  while (lVar38 = *(long *)(unaff_x20 + 0x38) + uVar23 * unaff_x25,
        uVar23 = (ulong)*(uint *)(lVar38 + 0x24), *(int *)(lVar38 + 0x28) == -1) {
code_r0x00569e4c:
    if (*(ulong *)(unaff_x20 + 0x40) <= uVar23) {
      func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar34);
      func_0x00565df4(auStack_7ffffffe + 0x8000020e);
      break;
    }
  }
code_r0x00569e80:
  func_0x0056c050();
  uVar23 = *(ulong *)(unaff_x20 + 0x28);
  if ((uVar20 < uVar23) &&
     (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
     *plVar36 != -0x8000000000000000)) {
    uVar34 = (ulong)*(uint *)((long)plVar36 + 0x1c);
  }
  else {
    uVar34 = 0xffffffff;
  }
  if (*(ulong *)(unaff_x20 + 0x40) >> 0x20 == 0) {
    do {
      if (*(ulong *)(unaff_x20 + 0x40) <= uVar34) {
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar20);
        func_0x00565df4(auStack_7ffffffe + 0x8000020e);
        uVar23 = *(ulong *)(unaff_x20 + 0x28);
        break;
      }
      lVar38 = *(long *)(unaff_x20 + 0x38) + uVar34 * unaff_x25;
      uVar34 = (ulong)*(uint *)(lVar38 + 0x24);
    } while (*(int *)(lVar38 + 0x28) == -1);
  }
  if ((unaff_x19 < uVar23) &&
     (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     *plVar36 != -0x8000000000000000)) {
    if ((plVar36[2] == 0) || (lVar38 = plVar36[1] + plVar36[2] * 0x108, lVar38 == 0x108)) {
      in_stack_00000028 = &UNK_009eeb18;
    }
    else {
      if (lVar38 != 0xe8 && *(long *)(lVar38 + -0xf0) == 0x10) {
        lVar26 = *(long *)pdVar14;
        *(long *)pdVar14 = lVar26 + 1;
        if (lVar26 < 0) {
code_r0x0056a520:
          func_0x007a05dc();
          goto code_r0x0056a5ec;
        }
        func_0x005649d4();
        *(undefined8 *)(lVar38 + -0xe8) = 0;
        *(dword **)(lVar38 + -0xe0) = pdVar14;
        lVar38 = plVar36[2];
        puVar40 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar40 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          goto code_r0x0056a5ec;
        }
        *puVar40 = 0x8000000000000000;
        puVar40[1] = pdVar14;
        *(undefined8 *)(unaff_x29 + -0xf8) = 1;
        *(undefined8 **)(unaff_x29 + -0xf0) = puVar40;
        *(undefined8 *)(unaff_x29 + -0xe8) = 1;
        in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (in_stack_00000250 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x40);
          goto code_r0x0056a5ec;
        }
        in_stack_00000250[1] = in_stack_000003c8;
        *in_stack_00000250 = in_stack_000003c0;
        in_stack_00000250[3] = in_stack_000003d8;
        in_stack_00000250[2] = in_stack_00000220;
        in_stack_00000250[5] = in_stack_000003e8;
        in_stack_00000250[4] = in_stack_000003e0;
        in_stack_00000250[7] = in_stack_000003f8;
        in_stack_00000250[6] = in_stack_000003f0;
        pdVar47 = *(dword **)(unaff_x29 + -0xf0);
        pdVar45 = *(dword **)(unaff_x29 + -0xf8);
        pdVar21 = *(dword **)(unaff_x29 + -0xe8);
        func_0x005564bc(plVar36,lVar38 + -1,auStack_7ffffffe + 0x8000020e,&UNK_009eeb48);
        pdVar41 = (dword *)0x0;
        pdVar58 = (dword *)((long)&MACH_HEADER.filetype + 3);
        uVar18 = 1;
        in_stack_00000400 = in_stack_000003c0;
        in_stack_00000408 = in_stack_000003c8;
        in_stack_00000410 = in_stack_00000220;
        in_stack_00000418 = in_stack_000003d8;
        in_stack_00000420 = in_stack_000003e0;
        in_stack_00000428 = in_stack_000003e8;
        in_stack_00000430 = in_stack_000003f0;
        in_stack_00000438 = in_stack_000003f8;
code_r0x0056a024:
        uVar23 = unaff_x28 & 0xffffffff;
        pdVar50 = pdVar51;
        goto code_r0x00568fe0;
      }
      in_stack_00000028 = &UNK_009eeb30;
    }
  }
  func_0x007a23bc(in_stack_00000028);
  goto code_r0x0056a5ec;
  while (lVar26 = lVar38 + uVar28 * unaff_x25, uVar28 = (ulong)*(uint *)(lVar26 + 0x24),
        *(int *)(lVar26 + 0x28) == -1) {
code_r0x00568fc0:
    if (uVar3 <= uVar28) goto code_r0x00568fdc;
  }
  if (uVar3 >> 0x20 == 0) {
    do {
      if (uVar3 <= uVar28) {
        if ((uVar34 < uVar22) &&
           (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
           *plVar36 != -0x8000000000000000)) {
          if (*(uint *)(plVar36 + 3) < uVar3) goto code_r0x00568fdc;
        }
        else if (0xffffffff < uVar3) goto code_r0x00568fdc;
        uVar28 = 0xffffffff;
        goto code_r0x00569b50;
      }
      in_stack_00000018 = false;
      lVar26 = lVar38 + uVar28 * unaff_x25;
      uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    } while (*(int *)(lVar26 + 0x28) == -1);
    goto code_r0x00568fe0;
  }
  goto code_r0x00568fdc;
  while( true ) {
    in_stack_00000018 = false;
    lVar26 = lVar38 + uVar28 * unaff_x25;
    uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    if (*(int *)(lVar26 + 0x28) != -1) break;
code_r0x00569b50:
    if (uVar3 <= uVar28) {
      if ((uVar20 < uVar22) &&
         (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
         *plVar36 != -0x8000000000000000)) {
        uVar28 = (ulong)*(uint *)(plVar36 + 3);
      }
      else {
        uVar28 = 0xffffffff;
      }
      if (uVar28 < uVar3) goto code_r0x00568fdc;
      uVar28 = 0xffffffff;
      goto code_r0x00569ba8;
    }
  }
  goto code_r0x00568fe0;
code_r0x00569ba8:
  if (uVar28 < uVar3) {
    in_stack_00000018 = false;
    lVar26 = lVar38 + uVar28 * unaff_x25;
    uVar28 = (ulong)*(uint *)(lVar26 + 0x24);
    if (*(int *)(lVar26 + 0x28) != -1) goto code_r0x00568fe0;
    goto code_r0x00569ba8;
  }
  if (uVar34 < uVar22) {
    plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20);
    if (*plVar36 != -0x8000000000000000) {
      if (((plVar36[2] != 1) || (lVar38 = plVar36[1], *(long *)(lVar38 + 0x18) != 0x1b)) ||
         (*(long *)(lVar38 + 0x10) != 1)) goto code_r0x00568fdc;
      if ((uVar20 < uVar22) &&
         (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar20 * 0x20),
         *plVar36 != -0x8000000000000000)) {
        if ((plVar36[2] != 1) ||
           ((lVar26 = plVar36[1], *(long *)(lVar26 + 0x18) != 0x1b ||
            (*(long *)(lVar26 + 0x10) != 1)))) goto code_r0x00568fdc;
        uVar37 = *(undefined8 *)(lVar26 + 8);
        func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar38 + 8));
        func_0x00566040(auStack_7ffffffe + 0x8000035e,uVar37);
        func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                        *(undefined8 *)(unaff_x20 + 0x28),uVar23,auStack_7ffffffe + 0x8000020e,
                        auStack_7ffffffe + 0x8000035e);
        in_stack_00000018 = *(long *)(unaff_x29 + -0xe0) != 0xc;
        pdVar41 = in_stack_00000320;
        pdVar14 = in_stack_00000328;
        pdVar50 = in_stack_00000330;
        pdVar58 = in_stack_00000338;
        pdVar45 = in_stack_00000340;
        pdVar47 = in_stack_00000348;
        pdVar21 = in_stack_00000350;
        uVar18 = in_stack_00000358;
        if ((bool)in_stack_00000018) {
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar34);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar20);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          if ((*(ulong *)(unaff_x20 + 0x28) <= unaff_x19) ||
             (plVar36 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
             *plVar36 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009eeb90);
            goto code_r0x0056a5ec;
          }
          if (plVar36[2] != 0) {
            lVar38 = plVar36[2] + -1;
            plVar36[2] = lVar38;
            _memcpy(auStack_7ffffffe + 0x8000020e,plVar36[1] + lVar38 * 0x108,0x108);
            if (in_stack_00000338 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
              func_0x00564f24(auStack_7ffffffe + 0x8000020e);
            }
          }
          pdVar14 = (dword *)func_0x00187bd0(0x40,8);
          if (pdVar14 == (dword *)0x0) {
            func_0x007a1f18(8,0x40);
            goto code_r0x0056a5ec;
          }
          *(dword **)(pdVar14 + 2) = in_stack_000003c8;
          *(dword **)pdVar14 = in_stack_000003c0;
          *(dword **)(pdVar14 + 6) = in_stack_000003d8;
          *(dword **)(pdVar14 + 4) = in_stack_00000220;
          *(dword **)(pdVar14 + 10) = in_stack_000003e8;
          *(dword **)(pdVar14 + 8) = in_stack_000003e0;
          *(undefined8 *)(pdVar14 + 0xe) = in_stack_000003f8;
          *(dword **)(pdVar14 + 0xc) = in_stack_000003f0;
          pdVar41 = (dword *)((long)&MACH_HEADER.magic + 1);
          func_0x00566eec(plVar36,auStack_7ffffffe + 0x8000020e);
          pdVar50 = in_stack_00000040;
          pdVar58 = in_stack_00000048;
          in_stack_00000400 = in_stack_000003c0;
          in_stack_00000408 = in_stack_000003c8;
          in_stack_00000410 = in_stack_00000220;
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
code_r0x00567b28:
  if (plVar25 == plVar17) goto code_r0x00567b30;
  plVar24 = plVar25 + 9;
  lVar26 = *plVar25;
  lVar38 = *(long *)(pdVar52 + 4) * 0x48;
  plVar33 = *(long **)(pdVar52 + 2);
  while (plVar25 = plVar24, lVar38 != 0) {
    lVar31 = *plVar33;
    lVar38 = lVar38 + -0x48;
    plVar33 = plVar33 + 9;
    if (lVar26 == lVar31) goto code_r0x00567a98;
  }
  goto code_r0x00567b28;
code_r0x00567b30:
  lVar38 = *plVar27;
  *plVar27 = lVar38 + 1;
  if (lVar38 < 0) {
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  in_stack_00000218 = (dword *)*plVar36;
  func_0x00566040(unaff_x29 + -0xe0,plVar36 + 1);
  func_0x00566040(unaff_x29 + -0xa0,plVar35);
  lVar38 = func_0x0056b044(&uStack00000000000000f0,*(undefined8 *)(unaff_x20 + 0x20),
                           *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,auStack_7ffffffe + 0x8000020e
                           ,unaff_x29 + -0xa0);
  pdVar50 = in_stack_00000220;
  in_stack_00000320 = in_stack_00000218;
  if (uStack00000000000000f0 == &MACH_HEADER.filetype) {
    lVar38 = *(long *)in_stack_00000218;
    *(long *)in_stack_00000218 = lVar38 + -1;
    LORelease();
    if (lVar38 == 1) {
      func_0x005d2ac4(auStack_7ffffffe + 0x8000031e);
    }
    in_stack_00000018 = 0;
    pdVar44 = in_stack_000003c0;
    pdVar14 = in_stack_000003c8;
    pdVar56 = in_stack_000003d8;
    pdVar45 = in_stack_000003e0;
    pdVar49 = in_stack_000003e8;
    pdVar19 = in_stack_000003f0;
    uVar39 = in_stack_000003f8;
    if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
      func_0x005649d4(&uStack00000000000000f0);
    }
    goto LAB_00569028;
  }
  in_stack_00000018 = 1;
  in_stack_00000188 = uStack00000000000000f8;
  uStack0000000000000180 = uStack00000000000000f0;
  in_stack_00000198 = in_stack_00000108;
  in_stack_00000190 = in_stack_00000100;
  in_stack_000001a8 = in_stack_00000118;
  uStack00000000000001a0 = in_stack_00000110;
  in_stack_000001b8 = in_stack_00000128;
  in_stack_000001b0 = in_stack_00000120;
  lVar26 = *(long *)in_stack_00000218;
  *(long *)in_stack_00000218 = lVar26 + 1;
  if (-1 < lVar26) {
    if ((*(ulong *)(unaff_x20 + 0x40) <= uVar28) ||
       (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar28 * (unaff_x25 & 0xffffffff)),
       *plVar36 == -0x8000000000000000)) {
      func_0x007a23bc(&UNK_009eebc0);
      goto code_r0x0056a5ec;
    }
    if (plVar36[2] == 0) {
      func_0x007a2570(0,0,&UNK_009eebd8);
      goto code_r0x0056a5ec;
    }
    lVar26 = plVar36[1];
    lVar38 = func_0x005649d4(lVar26 + 8);
    *(undefined8 *)(lVar26 + 0x40) = in_stack_000003f8;
    *(dword **)(lVar26 + 0x38) = in_stack_000003f0;
    *(dword **)(lVar26 + 0x30) = in_stack_000003e8;
    *(dword **)(lVar26 + 0x28) = in_stack_000003e0;
    *(dword **)(lVar26 + 0x20) = in_stack_000003d8;
    *(dword **)(lVar26 + 0x18) = in_stack_00000220;
    *(dword **)(lVar26 + 0x10) = in_stack_00000218;
    *(undefined8 *)(lVar26 + 8) = 0;
    lVar26 = *(long *)in_stack_00000218;
    *(long *)in_stack_00000218 = lVar26 + 1;
    if (-1 < lVar26) {
      in_stack_00000210 = (dword *)0x0;
      if ((*(ulong *)(unaff_x20 + 0x40) <= uVar23) ||
         (plVar36 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar23 * (unaff_x25 & 0xffffffff)),
         *plVar36 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009eebf0);
        goto code_r0x0056a5ec;
      }
      if (plVar36[2] == 0) {
        func_0x007a2570(0,0,&UNK_009eec08);
        goto code_r0x0056a5ec;
      }
      lVar38 = plVar36[1];
      func_0x005649d4(lVar38 + 8);
      *(undefined8 *)(lVar38 + 0x40) = in_stack_000003f8;
      *(dword **)(lVar38 + 0x38) = in_stack_000003f0;
      *(dword **)(lVar38 + 0x30) = in_stack_000003e8;
      *(dword **)(lVar38 + 0x28) = in_stack_000003e0;
      *(dword **)(lVar38 + 0x20) = in_stack_000003d8;
      *(dword **)(lVar38 + 0x18) = in_stack_00000220;
      *(dword **)(lVar38 + 0x10) = in_stack_00000218;
      *(undefined8 *)(lVar38 + 8) = 0;
      if ((unaff_x19 < *(ulong *)(unaff_x20 + 0x28)) &&
         (param_1 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
         *param_1 != 0x8000000000000000)) {
        if ((param_1[2] == 0) || (lVar26 = param_1[1] + param_1[2] * 0x108, lVar26 == 0x108)) {
          in_stack_00000068 = &UNK_009eec38;
        }
        else {
          lVar38 = lVar26 + -0xe8;
          if ((lVar38 != 0) && (*(long *)(lVar26 + -0xf0) == 0x10)) {
            lVar31 = *(long *)in_stack_00000218;
            *(long *)in_stack_00000218 = lVar31 + 1;
            if (-1 < lVar31) {
              func_0x005649d4();
              *(undefined8 *)(lVar26 + -0xe8) = 0;
              *(dword **)(lVar26 + -0xe0) = in_stack_00000218;
              uVar20 = param_1[2];
              in_stack_00000238 = (dword *)func_0x00187bd0(0x18,8);
              if (in_stack_00000238 == (dword *)0x0) {
                func_0x007a1f18(8,0x18);
                goto code_r0x0056a5ec;
              }
              *(undefined8 *)in_stack_00000238 = 0x8000000000000000;
              *(dword **)(in_stack_00000238 + 2) = in_stack_00000218;
              in_stack_00000230 = (dword *)((long)&MACH_HEADER.magic + 1);
              in_stack_00000240 = (dword *)((long)&MACH_HEADER.magic + 1);
              in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
              if (in_stack_00000250 == (undefined8 *)0x0) {
                func_0x007a1f18(8,0x40);
                goto code_r0x0056a5ec;
              }
              unaff_x22 = uVar20 - 1;
              in_stack_00000250[1] = uStack00000000000000f8;
              *in_stack_00000250 = uStack00000000000000f0;
              in_stack_00000250[3] = in_stack_00000108;
              in_stack_00000250[2] = in_stack_00000100;
              in_stack_00000250[5] = in_stack_00000118;
              in_stack_00000250[4] = in_stack_00000110;
              in_stack_00000250[7] = in_stack_00000128;
              in_stack_00000250[6] = in_stack_00000120;
              in_stack_00000248 = 1;
              in_stack_00000228 = (dword *)((long)&MACH_HEADER.filetype + 3);
              unaff_x24 = param_1[2];
              if (unaff_x24 < unaff_x22) {
                func_0x007a204c(unaff_x22,unaff_x24,&UNK_009eec68);
                goto code_r0x0056a5ec;
              }
              in_stack_00000360 = in_stack_00000230;
              in_stack_00000368 = in_stack_00000238;
              in_stack_00000370 = in_stack_00000240;
              in_stack_000003d0 = in_stack_00000220;
              if (unaff_x24 != *param_1) goto code_r0x00567da8;
              param_2 = &UNK_009eec68;
              unaff_x21 = param_1;
              goto code_r0x00567da4;
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
  func_0x007a05dc(lVar38);
  goto code_r0x0056a5ec;
code_r0x00568770:
  if (uVar23 < uVar28) {
    lVar38 = *(long *)(unaff_x20 + 0x38) + uVar23 * unaff_x25;
    uVar23 = (ulong)*(uint *)(lVar38 + 0x24);
    if (*(int *)(lVar38 + 0x28) != -1) goto code_r0x0056888c;
    goto code_r0x00568770;
  }
  func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar34);
  pdVar44 = (dword *)((long)pdVar50 + 1);
  pdVar14 = in_stack_00000218;
  while (pdVar44 = (dword *)((long)pdVar44 + -1), pdVar44 != (dword *)0x0) {
    func_0x00554164(pdVar14);
    pdVar14 = pdVar14 + 0x42;
  }
  uVar20 = *(ulong *)(unaff_x20 + 0x28);
code_r0x0056888c:
  if ((unaff_x19 < uVar20) &&
     (param_1 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     *param_1 != 0x8000000000000000)) {
    if ((param_1[2] == 0) || (lVar38 = param_1[1] + param_1[2] * 0x108, lVar38 == 0x108)) {
      in_stack_00000060 = &UNK_009ee8f0;
    }
    else {
      if (lVar38 != 0xe8 && *(long *)(lVar38 + -0xf0) == 0x10) {
        lVar26 = **(long **)(unaff_x29 + -0xf8);
        **(long **)(unaff_x29 + -0xf8) = lVar26 + 1;
        if (lVar26 < 0) {
code_r0x0056a254:
          func_0x007a05dc();
        }
        else {
          uVar39 = *(undefined8 *)(unaff_x29 + -0xf8);
          func_0x005649d4();
          *(undefined8 *)(lVar38 + -0xe8) = 0;
          *(undefined8 *)(lVar38 + -0xe0) = uVar39;
          uVar20 = param_1[2];
          in_stack_00000238 = (dword *)func_0x00187bd0(0x18,8);
          if (in_stack_00000238 == (dword *)0x0) {
            func_0x007a1f18(8,0x18);
          }
          else {
            uVar39 = *(undefined8 *)(unaff_x29 + -0xf8);
            *(undefined8 *)in_stack_00000238 = 0x8000000000000000;
            *(undefined8 *)(in_stack_00000238 + 2) = uVar39;
            in_stack_00000230 = (dword *)((long)&MACH_HEADER.magic + 1);
            in_stack_00000240 = (dword *)((long)&MACH_HEADER.magic + 1);
            in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
            if (in_stack_00000250 != (undefined8 *)0x0) {
              unaff_x22 = uVar20 - 1;
              in_stack_00000250[1] = in_stack_00000408;
              *in_stack_00000250 = in_stack_00000400;
              in_stack_00000250[3] = in_stack_00000418;
              in_stack_00000250[2] = in_stack_00000410;
              in_stack_00000250[5] = in_stack_00000428;
              in_stack_00000250[4] = in_stack_00000420;
              in_stack_00000250[7] = in_stack_00000438;
              in_stack_00000250[6] = in_stack_00000430;
              in_stack_00000248 = 1;
              in_stack_00000228 = (dword *)((long)&MACH_HEADER.filetype + 3);
              unaff_x24 = param_1[2];
              if (unaff_x24 < unaff_x22) {
                func_0x007a204c(unaff_x22,unaff_x24,&UNK_009ee920);
                goto code_r0x0056a5ec;
              }
              in_stack_00000320 = in_stack_00000230;
              in_stack_00000328 = in_stack_00000238;
              in_stack_00000330 = in_stack_00000240;
              in_stack_000003d0 = pdVar50;
              if (unaff_x24 == *param_1) {
                func_0x005bd0a4(param_1,&UNK_009ee920);
              }
              goto code_r0x00567da8;
            }
            func_0x007a1f18(8,0x40);
          }
        }
        goto code_r0x0056a5ec;
      }
      in_stack_00000060 = &UNK_009ee908;
    }
  }
  func_0x007a23bc(in_stack_00000060);
code_r0x0056a5ec:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar5)();
}

