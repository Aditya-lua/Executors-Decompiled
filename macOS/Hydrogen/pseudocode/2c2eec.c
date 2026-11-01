
undefined8 FUN_002c2eec(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  uint uVar1;
  int iVar2;
  uint in_w8;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined1 auVar3 [16];
  
  if ((in_w8 >> 1 & 1) == 0) {
    func_0x0036e3d8(*unaff_x21);
    in_w8 = *(uint *)((long)unaff_x21 + 0x14);
  }
  if ((in_w8 & 1) == 0) {
    *unaff_x21 = 0;
  }
  else {
    func_0x0036e3d8();
  }
  if (unaff_x19 != (undefined8 *)0x0) {
    uVar1 = *(uint *)((long)unaff_x19 + 0x14);
    if ((uVar1 >> 1 & 1) == 0) {
      func_0x0036e3d8(*unaff_x19);
      uVar1 = *(uint *)((long)unaff_x19 + 0x14);
    }
    if ((uVar1 & 1) == 0) {
      *unaff_x19 = 0;
    }
    else {
      func_0x0036e3d8();
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 0;
  }
  auVar3 = ___stack_chk_fail(0);
  if ((param_3 == 0) || (param_4 == 0)) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3b6);
    return 0;
  }
  (**(code **)(*auVar3._0_8_ + 0x20))();
  iVar2 = func_0x002c7cd4(auVar3._0_8_,auVar3._8_8_);
  if (iVar2 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3bf);
    return 0;
  }
  return 1;
}

