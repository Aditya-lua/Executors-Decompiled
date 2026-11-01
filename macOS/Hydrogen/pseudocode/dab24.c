
/* WARNING: Removing unreachable block (ram,0x000dabe0) */

float FUN_000dab24(float param_1,undefined1 param_2 [16],undefined1 param_3 [16],float param_4,
                  float param_5,float *param_6,undefined8 param_7,undefined4 *param_8,
                  undefined8 param_9,undefined8 param_10,int param_11)

{
  float fVar1;
  float fVar2;
  float in_s17;
  float in_s18;
  float in_s22;
  
  if (param_5 <= in_s22) {
    fVar2 = param_1 - param_5;
    if (param_1 - param_5 < param_4) {
      fVar2 = param_4;
    }
    *param_8 = 0;
    return fVar2;
  }
  *param_8 = 0xffffffff;
  if (param_11 == 2) {
    return in_s18 + 2.0;
  }
  fVar2 = param_5 + *param_6;
  if (in_s17 <= param_5 + *param_6) {
    fVar2 = in_s17;
  }
  fVar1 = fVar2 - param_5;
  if (fVar2 - param_5 < param_4) {
    fVar1 = param_4;
  }
  return fVar1;
}

