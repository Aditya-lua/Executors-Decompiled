
/* WARNING: Removing unreachable block (ram,0x00439440) */
/* WARNING: Removing unreachable block (ram,0x0043a514) */
/* WARNING: Removing unreachable block (ram,0x00439450) */
/* WARNING: Removing unreachable block (ram,0x00439470) */
/* WARNING: Type propagation algorithm not settling */

void FUN_00439560(undefined8 param_1,undefined8 param_2,undefined1 *param_3,undefined1 *param_4,
                 uint *param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8,
                 undefined8 param_9,dword *param_10,long param_11,dword *param_12,dword *param_13,
                 dword *param_14)

{
  byte *pbVar1;
  undefined8 *puVar2;
  ulong *puVar3;
  uint uVar4;
  byte bVar5;
  ushort uVar6;
  bool bVar7;
  long *plVar8;
  code *pcVar9;
  long lVar10;
  long lVar11;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  long extraout_x1_01;
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
  undefined8 extraout_x1_13;
  undefined8 extraout_x1_14;
  undefined8 extraout_x1_15;
  dword *pdVar12;
  ulong uVar13;
  dword *pdVar14;
  ulong uVar15;
  ulong uVar16;
  uint *puVar17;
  dword *extraout_x10;
  dword *extraout_x10_00;
  dword *extraout_x10_01;
  dword *extraout_x10_02;
  dword *extraout_x10_03;
  dword *extraout_x10_04;
  dword *extraout_x10_05;
  dword *extraout_x10_06;
  dword *extraout_x10_07;
  dword *pdVar18;
  dword *pdVar19;
  dword *extraout_x10_08;
  dword *extraout_x10_09;
  dword *extraout_x10_10;
  dword *extraout_x10_11;
  dword *extraout_x10_12;
  dword *extraout_x10_13;
  dword *extraout_x10_14;
  dword *extraout_x10_15;
  dword *extraout_x10_16;
  dword *extraout_x10_17;
  dword *extraout_x10_18;
  dword *extraout_x10_19;
  dword *extraout_x10_20;
  dword *extraout_x10_21;
  dword *extraout_x10_22;
  dword *extraout_x10_23;
  dword *extraout_x11;
  dword *extraout_x11_00;
  dword *extraout_x11_01;
  dword *extraout_x11_02;
  dword *extraout_x11_03;
  dword *extraout_x11_04;
  dword *extraout_x11_05;
  dword *extraout_x11_06;
  dword *extraout_x11_07;
  dword *pdVar20;
  dword *extraout_x11_08;
  dword *extraout_x11_09;
  dword *extraout_x11_10;
  uint *puVar21;
  dword *extraout_x11_11;
  dword *extraout_x11_12;
  dword *extraout_x11_13;
  dword *extraout_x11_14;
  dword *extraout_x11_15;
  dword *extraout_x11_16;
  dword *extraout_x11_17;
  dword *extraout_x11_18;
  dword *extraout_x11_19;
  dword *extraout_x11_20;
  dword *extraout_x11_21;
  dword *extraout_x11_22;
  dword *extraout_x12;
  dword *extraout_x12_00;
  dword *extraout_x12_01;
  dword *extraout_x12_02;
  dword *extraout_x12_03;
  dword *extraout_x12_04;
  dword *extraout_x12_05;
  dword *extraout_x12_06;
  dword *extraout_x12_07;
  dword *extraout_x12_08;
  dword *pdVar22;
  dword *extraout_x12_09;
  dword *extraout_x12_10;
  dword *extraout_x12_11;
  dword *extraout_x12_12;
  dword *extraout_x12_13;
  dword *pdVar23;
  dword *extraout_x12_14;
  dword *extraout_x12_15;
  dword *extraout_x12_16;
  dword *extraout_x12_17;
  dword *extraout_x12_18;
  dword *extraout_x12_19;
  dword *extraout_x12_20;
  dword *extraout_x12_21;
  dword *extraout_x12_22;
  dword *extraout_x12_23;
  dword *extraout_x12_24;
  dword *extraout_x12_25;
  dword *extraout_x12_26;
  dword *extraout_x13;
  dword *extraout_x13_00;
  dword *extraout_x13_01;
  dword *extraout_x13_02;
  dword *extraout_x13_03;
  dword *extraout_x13_04;
  dword *extraout_x13_05;
  dword *extraout_x13_06;
  dword *extraout_x13_07;
  dword *extraout_x13_08;
  dword *pdVar24;
  dword *extraout_x13_09;
  dword *extraout_x13_10;
  dword *extraout_x13_11;
  dword *extraout_x13_12;
  dword *extraout_x13_13;
  dword *extraout_x13_14;
  dword *extraout_x13_15;
  dword *extraout_x13_16;
  dword *extraout_x13_17;
  dword *extraout_x13_18;
  dword *extraout_x13_19;
  dword *extraout_x13_20;
  dword *extraout_x13_21;
  dword *extraout_x13_22;
  dword *extraout_x13_23;
  dword *extraout_x13_24;
  dword *extraout_x13_25;
  dword *extraout_x13_26;
  dword *extraout_x13_27;
  uint uVar25;
  dword *extraout_x14;
  dword *extraout_x14_00;
  dword *extraout_x14_01;
  dword *extraout_x14_02;
  dword *extraout_x14_03;
  dword *extraout_x14_04;
  dword *extraout_x14_05;
  dword *extraout_x14_06;
  dword *extraout_x14_07;
  dword *extraout_x14_08;
  dword *pdVar26;
  dword *extraout_x14_09;
  dword *extraout_x14_10;
  dword *extraout_x14_11;
  dword *extraout_x14_12;
  dword *extraout_x14_13;
  dword *extraout_x14_14;
  dword *extraout_x14_15;
  dword *extraout_x14_16;
  dword *extraout_x14_17;
  dword *extraout_x14_18;
  dword *extraout_x14_19;
  dword *extraout_x14_20;
  dword *extraout_x14_21;
  dword *extraout_x14_22;
  dword *extraout_x14_23;
  dword *extraout_x14_24;
  dword *extraout_x14_25;
  dword *extraout_x14_26;
  dword *extraout_x14_27;
  dword *extraout_x14_28;
  dword *extraout_x15;
  dword *extraout_x15_00;
  dword *extraout_x15_01;
  dword *extraout_x15_02;
  dword *extraout_x15_03;
  dword *extraout_x15_04;
  dword *extraout_x15_05;
  dword *extraout_x15_06;
  dword *extraout_x15_07;
  dword *extraout_x15_08;
  dword *pdVar27;
  dword *extraout_x15_09;
  dword *extraout_x15_10;
  dword *extraout_x15_11;
  dword *extraout_x15_12;
  dword *extraout_x15_13;
  dword *extraout_x15_14;
  dword *extraout_x15_15;
  dword *extraout_x15_16;
  dword *extraout_x15_17;
  dword *extraout_x15_18;
  dword *extraout_x15_19;
  dword *extraout_x15_20;
  dword *extraout_x15_21;
  dword *extraout_x15_22;
  dword *extraout_x15_23;
  dword *extraout_x15_24;
  dword *extraout_x15_25;
  dword *extraout_x15_26;
  dword *extraout_x15_27;
  long extraout_x16;
  long extraout_x16_00;
  long extraout_x16_01;
  long extraout_x16_02;
  long extraout_x16_03;
  long extraout_x16_04;
  long extraout_x16_05;
  long extraout_x16_06;
  long extraout_x16_07;
  long extraout_x16_08;
  long extraout_x16_09;
  long extraout_x16_10;
  long extraout_x16_11;
  long extraout_x16_12;
  long extraout_x16_13;
  long extraout_x16_14;
  long extraout_x16_15;
  long extraout_x16_16;
  long extraout_x16_17;
  long extraout_x16_18;
  long extraout_x16_19;
  long extraout_x16_20;
  long extraout_x16_21;
  long extraout_x16_22;
  long extraout_x16_23;
  long extraout_x16_24;
  long extraout_x16_25;
  long extraout_x16_26;
  long extraout_x16_27;
  long extraout_x16_28;
  ulong extraout_x17;
  ulong extraout_x17_00;
  ulong extraout_x17_01;
  ulong extraout_x17_02;
  ulong extraout_x17_03;
  ulong extraout_x17_04;
  ulong extraout_x17_05;
  ulong extraout_x17_06;
  ulong extraout_x17_07;
  ulong extraout_x17_08;
  ulong extraout_x17_09;
  ulong extraout_x17_10;
  ulong extraout_x17_11;
  ulong extraout_x17_12;
  ulong extraout_x17_13;
  ulong extraout_x17_14;
  ulong uVar28;
  ulong extraout_x17_15;
  ulong extraout_x17_16;
  ulong extraout_x17_17;
  ulong extraout_x17_18;
  ulong extraout_x17_19;
  ulong extraout_x17_20;
  ulong extraout_x17_21;
  ulong extraout_x17_22;
  ulong extraout_x17_23;
  ulong extraout_x17_24;
  ulong extraout_x17_25;
  ulong extraout_x17_26;
  ulong extraout_x17_27;
  ulong extraout_x17_28;
  undefined8 uVar29;
  ulong unaff_x19;
  long *plVar30;
  long lVar31;
  undefined8 *unaff_x20;
  uint *puVar32;
  ulong uVar33;
  dword *unaff_x21;
  uint *puVar34;
  undefined8 *puVar35;
  dword *unaff_x22;
  long *unaff_x23;
  long unaff_x24;
  uint *unaff_x25;
  dword *unaff_x26;
  undefined1 *puVar36;
  undefined1 *puVar37;
  dword *unaff_x27;
  dword *pdVar38;
  dword *pdVar39;
  long unaff_x29;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined8 uVar45;
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  uint uStack0000000000000054;
  dword *in_stack_00000060;
  uint uStack0000000000000074;
  dword *in_stack_00000088;
  undefined8 *in_stack_000000a8;
  undefined8 *in_stack_000000b0;
  uint uStack00000000000000c0;
  undefined1 *in_stack_00000100;
  byte in_stack_00000108;
  dword *in_stack_00000110;
  dword *in_stack_00000118;
  uint *in_stack_00000120;
  uint *in_stack_00000128;
  long in_stack_00000138;
  long *in_stack_00000140;
  long *in_stack_00000148;
  dword *in_stack_00000280;
  uint *in_stack_00000288;
  dword *in_stack_00000290;
  dword *in_stack_00000298;
  ulong in_stack_000002a0;
  undefined8 in_stack_000002a8;
  undefined8 in_stack_000002b0;
  undefined8 in_stack_000002b8;
  dword *in_stack_000002c0;
  uint *in_stack_000002c8;
  dword *pdVar57;
  dword *in_stack_000002d0;
  dword *in_stack_000002d8;
  ulong in_stack_000002e0;
  undefined8 in_stack_000002e8;
  undefined8 in_stack_000002f0;
  undefined8 in_stack_000002f8;
  undefined8 in_stack_00000300;
  undefined7 in_stack_00000308;
  undefined1 in_stack_0000030f;
  undefined7 in_stack_00000310;
  long in_stack_00000340;
  long in_stack_00000348;
  uint *in_stack_00000350;
  ulong in_stack_00000370;
  undefined7 in_stack_00000378;
  undefined1 in_stack_0000037f;
  undefined7 in_stack_00000380;
  undefined1 in_stack_00000387;
  ulong in_stack_00000390;
  undefined7 in_stack_00000398;
  undefined1 in_stack_0000039f;
  undefined7 in_stack_000003a0;
  undefined1 in_stack_000003a7;
  undefined1 uVar58;
  undefined7 uVar59;
  undefined1 uVar60;
  byte in_stack_00000410;
  byte bVar61;
  undefined7 in_stack_00000411;
  undefined1 in_stack_00000418;
  undefined1 in_stack_00000419;
  uint6 in_stack_0000041a;
  undefined1 in_stack_00000420;
  undefined7 in_stack_00000421;
  dword *in_stack_00000428;
  uint *in_stack_00000430;
  dword *in_stack_00000438;
  dword *in_stack_00000440;
  ulong in_stack_00000448;
  undefined8 in_stack_00000450;
  undefined8 in_stack_00000458;
  undefined8 in_stack_00000460;
  long in_stack_00000640;
  undefined7 in_stack_00000668;
  undefined1 in_stack_0000066f;
  undefined7 in_stack_00000670;
  undefined1 in_stack_00000677;
  uint in_stack_00000688;
  long in_stack_000006a0;
  long in_stack_000006f8;
  undefined8 in_stack_00000700;
  long in_stack_00000710;
  undefined8 in_stack_00000718;
  long in_stack_00000728;
  undefined8 in_stack_00000730;
  long in_stack_00000740;
  undefined8 in_stack_00000748;
  long *in_stack_000007b0;
  undefined8 in_stack_000007d8;
  dword *in_stack_000007e8;
  dword *in_stack_000007f8;
  undefined1 auStack_7ffffffe [2];
  dword adStack_7ffffffc [536870911];
  
  do {
    pdVar22 = in_stack_000002c0;
    pdVar57 = in_stack_000002d0;
    if (CONCAT71(in_stack_00000411,in_stack_00000410) != 2) {
      param_3 = (undefined1 *)0x1c0;
      _memcpy(auStack_7ffffffe + 0x8000063e,auStack_7ffffffe + 0x8000040e);
      in_stack_000002d8 = (dword *)(in_stack_000007b0 + 2);
      in_stack_000002d0 = (dword *)CONCAT17(in_stack_0000066f,in_stack_00000668);
      pdVar18 = (dword *)CONCAT17(in_stack_00000677,in_stack_00000670);
      in_stack_000002e0 = 0;
      pdVar27 = extraout_x15_08;
      pdVar57 = unaff_x26;
      if (pdVar18 == (dword *)0x0) {
        uVar25 = 0x13;
        in_stack_000002c8 = (uint *)0x0;
        pdVar20 = in_stack_000002d8;
        pdVar23 = extraout_x12_08;
        pdVar24 = extraout_x13_08;
        pdVar26 = extraout_x14_08;
        pdVar22 = in_stack_000002d0;
        goto code_r0x0043a39c;
      }
      pdVar39 = (dword *)0x0;
      pdVar20 = (dword *)0x0;
      pdVar24 = (dword *)(1 - (long)pdVar18);
      pdVar22 = (dword *)((long)in_stack_000002d0 + 1);
      while( true ) {
        bVar61 = *(undefined1 *)((long)pdVar22 - 1);
        pdVar26 = (dword *)(ulong)bVar61;
        pdVar23 = pdVar22;
        if (((int)pdVar20 == 0x3f) && (1 < bVar61)) {
          in_stack_000002c8 = (uint *)-(long)pdVar24;
          uVar25 = 6;
          in_stack_000002d0 = pdVar39;
          goto code_r0x0043a39c;
        }
        pdVar27 = (dword *)(((ulong)pdVar26 & 0x7f) << ((ulong)pdVar20 & 0x3f));
        pdVar39 = (dword *)((ulong)pdVar27 | (ulong)pdVar39);
        if (-1 < (char)bVar61) break;
        pdVar22 = (dword *)((long)pdVar22 + 1);
        pdVar20 = (dword *)(ulong)((int)pdVar20 + 7);
        pdVar24 = (dword *)((long)pdVar24 + 1);
        if (pdVar24 == (dword *)((long)&MACH_HEADER.magic + 1)) {
          in_stack_000002c8 = (uint *)0x0;
          uVar25 = 0x13;
          pdVar23 = pdVar22;
          in_stack_000002d0 = (dword *)((long)pdVar18 + (long)in_stack_000002d0);
          pdVar22 = (dword *)((long)pdVar18 + (long)in_stack_000002d0);
          goto code_r0x0043a39c;
        }
      }
      in_stack_000002c8 = (uint *)-(long)pdVar24;
      if (pdVar39 != (dword *)0x0) {
        pdVar18 = (dword *)in_stack_000007b0[4];
        if ((undefined1 *)((long)pdVar39 + -1) < pdVar18) {
          lVar10 = in_stack_000007b0[3] + ((long)pdVar39 + -1) * 0x70;
          goto code_r0x00439770;
        }
        lVar11 = in_stack_000007b0[5];
        if (lVar11 == 0) goto code_r0x0043a5dc;
        lVar31 = in_stack_000007b0[6];
        break;
      }
      lVar10 = *in_stack_000007b0;
      *in_stack_000007b0 = lVar10 + -1;
      LORelease();
      if (lVar10 == 1) {
        DataMemoryBarrier(2,1);
        func_0x00403c44(unaff_x26 + 0x5c);
      }
      if (in_stack_000006a0 != 0x2f) {
        if (in_stack_000006f8 != 0) {
          param_3 = (undefined1 *)0x2;
          func_0x00187bd4(in_stack_00000700,in_stack_000006f8 << 2);
        }
        if (in_stack_00000710 != 0) {
          param_3 = (undefined1 *)0x8;
          func_0x00187bd4(in_stack_00000718,in_stack_00000710 * 0x18);
        }
        if (in_stack_00000728 != 0) {
          param_3 = (undefined1 *)0x2;
          func_0x00187bd4(in_stack_00000730,in_stack_00000728 << 2);
        }
        if (in_stack_00000740 != 0) {
          param_3 = (undefined1 *)0x8;
          func_0x00187bd4(in_stack_00000748,in_stack_00000740 * 0x58);
        }
      }
    }
LAB_004394ac:
    do {
      do {
        do {
          auVar46 = func_0x004074fc(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003ae);
          uVar40 = auVar46._8_8_;
          in_stack_000002c0 = (dword *)CONCAT71(in_stack_00000411,in_stack_00000410);
          unaff_x25 = (uint *)CONCAT62(in_stack_0000041a,
                                       CONCAT11(in_stack_00000419,in_stack_00000418));
          in_stack_000002d0 = (dword *)CONCAT71(in_stack_00000421,in_stack_00000420);
          pdVar18 = extraout_x10_07;
          pdVar20 = extraout_x11_07;
          pdVar23 = extraout_x12_07;
          pdVar24 = extraout_x13_07;
          pdVar26 = extraout_x14_07;
          pdVar27 = extraout_x15_07;
          lVar10 = extraout_x16_07;
          uVar28 = extraout_x17_07;
          if (in_stack_000002c0 == (uint *)((long)&MACH_HEADER.magic + 3U)) {
            uVar25 = (uint)unaff_x25 & 0xff;
            pdVar38 = (dword *)((ulong)unaff_x25 >> 8);
            uVar33 = (ulong)in_stack_0000041a;
            goto code_r0x00438cf8;
          }
          in_stack_00000640 = *(long *)(unaff_x24 + 0x18);
          in_stack_00000668 = (undefined7)*(undefined8 *)(unaff_x24 + 0x40);
          in_stack_0000066f = (undefined1)((ulong)*(undefined8 *)(unaff_x24 + 0x40) >> 0x38);
          in_stack_00000670 = (undefined7)*(undefined8 *)(unaff_x24 + 0x48);
          in_stack_00000677 = (undefined1)((ulong)*(undefined8 *)(unaff_x24 + 0x48) >> 0x38);
          in_stack_00000288 = *(uint **)(unaff_x26 + 6);
          in_stack_00000280 = *(dword **)(unaff_x26 + 4);
          in_stack_00000298 = *(dword **)(unaff_x26 + 10);
          in_stack_00000290 = *(dword **)(unaff_x26 + 8);
          in_stack_000002a0 = *(ulong *)(unaff_x26 + 0xc);
          if (in_stack_000002c0 == (uint *)((long)&MACH_HEADER.magic + 2U)) {
            pdVar39 = (dword *)CONCAT17(in_stack_0000037f,in_stack_00000378);
            uVar33 = CONCAT17(in_stack_00000387,in_stack_00000380);
            if (uVar33 < 2) {
              if (uVar33 == 0) {
                if (in_stack_00000370 == 0) goto joined_r0x0043a488;
                param_3 = (undefined1 *)0x8;
                auVar46 = func_0x00187bd4(pdVar39,in_stack_00000370 << 5);
                pdVar39 = &MACH_HEADER.cpusubtype;
                pdVar18 = extraout_x10_21;
                pdVar20 = extraout_x11_20;
                pdVar23 = extraout_x12_22;
                pdVar24 = extraout_x13_23;
                pdVar26 = extraout_x14_24;
                pdVar27 = extraout_x15_23;
                lVar10 = extraout_x16_24;
                uVar28 = extraout_x17_24;
                goto joined_r0x0043a46c;
              }
            }
            else if (uVar33 < 0x15) {
              auVar46 = func_0x003f9500(pdVar39,uVar33);
              pdVar23 = extraout_x12_25;
              pdVar24 = extraout_x13_26;
              pdVar26 = extraout_x14_27;
              pdVar27 = extraout_x15_26;
              lVar10 = extraout_x16_27;
              uVar28 = extraout_x17_27;
            }
            else {
              param_3 = auStack_7ffffffe + 0x8000040e;
              auVar46 = func_0x003f9b64(pdVar39,uVar33);
              pdVar23 = extraout_x12_26;
              pdVar24 = extraout_x13_27;
              pdVar26 = extraout_x14_28;
              pdVar27 = extraout_x15_27;
              lVar10 = extraout_x16_28;
              uVar28 = extraout_x17_28;
            }
            puVar36 = (undefined1 *)(uVar33 << 5);
            pdVar12 = (dword *)0xffffffffffffffff;
            puVar37 = puVar36;
            do {
              pdVar18 = (dword *)((long)pdVar39 + (long)puVar37);
              pdVar20 = *(dword **)(pdVar18 + -8);
              pdVar19 = pdVar20;
              if (pdVar12 <= pdVar20) {
                pdVar19 = pdVar12;
              }
              *(dword **)(pdVar18 + -2) = pdVar19;
              puVar37 = puVar37 + -0x20;
              pdVar12 = pdVar19;
            } while (puVar37 != (undefined1 *)0x0);
            if (in_stack_00000370 <= uVar33) {
joined_r0x0043a488:
              in_stack_000002d0 = (dword *)CONCAT17(in_stack_0000039f,in_stack_00000398);
              if (in_stack_00000390 <= CONCAT17(in_stack_000003a7,in_stack_000003a0))
              goto code_r0x0043a4d4;
code_r0x0043a4a8:
              if (CONCAT17(in_stack_000003a7,in_stack_000003a0) != 0) {
                puVar37 = (undefined1 *)(CONCAT17(in_stack_000003a7,in_stack_000003a0) * 0x230);
                param_3 = (undefined1 *)0x8;
                param_4 = puVar37;
                auVar46 = func_0x00187bd8(CONCAT17(in_stack_0000039f,in_stack_00000398));
                in_stack_000002d0 = auVar46._0_8_;
                pdVar18 = extraout_x10_22;
                pdVar20 = extraout_x11_21;
                pdVar23 = extraout_x12_23;
                pdVar24 = extraout_x13_24;
                pdVar26 = extraout_x14_25;
                pdVar27 = extraout_x15_24;
                lVar10 = extraout_x16_25;
                uVar28 = extraout_x17_25;
                if (in_stack_000002d0 == (dword *)0x0) {
                  func_0x007a1f00(8,puVar37,&UNK_009d9d80);
code_r0x0043a748:
                    /* WARNING: Does not return */
                  pcVar9 = (code *)SoftwareBreakpoint(1,0x43a74c);
                  (*pcVar9)();
                }
                goto code_r0x0043a4d4;
              }
              param_3 = (undefined1 *)0x8;
              auVar46 = func_0x00187bd4(CONCAT17(in_stack_0000039f,in_stack_00000398),
                                        in_stack_00000390 * 0x230);
              in_stack_000002d0 = &MACH_HEADER.cpusubtype;
              uVar25 = (uint)in_stack_00000380 & 0xff;
              pdVar38 = (dword *)(uVar33 >> 8);
              uVar33 = uVar33 >> 0x10;
              uVar40 = 0;
              pdVar18 = extraout_x10_23;
              pdVar20 = extraout_x11_22;
              pdVar23 = extraout_x12_24;
              pdVar24 = extraout_x13_25;
              pdVar26 = extraout_x14_26;
              pdVar27 = extraout_x15_25;
              lVar10 = extraout_x16_26;
              uVar28 = extraout_x17_26;
              if (in_stack_00000340 != 0) goto code_r0x00438d60;
              goto code_r0x00438d74;
            }
            param_3 = (undefined1 *)0x8;
            param_4 = puVar36;
            auVar46 = func_0x00187bd8(pdVar39,in_stack_00000370 << 5);
            pdVar39 = auVar46._0_8_;
            pdVar18 = extraout_x10_15;
            pdVar20 = extraout_x11_14;
            pdVar23 = extraout_x12_16;
            pdVar24 = extraout_x13_17;
            pdVar26 = extraout_x14_18;
            pdVar27 = extraout_x15_17;
            lVar10 = extraout_x16_18;
            uVar28 = extraout_x17_18;
            if (pdVar39 == (dword *)0x0) {
              func_0x007a1f00(8,puVar36,&UNK_009d9d68);
              goto code_r0x0043a748;
            }
joined_r0x0043a46c:
            in_stack_000002d0 = (dword *)CONCAT17(in_stack_0000039f,in_stack_00000398);
            if (CONCAT17(in_stack_000003a7,in_stack_000003a0) < in_stack_00000390)
            goto code_r0x0043a4a8;
code_r0x0043a4d4:
            uVar40 = CONCAT17(in_stack_000003a7,in_stack_000003a0);
            uVar25 = (uint)in_stack_00000380 & 0xff;
            pdVar38 = (dword *)(uVar33 >> 8);
            uVar33 = uVar33 >> 0x10;
            if (in_stack_00000340 == 0) goto code_r0x00438d74;
            goto code_r0x00438d60;
          }
        } while ((in_stack_00000410 & 1) != 0);
      } while (in_stack_000002d0 == (uint *)((long)&MACH_HEADER.cputype + 1U));
      unaff_x19 = CONCAT17(in_stack_000003a7,in_stack_000003a0);
      if (in_stack_000002d0 == (uint *)((long)&MACH_HEADER.magic + 2U)) {
        pdVar57 = (dword *)((long)&MACH_HEADER.magic + 2);
        *(undefined8 *)(unaff_x22 + 8) = *(undefined8 *)(unaff_x24 + 0x20);
        *(long *)(unaff_x22 + 6) = in_stack_00000640;
        *(uint **)(unaff_x22 + 0xc) = in_stack_00000288;
        *(dword **)(unaff_x22 + 10) = in_stack_00000280;
        *(dword **)(unaff_x22 + 0x10) = in_stack_00000298;
        *(dword **)(unaff_x22 + 0xe) = in_stack_00000290;
        *(ulong *)(unaff_x22 + 0x12) = in_stack_000002a0;
        param_3 = auStack_7ffffffe + 0x800002be;
        func_0x00407a20(auStack_7ffffffe + 0x8000040e,unaff_x23 + 2);
        pdVar22 = in_stack_000002c0;
        in_stack_000002c8 = unaff_x25;
        if (CONCAT71(in_stack_00000411,in_stack_00000410) != 2) {
          _memcpy(auStack_7ffffffe + 0x8000063e,auStack_7ffffffe + 0x8000040e,0x1c0);
code_r0x00439654:
          pdVar22 = (dword *)0x0;
          _memcpy(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000063e,0x1c0);
          unaff_x20[1] = in_stack_000002c8;
          *unaff_x20 = 0;
          unaff_x20[3] = in_stack_000002d8;
          unaff_x20[2] = pdVar57;
          unaff_x20[4] = in_stack_000002e0;
          if (unaff_x19 == in_stack_00000390) {
            func_0x00404150(auStack_7ffffffe + 0x8000038e,&UNK_009d9d50);
          }
          param_3 = (undefined1 *)0x230;
          _memcpy(CONCAT17(in_stack_0000039f,in_stack_00000398) + unaff_x19 * 0x230,
                  auStack_7ffffffe + 0x8000040e);
          in_stack_000003a0 = (undefined7)(unaff_x19 + 1);
          in_stack_000003a7 = (undefined1)(unaff_x19 + 1 >> 0x38);
        }
        goto LAB_004394ac;
      }
    } while (in_stack_000002d0 == (uint *)((long)&MACH_HEADER.magic + 1U));
    *(undefined8 *)(unaff_x22 + 8) = *(undefined8 *)(unaff_x24 + 0x20);
    *(long *)(unaff_x22 + 6) = in_stack_00000640;
    *(uint **)(unaff_x22 + 0xc) = in_stack_00000288;
    *(dword **)(unaff_x22 + 10) = in_stack_00000280;
    *(dword **)(unaff_x22 + 0x10) = in_stack_00000298;
    *(dword **)(unaff_x22 + 0xe) = in_stack_00000290;
    *(ulong *)(unaff_x22 + 0x12) = in_stack_000002a0;
    param_3 = auStack_7ffffffe + 0x800002be;
    func_0x00407a20(auStack_7ffffffe + 0x8000040e,unaff_x23 + 2);
    in_stack_000002c8 = unaff_x25;
  } while( true );
code_r0x00439be0:
  pdVar23 = (dword *)(ulong)*(ushort *)(lVar11 + 0x532);
  pdVar24 = (dword *)((long)pdVar23 << 3);
  lVar10 = lVar11 + -0x70;
  pdVar18 = (dword *)0xffffffffffffffff;
  pdVar12 = (dword *)(lVar11 + 0x4d8);
  do {
    if (pdVar24 == (dword *)0x0) {
      pdVar24 = (dword *)0x0;
      pdVar18 = pdVar23;
      pdVar20 = pdVar12;
      goto code_r0x00439c2c;
    }
    pdVar20 = pdVar12 + 2;
    uVar25 = (uint)(*(uint **)pdVar12 < pdVar39);
    if (pdVar39 < *(uint **)pdVar12) {
      uVar25 = 0xffffffff;
    }
    pdVar24 = (dword *)((long)pdVar24 + -8);
    lVar10 = lVar10 + 0x70;
    pdVar18 = (dword *)((long)pdVar18 + 1);
    uVar25 = uVar25 & 0xff;
    pdVar26 = (dword *)(ulong)uVar25;
    pdVar12 = pdVar20;
  } while (uVar25 == 1);
  if (uVar25 == 0) goto code_r0x00439770;
code_r0x00439c2c:
  if (lVar31 == 0) goto code_r0x0043a5dc;
  lVar11 = *(long *)(lVar11 + (long)pdVar18 * 8 + 0x538);
  lVar31 = lVar31 + -1;
  goto code_r0x00439be0;
code_r0x00439770:
  in_stack_000002e0 = (ulong)(*(char *)(lVar10 + 0x6a) == '\x01');
  func_0x00445ad4();
  if (extraout_x1_01 == 0) {
    lVar10 = 0;
    uVar28 = 0;
    pdVar39 = (dword *)0x0;
    uVar40 = 0;
    pdVar26 = extraout_x14_09;
  }
  else {
    _uStack00000000000000c0 = 0;
    uStack0000000000000074 = 0;
    uStack0000000000000054 = 0;
    bVar7 = false;
    pdVar19 = (dword *)(ulong)in_stack_00000688;
    pdVar12 = (dword *)((ulong)(in_stack_00000688 >> 8) & 0xff);
    uVar25 = in_stack_00000688 & 0xff00;
    pdVar39 = in_stack_000007f8;
    if ((in_stack_00000108 & in_stack_00000688 < 0x50000) == 0) {
      pdVar39 = (dword *)0x0;
    }
    uVar33 = (long)in_stack_00000128 - (long)in_stack_000007e8;
    pdVar14 = (dword *)((long)in_stack_000007e8 + (long)in_stack_00000118);
    pdVar38 = (dword *)(extraout_x1_01 << 4);
    do {
      param_3 = (undefined1 *)(ulong)unaff_x26[0x12];
      param_4 = auStack_7ffffffe + 0x800003fe;
      func_0x00405760(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800002be);
      lVar11 = CONCAT71(in_stack_00000411,in_stack_00000410);
      uVar15 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418));
      uVar40 = extraout_x1_03;
      pdVar18 = extraout_x10_08;
      pdVar20 = extraout_x11_08;
      pdVar23 = extraout_x12_09;
      pdVar24 = extraout_x13_10;
      pdVar26 = extraout_x14_11;
      pdVar27 = extraout_x15_10;
      lVar10 = extraout_x16_10;
      uVar28 = extraout_x17_10;
      in_stack_000002d0 = (dword *)CONCAT71(in_stack_00000421,in_stack_00000420);
      if (lVar11 == 0x2e) goto code_r0x0043a6c8;
      uVar58 = (undefined1)(in_stack_0000041a >> 0x28);
      uVar59 = SUB87((dword *)CONCAT71(in_stack_00000421,in_stack_00000420),0);
      uVar60 = (undefined1)((uint7)in_stack_00000421 >> 0x30);
      uVar4 = (uint)in_stack_00000428 & 0xffff;
      pdVar27 = extraout_x15_10;
      if (uVar4 < 0x13) {
        if (uVar4 == 0x11) {
          func_0x00406c1c(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003de);
          uVar40 = extraout_x1_06;
          pdVar24 = extraout_x13_13;
          pdVar26 = extraout_x14_14;
          pdVar27 = extraout_x15_13;
          lVar10 = extraout_x16_13;
          uVar28 = extraout_x17_13;
          if (CONCAT71(in_stack_00000411,in_stack_00000410) == 0) {
            _uStack00000000000000c0 = 1;
            in_stack_00000060 =
                 (dword *)CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418));
          }
          else if (CONCAT71(in_stack_00000411,in_stack_00000410) == 0xc) {
            pdVar18 = extraout_x10_10;
            pdVar20 = param_13;
            pdVar23 = extraout_x12_11;
            if (in_stack_00000128 < in_stack_000007e8) {
code_r0x0043a5e4:
              uVar25 = 0x13;
              in_stack_000002d0 = in_stack_00000118;
            }
            else {
              uVar16 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418)) *
                       ((ulong)pdVar19 & 0xff);
              uVar13 = uVar33 - uVar16;
              if (uVar33 < uVar16) {
code_r0x0043a5f0:
                uVar25 = 0x13;
                pdVar23 = pdVar19;
                in_stack_000002d0 = pdVar14;
              }
              else {
                in_stack_000002d0 = (dword *)((long)pdVar14 + uVar16);
                uVar4 = in_stack_00000688 & 0xff;
                pdVar18 = (dword *)(ulong)uVar4;
                if (uVar4 < 4) {
                  if (uVar4 == 1) {
                    if (uVar33 != uVar16) {
                      param_13 = (dword *)(ulong)(byte)*in_stack_000002d0;
                      goto code_r0x00439b8c;
                    }
                  }
                  else {
                    if (uVar4 != 2) goto code_r0x0043a6a0;
                    if (1 < uVar13) {
                      param_13 = (dword *)(ulong)(ushort)*in_stack_000002d0;
                      goto code_r0x00439b8c;
                    }
                  }
                }
                else if (uVar4 == 4) {
                  if (3 < uVar13) {
                    param_13 = (dword *)(ulong)*in_stack_000002d0;
code_r0x00439b8c:
                    _uStack00000000000000c0 = 1;
                    in_stack_00000060 = param_13;
                    goto code_r0x00439858;
                  }
                }
                else {
                  if (uVar4 != 8) {
code_r0x0043a6a0:
                    uVar25 = 0x19;
                    pdVar23 = pdVar19;
                    pdVar38 = pdVar19;
                    in_stack_000002d0 = pdVar20;
                    goto code_r0x0043a648;
                  }
                  if (7 < uVar13) {
                    param_13 = (dword *)(((ulong)*in_stack_000002d0 << 8 |
                                         (ulong)(uint3)in_stack_000002d0[1] << 0x28) >> 8 |
                                        (ulong)(byte)*(undefined1 *)((long)in_stack_000002d0 + 7) <<
                                        0x38);
                    goto code_r0x00439b8c;
                  }
                }
code_r0x0043a61c:
                uVar25 = 0x13;
                pdVar23 = pdVar19;
                pdVar38 = (dword *)0x0;
              }
            }
