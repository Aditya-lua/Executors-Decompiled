
ulong FUN_00588e20(long param_1,ulong param_2)

{
  long *in_x9;
  long *in_x10;
  
  while( true ) {
    if (in_x10[-1] != in_x9[-1]) {
      return param_2;
    }
    if (*in_x10 != *in_x9) break;
    param_1 = param_1 + -1;
    param_2 = (ulong)(param_1 == 0);
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
    if (param_1 == 0) {
      return 1;
    }
  }
  return param_2;
}

