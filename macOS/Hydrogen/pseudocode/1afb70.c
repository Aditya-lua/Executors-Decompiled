
void FUN_001afb70(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  undefined1 uStack0000000000000000;
  
  lVar1 = *(long *)(unaff_x19 + 0x10);
  *(undefined2 *)(*(long *)(unaff_x19 + 8) + lVar1) = 0xffff;
  *(long *)(unaff_x19 + 0x10) = lVar1 + 2;
  uStack0000000000000000 = 0x16;
  func_0x001a5ffc(unaff_x20 + 8);
  func_0x0024031c();
  return;
}

