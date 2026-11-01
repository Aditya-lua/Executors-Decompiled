
void FUN_004dd3e4(undefined8 param_1)

{
  long *plVar1;
  long *extraout_x8;
  long lVar2;
  undefined8 unaff_x20;
  undefined8 *in_stack_00000008;
  undefined1 uStack00000000000000e0;
  
  func_0x004de050(&uStack00000000000000e0);
  *in_stack_00000008 = unaff_x20;
  __Unwind_Resume(param_1);
  func_0x007a2668();
  plVar1 = (long *)func_0x007a2668();
  lVar2 = ((ulong)(plVar1[1] - *plVar1) >> 3) * 0xf83e0f83e0f83e1;
  *extraout_x8 = lVar2;
  extraout_x8[1] = 1;
  extraout_x8[2] = lVar2;
  return;
}