code_r0x0043a648:
            uVar33 = 0;
            goto code_r0x0043a3a4;
          }
        }
        else if (uVar4 == 0x12) {
          func_0x00406c1c(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003de);
          lVar31 = CONCAT71(in_stack_00000411,in_stack_00000410);
          uVar40 = extraout_x1_04;
          pdVar24 = extraout_x13_11;
          pdVar26 = extraout_x14_12;
          pdVar27 = extraout_x15_11;
          lVar10 = extraout_x16_11;
          uVar28 = extraout_x17_11;
          if (lVar31 == 0) {
            uStack0000000000000074 = 1;
            param_12 = (dword *)CONCAT62(in_stack_0000041a,
                                         CONCAT11(in_stack_00000419,in_stack_00000418));
          }
          else if (lVar31 == 7) {
            uStack0000000000000054 = 1;
            param_11 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418));
          }
          else if (lVar31 == 0xc) {
            pdVar18 = extraout_x10_09;
            pdVar20 = in_stack_00000088;
            pdVar23 = pdVar19;
            if (in_stack_00000128 < in_stack_000007e8) goto code_r0x0043a5e4;
            uVar16 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418)) *
                     ((ulong)pdVar19 & 0xff);
            uVar13 = uVar33 - uVar16;
            if (uVar33 < uVar16) goto code_r0x0043a5f0;
            in_stack_000002d0 = (dword *)((long)pdVar14 + uVar16);
            uVar4 = in_stack_00000688 & 0xff;
            pdVar18 = (dword *)(ulong)uVar4;
            if (uVar4 < 4) {
              if (uVar4 == 1) {
                if (uVar33 == uVar16) goto code_r0x0043a61c;
                param_12 = (dword *)(ulong)(byte)*in_stack_000002d0;
              }
              else {
                if (uVar4 != 2) goto code_r0x0043a6a0;
                if (uVar13 < 2) goto code_r0x0043a61c;
                param_12 = (dword *)(ulong)(ushort)*in_stack_000002d0;
              }
            }
            else if (uVar4 == 4) {
              if (uVar13 < 4) goto code_r0x0043a61c;
              param_12 = (dword *)(ulong)*in_stack_000002d0;
            }
            else {
              if (uVar4 != 8) goto code_r0x0043a6a0;
              if (uVar13 < 8) goto code_r0x0043a61c;
              param_12 = (dword *)(((ulong)*in_stack_000002d0 << 8 |
                                   (ulong)(uint3)in_stack_000002d0[1] << 0x28) >> 8 |
                                  (ulong)(byte)*(undefined1 *)((long)in_stack_000002d0 + 7) << 0x38)
              ;
            }
            uStack0000000000000074 = 1;
            in_stack_00000088 = param_12;
          }
        }
      }
      else if (uVar4 == 0x13) {
        func_0x00406c1c(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003de);
        uVar40 = extraout_x1_02;
        pdVar24 = extraout_x13_09;
        pdVar26 = extraout_x14_10;
        pdVar27 = extraout_x15_09;
        lVar10 = extraout_x16_09;
        uVar28 = extraout_x17_09;
      }
      else if (uVar4 == 0x55) {
        func_0x00406c1c(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003de);
        lVar31 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418));
        uVar40 = extraout_x1_05;
        pdVar24 = extraout_x13_12;
        pdVar26 = extraout_x14_13;
        pdVar27 = extraout_x15_12;
        lVar10 = extraout_x16_12;
        uVar28 = extraout_x17_12;
        if (CONCAT71(in_stack_00000411,in_stack_00000410) == 0x16) {
          param_14 = (dword *)((long)pdVar39 + lVar31);
          bVar7 = true;
        }
        else {
          if (CONCAT71(in_stack_00000411,in_stack_00000410) == 0x18) {
            pdVar18 = in_stack_000007f8;
            if (in_stack_000007f8 <= in_stack_00000120) {
              uVar16 = lVar31 * (long)pdVar12;
              uVar13 = ((long)in_stack_00000120 - (long)in_stack_000007f8) - uVar16;
              if ((ulong)((long)in_stack_00000120 - (long)in_stack_000007f8) < uVar16) {
                pdVar20 = (dword *)((long)in_stack_000007f8 + (long)in_stack_00000110);
                pdVar18 = pdVar12;
              }
              else {
                pdVar20 = (dword *)((long)in_stack_000007f8 + (long)in_stack_00000110 + uVar16);
                pdVar18 = (dword *)(ulong)uVar25;
                if (uVar25 == 0x800) {
                  if (7 < uVar13) {
                    uVar13 = ((ulong)*pdVar20 << 8 | (ulong)(uint3)pdVar20[1] << 0x28) >> 8 |
                             (ulong)(byte)*(undefined1 *)((long)pdVar20 + 7) << 0x38;
                    goto code_r0x00439adc;
                  }
                }
                else if (3 < uVar13) {
                  uVar13 = (ulong)*pdVar20;
code_r0x00439adc:
                  param_14 = (dword *)((long)in_stack_000007f8 + uVar13);
                  bVar7 = true;
                  goto code_r0x00439858;
                }
              }
              in_stack_00000110 = pdVar20;
            }
            pdVar38 = (dword *)0x0;
            uVar25 = 0x13;
            pdVar20 = extraout_x11_09;
            pdVar23 = extraout_x12_10;
            in_stack_000002d0 = in_stack_00000110;
            goto code_r0x0043a648;
          }
          bVar7 = false;
        }
      }
