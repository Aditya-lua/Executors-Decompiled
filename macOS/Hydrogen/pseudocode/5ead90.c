
void FUN_005ead90(ulong param_1,ulong *param_2,ulong param_3)

{
  bool bVar1;
  ulong uVar2;
  
  do {
    while (((uint)param_3 >> 1 & 1) == 0) {
      uVar2 = 0;
      if (param_3 - 0x11 != 0) {
        uVar2 = param_3 - 0x11 | 1;
      }
      bVar1 = *param_2 == param_3;
      param_3 = *param_2;
      if (bVar1) {
        *param_2 = uVar2;
        return;
      }
    }
    if (((uint)param_3 >> 3 & 1) == 0) {
      func_0x007a1a98();
      return;
    }
    uVar2 = param_3 & param_1;
    bVar1 = *param_2 != param_3;
    param_3 = *param_2;
  } while (bVar1);
  *param_2 = uVar2;
  return;
}

