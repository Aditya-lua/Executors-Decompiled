
undefined1  [16] FUN_00179cd8(undefined8 param_1,long param_2)

{
  undefined *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  long alStack_58 [3];
  
  if (param_2 != 0) {
    func_0x00187bd4();
  }
  func_0x00187bd4();
  auVar3 = __Unwind_Resume();
  auVar3._0_8_ = auVar3._0_8_;
  lVar2 = *(long *)(auVar3._0_8_ + 0x10);
  auVar3 = func_0x00181c2c(auVar3._8_8_,auVar3._0_8_);
  puVar1 = auVar3._8_8_;
  func_0x0046b8d0(alStack_58,*(long *)(auVar3._0_8_ + 8) + lVar2,
                  *(long *)(auVar3._0_8_ + 0x10) - lVar2);
  if (alStack_58[0] == 0) {
    lVar2 = *(long *)(auVar3._0_8_ + 0x10);
  }
  else {
    if ((auVar3._0_8_ & 1) == 0) {
      puVar1 = &UNK_009bea38;
    }
    auVar3._8_8_ = puVar1;
    auVar3._0_8_ = 1;
  }
  *(long *)(auVar3._0_8_ + 0x10) = lVar2;
  return auVar3;
}