code_r0x00439858:
      pdVar38 = pdVar38 + -4;
    } while (pdVar38 != (uint *)0x0);
    if (bVar7) {
      uVar25 = in_stack_00000688 >> 0x10;
      lVar31 = 0x18;
      if (uVar25 < 5) {
        lVar31 = 8;
      }
      pdVar18 = *(dword **)((long)unaff_x27 + lVar31);
      in_stack_000002d0 = *(dword **)(unaff_x27 + (ulong)(4 < uVar25) * 4);
      pdVar39 = (dword *)((long)pdVar18 - (long)param_14);
      if (pdVar18 < param_14) {
        uVar33 = 0;
        pdVar38 = (dword *)0x0;
        uVar25 = 0x13;
        pdVar20 = unaff_x27;
        pdVar23 = param_14;
      }
      else {
        in_stack_00000430 = (uint *)((long)param_14 + (long)in_stack_000002d0);
        bVar61 = (byte)in_stack_00000118;
        in_stack_00000411 = (undefined7)((ulong)in_stack_00000118 >> 8);
        in_stack_00000418 = SUB81(in_stack_00000128,0);
        in_stack_00000419 = (undefined1)((ulong)in_stack_00000128 >> 8);
        in_stack_0000041a = (uint6)((ulong)in_stack_00000128 >> 0x10);
        in_stack_00000420 = (undefined1)in_stack_000007d8;
        in_stack_00000421 = (undefined7)((ulong)in_stack_000007d8 >> 8);
        in_stack_00000440 =
             (dword *)CONCAT35((int3)((ulong)in_stack_00000440 >> 0x28),
                               CONCAT14(4 < uVar25,in_stack_00000688));
        func_0x0040a694(auStack_7ffffffe + 0x800003de,auStack_7ffffffe + 0x8000040e);
        uVar40 = extraout_x1_07;
        pdVar18 = extraout_x10_11;
        pdVar20 = extraout_x11_10;
        pdVar23 = extraout_x12_12;
        pdVar24 = extraout_x13_14;
        pdVar26 = extraout_x14_15;
        pdVar27 = extraout_x15_14;
        lVar10 = extraout_x16_14;
        uVar28 = extraout_x17_14;
        in_stack_00000428 = in_stack_000007e8;
        in_stack_00000438 = pdVar39;
        if (lVar11 != 2) {
          pdVar38 = (dword *)0x0;
          do {
            uVar33 = CONCAT17(uVar60,uVar59);
            uVar28 = CONCAT17(uVar58,(int7)uVar15);
            if ((in_stack_00000410 & 1) == 0) goto code_r0x0043a154;
            if (uVar28 < uVar33) {
              uVar13 = CONCAT17(in_stack_00000387,in_stack_00000380);
              if (uVar13 == in_stack_00000370) {
                func_0x00403f14(auStack_7ffffffe + 0x8000036e,&UNK_009d9d98);
              }
              puVar3 = (ulong *)(CONCAT17(in_stack_0000037f,in_stack_00000378) + uVar13 * 0x20);
              *puVar3 = uVar28;
              puVar3[1] = uVar33;
              puVar3[2] = unaff_x19;
              puVar3[3] = 0;
              in_stack_00000380 = (undefined7)(uVar13 + 1);
              in_stack_00000387 = (undefined1)(uVar13 + 1 >> 0x38);
              pdVar38 = (dword *)((long)&MACH_HEADER.magic + 1);
            }
            func_0x0040a694(auStack_7ffffffe + 0x800003de,auStack_7ffffffe + 0x8000040e);
            uVar40 = extraout_x1_10;
            pdVar18 = extraout_x10_14;
            pdVar20 = extraout_x11_13;
            pdVar23 = extraout_x12_15;
            pdVar24 = extraout_x13_16;
            pdVar26 = extraout_x14_17;
            pdVar27 = extraout_x15_16;
            lVar10 = extraout_x16_17;
            uVar28 = extraout_x17_17;
          } while (lVar11 != 2);
        }
        in_stack_000002d0 = (dword *)CONCAT17(uVar60,uVar59);
        uVar33 = CONCAT17(uVar58,(int7)uVar15);
        uVar25 = (uint)uVar15 & 0xff;
        pdVar38 = (dword *)(uVar33 >> 8);
        if (uVar25 == 0x4f) goto code_r0x0043a154;
        uVar33 = uVar33 >> 0x10;
        in_stack_00000410 = bVar61;
      }
      goto code_r0x0043a3a4;
    }
    pdVar39 = (dword *)(ulong)uStack0000000000000054;
    uVar28 = (ulong)uStack0000000000000074;
    lVar10 = _uStack00000000000000c0;
  }
  bVar61 = in_stack_00000410;
  if (in_stack_00000350 == (uint *)0x0) {
code_r0x0043a0c0:
    if (lVar10 != 0) {
      if (uVar28 == 0) {
        if (pdVar39 != (dword *)0x0) {
          pdVar22 = (dword *)((long)in_stack_00000060 + param_11);
          if (in_stack_00000060 < pdVar22) {
            if (CONCAT17(in_stack_00000387,in_stack_00000380) == in_stack_00000370) {
              func_0x00403f14(auStack_7ffffffe + 0x8000036e,&UNK_009d9d98);
              unaff_x22 = (dword *)(auStack_7ffffffe + 0x800002be);
            }
            else {
              unaff_x22 = (dword *)(auStack_7ffffffe + 0x800002be);
            }
            goto code_r0x0043a2c8;
          }
          pdVar38 = (dword *)0x0;
          unaff_x22 = (dword *)(auStack_7ffffffe + 0x800002be);
          goto code_r0x0043a154;
        }
      }
      else if (in_stack_00000060 < param_12) {
        pdVar22 = param_12;
        if (CONCAT17(in_stack_00000387,in_stack_00000380) == in_stack_00000370) {
          func_0x00403f14(auStack_7ffffffe + 0x8000036e,&UNK_009d9d98);
        }
code_r0x0043a2c8:
        puVar35 = (undefined8 *)
                  (CONCAT17(in_stack_0000037f,in_stack_00000378) +
                  CONCAT17(in_stack_00000387,in_stack_00000380) * 0x20);
        *puVar35 = in_stack_00000060;
        puVar35[1] = pdVar22;
        puVar35[2] = unaff_x19;
        puVar35[3] = 0;
        lVar10 = CONCAT17(in_stack_00000387,in_stack_00000380) + 1;
        in_stack_00000380 = (undefined7)lVar10;
        in_stack_00000387 = (undefined1)((ulong)lVar10 >> 0x38);
        goto code_r0x00439654;
      }
    }
  }
  else {
    if (in_stack_00000350 == (uint *)((long)&MACH_HEADER.magic + 1U)) {
      pdVar18 = (dword *)0x0;
    }
    else {
      pdVar18 = (dword *)0x0;
      puVar21 = in_stack_00000350;
      do {
        pdVar27 = (dword *)((long)pdVar18 + ((ulong)puVar21 >> 1));
        pdVar26 = *(dword **)(in_stack_00000348 + (long)pdVar27 * 0x10);
        if (pdVar26 <= unaff_x25) {
          pdVar18 = pdVar27;
        }
        puVar21 = (uint *)((long)puVar21 - ((ulong)puVar21 >> 1));
      } while ((uint *)((long)&MACH_HEADER.magic + 1) < puVar21);
    }
    if (*(uint **)(in_stack_00000348 + (long)pdVar18 * 0x10) != unaff_x25) goto code_r0x0043a0c0;
    pdVar24 = (dword *)(in_stack_00000348 + (long)pdVar18 * 0x10);
    do {
      pdVar20 = pdVar24;
      pdVar23 = pdVar18;
      pdVar18 = (dword *)0x0;
      pdVar24 = pdVar20;
      if (pdVar23 == (dword *)0x0) break;
      pdVar18 = (dword *)((long)pdVar23 - 1);
      pdVar24 = pdVar20 + -4;
      pdVar26 = *(dword **)pdVar24;
    } while (pdVar26 == unaff_x25);
    if (in_stack_00000350 != pdVar23) {
      uVar25 = 1;
code_r0x00439db4:
      pdVar12 = pdVar20 + 4;
      uStack00000000000000c0 = uVar25;
      if (*(uint **)pdVar20 == unaff_x25) {
        param_3 = *(undefined1 **)(pdVar20 + 2);
        if (param_3 <= in_stack_00000100) {
          func_0x0040a3e0(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800003de);
          uVar40 = extraout_x1_08;
          pdVar20 = extraout_x11_11;
          pdVar23 = extraout_x12_13;
          pdVar39 = extraout_x15_15;
          lVar10 = extraout_x16_15;
          uVar28 = extraout_x17_15;
          if ((char)((ulong)in_stack_00000438 >> 8) == '\x03') {
            unaff_x21 = (dword *)CONCAT62(in_stack_0000041a,
                                          CONCAT11(in_stack_00000419,in_stack_00000418));
            pdVar18 = extraout_x10_12;
            pdVar24 = extraout_x13_15;
            pdVar26 = extraout_x14_16;
            goto code_r0x0043a6c4;
          }
          puVar21 = (uint *)CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418)
                                    );
          pdVar18 = (dword *)((ulong)in_stack_00000438 >> 0x10 & 0xffff);
          uVar6 = (ushort)in_stack_00000438;
          pdVar24 = (dword *)((ulong)in_stack_00000438 & 0xffffffff);
          pdVar26 = (dword *)(((ulong)in_stack_00000438 & 0x7f) << 1);
          if (!(8 < (uVar6 & 0xff) || (1 << (ulong)(uVar6 & 0x1f) & 0x116U) == 0)) {
            pdVar14 = (dword *)(0xffffffffffffffff >> ((uint)in_stack_00000438 * -8 & 0x38));
            pdVar19 = (dword *)CONCAT71(in_stack_00000411,in_stack_00000410);
            do {
              uVar4 = (uint)in_stack_00000438 & 0xff;
              if (uVar4 == 1) {
                pdVar39 = pdVar19;
                puVar34 = puVar21;
                unaff_x22 = pdVar19;
                do {
                  pdVar19 = unaff_x22;
                  if (puVar34 == (uint *)0x0) goto code_r0x0043a088;
                  puVar17 = (uint *)0x0;
                  pdVar18 = (dword *)-(long)puVar34;
                  puVar21 = puVar34;
                  do {
                    pdVar23 = pdVar26;
                    pdVar39 = pdVar19;
                    if (puVar21 < pdVar26) goto code_r0x0043a088;
                    unaff_x22 = pdVar19;
                    if (puVar17 == puVar34) {
                      uVar15 = 0;
                      pdVar27 = (dword *)((long)puVar17 + (long)pdVar19);
                      pdVar18 = (dword *)((long)&MACH_HEADER.ncmds + 3);
                      pdVar20 = (dword *)0x0;
                      goto code_r0x0043a688;
                    }
                    if ((long)puVar17 + (long)pdVar18 == -1) {
                      pdVar27 = (dword *)((long)puVar17 + 1 + (long)pdVar19);
                      pdVar20 = (dword *)0x0;
                      goto code_r0x0043a67c;
                    }
                    pbVar1 = (byte *)((long)puVar17 + (long)pdVar19);
                    puVar32 = (uint *)(ulong)*pbVar1;
                    puVar21 = (uint *)((long)puVar21 + -2);
                    bVar5 = *(byte *)((long)puVar17 + 1 + (long)pdVar19);
                    uVar33 = (ulong)bVar5;
                    puVar17 = (uint *)((long)puVar17 + 2);
                    pdVar20 = (dword *)(ulong)(bVar5 | *pbVar1);
                  } while (pdVar20 == (dword *)0x0);
                  unaff_x22 = (dword *)((long)puVar17 + (long)pdVar19);
                  puVar34 = puVar21;
                } while (pdVar14 == puVar32);
              }
              else if (uVar4 == 2) {
                unaff_x22 = pdVar19;
                do {
                  pdVar39 = pdVar19;
                  if (puVar21 == (uint *)0x0) goto code_r0x0043a088;
                  pdVar39 = (dword *)((long)unaff_x22 + 2);
                  pdVar19 = unaff_x22;
                  do {
                    pdVar27 = pdVar39;
                    pdVar39 = pdVar19;
                    if (puVar21 < pdVar26) goto code_r0x0043a088;
                    pdVar20 = pdVar26;
                    if (puVar21 < (uint *)((long)&MACH_HEADER.magic + 2)) goto code_r0x0043a628;
                    if (((ulong)puVar21 & 0xfffffffffffffffe) == 2) goto code_r0x0043a67c;
                    puVar32 = (uint *)(ulong)*(ushort *)((long)pdVar27 - 2);
                    puVar21 = puVar21 + -1;
                    uVar33 = (ulong)(ushort)*pdVar27;
                    pdVar19 = pdVar19 + 1;
                    pdVar18 = (dword *)(ulong)(ushort)((ushort)*pdVar27 |
                                                      *(ushort *)((long)pdVar27 - 2));
                    pdVar39 = pdVar27 + 1;
                  } while (pdVar18 == (dword *)0x0);
                  unaff_x22 = (dword *)((long)pdVar27 + 2);
                } while (pdVar14 == puVar32);
              }
              else {
                pdVar27 = pdVar19;
                if (uVar4 == 4) {
                  do {
                    pdVar39 = pdVar19;
                    if (puVar21 == (uint *)0x0) goto code_r0x0043a088;
                    pdVar39 = pdVar19 + 1;
                    do {
                      pdVar27 = pdVar39;
                      pdVar39 = pdVar19;
                      if (puVar21 < pdVar26) goto code_r0x0043a088;
                      if (puVar21 < &MACH_HEADER.cputype) goto code_r0x0043a628;
                      if (((ulong)puVar21 & 0xfffffffffffffffc) == 4) goto code_r0x0043a67c;
                      puVar32 = (uint *)(ulong)pdVar27[-1];
                      uVar33 = (ulong)*pdVar27;
                      puVar21 = puVar21 + -2;
                      pdVar19 = pdVar19 + 2;
                      pdVar18 = (dword *)(ulong)(*pdVar27 | pdVar27[-1]);
                      pdVar39 = pdVar27 + 2;
                    } while (pdVar18 == (dword *)0x0);
                    pdVar19 = pdVar27 + 1;
                  } while (pdVar14 == puVar32);
                }
                else {
                  do {
                    pdVar39 = pdVar27;
                    if (puVar21 == (uint *)0x0) goto code_r0x0043a088;
                    do {
                      pdVar18 = pdVar39;
                      if (puVar21 < pdVar26) goto code_r0x0043a088;
                      if (puVar21 < &MACH_HEADER.cpusubtype) {
                        uVar15 = 0;
                        pdVar18 = (dword *)((long)&MACH_HEADER.ncmds + 3);
                        goto code_r0x0043a688;
                      }
                      if (((ulong)puVar21 & 0xfffffffffffffff8) == 8) {
                        pdVar27 = pdVar39 + 2;
code_r0x0043a67c:
                        uVar15 = 0;
                        pdVar18 = (dword *)((long)&MACH_HEADER.ncmds + 3);
                        goto code_r0x0043a688;
                      }
                      puVar32 = (uint *)(((ulong)*pdVar39 << 8 | (ulong)(uint3)pdVar39[1] << 0x28)
                                         >> 8 | (ulong)(byte)*(undefined1 *)((long)pdVar39 + 7) <<
                                                0x38);
                      puVar21 = puVar21 + -4;
                      pdVar18 = pdVar39 + 4;
                      pdVar23 = (dword *)(ulong)(ushort)pdVar39[3];
                      uVar33 = ((ulong)pdVar39[2] << 8 | (ulong)(uint3)pdVar39[3] << 0x28) >> 8 |
                               (ulong)(byte)*(undefined1 *)((long)pdVar39 + 0xf) << 0x38;
                      pdVar27 = pdVar27 + 4;
                      pdVar20 = (dword *)(uVar33 | (ulong)puVar32);
                      pdVar39 = pdVar18;
                    } while (pdVar20 == (dword *)0x0);
                    pdVar19 = pdVar18;
                    pdVar27 = pdVar18;
                  } while (puVar32 == pdVar14);
                }
                unaff_x22 = pdVar19;
              }
              if (CARRY8((ulong)puVar32,uVar33)) {
code_r0x0043a70c:
                uVar15 = 0x34;
                pdVar27 = pdVar19;
                in_stack_000002d0 = param_10;
                goto code_r0x0043a690;
              }
              pdVar27 = (dword *)((long)puVar32 + uVar33);
              pdVar18 = pdVar14;
              if (pdVar14 < pdVar27) goto code_r0x0043a70c;
              pdVar19 = unaff_x22;
              param_10 = pdVar27;
              if (uVar33 != 0) {
                uVar33 = CONCAT17(in_stack_00000387,in_stack_00000380);
                if (uVar33 == in_stack_00000370) {
                  func_0x00403f14(auStack_7ffffffe + 0x8000036e,&UNK_009d9d20);
                  uVar40 = extraout_x1_09;
                  pdVar18 = extraout_x10_13;
                  pdVar20 = extraout_x11_12;
                  pdVar23 = extraout_x12_14;
                  lVar10 = extraout_x16_16;
                  uVar28 = extraout_x17_16;
                }
                uVar25 = 0;
                puVar35 = (undefined8 *)
                          (CONCAT17(in_stack_0000037f,in_stack_00000378) + uVar33 * 0x20);
                *puVar35 = puVar32;
                puVar35[1] = pdVar27;
                puVar35[2] = unaff_x19;
                puVar35[3] = 0;
                in_stack_00000380 = (undefined7)(uVar33 + 1);
                in_stack_00000387 = (undefined1)(uVar33 + 1 >> 0x38);
              }
            } while( true );
          }
          if ((puVar21 == (uint *)0x0) || (puVar21 < pdVar26)) goto code_r0x0043a09c;
          uVar15 = (ulong)((uVar6 & 0xff) << 8);
          pdVar18 = (dword *)((long)&MACH_HEADER.flags + 1);
          pdVar27 = extraout_x15_15;
          goto code_r0x0043a688;
        }
        in_stack_00000410 = 0x13;
code_r0x0043a6c4:
        uVar15 = CONCAT71(in_stack_00000411,in_stack_00000410);
        pdVar27 = pdVar39;
        in_stack_000002d0 = unaff_x21;
code_r0x0043a6c8:
        uVar25 = (uint)uVar15 & 0xff;
        pdVar38 = (dword *)(uVar15 >> 8);
        uVar33 = uVar15 >> 0x10;
        goto code_r0x0043a3a4;
      }
      goto code_r0x0043a0b4;
    }
  }
  pdVar38 = (dword *)0x0;
