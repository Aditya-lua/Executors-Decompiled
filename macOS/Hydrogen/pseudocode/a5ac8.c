
int FUN_000a5ac8(int param_1,ushort *param_2)

{
  uint uVar1;
  byte bVar2;
  ushort uVar3;
  ushort *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  byte *in_x9;
  undefined8 *in_x10;
  undefined8 *in_x11;
  long in_x12;
  ushort *in_x13;
  undefined8 *in_x14;
  undefined8 *in_x15;
  ushort *puVar14;
  ushort *puVar15;
  ushort *in_x16;
  undefined8 *puVar16;
  undefined8 *puVar17;
  ulong uVar18;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar19;
  ulong unaff_x23;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  
  while (puVar4 = (ushort *)((long)param_2 + 1), puVar4 <= in_x16) {
    uVar13 = (ulong)(byte)*param_2;
    puVar14 = puVar4;
    if (uVar13 == 0xff) {
      do {
        puVar4 = (ushort *)((long)puVar14 + 1);
        if (in_x16 < puVar4) goto LAB_000a5d24;
        uVar3 = *puVar14;
        uVar13 = uVar13 + (byte)uVar3;
        puVar14 = puVar4;
      } while ((ulong)(byte)uVar3 == 0xff);
    }
    uVar18 = uVar13 + 0xf;
    if ((uVar13 == 0xffffffffffffffff) || (CARRY8((ulong)unaff_x20,uVar18))) break;
    do {
      uVar18 = uVar18 + 4;
      if (in_x15 < in_x11) goto LAB_000a5d24;
      puVar12 = (undefined8 *)((long)unaff_x20 + uVar18);
      if (unaff_x23 < 8) {
        *(undefined4 *)unaff_x20 = 0;
        *(undefined1 *)unaff_x20 = *(undefined1 *)in_x15;
        *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)in_x15 + 1);
        *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)in_x15 + 2);
        *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)in_x15 + 3);
        uVar1 = *(uint *)(&UNK_0080bed8 + unaff_x23 * 4);
        *(undefined4 *)((long)unaff_x20 + 4) = *(undefined4 *)((long)in_x15 + (ulong)uVar1);
        puVar6 = (undefined8 *)
                 ((long)((long)in_x15 + (ulong)uVar1) -
                 (long)*(int *)(&UNK_0080bef8 + unaff_x23 * 4));
        if (puVar12 <= (undefined8 *)((long)in_x10 + -0xc)) goto LAB_000a5b34;
