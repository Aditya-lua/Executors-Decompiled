
void FUN_005961fc(long *param_1)

{
  long in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long lVar1;
  
  lVar1 = in_x12 + 8;
  do {
    *(long *)(in_x9 + in_x10 * 8) = lVar1;
    in_x10 = in_x10 + 1;
    lVar1 = lVar1 + 0x48;
    in_x11 = in_x11 + -1;
  } while (in_x11 != 0);
  *param_1 = in_x10;
  return;
}

