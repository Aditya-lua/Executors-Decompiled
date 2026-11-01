
void FUN_0061920c(long param_1)

{
  undefined1 in_ZR;
  long in_x9;
  undefined8 *unaff_x19;
  
  while (!(bool)in_ZR) {
    *(undefined1 *)(in_x9 + param_1) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  unaff_x19[-1] = &UNK_00a0c238;
  *unaff_x19 = &UNK_00a0c3e0;
  if ((long *)unaff_x19[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[2] + 8))();
  }
  return;
}

