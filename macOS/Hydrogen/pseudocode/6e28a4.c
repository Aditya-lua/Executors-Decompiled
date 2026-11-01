
bool FUN_006e28a4(ulong param_1)

{
  char in_NG;
  char in_OV;
  int iVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  
  if (in_NG == in_OV) {
    uVar3 = *(long *)(unaff_x19 + 0x10) + (param_1 & 0xffffffff) * 0x10;
    if (*(ulong *)(unaff_x19 + 8) <= uVar3) {
      lVar2 = __dyld_get_image_header(0);
      uVar3 = lVar2 + unaff_x22;
      lVar2 = __dyld_get_image_header(0);
      goto joined_r0x006e2830;
    }
  }
  else {
    if (unaff_w21 < -9999) {
      uVar3 = func_0x006e60a0();
      lVar2 = __dyld_get_image_header(0);
      goto joined_r0x006e2830;
    }
    uVar3 = *(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x10;
  }
  lVar2 = __dyld_get_image_header(0);
joined_r0x006e2830:
  if (((unaff_x20 == lVar2 + unaff_x22) ||
      (lVar2 = __dyld_get_image_header(0), uVar3 == lVar2 + unaff_x22)) ||
     (*(int *)(unaff_x20 + 0xc) != *(int *)(uVar3 + 0xc))) {
    return false;
  }
  iVar1 = func_0x00702b78();
  return iVar1 != 0;
}