code_r0x0043a154:
  in_stack_00000410 = bVar61;
  if (((ulong)pdVar38 & 1) != 0) goto code_r0x00439654;
  if (in_stack_000006a0 == 0x2f) goto code_r0x00439654;
  param_4 = auStack_7ffffffe + 0x8000063e;
  param_5 = unaff_x26 + 0x18;
  func_0x0040c500(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x800002be,unaff_x23 + 2);
  if (bVar61 == 0x4f) {
    lVar11 = CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418));
    lVar10 = *(long *)(lVar11 + 0x18);
    if (lVar10 != 0) {
      uVar28 = CONCAT17(in_stack_00000387,in_stack_00000380);
      lVar31 = uVar28 << 5;
      puVar35 = (undefined8 *)(*(long *)(lVar11 + 0x10) + 0x10);
      lVar10 = lVar10 << 5;
      do {
        uVar29 = puVar35[1];
        uVar40 = *puVar35;
        if (uVar28 == in_stack_00000370) {
          func_0x00403f14(auStack_7ffffffe + 0x8000036e,&UNK_009d9d38);
        }
        puVar2 = (undefined8 *)(CONCAT17(in_stack_0000037f,in_stack_00000378) + lVar31);
        puVar2[1] = uVar29;
        *puVar2 = uVar40;
        puVar2[2] = unaff_x19;
        puVar2[3] = 0;
        uVar28 = uVar28 + 1;
        in_stack_00000380 = (undefined7)uVar28;
        in_stack_00000387 = (undefined1)(uVar28 >> 0x38);
        lVar31 = lVar31 + 0x20;
        puVar35 = puVar35 + 4;
        lVar10 = lVar10 + -0x20;
      } while (lVar10 != 0);
    }
  }
  unaff_x22 = (dword *)(auStack_7ffffffe + 0x800002be);
  goto code_r0x00439654;
