
bool FUN_006e26d0(void)

{
  bool bVar1;
  long lVar2;
  float fVar3;
  float fVar4;
  double *unaff_x19;
  double *unaff_x20;
  long unaff_x22;
  
  lVar2 = __dyld_get_image_header();
  if ((unaff_x19 == (double *)(lVar2 + unaff_x22)) ||
     (lVar2 = __dyld_get_image_header(0), unaff_x20 == (double *)(lVar2 + unaff_x22))) {
    return false;
  }
  if (*(float *)((long)unaff_x19 + 0xc) != *(float *)((long)unaff_x20 + 0xc)) {
    return false;
  }
  bVar1 = true;
  switch(*(float *)((long)unaff_x19 + 0xc)) {
  case 0.0:
    break;
  case 1.4013e-45:
    fVar3 = *(float *)unaff_x19;
    fVar4 = *(float *)unaff_x20;
    goto code_r0x006f4be8;
  case 2.8026e-45:
    if (*unaff_x19 != *unaff_x20) {
      return false;
    }
    fVar3 = *(float *)(unaff_x19 + 1);
    fVar4 = *(float *)(unaff_x20 + 1);
code_r0x006f4be8:
    bVar1 = fVar3 == fVar4;
    break;
  case 4.2039e-45:
    bVar1 = *unaff_x19 == *unaff_x20;
    break;
  case 5.60519e-45:
    if (*(float *)unaff_x19 != *(float *)unaff_x20) {
      return false;
    }
    if (*(float *)((long)unaff_x19 + 4) != *(float *)((long)unaff_x20 + 4)) {
      return false;
    }
    bVar1 = false;
    if (!NAN(*(float *)(unaff_x19 + 1)) && !NAN(*(float *)(unaff_x20 + 1))) {
      bVar1 = *(float *)(unaff_x19 + 1) == *(float *)(unaff_x20 + 1);
    }
    break;
  default:
    bVar1 = *unaff_x19 == *unaff_x20;
  }
  return bVar1;
}

