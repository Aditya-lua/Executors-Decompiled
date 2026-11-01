
/* WARNING: Removing unreachable block (ram,0x00568874) */
/* WARNING: Removing unreachable block (ram,0x005689b4) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

byte FUN_00569c94(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined1 *param_5,undefined1 *param_6)

{
  bool bVar1;
  dword *pdVar2;
  undefined1 uVar3;
  code *pcVar4;
  bool bVar5;
  bool bVar6;
  byte bVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  dword *pdVar11;
  undefined *puVar12;
  undefined1 extraout_w1;
  undefined1 extraout_w1_00;
  undefined *puVar13;
  long *plVar14;
  undefined8 uVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  long *plVar22;
  long *plVar23;
  long lVar24;
  long *plVar25;
  ulong uVar26;
  long lVar27;
  long lVar28;
  int iVar29;
  long *plVar30;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar31;
  ulong *puVar32;
  ulong unaff_x21;
  long *plVar33;
  bool bVar34;
  uint unaff_w23;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 *puVar37;
  dword *pdVar38;
  long unaff_x24;
  ulong unaff_x25;
  undefined8 *puVar39;
  byte unaff_w27;
  undefined4 uVar40;
  ulong unaff_x28;
  long unaff_x29;
  dword *pdVar41;
  dword *pdVar42;
  dword *pdVar43;
  dword *pdVar44;
  dword *pdVar45;
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
  uint uVar49;
  dword *pdVar48;
  dword *in_stack_00000218;
  dword *in_stack_00000220;
  dword *pdVar50;
  dword *pdVar51;
  dword *in_stack_00000228;
  uint uVar52;
  dword *in_stack_00000230;
  dword *in_stack_00000238;
  undefined8 in_stack_00000240;
  undefined8 uVar53;
  undefined8 in_stack_00000248;
  undefined8 *in_stack_00000250;
  dword *in_stack_00000320;
  dword *in_stack_00000328;
  dword *in_stack_00000330;
  dword *in_stack_00000338;
  dword *in_stack_00000340;
  dword *in_stack_00000348;
  undefined8 in_stack_00000350;
  undefined8 in_stack_00000358;
  dword *in_stack_00000360;
  dword *in_stack_00000368;
  dword *in_stack_00000370;
  dword *pdVar54;
  dword *in_stack_00000378;
  dword *pdVar55;
  dword *in_stack_00000380;
  dword *pdVar56;
  dword *in_stack_00000388;
  undefined8 in_stack_00000390;
  undefined8 uVar57;
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
  
code_r0x00569c94:
  func_0x0056b044(param_1,param_2,param_3,unaff_x28,param_5,param_6);
  bVar6 = *(long *)(unaff_x29 + -0xe0) != 0xc;
  pdVar44 = in_stack_00000220;
  pdVar38 = in_stack_00000228;
  in_stack_00000220 = in_stack_00000330;
  if (bVar6) {
    func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,unaff_x21);
    func_0x00565df4(auStack_7ffffffe + 0x8000020e);
    func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_stack_00000088);
    func_0x00565df4(auStack_7ffffffe + 0x8000020e);
    if ((*(ulong *)(unaff_x20 + 0x28) <= unaff_x19) ||
       (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20), *plVar33 == unaff_x24))
    {
      func_0x007a23bc(&UNK_009eeb90);
code_r0x0056a5ec:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x56a5f0);
      (*pcVar4)();
    }
    if (plVar33[2] != 0) {
      lVar17 = plVar33[2] + -1;
      plVar33[2] = lVar17;
      _memcpy(auStack_7ffffffe + 0x8000020e,plVar33[1] + lVar17 * 0x108,0x108);
      if (in_stack_00000228 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
        func_0x00564f24(auStack_7ffffffe + 0x8000020e);
      }
    }
    in_stack_00000218 = (dword *)func_0x00187bd0(0x40,8);
    if (in_stack_00000218 == (dword *)0x0) {
      func_0x007a1f18(8,0x40);
      goto code_r0x0056a5ec;
    }
    *(dword **)(in_stack_00000218 + 2) = in_stack_000003c8;
    *(dword **)in_stack_00000218 = in_stack_000003c0;
    *(dword **)(in_stack_00000218 + 6) = in_stack_000003d8;
    *(dword **)(in_stack_00000218 + 4) = in_stack_000003d0;
    *(dword **)(in_stack_00000218 + 10) = in_stack_000003e8;
    *(dword **)(in_stack_00000218 + 8) = in_stack_000003e0;
    *(undefined8 *)(in_stack_00000218 + 0xe) = in_stack_000003f8;
    *(undefined8 *)(in_stack_00000218 + 0xc) = in_stack_000003f0;
    in_stack_00000210 = (dword *)((long)&MACH_HEADER.magic + 1);
    func_0x00566eec(plVar33,auStack_7ffffffe + 0x8000020e);
    pdVar44 = in_stack_00000040;
    pdVar38 = in_stack_00000048;
    in_stack_00000400 = in_stack_000003c0;
    in_stack_00000408 = in_stack_000003c8;
    in_stack_00000410 = in_stack_000003d0;
    in_stack_00000418 = in_stack_000003d8;
    in_stack_00000420 = in_stack_000003e0;
    in_stack_00000428 = in_stack_000003e8;
    in_stack_00000430 = in_stack_000003f0;
    in_stack_00000438 = in_stack_000003f8;
  }
code_r0x00568fe0:
  uVar49 = 0;
  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
    uVar49 = unaff_w23;
  }
  uVar19 = unaff_x28;
  pdVar47 = in_stack_00000320;
  pdVar48 = in_stack_00000328;
  in_stack_00000228 = in_stack_00000338;
  if ((uVar49 & 1) != 0) {
    func_0x005649d4(&uStack0000000000000180);
    func_0x005649d4(in_stack_00000080);
  }
code_r0x00569000:
  uVar49 = 0;
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    uVar49 = in_stack_00000090;
  }
  pdVar41 = in_stack_00000210;
  pdVar43 = in_stack_00000218;
  pdVar50 = pdVar38;
  pdVar42 = in_stack_00000230;
  pdVar11 = in_stack_00000238;
  uVar36 = in_stack_00000240;
  uVar53 = in_stack_00000248;
  in_stack_00000320 = pdVar47;
  in_stack_00000328 = pdVar48;
  pdVar47 = in_stack_00000360;
  pdVar48 = in_stack_00000368;
  pdVar51 = in_stack_00000370;
  pdVar54 = in_stack_00000378;
  pdVar55 = in_stack_00000380;
  pdVar56 = in_stack_00000388;
  uVar35 = in_stack_00000390;
  uVar57 = in_stack_00000398;
  if ((uVar49 & 1) != 0) {
    func_0x005649d4(&uStack00000000000000f0);
    func_0x005649d4(&uStack0000000000000138);
  }
code_r0x00569028:
  unaff_w27 = bVar6 | unaff_w27;
  uVar16 = *(ulong *)(unaff_x20 + 0x28);
  pdVar45 = pdVar50;
  in_stack_00000238 = pdVar11;
  in_stack_00000240 = uVar36;
  in_stack_00000248 = uVar53;
  in_stack_00000360 = pdVar47;
  in_stack_00000368 = pdVar48;
  in_stack_00000370 = pdVar51;
  in_stack_00000378 = pdVar54;
  in_stack_00000380 = pdVar55;
  in_stack_00000388 = pdVar56;
  in_stack_00000390 = uVar35;
  in_stack_00000398 = uVar57;
  do {
    if ((uVar16 <= unaff_x19) ||
       (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
       *plVar33 == -0x8000000000000000)) {
      puVar12 = &UNK_009ee5f0;
      goto code_r0x0056a0b0;
    }
    if (plVar33[2] != 0) {
      lVar17 = plVar33[1] + plVar33[2] * 0x108;
      if (lVar17 != 0x108) {
        if (*(long *)(lVar17 + -0xf0) == 0x10) {
          func_0x00566040(auStack_7ffffffe + 0x8000031e,lVar17 + -0xe8);
          func_0x00584d50(auStack_7ffffffe + 0x8000020e);
          if (pdVar41 == (dword *)0x0) {
            func_0x007a23bc(&UNK_009ee608);
            goto code_r0x0056a5ec;
          }
          uVar16 = *(ulong *)(unaff_x20 + 0x28);
          if (((ulong)pdVar43 >> 0x20 < uVar16) &&
             (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + ((ulong)pdVar43 >> 0x20) * 0x20),
             *plVar33 != -0x8000000000000000)) {
            uVar21 = (ulong)*(uint *)((long)plVar33 + 0x1c);
          }
          else {
            uVar21 = 0xffffffff;
          }
          lVar24 = 0;
          uVar49 = (uint)((ulong)pdVar42 >> 0x20);
          uVar26 = 0xffffffff;
          lVar17 = *(long *)(unaff_x20 + 0x38);
          uVar18 = *(ulong *)(unaff_x20 + 0x40);
          if (0xffffffff < uVar18) goto code_r0x00569138;
          while (uVar21 < uVar18) {
            lVar28 = lVar17 + uVar21 * unaff_x25;
            uVar21 = (ulong)*(uint *)(lVar28 + 0x24);
            if (*(int *)(lVar28 + 0x28) != -1) {
              for (; lVar24 = lVar24 + 1, uVar26 < uVar18;
                  uVar26 = (ulong)*(uint *)(lVar17 + uVar26 * unaff_x25 + 0x20)) {
code_r0x00569138:
              }
            }
          }
          uVar40 = (undefined4)uVar19;
          uVar52 = (uint)((ulong)pdVar43 >> 0x20);
          if ((lVar24 != 1) || (*(long *)(pdVar41 + 4) != 0)) {
            bVar6 = false;
            pdVar47 = _UNK_009efac0;
            pdVar48 = _UNK_009efac8;
            pdVar51 = _UNK_009efad8;
            pdVar38 = pdVar41;
            pdVar54 = pdVar44;
            pdVar55 = pdVar45;
joined_r0x00569168:
            pdVar44 = _UNK_009efad0;
            if (uVar49 < uVar16) {
              plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + (ulong)uVar49 * 0x20);
              if (*plVar33 == -0x8000000000000000) {
                uVar19 = 0xffffffff;
              }
              else {
                uVar19 = (ulong)*(uint *)((long)plVar33 + 0x1c);
              }
            }
            else {
              uVar19 = 0xffffffff;
            }
            uVar16 = 0xffffffff;
            lVar24 = 0;
            if (uVar18 < 0x100000000) goto code_r0x00569240;
            do {
              do {
                uVar16 = (ulong)*(uint *)(lVar17 + uVar16 * unaff_x25 + 0x20);
                lVar24 = lVar24 + 1;
              } while (uVar16 < uVar18);
code_r0x00569240:
              do {
                if (uVar18 <= uVar19) {
                  _UNK_009efac0 = pdVar47;
                  _UNK_009efac8 = pdVar48;
                  _UNK_009efad0 = pdVar44;
                  _UNK_009efad8 = pdVar51;
                  if (lVar24 == 1) {
                    if (*(long *)(pdVar45 + 4) != 0) goto code_r0x005692f8;
                    lVar17 = *(long *)(pdVar41 + 2);
                    lVar24 = *(long *)(pdVar41 + 4);
                    if (lVar24 != 0) {
                      func_0x007a5f8c(auStack_7ffffffe + 0x8000020e,lVar24,
                                      auStack_7ffffffe + 0x8000022e,1);
                    }
                    func_0x00585744(lVar17,lVar17 + lVar24 * 0x48,auStack_7ffffffe + 0x8000020e);
                    *(dword **)(unaff_x29 + -0x90) = pdVar48;
                    *(dword **)(unaff_x29 + -0x98) = pdVar47;
                    *(dword **)(unaff_x29 + -0x80) = pdVar51;
                    *(dword **)(unaff_x29 + -0x88) = pdVar44;
                    *(uint *)(unaff_x29 + -0xa0) = uVar49;
                    *(uint *)(unaff_x29 + -0x9c) = uVar52;
                    func_0x00567190(auStack_7ffffffe + 0x8000020e);
                    pdVar38 = pdVar47;
                    pdVar43 = pdVar48;
                    pdVar54 = pdVar44;
                    pdVar55 = pdVar51;
                    if (pdVar47 == &MACH_HEADER.filetype) goto code_r0x005692f8;
                    func_0x00584d50(unaff_x29 + -0xa0);
                    if (*(long *)(unaff_x29 + -0xa0) == 0) {
                      func_0x007a23bc(&UNK_009ee638);
                      goto code_r0x0056a5ec;
                    }
                    bVar5 = uVar52 != *(uint *)(unaff_x29 + -0x94);
                    if (bVar5) {
                      uVar35 = func_0x005cb804(unaff_x29 + -0xa0,0);
                      *(undefined1 *)(unaff_x29 + -0xd0) = extraout_w1_00;
                      *(undefined8 *)(unaff_x29 + -0xe0) = 8;
                      *(undefined8 *)(unaff_x29 + -0xd8) = uVar35;
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
                      in_stack_000003d0 = in_stack_00000220;
                      in_stack_000003d8 = in_stack_00000228;
                      in_stack_000003e0 = in_stack_00000340;
                      in_stack_000003e8 = in_stack_00000348;
                      in_stack_000003f0 = in_stack_00000350;
                      in_stack_000003f8 = in_stack_00000358;
                    }
                    bVar34 = false;
                    uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
                    bVar1 = false;
                    if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                      bVar1 = bVar6;
                    }
                    uStack0000000000000130 = uVar40;
                    uStack0000000000000134 = uVar49;
                    uStack0000000000000138._0_4_ = uVar52;
                    uStack0000000000000138._4_1_ = (char)in_stack_00000250;
                    uStack0000000000000138._5_1_ = bVar5;
                    pdVar41 = pdVar47;
                    in_stack_00000360 = pdVar47;
                    in_stack_00000368 = pdVar48;
                    in_stack_00000370 = pdVar44;
                    in_stack_00000378 = pdVar51;
                    in_stack_00000380 = pdVar42;
                    in_stack_00000388 = in_stack_00000238;
                    in_stack_00000390 = in_stack_00000240;
                    in_stack_00000398 = in_stack_00000248;
                    in_stack_00000400 = pdVar47;
                    in_stack_00000408 = pdVar48;
                    in_stack_00000410 = pdVar44;
                    in_stack_00000418 = pdVar51;
                    in_stack_00000420 = pdVar42;
                    in_stack_00000428 = in_stack_00000238;
                    in_stack_00000430 = in_stack_00000240;
                    in_stack_00000438 = in_stack_00000248;
                    if (bVar1) goto code_r0x00569324;
                  }
                  else {
code_r0x005692f8:
                    pdVar51 = pdVar55;
                    pdVar44 = pdVar54;
                    pdVar48 = pdVar43;
                    pdVar47 = pdVar38;
                    uStack00000000000000f0 = &MACH_HEADER.filetype;
                    func_0x005649d4(auStack_7ffffffe + 0x8000031e);
                    bVar34 = true;
                    bVar5 = false;
                    if (uStack0000000000000180 != &MACH_HEADER.filetype) {
                      bVar5 = bVar6;
                    }
                    pdVar41 = pdVar47;
                    if (bVar5) {
code_r0x00569324:
                      func_0x005649d4(&uStack0000000000000180);
                      pdVar41 = pdVar47;
                    }
                  }
                  pdVar43 = pdVar48;
                  pdVar45 = pdVar51;
                  if (!bVar34) goto code_r0x00569330;
                  goto code_r0x005676c0;
                }
                lVar28 = lVar17 + uVar19 * unaff_x25;
                uVar19 = (ulong)*(uint *)(lVar28 + 0x24);
              } while ((*(int *)(lVar28 + 0x28) == -1) || (lVar24 = lVar24 + 1, uVar18 <= uVar16));
            } while( true );
          }
          lVar17 = *(long *)(pdVar45 + 2);
          lVar24 = *(long *)(pdVar45 + 4);
          in_stack_00000188 = _UNK_009efac8;
          uStack0000000000000180 = _UNK_009efac0;
          in_stack_00000198 = _UNK_009efad8;
          in_stack_00000190 = _UNK_009efad0;
          if (lVar24 != 0) {
            func_0x007a5f8c(&uStack0000000000000180,lVar24,&uStack00000000000001a0,1);
          }
          func_0x00585744(lVar17,lVar17 + lVar24 * 0x48,&uStack0000000000000180);
          pdVar56 = in_stack_00000198;
          pdVar55 = in_stack_00000190;
          pdVar54 = in_stack_00000188;
          pdVar43 = uStack0000000000000180;
          pdVar38 = (dword *)CONCAT44(uVar49,uVar52);
          func_0x00567190(&uStack0000000000000180);
          uVar57 = in_stack_000001b8;
          uVar35 = in_stack_000001b0;
          pdVar50 = in_stack_000001a8;
          pdVar42 = uStack00000000000001a0;
          pdVar51 = in_stack_00000198;
          pdVar44 = in_stack_00000190;
          pdVar48 = in_stack_00000188;
          pdVar47 = uStack0000000000000180;
          if (uStack0000000000000180 == &MACH_HEADER.filetype) {
            lVar17 = *(long *)(unaff_x20 + 0x38);
            uVar18 = *(ulong *)(unaff_x20 + 0x40);
            bVar6 = true;
            uVar16 = *(ulong *)(unaff_x20 + 0x28);
            pdVar47 = _UNK_009efac0;
            pdVar48 = _UNK_009efac8;
            pdVar51 = _UNK_009efad8;
            pdVar42 = pdVar56;
            goto joined_r0x00569168;
          }
          uVar3 = uStack00000000000001c0;
          func_0x00584d50(auStack_7ffffffe + 0x8000020e);
          if (pdVar38 == (dword *)0x0) {
            func_0x007a23bc(&UNK_009ee620);
            goto code_r0x0056a5ec;
          }
          bVar6 = (uint)((ulong)pdVar43 >> 0x20) != uVar49;
          if (bVar6) {
            func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                            0xd);
            in_stack_00000400 = in_stack_00000320;
            in_stack_00000408 = in_stack_00000328;
            in_stack_00000410 = in_stack_00000220;
            in_stack_00000418 = in_stack_00000228;
            in_stack_00000420 = in_stack_00000340;
            in_stack_00000428 = in_stack_00000348;
            in_stack_00000430 = in_stack_00000350;
            in_stack_00000438 = in_stack_00000358;
          }
          else {
            uVar36 = func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
            *(undefined1 *)(unaff_x29 + -0x90) = extraout_w1;
            *(undefined8 *)(unaff_x29 + -0xa0) = 8;
            *(undefined8 *)(unaff_x29 + -0x98) = uVar36;
            func_0x005c1d84(&uStack00000000000000f8,unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,
                            0xe);
          }
          uStack0000000000000138._5_1_ = !bVar6;
          uStack00000000000000f0 = (dword *)((long)&MACH_HEADER.cpusubtype + 1);
          uStack0000000000000138._4_1_ = uVar3;
          uStack0000000000000130 = uVar40;
          uStack0000000000000134 = uVar52;
          uStack0000000000000138._0_4_ = uVar49;
          pdVar41 = pdVar47;
          in_stack_00000238 = pdVar50;
          in_stack_00000240 = uVar35;
          in_stack_00000248 = uVar57;
          in_stack_000003c0 = pdVar47;
          in_stack_000003c8 = pdVar48;
          in_stack_000003d0 = pdVar44;
          in_stack_000003d8 = pdVar51;
          in_stack_000003e0 = pdVar42;
          in_stack_000003e8 = pdVar50;
          in_stack_000003f0 = uVar35;
          in_stack_000003f8 = uVar57;
code_r0x00569330:
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
            pdVar43 = pdVar48;
            pdVar45 = pdVar51;
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
             (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) +
                                ((ulong)_uStack00000000000001c0 & 0xffffffff) * 0x20),
             *plVar33 != -0x8000000000000000)) {
            lVar17 = plVar33[3];
          }
          else {
            lVar17 = -1;
          }
          in_stack_000003c8 = *(dword **)(unaff_x20 + 0x38);
          lVar24 = *(long *)(unaff_x20 + 0x40);
          in_stack_000003c0 = (dword *)0x0;
          uVar35 = CONCAT44((int)((ulong)pdVar42 >> 0x20),_uStack00000000000001c0);
          func_0x0055b5b8(auStack_7ffffffe + 0x8000035e,auStack_7ffffffe + 0x8000020e,&UNK_009ee258)
          ;
          if (in_stack_00000370 == (dword *)((long)&MACH_HEADER.magic + 1)) {
            if (((ulong)in_stack_00000368[4] < *(ulong *)(unaff_x20 + 0x40)) &&
               (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                  (ulong)in_stack_00000368[4] * (unaff_x25 & 0xffffffff)),
               *plVar33 != -0x8000000000000000)) {
              lVar28 = plVar33[2];
              if (lVar28 != 0) {
                puVar9 = (undefined8 *)plVar33[1];
                puVar37 = puVar9 + 9;
                puVar39 = puVar9;
                pdVar44 = in_stack_000003c0;
                do {
                  puVar10 = puVar37;
                  puVar37 = (undefined8 *)(in_stack_00000328 + -0x10);
                  lVar27 = (long)in_stack_00000220 * 0x48;
                  do {
                    in_stack_000003c0 = pdVar44;
                    if (lVar27 == 0) goto code_r0x005695f0;
                    in_stack_000003c0 = (dword *)puVar37[8];
                    puVar37 = puVar37 + 9;
                    lVar27 = lVar27 + -0x48;
                  } while (in_stack_000003c0 != (dword *)*puVar39);
                  lVar27 = *(long *)in_stack_000003c0;
                  *(long *)in_stack_000003c0 = lVar27 + 1;
                  if (lVar27 < 0) {
                    func_0x007a05dc();
                    goto code_r0x0056a5ec;
                  }
                  func_0x00566040(auStack_7ffffffe + 0x80000216);
                  lVar27 = *(long *)*puVar39;
                  *(long *)*puVar39 = lVar27 + -1;
                  LORelease();
                  if (lVar27 == 1) {
                    func_0x005d2ac4(puVar39);
                  }
                  func_0x005649d4(puVar39 + 1);
                  puVar39[1] = in_stack_000003c8;
                  *puVar39 = in_stack_000003c0;
                  puVar39[8] = in_stack_00000250;
                  puVar39[5] = in_stack_00000080;
                  puVar39[4] = uVar35;
                  puVar39[7] = in_stack_00000248;
                  puVar39[6] = in_stack_00000240;
                  puVar39[3] = lVar17;
                  puVar39[2] = lVar24;
code_r0x005695f0:
                  lVar27 = 0;
                  if (puVar10 != puVar9 + lVar28 * 9) {
                    lVar27 = 0x48;
                  }
                  puVar37 = (undefined8 *)((long)puVar10 + lVar27);
                  puVar39 = puVar10;
                  pdVar44 = in_stack_000003c0;
                } while (puVar10 != puVar9 + lVar28 * 9);
              }
              func_0x00584d50(auStack_7ffffffe + 0x8000020e);
              if (in_stack_000003c0 == (dword *)0x0) {
                puVar12 = &UNK_009ee6c8;
              }
              else {
                iVar8 = func_0x0056c050();
                if (iVar8 == 0) {
                  puVar12 = &UNK_008abf40;
                  uVar35 = 0x4a;
                  puVar13 = &UNK_009ee6e0;
                  goto code_r0x0056a11c;
                }
                func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,
                                uStack00000000000001c4);
                in_stack_00000248 = in_stack_000001b8;
                in_stack_00000240 = in_stack_000001b0;
                in_stack_00000238 = in_stack_000001a8;
                pdVar42 = uStack00000000000001a0;
                pdVar48 = in_stack_00000198;
                pdVar47 = in_stack_00000190;
                pdVar38 = in_stack_00000188;
                pdVar44 = uStack0000000000000180;
                if (in_stack_000003c0 != (dword *)0x8000000000000000) {
                  *(long *)(unaff_x29 + -0xd0) = lVar24;
                  uVar19 = (ulong)_uStack00000000000001c0 & 0xffffffff;
                  if ((in_stack_000001c8 & 0x100000000) == 0) {
                    if (lVar24 != 0) {
                      lVar28 = *(long *)(unaff_x29 + -0xd8);
                      lVar17 = lVar28 + lVar24 * 0x108;
                      if (lVar17 != 0x108) {
                        puVar37 = (undefined8 *)(lVar17 + -0xe8);
                        if (*(long *)(lVar17 + -0xf0) == 0x10 && puVar37 != (undefined8 *)0x0) {
                          func_0x005af378(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                          func_0x005649d4(puVar37);
                          *(dword **)(lVar17 + -0xe0) = in_stack_00000408;
                          *puVar37 = in_stack_00000400;
                          *(dword **)(lVar17 + -0xd0) = in_stack_00000418;
                          *(dword **)(lVar17 + -0xd8) = in_stack_00000410;
                          *(dword **)(lVar17 + -0xc0) = in_stack_00000428;
                          *(dword **)(lVar17 + -200) = in_stack_00000420;
                          *(undefined8 *)(lVar17 + -0xb0) = in_stack_00000438;
                          *(undefined8 *)(lVar17 + -0xb8) = in_stack_00000430;
                          if ((in_stack_000001c8 & 0x10000000000) != 0) goto code_r0x00569860;
                          goto code_r0x005698d4;
                        }
                        in_stack_00000078 = &UNK_009ee728;
                      }
                    }
                  }
                  else if (lVar24 == 0) {
                    in_stack_00000078 = &UNK_009ee740;
                  }
                  else {
                    lVar28 = *(long *)(unaff_x29 + -0xd8);
                    if (*(long *)(lVar28 + 0x18) == 0xf) {
                      puVar37 = (undefined8 *)func_0x00187bd0(0x40,8);
                      in_stack_00000248 = in_stack_000001b8;
                      in_stack_00000240 = in_stack_000001b0;
                      in_stack_00000238 = in_stack_000001a8;
                      pdVar42 = uStack00000000000001a0;
                      pdVar48 = in_stack_00000198;
                      pdVar47 = in_stack_00000190;
                      pdVar38 = in_stack_00000188;
                      pdVar44 = uStack0000000000000180;
                      if (puVar37 == (undefined8 *)0x0) {
                        func_0x007a1f18(8,0x40);
                      }
                      else {
                        func_0x005af248(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
                        puVar37[1] = in_stack_00000408;
                        *puVar37 = in_stack_00000400;
                        puVar37[3] = in_stack_00000418;
                        puVar37[2] = in_stack_00000410;
                        puVar37[5] = in_stack_00000428;
                        puVar37[4] = in_stack_00000420;
                        puVar37[7] = in_stack_00000438;
                        puVar37[6] = in_stack_00000430;
                        lVar17 = *(long *)(lVar28 + 0x48) + 1;
                        lVar27 = *(long *)(lVar28 + 0x40);
                        while (lVar17 = lVar17 + -1, lVar17 != 0) {
                          func_0x00553cb8(lVar27);
                          lVar27 = lVar27 + 0x40;
                        }
                        if (*(long *)(lVar28 + 0x38) != 0) {
                          func_0x00187bd4(*(undefined8 *)(lVar28 + 0x40),
                                          *(long *)(lVar28 + 0x38) << 6,8);
                        }
                        *(undefined8 *)(lVar28 + 0x38) = 1;
                        *(undefined8 **)(lVar28 + 0x40) = puVar37;
                        *(undefined8 *)(lVar28 + 0x48) = 1;
                        if ((in_stack_000001c8 & 0x10000000000) == 0) {
code_r0x005698d4:
                          if ((uVar19 < *(ulong *)(unaff_x20 + 0x28)) &&
                             (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + uVar19 * 0x20),
                             *plVar33 != -0x8000000000000000)) {
                            if (plVar33[2] != 0) {
                              lVar17 = plVar33[2] + -1;
                              plVar33[2] = lVar17;
                              _memmove(auStack_7ffffffe + 0x8000020e,plVar33[1] + lVar17 * 0x108,
                                       0x108);
                              if (pdVar48 != (dword *)((long)&segment_command_00000020.cmd + 1)) {
                                func_0x00564f24(auStack_7ffffffe + 0x8000020e);
                              }
                            }
                            pdVar44 = *(dword **)(unaff_x29 + -0xe0);
                            pdVar41 = *(dword **)(unaff_x29 + -0xd8);
                            uVar19 = *(ulong *)(unaff_x29 + -0xd0);
                            lVar17 = plVar33[2];
                            if ((ulong)(*plVar33 - lVar17) < uVar19) {
                              func_0x007abb04(plVar33,lVar17,uVar19,8,0x108);
                              lVar17 = plVar33[2];
                            }
                            _memcpy(plVar33[1] + lVar17 * 0x108,pdVar41,uVar19 * 0x108);
                            plVar33[2] = lVar17 + uVar19;
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
                            pdVar43 = pdVar41;
                            pdVar45 = pdVar41;
                            goto code_r0x005676c0;
                          }
                          in_stack_00000070 = &UNK_009ee7a0;
                        }
                        else {
code_r0x00569860:
                          if ((lVar24 != 0) && (lVar28 = lVar28 + lVar24 * 0x108, lVar28 != 0x108))
                          {
                            puVar37 = (undefined8 *)(lVar28 + -0xe8);
                            if (*(long *)(lVar28 + -0xf0) == 0x10 && puVar37 != (undefined8 *)0x0) {
                              func_0x00566040(auStack_7ffffffe + 0x8000020e,puVar37);
                              func_0x005cb804(auStack_7ffffffe + 0x8000020e,0);
                              func_0x005cb1c8(auStack_7ffffffe + 0x8000020e);
                              func_0x005649d4(puVar37);
                              *(dword **)(lVar28 + -0xe0) = pdVar38;
                              *puVar37 = pdVar44;
                              *(dword **)(lVar28 + -0xd0) = pdVar48;
                              *(dword **)(lVar28 + -0xd8) = pdVar47;
                              *(dword **)(lVar28 + -0xc0) = in_stack_00000238;
                              *(dword **)(lVar28 + -200) = pdVar42;
                              *(undefined8 *)(lVar28 + -0xb0) = in_stack_00000248;
                              *(undefined8 *)(lVar28 + -0xb8) = in_stack_00000240;
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
                puVar12 = &UNK_009ee6f8;
              }
            }
            else {
              puVar12 = &UNK_009ee6b0;
            }
            func_0x007a23bc(puVar12);
          }
          else {
            puVar13 = &UNK_009ee7b8;
            puVar12 = &UNK_008abf8a;
            uVar35 = 0x2e;
code_r0x0056a11c:
            func_0x007a247c(puVar12,uVar35,puVar13);
          }
          goto code_r0x0056a5ec;
        }
      }
    }
code_r0x005676c0:
    bVar7 = func_0x0056c534();
    unaff_w27 = unaff_w27 | bVar7;
    auVar46 = func_0x0058c2d4(&uStack0000000000000098,unaff_x20 + 0x18);
    uVar19 = auVar46._8_8_;
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
    unaff_x19 = uVar19 & 0xffffffff;
    if ((*(ulong *)(unaff_x20 + 0x28) <= unaff_x19) ||
       (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
       *plVar33 == -0x8000000000000000)) {
      puVar12 = &UNK_009ee5c0;
      goto code_r0x0056a0b0;
    }
    if (((plVar33[2] != 0) && (lVar17 = plVar33[1] + plVar33[2] * 0x108, lVar17 != 0x108)) &&
       (*(long *)(lVar17 + -0xf0) == 0x10)) {
      puVar37 = (undefined8 *)(lVar17 + -0xe8);
      puVar39 = (undefined8 *)(lVar17 + -0xe0);
      if (puVar39 == (undefined8 *)0x0 || *(long *)(lVar17 + -0xe8) != 8) {
        if (((puVar39 == (undefined8 *)0x0 || *(long *)(lVar17 + -0xe8) != 9) ||
            (*(long *)*puVar39 != 6)) || (plVar33 = *(long **)(lVar17 + -0xd8), *plVar33 == 6))
        goto code_r0x005679b4;
        puVar9 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar9 == (undefined8 *)0x0) goto code_r0x0056a134;
        func_0x00566040(auStack_7ffffffe + 0x8000020e,plVar33);
        puVar9[1] = pdVar43;
        *puVar9 = pdVar41;
        puVar9[3] = pdVar45;
        puVar9[2] = pdVar44;
        puVar9[5] = in_stack_00000238;
        puVar9[4] = pdVar42;
        puVar9[7] = in_stack_00000248;
        puVar9[6] = in_stack_00000240;
        uStack00000000000000f8 = (dword *)puVar9[1];
        uStack00000000000000f0 = (dword *)*puVar9;
        in_stack_00000108 = (dword *)puVar9[3];
        in_stack_00000100 = (dword *)puVar9[2];
        in_stack_00000118 = (dword *)puVar9[5];
        in_stack_00000110 = (dword *)puVar9[4];
        in_stack_00000128 = puVar9[7];
        in_stack_00000120 = puVar9[6];
        uVar35 = *puVar39;
        puVar10 = (undefined8 *)func_0x00187bd0(0x40,8);
        if (puVar10 != (undefined8 *)0x0) {
          func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar35);
          puVar10[1] = pdVar43;
          *puVar10 = pdVar41;
          puVar10[3] = pdVar45;
          puVar10[2] = pdVar44;
          puVar10[5] = in_stack_00000238;
          puVar10[4] = pdVar42;
          puVar10[7] = in_stack_00000248;
          puVar10[6] = in_stack_00000240;
          in_stack_00000188 = (dword *)puVar10[1];
          uStack0000000000000180 = (dword *)*puVar10;
          in_stack_00000198 = (dword *)puVar10[3];
          in_stack_00000190 = (dword *)puVar10[2];
          in_stack_000001a8 = (dword *)puVar10[5];
          uStack00000000000001a0 = (dword *)puVar10[4];
          in_stack_000001b8 = puVar10[7];
          in_stack_000001b0 = puVar10[6];
          uVar49 = *(byte *)(lVar17 + -0xd0) - 7;
          if (uVar49 < 6) {
            func_0x005c1d84(unaff_x29 + -0xa0,&uStack00000000000000f0,&uStack0000000000000180,
                            0xb0c090a0807 >> (((ulong)uVar49 & 7) << 3));
            *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0x90);
            func_0x005649d4(puVar37);
            *puVar37 = 9;
            *(dword **)(lVar17 + -0xd8) = in_stack_00000408;
            *puVar39 = in_stack_00000400;
            *(undefined8 *)(lVar17 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xd0);
            func_0x00187bd4(puVar10,0x40,8);
            func_0x00187bd4(puVar9,0x40,8);
            unaff_w27 = 1;
            uVar16 = *(ulong *)(unaff_x20 + 0x28);
            in_stack_000003c0 = in_stack_00000400;
            in_stack_000003c8 = in_stack_00000408;
            goto joined_r0x005678a4;
          }
          func_0x005649d4(&uStack0000000000000180);
          func_0x005649d4(&uStack00000000000000f0);
          func_0x00187bd4(puVar10,0x40,8);
          func_0x00187bd4(puVar9,0x40,8);
          uVar16 = *(ulong *)(unaff_x20 + 0x28);
          if (unaff_x19 < uVar16) goto code_r0x005679c0;
code_r0x0056a270:
          puVar12 = &UNK_009ee830;
          goto code_r0x0056a0b0;
        }
        func_0x007a1f18(8,0x40);
        goto code_r0x0056a5ec;
      }
      if (*(char *)(lVar17 + -0xd8) != '\0') goto code_r0x005679b4;
      uVar35 = *puVar39;
      puVar39 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar39 != (undefined8 *)0x0) {
        func_0x00566040(auStack_7ffffffe + 0x8000020e,uVar35);
        puVar39[1] = pdVar43;
        *puVar39 = pdVar41;
        puVar39[3] = pdVar45;
        puVar39[2] = pdVar44;
        puVar39[5] = in_stack_00000238;
        puVar39[4] = pdVar42;
        puVar39[7] = in_stack_00000248;
        puVar39[6] = in_stack_00000240;
        pdVar43 = (dword *)puVar39[1];
        pdVar41 = (dword *)*puVar39;
        pdVar45 = (dword *)puVar39[3];
        pdVar44 = (dword *)puVar39[2];
        in_stack_00000238 = (dword *)puVar39[5];
        pdVar42 = (dword *)puVar39[4];
        in_stack_00000248 = puVar39[7];
        in_stack_00000240 = puVar39[6];
        func_0x005649d4(puVar37);
        *(dword **)(lVar17 + -0xe0) = pdVar43;
        *puVar37 = pdVar41;
        *(dword **)(lVar17 + -0xd0) = pdVar45;
        *(dword **)(lVar17 + -0xd8) = pdVar44;
        *(dword **)(lVar17 + -0xc0) = in_stack_00000238;
        *(dword **)(lVar17 + -200) = pdVar42;
        *(undefined8 *)(lVar17 + -0xb0) = in_stack_00000248;
        *(undefined8 *)(lVar17 + -0xb8) = in_stack_00000240;
        func_0x00187bd4(puVar39,0x40,8);
        func_0x00584d50(auStack_7ffffffe + 0x8000020e);
        if (pdVar41 != (dword *)0x0) {
          if ((int)pdVar44 == (int)in_stack_00000238) {
            func_0x007a247c(&UNK_008ade0c,0x54,&UNK_009f1480);
          }
          else {
            if (((ulong)pdVar44 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) {
              plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                ((ulong)pdVar44 & 0xffffffff) * (unaff_x25 & 0xffffffff));
              if (*plVar33 != -0x8000000000000000) {
                if ((((ulong)in_stack_00000238 & 0xffffffff) < *(ulong *)(unaff_x20 + 0x40)) &&
                   (plVar14 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                      ((ulong)in_stack_00000238 & 0xffffffff) *
                                      (unaff_x25 & 0xffffffff)), *plVar14 != -0x8000000000000000)) {
                  *(undefined1 *)(plVar33 + 3) = 2;
                  unaff_w27 = 1;
                  *(undefined1 *)(plVar14 + 3) = 1;
                  goto code_r0x005679b4;
                }
                in_stack_00000038 = &UNK_009f14b0;
              }
            }
            func_0x007a23bc(in_stack_00000038);
          }
          goto code_r0x0056a5ec;
        }
        puVar12 = &UNK_009ee5d8;
        goto code_r0x0056a0b0;
      }
code_r0x0056a134:
      func_0x007a1f18(8,0x40);
      goto code_r0x0056a5ec;
    }
code_r0x005679b4:
    uVar16 = *(ulong *)(unaff_x20 + 0x28);
joined_r0x005678a4:
    if (uVar16 <= unaff_x19) goto code_r0x0056a270;
code_r0x005679c0:
    plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20);
    if (*plVar33 == -0x8000000000000000) goto code_r0x0056a270;
  } while (((plVar33[2] == 0) || (lVar17 = plVar33[1] + plVar33[2] * 0x108, lVar17 == 0x108)) ||
          (*(long *)(lVar17 + -0xf0) != 0x10));
  func_0x00584d50(auStack_7ffffffe + 0x8000020e);
  if (pdVar41 == (dword *)0x0) {
    puVar12 = &UNK_009ee848;
code_r0x0056a0b0:
    func_0x007a23bc(puVar12);
    goto code_r0x0056a5ec;
  }
  uVar21 = (ulong)pdVar44 & 0xffffffff;
  uVar49 = (uint)((ulong)pdVar43 >> 0x20);
  unaff_x21 = (ulong)uVar49;
  uVar52 = (uint)((ulong)pdVar42 >> 0x20);
  in_stack_00000088 = (ulong)uVar52;
  uVar16 = (ulong)in_stack_00000238 & 0xffffffff;
  if (uVar49 == uVar52) {
    pdVar47 = in_stack_00000360;
    pdVar48 = in_stack_00000368;
    pdVar51 = in_stack_00000370;
    pdVar54 = in_stack_00000378;
    pdVar55 = in_stack_00000380;
    pdVar56 = in_stack_00000388;
    uVar35 = in_stack_00000390;
    uVar57 = in_stack_00000398;
    if (*(long *)(pdVar41 + 4) != 0) {
      plVar14 = *(long **)(pdVar41 + 2) + *(long *)(pdVar41 + 4) * 9;
      plVar33 = *(long **)(pdVar41 + 2);
      do {
        plVar23 = plVar33 + 9;
        plVar25 = (long *)*plVar33;
        lVar17 = *(long *)(pdVar45 + 4) * 0x48;
        plVar31 = *(long **)(pdVar45 + 2) + -8;
        while (lVar17 != 0) {
          plVar30 = plVar31 + 8;
          plVar31 = plVar31 + 9;
          lVar17 = lVar17 + -0x48;
          if (plVar25 == (long *)*plVar30) goto code_r0x00567b28;
        }
        plVar33 = plVar23;
      } while (plVar23 != plVar14);
    }
code_r0x00567a98:
    bVar6 = false;
    pdVar50 = pdVar45;
    pdVar11 = in_stack_00000238;
    uVar36 = in_stack_00000240;
    uVar53 = in_stack_00000248;
    goto code_r0x00569028;
  }
  lVar17 = *(long *)(unaff_x20 + 0x38);
  uVar18 = *(ulong *)(unaff_x20 + 0x40);
  uVar26 = *(ulong *)(unaff_x20 + 0x28);
  if (*(long *)(pdVar41 + 4) != 0) {
code_r0x00567ab4:
    in_stack_00000090 = 0;
    lVar24 = *(long *)(pdVar45 + 4);
    in_stack_00000210 = pdVar41;
    in_stack_00000218 = pdVar43;
    pdVar2 = pdVar44;
    pdVar38 = pdVar45;
    in_stack_00000230 = pdVar42;
    goto joined_r0x00567abc;
  }
  if ((unaff_x21 < uVar26) &&
     (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
     *plVar33 != -0x8000000000000000)) {
    uVar20 = (ulong)*(uint *)((long)plVar33 + 0x1c);
    if (uVar18 >> 0x20 == 0) goto code_r0x00567f04;
code_r0x00567e1c:
    if (*(uint *)(lVar17 + 0x2ffffffff0) < uVar18) goto code_r0x00567ab4;
  }
  else {
    uVar20 = 0xffffffff;
    if (uVar18 >> 0x20 != 0) goto code_r0x00567e1c;
code_r0x00567f04:
    do {
      if (uVar18 <= uVar20) goto code_r0x00567ab4;
      lVar24 = lVar17 + uVar20 * unaff_x25;
      uVar20 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
    if (0xffffffff < uVar18) goto code_r0x00567ab4;
  }
  while (uVar20 < uVar18) {
    lVar24 = lVar17 + uVar20 * unaff_x25;
    uVar20 = (ulong)*(uint *)(lVar24 + 0x24);
    if (*(int *)(lVar24 + 0x28) != -1) goto code_r0x00567ab4;
  }
  lVar17 = *(long *)(pdVar45 + 2);
  lVar24 = *(long *)(pdVar45 + 4);
  in_stack_00000188 = _UNK_009efac8;
  uStack0000000000000180 = _UNK_009efac0;
  in_stack_00000198 = _UNK_009efad8;
  in_stack_00000190 = _UNK_009efad0;
  if (lVar24 != 0) {
    func_0x007a5f8c(&uStack0000000000000180,lVar24,&uStack00000000000001a0,1);
  }
  func_0x00585744(lVar17,lVar17 + lVar24 * 0x48,&uStack0000000000000180);
  in_stack_00000230 = in_stack_00000198;
  pdVar38 = in_stack_00000190;
  pdVar2 = in_stack_00000188;
  in_stack_00000218 = uStack0000000000000180;
  in_stack_00000210 = (dword *)CONCAT44(uVar52,uVar49);
  func_0x0056b78c(&uStack00000000000000f0);
  uVar53 = in_stack_00000170;
  uVar36 = in_stack_00000168;
  pdVar11 = in_stack_00000160;
  pdVar42 = in_stack_00000158;
  pdVar50 = in_stack_00000150;
  pdVar44 = in_stack_00000148;
  pdVar43 = in_stack_00000140;
  uVar57 = in_stack_00000128;
  uVar35 = in_stack_00000120;
  pdVar56 = in_stack_00000118;
  pdVar55 = in_stack_00000110;
  pdVar54 = in_stack_00000108;
  pdVar51 = in_stack_00000100;
  pdVar48 = uStack00000000000000f8;
  pdVar47 = uStack00000000000000f0;
  lVar17 = *(long *)(unaff_x20 + 0x38);
  uVar18 = *(ulong *)(unaff_x20 + 0x40);
  uVar26 = *(ulong *)(unaff_x20 + 0x28);
  if (uStack00000000000000f0 != &MACH_HEADER.filetype) {
    puVar37 = (undefined8 *)CONCAT44(uStack0000000000000134,uStack0000000000000130);
    pdVar41 = (dword *)CONCAT26(uStack0000000000000138._6_2_,
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
    plVar33 = (long *)*puVar37;
    lVar17 = *plVar33;
    *plVar33 = lVar17 + 1;
    if (lVar17 < 0) {
      func_0x007a05dc();
      goto code_r0x0056a5ec;
    }
    *(undefined8 *)(unaff_x29 + -0xf8) = *puVar37;
    in_stack_00000188 = pdVar48;
    uStack0000000000000180 = pdVar47;
    in_stack_00000198 = pdVar54;
    in_stack_00000190 = pdVar51;
    in_stack_000001a8 = pdVar56;
    uStack00000000000001a0 = pdVar55;
    in_stack_000001b8 = uVar57;
    in_stack_000001b0 = uVar35;
    func_0x0056b044(unaff_x29 + -0xa0,*(undefined8 *)(unaff_x20 + 0x20),
                    *(undefined8 *)(unaff_x20 + 0x28),uVar19,&uStack0000000000000180,
                    auStack_7ffffffe + 0x8000020e);
    in_stack_000003c0 = pdVar41;
    in_stack_000003c8 = pdVar43;
    in_stack_000003d8 = pdVar50;
    in_stack_000003e0 = pdVar42;
    in_stack_000003e8 = pdVar11;
    in_stack_000003f0 = uVar36;
    in_stack_000003f8 = uVar53;
    if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
      lVar17 = **(long **)(unaff_x29 + -0xf8);
      **(long **)(unaff_x29 + -0xf8) = lVar17 + 1;
      uStack0000000000000180 = in_stack_00000400;
      in_stack_00000188 = in_stack_00000408;
      in_stack_00000190 = in_stack_00000410;
      in_stack_00000198 = in_stack_00000418;
      uStack00000000000001a0 = in_stack_00000420;
      in_stack_000001a8 = in_stack_00000428;
      in_stack_000001b0 = in_stack_00000430;
      in_stack_000001b8 = in_stack_00000438;
      if (lVar17 < 0) {
code_r0x0056a254:
        func_0x007a05dc();
      }
      else {
        uVar15 = *(undefined8 *)(unaff_x29 + -0xf8);
        if (((ulong)dStack000000000000000c < *(ulong *)(unaff_x20 + 0x40)) &&
           (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                              (ulong)dStack000000000000000c * (unaff_x25 & 0xffffffff)),
           *plVar33 != -0x8000000000000000)) {
          if (plVar33[2] == 0) {
            func_0x007a2570(0,0,&UNK_009ee890);
          }
          else {
            lVar17 = plVar33[1];
            func_0x005649d4(lVar17 + 8);
            *(undefined8 *)(lVar17 + 0x40) = uVar53;
            *(undefined8 *)(lVar17 + 0x38) = uVar36;
            *(dword **)(lVar17 + 0x30) = pdVar11;
            *(dword **)(lVar17 + 0x28) = pdVar42;
            *(dword **)(lVar17 + 0x20) = pdVar50;
            *(dword **)(lVar17 + 0x18) = pdVar44;
            *(undefined8 *)(lVar17 + 0x10) = uVar15;
            *(undefined8 *)(lVar17 + 8) = 0;
            lVar17 = **(long **)(unaff_x29 + -0xf8);
            **(long **)(unaff_x29 + -0xf8) = lVar17 + 1;
            if (lVar17 < 0) goto code_r0x0056a254;
            in_stack_00000320 = *(dword **)(unaff_x29 + -0xf8);
            if ((uVar16 < *(ulong *)(unaff_x20 + 0x40)) &&
               (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar16 * (unaff_x25 & 0xffffffff)),
               *plVar33 != -0x8000000000000000)) {
              if (plVar33[2] == 0) {
                func_0x007a2570(0,0,&UNK_009ee8c0);
              }
              else {
                lVar17 = plVar33[1];
                func_0x005649d4(lVar17 + 8);
                *(undefined8 *)(lVar17 + 0x40) = uVar53;
                *(undefined8 *)(lVar17 + 0x38) = uVar36;
                *(dword **)(lVar17 + 0x30) = pdVar11;
                *(dword **)(lVar17 + 0x28) = pdVar42;
                *(dword **)(lVar17 + 0x20) = pdVar50;
                *(dword **)(lVar17 + 0x18) = pdVar44;
                *(dword **)(lVar17 + 0x10) = in_stack_00000320;
                *(undefined8 *)(lVar17 + 8) = 0;
                func_0x0056c050();
                uVar16 = *(ulong *)(unaff_x20 + 0x28);
                if ((unaff_x21 < uVar16) &&
                   (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
                   *plVar33 != -0x8000000000000000)) {
                  uVar21 = (ulong)*(uint *)((long)plVar33 + 0x1c);
                  uVar18 = *(ulong *)(unaff_x20 + 0x40);
                }
                else {
                  uVar21 = 0xffffffff;
                  uVar18 = *(ulong *)(unaff_x20 + 0x40);
                }
                if (uVar18 >> 0x20 == 0) {
code_r0x00568770:
                  if (uVar21 < uVar18) goto code_r0x00568778;
                  func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,unaff_x21);
                  pdVar38 = (dword *)((long)pdVar44 + 1);
                  pdVar41 = in_stack_00000320;
                  while (pdVar38 = (dword *)((long)pdVar38 + -1), pdVar38 != (dword *)0x0) {
                    func_0x00554164(pdVar41);
                    pdVar41 = pdVar41 + 0x42;
                  }
                  uVar16 = *(ulong *)(unaff_x20 + 0x28);
                }
code_r0x0056888c:
                if ((unaff_x19 < uVar16) &&
                   (puVar32 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
                   *puVar32 != 0x8000000000000000)) {
                  if ((puVar32[2] == 0) ||
                     (lVar17 = puVar32[1] + puVar32[2] * 0x108, lVar17 == 0x108)) {
                    in_stack_00000060 = &UNK_009ee8f0;
                    goto code_r0x0056a2c4;
                  }
                  if (lVar17 == 0xe8 || *(long *)(lVar17 + -0xf0) != 0x10) {
                    in_stack_00000060 = &UNK_009ee908;
                    goto code_r0x0056a2c4;
                  }
                  lVar24 = **(long **)(unaff_x29 + -0xf8);
                  **(long **)(unaff_x29 + -0xf8) = lVar24 + 1;
                  if (lVar24 < 0) goto code_r0x0056a254;
                  uVar36 = *(undefined8 *)(unaff_x29 + -0xf8);
                  func_0x005649d4();
                  *(undefined8 *)(lVar17 + -0xe8) = 0;
                  *(undefined8 *)(lVar17 + -0xe0) = uVar36;
                  uVar16 = puVar32[2];
                  pdVar11 = (dword *)func_0x00187bd0(0x18,8);
                  if (pdVar11 == (dword *)0x0) {
                    func_0x007a1f18(8,0x18);
                  }
                  else {
                    uVar36 = *(undefined8 *)(unaff_x29 + -0xf8);
                    *(undefined8 *)pdVar11 = 0x8000000000000000;
                    *(undefined8 *)(pdVar11 + 2) = uVar36;
                    pdVar38 = (dword *)((long)&MACH_HEADER.magic + 1);
                    in_stack_00000220 = (dword *)((long)&MACH_HEADER.magic + 1);
                    in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
                    if (in_stack_00000250 == (undefined8 *)0x0) {
                      func_0x007a1f18(8,0x40);
                    }
                    else {
                      uVar16 = uVar16 - 1;
                      in_stack_00000250[1] = in_stack_00000408;
                      *in_stack_00000250 = in_stack_00000400;
                      in_stack_00000250[3] = in_stack_00000418;
                      in_stack_00000250[2] = in_stack_00000410;
                      in_stack_00000250[5] = in_stack_00000428;
                      in_stack_00000250[4] = in_stack_00000420;
                      in_stack_00000250[7] = in_stack_00000438;
                      in_stack_00000250[6] = in_stack_00000430;
                      uVar21 = puVar32[2];
                      if (uVar16 <= uVar21) {
                        in_stack_00000328 = pdVar11;
                        if (uVar21 == *puVar32) {
                          func_0x005bd0a4(puVar32,&UNK_009ee920);
                        }
                        goto code_r0x00567da8;
                      }
                      func_0x007a204c(uVar16,uVar21,&UNK_009ee920);
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
    lVar17 = **(long **)(unaff_x29 + -0xf8);
    **(long **)(unaff_x29 + -0xf8) = lVar17 + -1;
    LORelease();
    if (lVar17 == 1) {
      func_0x005d2ac4(unaff_x29 + -0xf8);
    }
    bVar6 = false;
    in_stack_000003d0 = pdVar44;
    if (*(long *)(unaff_x29 + -0xa0) != 0xc) {
      func_0x005649d4(unaff_x29 + -0xa0);
    }
    goto code_r0x00569028;
  }
  in_stack_00000090 = 1;
  lVar24 = *(long *)(pdVar45 + 4);
joined_r0x00567abc:
  if (lVar24 != 0) {
code_r0x00567ac0:
    unaff_w23 = 0;
    pdVar44 = pdVar2;
    goto joined_r0x00567ac8;
  }
  if ((in_stack_00000088 < uVar26) &&
     (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
     *plVar33 != -0x8000000000000000)) {
    uVar16 = (ulong)*(uint *)((long)plVar33 + 0x1c);
    if (uVar18 >> 0x20 == 0) goto code_r0x00568028;
code_r0x00568004:
    if (*(uint *)(lVar17 + 0x2ffffffff0) < uVar18) goto code_r0x00567ac0;
  }
  else {
    uVar16 = 0xffffffff;
    if (uVar18 >> 0x20 != 0) goto code_r0x00568004;
code_r0x00568028:
    do {
      if (uVar18 <= uVar16) goto code_r0x00567ac0;
      lVar24 = lVar17 + uVar16 * unaff_x25;
      uVar16 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
    if (0xffffffff < uVar18) goto code_r0x00567ac0;
  }
  while (uVar16 < uVar18) {
    lVar24 = lVar17 + uVar16 * unaff_x25;
    uVar16 = (ulong)*(uint *)(lVar24 + 0x24);
    if (*(int *)(lVar24 + 0x28) != -1) goto code_r0x00567ac0;
  }
  lVar17 = *(long *)(pdVar41 + 2);
  lVar24 = *(long *)(pdVar41 + 4);
  uStack0000000000000180 = _UNK_009efac0;
  in_stack_00000188 = _UNK_009efac8;
  in_stack_00000190 = _UNK_009efad0;
  in_stack_00000198 = _UNK_009efad8;
  if (lVar24 != 0) {
    func_0x007a5f8c(&uStack0000000000000180,lVar24,&uStack00000000000001a0,1);
  }
  func_0x00585744(lVar17,lVar17 + lVar24 * 0x48,&uStack0000000000000180);
  in_stack_00000230 = in_stack_00000198;
  pdVar38 = in_stack_00000190;
  pdVar43 = in_stack_00000188;
  in_stack_00000218 = uStack0000000000000180;
  in_stack_00000210 = (dword *)CONCAT44(uVar49,uVar52);
  func_0x0056b78c(&uStack0000000000000180);
  puVar37 = _uStack00000000000001c0;
  uVar57 = in_stack_000001b8;
  uVar35 = in_stack_000001b0;
  pdVar54 = in_stack_000001a8;
  pdVar51 = uStack00000000000001a0;
  pdVar42 = in_stack_00000198;
  pdVar44 = in_stack_00000190;
  pdVar48 = in_stack_00000188;
  pdVar47 = uStack0000000000000180;
  lVar17 = *(long *)(unaff_x20 + 0x38);
  uVar18 = *(ulong *)(unaff_x20 + 0x40);
  uVar26 = *(ulong *)(unaff_x20 + 0x28);
  if (uStack0000000000000180 != &MACH_HEADER.filetype) {
    in_stack_00000368 = (dword *)in_stack_00000080[1];
    in_stack_00000360 = (dword *)*in_stack_00000080;
    in_stack_00000378 = (dword *)in_stack_00000080[3];
    in_stack_00000370 = (dword *)in_stack_00000080[2];
    in_stack_00000388 = (dword *)in_stack_00000080[5];
    in_stack_00000380 = (dword *)in_stack_00000080[4];
    in_stack_00000398 = in_stack_00000080[7];
    in_stack_00000390 = in_stack_00000080[6];
    func_0x0055b13c(unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e,&UNK_009f0678);
    if (*(long *)(unaff_x29 + -0x90) == 1) {
      uStack0000000000000008 = *(uint *)(*(long **)(unaff_x29 + -0x98) + 2);
      bVar6 = **(long **)(unaff_x29 + -0x98) == 0;
    }
    else {
      bVar6 = true;
    }
    if (*(long *)(unaff_x29 + -0xa0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x98),*(long *)(unaff_x29 + -0xa0) * 0x18,8);
    }
    if (bVar6) {
      func_0x007a23bc(&UNK_009ee938);
      goto code_r0x0056a5ec;
    }
    plVar33 = (long *)*puVar37;
    lVar17 = *plVar33;
    *plVar33 = lVar17 + 1;
    if (lVar17 < 0) {
      func_0x007a05dc();
      goto code_r0x0056a5ec;
    }
    in_stack_00000218 = (dword *)*puVar37;
    func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                    *(undefined8 *)(unaff_x20 + 0x28),uVar19,unaff_x29 + -0xa0,
                    auStack_7ffffffe + 0x8000020e);
    bVar6 = *(long *)(unaff_x29 + -0xe0) != 0xc;
    in_stack_00000220 = pdVar44;
    in_stack_00000228 = pdVar42;
    in_stack_00000340 = pdVar51;
    in_stack_00000348 = pdVar54;
    in_stack_00000350 = uVar35;
    in_stack_00000358 = uVar57;
    if (bVar6) {
      lVar17 = *(long *)in_stack_00000218;
      *(long *)in_stack_00000218 = lVar17 + 1;
      if (lVar17 < 0) {
code_r0x0056a25c:
        func_0x007a05dc();
        goto code_r0x0056a5ec;
      }
      if ((*(ulong *)(unaff_x20 + 0x40) <= uVar21) ||
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar21 * (unaff_x25 & 0xffffffff)),
         *plVar33 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009ee950);
        goto code_r0x0056a5ec;
      }
      if (plVar33[2] == 0) {
        func_0x007a2570(0,0,&UNK_009ee968);
        goto code_r0x0056a5ec;
      }
      lVar17 = plVar33[1];
      func_0x005649d4(lVar17 + 8);
      *(undefined8 *)(lVar17 + 0x40) = uVar57;
      *(undefined8 *)(lVar17 + 0x38) = uVar35;
      *(dword **)(lVar17 + 0x30) = pdVar54;
      *(dword **)(lVar17 + 0x28) = pdVar51;
      *(dword **)(lVar17 + 0x20) = pdVar42;
      *(dword **)(lVar17 + 0x18) = pdVar44;
      *(dword **)(lVar17 + 0x10) = in_stack_00000218;
      *(undefined8 *)(lVar17 + 8) = 0;
      lVar17 = *(long *)in_stack_00000218;
      *(long *)in_stack_00000218 = lVar17 + 1;
      if (lVar17 < 0) goto code_r0x0056a25c;
      if ((*(ulong *)(unaff_x20 + 0x40) <= (ulong)uStack0000000000000008) ||
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                            (ulong)uStack0000000000000008 * (unaff_x25 & 0xffffffff)),
         *plVar33 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009ee980);
        goto code_r0x0056a5ec;
      }
      if (plVar33[2] == 0) {
        func_0x007a2570(0,0,&UNK_009ee998);
        goto code_r0x0056a5ec;
      }
      lVar17 = plVar33[1];
      func_0x005649d4(lVar17 + 8);
      *(undefined8 *)(lVar17 + 0x40) = uVar57;
      *(undefined8 *)(lVar17 + 0x38) = uVar35;
      *(dword **)(lVar17 + 0x30) = pdVar54;
      *(dword **)(lVar17 + 0x28) = pdVar51;
      *(dword **)(lVar17 + 0x20) = pdVar42;
      *(dword **)(lVar17 + 0x18) = pdVar44;
      *(dword **)(lVar17 + 0x10) = in_stack_00000218;
      *(undefined8 *)(lVar17 + 8) = 0;
      func_0x0056c050();
      uVar16 = *(ulong *)(unaff_x20 + 0x28);
      if ((in_stack_00000088 < uVar16) &&
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
         *plVar33 != -0x8000000000000000)) {
        uVar21 = (ulong)*(uint *)((long)plVar33 + 0x1c);
        uVar18 = *(ulong *)(unaff_x20 + 0x40);
      }
      else {
        uVar21 = 0xffffffff;
        uVar18 = *(ulong *)(unaff_x20 + 0x40);
      }
      if (uVar18 >> 0x20 == 0) {
code_r0x005687e4:
        if (uVar21 < uVar18) goto code_r0x005687ec;
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_stack_00000088);
        pdVar38 = (dword *)((long)pdVar44 + 1);
        pdVar41 = in_stack_00000218;
        while (pdVar38 = (dword *)((long)pdVar38 + -1), pdVar38 != (dword *)0x0) {
          func_0x00554164(pdVar41);
          pdVar41 = pdVar41 + 0x42;
        }
        uVar16 = *(ulong *)(unaff_x20 + 0x28);
      }
code_r0x005689cc:
      if ((uVar16 <= unaff_x19) ||
         (puVar32 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
         *puVar32 == 0x8000000000000000)) {
code_r0x0056a314:
        func_0x007a23bc(in_stack_00000058);
        goto code_r0x0056a5ec;
      }
      if ((puVar32[2] == 0) || (lVar17 = puVar32[1] + puVar32[2] * 0x108, lVar17 == 0x108)) {
        in_stack_00000058 = &UNK_009ee9c8;
        goto code_r0x0056a314;
      }
      if (lVar17 == 0xe8 || *(long *)(lVar17 + -0xf0) != 0x10) {
        in_stack_00000058 = &UNK_009ee9e0;
        goto code_r0x0056a314;
      }
      lVar24 = *(long *)in_stack_00000218;
      *(long *)in_stack_00000218 = lVar24 + 1;
      if (lVar24 < 0) goto code_r0x0056a25c;
      func_0x005649d4();
      *(undefined8 *)(lVar17 + -0xe8) = 0;
      *(dword **)(lVar17 + -0xe0) = in_stack_00000218;
      uVar16 = puVar32[2];
      puVar37 = (undefined8 *)func_0x00187bd0(0x18,8);
      if (puVar37 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x18);
        goto code_r0x0056a5ec;
      }
      *puVar37 = 0x8000000000000000;
      puVar37[1] = in_stack_00000218;
      *(undefined8 *)(unaff_x29 + -0xf8) = 1;
      *(undefined8 **)(unaff_x29 + -0xf0) = puVar37;
      *(undefined8 *)(unaff_x29 + -0xe8) = 1;
      in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (in_stack_00000250 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
        goto code_r0x0056a5ec;
      }
      uVar16 = uVar16 - 1;
      in_stack_00000250[1] = in_stack_000003c8;
      *in_stack_00000250 = in_stack_000003c0;
      in_stack_00000250[3] = in_stack_000003d8;
      in_stack_00000250[2] = in_stack_000003d0;
      in_stack_00000250[5] = in_stack_000003e8;
      in_stack_00000250[4] = in_stack_000003e0;
      in_stack_00000250[7] = in_stack_000003f8;
      in_stack_00000250[6] = in_stack_000003f0;
      in_stack_00000238 = *(dword **)(unaff_x29 + -0xf0);
      in_stack_00000230 = *(dword **)(unaff_x29 + -0xf8);
      in_stack_00000240 = *(undefined8 *)(unaff_x29 + -0xe8);
      uVar21 = puVar32[2];
      if (uVar21 < uVar16) {
        func_0x007a204c(uVar16,uVar21,&UNK_009ee9f8);
        goto code_r0x0056a5ec;
      }
      if (uVar21 == *puVar32) {
        func_0x005bd0a4(puVar32,&UNK_009ee9f8);
      }
      lVar17 = puVar32[1] + uVar16 * 0x108;
      if (uVar16 <= uVar21 && uVar21 - uVar16 != 0) {
        _memmove(lVar17 + 0x108,lVar17,(uVar21 - uVar16) * 0x108);
      }
      _memcpy(lVar17,auStack_7ffffffe + 0x8000020e,0x108);
      puVar32[2] = uVar21 + 1;
      in_stack_00000210 = (dword *)0x0;
      pdVar38 = (dword *)((long)&MACH_HEADER.filetype + 3);
      in_stack_00000248 = 1;
      in_stack_00000400 = in_stack_000003c0;
      in_stack_00000408 = in_stack_000003c8;
      in_stack_00000410 = in_stack_000003d0;
      in_stack_00000418 = in_stack_000003d8;
      in_stack_00000420 = in_stack_000003e0;
      in_stack_00000428 = in_stack_000003e8;
      in_stack_00000430 = in_stack_000003f0;
      in_stack_00000438 = in_stack_000003f8;
    }
    else {
      lVar17 = *(long *)in_stack_00000218;
      *(long *)in_stack_00000218 = lVar17 + -1;
      LORelease();
      if (lVar17 == 1) {
        func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
      }
      in_stack_00000210 = pdVar47;
      in_stack_00000218 = pdVar48;
      pdVar38 = pdVar42;
      in_stack_00000230 = pdVar51;
      in_stack_00000238 = pdVar54;
      in_stack_00000240 = uVar35;
      in_stack_00000248 = uVar57;
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
    }
    goto code_r0x00569000;
  }
  unaff_w23 = 1;
  pdVar44 = pdVar43;
joined_r0x00567ac8:
  unaff_x28 = uVar19;
  in_stack_00000338 = in_stack_00000228;
  if ((unaff_x21 < uVar26) &&
     (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
     *plVar33 != -0x8000000000000000)) {
    uVar16 = (ulong)*(uint *)((long)plVar33 + 0x1c);
    if (uVar18 >> 0x20 == 0) goto code_r0x00567e40;
code_r0x00567aec:
    if (uVar18 <= *(uint *)(lVar17 + 0x2ffffffff0)) {
code_r0x00567e64:
      do {
        if (uVar18 <= uVar16) {
          if ((unaff_x21 < uVar26) &&
             (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
             *plVar33 != -0x8000000000000000)) {
            uVar16 = (ulong)*(uint *)(plVar33 + 3);
            if (uVar18 <= uVar16) goto code_r0x00568148;
          }
          else {
            uVar16 = 0xffffffff;
            if (uVar18 < 0x100000000) {
code_r0x00568148:
              uVar21 = 0xffffffff;
              goto code_r0x0056814c;
            }
          }
          lVar24 = lVar17 + uVar16 * (unaff_x25 & 0xffffffff);
          uVar16 = (ulong)*(uint *)(lVar24 + 0x20);
          iVar8 = *(int *)(lVar24 + 0x2c);
          uVar21 = 0xffffffff;
          goto code_r0x00568164;
        }
        lVar24 = lVar17 + uVar16 * unaff_x25;
        uVar16 = (ulong)*(uint *)(lVar24 + 0x24);
      } while (*(int *)(lVar24 + 0x28) == -1);
    }
  }
  else {
    uVar16 = 0xffffffff;
    if (uVar18 >> 0x20 != 0) goto code_r0x00567aec;
code_r0x00567e40:
    do {
      if (uVar18 <= uVar16) goto code_r0x00568ec0;
      lVar24 = lVar17 + uVar16 * unaff_x25;
      uVar16 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
    if (uVar18 < 0x100000000) goto code_r0x00567e64;
  }
  goto code_r0x00568ec0;
code_r0x00567b28:
  if (plVar23 == plVar14) goto code_r0x00567b30;
  plVar22 = plVar23 + 9;
  lVar24 = *plVar23;
  lVar17 = *(long *)(pdVar45 + 4) * 0x48;
  plVar30 = *(long **)(pdVar45 + 2);
  while (plVar23 = plVar22, lVar17 != 0) {
    lVar28 = *plVar30;
    lVar17 = lVar17 + -0x48;
    plVar30 = plVar30 + 9;
    if (lVar24 == lVar28) goto code_r0x00567a98;
  }
  goto code_r0x00567b28;
code_r0x00567b30:
  lVar17 = *plVar25;
  *plVar25 = lVar17 + 1;
  if (lVar17 < 0) {
    func_0x007a05dc();
    goto code_r0x0056a5ec;
  }
  in_stack_00000320 = (dword *)*plVar33;
  func_0x00566040(unaff_x29 + -0xe0,plVar33 + 1);
  func_0x00566040(unaff_x29 + -0xa0,plVar31);
  lVar17 = func_0x0056b044(&uStack00000000000000f0,*(undefined8 *)(unaff_x20 + 0x20),
                           *(undefined8 *)(unaff_x20 + 0x28),uVar19,auStack_7ffffffe + 0x8000020e,
                           unaff_x29 + -0xa0);
  pdVar44 = in_stack_000003d0;
  if (uStack00000000000000f0 == &MACH_HEADER.filetype) {
    lVar17 = *(long *)in_stack_00000320;
    *(long *)in_stack_00000320 = lVar17 + -1;
    LORelease();
    if (lVar17 == 1) {
      func_0x005d2ac4(auStack_7ffffffe + 0x8000031e);
    }
    bVar6 = false;
    pdVar41 = in_stack_000003c0;
    pdVar43 = in_stack_000003c8;
    pdVar50 = in_stack_000003d8;
    pdVar42 = in_stack_000003e0;
    pdVar11 = in_stack_000003e8;
    uVar36 = in_stack_000003f0;
    uVar53 = in_stack_000003f8;
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
  lVar24 = *(long *)in_stack_00000320;
  *(long *)in_stack_00000320 = lVar24 + 1;
  if (-1 < lVar24) {
    if ((*(ulong *)(unaff_x20 + 0x40) <= uVar21) ||
       (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar21 * (unaff_x25 & 0xffffffff)),
       *plVar33 == -0x8000000000000000)) {
      func_0x007a23bc(&UNK_009eebc0);
      goto code_r0x0056a5ec;
    }
    if (plVar33[2] == 0) {
      func_0x007a2570(0,0,&UNK_009eebd8);
      goto code_r0x0056a5ec;
    }
    lVar24 = plVar33[1];
    lVar17 = func_0x005649d4(lVar24 + 8);
    *(undefined8 *)(lVar24 + 0x40) = in_stack_000003f8;
    *(undefined8 *)(lVar24 + 0x38) = in_stack_000003f0;
    *(dword **)(lVar24 + 0x30) = in_stack_000003e8;
    *(dword **)(lVar24 + 0x28) = in_stack_000003e0;
    *(dword **)(lVar24 + 0x20) = in_stack_000003d8;
    *(dword **)(lVar24 + 0x18) = in_stack_000003d0;
    *(dword **)(lVar24 + 0x10) = in_stack_00000320;
    *(undefined8 *)(lVar24 + 8) = 0;
    lVar24 = *(long *)in_stack_00000320;
    *(long *)in_stack_00000320 = lVar24 + 1;
    if (-1 < lVar24) {
      if ((*(ulong *)(unaff_x20 + 0x40) <= uVar16) ||
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) + uVar16 * (unaff_x25 & 0xffffffff)),
         *plVar33 == -0x8000000000000000)) {
        func_0x007a23bc(&UNK_009eebf0);
        goto code_r0x0056a5ec;
      }
      if (plVar33[2] == 0) {
        func_0x007a2570(0,0,&UNK_009eec08);
        goto code_r0x0056a5ec;
      }
      lVar17 = plVar33[1];
      func_0x005649d4(lVar17 + 8);
      *(undefined8 *)(lVar17 + 0x40) = in_stack_000003f8;
      *(undefined8 *)(lVar17 + 0x38) = in_stack_000003f0;
      *(dword **)(lVar17 + 0x30) = in_stack_000003e8;
      *(dword **)(lVar17 + 0x28) = in_stack_000003e0;
      *(dword **)(lVar17 + 0x20) = in_stack_000003d8;
      *(dword **)(lVar17 + 0x18) = in_stack_000003d0;
      *(dword **)(lVar17 + 0x10) = in_stack_00000320;
      *(undefined8 *)(lVar17 + 8) = 0;
      if ((unaff_x19 < *(ulong *)(unaff_x20 + 0x28)) &&
         (puVar32 = (ulong *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
         *puVar32 != 0x8000000000000000)) {
        if ((puVar32[2] == 0) || (lVar24 = puVar32[1] + puVar32[2] * 0x108, lVar24 == 0x108)) {
          in_stack_00000068 = &UNK_009eec38;
        }
        else {
          lVar17 = lVar24 + -0xe8;
          if ((lVar17 != 0) && (*(long *)(lVar24 + -0xf0) == 0x10)) {
            lVar28 = *(long *)in_stack_00000320;
            *(long *)in_stack_00000320 = lVar28 + 1;
            if (-1 < lVar28) {
              func_0x005649d4();
              *(undefined8 *)(lVar24 + -0xe8) = 0;
              *(dword **)(lVar24 + -0xe0) = in_stack_00000320;
              uVar16 = puVar32[2];
              pdVar11 = (dword *)func_0x00187bd0(0x18,8);
              if (pdVar11 == (dword *)0x0) {
                func_0x007a1f18(8,0x18);
                goto code_r0x0056a5ec;
              }
              *(undefined8 *)pdVar11 = 0x8000000000000000;
              *(dword **)(pdVar11 + 2) = in_stack_00000320;
              pdVar47 = (dword *)((long)&MACH_HEADER.magic + 1);
              pdVar51 = (dword *)((long)&MACH_HEADER.magic + 1);
              in_stack_00000250 = (undefined8 *)func_0x00187bd0(0x40,8);
              if (in_stack_00000250 == (undefined8 *)0x0) {
                func_0x007a1f18(8,0x40);
                goto code_r0x0056a5ec;
              }
              uVar16 = uVar16 - 1;
              in_stack_00000250[1] = uStack00000000000000f8;
              *in_stack_00000250 = uStack00000000000000f0;
              in_stack_00000250[3] = in_stack_00000108;
              in_stack_00000250[2] = in_stack_00000100;
              in_stack_00000250[5] = in_stack_00000118;
              in_stack_00000250[4] = in_stack_00000110;
              in_stack_00000250[7] = in_stack_00000128;
              in_stack_00000250[6] = in_stack_00000120;
              uVar21 = puVar32[2];
              if (uVar21 < uVar16) {
                func_0x007a204c(uVar16,uVar21,&UNK_009eec68);
                goto code_r0x0056a5ec;
              }
              pdVar38 = in_stack_00000320;
              pdVar48 = pdVar11;
              if (uVar21 == *puVar32) {
                func_0x005bd0a4(puVar32,&UNK_009eec68);
              }
code_r0x00567da8:
              bVar6 = true;
              lVar17 = puVar32[1] + uVar16 * 0x108;
              if (uVar16 <= uVar21 && uVar21 - uVar16 != 0) {
                _memmove(lVar17 + 0x108,lVar17,(uVar21 - uVar16) * 0x108);
              }
              _memcpy(lVar17,auStack_7ffffffe + 0x8000020e,0x108);
              puVar32[2] = uVar21 + 1;
              pdVar41 = (dword *)0x0;
              pdVar43 = in_stack_00000320;
              pdVar50 = (dword *)((long)&MACH_HEADER.filetype + 3);
              pdVar42 = (dword *)((long)&MACH_HEADER.magic + 1);
              uVar36 = 1;
              uVar53 = 1;
              in_stack_00000320 = pdVar38;
              in_stack_000003d0 = pdVar44;
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
  func_0x007a05dc(lVar17);
  goto code_r0x0056a5ec;
code_r0x00568778:
  lVar17 = *(long *)(unaff_x20 + 0x38) + uVar21 * unaff_x25;
  uVar21 = (ulong)*(uint *)(lVar17 + 0x24);
  if (*(int *)(lVar17 + 0x28) != -1) goto code_r0x0056888c;
  goto code_r0x00568770;
code_r0x005687ec:
  lVar17 = *(long *)(unaff_x20 + 0x38) + uVar21 * unaff_x25;
  uVar21 = (ulong)*(uint *)(lVar17 + 0x24);
  if (*(int *)(lVar17 + 0x28) != -1) goto code_r0x005689cc;
  goto code_r0x005687e4;
  while( true ) {
    lVar24 = lVar17 + uVar21 * unaff_x25;
    uVar21 = (ulong)*(uint *)(lVar24 + 0x24);
    iVar8 = *(int *)(lVar24 + 0x28);
    if (iVar8 != -1) break;
code_r0x0056814c:
    if (uVar18 <= uVar21) goto code_r0x00568ec0;
  }
code_r0x00568164:
  if (uVar18 <= uVar16) {
    do {
      if (uVar18 <= uVar21) {
        if (in_stack_00000088 < uVar26) {
          plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20);
          if (*plVar33 == -0x8000000000000000) {
            uVar16 = 0xffffffff;
          }
          else {
            uVar16 = (ulong)*(uint *)((long)plVar33 + 0x1c);
          }
        }
        else {
          uVar16 = 0xffffffff;
        }
        goto code_r0x00568724;
      }
      lVar24 = lVar17 + uVar21 * unaff_x25;
      uVar21 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while (lVar24 = lVar17 + uVar16 * unaff_x25, uVar16 = (ulong)*(uint *)(lVar24 + 0x24),
        *(int *)(lVar24 + 0x28) == -1) {
code_r0x00568724:
    if (uVar18 <= uVar16) goto code_r0x00568ec0;
  }
  if (uVar18 >> 0x20 == 0) {
    do {
      if (uVar18 <= uVar16) {
        if ((in_stack_00000088 < uVar26) &&
           (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
           *plVar33 != -0x8000000000000000)) {
          uVar16 = (ulong)*(uint *)(plVar33 + 3);
        }
        else {
          uVar16 = 0xffffffff;
        }
        if (uVar16 < uVar18) {
          lVar24 = lVar17 + uVar16 * (unaff_x25 & 0xffffffff);
          uVar16 = (ulong)*(uint *)(lVar24 + 0x20);
          iVar29 = *(int *)(lVar24 + 0x2c);
          uVar21 = 0xffffffff;
          goto code_r0x00568b68;
        }
        uVar21 = 0xffffffff;
        goto code_r0x00568b50;
      }
      lVar24 = lVar17 + uVar16 * unaff_x25;
      uVar16 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
  }
  goto code_r0x00568ec0;
  while( true ) {
    lVar24 = lVar17 + uVar21 * unaff_x25;
    uVar21 = (ulong)*(uint *)(lVar24 + 0x24);
    iVar29 = *(int *)(lVar24 + 0x28);
    if (iVar29 != -1) break;
code_r0x00568b50:
    if (uVar18 <= uVar21) goto code_r0x00568ec0;
  }
code_r0x00568b68:
  if (uVar18 <= uVar16) {
    do {
      if (uVar18 <= uVar21) {
        if (iVar8 == iVar29) {
          if (uVar26 <= unaff_x21) goto code_r0x0056a4d0;
          lVar24 = *(long *)(unaff_x20 + 0x20);
          plVar33 = (long *)(lVar24 + unaff_x21 * 0x20);
          if (*plVar33 == -0x8000000000000000) goto code_r0x0056a4d0;
          if ((((plVar33[2] != 1) || (lVar28 = plVar33[1], *(long *)(lVar28 + 0x18) != 0xf)) ||
              (*(long *)(lVar28 + 0x30) != 1)) || (*(long *)(lVar28 + 0x48) != 1))
          goto code_r0x00568f3c;
          if ((uVar26 <= in_stack_00000088) ||
             (plVar33 = (long *)(lVar24 + in_stack_00000088 * 0x20), *plVar33 == -0x8000000000000000
             )) {
            in_stack_00000030 = &UNK_009eea28;
            goto code_r0x0056a4d0;
          }
          if (((((plVar33[2] != 1) || (lVar27 = plVar33[1], *(long *)(lVar27 + 0x18) != 0xf)) ||
               ((*(long *)(lVar27 + 0x30) != 1 ||
                (((*(long *)(lVar27 + 0x48) != 1 || (*(long *)(pdVar41 + 4) != 1)) ||
                 (puVar37 = *(undefined8 **)(pdVar41 + 2), puVar37[1] != 0)))))) ||
              ((*(long *)(pdVar45 + 4) != 1 ||
               (puVar39 = *(undefined8 **)(pdVar45 + 2), puVar39[1] != 0)))) ||
             ((plVar33 = (long *)*puVar37, plVar33 != (long *)*puVar39 ||
              (((**(long **)(lVar28 + 0x28) != -0x8000000000000000 ||
                ((*(long **)(lVar28 + 0x28))[1] != puVar37[2])) ||
               (**(long **)(lVar27 + 0x28) != -0x8000000000000000)))))) {
            unaff_x28 = uVar19 & 0xffffffff;
            goto code_r0x00568f3c;
          }
          unaff_x28 = uVar19 & 0xffffffff;
          if ((*(long **)(lVar27 + 0x28))[1] != puVar39[2]) goto code_r0x00568f3c;
          lVar17 = *plVar33;
          *plVar33 = lVar17 + 1;
          if (lVar17 < 0) {
            func_0x007a05dc();
            goto code_r0x0056a5ec;
          }
          in_stack_00000218 = (dword *)*puVar37;
          if (*(long *)(lVar28 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea40);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar28 + 0x40));
          if (*(long *)(lVar27 + 0x48) == 0) {
            func_0x007a2570(0,0,&UNK_009eea58);
            goto code_r0x0056a5ec;
          }
          func_0x00566040(auStack_7ffffffe + 0x8000035e,*(undefined8 *)(lVar27 + 0x40));
          func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
          if (in_stack_00000210 != (dword *)0x0) {
            func_0x00584ec0(auStack_7ffffffe + 0x8000020e);
            if (in_stack_00000210 != (dword *)0x0) {
              func_0x0056b044(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),uVar19 & 0xffffffff,
                              unaff_x29 + -0xa0,auStack_7ffffffe + 0x8000020e);
              bVar5 = *(long *)(unaff_x29 + -0xe0) == 0xc;
              bVar6 = !bVar5;
              if (bVar5) {
                lVar17 = *(long *)in_stack_00000218;
                *(long *)in_stack_00000218 = lVar17 + -1;
                LORelease();
                if (lVar17 == 1) {
                  func_0x005d2ac4(auStack_7ffffffe + 0x80000206);
                }
                in_stack_00000210 = in_stack_00000360;
                in_stack_00000218 = in_stack_00000368;
                pdVar38 = in_stack_00000378;
                in_stack_00000230 = in_stack_00000380;
                in_stack_00000238 = in_stack_00000388;
                in_stack_00000240 = in_stack_00000390;
                in_stack_00000248 = in_stack_00000398;
                in_stack_00000400 = in_stack_00000320;
                in_stack_00000408 = in_stack_00000328;
                in_stack_00000410 = in_stack_00000220;
                in_stack_00000418 = in_stack_00000228;
                in_stack_00000420 = in_stack_00000340;
                in_stack_00000428 = in_stack_00000348;
                in_stack_00000430 = in_stack_00000350;
                in_stack_00000438 = in_stack_00000358;
                if (*(long *)(unaff_x29 + -0xe0) != 0xc) {
                  func_0x005649d4(unaff_x29 + -0xe0);
                }
                goto code_r0x0056a024;
              }
              lVar17 = *(long *)in_stack_00000218;
              *(long *)in_stack_00000218 = lVar17 + 1;
              if (lVar17 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)pdVar44 & 0xffffffff)) ||
                 (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)pdVar44 & 0xffffffff) * (unaff_x25 & 0xffffffff)),
                 *plVar33 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eeaa0);
                goto code_r0x0056a5ec;
              }
              if (plVar33[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeab8);
                goto code_r0x0056a5ec;
              }
              lVar17 = plVar33[1];
              func_0x005649d4(lVar17 + 8);
              *(undefined8 *)(lVar17 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar17 + 0x38) = in_stack_00000390;
              *(dword **)(lVar17 + 0x30) = in_stack_00000388;
              *(dword **)(lVar17 + 0x28) = in_stack_00000380;
              *(dword **)(lVar17 + 0x20) = in_stack_00000378;
              *(dword **)(lVar17 + 0x18) = in_stack_00000370;
              *(dword **)(lVar17 + 0x10) = in_stack_00000218;
              *(undefined8 *)(lVar17 + 8) = 0;
              lVar17 = *(long *)in_stack_00000218;
              *(long *)in_stack_00000218 = lVar17 + 1;
              if (lVar17 < 0) goto code_r0x0056a520;
              if ((*(ulong *)(unaff_x20 + 0x40) <= ((ulong)pdVar44 & 0xffffffff)) ||
                 (plVar33 = (long *)(*(long *)(unaff_x20 + 0x38) +
                                    ((ulong)pdVar44 & 0xffffffff) * (unaff_x25 & 0xffffffff)),
                 *plVar33 == -0x8000000000000000)) {
                func_0x007a23bc(&UNK_009eead0);
                goto code_r0x0056a5ec;
              }
              if (plVar33[2] == 0) {
                func_0x007a2570(0,0,&UNK_009eeae8);
                goto code_r0x0056a5ec;
              }
              lVar17 = plVar33[1];
              func_0x005649d4(lVar17 + 8);
              *(undefined8 *)(lVar17 + 0x40) = in_stack_00000398;
              *(undefined8 *)(lVar17 + 0x38) = in_stack_00000390;
              *(dword **)(lVar17 + 0x30) = in_stack_00000388;
              *(dword **)(lVar17 + 0x28) = in_stack_00000380;
              *(dword **)(lVar17 + 0x20) = in_stack_00000378;
              *(dword **)(lVar17 + 0x18) = in_stack_00000370;
              *(dword **)(lVar17 + 0x10) = in_stack_00000218;
              *(undefined8 *)(lVar17 + 8) = 0;
              func_0x0056c050();
              if ((unaff_x21 < *(ulong *)(unaff_x20 + 0x28)) &&
                 (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
                 *plVar33 != -0x8000000000000000)) {
                uVar16 = (ulong)*(uint *)((long)plVar33 + 0x1c);
              }
              else {
                uVar16 = 0xffffffff;
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
      lVar24 = lVar17 + uVar21 * unaff_x25;
      uVar21 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
  }
code_r0x00568ec0:
  if ((unaff_x21 < uVar26) &&
     (lVar24 = *(long *)(unaff_x20 + 0x20),
     *(long *)(lVar24 + unaff_x21 * 0x20) != -0x8000000000000000)) {
code_r0x00568f3c:
    uVar19 = (ulong)*(uint *)(lVar24 + unaff_x21 * 0x20 + 0x1c);
    if (uVar18 >> 0x20 == 0) goto code_r0x00568f4c;
code_r0x00568ee4:
    if (*(uint *)(lVar17 + 0x2ffffffff0) < uVar18) goto code_r0x00568fdc;
  }
  else {
    uVar19 = 0xffffffff;
    if (uVar18 >> 0x20 != 0) goto code_r0x00568ee4;
code_r0x00568f4c:
    do {
      if (uVar18 <= uVar19) goto code_r0x00568fdc;
      lVar24 = lVar17 + uVar19 * unaff_x25;
      uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
    if (0xffffffff < uVar18) goto code_r0x00568fdc;
  }
  do {
    if (uVar18 <= uVar19) {
      if (in_stack_00000088 < uVar26) {
        plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20);
        if (*plVar33 == -0x8000000000000000) {
          uVar19 = 0xffffffff;
        }
        else {
          uVar19 = (ulong)*(uint *)((long)plVar33 + 0x1c);
        }
      }
      else {
        uVar19 = 0xffffffff;
      }
      goto code_r0x00568fc0;
    }
    lVar24 = lVar17 + uVar19 * unaff_x25;
    uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
  } while (*(int *)(lVar24 + 0x28) == -1);
code_r0x00568fdc:
  bVar6 = false;
  goto code_r0x00568fe0;
  while (lVar17 = *(long *)(unaff_x20 + 0x38) + uVar16 * unaff_x25,
        uVar16 = (ulong)*(uint *)(lVar17 + 0x24), *(int *)(lVar17 + 0x28) == -1) {
code_r0x00569e4c:
    if (*(ulong *)(unaff_x20 + 0x40) <= uVar16) {
      func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,unaff_x21);
      func_0x00565df4(auStack_7ffffffe + 0x8000020e);
      break;
    }
  }
code_r0x00569e80:
  func_0x0056c050();
  uVar16 = *(ulong *)(unaff_x20 + 0x28);
  if ((in_stack_00000088 < uVar16) &&
     (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
     *plVar33 != -0x8000000000000000)) {
    uVar21 = (ulong)*(uint *)((long)plVar33 + 0x1c);
  }
  else {
    uVar21 = 0xffffffff;
  }
  if (*(ulong *)(unaff_x20 + 0x40) >> 0x20 == 0) {
    do {
      if (*(ulong *)(unaff_x20 + 0x40) <= uVar21) {
        func_0x00594630(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x18,in_stack_00000088);
        func_0x00565df4(auStack_7ffffffe + 0x8000020e);
        uVar16 = *(ulong *)(unaff_x20 + 0x28);
        break;
      }
      lVar17 = *(long *)(unaff_x20 + 0x38) + uVar21 * unaff_x25;
      uVar21 = (ulong)*(uint *)(lVar17 + 0x24);
    } while (*(int *)(lVar17 + 0x28) == -1);
  }
  if ((unaff_x19 < uVar16) &&
     (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x19 * 0x20),
     *plVar33 != -0x8000000000000000)) {
    if ((plVar33[2] == 0) || (lVar17 = plVar33[1] + plVar33[2] * 0x108, lVar17 == 0x108)) {
      in_stack_00000028 = &UNK_009eeb18;
    }
    else {
      if (lVar17 != 0xe8 && *(long *)(lVar17 + -0xf0) == 0x10) {
        lVar24 = *(long *)in_stack_00000218;
        *(long *)in_stack_00000218 = lVar24 + 1;
        if (lVar24 < 0) {
code_r0x0056a520:
          func_0x007a05dc();
          goto code_r0x0056a5ec;
        }
        func_0x005649d4();
        *(undefined8 *)(lVar17 + -0xe8) = 0;
        *(dword **)(lVar17 + -0xe0) = in_stack_00000218;
        lVar17 = plVar33[2];
        puVar37 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar37 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          goto code_r0x0056a5ec;
        }
        *puVar37 = 0x8000000000000000;
        puVar37[1] = in_stack_00000218;
        *(undefined8 *)(unaff_x29 + -0xf8) = 1;
        *(undefined8 **)(unaff_x29 + -0xf0) = puVar37;
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
        in_stack_00000238 = *(dword **)(unaff_x29 + -0xf0);
        in_stack_00000230 = *(dword **)(unaff_x29 + -0xf8);
        in_stack_00000240 = *(undefined8 *)(unaff_x29 + -0xe8);
        func_0x005564bc(plVar33,lVar17 + -1,auStack_7ffffffe + 0x8000020e,&UNK_009eeb48);
        in_stack_00000210 = (dword *)0x0;
        pdVar38 = (dword *)((long)&MACH_HEADER.filetype + 3);
        in_stack_00000248 = 1;
        in_stack_00000400 = in_stack_000003c0;
        in_stack_00000408 = in_stack_000003c8;
        in_stack_00000410 = in_stack_000003d0;
        in_stack_00000418 = in_stack_000003d8;
        in_stack_00000420 = in_stack_000003e0;
        in_stack_00000428 = in_stack_000003e8;
        in_stack_00000430 = in_stack_000003f0;
        in_stack_00000438 = in_stack_000003f8;
code_r0x0056a024:
        unaff_x28 = uVar19 & 0xffffffff;
        pdVar44 = in_stack_00000370;
        goto code_r0x00568fe0;
      }
      in_stack_00000028 = &UNK_009eeb30;
    }
  }
  func_0x007a23bc(in_stack_00000028);
  goto code_r0x0056a5ec;
  while (lVar24 = lVar17 + uVar19 * unaff_x25, uVar19 = (ulong)*(uint *)(lVar24 + 0x24),
        *(int *)(lVar24 + 0x28) == -1) {
code_r0x00568fc0:
    if (uVar18 <= uVar19) goto code_r0x00568fdc;
  }
  if (uVar18 >> 0x20 == 0) {
    do {
      if (uVar18 <= uVar19) {
        if ((unaff_x21 < uVar26) &&
           (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20),
           *plVar33 != -0x8000000000000000)) {
          if (*(uint *)(plVar33 + 3) < uVar18) goto code_r0x00568fdc;
        }
        else if (0xffffffff < uVar18) goto code_r0x00568fdc;
        uVar19 = 0xffffffff;
        goto code_r0x00569b50;
      }
      bVar6 = false;
      lVar24 = lVar17 + uVar19 * unaff_x25;
      uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
    } while (*(int *)(lVar24 + 0x28) == -1);
    goto code_r0x00568fe0;
  }
  goto code_r0x00568fdc;
  while( true ) {
    bVar6 = false;
    lVar24 = lVar17 + uVar19 * unaff_x25;
    uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
    if (*(int *)(lVar24 + 0x28) != -1) break;
code_r0x00569b50:
    if (uVar18 <= uVar19) {
      if ((in_stack_00000088 < uVar26) &&
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
         *plVar33 != -0x8000000000000000)) {
        uVar19 = (ulong)*(uint *)(plVar33 + 3);
      }
      else {
        uVar19 = 0xffffffff;
      }
      if (uVar19 < uVar18) goto code_r0x00568fdc;
      uVar19 = 0xffffffff;
      goto code_r0x00569ba8;
    }
  }
  goto code_r0x00568fe0;
code_r0x00569ba8:
  if (uVar19 < uVar18) {
    bVar6 = false;
    lVar24 = lVar17 + uVar19 * unaff_x25;
    uVar19 = (ulong)*(uint *)(lVar24 + 0x24);
    if (*(int *)(lVar24 + 0x28) != -1) goto code_r0x00568fe0;
    goto code_r0x00569ba8;
  }
  if (unaff_x21 < uVar26) {
    plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x21 * 0x20);
    if (*plVar33 != -0x8000000000000000) {
      if (((plVar33[2] != 1) || (lVar17 = plVar33[1], *(long *)(lVar17 + 0x18) != 0x1b)) ||
         (*(long *)(lVar17 + 0x10) != 1)) goto code_r0x00568fdc;
      if ((in_stack_00000088 < uVar26) &&
         (plVar33 = (long *)(*(long *)(unaff_x20 + 0x20) + in_stack_00000088 * 0x20),
         *plVar33 != -0x8000000000000000)) {
        if ((plVar33[2] != 1) ||
           ((lVar24 = plVar33[1], *(long *)(lVar24 + 0x18) != 0x1b ||
            (*(long *)(lVar24 + 0x10) != 1)))) goto code_r0x00568fdc;
        unaff_x24 = -0x8000000000000000;
        uVar35 = *(undefined8 *)(lVar24 + 8);
        func_0x00566040(auStack_7ffffffe + 0x8000031e,*(undefined8 *)(lVar17 + 8));
        func_0x00566040(auStack_7ffffffe + 0x8000035e,uVar35);
        param_2 = *(undefined8 *)(unaff_x20 + 0x20);
        param_3 = *(undefined8 *)(unaff_x20 + 0x28);
        param_1 = unaff_x29 + -0xe0;
        param_5 = auStack_7ffffffe + 0x8000020e;
        param_6 = auStack_7ffffffe + 0x8000035e;
        in_stack_00000210 = in_stack_00000320;
        in_stack_00000218 = in_stack_00000328;
        in_stack_00000230 = in_stack_00000340;
        in_stack_00000238 = in_stack_00000348;
        in_stack_00000240 = in_stack_00000350;
        in_stack_00000248 = in_stack_00000358;
        in_stack_00000330 = in_stack_00000220;
        goto code_r0x00569c94;
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

