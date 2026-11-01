
long FUN_006e60c8(long param_1,int param_2)

{
  bool in_ZR;
  long lVar1;
  
  if (in_ZR) {
    return *(long *)(param_1 + 0x18) + 0x490;
  }
  lVar1 = **(long **)(*(long *)(param_1 + 0x20) + 8);
  if ((int)(uint)*(byte *)(lVar1 + 4) < -0x2712 - param_2) {
    lVar1 = __dyld_get_image_header(0);
    return lVar1 + 0x4e8dd08;
  }
  return lVar1 + (long)(-0x2713 - param_2) * 0x10 + 0x30;
}

