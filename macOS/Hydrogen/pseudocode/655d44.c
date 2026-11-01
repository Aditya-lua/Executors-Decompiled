
void FUN_00655d44(long param_1)

{
  long lVar1;
  long *unaff_x19;
  
  lVar1 = __Znwm(param_1 * 0x50);
  *unaff_x19 = lVar1;
  unaff_x19[1] = lVar1;
  unaff_x19[2] = lVar1 + param_1 * 0x50;
  lVar1 = FUN_00655eb0();
  unaff_x19[1] = lVar1;
  return;
}

