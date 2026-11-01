
void FUN_00553364(void)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  
  if (unaff_x19 != 0) {
    lVar1 = unaff_x19 << 3;
    do {
      uStack0000000000000018 = unaff_x20;
      func_0x00465960(&uStack0000000000000008,&uStack0000000000000018,&UNK_009f1698);
      lVar1 = lVar1 + -8;
      unaff_x20 = unaff_x20 + 8;
    } while (lVar1 != 0);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

