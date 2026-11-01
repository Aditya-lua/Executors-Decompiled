
undefined4 FUN_00462718(undefined1 param_1 [16],undefined8 param_2)

{
  undefined4 uVar1;
  undefined1 uStack0000000000000010;
  
  _uStack0000000000000010 = param_2;
  if (param_1._8_8_ == param_1._0_8_) {
    uVar1 = 0x110000;
  }
  else {
    uVar1 = *(undefined4 *)(&uStack0000000000000010 + (param_1._8_8_ + -1) * 4);
  }
  return uVar1;
}

