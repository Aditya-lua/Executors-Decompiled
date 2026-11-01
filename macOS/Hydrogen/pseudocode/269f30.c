
void FUN_00269f30(int param_1)

{
  ulong uVar1;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x25;
  
  if (param_1 == 0) {
    uVar1 = (**(code **)(unaff_x25 + 0x20))();
    if ((uVar1 & 1) == 0) {
      *unaff_x19 = unaff_x21;
    }
    else {
      *unaff_x19 = -0x7ffffffffffffff1;
    }
  }
  else {
    *unaff_x19 = unaff_x21 + -1;
  }
  return;
}

