
void FUN_00651e9c(undefined8 param_1)

{
  undefined8 extraout_x8;
  long unaff_x19;
  undefined *puStack_40;
  long lStack_38;
  long lStack_30;
  
  func_0x00087574();
  if (*(long **)(unaff_x19 + 0x10) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x10) + 8))();
  }
  __Unwind_Resume(param_1);
  func_0x00653278(&puStack_40);
  func_0x00610060(extraout_x8,&puStack_40,0x12d);
  puStack_40 = &UNK_009f6678;
  if (lStack_38 != 0) {
    lStack_30 = lStack_38;
    __ZdlPv();
  }
  return;
}

