
long FUN_0067b184(void)

{
  bool bVar1;
  uint in_w8;
  ulong uVar2;
  ulong *puVar3;
  int in_w11;
  long lVar4;
  ulong uVar5;
  long unaff_x19;
  long unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  int unaff_w25;
  
  do {
    uVar2 = 0;
    puVar3 = unaff_x21;
    lVar4 = unaff_x22;
    do {
      uVar5 = *puVar3;
      *puVar3 = uVar2 | uVar5 << 1;
      uVar2 = uVar5 >> 0x3f;
      lVar4 = lVar4 + -1;
      puVar3 = puVar3 + 1;
    } while (lVar4 != 0);
    bVar1 = 0 < in_w11;
    in_w11 = in_w11 + -1;
  } while (bVar1);
  if ((in_w8 & 0x3f) != 0) {
    unaff_x21[unaff_x22 + -1] =
         unaff_x21[unaff_x22 + -1] & (-1L << (in_w8 & 0x3f) ^ 0xffffffffffffffffU);
  }
  if (*(ulong **)(unaff_x19 + 0xb8) != unaff_x21) {
    _memcpy();
  }
  if (unaff_x21 != (ulong *)0x0) {
    if (unaff_w25 != 0) {
      do {
        *(undefined8 *)((long)unaff_x21 + unaff_x20 + -8) = 0;
        unaff_x20 = unaff_x20 + -8;
      } while (unaff_x20 != 0);
    }
    func_0x00611644();
  }
  return unaff_x19 + 0xa0;
}

