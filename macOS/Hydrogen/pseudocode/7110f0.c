
undefined8 FUN_007110f0(void)

{
  uint uVar1;
  undefined8 uVar2;
  int *extraout_x1;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  
  func_0x00017f90();
  uVar2 = func_0x00017514();
  if (in_stack_00000048 < 0) {
    __ZdlPv(in_stack_00000038);
  }
  __Unwind_Resume(uVar2);
  uVar1 = *extraout_x1 - 0x126;
  if (uVar1 < 0x11 && (1 << (ulong)(uVar1 & 0x1f) & 0x10007U) != 0 || *extraout_x1 == 0) {
    return 1;
  }
  return 0;
}

