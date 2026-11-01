
void FUN_004b36c0(void)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  if (unaff_x20 != 0) {
    lVar1 = unaff_x20 * 0x108;
    do {
      uStack0000000000000018 = unaff_x19;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009e4a90);
      lVar1 = lVar1 + -0x108;
      unaff_x19 = unaff_x19 + 0x108;
    } while (lVar1 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

