
int FUN_000a5e98(undefined8 *param_1,int param_2,ushort *param_3,undefined8 *param_4,
                undefined8 param_5,undefined8 param_6,undefined8 *param_7,ulong param_8,
                ulong param_9)

{
  uint uVar1;
  byte bVar2;
  ushort uVar3;
  ushort *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *puVar10;
  ulong uVar11;
  byte *in_x9;
  undefined8 *in_x10;
  undefined8 *in_x11;
  long in_x12;
  ushort *in_x13;
  undefined8 *in_x14;
  undefined8 *puVar12;
  ushort *puVar13;
  undefined8 *puVar14;
  undefined8 *in_x15;
  ushort *puVar15;
  undefined8 *in_x16;
  ulong uVar16;
  ulong in_x17;
  long unaff_x19;
  undefined8 *puVar17;
  ulong uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  
code_r0x000a5e98:
  lVar9 = param_8 - param_9;
  puVar6 = (undefined8 *)((long)in_x16 + param_8);
  do {
    *puVar6 = *in_x15;
    lVar9 = lVar9 + 8;
    in_x15 = in_x15 + 1;
    puVar6 = puVar6 + 1;
  } while (lVar9 != 0);
  puVar4 = param_3;
  if (in_x17 != param_9) goto LAB_000a5e14;
LAB_000a5b90:
  do {
    puVar13 = (ushort *)((long)puVar4 + 1);
    bVar2 = (byte)*puVar4;
    while( true ) {
      uVar5 = (ulong)(bVar2 >> 4);
      param_3 = puVar13;
      if (uVar5 == 0xf) break;
      if ((in_x13 <= puVar13) || (in_x14 < param_1)) {
        puVar6 = (undefined8 *)((long)param_1 + uVar5);
        if (puVar6 <= (undefined8 *)((long)in_x10 + -0xc)) goto code_r0x000a5a10;
        goto code_r0x000a5bfc;
      }
      uVar19 = *(undefined8 *)puVar13;
      param_1[1] = *(undefined8 *)(puVar13 + 4);
      *param_1 = uVar19;
      puVar15 = (ushort *)((long)puVar13 + uVar5);
      uVar16 = (ulong)bVar2 & 0xf;
      puVar4 = puVar15 + 1;
      uVar18 = (ulong)*puVar15;
      puVar6 = (undefined8 *)((long)param_1 + uVar5);
      puVar12 = (undefined8 *)((long)puVar6 - uVar18);
      if ((uVar16 == 0xf) || (*puVar15 < 8 || puVar12 < in_x11)) goto code_r0x000a5abc;
      *puVar6 = *puVar12;
      puVar6[1] = puVar12[1];
      *(undefined2 *)(puVar6 + 2) = *(undefined2 *)(puVar12 + 2);
      param_1 = (undefined8 *)((long)puVar6 + uVar16 + 4);
      puVar13 = (ushort *)((long)puVar15 + 3);
      bVar2 = (byte)puVar15[1];
    }
    puVar15 = (ushort *)(in_x9 + -0xf);
    if (puVar15 <= puVar13) goto code_r0x000a5d24;
    param_3 = puVar4 + 1;
    if (puVar15 < param_3) goto code_r0x000a5d24;
    uVar5 = (ulong)(byte)*puVar13;
    if (uVar5 == 0xff) {
      do {
        puVar4 = param_3;
        param_3 = (ushort *)((long)puVar4 + 1);
        if (puVar15 < param_3) goto code_r0x000a5d24;
        uVar5 = uVar5 + (byte)*puVar4;
      } while ((ulong)(byte)*puVar4 == 0xff);
      if (uVar5 == 0xffffffffffffffff) {
        param_3 = (ushort *)((long)puVar4 + 1);
        goto code_r0x000a5d24;
      }
    }
    uVar5 = uVar5 + 0xf;
    if ((CARRY8((ulong)param_1,uVar5)) || (CARRY8((ulong)param_3,uVar5))) goto code_r0x000a5d24;
    puVar6 = (undefined8 *)((long)param_1 + uVar5);
    if ((undefined8 *)((long)in_x10 + -0xc) < puVar6) {
code_r0x000a5bfc:
      if (((byte *)((long)param_3 + uVar5) == in_x9) && (puVar6 <= in_x10)) {
        _memmove(param_1);
        return (int)puVar6 - (int)unaff_x19;
      }
code_r0x000a5d24:
      return ~(uint)param_3 + param_2;
    }
code_r0x000a5a10:
    puVar13 = (ushort *)((long)param_3 + uVar5);
    if (in_x9 + -8 < puVar13) goto code_r0x000a5bfc;
    puVar12 = (undefined8 *)(uVar5 + (long)param_1);
    if ((undefined8 *)(uVar5 + (long)param_1) <= param_1 + 1) {
      puVar12 = param_1 + 1;
    }
    if (((long)puVar12 + ~(ulong)param_1 < 0x38) || ((ulong)((long)param_1 - (long)param_3) < 0x40))
    {
code_r0x000a5a9c:
      do {
        puVar12 = param_1 + 1;
        *param_1 = *(undefined8 *)param_3;
        param_3 = param_3 + 4;
        param_1 = puVar12;
      } while (puVar12 < puVar6);
    }
    else {
      uVar5 = ((long)puVar12 + ~(ulong)param_1 >> 3) + 1;
      uVar16 = uVar5 & 0x3ffffffffffffff8;
      puVar4 = param_3 + 0x10;
      uVar18 = uVar16;
      puVar12 = param_1 + 4;
      do {
        uVar19 = *(undefined8 *)(puVar4 + -0x10);
        uVar21 = *(undefined8 *)(puVar4 + -4);
        uVar20 = *(undefined8 *)(puVar4 + -8);
        uVar23 = *(undefined8 *)(puVar4 + 4);
        uVar22 = *(undefined8 *)puVar4;
        uVar25 = *(undefined8 *)(puVar4 + 0xc);
        uVar24 = *(undefined8 *)(puVar4 + 8);
        puVar12[-3] = *(undefined8 *)(puVar4 + -0xc);
        puVar12[-4] = uVar19;
        puVar12[-1] = uVar21;
        puVar12[-2] = uVar20;
        puVar12[1] = uVar23;
        *puVar12 = uVar22;
        puVar12[3] = uVar25;
        puVar12[2] = uVar24;
        uVar18 = uVar18 - 8;
        puVar4 = puVar4 + 0x20;
        puVar12 = puVar12 + 8;
      } while (uVar18 != 0);
      param_3 = param_3 + uVar16 * 4;
      param_1 = param_1 + uVar16;
      if (uVar5 != uVar16) goto code_r0x000a5a9c;
    }
    puVar4 = puVar13 + 1;
    uVar18 = (ulong)*puVar13;
    puVar12 = (undefined8 *)((long)puVar6 - uVar18);
code_r0x000a5abc:
    uVar5 = (ulong)bVar2 & 0xf;
    param_3 = puVar4;
    if (uVar5 == 0xf) {
      param_3 = (ushort *)((long)puVar4 + 1);
      if (in_x9 + -4 < param_3) {
        goto code_r0x000a5d24;
      }
      uVar16 = (ulong)(byte)*puVar4;
      puVar4 = param_3;
      if (uVar16 == 0xff) {
        do {
          param_3 = (ushort *)((long)puVar4 + 1);
          if (in_x9 + -4 < param_3) goto code_r0x000a5d24;
          uVar3 = *puVar4;
          uVar16 = uVar16 + (byte)uVar3;
          puVar4 = param_3;
        } while ((ulong)(byte)uVar3 == 0xff);
      }
      uVar5 = uVar16 + 0xf;
      if ((uVar16 == 0xffffffffffffffff) || (CARRY8((ulong)puVar6,uVar5))) goto code_r0x000a5d24;
    }
    uVar5 = uVar5 + 4;
    if (puVar12 < in_x11) goto code_r0x000a5d24;
    param_1 = (undefined8 *)((long)puVar6 + uVar5);
    puVar4 = param_3;
    if (uVar18 < 8) {
      *(undefined4 *)puVar6 = 0;
      *(undefined1 *)puVar6 = *(undefined1 *)puVar12;
      *(undefined1 *)((long)puVar6 + 1) = *(undefined1 *)((long)puVar12 + 1);
      *(undefined1 *)((long)puVar6 + 2) = *(undefined1 *)((long)puVar12 + 2);
      *(undefined1 *)((long)puVar6 + 3) = *(undefined1 *)((long)puVar12 + 3);
      uVar1 = *(uint *)(&UNK_0080bed8 + uVar18 * 4);
      *(undefined4 *)((long)puVar6 + 4) = *(undefined4 *)((long)puVar12 + (ulong)uVar1);
      puVar14 = (undefined8 *)
                ((long)((long)puVar12 + (ulong)uVar1) - (long)*(int *)(&UNK_0080bef8 + uVar18 * 4));
      if (param_1 <= (undefined8 *)((long)in_x10 + -0xc)) goto code_r0x000a5b34;
code_r0x000a5cd8:
      in_x16 = puVar6 + 1;
      if ((undefined8 *)((long)in_x10 + -5) < param_1) goto code_r0x000a5d24;
      puVar12 = (undefined8 *)((long)in_x10 + -7);
      if (in_x16 < puVar12) {
        puVar8 = (undefined8 *)(unaff_x19 + in_x12 + -7);
        if (puVar8 <= puVar6 + 2) {
          puVar8 = puVar6 + 2;
        }
        uVar18 = (long)puVar8 + (-9 - (long)puVar6);
        puVar8 = puVar14;
        if (uVar18 < 0x38) {
          puVar7 = in_x16;
code_r0x000a5db0:
          do {
            puVar10 = puVar7 + 1;
            *puVar7 = *puVar8;
            puVar8 = puVar8 + 1;
            puVar7 = puVar10;
          } while (puVar10 < puVar12);
        }
        else {
          puVar7 = in_x16;
          if ((ulong)((long)puVar6 + (8 - (long)puVar14)) < 0x40) goto code_r0x000a5db0;
          uVar18 = (uVar18 >> 3) + 1;
          uVar11 = uVar18 & 0x3ffffffffffffff8;
          puVar8 = puVar14 + uVar11;
          puVar7 = in_x16 + uVar11;
          puVar10 = puVar14 + 4;
          puVar17 = puVar6 + 5;
          uVar16 = uVar11;
          do {
            uVar19 = puVar10[-4];
            uVar21 = puVar10[-1];
            uVar20 = puVar10[-2];
            uVar23 = puVar10[1];
            uVar22 = *puVar10;
            uVar25 = puVar10[3];
            uVar24 = puVar10[2];
            puVar17[-3] = puVar10[-3];
            puVar17[-4] = uVar19;
            puVar17[-1] = uVar21;
            puVar17[-2] = uVar20;
            puVar17[1] = uVar23;
            *puVar17 = uVar22;
            puVar17[3] = uVar25;
            puVar17[2] = uVar24;
            uVar16 = uVar16 - 8;
            puVar10 = puVar10 + 8;
            puVar17 = puVar17 + 8;
          } while (uVar16 != 0);
          if (uVar18 != uVar11) goto code_r0x000a5db0;
        }
        puVar8 = (undefined8 *)((long)puVar14 + ((long)puVar12 - (long)in_x16));
        in_x16 = puVar12;
      }
      else {
        puVar8 = puVar14;
      }
      if (param_1 <= in_x16) goto LAB_000a5b90;
      puVar12 = (undefined8 *)(unaff_x19 + in_x12 + -7);
      if (puVar12 <= puVar6 + 1) {
        puVar12 = puVar6 + 1;
      }
      in_x17 = (long)puVar6 + (uVar5 - (long)puVar12);
      if ((in_x17 < 8) || ((ulong)((long)puVar6 + (8 - (long)puVar14)) < 0x40)) {
        param_4 = in_x16;
        param_7 = puVar8;
      }
      else {
        param_8 = 0;
        if (in_x17 < 0x40) break;
        param_8 = in_x17 & 0xffffffffffffffc0;
        puVar7 = in_x16 + 4;
        puVar10 = (undefined8 *)((long)puVar14 + (long)puVar12 + (0x18 - (long)puVar6));
        uVar5 = param_8;
        do {
          uVar19 = puVar10[-4];
          uVar21 = puVar10[-1];
          uVar20 = puVar10[-2];
          uVar23 = puVar10[1];
          uVar22 = *puVar10;
          uVar25 = puVar10[3];
          uVar24 = puVar10[2];
          puVar7[-3] = puVar10[-3];
          puVar7[-4] = uVar19;
          puVar7[-1] = uVar21;
          puVar7[-2] = uVar20;
          puVar7[1] = uVar23;
          *puVar7 = uVar22;
          puVar7[3] = uVar25;
          puVar7[2] = uVar24;
          uVar5 = uVar5 - 0x40;
          puVar7 = puVar7 + 8;
          puVar10 = puVar10 + 8;
        } while (uVar5 != 0);
        if (in_x17 == param_8) goto LAB_000a5b90;
        param_7 = (undefined8 *)((long)puVar8 + param_8);
        param_4 = (undefined8 *)((long)in_x16 + param_8);
        if ((in_x17 & 0x38) != 0) break;
      }
LAB_000a5e14:
      do {
        puVar6 = (undefined8 *)((long)param_4 + 1);
        *(undefined1 *)param_4 = *(undefined1 *)param_7;
        param_4 = puVar6;
        param_7 = (undefined8 *)((long)param_7 + 1);
      } while (puVar6 < param_1);
      goto LAB_000a5b90;
    }
    puVar14 = puVar12 + 1;
    *puVar6 = *puVar12;
    if ((undefined8 *)((long)in_x10 + -0xc) < param_1) goto code_r0x000a5cd8;
code_r0x000a5b34:
    puVar6[1] = *puVar14;
    if (0x10 < uVar5) {
      puVar12 = puVar6 + 2;
      puVar8 = (undefined8 *)(uVar5 + (long)puVar6);
      if ((undefined8 *)(uVar5 + (long)puVar6) <= puVar6 + 3) {
        puVar8 = puVar6 + 3;
      }
      uVar5 = (long)puVar8 + (-0x11 - (long)puVar6);
      if ((0x37 < uVar5) && (0x3f < (ulong)((long)puVar6 + (8 - (long)puVar14)))) {
        uVar5 = (uVar5 >> 3) + 1;
        uVar16 = uVar5 & 0x3ffffffffffffff8;
        puVar12 = puVar12 + uVar16;
        puVar6 = puVar6 + 4;
        uVar18 = uVar16;
        puVar8 = puVar14 + 5;
        do {
          uVar19 = puVar8[-4];
          uVar21 = puVar8[-1];
          uVar20 = puVar8[-2];
          uVar23 = puVar8[1];
          uVar22 = *puVar8;
          uVar25 = puVar8[3];
          uVar24 = puVar8[2];
          puVar6[-1] = puVar8[-3];
          puVar6[-2] = uVar19;
          puVar6[1] = uVar21;
          *puVar6 = uVar20;
          puVar6[3] = uVar23;
          puVar6[2] = uVar22;
          puVar6[5] = uVar25;
          puVar6[4] = uVar24;
          puVar6 = puVar6 + 8;
          uVar18 = uVar18 - 8;
          puVar8 = puVar8 + 8;
        } while (uVar18 != 0);
        puVar14 = puVar14 + uVar16;
        if (uVar5 == uVar16) goto LAB_000a5b90;
      }
      do {
        puVar6 = puVar12 + 1;
        *puVar12 = puVar14[1];
        puVar12 = puVar6;
        puVar14 = puVar14 + 1;
      } while (puVar6 < param_1);
    }
  } while( true );
  param_9 = in_x17 & 0xfffffffffffffff8;
  param_4 = (undefined8 *)((long)in_x16 + param_9);
  param_7 = (undefined8 *)((long)puVar8 + param_9);
  in_x15 = (undefined8 *)((long)puVar14 + (long)puVar12 + (param_8 - (long)puVar6) + -8);
  goto code_r0x000a5e98;
}

