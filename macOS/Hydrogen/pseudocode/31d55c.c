
undefined8 FUN_0031d55c(undefined8 param_1,undefined8 param_2)

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  _memcpy(param_1,param_2,0x4a0);
  func_0x002eafd4();
  uVar3 = *(undefined8 *)(unaff_x19 + 0x20);
  uVar2 = *(undefined8 *)(unaff_x19 + 0x38);
  uVar1 = *(undefined8 *)(unaff_x19 + 0x30);
  *(undefined8 *)(unaff_x20 + 0x948) = *(undefined8 *)(unaff_x19 + 0x28);
  *(undefined8 *)(unaff_x20 + 0x940) = uVar3;
  *(undefined8 *)(unaff_x20 + 0x958) = uVar2;
  *(undefined8 *)(unaff_x20 + 0x950) = uVar1;
  return 1;
}

