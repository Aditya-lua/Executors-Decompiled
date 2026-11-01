
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000f890c(ulong param_1,undefined8 *param_2,undefined8 param_3,ulong param_4)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined2 *puVar3;
  int iVar4;
  byte bVar5;
  uint uVar6;
  bool bVar7;
  long lVar8;
  undefined2 uVar9;
  int iVar10;
  long lVar11;
  uint uVar12;
  ulong uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  ulong in_x11;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong in_x13;
  undefined8 *puVar19;
  undefined1 *puVar20;
  int in_w17;
  undefined8 *unaff_x22;
  long unaff_x23;
  ushort *unaff_x24;
  undefined8 *unaff_x25;
  ushort *unaff_x26;
  undefined8 *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  float unaff_s8;
  unkbyte10 Var28;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined6 uStack0000000000000038;
  undefined2 uStack000000000000003e;
  undefined6 uStack0000000000000040;
  undefined7 uStack0000000000000078;
  float fStack000000000000007f;
  undefined8 uStack0000000000000088;
  undefined1 uStack0000000000000094;
  undefined7 uStack0000000000000095;
  float fStack000000000000009c;
  undefined4 uStack00000000000000cc;
  undefined8 uStack00000000000000e2;
  undefined8 uStack00000000000000ea;
  undefined8 uStack00000000000000f2;
  undefined8 uStack00000000000000fa;
  undefined8 uStack0000000000000102;
  undefined6 uStack000000000000010a;
  undefined6 uStack0000000000000112;
  
code_r0x000f890c:
  puVar15 = (undefined8 *)(param_1 + (long)param_2);
  puVar14 = unaff_x27;
  if (unaff_x22 <= puVar15) {
    uVar12 = (uint)in_x11;
    if (uVar12 == 0) goto LAB_000f8c30;
    if ((0x3f < uVar12) && (0x3e < (uint)in_x13)) {
      uVar17 = in_x11 & 0xffffffc0;
      puVar14 = (undefined8 *)((long)param_2 + uVar17);
      uVar13 = uVar17;
      do {
        puVar19 = (undefined8 *)((long)param_2 + (0x2f - in_x13));
        uVar21 = puVar19[-6];
        uVar23 = puVar19[-3];
        uVar22 = puVar19[-4];
        uVar25 = puVar19[-1];
        uVar24 = puVar19[-2];
        uVar27 = puVar19[1];
        uVar26 = *puVar19;
        param_2[1] = puVar19[-5];
        *param_2 = uVar21;
        param_2[3] = uVar23;
        param_2[2] = uVar22;
        param_2[5] = uVar25;
        param_2[4] = uVar24;
        param_2[7] = uVar27;
        param_2[6] = uVar26;
        param_2 = param_2 + 8;
        uVar13 = uVar13 - 0x40;
      } while (uVar13 != 0);
      bVar7 = uVar17 == in_x11;
      puVar15 = (undefined8 *)((long)puVar15 + uVar17);
      param_2 = puVar14;
      in_x11 = (ulong)(uVar12 - (int)uVar17);
      if (bVar7) goto LAB_000f8c28;
    }
    do {
      *(undefined1 *)param_2 = *(undefined1 *)puVar15;
      uVar12 = (int)in_x11 - 1;
      in_x11 = (ulong)uVar12;
      puVar15 = (undefined8 *)((long)puVar15 + 1);
      puVar14 = (undefined8 *)((long)param_2 + 1U);
      param_2 = (undefined8 *)((long)param_2 + 1U);
    } while (uVar12 != 0);
  }
LAB_000f8c28:
  param_2 = puVar14;
  *(undefined8 **)(unaff_x28 + 0xa0) = param_2;
