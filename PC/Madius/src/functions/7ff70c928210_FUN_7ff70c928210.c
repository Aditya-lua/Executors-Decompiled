/* 7ff70c928210 FUN_7ff70c928210 */

void FUN_7ff70c928210(undefined8 *param_1,undefined8 *param_2,undefined8 *param_3)

{
  ulonglong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  int iVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulonglong uVar12;
  ulonglong uVar13;
  undefined8 *puVar14;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  
  uVar1 = param_1[2];
  puVar11 = param_1;
  if (0xf < (ulonglong)param_1[3]) {
    puVar11 = (undefined8 *)*param_1;
  }
  uVar13 = param_2[3];
  puVar14 = (undefined8 *)*param_2;
  uVar12 = param_2[2];
  puVar10 = param_2;
  if (0xf < uVar13) {
    puVar10 = puVar14;
  }
  if (uVar1 < uVar12) {
    if (param_2 == param_1) goto LAB_7ff70c9282af;
  }
  else if (((uVar12 != uVar1) ||
           (iVar9 = FUN_7ff70cb12b50(puVar10,puVar11,uVar1), uVar12 = uVar1, param_2 == param_1)) ||
          (-1 < iVar9)) goto LAB_7ff70c9282af;
  uVar2 = *param_2;
  uVar3 = param_2[1];
  uVar4 = param_2[2];
  uVar5 = param_2[3];
  uVar6 = *param_1;
  uVar7 = param_1[1];
  uVar8 = param_1[3];
  param_2[2] = param_1[2];
  param_2[3] = uVar8;
  *param_2 = uVar6;
  param_2[1] = uVar7;
  uStack_58 = (undefined4)uVar2;
  uStack_54 = (undefined4)((ulonglong)uVar2 >> 0x20);
  uStack_50 = (undefined4)uVar3;
  uStack_4c = (undefined4)((ulonglong)uVar3 >> 0x20);
  param_1[2] = uVar4;
  param_1[3] = uVar5;
  *(undefined4 *)param_1 = uStack_58;
  *(undefined4 *)((longlong)param_1 + 4) = uStack_54;
  *(undefined4 *)(param_1 + 1) = uStack_50;
  *(undefined4 *)((longlong)param_1 + 0xc) = uStack_4c;
  uVar13 = param_2[3];
  puVar14 = (undefined8 *)*param_2;
  uVar12 = param_2[2];
LAB_7ff70c9282af:
  puVar11 = param_2;
  if (0xf < uVar13) {
    puVar11 = puVar14;
  }
  puVar10 = param_3;
  if (0xf < (ulonglong)param_3[3]) {
    puVar10 = (undefined8 *)*param_3;
  }
  if ((uVar12 < (ulonglong)param_3[2]) ||
     ((param_3[2] == uVar12 && (iVar9 = FUN_7ff70cb12b50(puVar10,puVar11,uVar12), iVar9 < 0)))) {
    if (param_3 != param_2) {
      uVar2 = *param_3;
      uVar3 = param_3[1];
      uVar4 = param_3[2];
      uVar5 = param_3[3];
      uVar6 = *param_2;
      uVar7 = param_2[1];
      uVar8 = param_2[3];
      param_3[2] = param_2[2];
      param_3[3] = uVar8;
      *param_3 = uVar6;
      param_3[1] = uVar7;
      uStack_58 = (undefined4)uVar2;
      uStack_54 = (undefined4)((ulonglong)uVar2 >> 0x20);
      uStack_50 = (undefined4)uVar3;
      uStack_4c = (undefined4)((ulonglong)uVar3 >> 0x20);
      param_2[2] = uVar4;
      param_2[3] = uVar5;
      *(undefined4 *)param_2 = uStack_58;
      *(undefined4 *)((longlong)param_2 + 4) = uStack_54;
      *(undefined4 *)(param_2 + 1) = uStack_50;
      *(undefined4 *)((longlong)param_2 + 0xc) = uStack_4c;
      uVar13 = param_2[3];
      puVar14 = (undefined8 *)*param_2;
      uVar12 = param_2[2];
    }
    puVar11 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar11 = (undefined8 *)*param_1;
    }
    if (uVar13 < 0x10) {
      puVar14 = param_2;
    }
    if ((ulonglong)param_1[2] < uVar12) {
      if (param_2 == param_1) {
        return;
      }
    }
    else {
      if (uVar12 != param_1[2]) {
        return;
      }
      iVar9 = FUN_7ff70cb12b50(puVar14,puVar11,uVar12);
      if (param_2 == param_1) {
        return;
      }
      if (-1 < iVar9) {
        return;
      }
    }
    uVar2 = *param_2;
    uVar3 = param_2[1];
    uVar4 = param_2[2];
    uVar5 = param_2[3];
    uVar6 = *param_1;
    uVar7 = param_1[1];
    uVar8 = param_1[3];
    param_2[2] = param_1[2];
    param_2[3] = uVar8;
    *param_2 = uVar6;
    param_2[1] = uVar7;
    param_1[2] = uVar4;
    param_1[3] = uVar5;
    *param_1 = uVar2;
    param_1[1] = uVar3;
  }
  return;
}


