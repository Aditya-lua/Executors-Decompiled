
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000f83f4(undefined8 param_1,undefined8 param_2,ulong param_3,long param_4,long param_5)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined2 *puVar5;
  int iVar6;
  byte bVar7;
  uint uVar8;
  uint uVar9;
  bool bVar10;
  undefined8 uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  long lVar14;
  uint *extraout_x1;
  undefined2 uVar15;
  int iVar16;
  long lVar17;
  undefined8 *puVar18;
  uint uVar19;
  ulong uVar20;
  undefined8 *puVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  undefined1 *puVar25;
  uint *puVar26;
  long unaff_x29;
  float extraout_s0;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  unkbyte10 Var34;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined6 uStack_168;
  undefined2 uStack_162;
  undefined6 uStack_160;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  long lStack_138;
  undefined4 uStack_130;
  undefined7 uStack_128;
  float fStack_121;
  undefined8 *puStack_118;
  uint uStack_110;
  undefined1 uStack_10c;
  undefined7 uStack_10b;
  float fStack_104;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  long lStack_e0;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined2 uStack_c0;
  undefined8 uStack_be;
  undefined8 uStack_b6;
  undefined8 uStack_ae;
  undefined8 uStack_a6;
  undefined8 uStack_9e;
  undefined6 uStack_96;
  undefined2 uStack_90;
  undefined6 uStack_8e;
  long lStack_88;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
    return;
  }
  uVar11 = ___stack_chk_fail();
  lStack_88 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar8 = (extraout_x1[2] & 0xff00ff00) >> 8 | (extraout_x1[2] & 0xff00ff) << 8;
  uVar8 = uVar8 >> 0x10 | uVar8 << 0x10;
  puVar12 = (undefined8 *)func_0x000b810c(uVar8);
  uVar15 = (undefined2)param_3;
  uVar19 = (*extraout_x1 & 0xff00ff00) >> 8 | (*extraout_x1 & 0xff00ff) << 8;
  if (((uVar19 >> 0x10 | uVar19 << 0x10) == 0x57bc0000) &&
     (uVar19 = (extraout_x1[1] & 0xff00ff00) >> 8 | (extraout_x1[1] & 0xff00ff) << 8,
     uVar19 >> 0x10 == 0 && (uVar19 & 0xffff) == 0)) {
    uVar19 = (extraout_x1[2] & 0xff00ff00) >> 8 | (extraout_x1[2] & 0xff00ff) << 8;
    puVar3 = (undefined8 *)((long)puVar12 + (ulong)(uVar19 >> 0x10 | uVar19 << 0x10));
    puVar26 = extraout_x1 + 4;
    puVar2 = (undefined8 *)((long)puVar3 + 1);
    puVar13 = puVar12;
    puRam0000000000a39088 = extraout_x1;
    puRam0000000000a39090 = puVar3;
    puRam0000000000a39098 = puVar12;
    puRam0000000000a390a0 = puVar12;
    do {
      uVar15 = (undefined2)param_3;
      bVar7 = (byte)*puVar26;
      uVar20 = (ulong)bVar7;
      uVar19 = (uint)bVar7;
      if (bVar7 < 0x20) {
        if (bVar7 < 0x18) {
          if (0xf < uVar19) {
            uVar9 = (uint)(*(ushort *)((long)puVar26 + 3) >> 8) |
                    (*(ushort *)((long)puVar26 + 3) & 0xff00ff) << 8;
            uVar1 = uVar9 + 1;
            uVar20 = (ulong)uVar1;
            puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar20);
            if ((undefined8 *)((long)puVar13 + uVar20) <= puVar3) {
              uVar19 = ((uint)*(byte *)((long)puVar26 + 2) | uVar19 << 0x10 |
                       (uint)*(byte *)((long)puVar26 + 1) << 8) - 0xfffff;
              puVar21 = (undefined8 *)((long)puVar13 - (ulong)uVar19);
              puRam0000000000a390a0 = puVar2;
              if (puVar12 <= puVar21) {
                if ((0x3e < uVar9) && (0x3f < uVar19)) {
                  uVar23 = uVar20 & 0x1ffc0;
                  puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar23);
                  puVar13 = puVar13 + 4;
                  uVar22 = uVar23;
                  do {
                    puVar18 = (undefined8 *)((long)puVar13 - (ulong)uVar19);
                    uVar27 = puVar18[-4];
                    uVar29 = puVar18[-1];
                    uVar28 = puVar18[-2];
                    uVar31 = puVar18[1];
                    uVar30 = *puVar18;
                    uVar33 = puVar18[3];
                    uVar32 = puVar18[2];
                    puVar13[-3] = puVar18[-3];
                    puVar13[-4] = uVar27;
                    puVar13[-1] = uVar29;
                    puVar13[-2] = uVar28;
                    puVar13[1] = uVar31;
                    *puVar13 = uVar30;
                    puVar13[3] = uVar33;
                    puVar13[2] = uVar32;
                    uVar22 = uVar22 - 0x40;
                    puVar13 = puVar13 + 8;
                  } while (uVar22 != 0);
                  bVar10 = uVar23 == uVar20;
                  puVar21 = (undefined8 *)((long)puVar21 + uVar23);
                  uVar20 = (ulong)(uVar1 - (int)uVar23);
                  puVar13 = puRam0000000000a390a0;
                  if (bVar10) goto code_r0x000f8c04;
                }
                do {
                  *(undefined1 *)puVar13 = *(undefined1 *)puVar21;
                  uVar19 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar19;
                  puVar21 = (undefined8 *)((long)puVar21 + 1);
                  puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + 1U);
                  puVar13 = (undefined8 *)((long)puVar13 + 1U);
                } while (uVar19 != 0);
              }
            }
code_r0x000f8c04:
            puVar26 = (uint *)((long)puVar26 + 5);
            goto code_r0x000f86a8;
          }
          if (7 < uVar19) {
            uVar19 = (uint)CONCAT11(bVar7,*(undefined1 *)((long)puVar26 + 1));
            param_3 = (ulong)(uVar19 - 0x7ff);
            puVar13 = (undefined8 *)((long)puVar13 + param_3);
            if (puVar3 < puVar13) {
code_r0x000f8a08:
              puVar21 = puVar13;
            }
            else {
              puVar21 = puVar2;
              if (extraout_x1 <= (uint *)((long)puVar26 + 2U)) {
                _memcpy();
                uVar19 = (uint)(ushort)((ushort)*puVar26 >> 8) | ((ushort)*puVar26 & 0xff00ff) << 8;
                goto code_r0x000f8a08;
              }
            }
            uVar15 = (undefined2)param_3;
            lVar17 = (long)(int)(uVar19 - 0x7fd);
            puRam0000000000a390a0 = puVar21;
            if (lVar17 != 0) goto code_r0x000f8a20;
            break;
          }
          if (uVar19 == 4) {
            uVar1 = (uint)(ushort)((ushort)puVar26[1] >> 8) | ((ushort)puVar26[1] & 0xff00ff) << 8;
            uVar19 = uVar1 + 1;
            uVar20 = (ulong)uVar19;
            puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar20);
            if ((undefined8 *)((long)puVar13 + uVar20) <= puVar3) {
              uVar22 = (ulong)*(byte *)((long)puVar26 + 3) |
                       (ulong)*(byte *)((long)puVar26 + 1) << 0x10 |
                       (ulong)*(byte *)((long)puVar26 + 2) << 8;
              puVar21 = (undefined8 *)((long)puVar13 + ~uVar22);
              puRam0000000000a390a0 = puVar2;
              if (puVar12 <= puVar21) {
                if ((0x3e < uVar1) && (0x3e < uVar22)) {
                  uVar24 = uVar20 & 0x1ffc0;
                  puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar24);
                  puVar25 = (undefined1 *)((long)puVar13 + 0x1f);
                  uVar23 = uVar24;
                  do {
                    puVar13 = (undefined8 *)(puVar25 + -uVar22);
                    uVar27 = puVar13[-4];
                    uVar29 = puVar13[-1];
                    uVar28 = puVar13[-2];
                    uVar31 = puVar13[1];
                    uVar30 = *puVar13;
                    uVar33 = puVar13[3];
                    uVar32 = puVar13[2];
                    *(undefined8 *)(puVar25 + -0x17) = puVar13[-3];
                    *(undefined8 *)(puVar25 + -0x1f) = uVar27;
                    *(undefined8 *)(puVar25 + -7) = uVar29;
                    *(undefined8 *)(puVar25 + -0xf) = uVar28;
                    *(undefined8 *)(puVar25 + 9) = uVar31;
                    *(undefined8 *)(puVar25 + 1) = uVar30;
                    *(undefined8 *)(puVar25 + 0x19) = uVar33;
                    *(undefined8 *)(puVar25 + 0x11) = uVar32;
                    puVar25 = puVar25 + 0x40;
                    uVar23 = uVar23 - 0x40;
                  } while (uVar23 != 0);
                  bVar10 = uVar24 == uVar20;
                  puVar21 = (undefined8 *)((long)puVar21 + uVar24);
                  puVar13 = puRam0000000000a390a0;
                  uVar20 = (ulong)(uVar19 - (int)uVar24);
                  if (bVar10) goto code_r0x000f8c78;
                }
                do {
                  puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + 1);
                  *(undefined1 *)puVar13 = *(undefined1 *)puVar21;
                  uVar19 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar19;
                  puVar21 = (undefined8 *)((long)puVar21 + 1);
                  puVar13 = puRam0000000000a390a0;
                } while (uVar19 != 0);
              }
            }
