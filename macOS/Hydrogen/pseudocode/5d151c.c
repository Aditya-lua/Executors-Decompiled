
void FUN_005d151c(long param_1,long param_2)

{
  long in_x9;
  long *unaff_x19;
  long unaff_x21;
  
  do {
    *(long *)(param_2 + param_1 * 8) = in_x9;
    param_1 = param_1 + 1;
    in_x9 = in_x9 + 0x10;
  } while (unaff_x21 != param_1);
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_2;
  unaff_x19[2] = unaff_x21;
  return;
}

