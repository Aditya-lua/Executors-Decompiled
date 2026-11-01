
/* WARNING: Removing unreachable block (ram,0x005689b4) */
/* WARNING: Removing unreachable block (ram,0x00568874) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte FUN_0056942c(undefined8 *param_1)

{
  ulong uVar1;
  dword *pdVar2;
  dword *pdVar3;
  dword *pdVar4;
  code *pcVar5;
  bool bVar6;
  bool bVar7;
  bool bVar8;
  bool bVar9;
  long lVar10;
  long lVar11;
  byte bVar12;
  int iVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  dword *pdVar16;
  dword *pdVar17;
  undefined8 uVar18;
  undefined *puVar19;
  undefined1 extraout_w1;
  undefined1 extraout_w1_00;
  undefined *puVar20;
  ulong uVar21;
  long *plVar22;
  undefined8 uVar23;
  dword *pdVar24;
  ulong uVar25;
  ulong uVar26;
  long *plVar27;
  long *plVar28;
  long *plVar29;
  ulong uVar30;
  long lVar31;
  int iVar32;
  long *plVar33;
  undefined1 unaff_w19;
  ulong uVar34;
  long unaff_x20;
  long lVar35;
  ulong uVar36;
  long *plVar37;
  ulong *puVar38;
  long *plVar39;
  undefined8 uVar40;
  ulong uVar41;
  undefined8 *puVar42;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined8 *puVar43;
  undefined8 *unaff_x26;
  byte unaff_w27;
  ulong unaff_x28;
  long unaff_x29;
  dword *pdVar44;
  undefined8 uVar45;
  undefined1 auVar46 [16];
  uint uStack0000000000000008;
  dword dStack000000000000000c;
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
  undefined8 in_stack_00000128;
  undefined4 uStack0000000000000130;
  uint uStack0000000000000134;
  undefined8 uStack0000000000000138;
  dword *in_stack_00000140;
  dword *in_stack_00000148;
  dword *in_stack_00000150;
  dword *in_stack_00000158;
  dword *in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 uStack0000000000000180;
  dword *in_stack_00000188;
  dword *in_stack_00000190;
  dword *in_stack_00000198;
  undefined8 uStack00000000000001a0;
  dword *in_stack_000001a8;
  undefined8 in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined1 uStack00000000000001c0;
  undefined4 uStack00000000000001c4;
  ulong in_stack_000001c8;
  dword *pdVar47;
  dword *in_stack_00000210;
  uint uVar48;
  dword *in_stack_00000218;
  dword *in_stack_00000220;
  dword *in_stack_00000228;
  dword *pdVar49;
  uint uVar50;
  dword *in_stack_00000230;
  dword *in_stack_00000238;
  undefined8 in_stack_00000240;
  undefined8 uVar51;
  undefined8 in_stack_00000248;
  undefined8 *in_stack_00000250;
  dword *in_stack_00000320;
  dword *pdVar52;
  dword *in_stack_00000328;
  dword *in_stack_00000330;
  dword *pdVar53;
  dword *in_stack_00000338;
  dword *pdVar54;
  dword *in_stack_00000340;
  dword *pdVar55;
  dword *in_stack_00000348;
  undefined8 in_stack_00000350;
  undefined8 uVar56;
  undefined8 in_stack_00000358;
  dword *in_stack_00000360;
  dword *pdVar57;
  dword *in_stack_00000368;
  dword *in_stack_00000370;
  dword *in_stack_00000378;
  dword *in_stack_00000380;
  dword *in_stack_00000388;
  undefined8 in_stack_00000390;
  undefined8 in_stack_00000398;
  dword *in_stack_000003c0;
  dword *in_stack_000003c8;
  dword *in_stack_000003d0;
  dword *in_stack_000003d8;
  dword *in_stack_000003e0;
  dword *in_stack_000003e8;
  undefined8 in_stack_000003f0;
  undefined8 in_stack_000003f8;
  dword *in_stack_00000400;
  dword *in_stack_00000408;
  dword *in_stack_00000410;
  dword *in_stack_00000418;
  dword *in_stack_00000420;
  dword *in_stack_00000428;
  undefined8 in_stack_00000430;
  undefined8 in_stack_00000438;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x0056942c:
  func_0x005c1d84(param_1 + 1,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,0xe);
  uStack0000000000000138._5_1_ = 1;
LAB_00569a44:
  uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
  uStack0000000000000130 = (undefined4)unaff_x28;
  uStack0000000000000134 = (uint)in_stack_00000088;
  uStack0000000000000138._0_4_ = (int)unaff_x24;
  uStack0000000000000138._4_1_ = unaff_w19;
  pdVar44 = in_stack_00000238;
  uVar18 = in_stack_00000240;
  uVar45 = in_stack_00000248;
code_r0x00569330:
  in_stack_000001c8 =
       CONCAT26(uStack0000000000000138._6_2_,
                CONCAT15(uStack0000000000000138._5_1_,
                         CONCAT14(uStack0000000000000138._4_1_,(int)uStack0000000000000138)));
  _uStack00000000000001c0 = (undefined8 *)CONCAT44(uStack0000000000000134,uStack0000000000000130);
  in_stack_000001b8 = in_stack_00000128;
  in_stack_000001b0 = in_stack_00000120;
  in_stack_00000198 = in_stack_00000108;
  in_stack_00000190 = in_stack_00000100;
  in_stack_000001a8 = in_stack_00000118;
  uStack00000000000001a0 = in_stack_00000110;
  in_stack_00000188 = uStack00000000000000f8;
  uStack0000000000000180 = uStack00000000000000f0;
  if ((*(int *)(unaff_x20 + 0x78) == 1) && (uStack0000000000000134 == *(uint *)(unaff_x20 + 0x7c)))
  {
    func_0x005649d4(&uStack0000000000000180);
    pdVar24 = in_stack_00000218;
    goto code_r0x005676c0;
  }
  func_0x0055b5b8(unaff_x29 + -0xf8,auStack_7ffffffe + 0x8000020e,&UNK_009ee258);
  if (*(long *)(unaff_x29 + -0xe8) != 1) {
    func_0x007a247c(&UNK_008abfb8,0x2f,&UNK_009ee7d0);
    goto code_r0x0056a5ec;
  }
  func_0x005578dc(auStack_7ffffffe + 0x8000031e,**(undefined8 **)(unaff_x29 + -0xf0),&UNK_009ee698);
  if ((((ulong)_uStack00000000000001c0 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x28)) &&
     (puVar42 = (undefined8 *)
                (*(long *)(unaff_x20 + 0x20) + ((ulong)_uStack00000000000001c0 & 0xffffffff) * 0x20)
     , (undefined8 *)*puVar42 != unaff_x26)) {
    uVar40 = puVar42[3];
  }
  else {
    uVar40 = 0xffffffffffffffff;
  }
  in_stack_000003c8 = *(dword **)(unaff_x20 + 0x38);
  lVar35 = *(long *)(unaff_x20 + 0x40);
  in_stack_000003c0 = (dword *)0x0;
  uVar56 = CONCAT44((int)((ulong)in_stack_00000230 >> 0x20),_uStack00000000000001c0);
  func_0x0055b5b8(auStack_7ffffffe + 0x8000035e,auStack_7ffffffe + 0x8000020e,&UNK_009ee258);
  if (in_stack_00000370 == (dword *)((long)&MACH_HEADER.magic + 1)) {
    if (((ulong)in_stack_00000368[4] < *(ulong *)(unaff_x20 + 0x40)) &&
       (puVar42 = (undefined8 *)
                  (*(long *)(unaff_x20 + 0x38) +
                  (ulong)in_stack_00000368[4] * (unaff_x25 & 0xffffffff)),
       (undefined8 *)*puVar42 != unaff_x26)) {
      lVar10 = puVar42[2];
      if (lVar10 != 0) {
        puVar14 = (undefined8 *)puVar42[1];
        puVar42 = puVar14 + 9;
        puVar43 = puVar14;
        pdVar44 = in_stack_000003c0;
        do {
          puVar15 = puVar42;
          puVar42 = (undefined8 *)(in_stack_00000328 + -0x10);
          lVar11 = (long)in_stack_00000330 * 0x48;
          do {
            in_stack_000003c0 = pdVar44;
            if (lVar11 == 0) goto code_r0x005695f0;
            in_stack_000003c0 = (dword *)puVar42[8];
            puVar42 = puVar42 + 9;
            lVar11 = lVar11 + -0x48;
          } while (in_stack_000003c0 != (dword *)*puVar43);
          lVar11 = *(long *)in_stack_000003c0;
          *(long *)in_stack_000003c0 = lVar11 + 1;
          if (lVar11 < 0) {
            func_0x007a05dc();
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x80000216);
          lVar11 = *(long *)*puVar43;
          *(long *)*puVar43 = lVar11 + -1;
          LORelease();
          if (lVar11 == 1) {
            func_0x005d2ac4(puVar43);
          }
          func_0x005649d4(puVar43 + 1);
          puVar43[1] = in_stack_000003c8;
          *puVar43 = in_stack_000003c0;
          puVar43[8] = in_stack_00000250;
          puVar43[5] = in_stack_00000080;
          puVar43[4] = uVar56;
          puVar43[7] = uVar45;
          puVar43[6] = uVar18;
          puVar43[3] = uVar40;
          puVar43[2] = lVar35;
code_r0x005695f0:
          lVar11 = 0;
          if (puVar15 != puVar14 + lVar10 * 9) {
            lVar11 = 0x48;
          }
          puVar42 = (undefined8 *)((long)puVar15 + lVar11);
          puVar43 = puVar15;
          pdVar44 = in_stack_000003c0;
        } while (puVar15 != puVar14 + lVar10 * 9);
      }
      func_0x00584d50(auStack_7ffffffe + 0x8000020e);
      if (in_stack_000003c0 == (dword *)0x0) {
        puVar19 = &UNK_009ee6c8;
      }
      else {
        iVar13 = func_0x0056c050();
        if (iVar13 == 0) {
          puVar19 = &UNK_008abf40;
          uVar18 = 0x4a;
          puVar20 = &UNK_009ee6e0;
          goto code_r0x0056a11c;
        }
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uStack00000000000001c4);
        uVar45 = in_stack_000001b8;
        uVar18 = in_stack_000001b0;
        pdVar44 = in_stack_000001a8;
        in_stack_00000230 = uStack00000000000001a0;
        pdVar49 = in_stack_00000198;
        pdVar47 = in_stack_00000190;
        pdVar17 = in_stack_00000188;
        pdVar24 = uStack0000000000000180;
        if (in_stack_000003c0 != (dword *)unaff_x26) {
          *(long *)(unaff_x29 + -0xd0) = lVar35;
          uVar34 = (ulong)_uStack00000000000001c0 & 0xffffffff;
          if ((in_stack_000001c8 & 0x100000000) == 0) {
            if (lVar35 != 0) {
              lVar11 = *(long *)(unaff_x29 + -0xd8);
              lVar10 = lVar11 + lVar35 * 0x108;
              if (lVar10 != 0x108) {
                puVar42 = (undefined8 *)(lVar10 + -0xe8);
                if (*(long *)(lVar10 + -0xf0) == 0x10 && puVar42 != (undefined8 *)0x0) {
                  func_0x005af378(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                  func_0x005649d4(puVar42);
                  *(dword **)(lVar10 + -0xe0) = in_stack_00000408;
                  *puVar42 = in_stack_00000400;
                  *(dword **)(lVar10 + -0xd0) = in_stack_00000418;
                  *(dword **)(lVar10 + -0xd8) = in_stack_00000410;
                  *(dword **)(lVar10 + -0xc0) = in_stack_00000428;
                  *(dword **)(lVar10 + -200) = in_stack_00000420;
                  *(undefined8 *)(lVar10 + -0xb0) = in_stack_00000438;
                  *(undefined8 *)(lVar10 + -0xb8) = in_stack_00000430;
                  if ((in_stack_000001c8 & 0x10000000000) != 0) goto code_r0x00569860;
                  goto code_r0x005698d4;
                }
                in_stack_00000078 = &UNK_009ee728;
              }
            }
          }
          else if (lVar35 == 0) {
            in_stack_00000078 = &UNK_009ee740;
          }
          else {
            lVar11 = *(long *)(unaff_x29 + -0xd8);
            if (*(long *)(lVar11 + 0x18) == 0xf) {
              puVar42 = (undefined8 *)func_0x00187bd0(0x40,8);
              uVar45 = in_stack_000001b8;
              uVar18 = in_stack_000001b0;
              pdVar44 = in_stack_000001a8;
              in_stack_00000230 = uStack00000000000001a0;
              pdVar49 = in_stack_00000198;
              pdVar47 = in_stack_00000190;
              pdVar17 = in_stack_00000188;
              pdVar24 = uStack0000000000000180;
              if (puVar42 == (undefined8 *)0x0) {
                func_0x007a1f18(8,0x40);
              }
              else {
                func_0x005af248(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                puVar42[1] = in_stack_00000408;
                *puVar42 = in_stack_00000400;
                puVar42[3] = in_stack_00000418;
                puVar42[2] = in_stack_00000410;
                puVar42[5] = in_stack_00000428;
                puVar42[4] = in_stack_00000420;
                puVar42[7] = in_stack_00000438;
                puVar42[6] = in_stack_00000430;
                lVar10 = *(long *)(lVar11 + 0x48) + 1;
                lVar31 = *(long *)(lVar11 + 0x40);
                while (lVar10 = lVar10 + -1, lVar10 != 0) {
                  func_0x00553cb8(lVar31);
                  lVar31 = lVar31 + 0x40;
                }
                if (*(long *)(lVar11 + 0x38) != 0) {
                  func_0x00187bd4(*(undefined8 *)(lVar11 + 0x40),*(long *)(lVar11 + 0x38) << 6,8);
                }
                *(undefined8 *)(lVar11 + 0x38) = 1;
                *(undefined8 **)(lVar11 + 0x40) = puVar42;
                *(undefined8 *)(lVar11 + 0x48) = 1;
                unaff_x26 = (undefined8 *)0x8000000000000000;
                if ((in_stack_000001c8 & 0x10000000000) == 0) {
code_r0x005698d4:
                  if ((uVar34 < *(ulong *)(unaff_x20 + 0x28)) &&
                     (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
                     (undefined8 *)*plVar39 != unaff_x26)) {
                    if (plVar39[2] != 0) {
                      lVar35 = plVar39[2] + -1;
                      plVar39[2] = lVar35;
                      _memmove(auStack_7ffffffe + 0x8000020e,plVar39[1] + lVar35 * 0x108,0x108);
                      if (pdVar49 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
                        func_0x00564f24(auStack_7ffffffe + 0x8000020e);
                      }
                    }
                    in_stack_00000220 = *(dword **)(unaff_x29 + -0xe0);
                    in_stack_00000210 = *(dword **)(unaff_x29 + -0xd8);
                    uVar34 = *(ulong *)(unaff_x29 + -0xd0);
                    lVar35 = plVar39[2];
                    if ((ulong)(*plVar39 - lVar35) < uVar34) {
                      func_0x007abb04(plVar39,lVar35,uVar34,8,0x108);
                      lVar35 = plVar39[2];
                    }
                    _memcpy(plVar39[1] + lVar35 * 0x108,in_stack_00000210,uVar34 * 0x108);
                    plVar39[2] = lVar35 + uVar34;
                    func_0x00592e4c(auStack_7ffffffe + 0x8000020e);
                    if (in_stack_00000360 != (dword *)0x0) {
                      func_0x00187bd4(in_stack_00000368,(long)in_stack_00000360 * 0x18,8);
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
                    pdVar24 = in_stack_00000210;
                    in_stack_00000228 = in_stack_00000210;
code_r0x005676c0:
                    bVar12 = func_0x0056c534();
                    unaff_w27 = unaff_w27 | bVar12;
                    auVar46 = func_0x0058c2d4(&uStack0000000000000098,unaff_x20 + 0x18);
                    unaff_x28 = auVar46._8_8_;
                    if ((auVar46._0_8_ & 1) == 0) {
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
                    uVar34 = unaff_x28 & 0xffffffff;
                    if ((*(ulong *)(unaff_x20 + 0x28) <= uVar34) ||
                       (puVar42 = (undefined8 *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
                       (undefined8 *)*puVar42 == unaff_x26)) {
                      puVar19 = &UNK_009ee5c0;
                      goto code_r0x0056a0b0;
                    }
                    if (((puVar42[2] == 0) ||
                        (lVar35 = puVar42[1] + puVar42[2] * 0x108, lVar35 == 0x108)) ||
                       (*(long *)(lVar35 + -0xf0) != 0x10)) {
code_r0x005679b4:
                      uVar21 = *(ulong *)(unaff_x20 + 0x28);
joined_r0x005679bc:
                      if (uVar21 <= uVar34) goto code_r0x0056a270;
code_r0x005679c0:
                      plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20);
                      if (*plVar39 == -0x8000000000000000) goto code_r0x0056a270;
                      pdVar47 = in_stack_00000210;
                      pdVar17 = in_stack_00000228;
                      if (plVar39[2] != 0) {
                        lVar35 = plVar39[1] + plVar39[2] * 0x108;
                        if (lVar35 == 0x108) goto code_r0x00569030;
                        if (*(long *)(lVar35 + -0xf0) != 0x10) goto code_r0x00569030;
                        func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                        if (in_stack_00000210 == (dword *)0x0) {
                          puVar19 = &UNK_009ee848;
                          goto code_r0x0056a0b0;
                        }
                        uVar41 = (ulong)in_stack_00000220 & 0xffffffff;
                        uVar48 = (uint)((ulong)pdVar24 >> 0x20);
                        uVar36 = (ulong)uVar48;
                        uVar50 = (uint)((ulong)in_stack_00000230 >> 0x20);
                        uVar21 = (ulong)uVar50;
                        uVar26 = (ulong)pdVar44 & 0xffffffff;
                        if (uVar48 != uVar50) {
                          lVar35 = *(long *)(unaff_x20 + 0x38);
                          uVar1 = *(ulong *)(unaff_x20 + 0x40);
                          uVar25 = *(ulong *)(unaff_x20 + 0x28);
                          if (*(long *)(in_stack_00000210 + 4) == 0) {
                            if ((uVar36 < uVar25) &&
                               (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20),
                               *plVar39 != -0x8000000000000000)) {
                              uVar30 = (ulong)*(uint *)((long)plVar39 + 0x1c);
                              if (uVar1 >> 0x20 == 0) goto code_r0x00567f04;
code_r0x00567e1c:
                              if (*(uint *)(lVar35 + 0x2ffffffff0) < uVar1) goto code_r0x00567ab4;
                            }
                            else {
                              uVar30 = 0xffffffff;
                              if (uVar1 >> 0x20 != 0) goto code_r0x00567e1c;
code_r0x00567f04:
                              do {
                                if (uVar1 <= uVar30) goto code_r0x00567ab4;
                                lVar10 = lVar35 + uVar30 * unaff_x25;
                                uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
                              } while (*(int *)(lVar10 + 0x28) == -1);
                              if (0xffffffff < uVar1) goto code_r0x00567ab4;
                            }
                            do {
                              if (uVar1 <= uVar30) {
                                lVar35 = *(long *)(in_stack_00000228 + 2);
                                lVar10 = *(long *)(in_stack_00000228 + 4);
                                in_stack_00000188 = _UNK_009efac8;
                                uStack0000000000000180 = _UNK_009efac0;
                                in_stack_00000198 = _UNK_009efad8;
                                in_stack_00000190 = _UNK_009efad0;
                                if (lVar10 != 0) {
                                  func_0x007a5f8c(&uStack0000000000000180,lVar10,
                                                  &uStack00000000000001a0,1);
                                }
                                func_0x00585744(lVar35,lVar35 + lVar10 * 0x48,
                                                &uStack0000000000000180);
                                pdVar4 = in_stack_00000198;
                                pdVar47 = in_stack_00000190;
                                pdVar3 = in_stack_00000188;
                                pdVar2 = uStack0000000000000180;
                                func_0x0056b78c(&uStack00000000000000f0);
                                uVar51 = in_stack_00000170;
                                uVar23 = in_stack_00000168;
                                pdVar16 = in_stack_00000160;
                                in_stack_00000230 = in_stack_00000158;
                                pdVar17 = in_stack_00000150;
                                in_stack_00000220 = in_stack_00000148;
                                pdVar24 = in_stack_00000140;
                                uVar56 = in_stack_00000128;
                                uVar40 = in_stack_00000120;
                                pdVar55 = in_stack_00000118;
                                pdVar54 = in_stack_00000110;
                                pdVar53 = in_stack_00000108;
                                pdVar52 = in_stack_00000100;
                                pdVar57 = uStack00000000000000f8;
                                pdVar49 = uStack00000000000000f0;
                                lVar35 = *(long *)(unaff_x20 + 0x38);
                                uVar1 = *(ulong *)(unaff_x20 + 0x40);
                                uVar25 = *(ulong *)(unaff_x20 + 0x28);
                                if (uStack00000000000000f0 == &MACH_HEADER.filetype) {
                                  bVar6 = true;
                                  lVar10 = *(long *)(in_stack_00000228 + 4);
                                  pdVar24 = pdVar2;
                                  in_stack_00000220 = pdVar3;
                                  in_stack_00000230 = pdVar4;
                                  pdVar17 = (dword *)CONCAT44(uVar50,uVar48);
                                  goto joined_r0x00567fd4;
                                }
                                puVar42 = (undefined8 *)
                                          CONCAT44(uStack0000000000000134,uStack0000000000000130);
                                in_stack_00000210 =
                                     (dword *)CONCAT26(uStack0000000000000138._6_2_,
                                                       CONCAT15(uStack0000000000000138._5_1_,
                                                                CONCAT14(uStack0000000000000138.
                                                                         _4_1_,(int)
                                                  uStack0000000000000138)));
                                func_0x0055b13c(&uStack0000000000000180,
                                                auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
                                if (in_stack_00000190 == (dword *)((long)&MACH_HEADER.magic + 1)) {
                                  dStack000000000000000c = in_stack_00000188[4];
                                  bVar6 = *(long *)in_stack_00000188 == 0;
                                }
                                else {
                                  bVar6 = true;
                                }
                                if (uStack0000000000000180 != (dword *)0x0) {
                                  func_0x00187bd4(in_stack_00000188,
                                                  (long)uStack0000000000000180 * 0x18,8);
                                }
                                if (bVar6) {
                                  func_0x007a23bc(&UNK_009ee860);
                                  goto code_r0x0056a5ec;
                                }
                                plVar39 = (long *)*puVar42;
                                lVar35 = *plVar39;
                                *plVar39 = lVar35 + 1;
                                if (lVar35 < 0) {
                                  func_0x007a05dc();
                                  goto code_r0x0056a5ec;
                                }
                                *(undefined8 *)(unaff_x29 + -0xf8) = *puVar42;
                                in_stack_00000188 = pdVar57;
                                uStack0000000000000180 = pdVar49;
                                in_stack_00000198 = pdVar53;
                                in_stack_00000190 = pdVar52;
                                in_stack_000001a8 = pdVar55;
                                uStack00000000000001a0 = pdVar54;
                                in_stack_000001b8 = uVar56;
                                in_stack_000001b0 = uVar40;
                                func_0x0056b044(unaff_x29 + -0xa0,*(undefined8 *)(unaff_x20 + 0x20),
                                                *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,
                                                &uStack0000000000000180,
                                                auStack_7ffffffe + 0x8000020e);
                                in_stack_000003c0 = in_stack_00000210;
                                in_stack_000003c8 = pdVar24;
                                in_stack_000003d8 = pdVar17;
                                in_stack_000003e0 = in_stack_00000230;
                                in_stack_000003e8 = pdVar16;
                                in_stack_000003f0 = uVar23;
                                in_stack_000003f8 = uVar51;
                                if (*(long *)(unaff_x29 + -0xa0) == 0xc) {
                                  lVar35 = **(long **)(unaff_x29 + -0xf8);
                                  **(long **)(unaff_x29 + -0xf8) = lVar35 + -1;
                                  LORelease();
                                  if (lVar35 == 1) {
                                    func_0x005d2ac4(unaff_x29 + -0xf8);
                                  }
                                  bVar9 = false;
                                  in_stack_000003d0 = in_stack_00000220;
                                  if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
                                    func_0x005649d4(unaff_x29 + -0xa0);
                                  }
                                  goto code_r0x00569028;
                                }
                                lVar35 = **(long **)(unaff_x29 + -0xf8);
                                **(long **)(unaff_x29 + -0xf8) = lVar35 + 1;
                                uStack0000000000000180 = in_stack_00000400;
                                in_stack_00000188 = in_stack_00000408;
                                in_stack_00000190 = in_stack_00000410;
                                in_stack_00000198 = in_stack_00000418;
                                uStack00000000000001a0 = in_stack_00000420;
                                in_stack_000001a8 = in_stack_00000428;
                                in_stack_000001b0 = in_stack_00000430;
                                in_stack_000001b8 = in_stack_00000438;
                                if (lVar35 < 0) goto code_r0x0056a254;
                                uVar18 = *(undefined8 *)(unaff_x29 + -0xf8);
                                if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)dStack000000000000000c)
                                   || (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                         (ulong)dStack000000000000000c *
                                                         (unaff_x25 & 0xffffffff)),
                                      *plVar39 == -0x8000000000000000)) {
                                  func_0x007a23bc(&UNK_009ee878);
                                  goto code_r0x0056a5ec;
                                }
                                if (plVar39[2] == 0) {
                                  func_0x007a2570(0,0,&UNK_009ee890);
                                  goto code_r0x0056a5ec;
                                }
                                lVar35 = plVar39[1];
                                func_0x005649d4(lVar35 + 8);
                                *(undefined8 *)(lVar35 + 0x40) = uVar51;
                                *(undefined8 *)(lVar35 + 0x38) = uVar23;
                                *(dword **)(lVar35 + 0x30) = pdVar16;
                                *(dword **)(lVar35 + 0x28) = in_stack_00000230;
                                *(dword **)(lVar35 + 0x20) = pdVar17;
                                *(dword **)(lVar35 + 0x18) = in_stack_00000220;
                                *(undefined8 *)(lVar35 + 0x10) = uVar18;
                                *(undefined8 *)(lVar35 + 8) = 0;
                                lVar35 = **(long **)(unaff_x29 + -0xf8);
                                **(long **)(unaff_x29 + -0xf8) = lVar35 + 1;
                                if (lVar35 < 0) goto code_r0x0056a254;
                                pdVar24 = *(dword **)(unaff_x29 + -0xf8);
                                if ((*(ulong *)(unaff_x20 + 0x40) <= uVar26) ||
                                   (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                      uVar26 * (unaff_x25 & 0xffffffff)),
                                   *plVar39 == -0x8000000000000000)) {
                                  func_0x007a23bc(&UNK_009ee8a8);
                                  goto code_r0x0056a5ec;
                                }
                                if (plVar39[2] == 0) {
                                  func_0x007a2570(0,0,&UNK_009ee8c0);
                                  goto code_r0x0056a5ec;
                                }
                                lVar35 = plVar39[1];
                                func_0x005649d4(lVar35 + 8);
                                *(undefined8 *)(lVar35 + 0x40) = uVar51;
                                *(undefined8 *)(lVar35 + 0x38) = uVar23;
                                *(dword **)(lVar35 + 0x30) = pdVar16;
                                *(dword **)(lVar35 + 0x28) = in_stack_00000230;
                                *(dword **)(lVar35 + 0x20) = pdVar17;
                                *(dword **)(lVar35 + 0x18) = in_stack_00000220;
                                *(dword **)(lVar35 + 0x10) = pdVar24;
                                *(undefined8 *)(lVar35 + 8) = 0;
                                func_0x0056c050();
                                uVar21 = *(ulong *)(unaff_x20 + 0x28);
                                if ((uVar36 < uVar21) &&
                                   (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20),
                                   *plVar39 != -0x8000000000000000)) {
                                  uVar26 = (ulong)*(uint *)((long)plVar39 + 0x1c);
                                  uVar41 = *(ulong *)(unaff_x20 + 0x40);
                                }
                                else {
                                  uVar26 = 0xffffffff;
                                  uVar41 = *(ulong *)(unaff_x20 + 0x40);
                                }
                                if (uVar41 >> 0x20 != 0) goto code_r0x0056888c;
                                goto code_r0x00568770;
                              }
                              lVar10 = lVar35 + uVar30 * unaff_x25;
                              uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
                            } while (*(int *)(lVar10 + 0x28) == -1);
                          }
code_r0x00567ab4:
                          bVar6 = false;
                          lVar10 = *(long *)(in_stack_00000228 + 4);
                          pdVar47 = in_stack_00000228;
                          pdVar17 = in_stack_00000210;
joined_r0x00567fd4:
                          if (lVar10 == 0) {
                            if ((uVar21 < uVar25) &&
                               (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
                               *plVar39 != -0x8000000000000000)) {
                              uVar26 = (ulong)*(uint *)((long)plVar39 + 0x1c);
                              if (uVar1 >> 0x20 == 0) goto code_r0x00568028;
code_r0x00568004:
                              if (*(uint *)(lVar35 + 0x2ffffffff0) < uVar1) goto code_r0x00567ac0;
                            }
                            else {
                              uVar26 = 0xffffffff;
                              if (uVar1 >> 0x20 != 0) goto code_r0x00568004;
code_r0x00568028:
                              do {
                                if (uVar1 <= uVar26) goto code_r0x00567ac0;
                                lVar10 = lVar35 + uVar26 * unaff_x25;
                                uVar26 = (ulong)*(uint *)(lVar10 + 0x24);
                              } while (*(int *)(lVar10 + 0x28) == -1);
                              if (0xffffffff < uVar1) goto code_r0x00567ac0;
                            }
                            do {
                              if (uVar1 <= uVar26) {
                                lVar35 = *(long *)(in_stack_00000210 + 2);
                                lVar10 = *(long *)(in_stack_00000210 + 4);
                                uStack0000000000000180 = _UNK_009efac0;
                                in_stack_00000188 = _UNK_009efac8;
                                in_stack_00000190 = _UNK_009efad0;
                                in_stack_00000198 = _UNK_009efad8;
                                if (lVar10 != 0) {
                                  func_0x007a5f8c(&uStack0000000000000180,lVar10,
                                                  &uStack00000000000001a0,1);
                                }
                                func_0x00585744(lVar35,lVar35 + lVar10 * 0x48,
                                                &uStack0000000000000180);
                                in_stack_00000230 = in_stack_00000198;
                                pdVar47 = in_stack_00000190;
                                pdVar57 = in_stack_00000188;
                                pdVar24 = uStack0000000000000180;
                                pdVar17 = (dword *)CONCAT44(uVar48,uVar50);
                                func_0x0056b78c(&uStack0000000000000180);
                                puVar42 = _uStack00000000000001c0;
                                uVar56 = in_stack_000001b8;
                                uVar40 = in_stack_000001b0;
                                pdVar55 = in_stack_000001a8;
                                pdVar54 = uStack00000000000001a0;
                                pdVar53 = in_stack_00000198;
                                in_stack_00000220 = in_stack_00000190;
                                pdVar52 = in_stack_00000188;
                                pdVar49 = uStack0000000000000180;
                                lVar35 = *(long *)(unaff_x20 + 0x38);
                                uVar1 = *(ulong *)(unaff_x20 + 0x40);
                                uVar25 = *(ulong *)(unaff_x20 + 0x28);
                                if (uStack0000000000000180 == &MACH_HEADER.filetype) {
                                  bVar7 = true;
                                  in_stack_00000220 = pdVar57;
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
                                func_0x0055b13c(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                                                &UNK_009f0678);
                                if (*(long *)(unaff_x29 + -0x90) == 1) {
                                  uStack0000000000000008 =
                                       *(uint *)(*(long **)(unaff_x29 + -0x98) + 2);
                                  bVar9 = **(long **)(unaff_x29 + -0x98) == 0;
                                }
                                else {
                                  bVar9 = true;
                                }
                                if (*(long *)(unaff_x29 + -0xa0) != 0) {
                                  func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x98),
                                                  *(long *)(unaff_x29 + -0xa0) * 0x18,8);
                                }
                                if (bVar9) {
                                  func_0x007a23bc(&UNK_009ee938);
                                  goto code_r0x0056a5ec;
                                }
                                plVar39 = (long *)*puVar42;
                                lVar35 = *plVar39;
                                *plVar39 = lVar35 + 1;
                                if (lVar35 < 0) {
                                  func_0x007a05dc();
                                  goto code_r0x0056a5ec;
                                }
                                pdVar24 = (dword *)*puVar42;
                                func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                                                *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,
                                                unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                                bVar7 = *(long *)(unaff_x29 + -0xe0) == 0xc;
                                bVar9 = !bVar7;
                                in_stack_00000330 = in_stack_00000220;
                                if (bVar7) {
                                  lVar35 = *(long *)pdVar24;
                                  *(long *)pdVar24 = lVar35 + -1;
                                  LORelease();
                                  if (lVar35 == 1) {
                                    func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                                  }
                                  in_stack_00000210 = pdVar49;
                                  pdVar24 = pdVar52;
                                  pdVar17 = pdVar53;
                                  in_stack_00000230 = pdVar54;
                                  pdVar16 = pdVar55;
                                  uVar23 = uVar40;
                                  uVar51 = uVar56;
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
                                  goto code_r0x00569000;
                                }
                                lVar35 = *(long *)pdVar24;
                                *(long *)pdVar24 = lVar35 + 1;
                                if (lVar35 < 0) goto code_r0x0056a25c;
                                if ((*(ulong *)(unaff_x20 + 0x40) <= uVar41) ||
                                   (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                      uVar41 * (unaff_x25 & 0xffffffff)),
                                   *plVar39 == -0x8000000000000000)) {
                                  func_0x007a23bc(&UNK_009ee950);
                                  goto code_r0x0056a5ec;
                                }
                                if (plVar39[2] == 0) {
                                  func_0x007a2570(0,0,&UNK_009ee968);
                                  goto code_r0x0056a5ec;
                                }
                                lVar35 = plVar39[1];
                                func_0x005649d4(lVar35 + 8);
                                *(undefined8 *)(lVar35 + 0x40) = uVar56;
                                *(undefined8 *)(lVar35 + 0x38) = uVar40;
                                *(dword **)(lVar35 + 0x30) = pdVar55;
                                *(dword **)(lVar35 + 0x28) = pdVar54;
                                *(dword **)(lVar35 + 0x20) = pdVar53;
                                *(dword **)(lVar35 + 0x18) = in_stack_00000220;
                                *(dword **)(lVar35 + 0x10) = pdVar24;
                                *(undefined8 *)(lVar35 + 8) = 0;
                                lVar35 = *(long *)pdVar24;
                                *(long *)pdVar24 = lVar35 + 1;
                                if (lVar35 < 0) goto code_r0x0056a25c;
                                if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)uStack0000000000000008)
                                   || (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                         (ulong)uStack0000000000000008 *
                                                         (unaff_x25 & 0xffffffff)),
                                      *plVar39 == -0x8000000000000000)) {
                                  func_0x007a23bc(&UNK_009ee980);
                                  goto code_r0x0056a5ec;
                                }
                                if (plVar39[2] == 0) {
                                  func_0x007a2570(0,0,&UNK_009ee998);
                                  goto code_r0x0056a5ec;
                                }
                                lVar35 = plVar39[1];
                                func_0x005649d4(lVar35 + 8);
                                *(undefined8 *)(lVar35 + 0x40) = uVar56;
                                *(undefined8 *)(lVar35 + 0x38) = uVar40;
                                *(dword **)(lVar35 + 0x30) = pdVar55;
                                *(dword **)(lVar35 + 0x28) = pdVar54;
                                *(dword **)(lVar35 + 0x20) = pdVar53;
                                *(dword **)(lVar35 + 0x18) = in_stack_00000220;
                                *(dword **)(lVar35 + 0x10) = pdVar24;
                                *(undefined8 *)(lVar35 + 8) = 0;
                                func_0x0056c050();
                                uVar26 = *(ulong *)(unaff_x20 + 0x28);
                                if ((uVar21 < uVar26) &&
                                   (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
                                   *plVar39 != -0x8000000000000000)) {
                                  uVar36 = (ulong)*(uint *)((long)plVar39 + 0x1c);
                                  uVar41 = *(ulong *)(unaff_x20 + 0x40);
                                }
                                else {
                                  uVar36 = 0xffffffff;
                                  uVar41 = *(ulong *)(unaff_x20 + 0x40);
                                }
                                if (uVar41 >> 0x20 != 0) goto code_r0x005689cc;
                                goto code_r0x005687e4;
                              }
                              lVar10 = lVar35 + uVar26 * unaff_x25;
                              uVar26 = (ulong)*(uint *)(lVar10 + 0x24);
                            } while (*(int *)(lVar10 + 0x28) == -1);
                          }
code_r0x00567ac0:
                          bVar7 = false;
joined_r0x005680f4:
                          uVar26 = unaff_x28;
                          if ((uVar36 < uVar25) &&
                             (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20),
                             *plVar39 != -0x8000000000000000)) {
                            uVar41 = (ulong)*(uint *)((long)plVar39 + 0x1c);
                            if (uVar1 >> 0x20 == 0) goto code_r0x00567e40;
code_r0x00567aec:
                            if (uVar1 <= *(uint *)(lVar35 + 0x2ffffffff0)) {
code_r0x00567e64:
                              do {
                                if (uVar1 <= uVar41) {
                                  if ((uVar36 < uVar25) &&
                                     (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20
                                                        ), *plVar39 != -0x8000000000000000)) {
                                    uVar41 = (ulong)*(uint *)(plVar39 + 3);
                                    if (uVar1 <= uVar41) goto code_r0x00568148;
                                  }
                                  else {
                                    uVar41 = 0xffffffff;
                                    if (uVar1 < 0x100000000) {
code_r0x00568148:
                                      uVar30 = 0xffffffff;
                                      goto code_r0x0056814c;
                                    }
                                  }
                                  lVar10 = lVar35 + uVar41 * (unaff_x25 & 0xffffffff);
                                  uVar41 = (ulong)*(uint *)(lVar10 + 0x20);
                                  iVar13 = *(int *)(lVar10 + 0x2c);
                                  uVar30 = 0xffffffff;
                                  goto code_r0x00568164;
                                }
                                lVar10 = lVar35 + uVar41 * unaff_x25;
                                uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
                              } while (*(int *)(lVar10 + 0x28) == -1);
                            }
                          }
                          else {
                            uVar41 = 0xffffffff;
                            if (uVar1 >> 0x20 != 0) goto code_r0x00567aec;
code_r0x00567e40:
                            do {
                              if (uVar1 <= uVar41) goto code_r0x00568ec0;
                              lVar10 = lVar35 + uVar41 * unaff_x25;
                              uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
                            } while (*(int *)(lVar10 + 0x28) == -1);
                            if (uVar1 < 0x100000000) goto code_r0x00567e64;
                          }
                          goto code_r0x00568ec0;
                        }
                        pdVar49 = in_stack_00000360;
                        pdVar57 = in_stack_00000368;
                        pdVar52 = in_stack_00000370;
                        pdVar53 = in_stack_00000378;
                        pdVar54 = in_stack_00000380;
                        pdVar55 = in_stack_00000388;
                        uVar40 = in_stack_00000390;
                        uVar56 = in_stack_00000398;
                        if (*(long *)(in_stack_00000210 + 4) != 0) {
                          plVar22 = *(long **)(in_stack_00000210 + 2) +
                                    *(long *)(in_stack_00000210 + 4) * 9;
                          plVar39 = *(long **)(in_stack_00000210 + 2);
                          do {
                            plVar28 = plVar39 + 9;
                            plVar29 = (long *)*plVar39;
                            lVar35 = *(long *)(in_stack_00000228 + 4) * 0x48;
                            plVar37 = *(long **)(in_stack_00000228 + 2) + -8;
                            while (lVar35 != 0) {
                              plVar33 = plVar37 + 8;
                              plVar37 = plVar37 + 9;
                              lVar35 = lVar35 + -0x48;
                              if (plVar29 == (long *)*plVar33) goto code_r0x00567b28;
                            }
                            plVar39 = plVar28;
                          } while (plVar28 != plVar22);
                        }
code_r0x00567a98:
                        bVar9 = false;
                        pdVar16 = pdVar44;
                        uVar23 = uVar18;
                        uVar51 = uVar45;
                        goto code_r0x00569028;
                      }
                      goto code_r0x00569030;
                    }
                    puVar42 = (undefined8 *)(lVar35 + -0xe8);
                    puVar43 = (undefined8 *)(lVar35 + -0xe0);
                    if (puVar43 == (undefined8 *)0x0 || *(long *)(lVar35 + -0xe8) != 8) {
                      if (((puVar43 == (undefined8 *)0x0 || *(long *)(lVar35 + -0xe8) != 9) ||
                          (*(long *)*puVar43 != 6)) ||
                         (plVar39 = *(long **)(lVar35 + -0xd8), *plVar39 == 6))
                      goto code_r0x005679b4;
                      puVar14 = (undefined8 *)func_0x00187bd0(0x40,8);
                      if (puVar14 == (undefined8 *)0x0) goto code_r0x0056a134;
                      func_0x00566040(auStack_7ffffffe + 0x8000020e,plVar39);
                      puVar14[1] = pdVar24;
                      *puVar14 = in_stack_00000210;
                      puVar14[3] = in_stack_00000228;
                      puVar14[2] = in_stack_00000220;
                      puVar14[5] = pdVar44;
                      puVar14[4] = in_stack_00000230;
                      puVar14[7] = uVar45;
                      puVar14[6] = uVar18;
                      uStack00000000000000f8 = (dword *)puVar14[1];
                      uStack00000000000000f0 = (dword *)*puVar14;
                      in_stack_00000108 = (dword *)puVar14[3];
                      in_stack_00000100 = (dword *)puVar14[2];
                      in_stack_00000118 = (dword *)puVar14[5];
                      in_stack_00000110 = (dword *)puVar14[4];
                      in_stack_00000128 = puVar14[7];
                      in_stack_00000120 = puVar14[6];
                      uVar40 = *puVar43;
                      puVar15 = (undefined8 *)func_0x00187bd0(0x40,8);
                      if (puVar15 != (undefined8 *)0x0) {
                        func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar40);
                        puVar15[1] = pdVar24;
                        *puVar15 = in_stack_00000210;
                        puVar15[3] = in_stack_00000228;
                        puVar15[2] = in_stack_00000220;
                        puVar15[5] = pdVar44;
                        puVar15[4] = in_stack_00000230;
                        puVar15[7] = uVar45;
                        puVar15[6] = uVar18;
                        in_stack_00000188 = (dword *)puVar15[1];
                        uStack0000000000000180 = (dword *)*puVar15;
                        in_stack_00000198 = (dword *)puVar15[3];
                        in_stack_00000190 = (dword *)puVar15[2];
                        in_stack_000001a8 = (dword *)puVar15[5];
                        uStack00000000000001a0 = (dword *)puVar15[4];
                        in_stack_000001b8 = puVar15[7];
                        in_stack_000001b0 = puVar15[6];
                        uVar48 = *(byte *)(lVar35 + -0xd0) - 7;
                        if (uVar48 < 6) {
                          func_0x005c1d84(unaff_x29 + -0xa0,&uStack00000000000000f0,
                                          &uStack0000000000000180,
                                          0xb0c090a0807 >> (((ulong)uVar48 & 7) << 3));
                          *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x90);
                          func_0x005649d4(puVar42);
                          *puVar42 = 9;
                          *(dword **)(lVar35 + -0xd8) = in_stack_00000408;
                          *puVar43 = in_stack_00000400;
                          *(undefined8 *)(lVar35 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xd0);
                          func_0x00187bd4(puVar15,0x40,8);
                          func_0x00187bd4(puVar14,0x40,8);
                          unaff_w27 = 1;
                          uVar21 = *(ulong *)(unaff_x20 + 0x28);
                          in_stack_000003c0 = in_stack_00000400;
                          in_stack_000003c8 = in_stack_00000408;
                          goto joined_r0x005679bc;
                        }
                        func_0x005649d4(&uStack0000000000000180);
                        func_0x005649d4(&uStack00000000000000f0);
                        func_0x00187bd4(puVar15,0x40,8);
                        func_0x00187bd4(puVar14,0x40,8);
                        uVar21 = *(ulong *)(unaff_x20 + 0x28);
                        if (uVar34 < uVar21) goto code_r0x005679c0;
code_r0x0056a270:
                        puVar19 = &UNK_009ee830;
                        goto code_r0x0056a0b0;
                      }
                      func_0x007a1f18(8,0x40);
                    }
                    else {
                      if (*(char *)(lVar35 + -0xd8) != '\0') goto code_r0x005679b4;
                      uVar40 = *puVar43;
                      puVar43 = (undefined8 *)func_0x00187bd0(0x40,8);
                      if (puVar43 == (undefined8 *)0x0) {
code_r0x0056a134:
                        func_0x007a1f18(8,0x40);
                      }
                      else {
                        func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar40);
                        puVar43[1] = pdVar24;
                        *puVar43 = in_stack_00000210;
                        puVar43[3] = in_stack_00000228;
                        puVar43[2] = in_stack_00000220;
                        puVar43[5] = pdVar44;
                        puVar43[4] = in_stack_00000230;
                        puVar43[7] = uVar45;
                        puVar43[6] = uVar18;
                        pdVar24 = (dword *)puVar43[1];
                        in_stack_00000210 = (dword *)*puVar43;
                        in_stack_00000228 = (dword *)puVar43[3];
                        in_stack_00000220 = (dword *)puVar43[2];
                        pdVar44 = (dword *)puVar43[5];
                        in_stack_00000230 = (dword *)puVar43[4];
                        uVar45 = puVar43[7];
                        uVar18 = puVar43[6];
                        func_0x005649d4(puVar42);
                        *(dword **)(lVar35 + -0xe0) = pdVar24;
                        *puVar42 = in_stack_00000210;
                        *(dword **)(lVar35 + -0xd0) = in_stack_00000228;
                        *(dword **)(lVar35 + -0xd8) = in_stack_00000220;
                        *(dword **)(lVar35 + -0xc0) = pdVar44;
                        *(dword **)(lVar35 + -200) = in_stack_00000230;
                        *(undefined8 *)(lVar35 + -0xb0) = uVar45;
                        *(undefined8 *)(lVar35 + -0xb8) = uVar18;
                        func_0x00187bd4(puVar43,0x40,8);
                        func_0x00584d50(auStack_7ffffffe + 0x8000020e);
                        if (in_stack_00000210 == (dword *)0x0) {
                          puVar19 = &UNK_009ee5d8;
                          goto code_r0x0056a0b0;
                        }
                        if ((int)in_stack_00000220 == (int)pdVar44) {
                          func_0x007a247c(&UNK_008ade0c,0x54,&UNK_009f1480);
                        }
                        else {
                          if (((ulong)in_stack_00000220 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)
                             ) {
                            plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                              ((ulong)in_stack_00000220 & 0xffffffff) *
                                              (unaff_x25 & 0xffffffff));
                            if (*plVar39 != -0x8000000000000000) {
                              if ((((ulong)pdVar44 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) &&
                                 (plVar22 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                                    ((ulong)pdVar44 & 0xffffffff) *
                                                    (unaff_x25 & 0xffffffff)),
                                 *plVar22 != -0x8000000000000000)) {
                                *(undefined1 *)(plVar39 + 3) = 2;
                                unaff_w27 = 1;
                                *(undefined1 *)(plVar22 + 3) = 1;
                                goto code_r0x005679b4;
                              }
                              in_stack_00000038 = &UNK_009f14b0;
                            }
                          }
                          func_0x007a23bc(in_stack_00000038);
                        }
                      }
                    }
                    goto code_r0x0056a5ec;
                  }
                  in_stack_00000070 = &UNK_009ee7a0;
                }
                else {
code_r0x00569860:
                  if ((lVar35 != 0) && (lVar11 = lVar11 + lVar35 * 0x108, lVar11 != 0x108)) {
                    puVar42 = (undefined8 *)(lVar11 + -0xe8);
                    if (*(long *)(lVar11 + -0xf0) == 0x10 && puVar42 != (undefined8 *)0x0) {
                      func_0x00566040(auStack_7ffffffe + 0x8000020e,puVar42);
                      func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
                      func_0x005cb1c8(auStack_7ffffffe + 0x8000020e);
                      func_0x005649d4(puVar42);
                      *(dword **)(lVar11 + -0xe0) = pdVar17;
                      *puVar42 = pdVar24;
                      *(dword **)(lVar11 + -0xd0) = pdVar49;
                      *(dword **)(lVar11 + -0xd8) = pdVar47;
                      *(dword **)(lVar11 + -0xc0) = pdVar44;
                      *(dword **)(lVar11 + -200) = in_stack_00000230;
                      *(undefined8 *)(lVar11 + -0xb0) = uVar45;
                      *(undefined8 *)(lVar11 + -0xb8) = uVar18;
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
        puVar19 = &UNK_009ee6f8;
      }
    }
    else {
      puVar19 = &UNK_009ee6b0;
    }
    func_0x007a23bc(puVar19);
  }
  else {
    puVar20 = &UNK_009ee7b8;
    puVar19 = &UNK_008abf8a;
    uVar18 = 0x2e;
code_r0x0056a11c:
    func_0x007a247c(puVar19,uVar18,puVar20);
  }
code_r0x0056a5ec:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x56a5f0);
  (*pcVar5)();
code_r0x00568770:
  if (uVar26 < uVar41) goto code_r0x00568778;
  func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar36);
  pdVar44 = (dword *)((long)in_stack_00000220 + 1);
  pdVar17 = pdVar24;
  while (pdVar44 = (dword *)((long)pdVar44 + -1), pdVar44 != (dword *)0x0) {
    func_0x00554164(pdVar17);
    pdVar17 = pdVar17 + 0x42;
  }
  uVar21 = *(ulong *)(unaff_x20 + 0x28);
code_r0x0056888c:
  if ((uVar21 <= uVar34) ||
     (puVar38 = (ulong *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
     *puVar38 == 0x8000000000000000)) {
code_r0x0056a2c4:
    func_0x007a23bc(in_stack_00000060);
    goto code_r0x0056a5ec;
  }
  if ((puVar38[2] == 0) || (lVar35 = puVar38[1] + puVar38[2] * 0x108, lVar35 == 0x108)) {
    in_stack_00000060 = &UNK_009ee8f0;
    goto code_r0x0056a2c4;
  }
  if (lVar35 == 0xe8 || *(long *)(lVar35 + -0xf0) != 0x10) {
    in_stack_00000060 = &UNK_009ee908;
    goto code_r0x0056a2c4;
  }
  lVar10 = **(long **)(unaff_x29 + -0xf8);
  **(long **)(unaff_x29 + -0xf8) = lVar10 + 1;
  if (lVar10 < 0) {
code_r0x0056a254:
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  uVar18 = *(undefined8 *)(unaff_x29 + -0xf8);
  func_0x005649d4();
  *(undefined8 *)(lVar35 + -0xe8) = 0;
  *(undefined8 *)(lVar35 + -0xe0) = uVar18;
  uVar21 = puVar38[2];
  pdVar16 = (dword *)func_0x00187bd0(0x18,8);
  if (pdVar16 == (dword *)0x0) {
    func_0x007a1f18(8,0x18);
    goto code_r0x0056a5ec;
  }
  uVar18 = *(undefined8 *)(unaff_x29 + -0xf8);
  *(undefined8 *)pdVar16 = 0x8000000000000000;
  *(undefined8 *)(pdVar16 + 2) = uVar18;
  in_stack_00000320 = (dword *)((long)&MACH_HEADER.magic + 1);
  in_stack_00000330 = (dword *)((long)&MACH_HEADER.magic + 1);
  in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (in_stack_00000250 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    goto code_r0x0056a5ec;
  }
  uVar21 = uVar21 - 1;
  in_stack_00000250[1] = in_stack_00000408;
  *in_stack_00000250 = in_stack_00000400;
  in_stack_00000250[3] = in_stack_00000418;
  in_stack_00000250[2] = in_stack_00000410;
  in_stack_00000250[5] = in_stack_00000428;
  in_stack_00000250[4] = in_stack_00000420;
  in_stack_00000250[7] = in_stack_00000438;
  in_stack_00000250[6] = in_stack_00000430;
  uVar26 = puVar38[2];
  if (uVar26 < uVar21) {
    func_0x007a204c(uVar21,uVar26,&UNK_009ee920);
    goto code_r0x0056a5ec;
  }
  in_stack_00000328 = pdVar16;
  if (uVar26 == *puVar38) {
    func_0x005bd0a4(puVar38,&UNK_009ee920);
  }
  goto code_r0x00567da8;
code_r0x00568778:
  lVar35 = *(long *)(unaff_x20 + 0x38) + uVar26 * unaff_x25;
  uVar26 = (ulong)*(uint *)(lVar35 + 0x24);
  if (*(int *)(lVar35 + 0x28) != -1) goto code_r0x0056888c;
  goto code_r0x00568770;
code_r0x005687e4:
  if (uVar36 < uVar41) goto code_r0x005687ec;
  func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar21);
  pdVar44 = (dword *)((long)in_stack_00000220 + 1);
  pdVar17 = pdVar24;
  while (pdVar44 = (dword *)((long)pdVar44 + -1), pdVar44 != (dword *)0x0) {
    func_0x00554164(pdVar17);
    pdVar17 = pdVar17 + 0x42;
  }
  uVar26 = *(ulong *)(unaff_x20 + 0x28);
code_r0x005689cc:
  if ((uVar26 <= uVar34) ||
     (puVar38 = (ulong *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
     *puVar38 == 0x8000000000000000)) {
code_r0x0056a314:
    func_0x007a23bc(in_stack_00000058);
    goto code_r0x0056a5ec;
  }
  if ((puVar38[2] == 0) || (lVar35 = puVar38[1] + puVar38[2] * 0x108, lVar35 == 0x108)) {
    in_stack_00000058 = &UNK_009ee9c8;
    goto code_r0x0056a314;
  }
  if (lVar35 == 0xe8 || *(long *)(lVar35 + -0xf0) != 0x10) {
    in_stack_00000058 = &UNK_009ee9e0;
    goto code_r0x0056a314;
  }
  lVar10 = *(long *)pdVar24;
  *(long *)pdVar24 = lVar10 + 1;
  if (lVar10 < 0) {
code_r0x0056a25c:
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  func_0x005649d4();
  *(undefined8 *)(lVar35 + -0xe8) = 0;
  *(dword **)(lVar35 + -0xe0) = pdVar24;
  uVar21 = puVar38[2];
  puVar42 = (undefined8 *)func_0x00187bd0(0x18,8);
  if (puVar42 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
    goto code_r0x0056a5ec;
  }
  *puVar42 = 0x8000000000000000;
  puVar42[1] = pdVar24;
  *(undefined8 *)(unaff_x29 + -0xf8) = 1;
  *(undefined8 **)(unaff_x29 + -0xf0) = puVar42;
  *(undefined8 *)(unaff_x29 + -0xe8) = 1;
  in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (in_stack_00000250 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    goto code_r0x0056a5ec;
  }
  uVar21 = uVar21 - 1;
  in_stack_00000250[1] = in_stack_000003c8;
  *in_stack_00000250 = in_stack_000003c0;
  in_stack_00000250[3] = in_stack_000003d8;
  in_stack_00000250[2] = in_stack_000003d0;
  in_stack_00000250[5] = in_stack_000003e8;
  in_stack_00000250[4] = in_stack_000003e0;
  in_stack_00000250[7] = in_stack_000003f8;
  in_stack_00000250[6] = in_stack_000003f0;
  pdVar16 = *(dword **)(unaff_x29 + -0xf0);
  in_stack_00000230 = *(dword **)(unaff_x29 + -0xf8);
  uVar23 = *(undefined8 *)(unaff_x29 + -0xe8);
  uVar26 = puVar38[2];
  if (uVar26 < uVar21) {
    func_0x007a204c(uVar21,uVar26,&UNK_009ee9f8);
    goto code_r0x0056a5ec;
  }
  if (uVar26 == *puVar38) {
    func_0x005bd0a4(puVar38,&UNK_009ee9f8);
  }
  lVar35 = puVar38[1] + uVar21 * 0x108;
  if (uVar21 <= uVar26 && uVar26 - uVar21 != 0) {
    _memmove(lVar35 + 0x108,lVar35,(uVar26 - uVar21) * 0x108);
  }
  _memcpy(lVar35,auStack_7ffffffe + 0x8000020e,0x108);
  puVar38[2] = uVar26 + 1;
  in_stack_00000210 = (dword *)0x0;
  pdVar17 = (dword *)((long)&MACH_HEADER.filetype + 3);
  uVar51 = 1;
  in_stack_00000400 = in_stack_000003c0;
  in_stack_00000408 = in_stack_000003c8;
  in_stack_00000410 = in_stack_000003d0;
  in_stack_00000418 = in_stack_000003d8;
  in_stack_00000420 = in_stack_000003e0;
  in_stack_00000428 = in_stack_000003e8;
  in_stack_00000430 = in_stack_000003f0;
  in_stack_00000438 = in_stack_000003f8;
  goto code_r0x00569000;
code_r0x005687ec:
  lVar35 = *(long *)(unaff_x20 + 0x38) + uVar36 * unaff_x25;
  uVar36 = (ulong)*(uint *)(lVar35 + 0x24);
  if (*(int *)(lVar35 + 0x28) != -1) goto code_r0x005689cc;
  goto code_r0x005687e4;
  while( true ) {
    lVar10 = lVar35 + uVar30 * unaff_x25;
    uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
    iVar13 = *(int *)(lVar10 + 0x28);
    if (iVar13 != -1) break;
code_r0x0056814c:
    if (uVar1 <= uVar30) goto code_r0x00568ec0;
  }
code_r0x00568164:
  if (uVar1 <= uVar41) {
    do {
      if (uVar1 <= uVar30) {
        if (uVar21 < uVar25) {
          plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20);
          if (*plVar39 == -0x8000000000000000) {
            uVar41 = 0xffffffff;
          }
          else {
            uVar41 = (ulong)*(uint *)((long)plVar39 + 0x1c);
          }
        }
        else {
          uVar41 = 0xffffffff;
        }
        goto code_r0x00568724;
      }
      lVar10 = lVar35 + uVar30 * unaff_x25;
      uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
    } while (*(int *)(lVar10 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while (lVar10 = lVar35 + uVar41 * unaff_x25, uVar41 = (ulong)*(uint *)(lVar10 + 0x24),
        *(int *)(lVar10 + 0x28) == -1) {
code_r0x00568724:
    if (uVar1 <= uVar41) goto code_r0x00568ec0;
  }
  if (uVar1 >> 0x20 == 0) {
    do {
      if (uVar1 <= uVar41) {
        if ((uVar21 < uVar25) &&
           (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
           *plVar39 != -0x8000000000000000)) {
          uVar41 = (ulong)*(uint *)(plVar39 + 3);
        }
        else {
          uVar41 = 0xffffffff;
        }
        if (uVar41 < uVar1) {
          lVar10 = lVar35 + uVar41 * (unaff_x25 & 0xffffffff);
          uVar41 = (ulong)*(uint *)(lVar10 + 0x20);
          iVar32 = *(int *)(lVar10 + 0x2c);
          uVar30 = 0xffffffff;
          goto code_r0x00568b68;
        }
        uVar30 = 0xffffffff;
        goto code_r0x00568b50;
      }
      lVar10 = lVar35 + uVar41 * unaff_x25;
      uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
    } while (*(int *)(lVar10 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while( true ) {
    lVar10 = lVar35 + uVar30 * unaff_x25;
    uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
    iVar32 = *(int *)(lVar10 + 0x28);
    if (iVar32 != -1) break;
code_r0x00568b50:
    if (uVar1 <= uVar30) goto code_r0x00568ec0;
  }
code_r0x00568b68:
  if (uVar1 <= uVar41) {
    do {
      if (uVar1 <= uVar30) {
        if (iVar13 == iVar32) {
          if (uVar25 <= uVar36) goto code_r0x0056a4d0;
          lVar10 = *(long *)(unaff_x20 + 0x20);
          plVar39 = (long *)(lVar10 + uVar36 * 0x20);
          if (*plVar39 == -0x8000000000000000) goto code_r0x0056a4d0;
          if ((((plVar39[2] != 1) || (lVar11 = plVar39[1], *(long *)(lVar11 + 0x18) != 0xf)) ||
              (*(long *)(lVar11 + 0x30) != 1)) || (*(long *)(lVar11 + 0x48) != 1))
          goto code_r0x00568f3c;
          if ((uVar25 <= uVar21) ||
             (plVar39 = (long *)(lVar10 + uVar21 * 0x20), *plVar39 == -0x8000000000000000)) {
            in_stack_00000030 = &UNK_009eea28;
            goto code_r0x0056a4d0;
          }
          if (((((plVar39[2] != 1) || (lVar31 = plVar39[1], *(long *)(lVar31 + 0x18) != 0xf)) ||
               ((*(long *)(lVar31 + 0x30) != 1 ||
                (((*(long *)(lVar31 + 0x48) != 1 || (*(long *)(in_stack_00000210 + 4) != 1)) ||
                 (puVar42 = *(undefined8 **)(in_stack_00000210 + 2), puVar42[1] != 0)))))) ||
              ((*(long *)(in_stack_00000228 + 4) != 1 ||
               (puVar43 = *(undefined8 **)(in_stack_00000228 + 2), puVar43[1] != 0)))) ||
             ((plVar39 = (long *)*puVar42, plVar39 != (long *)*puVar43 ||
              (((**(long **)(lVar11 + 0x28) != -0x8000000000000000 ||
                ((*(long **)(lVar11 + 0x28))[1] != puVar42[2])) ||
               (**(long **)(lVar31 + 0x28) != -0x8000000000000000)))))) {
            uVar26 = unaff_x28 & 0xffffffff;
            goto code_r0x00568f3c;
          }
          uVar26 = unaff_x28 & 0xffffffff;
          if ((*(long **)(lVar31 + 0x28))[1] != puVar43[2]) goto code_r0x00568f3c;
          lVar35 = *plVar39;
          *plVar39 = lVar35 + 1;
          if (lVar35 < 0) {
            func_0x007a05dc();
            goto code_r0x0056a5ec;
          }
          pdVar24 = (dword *)*puVar42;
          if (*(long *)(lVar11 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea40);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar11 + 0x40));
          if (*(long *)(lVar31 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea58);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000035e,*(undefined8 *)(lVar31 + 0x40));
          func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
          if (pdVar17 != (dword *)0x0) {
            func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
            if (pdVar17 != (dword *)0x0) {
              func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x28 & 0xffffffff,
                              unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
              bVar8 = *(long *)(unaff_x29 + -0xe0) == 0xc;
              bVar9 = !bVar8;
              if (bVar8) {
                lVar35 = *(long *)pdVar24;
                *(long *)pdVar24 = lVar35 + -1;
                LORelease();
                if (lVar35 == 1) {
                  func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                }
                pdVar17 = in_stack_00000360;
                pdVar24 = in_stack_00000368;
                pdVar47 = in_stack_00000378;
                in_stack_00000230 = in_stack_00000380;
                pdVar44 = in_stack_00000388;
                uVar18 = in_stack_00000390;
                uVar45 = in_stack_00000398;
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
              lVar35 = *(long *)pdVar24;
              *(long *)pdVar24 = lVar35 + 1;
              if (lVar35 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)in_stack_00000220 & 0xffffffff)) ||
                 (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)in_stack_00000220 & 0xffffffff) *
                                    (unaff_x25 & 0xffffffff)), *plVar39 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eeaa0);
                goto code_r0x0056a5ec;
              }
              if (plVar39[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeab8);
                goto code_r0x0056a5ec;
              }
              lVar35 = plVar39[1];
              func_0x005649d4(lVar35 + 8);
              *(undefined8 *)(lVar35 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar35 + 0x38) = in_stack_00000390;
              *(dword **)(lVar35 + 0x30) = in_stack_00000388;
              *(dword **)(lVar35 + 0x28) = in_stack_00000380;
              *(dword **)(lVar35 + 0x20) = in_stack_00000378;
              *(dword **)(lVar35 + 0x18) = in_stack_00000370;
              *(dword **)(lVar35 + 0x10) = pdVar24;
              *(undefined8 *)(lVar35 + 8) = 0;
              lVar35 = *(long *)pdVar24;
              *(long *)pdVar24 = lVar35 + 1;
              if (lVar35 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)in_stack_00000220 & 0xffffffff)) ||
                 (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)in_stack_00000220 & 0xffffffff) *
                                    (unaff_x25 & 0xffffffff)), *plVar39 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eead0);
                goto code_r0x0056a5ec;
              }
              if (plVar39[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeae8);
                goto code_r0x0056a5ec;
              }
              lVar35 = plVar39[1];
              func_0x005649d4(lVar35 + 8);
              *(undefined8 *)(lVar35 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar35 + 0x38) = in_stack_00000390;
              *(dword **)(lVar35 + 0x30) = in_stack_00000388;
              *(dword **)(lVar35 + 0x28) = in_stack_00000380;
              *(dword **)(lVar35 + 0x20) = in_stack_00000378;
              *(dword **)(lVar35 + 0x18) = in_stack_00000370;
              *(dword **)(lVar35 + 0x10) = pdVar24;
              *(undefined8 *)(lVar35 + 8) = 0;
              func_0x0056c050();
              if ((uVar36 < *(ulong *)(unaff_x20 + 0x28)) &&
                 (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20),
                 *plVar39 != -0x8000000000000000)) {
                uVar26 = (ulong)*(uint *)((long)plVar39 + 0x1c);
              }
              else {
                uVar26 = 0xffffffff;
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
      lVar10 = lVar35 + uVar30 * unaff_x25;
      uVar30 = (ulong)*(uint *)(lVar10 + 0x24);
    } while (*(int *)(lVar10 + 0x28) == -1);
  }
code_r0x00568ec0:
  if ((uVar36 < uVar25) &&
     (lVar10 = *(long *)(unaff_x20 + 0x20), *(long *)(lVar10 + uVar36 * 0x20) != -0x8000000000000000
     )) {
code_r0x00568f3c:
    uVar41 = (ulong)*(uint *)(lVar10 + uVar36 * 0x20 + 0x1c);
    if (uVar1 >> 0x20 == 0) goto code_r0x00568f4c;
code_r0x00568ee4:
    if (uVar1 <= *(uint *)(lVar35 + 0x2ffffffff0)) {
code_r0x00568f70:
      do {
        if (uVar1 <= uVar41) {
          if (uVar21 < uVar25) {
            plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20);
            if (*plVar39 == -0x8000000000000000) {
              uVar41 = 0xffffffff;
            }
            else {
              uVar41 = (ulong)*(uint *)((long)plVar39 + 0x1c);
            }
          }
          else {
            uVar41 = 0xffffffff;
          }
          goto code_r0x00568fc0;
        }
        lVar10 = lVar35 + uVar41 * unaff_x25;
        uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
      } while (*(int *)(lVar10 + 0x28) == -1);
    }
  }
  else {
    uVar41 = 0xffffffff;
    if (uVar1 >> 0x20 != 0) goto code_r0x00568ee4;
code_r0x00568f4c:
    do {
      if (uVar1 <= uVar41) goto code_r0x00568fdc;
      lVar10 = lVar35 + uVar41 * unaff_x25;
      uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
    } while (*(int *)(lVar10 + 0x28) == -1);
    if (uVar1 < 0x100000000) goto code_r0x00568f70;
  }
code_r0x00568fdc:
  bVar9 = false;
code_r0x00568fe0:
  bVar8 = false;
  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
    bVar8 = bVar7;
  }
  unaff_x28 = uVar26;
  in_stack_00000210 = pdVar17;
  pdVar17 = pdVar47;
  pdVar16 = pdVar44;
  uVar23 = uVar18;
  uVar51 = uVar45;
  pdVar49 = in_stack_00000320;
  pdVar52 = in_stack_00000328;
  pdVar53 = in_stack_00000338;
  pdVar54 = in_stack_00000340;
  pdVar55 = in_stack_00000348;
  uVar40 = in_stack_00000350;
  uVar56 = in_stack_00000358;
  if (bVar8) {
    func_0x005649d4(&uStack0000000000000180);
    func_0x005649d4(in_stack_00000080);
  }
code_r0x00569000:
  bVar7 = false;
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    bVar7 = bVar6;
  }
  in_stack_00000320 = pdVar49;
  in_stack_00000328 = pdVar52;
  in_stack_00000338 = pdVar53;
  in_stack_00000340 = pdVar54;
  in_stack_00000348 = pdVar55;
  in_stack_00000350 = uVar40;
  in_stack_00000358 = uVar56;
  pdVar49 = in_stack_00000360;
  pdVar57 = in_stack_00000368;
  pdVar52 = in_stack_00000370;
  pdVar53 = in_stack_00000378;
  pdVar54 = in_stack_00000380;
  pdVar55 = in_stack_00000388;
  uVar40 = in_stack_00000390;
  uVar56 = in_stack_00000398;
  if (bVar7) {
    func_0x005649d4(&uStack00000000000000f0);
    func_0x005649d4(&uStack0000000000000138);
  }
code_r0x00569028:
  unaff_w27 = bVar9 | unaff_w27;
  uVar21 = *(ulong *)(unaff_x20 + 0x28);
  pdVar47 = in_stack_00000210;
  pdVar44 = pdVar16;
  uVar18 = uVar23;
  uVar45 = uVar51;
  in_stack_00000360 = pdVar49;
  in_stack_00000368 = pdVar57;
  in_stack_00000370 = pdVar52;
  in_stack_00000378 = pdVar53;
  in_stack_00000380 = pdVar54;
  in_stack_00000388 = pdVar55;
  in_stack_00000390 = uVar40;
  in_stack_00000398 = uVar56;
code_r0x00569030:
  unaff_x26 = (undefined8 *)0x8000000000000000;
  if ((uVar21 <= uVar34) ||
     (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
     *plVar39 == -0x8000000000000000)) {
    puVar19 = &UNK_009ee5f0;
code_r0x0056a0b0:
    func_0x007a23bc(puVar19);
    goto code_r0x0056a5ec;
  }
  in_stack_00000210 = pdVar47;
  in_stack_00000228 = pdVar17;
  if (plVar39[2] != 0) {
    lVar35 = plVar39[1] + plVar39[2] * 0x108;
    if ((lVar35 != 0x108) && (*(long *)(lVar35 + -0xf0) == 0x10)) {
      func_0x00566040(auStack_7ffffffe + 0x8000031e,lVar35 + -0xe8);
      func_0x00584d50(auStack_7ffffffe + 0x8000020e);
      if (pdVar47 == (dword *)0x0) {
        func_0x007a23bc(&UNK_009ee608);
        goto code_r0x0056a5ec;
      }
      in_stack_00000088 = (ulong)pdVar24 >> 0x20;
      uVar34 = *(ulong *)(unaff_x20 + 0x28);
      if ((in_stack_00000088 < uVar34) &&
         (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
         *plVar39 != -0x8000000000000000)) {
        uVar21 = (ulong)*(uint *)((long)plVar39 + 0x1c);
      }
      else {
        uVar21 = 0xffffffff;
      }
      lVar10 = 0;
      uVar48 = (uint)((ulong)in_stack_00000230 >> 0x20);
      unaff_x24 = (ulong)uVar48;
      uVar36 = 0xffffffff;
      lVar35 = *(long *)(unaff_x20 + 0x38);
      uVar26 = *(ulong *)(unaff_x20 + 0x40);
      if (0xffffffff < uVar26) goto code_r0x00569138;
      while (uVar21 < uVar26) {
        lVar11 = lVar35 + uVar21 * unaff_x25;
        uVar21 = (ulong)*(uint *)(lVar11 + 0x24);
        if (*(int *)(lVar11 + 0x28) != -1) {
          for (; lVar10 = lVar10 + 1, uVar36 < uVar26;
              uVar36 = (ulong)*(uint *)(lVar35 + uVar36 * unaff_x25 + 0x20)) {
code_r0x00569138:
          }
        }
      }
      iVar13 = (int)((ulong)pdVar24 >> 0x20);
      if ((lVar10 == 1) && (*(long *)(pdVar47 + 4) == 0)) {
        lVar35 = *(long *)(pdVar17 + 2);
        lVar10 = *(long *)(pdVar17 + 4);
        in_stack_00000188 = _UNK_009efac8;
        uStack0000000000000180 = _UNK_009efac0;
        in_stack_00000198 = _UNK_009efad8;
        in_stack_00000190 = _UNK_009efad0;
        if (lVar10 != 0) {
          func_0x007a5f8c(&uStack0000000000000180,lVar10,&uStack00000000000001a0,1);
        }
        func_0x00585744(lVar35,lVar35 + lVar10 * 0x48,&uStack0000000000000180);
        pdVar54 = in_stack_00000198;
        pdVar52 = in_stack_00000190;
        pdVar57 = in_stack_00000188;
        pdVar24 = uStack0000000000000180;
        pdVar49 = (dword *)CONCAT44(uVar48,iVar13);
        func_0x00567190(&uStack0000000000000180);
        in_stack_00000248 = in_stack_000001b8;
        in_stack_00000240 = in_stack_000001b0;
        in_stack_00000238 = in_stack_000001a8;
        in_stack_00000230 = uStack00000000000001a0;
        in_stack_00000228 = in_stack_00000198;
        in_stack_00000220 = in_stack_00000190;
        in_stack_00000218 = in_stack_00000188;
        in_stack_00000210 = uStack0000000000000180;
        if (uStack0000000000000180 != &MACH_HEADER.filetype) {
          unaff_w19 = uStack00000000000001c0;
          func_0x00584d50(auStack_7ffffffe + 0x8000020e);
          unaff_x26 = (undefined8 *)0x8000000000000000;
          if (pdVar49 == (dword *)0x0) {
            func_0x007a23bc(&UNK_009ee620);
            goto code_r0x0056a5ec;
          }
          in_stack_000003c0 = in_stack_00000210;
          in_stack_000003c8 = in_stack_00000218;
          in_stack_000003d0 = in_stack_00000220;
          in_stack_000003d8 = in_stack_00000228;
          in_stack_000003e0 = in_stack_00000230;
          in_stack_000003e8 = in_stack_00000238;
          in_stack_000003f0 = in_stack_00000240;
          in_stack_000003f8 = in_stack_00000248;
          if ((uint)((ulong)pdVar24 >> 0x20) == uVar48) {
            uVar18 = func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
            *(undefined1 *)(unaff_x29 + -0x90) = extraout_w1;
            *(undefined8 *)(unaff_x29 + -0xa0) = 8;
            *(undefined8 *)(unaff_x29 + -0x98) = uVar18;
            param_1 = &uStack00000000000000f0;
            goto code_r0x0056942c;
          }
          func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                          0xd);
          uStack0000000000000138._5_1_ = 0;
          in_stack_00000400 = in_stack_00000320;
          in_stack_00000408 = in_stack_00000328;
          in_stack_00000410 = in_stack_00000330;
          in_stack_00000418 = in_stack_00000338;
          in_stack_00000420 = in_stack_00000340;
          in_stack_00000428 = in_stack_00000348;
          in_stack_00000430 = in_stack_00000350;
          in_stack_00000438 = in_stack_00000358;
          goto LAB_00569a44;
        }
        lVar35 = *(long *)(unaff_x20 + 0x38);
        uVar26 = *(ulong *)(unaff_x20 + 0x40);
        bVar6 = true;
        uVar34 = *(ulong *)(unaff_x20 + 0x28);
        in_stack_00000210 = _UNK_009efac0;
        in_stack_00000218 = _UNK_009efac8;
        pdVar53 = _UNK_009efad0;
        in_stack_00000228 = _UNK_009efad8;
        in_stack_00000230 = pdVar54;
      }
      else {
        bVar6 = false;
        in_stack_00000210 = _UNK_009efac0;
        in_stack_00000218 = _UNK_009efac8;
        pdVar53 = _UNK_009efad0;
        in_stack_00000228 = _UNK_009efad8;
        pdVar49 = pdVar47;
        pdVar57 = in_stack_00000220;
        pdVar52 = pdVar17;
      }
      in_stack_00000220 = pdVar53;
      if (unaff_x24 < uVar34) {
        plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x24 * 0x20);
        if (*plVar39 == -0x8000000000000000) {
          uVar34 = 0xffffffff;
        }
        else {
          uVar34 = (ulong)*(uint *)((long)plVar39 + 0x1c);
        }
      }
      else {
        uVar34 = 0xffffffff;
      }
      uVar21 = 0xffffffff;
      lVar10 = 0;
      if (uVar26 < 0x100000000) goto code_r0x00569240;
      do {
        do {
          uVar21 = (ulong)*(uint *)(lVar35 + uVar21 * unaff_x25 + 0x20);
          lVar10 = lVar10 + 1;
        } while (uVar21 < uVar26);
code_r0x00569240:
        do {
          if (uVar26 <= uVar34) {
            _UNK_009efac0 = in_stack_00000210;
            _UNK_009efac8 = in_stack_00000218;
            _UNK_009efad0 = in_stack_00000220;
            _UNK_009efad8 = in_stack_00000228;
            if (lVar10 == 1) {
              if (*(long *)(pdVar17 + 4) != 0) goto code_r0x005692f8;
              lVar35 = *(long *)(pdVar47 + 2);
              lVar10 = *(long *)(pdVar47 + 4);
              if (lVar10 != 0) {
                func_0x007a5f8c(auStack_7ffffffe + 0x8000020e,lVar10,auStack_7ffffffe + 0x8000022e,1
                               );
              }
              func_0x00585744(lVar35,lVar35 + lVar10 * 0x48,auStack_7ffffffe + 0x8000020e);
              *(dword **)(unaff_x29 + -0x90) = in_stack_00000218;
              *(dword **)(unaff_x29 + -0x98) = in_stack_00000210;
              *(dword **)(unaff_x29 + -0x80) = in_stack_00000228;
              *(dword **)(unaff_x29 + -0x88) = in_stack_00000220;
              *(uint *)(unaff_x29 + -0xa0) = uVar48;
              *(int *)(unaff_x29 + -0x9c) = iVar13;
              func_0x00567190(auStack_7ffffffe + 0x8000020e);
              pdVar49 = in_stack_00000210;
              pdVar24 = in_stack_00000218;
              pdVar57 = in_stack_00000220;
              pdVar52 = in_stack_00000228;
              if (in_stack_00000210 == &MACH_HEADER.filetype) goto code_r0x005692f8;
              func_0x00584d50(unaff_x29 + -0xa0);
              if (*(long *)(unaff_x29 + -0xa0) == 0) {
                func_0x007a23bc(&UNK_009ee638);
                goto code_r0x0056a5ec;
              }
              bVar9 = iVar13 != *(int *)(unaff_x29 + -0x94);
              if (bVar9) {
                uVar40 = func_0x005cb804(unaff_x29 + -0xa0,0);
                *(undefined1 *)(unaff_x29 + -0xd0) = extraout_w1_00;
                *(undefined8 *)(unaff_x29 + -0xe0) = 8;
                *(undefined8 *)(unaff_x29 + -0xd8) = uVar40;
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
                in_stack_000003d0 = in_stack_00000330;
                in_stack_000003d8 = in_stack_00000338;
                in_stack_000003e0 = in_stack_00000340;
                in_stack_000003e8 = in_stack_00000348;
                in_stack_000003f0 = in_stack_00000350;
                in_stack_000003f8 = in_stack_00000358;
              }
              bVar7 = false;
              uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
              uStack0000000000000130 = (undefined4)unaff_x28;
              bVar8 = false;
              if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                bVar8 = bVar6;
              }
              uStack0000000000000134 = uVar48;
              uStack0000000000000138._0_4_ = iVar13;
              uStack0000000000000138._4_1_ = (char)in_stack_00000250;
              uStack0000000000000138._5_1_ = bVar9;
              in_stack_00000360 = in_stack_00000210;
              in_stack_00000368 = in_stack_00000218;
              in_stack_00000370 = in_stack_00000220;
              in_stack_00000378 = in_stack_00000228;
              in_stack_00000380 = in_stack_00000230;
              in_stack_00000388 = pdVar44;
              in_stack_00000390 = uVar18;
              in_stack_00000398 = uVar45;
              in_stack_00000400 = in_stack_00000210;
              in_stack_00000408 = in_stack_00000218;
              in_stack_00000410 = in_stack_00000220;
              in_stack_00000418 = in_stack_00000228;
              in_stack_00000420 = in_stack_00000230;
              in_stack_00000428 = pdVar44;
              in_stack_00000430 = uVar18;
              in_stack_00000438 = uVar45;
              if (bVar8) goto code_r0x00569324;
            }
            else {
code_r0x005692f8:
              in_stack_00000228 = pdVar52;
              in_stack_00000220 = pdVar57;
              in_stack_00000218 = pdVar24;
              in_stack_00000210 = pdVar49;
              uStack00000000000000f0 = &MACH_HEADER.filetype;
              func_0x005649d4(auStack_7ffffffe + 0x8000031e);
              bVar7 = true;
              bVar9 = false;
              if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                bVar9 = bVar6;
              }
              if (bVar9) {
code_r0x00569324:
                func_0x005649d4(&uStack0000000000000180);
              }
            }
            unaff_x26 = (undefined8 *)0x8000000000000000;
            pdVar24 = in_stack_00000218;
            if (!bVar7) goto code_r0x00569330;
            goto code_r0x005676c0;
          }
          lVar11 = lVar35 + uVar34 * unaff_x25;
          uVar34 = (ulong)*(uint *)(lVar11 + 0x24);
        } while ((*(int *)(lVar11 + 0x28) == -1) || (lVar10 = lVar10 + 1, uVar26 <= uVar21));
      } while( true );
    }
  }
  goto code_r0x005676c0;
  while (lVar35 = *(long *)(unaff_x20 + 0x38) + uVar26 * unaff_x25,
        uVar26 = (ulong)*(uint *)(lVar35 + 0x24), *(int *)(lVar35 + 0x28) == -1) {
code_r0x00569e4c:
    if (*(ulong *)(unaff_x20 + 0x40) <= uVar26) {
      func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar36);
      func_0x00565df4(auStack_7ffffffe + 0x8000020e);
      break;
    }
  }
code_r0x00569e80:
  func_0x0056c050();
  uVar26 = *(ulong *)(unaff_x20 + 0x28);
  if ((uVar21 < uVar26) &&
     (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
     *plVar39 != -0x8000000000000000)) {
    uVar36 = (ulong)*(uint *)((long)plVar39 + 0x1c);
  }
  else {
    uVar36 = 0xffffffff;
  }
  if (*(ulong *)(unaff_x20 + 0x40) >> 0x20 == 0) {
    do {
      if (*(ulong *)(unaff_x20 + 0x40) <= uVar36) {
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar21);
        func_0x00565df4(auStack_7ffffffe + 0x8000020e);
        uVar26 = *(ulong *)(unaff_x20 + 0x28);
        break;
      }
      lVar35 = *(long *)(unaff_x20 + 0x38) + uVar36 * unaff_x25;
      uVar36 = (ulong)*(uint *)(lVar35 + 0x24);
    } while (*(int *)(lVar35 + 0x28) == -1);
  }
  if ((uVar26 <= uVar34) ||
     (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
     *plVar39 == -0x8000000000000000)) {
code_r0x0056a5cc:
    func_0x007a23bc(in_stack_00000028);
    goto code_r0x0056a5ec;
  }
  if ((plVar39[2] == 0) || (lVar35 = plVar39[1] + plVar39[2] * 0x108, lVar35 == 0x108)) {
    in_stack_00000028 = &UNK_009eeb18;
    goto code_r0x0056a5cc;
  }
  if (!(lVar35 != 0xe8 && *(long *)(lVar35 + -0xf0) == 0x10)) {
    in_stack_00000028 = &UNK_009eeb30;
    goto code_r0x0056a5cc;
  }
  lVar10 = *(long *)pdVar24;
  *(long *)pdVar24 = lVar10 + 1;
  if (lVar10 < 0) {
code_r0x0056a520:
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  func_0x005649d4();
  *(undefined8 *)(lVar35 + -0xe8) = 0;
  *(dword **)(lVar35 + -0xe0) = pdVar24;
  lVar35 = plVar39[2];
  puVar42 = (undefined8 *)func_0x00187bd0(0x18,8);
  if (puVar42 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
    goto code_r0x0056a5ec;
  }
  *puVar42 = 0x8000000000000000;
  puVar42[1] = pdVar24;
  *(undefined8 *)(unaff_x29 + -0xf8) = 1;
  *(undefined8 **)(unaff_x29 + -0xf0) = puVar42;
  *(undefined8 *)(unaff_x29 + -0xe8) = 1;
  in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (in_stack_00000250 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
    goto code_r0x0056a5ec;
  }
  in_stack_00000250[1] = in_stack_000003c8;
  *in_stack_00000250 = in_stack_000003c0;
  in_stack_00000250[3] = in_stack_000003d8;
  in_stack_00000250[2] = in_stack_000003d0;
  in_stack_00000250[5] = in_stack_000003e8;
  in_stack_00000250[4] = in_stack_000003e0;
  in_stack_00000250[7] = in_stack_000003f8;
  in_stack_00000250[6] = in_stack_000003f0;
  pdVar44 = *(dword **)(unaff_x29 + -0xf0);
  in_stack_00000230 = *(dword **)(unaff_x29 + -0xf8);
  uVar18 = *(undefined8 *)(unaff_x29 + -0xe8);
  func_0x005564bc(plVar39,lVar35 + -1,auStack_7ffffffe + 0x8000020e,&UNK_009eeb48);
  pdVar17 = (dword *)0x0;
  pdVar47 = (dword *)((long)&MACH_HEADER.filetype + 3);
  uVar45 = 1;
  in_stack_00000400 = in_stack_000003c0;
  in_stack_00000408 = in_stack_000003c8;
  in_stack_00000410 = in_stack_000003d0;
  in_stack_00000418 = in_stack_000003d8;
  in_stack_00000420 = in_stack_000003e0;
  in_stack_00000428 = in_stack_000003e8;
  in_stack_00000430 = in_stack_000003f0;
  in_stack_00000438 = in_stack_000003f8;
code_r0x0056a024:
  uVar26 = unaff_x28 & 0xffffffff;
  in_stack_00000220 = in_stack_00000370;
  goto code_r0x00568fe0;
  while (lVar10 = lVar35 + uVar41 * unaff_x25, uVar41 = (ulong)*(uint *)(lVar10 + 0x24),
        *(int *)(lVar10 + 0x28) == -1) {
code_r0x00568fc0:
    if (uVar1 <= uVar41) goto code_r0x00568fdc;
  }
  if (uVar1 >> 0x20 == 0) {
    do {
      if (uVar1 <= uVar41) {
        if ((uVar36 < uVar25) &&
           (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20),
           *plVar39 != -0x8000000000000000)) {
          if (*(uint *)(plVar39 + 3) < uVar1) goto code_r0x00568fdc;
        }
        else if (0xffffffff < uVar1) goto code_r0x00568fdc;
        uVar41 = 0xffffffff;
        goto code_r0x00569b50;
      }
      bVar9 = false;
      lVar10 = lVar35 + uVar41 * unaff_x25;
      uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
    } while (*(int *)(lVar10 + 0x28) == -1);
    goto code_r0x00568fe0;
  }
  goto code_r0x00568fdc;
  while( true ) {
    bVar9 = false;
    lVar10 = lVar35 + uVar41 * unaff_x25;
    uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
    if (*(int *)(lVar10 + 0x28) != -1) break;
code_r0x00569b50:
    if (uVar1 <= uVar41) {
      if ((uVar21 < uVar25) &&
         (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
         *plVar39 != -0x8000000000000000)) {
        uVar41 = (ulong)*(uint *)(plVar39 + 3);
      }
      else {
        uVar41 = 0xffffffff;
      }
      if (uVar41 < uVar1) goto code_r0x00568fdc;
      uVar41 = 0xffffffff;
      goto code_r0x00569ba8;
    }
  }
  goto code_r0x00568fe0;
code_r0x00569ba8:
  if (uVar41 < uVar1) {
    bVar9 = false;
    lVar10 = lVar35 + uVar41 * unaff_x25;
    uVar41 = (ulong)*(uint *)(lVar10 + 0x24);
    if (*(int *)(lVar10 + 0x28) != -1) goto code_r0x00568fe0;
    goto code_r0x00569ba8;
  }
  if (uVar36 < uVar25) {
    plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar36 * 0x20);
    if (*plVar39 != -0x8000000000000000) {
      if (((plVar39[2] != 1) || (lVar35 = plVar39[1], *(long *)(lVar35 + 0x18) != 0x1b)) ||
         (*(long *)(lVar35 + 0x10) != 1)) goto code_r0x00568fdc;
      if ((uVar21 < uVar25) &&
         (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar21 * 0x20),
         *plVar39 != -0x8000000000000000)) {
        if ((plVar39[2] != 1) ||
           ((lVar10 = plVar39[1], *(long *)(lVar10 + 0x18) != 0x1b ||
            (*(long *)(lVar10 + 0x10) != 1)))) goto code_r0x00568fdc;
        uVar18 = *(undefined8 *)(lVar10 + 8);
        func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar35 + 8));
        func_0x00566040(auStack_7ffffffe + 0x8000035e,uVar18);
        func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                        *(undefined8 *)(unaff_x20 + 0x28),uVar26,auStack_7ffffffe + 0x8000020e,
                        auStack_7ffffffe + 0x8000035e);
        bVar9 = *(long *)(unaff_x29 + -0xe0) != 0xc;
        pdVar17 = in_stack_00000320;
        pdVar24 = in_stack_00000328;
        in_stack_00000220 = in_stack_00000330;
        pdVar47 = in_stack_00000338;
        in_stack_00000230 = in_stack_00000340;
        pdVar44 = in_stack_00000348;
        uVar18 = in_stack_00000350;
        uVar45 = in_stack_00000358;
        if (bVar9) {
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar36);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,uVar21);
          func_0x00565df4(auStack_7ffffffe + 0x8000020e);
          if ((*(ulong *)(unaff_x20 + 0x28) <= uVar34) ||
             (plVar39 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
             *plVar39 == -0x8000000000000000)) {
            func_0x007a23bc(&UNK_009eeb90);
            goto code_r0x0056a5ec;
          }
          if (plVar39[2] != 0) {
            lVar35 = plVar39[2] + -1;
            plVar39[2] = lVar35;
            _memcpy(auStack_7ffffffe + 0x8000020e,plVar39[1] + lVar35 * 0x108,0x108);
            if (in_stack_00000338 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
              func_0x00564f24(auStack_7ffffffe + 0x8000020e);
            }
          }
          pdVar24 = (dword *)func_0x00187bd0(0x40,8);
          if (pdVar24 == (dword *)0x0) {
            func_0x007a1f18(8,0x40);
            goto code_r0x0056a5ec;
          }
          *(dword **)(pdVar24 + 2) = in_stack_000003c8;
          *(dword **)pdVar24 = in_stack_000003c0;
          *(dword **)(pdVar24 + 6) = in_stack_000003d8;
          *(dword **)(pdVar24 + 4) = in_stack_000003d0;
          *(dword **)(pdVar24 + 10) = in_stack_000003e8;
          *(dword **)(pdVar24 + 8) = in_stack_000003e0;
          *(undefined8 *)(pdVar24 + 0xe) = in_stack_000003f8;
          *(undefined8 *)(pdVar24 + 0xc) = in_stack_000003f0;
          pdVar17 = (dword *)((long)&MACH_HEADER.magic + 1);
          func_0x00566eec(plVar39,auStack_7ffffffe + 0x8000020e);
          in_stack_00000220 = in_stack_00000040;
          pdVar47 = in_stack_00000048;
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
code_r0x00567b28:
  if (plVar28 == plVar22) goto code_r0x00567b30;
  plVar27 = plVar28 + 9;
  lVar10 = *plVar28;
  lVar35 = *(long *)(in_stack_00000228 + 4) * 0x48;
  plVar33 = *(long **)(in_stack_00000228 + 2);
  while (plVar28 = plVar27, lVar35 != 0) {
    lVar11 = *plVar33;
    lVar35 = lVar35 + -0x48;
    plVar33 = plVar33 + 9;
    if (lVar10 == lVar11) goto code_r0x00567a98;
  }
  goto code_r0x00567b28;
code_r0x00567b30:
  lVar35 = *plVar29;
  *plVar29 = lVar35 + 1;
  if (lVar35 < 0) {
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  pdVar24 = (dword *)*plVar39;
  func_0x00566040(unaff_x29 + -0xe0,plVar39 + 1);
  func_0x00566040(unaff_x29 + -0xa0,plVar37);
  lVar35 = func_0x0056b044(&uStack00000000000000f0,*(undefined8 *)(unaff_x20 + 0x20),
                           *(undefined8 *)(unaff_x20 + 0x28),unaff_x28,auStack_7ffffffe + 0x8000020e
                           ,unaff_x29 + -0xa0);
  in_stack_00000220 = in_stack_000003d0;
  in_stack_00000320 = pdVar24;
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    in_stack_00000188 = uStack00000000000000f8;
    uStack0000000000000180 = uStack00000000000000f0;
    in_stack_00000198 = in_stack_00000108;
    in_stack_00000190 = in_stack_00000100;
    in_stack_000001a8 = in_stack_00000118;
    uStack00000000000001a0 = in_stack_00000110;
    in_stack_000001b8 = in_stack_00000128;
    in_stack_000001b0 = in_stack_00000120;
    lVar10 = *(long *)pdVar24;
    *(long *)pdVar24 = lVar10 + 1;
    if (-1 < lVar10) {
      if ((*(ulong *)(unaff_x20 + 0x40) <= uVar41) ||
         (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar41 * (unaff_x25 & 0xffffffff)),
         *plVar39 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009eebc0);
        goto code_r0x0056a5ec;
      }
      if (plVar39[2] == 0) {
        func_0x007a2570(0,0,&UNK_009eebd8);
        goto code_r0x0056a5ec;
      }
      lVar10 = plVar39[1];
      lVar35 = func_0x005649d4(lVar10 + 8);
      *(undefined8 *)(lVar10 + 0x40) = in_stack_000003f8;
      *(undefined8 *)(lVar10 + 0x38) = in_stack_000003f0;
      *(dword **)(lVar10 + 0x30) = in_stack_000003e8;
      *(dword **)(lVar10 + 0x28) = in_stack_000003e0;
      *(dword **)(lVar10 + 0x20) = in_stack_000003d8;
      *(dword **)(lVar10 + 0x18) = in_stack_000003d0;
      *(dword **)(lVar10 + 0x10) = pdVar24;
      *(undefined8 *)(lVar10 + 8) = 0;
      lVar10 = *(long *)pdVar24;
      *(long *)pdVar24 = lVar10 + 1;
      if (-1 < lVar10) {
        if ((*(ulong *)(unaff_x20 + 0x40) <= uVar26) ||
           (plVar39 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar26 * (unaff_x25 & 0xffffffff)),
           *plVar39 == -0x8000000000000000)) {
          func_0x007a23bc(&UNK_009eebf0);
          goto code_r0x0056a5ec;
        }
        if (plVar39[2] == 0) {
          func_0x007a2570(0,0,&UNK_009eec08);
          goto code_r0x0056a5ec;
        }
        lVar35 = plVar39[1];
        func_0x005649d4(lVar35 + 8);
        *(undefined8 *)(lVar35 + 0x40) = in_stack_000003f8;
        *(undefined8 *)(lVar35 + 0x38) = in_stack_000003f0;
        *(dword **)(lVar35 + 0x30) = in_stack_000003e8;
        *(dword **)(lVar35 + 0x28) = in_stack_000003e0;
        *(dword **)(lVar35 + 0x20) = in_stack_000003d8;
        *(dword **)(lVar35 + 0x18) = in_stack_000003d0;
        *(dword **)(lVar35 + 0x10) = pdVar24;
        *(undefined8 *)(lVar35 + 8) = 0;
        if ((uVar34 < *(ulong *)(unaff_x20 + 0x28)) &&
           (puVar38 = (ulong *)(*(long *)(unaff_x20 + 0x20) + uVar34 * 0x20),
           *puVar38 != 0x8000000000000000)) {
          if ((puVar38[2] == 0) || (lVar10 = puVar38[1] + puVar38[2] * 0x108, lVar10 == 0x108)) {
            in_stack_00000068 = &UNK_009eec38;
          }
          else {
            lVar35 = lVar10 + -0xe8;
            if ((lVar35 != 0) && (*(long *)(lVar10 + -0xf0) == 0x10)) {
              lVar11 = *(long *)pdVar24;
              *(long *)pdVar24 = lVar11 + 1;
              if (-1 < lVar11) {
                func_0x005649d4();
                *(undefined8 *)(lVar10 + -0xe8) = 0;
                *(dword **)(lVar10 + -0xe0) = pdVar24;
                uVar21 = puVar38[2];
                pdVar16 = (dword *)func_0x00187bd0(0x18,8);
                if (pdVar16 == (dword *)0x0) {
                  func_0x007a1f18(8,0x18);
                  goto code_r0x0056a5ec;
                }
                *(undefined8 *)pdVar16 = 0x8000000000000000;
                *(dword **)(pdVar16 + 2) = pdVar24;
                pdVar49 = (dword *)((long)&MACH_HEADER.magic + 1);
                pdVar52 = (dword *)((long)&MACH_HEADER.magic + 1);
                in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
                if (in_stack_00000250 == (undefined8 *)0x0) {
                  func_0x007a1f18(8,0x40);
                  goto code_r0x0056a5ec;
                }
                uVar21 = uVar21 - 1;
                in_stack_00000250[1] = uStack00000000000000f8;
                *in_stack_00000250 = uStack00000000000000f0;
                in_stack_00000250[3] = in_stack_00000108;
                in_stack_00000250[2] = in_stack_00000100;
                in_stack_00000250[5] = in_stack_00000118;
                in_stack_00000250[4] = in_stack_00000110;
                in_stack_00000250[7] = in_stack_00000128;
                in_stack_00000250[6] = in_stack_00000120;
                uVar26 = puVar38[2];
                if (uVar26 < uVar21) {
                  func_0x007a204c(uVar21,uVar26,&UNK_009eec68);
                  goto code_r0x0056a5ec;
                }
                pdVar57 = pdVar16;
                if (uVar26 == *puVar38) {
                  func_0x005bd0a4(puVar38,&UNK_009eec68);
                }
code_r0x00567da8:
                bVar9 = true;
                lVar35 = puVar38[1] + uVar21 * 0x108;
                if (uVar21 <= uVar26 && uVar26 - uVar21 != 0) {
                  _memmove(lVar35 + 0x108,lVar35,(uVar26 - uVar21) * 0x108);
                }
                _memcpy(lVar35,auStack_7ffffffe + 0x8000020e,0x108);
                puVar38[2] = uVar26 + 1;
                in_stack_00000210 = (dword *)0x0;
                pdVar17 = (dword *)((long)&MACH_HEADER.filetype + 3);
                in_stack_00000230 = (dword *)((long)&MACH_HEADER.magic + 1);
                uVar23 = 1;
                uVar51 = 1;
                in_stack_000003d0 = in_stack_00000220;
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
    func_0x007a05dc(lVar35);
    goto code_r0x0056a5ec;
  }
  lVar35 = *(long *)pdVar24;
  *(long *)pdVar24 = lVar35 + -1;
  LORelease();
  if (lVar35 == 1) {
    func_0x005d2ac4(auStack_7ffffffe + 0x8000031e);
  }
  bVar9 = false;
  in_stack_00000210 = in_stack_000003c0;
  pdVar24 = in_stack_000003c8;
  pdVar17 = in_stack_000003d8;
  in_stack_00000230 = in_stack_000003e0;
  pdVar16 = in_stack_000003e8;
  uVar23 = in_stack_000003f0;
  uVar51 = in_stack_000003f8;
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    func_0x005649d4(&uStack00000000000000f0);
  }
  goto code_r0x00569028;
}

