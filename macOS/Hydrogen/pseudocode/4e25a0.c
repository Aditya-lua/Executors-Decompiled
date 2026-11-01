
void FUN_004e25a0(long param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  long in_x10;
  undefined8 *puVar2;
  long lVar3;
  undefined8 *puVar4;
  long *unaff_x19;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
  puVar1 = unaff_x23 + in_x10 * 4;
  lVar3 = in_x10;
  puVar2 = unaff_x23;
  puVar4 = param_2;
  do {
    uVar8 = puVar2[5];
    uVar6 = puVar2[4];
    uVar7 = puVar2[7];
    uVar5 = puVar2[6];
    uVar11 = puVar2[1];
    uVar10 = puVar2[3];
    uVar9 = puVar2[2];
    *puVar4 = *puVar2;
    puVar4[1] = uVar11;
    puVar4[2] = uVar9;
    puVar4[3] = uVar10;
    puVar4[4] = uVar6;
    puVar4[5] = uVar8;
    puVar4[6] = uVar5;
    puVar4[7] = uVar7;
    puVar4 = puVar4 + 8;
    lVar3 = lVar3 + -2;
    puVar2 = puVar2 + 8;
  } while (lVar3 != 0);
  puVar2 = param_2 + in_x10 * 4 + 2;
  do {
    if (puVar1 == unaff_x23 + unaff_x22 * 4) break;
    uVar6 = *puVar1;
    uVar5 = puVar1[2];
    uVar7 = puVar1[3];
    puVar2[-1] = puVar1[1];
    puVar2[-2] = uVar6;
    *puVar2 = uVar5;
    puVar2[1] = uVar7;
    puVar1 = puVar1 + 4;
    param_1 = param_1 + -1;
    puVar2 = puVar2 + 4;
  } while (param_1 != 0);
  *unaff_x19 = unaff_x22;
  unaff_x19[1] = (long)param_2;
  unaff_x19[2] = unaff_x22;
  return;
}

