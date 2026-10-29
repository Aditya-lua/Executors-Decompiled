/* 7ff70c7d6f80 FUN_7ff70c7d6f80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7d6f80(undefined8 param_1,uint *param_2,undefined8 param_3,undefined8 param_4,
                     undefined8 *param_5,longlong param_6)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  undefined4 *puVar3;
  byte bVar4;
  code *pcVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ushort uVar9;
  longlong lVar10;
  undefined8 *puVar11;
  uint uVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  uint uVar15;
  ulonglong uVar16;
  uint uVar17;
  ulonglong uVar18;
  longlong lVar19;
  undefined8 *puVar20;
  ulonglong uVar21;
  ulonglong uVar22;
  uint *puVar23;
  uint *puVar24;
  undefined4 uVar25;
  undefined4 uVar26;
  undefined1 auVar27 [16];
  undefined4 in_XMM3_Dc;
  undefined4 in_XMM3_Dd;
  undefined1 auStack_1d8 [32];
  undefined8 *puStack_1b8;
  undefined8 *puStack_1b0;
  undefined8 uStack_1a8;
  longlong lStack_1a0;
  undefined8 uStack_198;
  undefined4 uStack_190;
  undefined8 uStack_188;
  undefined4 uStack_180;
  undefined4 uStack_17c;
  undefined4 uStack_178;
  undefined8 uStack_174;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined2 uStack_148;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined4 uStack_108;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined8 *puStack_d0;
  uint uStack_c8;
  undefined1 uStack_c4;
  undefined4 uStack_c3;
  undefined1 uStack_bf;
  undefined2 uStack_be;
  undefined2 uStack_bc;
  undefined2 uStack_ba;
  undefined2 uStack_b8;
  undefined4 uStack_b6;
  undefined2 uStack_b2;
  undefined2 uStack_b0;
  undefined4 uStack_ae;
  undefined4 uStack_aa;
  undefined4 uStack_a6;
  undefined4 uStack_a2;
  undefined2 uStack_9e;
  undefined4 uStack_9c;
  undefined8 uStack_98;
  undefined4 uStack_90;
  undefined8 uStack_8c;
  undefined8 uStack_84;
  undefined4 uStack_7c;
  undefined4 uStack_78;
  undefined4 uStack_74;
  undefined8 uStack_70;
  ulonglong uStack_60;
  
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_1d8;
  uVar15 = param_2[2];
  uVar12 = uVar15 >> 0x18 | (uVar15 & 0xff0000) >> 8 | (uVar15 & 0xff00) << 8 | uVar15 << 0x18;
  puStack_1b0 = (undefined8 *)FUN_7ff70c802100(uVar12);
  uVar15 = *param_2;
  if (((uVar15 >> 0x18 | (uVar15 & 0xff0000) >> 8 | (uVar15 & 0xff00) << 8 | uVar15 << 0x18) ==
       0x57bc0000) && (param_2[1] == 0)) {
    lVar10 = (ulonglong)*(byte *)((longlong)param_2 + 10) * 0x100 +
             (ulonglong)*(byte *)((longlong)param_2 + 9) * 0x10000 +
             (ulonglong)(byte)param_2[2] * 0x1000000;
    puVar1 = (undefined8 *)
             ((longlong)puStack_1b0 + (ulonglong)*(byte *)((longlong)param_2 + 0xb) + lVar10);
    puVar11 = (undefined8 *)
              ((longlong)puStack_1b0 + (ulonglong)*(byte *)((longlong)param_2 + 0xb) + lVar10 + 1);
    puVar24 = param_2 + 4;
    _DAT_7ff70cc1a398 = param_2;
    _DAT_7ff70cc1a3a0 = puVar1;
    _DAT_7ff70cc1a3a8 = puStack_1b0;
    _DAT_7ff70cc1a3b0 = puStack_1b0;
    puStack_1b8 = puVar11;
    do {
      bVar4 = (byte)*puVar24;
      uVar18 = (ulonglong)bVar4;
      uVar15 = (uint)bVar4;
      if (uVar18 < 0x20) {
        if (bVar4 < 0x18) {
          puVar14 = _DAT_7ff70cc1a3b0;
          if (bVar4 < 0x10) {
            if (7 < bVar4) {
              uVar15 = (uint)*(byte *)((longlong)puVar24 + 1);
              puVar13 = (undefined8 *)
                        ((longlong)_DAT_7ff70cc1a3b0 +
                        (ulonglong)(((uint)bVar4 * 0x100 + uVar15) - 0x7ff));
              puVar14 = puVar13;
              if ((puVar13 <= puVar1) &&
                 (puVar14 = puVar11, param_2 <= (uint *)((longlong)puVar24 + 2U))) {
                FUN_7ff70cb12b60();
                bVar4 = (byte)*puVar24;
                uVar15 = (uint)*(byte *)((longlong)puVar24 + 1);
                puVar14 = puVar13;
              }
              lVar10 = (ulonglong)uVar15 + (ulonglong)bVar4 * 0x100 + -0x7fd;
              _DAT_7ff70cc1a3b0 = puVar14;
joined_r0x7ff70c7d7d40:
              puVar23 = (uint *)((longlong)puVar24 + lVar10);
              if (puVar23 != puVar24) goto LAB_7ff70c7d72ad;
              break;
            }
            if (uVar15 == 4) {
              uVar9 = (ushort)puVar24[1] << 8 | (ushort)puVar24[1] >> 8;
              puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)uVar9 + 1);
              lVar10 = 6;
              if (puVar13 <= puVar1) {
                lVar19 = (ulonglong)*(byte *)((longlong)puVar24 + 1) * 0x10000;
                uVar18 = (ulonglong)*(byte *)((longlong)puVar24 + 2) * 0x100;
                bVar4 = *(byte *)((longlong)puVar24 + 3);
                puVar20 = (undefined8 *)
                          (~(lVar19 + (ulonglong)bVar4 | uVar18) + (longlong)_DAT_7ff70cc1a3b0);
                puVar13 = puVar11;
                uStack_1a8 = param_1;
                if (puStack_1b0 <= puVar20) {
                  uVar15 = uVar9 + 1;
                  if ((0x1e < uVar9) && (0x1f < ((uint)lVar19 | (uint)uVar18) + (uint)bVar4 + 1)) {
                    lStack_1a0 = (ulonglong)uVar9 + 1;
                    uVar17 = (uint)lStack_1a0 & 0xffffffe0;
                    uVar16 = (ulonglong)uVar17;
                    puVar20 = (undefined8 *)((longlong)puVar20 + uVar16);
                    uVar15 = uVar15 - uVar17;
                    puVar14 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar16);
                    lVar19 = bVar4 + uVar18 + lVar19;
                    uVar18 = 0;
                    do {
                      puVar3 = (undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18 + (-1 - lVar19));
                      uVar25 = puVar3[1];
                      uVar26 = puVar3[2];
                      uVar6 = puVar3[3];
                      puVar11 = (undefined8 *)
                                ((longlong)_DAT_7ff70cc1a3b0 + uVar18 + (0xf - lVar19));
                      uVar7 = *puVar11;
                      uVar8 = puVar11[1];
                      puVar2 = (undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                      *puVar2 = *puVar3;
                      puVar2[1] = uVar25;
                      puVar2[2] = uVar26;
                      puVar2[3] = uVar6;
                      puVar11 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18 + 0x10);
                      *puVar11 = uVar7;
                      puVar11[1] = uVar8;
                      uVar18 = uVar18 + 0x20;
                    } while (uVar16 != uVar18);
                    puVar13 = puVar14;
                    puVar11 = puStack_1b8;
                    if (uVar17 == (uint)lStack_1a0) goto LAB_7ff70c7d72a3;
                  }
                  uVar17 = uVar15;
                  if ((uVar15 & 7) != 0) {
                    lVar19 = 0;
                    do {
                      *(undefined1 *)((longlong)puVar14 + lVar19) =
                           *(undefined1 *)((longlong)puVar20 + lVar19);
                      lVar19 = lVar19 + 1;
                    } while ((uVar15 & 7) != (uint)lVar19);
                    puVar20 = (undefined8 *)((longlong)puVar20 + lVar19);
                    _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)puVar14 + lVar19);
                    puVar14 = _DAT_7ff70cc1a3b0;
                    uVar17 = uVar15 - (uint)lVar19;
                  }
                  puVar13 = _DAT_7ff70cc1a3b0;
                  if (6 < uVar15 - 1) {
                    lVar19 = 0;
                    do {
                      *(undefined1 *)((longlong)puVar14 + lVar19) =
                           *(undefined1 *)((longlong)puVar20 + lVar19);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 1) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 1);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 2) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 2);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 3) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 3);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 4) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 4);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 5) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 5);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 6) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 6);
                      *(undefined1 *)((longlong)puVar14 + lVar19 + 7) =
                           *(undefined1 *)((longlong)puVar20 + lVar19 + 7);
                      lVar19 = lVar19 + 8;
                    } while (uVar17 != (uint)lVar19);
                    goto LAB_7ff70c7d7cef;
                  }
                }
              }
            }
            else {
              if (uVar15 != 6) {
                if (uVar15 == 7) {
                  lVar10 = (ulonglong)*(byte *)((longlong)puVar24 + 1) * 0x100;
                  uVar18 = (ulonglong)*(byte *)((longlong)puVar24 + 2);
                  puVar14 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar10 + uVar18 + 1);
                  puVar13 = puVar14;
                  if ((puVar14 <= puVar1) &&
                     (puVar13 = puVar11, param_2 <= (uint *)((longlong)puVar24 + 3U))) {
                    FUN_7ff70cb12b60(_DAT_7ff70cc1a3b0,(uint *)((longlong)puVar24 + 3U),
                                     lVar10 + uVar18 + 1);
                    uVar18 = (ulonglong)*(byte *)((longlong)puVar24 + 2);
                    lVar10 = (ulonglong)*(byte *)((longlong)puVar24 + 1) << 8;
                    puVar13 = puVar14;
                  }
                  lVar10 = uVar18 + lVar10 + 4;
                  _DAT_7ff70cc1a3b0 = puVar13;
                  goto joined_r0x7ff70c7d7d40;
                }
                break;
              }
              bVar4 = (byte)puVar24[1];
              puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)bVar4 + 1);
              lVar10 = 5;
              if (puVar13 <= puVar1) {
                lVar19 = (ulonglong)*(byte *)((longlong)puVar24 + 1) * 0x10000;
                uVar18 = (ulonglong)*(byte *)((longlong)puVar24 + 2) << 8;
                puVar14 = (undefined8 *)
                          (~(lVar19 + (ulonglong)*(byte *)((longlong)puVar24 + 3) | uVar18) +
                          (longlong)_DAT_7ff70cc1a3b0);
                puVar13 = puVar11;
                if (puStack_1b0 <= puVar14) {
                  uVar16 = (ulonglong)bVar4 + 1;
                  uVar15 = (uint)uVar16;
                  if ((bVar4 < 0x1f) ||
                     (((uint)lVar19 | (uint)uVar18) + (uint)*(byte *)((longlong)puVar24 + 3) + 1 <
                      0x20)) {
                    uVar17 = uVar15;
                    if ((uVar16 & 7) != 0) {
LAB_7ff70c7d7a4e:
                      lVar19 = 0;
                      do {
                        *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                             *(undefined1 *)((longlong)puVar14 + lVar19);
                        lVar19 = lVar19 + 1;
                      } while ((uVar17 & 7) != (uint)lVar19);
                      puVar14 = (undefined8 *)((longlong)puVar14 + lVar19);
                      uVar15 = uVar17 - (uint)lVar19;
                      _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19);
                    }
                  }
                  else {
                    uVar17 = uVar15 & 0xffffffe0;
                    uVar18 = (ulonglong)uVar17;
                    uVar25 = *(undefined4 *)((longlong)puVar14 + 4);
                    uVar26 = *(undefined4 *)(puVar14 + 1);
                    uVar6 = *(undefined4 *)((longlong)puVar14 + 0xc);
                    uVar7 = puVar14[2];
                    uVar8 = puVar14[3];
                    *(undefined4 *)_DAT_7ff70cc1a3b0 = *(undefined4 *)puVar14;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 4) = uVar25;
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + 1) = uVar26;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc) = uVar6;
                    _DAT_7ff70cc1a3b0[2] = uVar7;
                    _DAT_7ff70cc1a3b0[3] = uVar8;
                    if (uVar18 != 0x20) {
                      uVar25 = *(undefined4 *)((longlong)puVar14 + 0x24);
                      uVar26 = *(undefined4 *)(puVar14 + 5);
                      uVar6 = *(undefined4 *)((longlong)puVar14 + 0x2c);
                      uVar7 = puVar14[6];
                      uVar8 = puVar14[7];
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 4) = *(undefined4 *)(puVar14 + 4);
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x24) = uVar25;
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 5) = uVar26;
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x2c) = uVar6;
                      _DAT_7ff70cc1a3b0[6] = uVar7;
                      _DAT_7ff70cc1a3b0[7] = uVar8;
                      if (uVar17 != 0x40) {
                        uVar25 = *(undefined4 *)((longlong)puVar14 + 0x44);
                        uVar26 = *(undefined4 *)(puVar14 + 9);
                        uVar6 = *(undefined4 *)((longlong)puVar14 + 0x4c);
                        uVar7 = puVar14[10];
                        uVar8 = puVar14[0xb];
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 8) = *(undefined4 *)(puVar14 + 8);
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x44) = uVar25;
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 9) = uVar26;
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x4c) = uVar6;
                        _DAT_7ff70cc1a3b0[10] = uVar7;
                        _DAT_7ff70cc1a3b0[0xb] = uVar8;
                        if (uVar17 != 0x60) {
                          uVar25 = *(undefined4 *)((longlong)puVar14 + 100);
                          uVar26 = *(undefined4 *)(puVar14 + 0xd);
                          uVar6 = *(undefined4 *)((longlong)puVar14 + 0x6c);
                          uVar7 = puVar14[0xe];
                          uVar8 = puVar14[0xf];
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xc) = *(undefined4 *)(puVar14 + 0xc);
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 100) = uVar25;
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xd) = uVar26;
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x6c) = uVar6;
                          _DAT_7ff70cc1a3b0[0xe] = uVar7;
                          _DAT_7ff70cc1a3b0[0xf] = uVar8;
                          if (uVar17 != 0x80) {
                            uVar25 = *(undefined4 *)((longlong)puVar14 + 0x84);
                            uVar26 = *(undefined4 *)(puVar14 + 0x11);
                            uVar6 = *(undefined4 *)((longlong)puVar14 + 0x8c);
                            uVar7 = puVar14[0x12];
                            uVar8 = puVar14[0x13];
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x10) =
                                 *(undefined4 *)(puVar14 + 0x10);
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x84) = uVar25;
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x11) = uVar26;
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x8c) = uVar6;
                            _DAT_7ff70cc1a3b0[0x12] = uVar7;
                            _DAT_7ff70cc1a3b0[0x13] = uVar8;
                            if (uVar17 != 0xa0) {
                              uVar25 = *(undefined4 *)((longlong)puVar14 + 0xa4);
                              uVar26 = *(undefined4 *)(puVar14 + 0x15);
                              uVar6 = *(undefined4 *)((longlong)puVar14 + 0xac);
                              uVar7 = puVar14[0x16];
                              uVar8 = puVar14[0x17];
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x14) =
                                   *(undefined4 *)(puVar14 + 0x14);
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xa4) = uVar25;
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x15) = uVar26;
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xac) = uVar6;
                              _DAT_7ff70cc1a3b0[0x16] = uVar7;
                              _DAT_7ff70cc1a3b0[0x17] = uVar8;
                              if (uVar17 != 0xc0) {
                                uVar25 = *(undefined4 *)((longlong)puVar14 + 0xc4);
                                uVar26 = *(undefined4 *)(puVar14 + 0x19);
                                uVar6 = *(undefined4 *)((longlong)puVar14 + 0xcc);
                                uVar7 = puVar14[0x1a];
                                uVar8 = puVar14[0x1b];
                                *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x18) =
                                     *(undefined4 *)(puVar14 + 0x18);
                                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc4) = uVar25;
                                *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x19) = uVar26;
                                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xcc) = uVar6;
                                _DAT_7ff70cc1a3b0[0x1a] = uVar7;
                                _DAT_7ff70cc1a3b0[0x1b] = uVar8;
                                if (uVar17 != 0xe0) {
                                  uVar25 = *(undefined4 *)((longlong)puVar14 + 0xe4);
                                  uVar26 = *(undefined4 *)(puVar14 + 0x1d);
                                  uVar6 = *(undefined4 *)((longlong)puVar14 + 0xec);
                                  uVar7 = puVar14[0x1e];
                                  uVar8 = puVar14[0x1f];
                                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1c) =
                                       *(undefined4 *)(puVar14 + 0x1c);
                                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xe4) = uVar25;
                                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1d) = uVar26;
                                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xec) = uVar6;
                                  _DAT_7ff70cc1a3b0[0x1e] = uVar7;
                                  _DAT_7ff70cc1a3b0[0x1f] = uVar8;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                    puVar13 = _DAT_7ff70cc1a3b0;
                    puVar11 = puStack_1b8;
                    if (uVar17 == uVar15) goto LAB_7ff70c7d72a3;
                    puVar14 = (undefined8 *)((longlong)puVar14 + uVar18);
                    uVar15 = uVar15 - uVar17;
                    uVar17 = uVar15;
                    if ((uVar15 & 7) != 0) goto LAB_7ff70c7d7a4e;
                  }
                  puVar13 = _DAT_7ff70cc1a3b0;
                  puVar11 = puStack_1b8;
                  if (6 < uVar17 - 1) {
                    lVar19 = 0;
                    do {
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                           *(undefined1 *)((longlong)puVar14 + lVar19);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 1) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 1);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 2) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 2);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 3) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 3);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 4) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 4);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 5) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 5);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 6) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 6);
                      *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 7) =
                           *(undefined1 *)((longlong)puVar14 + lVar19 + 7);
                      lVar19 = lVar19 + 8;
                    } while (uVar15 != (uint)lVar19);
                    goto LAB_7ff70c7d7c5f;
                  }
                }
              }
            }
          }
          else {
            uVar9 = *(ushort *)((longlong)puVar24 + 3) << 8 |
                    *(ushort *)((longlong)puVar24 + 3) >> 8;
            puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)uVar9 + 1);
            lVar10 = 5;
            if (puVar13 <= puVar1) {
              uVar15 = ((uint)*(byte *)((longlong)puVar24 + 1) * 0x100 +
                       ((uint)*(byte *)((longlong)puVar24 + 2) | uVar15 << 0x10)) - 0xfffff;
              puVar20 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 - (ulonglong)uVar15);
              puVar13 = puVar11;
              if (puStack_1b0 <= puVar20) {
                uVar17 = uVar9 + 1;
                if ((0x1e < uVar9) && (0x1f < uVar15)) {
                  lVar19 = -(ulonglong)uVar15;
                  uVar15 = uVar9 + 1 & 0xffffffe0;
                  uVar18 = (ulonglong)uVar15;
                  puVar20 = (undefined8 *)((longlong)puVar20 + uVar18);
                  uVar17 = uVar17 - uVar15;
                  puVar14 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                  _DAT_7ff70cc1a3b0 = _DAT_7ff70cc1a3b0 + 2;
                  do {
                    puVar2 = (undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + -0x10);
                    uVar25 = puVar2[1];
                    uVar26 = puVar2[2];
                    uVar6 = puVar2[3];
                    puVar11 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19);
                    uVar7 = *puVar11;
                    uVar8 = puVar11[1];
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + -2) = *puVar2;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 - 0xc) = uVar25;
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + -1) = uVar26;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 - 4) = uVar6;
                    *_DAT_7ff70cc1a3b0 = uVar7;
                    _DAT_7ff70cc1a3b0[1] = uVar8;
                    _DAT_7ff70cc1a3b0 = _DAT_7ff70cc1a3b0 + 4;
                    uVar18 = uVar18 - 0x20;
                  } while (uVar18 != 0);
                  puVar13 = puVar14;
                  puVar11 = puStack_1b8;
                  uStack_1a8 = param_1;
                  if (uVar15 == uVar9 + 1) goto LAB_7ff70c7d72a3;
                }
                uVar15 = uVar17;
                if ((uVar17 & 7) != 0) {
                  lVar19 = 0;
                  do {
                    *(undefined1 *)((longlong)puVar14 + lVar19) =
                         *(undefined1 *)((longlong)puVar20 + lVar19);
                    lVar19 = lVar19 + 1;
                  } while ((uVar17 & 7) != (uint)lVar19);
                  puVar20 = (undefined8 *)((longlong)puVar20 + lVar19);
                  _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)puVar14 + lVar19);
                  uVar15 = uVar17 - (uint)lVar19;
                  puVar14 = _DAT_7ff70cc1a3b0;
                  puVar11 = puStack_1b8;
                }
                puVar13 = _DAT_7ff70cc1a3b0;
                if (6 < uVar17 - 1) {
                  lVar19 = 0;
                  do {
                    *(undefined1 *)((longlong)puVar14 + lVar19) =
                         *(undefined1 *)((longlong)puVar20 + lVar19);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 1) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 1);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 2) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 2);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 3) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 3);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 4) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 4);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 5) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 5);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 6) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 6);
                    *(undefined1 *)((longlong)puVar14 + lVar19 + 7) =
                         *(undefined1 *)((longlong)puVar20 + lVar19 + 7);
                    lVar19 = lVar19 + 8;
                  } while (uVar15 != (uint)lVar19);
LAB_7ff70c7d7cef:
                  puVar13 = (undefined8 *)((longlong)puVar14 + lVar19);
                }
              }
            }
          }
        }
        else {
          bVar4 = *(byte *)((longlong)puVar24 + 3);
          puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)bVar4 + 1);
          lVar10 = 4;
          if (puVar13 <= puVar1) {
            uVar15 = ((uint)*(byte *)((longlong)puVar24 + 1) * 0x100 +
                     ((uint)*(byte *)((longlong)puVar24 + 2) | uVar15 << 0x10)) - 0x17ffff;
            puVar14 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 - (ulonglong)uVar15);
            puVar13 = puVar11;
            if (puStack_1b0 <= puVar14) {
              uVar18 = (ulonglong)bVar4 + 1;
              if ((0x1e < bVar4) && (0x1f < uVar15)) {
                uVar17 = (uint)uVar18;
                uVar15 = uVar17 & 0xffffffe0;
                uVar18 = (ulonglong)uVar15;
                uVar25 = *(undefined4 *)((longlong)puVar14 + 4);
                uVar26 = *(undefined4 *)(puVar14 + 1);
                uVar6 = *(undefined4 *)((longlong)puVar14 + 0xc);
                uVar7 = puVar14[2];
                uVar8 = puVar14[3];
                *(undefined4 *)_DAT_7ff70cc1a3b0 = *(undefined4 *)puVar14;
                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 4) = uVar25;
                *(undefined4 *)(_DAT_7ff70cc1a3b0 + 1) = uVar26;
                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc) = uVar6;
                _DAT_7ff70cc1a3b0[2] = uVar7;
                _DAT_7ff70cc1a3b0[3] = uVar8;
                if (uVar18 != 0x20) {
                  uVar25 = *(undefined4 *)((longlong)puVar14 + 0x24);
                  uVar26 = *(undefined4 *)(puVar14 + 5);
                  uVar6 = *(undefined4 *)((longlong)puVar14 + 0x2c);
                  uVar7 = puVar14[6];
                  uVar8 = puVar14[7];
                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 4) = *(undefined4 *)(puVar14 + 4);
                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x24) = uVar25;
                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 5) = uVar26;
                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x2c) = uVar6;
                  _DAT_7ff70cc1a3b0[6] = uVar7;
                  _DAT_7ff70cc1a3b0[7] = uVar8;
                  if (uVar15 != 0x40) {
                    uVar25 = *(undefined4 *)((longlong)puVar14 + 0x44);
                    uVar26 = *(undefined4 *)(puVar14 + 9);
                    uVar6 = *(undefined4 *)((longlong)puVar14 + 0x4c);
                    uVar7 = puVar14[10];
                    uVar8 = puVar14[0xb];
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + 8) = *(undefined4 *)(puVar14 + 8);
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x44) = uVar25;
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + 9) = uVar26;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x4c) = uVar6;
                    _DAT_7ff70cc1a3b0[10] = uVar7;
                    _DAT_7ff70cc1a3b0[0xb] = uVar8;
                    if (uVar15 != 0x60) {
                      uVar25 = *(undefined4 *)((longlong)puVar14 + 100);
                      uVar26 = *(undefined4 *)(puVar14 + 0xd);
                      uVar6 = *(undefined4 *)((longlong)puVar14 + 0x6c);
                      uVar7 = puVar14[0xe];
                      uVar8 = puVar14[0xf];
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xc) = *(undefined4 *)(puVar14 + 0xc);
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 100) = uVar25;
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xd) = uVar26;
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x6c) = uVar6;
                      _DAT_7ff70cc1a3b0[0xe] = uVar7;
                      _DAT_7ff70cc1a3b0[0xf] = uVar8;
                      if (uVar15 != 0x80) {
                        uVar25 = *(undefined4 *)((longlong)puVar14 + 0x84);
                        uVar26 = *(undefined4 *)(puVar14 + 0x11);
                        uVar6 = *(undefined4 *)((longlong)puVar14 + 0x8c);
                        uVar7 = puVar14[0x12];
                        uVar8 = puVar14[0x13];
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x10) = *(undefined4 *)(puVar14 + 0x10);
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x84) = uVar25;
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x11) = uVar26;
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x8c) = uVar6;
                        _DAT_7ff70cc1a3b0[0x12] = uVar7;
                        _DAT_7ff70cc1a3b0[0x13] = uVar8;
                        if (uVar15 != 0xa0) {
                          uVar25 = *(undefined4 *)((longlong)puVar14 + 0xa4);
                          uVar26 = *(undefined4 *)(puVar14 + 0x15);
                          uVar6 = *(undefined4 *)((longlong)puVar14 + 0xac);
                          uVar7 = puVar14[0x16];
                          uVar8 = puVar14[0x17];
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x14) =
                               *(undefined4 *)(puVar14 + 0x14);
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xa4) = uVar25;
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x15) = uVar26;
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xac) = uVar6;
                          _DAT_7ff70cc1a3b0[0x16] = uVar7;
                          _DAT_7ff70cc1a3b0[0x17] = uVar8;
                          if (uVar15 != 0xc0) {
                            uVar25 = *(undefined4 *)((longlong)puVar14 + 0xc4);
                            uVar26 = *(undefined4 *)(puVar14 + 0x19);
                            uVar6 = *(undefined4 *)((longlong)puVar14 + 0xcc);
                            uVar7 = puVar14[0x1a];
                            uVar8 = puVar14[0x1b];
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x18) =
                                 *(undefined4 *)(puVar14 + 0x18);
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc4) = uVar25;
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x19) = uVar26;
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xcc) = uVar6;
                            _DAT_7ff70cc1a3b0[0x1a] = uVar7;
                            _DAT_7ff70cc1a3b0[0x1b] = uVar8;
                            if (uVar15 != 0xe0) {
                              uVar25 = *(undefined4 *)((longlong)puVar14 + 0xe4);
                              uVar26 = *(undefined4 *)(puVar14 + 0x1d);
                              uVar6 = *(undefined4 *)((longlong)puVar14 + 0xec);
                              uVar7 = puVar14[0x1e];
                              uVar8 = puVar14[0x1f];
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1c) =
                                   *(undefined4 *)(puVar14 + 0x1c);
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xe4) = uVar25;
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1d) = uVar26;
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xec) = uVar6;
                              _DAT_7ff70cc1a3b0[0x1e] = uVar7;
                              _DAT_7ff70cc1a3b0[0x1f] = uVar8;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                puVar13 = _DAT_7ff70cc1a3b0;
                if (uVar15 == uVar17) goto LAB_7ff70c7d72a3;
                puVar14 = (undefined8 *)((longlong)puVar14 + uVar18);
                uVar18 = (ulonglong)(uVar17 - uVar15);
              }
              uVar17 = (uint)uVar18;
              uVar15 = uVar17;
              if ((uVar18 & 7) != 0) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  lVar19 = lVar19 + 1;
                } while ((uVar17 & 7) != (uint)lVar19);
                puVar14 = (undefined8 *)((longlong)puVar14 + lVar19);
                _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19);
                puVar11 = puStack_1b8;
                uVar15 = uVar17 - (uint)lVar19;
              }
              puVar13 = _DAT_7ff70cc1a3b0;
              if (6 < uVar17 - 1) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 1) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 1);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 2) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 2);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 3) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 3);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 4) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 4);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 5) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 5);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 6) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 6);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 7) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 7);
                  lVar19 = lVar19 + 8;
                } while (uVar15 != (uint)lVar19);
LAB_7ff70c7d7c5f:
                puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19);
              }
            }
          }
        }
LAB_7ff70c7d72a3:
        puVar23 = (uint *)((longlong)puVar24 + lVar10);
        _DAT_7ff70cc1a3b0 = puVar13;
      }
      else {
        if ((char)bVar4 < '\0') {
          uVar16 = (ulonglong)(bVar4 - 0x7f);
          lVar10 = 2;
          puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar16);
          if ((undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar16) <= puVar1) {
            uVar21 = (ulonglong)*(byte *)((longlong)puVar24 + 1);
            puVar14 = (undefined8 *)(~uVar21 + (longlong)_DAT_7ff70cc1a3b0);
            puVar13 = puVar11;
            if (puStack_1b0 <= puVar14) {
              puVar20 = _DAT_7ff70cc1a3b0;
              if (0x1e < *(byte *)((longlong)puVar24 + 1) && 0x1f < uVar18 - 0x7f) {
                uVar17 = (uint)(uVar18 - 0x7f);
                uVar15 = uVar17 & 0xe0;
                uVar18 = (ulonglong)uVar15;
                puVar14 = (undefined8 *)((longlong)puVar14 + uVar18);
                uVar16 = (ulonglong)((bVar4 - 0x7f) - uVar15);
                uVar22 = 0;
                do {
                  puVar3 = (undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + uVar22 + (-1 - uVar21));
                  uVar25 = puVar3[1];
                  uVar26 = puVar3[2];
                  uVar6 = puVar3[3];
                  puVar11 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar22 + (0xf - uVar21));
                  uVar7 = *puVar11;
                  uVar8 = puVar11[1];
                  puVar2 = (undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + uVar22);
                  *puVar2 = *puVar3;
                  puVar2[1] = uVar25;
                  puVar2[2] = uVar26;
                  puVar2[3] = uVar6;
                  puVar11 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar22 + 0x10);
                  *puVar11 = uVar7;
                  puVar11[1] = uVar8;
                  uVar22 = uVar22 + 0x20;
                } while (uVar18 != uVar22);
                puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                puVar11 = puStack_1b8;
                puVar20 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                if (uVar17 == uVar15) goto LAB_7ff70c7d72a3;
              }
              uVar17 = (uint)uVar16;
              uVar15 = uVar17;
              if ((uVar16 & 7) != 0) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)puVar20 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  lVar19 = lVar19 + 1;
                } while ((uVar17 & 7) != (uint)lVar19);
                puVar14 = (undefined8 *)((longlong)puVar14 + lVar19);
                puVar20 = (undefined8 *)((longlong)puVar20 + lVar19);
                uVar15 = uVar17 - (uint)lVar19;
                _DAT_7ff70cc1a3b0 = puVar20;
              }
              puVar13 = _DAT_7ff70cc1a3b0;
              puVar11 = puStack_1b8;
              if (6 < uVar17 - 1) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)puVar20 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 1) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 1);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 2) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 2);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 3) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 3);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 4) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 4);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 5) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 5);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 6) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 6);
                  *(undefined1 *)((longlong)puVar20 + lVar19 + 7) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 7);
                  lVar19 = lVar19 + 8;
                } while (uVar15 != (uint)lVar19);
                puVar13 = (undefined8 *)((longlong)puVar20 + lVar19);
              }
            }
          }
          goto LAB_7ff70c7d72a3;
        }
        if (0x3f < bVar4) {
          bVar4 = *(byte *)((longlong)puVar24 + 2);
          puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)bVar4 + 1);
          lVar10 = 3;
          if (puVar13 <= puVar1) {
            uVar15 = (uVar15 * 0x100 + (uint)*(byte *)((longlong)puVar24 + 1)) - 0x3fff;
            puVar14 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 - (ulonglong)uVar15);
            puVar13 = puVar11;
            if (puStack_1b0 <= puVar14) {
              uVar18 = (ulonglong)bVar4 + 1;
              if ((0x1e < bVar4) && (0x1f < uVar15)) {
                uVar17 = (uint)uVar18;
                uVar15 = uVar17 & 0xffffffe0;
                uVar18 = (ulonglong)uVar15;
                uVar25 = *(undefined4 *)((longlong)puVar14 + 4);
                uVar26 = *(undefined4 *)(puVar14 + 1);
                uVar6 = *(undefined4 *)((longlong)puVar14 + 0xc);
                uVar7 = puVar14[2];
                uVar8 = puVar14[3];
                *(undefined4 *)_DAT_7ff70cc1a3b0 = *(undefined4 *)puVar14;
                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 4) = uVar25;
                *(undefined4 *)(_DAT_7ff70cc1a3b0 + 1) = uVar26;
                *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc) = uVar6;
                _DAT_7ff70cc1a3b0[2] = uVar7;
                _DAT_7ff70cc1a3b0[3] = uVar8;
                if (uVar18 != 0x20) {
                  uVar25 = *(undefined4 *)((longlong)puVar14 + 0x24);
                  uVar26 = *(undefined4 *)(puVar14 + 5);
                  uVar6 = *(undefined4 *)((longlong)puVar14 + 0x2c);
                  uVar7 = puVar14[6];
                  uVar8 = puVar14[7];
                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 4) = *(undefined4 *)(puVar14 + 4);
                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x24) = uVar25;
                  *(undefined4 *)(_DAT_7ff70cc1a3b0 + 5) = uVar26;
                  *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x2c) = uVar6;
                  _DAT_7ff70cc1a3b0[6] = uVar7;
                  _DAT_7ff70cc1a3b0[7] = uVar8;
                  if (uVar15 != 0x40) {
                    uVar25 = *(undefined4 *)((longlong)puVar14 + 0x44);
                    uVar26 = *(undefined4 *)(puVar14 + 9);
                    uVar6 = *(undefined4 *)((longlong)puVar14 + 0x4c);
                    uVar7 = puVar14[10];
                    uVar8 = puVar14[0xb];
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + 8) = *(undefined4 *)(puVar14 + 8);
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x44) = uVar25;
                    *(undefined4 *)(_DAT_7ff70cc1a3b0 + 9) = uVar26;
                    *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x4c) = uVar6;
                    _DAT_7ff70cc1a3b0[10] = uVar7;
                    _DAT_7ff70cc1a3b0[0xb] = uVar8;
                    if (uVar15 != 0x60) {
                      uVar25 = *(undefined4 *)((longlong)puVar14 + 100);
                      uVar26 = *(undefined4 *)(puVar14 + 0xd);
                      uVar6 = *(undefined4 *)((longlong)puVar14 + 0x6c);
                      uVar7 = puVar14[0xe];
                      uVar8 = puVar14[0xf];
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xc) = *(undefined4 *)(puVar14 + 0xc);
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 100) = uVar25;
                      *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0xd) = uVar26;
                      *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x6c) = uVar6;
                      _DAT_7ff70cc1a3b0[0xe] = uVar7;
                      _DAT_7ff70cc1a3b0[0xf] = uVar8;
                      if (uVar15 != 0x80) {
                        uVar25 = *(undefined4 *)((longlong)puVar14 + 0x84);
                        uVar26 = *(undefined4 *)(puVar14 + 0x11);
                        uVar6 = *(undefined4 *)((longlong)puVar14 + 0x8c);
                        uVar7 = puVar14[0x12];
                        uVar8 = puVar14[0x13];
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x10) = *(undefined4 *)(puVar14 + 0x10);
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x84) = uVar25;
                        *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x11) = uVar26;
                        *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0x8c) = uVar6;
                        _DAT_7ff70cc1a3b0[0x12] = uVar7;
                        _DAT_7ff70cc1a3b0[0x13] = uVar8;
                        if (uVar15 != 0xa0) {
                          uVar25 = *(undefined4 *)((longlong)puVar14 + 0xa4);
                          uVar26 = *(undefined4 *)(puVar14 + 0x15);
                          uVar6 = *(undefined4 *)((longlong)puVar14 + 0xac);
                          uVar7 = puVar14[0x16];
                          uVar8 = puVar14[0x17];
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x14) =
                               *(undefined4 *)(puVar14 + 0x14);
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xa4) = uVar25;
                          *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x15) = uVar26;
                          *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xac) = uVar6;
                          _DAT_7ff70cc1a3b0[0x16] = uVar7;
                          _DAT_7ff70cc1a3b0[0x17] = uVar8;
                          if (uVar15 != 0xc0) {
                            uVar25 = *(undefined4 *)((longlong)puVar14 + 0xc4);
                            uVar26 = *(undefined4 *)(puVar14 + 0x19);
                            uVar6 = *(undefined4 *)((longlong)puVar14 + 0xcc);
                            uVar7 = puVar14[0x1a];
                            uVar8 = puVar14[0x1b];
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x18) =
                                 *(undefined4 *)(puVar14 + 0x18);
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xc4) = uVar25;
                            *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x19) = uVar26;
                            *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xcc) = uVar6;
                            _DAT_7ff70cc1a3b0[0x1a] = uVar7;
                            _DAT_7ff70cc1a3b0[0x1b] = uVar8;
                            if (uVar15 != 0xe0) {
                              uVar25 = *(undefined4 *)((longlong)puVar14 + 0xe4);
                              uVar26 = *(undefined4 *)(puVar14 + 0x1d);
                              uVar6 = *(undefined4 *)((longlong)puVar14 + 0xec);
                              uVar7 = puVar14[0x1e];
                              uVar8 = puVar14[0x1f];
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1c) =
                                   *(undefined4 *)(puVar14 + 0x1c);
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xe4) = uVar25;
                              *(undefined4 *)(_DAT_7ff70cc1a3b0 + 0x1d) = uVar26;
                              *(undefined4 *)((longlong)_DAT_7ff70cc1a3b0 + 0xec) = uVar6;
                              _DAT_7ff70cc1a3b0[0x1e] = uVar7;
                              _DAT_7ff70cc1a3b0[0x1f] = uVar8;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + uVar18);
                puVar13 = _DAT_7ff70cc1a3b0;
                if (uVar15 == uVar17) goto LAB_7ff70c7d72a3;
                puVar14 = (undefined8 *)((longlong)puVar14 + uVar18);
                uVar18 = (ulonglong)(uVar17 - uVar15);
              }
              uVar17 = (uint)uVar18;
              uVar15 = uVar17;
              if ((uVar18 & 7) != 0) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  lVar19 = lVar19 + 1;
                } while ((uVar17 & 7) != (uint)lVar19);
                puVar14 = (undefined8 *)((longlong)puVar14 + lVar19);
                _DAT_7ff70cc1a3b0 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19);
                puVar11 = puStack_1b8;
                uVar15 = uVar17 - (uint)lVar19;
              }
              puVar13 = _DAT_7ff70cc1a3b0;
              if (6 < uVar17 - 1) {
                lVar19 = 0;
                do {
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19) =
                       *(undefined1 *)((longlong)puVar14 + lVar19);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 1) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 1);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 2) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 2);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 3) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 3);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 4) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 4);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 5) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 5);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 6) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 6);
                  *(undefined1 *)((longlong)_DAT_7ff70cc1a3b0 + lVar19 + 7) =
                       *(undefined1 *)((longlong)puVar14 + lVar19 + 7);
                  lVar19 = lVar19 + 8;
                } while (uVar15 != (uint)lVar19);
                goto LAB_7ff70c7d7c5f;
              }
            }
          }
          goto LAB_7ff70c7d72a3;
        }
        puVar13 = (undefined8 *)((longlong)_DAT_7ff70cc1a3b0 + (ulonglong)(bVar4 - 0x1f));
        puVar14 = puVar13;
        if ((puVar13 <= puVar1) && (puVar14 = puVar11, param_2 <= (uint *)((longlong)puVar24 + 1U)))
        {
          FUN_7ff70cb12b60();
          uVar18 = (ulonglong)(byte)*puVar24;
          puVar14 = puVar13;
        }
        puVar23 = (uint *)((longlong)puVar24 + (uVar18 - 0x1e));
        _DAT_7ff70cc1a3b0 = puVar14;
        if (puVar23 == puVar24) break;
      }
LAB_7ff70c7d72ad:
      puVar24 = puVar23;
    } while (_DAT_7ff70cc1a3b0 <= puVar1);
  }
  if (param_5 == (undefined8 *)0x0) {
    uStack_118 = 0;
    uStack_110 = 0;
    uStack_128 = 0;
    uStack_120 = 0;
    uStack_138 = 0;
    uStack_130 = 0;
    uStack_108 = 0;
    uStack_168 = 0;
    uStack_160 = 0;
    uStack_158 = 0;
    uStack_150 = 0;
    uStack_148 = 0;
    uStack_198 = 0;
    uStack_190 = 0;
    uStack_188 = 0;
    uStack_180 = 0;
    uStack_17c = 0;
    uStack_178 = 0;
    uStack_174 = 0;
    uStack_c3 = 0;
    uStack_bf = 0;
    uVar25 = _DAT_7ff70cb1bb60;
    uVar26 = _UNK_7ff70cb1bb64;
    uStack_9c = _DAT_7ff70cb1c5d8;
  }
  else {
    uStack_108 = *(undefined4 *)(param_5 + 6);
    uStack_138 = *param_5;
    uStack_130 = param_5[1];
    uStack_128 = param_5[2];
    uStack_120 = param_5[3];
    uStack_118 = param_5[4];
    uStack_110 = param_5[5];
    uStack_c3 = *(undefined4 *)((longlong)param_5 + 0x35);
    uStack_bf = *(undefined1 *)((longlong)param_5 + 0x39);
    uStack_148 = *(undefined2 *)((longlong)param_5 + 0x5a);
    uStack_158 = *(undefined8 *)((longlong)param_5 + 0x4a);
    uStack_150 = *(undefined8 *)((longlong)param_5 + 0x52);
    uStack_168 = *(undefined8 *)((longlong)param_5 + 0x3a);
    uStack_160 = *(undefined8 *)((longlong)param_5 + 0x42);
    uStack_190 = *(undefined4 *)(param_5 + 0xd);
    uStack_198 = param_5[0xc];
    uStack_174 = param_5[0x11];
    uStack_178 = (undefined4)((ulonglong)param_5[0x10] >> 0x20);
    uStack_188 = *(undefined8 *)((longlong)param_5 + 0x74);
    uStack_180 = (undefined4)*(undefined8 *)((longlong)param_5 + 0x7c);
    uStack_17c = (undefined4)((ulonglong)*(undefined8 *)((longlong)param_5 + 0x7c) >> 0x20);
    uVar25 = (int)*(undefined8 *)((longlong)param_5 + 0x6c);
    uVar26 = (int)((ulonglong)*(undefined8 *)((longlong)param_5 + 0x6c) >> 0x20);
    uStack_9c = *(undefined4 *)((longlong)param_5 + 0x5c);
  }
  uStack_d8 = uStack_118;
  uStack_e8 = uStack_128;
  uStack_e0 = uStack_120;
  uStack_f8 = uStack_138;
  uStack_f0 = uStack_130;
  uStack_c4 = 1;
  uStack_be = (undefined2)uStack_168;
  uStack_b8 = (undefined2)((ulonglong)uStack_168 >> 0x30);
  uStack_b6 = (undefined4)uStack_160;
  uStack_b2 = (undefined2)((ulonglong)uStack_160 >> 0x20);
  uStack_b0 = (undefined2)((ulonglong)uStack_160 >> 0x30);
  uStack_ae = (undefined4)uStack_158;
  uStack_aa = uStack_158._4_4_;
  uStack_a6 = (undefined4)uStack_150;
  uStack_a2 = uStack_150._4_4_;
  uStack_9e = uStack_148;
  uStack_98 = uStack_198;
  uStack_90 = uStack_190;
  uStack_8c = CONCAT44(uVar26,uVar25);
  uStack_84 = uStack_188;
  uStack_7c = uStack_180;
  uStack_78 = uStack_17c;
  uStack_74 = uStack_178;
  uStack_70 = uStack_174;
  puStack_d0 = puStack_1b0;
  auVar27._8_4_ = in_XMM3_Dc;
  auVar27._0_8_ = param_4;
  auVar27._12_4_ = in_XMM3_Dd;
  auVar27 = blendvps(ZEXT416((uint)((ulonglong)uStack_168 >> 0x10)),auVar27,
                     ZEXT416(-(uint)(0.0 < (float)param_4)));
  uStack_bc = auVar27._0_2_;
  uStack_ba = auVar27._2_2_;
  if (param_6 != 0) {
    uStack_b8 = (undefined2)param_6;
    uStack_b6 = (undefined4)((ulonglong)param_6 >> 0x10);
    uStack_b2 = (undefined2)((ulonglong)param_6 >> 0x30);
  }
  uStack_c8 = uVar12;
  FUN_7ff70c7cb410(param_1,&uStack_f8);
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_1d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_1d8);
  pcVar5 = (code *)swi(3);
  (*pcVar5)();
  return;
}


