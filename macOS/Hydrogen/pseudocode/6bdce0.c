
void FUN_006bdce0(void)

{
  undefined4 *puVar1;
  long unaff_x29;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00057f4c(auStack_7ffffffe + 0x80000346);
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    __ZdlPv();
  }
  func_0x00704bec(unaff_x29 + -0x50);
  puVar1 = (undefined4 *)__Unwind_Resume();
  *puVar1 = 1;
  return;
}

