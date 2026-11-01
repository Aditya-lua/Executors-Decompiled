
undefined8 FUN_006f8258(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 in_stack_00000048;
  undefined4 auStack_28 [2];
  
  func_0x006e644c(param_1,param_2 + 0x700);
  func_0x006e644c(in_stack_00000048,"invalid use of \'%c\' in replacement string");
  func_0x006e719c();
  func_0x006e644c();
  ___stack_chk_fail();
  func_0x006e644c();
  uVar1 = func_0x006e6498();
  func_0x006e67c8(uVar1,1,auStack_28);
  func_0x006e3870(uVar1,auStack_28[0]);
  return 1;
}

