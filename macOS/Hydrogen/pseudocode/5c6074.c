
void FUN_005c6074(undefined8 param_1)

{
  long lVar1;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000048;
  
  uStack0000000000000010 = 0;
  uStack0000000000000030 = 0;
  _uStack0000000000000008 = 1;
  uStack0000000000000028 = 1;
  uStack0000000000000048 = param_1;
  func_0x005c7190(unaff_x29 + -0x30,&uStack0000000000000008);
  lVar1 = *(long *)(unaff_x29 + -0x30);
  while (lVar1 != 0) {
    *(undefined1 **)(unaff_x29 + -0x18) = &uStack0000000000000008;
    func_0x005c6384(lVar1 + *(long *)(unaff_x29 + -0x20) * 0x30);
    func_0x005c7190(unaff_x29 + -0x30,&uStack0000000000000008);
    lVar1 = *(long *)(unaff_x29 + -0x30);
  }
  return;
}

