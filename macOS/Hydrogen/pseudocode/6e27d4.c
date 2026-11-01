
bool FUN_006e27d4(void)

{
  int iVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  lVar2 = __dyld_get_image_header(0);
  if (((unaff_x20 == lVar2 + unaff_x22) ||
      (lVar2 = __dyld_get_image_header(0), unaff_x21 == lVar2 + unaff_x22)) ||
     (*(int *)(unaff_x20 + 0xc) != *(int *)(unaff_x21 + 0xc))) {
    return false;
  }
  iVar1 = func_0x00702b78();
  return iVar1 != 0;
}

