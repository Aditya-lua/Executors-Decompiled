
void FUN_006bab28(undefined8 param_1)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar3 = *(undefined8 *)(unaff_x19 + 0x10);
  uVar2 = *(undefined8 *)(unaff_x19 + 8);
  uVar1 = unaff_x21[2];
  uVar4 = *unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x21[1];
  *(undefined8 *)(unaff_x19 + 8) = uVar4;
  *(undefined8 *)(unaff_x19 + 0x18) = uVar1;
  unaff_x21[1] = uVar3;
  *unaff_x21 = uVar2;
  unaff_x21[2] = param_1;
  return;
}

