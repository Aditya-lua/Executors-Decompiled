
undefined4 FUN_006e2224(void)

{
  long lVar1;
  long lVar2;
  long unaff_x20;
  
  lVar1 = __dyld_get_image_header(0);
  lVar2 = __dyld_get_image_header(0);
  if (lVar1 + unaff_x20 == lVar2 + unaff_x20) {
    return 0xffffffff;
  }
  return *(undefined4 *)(lVar1 + unaff_x20 + 0xc);
}

