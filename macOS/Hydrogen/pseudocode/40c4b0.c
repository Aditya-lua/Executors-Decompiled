
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void thunk_FUN_0040c4d4(void)

{
  undefined1 *puVar1;
  ulong uVar2;
  byte bVar3;
  ushort uVar4;
  uint uVar5;
  undefined1 auVar6 [16];
  dword *pdVar7;
  ulong uVar8;
  dword dVar9;
  dword dVar10;
  code *pcVar11;
  bool bVar12;
  long lVar13;
  dword *pdVar14;
  dword *pdVar15;
  dword *pdVar16;
  undefined8 extraout_x1;
  undefined8 uVar17;
  dword *pdVar18;
  undefined8 in_x3;
  long *in_x4;
  undefined8 in_x6;
  dword *pdVar19;
  int iVar20;
  byte *pbVar21;
  ulong uVar22;
  byte *pbVar23;
  byte *extraout_x9;
  byte *extraout_x9_00;
  byte *extraout_x9_01;
  uint uVar24;
  byte *pbVar25;
  ulong uVar26;
  ulong extraout_x11;
  ulong extraout_x11_00;
  ulong extraout_x11_01;
  byte *pbVar27;
  dword *pdVar28;
  uint *puVar29;
  byte *pbVar30;
  ulong uVar31;
  uint uVar32;
  byte *pbVar33;
  dword *pdVar34;
  long lVar35;
  long lVar36;
  undefined8 uVar37;
  ulong uVar38;
  dword *pdVar39;
  ulong uVar40;
  byte *pbVar41;
  ulong uVar42;
  ulong uVar43;
  dword *pdVar44;
  undefined8 extraout_d0;
  undefined8 extraout_var;
  undefined1 auVar45 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  byte *pbStack_2d0;
  dword *pdStack_2b0;
  dword *pdStack_2a8;
  ulong uStack_298;
  dword *pdStack_290;
  dword *pdStack_288;
  dword *pdStack_280;
  dword *pdStack_268;
  dword *pdStack_260;
  undefined *puStack_258;
  dword *pdStack_250;
  ulong *puStack_238;
  dword *pdStack_230;
  dword *pdStack_228;
  ulong uStack_220;
  dword *pdStack_218;
  ulong uStack_210;
  dword *pdStack_208;
  dword *pdStack_200;
  dword *pdStack_1f8;
  dword *pdStack_1f0;
  undefined8 uStack_1e8;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  dword *pdStack_1b8;
  dword *pdStack_1b0;
  dword *pdStack_1a8;
  dword *pdStack_1a0;
  ulong uStack_198;
  dword *pdStack_190;
  ulong uStack_188;
  dword *pdStack_180;
  long lStack_178;
  dword *pdStack_170;
  byte *pbStack_168;
  dword *pdStack_160;
  byte *pbStack_158;
  dword *pdStack_150;
  ulong uStack_148;
  dword *pdStack_140;
  byte *pbStack_138;
  dword *pdStack_130;
  long lStack_128;
  dword *pdStack_120;
  long lStack_118;
  ulong uStack_110;
  undefined4 uStack_108;
  byte bStack_104;
  undefined4 uStack_103;
  byte bStack_ff;
  dword *pdStack_f8;
  long lStack_f0;
  dword *pdStack_e8;
  undefined1 *puStack_e0;
  dword *pdStack_d8;
  dword *pdStack_d0;
  dword *pdStack_c8;
  byte bStack_c0;
  byte bStack_bf;
  undefined4 uStack_be;
  dword *pdStack_b8;
  byte *pbStack_b0;
  byte *pbStack_a8;
  dword *pdStack_a0;
  dword *pdStack_98;
  byte bStack_90;
  byte bStack_8f;
  int iStack_8e;
  undefined2 uStack_8a;
  dword *pdStack_88;
  dword *pdStack_80;
  
  uVar17 = 1;
  func_0x00187bd4();
  if (in_stack_00000008 != 0) {
    uVar17 = 1;
    func_0x00187bd4(in_stack_00000010);
  }
  auVar45 = __Unwind_Resume();
  auVar45._8_8_ = auVar45._8_8_;
  auVar45._0_8_ = auVar45._0_8_;
  if ((*auVar45._8_8_ & 1) == 0) {
    pdStack_290 = (dword *)in_x4[0xd];
    uVar40 = (long)pdStack_290 * 4;
    if ((ulong)pdStack_290 >> 0x3e != 0 || 0x7ffffffffffffffe < uVar40) {
      uVar37 = 0;
LAB_0040de74:
      func_0x007a1f00(uVar37,uVar40,&UNK_009d9be8);
code_r0x0040de88:
      puStack_258 = &UNK_009d98d8;
code_r0x0040de94:
      func_0x007a2d58(puStack_258);
      goto LAB_0040ded0;
    }
    uVar24 = *(uint *)(in_x4 + 0x20);
    lVar35 = in_x4[0x1c];
    pdStack_280 = (dword *)in_x4[0x1b];
    pdStack_288 = (dword *)in_x4[0x1d];
    bVar3 = *(byte *)((long)in_x4 + 0x109);
    pdStack_268 = (dword *)CONCAT44(pdStack_268._4_4_,(uint)bVar3);
    pdVar28 = (dword *)in_x4[0x17];
    uVar22 = in_x4[0x18];
    lVar36 = in_x4[0xc];
    if (uVar40 == 0) {
      pdStack_250 = (dword *)0x0;
      pdStack_260 = (dword *)((long)&MACH_HEADER.magic + 2);
    }
    else {
      uVar37 = 2;
      pdStack_260 = (dword *)func_0x00187bd0(uVar40,2);
      pdStack_250 = pdStack_290;
      if (pdStack_260 == (dword *)0x0) goto LAB_0040de74;
    }
    _memcpy(pdStack_260,lVar36,uVar40);
    uVar37 = 0;
    uVar40 = in_x4[0x10];
    auVar45._8_8_ = 0;
    auVar45._0_8_ = uVar40;
    uVar42 = uVar40 * 0x18;
    if ((SUB168(auVar45 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar42)) {
LAB_0040c620:
      func_0x007a1f00(uVar37,uVar42,&UNK_009d9be8);
      goto LAB_0040ded0;
    }
    lVar36 = in_x4[0xf];
    if (uVar42 == 0) {
      puStack_258 = (undefined *)0x0;
      pdStack_2a8 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar37 = 8;
      pdStack_2a8 = (dword *)func_0x00187bd0(uVar42,8);
      puStack_258 = (undefined *)uVar40;
      if (pdStack_2a8 == (dword *)0x0) goto LAB_0040c620;
    }
    _memcpy(pdStack_2a8,lVar36,uVar42);
    uVar37 = 0;
    pdVar39 = (dword *)in_x4[0x13];
    uVar42 = (long)pdVar39 * 4;
    if (((ulong)pdVar39 >> 0x3e != 0) || (0x7ffffffffffffffe < uVar42)) {
LAB_0040c6a0:
      func_0x007a1f00(uVar37,uVar42,&UNK_009d9be8);
      goto LAB_0040ded0;
    }
    lVar36 = in_x4[0x12];
    if (uVar42 == 0) {
      pdStack_2b0 = (dword *)0x0;
      lVar13 = 2;
    }
    else {
      uVar37 = 2;
      lVar13 = func_0x00187bd0(uVar42,2);
      pdStack_2b0 = pdVar39;
      if (lVar13 == 0) goto LAB_0040c6a0;
    }
    _memcpy(lVar13,lVar36,uVar42);
    uVar37 = 0;
    pbVar41 = (byte *)in_x4[0x16];
    uVar42 = (long)pbVar41 * 0x58;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = pbVar41;
    if ((SUB168(auVar6 * ZEXT816(0x58),8) != 0) || (0x7ffffffffffffff8 < uVar42)) {
LAB_0040c724:
      func_0x007a1f00(uVar37,uVar42,&UNK_009d9be8);
LAB_0040ded0:
                    /* WARNING: Does not return */
      pcVar11 = (code *)SoftwareBreakpoint(1,0x40ded4);
      (*pcVar11)();
    }
    lVar36 = in_x4[0x15];
    if (uVar42 == 0) {
      pbStack_2d0 = (byte *)0x0;
      pdVar14 = &MACH_HEADER.cpusubtype;
    }
    else {
      uVar37 = 8;
      pdVar14 = (dword *)func_0x00187bd0(uVar42,8);
      pbStack_2d0 = pbVar41;
      if (pdVar14 == (dword *)0x0) goto LAB_0040c724;
    }
    uStack_1c8 = _memcpy(pdVar14,lVar36);
    pdVar34 = _UNK_008848d8;
    uVar8 = _UNK_008848d0;
    pdStack_140 = (dword *)in_x4[0x19];
    pbVar21 = (byte *)in_x4[0x1a];
    lStack_118 = in_x4[0x1e];
    uVar26 = in_x4[0x1f];
    if (*in_x4 != 0x2e) {
                    /* WARNING: Could not recover jumptable at 0x0040c7a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_0040c7ac + (ulong)*(ushort *)(&UNK_00884e3e + *in_x4 * 2) * 4))();
      return;
    }
    uVar38 = 0;
    bStack_104 = *(byte *)((long)in_x4 + 0x104);
    uStack_103 = *(dword *)((long)in_x4 + 0x105);
    pdStack_1b8 = pdStack_88;
    pdVar44 = &MACH_HEADER.cpusubtype;
    puStack_238 = (ulong *)0x0;
    pdStack_230 = &MACH_HEADER.cpusubtype;
    pdStack_228 = (dword *)0x0;
    uStack_220 = 0;
    pdStack_218 = &MACH_HEADER.cpusubtype;
    uStack_210 = 0;
    pdStack_1b0 = pdStack_250;
    uStack_198 = (ulong)puStack_258;
    pdStack_180 = pdStack_2b0;
    pbStack_168 = pbStack_2d0;
    pdVar16 = (dword *)&pdStack_f8;
    pdStack_f8 = (dword *)0x0;
    lStack_f0 = 0;
    puStack_e0 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    pdStack_e8 = (dword *)((long)&MACH_HEADER.magic + 1);
    uVar43 = 0x19;
    pdStack_d8 = (dword *)0x0;
    pdStack_d0 = (dword *)0x0;
    bStack_c0 = 0;
    uStack_be = 0;
    puStack_258 = &UNK_009d98c0;
    pdVar19 = (dword *)&UNK_00884000;
    pdStack_208 = (dword *)0x2e;
    pdStack_1f0 = (dword *)extraout_x1;
    uStack_1e8 = uVar42;
    uStack_1e0 = in_x6;
    uStack_1d8 = extraout_d0;
    uStack_1d0 = extraout_var;
    pdStack_1a8 = pdStack_260;
    pdStack_1a0 = pdStack_290;
    pdStack_190 = pdStack_2a8;
    uStack_188 = uVar40;
    lStack_178 = lVar13;
    pdStack_170 = pdVar39;
    pdStack_160 = pdVar14;
    pbStack_158 = pbVar41;
    pdStack_150 = pdVar28;
    uStack_148 = uVar22;
    pbStack_138 = pbVar21;
    pdStack_130 = pdStack_280;
    lStack_128 = lVar35;
    pdStack_120 = pdStack_288;
    uStack_110 = uVar26;
    uStack_108 = uVar24;
    bStack_ff = bVar3;
    bStack_bf = bStack_104;
    pdStack_b8 = pdStack_140;
    pbStack_b0 = pbVar21;
    while( true ) {
      pdStack_c8 = (dword *)0x0;
      uStack_be = (uStack_be >> 8 & 0xff) << 8;
      if (pbStack_b0 == (byte *)0x0) break;
      uVar40 = 0;
code_r0x0040c9ac:
      pdVar18 = pdStack_b8;
      pdVar7 = pdStack_e8;
      pbVar41 = pbStack_158;
      pdVar15 = pdStack_218;
      uVar22 = uStack_220;
      iVar20 = (int)pbVar21;
      pbVar30 = pbStack_b0 + -1;
      pdVar28 = (dword *)((long)pdStack_b8 + 1);
      bVar3 = (byte)*pdStack_b8;
      pdVar14 = pdStack_f8;
      if (bVar3 == 0) {
        if (pbVar30 == (byte *)0x0) goto code_r0x0040d680;
        pbVar33 = (byte *)0x0;
        pbVar25 = (byte *)0x0;
        uVar40 = 0;
        while( true ) {
          bVar3 = ((byte *)((long)pdStack_b8 + (long)pbVar33))[1];
          if (((int)uVar40 == 0x3f) && (1 < bVar3)) goto code_r0x0040d698;
          pbVar25 = (byte *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pbVar25);
          if (-1 < (char)bVar3) break;
          uVar40 = (ulong)((int)uVar40 + 7);
          pbVar33 = pbVar33 + 1;
          if (pbVar30 == pbVar33) goto code_r0x0040d674;
        }
        if (pbStack_b0 + (-2 - (long)pbVar33) < pbVar25) {
code_r0x0040db5c:
          pdVar39 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 2);
        }
        else {
          pbStack_b0 = pbStack_b0 + (-(long)pbVar33 - (long)pbVar25) + -2;
          pdVar28 = (dword *)((byte *)((long)pdStack_b8 + (long)(pbVar33 + (long)pbVar25)) + 2);
          if (pbVar25 == (byte *)0x0) goto code_r0x0040db5c;
          pbVar27 = pbVar25 + -1;
          puVar29 = (uint *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 3);
          bVar3 = ((byte *)((long)pdStack_b8 + (long)pbVar33))[2];
          pbVar30 = pbStack_b0;
          if (bVar3 < 3) {
            if (bVar3 == 1) {
              uStack_be._0_2_ = CONCAT11(1,(undefined1)uStack_be);
              uVar24 = uStack_be;
              goto joined_r0x0040cf3c;
            }
            if (bVar3 != 2) goto code_r0x0040cf8c;
            pdVar19 = (dword *)0x0;
            uVar26 = (ulong)(byte)uStack_108;
            uVar24 = uStack_108 & 0xff;
            if ((byte)uStack_108 < 4) {
              if (uVar24 == 1) {
                if (pbVar27 != (byte *)0x0) {
                  pdVar39 = (dword *)(ulong)(byte)*puVar29;
                  goto code_r0x0040d254;
                }
              }
              else {
                iVar20 = 0;
                if (uVar24 != 2) goto code_r0x0040d6a8;
                if ((byte *)0x1 < pbVar27) {
                  pdVar39 = (dword *)(ulong)(ushort)*puVar29;
                  goto code_r0x0040d254;
                }
              }
            }
            else if (uVar24 == 4) {
              if ((byte *)0x3 < pbVar27) {
                pdVar39 = (dword *)(ulong)*puVar29;
code_r0x0040d254:
                uVar26 = (ulong)pdVar39 >> 8;
                pbVar21 = (byte *)((ulong)pdVar39 >> 0x10);
                pdVar19 = (dword *)((ulong)pdVar39 >> 0x20);
                if (pdVar39 < pdStack_f8) {
                  uVar40 = 0;
                  bStack_c0 = 1;
                }
                else {
                  bStack_c0 = pdVar39 == (dword *)(0xffffffffffffffffU >> (uVar24 * -8 & 0x38));
                  uVar40 = 0;
                  if (!(bool)bStack_c0) {
                    lStack_f0 = 0;
                    pdStack_f8 = pdVar39;
                  }
                }
                goto code_r0x0040cd10;
              }
            }
            else {
              iVar20 = 0;
              if (uVar24 != 8) goto code_r0x0040d6a8;
              if ((byte *)0x7 < pbVar27) {
                pdVar39 = (dword *)(((ulong)*puVar29 << 8 |
                                    (ulong)*(uint3 *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 7
                                                     ) << 0x28) >> 8 |
                                   (ulong)((byte *)((long)pdStack_b8 + (long)pbVar33))[10] << 0x38);
                goto code_r0x0040d254;
              }
            }
code_r0x0040db84:
            pdVar39 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 3);
          }
          else {
            if (bVar3 != 3) {
              if (bVar3 == 4) {
                if (pbVar27 == (byte *)0x0) {
                  pdVar39 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 3);
                  goto code_r0x0040db98;
                }
                pdVar19 = (dword *)0x0;
                uVar40 = 0;
                while( true ) {
                  bVar3 = (byte)*puVar29;
                  if (((int)uVar40 == 0x3f) && (1 < bVar3)) {
                    uVar26 = 0;
                    pdVar19 = (dword *)0x0;
                    iVar20 = 0;
                    uVar43 = 6;
                    pdVar39 = pdStack_290;
                    goto code_r0x0040d6a8;
                  }
                  pdVar19 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pdVar19);
                  if (-1 < (char)bVar3) break;
                  uVar40 = (ulong)((int)uVar40 + 7);
                  pbVar27 = pbVar27 + -1;
                  puVar29 = (uint *)((long)puVar29 + 1);
                  if (pbVar27 == (byte *)0x0) goto code_r0x0040dabc;
                }
                pdStack_290 = pdVar19;
                pdStack_c8 = pdVar19;
              }
              else {
code_r0x0040cf8c:
                pdVar19 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + 3);
              }
              uVar26 = (ulong)pdVar19 >> 8;
              uVar40 = 0;
              pbVar21 = (byte *)((ulong)pdVar19 >> 0x10);
              pdVar19 = (dword *)((ulong)pdVar19 >> 0x20);
              goto code_r0x0040cd10;
            }
            if (4 < uStack_108._2_2_) goto code_r0x0040cf8c;
            if (pbVar27 == (byte *)0x0) goto code_r0x0040db84;
            pbVar30 = (byte *)0x0;
            pbVar23 = pbVar25 + -3;
            pbVar21 = pbVar25 + -4;
            while (((byte *)((long)pdStack_b8 + (long)pbVar33))[(long)(pbVar30 + 3)] != 0) {
              pbVar30 = pbVar30 + 1;
              pbVar23 = pbVar23 + -1;
              pbVar21 = pbVar21 + -1;
              if (pbVar27 == pbVar30) goto code_r0x0040db84;
            }
            if (pbVar25 + -2 == pbVar30) {
              pdVar39 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + (long)(pbVar30 + 4));
            }
            else {
              uVar22 = 0;
              uVar40 = 0;
              pdVar14 = (dword *)((byte *)((long)pdStack_b8 + (long)pbVar33) + (long)(pbVar30 + 4));
              while( true ) {
                bVar3 = (byte)*pdVar14;
                if (((int)uVar40 == 0x3f) && (1 < bVar3)) goto code_r0x0040d698;
                uVar22 = ((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | uVar22;
                if (-1 < (char)bVar3) break;
                uVar40 = (ulong)((int)uVar40 + 7);
                pbVar21 = pbVar21 + -1;
                bVar12 = pbVar23 == (byte *)0x0;
                pbVar23 = pbVar23 + -1;
                pdVar14 = (dword *)((long)pdVar14 + 1);
                if (bVar12) goto code_r0x0040dabc;
              }
              if (pbVar23 == (byte *)0x0) {
                pdVar39 = (dword *)((long)pdVar14 + 1);
              }
              else {
                uVar42 = 0;
                uVar40 = 0;
                pdVar19 = (dword *)((long)pdVar14 + 1);
                while( true ) {
                  bVar3 = (byte)*pdVar19;
                  if (((int)uVar40 == 0x3f) && (1 < bVar3)) goto code_r0x0040d698;
                  uVar42 = ((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | uVar42;
                  if (-1 < (char)bVar3) break;
                  uVar40 = (ulong)((int)uVar40 + 7);
                  bVar12 = pbVar21 == (byte *)0x0;
                  pbVar21 = pbVar21 + -1;
                  pdVar19 = (dword *)((long)pdVar19 + 1);
                  if (bVar12) {
                    pdVar39 = (dword *)((long)pdVar14 + (long)(pbVar23 + 1));
                    goto code_r0x0040db98;
                  }
                }
                if (pbVar21 != (byte *)0x0) {
                  uStack_298 = 0;
                  uVar40 = 0;
                  pdVar14 = (dword *)((long)pdVar19 + 1);
                  pbVar25 = pbVar21;
                  while( true ) {
                    bVar3 = (byte)*pdVar14;
                    if (((int)uVar40 == 0x3f) && (1 < bVar3)) goto code_r0x0040d698;
                    uStack_298 = ((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | uStack_298;
                    if (-1 < (char)bVar3) break;
                    uVar40 = (ulong)((int)uVar40 + 7);
                    pbVar25 = pbVar25 + -1;
                    pdVar14 = (dword *)((long)pdVar14 + 1);
                    if (pbVar25 == (byte *)0x0) {
                      pdVar39 = (dword *)((long)pdVar19 + (long)(pbVar21 + 1));
                      goto code_r0x0040db98;
                    }
                  }
                  pdStack_b8 = pdVar28;
                  if (pbStack_158 == pbStack_168) {
                    func_0x00403cdc(&pbStack_168,&UNK_009d9108);
                  }
                  uVar40 = 0;
                  pbVar33 = (byte *)((long)pdVar18 + (long)pbVar33) + 3;
                  uVar26 = (ulong)pbVar33 >> 8;
                  pdVar28 = pdStack_160 + (long)pbVar41 * 0x16;
                  *(undefined8 *)pdVar28 = 0x1f;
                  *(byte **)(pdVar28 + 2) = pbVar33;
                  pbVar21 = (byte *)((ulong)pbVar33 >> 0x10);
                  pdVar19 = (dword *)((ulong)pbVar33 >> 0x20);
                  *(byte **)(pdVar28 + 4) = pbVar30;
                  *(undefined1 *)(pdVar28 + 6) = 0x2e;
                  *(undefined1 *)((long)pdVar28 + 0x1f) = 0;
                  *(undefined2 *)((long)pdVar28 + 0x1d) = 0;
                  *(undefined4 *)((long)pdVar28 + 0x19) = 0;
                  *(dword **)(pdVar28 + 10) = pdStack_a0;
                  *(byte **)(pdVar28 + 8) = pbStack_a8;
                  *(ulong *)(pdVar28 + 0xc) = uVar22;
                  *(ulong *)(pdVar28 + 0xe) = uVar42;
                  *(undefined8 *)(pdVar28 + 0x12) = 0;
                  *(undefined8 *)(pdVar28 + 0x14) = 0;
                  *(ulong *)(pdVar28 + 0x10) = uStack_298;
                  pbStack_158 = pbVar41 + 1;
                  pdVar28 = pdStack_b8;
                  pbVar30 = pbStack_b0;
                  goto code_r0x0040cd10;
                }
                pdVar39 = (dword *)((long)pdVar19 + 1);
              }
            }
          }
        }
        goto code_r0x0040db98;
      }
      uVar32 = (uint)bStack_ff;
      uVar5 = bVar3 - uVar32;
      uVar24 = uStack_be;
      if (bVar3 < uVar32) {
        if (bVar3 < 7) {
          if (3 < bVar3) {
            if (bVar3 == 4) {
              if (pbVar30 != (byte *)0x0) {
                pdVar14 = (dword *)0x0;
                uVar40 = 0;
                lVar36 = 2 - (long)pbStack_b0;
                pdVar28 = (dword *)((long)pdStack_b8 + 2);
                while( true ) {
                  bVar3 = *(byte *)((long)pdVar28 + -1);
                  if (((int)uVar40 == 0x3f) && (1 < bVar3)) {
                    uVar26 = 0;
                    pdVar19 = (dword *)0x0;
                    iVar20 = 0;
                    uVar43 = 6;
                    pdVar39 = pdStack_280;
                    goto code_r0x0040d6a8;
                  }
                  pdVar14 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pdVar14);
                  if (-1 < (char)bVar3) break;
                  pdVar28 = (dword *)((long)pdVar28 + 1);
                  uVar40 = (ulong)((int)uVar40 + 7);
                  lVar36 = lVar36 + 1;
                  if (lVar36 == 1) goto code_r0x0040d674;
                }
                pdStack_280 = pdVar14;
                pdStack_e8 = pdVar14;
                pdStack_b8 = pdVar28;
code_r0x0040d120:
                pbStack_b0 = (byte *)-lVar36;
                pdVar19 = (dword *)((ulong)pdVar14 >> 0x20);
                pbVar21 = (byte *)((ulong)pdVar14 >> 0x10);
                uVar26 = (ulong)pdVar14 >> 8;
                uVar40 = 0;
                pdVar28 = pdStack_b8;
                pbVar30 = pbStack_b0;
                goto code_r0x0040cd10;
              }
            }
            else {
              if (bVar3 != 5) {
                if (bVar3 != 6) goto code_r0x0040cea4;
                uVar40 = 0;
                bStack_bf = bStack_bf ^ 1;
                goto code_r0x0040cd10;
              }
              if (pbVar30 != (byte *)0x0) {
                pdVar14 = (dword *)0x0;
                uVar40 = 0;
                lVar36 = 2 - (long)pbStack_b0;
                pdVar28 = (dword *)((long)pdStack_b8 + 2);
                while( true ) {
                  bVar3 = *(byte *)((long)pdVar28 + -1);
                  if (((int)uVar40 == 0x3f) && (1 < bVar3)) {
                    uVar26 = 0;
                    pdVar19 = (dword *)0x0;
                    iVar20 = 0;
                    uVar43 = 6;
                    pdVar39 = pdStack_268;
                    goto code_r0x0040d6a8;
                  }
                  pdVar14 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pdVar14);
                  if (-1 < (char)bVar3) break;
                  pdVar28 = (dword *)((long)pdVar28 + 1);
                  uVar40 = (ulong)((int)uVar40 + 7);
                  lVar36 = lVar36 + 1;
                  if (lVar36 == 1) goto code_r0x0040d674;
                }
                pdStack_268 = pdVar14;
                pdStack_d8 = pdVar14;
                pdStack_b8 = pdVar28;
                goto code_r0x0040d120;
              }
            }
            goto code_r0x0040d680;
          }
          if (bVar3 == 1) goto joined_r0x0040cf3c;
          if (bVar3 == 2) {
            if (pbVar30 == (byte *)0x0) goto code_r0x0040d680;
            pdVar14 = (dword *)0x0;
            uVar22 = 0;
            lVar36 = 2 - (long)pbStack_b0;
            pdVar28 = (dword *)((long)pdStack_b8 + 2);
            while( true ) {
              bVar3 = *(byte *)((long)pdVar28 + -1);
              if (((int)uVar22 == 0x3f) && (1 < bVar3)) {
                uVar26 = 0;
                pdVar19 = (dword *)0x0;
                iVar20 = 0;
                uVar43 = 6;
                pdVar39 = pdStack_288;
                goto code_r0x0040d6a8;
              }
              pdVar14 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar22 & 0x3f) | (ulong)pdVar14);
              if (-1 < (char)bVar3) break;
              pdVar28 = (dword *)((long)pdVar28 + 1);
              uVar22 = (ulong)((int)uVar22 + 7);
              lVar36 = lVar36 + 1;
              if (lVar36 == 1) goto code_r0x0040d674;
            }
            pbStack_b0 = (byte *)-lVar36;
            uVar26 = (ulong)pdVar14 >> 8;
            pbVar21 = (byte *)((ulong)pdVar14 >> 0x10);
            pdVar19 = (dword *)((ulong)pdVar14 >> 0x20);
            pdStack_288 = pdVar14;
            pbVar30 = pbStack_b0;
            if ((bStack_c0 & 1) != 0) {
              uVar40 = 0;
              goto code_r0x0040cd10;
            }
            uVar22 = (ulong)uStack_103._1_1_;
            pdStack_b8 = pdVar28;
            if (uStack_103._1_1_ == 1) {
              lStack_f0 = 0;
              pdVar15 = pdVar14;
            }
            else {
              if (uStack_103._1_1_ == 0) goto code_r0x0040de88;
              pdVar15 = (dword *)0x0;
              if (uVar22 != 0) {
                pdVar15 = (dword *)((ulong)((long)pdVar14 + lStack_f0) / uVar22);
              }
              lStack_f0 = (long)((long)pdVar14 + lStack_f0) - (long)pdVar15 * uVar22;
            }
            if (!CARRY8((ulong)pdStack_f8,(long)pdVar15 * (ulong)(byte)uStack_103)) {
              pdVar14 = (dword *)((long)pdStack_f8 + (long)pdVar15 * (ulong)(byte)uStack_103);
              if (pdVar14 <= (byte *)(0xffffffffffffffffU >> ((uStack_108 & 0xff) * -8 & 0x38))) {
                uVar40 = 0;
                pdStack_f8 = pdVar14;
                goto code_r0x0040cd10;
              }
            }
            goto code_r0x0040dba0;
          }
          if (bVar3 != 3) goto code_r0x0040cea4;
          pdStack_b8 = pdVar28;
          pbStack_b0 = pbVar30;
          func_0x0040a028(&bStack_90,&pdStack_b8);
          if ((ulong)bStack_90 != 0x4f) {
            uVar26 = (ulong)bStack_8f;
            pdVar19 = (dword *)(ulong)(CONCAT24(uStack_8a,iStack_8e) >> 0x10);
            pdVar39 = pdStack_88;
            uVar43 = (ulong)bStack_90;
            iVar20 = iStack_8e;
            goto code_r0x0040d6a8;
          }
          uVar26 = (ulong)pdStack_88 >> 8;
          pbVar21 = (byte *)((ulong)pdStack_88 >> 0x10);
          pdVar19 = (dword *)((ulong)pdStack_88 >> 0x20);
          pdVar28 = pdStack_b8;
          pbVar30 = pbStack_b0;
          if (((long)pdStack_88 < 0) && (puStack_e0 < (undefined1 *)-(long)pdStack_88)) {
            uVar40 = 0;
            puStack_e0 = (undefined1 *)0x0;
          }
          else {
            uVar40 = 0;
            puStack_e0 = puStack_e0 + (long)pdStack_88;
          }
        }
        else {
          if (bVar3 < 10) {
            if (bVar3 == 7) {
              uVar40 = 0;
              uStack_be = CONCAT31(uStack_be._1_3_,1);
              goto code_r0x0040cd10;
            }
            if (bVar3 != 8) {
              if (bVar3 != 9) goto code_r0x0040cea4;
              if ((byte *)((long)&MACH_HEADER.magic + 1) < pbVar30) {
                pbStack_b0 = pbStack_b0 + -3;
                pdVar28 = (dword *)((long)pdStack_b8 + 3);
                uVar4 = *(ushort *)((long)pdStack_b8 + 1);
                uVar26 = (ulong)(uVar4 >> 8);
                pbVar30 = pbStack_b0;
                if ((bStack_c0 & 1) == 0) {
                  pdStack_b8 = pdVar28;
                  if (!CARRY8((ulong)pdStack_f8,(ulong)uVar4)) {
                    pdVar14 = (dword *)((long)pdStack_f8 + (ulong)uVar4);
                    if (pdVar14 <=
                        (byte *)(0xffffffffffffffffU >> ((uStack_108 & 0xff) * -8 & 0x38))) {
                      uVar40 = 0;
                      lStack_f0 = 0;
                      pdStack_f8 = pdVar14;
                      goto code_r0x0040cd10;
                    }
                  }
                  goto code_r0x0040dba0;
                }
                uVar40 = 0;
                goto code_r0x0040cd10;
              }
              uVar26 = 0;
              pdVar19 = (dword *)0x0;
              bStack_90 = 0;
              bStack_8f = 0;
              iStack_8e = 0;
              iVar20 = 0;
              goto code_r0x0040d68c;
            }
            if (uStack_103._3_1_ != 0) {
              if ((bStack_c0 & 1) != 0) {
                uVar40 = 0;
                goto code_r0x0040cd10;
              }
              uVar22 = (ulong)uStack_103._1_1_;
              uVar24 = 0;
              if (uStack_103._3_1_ != 0) {
                uVar24 = (uVar32 ^ 0xff) / (uint)uStack_103._3_1_;
              }
              uVar42 = (ulong)uVar24;
              if (uStack_103._1_1_ == 1) {
                lStack_f0 = 0;
              }
              else {
                pdStack_b8 = pdVar28;
                pbStack_b0 = pbVar30;
                if (uStack_103._1_1_ == 0) goto code_r0x0040de88;
                uVar31 = lStack_f0 + uVar42;
                uVar42 = 0;
                if (uVar22 != 0) {
                  uVar42 = uVar31 / uVar22;
                }
                lStack_f0 = uVar31 - uVar42 * uVar22;
              }
              pdStack_b8 = pdVar28;
              pbStack_b0 = pbVar30;
              if (!CARRY8((ulong)pdStack_f8,uVar42 * (byte)uStack_103)) {
                pdVar14 = (dword *)((long)pdStack_f8 + uVar42 * (byte)uStack_103);
                if (pdVar14 <= (byte *)(0xffffffffffffffffU >> ((uStack_108 & 0xff) * -8 & 0x38))) {
                  uVar40 = 0;
                  pdStack_f8 = pdVar14;
                  goto code_r0x0040cd10;
                }
              }
              goto code_r0x0040dba0;
            }
            pdStack_b8 = pdVar28;
            pbStack_b0 = pbVar30;
            func_0x007a2d24(&UNK_009d98f0);
            goto LAB_0040ded0;
          }
          if (bVar3 != 10) {
            if (bVar3 == 0xb) {
              uVar40 = 0;
              uStack_be = CONCAT13(1,(undefined3)uStack_be);
              goto code_r0x0040cd10;
            }
            if (bVar3 == 0xc) {
              if (pbVar30 == (byte *)0x0) goto code_r0x0040d680;
              pdVar14 = (dword *)0x0;
              uVar40 = 0;
              lVar36 = 2 - (long)pbStack_b0;
              pdVar28 = (dword *)((long)pdStack_b8 + 2);
              while( true ) {
                bVar3 = *(byte *)((long)pdVar28 + -1);
                if (((int)uVar40 == 0x3f) && (1 < bVar3)) {
                  uVar26 = 0;
                  pdVar19 = (dword *)0x0;
                  iVar20 = 0;
                  uVar43 = 6;
                  pdVar39 = pdStack_260;
                  goto code_r0x0040d6a8;
                }
                pdVar14 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pdVar14);
                if (-1 < (char)bVar3) break;
                pdVar28 = (dword *)((long)pdVar28 + 1);
                uVar40 = (ulong)((int)uVar40 + 7);
                lVar36 = lVar36 + 1;
                if (lVar36 == 1) goto code_r0x0040d674;
              }
              uVar40 = 0;
              uVar26 = (ulong)pdVar14 >> 8;
              pbVar21 = (byte *)((ulong)pdVar14 >> 0x10);
              pdVar19 = (dword *)((ulong)pdVar14 >> 0x20);
              pdStack_260 = pdVar14;
              pdStack_d0 = pdVar14;
              pbVar30 = (byte *)-lVar36;
              goto code_r0x0040cd10;
            }
code_r0x0040cea4:
            uVar40 = (ulong)(byte)(bVar3 - 1);
            if (uStack_148 < uVar40) {
              uVar43 = 0x13;
              pdVar39 = pdStack_150;
            }
            else {
              if (uStack_148 != uVar40) {
                bVar3 = (byte)*(dword *)((long)pdStack_150 + uVar40);
                uVar40 = (ulong)bVar3;
                if (bVar3 != 0) {
                  if (bVar3 == 1) {
                    if (pbVar30 == (byte *)0x0) goto code_r0x0040d680;
                    pdVar14 = (dword *)0x0;
                    uVar40 = 0;
                    lVar36 = 2 - (long)pbStack_b0;
                    pdVar28 = (dword *)((long)pdStack_b8 + 2);
                    while( true ) {
                      bVar3 = *(byte *)((long)pdVar28 + -1);
                      if (((int)uVar40 == 0x3f) && (1 < bVar3)) {
                        uVar26 = 0;
                        pdVar19 = (dword *)0x0;
                        iVar20 = 0;
                        uVar43 = 6;
                        pdVar39 = pdStack_2b0;
                        goto code_r0x0040d6a8;
                      }
                      pdVar14 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar40 & 0x3f) | (ulong)pdVar14)
                      ;
                      if (-1 < (char)bVar3) break;
                      pdVar28 = (dword *)((long)pdVar28 + 1);
                      uVar40 = (ulong)((int)uVar40 + 7);
                      lVar36 = lVar36 + 1;
                      if (lVar36 == 1) goto code_r0x0040d674;
                    }
                    uVar40 = 0;
                    uVar26 = (ulong)pdVar14 >> 8;
                    pbVar21 = (byte *)((ulong)pdVar14 >> 0x10);
                    pdVar19 = (dword *)((ulong)pdVar14 >> 0x20);
                    pdStack_2b0 = pdVar14;
                    pbVar30 = (byte *)-lVar36;
                  }
                  else {
                    uVar22 = 1;
                    pdVar15 = pdStack_2a8;
                    pdVar14 = pdVar28;
                    pbVar41 = pbVar30;
                    do {
                      if (pbVar41 == (byte *)0x0) {
code_r0x0040dc48:
                        uVar26 = 0;
                        pdVar19 = (dword *)0x0;
                        iVar20 = 0;
                        uVar43 = 0x13;
                        pdVar39 = pdVar14;
                        goto code_r0x0040d6a8;
                      }
                      pdStack_2a8 = (dword *)0x0;
                      uVar42 = 0;
                      lVar36 = 1 - (long)pbVar41;
                      pbVar21 = (byte *)((long)pdVar14 - (long)pdStack_b8);
                      pdVar7 = pdVar14;
                      while( true ) {
                        pdVar18 = (dword *)((long)pdVar7 + 1);
                        bVar3 = (byte)*pdVar7;
                        if (((int)uVar42 == 0x3f) && (1 < bVar3)) {
                          uVar26 = 0;
                          pdVar19 = (dword *)0x0;
                          iVar20 = 0;
                          uVar43 = 6;
                          pdVar39 = pdVar15;
                          goto code_r0x0040d6a8;
                        }
                        pdStack_2a8 = (dword *)(((ulong)bVar3 & 0x7f) << (uVar42 & 0x3f) |
                                               (ulong)pdStack_2a8);
                        if (-1 < (char)bVar3) break;
                        uVar42 = (ulong)((int)uVar42 + 7);
                        lVar36 = lVar36 + 1;
                        pbVar21 = pbVar21 + 1;
                        pdVar7 = pdVar18;
                        if (lVar36 == 1) {
                          pdVar14 = (dword *)((long)pdVar14 + (long)pbVar41);
                          goto code_r0x0040dc48;
                        }
                      }
                      pbVar41 = (byte *)-lVar36;
                      bVar12 = uVar22 != uVar40;
                      uVar22 = uVar22 + 1;
                      pdVar15 = pdStack_2a8;
                      pdVar14 = pdVar18;
                    } while (bVar12);
                    if (pbVar30 < pbVar21) goto code_r0x0040d68c;
                    uVar40 = 0;
                    uVar26 = (ulong)pdVar28 >> 8;
                    pbVar21 = (byte *)((ulong)pdVar28 >> 0x10);
                    pdVar19 = (dword *)((ulong)pdVar28 >> 0x20);
                    pdVar28 = pdVar18;
                    pbVar30 = pbVar41;
                  }
                }
                goto code_r0x0040cd10;
              }
              uVar26 = 0;
              pdVar19 = (dword *)0x0;
              iVar20 = 0;
              uVar43 = 0x13;
              pdVar39 = (dword *)((long)pdStack_150 + uVar40);
            }
            goto code_r0x0040d6a8;
          }
          uVar40 = 0;
          uStack_be._0_3_ = CONCAT12(1,(undefined2)uStack_be);
        }
code_r0x0040cd10:
        pbStack_b0 = pbVar30;
        pdStack_b8 = pdVar28;
        if (pbStack_b0 == (byte *)0x0) break;
        goto code_r0x0040c9ac;
      }
      pdStack_b8 = pdVar28;
      pbStack_b0 = pbVar30;
      if (uStack_103._3_1_ == 0) goto code_r0x0040de94;
      uVar32 = 0;
      if (uStack_103._3_1_ != 0) {
        uVar32 = (uVar5 & 0xff) / (uint)uStack_103._3_1_;
      }
      uVar42 = (ulong)uVar32;
      lVar36 = (long)uStack_103._2_1_ + (ulong)(byte)((char)uVar5 - (char)uVar32 * uStack_103._3_1_)
      ;
      if (lVar36 < 0) {
        puVar1 = puStack_e0 + lVar36;
        bVar12 = (undefined1 *)-lVar36 <= puStack_e0;
        puStack_e0 = (undefined1 *)0x0;
        if (bVar12) {
          puStack_e0 = puVar1;
        }
      }
      else {
        puStack_e0 = puStack_e0 + lVar36;
      }
      if ((bStack_c0 & 1) == 0) {
        uVar31 = (ulong)uStack_103._1_1_;
        if (uStack_103._1_1_ == 1) {
          lStack_f0 = 0;
        }
        else {
          if (uStack_103._1_1_ == 0) goto code_r0x0040de88;
          uVar2 = lStack_f0 + uVar42;
          uVar42 = 0;
          if (uVar31 != 0) {
            uVar42 = uVar2 / uVar31;
          }
          lStack_f0 = uVar2 - uVar42 * uVar31;
        }
        if (!CARRY8((ulong)pdStack_f8,uVar42 * (byte)uStack_103)) {
          pdVar14 = (dword *)((long)pdStack_f8 + uVar42 * (byte)uStack_103);
          if (pdVar14 <= (byte *)(0xffffffffffffffffU >> ((uStack_108 & 0xff) * -8 & 0x38)))
          goto joined_r0x0040cf3c;
        }
code_r0x0040dba0:
        pdVar28 = (dword *)((ulong)&pdStack_208 & 0xffffffffffff0000 | uVar40 & 0xff00 | 0x34);
        goto code_r0x0040d6c4;
      }
joined_r0x0040cf3c:
      pdStack_b8 = pdVar28;
      pbStack_b0 = pbVar30;
      pdStack_f8 = pdVar14;
      if (bStack_c0 == 1) {
        pdVar28 = pdStack_b8;
        pbVar30 = pbStack_b0;
        if ((uVar24 & 0x100) == 0) {
          pdStack_c8 = (dword *)0x0;
          uVar40 = 0x100;
          uStack_be = (uVar24 >> 8 & 0xff) << 8;
        }
        else {
          pdStack_f8 = (dword *)0x0;
          lStack_f0 = 0;
          puStack_e0 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
          pdStack_e8 = (dword *)((long)&MACH_HEADER.magic + 1);
          pdStack_d0 = (dword *)0x0;
          pdStack_c8 = (dword *)0x0;
          pdStack_d8 = (dword *)0x0;
          bStack_c0 = 0;
          bStack_bf = bStack_104;
          uStack_be = 0;
          uVar40 = 0x100;
        }
        goto code_r0x0040cd10;
      }
      uStack_be._1_1_ = (byte)(uVar24 >> 8);
      pdVar19 = (dword *)(ulong)uStack_be._1_1_;
      uStack_be = uVar24;
      if ((uVar24 & 0x100) == 0) {
        dVar9 = (dword)puStack_e0;
        dVar10 = (dword)pdStack_d8;
        if (uVar38 != 0) {
          pdVar19 = pdVar44 + uVar38 * 6;
          pbVar21 = (byte *)0x0;
          if (((ulong *)(pdVar19 + -6) != (ulong *)0x0) &&
             (pbVar21 = *(byte **)(pdVar19 + -6), (dword *)pbVar21 == pdVar14)) {
            *(dword **)(pdVar19 + -4) = pdStack_e8;
            ((mach_header *)(pdVar19 + -2))->magic = (dword)puStack_e0;
            pdVar19[-1] = (dword)pdStack_d8;
            goto code_r0x0040d664;
          }
        }
        if (uVar38 == uStack_220) {
          func_0x00403d9c(&uStack_220,&UNK_009d9c00);
          pbVar21 = extraout_x9_00;
          uVar26 = extraout_x11_00;
          pdVar44 = pdStack_218;
        }
        pdVar19 = pdVar44 + uVar38 * 6;
        *(dword **)pdVar19 = pdVar14;
        *(dword **)(pdVar19 + 2) = pdVar7;
        pdVar19[4] = dVar9;
        pdVar19[5] = dVar10;
        uVar38 = uVar38 + 1;
        uStack_210 = uVar38;
      }
      else if (uVar38 != 0) {
        uVar37 = *(undefined8 *)pdStack_218;
        pdStack_218 = pdVar34;
        uStack_220 = uVar8;
        uStack_210 = 0;
        if (uVar38 < uVar22) {
          pdVar15 = (dword *)func_0x00187bd8(pdVar15,uVar22 * 0x18,8);
          pbVar21 = extraout_x9;
          uVar26 = extraout_x11;
          if (pdVar15 == (dword *)0x0) {
            func_0x007a1f00(8,uVar38 * 0x18,&UNK_009d9c18);
            goto LAB_0040ded0;
          }
        }
        pdVar19 = pdStack_228;
        if ((ulong *)pdStack_228 == puStack_238) {
          func_0x00403f14(&puStack_238,&UNK_009d9c30);
          pbVar21 = extraout_x9_01;
          uVar26 = extraout_x11_01;
        }
        pdVar28 = pdStack_230 + (long)pdVar19 * 8;
        *(dword **)pdVar28 = pdVar15;
        *(ulong *)(pdVar28 + 2) = uVar38;
        *(undefined8 *)(pdVar28 + 4) = uVar37;
        *(dword **)(pdVar28 + 6) = pdVar14;
        pdVar19 = (dword *)((long)pdVar19 + 1);
        pdVar44 = &MACH_HEADER.cpusubtype;
        uVar38 = 0;
        pdStack_260 = &uStack_103;
        pdStack_228 = pdVar19;
      }
code_r0x0040d664:
      if ((uStack_be & 0x100) != 0) {
        pdVar19 = (dword *)(ulong)bStack_104;
        pdStack_f8 = (dword *)0x0;
        lStack_f0 = 0;
        pbVar21 = (byte *)((long)&uStack_1e8 + 1);
        puStack_e0 = (undefined1 *)((long)&MACH_HEADER.magic + 1);
        pdStack_e8 = (dword *)((long)&MACH_HEADER.magic + 1);
        bStack_c0 = 0;
        pdStack_d8 = (dword *)0x0;
        pdStack_d0 = (dword *)0x0;
        bStack_bf = bStack_104;
        uStack_be = 0;
      }
    }
    if ((ulong *)((long)&MACH_HEADER.magic + 1) < pdStack_228) {
      if (&MACH_HEADER.sizeofcmds < pdStack_228) {
        func_0x003f9e18(pdStack_230,pdStack_228,&bStack_90);
      }
      else {
        func_0x003f9658();
      }
    }
    pbStack_a8 = (byte *)0x0;
    pdStack_a0 = &MACH_HEADER.cpusubtype;
    pdStack_98 = (dword *)0x0;
    if (uStack_108._2_2_ < 5) {
      if (pdStack_208 != (dword *)0x2e) {
        pdVar28 = (dword *)&pdStack_208;
        goto code_r0x0040d880;
      }
    }
    else if (pbStack_158 != (byte *)0x0) {
      pdVar28 = pdStack_160;
code_r0x0040d880:
      func_0x0040c048(&bStack_90,uVar17,in_x3,pdVar28,&pdStack_208);
      pdVar39 = pdStack_80;
      pdVar28 = pdStack_88;
      lVar36 = CONCAT26(uStack_8a,CONCAT42(iStack_8e,CONCAT11(bStack_8f,bStack_90)));
      if (lVar36 != -0x8000000000000000) {
        func_0x00403d9c(&pbStack_a8,&UNK_009d9c60);
        goto code_r0x0040d908;
      }
      pdVar39 = &MACH_HEADER.cpusubtype;
      pdVar16 = pdStack_80;
      goto code_r0x0040da24;
    }
    func_0x00403d9c(&pbStack_a8,&UNK_009d9c48);
    lVar36 = 0;
    pdVar39 = (dword *)0x0;
    pdVar28 = (dword *)((long)&MACH_HEADER.magic + 1);
code_r0x0040d908:
    lVar13 = 0;
    lVar35 = 0;
    *(long *)pdStack_a0 = lVar36;
    *(dword **)(pdStack_a0 + 2) = pdVar28;
    *(dword **)(pdStack_a0 + 4) = pdVar39;
    pdVar14 = pdStack_a0;
    pdVar39 = &MACH_HEADER.magic;
    do {
      pdStack_98 = (dword *)((long)pdVar39 + 1);
      pdVar28 = pdStack_98;
      if (uStack_108._2_2_ < 5) {
        if (pdStack_98 == (dword *)0x0) {
          if (pdStack_208 == (dword *)0x2e) {
            if (pbStack_a8 != (byte *)0x0) goto code_r0x0040dcb4;
            goto code_r0x0040dcc8;
          }
          pdVar39 = (dword *)&pdStack_208;
        }
        else {
          if (pbStack_158 <= pdVar39) goto code_r0x0040da48;
          pdVar39 = (dword *)((long)pdStack_160 + lVar13);
        }
      }
      else {
        if (pbStack_158 <= pdStack_98) {
code_r0x0040da48:
          if (pdStack_98 < pbStack_a8) {
            if (pdStack_98 == (dword *)0x0) {
code_r0x0040dcb4:
              func_0x00187bd4(pdStack_a0,(long)pbStack_a8 * 0x18,8);
              pdVar39 = &MACH_HEADER.cpusubtype;
            }
            else {
              pdVar39 = (dword *)func_0x00187bd8(pdStack_a0,(long)pbStack_a8 * 0x18,8,lVar35 + 0x18)
              ;
              if (pdVar39 == (dword *)0x0) {
                func_0x007a1f00(8,lVar35 + 0x18,&UNK_009d9c90);
                goto LAB_0040ded0;
              }
            }
          }
          else {
code_r0x0040dcc8:
            pdVar39 = pdStack_a0;
          }
          pdVar14 = pdStack_228;
          pdVar16 = pdStack_230;
          if (pdStack_228 < puStack_238) {
            if (pdStack_228 == (dword *)0x0) {
              func_0x00187bd4(pdStack_230,(long)puStack_238 << 5,8);
              pdVar16 = &MACH_HEADER.cpusubtype;
            }
            else {
              lVar36 = (long)pdStack_228 << 5;
              pdVar16 = (dword *)func_0x00187bd8(pdStack_230,(long)puStack_238 << 5,8,lVar36);
              if (pdVar16 == (dword *)0x0) {
                func_0x007a1f00(8,lVar36,&UNK_009d9ca8);
                goto LAB_0040ded0;
              }
            }
          }
          if (pdStack_1b0 != (dword *)0x0) {
            func_0x00187bd4(pdStack_1a8,(long)pdStack_1b0 << 2,2);
          }
          if (uStack_198 != 0) {
            func_0x00187bd4(pdStack_190,uStack_198 * 0x18,8);
          }
          if (pdStack_180 != (dword *)0x0) {
            func_0x00187bd4(lStack_178,(long)pdStack_180 << 2,2);
          }
          if (pbStack_168 != (byte *)0x0) {
            func_0x00187bd4(pdStack_160,(long)pbStack_168 * 0x58,8);
          }
          if (uStack_220 != 0) {
            func_0x00187bd4(pdStack_218,uStack_220 * 0x18,8);
          }
          goto code_r0x0040d7a4;
        }
        pdVar39 = pdStack_160 + (long)pdStack_98 * 0x16;
      }
      func_0x0040c048(&bStack_90,uVar17,in_x3,pdVar39,&pdStack_208);
      pdVar16 = pdStack_80;
      pdVar34 = pdStack_88;
      pdVar39 = pdStack_a0;
      lVar36 = CONCAT26(uStack_8a,CONCAT42(iStack_8e,CONCAT11(bStack_8f,bStack_90)));
      if (lVar36 == -0x8000000000000000) goto code_r0x0040d9f0;
      if (pdVar28 == (dword *)pbStack_a8) {
        func_0x00403d9c(&pbStack_a8,&UNK_009d9c78);
        pdVar14 = pdStack_a0;
      }
      *(long *)((long)pdVar14 + lVar35 + 0x18) = lVar36;
      *(dword **)((long)pdVar14 + lVar35 + 0x20) = pdVar34;
      *(dword **)((long)pdVar14 + lVar35 + 0x28) = pdVar16;
      lVar35 = lVar35 + 0x18;
      lVar13 = lVar13 + 0x58;
      pdVar39 = pdVar28;
    } while( true );
  }
  goto LAB_0040d7c0;
code_r0x0040d698:
  uVar26 = 0;
  pdVar19 = (dword *)0x0;
  iVar20 = 0;
  uVar43 = 6;
  goto code_r0x0040d6a8;
code_r0x0040dabc:
  pdVar39 = (dword *)((byte *)((long)pdStack_b8 + (long)(pbVar33 + (long)pbVar25)) + 2);
code_r0x0040db98:
  uVar26 = 0;
  pdVar19 = (dword *)0x0;
  iVar20 = 0;
  uVar43 = 0x13;
code_r0x0040d6a8:
  pdVar28 = (dword *)((ulong)(uint)(iVar20 << 0x10) | (long)pdVar19 << 0x20 |
                     uVar43 | (uVar26 & 0xff) << 8);
  pdStack_b8 = (dword *)((long)&MACH_HEADER.magic + 1);
  pbStack_b0 = (byte *)0x0;
  pdVar16 = pdVar39;
  goto code_r0x0040d6c4;
code_r0x0040d674:
  pdVar28 = (dword *)((long)pdStack_b8 + (long)pbStack_b0);
code_r0x0040d680:
  uVar26 = 0;
  pdVar19 = (dword *)0x0;
  iVar20 = 0;
code_r0x0040d68c:
  uVar43 = 0x13;
  pdVar39 = pdVar28;
  goto code_r0x0040d6a8;
code_r0x0040d9f0:
  if (pdVar28 != (dword *)0x0) {
    pdVar14 = pdStack_a0 + 2;
    do {
      if (*(long *)(pdVar14 + -2) != 0) {
        func_0x00187bd4(*(long *)pdVar14,*(long *)(pdVar14 + -2),1);
      }
      pdVar14 = pdVar14 + 6;
      pdVar28 = (dword *)((long)pdVar28 + -1);
    } while (pdVar28 != (dword *)0x0);
  }
code_r0x0040da24:
  pdVar28 = pdStack_88;
  if (pbStack_a8 != (byte *)0x0) {
    func_0x00187bd4(pdVar39,(long)pbStack_a8 * 0x18,8);
  }
code_r0x0040d6c4:
  if (pdStack_1b0 != (dword *)0x0) {
    func_0x00187bd4(pdStack_1a8,(long)pdStack_1b0 << 2,2);
  }
  if (uStack_198 != 0) {
    func_0x00187bd4(pdStack_190,uStack_198 * 0x18,8);
  }
  if (pdStack_180 != (dword *)0x0) {
    func_0x00187bd4(lStack_178,(long)pdStack_180 << 2,2);
  }
  if (pbStack_168 != (byte *)0x0) {
    func_0x00187bd4(pdStack_160,(long)pbStack_168 * 0x58,8);
  }
  if (uStack_220 != 0) {
    func_0x00187bd4(pdStack_218,uStack_220 * 0x18,8);
  }
  pdVar39 = pdStack_230;
  if (pdStack_228 != (dword *)0x0) {
    pdVar14 = pdStack_230 + 2;
    pdVar34 = pdStack_228;
    do {
      if (*(long *)pdVar14 != 0) {
        uVar17._0_4_ = ((mach_header *)(pdVar14 + -2))->magic;
        uVar17._4_4_ = ((mach_header *)(pdVar14 + -2))->cputype;
        func_0x00187bd4(uVar17,*(long *)pdVar14 * 0x18,8);
      }
      pdVar14 = pdVar14 + 8;
      pdVar34 = (dword *)((long)pdVar34 + -1);
    } while (pdVar34 != (dword *)0x0);
  }
  pdVar14 = (dword *)0x0;
  if (puStack_238 != (ulong *)0x0) {
    func_0x00187bd4(pdVar39,(long)puStack_238 << 5,8);
  }
  pdVar39 = (dword *)0x0;
code_r0x0040d7a4:
  pdStack_208 = pdVar39;
  pdStack_200 = pdVar28;
  pdStack_1f8 = pdVar16;
  pdStack_1f0 = pdVar14;
  if ((*auVar45._8_8_ & 1) == 0) {
    if (*auVar45._8_8_ != 0) {
      func_0x003f7a44(auVar45._8_8_ + 1);
    }
    *auVar45._8_8_ = 1;
    auVar45._8_8_[2] = (ulong)pdStack_200;
    auVar45._8_8_[1] = (ulong)pdStack_208;
    auVar45._8_8_[4] = (ulong)pdStack_1f0;
    auVar45._8_8_[3] = (ulong)pdStack_1f8;
    uVar40 = auVar45._8_8_[1];
    goto joined_r0x0040d80c;
  }
  func_0x003f7a44(&pdStack_208);
LAB_0040d7c0:
  uVar40 = auVar45._8_8_[1];
joined_r0x0040d80c:
  if (uVar40 == 0) {
    uVar40 = auVar45._8_8_[2];
    auVar45._0_8_[1] = auVar45._8_8_[3];
    *auVar45._0_8_ = uVar40;
  }
  else {
    auVar45._0_8_[1] = (ulong)(auVar45._8_8_ + 1);
    *(undefined1 *)auVar45._0_8_ = 0x4f;
  }
  return;
}

