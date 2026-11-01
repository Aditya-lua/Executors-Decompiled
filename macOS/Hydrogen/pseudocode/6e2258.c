
undefined4 FUN_006e2258(long param_1,undefined8 param_2,int param_3)

{
  long lVar1;
  long unaff_x20;
  
  param_1 = param_1 + (long)param_3 * 0x10;
  lVar1 = __dyld_get_image_header(0);
  if (param_1 == lVar1 + unaff_x20) {
    return 0xffffffff;
  }
  return *(undefined4 *)(param_1 + 0xc);
}

