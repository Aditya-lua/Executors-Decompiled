
undefined1  [16] FUN_005b30c4(long *param_1)

{
  long lVar1;
  long in_x9;
  long unaff_x19;
  undefined1 auVar2 [16];
  
  lVar1 = *param_1;
  *param_1 = lVar1 + in_x9;
  LORelease();
  if (lVar1 == 1) {
    func_0x005d2c74(unaff_x19 + 0x40);
  }
  auVar2._8_8_ = 0x27;
  auVar2._0_8_ = &UNK_008b0742;
  return auVar2;
}

