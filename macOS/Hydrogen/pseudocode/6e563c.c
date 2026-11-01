
long FUN_006e563c(void)

{
  long lVar1;
  long *plVar2;
  long unaff_x19;
  
  func_0x006efe90();
  if ((*(byte *)(unaff_x19 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4();
  }
  lVar1 = func_0x006feb1c();
  plVar2 = *(long **)(unaff_x19 + 8);
  *plVar2 = lVar1;
  *(undefined4 *)((long)plVar2 + 0xc) = 8;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return lVar1 + 0x10;
}

