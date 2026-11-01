
ulong FUN_0046b85c(ulong param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = param_1;
  if (param_2 != 0) {
    do {
      param_1 = param_2;
      uVar1 = 0;
      if (param_1 != 0) {
        uVar1 = uVar2 / param_1;
      }
      param_2 = uVar2 - uVar1 * param_1;
      uVar2 = param_1;
    } while (param_2 != 0);
  }
  return param_1;
}

