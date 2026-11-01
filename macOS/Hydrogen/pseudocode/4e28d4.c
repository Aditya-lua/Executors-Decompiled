
void FUN_004e28d4(undefined8 *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  undefined8 *unaff_x23;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  while( true ) {
    in_x9 = in_x9 + -1;
    if ((in_x9 == 0) || (unaff_x20 == 0)) break;
    puVar3 = unaff_x23 + 1;
    uVar4 = *unaff_x23;
    uVar6 = unaff_x23[3];
    uVar5 = unaff_x23[2];
    uVar1 = unaff_x23[4];
    uVar2 = unaff_x23[5];
    unaff_x23 = unaff_x23 + 6;
    param_1[4] = *puVar3;
    param_1[3] = uVar4;
    param_1[6] = uVar6;
    param_1[5] = uVar5;
    param_1[7] = uVar1;
    param_1[8] = uVar2;
    unaff_x20 = unaff_x20 + -0x30;
    param_1 = param_1 + 6;
  }
  *unaff_x19 = unaff_x22;
  unaff_x19[1] = param_2;
  unaff_x19[2] = unaff_x22;
  return;
}

