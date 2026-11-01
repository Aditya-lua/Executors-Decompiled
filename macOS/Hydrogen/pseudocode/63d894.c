
void FUN_0063d894(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined1 extraout_w1;
  long in_x9;
  undefined1 uStack0000000000000010;
  
  if (in_x9 == param_1) {
    return;
  }
  ___stack_chk_fail();
  uVar1 = __Unwind_Resume();
  func_0x006143a8(&uStack0000000000000010);
  lVar2 = __Unwind_Resume(uVar1);
  *(undefined1 *)(lVar2 + 0x1e8) = extraout_w1;
  return;
}

