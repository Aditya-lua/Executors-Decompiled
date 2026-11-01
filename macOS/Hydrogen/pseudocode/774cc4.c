
undefined8 FUN_00774cc4(code *param_1)

{
  undefined8 uVar1;
  long *unaff_x20;
  
  while( true ) {
    uVar1 = (*param_1)();
    if ((int)uVar1 != 0) {
      return uVar1;
    }
    unaff_x20 = (long *)unaff_x20[1];
    if (unaff_x20 == (long *)0x0) break;
    param_1 = *(code **)(*unaff_x20 + 0x40);
  }
  return 0;
}

