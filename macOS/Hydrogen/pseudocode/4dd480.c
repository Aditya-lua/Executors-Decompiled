
void thunk_FUN_004dd488(void)

{
  long *plVar1;
  long *extraout_x8;
  long lVar2;
  undefined8 unaff_x20;
  undefined8 *in_stack_00000008;
  undefined1 uStack0000000000000080;
  
  func_0x004dde94(&uStack0000000000000080);
  *in_stack_00000008 = unaff_x20;
  __Unwind_Resume();
  func_0x007a2668();
  plVar1 = (long *)func_0x007a2668();
  lVar2 = ((ulong)(plVar1[1] - *plVar1) >> 3) * 0xf83e0f83e0f83e1;
  *extraout_x8 = lVar2;
  extraout_x8[1] = 1;
  extraout_x8[2] = lVar2;
  return;
}

