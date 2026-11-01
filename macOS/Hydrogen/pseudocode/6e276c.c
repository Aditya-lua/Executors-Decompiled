
bool FUN_006e276c(ulong param_1)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  ulong uVar4;
  int unaff_w21;
  long unaff_x22;
  
  uVar4 = *(long *)(unaff_x19 + 0x10) + (param_1 & 0xffffffff) * 0x10;
  if (uVar4 < *(ulong *)(unaff_x19 + 8)) {
    if (0 < unaff_w21) goto LAB_006e27c4;
code_r0x006e2790:
    if (unaff_w21 < -9999) {
      uVar3 = func_0x006e60a0();
      lVar2 = __dyld_get_image_header(0);
      if (uVar4 == lVar2 + unaff_x22) {
        return false;
      }
      goto LAB_006e2834;
    }
    uVar3 = *(long *)(unaff_x19 + 8) + (long)unaff_w21 * 0x10;
  }
  else {
    lVar2 = __dyld_get_image_header(0);
    uVar4 = lVar2 + unaff_x22;
    if (unaff_w21 < 1) goto code_r0x006e2790;
LAB_006e27c4:
    uVar3 = *(long *)(unaff_x19 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10;
    if (*(ulong *)(unaff_x19 + 8) <= uVar3) {
      lVar2 = __dyld_get_image_header(0);
      uVar3 = lVar2 + unaff_x22;
      lVar2 = __dyld_get_image_header(0);
      if (uVar4 == lVar2 + unaff_x22) {
        return false;
      }
      goto LAB_006e2834;
    }
  }
  lVar2 = __dyld_get_image_header(0);
  if (uVar4 == lVar2 + unaff_x22) {
    return false;
  }
LAB_006e2834:
  lVar2 = __dyld_get_image_header(0);
  if ((uVar3 == lVar2 + unaff_x22) || (*(int *)(uVar4 + 0xc) != *(int *)(uVar3 + 0xc))) {
    return false;
  }
  iVar1 = func_0x00702b78();
  return iVar1 != 0;
}

