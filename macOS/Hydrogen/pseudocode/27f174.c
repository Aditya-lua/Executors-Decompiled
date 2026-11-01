
undefined8 FUN_0027f174(code *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long unaff_x19;
  
  uVar1 = (*param_1)(param_2,param_3,0,0);
  if (*(code **)(unaff_x19 + 0x10) != (code *)0x0) {
    uVar1 = (**(code **)(unaff_x19 + 0x10))();
  }
  return uVar1;
}

