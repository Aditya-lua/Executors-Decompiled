
undefined4 FUN_006e228c(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  
  lVar1 = __dyld_get_image_header();
  if (unaff_x19 == lVar1 + unaff_x20) {
    return 0xffffffff;
  }
  return *(undefined4 *)(unaff_x19 + 0xc);
}

