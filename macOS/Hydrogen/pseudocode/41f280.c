
void FUN_0041f280(void)

{
  long lVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  func_0x0046a8c4();
  lVar1 = unaff_x21;
  lVar2 = uStack0000000000000018;
  for (; uStack0000000000000018 = lVar1, unaff_x20 != 0; unaff_x20 = unaff_x20 + -1) {
    lVar1 = uStack0000000000000018 + 1;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009d9198);
    lVar2 = uStack0000000000000018;
  }
  uStack0000000000000018 = lVar2;
  func_0x00465c80(&uStack0000000000000008);
  return;
}

