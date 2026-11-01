
void FUN_00415170(undefined8 param_1,long param_2)

{
  long lVar1;
  long *extraout_x8;
  undefined8 in_stack_00000010;
  
  if (param_2 != 0) {
    func_0x00187bd4(in_stack_00000010,param_2,1);
  }
  lVar1 = __Unwind_Resume();
  lVar1 = ((ulong)(*(long *)(lVar1 + 0x18) - *(long *)(lVar1 + 8)) >> 3) * -0x5555555555555555;
  *extraout_x8 = lVar1;
  extraout_x8[1] = 1;
  extraout_x8[2] = lVar1;
  return;
}

