
void FUN_00687014(undefined1 param_1 [16])

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(unaff_x19 + 0x28);
  uVar1 = *(undefined8 *)(unaff_x19 + 0x20);
  *(long *)(unaff_x19 + 0x28) = param_1._8_8_;
  *(long *)(unaff_x19 + 0x20) = param_1._0_8_;
  *(undefined8 *)(unaff_x19 + 0x68) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x60) = uVar1;
  uVar1 = *(undefined8 *)(unaff_x19 + 0x30);
  *(undefined8 *)(unaff_x19 + 0x30) = *(undefined8 *)(unaff_x19 + 0x70);
  *(undefined8 *)(unaff_x19 + 0x70) = uVar1;
  return;
}

