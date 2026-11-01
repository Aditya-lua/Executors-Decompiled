
void FUN_0058724c(long param_1,undefined8 param_2,undefined8 param_3)

{
  long unaff_x20;
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  func_0x0046a8c4(&uStack0000000000000008,param_3);
  if (unaff_x20 != 0) {
    lVar1 = unaff_x20 << 4;
    do {
      uStack0000000000000018 = param_1;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009f1618);
      lVar1 = lVar1 + -0x10;
      param_1 = param_1 + 0x10;
    } while (lVar1 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

