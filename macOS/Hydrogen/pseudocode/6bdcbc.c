
void FUN_006bdcbc(undefined8 param_1)

{
  undefined4 *puVar1;
  long unaff_x29;
  char in_stack_00000398;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (in_stack_00000398 != '\0') {
    func_0x007b1e10(auStack_7ffffffe + 0x80000346,auStack_7ffffffe + 0x8000034e);
  }
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    __ZdlPv();
  }
  func_0x00704bec(unaff_x29 + -0x50);
  puVar1 = (undefined4 *)__Unwind_Resume(param_1);
  *puVar1 = 1;
  return;
}

