
void FUN_00524584(void)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000018;
  
  lVar1 = unaff_x20 << 5;
  do {
    _uStack0000000000000018 = unaff_x19;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009e9818);
    lVar1 = lVar1 + -0x20;
    unaff_x19 = unaff_x19 + 0x20;
  } while (lVar1 != 0);
  func_0x00465c80(&uStack0000000000000008);
  return;
}

