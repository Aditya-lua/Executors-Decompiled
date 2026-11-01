
undefined8 FUN_0046b1b4(long param_1,undefined8 param_2,long param_3,long param_4)

{
  uint in_w9;
  
  do {
    if (*(byte *)(param_1 + param_3) == in_w9) {
      return 1;
    }
    param_3 = param_3 + 1;
  } while (param_4 != param_3);
  return 0;
}

