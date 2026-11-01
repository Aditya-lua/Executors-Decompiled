
bool FUN_006e2634(void)

{
  bool bVar1;
  long lVar2;
  double *pdVar3;
  float fVar4;
  float fVar5;
  double *in_x10;
  double *unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  
  if (unaff_x19 < in_x10) {
    if (0 < unaff_w21) goto LAB_006e2670;
LAB_006e26b8:
    if (unaff_w21 < -9999) {
      pdVar3 = (double *)func_0x006e60a0();
      lVar2 = __dyld_get_image_header(0);
      if (unaff_x19 == (double *)(lVar2 + unaff_x22)) {
        return false;
      }
    }
    else {
      pdVar3 = (double *)(*(long *)(unaff_x20 + 8) + (long)unaff_w21 * 0x10);
LAB_006e26cc:
      lVar2 = __dyld_get_image_header(0);
      if (unaff_x19 == (double *)(lVar2 + unaff_x22)) {
        return false;
      }
    }
  }
  else {
    lVar2 = __dyld_get_image_header(0);
    unaff_x19 = (double *)(lVar2 + unaff_x22);
    if (unaff_w21 < 1) goto LAB_006e26b8;
LAB_006e2670:
    pdVar3 = (double *)(*(long *)(unaff_x20 + 0x10) + (ulong)(unaff_w21 - 1) * 0x10);
    if (pdVar3 < *(double **)(unaff_x20 + 8)) goto LAB_006e26cc;
    lVar2 = __dyld_get_image_header(0);
    pdVar3 = (double *)(lVar2 + unaff_x22);
    lVar2 = __dyld_get_image_header(0);
    if (unaff_x19 == (double *)(lVar2 + unaff_x22)) {
      return false;
    }
  }
  lVar2 = __dyld_get_image_header(0);
  if (pdVar3 == (double *)(lVar2 + unaff_x22)) {
    return false;
  }
  if (*(float *)((long)unaff_x19 + 0xc) != *(float *)((long)pdVar3 + 0xc)) {
    return false;
  }
  bVar1 = true;
  switch(*(float *)((long)unaff_x19 + 0xc)) {
  case 0.0:
    break;
  case 1.4013e-45:
    fVar4 = *(float *)unaff_x19;
    fVar5 = *(float *)pdVar3;
    goto code_r0x006f4be8;
  case 2.8026e-45:
    if (*unaff_x19 != *pdVar3) {
      return false;
    }
    fVar4 = *(float *)(unaff_x19 + 1);
    fVar5 = *(float *)(pdVar3 + 1);
code_r0x006f4be8:
    bVar1 = fVar4 == fVar5;
    break;
  case 4.2039e-45:
    bVar1 = *unaff_x19 == *pdVar3;
    break;
  case 5.60519e-45:
    if (*(float *)unaff_x19 != *(float *)pdVar3) {
      return false;
    }
    if (*(float *)((long)unaff_x19 + 4) != *(float *)((long)pdVar3 + 4)) {
      return false;
    }
    bVar1 = false;
    if (!NAN(*(float *)(unaff_x19 + 1)) && !NAN(*(float *)(pdVar3 + 1))) {
      bVar1 = *(float *)(unaff_x19 + 1) == *(float *)(pdVar3 + 1);
    }
    break;
  default:
    bVar1 = *unaff_x19 == *pdVar3;
  }
  return bVar1;
}

