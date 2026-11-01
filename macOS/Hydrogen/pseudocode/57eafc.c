
void FUN_0057eafc(void)

{
  long unaff_x19;
  long unaff_x20;
  long lVar1;
  long unaff_x21;
  long unaff_x22;
  long lVar2;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0057cb14(unaff_x20);
    unaff_x20 = unaff_x20 + 0x108;
  }
  lVar1 = *(long *)(unaff_x19 + 0x20);
  if (lVar1 != 0) {
    lVar2 = *(long *)(unaff_x21 + 0x10);
    if (*(long *)(unaff_x19 + 0x18) != lVar2) {
      _memmove(*(long *)(unaff_x21 + 8) + lVar2 * 0x108,
               *(long *)(unaff_x21 + 8) + *(long *)(unaff_x19 + 0x18) * 0x108,lVar1 * 0x108);
    }
    *(long *)(unaff_x21 + 0x10) = lVar2 + lVar1;
  }
  return;
}

