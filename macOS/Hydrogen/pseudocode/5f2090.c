
undefined1  [16] FUN_005f2090(long *param_1,undefined8 param_2,long *param_3)

{
  undefined1 auVar1 [16];
  
  auVar1 = (**(code **)(*param_1 + 0x80))();
  if (param_3 != (long *)0x0) {
    (**(code **)(*param_3 + 8))(param_3);
  }
  return auVar1;
}

