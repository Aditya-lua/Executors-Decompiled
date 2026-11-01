
undefined8 FUN_004c225c(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long *in_stack_00000570;
  long *in_stack_00000578;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00187bd4(param_2,param_1 << 3,8);
  func_0x004bea24(in_stack_000000f8,in_stack_00000118._4_4_,1);
  lVar1 = *in_stack_00000570;
  *in_stack_00000570 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x8000056e);
  }
  lVar1 = *in_stack_00000578;
  *in_stack_00000578 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x80000576);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

