
/* WARNING: Removing unreachable block (ram,0x002c2da8) */

undefined8 FUN_002c3190(undefined8 param_1,undefined8 param_2,long param_3,long param_4)

{
  int iVar1;
  code *pcVar2;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000010;
  
  iVar1 = func_0x00370810();
  if (iVar1 != 0) {
    if ((*(long *)(unaff_x19 + 0x10) != 0) &&
       (pcVar2 = *(code **)(*(long *)(unaff_x19 + 0x10) + 0xa0), pcVar2 != (code *)0x0)) {
      (*pcVar2)();
      *(undefined8 *)(unaff_x19 + 8) = 0;
      *(undefined4 *)(unaff_x19 + 4) = 0;
    }
    func_0x0036e3d8();
  }
  func_0x002c13c0(&uStack0000000000000010);
  func_0x0036e3d8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 1;
  }
  auVar3 = ___stack_chk_fail(1);
  if ((param_3 == 0) || (param_4 == 0)) {
    func_0x0028f83c(0xf,0,0x43,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3b6);
    return 0;
  }
  (**(code **)(*auVar3._0_8_ + 0x20))();
  iVar1 = func_0x002c7cd4(auVar3._0_8_,auVar3._8_8_);
  if (iVar1 == 0) {
    func_0x0028f83c(0xf,0,0x44,"/aws-lc/crypto/fipsmodule/ec/ec.c",0x3bf);
    return 0;
  }
  return 1;
}

