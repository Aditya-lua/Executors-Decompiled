
void FUN_0055325c(long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  lVar1 = *(long *)(*param_1 + 8);
  lVar2 = *(long *)(*param_1 + 0x10);
  func_0x0046a8c4(&uStack0000000000000008,param_2);
  if (lVar2 != 0) {
    lVar2 = lVar2 * 0x108;
    do {
      uStack0000000000000018 = lVar1;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009f15f8);
      lVar2 = lVar2 + -0x108;
      lVar1 = lVar1 + 0x108;
    } while (lVar2 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

