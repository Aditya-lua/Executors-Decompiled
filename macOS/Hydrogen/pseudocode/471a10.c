
ulong FUN_00471a10(long param_1,float param_2)

{
  long unaff_x23;
  int unaff_w25;
  float fVar1;
  
  if (unaff_x23 < 0) {
    param_2 = param_2 / *(float *)(param_1 + unaff_x23 * -4);
  }
  else {
    param_2 = *(float *)(param_1 + unaff_x23 * 4) * param_2;
  }
  fVar1 = -param_2;
  if (unaff_w25 != 0x2d) {
    fVar1 = param_2;
  }
  return (ulong)(uint)fVar1 << 0x20 | 0x100;
}

