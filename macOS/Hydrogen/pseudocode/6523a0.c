
void FUN_006523a0(long param_1)

{
  undefined8 extraout_x8;
  long in_stack_00000008;
  long lStack0000000000000020;
  long in_stack_00000028;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  
  lStack0000000000000020 = param_1 + 0x678;
  if (in_stack_00000028 != 0) goto LAB_006523cc;
  while (in_stack_00000008 == 0) {
    __Unwind_Resume();
LAB_006523cc:
    __ZdlPv();
  }
  __ZdlPv();
  __Unwind_Resume();
  func_0x00653574(&puStack_60);
  func_0x00610060(&puStack_40,&puStack_60,1);
  func_0x00610060(extraout_x8,&puStack_40,5);
  puStack_40 = &UNK_009f6678;
  if (lStack_38 != 0) {
    lStack_30 = lStack_38;
    __ZdlPv();
  }
  puStack_60 = &UNK_009f6678;
  if (lStack_58 != 0) {
    lStack_50 = lStack_58;
    __ZdlPv();
  }
  return;
}

