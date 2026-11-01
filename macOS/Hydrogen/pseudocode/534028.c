
undefined1  [16] FUN_00534028(long param_1,ulong param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  if (param_2 < 0x20) {
    uVar1 = func_0x0046c47c();
  }
  else {
    uVar1 = func_0x0046bd58();
  }
  if (param_4 < 0x20) {
    uVar2 = func_0x0046c47c(param_3,param_4);
  }
  else {
    uVar2 = func_0x0046bd58();
  }
  uVar3 = func_0x00533328(param_1,param_1 + param_2,uVar1,param_3,param_3 + param_4,uVar2);
  if (uVar2 <= uVar1) {
    uVar2 = uVar1;
  }
  auVar4._0_8_ = 1.0 - (double)uVar3 / (double)uVar2;
  auVar4._8_8_ = 0;
  return auVar4;
}

