
void FUN_006a5c60(void)

{
  undefined8 extraout_x8;
  undefined1 auVar1 [16];
  undefined1 auVar2 [12];
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined *apuStack_60 [2];
  ulong uStack_50;
  ulong uStack_48;
  long lStack_40;
  
  __Unwind_Resume();
  auVar2 = __Unwind_Resume();
  if (auVar2._8_4_ == 0) {
    __Unwind_Resume(auVar2._0_8_);
  }
  auVar1 = func_0x0001753c(auVar2._0_8_);
  func_0x0060a94c(apuStack_90);
  func_0x006095dc(apuStack_60,auVar1._0_8_,apuStack_90);
  func_0x00608730(extraout_x8,apuStack_60,auVar1._8_8_);
  apuStack_60[0] = &UNK_009f5d60;
  if (uStack_48 <= uStack_50) {
    uStack_50 = uStack_48;
  }
  if (lStack_40 != 0) {
    if (uStack_50 != 0) {
      do {
        *(undefined8 *)(lStack_40 + -8 + uStack_50 * 8) = 0;
        uStack_50 = uStack_50 - 1;
      } while (uStack_50 != 0);
    }
    func_0x00611644();
  }
  apuStack_90[0] = &UNK_009f5d60;
  if (uStack_78 <= uStack_80) {
    uStack_80 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uStack_80 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
        uStack_80 = uStack_80 - 1;
      } while (uStack_80 != 0);
    }
    func_0x00611644();
  }
  return;
}

