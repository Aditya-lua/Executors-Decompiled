
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000f8c08(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined2 *puVar3;
  int iVar4;
  byte bVar5;
  uint uVar6;
  bool bVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined2 uVar10;
  int iVar11;
  long lVar12;
  uint uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  ulong uVar16;
  undefined8 *in_x10;
  undefined8 *puVar17;
  ulong uVar18;
  ulong uVar19;
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
  
  do {
    unaff_x26 = (ushort *)((long)unaff_x26 + 5);
    puVar8 = in_x10;
code_r0x000f86ac:
    while( true ) {
      uVar10 = (undefined2)param_3;
      if (unaff_x25 < puVar8) goto code_r0x000f850c;
      bVar5 = (byte)*unaff_x26;
      uVar14 = (ulong)bVar5;
      uVar13 = (uint)bVar5;
      if (bVar5 < 0x20) break;
      uVar13 = (uint)bVar5;
      if ((char)bVar5 < '\0') {
        uVar13 = uVar13 - 0x7f;
        uVar14 = (ulong)uVar13;
        puVar17 = (undefined8 *)((long)puVar8 + uVar14);
        if (unaff_x25 < (undefined8 *)((long)puVar8 + uVar14)) {
code_r0x000f8c28:
          puVar8 = puVar17;
          *(undefined8 **)(unaff_x28 + 0xa0) = puVar8;
        }
        else {
          bVar5 = *(byte *)((long)unaff_x26 + 1);
          puVar15 = (undefined8 *)(~(ulong)bVar5 + (long)puVar8);
          puVar17 = unaff_x27;
          if (puVar15 < unaff_x22) goto code_r0x000f8c28;
          if (uVar13 != 0) {
            if ((0x3f < uVar13) && (0x3e < bVar5)) {
              uVar18 = uVar14 & 0xffffffc0;
              puVar17 = (undefined8 *)((long)puVar8 + uVar18);
              uVar16 = uVar18;
              do {
                puVar2 = (undefined8 *)((long)puVar8 + (0x2f - (ulong)bVar5));
                uVar21 = puVar2[-6];
                uVar23 = puVar2[-3];
                uVar22 = puVar2[-4];
                uVar25 = puVar2[-1];
                uVar24 = puVar2[-2];
                uVar27 = puVar2[1];
                uVar26 = *puVar2;
                puVar8[1] = puVar2[-5];
                *puVar8 = uVar21;
                puVar8[3] = uVar23;
                puVar8[2] = uVar22;
                puVar8[5] = uVar25;
                puVar8[4] = uVar24;
                puVar8[7] = uVar27;
                puVar8[6] = uVar26;
                puVar8 = puVar8 + 8;
                uVar16 = uVar16 - 0x40;
              } while (uVar16 != 0);
              bVar7 = uVar18 == uVar14;
              puVar15 = (undefined8 *)((long)puVar15 + uVar18);
              puVar8 = puVar17;
              uVar14 = (ulong)(uVar13 - (int)uVar18);
              if (bVar7) goto code_r0x000f8c28;
            }
            do {
              *(undefined1 *)puVar8 = *(undefined1 *)puVar15;
              uVar13 = (int)uVar14 - 1;
              uVar14 = (ulong)uVar13;
              puVar15 = (undefined8 *)((long)puVar15 + 1);
              puVar17 = (undefined8 *)((long)puVar8 + 1U);
              puVar8 = (undefined8 *)((long)puVar8 + 1U);
            } while (uVar13 != 0);
            goto code_r0x000f8c28;
          }
        }
        unaff_x26 = unaff_x26 + 1;
      }
      else if (uVar13 < 0x40) {
        param_3 = (ulong)(uVar13 - 0x1f);
        puVar17 = (undefined8 *)((long)puVar8 + param_3);
        if (unaff_x25 < puVar17) {
code_r0x000f89a8:
          puVar8 = puVar17;
        }
        else {
          puVar8 = unaff_x27;
          if (unaff_x24 <= (ushort *)((long)unaff_x26 + 1U)) {
            _memcpy();
            in_w17 = -0x17ffff;
            uVar14 = (ulong)(byte)*unaff_x26;
            goto code_r0x000f89a8;
          }
        }
        uVar10 = (undefined2)param_3;
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar8;
        lVar12 = uVar14 - 0x1e;
joined_r0x000f89bc:
        if (lVar12 == 0) {
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
            uStack0000000000000040 = (undefined6)((ulong)*(undefined8 *)(unaff_x23 + 0x88) >> 0x10);
            uStack0000000000000038 = (undefined6)*(undefined8 *)(unaff_x23 + 0x82);
            uStack000000000000003e = (undefined2)((ulong)*(undefined8 *)(unaff_x23 + 0x82) >> 0x30);
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
          lVar12 = (long)Var28;
          iVar11 = *(int *)(lVar12 + 0x68);
          if (iVar11 == *(int *)(lVar12 + 0x6c)) {
            iVar4 = iVar11;
            if (iVar11 < 0) {
              iVar4 = iVar11 + 1;
            }
            uVar13 = 8;
            if (iVar11 != 0) {
              uVar13 = iVar11 + (iVar4 >> 1);
            }
            if ((int)uVar13 <= (int)(iVar11 + 1U)) {
              uVar13 = iVar11 + 1U;
            }
            lVar9 = func_0x000b810c(-(ulong)(uVar13 >> 0x1f) & 0xffffffe000000000 |
                                    (ulong)uVar13 << 5);
            if (*(long *)(lVar12 + 0x70) != 0) {
              _memcpy(lVar9,*(long *)(lVar12 + 0x70),(long)*(int *)(lVar12 + 0x68) << 5);
              func_0x000b83d4(*(undefined8 *)(lVar12 + 0x70));
            }
            *(long *)(lVar12 + 0x70) = lVar9;
            *(uint *)(lVar12 + 0x6c) = uVar13;
            iVar11 = *(int *)(lVar12 + 0x68);
          }
          else {
            lVar9 = *(long *)(lVar12 + 0x70);
          }
          puVar3 = (undefined2 *)(lVar9 + (long)iVar11 * 0x20);
          *puVar3 = (short)((unkuint10)Var28 >> 0x40);
          puVar3[1] = uVar10;
          *(undefined4 *)(puVar3 + 2) = 0xffffffff;
          *(undefined8 *)(puVar3 + 8) = 0;
          *(undefined8 *)(puVar3 + 0xc) = 0;
          *(undefined8 *)(puVar3 + 4) = 0;
          *(int *)(lVar12 + 0x68) = *(int *)(lVar12 + 0x68) + 1;
          return;
        }
        unaff_x26 = (ushort *)((long)unaff_x26 + lVar12);
      }
      else {
        uVar14 = (ulong)(byte)unaff_x26[1] + 1;
        puVar17 = (undefined8 *)((long)puVar8 + uVar14);
        if ((undefined8 *)((long)puVar8 + uVar14) <= unaff_x25) {
          uVar13 = CONCAT11(bVar5,*(byte *)((long)unaff_x26 + 1)) - 0x3fff;
          puVar15 = (undefined8 *)((long)puVar8 - (ulong)uVar13);
          puVar17 = unaff_x27;
          if (unaff_x22 <= puVar15) {
            if ((0x3e < (byte)unaff_x26[1]) && (0x3f < uVar13)) {
              uVar16 = uVar14 & 0x1c0;
              uVar21 = *puVar15;
              uVar23 = puVar15[3];
              uVar22 = puVar15[2];
              uVar25 = puVar15[5];
              uVar24 = puVar15[4];
              uVar27 = puVar15[7];
              uVar26 = puVar15[6];
              puVar8[1] = puVar15[1];
              *puVar8 = uVar21;
              puVar8[3] = uVar23;
              puVar8[2] = uVar22;
              puVar8[5] = uVar25;
              puVar8[4] = uVar24;
              puVar8[7] = uVar27;
              puVar8[6] = uVar26;
              if (uVar16 != 0x40) {
                uVar21 = puVar15[8];
                uVar23 = puVar15[0xb];
                uVar22 = puVar15[10];
                uVar25 = puVar15[0xd];
                uVar24 = puVar15[0xc];
                uVar27 = puVar15[0xf];
                uVar26 = puVar15[0xe];
                puVar8[9] = puVar15[9];
                puVar8[8] = uVar21;
                puVar8[0xb] = uVar23;
                puVar8[10] = uVar22;
                puVar8[0xd] = uVar25;
                puVar8[0xc] = uVar24;
                puVar8[0xf] = uVar27;
                puVar8[0xe] = uVar26;
                if (uVar16 != 0x80) {
                  uVar21 = puVar15[0x10];
                  uVar23 = puVar15[0x13];
                  uVar22 = puVar15[0x12];
                  uVar25 = puVar15[0x15];
                  uVar24 = puVar15[0x14];
                  uVar27 = puVar15[0x17];
                  uVar26 = puVar15[0x16];
                  puVar8[0x11] = puVar15[0x11];
                  puVar8[0x10] = uVar21;
                  puVar8[0x13] = uVar23;
                  puVar8[0x12] = uVar22;
                  puVar8[0x15] = uVar25;
                  puVar8[0x14] = uVar24;
                  puVar8[0x17] = uVar27;
                  puVar8[0x16] = uVar26;
                  if (uVar16 != 0xc0) {
                    uVar21 = puVar15[0x18];
                    uVar23 = puVar15[0x1b];
                    uVar22 = puVar15[0x1a];
                    uVar25 = puVar15[0x1d];
                    uVar24 = puVar15[0x1c];
                    uVar27 = puVar15[0x1f];
                    uVar26 = puVar15[0x1e];
                    puVar8[0x19] = puVar15[0x19];
                    puVar8[0x18] = uVar21;
                    puVar8[0x1b] = uVar23;
                    puVar8[0x1a] = uVar22;
                    puVar8[0x1d] = uVar25;
                    puVar8[0x1c] = uVar24;
                    puVar8[0x1f] = uVar27;
                    puVar8[0x1e] = uVar26;
                  }
                }
              }
              puVar8 = (undefined8 *)((long)puVar8 + uVar16);
              if (uVar16 == uVar14) {
                puVar17 = puVar8;
                goto code_r0x000f8c54;
              }
              uVar14 = (ulong)(uint)((int)uVar14 - (int)uVar16);
              puVar15 = (undefined8 *)((long)puVar15 + uVar16);
            }
            do {
              puVar17 = (undefined8 *)((long)puVar8 + 1);
              *(undefined1 *)puVar8 = *(undefined1 *)puVar15;
              uVar13 = (int)uVar14 - 1;
              uVar14 = (ulong)uVar13;
              puVar15 = (undefined8 *)((long)puVar15 + 1);
              puVar8 = puVar17;
            } while (uVar13 != 0);
          }
        }
code_r0x000f8c54:
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar17;
        unaff_x26 = (ushort *)((long)unaff_x26 + 3);
        puVar8 = puVar17;
      }
    }
    if (0x17 < bVar5) {
      uVar14 = (ulong)*(byte *)((long)unaff_x26 + 3) + 1;
      puVar17 = (undefined8 *)((long)puVar8 + uVar14);
      if ((undefined8 *)((long)puVar8 + uVar14) <= unaff_x25) {
        uVar13 = ((uint)(byte)unaff_x26[1] | uVar13 << 0x10 |
                 (uint)*(byte *)((long)unaff_x26 + 1) << 8) + in_w17;
        puVar15 = (undefined8 *)((long)puVar8 - (ulong)uVar13);
        puVar17 = unaff_x27;
        if (unaff_x22 <= puVar15) {
          if ((0x3e < *(byte *)((long)unaff_x26 + 3)) && (0x3f < uVar13)) {
            uVar16 = uVar14 & 0x1c0;
            uVar21 = *puVar15;
            uVar23 = puVar15[3];
            uVar22 = puVar15[2];
            uVar25 = puVar15[5];
            uVar24 = puVar15[4];
            uVar27 = puVar15[7];
            uVar26 = puVar15[6];
            puVar8[1] = puVar15[1];
            *puVar8 = uVar21;
            puVar8[3] = uVar23;
            puVar8[2] = uVar22;
            puVar8[5] = uVar25;
            puVar8[4] = uVar24;
            puVar8[7] = uVar27;
            puVar8[6] = uVar26;
            if (uVar16 != 0x40) {
              uVar21 = puVar15[8];
              uVar23 = puVar15[0xb];
              uVar22 = puVar15[10];
              uVar25 = puVar15[0xd];
              uVar24 = puVar15[0xc];
              uVar27 = puVar15[0xf];
              uVar26 = puVar15[0xe];
              puVar8[9] = puVar15[9];
              puVar8[8] = uVar21;
              puVar8[0xb] = uVar23;
              puVar8[10] = uVar22;
              puVar8[0xd] = uVar25;
              puVar8[0xc] = uVar24;
              puVar8[0xf] = uVar27;
              puVar8[0xe] = uVar26;
              if (uVar16 != 0x80) {
                uVar21 = puVar15[0x10];
                uVar23 = puVar15[0x13];
                uVar22 = puVar15[0x12];
                uVar25 = puVar15[0x15];
                uVar24 = puVar15[0x14];
                uVar27 = puVar15[0x17];
                uVar26 = puVar15[0x16];
                puVar8[0x11] = puVar15[0x11];
                puVar8[0x10] = uVar21;
                puVar8[0x13] = uVar23;
                puVar8[0x12] = uVar22;
                puVar8[0x15] = uVar25;
                puVar8[0x14] = uVar24;
                puVar8[0x17] = uVar27;
                puVar8[0x16] = uVar26;
                if (uVar16 != 0xc0) {
                  uVar21 = puVar15[0x18];
                  uVar23 = puVar15[0x1b];
                  uVar22 = puVar15[0x1a];
                  uVar25 = puVar15[0x1d];
                  uVar24 = puVar15[0x1c];
                  uVar27 = puVar15[0x1f];
                  uVar26 = puVar15[0x1e];
                  puVar8[0x19] = puVar15[0x19];
                  puVar8[0x18] = uVar21;
                  puVar8[0x1b] = uVar23;
                  puVar8[0x1a] = uVar22;
                  puVar8[0x1d] = uVar25;
                  puVar8[0x1c] = uVar24;
                  puVar8[0x1f] = uVar27;
                  puVar8[0x1e] = uVar26;
                }
              }
            }
            puVar8 = (undefined8 *)((long)puVar8 + uVar16);
            if (uVar16 == uVar14) {
              puVar17 = puVar8;
              goto code_r0x000f86a0;
            }
            uVar14 = (ulong)(uint)((int)uVar14 - (int)uVar16);
            puVar15 = (undefined8 *)((long)puVar15 + uVar16);
          }
          do {
            puVar17 = (undefined8 *)((long)puVar8 + 1);
            *(undefined1 *)puVar8 = *(undefined1 *)puVar15;
            uVar13 = (int)uVar14 - 1;
            uVar14 = (ulong)uVar13;
            puVar15 = (undefined8 *)((long)puVar15 + 1);
            puVar8 = puVar17;
          } while (uVar13 != 0);
        }
      }
code_r0x000f86a0:
      *(undefined8 **)(unaff_x28 + 0xa0) = puVar17;
      unaff_x26 = unaff_x26 + 2;
      puVar8 = puVar17;
      goto code_r0x000f86ac;
    }
    if (uVar13 < 0x10) {
      if (7 < uVar13) {
        uVar13 = (uint)CONCAT11(bVar5,*(byte *)((long)unaff_x26 + 1));
        param_3 = (ulong)(uVar13 - 0x7ff);
        puVar17 = (undefined8 *)((long)puVar8 + param_3);
        if (unaff_x25 < puVar17) {
code_r0x000f8a08:
          puVar8 = puVar17;
        }
        else {
          puVar8 = unaff_x27;
          if (unaff_x24 <= unaff_x26 + 1) {
            _memcpy();
            in_w17 = -0x17ffff;
            uVar13 = (uint)(*unaff_x26 >> 8) | (*unaff_x26 & 0xff00ff) << 8;
            goto code_r0x000f8a08;
          }
        }
        uVar10 = (undefined2)param_3;
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar8;
        lVar12 = (long)(int)(uVar13 - 0x7fd);
        goto joined_r0x000f89bc;
      }
      if (uVar13 == 4) {
        uVar1 = (uint)(unaff_x26[2] >> 8) | (unaff_x26[2] & 0xff00ff) << 8;
        uVar13 = uVar1 + 1;
        uVar14 = (ulong)uVar13;
        puVar17 = (undefined8 *)((long)puVar8 + uVar14);
        if ((undefined8 *)((long)puVar8 + uVar14) <= unaff_x25) {
          uVar16 = (ulong)*(byte *)((long)unaff_x26 + 3) |
                   (ulong)*(byte *)((long)unaff_x26 + 1) << 0x10 | (ulong)(byte)unaff_x26[1] << 8;
          puVar15 = (undefined8 *)((long)puVar8 + ~uVar16);
          puVar17 = unaff_x27;
          if (unaff_x22 <= puVar15) {
            if ((0x3e < uVar1) && (0x3e < uVar16)) {
              uVar19 = uVar14 & 0x1ffc0;
              puVar17 = (undefined8 *)((long)puVar8 + uVar19);
              puVar20 = (undefined1 *)((long)puVar8 + 0x1f);
              uVar18 = uVar19;
              do {
                puVar8 = (undefined8 *)(puVar20 + -uVar16);
                uVar21 = puVar8[-4];
                uVar23 = puVar8[-1];
                uVar22 = puVar8[-2];
                uVar25 = puVar8[1];
                uVar24 = *puVar8;
                uVar27 = puVar8[3];
                uVar26 = puVar8[2];
                *(undefined8 *)(puVar20 + -0x17) = puVar8[-3];
                *(undefined8 *)(puVar20 + -0x1f) = uVar21;
                *(undefined8 *)(puVar20 + -7) = uVar23;
                *(undefined8 *)(puVar20 + -0xf) = uVar22;
                *(undefined8 *)(puVar20 + 9) = uVar25;
                *(undefined8 *)(puVar20 + 1) = uVar24;
                *(undefined8 *)(puVar20 + 0x19) = uVar27;
                *(undefined8 *)(puVar20 + 0x11) = uVar26;
                puVar20 = puVar20 + 0x40;
                uVar18 = uVar18 - 0x40;
              } while (uVar18 != 0);
              bVar7 = uVar19 == uVar14;
              puVar15 = (undefined8 *)((long)puVar15 + uVar19);
              puVar8 = puVar17;
              uVar14 = (ulong)(uVar13 - (int)uVar19);
              if (bVar7) goto code_r0x000f8c78;
            }
            do {
              puVar17 = (undefined8 *)((long)puVar8 + 1);
              *(undefined1 *)puVar8 = *(undefined1 *)puVar15;
              uVar13 = (int)uVar14 - 1;
              uVar14 = (ulong)uVar13;
              puVar15 = (undefined8 *)((long)puVar15 + 1);
              puVar8 = puVar17;
            } while (uVar13 != 0);
          }
        }
code_r0x000f8c78:
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar17;
        unaff_x26 = unaff_x26 + 3;
        puVar8 = puVar17;
      }
      else {
        if (uVar13 == 6) {
          uVar14 = (ulong)(byte)unaff_x26[2] + 1;
          in_x10 = (undefined8 *)((long)puVar8 + uVar14);
          if (unaff_x25 < (undefined8 *)((long)puVar8 + uVar14)) goto code_r0x000f8c04;
          uVar16 = (ulong)*(byte *)((long)unaff_x26 + 3) |
                   (ulong)*(byte *)((long)unaff_x26 + 1) << 0x10 | (ulong)(byte)unaff_x26[1] << 8;
          puVar17 = (undefined8 *)((long)puVar8 + ~uVar16);
          in_x10 = unaff_x27;
          if (puVar17 < unaff_x22) goto code_r0x000f8c04;
          if ((0x3e < (byte)unaff_x26[2]) && (0x3e < uVar16)) {
            uVar16 = uVar14 & 0x1c0;
            uVar21 = *puVar17;
            uVar23 = puVar17[3];
            uVar22 = puVar17[2];
            uVar25 = puVar17[5];
            uVar24 = puVar17[4];
            uVar27 = puVar17[7];
            uVar26 = puVar17[6];
            puVar8[1] = puVar17[1];
            *puVar8 = uVar21;
            puVar8[3] = uVar23;
            puVar8[2] = uVar22;
            puVar8[5] = uVar25;
            puVar8[4] = uVar24;
            puVar8[7] = uVar27;
            puVar8[6] = uVar26;
            if (uVar16 != 0x40) {
              uVar21 = puVar17[8];
              uVar23 = puVar17[0xb];
              uVar22 = puVar17[10];
              uVar25 = puVar17[0xd];
              uVar24 = puVar17[0xc];
              uVar27 = puVar17[0xf];
              uVar26 = puVar17[0xe];
              puVar8[9] = puVar17[9];
              puVar8[8] = uVar21;
              puVar8[0xb] = uVar23;
              puVar8[10] = uVar22;
              puVar8[0xd] = uVar25;
              puVar8[0xc] = uVar24;
              puVar8[0xf] = uVar27;
              puVar8[0xe] = uVar26;
              if (uVar16 != 0x80) {
                uVar21 = puVar17[0x10];
                uVar23 = puVar17[0x13];
                uVar22 = puVar17[0x12];
                uVar25 = puVar17[0x15];
                uVar24 = puVar17[0x14];
                uVar27 = puVar17[0x17];
                uVar26 = puVar17[0x16];
                puVar8[0x11] = puVar17[0x11];
                puVar8[0x10] = uVar21;
                puVar8[0x13] = uVar23;
                puVar8[0x12] = uVar22;
                puVar8[0x15] = uVar25;
                puVar8[0x14] = uVar24;
                puVar8[0x17] = uVar27;
                puVar8[0x16] = uVar26;
                if (uVar16 != 0xc0) {
                  uVar21 = puVar17[0x18];
                  uVar23 = puVar17[0x1b];
                  uVar22 = puVar17[0x1a];
                  uVar25 = puVar17[0x1d];
                  uVar24 = puVar17[0x1c];
                  uVar27 = puVar17[0x1f];
                  uVar26 = puVar17[0x1e];
                  puVar8[0x19] = puVar17[0x19];
                  puVar8[0x18] = uVar21;
                  puVar8[0x1b] = uVar23;
                  puVar8[0x1a] = uVar22;
                  puVar8[0x1d] = uVar25;
                  puVar8[0x1c] = uVar24;
                  puVar8[0x1f] = uVar27;
                  puVar8[0x1e] = uVar26;
                }
              }
            }
            puVar8 = (undefined8 *)((long)puVar8 + uVar16);
            if (uVar16 == uVar14) {
              in_x10 = puVar8;
              goto code_r0x000f8c04;
            }
            uVar14 = (ulong)(uint)((int)uVar14 - (int)uVar16);
            puVar17 = (undefined8 *)((long)puVar17 + uVar16);
          }
          do {
            in_x10 = (undefined8 *)((long)puVar8 + 1);
            *(undefined1 *)puVar8 = *(undefined1 *)puVar17;
            uVar13 = (int)uVar14 - 1;
            uVar14 = (ulong)uVar13;
            puVar17 = (undefined8 *)((long)puVar17 + 1);
            puVar8 = in_x10;
          } while (uVar13 != 0);
          goto code_r0x000f8c04;
        }
        if (uVar13 != 7) goto code_r0x000f850c;
        uVar14 = (ulong)((uint)(*(ushort *)((long)unaff_x26 + 1) >> 8) |
                        (*(ushort *)((long)unaff_x26 + 1) & 0xff00ff) << 8);
        param_3 = uVar14 + 1;
        puVar17 = (undefined8 *)((long)puVar8 + param_3);
        if (unaff_x25 < puVar17) {
code_r0x000f8a7c:
          puVar8 = puVar17;
        }
        else {
          puVar8 = unaff_x27;
          if (unaff_x24 <= (ushort *)((long)unaff_x26 + 3U)) {
            _memcpy();
            in_w17 = -0x17ffff;
            uVar14 = (ulong)((uint)(*(ushort *)((long)unaff_x26 + 1) >> 8) |
                            (*(ushort *)((long)unaff_x26 + 1) & 0xff00ff) << 8);
            goto code_r0x000f8a7c;
          }
        }
        *(undefined8 **)(unaff_x28 + 0xa0) = puVar8;
        unaff_x26 = (ushort *)((long)unaff_x26 + uVar14 + 4);
      }
      goto code_r0x000f86ac;
    }
    uVar6 = (uint)(*(ushort *)((long)unaff_x26 + 3) >> 8) |
            (*(ushort *)((long)unaff_x26 + 3) & 0xff00ff) << 8;
    uVar1 = uVar6 + 1;
    uVar14 = (ulong)uVar1;
    in_x10 = (undefined8 *)((long)puVar8 + uVar14);
    if ((undefined8 *)((long)puVar8 + uVar14) <= unaff_x25) {
      uVar13 = ((uint)(byte)unaff_x26[1] | uVar13 << 0x10 |
               (uint)*(byte *)((long)unaff_x26 + 1) << 8) - 0xfffff;
      puVar17 = (undefined8 *)((long)puVar8 - (ulong)uVar13);
      in_x10 = unaff_x27;
      if (unaff_x22 <= puVar17) {
        if ((0x3e < uVar6) && (0x3f < uVar13)) {
          uVar18 = uVar14 & 0x1ffc0;
          in_x10 = (undefined8 *)((long)puVar8 + uVar18);
          puVar8 = puVar8 + 4;
          uVar16 = uVar18;
          do {
            puVar15 = (undefined8 *)((long)puVar8 - (ulong)uVar13);
            uVar21 = puVar15[-4];
            uVar23 = puVar15[-1];
            uVar22 = puVar15[-2];
            uVar25 = puVar15[1];
            uVar24 = *puVar15;
            uVar27 = puVar15[3];
            uVar26 = puVar15[2];
            puVar8[-3] = puVar15[-3];
            puVar8[-4] = uVar21;
            puVar8[-1] = uVar23;
            puVar8[-2] = uVar22;
            puVar8[1] = uVar25;
            *puVar8 = uVar24;
            puVar8[3] = uVar27;
            puVar8[2] = uVar26;
            uVar16 = uVar16 - 0x40;
            puVar8 = puVar8 + 8;
          } while (uVar16 != 0);
          bVar7 = uVar18 == uVar14;
          puVar17 = (undefined8 *)((long)puVar17 + uVar18);
          uVar14 = (ulong)(uVar1 - (int)uVar18);
          puVar8 = in_x10;
          if (bVar7) goto code_r0x000f8c04;
        }
        do {
          *(undefined1 *)puVar8 = *(undefined1 *)puVar17;
          uVar13 = (int)uVar14 - 1;
          uVar14 = (ulong)uVar13;
          puVar17 = (undefined8 *)((long)puVar17 + 1);
          in_x10 = (undefined8 *)((long)puVar8 + 1U);
          puVar8 = (undefined8 *)((long)puVar8 + 1U);
        } while (uVar13 != 0);
      }
    }
code_r0x000f8c04:
    *(undefined8 **)(unaff_x28 + 0xa0) = in_x10;
  } while( true );
}

