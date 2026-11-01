
void FUN_00094ba0(long param_1,long param_2)

{
  long unaff_x19;
  long *unaff_x22;
  
  unaff_x22[1] = unaff_x19;
  unaff_x22[2] = param_1;
  *unaff_x22 = param_2;
  _memmove(param_2);
  *(undefined1 *)(param_2 + unaff_x19) = 0;
  return;
}

