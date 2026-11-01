
void FUN_0061b494(code *param_1)

{
  long unaff_x19;
  long lVar1;
  long *unaff_x20;
  long *unaff_x23;
  long unaff_x25;
  long unaff_x26;
  
  (*param_1)();
  lVar1 = unaff_x19 - unaff_x26 * unaff_x25;
  if (lVar1 != 0) {
    (**(code **)(*unaff_x23 + 0x28))();
    (**(code **)(*unaff_x20 + 0xc0))();
    unaff_x20[2] = unaff_x25 - lVar1;
  }
  return;
}

