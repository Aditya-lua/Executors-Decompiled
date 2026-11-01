
undefined8 FUN_002c2d90(void)

{
  int iVar1;
  long lVar2;
  char *pcVar3;
  long unaff_x29;
  undefined1 auVar4 [16];
  
  pcVar3 = "/aws-lc/crypto/fipsmodule/ec/ec_key.c";
  lVar2 = 0x84;
  func_0x0028f83c(0xf,0,0x84,"/aws-lc/crypto/fipsmodule/ec/ec_key.c",0x179);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 0;
  }
  auVar4 = ___stack_chk_fail(0);
  if ((lVar2 == 0) || (pcVar3 == (char *)0x0)) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3b6);
    return 0;
  }
  (**(code **)(*auVar4._0_8_ + 0x20))();
  iVar1 = func_0x002c7cd4(auVar4._0_8_,auVar4._8_8_);
  if (iVar1 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3bf);
    return 0;
  }
  return 1;
}

