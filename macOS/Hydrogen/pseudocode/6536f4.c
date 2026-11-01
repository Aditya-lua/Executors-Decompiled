
void FUN_006536f4(long param_1)

{
  undefined8 extraout_x8;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined *puStack_40;
  undefined4 *puStack_38;
  undefined4 *puStack_30;
  undefined4 *puStack_28;
  
  if (param_1 != 0) {
    __ZdlPv();
  }
  __Unwind_Resume();
  puStack_40 = &UNK_009f6678;
  puStack_38 = (undefined4 *)__Znwm(4);
  puStack_30 = puStack_38 + 1;
  *puStack_38 = 1;
  puStack_28 = puStack_30;
  func_0x00610060(&puStack_60,&puStack_40,3);
  puStack_40 = &UNK_009f6678;
  if (puStack_38 != (undefined4 *)0x0) {
    puStack_30 = puStack_38;
    __ZdlPv();
  }
  func_0x00610060(extraout_x8,&puStack_60,0x24);
  puStack_60 = &UNK_009f6678;
  if (lStack_58 != 0) {
    lStack_50 = lStack_58;
    __ZdlPv();
  }
  return;
}

