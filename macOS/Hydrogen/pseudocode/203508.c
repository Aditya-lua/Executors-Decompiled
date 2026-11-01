
void FUN_00203508(long param_1,long param_2)

{
  long lVar1;
  long in_x9;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  long unaff_x25;
  
  lVar1 = unaff_x22;
  if (8 < unaff_x23) {
    lVar1 = in_x9 - param_1;
  }
  _memset(param_2 + unaff_x25,0xff);
  unaff_x19[4] = unaff_x21;
  unaff_x19[5] = unaff_x20;
  *unaff_x19 = param_2 + unaff_x25;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = lVar1;
  unaff_x19[3] = 0;
  return;
}

