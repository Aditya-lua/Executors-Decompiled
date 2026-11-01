
/* WARNING: Type propagation algorithm not settling */

ulong FUN_00151f34(ulong *param_1,undefined8 param_2,ulong *param_3,ulong *param_4,ulong *param_5,
                  ulong *param_6)

{
  long lVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort *puVar4;
  uint *puVar5;
  undefined4 *puVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  int iVar11;
  bool bVar12;
  long *plVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  ulong *puVar17;
  uint uVar18;
  undefined *puVar19;
  undefined *puVar20;
  uint uVar21;
  ulong *puVar22;
  ulong uVar23;
  ulong *puVar24;
  ulong *puVar25;
  undefined1 *puVar26;
  undefined8 *puVar27;
  uint uVar28;
  int iVar29;
  uint uVar30;
  undefined8 *puVar31;
  ulong uVar32;
  undefined8 *puVar33;
  ulong uVar34;
  ulong *puVar35;
  long lVar36;
  ulong *puVar37;
  undefined1 *puVar38;
  ulong uVar39;
  ulong uVar40;
  ulong *puVar41;
  ulong *puVar42;
  ulong uVar43;
  ulong *puVar44;
  uint uVar45;
  undefined *puVar46;
  long lVar47;
  ulong uVar48;
  undefined *puVar49;
  long lVar50;
  undefined1 *puVar51;
  ulong uVar52;
  undefined1 *puVar53;
  ulong *unaff_x19;
  ulong *puVar54;
  ulong *unaff_x20;
  ulong *puVar55;
  undefined *unaff_x21;
  ulong *unaff_x22;
  long lVar56;
  long lVar57;
  ulong unaff_x23;
  undefined8 *puVar58;
  undefined8 *puVar59;
  int iVar60;
  long *unaff_x25;
  long *plVar61;
  undefined8 *puVar62;
  ulong *unaff_x26;
  int iVar63;
  ulong *unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  ulong *unaff_x30;
  undefined8 uVar64;
  undefined8 uVar65;
  undefined8 uVar66;
  ulong uVar67;
  undefined8 uVar68;
  ulong uVar69;
  undefined8 uVar70;
  ulong uVar71;
  undefined8 uVar72;
  ulong uVar73;
  undefined8 uVar74;
  undefined1 auVar75 [16];
  long in_stack_00000070;
  long in_stack_00000078;
  ulong *puStack0000000000000080;
  ulong *in_stack_000000a8;
  ulong uStack00000000000000b0;
  uint uStack00000000000000b8;
  ulong *puStack00000000000000c0;
  ulong uStack00000000000000d8;
  ulong uStack00000000000000e8;
  ulong uStack00000000000000f8;
  undefined8 uStack0000000000000108;
  ulong *puStack0000000000000110;
  ulong *puStack0000000000000118;
  ulong uStack0000000000000120;
  ulong uStack0000000000000128;
  ulong *in_stack_00000130;
  ulong *in_stack_00000138;
  long lStack0000000000000140;
  undefined1 uStack0000000000000148;
  undefined8 uStack0000000000000150;
  ulong uStack_f8;
  uint uStack_f0;
  ulong *puStack_e8;
  ulong uStack_d0;
  ulong uStack_c0;
  ulong uStack_b0;
  ulong auStack_a0 [3];
  undefined8 *puStack_88;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  ulong *puStack_60;
  ulong *puStack_58;
  ulong *puStack_50;
  long *plStack_48;
  ulong uStack_40;
  ulong uStack_38;
  ulong *puStack_30;
  undefined *puStack_28;
  ulong *puStack_20;
  ulong *puStack_18;
  
  *(uint *)(param_1 + 0x19f) = 1;
  puVar24 = (ulong *)(ulong)(uint)*param_1;
  uStack0000000000000108 = puVar24;
  puStack0000000000000110 = (ulong *)(unaff_x25[0xd08] & 0xffffffff);
  puStack0000000000000118 = (ulong *)((ulong)unaff_x25[0xd08] >> 0x20);
  uVar21 = (uint)param_6;
  uVar28 = uVar21;
  if (7 < (int)uVar21) {
    uVar28 = 8;
  }
  puVar17 = param_4;
  puVar22 = param_6;
  puVar54 = unaff_x19;
  puVar19 = unaff_x21;
  plVar61 = unaff_x25;
  if (param_5 == (ulong *)0x0) {
LAB_00153e5c:
    param_1 = unaff_x22;
    uVar48 = 0xffffffffffffffec;
  }
  else {
    puVar25 = param_4 + 1;
    puVar35 = param_5 + -1;
    if (&MACH_HEADER.cpusubtype <= param_5) {
      puStack00000000000000c0 = (ulong *)((long)param_4 + (long)puVar35);
      uStack00000000000000b0 = *puStack00000000000000c0;
      if (uStack00000000000000b0 >> 0x38 != 0) {
        if (param_5 < (ulong *)0xffffffffffffff89) {
          iVar29 = (int)LZCOUNT((uint)(byte)(uStack00000000000000b0 >> 0x38)) + -0x17;
          goto LAB_0015209c;
        }
      }
      goto LAB_00153e5c;
    }
    uStack00000000000000b0 = (ulong)(byte)*param_4;
    switch(param_5) {
    case (ulong *)0x7:
      uStack00000000000000b0 = uStack00000000000000b0 | (ulong)*(byte *)((long)param_4 + 6) << 0x30;
    case (ulong *)0x6:
      uStack00000000000000b0 =
           uStack00000000000000b0 + ((ulong)*(byte *)((long)param_4 + 5) << 0x28);
    case (ulong *)0x5:
      uStack00000000000000b0 =
           uStack00000000000000b0 + ((ulong)*(byte *)((long)param_4 + 4) << 0x20);
    case (ulong *)0x4:
      uStack00000000000000b0 =
           uStack00000000000000b0 + (ulong)*(byte *)((long)param_4 + 3) * 0x1000000;
    case (ulong *)0x3:
      uStack00000000000000b0 =
           uStack00000000000000b0 + (ulong)*(byte *)((long)param_4 + 2) * 0x10000;
    case (ulong *)0x2:
      uStack00000000000000b0 = uStack00000000000000b0 + (ulong)*(byte *)((long)param_4 + 1) * 0x100;
    }
    uVar18 = (uint)*(byte *)((long)param_5 + (long)param_4 + -1);
    if (uVar18 == 0) goto LAB_00153e5c;
    puVar35 = (ulong *)0x0;
    iVar29 = (int)LZCOUNT(uVar18) + (int)param_5 * -8 + 0x29;
    puStack00000000000000c0 = param_4;
LAB_0015209c:
    uVar18 = *(uint *)(*unaff_x25 + 4);
    uStack00000000000000b8 = uVar18 + iVar29;
    uVar34 = uStack00000000000000b0 >> ((ulong)-uStack00000000000000b8 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar18 * 4);
    if (uStack00000000000000b8 < 0x41) {
      if ((long)puVar35 < 8) {
        if (puVar35 == (ulong *)0x0) goto LAB_00152134;
        uVar18 = (uint)puVar35;
        if (param_4 <=
            (ulong *)(((long)param_4 + (long)puVar35) - (ulong)(uStack00000000000000b8 >> 3))) {
          uVar18 = uStack00000000000000b8 >> 3;
        }
        uStack00000000000000b8 = uStack00000000000000b8 + uVar18 * -8;
      }
      else {
        uVar18 = uStack00000000000000b8 >> 3;
        uStack00000000000000b8 = uStack00000000000000b8 & 7;
      }
      puStack00000000000000c0 = (ulong *)(((long)param_4 + (long)puVar35) - (ulong)uVar18);
      uStack00000000000000b0 = *puStack00000000000000c0;
      puVar17 = puStack00000000000000c0;
    }
    else {
      puVar17 = (ulong *)&UNK_00814388;
      puStack00000000000000c0 = (ulong *)&UNK_00814388;
    }
LAB_00152134:
    lVar56 = *unaff_x25 + 8;
    uVar18 = *(uint *)(unaff_x25[2] + 4);
    uStack00000000000000b8 = uVar18 + uStack00000000000000b8;
    uVar40 = uStack00000000000000b0 >> ((ulong)-uStack00000000000000b8 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar18 * 4);
    iVar29 = (int)param_4;
    if (uStack00000000000000b8 < 0x41) {
      if (puVar17 < puVar25) {
        puVar35 = param_4;
        if (puVar17 == param_4) goto LAB_001521c8;
        uVar18 = (int)puVar17 - iVar29;
        if (param_4 <= (ulong *)((long)puVar17 - (ulong)(uStack00000000000000b8 >> 3))) {
          uVar18 = uStack00000000000000b8 >> 3;
        }
        puVar35 = (ulong *)((long)puVar17 - (ulong)uVar18);
        uStack00000000000000b0 = *puVar35;
        uStack00000000000000b8 = uStack00000000000000b8 + uVar18 * -8;
      }
      else {
        puVar35 = (ulong *)((long)puVar17 - (ulong)(uStack00000000000000b8 >> 3));
        uStack00000000000000b0 = *puVar35;
        uStack00000000000000b8 = uStack00000000000000b8 & 7;
      }
      puStack00000000000000c0 = puVar35;
    }
    else {
      puVar35 = (ulong *)&UNK_00814388;
      puStack00000000000000c0 = (ulong *)&UNK_00814388;
    }
LAB_001521c8:
    puVar54 = (ulong *)((long)unaff_x19 - (long)unaff_x30);
    lVar50 = unaff_x25[2] + 8;
    uVar18 = *(uint *)(unaff_x25[1] + 4);
    uStack00000000000000b8 = uVar18 + uStack00000000000000b8;
    uVar23 = (ulong)uStack00000000000000b8;
    uVar48 = uStack00000000000000b0 >> ((ulong)-uStack00000000000000b8 & 0x3f) &
             (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar18 * 4);
    if (uStack00000000000000b8 < 0x41) {
      if (puVar35 < puVar25) {
        puVar55 = param_4;
        if (puVar35 == param_4) goto LAB_00152270;
        uVar18 = (int)puVar35 - iVar29;
        if (param_4 <= (ulong *)((long)puVar35 - (ulong)(uStack00000000000000b8 >> 3))) {
          uVar18 = uStack00000000000000b8 >> 3;
        }
        uStack00000000000000b8 = uStack00000000000000b8 + uVar18 * -8;
      }
      else {
        uVar18 = uStack00000000000000b8 >> 3;
        uStack00000000000000b8 = uStack00000000000000b8 & 7;
      }
      puStack00000000000000c0 = (ulong *)((long)puVar35 - (ulong)uVar18);
      uVar23 = (ulong)uStack00000000000000b8;
      uStack00000000000000b0 = *puStack00000000000000c0;
      puVar55 = puStack00000000000000c0;
    }
    else {
      puVar55 = (ulong *)&UNK_00814388;
      puStack00000000000000c0 = (ulong *)&UNK_00814388;
    }
LAB_00152270:
    uVar18 = (uint)uVar23;
    puVar35 = (ulong *)((long)unaff_x25 + 0x76a4);
    lVar1 = unaff_x25[1] + 8;
    puVar19 = (undefined *)(ulong)(uVar21 - 1);
    puVar17 = param_3;
    unaff_x26 = unaff_x19;
    puStack0000000000000080 = param_3;
    uStack00000000000000d8 = uVar34;
    uStack00000000000000e8 = uVar40;
    uStack00000000000000f8 = uVar48;
    if ((int)uVar21 < 1) {
      param_5 = (ulong *)0x0;
      if (0 < (int)uVar21) goto code_r0x001525e4;
    }
    else {
      uVar45 = uVar28;
      if ((int)uVar28 < 2) {
        uVar45 = 1;
      }
      param_5 = (ulong *)(ulong)uVar45;
      puVar62 = &uStack0000000000000150;
      puVar20 = puVar19;
      puVar22 = param_5;
      uVar32 = uStack00000000000000b0;
      puVar42 = puVar55;
      do {
        puVar2 = (ushort *)(lVar56 + uVar34 * 8);
        puVar3 = (ushort *)(lVar1 + uVar48 * 8);
        unaff_x20 = (ulong *)(ulong)*(uint *)(puVar3 + 2);
        unaff_x21 = (undefined *)(ulong)*(uint *)(puVar2 + 2);
        puVar4 = (ushort *)(lVar50 + uVar40 * 8);
        uVar18 = *(uint *)(puVar4 + 2);
        bVar7 = (byte)puVar2[1];
        unaff_x27 = (ulong *)(ulong)bVar7;
        bVar8 = (byte)puVar3[1];
        bVar9 = (byte)puVar4[1];
        unaff_x23 = (ulong)*puVar4;
        bVar10 = *(byte *)((long)puVar3 + 3);
        unaff_x28 = (ulong *)(ulong)bVar10;
        uVar30 = (uint)bVar9;
        if (bVar9 < 2) {
          bVar12 = *(uint *)(puVar2 + 2) == 0;
          if (bVar9 == 0) {
            uStack0000000000000108 = *(ulong **)((long)&uStack0000000000000108 + (ulong)bVar12 * 8);
            puStack0000000000000110 =
                 *(ulong **)((long)&uStack0000000000000108 + (ulong)!bVar12 * 8);
            puVar24 = uStack0000000000000108;
          }
          else {
            if (bVar12) {
              uVar18 = uVar18 + 1;
            }
            uVar43 = uVar23 & 0x3f;
            uStack00000000000000b8 = (int)uVar23 + 1;
            uVar23 = (ulong)uStack00000000000000b8;
            lVar36 = (ulong)uVar18 - ((long)(uVar32 << uVar43) >> 0x3f);
            if (lVar36 == 3) {
              puVar17 = (ulong *)(ulong)((undefined *)((long)puVar24 + -1) == (undefined *)0x0);
              uStack0000000000000108 = (ulong *)((undefined *)((long)puVar24 + -1) + -(long)puVar17)
              ;
code_r0x00152598:
              puStack0000000000000118 = puStack0000000000000110;
            }
            else {
              puVar17 = (ulong *)(ulong)(*(long *)((long)&uStack0000000000000108 + lVar36 * 8) == 0)
              ;
              uStack0000000000000108 =
                   (ulong *)(*(long *)((long)&uStack0000000000000108 + lVar36 * 8) - (long)puVar17);
              if (lVar36 != 1) goto code_r0x00152598;
            }
            puStack0000000000000110 = puVar24;
            puVar24 = uStack0000000000000108;
          }
        }
        else {
          uVar43 = uVar23 & 0x3f;
          puVar17 = (ulong *)(ulong)-uVar30;
          uStack00000000000000b8 = (int)uVar23 + uVar30;
          uVar23 = (ulong)uStack00000000000000b8;
          puStack0000000000000118 = puStack0000000000000110;
          uStack0000000000000108 =
               (ulong *)(((uVar32 << uVar43) >> ((ulong)puVar17 & 0x3f)) + (ulong)uVar18);
          puStack0000000000000110 = puVar24;
          puVar24 = uStack0000000000000108;
        }
        if (bVar8 != 0) {
          uVar43 = uVar23 & 0x3f;
          puVar17 = (ulong *)(ulong)-(uint)bVar8;
          uStack00000000000000b8 = (int)uVar23 + (uint)bVar8;
          uVar23 = (ulong)uStack00000000000000b8;
          unaff_x20 = (ulong *)(((uVar32 << uVar43) >> ((ulong)puVar17 & 0x3f)) + (long)unaff_x20);
        }
        if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar30 & 0xff)) {
          uVar18 = (uint)uVar23;
          if (uVar18 < 0x41) {
            if (puVar42 < puVar25) {
              if (puVar42 == param_4) {
                puVar42 = param_4;
                goto code_r0x001523f8;
              }
              uVar30 = (int)puVar42 - iVar29;
              if (param_4 <= (ulong *)((long)puVar42 - (ulong)(uVar18 >> 3))) {
                uVar30 = uVar18 >> 3;
              }
              uStack00000000000000b8 = uVar18 + uVar30 * -8;
            }
            else {
              uVar30 = uVar18 >> 3;
              uStack00000000000000b8 = uVar18 & 7;
            }
            puStack00000000000000c0 = (ulong *)((long)puVar42 - (ulong)uVar30);
            uVar23 = (ulong)uStack00000000000000b8;
            uVar32 = *puStack00000000000000c0;
            puVar55 = puStack00000000000000c0;
            puVar42 = puStack00000000000000c0;
            uStack00000000000000b0 = uVar32;
          }
          else {
            puVar42 = (ulong *)&UNK_00814388;
            puStack00000000000000c0 = (ulong *)&UNK_00814388;
            puVar55 = (ulong *)&UNK_00814388;
          }
        }
code_r0x001523f8:
        uVar18 = (uint)bVar7;
        if (uVar18 != 0) {
          uVar43 = uVar23 & 0x3f;
          uStack00000000000000b8 = (int)uVar23 + uVar18;
          uVar23 = (ulong)uStack00000000000000b8;
          unaff_x21 = unaff_x21 + ((uVar32 << uVar43) >> ((ulong)-uVar18 & 0x3f));
        }
        if (puVar20 != (undefined *)0x0) {
          iVar60 = (int)uVar23 + (uint)*(byte *)((long)puVar2 + 3);
          uVar34 = (uVar32 >> ((ulong)(uint)-iVar60 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
                   (ulong)*puVar2;
          iVar60 = iVar60 + (uint)bVar10;
          uVar48 = (uVar32 >> ((ulong)(uint)-iVar60 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)bVar10 * 4)) + (ulong)*puVar3;
          uStack00000000000000b8 = iVar60 + (uint)*(byte *)((long)puVar4 + 3);
          uVar23 = (ulong)uStack00000000000000b8;
          uVar40 = (uVar32 >> ((ulong)-uStack00000000000000b8 & 0x3f) &
                   (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                   unaff_x23;
          uStack00000000000000d8 = uVar34;
          uStack00000000000000e8 = uVar40;
          uStack00000000000000f8 = uVar48;
          if (uStack00000000000000b8 < 0x41) {
            if (puVar42 < puVar25) {
              if (puVar42 == param_4) {
                puVar42 = param_4;
                goto code_r0x001522e8;
              }
              uVar18 = (int)puVar42 - iVar29;
              if (param_4 <= (ulong *)((long)puVar42 - (ulong)(uStack00000000000000b8 >> 3))) {
                uVar18 = uStack00000000000000b8 >> 3;
              }
              uStack00000000000000b8 = uStack00000000000000b8 + uVar18 * -8;
            }
            else {
              uVar18 = uStack00000000000000b8 >> 3;
              uStack00000000000000b8 = uStack00000000000000b8 & 7;
            }
            puStack00000000000000c0 = (ulong *)((long)puVar42 - (ulong)uVar18);
            uVar23 = (ulong)uStack00000000000000b8;
            uVar32 = *puStack00000000000000c0;
            puVar55 = puStack00000000000000c0;
            puVar42 = puStack00000000000000c0;
            uStack00000000000000b0 = uVar32;
          }
          else {
            puVar42 = (ulong *)&UNK_00814388;
            puStack00000000000000c0 = (ulong *)&UNK_00814388;
            puVar55 = (ulong *)&UNK_00814388;
          }
        }
code_r0x001522e8:
        uVar18 = (uint)uVar23;
        puVar54 = (ulong *)(unaff_x21 + (long)puVar54);
        puVar37 = in_stack_000000a8;
        if (puVar24 <= puVar54) {
          puVar37 = unaff_x30;
        }
        lVar36 = (long)((long)puVar37 + (long)puVar54) - (long)puVar24;
        Hint_Prefetch(lVar36,0,0,0);
        Hint_Prefetch(lVar36 + 0x40,0,0,0);
        puVar54 = (ulong *)((long)puVar54 + (long)unaff_x20);
        puVar62[-2] = unaff_x21;
        puVar62[-1] = unaff_x20;
        *puVar62 = puVar24;
        puVar20 = puVar20 + -1;
        puVar22 = (ulong *)((long)puVar22 + -1);
        puVar62 = puVar62 + 3;
      } while (puVar22 != (ulong *)0x0);
      puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
      uStack0000000000000108 = puVar24;
      if ((int)uVar45 < (int)uVar21) {
code_r0x001525e4:
        puVar24 = (ulong *)((long)unaff_x25 + 0x176a4);
        puStack0000000000000080 = param_3;
LAB_00152630:
        do {
          unaff_x23 = 0x18;
          puVar2 = (ushort *)(lVar56 + uStack00000000000000d8 * 8);
          puVar3 = (ushort *)(lVar1 + uStack00000000000000f8 * 8);
          puVar4 = (ushort *)(lVar50 + uStack00000000000000e8 * 8);
          uVar34 = (ulong)*(uint *)(puVar3 + 2);
          puVar55 = (ulong *)(ulong)*(uint *)(puVar2 + 2);
          uVar18 = *(uint *)(puVar4 + 2);
          bVar7 = (byte)puVar2[1];
          bVar8 = (byte)puVar3[1];
          bVar9 = (byte)puVar4[1];
          uVar45 = (uint)bVar9;
          puVar62 = &uStack0000000000000108;
          if (bVar9 < 2) {
            bVar12 = *(uint *)(puVar2 + 2) == 0;
            if (bVar9 != 0) {
              if (bVar12) {
                uVar18 = uVar18 + 1;
              }
              uVar40 = (ulong)uStack00000000000000b8;
              uStack00000000000000b8 = uStack00000000000000b8 + 1;
              lVar36 = (ulong)uVar18 - ((long)(uStack00000000000000b0 << (uVar40 & 0x3f)) >> 0x3f);
              if (lVar36 == 3) {
                param_3 = (ulong *)((undefined *)((long)uStack0000000000000108 + -1) +
                                   -(ulong)((undefined *)((long)uStack0000000000000108 + -1) ==
                                           (undefined *)0x0));
              }
              else {
                param_3 = (ulong *)(*(long *)((long)&uStack0000000000000108 + lVar36 * 8) -
                                   (ulong)(*(long *)((long)&uStack0000000000000108 + lVar36 * 8) ==
                                          0));
                if (lVar36 == 1) goto code_r0x001526cc;
              }
              goto code_r0x001526a0;
            }
            param_3 = *(ulong **)((long)&uStack0000000000000108 + (ulong)bVar12 * 8);
            puVar62 = (undefined8 *)((long)&uStack0000000000000108 + (ulong)!bVar12 * 8);
          }
          else {
            uVar40 = (ulong)uStack00000000000000b8;
            uStack00000000000000b8 = uStack00000000000000b8 + uVar45;
            param_3 = (ulong *)(((uStack00000000000000b0 << (uVar40 & 0x3f)) >>
                                ((ulong)-uVar45 & 0x3f)) + (ulong)uVar18);
code_r0x001526a0:
            puStack0000000000000118 = puStack0000000000000110;
          }
code_r0x001526cc:
          uStack0000000000000108 = param_3;
          puStack0000000000000110 = (ulong *)*puVar62;
          if (bVar8 != 0) {
            uVar40 = (ulong)uStack00000000000000b8;
            uStack00000000000000b8 = uStack00000000000000b8 + bVar8;
            uVar34 = ((uStack00000000000000b0 << (uVar40 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                     uVar34;
          }
          if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar45 & 0xff)) {
            if (uStack00000000000000b8 < 0x41) {
              if (puStack00000000000000c0 < puVar25) {
                if (puStack00000000000000c0 == param_4) goto code_r0x0015270c;
                uVar18 = (int)puStack00000000000000c0 - iVar29;
                if (param_4 <=
                    (ulong *)((long)puStack00000000000000c0 - (ulong)(uStack00000000000000b8 >> 3)))
                {
                  uVar18 = uStack00000000000000b8 >> 3;
                }
                uStack00000000000000b8 = uStack00000000000000b8 + uVar18 * -8;
              }
              else {
                uVar18 = uStack00000000000000b8 >> 3;
                uStack00000000000000b8 = uStack00000000000000b8 & 7;
              }
              puStack00000000000000c0 = (ulong *)((long)puStack00000000000000c0 - (ulong)uVar18);
              uStack00000000000000b0 = *puStack00000000000000c0;
            }
            else {
              puStack00000000000000c0 = (ulong *)&UNK_00814388;
            }
          }
code_r0x0015270c:
          if (bVar7 != 0) {
            uVar40 = (ulong)uStack00000000000000b8;
            uStack00000000000000b8 = uStack00000000000000b8 + bVar7;
            puVar55 = (ulong *)(((uStack00000000000000b0 << (uVar40 & 0x3f)) >>
                                ((ulong)-(uint)bVar7 & 0x3f)) + (long)puVar55);
          }
          uVar18 = (uint)param_5;
          puVar17 = puVar35;
          if (uVar18 == uVar21 - 1) {
code_r0x00152804:
            if (*(uint *)((long)param_1 + 0xe64) == 2) goto code_r0x00152814;
code_r0x00152ddc:
            lVar36 = (ulong)(uVar18 & 7) * 0x18;
            uVar40 = *(ulong *)((long)&lStack0000000000000140 + lVar36);
            unaff_x28 = *(ulong **)(&uStack0000000000000148 + lVar36);
            unaff_x27 = *(ulong **)((long)&uStack0000000000000150 + lVar36);
            unaff_x20 = (ulong *)((long)unaff_x26 + uVar40);
            puVar42 = (ulong *)((long)unaff_x20 - (long)unaff_x27);
            Hint_Prefetch(puVar42,0,0,0);
            if (((ulong *)(uStack0000000000000120 + uVar40) <= puStack0000000000000080) &&
               (uVar48 = (long)unaff_x28 + uVar40,
               (undefined *)((long)unaff_x26 + uVar48) <= (undefined *)(in_stack_00000078 + -0x20)))
            {
              uVar23 = *(ulong *)uStack0000000000000120;
              unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
              *unaff_x26 = uVar23;
              if (0x10 < uVar40) {
                uVar23 = *(ulong *)(uStack0000000000000120 + 0x10);
                unaff_x26[3] = *(ulong *)(uStack0000000000000120 + 0x18);
                unaff_x26[2] = uVar23;
                if (0x10 < uVar40 - 0x10) {
                  puVar37 = unaff_x26 + 4;
                  puVar44 = (ulong *)(uStack0000000000000120 + 0x30);
                  do {
                    uVar23 = puVar44[-2];
                    puVar37[1] = puVar44[-1];
                    *puVar37 = uVar23;
                    uVar23 = *puVar44;
                    puVar37[3] = puVar44[1];
                    puVar37[2] = uVar23;
                    puVar37 = puVar37 + 4;
                    puVar44 = puVar44 + 4;
                  } while (puVar37 < unaff_x20);
                }
              }
              uStack0000000000000120 = uStack0000000000000120 + uVar40;
              if (unaff_x27 <= (ulong *)((long)unaff_x20 - (long)unaff_x30)) {
LAB_00152ec8:
                if (unaff_x27 < &MACH_HEADER.ncmds) {
                  if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                    *unaff_x20 = *puVar42;
                  }
                  else {
                    iVar60 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                    *(char *)unaff_x20 = (char)*puVar42;
                    *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)puVar42 + 1);
                    *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)puVar42 + 2);
                    *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)puVar42 + 3);
                    puVar5 = (uint *)((long)puVar42 +
                                     (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                    puVar42 = (ulong *)((long)puVar5 - (long)iVar60);
                    *(uint *)((long)unaff_x20 + 4) = *puVar5;
                  }
                  if (&MACH_HEADER.cpusubtype < unaff_x28) {
                    puVar22 = puVar42 + 1;
                    puVar37 = unaff_x20 + 1;
                    if ((long)puVar37 - (long)puVar22 < 0x10) {
                      do {
                        puVar42 = puVar37 + 1;
                        *puVar37 = *puVar22;
                        puVar22 = puVar22 + 1;
                        puVar37 = puVar42;
                      } while (puVar42 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                    }
                    else {
                      uVar40 = *puVar22;
                      unaff_x20[2] = puVar42[2];
                      *puVar37 = uVar40;
                      if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                        puVar22 = unaff_x20 + 3;
                        puVar42 = puVar42 + 5;
                        do {
                          uVar40 = puVar42[-2];
                          puVar22[1] = puVar42[-1];
                          *puVar22 = uVar40;
                          uVar40 = *puVar42;
                          puVar22[3] = puVar42[1];
                          puVar22[2] = uVar40;
                          puVar22 = puVar22 + 4;
                          puVar42 = puVar42 + 4;
                        } while (puVar22 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                      }
                    }
                    puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                  }
                }
                else {
                  uVar40 = *puVar42;
                  unaff_x20[1] = puVar42[1];
                  *unaff_x20 = uVar40;
                  if (&MACH_HEADER.ncmds < unaff_x28) {
                    puVar37 = unaff_x20 + 2;
                    do {
                      uVar40 = puVar42[2];
                      puVar37[1] = puVar42[3];
                      *puVar37 = uVar40;
                      uVar40 = puVar42[4];
                      puVar37[3] = puVar42[5];
                      puVar37[2] = uVar40;
                      puVar37 = puVar37 + 4;
                      puVar42 = puVar42 + 4;
                    } while (puVar37 < (ulong *)((long)unaff_x20 + (long)unaff_x28));
                  }
                }
                goto LAB_00152f44;
              }
              unaff_x22 = param_1;
              if (unaff_x27 <= (ulong *)((long)unaff_x20 - in_stack_00000070)) {
                lVar36 = (long)puVar42 - (long)unaff_x30;
                puVar26 = (undefined1 *)((long)in_stack_000000a8 + lVar36);
                if (in_stack_000000a8 < puVar26 + (long)unaff_x28) {
                  _memmove(unaff_x20,puVar26,-lVar36);
                  unaff_x20 = (ulong *)((long)unaff_x20 - lVar36);
                  unaff_x28 = (ulong *)(lVar36 + (long)unaff_x28);
                  puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                  puVar42 = unaff_x30;
                  goto LAB_00152ec8;
                }
                _memmove(unaff_x20,puVar26,unaff_x28);
                goto code_r0x00152f40;
              }
              goto LAB_00153e5c;
            }
            uStack0000000000000128 = uVar40;
            in_stack_00000130 = unaff_x28;
            in_stack_00000138 = unaff_x27;
            uVar48 = func_0x00155c78(unaff_x26,in_stack_00000078,&uStack0000000000000128,
                                     &uStack0000000000000120,puStack0000000000000080,unaff_x30,
                                     in_stack_00000070,in_stack_000000a8);
            puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
            unaff_x20 = param_5;
            unaff_x27 = param_3;
          }
          else {
            iVar60 = uStack00000000000000b8 + *(byte *)((long)puVar2 + 3);
            uStack00000000000000d8 =
                 (uStack00000000000000b0 >> ((ulong)(uint)-iVar60 & 0x3f) &
                 (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
                 (ulong)*puVar2;
            iVar60 = iVar60 + (uint)*(byte *)((long)puVar3 + 3);
            uStack00000000000000f8 =
                 (uStack00000000000000b0 >> ((ulong)(uint)-iVar60 & 0x3f) &
                 (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                 (ulong)*puVar3;
            uStack00000000000000b8 = iVar60 + (uint)*(byte *)((long)puVar4 + 3);
            uStack00000000000000e8 =
                 (uStack00000000000000b0 >> ((ulong)-uStack00000000000000b8 & 0x3f) &
                 (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                 (ulong)*puVar4;
            if (uStack00000000000000b8 < 0x41) {
              if (puStack00000000000000c0 < puVar25) {
                if (puStack00000000000000c0 == param_4) goto code_r0x00152804;
                uVar45 = (int)puStack00000000000000c0 - iVar29;
                if (param_4 <=
                    (ulong *)((long)puStack00000000000000c0 - (ulong)(uStack00000000000000b8 >> 3)))
                {
                  uVar45 = uStack00000000000000b8 >> 3;
                }
                uStack00000000000000b8 = uStack00000000000000b8 + uVar45 * -8;
              }
              else {
                uVar45 = uStack00000000000000b8 >> 3;
                uStack00000000000000b8 = uStack00000000000000b8 & 7;
              }
              puStack00000000000000c0 = (ulong *)((long)puStack00000000000000c0 - (ulong)uVar45);
              uStack00000000000000b0 = *puStack00000000000000c0;
              goto code_r0x00152804;
            }
            puStack00000000000000c0 = (ulong *)&UNK_00814388;
            if (*(uint *)((long)param_1 + 0xe64) != 2) goto code_r0x00152ddc;
code_r0x00152814:
            lVar36 = (ulong)(uVar18 & 7) * 0x18;
            unaff_x28 = (ulong *)((long)&lStack0000000000000140 + lVar36);
            uVar40 = *unaff_x28;
            puVar37 = (ulong *)unaff_x25[0xed3];
            puVar42 = (ulong *)(uStack0000000000000120 + uVar40);
            if (puVar37 < puVar42) {
              uVar48 = (long)puVar37 - uStack0000000000000120;
              puVar42 = unaff_x26;
              if (uVar48 != 0) {
                unaff_x20 = puVar55;
                if ((ulong)(in_stack_00000078 - (long)unaff_x26) < uVar48) goto code_r0x00152014;
                uVar40 = (long)unaff_x26 - uStack0000000000000120;
                puVar42 = (ulong *)((long)unaff_x26 + uVar48);
                if (((long)uVar40 < -7) && (7 < uVar48)) {
                  if (uVar40 < 0xfffffffffffffff0) {
                    puVar37 = puVar42 + -4;
                    if (puVar37 < unaff_x26) goto code_r0x00152a24;
                    uVar40 = *(ulong *)uStack0000000000000120;
                    unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
                    *unaff_x26 = uVar40;
                    if (0x10 < (ulong)((long)puVar37 - (long)unaff_x26)) {
                      puVar44 = unaff_x26 + 2;
                      puVar41 = (ulong *)uStack0000000000000120;
                      do {
                        uVar40 = puVar41[2];
                        puVar44[1] = puVar41[3];
                        *puVar44 = uVar40;
                        uVar40 = puVar41[4];
                        puVar44[3] = puVar41[5];
                        puVar44[2] = uVar40;
                        puVar44 = puVar44 + 4;
                        puVar41 = puVar41 + 4;
                      } while (puVar44 < puVar37);
                    }
                    uStack0000000000000120 =
                         uStack0000000000000120 + ((long)puVar37 - (long)unaff_x26);
                  }
                  else {
code_r0x00152a24:
                    puVar37 = unaff_x26;
                    if ((long)uVar48 < 1) goto LAB_00152b84;
                  }
                  puVar20 = (undefined *)((long)unaff_x26 + (uVar48 - (long)puVar37));
                  if ((puVar20 < (undefined *)0x8) ||
                     ((long)puVar37 - uStack0000000000000120 < 0x40)) {
                    puVar44 = puVar37;
                  }
                  else {
                    if (puVar20 < (undefined *)0x40) {
                      puVar46 = (undefined *)0x0;
                    }
                    else {
                      puVar46 = (undefined *)((ulong)puVar20 & 0xffffffffffffffc0);
                      puVar44 = puVar37 + 4;
                      puVar41 = (ulong *)(uStack0000000000000120 + 0x20);
                      puVar49 = puVar46;
                      do {
                        uVar40 = puVar41[-4];
                        uVar32 = puVar41[-1];
                        uVar23 = puVar41[-2];
                        uVar39 = puVar41[1];
                        uVar43 = *puVar41;
                        uVar67 = puVar41[3];
                        uVar52 = puVar41[2];
                        puVar44[-3] = puVar41[-3];
                        puVar44[-4] = uVar40;
                        puVar44[-1] = uVar32;
                        puVar44[-2] = uVar23;
                        puVar44[1] = uVar39;
                        *puVar44 = uVar43;
                        puVar44[3] = uVar67;
                        puVar44[2] = uVar52;
                        puVar49 = puVar49 + -0x40;
                        puVar44 = puVar44 + 8;
                        puVar41 = puVar41 + 8;
                      } while (puVar49 != (undefined *)0x0);
                      if (puVar20 == puVar46) goto LAB_00152b84;
                      if (((ulong)puVar20 & 0x38) == 0) {
                        uStack0000000000000120 = uStack0000000000000120 + (long)puVar46;
                        puVar44 = (ulong *)((long)puVar37 + (long)puVar46);
                        goto LAB_00152b54;
                      }
                    }
                    puVar49 = (undefined *)((ulong)puVar20 & 0xfffffffffffffff8);
                    lVar47 = (long)puVar46 - (long)puVar49;
                    puVar62 = (undefined8 *)(uStack0000000000000120 + (long)puVar46);
                    puVar14 = (undefined8 *)((long)puVar37 + (long)puVar46);
                    do {
                      *puVar14 = *puVar62;
                      lVar47 = lVar47 + 8;
                      puVar62 = puVar62 + 1;
                      puVar14 = puVar14 + 1;
                    } while (lVar47 != 0);
                    puVar44 = (ulong *)((long)puVar37 + (long)puVar49);
                    uStack0000000000000120 = (ulong)(uStack0000000000000120 + (long)puVar49);
                    if (puVar20 == puVar49) goto LAB_00152b84;
                  }
LAB_00152b54:
                  do {
                    puVar41 = (ulong *)((long)puVar44 + 1);
                    *(char *)puVar44 = (char)*(ulong *)uStack0000000000000120;
                    puVar44 = puVar41;
                    uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
                  } while (puVar41 != (ulong *)((long)puVar37 + (long)puVar20));
                }
                else if (0 < (long)uVar48) {
                  puVar20 = (undefined *)((long)unaff_x26 + (long)puVar37) + -uStack0000000000000120
                  ;
                  if (puVar20 <= (undefined *)((long)unaff_x26 + 1)) {
                    puVar20 = (undefined *)((long)unaff_x26 + 1);
                  }
                  uVar23 = (long)puVar20 - (long)unaff_x26;
                  if ((7 < uVar23) && (0x3f < uVar40)) {
                    if (uVar23 < 0x40) {
                      uVar32 = 0;
                    }
                    else {
                      uVar32 = uVar23 & 0xffffffffffffffc0;
                      puVar37 = unaff_x26 + 4;
                      puVar44 = (ulong *)(uStack0000000000000120 + 0x20);
                      uVar40 = uVar32;
                      do {
                        uVar43 = puVar44[-4];
                        uVar52 = puVar44[-1];
                        uVar39 = puVar44[-2];
                        uVar69 = puVar44[1];
                        uVar67 = *puVar44;
                        uVar73 = puVar44[3];
                        uVar71 = puVar44[2];
                        puVar37[-3] = puVar44[-3];
                        puVar37[-4] = uVar43;
                        puVar37[-1] = uVar52;
                        puVar37[-2] = uVar39;
                        puVar37[1] = uVar69;
                        *puVar37 = uVar67;
                        puVar37[3] = uVar73;
                        puVar37[2] = uVar71;
                        uVar40 = uVar40 - 0x40;
                        puVar37 = puVar37 + 8;
                        puVar44 = puVar44 + 8;
                      } while (uVar40 != 0);
                      if (uVar23 == uVar32) goto LAB_00152b84;
                      if ((uVar23 & 0x38) == 0) {
                        uStack0000000000000120 = uStack0000000000000120 + uVar32;
                        unaff_x26 = (ulong *)((long)unaff_x26 + uVar32);
                        goto code_r0x00152b74;
                      }
                    }
                    uVar40 = uVar23 & 0xfffffffffffffff8;
                    lVar47 = uVar32 - uVar40;
                    puVar62 = (undefined8 *)(uStack0000000000000120 + uVar32);
                    puVar14 = (undefined8 *)((long)unaff_x26 + uVar32);
                    do {
                      *puVar14 = *puVar62;
                      lVar47 = lVar47 + 8;
                      puVar62 = puVar62 + 1;
                      puVar14 = puVar14 + 1;
                    } while (lVar47 != 0);
                    unaff_x26 = (ulong *)((long)unaff_x26 + uVar40);
                    uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar40);
                    if (uVar23 == uVar40) goto LAB_00152b84;
                  }
code_r0x00152b74:
                  do {
                    puVar37 = (ulong *)((long)unaff_x26 + 1);
                    *(char *)unaff_x26 = (char)*(ulong *)uStack0000000000000120;
                    unaff_x26 = puVar37;
                    uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
                  } while (puVar37 < puVar42);
                }
LAB_00152b84:
                uVar40 = *unaff_x28 - uVar48;
                *unaff_x28 = uVar40;
              }
              uStack0000000000000120 = (ulong)puVar35;
              *(uint *)((long)param_1 + 0xe64) = 0;
              unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar36);
              unaff_x22 = *(ulong **)((long)&uStack0000000000000150 + lVar36);
              unaff_x27 = (ulong *)((long)puVar42 + uVar40);
              puVar37 = (ulong *)((long)unaff_x27 - (long)unaff_x22);
              Hint_Prefetch(puVar37,0,0,0);
              uVar48 = (long)unaff_x20 + uVar40;
              unaff_x26 = puVar42;
              if (puVar24 < (ulong *)((long)puVar35 + uVar40) ||
                  (undefined *)(in_stack_00000078 + -0x20) < (undefined *)((long)puVar42 + uVar48))
              {
                puVar17 = &uStack0000000000000120;
                uStack0000000000000128 = uVar40;
                in_stack_00000130 = unaff_x20;
                in_stack_00000138 = unaff_x22;
                uVar48 = func_0x00155c78(puVar42,in_stack_00000078,&uStack0000000000000128,puVar17,
                                         puVar24,unaff_x30,in_stack_00000070,in_stack_000000a8);
                puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                unaff_x20 = param_5;
              }
              else {
                uVar23 = *puVar35;
                puVar42[1] = *(ulong *)((long)unaff_x25 + 0x76ac);
                *puVar42 = uVar23;
                if (0x10 < uVar40) {
                  uVar23 = *(ulong *)((long)unaff_x25 + 0x76b4);
                  puVar42[3] = *(ulong *)((long)unaff_x25 + 0x76bc);
                  puVar42[2] = uVar23;
                  if (0x10 < uVar40 - 0x10) {
                    puVar44 = puVar42 + 4;
                    puVar41 = (ulong *)((long)unaff_x25 + 0x76d4);
                    do {
                      uVar23 = puVar41[-2];
                      puVar44[1] = puVar41[-1];
                      *puVar44 = uVar23;
                      uVar23 = *puVar41;
                      puVar44[3] = puVar41[1];
                      puVar44[2] = uVar23;
                      puVar44 = puVar44 + 4;
                      puVar41 = puVar41 + 4;
                    } while (puVar44 < unaff_x27);
                  }
                }
                uStack0000000000000120 = (long)puVar35 + uVar40;
                if ((ulong *)((long)unaff_x27 - (long)unaff_x30) < unaff_x22) {
                  if ((ulong *)((long)unaff_x27 - in_stack_00000070) < unaff_x22) goto LAB_00153e5c;
                  lVar47 = (long)puVar37 - (long)unaff_x30;
                  puVar26 = (undefined1 *)((long)in_stack_000000a8 + lVar47);
                  if (puVar26 + (long)unaff_x20 <= in_stack_000000a8) {
                    _memmove(unaff_x27,puVar26,unaff_x20);
                    puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                    goto LAB_00152cdc;
                  }
                  _memmove(unaff_x27,puVar26,-lVar47);
                  unaff_x27 = (ulong *)((long)unaff_x27 - lVar47);
                  unaff_x20 = (ulong *)(lVar47 + (long)unaff_x20);
                  puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                  puVar37 = unaff_x30;
                }
                if (unaff_x22 < &MACH_HEADER.ncmds) {
                  if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x22) {
                    *unaff_x27 = *puVar37;
                  }
                  else {
                    iVar60 = *(int *)(&UNK_008143b0 + (long)unaff_x22 * 4);
                    *(char *)unaff_x27 = (char)*puVar37;
                    *(undefined1 *)((long)unaff_x27 + 1) = *(undefined1 *)((long)puVar37 + 1);
                    *(undefined1 *)((long)unaff_x27 + 2) = *(undefined1 *)((long)puVar37 + 2);
                    *(undefined1 *)((long)unaff_x27 + 3) = *(undefined1 *)((long)puVar37 + 3);
                    puVar5 = (uint *)((long)puVar37 +
                                     (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x22 * 4));
                    puVar37 = (ulong *)((long)puVar5 - (long)iVar60);
                    *(uint *)((long)unaff_x27 + 4) = *puVar5;
                  }
                  if (&MACH_HEADER.cpusubtype < unaff_x20) {
                    puVar22 = puVar37 + 1;
                    puVar44 = unaff_x27 + 1;
                    if ((long)puVar44 - (long)puVar22 < 0x10) {
                      do {
                        puVar37 = puVar44 + 1;
                        *puVar44 = *puVar22;
                        puVar22 = puVar22 + 1;
                        puVar44 = puVar37;
                      } while (puVar37 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                    }
                    else {
                      uVar40 = *puVar22;
                      unaff_x27[2] = puVar37[2];
                      *puVar44 = uVar40;
                      if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                        puVar22 = unaff_x27 + 3;
                        puVar37 = puVar37 + 5;
                        do {
                          uVar40 = puVar37[-2];
                          puVar22[1] = puVar37[-1];
                          *puVar22 = uVar40;
                          uVar40 = *puVar37;
                          puVar22[3] = puVar37[1];
                          puVar22[2] = uVar40;
                          puVar22 = puVar22 + 4;
                          puVar37 = puVar37 + 4;
                        } while (puVar22 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                      }
                    }
                  }
                  puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                }
                else {
                  uVar40 = *puVar37;
                  unaff_x27[1] = puVar37[1];
                  *unaff_x27 = uVar40;
                  if (&MACH_HEADER.ncmds < unaff_x20) {
                    puVar44 = unaff_x27 + 2;
                    do {
                      uVar40 = puVar37[2];
                      puVar44[1] = puVar37[3];
                      *puVar44 = uVar40;
                      uVar40 = puVar37[4];
                      puVar44[3] = puVar37[5];
                      puVar44[2] = uVar40;
                      puVar44 = puVar44 + 4;
                      puVar37 = puVar37 + 4;
                    } while (puVar44 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                  }
                  else {
                  }
                }
              }
LAB_00152cdc:
              unaff_x23 = 0x18;
              if (0xffffffffffffff88 < uVar48) goto LAB_00153e60;
              puVar54 = (ulong *)((long)puVar55 + (long)puVar54);
              puVar17 = in_stack_000000a8;
              if (param_3 <= puVar54) {
                puVar17 = unaff_x30;
              }
              lVar47 = (long)((long)puVar17 + (long)puVar54) - (long)param_3;
              Hint_Prefetch(lVar47,0,0,0);
              Hint_Prefetch(lVar47 + 0x40,0,0,0);
              *unaff_x28 = (ulong)puVar55;
              *(ulong *)(&uStack0000000000000148 + lVar36) = uVar34;
              *(ulong **)((long)&uStack0000000000000150 + lVar36) = param_3;
              unaff_x26 = (ulong *)((long)puVar42 + uVar48);
              puVar54 = (ulong *)((long)puVar54 + uVar34);
              param_5 = (ulong *)(ulong)(uVar18 + 1);
              puStack0000000000000080 = puVar24;
              if (uVar18 + 1 == (uint)puVar22) break;
              goto LAB_00152630;
            }
            unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar36);
            unaff_x27 = *(ulong **)((long)&uStack0000000000000150 + lVar36);
            if ((puStack0000000000000080 < puVar42) ||
               (uVar48 = (long)unaff_x20 + uVar40,
               puVar42 + -4 < (ulong *)((long)unaff_x26 + uVar48))) {
              uStack0000000000000128 = uVar40;
              in_stack_00000130 = unaff_x20;
              in_stack_00000138 = unaff_x27;
              uVar48 = func_0x00156308(unaff_x26,in_stack_00000078,puVar42 + -4,
                                       &uStack0000000000000128,&uStack0000000000000120,
                                       puStack0000000000000080,unaff_x30,in_stack_00000070);
              unaff_x20 = param_5;
            }
            else {
              unaff_x28 = (ulong *)((long)unaff_x26 + uVar40);
              uVar23 = *(ulong *)uStack0000000000000120;
              unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
              *unaff_x26 = uVar23;
              if (0x10 < uVar40) {
                uVar23 = *(ulong *)(uStack0000000000000120 + 0x10);
                unaff_x26[3] = *(ulong *)(uStack0000000000000120 + 0x18);
                unaff_x26[2] = uVar23;
                if (0x10 < uVar40 - 0x10) {
                  puVar37 = unaff_x26 + 4;
                  puVar44 = (ulong *)(uStack0000000000000120 + 0x30);
                  do {
                    uVar40 = puVar44[-2];
                    puVar37[1] = puVar44[-1];
                    *puVar37 = uVar40;
                    uVar40 = *puVar44;
                    puVar37[3] = puVar44[1];
                    puVar37[2] = uVar40;
                    puVar37 = puVar37 + 4;
                    puVar44 = puVar44 + 4;
                  } while (puVar37 < unaff_x28);
                }
              }
              uStack0000000000000120 = (ulong)puVar42;
              puVar42 = (ulong *)((long)unaff_x28 - (long)unaff_x27);
              if ((ulong *)((long)unaff_x28 - (long)unaff_x30) < unaff_x27) {
                unaff_x22 = param_1;
                if ((ulong *)((long)unaff_x28 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
                lVar36 = ((long)unaff_x28 - (long)unaff_x27) - (long)unaff_x30;
                puVar26 = (undefined1 *)((long)in_stack_000000a8 + lVar36);
                if (puVar26 + (long)unaff_x20 <= in_stack_000000a8) {
                  _memmove(unaff_x28,puVar26,unaff_x20);
                  goto code_r0x00152f40;
                }
                _memmove(unaff_x28,puVar26,-lVar36);
                unaff_x28 = (ulong *)((long)unaff_x28 - lVar36);
                unaff_x20 = (ulong *)(lVar36 + (long)unaff_x20);
                puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                puVar42 = unaff_x30;
              }
              if ((ulong *)((long)&MACH_HEADER.filetype + 3) < unaff_x27) {
                uVar40 = *puVar42;
                unaff_x28[1] = puVar42[1];
                *unaff_x28 = uVar40;
                if (&MACH_HEADER.ncmds < unaff_x20) {
                  puVar37 = unaff_x28 + 2;
                  do {
                    uVar40 = puVar42[2];
                    puVar37[1] = puVar42[3];
                    *puVar37 = uVar40;
                    uVar40 = puVar42[4];
                    puVar37[3] = puVar42[5];
                    puVar37[2] = uVar40;
                    puVar37 = puVar37 + 4;
                    puVar42 = puVar42 + 4;
                  } while (puVar37 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
                }
                goto LAB_00152f44;
              }
              if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                *unaff_x28 = *puVar42;
              }
              else {
                iVar60 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                *(char *)unaff_x28 = (char)*puVar42;
                *(undefined1 *)((long)unaff_x28 + 1) = *(undefined1 *)((long)puVar42 + 1);
                *(undefined1 *)((long)unaff_x28 + 2) = *(undefined1 *)((long)puVar42 + 2);
                *(undefined1 *)((long)unaff_x28 + 3) = *(undefined1 *)((long)puVar42 + 3);
                puVar5 = (uint *)((long)puVar42 +
                                 (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                puVar42 = (ulong *)((long)puVar5 - (long)iVar60);
                *(uint *)((long)unaff_x28 + 4) = *puVar5;
              }
              if (&MACH_HEADER.cpusubtype < unaff_x20) {
                puVar22 = puVar42 + 1;
                puVar37 = unaff_x28 + 1;
                if ((long)puVar37 - (long)puVar22 < 0x10) {
                  do {
                    puVar42 = puVar37 + 1;
                    *puVar37 = *puVar22;
                    puVar22 = puVar22 + 1;
                    puVar37 = puVar42;
                  } while (puVar42 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
                }
                else {
                  uVar40 = *puVar22;
                  unaff_x28[2] = puVar42[2];
                  *puVar37 = uVar40;
                  if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                    puVar22 = unaff_x28 + 3;
                    puVar42 = puVar42 + 5;
                    do {
                      uVar40 = puVar42[-2];
                      puVar22[1] = puVar42[-1];
                      *puVar22 = uVar40;
                      uVar40 = *puVar42;
                      puVar22[3] = puVar42[1];
                      puVar22[2] = uVar40;
                      puVar22 = puVar22 + 4;
                      puVar42 = puVar42 + 4;
                    } while (puVar22 < (ulong *)((long)unaff_x28 + (long)unaff_x20));
                  }
                }
              }
            }
code_r0x00152f40:
            puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
          }
LAB_00152f44:
          unaff_x23 = 0x18;
          if (0xffffffffffffff88 < uVar48) goto LAB_00153e60;
          puVar54 = (ulong *)((long)puVar55 + (long)puVar54);
          puVar17 = in_stack_000000a8;
          if (param_3 <= puVar54) {
            puVar17 = unaff_x30;
          }
          lVar36 = (long)((long)puVar17 + (long)puVar54) - (long)param_3;
          Hint_Prefetch(lVar36,0,0,0);
          Hint_Prefetch(lVar36 + 0x40,0,0,0);
          lVar36 = (ulong)(uVar18 & 7) * 0x18;
          *(ulong **)((long)&lStack0000000000000140 + lVar36) = puVar55;
          *(ulong *)(&uStack0000000000000148 + lVar36) = uVar34;
          *(ulong **)((long)&uStack0000000000000150 + lVar36) = param_3;
          unaff_x26 = (ulong *)((long)unaff_x26 + uVar48);
          puVar54 = (ulong *)((long)puVar54 + uVar34);
          param_5 = (ulong *)(ulong)(uVar18 + 1);
        } while (uVar18 + 1 != (uint)puVar22);
        unaff_x23 = 0x18;
        puVar17 = param_3;
        param_5 = puVar22;
        unaff_x21 = puVar19;
        uVar18 = uStack00000000000000b8;
        puVar55 = puStack00000000000000c0;
      }
    }
    puVar19 = unaff_x21;
    param_3 = puVar17;
    uVar48 = 0xffffffffffffffec;
    puVar17 = param_4;
    if (puVar55 == param_4) {
      uVar48 = 0xffffffffffffffec;
      if (uVar18 == 0x40) {
        uVar28 = (int)param_5 - uVar28;
        puVar54 = (ulong *)(ulong)uVar28;
        if ((int)uVar28 < (int)puVar22) {
          puVar19 = (undefined *)(in_stack_00000078 + -0x20);
          puVar24 = (ulong *)((long)unaff_x25 + 0x176a4);
          do {
            while( true ) {
              unaff_x23 = 0x18;
              uVar28 = (uint)puVar54;
              lVar56 = (ulong)(uVar28 & 7) * 0x18;
              puVar25 = (ulong *)(&lStack0000000000000140 + (ulong)(uVar28 & 7) * 3);
              puVar17 = param_4;
              plVar61 = &lStack0000000000000140;
              if (*(uint *)((long)param_1 + 0xe64) == 2) break;
              uVar34 = *puVar25;
              puVar25 = *(ulong **)(&uStack0000000000000148 + lVar56);
              unaff_x27 = *(ulong **)((long)&uStack0000000000000150 + lVar56);
              puVar42 = (ulong *)((long)unaff_x26 + uVar34);
              puVar55 = (ulong *)((long)puVar42 - (long)unaff_x27);
              Hint_Prefetch(puVar55,0,0,0);
              uVar48 = (long)puVar25 + uVar34;
              if (puStack0000000000000080 < (ulong *)(uStack0000000000000120 + uVar34) ||
                  puVar19 < (undefined *)((long)unaff_x26 + uVar48)) {
                param_3 = &uStack0000000000000128;
                param_4 = &uStack0000000000000120;
                param_5 = puStack0000000000000080;
                uStack0000000000000128 = uVar34;
                in_stack_00000130 = puVar25;
                in_stack_00000138 = unaff_x27;
                uVar48 = func_0x00155c78(unaff_x26,in_stack_00000078);
code_r0x00153acc:
                puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                unaff_x20 = puVar42;
                unaff_x28 = puVar25;
              }
              else {
                uVar40 = *(ulong *)uStack0000000000000120;
                unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
                *unaff_x26 = uVar40;
                if (0x10 < uVar34) {
                  uVar40 = *(ulong *)(uStack0000000000000120 + 0x10);
                  unaff_x26[3] = *(ulong *)(uStack0000000000000120 + 0x18);
                  unaff_x26[2] = uVar40;
                  if (0x10 < uVar34 - 0x10) {
                    puVar37 = unaff_x26 + 4;
                    puVar44 = (ulong *)(uStack0000000000000120 + 0x30);
                    do {
                      uVar40 = puVar44[-2];
                      puVar37[1] = puVar44[-1];
                      *puVar37 = uVar40;
                      uVar40 = *puVar44;
                      puVar37[3] = puVar44[1];
                      puVar37[2] = uVar40;
                      puVar37 = puVar37 + 4;
                      puVar44 = puVar44 + 4;
                    } while (puVar37 < puVar42);
                  }
                }
                uStack0000000000000120 = uStack0000000000000120 + uVar34;
                unaff_x28 = puVar25;
                if ((ulong *)((long)puVar42 - (long)unaff_x30) < unaff_x27) {
                  unaff_x20 = puVar42;
                  unaff_x22 = param_1;
                  if ((ulong *)((long)puVar42 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
                  lVar56 = (long)puVar55 - (long)unaff_x30;
                  if (in_stack_000000a8 <
                      (undefined1 *)((long)in_stack_000000a8 + lVar56) + (long)puVar25) {
                    param_3 = (ulong *)-lVar56;
                    _memmove(puVar42);
                    puVar42 = (ulong *)((long)puVar42 - lVar56);
                    unaff_x28 = (ulong *)(lVar56 + (long)puVar25);
                    puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                    puVar55 = unaff_x30;
                    goto code_r0x00153628;
                  }
                  puVar17 = puVar42;
LAB_001537a0:
                  _memmove(puVar42);
                  param_3 = puVar25;
                  puVar25 = puVar17;
                }
                else {
code_r0x00153628:
                  if (&MACH_HEADER.ncmds <= unaff_x27) {
                    uVar34 = *puVar55;
                    puVar42[1] = puVar55[1];
                    *puVar42 = uVar34;
                    unaff_x20 = puVar42;
                    if (&MACH_HEADER.ncmds < unaff_x28) {
                      puVar17 = puVar42 + 2;
                      do {
                        uVar34 = puVar55[2];
                        puVar17[1] = puVar55[3];
                        *puVar17 = uVar34;
                        uVar34 = puVar55[4];
                        puVar17[3] = puVar55[5];
                        puVar17[2] = uVar34;
                        puVar17 = puVar17 + 4;
                        puVar55 = puVar55 + 4;
                      } while (puVar17 < (ulong *)((long)puVar42 + (long)unaff_x28));
                    }
                    goto joined_r0x001537bc;
                  }
                  if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                    *puVar42 = *puVar55;
                  }
                  else {
                    iVar29 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                    *(char *)puVar42 = (char)*puVar55;
                    *(undefined1 *)((long)puVar42 + 1) = *(undefined1 *)((long)puVar55 + 1);
                    *(undefined1 *)((long)puVar42 + 2) = *(undefined1 *)((long)puVar55 + 2);
                    *(undefined1 *)((long)puVar42 + 3) = *(undefined1 *)((long)puVar55 + 3);
                    puVar5 = (uint *)((long)puVar55 +
                                     (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                    puVar55 = (ulong *)((long)puVar5 - (long)iVar29);
                    *(uint *)((long)puVar42 + 4) = *puVar5;
                  }
                  puVar25 = puVar42;
                  if (&MACH_HEADER.cpusubtype < unaff_x28) {
                    puVar17 = puVar55 + 1;
                    puVar22 = puVar42 + 1;
                    if ((long)puVar22 - (long)puVar17 < 0x10) {
                      do {
                        puVar55 = puVar22 + 1;
                        *puVar22 = *puVar17;
                        puVar17 = puVar17 + 1;
                        puVar22 = puVar55;
                      } while (puVar55 < (ulong *)((long)puVar42 + (long)unaff_x28));
                    }
                    else {
                      uVar34 = *puVar17;
                      puVar42[2] = puVar55[2];
                      *puVar22 = uVar34;
                      if (&MACH_HEADER.ncmds < unaff_x28 + -1) {
                        puVar17 = puVar42 + 3;
                        puVar22 = puVar55 + 5;
                        do {
                          uVar34 = puVar22[-2];
                          puVar17[1] = puVar22[-1];
                          *puVar17 = uVar34;
                          uVar34 = *puVar22;
                          puVar17[3] = puVar22[1];
                          puVar17[2] = uVar34;
                          puVar17 = puVar17 + 4;
                          puVar22 = puVar22 + 4;
                        } while (puVar17 < (ulong *)((long)puVar42 + (long)unaff_x28));
                      }
                    }
                  }
                }
LAB_001537b0:
                puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                unaff_x20 = puVar25;
              }
joined_r0x001537bc:
              unaff_x23 = 0x18;
              puVar17 = param_4;
              if (0xffffffffffffff88 < uVar48) goto LAB_00153e60;
              unaff_x23 = 0x18;
              unaff_x26 = (ulong *)((long)unaff_x26 + uVar48);
              puVar54 = (ulong *)(ulong)(uVar28 + 1);
              if (uVar28 + 1 == (uint)puVar22) goto LAB_00153e9c;
            }
            uVar34 = *puVar25;
            puVar42 = (ulong *)unaff_x25[0xed3];
            puVar55 = (ulong *)(uStack0000000000000120 + uVar34);
            if (puVar55 <= puVar42) {
              param_3 = puVar55 + -4;
              puVar25 = *(ulong **)(&uStack0000000000000148 + lVar56);
              unaff_x27 = *(ulong **)((long)&uStack0000000000000150 + lVar56);
              uVar48 = (long)puVar25 + uVar34;
              if (puStack0000000000000080 < puVar55 || param_3 < (ulong *)((long)unaff_x26 + uVar48)
                 ) {
                param_4 = &uStack0000000000000128;
                param_5 = &uStack0000000000000120;
                uStack0000000000000128 = uVar34;
                in_stack_00000130 = puVar25;
                in_stack_00000138 = unaff_x27;
                uVar48 = func_0x00156308(unaff_x26,in_stack_00000078);
                puVar42 = puVar25;
                puVar25 = unaff_x28;
                goto code_r0x00153acc;
              }
              puVar42 = (ulong *)((long)unaff_x26 + uVar34);
              uVar40 = *(ulong *)uStack0000000000000120;
              unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
              *unaff_x26 = uVar40;
              if (0x10 < uVar34) {
                uVar40 = *(ulong *)(uStack0000000000000120 + 0x10);
                unaff_x26[3] = *(ulong *)(uStack0000000000000120 + 0x18);
                unaff_x26[2] = uVar40;
                if (0x10 < uVar34 - 0x10) {
                  puVar37 = unaff_x26 + 4;
                  puVar44 = (ulong *)(uStack0000000000000120 + 0x30);
                  do {
                    uVar34 = puVar44[-2];
                    puVar37[1] = puVar44[-1];
                    *puVar37 = uVar34;
                    uVar34 = *puVar44;
                    puVar37[3] = puVar44[1];
                    puVar37[2] = uVar34;
                    puVar37 = puVar37 + 4;
                    puVar44 = puVar44 + 4;
                  } while (puVar37 < puVar42);
                }
              }
              uStack0000000000000120 = (ulong)puVar55;
              puVar55 = (ulong *)((long)puVar42 - (long)unaff_x27);
              if ((ulong *)((long)puVar42 - (long)unaff_x30) < unaff_x27) {
                unaff_x20 = puVar25;
                unaff_x22 = param_1;
                unaff_x28 = puVar42;
                if ((ulong *)((long)puVar42 - in_stack_00000070) < unaff_x27) goto LAB_00153e5c;
                lVar56 = ((long)puVar42 - (long)unaff_x27) - (long)unaff_x30;
                if ((undefined1 *)((long)in_stack_000000a8 + lVar56) + (long)puVar25 <=
                    in_stack_000000a8) {
                  puVar17 = puVar25;
                  goto LAB_001537a0;
                }
                param_3 = (ulong *)-lVar56;
                _memmove(puVar42);
                puVar42 = (ulong *)((long)puVar42 - lVar56);
                puVar25 = (ulong *)(lVar56 + (long)puVar25);
                puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                puVar55 = unaff_x30;
              }
              unaff_x28 = puVar42;
              if (unaff_x27 < &MACH_HEADER.ncmds) {
                if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x27) {
                  *puVar42 = *puVar55;
                }
                else {
                  iVar29 = *(int *)(&UNK_008143b0 + (long)unaff_x27 * 4);
                  *(char *)puVar42 = (char)*puVar55;
                  *(undefined1 *)((long)puVar42 + 1) = *(undefined1 *)((long)puVar55 + 1);
                  *(undefined1 *)((long)puVar42 + 2) = *(undefined1 *)((long)puVar55 + 2);
                  *(undefined1 *)((long)puVar42 + 3) = *(undefined1 *)((long)puVar55 + 3);
                  puVar5 = (uint *)((long)puVar55 +
                                   (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x27 * 4));
                  puVar55 = (ulong *)((long)puVar5 - (long)iVar29);
                  *(uint *)((long)puVar42 + 4) = *puVar5;
                }
                if (&MACH_HEADER.cpusubtype < puVar25) {
                  puVar17 = puVar55 + 1;
                  puVar22 = puVar42 + 1;
                  if ((long)puVar22 - (long)puVar17 < 0x10) {
                    do {
                      puVar55 = puVar22 + 1;
                      *puVar22 = *puVar17;
                      puVar17 = puVar17 + 1;
                      puVar22 = puVar55;
                    } while (puVar55 < (ulong *)((long)puVar42 + (long)puVar25));
                  }
                  else {
                    uVar34 = *puVar17;
                    puVar42[2] = puVar55[2];
                    *puVar22 = uVar34;
                    if (&MACH_HEADER.ncmds < puVar25 + -1) {
                      puVar17 = puVar42 + 3;
                      puVar22 = puVar55 + 5;
                      do {
                        uVar34 = puVar22[-2];
                        puVar17[1] = puVar22[-1];
                        *puVar17 = uVar34;
                        uVar34 = *puVar22;
                        puVar17[3] = puVar22[1];
                        puVar17[2] = uVar34;
                        puVar17 = puVar17 + 4;
                        puVar22 = puVar22 + 4;
                      } while (puVar17 < (ulong *)((long)puVar42 + (long)puVar25));
                    }
                  }
                }
                goto LAB_001537b0;
              }
              uVar34 = *puVar55;
              puVar42[1] = puVar55[1];
              *puVar42 = uVar34;
              unaff_x20 = puVar25;
              if (&MACH_HEADER.ncmds < puVar25) {
                puVar17 = puVar42 + 2;
                do {
                  uVar34 = puVar55[2];
                  puVar17[1] = puVar55[3];
                  *puVar17 = uVar34;
                  uVar34 = puVar55[4];
                  puVar17[3] = puVar55[5];
                  puVar17[2] = uVar34;
                  puVar17 = puVar17 + 4;
                  puVar55 = puVar55 + 4;
                } while (puVar17 < (ulong *)((long)puVar42 + (long)puVar25));
              }
              goto joined_r0x001537bc;
            }
            uVar40 = (long)puVar42 - uStack0000000000000120;
            if (uVar40 != 0) {
              if ((ulong)(in_stack_00000078 - (long)unaff_x26) < uVar40) goto code_r0x00152014;
              uVar34 = (long)unaff_x26 - uStack0000000000000120;
              puVar55 = (ulong *)((long)unaff_x26 + uVar40);
              if (((long)uVar34 < -7) && (7 < uVar40)) {
                if (uVar34 < 0xfffffffffffffff0) {
                  puVar42 = puVar55 + -4;
                  if (puVar42 < unaff_x26) goto code_r0x001537d4;
                  uVar34 = *(ulong *)uStack0000000000000120;
                  unaff_x26[1] = *(ulong *)(uStack0000000000000120 + 8);
                  *unaff_x26 = uVar34;
                  if (0x10 < (ulong)((long)puVar42 - (long)unaff_x26)) {
                    puVar37 = unaff_x26 + 2;
                    puVar44 = (ulong *)uStack0000000000000120;
                    do {
                      uVar34 = puVar44[2];
                      puVar37[1] = puVar44[3];
                      *puVar37 = uVar34;
                      uVar34 = puVar44[4];
                      puVar37[3] = puVar44[5];
                      puVar37[2] = uVar34;
                      puVar37 = puVar37 + 4;
                      puVar44 = puVar44 + 4;
                    } while (puVar37 < puVar42);
                  }
                  uStack0000000000000120 =
                       uStack0000000000000120 + ((long)puVar42 - (long)unaff_x26);
                }
                else {
code_r0x001537d4:
                  puVar42 = unaff_x26;
                  if ((long)uVar40 < 1) goto LAB_00153934;
                }
                puVar20 = (undefined *)((long)unaff_x26 + (uVar40 - (long)puVar42));
                if ((puVar20 < (undefined *)0x8) || ((long)puVar42 - uStack0000000000000120 < 0x40))
                {
                  puVar37 = puVar42;
                }
                else {
                  if (puVar20 < (undefined *)0x40) {
                    puVar46 = (undefined *)0x0;
                  }
                  else {
                    puVar46 = (undefined *)((ulong)puVar20 & 0xffffffffffffffc0);
                    puVar37 = puVar42 + 4;
                    puVar44 = (ulong *)(uStack0000000000000120 + 0x20);
                    puVar49 = puVar46;
                    do {
                      uVar34 = puVar44[-4];
                      uVar23 = puVar44[-1];
                      uVar48 = puVar44[-2];
                      uVar43 = puVar44[1];
                      uVar32 = *puVar44;
                      uVar52 = puVar44[3];
                      uVar39 = puVar44[2];
                      puVar37[-3] = puVar44[-3];
                      puVar37[-4] = uVar34;
                      puVar37[-1] = uVar23;
                      puVar37[-2] = uVar48;
                      puVar37[1] = uVar43;
                      *puVar37 = uVar32;
                      puVar37[3] = uVar52;
                      puVar37[2] = uVar39;
                      puVar49 = puVar49 + -0x40;
                      puVar37 = puVar37 + 8;
                      puVar44 = puVar44 + 8;
                    } while (puVar49 != (undefined *)0x0);
                    if (puVar20 == puVar46) goto LAB_00153934;
                    if (((ulong)puVar20 & 0x38) == 0) {
                      uStack0000000000000120 = uStack0000000000000120 + (long)puVar46;
                      puVar37 = (ulong *)((long)puVar42 + (long)puVar46);
                      goto LAB_00153904;
                    }
                  }
                  puVar49 = (undefined *)((ulong)puVar20 & 0xfffffffffffffff8);
                  lVar50 = (long)puVar46 - (long)puVar49;
                  puVar62 = (undefined8 *)((long)puVar42 + (long)puVar46);
                  puVar14 = (undefined8 *)(uStack0000000000000120 + (long)puVar46);
                  do {
                    *puVar62 = *puVar14;
                    lVar50 = lVar50 + 8;
                    puVar62 = puVar62 + 1;
                    puVar14 = puVar14 + 1;
                  } while (lVar50 != 0);
                  puVar37 = (ulong *)((long)puVar42 + (long)puVar49);
                  uStack0000000000000120 = (ulong)(uStack0000000000000120 + (long)puVar49);
                  if (puVar20 == puVar49) goto LAB_00153934;
                }
LAB_00153904:
                do {
                  puVar44 = (ulong *)((long)puVar37 + 1);
                  *(char *)puVar37 = (char)*(ulong *)uStack0000000000000120;
                  puVar37 = puVar44;
                  uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
                } while (puVar44 != (ulong *)((long)puVar42 + (long)puVar20));
              }
              else if (0 < (long)uVar40) {
                puVar20 = (undefined *)((long)unaff_x26 + (long)puVar42) + -uStack0000000000000120;
                if (puVar20 <= (undefined *)((long)unaff_x26 + 1)) {
                  puVar20 = (undefined *)((long)unaff_x26 + 1);
                }
                uVar48 = (long)puVar20 - (long)unaff_x26;
                if ((7 < uVar48) && (0x3f < uVar34)) {
                  if (uVar48 < 0x40) {
                    uVar23 = 0;
                  }
                  else {
                    uVar23 = uVar48 & 0xffffffffffffffc0;
                    puVar42 = unaff_x26 + 4;
                    puVar37 = (ulong *)(uStack0000000000000120 + 0x20);
                    uVar34 = uVar23;
                    do {
                      uVar32 = puVar37[-4];
                      uVar39 = puVar37[-1];
                      uVar43 = puVar37[-2];
                      uVar67 = puVar37[1];
                      uVar52 = *puVar37;
                      uVar71 = puVar37[3];
                      uVar69 = puVar37[2];
                      puVar42[-3] = puVar37[-3];
                      puVar42[-4] = uVar32;
                      puVar42[-1] = uVar39;
                      puVar42[-2] = uVar43;
                      puVar42[1] = uVar67;
                      *puVar42 = uVar52;
                      puVar42[3] = uVar71;
                      puVar42[2] = uVar69;
                      uVar34 = uVar34 - 0x40;
                      puVar42 = puVar42 + 8;
                      puVar37 = puVar37 + 8;
                    } while (uVar34 != 0);
                    if (uVar48 == uVar23) goto LAB_00153934;
                    if ((uVar48 & 0x38) == 0) {
                      uStack0000000000000120 = uStack0000000000000120 + uVar23;
                      unaff_x26 = (ulong *)((long)unaff_x26 + uVar23);
                      goto code_r0x00153924;
                    }
                  }
                  uVar34 = uVar48 & 0xfffffffffffffff8;
                  lVar50 = uVar23 - uVar34;
                  puVar62 = (undefined8 *)(uStack0000000000000120 + uVar23);
                  puVar14 = (undefined8 *)((long)unaff_x26 + uVar23);
                  do {
                    *puVar14 = *puVar62;
                    lVar50 = lVar50 + 8;
                    puVar62 = puVar62 + 1;
                    puVar14 = puVar14 + 1;
                  } while (lVar50 != 0);
                  unaff_x26 = (ulong *)((long)unaff_x26 + uVar34);
                  uStack0000000000000120 = (ulong)(uStack0000000000000120 + uVar34);
                  if (uVar48 == uVar34) goto LAB_00153934;
                }
code_r0x00153924:
                do {
                  puVar42 = (ulong *)((long)unaff_x26 + 1);
                  *(char *)unaff_x26 = (char)*(ulong *)uStack0000000000000120;
                  unaff_x26 = puVar42;
                  uStack0000000000000120 = (ulong)(uStack0000000000000120 + 1);
                } while (puVar42 < puVar55);
              }
LAB_00153934:
              uVar34 = *puVar25 - uVar40;
              *puVar25 = uVar34;
              unaff_x26 = puVar55;
            }
            uStack0000000000000120 = (ulong)puVar35;
            *(uint *)((long)param_1 + 0xe64) = 0;
            unaff_x20 = *(ulong **)(&uStack0000000000000148 + lVar56);
            unaff_x28 = *(ulong **)((long)&uStack0000000000000150 + lVar56);
            unaff_x27 = (ulong *)((long)unaff_x26 + uVar34);
            puVar25 = (ulong *)((long)unaff_x27 - (long)unaff_x28);
            Hint_Prefetch(puVar25,0,0,0);
            uVar48 = (long)unaff_x20 + uVar34;
            if (puVar24 < (ulong *)((long)puVar35 + uVar34) ||
                puVar19 < (undefined *)((long)unaff_x26 + uVar48)) {
              param_3 = &uStack0000000000000128;
              param_4 = &uStack0000000000000120;
              param_5 = puVar24;
              uStack0000000000000128 = uVar34;
              in_stack_00000130 = unaff_x20;
              in_stack_00000138 = unaff_x28;
              uVar48 = func_0x00155c78(unaff_x26,in_stack_00000078);
              puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
            }
            else {
              uVar40 = *puVar35;
              unaff_x26[1] = *(ulong *)((long)unaff_x25 + 0x76ac);
              *unaff_x26 = uVar40;
              if (0x10 < uVar34) {
                uVar40 = *(ulong *)((long)unaff_x25 + 0x76b4);
                unaff_x26[3] = *(ulong *)((long)unaff_x25 + 0x76bc);
                unaff_x26[2] = uVar40;
                if (0x10 < uVar34 - 0x10) {
                  puVar55 = unaff_x26 + 4;
                  puVar42 = (ulong *)((long)unaff_x25 + 0x76d4);
                  do {
                    uVar40 = puVar42[-2];
                    puVar55[1] = puVar42[-1];
                    *puVar55 = uVar40;
                    uVar40 = *puVar42;
                    puVar55[3] = puVar42[1];
                    puVar55[2] = uVar40;
                    puVar55 = puVar55 + 4;
                    puVar42 = puVar42 + 4;
                  } while (puVar55 < unaff_x27);
                }
              }
              uStack0000000000000120 = (long)puVar35 + uVar34;
              if ((ulong *)((long)unaff_x27 - (long)unaff_x30) < unaff_x28) {
                unaff_x22 = param_1;
                if ((ulong *)((long)unaff_x27 - in_stack_00000070) < unaff_x28) goto LAB_00153e5c;
                lVar56 = (long)puVar25 - (long)unaff_x30;
                if (in_stack_000000a8 <
                    (undefined1 *)((long)in_stack_000000a8 + lVar56) + (long)unaff_x20) {
                  param_3 = (ulong *)-lVar56;
                  _memmove(unaff_x27);
                  unaff_x27 = (ulong *)((long)unaff_x27 - lVar56);
                  unaff_x20 = (ulong *)(lVar56 + (long)unaff_x20);
                  puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
                  puVar25 = unaff_x30;
                  goto LAB_001539ec;
                }
                param_3 = unaff_x20;
                _memmove(unaff_x27);
              }
              else {
LAB_001539ec:
                if (&MACH_HEADER.ncmds <= unaff_x28) {
                  uVar34 = *puVar25;
                  unaff_x27[1] = puVar25[1];
                  *unaff_x27 = uVar34;
                  if (&MACH_HEADER.ncmds < unaff_x20) {
                    puVar17 = unaff_x27 + 2;
                    do {
                      uVar34 = puVar25[2];
                      puVar17[1] = puVar25[3];
                      *puVar17 = uVar34;
                      uVar34 = puVar25[4];
                      puVar17[3] = puVar25[5];
                      puVar17[2] = uVar34;
                      puVar17 = puVar17 + 4;
                      puVar25 = puVar25 + 4;
                    } while (puVar17 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                  }
                  goto joined_r0x00153b5c;
                }
                if ((ulong *)((long)&MACH_HEADER.cputype + 3) < unaff_x28) {
                  *unaff_x27 = *puVar25;
                }
                else {
                  iVar29 = *(int *)(&UNK_008143b0 + (long)unaff_x28 * 4);
                  *(char *)unaff_x27 = (char)*puVar25;
                  *(undefined1 *)((long)unaff_x27 + 1) = *(undefined1 *)((long)puVar25 + 1);
                  *(undefined1 *)((long)unaff_x27 + 2) = *(undefined1 *)((long)puVar25 + 2);
                  *(undefined1 *)((long)unaff_x27 + 3) = *(undefined1 *)((long)puVar25 + 3);
                  puVar5 = (uint *)((long)puVar25 +
                                   (ulong)*(uint *)(&UNK_00814390 + (long)unaff_x28 * 4));
                  puVar25 = (ulong *)((long)puVar5 - (long)iVar29);
                  *(uint *)((long)unaff_x27 + 4) = *puVar5;
                }
                if (&MACH_HEADER.cpusubtype < unaff_x20) {
                  puVar17 = puVar25 + 1;
                  puVar22 = unaff_x27 + 1;
                  if ((long)puVar22 - (long)puVar17 < 0x10) {
                    do {
                      puVar25 = puVar22 + 1;
                      *puVar22 = *puVar17;
                      puVar17 = puVar17 + 1;
                      puVar22 = puVar25;
                    } while (puVar25 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                  }
                  else {
                    uVar34 = *puVar17;
                    unaff_x27[2] = puVar25[2];
                    *puVar22 = uVar34;
                    if (&MACH_HEADER.ncmds < unaff_x20 + -1) {
                      puVar17 = unaff_x27 + 3;
                      puVar22 = puVar25 + 5;
                      do {
                        uVar34 = puVar22[-2];
                        puVar17[1] = puVar22[-1];
                        *puVar17 = uVar34;
                        uVar34 = *puVar22;
                        puVar17[3] = puVar22[1];
                        puVar17[2] = uVar34;
                        puVar17 = puVar17 + 4;
                        puVar22 = puVar22 + 4;
                      } while (puVar17 < (ulong *)((long)unaff_x27 + (long)unaff_x20));
                    }
                  }
                }
              }
              puVar22 = (ulong *)((ulong)param_6 & 0xffffffff);
            }
joined_r0x00153b5c:
            unaff_x23 = 0x18;
            puVar17 = param_4;
            if (0xffffffffffffff88 < uVar48) goto LAB_00153e60;
            unaff_x23 = 0x18;
            unaff_x26 = (ulong *)((long)unaff_x26 + uVar48);
            puVar54 = (ulong *)(ulong)(uVar28 + 1);
            puStack0000000000000080 = puVar24;
          } while (uVar28 + 1 != (uint)puVar22);
        }
LAB_00153e9c:
        *param_1 = CONCAT44((int)puStack0000000000000110,(int)uStack0000000000000108);
        *(uint *)(param_1 + 1) = (uint)puStack0000000000000118;
        puVar24 = (ulong *)uStack0000000000000120;
        param_3 = puStack0000000000000080;
        if (*(uint *)((long)param_1 + 0xe64) == 2) {
          unaff_x20 = (ulong *)((long)puStack0000000000000080 - uStack0000000000000120);
          puVar17 = param_4;
          puVar54 = unaff_x19;
          plVar61 = unaff_x25;
          if (unaff_x20 <= (ulong *)(in_stack_00000078 - (long)unaff_x26)) {
            if (unaff_x26 != (ulong *)0x0) {
              _memmove(unaff_x26,uStack0000000000000120,unaff_x20);
              unaff_x26 = (ulong *)((long)unaff_x26 + (long)unaff_x20);
            }
            param_3 = (ulong *)((long)unaff_x25 + 0x176a4);
            puVar24 = (ulong *)((long)unaff_x25 + 0x76a4);
            goto code_r0x00152000;
          }
        }
        else {
code_r0x00152000:
          unaff_x20 = (ulong *)((long)param_3 - (long)puVar24);
          puVar17 = param_4;
          puVar54 = unaff_x19;
          plVar61 = unaff_x25;
          if (unaff_x20 <= (ulong *)(in_stack_00000078 - (long)unaff_x26)) {
            if (unaff_x26 == (ulong *)0x0) {
              puVar20 = (undefined *)0x0;
            }
            else {
              param_3 = unaff_x20;
              _memmove(unaff_x26);
              puVar20 = (undefined *)((long)unaff_x26 + (long)unaff_x20);
            }
            uVar48 = (long)puVar20 - (long)unaff_x19;
            puVar17 = param_4;
            goto LAB_00153e60;
          }
        }
code_r0x00152014:
        uVar48 = 0xffffffffffffffba;
      }
    }
  }
LAB_00153e60:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return uVar48;
  }
  auVar75 = ___stack_chk_fail();
  puVar15 = auVar75._8_8_;
  plVar13 = auVar75._0_8_;
  puStack_60 = unaff_x28;
  puStack_58 = unaff_x27;
  puStack_50 = unaff_x26;
  plStack_48 = plVar61;
  uStack_40 = uVar48;
  uStack_38 = unaff_x23;
  puStack_30 = param_1;
  puStack_28 = puVar19;
  puStack_20 = unaff_x20;
  puStack_18 = puVar54;
  puVar26 = (undefined1 *)
            ((long)puVar15 + ((ulong)param_3 & ((long)param_3 >> 0x3f ^ 0xffffffffffffffffU)));
  puVar16 = (undefined8 *)plVar13[0xeb5];
  puStack_88 = puVar16;
  puVar62 = (undefined8 *)plVar13[0xed3];
  puVar14 = puVar15;
  if ((int)puVar22 == 0) {
    iVar29 = (int)plVar13[0xed4];
joined_r0x001550b0:
    puStack_88 = puVar16;
    if (iVar29 == 2) {
      uVar34 = (long)puVar62 - (long)puVar16;
      if ((ulong)((long)puVar26 - (long)puVar14) < uVar34) {
        return 0xffffffffffffffba;
      }
      if (puVar14 != (undefined8 *)0x0) {
        _memmove(puVar14,puVar16,uVar34);
        puVar14 = (undefined8 *)((long)puVar14 + uVar34);
      }
      puVar16 = (undefined8 *)((long)plVar13 + 0x76a4);
      puVar62 = (undefined8 *)((long)plVar13 + 0x176a4);
      *(undefined4 *)(plVar13 + 0xed4) = 0;
    }
    uVar34 = (long)puVar62 - (long)puVar16;
    if ((ulong)((long)puVar26 - (long)puVar14) < uVar34) {
      return 0xffffffffffffffba;
    }
    if (puVar14 == (undefined8 *)0x0) {
      puVar26 = (undefined1 *)0x0;
    }
    else {
      _memcpy(puVar14,puVar16,uVar34);
      puVar26 = (undefined1 *)((long)puVar14 + uVar34);
    }
    return (long)puVar26 - (long)puVar15;
  }
  puVar16 = (undefined8 *)plVar13[0xe99];
  lVar56 = plVar13[0xe9a];
  uVar34 = plVar13[0xe9b];
  *(undefined4 *)((long)plVar13 + 0x7534) = 1;
  uVar40 = *(ulong *)((long)plVar13 + 0x683c);
  auStack_a0[1] = uVar40 >> 0x20;
  auStack_a0[0] = uVar40 & 0xffffffff;
  auStack_a0[2] = (ulong)*(uint *)((long)plVar13 + 0x6844);
  if (param_5 == (ulong *)0x0) {
    return 0xffffffffffffffec;
  }
  puVar24 = puVar17 + 1;
  puVar54 = param_5 + -1;
  if (param_5 < &MACH_HEADER.cpusubtype) {
    uStack_f8 = (ulong)(byte)*puVar17;
    switch(param_5) {
    case (ulong *)0x7:
      uStack_f8 = uStack_f8 | (ulong)*(byte *)((long)puVar17 + 6) << 0x30;
    case (ulong *)0x6:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)puVar17 + 5) << 0x28);
    case (ulong *)0x5:
      uStack_f8 = uStack_f8 + ((ulong)*(byte *)((long)puVar17 + 4) << 0x20);
    case (ulong *)0x4:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)puVar17 + 3) * 0x1000000;
    case (ulong *)0x3:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)puVar17 + 2) * 0x10000;
    case (ulong *)0x2:
      uStack_f8 = uStack_f8 + (ulong)*(byte *)((long)puVar17 + 1) * 0x100;
    }
    if ((byte)((undefined *)((long)param_5 + (long)puVar17))[-1] == 0) {
      return 0xffffffffffffffec;
    }
    puVar54 = (ulong *)0x0;
    iVar29 = (int)LZCOUNT((uint)(byte)((undefined *)((long)param_5 + (long)puVar17))[-1]) +
             (int)param_5 * -8 + 0x29;
    puStack_e8 = puVar17;
  }
  else {
    uStack_f8 = *(ulong *)((long)puVar17 + (long)puVar54);
    if (uStack_f8 >> 0x38 == 0) {
      return 0xffffffffffffffec;
    }
    if ((ulong *)0xffffffffffffff88 < param_5) {
      return 0xffffffffffffffec;
    }
    iVar29 = (int)LZCOUNT((uint)(byte)(uStack_f8 >> 0x38)) + -0x17;
    puStack_e8 = (ulong *)((long)puVar17 + (long)puVar54);
  }
  uVar28 = *(uint *)(*plVar13 + 4);
  uStack_f0 = uVar28 + iVar29;
  uStack_d0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar28 * 4);
  if (uStack_f0 < 0x41) {
    if ((long)puVar54 < 8) {
      puVar25 = puVar17;
      if (puVar54 == (ulong *)0x0) goto LAB_00154138;
      uVar28 = (uint)puVar54;
      if (puVar17 <= (undefined *)((long)puVar17 + (long)puVar54) + -(ulong)(uStack_f0 >> 3)) {
        uVar28 = uStack_f0 >> 3;
      }
      uStack_f0 = uStack_f0 + uVar28 * -8;
    }
    else {
      uVar28 = uStack_f0 >> 3;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = (ulong *)((undefined *)((long)puVar17 + (long)puVar54) + -(ulong)uVar28);
    uStack_f8 = *puStack_e8;
    puVar25 = puStack_e8;
  }
  else {
    puVar25 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_00154138:
  lVar50 = *plVar13 + 8;
  uVar28 = *(uint *)(plVar13[2] + 4);
  uStack_f0 = uVar28 + uStack_f0;
  uStack_c0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar28 * 4);
  iVar29 = (int)puVar17;
  if (uStack_f0 < 0x41) {
    if (puVar25 < puVar24) {
      puVar54 = puVar17;
      if (puVar25 == puVar17) goto LAB_001541c4;
      uVar28 = (int)puVar25 - iVar29;
      if (puVar17 <= (ulong *)((long)puVar25 - (ulong)(uStack_f0 >> 3))) {
        uVar28 = uStack_f0 >> 3;
      }
      puVar54 = (ulong *)((long)puVar25 - (ulong)uVar28);
      uStack_f8 = *puVar54;
      uStack_f0 = uStack_f0 + uVar28 * -8;
    }
    else {
      puVar54 = (ulong *)((long)puVar25 - (ulong)(uStack_f0 >> 3));
      uStack_f8 = *puVar54;
      uStack_f0 = uStack_f0 & 7;
    }
    puStack_e8 = puVar54;
  }
  else {
    puVar54 = (ulong *)&UNK_00814388;
    puStack_e8 = (ulong *)&UNK_00814388;
  }
LAB_001541c4:
  puVar59 = (undefined8 *)((long)plVar13 + 0x76a4);
  lVar1 = plVar13[2] + 8;
  uVar28 = *(uint *)(plVar13[1] + 4);
  uStack_f0 = uVar28 + uStack_f0;
  uStack_b0 = uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
              (ulong)*(uint *)(&UNK_00814304 + (ulong)uVar28 * 4);
  if (uStack_f0 < 0x41) {
    if (puVar54 < puVar24) {
      if (puVar54 != puVar17) {
        uVar28 = (int)puVar54 - iVar29;
        if (puVar17 <= (ulong *)((long)puVar54 - (ulong)(uStack_f0 >> 3))) {
          uVar28 = uStack_f0 >> 3;
        }
        puStack_e8 = (ulong *)((long)puVar54 - (ulong)uVar28);
        uStack_f0 = uStack_f0 + uVar28 * -8;
        uStack_f8 = *puStack_e8;
      }
    }
    else {
      puStack_e8 = (ulong *)((long)puVar54 - (ulong)(uStack_f0 >> 3));
      uStack_f0 = uStack_f0 & 7;
      uStack_f8 = *puStack_e8;
    }
  }
  else {
    puStack_e8 = (ulong *)&UNK_00814388;
  }
  lVar36 = plVar13[1] + 8;
  do {
    puVar2 = (ushort *)(lVar50 + uStack_d0 * 8);
    puVar3 = (ushort *)(lVar36 + uStack_b0 * 8);
    puVar4 = (ushort *)(lVar1 + uStack_c0 * 8);
    uVar48 = (ulong)*(uint *)(puVar3 + 2);
    uVar40 = (ulong)*(uint *)(puVar2 + 2);
    uVar28 = *(uint *)(puVar4 + 2);
    bVar7 = (byte)puVar2[1];
    bVar8 = (byte)puVar3[1];
    bVar9 = (byte)puVar4[1];
    uVar21 = (uint)bVar9;
    puVar54 = auStack_a0;
    if (bVar9 < 2) {
      bVar12 = *(uint *)(puVar2 + 2) == 0;
      if (bVar9 != 0) {
        if (bVar12) {
          uVar28 = uVar28 + 1;
        }
        uVar23 = (ulong)uStack_f0;
        uStack_f0 = uStack_f0 + 1;
        lVar47 = (ulong)uVar28 - ((long)(uStack_f8 << (uVar23 & 0x3f)) >> 0x3f);
        if (lVar47 == 3) {
          uVar23 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
        }
        else {
          uVar23 = auStack_a0[lVar47] - (ulong)(auStack_a0[lVar47] == 0);
          if (lVar47 == 1) goto LAB_00154320;
        }
        goto code_r0x001542f4;
      }
      uVar23 = auStack_a0[bVar12];
      puVar54 = auStack_a0 + !bVar12;
    }
    else {
      uVar23 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + uVar21;
      uVar23 = ((uStack_f8 << (uVar23 & 0x3f)) >> ((ulong)-uVar21 & 0x3f)) + (ulong)uVar28;
code_r0x001542f4:
      auStack_a0[2] = auStack_a0[1];
    }
LAB_00154320:
    auStack_a0[0] = uVar23;
    auStack_a0[1] = *puVar54;
    if (bVar8 != 0) {
      uVar32 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar8;
      uVar48 = ((uStack_f8 << (uVar32 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar48;
    }
    if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar21 & 0xff)) {
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar24) {
          if (puStack_e8 == puVar17) goto code_r0x00154360;
          uVar28 = (int)puStack_e8 - iVar29;
          if (puVar17 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
            uVar28 = uStack_f0 >> 3;
          }
          uStack_f0 = uStack_f0 + uVar28 * -8;
        }
        else {
          uVar28 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
        }
        puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar28);
        uStack_f8 = *puStack_e8;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
      }
    }
code_r0x00154360:
    if (bVar7 != 0) {
      uVar32 = (ulong)uStack_f0;
      uStack_f0 = uStack_f0 + bVar7;
      uVar40 = ((uStack_f8 << (uVar32 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar40;
    }
    iVar63 = (int)puVar22;
    iVar60 = iVar63 + -1;
    if (iVar60 != 0) {
      iVar11 = uStack_f0 + *(byte *)((long)puVar2 + 3);
      uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar11 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
                  (ulong)*puVar2;
      iVar11 = iVar11 + (uint)*(byte *)((long)puVar3 + 3);
      uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar11 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                  (ulong)*puVar3;
      uStack_f0 = iVar11 + (uint)*(byte *)((long)puVar4 + 3);
      uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                  (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                  (ulong)*puVar4;
      if (uStack_f0 < 0x41) {
        if (puStack_e8 < puVar24) {
          if (puStack_e8 != puVar17) {
            uVar28 = (int)puStack_e8 - iVar29;
            if (puVar17 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
              uVar28 = uStack_f0 >> 3;
            }
            uStack_f0 = uStack_f0 + uVar28 * -8;
            goto code_r0x00154464;
          }
        }
        else {
          uVar28 = uStack_f0 >> 3;
          uStack_f0 = uStack_f0 & 7;
code_r0x00154464:
          puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar28);
          uStack_f8 = *puStack_e8;
        }
        puVar38 = (undefined1 *)plVar13[0xed3];
        if ((undefined1 *)((long)puStack_88 + uVar40) <= puVar38) goto code_r0x00154484;
      }
      else {
        puStack_e8 = (ulong *)&UNK_00814388;
        puVar38 = (undefined1 *)plVar13[0xed3];
        if ((undefined1 *)((long)puStack_88 + uVar40) <= puVar38) goto code_r0x00154484;
      }
      if (iVar63 < 1) {
        return 0xffffffffffffffec;
      }
code_r0x001547d8:
      uVar32 = (long)puVar38 - (long)puStack_88;
      if (uVar32 == 0) goto code_r0x00154a08;
      if ((ulong)((long)puVar26 - (long)puVar14) < uVar32) {
        return 0xffffffffffffffba;
      }
      uVar43 = (long)puVar14 - (long)puStack_88;
      puVar62 = (undefined8 *)((long)puVar14 + uVar32);
      if (((long)uVar43 < -7) && (7 < uVar32)) {
        if (uVar43 < 0xfffffffffffffff0) {
          puVar58 = puVar62 + -4;
          if (puVar14 <= puVar58) {
            uVar64 = *puStack_88;
            puVar14[1] = puStack_88[1];
            *puVar14 = uVar64;
            if (0x10 < (ulong)((long)puVar58 - (long)puVar14)) {
              puVar31 = puVar14 + 2;
              puVar27 = puStack_88;
              do {
                uVar64 = puVar27[2];
                puVar31[1] = puVar27[3];
                *puVar31 = uVar64;
                uVar64 = puVar27[4];
                puVar31[3] = puVar27[5];
                puVar31[2] = uVar64;
                puVar31 = puVar31 + 4;
                puVar27 = puVar27 + 4;
              } while (puVar31 < puVar58);
            }
            puStack_88 = (undefined8 *)((long)puStack_88 + ((long)puVar58 - (long)puVar14));
code_r0x001548ac:
            puVar38 = (undefined1 *)((long)puVar14 + (uVar32 - (long)puVar58));
            if ((puVar38 < (undefined1 *)0x8) || ((ulong)((long)puVar58 - (long)puStack_88) < 0x40))
            {
              puVar14 = puVar58;
            }
            else {
              if (puVar38 < (undefined1 *)0x40) {
                puVar51 = (undefined1 *)0x0;
              }
              else {
                puVar51 = (undefined1 *)((ulong)puVar38 & 0xffffffffffffffc0);
                puVar14 = puVar58 + 4;
                puVar31 = puStack_88 + 4;
                puVar53 = puVar51;
                do {
                  uVar64 = puVar31[-4];
                  uVar66 = puVar31[-1];
                  uVar65 = puVar31[-2];
                  uVar70 = puVar31[1];
                  uVar68 = *puVar31;
                  uVar74 = puVar31[3];
                  uVar72 = puVar31[2];
                  puVar14[-3] = puVar31[-3];
                  puVar14[-4] = uVar64;
                  puVar14[-1] = uVar66;
                  puVar14[-2] = uVar65;
                  puVar14[1] = uVar70;
                  *puVar14 = uVar68;
                  puVar14[3] = uVar74;
                  puVar14[2] = uVar72;
                  puVar53 = puVar53 + -0x40;
                  puVar14 = puVar14 + 8;
                  puVar31 = puVar31 + 8;
                } while (puVar53 != (undefined1 *)0x0);
                if (puVar38 == puVar51) goto code_r0x00154a00;
                if (((ulong)puVar38 & 0x38) == 0) {
                  puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar51);
                  puVar14 = (undefined8 *)((long)puVar58 + (long)puVar51);
                  goto code_r0x001549d0;
                }
              }
              puVar53 = (undefined1 *)((ulong)puVar38 & 0xfffffffffffffff8);
              lVar47 = (long)puVar51 - (long)puVar53;
              puVar14 = (undefined8 *)((long)puVar58 + (long)puVar51);
              puVar31 = (undefined8 *)((long)puStack_88 + (long)puVar51);
              do {
                *puVar14 = *puVar31;
                lVar47 = lVar47 + 8;
                puVar14 = puVar14 + 1;
                puVar31 = puVar31 + 1;
              } while (lVar47 != 0);
              puVar14 = (undefined8 *)((long)puVar58 + (long)puVar53);
              puStack_88 = (undefined8 *)((long)puStack_88 + (long)puVar53);
              if (puVar38 == puVar53) goto code_r0x00154a00;
            }
code_r0x001549d0:
            do {
              puVar31 = (undefined8 *)((long)puVar14 + 1);
              *(undefined1 *)puVar14 = *(undefined1 *)puStack_88;
              puVar14 = puVar31;
              puStack_88 = (undefined8 *)((long)puStack_88 + 1);
            } while (puVar31 != (undefined8 *)((long)puVar58 + (long)puVar38));
            goto code_r0x00154a00;
          }
        }
        puVar58 = puVar14;
        if (0 < (long)uVar32) goto code_r0x001548ac;
        goto code_r0x00154a00;
      }
      if ((long)uVar32 < 1) goto code_r0x00154a00;
      puVar38 = (undefined1 *)((long)puVar14 + (long)puVar38) + -(long)puStack_88;
      if (puVar38 <= (undefined1 *)((long)puVar14 + 1U)) {
        puVar38 = (undefined1 *)((long)puVar14 + 1);
      }
      uVar39 = (long)puVar38 - (long)puVar14;
      if ((uVar39 < 8) || (uVar43 < 0x40)) goto code_r0x001549f0;
      if (uVar39 < 0x40) {
        uVar43 = 0;
        goto code_r0x00154994;
      }
      uVar43 = uVar39 & 0xffffffffffffffc0;
      puVar58 = puVar14 + 4;
      puVar31 = puStack_88 + 4;
      uVar52 = uVar43;
      do {
        uVar64 = puVar31[-4];
        uVar66 = puVar31[-1];
        uVar65 = puVar31[-2];
        uVar70 = puVar31[1];
        uVar68 = *puVar31;
        uVar74 = puVar31[3];
        uVar72 = puVar31[2];
        puVar58[-3] = puVar31[-3];
        puVar58[-4] = uVar64;
        puVar58[-1] = uVar66;
        puVar58[-2] = uVar65;
        puVar58[1] = uVar70;
        *puVar58 = uVar68;
        puVar58[3] = uVar74;
        puVar58[2] = uVar72;
        uVar52 = uVar52 - 0x40;
        puVar58 = puVar58 + 8;
        puVar31 = puVar31 + 8;
      } while (uVar52 != 0);
      if (uVar39 != uVar43) {
        if ((uVar39 & 0x38) == 0) {
          puStack_88 = (undefined8 *)((long)puStack_88 + uVar43);
          puVar14 = (undefined8 *)((long)puVar14 + uVar43);
        }
        else {
code_r0x00154994:
          uVar52 = uVar39 & 0xfffffffffffffff8;
          lVar47 = uVar43 - uVar52;
          puVar58 = (undefined8 *)((long)puStack_88 + uVar43);
          puVar31 = (undefined8 *)((long)puVar14 + uVar43);
          do {
            *puVar31 = *puVar58;
            lVar47 = lVar47 + 8;
            puVar58 = puVar58 + 1;
            puVar31 = puVar31 + 1;
          } while (lVar47 != 0);
          puVar14 = (undefined8 *)((long)puVar14 + uVar52);
          puStack_88 = (undefined8 *)((long)puStack_88 + uVar52);
          if (uVar39 == uVar52) goto code_r0x00154a00;
        }
code_r0x001549f0:
        do {
          puVar58 = (undefined8 *)((long)puVar14 + 1);
          *(undefined1 *)puVar14 = *(undefined1 *)puStack_88;
          puVar14 = puVar58;
          puStack_88 = (undefined8 *)((long)puStack_88 + 1);
        } while (puVar58 < puVar62);
      }
code_r0x00154a00:
      uVar40 = uVar40 - uVar32;
      puVar14 = puVar62;
code_r0x00154a08:
      puVar62 = (undefined8 *)((long)plVar13 + 0x176a4);
      *(undefined4 *)(plVar13 + 0xed4) = 0;
      puVar58 = (undefined8 *)((long)puVar14 + uVar40);
      puVar31 = (undefined8 *)((long)puVar58 - uVar23);
      Hint_Prefetch(puVar31,0,0,0);
      if ((puVar62 < (undefined8 *)((long)puVar59 + uVar40)) ||
         (uVar32 = uVar40 + uVar48, puVar26 + -0x20 < (undefined1 *)((long)puVar14 + uVar32))) {
        puStack_88 = puVar59;
        uStack_80 = uVar40;
        uStack_78 = uVar48;
        uStack_70 = uVar23;
        uVar32 = func_0x00155c78(puVar14,puVar26,&uStack_80,&puStack_88,puVar62,puVar16,lVar56,
                                 uVar34);
      }
      else {
        uVar64 = *puVar59;
        puVar14[1] = *(undefined8 *)((long)plVar13 + 0x76ac);
        *puVar14 = uVar64;
        if (0x10 < uVar40) {
          uVar64 = *(undefined8 *)((long)plVar13 + 0x76b4);
          puVar14[3] = *(undefined8 *)((long)plVar13 + 0x76bc);
          puVar14[2] = uVar64;
          if (0x10 < uVar40 - 0x10) {
            puVar27 = puVar14 + 4;
            puVar33 = (undefined8 *)((long)plVar13 + 0x76d4);
            do {
              uVar64 = puVar33[-2];
              puVar27[1] = puVar33[-1];
              *puVar27 = uVar64;
              uVar64 = *puVar33;
              puVar27[3] = puVar33[1];
              puVar27[2] = uVar64;
              puVar27 = puVar27 + 4;
              puVar33 = puVar33 + 4;
            } while (puVar27 < puVar58);
          }
        }
        puStack_88 = (undefined8 *)((long)puVar59 + uVar40);
        if ((ulong)((long)puVar58 - (long)puVar16) < uVar23) {
          if ((ulong)((long)puVar58 - lVar56) < uVar23) {
            return 0xffffffffffffffec;
          }
          lVar57 = (long)puVar31 - (long)puVar16;
          lVar47 = uVar34 + lVar57;
          if (lVar47 + uVar48 <= uVar34) {
            _memmove(puVar58,lVar47,uVar48);
            goto joined_r0x00154b24;
          }
          _memmove(puVar58,lVar47,-lVar57);
          puVar58 = (undefined8 *)((long)puVar58 - lVar57);
          uVar48 = lVar57 + uVar48;
          puVar31 = puVar16;
        }
        if (uVar23 < 0x10) {
          if (uVar23 < 8) {
            iVar11 = *(int *)(&UNK_008143b0 + uVar23 * 4);
            *(undefined1 *)puVar58 = *(undefined1 *)puVar31;
            *(undefined1 *)((long)puVar58 + 1) = *(undefined1 *)((long)puVar31 + 1);
            *(undefined1 *)((long)puVar58 + 2) = *(undefined1 *)((long)puVar31 + 2);
            *(undefined1 *)((long)puVar58 + 3) = *(undefined1 *)((long)puVar31 + 3);
            puVar6 = (undefined4 *)((long)puVar31 + (ulong)*(uint *)(&UNK_00814390 + uVar23 * 4));
            puVar31 = (undefined8 *)((long)puVar6 - (long)iVar11);
            *(undefined4 *)((long)puVar58 + 4) = *puVar6;
          }
          else {
            *puVar58 = *puVar31;
          }
          if (8 < uVar48) {
            puVar59 = puVar31 + 1;
            puVar27 = puVar58 + 1;
            if ((long)puVar27 - (long)puVar59 < 0x10) {
              do {
                puVar31 = puVar27 + 1;
                *puVar27 = *puVar59;
                puVar59 = puVar59 + 1;
                puVar27 = puVar31;
              } while (puVar31 < (undefined8 *)((long)puVar58 + uVar48));
            }
            else {
              uVar64 = *puVar59;
              puVar58[2] = puVar31[2];
              *puVar27 = uVar64;
              if (0x10 < uVar48 - 8) {
                puVar59 = puVar58 + 3;
                puVar31 = puVar31 + 5;
                do {
                  uVar64 = puVar31[-2];
                  puVar59[1] = puVar31[-1];
                  *puVar59 = uVar64;
                  uVar64 = *puVar31;
                  puVar59[3] = puVar31[1];
                  puVar59[2] = uVar64;
                  puVar59 = puVar59 + 4;
                  puVar31 = puVar31 + 4;
                } while (puVar59 < (undefined8 *)((long)puVar58 + uVar48));
              }
            }
          }
        }
        else {
          uVar64 = *puVar31;
          puVar58[1] = puVar31[1];
          *puVar58 = uVar64;
          if (0x10 < uVar48) {
            puVar59 = puVar58 + 2;
            do {
              uVar64 = puVar31[2];
              puVar59[1] = puVar31[3];
              *puVar59 = uVar64;
              uVar64 = puVar31[4];
              puVar59[3] = puVar31[5];
              puVar59[2] = uVar64;
              puVar59 = puVar59 + 4;
              puVar31 = puVar31 + 4;
            } while (puVar59 < (undefined8 *)((long)puVar58 + uVar48));
          }
        }
      }
joined_r0x00154b24:
      if (0xffffffffffffff88 < uVar32) {
        return uVar32;
      }
      puVar14 = (undefined8 *)((long)puVar14 + uVar32);
      if (iVar63 < 2) {
        if (iVar60 != 0) {
          return 0xffffffffffffffec;
        }
      }
      else {
        do {
          puVar2 = (ushort *)(lVar50 + uStack_d0 * 8);
          puVar3 = (ushort *)(lVar36 + uStack_b0 * 8);
          puVar4 = (ushort *)(lVar1 + uStack_c0 * 8);
          uVar48 = (ulong)*(uint *)(puVar3 + 2);
          uVar40 = (ulong)*(uint *)(puVar2 + 2);
          uVar28 = *(uint *)(puVar4 + 2);
          bVar7 = (byte)puVar2[1];
          bVar8 = (byte)puVar3[1];
          bVar9 = (byte)puVar4[1];
          uVar21 = (uint)bVar9;
          puVar54 = auStack_a0;
          if (bVar9 < 2) {
            bVar12 = *(uint *)(puVar2 + 2) == 0;
            if (bVar9 != 0) {
              if (bVar12) {
                uVar28 = uVar28 + 1;
              }
              uVar23 = (ulong)uStack_f0;
              uStack_f0 = uStack_f0 + 1;
              lVar47 = (ulong)uVar28 - ((long)(uStack_f8 << (uVar23 & 0x3f)) >> 0x3f);
              if (lVar47 == 3) {
                uVar23 = (auStack_a0[0] - 1) - (ulong)(auStack_a0[0] - 1 == 0);
              }
              else {
                uVar23 = auStack_a0[lVar47] - (ulong)(auStack_a0[lVar47] == 0);
                if (lVar47 == 1) goto LAB_00154bdc;
              }
              goto code_r0x00154bb0;
            }
            uVar23 = auStack_a0[bVar12];
            puVar54 = auStack_a0 + !bVar12;
          }
          else {
            uVar23 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + uVar21;
            uVar23 = ((uStack_f8 << (uVar23 & 0x3f)) >> ((ulong)-uVar21 & 0x3f)) + (ulong)uVar28;
code_r0x00154bb0:
            auStack_a0[2] = auStack_a0[1];
          }
LAB_00154bdc:
          auStack_a0[0] = uVar23;
          auStack_a0[1] = *puVar54;
          if (bVar8 != 0) {
            uVar32 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar8;
            uVar48 = ((uStack_f8 << (uVar32 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) + uVar48;
          }
          if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar21 & 0xff)) {
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar24) {
                if (puStack_e8 != puVar17) {
                  uVar28 = (int)puStack_e8 - iVar29;
                  if (puVar17 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                    uVar28 = uStack_f0 >> 3;
                  }
                  puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar28);
                  uStack_f0 = uStack_f0 + uVar28 * -8;
                  uStack_f8 = *puStack_e8;
                }
              }
              else {
                puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3));
                uStack_f0 = uStack_f0 & 7;
                uStack_f8 = *puStack_e8;
              }
            }
            else {
              puStack_e8 = (ulong *)&UNK_00814388;
            }
          }
          if (bVar7 != 0) {
            uVar32 = (ulong)uStack_f0;
            uStack_f0 = uStack_f0 + bVar7;
            uVar40 = ((uStack_f8 << (uVar32 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar40;
          }
          if (iVar60 != 1) {
            iVar63 = uStack_f0 + *(byte *)((long)puVar2 + 3);
            uStack_d0 = (uStack_f8 >> ((ulong)(uint)-iVar63 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
                        (ulong)*puVar2;
            iVar63 = iVar63 + (uint)*(byte *)((long)puVar3 + 3);
            uStack_b0 = (uStack_f8 >> ((ulong)(uint)-iVar63 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
                        (ulong)*puVar3;
            uStack_f0 = iVar63 + (uint)*(byte *)((long)puVar4 + 3);
            uStack_c0 = (uStack_f8 >> ((ulong)-uStack_f0 & 0x3f) &
                        (ulong)*(uint *)(&UNK_00814304 +
                                        (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
                        (ulong)*puVar4;
            if (uStack_f0 < 0x41) {
              if (puStack_e8 < puVar24) {
                if (puStack_e8 == puVar17) goto LAB_00154d14;
                uVar28 = (int)puStack_e8 - iVar29;
                if (puVar17 <= (ulong *)((long)puStack_e8 - (ulong)(uStack_f0 >> 3))) {
                  uVar28 = uStack_f0 >> 3;
                }
                uStack_f0 = uStack_f0 + uVar28 * -8;
              }
              else {
                uVar28 = uStack_f0 >> 3;
                uStack_f0 = uStack_f0 & 7;
              }
              puStack_e8 = (ulong *)((long)puStack_e8 - (ulong)uVar28);
              uStack_f8 = *puStack_e8;
            }
            else {
              puStack_e8 = (ulong *)&UNK_00814388;
            }
          }
LAB_00154d14:
          puVar59 = (undefined8 *)((long)puVar14 + uVar40);
          puVar58 = (undefined8 *)((long)puVar59 - uVar23);
          Hint_Prefetch(puVar58,0,0,0);
          if ((puVar62 < (undefined8 *)((long)puStack_88 + uVar40)) ||
             (uVar32 = uVar40 + uVar48, puVar26 + -0x20 < (undefined1 *)((long)puVar14 + uVar32))) {
            uStack_80 = uVar40;
            uStack_78 = uVar48;
            uStack_70 = uVar23;
            uVar32 = func_0x00155c78(puVar14,puVar26,&uStack_80,&puStack_88,puVar62,puVar16,lVar56,
                                     uVar34);
          }
          else {
            uVar64 = *puStack_88;
            puVar14[1] = puStack_88[1];
            *puVar14 = uVar64;
            if (0x10 < uVar40) {
              uVar64 = puStack_88[2];
              puVar14[3] = puStack_88[3];
              puVar14[2] = uVar64;
              if (0x10 < uVar40 - 0x10) {
                puVar31 = puVar14 + 4;
                puVar27 = puStack_88 + 6;
                do {
                  uVar64 = puVar27[-2];
                  puVar31[1] = puVar27[-1];
                  *puVar31 = uVar64;
                  uVar64 = *puVar27;
                  puVar31[3] = puVar27[1];
                  puVar31[2] = uVar64;
                  puVar31 = puVar31 + 4;
                  puVar27 = puVar27 + 4;
                } while (puVar31 < puVar59);
              }
            }
            puStack_88 = (undefined8 *)((long)puStack_88 + uVar40);
            if ((ulong)((long)puVar59 - (long)puVar16) < uVar23) {
              if ((ulong)((long)puVar59 - lVar56) < uVar23) {
                return 0xffffffffffffffec;
              }
              lVar57 = (long)puVar58 - (long)puVar16;
              lVar47 = uVar34 + lVar57;
              if (lVar47 + uVar48 <= uVar34) {
                _memmove(puVar59,lVar47,uVar48);
                goto joined_r0x00154e58;
              }
              _memmove(puVar59,lVar47,-lVar57);
              puVar59 = (undefined8 *)((long)puVar59 - lVar57);
              uVar48 = lVar57 + uVar48;
              puVar58 = puVar16;
            }
            if (uVar23 < 0x10) {
              if (uVar23 < 8) {
                iVar63 = *(int *)(&UNK_008143b0 + uVar23 * 4);
                *(undefined1 *)puVar59 = *(undefined1 *)puVar58;
                *(undefined1 *)((long)puVar59 + 1) = *(undefined1 *)((long)puVar58 + 1);
                *(undefined1 *)((long)puVar59 + 2) = *(undefined1 *)((long)puVar58 + 2);
                *(undefined1 *)((long)puVar59 + 3) = *(undefined1 *)((long)puVar58 + 3);
                puVar6 = (undefined4 *)
                         ((long)puVar58 + (ulong)*(uint *)(&UNK_00814390 + uVar23 * 4));
                puVar58 = (undefined8 *)((long)puVar6 - (long)iVar63);
                *(undefined4 *)((long)puVar59 + 4) = *puVar6;
              }
              else {
                *puVar59 = *puVar58;
              }
              if (8 < uVar48) {
                puVar31 = puVar58 + 1;
                puVar27 = puVar59 + 1;
                if ((long)puVar27 - (long)puVar31 < 0x10) {
                  do {
                    puVar58 = puVar27 + 1;
                    *puVar27 = *puVar31;
                    puVar31 = puVar31 + 1;
                    puVar27 = puVar58;
                  } while (puVar58 < (undefined8 *)((long)puVar59 + uVar48));
                }
                else {
                  uVar64 = *puVar31;
                  puVar59[2] = puVar58[2];
                  *puVar27 = uVar64;
                  if (0x10 < uVar48 - 8) {
                    puVar31 = puVar59 + 3;
                    puVar58 = puVar58 + 5;
                    do {
                      uVar64 = puVar58[-2];
                      puVar31[1] = puVar58[-1];
                      *puVar31 = uVar64;
                      uVar64 = *puVar58;
                      puVar31[3] = puVar58[1];
                      puVar31[2] = uVar64;
                      puVar31 = puVar31 + 4;
                      puVar58 = puVar58 + 4;
                    } while (puVar31 < (undefined8 *)((long)puVar59 + uVar48));
                  }
                }
              }
            }
            else {
              uVar64 = *puVar58;
              puVar59[1] = puVar58[1];
              *puVar59 = uVar64;
              if (0x10 < uVar48) {
                puVar31 = puVar59 + 2;
                do {
                  uVar64 = puVar58[2];
                  puVar31[1] = puVar58[3];
                  *puVar31 = uVar64;
                  uVar64 = puVar58[4];
                  puVar31[3] = puVar58[5];
                  puVar31[2] = uVar64;
                  puVar31 = puVar31 + 4;
                  puVar58 = puVar58 + 4;
                } while (puVar31 < (undefined8 *)((long)puVar59 + uVar48));
              }
            }
          }
joined_r0x00154e58:
          if (0xffffffffffffff88 < uVar32) {
            return uVar32;
          }
          puVar14 = (undefined8 *)((long)puVar14 + uVar32);
          iVar60 = iVar60 + -1;
        } while (iVar60 != 0);
      }
code_r0x00155070:
      if (puStack_e8 != puVar17) {
        return 0xffffffffffffffec;
      }
      if (uStack_f0 != 0x40) {
        return 0xffffffffffffffec;
      }
      *(ulong *)((long)plVar13 + 0x683c) = CONCAT44((int)auStack_a0[1],(int)auStack_a0[0]);
      *(int *)((long)plVar13 + 0x6844) = (int)auStack_a0[2];
      iVar29 = (int)plVar13[0xed4];
      puVar16 = puStack_88;
      goto joined_r0x001550b0;
    }
    puVar38 = (undefined1 *)plVar13[0xed3];
    if (puVar38 < (undefined1 *)((long)puStack_88 + uVar40)) goto code_r0x001547d8;
code_r0x00154484:
    puVar58 = (undefined8 *)((long)puStack_88 + uVar40);
    if ((puVar62 < puVar58) ||
       (uVar32 = uVar40 + uVar48, puVar58 + -4 < (undefined8 *)((long)puVar14 + uVar32))) {
      uStack_80 = uVar40;
      uStack_78 = uVar48;
      uStack_70 = uVar23;
      uVar32 = func_0x00156308(puVar14,puVar26,puVar58 + -4,&uStack_80,&puStack_88,puVar62,puVar16,
                               lVar56,uVar34);
    }
    else {
      puVar31 = (undefined8 *)((long)puVar14 + uVar40);
      uVar64 = *puStack_88;
      puVar14[1] = puStack_88[1];
      *puVar14 = uVar64;
      if (0x10 < uVar40) {
        uVar64 = puStack_88[2];
        puVar14[3] = puStack_88[3];
        puVar14[2] = uVar64;
        if (0x10 < uVar40 - 0x10) {
          puVar27 = puVar14 + 4;
          puVar33 = puStack_88 + 6;
          do {
            uVar64 = puVar33[-2];
            puVar27[1] = puVar33[-1];
            *puVar27 = uVar64;
            uVar64 = *puVar33;
            puVar27[3] = puVar33[1];
            puVar27[2] = uVar64;
            puVar27 = puVar27 + 4;
            puVar33 = puVar33 + 4;
          } while (puVar27 < puVar31);
        }
      }
      puStack_88 = puVar58;
      puVar58 = (undefined8 *)((long)puVar31 - uVar23);
      if ((ulong)((long)puVar31 - (long)puVar16) < uVar23) {
        if ((ulong)((long)puVar31 - lVar56) < uVar23) {
          return 0xffffffffffffffec;
        }
        lVar57 = (long)((long)puVar31 - uVar23) - (long)puVar16;
        lVar47 = uVar34 + lVar57;
        if (lVar47 + uVar48 <= uVar34) {
          _memmove(puVar31,lVar47,uVar48);
          goto LAB_00154570;
        }
        _memmove(puVar31,lVar47,-lVar57);
        puVar31 = (undefined8 *)((long)puVar31 - lVar57);
        uVar48 = lVar57 + uVar48;
        puVar58 = puVar16;
      }
      if (uVar23 < 0x10) {
        if (uVar23 < 8) {
          iVar60 = *(int *)(&UNK_008143b0 + uVar23 * 4);
          *(undefined1 *)puVar31 = *(undefined1 *)puVar58;
          *(undefined1 *)((long)puVar31 + 1) = *(undefined1 *)((long)puVar58 + 1);
          *(undefined1 *)((long)puVar31 + 2) = *(undefined1 *)((long)puVar58 + 2);
          *(undefined1 *)((long)puVar31 + 3) = *(undefined1 *)((long)puVar58 + 3);
          puVar6 = (undefined4 *)((long)puVar58 + (ulong)*(uint *)(&UNK_00814390 + uVar23 * 4));
          puVar58 = (undefined8 *)((long)puVar6 - (long)iVar60);
          *(undefined4 *)((long)puVar31 + 4) = *puVar6;
        }
        else {
          *puVar31 = *puVar58;
        }
        if (8 < uVar48) {
          puVar27 = puVar58 + 1;
          puVar33 = puVar31 + 1;
          if ((long)puVar33 - (long)puVar27 < 0x10) {
            do {
              puVar58 = puVar33 + 1;
              *puVar33 = *puVar27;
              puVar27 = puVar27 + 1;
              puVar33 = puVar58;
            } while (puVar58 < (undefined8 *)((long)puVar31 + uVar48));
          }
          else {
            uVar64 = *puVar27;
            puVar31[2] = puVar58[2];
            *puVar33 = uVar64;
            if (0x10 < uVar48 - 8) {
              puVar27 = puVar31 + 3;
              puVar58 = puVar58 + 5;
              do {
                uVar64 = puVar58[-2];
                puVar27[1] = puVar58[-1];
                *puVar27 = uVar64;
                uVar64 = *puVar58;
                puVar27[3] = puVar58[1];
                puVar27[2] = uVar64;
                puVar27 = puVar27 + 4;
                puVar58 = puVar58 + 4;
              } while (puVar27 < (undefined8 *)((long)puVar31 + uVar48));
            }
          }
        }
      }
      else {
        uVar64 = *puVar58;
        puVar31[1] = puVar58[1];
        *puVar31 = uVar64;
        if (0x10 < uVar48) {
          puVar27 = puVar31 + 2;
          do {
            uVar64 = puVar58[2];
            puVar27[1] = puVar58[3];
            *puVar27 = uVar64;
            uVar64 = puVar58[4];
            puVar27[3] = puVar58[5];
            puVar27[2] = uVar64;
            puVar27 = puVar27 + 4;
            puVar58 = puVar58 + 4;
          } while (puVar27 < (undefined8 *)((long)puVar31 + uVar48));
        }
      }
    }
LAB_00154570:
    if (0xffffffffffffff88 < uVar32) {
      return uVar32;
    }
    puVar14 = (undefined8 *)((long)puVar14 + uVar32);
    puVar22 = (ulong *)(ulong)(iVar63 - 1U);
    if (iVar63 - 1U == 0) goto code_r0x00155070;
  } while( true );
}

