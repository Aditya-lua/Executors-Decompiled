
void FUN_004da320(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  func_0x0046a8c4(&uStack0000000000000008,param_3);
  lVar1 = param_1;
  lVar2 = uStack0000000000000018;
  for (; uStack0000000000000018 = lVar1, param_2 != 0; param_2 = param_2 + -1) {
    lVar1 = uStack0000000000000018 + 1;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009e7b00);
    lVar2 = uStack0000000000000018;
  }
  uStack0000000000000018 = lVar2;
  func_0x00465c80(&uStack0000000000000008);
  return;
}