code_r0x0043a628:
  pdVar27 = pdVar19;
  uVar15 = 0;
  pdVar18 = (dword *)((long)&MACH_HEADER.ncmds + 3);
code_r0x0043a688:
  uVar15 = (ulong)pdVar18 | uVar15;
  in_stack_000002d0 = pdVar27;
code_r0x0043a690:
  uVar33 = 0;
  uVar25 = (uint)uVar15 & 0xff;
  pdVar38 = (dword *)(uVar15 >> 8);
  goto code_r0x0043a3a4;
code_r0x0043a088:
  uStack00000000000000c0 = uVar25;
code_r0x0043a09c:
  unaff_x22 = (dword *)(auStack_7ffffffe + 0x800002be);
  pdVar20 = pdVar12;
  uVar25 = uStack00000000000000c0;
  if (pdVar12 == (uint *)(in_stack_00000348 + (long)in_stack_00000350 * 0x10))
  goto code_r0x0043a0b4;
  goto code_r0x00439db4;
code_r0x0043a0b4:
  pdVar38 = (dword *)(ulong)(uStack00000000000000c0 ^ 1);
  goto code_r0x0043a154;
code_r0x0043a5dc:
  uVar25 = 0x12;
  in_stack_000002d0 = pdVar39;
code_r0x0043a39c:
  uVar33 = 0;
  pdVar38 = (dword *)0x0;
  uVar40 = extraout_x1_00;
  lVar10 = extraout_x16_08;
  uVar28 = extraout_x17_08;
