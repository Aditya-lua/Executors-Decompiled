
void FUN_007322c8(void)

{
  uint uVar1;
  uint in_w3;
  uint in_w4;
  uint in_w8;
  long in_x9;
  uint in_w10;
  long unaff_x19;
  undefined1 *unaff_x20;
  uint unaff_w21;
  
  uVar1 = in_w10 & (in_w4 ^ 0xffffffff) | in_w3 & 0xff;
  *unaff_x20 = (char)uVar1;
  if (uVar1 == 0) {
    if (unaff_w21 + 1 < in_w8) {
      _memmove(unaff_x19 + in_x9,unaff_x19 + in_x9 + 4,(ulong)(~unaff_w21 + in_w8) << 2);
      _memmove();
      in_w8 = *(uint *)(unaff_x19 + 0x14);
    }
    *(uint *)(unaff_x19 + 0x14) = in_w8 - 1;
  }
  return;
}

