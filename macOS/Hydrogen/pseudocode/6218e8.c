
void FUN_006218e8(undefined8 param_1,int param_2)

{
  undefined8 uVar1;
  undefined1 uStack0000000000000008;
  
  if (param_2 == 0) {
    __Unwind_Resume(param_1);
  }
  uVar1 = func_0x0001753c(param_1);
  func_0x00087574();
  func_0x00087574();
  func_0x00087574(&uStack0000000000000008);
  __Unwind_Resume(uVar1);
  return;
}

