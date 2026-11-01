
undefined8
FUN_006f317c(ulong param_1,float param_2,float param_3,float param_4,float param_5,float param_6,
            float param_7,float param_8,float param_9)

{
  long in_x9;
  long in_x10;
  long in_x11;
  float *pfVar1;
  long in_x12;
  long in_x13;
  long in_x14;
  float fVar2;
  float fVar3;
  float in_s16;
  float in_s17;
  float fVar4;
  float in_s18;
  float in_s19;
  
  fVar3 = param_7 + in_s17;
  pfVar1 = (float *)(in_x9 + ((ulong)*(byte *)(in_x11 + 1) & 0xf) * (param_1 & 0xffffffff));
  fVar4 = param_6 * pfVar1[1] + param_4 * *pfVar1 + fVar3 * pfVar1[2];
  pfVar1 = (float *)(in_x9 + ((ulong)*(byte *)(in_x13 + 1) & 0xf) * (param_1 & 0xffffffff));
  fVar4 = fVar4 + ((param_6 * pfVar1[1] + param_8 * *pfVar1 + fVar3 * pfVar1[2]) - fVar4) * param_2;
  pfVar1 = (float *)(in_x9 + ((ulong)*(byte *)(in_x12 + 1) & 0xf) * (param_1 & 0xffffffff));
  fVar2 = in_s16 * pfVar1[1] + param_4 * *pfVar1 + fVar3 * pfVar1[2];
  pfVar1 = (float *)(in_x9 + ((ulong)*(byte *)(in_x10 + 1) & 0xf) * (param_1 & 0xffffffff));
  param_9 = param_9 + ((in_s18 + ((in_s19 + param_7 * *(float *)(in_x14 + 8)) - in_s18) * param_2) -
                      param_9) * param_3;
  func_0x006e3850((double)(param_9 +
                          ((fVar4 + ((fVar2 + ((in_s16 * pfVar1[1] + param_8 * *pfVar1 +
                                               fVar3 * pfVar1[2]) - fVar2) * param_2) - fVar4) *
                                    param_3) - param_9) * param_5));
  return 1;
}

