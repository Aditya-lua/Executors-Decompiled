
void FUN_006532f8(void)

{
  undefined8 extraout_x8;
  long in_stack_00000008;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined *puStack_40;
  undefined4 *puStack_38;
  undefined4 *puStack_30;
  undefined4 *puStack_28;
  
  if (in_stack_00000008 != 0) {
    __ZdlPv();
  }
  __Unwind_Resume();
  puStack_40 = &UNK_009f6678;
  puStack_38 = (undefined4 *)__Znwm(4);
  puStack_30 = puStack_38 + 1;
  *puStack_38 = 1;
  puStack_28 = puStack_30;
  func_0x00610060(&puStack_60,&puStack_40,2);
  puStack_40 = &UNK_009f6678;
  if (puStack_38 != (undefined4 *)0x0) {
    puStack_30 = puStack_38;
    __ZdlPv();
  }
  func_0x00610060(extraout_x8,&puStack_60,0x9c);
  puStack_60 = &UNK_009f6678;
  if (lStack_58 != 0) {
    lStack_50 = lStack_58;
    __ZdlPv();
  }
  return;
}

