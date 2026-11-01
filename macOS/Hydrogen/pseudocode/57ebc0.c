
void FUN_0057ebc0(long param_1)

{
  long unaff_x19;
  long lVar1;
  long lVar2;
  long unaff_x22;
  long unaff_x23;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x0057c5c4(param_1);
    param_1 = param_1 + 0x40;
  }
  lVar1 = *(long *)(unaff_x19 + 0x20);
  if (lVar1 != 0) {
    lVar2 = *(long *)(unaff_x22 + 0x10);
    if (*(long *)(unaff_x19 + 0x18) != lVar2) {
      _memmove(*(long *)(unaff_x22 + 8) + lVar2 * 0x40,
               *(long *)(unaff_x22 + 8) + *(long *)(unaff_x19 + 0x18) * 0x40,lVar1 << 6);
    }
    *(long *)(unaff_x22 + 0x10) = lVar2 + lVar1;
  }
  return;
}