code_r0x0043a3a4:
  lVar11 = *in_stack_000007b0;
  *in_stack_000007b0 = lVar11 + -1;
  LORelease();
  if (lVar11 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403c44(unaff_x26 + 0x5c);
    uVar40 = extraout_x1_11;
    pdVar18 = extraout_x10_16;
    pdVar20 = extraout_x11_15;
    pdVar23 = extraout_x12_17;
    pdVar24 = extraout_x13_18;
    pdVar26 = extraout_x14_19;
    pdVar27 = extraout_x15_18;
    lVar10 = extraout_x16_19;
    uVar28 = extraout_x17_19;
  }
  if (in_stack_000006a0 != 0x2f) {
    if (in_stack_000006f8 != 0) {
      param_3 = (undefined1 *)0x2;
      func_0x00187bd4(in_stack_00000700,in_stack_000006f8 << 2);
      uVar40 = extraout_x1_12;
      pdVar18 = extraout_x10_17;
      pdVar20 = extraout_x11_16;
      pdVar23 = extraout_x12_18;
      pdVar24 = extraout_x13_19;
      pdVar26 = extraout_x14_20;
      pdVar27 = extraout_x15_19;
      lVar10 = extraout_x16_20;
      uVar28 = extraout_x17_20;
    }
    if (in_stack_00000710 != 0) {
      param_3 = (undefined1 *)0x8;
      func_0x00187bd4(in_stack_00000718,in_stack_00000710 * 0x18);
      uVar40 = extraout_x1_13;
      pdVar18 = extraout_x10_18;
      pdVar20 = extraout_x11_17;
      pdVar23 = extraout_x12_19;
      pdVar24 = extraout_x13_20;
      pdVar26 = extraout_x14_21;
      pdVar27 = extraout_x15_20;
      lVar10 = extraout_x16_21;
      uVar28 = extraout_x17_21;
    }
    if (in_stack_00000728 != 0) {
      param_3 = (undefined1 *)0x2;
      func_0x00187bd4(in_stack_00000730,in_stack_00000728 << 2);
      uVar40 = extraout_x1_14;
      pdVar18 = extraout_x10_19;
      pdVar20 = extraout_x11_18;
      pdVar23 = extraout_x12_20;
      pdVar24 = extraout_x13_21;
      pdVar26 = extraout_x14_22;
      pdVar27 = extraout_x15_21;
      lVar10 = extraout_x16_22;
      uVar28 = extraout_x17_22;
    }
    if (in_stack_00000740 != 0) {
      param_3 = (undefined1 *)0x8;
      func_0x00187bd4(in_stack_00000748,in_stack_00000740 * 0x58);
      uVar40 = extraout_x1_15;
      pdVar18 = extraout_x10_20;
      pdVar20 = extraout_x11_19;
      pdVar23 = extraout_x12_21;
      pdVar24 = extraout_x13_22;
      pdVar26 = extraout_x14_23;
      pdVar27 = extraout_x15_22;
      lVar10 = extraout_x16_23;
      uVar28 = extraout_x17_23;
    }
  }
