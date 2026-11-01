
void FUN_0061ac90(long param_1)

{
  undefined8 uVar1;
  long in_x9;
  long *unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  
  do {
    *(undefined1 *)(in_x9 + param_1) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if ((int)unaff_x23 == 0) {
    uVar1 = 0;
  }
  else {
    uVar1 = func_0x006115d0();
  }
  *(undefined8 *)(unaff_x22 + 0x28) = unaff_x23;
  *(undefined8 *)(unaff_x22 + 0x30) = uVar1;
  *(undefined8 *)(unaff_x22 + 0x20) = 0xffffffffffffffff;
  func_0x005ee798();
                    /* WARNING: Could not recover jumptable at 0x0061acfc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x50))();
  return;
}