LAB_000a5cd8:
        puVar17 = unaff_x20 + 1;
        if ((undefined8 *)((long)in_x10 + -5) < puVar12) goto LAB_000a5d24;
        puVar16 = (undefined8 *)((long)in_x10 + -7);
        if (puVar17 < puVar16) {
          puVar9 = (undefined8 *)(unaff_x19 + in_x12 + -7);
          if (puVar9 <= unaff_x20 + 2) {
            puVar9 = unaff_x20 + 2;
          }
          uVar13 = (long)puVar9 + (-9 - (long)unaff_x20);
          puVar9 = puVar6;
          if (uVar13 < 0x38) {
            puVar7 = puVar17;
code_r0x000a5db0:
            do {
              puVar5 = puVar7 + 1;
              *puVar7 = *puVar9;
              puVar9 = puVar9 + 1;
              puVar7 = puVar5;
            } while (puVar5 < puVar16);
          }
          else {
            puVar7 = puVar17;
            if ((ulong)((long)unaff_x20 + (8 - (long)puVar6)) < 0x40) goto code_r0x000a5db0;
            uVar13 = (uVar13 >> 3) + 1;
            uVar11 = uVar13 & 0x3ffffffffffffff8;
            puVar9 = puVar6 + uVar11;
            puVar7 = puVar17 + uVar11;
            puVar5 = puVar6 + 4;
            puVar19 = unaff_x20 + 5;
            uVar8 = uVar11;
            do {
              uVar20 = puVar5[-4];
              uVar22 = puVar5[-1];
              uVar21 = puVar5[-2];
              uVar24 = puVar5[1];
              uVar23 = *puVar5;
              uVar26 = puVar5[3];
              uVar25 = puVar5[2];
              puVar19[-3] = puVar5[-3];
              puVar19[-4] = uVar20;
              puVar19[-1] = uVar22;
              puVar19[-2] = uVar21;
              puVar19[1] = uVar24;
              *puVar19 = uVar23;
              puVar19[3] = uVar26;
              puVar19[2] = uVar25;
              uVar8 = uVar8 - 8;
              puVar5 = puVar5 + 8;
              puVar19 = puVar19 + 8;
            } while (uVar8 != 0);
            if (uVar13 != uVar11) goto code_r0x000a5db0;
          }
          puVar9 = (undefined8 *)((long)puVar6 + ((long)puVar16 - (long)puVar17));
          puVar17 = puVar16;
        }
        else {
          puVar9 = puVar6;
        }
        if (puVar17 < puVar12) {
          puVar16 = (undefined8 *)(unaff_x19 + in_x12 + -7);
          if (puVar16 <= unaff_x20 + 1) {
            puVar16 = unaff_x20 + 1;
          }
          uVar13 = (long)unaff_x20 + (uVar18 - (long)puVar16);
          if ((uVar13 < 8) || ((ulong)((long)unaff_x20 + (8 - (long)puVar6)) < 0x40)) {
            puVar5 = puVar17;
            puVar7 = puVar9;
          }
          else {
            uVar18 = 0;
            if (0x3f < uVar13) {
              uVar18 = uVar13 & 0xffffffffffffffc0;
              puVar7 = puVar17 + 4;
              puVar5 = (undefined8 *)((long)puVar6 + (long)puVar16 + (0x18 - (long)unaff_x20));
              uVar8 = uVar18;
              do {
                uVar20 = puVar5[-4];
                uVar22 = puVar5[-1];
                uVar21 = puVar5[-2];
                uVar24 = puVar5[1];
                uVar23 = *puVar5;
                uVar26 = puVar5[3];
                uVar25 = puVar5[2];
                puVar7[-3] = puVar5[-3];
                puVar7[-4] = uVar20;
                puVar7[-1] = uVar22;
                puVar7[-2] = uVar21;
                puVar7[1] = uVar24;
                *puVar7 = uVar23;
                puVar7[3] = uVar26;
                puVar7[2] = uVar25;
                uVar8 = uVar8 - 0x40;
                puVar7 = puVar7 + 8;
                puVar5 = puVar5 + 8;
              } while (uVar8 != 0);
              if (uVar13 == uVar18) goto LAB_000a5b90;
              puVar7 = (undefined8 *)((long)puVar9 + uVar18);
              puVar5 = (undefined8 *)((long)puVar17 + uVar18);
              if ((uVar13 & 0x38) == 0) goto LAB_000a5e14;
            }
            uVar8 = uVar13 & 0xfffffffffffffff8;
            puVar5 = (undefined8 *)((long)puVar17 + uVar8);
            puVar7 = (undefined8 *)((long)puVar9 + uVar8);
            lVar10 = uVar18 - uVar8;
            puVar6 = (undefined8 *)((long)puVar6 + (long)puVar16 + (uVar18 - (long)unaff_x20) + -8);
            puVar17 = (undefined8 *)((long)puVar17 + uVar18);
            do {
              *puVar17 = *puVar6;
              lVar10 = lVar10 + 8;
              puVar6 = puVar6 + 1;
              puVar17 = puVar17 + 1;
            } while (lVar10 != 0);
            if (uVar13 == uVar8) goto LAB_000a5b90;
          }
LAB_000a5e14:
          do {
            puVar6 = (undefined8 *)((long)puVar5 + 1);
            *(undefined1 *)puVar5 = *(undefined1 *)puVar7;
            puVar5 = puVar6;
            puVar7 = (undefined8 *)((long)puVar7 + 1);
          } while (puVar6 < puVar12);
        }
      }
      else {
        puVar6 = in_x15 + 1;
        *unaff_x20 = *in_x15;
        if ((undefined8 *)((long)in_x10 + -0xc) < puVar12) goto LAB_000a5cd8;
LAB_000a5b34:
        unaff_x20[1] = *puVar6;
        if (0x10 < uVar18) {
          puVar17 = unaff_x20 + 2;
          puVar16 = (undefined8 *)(uVar18 + (long)unaff_x20);
          if ((undefined8 *)(uVar18 + (long)unaff_x20) <= unaff_x20 + 3) {
            puVar16 = unaff_x20 + 3;
          }
          uVar13 = (long)puVar16 + (-0x11 - (long)unaff_x20);
          if ((0x37 < uVar13) && (0x3f < (ulong)((long)unaff_x20 + (8 - (long)puVar6)))) {
            uVar13 = (uVar13 >> 3) + 1;
            uVar8 = uVar13 & 0x3ffffffffffffff8;
            puVar17 = puVar17 + uVar8;
            puVar16 = unaff_x20 + 4;
            uVar18 = uVar8;
            puVar9 = puVar6 + 5;
            do {
              uVar20 = puVar9[-4];
              uVar22 = puVar9[-1];
              uVar21 = puVar9[-2];
              uVar24 = puVar9[1];
              uVar23 = *puVar9;
              uVar26 = puVar9[3];
              uVar25 = puVar9[2];
              puVar16[-1] = puVar9[-3];
              puVar16[-2] = uVar20;
              puVar16[1] = uVar22;
              *puVar16 = uVar21;
              puVar16[3] = uVar24;
              puVar16[2] = uVar23;
              puVar16[5] = uVar26;
              puVar16[4] = uVar25;
              puVar16 = puVar16 + 8;
              uVar18 = uVar18 - 8;
              puVar9 = puVar9 + 8;
            } while (uVar18 != 0);
            puVar6 = puVar6 + uVar8;
            if (uVar13 == uVar8) goto LAB_000a5b90;
          }
          do {
            puVar16 = puVar17 + 1;
            *puVar17 = puVar6[1];
            puVar17 = puVar16;
            puVar6 = puVar6 + 1;
          } while (puVar16 < puVar12);
        }
      }
