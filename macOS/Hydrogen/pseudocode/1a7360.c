
void FUN_001a7360(void)

{
  long lVar1;
  long unaff_x19;
  long lVar2;
  long unaff_x21;
  
  func_0x0079b61c();
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *(undefined2 *)(*(long *)(unaff_x19 + 8) + lVar1) = 0xffff;
  *(long *)(unaff_x19 + 0x10) = lVar1 + 2;
  if (*(long *)(unaff_x21 + 0x10) != 0) {
    lVar1 = *(long *)(unaff_x21 + 8);
    lVar2 = *(long *)(unaff_x21 + 0x10) << 5;
    do {
      func_0x001ae650(lVar1);
      lVar1 = lVar1 + 0x20;
      lVar2 = lVar2 + -0x20;
    } while (lVar2 != 0);
  }
  func_0x0024031c();
  return;
}

