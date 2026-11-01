
undefined8
FUN_006fff04(float param_1,float param_2,float param_3,float param_4,float param_5,float param_6,
            float param_7)

{
  float *unaff_x20;
  double dVar1;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  
  dVar1 = (double)_atan2((double)param_1,
                         (double)(param_6 * param_4 + param_5 * param_7 + param_2 * param_3));
  if ((unaff_x20 != (float *)0x0) &&
     (unaff_s10 * unaff_x20[1] + *unaff_x20 * unaff_s8 + unaff_x20[2] * unaff_s9 < 0.0)) {
    dVar1 = -dVar1;
  }
  func_0x006e3850(dVar1);
  return 1;
}

