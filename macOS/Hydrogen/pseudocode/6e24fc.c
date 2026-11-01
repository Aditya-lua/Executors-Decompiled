
bool FUN_006e24fc(long param_1,int param_2)

{
  char in_NG;
  char in_OV;
  long lVar1;
  long lVar2;
  long unaff_x20;
  
  if (in_NG == in_OV) {
    lVar2 = *(long *)(param_1 + 8) + (long)param_2 * 0x10;
    lVar1 = __dyld_get_image_header(0);
    if (lVar2 == lVar1 + unaff_x20) {
      return false;
    }
  }
  else {
    lVar2 = func_0x006e60a0();
    lVar1 = __dyld_get_image_header(0);
    if (lVar2 == lVar1 + unaff_x20) {
      return false;
    }
  }
  return *(int *)(lVar2 + 0xc) == 5 || *(int *)(lVar2 + 0xc) == 3;
}

