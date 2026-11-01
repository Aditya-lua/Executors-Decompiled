
long FUN_005ed8d0(long param_1,long param_2)

{
  long in_x9;
  long *in_x10;
  long in_x11;
  
  while( true ) {
    if (in_x11 == param_1) {
      param_2 = param_2 + 1;
    }
    in_x9 = in_x9 + -1;
    if (in_x9 == 0) break;
    in_x11 = *(long *)(*in_x10 + 0x10);
    in_x10 = in_x10 + 3;
  }
  return param_2;
}