code_r0x000f8c78:
            puVar26 = (uint *)((long)puVar26 + 6);
          }
          else {
            if (uVar19 == 6) {
              uVar20 = (ulong)(byte)puVar26[1] + 1;
              puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar20);
              if ((undefined8 *)((long)puVar13 + uVar20) <= puVar3) {
                uVar22 = (ulong)*(byte *)((long)puVar26 + 3) |
                         (ulong)*(byte *)((long)puVar26 + 1) << 0x10 |
                         (ulong)*(byte *)((long)puVar26 + 2) << 8;
                puVar21 = (undefined8 *)((long)puVar13 + ~uVar22);
                puRam0000000000a390a0 = puVar2;
                if (puVar12 <= puVar21) {
                  if ((0x3e < (byte)puVar26[1]) && (0x3e < uVar22)) {
                    uVar22 = uVar20 & 0x1c0;
                    uVar27 = *puVar21;
                    uVar29 = puVar21[3];
                    uVar28 = puVar21[2];
                    uVar31 = puVar21[5];
                    uVar30 = puVar21[4];
                    uVar33 = puVar21[7];
                    uVar32 = puVar21[6];
                    puVar13[1] = puVar21[1];
                    *puVar13 = uVar27;
                    puVar13[3] = uVar29;
                    puVar13[2] = uVar28;
                    puVar13[5] = uVar31;
                    puVar13[4] = uVar30;
                    puVar13[7] = uVar33;
                    puVar13[6] = uVar32;
                    if (uVar22 != 0x40) {
                      uVar27 = puVar21[8];
                      uVar29 = puVar21[0xb];
                      uVar28 = puVar21[10];
                      uVar31 = puVar21[0xd];
                      uVar30 = puVar21[0xc];
                      uVar33 = puVar21[0xf];
                      uVar32 = puVar21[0xe];
                      puVar13[9] = puVar21[9];
                      puVar13[8] = uVar27;
                      puVar13[0xb] = uVar29;
                      puVar13[10] = uVar28;
                      puVar13[0xd] = uVar31;
                      puVar13[0xc] = uVar30;
                      puVar13[0xf] = uVar33;
                      puVar13[0xe] = uVar32;
                      if (uVar22 != 0x80) {
                        uVar27 = puVar21[0x10];
                        uVar29 = puVar21[0x13];
                        uVar28 = puVar21[0x12];
                        uVar31 = puVar21[0x15];
                        uVar30 = puVar21[0x14];
                        uVar33 = puVar21[0x17];
                        uVar32 = puVar21[0x16];
                        puVar13[0x11] = puVar21[0x11];
                        puVar13[0x10] = uVar27;
                        puVar13[0x13] = uVar29;
                        puVar13[0x12] = uVar28;
                        puVar13[0x15] = uVar31;
                        puVar13[0x14] = uVar30;
                        puVar13[0x17] = uVar33;
                        puVar13[0x16] = uVar32;
                        if (uVar22 != 0xc0) {
                          uVar27 = puVar21[0x18];
                          uVar29 = puVar21[0x1b];
                          uVar28 = puVar21[0x1a];
                          uVar31 = puVar21[0x1d];
                          uVar30 = puVar21[0x1c];
                          uVar33 = puVar21[0x1f];
                          uVar32 = puVar21[0x1e];
                          puVar13[0x19] = puVar21[0x19];
                          puVar13[0x18] = uVar27;
                          puVar13[0x1b] = uVar29;
                          puVar13[0x1a] = uVar28;
                          puVar13[0x1d] = uVar31;
                          puVar13[0x1c] = uVar30;
                          puVar13[0x1f] = uVar33;
                          puVar13[0x1e] = uVar32;
                        }
                      }
                    }
                    puVar13 = (undefined8 *)((long)puVar13 + uVar22);
                    if (uVar22 == uVar20) {
                      puRam0000000000a390a0 = puVar13;
                      goto code_r0x000f8c04;
                    }
                    uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
                    puVar21 = (undefined8 *)((long)puVar21 + uVar22);
                  }
                  do {
                    puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + 1);
                    *(undefined1 *)puVar13 = *(undefined1 *)puVar21;
                    uVar19 = (int)uVar20 - 1;
                    uVar20 = (ulong)uVar19;
                    puVar21 = (undefined8 *)((long)puVar21 + 1);
                    puVar13 = puRam0000000000a390a0;
                  } while (uVar19 != 0);
                }
              }
              goto code_r0x000f8c04;
            }
            if (uVar19 != 7) break;
            uVar20 = (ulong)((uint)(*(ushort *)((long)puVar26 + 1) >> 8) |
                            (*(ushort *)((long)puVar26 + 1) & 0xff00ff) << 8);
            param_3 = uVar20 + 1;
            puVar13 = (undefined8 *)((long)puVar13 + param_3);
            if (puVar3 < puVar13) {
code_r0x000f8a7c:
              puVar21 = puVar13;
            }
            else {
              puVar21 = puVar2;
              if (extraout_x1 <= (uint *)((long)puVar26 + 3U)) {
                _memcpy();
                uVar20 = (ulong)((uint)(*(ushort *)((long)puVar26 + 1) >> 8) |
                                (*(ushort *)((long)puVar26 + 1) & 0xff00ff) << 8);
                goto code_r0x000f8a7c;
              }
            }
            puVar26 = (uint *)((long)puVar26 + uVar20 + 4);
            puRam0000000000a390a0 = puVar21;
          }
          puVar13 = puRam0000000000a390a0;
          goto code_r0x000f86ac;
        }
        uVar20 = (ulong)*(byte *)((long)puVar26 + 3) + 1;
        puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar20);
        if ((undefined8 *)((long)puVar13 + uVar20) <= puVar3) {
          uVar19 = ((uint)*(byte *)((long)puVar26 + 2) | uVar19 << 0x10 |
                   (uint)*(byte *)((long)puVar26 + 1) << 8) - 0x17ffff;
          puVar21 = (undefined8 *)((long)puVar13 - (ulong)uVar19);
          puRam0000000000a390a0 = puVar2;
          if (puVar12 <= puVar21) {
            if ((0x3e < *(byte *)((long)puVar26 + 3)) && (0x3f < uVar19)) {
              uVar22 = uVar20 & 0x1c0;
              uVar27 = *puVar21;
              uVar29 = puVar21[3];
              uVar28 = puVar21[2];
              uVar31 = puVar21[5];
              uVar30 = puVar21[4];
              uVar33 = puVar21[7];
              uVar32 = puVar21[6];
              puVar13[1] = puVar21[1];
              *puVar13 = uVar27;
              puVar13[3] = uVar29;
              puVar13[2] = uVar28;
              puVar13[5] = uVar31;
              puVar13[4] = uVar30;
              puVar13[7] = uVar33;
              puVar13[6] = uVar32;
              if (uVar22 != 0x40) {
                uVar27 = puVar21[8];
                uVar29 = puVar21[0xb];
                uVar28 = puVar21[10];
                uVar31 = puVar21[0xd];
                uVar30 = puVar21[0xc];
                uVar33 = puVar21[0xf];
                uVar32 = puVar21[0xe];
                puVar13[9] = puVar21[9];
                puVar13[8] = uVar27;
                puVar13[0xb] = uVar29;
                puVar13[10] = uVar28;
                puVar13[0xd] = uVar31;
                puVar13[0xc] = uVar30;
                puVar13[0xf] = uVar33;
                puVar13[0xe] = uVar32;
                if (uVar22 != 0x80) {
                  uVar27 = puVar21[0x10];
                  uVar29 = puVar21[0x13];
                  uVar28 = puVar21[0x12];
                  uVar31 = puVar21[0x15];
                  uVar30 = puVar21[0x14];
                  uVar33 = puVar21[0x17];
                  uVar32 = puVar21[0x16];
                  puVar13[0x11] = puVar21[0x11];
                  puVar13[0x10] = uVar27;
                  puVar13[0x13] = uVar29;
                  puVar13[0x12] = uVar28;
                  puVar13[0x15] = uVar31;
                  puVar13[0x14] = uVar30;
                  puVar13[0x17] = uVar33;
                  puVar13[0x16] = uVar32;
                  if (uVar22 != 0xc0) {
                    uVar27 = puVar21[0x18];
                    uVar29 = puVar21[0x1b];
                    uVar28 = puVar21[0x1a];
                    uVar31 = puVar21[0x1d];
                    uVar30 = puVar21[0x1c];
                    uVar33 = puVar21[0x1f];
                    uVar32 = puVar21[0x1e];
                    puVar13[0x19] = puVar21[0x19];
                    puVar13[0x18] = uVar27;
                    puVar13[0x1b] = uVar29;
                    puVar13[0x1a] = uVar28;
                    puVar13[0x1d] = uVar31;
                    puVar13[0x1c] = uVar30;
                    puVar13[0x1f] = uVar33;
                    puVar13[0x1e] = uVar32;
                  }
                }
              }
              puVar13 = (undefined8 *)((long)puVar13 + uVar22);
              if (uVar22 == uVar20) {
                puRam0000000000a390a0 = puVar13;
                goto code_r0x000f86a0;
              }
              uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
              puVar21 = (undefined8 *)((long)puVar21 + uVar22);
            }
            do {
              puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + 1);
              *(undefined1 *)puVar13 = *(undefined1 *)puVar21;
              uVar19 = (int)uVar20 - 1;
              uVar20 = (ulong)uVar19;
              puVar21 = (undefined8 *)((long)puVar21 + 1);
              puVar13 = puRam0000000000a390a0;
            } while (uVar19 != 0);
          }
        }
