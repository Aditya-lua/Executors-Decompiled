
undefined8 FUN_00285a3c(undefined1 param_1 [16])

{
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar2 = param_1._8_8_;
  uVar1 = param_1._0_8_;
  *(undefined8 *)(unaff_x19 + 0x68) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x60) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x78) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x70) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x48) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x40) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x58) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x50) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x28) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x20) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x38) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x30) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x18) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x10) = uVar1;
  func_0x002b3d9c();
  *(byte *)(unaff_x19 + 0x100) = *(byte *)(unaff_x19 + 0x100) & 0xfe | unaff_x20 == 0x20;
  *(undefined1 *)(unaff_x19 + 0x239) = 0x10;
  return 1;
}

