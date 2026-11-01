
void FUN_00426ff4(void)

{
  long unaff_x20;
  ulong unaff_x21;
  long lVar1;
  long unaff_x29;
  
  while( true ) {
    func_0x004015e4(unaff_x29 + -0x38);
    if (*(long *)(unaff_x29 + -0x38) == 0) break;
    lVar1 = *(long *)(unaff_x29 + -0x38) + *(long *)(unaff_x29 + -0x28) * unaff_x20;
    if (*(long *)(lVar1 + 8) != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar1 + 0x10),*(long *)(lVar1 + 8),1);
    }
    if ((*(ulong *)(lVar1 + 0x110) | 0x8000000000000000) != unaff_x21) {
      func_0x00187bd4(*(undefined8 *)(lVar1 + 0x118),*(ulong *)(lVar1 + 0x110),1);
    }
  }
  return;
}

