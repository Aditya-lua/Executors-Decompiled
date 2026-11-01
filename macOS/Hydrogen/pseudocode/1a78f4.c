
void FUN_001a78f4(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x21;
  
  func_0x0079b61c();
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *(undefined1 *)(*(long *)(unaff_x19 + 8) + lVar1) = 0xff;
  *(long *)(unaff_x19 + 0x10) = lVar1 + 1;
  if (*(long *)(unaff_x21 + 0x10) != 0) {
    lVar1 = *(long *)(unaff_x21 + 8);
    lVar2 = *(long *)(unaff_x21 + 0x10) << 2;
    do {
      func_0x001f0f84(lVar1);
      lVar1 = lVar1 + 4;
      lVar2 = lVar2 + -4;
    } while (lVar2 != 0);
  }
  func_0x0024031c();
  return;
}

