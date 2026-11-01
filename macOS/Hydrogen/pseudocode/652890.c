
/* WARNING: Removing unreachable block (ram,0x006528c0) */

void FUN_00652890(undefined *param_1)

{
  undefined8 extraout_x8;
  undefined *puStack0000000000000000;
  long in_stack_00000008;
  undefined *puStack_60;
  long lStack_58;
  long lStack_50;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  
  puStack0000000000000000 = param_1;
  if (in_stack_00000008 == 0) {
    do {
      __Unwind_Resume();
      __ZdlPv();
      puStack0000000000000000 = &UNK_009f6678;
    } while( true );
  }
  __ZdlPv();
  __Unwind_Resume();
  func_0x00653804(&puStack_40);
  func_0x00610060(&puStack_60,&puStack_40,0);
  puStack_40 = &UNK_009f6678;
  if (lStack_38 != 0) {
    lStack_30 = lStack_38;
    __ZdlPv();
  }
  func_0x00610060(extraout_x8,&puStack_60,6);
  puStack_60 = &UNK_009f6678;
  if (lStack_58 != 0) {
    lStack_50 = lStack_58;
    __ZdlPv();
  }
  return;
}