code_r0x000f86a0:
        puVar26 = puVar26 + 1;
code_r0x000f86a8:
        puVar13 = puRam0000000000a390a0;
      }
      else {
        uVar19 = (uint)bVar7;
        if ((char)bVar7 < '\0') {
          uVar19 = uVar19 - 0x7f;
          uVar20 = (ulong)uVar19;
          puVar21 = (undefined8 *)((long)puVar13 + uVar20);
          if (puVar3 < (undefined8 *)((long)puVar13 + uVar20)) {
LAB_000f8c28:
            puVar13 = puVar21;
            puRam0000000000a390a0 = puVar13;
          }
          else {
            bVar7 = *(byte *)((long)puVar26 + 1);
            puVar18 = (undefined8 *)(~(ulong)bVar7 + (long)puVar13);
            puVar21 = puVar2;
            if (puVar18 < puVar12) goto LAB_000f8c28;
            if (uVar19 != 0) {
              if ((0x3f < uVar19) && (0x3e < bVar7)) {
                uVar23 = uVar20 & 0xffffffc0;
                puVar21 = (undefined8 *)((long)puVar13 + uVar23);
                uVar22 = uVar23;
                do {
                  puVar4 = (undefined8 *)((long)puVar13 + (0x2f - (ulong)bVar7));
                  uVar27 = puVar4[-6];
                  uVar29 = puVar4[-3];
                  uVar28 = puVar4[-4];
                  uVar31 = puVar4[-1];
                  uVar30 = puVar4[-2];
                  uVar33 = puVar4[1];
                  uVar32 = *puVar4;
                  puVar13[1] = puVar4[-5];
                  *puVar13 = uVar27;
                  puVar13[3] = uVar29;
                  puVar13[2] = uVar28;
                  puVar13[5] = uVar31;
                  puVar13[4] = uVar30;
                  puVar13[7] = uVar33;
                  puVar13[6] = uVar32;
                  puVar13 = puVar13 + 8;
                  uVar22 = uVar22 - 0x40;
                } while (uVar22 != 0);
                bVar10 = uVar23 == uVar20;
                puVar18 = (undefined8 *)((long)puVar18 + uVar23);
                puVar13 = puVar21;
                uVar20 = (ulong)(uVar19 - (int)uVar23);
                if (bVar10) goto LAB_000f8c28;
              }
              do {
                *(undefined1 *)puVar13 = *(undefined1 *)puVar18;
                uVar19 = (int)uVar20 - 1;
                uVar20 = (ulong)uVar19;
                puVar18 = (undefined8 *)((long)puVar18 + 1);
                puVar21 = (undefined8 *)((long)puVar13 + 1U);
                puVar13 = (undefined8 *)((long)puVar13 + 1U);
              } while (uVar19 != 0);
              goto LAB_000f8c28;
            }
          }
          puVar26 = (uint *)((long)puVar26 + 2);
        }
        else {
          if (0x3f < uVar19) {
            uVar20 = (ulong)*(byte *)((long)puVar26 + 2) + 1;
            puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + uVar20);
            if ((undefined8 *)((long)puVar13 + uVar20) <= puVar3) {
              uVar19 = CONCAT11(bVar7,*(undefined1 *)((long)puVar26 + 1)) - 0x3fff;
              puVar21 = (undefined8 *)((long)puVar13 - (ulong)uVar19);
              puRam0000000000a390a0 = puVar2;
              if (puVar12 <= puVar21) {
                if ((0x3e < *(byte *)((long)puVar26 + 2)) && (0x3f < uVar19)) {
                  uVar22 = uVar20 & 0x1c0;
                  uVar27 = *puVar21;
                  uVar29 = puVar21[3];
                  uVar28 = puVar21[2];
                  uVar31 = puVar21[5];
                  uVar30 = puVar21[4];
                  uVar33 = puVar21[7];
                  uVar32 = puVar21[6];
                  puVar13[1] = puVar21[1];
                  *puVar13 = uVar27;
                  puVar13[3] = uVar29;
                  puVar13[2] = uVar28;
                  puVar13[5] = uVar31;
                  puVar13[4] = uVar30;
                  puVar13[7] = uVar33;
                  puVar13[6] = uVar32;
                  if (uVar22 != 0x40) {
                    uVar27 = puVar21[8];
                    uVar29 = puVar21[0xb];
                    uVar28 = puVar21[10];
                    uVar31 = puVar21[0xd];
                    uVar30 = puVar21[0xc];
                    uVar33 = puVar21[0xf];
                    uVar32 = puVar21[0xe];
                    puVar13[9] = puVar21[9];
                    puVar13[8] = uVar27;
                    puVar13[0xb] = uVar29;
                    puVar13[10] = uVar28;
                    puVar13[0xd] = uVar31;
                    puVar13[0xc] = uVar30;
                    puVar13[0xf] = uVar33;
                    puVar13[0xe] = uVar32;
                    if (uVar22 != 0x80) {
                      uVar27 = puVar21[0x10];
                      uVar29 = puVar21[0x13];
                      uVar28 = puVar21[0x12];
                      uVar31 = puVar21[0x15];
                      uVar30 = puVar21[0x14];
                      uVar33 = puVar21[0x17];
                      uVar32 = puVar21[0x16];
                      puVar13[0x11] = puVar21[0x11];
                      puVar13[0x10] = uVar27;
                      puVar13[0x13] = uVar29;
                      puVar13[0x12] = uVar28;
                      puVar13[0x15] = uVar31;
                      puVar13[0x14] = uVar30;
                      puVar13[0x17] = uVar33;
                      puVar13[0x16] = uVar32;
                      if (uVar22 != 0xc0) {
                        uVar27 = puVar21[0x18];
                        uVar29 = puVar21[0x1b];
                        uVar28 = puVar21[0x1a];
                        uVar31 = puVar21[0x1d];
                        uVar30 = puVar21[0x1c];
                        uVar33 = puVar21[0x1f];
                        uVar32 = puVar21[0x1e];
                        puVar13[0x19] = puVar21[0x19];
                        puVar13[0x18] = uVar27;
                        puVar13[0x1b] = uVar29;
                        puVar13[0x1a] = uVar28;
                        puVar13[0x1d] = uVar31;
                        puVar13[0x1c] = uVar30;
                        puVar13[0x1f] = uVar33;
                        puVar13[0x1e] = uVar32;
                      }
                    }
                  }
                  puVar13 = (undefined8 *)((long)puVar13 + uVar22);
                  if (uVar22 == uVar20) {
                    puRam0000000000a390a0 = puVar13;
                    goto code_r0x000f8c54;
                  }
                  uVar20 = (ulong)(uint)((int)uVar20 - (int)uVar22);
                  puVar21 = (undefined8 *)((long)puVar21 + uVar22);
                }
                do {
                  puRam0000000000a390a0 = (undefined8 *)((long)puVar13 + 1);
                  *(undefined1 *)puVar13 = *(undefined1 *)puVar21;
                  uVar19 = (int)uVar20 - 1;
                  uVar20 = (ulong)uVar19;
                  puVar21 = (undefined8 *)((long)puVar21 + 1);
                  puVar13 = puRam0000000000a390a0;
                } while (uVar19 != 0);
              }
            }
code_r0x000f8c54:
            puVar26 = (uint *)((long)puVar26 + 3);
            goto code_r0x000f86a8;
          }
          param_3 = (ulong)(uVar19 - 0x1f);
          puVar13 = (undefined8 *)((long)puVar13 + param_3);
          if (puVar3 < puVar13) {
code_r0x000f89a8:
            puVar21 = puVar13;
          }
          else {
            puVar21 = puVar2;
            if (extraout_x1 <= (uint *)((long)puVar26 + 1U)) {
              _memcpy();
              uVar20 = (ulong)(byte)*puVar26;
              goto code_r0x000f89a8;
            }
          }
          uVar15 = (undefined2)param_3;
          lVar17 = uVar20 - 0x1e;
          puRam0000000000a390a0 = puVar21;
          if (lVar17 == 0) break;
code_r0x000f8a20:
          puVar26 = (uint *)((long)puVar26 + lVar17);
          puVar13 = puRam0000000000a390a0;
        }
      }
