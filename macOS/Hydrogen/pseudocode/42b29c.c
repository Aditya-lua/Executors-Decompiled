
undefined1  [16] FUN_0042b29c(void)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined1 auStack_90 [16];
  undefined8 uStack_58;
  undefined8 uStack_50;
  int iStack_44;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  
  func_0x00187bd4();
  func_0x00187bd4();
  __Unwind_Resume();
  uStack_58 = 0;
  uStack_50 = 0;
  iStack_44 = _CCRandomGenerateBytes(&uStack_58,0x10);
  if (iStack_44 == 0) {
    auVar2._8_8_ = uStack_50;
    auVar2._0_8_ = uStack_58;
    return auVar2;
  }
  puStack_40 = &UNK_009dc218;
  uStack_38 = 1;
  uStack_28 = 0;
  uStack_20 = 0;
  uStack_30 = 8;
  auVar2 = func_0x0079ffdc(0,&iStack_44,&UNK_0081a9a8,&puStack_40,&UNK_009dc228);
  func_0x00469240(auStack_90,auVar2._8_8_,&UNK_00886a20,10);
  uVar1 = func_0x004653b0(auStack_90,&UNK_00886a2a,5,auVar2._0_8_ + 0x18,&UNK_009d9f48);
  func_0x004653b0(uVar1,&UNK_00888498,4,auVar2._0_8_,&UNK_009daf10);
  auVar2 = func_0x00465628(auStack_90);
  return auVar2;
}

