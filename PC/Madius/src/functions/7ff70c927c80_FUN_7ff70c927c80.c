/* 7ff70c927c80 FUN_7ff70c927c80 */

void FUN_7ff70c927c80(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  int iVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  ulonglong uVar13;
  ulonglong uVar14;
  longlong lVar15;
  ulonglong uVar16;
  undefined8 *puVar17;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  
  lVar15 = (longlong)param_3 - (longlong)param_1 >> 5;
  puVar9 = param_1;
  puVar12 = param_3;
  if (0x28 < lVar15) {
    uVar16 = lVar15 + 1U >> 3;
    puVar9 = param_1 + uVar16 * 4;
    FUN_7ff70c928210(param_1,puVar9,param_1 + uVar16 * 8);
    FUN_7ff70c928210(param_2 + uVar16 * -4,param_2,param_2 + uVar16 * 4);
    puVar12 = param_3 + uVar16 * -4;
    FUN_7ff70c928210(param_3 + uVar16 * -8,puVar12,param_3);
  }
  uVar16 = puVar9[2];
  puVar11 = puVar9;
  if (0xf < (ulonglong)puVar9[3]) {
    puVar11 = (undefined8 *)*puVar9;
  }
  uVar14 = param_2[3];
  puVar17 = (undefined8 *)*param_2;
  uVar13 = param_2[2];
  puVar10 = param_2;
  if (0xf < uVar14) {
    puVar10 = puVar17;
  }
  if (uVar16 < uVar13) {
    if (param_2 == puVar9) goto LAB_7ff70c9282af;
  }
  else if (((uVar13 != uVar16) ||
           (iVar8 = FUN_7ff70cb12b50(puVar10,puVar11,uVar16), uVar13 = uVar16, param_2 == puVar9))
          || (-1 < iVar8)) goto LAB_7ff70c9282af;
  uVar1 = *param_2;
  uVar2 = param_2[1];
  uVar3 = param_2[2];
  uVar4 = param_2[3];
  uVar5 = *puVar9;
  uVar6 = puVar9[1];
  uVar7 = puVar9[3];
  param_2[2] = puVar9[2];
  param_2[3] = uVar7;
  *param_2 = uVar5;
  param_2[1] = uVar6;
  uStack_58 = (undefined4)uVar1;
  uStack_54 = (undefined4)((ulonglong)uVar1 >> 0x20);
  uStack_50 = (undefined4)uVar2;
  uStack_4c = (undefined4)((ulonglong)uVar2 >> 0x20);
  puVar9[2] = uVar3;
  puVar9[3] = uVar4;
  *(undefined4 *)puVar9 = uStack_58;
  *(undefined4 *)((longlong)puVar9 + 4) = uStack_54;
  *(undefined4 *)(puVar9 + 1) = uStack_50;
  *(undefined4 *)((longlong)puVar9 + 0xc) = uStack_4c;
  uVar14 = param_2[3];
  puVar17 = (undefined8 *)*param_2;
  uVar13 = param_2[2];
LAB_7ff70c9282af:
  puVar11 = param_2;
  if (0xf < uVar14) {
    puVar11 = puVar17;
  }
  puVar10 = puVar12;
  if (0xf < (ulonglong)puVar12[3]) {
    puVar10 = (undefined8 *)*puVar12;
  }
  if ((uVar13 < (ulonglong)puVar12[2]) ||
     ((puVar12[2] == uVar13 && (iVar8 = FUN_7ff70cb12b50(puVar10,puVar11,uVar13), iVar8 < 0)))) {
    if (puVar12 != param_2) {
      uVar1 = *puVar12;
      uVar2 = puVar12[1];
      uVar3 = puVar12[2];
      uVar4 = puVar12[3];
      uVar5 = *param_2;
      uVar6 = param_2[1];
      uVar7 = param_2[3];
      puVar12[2] = param_2[2];
      puVar12[3] = uVar7;
      *puVar12 = uVar5;
      puVar12[1] = uVar6;
      uStack_58 = (undefined4)uVar1;
      uStack_54 = (undefined4)((ulonglong)uVar1 >> 0x20);
      uStack_50 = (undefined4)uVar2;
      uStack_4c = (undefined4)((ulonglong)uVar2 >> 0x20);
      param_2[2] = uVar3;
      param_2[3] = uVar4;
      *(undefined4 *)param_2 = uStack_58;
      *(undefined4 *)((longlong)param_2 + 4) = uStack_54;
      *(undefined4 *)(param_2 + 1) = uStack_50;
      *(undefined4 *)((longlong)param_2 + 0xc) = uStack_4c;
      uVar14 = param_2[3];
      puVar17 = (undefined8 *)*param_2;
      uVar13 = param_2[2];
    }
    puVar12 = puVar9;
    if (0xf < (ulonglong)puVar9[3]) {
      puVar12 = (undefined8 *)*puVar9;
    }
    if (uVar14 < 0x10) {
      puVar17 = param_2;
    }
    if ((ulonglong)puVar9[2] < uVar13) {
      if (param_2 == puVar9) {
        return;
      }
    }
    else {
      if (uVar13 != puVar9[2]) {
        return;
      }
      iVar8 = FUN_7ff70cb12b50(puVar17,puVar12,uVar13);
      if (param_2 == puVar9) {
        return;
      }
      if (-1 < iVar8) {
        return;
      }
    }
    uVar1 = *param_2;
    uVar2 = param_2[1];
    uVar3 = param_2[2];
    uVar4 = param_2[3];
    uVar5 = *puVar9;
    uVar6 = puVar9[1];
    uVar7 = puVar9[3];
    param_2[2] = puVar9[2];
    param_2[3] = uVar7;
    *param_2 = uVar5;
    param_2[1] = uVar6;
    puVar9[2] = uVar3;
    puVar9[3] = uVar4;
    *puVar9 = uVar1;
    puVar9[1] = uVar2;
  }
  return;
}


