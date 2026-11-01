
void FUN_006bdccc(long param_1)

{
  undefined4 *puVar1;
  long unaff_x29;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x007b1e10(auStack_7ffffffe + 0x80000346,param_1 + 8);
  if (*(long *)(unaff_x29 + -0x88) != 0) {
    __ZdlPv();
  }
  func_0x00704bec(unaff_x29 + -0x50);
  puVar1 = (undefined4 *)__Unwind_Resume();
  *puVar1 = 1;
  return;
}

