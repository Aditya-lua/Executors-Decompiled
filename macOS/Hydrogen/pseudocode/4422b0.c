
void FUN_004422b0(undefined8 *param_1,long param_2)

{
  long in_x9;
  ulong in_x10;
  
  if ((((in_x10 & 1) == 0) &&
      ((*(int *)(in_x9 + 0x14) == 0 && *(int *)(in_x9 + 0x10) == 0) && *(int *)(in_x9 + 0x18) == 0))
     && (*(int *)(in_x9 + 0x1c) == 0)) {
    *(undefined1 *)(param_2 + 0x10) = 1;
    *param_1 = 0;
    param_1[1] = 0;
    return;
  }
  *param_1 = 0;
  param_1[1] = in_x9;
  return;
}

