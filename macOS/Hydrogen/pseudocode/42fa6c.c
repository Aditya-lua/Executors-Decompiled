
undefined8 FUN_0042fa6c(void)

{
  undefined8 uVar1;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000008;
  
  auVar2 = func_0x00430c40(&uStack0000000000000008);
  uVar1 = auVar2._8_8_;
  if ((auVar2._0_8_ & 1) == 0) {
    uVar1 = 0;
  }
  _close(uStack0000000000000008._4_4_);
  _close((undefined4)uStack0000000000000008);
  return uVar1;
}

