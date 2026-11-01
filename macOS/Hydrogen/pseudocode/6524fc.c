
void FUN_006524fc(undefined8 param_1)

{
  undefined8 extraout_x8;
  undefined8 uStack0000000000000010;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  
  uStack0000000000000010 = param_1;
  __ZdlPv();
  __Unwind_Resume();
  func_0x00653574(&puStack_60);
  func_0x00610060(&puStack_40,&puStack_60,1);
  func_0x00610060(extraout_x8,&puStack_40,7);
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

