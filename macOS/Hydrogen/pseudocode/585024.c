
undefined8
FUN_00585024(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5)

{
  ulong uVar1;
  
  if (param_1 < 4) {
    if (2 < param_1 - 1U) {
      return param_2;
    }
  }
  else {
    if (param_1 == 4) {
      return param_2;
    }
    uVar1 = func_0x005ca810(param_5 + 8);
    if ((uVar1 & 1) == 0) {
      return 2;
    }
  }
  return 0;
}