code_r0x000f86ac:
      uVar15 = (undefined2)param_3;
    } while (puVar13 <= puVar3);
  }
  if (param_4 == 0) {
    uStack_d0 = 0;
    uStack_128 = 0;
    fStack_121 = 0.0;
    uStack_148 = 0;
    uStack_150 = 0;
    lStack_138 = 0;
    uStack_140 = 0;
    uStack_130 = 0;
    uStack_188 = 0;
    uStack_190 = 0;
    uStack_178 = 0;
    uStack_180 = 0;
    uStack_168 = 0;
    uStack_170 = 0;
    uStack_c8 = NEON_fmov(0x3f800000,4);
    uStack_d4 = 0x7f7fffff;
    uStack_c0 = 0xffff;
    uStack_162 = 0;
    uStack_160 = 0;
    uStack_100 = _UNK_0080c170;
  }
  else {
    uStack_128 = (undefined7)*(undefined8 *)(param_4 + 0xd);
    fStack_121 = *(float *)(param_4 + 0x14);
    uStack_148 = *(undefined8 *)(param_4 + 0x28);
    uStack_150 = *(undefined8 *)(param_4 + 0x20);
    lStack_138 = *(long *)(param_4 + 0x38);
    uStack_140 = *(undefined8 *)(param_4 + 0x30);
    uStack_130 = *(undefined4 *)(param_4 + 0x40);
    uStack_d4 = *(undefined4 *)(param_4 + 0x44);
    uStack_d0 = *(undefined8 *)(param_4 + 0x48);
    uStack_c8 = *(undefined8 *)(param_4 + 0x50);
    uStack_c0 = *(undefined2 *)(param_4 + 0x58);
    uStack_188 = *(undefined8 *)(param_4 + 0x62);
    uStack_190 = *(undefined8 *)(param_4 + 0x5a);
    uStack_178 = *(undefined8 *)(param_4 + 0x72);
    uStack_180 = *(undefined8 *)(param_4 + 0x6a);
    uStack_170 = *(undefined8 *)(param_4 + 0x7a);
    uStack_160 = (undefined6)((ulong)*(undefined8 *)(param_4 + 0x88) >> 0x10);
    uStack_168 = (undefined6)*(undefined8 *)(param_4 + 0x82);
    uStack_162 = (undefined2)((ulong)*(undefined8 *)(param_4 + 0x82) >> 0x30);
    uStack_100 = *(undefined8 *)(param_4 + 0x18);
  }
  uStack_10c = 1;
  uStack_10b = uStack_128;
  uStack_f0 = uStack_148;
  uStack_f8 = uStack_150;
  lStack_e0 = lStack_138;
  uStack_e8 = uStack_140;
  uStack_d8 = uStack_130;
  uStack_8e = uStack_160;
  uStack_96 = uStack_168;
  uStack_90 = uStack_162;
  uStack_9e = uStack_170;
  uStack_a6 = uStack_178;
  uStack_ae = uStack_180;
  uStack_b6 = uStack_188;
  uStack_be = uStack_190;
  fStack_104 = extraout_s0;
  if (extraout_s0 <= 0.0) {
    fStack_104 = fStack_121;
  }
  if (param_5 != 0) {
    lStack_e0 = param_5;
  }
  puStack_118 = puVar12;
  uStack_110 = uVar8;
  func_0x000f7bac(uVar11,&puStack_118);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_88) {
    return;
  }
  Var34 = ___stack_chk_fail();
  lVar17 = (long)Var34;
  iVar16 = *(int *)(lVar17 + 0x68);
  if (iVar16 == *(int *)(lVar17 + 0x6c)) {
    iVar6 = iVar16;
    if (iVar16 < 0) {
      iVar6 = iVar16 + 1;
    }
    uVar8 = 8;
    if (iVar16 != 0) {
      uVar8 = iVar16 + (iVar6 >> 1);
    }
    if ((int)uVar8 <= (int)(iVar16 + 1U)) {
      uVar8 = iVar16 + 1U;
    }
    lVar14 = func_0x000b810c(-(ulong)(uVar8 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar8 << 5);
    if (*(long *)(lVar17 + 0x70) != 0) {
      _memcpy(lVar14,*(long *)(lVar17 + 0x70),(long)*(int *)(lVar17 + 0x68) << 5);
      func_0x000b83d4(*(undefined8 *)(lVar17 + 0x70));
    }
    *(long *)(lVar17 + 0x70) = lVar14;
    *(uint *)(lVar17 + 0x6c) = uVar8;
    iVar16 = *(int *)(lVar17 + 0x68);
  }
  else {
    lVar14 = *(long *)(lVar17 + 0x70);
  }
  puVar5 = (undefined2 *)(lVar14 + (long)iVar16 * 0x20);
  *puVar5 = (short)((unkuint10)Var34 >> 0x40);
  puVar5[1] = uVar15;
  *(undefined4 *)(puVar5 + 2) = 0xffffffff;
  *(undefined8 *)(puVar5 + 8) = 0;
  *(undefined8 *)(puVar5 + 0xc) = 0;
  *(undefined8 *)(puVar5 + 4) = 0;
  *(int *)(lVar17 + 0x68) = *(int *)(lVar17 + 0x68) + 1;
  return;
}

