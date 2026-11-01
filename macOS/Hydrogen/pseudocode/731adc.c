
undefined8 FUN_00731adc(long param_1)

{
  undefined8 uVar1;
  long *unaff_x23;
  code *unaff_x24;
  
  while ((*(code **)(param_1 + 0x58) == unaff_x24 ||
         (uVar1 = (**(code **)(param_1 + 0x58))(unaff_x23), (int)uVar1 == 0))) {
    unaff_x23 = (long *)unaff_x23[1];
    if (unaff_x23 == (long *)0x0) {
      return 0;
    }
    param_1 = *unaff_x23;
  }
  return uVar1;
}

