
undefined1  [16] FUN_0042d214(void)

{
  undefined8 *puVar1;
  undefined1 auVar2 [16];
  long lStack_68;
  long lStack_60;
  long lStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x00187bd4();
  auVar2._0_8_ = (long *)__Unwind_Resume();
  if (*auVar2._0_8_ == -0x8000000000000000) {
    lStack_68 = 0;
    lStack_60 = 1;
    lStack_58 = 0;
    puVar1 = *(undefined8 **)auVar2._0_8_[3];
    uStack_48 = puVar1[1];
    uStack_50 = *puVar1;
    uStack_38 = puVar1[3];
    uStack_40 = puVar1[2];
    uStack_28 = puVar1[5];
    uStack_30 = puVar1[4];
    func_0x0046849c(&lStack_68,&UNK_009d9a80,&uStack_50);
    auVar2._0_8_[1] = lStack_60;
    *auVar2._0_8_ = lStack_68;
    auVar2._0_8_[2] = lStack_58;
  }
  auVar2._8_8_ = &UNK_009db240;
  return auVar2;
}

