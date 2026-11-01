
bool FUN_00113808(void)

{
  double *unaff_x19;
  int unaff_w25;
  long unaff_x26;
  double dVar1;
  double dVar2;
  double unaff_d8;
  double unaff_d9;
  double unaff_d10;
  float unaff_s13;
  
  dVar1 = *unaff_x19;
  *(float *)(unaff_x26 + 3) = *(float *)(unaff_x26 + 3) - (float)(unaff_d10 - dVar1);
  dVar2 = 0.0;
  if (unaff_d10 != 0.0) {
    dVar2 = unaff_d10;
  }
  if ((unaff_d9 < unaff_d8) && (dVar1 != dVar2)) {
    if ((dVar2 < unaff_d9) || (((unaff_w25 != 8 && (dVar1 < dVar2)) && (unaff_s13 < 0.0)))) {
      dVar2 = unaff_d9;
    }
    if ((unaff_d8 < dVar2) || (((unaff_w25 != 8 && (dVar2 < dVar1)) && (0.0 < unaff_s13)))) {
      dVar2 = unaff_d8;
    }
  }
  if (dVar1 != dVar2) {
    *unaff_x19 = dVar2;
  }
  return dVar1 != dVar2;
}

