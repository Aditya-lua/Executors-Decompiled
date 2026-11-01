
void FUN_000f4c90(void)

{
  long lVar1;
  int in_w8;
  uint in_w9;
  uint in_w10;
  uint in_w11;
  long unaff_x19;
  undefined8 *unaff_x25;
  
  if (in_w8 != 0) {
    in_w10 = in_w11;
  }
  if ((int)in_w10 <= (int)in_w9) {
    in_w10 = in_w9;
  }
  lVar1 = func_0x000b810c(-(ulong)(in_w10 >> 0x1f) & 0xfffffff800000000 | (ulong)in_w10 << 3);
  if (*(long *)(unaff_x19 + 0x80) != 0) {
    _memcpy(lVar1,*(long *)(unaff_x19 + 0x80),(long)*(int *)(unaff_x19 + 0x78) << 3);
    func_0x000b83d4(*(undefined8 *)(unaff_x19 + 0x80));
  }
  *(long *)(unaff_x19 + 0x80) = lVar1;
  *(uint *)(unaff_x19 + 0x7c) = in_w10;
  *(undefined8 *)(lVar1 + (long)*(int *)(unaff_x19 + 0x78) * 8) = *unaff_x25;
  *(int *)(unaff_x19 + 0x78) = *(int *)(unaff_x19 + 0x78) + 1;
  func_0x000f2c5c();
  func_0x000f0ff4();
  *(undefined4 *)(unaff_x19 + 0x78) = 0;
  return;
}

