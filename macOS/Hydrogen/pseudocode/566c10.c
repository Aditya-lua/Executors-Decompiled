
ulong FUN_00566c10(long param_1,ulong param_2)

{
  long *in_x9;
  long *in_x10;
  long in_x11;
  long in_x12;
  
  while( true ) {
    if (in_x12 != in_x11) {
      return param_2;
    }
    param_1 = param_1 + -1;
    param_2 = (ulong)(param_1 == 0);
    if (param_1 == 0) break;
    if (in_x9[-1] != in_x10[-1]) {
      return param_2;
    }
    in_x11 = *in_x10;
    in_x12 = *in_x9;
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
  }
  return 1;
}

