
long FUN_006fb82c(undefined8 param_1,long param_2,int param_3)

{
  uint uVar1;
  long lVar2;
  uint in_w8;
  long in_x9;
  uint in_w10;
  
  lVar2 = in_x9 + (ulong)(in_w10 & (in_w8 ^ 0xffffffff)) * 0x20;
  uVar1 = *(uint *)(lVar2 + 0x1c);
  while ((((uVar1 & 0xf) != 2 || (*(long *)(lVar2 + 0x10) != param_2)) ||
         (*(int *)(lVar2 + 0x18) != param_3))) {
    if (uVar1 < 0x10) {
      lVar2 = __dyld_get_image_header(0);
      return lVar2 + 0x4e8dd08;
    }
    lVar2 = lVar2 + ((long)((ulong)uVar1 << 0x20) >> 0x24) * 0x20;
    uVar1 = *(uint *)(lVar2 + 0x1c);
  }
  return lVar2;
}

