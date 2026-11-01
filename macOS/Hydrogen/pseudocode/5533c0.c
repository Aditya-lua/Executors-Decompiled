
void FUN_005533c0(long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  lVar1 = *(long *)(*param_1 + 8);
  lVar2 = *(long *)(*param_1 + 0x10);
  func_0x0046a8c4(&uStack0000000000000008,param_2);
  if (lVar2 != 0) {
    lVar2 = lVar2 << 4;
    do {
      uStack0000000000000018 = lVar1;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009f1618);
      lVar2 = lVar2 + -0x10;
      lVar1 = lVar1 + 0x10;
    } while (lVar2 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

