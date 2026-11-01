
undefined8 FUN_00776258(undefined8 param_1,undefined8 param_2,int param_3)

{
  undefined8 *puVar1;
  long unaff_x19;
  
  if (param_3 == 0x2756) {
    puVar1 = (undefined8 *)(unaff_x19 + 0x4f0);
  }
  else {
    if (param_3 != 0x276d) {
      return param_2;
    }
    puVar1 = (undefined8 *)(unaff_x19 + 0x6d0);
  }
  *puVar1 = param_1;
  return 0;
}

