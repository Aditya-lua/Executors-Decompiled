
void FUN_006bdcb0(void)

{
  undefined4 *puVar1;
  long unaff_x29;
  undefined8 in_stack_00000018;
  undefined1 auStack_7ffffffe [2147483646];
  
  __ZdlPv(in_stack_00000018);
  func_0x006bd8a0(auStack_7ffffffe + 0x800003a6);
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    __ZdlPv();
  }
  func_0x00704bec(unaff_x29 + -0x50);
  puVar1 = (undefined4 *)__Unwind_Resume();
  *puVar1 = 1;
  return;
}

