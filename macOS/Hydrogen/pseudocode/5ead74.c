
void FUN_005ead74(ulong param_1,ulong *param_2,ulong param_3)

{
  bool bVar1;
  undefined1 in_ZR;
  ulong in_x9;
  ulong uVar2;
  
  do {
    uVar2 = 0;
    if (!(bool)in_ZR) {
      uVar2 = in_x9 | 1;
    }
    bVar1 = *param_2 == param_3;
    param_3 = *param_2;
    if (bVar1) {
      *param_2 = uVar2;
      return;
    }
    while (((uint)param_3 >> 1 & 1) != 0) {
      if (((uint)param_3 >> 3 & 1) == 0) {
        func_0x007a1a98();
        return;
      }
      uVar2 = param_3 & param_1;
      bVar1 = *param_2 == param_3;
      param_3 = *param_2;
      if (bVar1) {
        *param_2 = uVar2;
        return;
      }
    }
    in_x9 = param_3 - 0x11;
    in_ZR = in_x9 == 0;
  } while( true );
}

