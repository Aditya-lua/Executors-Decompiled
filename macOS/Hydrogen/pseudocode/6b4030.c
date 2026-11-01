
uint FUN_006b4030(long param_1,uint param_2,long param_3)

{
  int in_w9;
  
  while( true ) {
    param_2 = in_w9 + (uint)*(byte *)(param_1 + param_3) ^ param_2;
    param_3 = param_3 + -1;
    if (param_3 == 0) break;
    in_w9 = param_2 * 0x20 + (param_2 >> 2);
  }
  return param_2;
}

