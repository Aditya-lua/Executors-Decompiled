
void FUN_005e4eb4(uint *param_1)

{
  long in_x9;
  uint *in_x10;
  uint in_w11;
  uint in_w12;
  
  while( true ) {
    *param_1 = in_w12 ^ in_w11;
    in_x9 = in_x9 + -1;
    if (in_x9 == 0) break;
    in_w11 = *in_x10;
    in_w12 = param_1[1];
    param_1 = param_1 + 1;
    in_x10 = in_x10 + 1;
  }
  return;
}

