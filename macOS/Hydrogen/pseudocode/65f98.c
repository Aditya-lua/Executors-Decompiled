
void FUN_00065f98(code *param_1)

{
  undefined8 uVar1;
  long unaff_x29;
  undefined1 uStack0000000000000040;
  
  (*param_1)();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  uVar1 = ___stack_chk_fail();
  func_0x00064f10(&uStack0000000000000040);
  __Unwind_Resume(uVar1);
  uVar1 = __Unwind_Resume();
  func_0x00064f10(&uStack0000000000000040);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00064f10(&uStack0000000000000040);
  __Unwind_Resume(uVar1);
  return;
}