LAB_000a5b90:
      puVar14 = (ushort *)((long)puVar4 + 1);
      bVar2 = (byte)*puVar4;
      while( true ) {
        uVar13 = (ulong)(bVar2 >> 4);
        if (uVar13 == 0xf) break;
        if ((in_x13 <= puVar14) || (in_x14 < puVar12)) {
          unaff_x20 = (undefined8 *)((long)puVar12 + uVar13);
          puVar4 = puVar14;
          if (unaff_x20 <= (undefined8 *)((long)in_x10 + -0xc)) goto code_r0x000a5a10;
          goto code_r0x000a5bfc;
        }
        uVar20 = *(undefined8 *)puVar14;
        puVar12[1] = *(undefined8 *)(puVar14 + 4);
        *puVar12 = uVar20;
        puVar15 = (ushort *)((long)puVar14 + uVar13);
        uVar18 = (ulong)bVar2 & 0xf;
        puVar4 = puVar15 + 1;
        unaff_x23 = (ulong)*puVar15;
        unaff_x20 = (undefined8 *)((long)puVar12 + uVar13);
        in_x15 = (undefined8 *)((long)unaff_x20 - unaff_x23);
        if ((uVar18 == 0xf) || (*puVar15 < 8 || in_x15 < in_x11)) goto code_r0x000a5abc;
        *unaff_x20 = *in_x15;
        unaff_x20[1] = in_x15[1];
        *(undefined2 *)(unaff_x20 + 2) = *(undefined2 *)(in_x15 + 2);
        puVar12 = (undefined8 *)((long)unaff_x20 + uVar18 + 4);
        puVar14 = (ushort *)((long)puVar15 + 3);
        bVar2 = (byte)puVar15[1];
      }
      puVar15 = (ushort *)(in_x9 + -0xf);
      if (puVar15 <= puVar14) {
        puVar4 = puVar14;
        goto LAB_000a5d24;
      }
      puVar4 = puVar4 + 1;
      if (puVar15 < puVar4) goto LAB_000a5d24;
      uVar13 = (ulong)(byte)*puVar14;
      if (uVar13 == 0xff) {
        do {
          puVar14 = puVar4;
          puVar4 = (ushort *)((long)puVar14 + 1);
          if (puVar15 < puVar4) goto LAB_000a5d24;
          uVar13 = uVar13 + (byte)*puVar14;
        } while ((ulong)(byte)*puVar14 == 0xff);
        if (uVar13 == 0xffffffffffffffff) {
          puVar4 = (ushort *)((long)puVar14 + 1);
          goto LAB_000a5d24;
        }
      }
      uVar13 = uVar13 + 0xf;
      if ((CARRY8((ulong)puVar12,uVar13)) || (CARRY8((ulong)puVar4,uVar13))) goto LAB_000a5d24;
      unaff_x20 = (undefined8 *)((long)puVar12 + uVar13);
      if ((undefined8 *)((long)in_x10 + -0xc) < unaff_x20) {
code_r0x000a5bfc:
        if (((byte *)((long)puVar4 + uVar13) == in_x9) && (unaff_x20 <= in_x10)) {
          _memmove(puVar12);
          return (int)unaff_x20 - (int)unaff_x19;
        }
        goto LAB_000a5d24;
      }
