
long FUN_006fb83c(long param_1,long param_2,int param_3)

{
  long lVar1;
  uint in_w8;
  uint in_w9;
  
  while (((in_w9 != 2 || (*(long *)(param_1 + 0x10) != param_2)) ||
         (*(int *)(param_1 + 0x18) != param_3))) {
    if (in_w8 < 0x10) {
      lVar1 = __dyld_get_image_header(0);
      return lVar1 + 0x4e8dd08;
    }
    param_1 = param_1 + ((long)((ulong)in_w8 << 0x20) >> 0x24) * 0x20;
    in_w8 = *(uint *)(param_1 + 0x1c);
    in_w9 = in_w8 & 0xf;
  }
  return param_1;
}

