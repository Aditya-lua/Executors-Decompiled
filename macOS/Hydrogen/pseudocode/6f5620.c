
undefined8 FUN_006f5620(void)

{
  undefined8 uVar1;
  long unaff_x20;
  long unaff_x29;
  double dVar2;
  double dVar3;
  
  func_0x006e45a4();
  func_0x006e3870();
  func_0x006e45a4();
  func_0x006e3870();
  func_0x006e45a4();
  if (-1 < *(int *)(unaff_x20 + 0x20)) {
    func_0x006e3c24();
    func_0x006e45a4();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return 1;
  }
  uVar1 = ___stack_chk_fail();
  dVar2 = (double)func_0x006e6a4c(uVar1,1);
  dVar3 = (double)func_0x006e6a94(0,uVar1,2);
  _difftime((long)dVar2,(long)dVar3);
  func_0x006e3850(uVar1);
  return 1;
}

