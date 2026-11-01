
void FUN_005b7980(undefined8 *param_1)

{
  long unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar3 = *(undefined8 *)(unaff_x19 + 0x20);
  uVar2 = *(undefined8 *)(unaff_x19 + 0x38);
  uVar1 = *(undefined8 *)(unaff_x19 + 0x30);
  param_1[1] = *(undefined8 *)(unaff_x19 + 0x28);
  *param_1 = uVar3;
  param_1[3] = uVar2;
  param_1[2] = uVar1;
  return;
}

