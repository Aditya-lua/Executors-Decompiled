
void FUN_00618d38(long param_1)

{
  long *unaff_x19;
  
  unaff_x19[-1] = param_1 + 0x10;
  *unaff_x19 = param_1 + 0x1b8;
  if ((long *)unaff_x19[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[2] + 8))();
  }
  return;
}

