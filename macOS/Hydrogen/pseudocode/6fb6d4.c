
long FUN_006fb6d4(double param_1)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  uint in_w8;
  long in_x9;
  uint in_w10;
  uint in_w11;
  long unaff_x21;
  
  uVar1 = (in_w10 ^ in_w11 >> 0x12) * 0x5bd1e995;
  uVar2 = (in_w11 ^ uVar1 >> 0x16) * 0x5bd1e995;
  lVar3 = in_x9 + (ulong)((uVar2 ^ (uVar1 ^ uVar2 >> 0x11) * 0x5bd1e995 >> 0x13) * 0x5bd1e995 &
                         (-1 << (ulong)(in_w8 & 0x1f) ^ 0xffffffffU)) * 0x20;
  uVar1 = *(uint *)(lVar3 + 0x1c);
  while (((uVar1 & 0xf) != 3 || (*(double *)(lVar3 + 0x10) != param_1))) {
    if (uVar1 < 0x10) {
      lVar3 = __dyld_get_image_header(0);
      return lVar3 + unaff_x21;
    }
    lVar3 = lVar3 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
    uVar1 = *(uint *)(lVar3 + 0x1c);
  }
  return lVar3;
}

