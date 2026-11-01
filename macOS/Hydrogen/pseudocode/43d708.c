
void FUN_0043d708(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  uint in_w8;
  uint in_w9;
  
  if (in_w8 == (in_w9 & 0xffff | 0xfeed0000)) {
    *param_1 = param_2;
    param_1[1] = param_2;
    param_1[2] = param_3;
  }
  else {
    *param_1 = 0;
  }
  return;
}

