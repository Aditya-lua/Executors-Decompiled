
undefined8 FUN_0059bfc0(undefined8 *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 *in_x9;
  long unaff_x19;
  
  if (param_1 == in_x9) {
    if (*(long *)(unaff_x19 + 0x38) != 0) {
      func_0x00187bd4(param_2,*(long *)(unaff_x19 + 0x38) << 3,8);
    }
    uVar1 = 0;
    *(undefined8 *)(unaff_x19 + 0x28) = 0;
  }
  else {
    uVar1 = *param_1;
    *(undefined8 **)(unaff_x19 + 0x30) = param_1 + 1;
  }
  return uVar1;
}