code_r0x000a5a10:
      puVar14 = (ushort *)((long)puVar4 + uVar13);
      if (in_x9 + -8 < puVar14) goto code_r0x000a5bfc;
      puVar6 = (undefined8 *)(uVar13 + (long)puVar12);
      if ((undefined8 *)(uVar13 + (long)puVar12) <= puVar12 + 1) {
        puVar6 = puVar12 + 1;
      }
      if (((long)puVar6 + ~(ulong)puVar12 < 0x38) || ((ulong)((long)puVar12 - (long)puVar4) < 0x40))
      {
code_r0x000a5a9c:
        do {
          puVar6 = puVar12 + 1;
          *puVar12 = *(undefined8 *)puVar4;
          puVar4 = puVar4 + 4;
          puVar12 = puVar6;
        } while (puVar6 < unaff_x20);
      }
      else {
        uVar13 = ((long)puVar6 + ~(ulong)puVar12 >> 3) + 1;
        uVar8 = uVar13 & 0x3ffffffffffffff8;
        puVar15 = puVar4 + 0x10;
        uVar18 = uVar8;
        puVar6 = puVar12 + 4;
        do {
          uVar20 = *(undefined8 *)(puVar15 + -0x10);
          uVar22 = *(undefined8 *)(puVar15 + -4);
          uVar21 = *(undefined8 *)(puVar15 + -8);
          uVar24 = *(undefined8 *)(puVar15 + 4);
          uVar23 = *(undefined8 *)puVar15;
          uVar26 = *(undefined8 *)(puVar15 + 0xc);
          uVar25 = *(undefined8 *)(puVar15 + 8);
          puVar6[-3] = *(undefined8 *)(puVar15 + -0xc);
          puVar6[-4] = uVar20;
          puVar6[-1] = uVar22;
          puVar6[-2] = uVar21;
          puVar6[1] = uVar24;
          *puVar6 = uVar23;
          puVar6[3] = uVar26;
          puVar6[2] = uVar25;
          uVar18 = uVar18 - 8;
          puVar15 = puVar15 + 0x20;
          puVar6 = puVar6 + 8;
        } while (uVar18 != 0);
        puVar4 = puVar4 + uVar8 * 4;
        puVar12 = puVar12 + uVar8;
        if (uVar13 != uVar8) goto code_r0x000a5a9c;
      }
      puVar4 = puVar14 + 1;
      unaff_x23 = (ulong)*puVar14;
      in_x15 = (undefined8 *)((long)unaff_x20 - unaff_x23);
code_r0x000a5abc:
      uVar18 = (ulong)bVar2 & 0xf;
    } while (uVar18 != 0xf);
    in_x16 = (ushort *)(in_x9 + -4);
    param_2 = puVar4;
  }
LAB_000a5d24:
  return ~(uint)puVar4 + param_1;
}

