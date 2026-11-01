
void FUN_005d8888(long param_1,long param_2)

{
  long in_x9;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  
  do {
    *(long *)(param_2 + param_1 * 8) = in_x9;
    in_x9 = in_x9 + 0x40;
    param_1 = param_1 + 1;
  } while (in_x9 != unaff_x22 + unaff_x21 * 0x40);
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = param_2;
  unaff_x19[2] = param_1;
  return;
}

