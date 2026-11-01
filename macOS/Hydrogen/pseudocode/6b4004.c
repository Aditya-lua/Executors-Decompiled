
void FUN_006b4004(uint param_1,undefined8 param_2,undefined8 param_3,uint *param_4)

{
  int in_w8;
  
  param_1 = param_1 & 0x3ff;
  if (in_w8 != 3) {
    param_1 = 0xffffffff;
  }
  *param_4 = param_1;
  return;
}