LAB_000f8c30:
  unaff_x26 = unaff_x26 + 1;
  do {
    while( true ) {
      uVar9 = (undefined2)param_4;
      if (unaff_x25 < param_2) goto code_r0x000f850c;
      bVar5 = (byte)*unaff_x26;
      uVar13 = (ulong)bVar5;
      uVar12 = (uint)bVar5;
      if (0x1f < bVar5) break;
      if (bVar5 < 0x18) {
        if (uVar12 < 0x10) {
          if (uVar12 < 8) {
            if (uVar12 == 4) {
              uVar1 = (uint)(unaff_x26[2] >> 8) | (unaff_x26[2] & 0xff00ff) << 8;
              uVar12 = uVar1 + 1;
              uVar13 = (ulong)uVar12;
              puVar15 = (undefined8 *)((long)param_2 + uVar13);
              if ((undefined8 *)((long)param_2 + uVar13) <= unaff_x25) {
                uVar17 = (ulong)*(byte *)((long)unaff_x26 + 3) |
                         (ulong)*(byte *)((long)unaff_x26 + 1) << 0x10 |
                         (ulong)(byte)unaff_x26[1] << 8;
                puVar14 = (undefined8 *)((long)param_2 + ~uVar17);
                puVar15 = unaff_x27;
                if (unaff_x22 <= puVar14) {
                  if ((0x3e < uVar1) && (0x3e < uVar17)) {
                    uVar18 = uVar13 & 0x1ffc0;
                    puVar15 = (undefined8 *)((long)param_2 + uVar18);
                    puVar20 = (undefined1 *)((long)param_2 + 0x1f);
                    uVar16 = uVar18;
                    do {
                      puVar19 = (undefined8 *)(puVar20 + -uVar17);
                      uVar21 = puVar19[-4];
                      uVar23 = puVar19[-1];
                      uVar22 = puVar19[-2];
                      uVar25 = puVar19[1];
                      uVar24 = *puVar19;
                      uVar27 = puVar19[3];
                      uVar26 = puVar19[2];
                      *(undefined8 *)(puVar20 + -0x17) = puVar19[-3];
                      *(undefined8 *)(puVar20 + -0x1f) = uVar21;
                      *(undefined8 *)(puVar20 + -7) = uVar23;
                      *(undefined8 *)(puVar20 + -0xf) = uVar22;
                      *(undefined8 *)(puVar20 + 9) = uVar25;
                      *(undefined8 *)(puVar20 + 1) = uVar24;
                      *(undefined8 *)(puVar20 + 0x19) = uVar27;
                      *(undefined8 *)(puVar20 + 0x11) = uVar26;
                      puVar20 = puVar20 + 0x40;
                      uVar16 = uVar16 - 0x40;
                    } while (uVar16 != 0);
                    bVar7 = uVar18 == uVar13;
                    puVar14 = (undefined8 *)((long)puVar14 + uVar18);
                    param_2 = puVar15;
                    uVar13 = (ulong)(uVar12 - (int)uVar18);
                    if (bVar7) goto code_r0x000f8c78;
                  }
                  do {
                    puVar15 = (undefined8 *)((long)param_2 + 1);
                    *(undefined1 *)param_2 = *(undefined1 *)puVar14;
                    uVar12 = (int)uVar13 - 1;
                    uVar13 = (ulong)uVar12;
                    puVar14 = (undefined8 *)((long)puVar14 + 1);
                    param_2 = puVar15;
                  } while (uVar12 != 0);
                }
              }
code_r0x000f8c78:
              *(undefined8 **)(unaff_x28 + 0xa0) = puVar15;
              unaff_x26 = unaff_x26 + 3;
              param_2 = puVar15;
            }
            else {
              if (uVar12 == 6) {
                uVar13 = (ulong)(byte)unaff_x26[2] + 1;
                puVar15 = (undefined8 *)((long)param_2 + uVar13);
                if ((undefined8 *)((long)param_2 + uVar13) <= unaff_x25) {
                  uVar17 = (ulong)*(byte *)((long)unaff_x26 + 3) |
                           (ulong)*(byte *)((long)unaff_x26 + 1) << 0x10 |
                           (ulong)(byte)unaff_x26[1] << 8;
                  puVar14 = (undefined8 *)((long)param_2 + ~uVar17);
                  puVar15 = unaff_x27;
                  if (unaff_x22 <= puVar14) {
                    if ((0x3e < (byte)unaff_x26[2]) && (0x3e < uVar17)) {
                      uVar17 = uVar13 & 0x1c0;
                      uVar21 = *puVar14;
                      uVar23 = puVar14[3];
                      uVar22 = puVar14[2];
                      uVar25 = puVar14[5];
                      uVar24 = puVar14[4];
                      uVar27 = puVar14[7];
                      uVar26 = puVar14[6];
                      param_2[1] = puVar14[1];
                      *param_2 = uVar21;
                      param_2[3] = uVar23;
                      param_2[2] = uVar22;
                      param_2[5] = uVar25;
                      param_2[4] = uVar24;
                      param_2[7] = uVar27;
                      param_2[6] = uVar26;
                      if (uVar17 != 0x40) {
                        uVar21 = puVar14[8];
                        uVar23 = puVar14[0xb];
                        uVar22 = puVar14[10];
                        uVar25 = puVar14[0xd];
                        uVar24 = puVar14[0xc];
                        uVar27 = puVar14[0xf];
                        uVar26 = puVar14[0xe];
                        param_2[9] = puVar14[9];
                        param_2[8] = uVar21;
                        param_2[0xb] = uVar23;
                        param_2[10] = uVar22;
                        param_2[0xd] = uVar25;
                        param_2[0xc] = uVar24;
                        param_2[0xf] = uVar27;
                        param_2[0xe] = uVar26;
                        if (uVar17 != 0x80) {
                          uVar21 = puVar14[0x10];
                          uVar23 = puVar14[0x13];
                          uVar22 = puVar14[0x12];
                          uVar25 = puVar14[0x15];
                          uVar24 = puVar14[0x14];
                          uVar27 = puVar14[0x17];
                          uVar26 = puVar14[0x16];
                          param_2[0x11] = puVar14[0x11];
                          param_2[0x10] = uVar21;
                          param_2[0x13] = uVar23;
                          param_2[0x12] = uVar22;
                          param_2[0x15] = uVar25;
                          param_2[0x14] = uVar24;
                          param_2[0x17] = uVar27;
                          param_2[0x16] = uVar26;
                          if (uVar17 != 0xc0) {
                            uVar21 = puVar14[0x18];
                            uVar23 = puVar14[0x1b];
                            uVar22 = puVar14[0x1a];
                            uVar25 = puVar14[0x1d];
                            uVar24 = puVar14[0x1c];
                            uVar27 = puVar14[0x1f];
                            uVar26 = puVar14[0x1e];
                            param_2[0x19] = puVar14[0x19];
                            param_2[0x18] = uVar21;
                            param_2[0x1b] = uVar23;
                            param_2[0x1a] = uVar22;
                            param_2[0x1d] = uVar25;
                            param_2[0x1c] = uVar24;
                            param_2[0x1f] = uVar27;
                            param_2[0x1e] = uVar26;
                          }
                        }
                      }
                      param_2 = (undefined8 *)((long)param_2 + uVar17);
                      if (uVar17 == uVar13) {
                        puVar15 = param_2;
                        goto code_r0x000f8c04;
                      }
                      uVar13 = (ulong)(uint)((int)uVar13 - (int)uVar17);
                      puVar14 = (undefined8 *)((long)puVar14 + uVar17);
                    }
                    do {
                      puVar15 = (undefined8 *)((long)param_2 + 1);
                      *(undefined1 *)param_2 = *(undefined1 *)puVar14;
                      uVar12 = (int)uVar13 - 1;
                      uVar13 = (ulong)uVar12;
                      puVar14 = (undefined8 *)((long)puVar14 + 1);
                      param_2 = puVar15;
                    } while (uVar12 != 0);
                  }
                }
                goto code_r0x000f8c04;
              }
              if (uVar12 != 7) goto code_r0x000f850c;
              uVar13 = (ulong)((uint)(*(ushort *)((long)unaff_x26 + 1) >> 8) |
                              (*(ushort *)((long)unaff_x26 + 1) & 0xff00ff) << 8);
              param_4 = uVar13 + 1;
              puVar15 = (undefined8 *)((long)param_2 + param_4);
              if (unaff_x25 < puVar15) {
code_r0x000f8a7c:
                param_2 = puVar15;
              }
              else {
                param_2 = unaff_x27;
                if (unaff_x24 <= (ushort *)((long)unaff_x26 + 3U)) {
                  _memcpy();
                  in_w17 = -0x17ffff;
                  uVar13 = (ulong)((uint)(*(ushort *)((long)unaff_x26 + 1) >> 8) |
                                  (*(ushort *)((long)unaff_x26 + 1) & 0xff00ff) << 8);
                  goto code_r0x000f8a7c;
                }
              }
              *(undefined8 **)(unaff_x28 + 0xa0) = param_2;
              unaff_x26 = (ushort *)((long)unaff_x26 + uVar13 + 4);
            }
          }
          else {
            uVar12 = (uint)CONCAT11(bVar5,*(byte *)((long)unaff_x26 + 1));
            param_4 = (ulong)(uVar12 - 0x7ff);
            puVar15 = (undefined8 *)((long)param_2 + param_4);
            if (unaff_x25 < puVar15) {
code_r0x000f8a08:
              param_2 = puVar15;
            }
            else {
              param_2 = unaff_x27;
              if (unaff_x24 <= unaff_x26 + 1) {
                _memcpy();
                in_w17 = -0x17ffff;
                uVar12 = (uint)(*unaff_x26 >> 8) | (*unaff_x26 & 0xff00ff) << 8;
                goto code_r0x000f8a08;
              }
            }
            uVar9 = (undefined2)param_4;
            *(undefined8 **)(unaff_x28 + 0xa0) = param_2;
            lVar11 = (long)(int)(uVar12 - 0x7fd);
joined_r0x000f89bc:
            if (lVar11 == 0) {
code_r0x000f850c:
              if (unaff_x23 == 0) {
                uStack0000000000000078 = 0;
                fStack000000000000007f = 0.0;
                uStack0000000000000018 = 0;
                uStack0000000000000010 = 0;
                uStack0000000000000028 = 0;
                uStack0000000000000020 = 0;
                uStack0000000000000038 = 0;
                uStack0000000000000030 = 0;
                NEON_fmov(0x3f800000,4);
                uStack00000000000000cc = 0x7f7fffff;
                uStack000000000000003e = 0;
                uStack0000000000000040 = 0;
              }
              else {
                uStack0000000000000078 = (undefined7)*(undefined8 *)(unaff_x23 + 0xd);
                fStack000000000000007f = *(float *)(unaff_x23 + 0x14);
                uStack00000000000000cc = *(undefined4 *)(unaff_x23 + 0x44);
                uStack0000000000000018 = *(undefined8 *)(unaff_x23 + 0x62);
                uStack0000000000000010 = *(undefined8 *)(unaff_x23 + 0x5a);
                uStack0000000000000028 = *(undefined8 *)(unaff_x23 + 0x72);
                uStack0000000000000020 = *(undefined8 *)(unaff_x23 + 0x6a);
                uStack0000000000000030 = *(undefined8 *)(unaff_x23 + 0x7a);
                uStack0000000000000040 =
                     (undefined6)((ulong)*(undefined8 *)(unaff_x23 + 0x88) >> 0x10);
                uStack0000000000000038 = (undefined6)*(undefined8 *)(unaff_x23 + 0x82);
                uStack000000000000003e =
                     (undefined2)((ulong)*(undefined8 *)(unaff_x23 + 0x82) >> 0x30);
              }
              uStack0000000000000094 = 1;
              uStack0000000000000095 = uStack0000000000000078;
              uStack0000000000000112 = uStack0000000000000040;
              uStack000000000000010a = uStack0000000000000038;
              uStack0000000000000102 = uStack0000000000000030;
              uStack00000000000000fa = uStack0000000000000028;
              uStack00000000000000f2 = uStack0000000000000020;
              uStack00000000000000ea = uStack0000000000000018;
              uStack00000000000000e2 = uStack0000000000000010;
              if (unaff_s8 <= 0.0) {
                unaff_s8 = fStack000000000000007f;
              }
              fStack000000000000009c = unaff_s8;
              func_0x000f7bac(in_stack_00000008,&uStack0000000000000088);
              if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x78)) {
                return;
              }
              Var28 = ___stack_chk_fail();
              lVar11 = (long)Var28;
              iVar10 = *(int *)(lVar11 + 0x68);
              if (iVar10 == *(int *)(lVar11 + 0x6c)) {
                iVar4 = iVar10;
                if (iVar10 < 0) {
                  iVar4 = iVar10 + 1;
                }
                uVar12 = 8;
                if (iVar10 != 0) {
                  uVar12 = iVar10 + (iVar4 >> 1);
                }
                if ((int)uVar12 <= (int)(iVar10 + 1U)) {
                  uVar12 = iVar10 + 1U;
                }
                lVar8 = func_0x000b810c(-(ulong)(uVar12 >> 0x1f) & 0xffffffe000000000 |
                                        (ulong)uVar12 << 5);
                if (*(long *)(lVar11 + 0x70) != 0) {
                  _memcpy(lVar8,*(long *)(lVar11 + 0x70),(long)*(int *)(lVar11 + 0x68) << 5);
                  func_0x000b83d4(*(undefined8 *)(lVar11 + 0x70));
                }
                *(long *)(lVar11 + 0x70) = lVar8;
                *(uint *)(lVar11 + 0x6c) = uVar12;
                iVar10 = *(int *)(lVar11 + 0x68);
              }
              else {
                lVar8 = *(long *)(lVar11 + 0x70);
              }
              puVar3 = (undefined2 *)(lVar8 + (long)iVar10 * 0x20);
              *puVar3 = (short)((unkuint10)Var28 >> 0x40);
              puVar3[1] = uVar9;
              *(undefined4 *)(puVar3 + 2) = 0xffffffff;
              *(undefined8 *)(puVar3 + 8) = 0;
              *(undefined8 *)(puVar3 + 0xc) = 0;
              *(undefined8 *)(puVar3 + 4) = 0;
              *(int *)(lVar11 + 0x68) = *(int *)(lVar11 + 0x68) + 1;
              return;
            }
            unaff_x26 = (ushort *)((long)unaff_x26 + lVar11);
          }
        }
        else {
          uVar6 = (uint)(*(ushort *)((long)unaff_x26 + 3) >> 8) |
                  (*(ushort *)((long)unaff_x26 + 3) & 0xff00ff) << 8;
          uVar1 = uVar6 + 1;
          uVar13 = (ulong)uVar1;
          puVar15 = (undefined8 *)((long)param_2 + uVar13);
          if ((undefined8 *)((long)param_2 + uVar13) <= unaff_x25) {
            uVar12 = ((uint)(byte)unaff_x26[1] | uVar12 << 0x10 |
                     (uint)*(byte *)((long)unaff_x26 + 1) << 8) - 0xfffff;
            puVar14 = (undefined8 *)((long)param_2 - (ulong)uVar12);
            puVar15 = unaff_x27;
            if (unaff_x22 <= puVar14) {
              if ((0x3e < uVar6) && (0x3f < uVar12)) {
                uVar16 = uVar13 & 0x1ffc0;
                puVar15 = (undefined8 *)((long)param_2 + uVar16);
                puVar19 = param_2 + 4;
                uVar17 = uVar16;
                do {
                  puVar2 = (undefined8 *)((long)puVar19 - (ulong)uVar12);
                  uVar21 = puVar2[-4];
                  uVar23 = puVar2[-1];
                  uVar22 = puVar2[-2];
                  uVar25 = puVar2[1];
                  uVar24 = *puVar2;
                  uVar27 = puVar2[3];
                  uVar26 = puVar2[2];
                  puVar19[-3] = puVar2[-3];
                  puVar19[-4] = uVar21;
                  puVar19[-1] = uVar23;
                  puVar19[-2] = uVar22;
                  puVar19[1] = uVar25;
                  *puVar19 = uVar24;
                  puVar19[3] = uVar27;
                  puVar19[2] = uVar26;
                  uVar17 = uVar17 - 0x40;
                  puVar19 = puVar19 + 8;
                } while (uVar17 != 0);
                bVar7 = uVar16 == uVar13;
                puVar14 = (undefined8 *)((long)puVar14 + uVar16);
                uVar13 = (ulong)(uVar1 - (int)uVar16);
                param_2 = puVar15;
                if (bVar7) goto code_r0x000f8c04;
              }
              do {
                *(undefined1 *)param_2 = *(undefined1 *)puVar14;
                uVar12 = (int)uVar13 - 1;
                uVar13 = (ulong)uVar12;
                puVar14 = (undefined8 *)((long)puVar14 + 1);
                puVar15 = (undefined8 *)((long)param_2 + 1U);
                param_2 = (undefined8 *)((long)param_2 + 1U);
              } while (uVar12 != 0);
            }
          }
code_r0x000f8c04:
          *(undefined8 **)(unaff_x28 + 0xa0) = puVar15;
          unaff_x26 = (ushort *)((long)unaff_x26 + 5);
          param_2 = puVar15;
        }
      }
      else {
        uVar13 = (ulong)*(byte *)((long)unaff_x26 + 3) + 1;
        puVar15 = (undefined8 *)((long)param_2 + uVar13);
        if ((undefined8 *)((long)param_2 + uVar13) <= unaff_x25) {
          uVar12 = ((uint)(byte)unaff_x26[1] | uVar12 << 0x10 |
                   (uint)*(byte *)((long)unaff_x26 + 1) << 8) + in_w17;
          puVar14 = (undefined8 *)((long)param_2 - (ulong)uVar12);
          puVar15 = unaff_x27;
          if (unaff_x22 <= puVar14) {
            if ((0x3e < *(byte *)((long)unaff_x26 + 3)) && (0x3f < uVar12)) {
              uVar17 = uVar13 & 0x1c0;
              uVar21 = *puVar14;
              uVar23 = puVar14[3];
              uVar22 = puVar14[2];
              uVar25 = puVar14[5];
              uVar24 = puVar14[4];
              uVar27 = puVar14[7];
              uVar26 = puVar14[6];
              param_2[1] = puVar14[1];
              *param_2 = uVar21;
              param_2[3] = uVar23;
              param_2[2] = uVar22;
              param_2[5] = uVar25;
              param_2[4] = uVar24;
              param_2[7] = uVar27;
              param_2[6] = uVar26;
              if (uVar17 != 0x40) {
                uVar21 = puVar14[8];
                uVar23 = puVar14[0xb];
                uVar22 = puVar14[10];
                uVar25 = puVar14[0xd];
                uVar24 = puVar14[0xc];
                uVar27 = puVar14[0xf];
                uVar26 = puVar14[0xe];
                param_2[9] = puVar14[9];
                param_2[8] = uVar21;
                param_2[0xb] = uVar23;
                param_2[10] = uVar22;
                param_2[0xd] = uVar25;
                param_2[0xc] = uVar24;
                param_2[0xf] = uVar27;
                param_2[0xe] = uVar26;
                if (uVar17 != 0x80) {
                  uVar21 = puVar14[0x10];
                  uVar23 = puVar14[0x13];
                  uVar22 = puVar14[0x12];
                  uVar25 = puVar14[0x15];
                  uVar24 = puVar14[0x14];
                  uVar27 = puVar14[0x17];
                  uVar26 = puVar14[0x16];
                  param_2[0x11] = puVar14[0x11];
                  param_2[0x10] = uVar21;
                  param_2[0x13] = uVar23;
                  param_2[0x12] = uVar22;
                  param_2[0x15] = uVar25;
                  param_2[0x14] = uVar24;
                  param_2[0x17] = uVar27;
                  param_2[0x16] = uVar26;
                  if (uVar17 != 0xc0) {
                    uVar21 = puVar14[0x18];
                    uVar23 = puVar14[0x1b];
                    uVar22 = puVar14[0x1a];
                    uVar25 = puVar14[0x1d];
                    uVar24 = puVar14[0x1c];
                    uVar27 = puVar14[0x1f];
                    uVar26 = puVar14[0x1e];
                    param_2[0x19] = puVar14[0x19];
                    param_2[0x18] = uVar21;
                    param_2[0x1b] = uVar23;
                    param_2[0x1a] = uVar22;
                    param_2[0x1d] = uVar25;
                    param_2[0x1c] = uVar24;
                    param_2[0x1f] = uVar27;
                    param_2[0x1e] = uVar26;
                  }
                }
              }
              param_2 = (undefined8 *)((long)param_2 + uVar17);
              if (uVar17 == uVar13) {
                puVar15 = param_2;
                goto code_r0x000f86a0;
              }
              uVar13 = (ulong)(uint)((int)uVar13 - (int)uVar17);
              puVar14 = (undefined8 *)((long)puVar14 + uVar17);
            }
            do {
              puVar15 = (undefined8 *)((long)param_2 + 1);
              *(undefined1 *)param_2 = *(undefined1 *)puVar14;
              uVar12 = (int)uVar13 - 1;
              uVar13 = (ulong)uVar12;
              puVar14 = (undefined8 *)((long)puVar14 + 1);
              param_2 = puVar15;
            } while (uVar12 != 0);
          }
        }
code_r0x000f86a0:
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar15;
        unaff_x26 = unaff_x26 + 2;
        param_2 = puVar15;
      }
    }
    uVar12 = (uint)bVar5;
    if ((char)bVar5 < '\0') break;
    if (uVar12 < 0x40) {
      param_4 = (ulong)(uVar12 - 0x1f);
      puVar15 = (undefined8 *)((long)param_2 + param_4);
      if (unaff_x25 < puVar15) {
code_r0x000f89a8:
        param_2 = puVar15;
      }
      else {
        param_2 = unaff_x27;
        if (unaff_x24 <= (ushort *)((long)unaff_x26 + 1U)) {
          _memcpy();
          in_w17 = -0x17ffff;
          uVar13 = (ulong)(byte)*unaff_x26;
          goto code_r0x000f89a8;
        }
      }
      uVar9 = (undefined2)param_4;
      *(undefined8 **)(unaff_x28 + 0xa0) = param_2;
      lVar11 = uVar13 - 0x1e;
      goto joined_r0x000f89bc;
    }
    uVar13 = (ulong)(byte)unaff_x26[1] + 1;
    puVar15 = (undefined8 *)((long)param_2 + uVar13);
    if ((undefined8 *)((long)param_2 + uVar13) <= unaff_x25) {
      uVar12 = CONCAT11(bVar5,*(byte *)((long)unaff_x26 + 1)) - 0x3fff;
      puVar14 = (undefined8 *)((long)param_2 - (ulong)uVar12);
      puVar15 = unaff_x27;
      if (unaff_x22 <= puVar14) {
        if ((0x3e < (byte)unaff_x26[1]) && (0x3f < uVar12)) {
          uVar17 = uVar13 & 0x1c0;
          uVar21 = *puVar14;
          uVar23 = puVar14[3];
          uVar22 = puVar14[2];
          uVar25 = puVar14[5];
          uVar24 = puVar14[4];
          uVar27 = puVar14[7];
          uVar26 = puVar14[6];
          param_2[1] = puVar14[1];
          *param_2 = uVar21;
          param_2[3] = uVar23;
          param_2[2] = uVar22;
          param_2[5] = uVar25;
          param_2[4] = uVar24;
          param_2[7] = uVar27;
          param_2[6] = uVar26;
          if (uVar17 != 0x40) {
            uVar21 = puVar14[8];
            uVar23 = puVar14[0xb];
            uVar22 = puVar14[10];
            uVar25 = puVar14[0xd];
            uVar24 = puVar14[0xc];
            uVar27 = puVar14[0xf];
            uVar26 = puVar14[0xe];
            param_2[9] = puVar14[9];
            param_2[8] = uVar21;
            param_2[0xb] = uVar23;
            param_2[10] = uVar22;
            param_2[0xd] = uVar25;
            param_2[0xc] = uVar24;
            param_2[0xf] = uVar27;
            param_2[0xe] = uVar26;
            if (uVar17 != 0x80) {
              uVar21 = puVar14[0x10];
              uVar23 = puVar14[0x13];
              uVar22 = puVar14[0x12];
              uVar25 = puVar14[0x15];
              uVar24 = puVar14[0x14];
              uVar27 = puVar14[0x17];
              uVar26 = puVar14[0x16];
              param_2[0x11] = puVar14[0x11];
              param_2[0x10] = uVar21;
              param_2[0x13] = uVar23;
              param_2[0x12] = uVar22;
              param_2[0x15] = uVar25;
              param_2[0x14] = uVar24;
              param_2[0x17] = uVar27;
              param_2[0x16] = uVar26;
              if (uVar17 != 0xc0) {
                uVar21 = puVar14[0x18];
                uVar23 = puVar14[0x1b];
                uVar22 = puVar14[0x1a];
                uVar25 = puVar14[0x1d];
                uVar24 = puVar14[0x1c];
                uVar27 = puVar14[0x1f];
                uVar26 = puVar14[0x1e];
                param_2[0x19] = puVar14[0x19];
                param_2[0x18] = uVar21;
                param_2[0x1b] = uVar23;
                param_2[0x1a] = uVar22;
                param_2[0x1d] = uVar25;
                param_2[0x1c] = uVar24;
                param_2[0x1f] = uVar27;
                param_2[0x1e] = uVar26;
              }
            }
          }
          param_2 = (undefined8 *)((long)param_2 + uVar17);
          if (uVar17 == uVar13) {
            puVar15 = param_2;
            goto code_r0x000f8c54;
          }
          uVar13 = (ulong)(uint)((int)uVar13 - (int)uVar17);
          puVar14 = (undefined8 *)((long)puVar14 + uVar17);
        }
        do {
          puVar15 = (undefined8 *)((long)param_2 + 1);
          *(undefined1 *)param_2 = *(undefined1 *)puVar14;
          uVar12 = (int)uVar13 - 1;
          uVar13 = (ulong)uVar12;
          puVar14 = (undefined8 *)((long)puVar14 + 1);
          param_2 = puVar15;
        } while (uVar12 != 0);
      }
    }
code_r0x000f8c54:
    *(undefined8 **)(unaff_x28 + 0xa0) = puVar15;
    unaff_x26 = (ushort *)((long)unaff_x26 + 3);
    param_2 = puVar15;
  } while( true );
  in_x11 = (ulong)(uVar12 - 0x7f);
  puVar14 = (undefined8 *)((long)param_2 + in_x11);
  if ((undefined8 *)((long)param_2 + in_x11) <= unaff_x25) goto code_r0x000f8904;
  goto LAB_000f8c28;
code_r0x000f8904:
  in_x13 = (ulong)*(byte *)((long)unaff_x26 + 1);
  param_1 = ~in_x13;
  goto code_r0x000f890c;
}