code_r0x00438cf8:
  lVar11 = CONCAT17(in_stack_000003a7,in_stack_000003a0) + 1;
  lVar31 = CONCAT17(in_stack_0000039f,in_stack_00000398);
  while( true ) {
    auVar46._8_8_ = uVar40;
    auVar46._0_8_ = lVar31;
    lVar11 = lVar11 + -1;
    if (lVar11 == 0) break;
    lVar31 = lVar31 + 0x230;
    func_0x003f54bc();
    uVar40 = extraout_x1;
    pdVar18 = extraout_x10;
    pdVar20 = extraout_x11;
    pdVar23 = extraout_x12;
    pdVar24 = extraout_x13;
    pdVar26 = extraout_x14;
    pdVar27 = extraout_x15;
    lVar10 = extraout_x16;
    uVar28 = extraout_x17;
  }
  if (in_stack_00000390 != 0) {
    param_3 = (undefined1 *)0x8;
    auVar46 = func_0x00187bd4(CONCAT17(in_stack_0000039f,in_stack_00000398),
                              in_stack_00000390 * 0x230);
    pdVar18 = extraout_x10_00;
    pdVar20 = extraout_x11_00;
    pdVar23 = extraout_x12_00;
    pdVar24 = extraout_x13_00;
    pdVar26 = extraout_x14_00;
    pdVar27 = extraout_x15_00;
    lVar10 = extraout_x16_00;
    uVar28 = extraout_x17_00;
  }
  if (in_stack_00000370 != 0) {
    param_3 = (undefined1 *)0x8;
    auVar46 = func_0x00187bd4(CONCAT17(in_stack_0000037f,in_stack_00000378),in_stack_00000370 << 5);
    pdVar18 = extraout_x10_01;
    pdVar20 = extraout_x11_01;
    pdVar23 = extraout_x12_01;
    pdVar24 = extraout_x13_01;
    pdVar26 = extraout_x14_01;
    pdVar27 = extraout_x15_01;
    lVar10 = extraout_x16_01;
    uVar28 = extraout_x17_01;
  }
  uVar40 = 0;
  if (in_stack_00000340 == 0) {
code_r0x00438e14:
    *(ulong *)(unaff_x29 + -0x98) = ((ulong)pdVar38 & 0xff) << 8 | uVar33 << 0x10 | (ulong)uVar25;
    *(dword **)(unaff_x29 + -0x90) = in_stack_000002d0;
    *(undefined8 *)(unaff_x29 + -0xa0) = 0;
    lVar11 = *unaff_x23;
    *unaff_x23 = lVar11 + -1;
    LORelease();
    uVar29 = uVar40;
joined_r0x00438e3c:
    if (lVar11 == 1) {
      DataMemoryBarrier(2,1);
      uVar29 = 0;
      auVar46 = func_0x00403ad4(auStack_7ffffffe + 0x80000316);
      pdVar18 = extraout_x10_05;
      pdVar20 = extraout_x11_05;
      pdVar23 = extraout_x12_05;
      pdVar24 = extraout_x13_05;
      pdVar26 = extraout_x14_05;
      pdVar27 = extraout_x15_05;
      lVar10 = extraout_x16_05;
      uVar28 = extraout_x17_05;
    }
    plVar8 = *(long **)(unaff_x29 + -0xa0);
  }
  else {
    pdVar39 = (dword *)0x0;
code_r0x00438d60:
    param_3 = (undefined1 *)0x8;
    auVar46 = func_0x00187bd4(in_stack_00000348,in_stack_00000340 << 4);
    pdVar18 = extraout_x10_02;
    pdVar20 = extraout_x11_02;
    pdVar23 = extraout_x12_02;
    pdVar24 = extraout_x13_02;
    pdVar26 = extraout_x14_02;
    pdVar27 = extraout_x15_02;
    lVar10 = extraout_x16_02;
    uVar28 = extraout_x17_02;
    if (pdVar39 == (dword *)0x0) goto code_r0x00438e14;
code_r0x00438d74:
    lVar11 = unaff_x23[0x1c];
    uVar29 = uVar40;
    if (lVar11 != 0) {
      in_stack_00000280 = *(dword **)(lVar11 + 0x40);
      in_stack_00000288 = *(uint **)(lVar11 + 0x48);
      in_stack_00000290 = (dword *)0x0;
      auVar46 = func_0x004074fc(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000027e);
      uVar15 = CONCAT71(in_stack_00000411,in_stack_00000410);
      unaff_x22 = (dword *)CONCAT62(in_stack_0000041a,CONCAT11(in_stack_00000419,in_stack_00000418))
      ;
      uVar41 = CONCAT71(in_stack_00000421,in_stack_00000420);
      if (uVar15 != 3) {
        lVar31 = 0;
        uVar29 = 0x1c8;
        pdVar18 = extraout_x10_03;
        pdVar20 = extraout_x11_03;
        pdVar23 = extraout_x12_03;
        pdVar24 = extraout_x13_03;
        pdVar26 = extraout_x14_03;
        pdVar27 = extraout_x15_03;
        lVar10 = extraout_x16_03;
        uVar28 = extraout_x17_03;
        do {
          pdVar22 = in_stack_00000428;
          in_stack_000002c8 = in_stack_00000430;
          pdVar57 = in_stack_00000438;
          in_stack_000002d8 = in_stack_00000440;
          in_stack_000002e0 = in_stack_00000448;
          in_stack_000002e8 = in_stack_00000450;
          in_stack_000002f0 = in_stack_00000458;
          if (uVar15 == 2) goto code_r0x00439124;
          if ((uVar15 & 1) == 0) {
            in_stack_00000410 = (byte)uVar15;
            in_stack_00000411 = (undefined7)(uVar15 >> 8);
            in_stack_00000418 = SUB81(unaff_x22,0);
            in_stack_00000419 = (undefined1)((ulong)unaff_x22 >> 8);
            in_stack_0000041a = (uint6)((ulong)unaff_x22 >> 0x10);
            in_stack_00000420 = (undefined1)uVar41;
            in_stack_00000421 = (undefined7)((ulong)uVar41 >> 8);
            param_3 = auStack_7ffffffe + 0x8000040e;
            func_0x00407a20(auStack_7ffffffe + 0x8000063e,lVar11 + 0x10);
            if (in_stack_00000640 != 2) {
              _memcpy(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000063e,0x1c0);
              if (lVar31 == 0) {
                func_0x0040443c(auStack_7ffffffe + 0x800003de,&UNK_009d9db0);
              }
              param_3 = (undefined1 *)0x1c8;
              _memcpy(lVar31 * 0x1c8 + 8,auStack_7ffffffe + 0x8000040e);
              lVar31 = lVar31 + 1;
            }
          }
          auVar46 = func_0x004074fc(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000027e);
          uVar15 = CONCAT71(in_stack_00000411,in_stack_00000410);
          unaff_x22 = (dword *)CONCAT62(in_stack_0000041a,
                                        CONCAT11(in_stack_00000419,in_stack_00000418));
          uVar41 = CONCAT71(in_stack_00000421,in_stack_00000420);
          pdVar18 = extraout_x10_06;
          pdVar20 = extraout_x11_06;
          pdVar23 = extraout_x12_06;
          pdVar24 = extraout_x13_06;
          pdVar26 = extraout_x14_06;
          pdVar27 = extraout_x15_06;
          lVar10 = extraout_x16_06;
          uVar28 = extraout_x17_06;
        } while (uVar15 != 3);
      }
      func_0x003f5c50(auStack_7ffffffe + 0x800003de);
      *(dword **)(unaff_x29 + -0x98) = unaff_x22;
      *(undefined8 *)(unaff_x29 + -0x90) = uVar41;
      *(undefined8 *)(unaff_x29 + -0xa0) = 0;
      auVar46 = func_0x003f55f4(auStack_7ffffffe + 0x8000031e);
      lVar11 = *unaff_x23;
      *unaff_x23 = lVar11 + -1;
      LORelease();
      pdVar18 = extraout_x10_04;
      pdVar20 = extraout_x11_04;
      pdVar23 = extraout_x12_04;
      pdVar24 = extraout_x13_04;
      pdVar26 = extraout_x14_04;
      pdVar27 = extraout_x15_04;
      lVar10 = extraout_x16_04;
      uVar28 = extraout_x17_04;
      goto joined_r0x00438e3c;
    }
    lVar31 = 0;
code_r0x00439124:
    *(ulong *)(unaff_x29 + -0x90) =
         CONCAT17((char)(uVar33 >> 0x28),
                  (uint7)(((ulong)pdVar38 & 0xff) << 8) | (uint7)(uVar33 << 0x10) | (uint7)uVar25);
    *(dword **)(unaff_x29 + -0x98) = pdVar39;
    *(undefined8 *)(unaff_x29 + -0x80) = uVar40;
    *(dword **)(unaff_x29 + -0x88) = in_stack_000002d0;
    *(long **)(unaff_x29 + -0xa0) = unaff_x23;
    *(undefined8 *)(unaff_x29 + -0x78) = 8;
    *(long *)(unaff_x29 + -0x70) = lVar31;
    plVar8 = unaff_x23;
  }
  if (plVar8 == (long *)0x0) {
    func_0x003f5fec(unaff_x29 + -0xa0);
    *in_stack_000000a8 = 0x8000000000000000;
    if (*in_stack_00000140 != -0x8000000000000000) {
      func_0x003f73ec(in_stack_00000140);
    }
  }
  else {
    auVar55._8_8_ = param_5;
    auVar55._0_8_ = param_6;
    auVar54._8_8_ = uVar29;
    auVar54._0_8_ = unaff_x22;
    auVar53._8_8_ = lVar10;
    auVar53._0_8_ = uVar28;
    auVar52._8_8_ = pdVar26;
    auVar52._0_8_ = pdVar27;
    auVar51._8_8_ = pdVar23;
    auVar51._0_8_ = pdVar24;
    auVar50._8_8_ = pdVar18;
    auVar50._0_8_ = pdVar20;
    auVar49._8_8_ = param_3;
    auVar49._0_8_ = param_4;
    uVar42 = *(undefined8 *)(unaff_x29 + -0x90);
    uVar40 = *(undefined8 *)(unaff_x29 + -0x98);
    uVar43 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar29 = *(undefined8 *)(unaff_x29 + -0x88);
    uVar44 = *(undefined8 *)(unaff_x29 + -0x70);
    uVar41 = *(undefined8 *)(unaff_x29 + -0x78);
    if (*in_stack_00000140 == -0x8000000000000000) {
      in_stack_00000410 = 10;
      plVar30 = in_stack_00000140;
      in_stack_00000428 = in_stack_00000280;
      in_stack_00000430 = in_stack_00000288;
      in_stack_00000438 = in_stack_00000290;
      in_stack_00000440 = in_stack_00000298;
      in_stack_00000448 = in_stack_000002a0;
      in_stack_00000450 = in_stack_000002a8;
      in_stack_00000458 = in_stack_000002b0;
      in_stack_00000460 = in_stack_000002b8;
      in_stack_00000420 = in_stack_0000037f;
      in_stack_00000421 = in_stack_00000380;
      bVar61 = (byte)unaff_x23;
code_r0x00438e94:
      in_stack_000000a8[0x3b] = uVar40;
      in_stack_000000a8[0x3a] = plVar8;
      in_stack_000000a8[0x3d] = uVar29;
      in_stack_000000a8[0x3c] = uVar42;
      in_stack_000000a8[0x3f] = uVar41;
      in_stack_000000a8[0x3e] = uVar43;
      in_stack_000000a8[0x40] = uVar44;
      *(undefined8 *)((long)in_stack_000000a8 + 0xa9) = in_stack_000002e8;
      *(ulong *)((long)in_stack_000000a8 + 0xa1) = in_stack_000002e0;
      *(undefined8 *)((long)in_stack_000000a8 + 0xb9) = in_stack_000002f8;
      *(undefined8 *)((long)in_stack_000000a8 + 0xb1) = in_stack_000002f0;
      *(ulong *)((long)in_stack_000000a8 + 0xc9) = CONCAT17(in_stack_0000030f,in_stack_00000308);
      *(undefined8 *)((long)in_stack_000000a8 + 0xc1) = in_stack_00000300;
      in_stack_000000a8[0x1a] = CONCAT71(in_stack_00000310,in_stack_0000030f);
      *(uint **)((long)in_stack_000000a8 + 0x89) = in_stack_000002c8;
      *(dword **)((long)in_stack_000000a8 + 0x81) = pdVar22;
      *(dword **)((long)in_stack_000000a8 + 0x99) = in_stack_000002d8;
      *(dword **)((long)in_stack_000000a8 + 0x91) = pdVar57;
      in_stack_000000a8[0x1d] = CONCAT71(in_stack_00000421,in_stack_00000420);
      *(ulong *)((long)in_stack_000000a8 + 0xe1) = CONCAT17(in_stack_00000420,in_stack_00000378);
      *(ulong *)((long)in_stack_000000a8 + 0xd9) = in_stack_00000370;
      in_stack_000000a8[0x23] = in_stack_00000450;
      in_stack_000000a8[0x22] = in_stack_00000448;
      in_stack_000000a8[0x25] = in_stack_00000460;
      in_stack_000000a8[0x24] = in_stack_00000458;
      in_stack_000000a8[0x1f] = in_stack_00000430;
      in_stack_000000a8[0x1e] = in_stack_00000428;
      in_stack_000000a8[0x21] = in_stack_00000440;
      in_stack_000000a8[0x20] = in_stack_00000438;
      uVar29 = in_stack_000000b0[1];
      uVar40 = *in_stack_000000b0;
      uVar42 = in_stack_000000b0[3];
      uVar41 = in_stack_000000b0[2];
      uVar43 = in_stack_000000b0[4];
      uVar45 = in_stack_000000b0[7];
      uVar44 = in_stack_000000b0[6];
      in_stack_000000a8[5] = in_stack_000000b0[5];
      in_stack_000000a8[4] = uVar43;
      in_stack_000000a8[7] = uVar45;
      in_stack_000000a8[6] = uVar44;
      in_stack_000000a8[1] = uVar29;
      *in_stack_000000a8 = uVar40;
      in_stack_000000a8[3] = uVar42;
      in_stack_000000a8[2] = uVar41;
      uVar29 = in_stack_000000b0[9];
      uVar40 = in_stack_000000b0[8];
      uVar42 = in_stack_000000b0[0xb];
      uVar41 = in_stack_000000b0[10];
      uVar43 = in_stack_000000b0[0xc];
      uVar45 = in_stack_000000b0[0xf];
      uVar44 = in_stack_000000b0[0xe];
      in_stack_000000a8[0xd] = in_stack_000000b0[0xd];
      in_stack_000000a8[0xc] = uVar43;
      in_stack_000000a8[0xf] = uVar45;
      in_stack_000000a8[0xe] = uVar44;
      in_stack_000000a8[9] = uVar29;
      in_stack_000000a8[8] = uVar40;
      in_stack_000000a8[0xb] = uVar42;
      in_stack_000000a8[10] = uVar41;
      *(byte *)(in_stack_000000a8 + 0x10) = in_stack_00000410;
      *(byte *)(in_stack_000000a8 + 0x1b) = bVar61;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x26) = auVar49;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x28) = auVar50;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2a) = auVar51;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2c) = auVar52;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x2e) = auVar53;
      in_stack_000000a8[0x30] = auVar46._8_8_;
      in_stack_000000a8[0x31] = auVar46._0_8_;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x32) = auVar54;
      *(undefined1 (*) [16])(in_stack_000000a8 + 0x34) = auVar55;
      in_stack_000000a8[0x36] = plVar30;
      in_stack_000000a8[0x37] = param_7;
      in_stack_000000a8[0x38] = 1;
      in_stack_000000a8[0x39] = 0;
      return;
    }
    auVar47 = func_0x0043e3ac(in_stack_00000140,&UNK_008856c9,0xf);
    if (auVar47._0_8_ == 0) {
      auVar47 = ZEXT816(1);
    }
    auVar48 = func_0x0043e3ac(in_stack_00000140,&UNK_0088574e,0xf);
    auVar49 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d27,0x11);
    if (auVar49._0_8_ == 0) {
      auVar49 = ZEXT816(1);
    }
    auVar50 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d38,0xf);
    if (auVar50._0_8_ == 0) {
      auVar50._8_8_ = 0;
      auVar50._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    auVar51 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d47,0xf);
    if (auVar51._0_8_ == 0) {
      auVar51._8_8_ = 0;
      auVar51._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    auVar52 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d8a,0xe);
    if (auVar52._0_8_ == 0) {
      auVar52._8_8_ = 0;
      auVar52._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    auVar53 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d98,0x16);
    if (auVar53._0_8_ == 0) {
      auVar53 = ZEXT816(1);
    }
    auVar54 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d56,0xe);
    if (auVar54._0_8_ == 0) {
      auVar54 = ZEXT816(1);
    }
    auVar46._8_8_ = auVar54._0_8_;
    auVar46._0_8_ = auVar54._8_8_;
    auVar54 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d64,0x13);
    if (auVar54._0_8_ == 0) {
      auVar54._8_8_ = 0;
      auVar54._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    auVar55 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d77,0x13);
    if (auVar55._0_8_ == 0) {
      auVar55 = ZEXT816(1);
    }
    auVar56 = func_0x0043e3ac(in_stack_00000140,&UNK_008849d0,0x10);
    if (auVar56._0_8_ == 0) {
      auVar56._8_8_ = 0;
      auVar56._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    param_7 = auVar56._8_8_;
    plVar30 = auVar56._0_8_;
    func_0x004098a0(auStack_7ffffffe + 0x8000040e,auVar47._0_8_,auVar47._8_8_);
    if (in_stack_00000410 != 10) {
      if (auVar48._0_8_ == 0) {
        auVar48 = ZEXT816(1);
      }
      *(uint **)(unaff_x29 + -0x98) = in_stack_00000430;
      *(dword **)(unaff_x29 + -0xa0) = in_stack_00000428;
      *(dword **)(unaff_x29 + -0x88) = in_stack_00000440;
      *(dword **)(unaff_x29 + -0x90) = in_stack_00000438;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000450;
      *(ulong *)(unaff_x29 + -0x80) = in_stack_00000448;
      *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000460;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000458;
      func_0x004098a0(auStack_7ffffffe + 0x8000040e,auVar48._0_8_,auVar48._8_8_);
      if (in_stack_00000410 != 10) {
        in_stack_00000378 = CONCAT61(in_stack_0000041a,in_stack_00000419);
        in_stack_00000370 = CONCAT17(in_stack_00000418,in_stack_00000411);
        uVar45 = *(undefined8 *)(unaff_x29 + -0x70);
        in_stack_0000030f = (undefined1)*(undefined8 *)(unaff_x29 + -0x68);
        pdVar22 = (dword *)CONCAT17(in_stack_00000418,in_stack_00000411);
        in_stack_000002c8 =
             (uint *)CONCAT17(in_stack_00000420,CONCAT61(in_stack_0000041a,in_stack_00000419));
        in_stack_000002d8 =
             (dword *)CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x98),
                               (int7)((ulong)*(undefined8 *)(unaff_x29 + -0xa0) >> 8));
        pdVar57 = (dword *)CONCAT17((char)*(undefined8 *)(unaff_x29 + -0xa0),in_stack_00000421);
        in_stack_000002e8 =
             CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x88),
                      (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x90) >> 8));
        in_stack_000002e0 =
             CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x90),
                      (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x98) >> 8));
        in_stack_000002f8 =
             CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x78),
                      (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 8));
        in_stack_000002f0 =
             CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x80),
                      (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x88) >> 8));
        in_stack_00000300 =
             CONCAT17((char)uVar45,(int7)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 8));
        in_stack_00000310 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 8);
        in_stack_00000308 =
             (undefined7)
             CONCAT44(CONCAT13(in_stack_0000030f,(int3)((ulong)uVar45 >> 0x28)),
                      (int)((ulong)uVar45 >> 8));
        func_0x003f73ec(in_stack_00000140);
        bVar61 = in_stack_00000410;
        goto code_r0x00438e94;
      }
    }
    *in_stack_000000a8 = 0x8000000000000000;
    func_0x003f73ec(in_stack_00000140);
    lVar10 = *plVar8;
    *plVar8 = lVar10 + -1;
    LORelease();
    if (lVar10 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00403ad4(auStack_7ffffffe + 0x80000246);
    }
    func_0x003f55f4(auStack_7ffffffe + 0x8000024e);
    func_0x003f56c4(uVar41,uVar44);
  }
  if ((in_stack_00000138 == -0x8000000000000000) && (*in_stack_00000148 != -0x8000000000000000)) {
    func_0x003f73ec(in_stack_00000148);
  }
  func_0x003f73ec(in_stack_000000b0);
  return;
}

