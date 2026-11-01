
void FUN_0077acdc(undefined8 param_1,undefined8 param_2)

{
  undefined8 unaff_x19;
  long lVar1;
  long unaff_x22;
  long unaff_x29;
  undefined1 auVar2 [16];
  
  func_0x0076dfc0(param_1,param_2,0,0);
  *(bool *)unaff_x19 = *(int *)(unaff_x22 + 0x4a8) == 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  auVar2 = ___stack_chk_fail();
  lVar1 = *(long *)(auVar2._0_8_ + 0x18);
  func_0x0076dfc0(auVar2._0_8_,lVar1 + 1000,0,0);
  *(bool *)auVar2._8_8_ = *(int *)(lVar1 + 0x4a8) == 0;
  return;
}

