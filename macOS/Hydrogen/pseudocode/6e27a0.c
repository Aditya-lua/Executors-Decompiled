
bool FUN_006e27a0(long param_1)

{
  int iVar1;
  long lVar2;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  
  param_1 = param_1 + (long)unaff_w21 * 0x10;
  lVar2 = __dyld_get_image_header(0);
  if (((unaff_x20 == lVar2 + unaff_x22) ||
      (lVar2 = __dyld_get_image_header(0), param_1 == lVar2 + unaff_x22)) ||
     (*(int *)(unaff_x20 + 0xc) != *(int *)(param_1 + 0xc))) {
    return false;
  }
  iVar1 = func_0x00702b78();
  return iVar1 != 0;
}

