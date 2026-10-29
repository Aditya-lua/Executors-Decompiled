/* 7ff70c7e5b10 FUN_7ff70c7e5b10 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70c7e5b10(longlong param_1,uint *param_2,longlong param_3,undefined4 *param_4)

{
  undefined4 *puVar1;
  undefined8 *puVar2;
  byte *pbVar3;
  uint uVar4;
  code *pcVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined8 uVar13;
  uint uVar14;
  longlong lVar15;
  longlong lVar16;
  undefined8 uVar17;
  uint *puVar18;
  ulonglong uVar19;
  uint uVar20;
  ulonglong uVar21;
  uint uVar22;
  uint uVar23;
  float fVar25;
  float fVar26;
  undefined1 auVar27 [16];
  float fVar28;
  undefined1 auStack_68 [32];
  ulonglong uStack_48;
  ulonglong uVar24;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  uVar4 = param_2[0xc];
  if (uVar4 == param_2[0xd]) {
    if (uVar4 == 0) {
      uVar14 = 8;
    }
    else {
      uVar14 = (int)uVar4 / 2 + uVar4;
    }
    uVar23 = uVar4 + 1;
    if ((int)(uVar4 + 1) < (int)uVar14) {
      uVar23 = uVar14;
    }
    lVar15 = FUN_7ff70c802100((longlong)(int)uVar23 * 0x2c);
    if (*(longlong *)(param_2 + 0xe) != 0) {
      FUN_7ff70cb12b60(lVar15,*(longlong *)(param_2 + 0xe),(longlong)(int)param_2[0xc] * 0x2c);
      FUN_7ff70c802510(*(undefined8 *)(param_2 + 0xe));
    }
    *(longlong *)(param_2 + 0xe) = lVar15;
    param_2[0xd] = uVar23;
    uVar14 = param_2[0xc];
  }
  else {
    lVar15 = *(longlong *)(param_2 + 0xe);
    uVar14 = uVar4;
  }
  lVar16 = (longlong)(int)uVar14 * 0x2c;
  uVar6 = *param_4;
  uVar7 = param_4[1];
  uVar8 = param_4[2];
  uVar9 = param_4[3];
  uVar17 = *(undefined8 *)(param_4 + 4);
  uVar13 = *(undefined8 *)(param_4 + 6);
  uVar10 = param_4[8];
  uVar11 = param_4[9];
  uVar12 = param_4[10];
  puVar1 = (undefined4 *)(lVar15 + 0x1c + lVar16);
  *puVar1 = param_4[7];
  puVar1[1] = uVar10;
  puVar1[2] = uVar11;
  puVar1[3] = uVar12;
  puVar2 = (undefined8 *)(lVar15 + 0x10 + lVar16);
  *puVar2 = uVar17;
  puVar2[1] = uVar13;
  puVar1 = (undefined4 *)(lVar15 + lVar16);
  *puVar1 = uVar6;
  puVar1[1] = uVar7;
  puVar1[2] = uVar8;
  puVar1[3] = uVar9;
  param_2[0xc] = param_2[0xc] + 1;
  puVar18 = (uint *)(*(longlong *)(param_2 + 0xe) + (longlong)(int)uVar4 * 0x2c);
  uVar14 = *(uint *)(*(longlong *)(param_2 + 0xe) + 0x28 + (longlong)(int)uVar4 * 0x2c);
  if (uVar14 != 0xffffffff) {
    lVar15 = *(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x68);
    lVar16 = (longlong)
             ((ulonglong)
              *(uint *)(*(longlong *)(*(longlong *)(param_1 + 0x2b0) + 0x78) +
                       (ulonglong)(uVar14 & 0xfffff) * 4) << 0x2c) >> 0x2c;
    puVar18[6] = (uint)((float)*(ushort *)(lVar15 + lVar16 * 8) * *(float *)(param_1 + 0x54));
    puVar18[7] = (uint)((float)*(ushort *)(lVar15 + 2 + lVar16 * 8) * *(float *)(param_1 + 0x58));
    puVar18[8] = (uint)((float)((uint)*(ushort *)(lVar15 + 4 + lVar16 * 8) +
                               (uint)*(ushort *)(lVar15 + lVar16 * 8)) * *(float *)(param_1 + 0x54))
    ;
    puVar18[9] = (uint)((float)((uint)*(ushort *)(lVar15 + 6 + lVar16 * 8) +
                               (uint)*(ushort *)(lVar15 + 2 + lVar16 * 8)) *
                       *(float *)(param_1 + 0x58));
    param_2[0x13] =
         param_2[0x13] & 0xfc000000 |
         (uint)*(ushort *)(lVar15 + 6 + lVar16 * 8) * (uint)*(ushort *)(lVar15 + 4 + lVar16 * 8) +
         param_2[0x13] & 0x3ffffff;
  }
  if (param_3 != 0) {
    fVar25 = *(float *)(**(longlong **)(*(longlong *)(param_2 + 0x16) + 0x28) + 0x3c);
    if ((fVar25 != 0.0) || (fVar28 = _DAT_7ff70cb1ba2c, NAN(fVar25))) {
      fVar28 = (float)param_2[5] / fVar25;
    }
    fVar26 = *(float *)(param_3 + 0x5c) * fVar28;
    fVar28 = fVar28 * *(float *)(param_3 + 0x58);
    fVar25 = (float)puVar18[1];
    if (fVar25 <= fVar26) {
      fVar26 = fVar25;
    }
    auVar27 = blendvps(ZEXT416((uint)fVar26),ZEXT416((uint)fVar28),ZEXT416(-(uint)(fVar25 < fVar28))
                      );
    fVar28 = auVar27._0_4_;
    if ((fVar28 != fVar25) || (NAN(fVar28) || NAN(fVar25))) {
      fVar25 = (fVar28 - fVar25) * _DAT_7ff70cb1ba70;
      if (*(char *)(param_3 + 0x36) != '\0') {
        fVar25 = (float)(int)fVar25;
      }
      puVar18[2] = (uint)((float)puVar18[2] + fVar25);
      puVar18[4] = (uint)(fVar25 + (float)puVar18[4]);
    }
    if (*(char *)(param_3 + 0x36) != '\0') {
      fVar28 = (float)(int)(_DAT_7ff70cb1ba70 + fVar28);
    }
    puVar18[1] = (uint)(fVar28 + *(float *)(param_3 + 0x60));
  }
  uVar14 = *puVar18;
  if ((uVar14 & 1) != 0) {
    *(undefined1 *)(*(longlong *)(param_1 + 0x38) + 0x56) = 1;
    *(undefined1 *)(param_1 + 0x53) = 1;
    uVar14 = *puVar18;
  }
  uVar23 = uVar14 >> 6;
  uVar24 = (ulonglong)uVar23;
  if ((int)param_2[8] <= (int)uVar23) {
    uVar20 = uVar23 + 1;
    uVar22 = param_2[1];
    if ((int)uVar22 <= (int)uVar23) {
      if (uVar22 == 0) {
        uVar22 = 8;
      }
      else {
        uVar22 = (int)uVar22 / 2 + uVar22;
      }
      if ((int)uVar22 <= (int)uVar20) {
        uVar22 = uVar20;
      }
      uVar17 = FUN_7ff70c802100((ulonglong)uVar22 * 4);
      if (*(longlong *)(param_2 + 2) != 0) {
        FUN_7ff70cb12b60(uVar17,*(longlong *)(param_2 + 2),(longlong)(int)*param_2 << 2);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 2));
      }
      *(undefined8 *)(param_2 + 2) = uVar17;
      param_2[1] = uVar22;
    }
    uVar22 = *param_2;
    lVar15 = (longlong)(int)uVar22;
    if ((int)uVar22 <= (int)uVar23) {
      uVar19 = uVar24 - lVar15;
      uVar22 = (int)(uVar24 + 1) - uVar22 & 3;
      uVar21 = (ulonglong)uVar22;
      if (uVar22 != 0) {
        do {
          *(undefined4 *)(*(longlong *)(param_2 + 2) + lVar15 * 4) = 0xbf800000;
          lVar15 = lVar15 + 1;
          uVar21 = uVar21 - 1;
        } while (uVar21 != 0);
      }
      if (2 < uVar19) {
        do {
          *(undefined4 *)(*(longlong *)(param_2 + 2) + lVar15 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_2 + 2) + 4 + lVar15 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_2 + 2) + 8 + lVar15 * 4) = 0xbf800000;
          *(undefined4 *)(*(longlong *)(param_2 + 2) + 0xc + lVar15 * 4) = 0xbf800000;
          lVar15 = lVar15 + 4;
        } while (uVar24 + 1 != lVar15);
      }
    }
    *param_2 = uVar20;
    uVar22 = param_2[9];
    if ((int)uVar22 <= (int)uVar23) {
      if (uVar22 == 0) {
        uVar22 = 8;
      }
      else {
        uVar22 = (int)uVar22 / 2 + uVar22;
      }
      if ((int)uVar22 <= (int)uVar20) {
        uVar22 = uVar20;
      }
      uVar17 = FUN_7ff70c802100(uVar22 * 2);
      if (*(longlong *)(param_2 + 10) != 0) {
        FUN_7ff70cb12b60(uVar17,*(longlong *)(param_2 + 10),(longlong)(int)param_2[8] * 2);
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 10));
      }
      *(undefined8 *)(param_2 + 10) = uVar17;
      param_2[9] = uVar22;
    }
    uVar22 = param_2[8];
    lVar15 = (longlong)(int)uVar22;
    if ((int)uVar22 <= (int)uVar23) {
      uVar19 = uVar24 - lVar15;
      uVar23 = (int)(uVar24 + 1) - uVar22 & 3;
      uVar21 = (ulonglong)uVar23;
      if (uVar23 != 0) {
        do {
          *(undefined2 *)(*(longlong *)(param_2 + 10) + lVar15 * 2) = 0xffff;
          lVar15 = lVar15 + 1;
          uVar21 = uVar21 - 1;
        } while (uVar21 != 0);
      }
      if (2 < uVar19) {
        do {
          *(undefined2 *)(*(longlong *)(param_2 + 10) + lVar15 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_2 + 10) + 2 + lVar15 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_2 + 10) + 4 + lVar15 * 2) = 0xffff;
          *(undefined2 *)(*(longlong *)(param_2 + 10) + 6 + lVar15 * 2) = 0xffff;
          lVar15 = lVar15 + 4;
        } while (uVar24 + 1 != lVar15);
      }
    }
    param_2[8] = uVar20;
  }
  *(uint *)(*(longlong *)(param_2 + 2) + uVar24 * 4) = puVar18[1];
  *(short *)(*(longlong *)(param_2 + 10) + uVar24 * 2) = (short)uVar4;
  pbVar3 = (byte *)(*(longlong *)(param_2 + 0x16) + 0x34 + (ulonglong)(uVar14 >> 0x16));
  *pbVar3 = *pbVar3 | (byte)(1 << ((byte)(uVar14 >> 0x13) & 7));
  if (_DAT_7ff70cbebd80 != (uStack_48 ^ (ulonglong)auStack_68)) {
    FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_68);
    pcVar5 = (code *)swi(3);
    puVar18 = (uint *)(*pcVar5)();
    return puVar18;
  }
  return puVar18;
}


