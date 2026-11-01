
void FUN_004e2588(ulong param_1,undefined8 *param_2)

{
  long lVar1;
  long in_x9;
  undefined8 *puVar2;
  undefined8 *in_x10;
  undefined8 *puVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long *unaff_x19;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  
  if (param_2 < (undefined8 *)((long)unaff_x23 + in_x9) && unaff_x23 < in_x10) {
    param_1 = 0;
    lVar1 = unaff_x22;
    puVar2 = unaff_x23;
  }
  else {
    param_1 = param_1 & 0x7fffffffffffffe;
    lVar1 = unaff_x22 - param_1;
    puVar2 = unaff_x23 + param_1 * 4;
    uVar4 = param_1;
    puVar3 = unaff_x23;
    puVar5 = param_2;
    do {
      uVar9 = puVar3[5];
      uVar7 = puVar3[4];
      uVar8 = puVar3[7];
      uVar6 = puVar3[6];
      uVar12 = puVar3[1];
      uVar11 = puVar3[3];
      uVar10 = puVar3[2];
      *puVar5 = *puVar3;
      puVar5[1] = uVar12;
      puVar5[2] = uVar10;
      puVar5[3] = uVar11;
      puVar5[4] = uVar7;
      puVar5[5] = uVar9;
      puVar5[6] = uVar6;
      puVar5[7] = uVar8;
      puVar5 = puVar5 + 8;
      uVar4 = uVar4 - 2;
      puVar3 = puVar3 + 8;
    } while (uVar4 != 0);
  }
  puVar3 = param_2 + param_1 * 4 + 2;
  do {
    if (puVar2 == unaff_x23 + unaff_x22 * 4) break;
    uVar7 = *puVar2;
    uVar6 = puVar2[2];
    uVar8 = puVar2[3];
    puVar3[-1] = puVar2[1];
    puVar3[-2] = uVar7;
    *puVar3 = uVar6;
    puVar3[1] = uVar8;
    puVar2 = puVar2 + 4;
    lVar1 = lVar1 + -1;
    puVar3 = puVar3 + 4;
  } while (lVar1 != 0);
  *unaff_x19 = unaff_x22;
  unaff_x19[1] = (long)param_2;
  unaff_x19[2] = unaff_x22;
  return;
}

