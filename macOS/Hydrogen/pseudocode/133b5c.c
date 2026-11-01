
int * FUN_00133b5c(int *param_1,int param_2)

{
  undefined1 in_ZR;
  int *in_x9;
  long in_x10;
  
  while( true ) {
    if ((bool)in_ZR) {
      return (int *)0x0;
    }
    if (*param_1 == param_2) break;
    param_1 = (int *)((long)param_1 + (long)param_1[-1]);
    in_ZR = param_1 == (int *)(in_x10 + *in_x9);
  }
  return param_1;
}

