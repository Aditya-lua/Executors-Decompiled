
undefined8 FUN_00187d4c(ulong param_1)

{
  undefined8 uVar1;
  long *unaff_x19;
  
  if ((param_1 & 1) == 0) {
    uVar1 = 1;
  }
  else {
    if (*unaff_x19 != -0x7fffffffffffffd9) {
      func_0x00188254();
    }
    uVar1 = 0;
    *unaff_x19 = -0x8000000000000000;
  }
  return uVar1;
}

