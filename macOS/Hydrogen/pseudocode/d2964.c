
float FUN_000d2964(float param_1,undefined1 param_2 [16],undefined1 param_3 [16],float param_4,
                  float param_5,float param_6,float param_7,float param_8,long param_9)

{
  float fVar1;
  float fVar2;
  
  if ((param_8 - param_1) - param_7 <= param_4) {
    param_4 = param_4 + param_5 * ((param_8 - param_1) - param_4);
  }
  param_4 = param_4 - (param_6 - param_1) * param_5;
  fVar1 = param_4 + 0.5;
  if (param_4 < 0.0) {
    fVar1 = 0.5;
  }
  fVar2 = (float)(int)fVar1;
  if (*(float *)(param_9 + 0x94) <= (float)(int)fVar1) {
    fVar2 = *(float *)(param_9 + 0x94);
  }
  return fVar2;
}

