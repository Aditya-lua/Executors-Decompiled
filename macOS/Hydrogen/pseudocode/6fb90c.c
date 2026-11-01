
long FUN_006fb90c(long param_1)

{
  uint uVar1;
  long lVar2;
  long in_x9;
  long in_x10;
  
  lVar2 = in_x9 + in_x10 * 0x20;
  uVar1 = *(uint *)(lVar2 + 0x1c);
  while (((uVar1 & 0xf) != 5 || (*(long *)(lVar2 + 0x10) != param_1))) {
    if (uVar1 < 0x10) {
      lVar2 = __dyld_get_image_header(0);
      return lVar2 + 0x4e8dd08;
    }
    lVar2 = lVar2 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
    uVar1 = *(uint *)(lVar2 + 0x1c);
  }
  return lVar2;
}

