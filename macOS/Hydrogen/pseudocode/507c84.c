
void FUN_00507c84(long param_1,long param_2,undefined8 param_3)

{
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  func_0x0046a8c4(&uStack0000000000000008,param_3);
  if (param_2 != 0) {
    param_2 = param_2 << 4;
    do {
      uStack0000000000000018 = param_1;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009e9758);
      param_2 = param_2 + -0x10;
      param_1 = param_1 + 0x10;
    } while (param_2 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

