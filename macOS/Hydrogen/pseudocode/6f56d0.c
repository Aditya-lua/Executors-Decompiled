
undefined8 FUN_006f56d0(void)

{
  undefined8 uVar1;
  double dVar2;
  double dVar3;
  
  func_0x006e63b0();
  uVar1 = ___stack_chk_fail();
  dVar2 = (double)func_0x006e6a4c(uVar1,1);
  dVar3 = (double)func_0x006e6a94(0,uVar1,2);
  _difftime((long)dVar2,(long)dVar3);
  func_0x006e3850(uVar1);
  return 1;
}

