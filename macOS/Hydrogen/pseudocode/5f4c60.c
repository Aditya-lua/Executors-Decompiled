
void FUN_005f4c60(void)

{
  undefined8 unaff_x19;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  
  __ZdlPv();
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
    unaff_x19 = __Unwind_Resume();
  }
  __Unwind_Resume(unaff_x19);
  func_0x005f3f00();
  return;
}

