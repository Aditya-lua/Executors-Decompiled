
undefined1  [16] FUN_006d20a4(long param_1,ulong param_2,long *param_3)

{
  long in_x9;
  long in_x10;
  ulong uVar1;
  int in_w11;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  uVar1 = param_2;
  if (in_w11 == *(int *)(in_x9 + 0xaa8)) {
    param_2 = *(ulong *)(in_x10 + 0x20);
    if ((param_3[2] != 0) && (param_3[3] != param_2)) {
      uVar1 = 0;
      uVar2 = param_2 >> 4 ^ param_2 >> 9;
      do {
        uVar2 = uVar2 & param_3[1] - 1U;
        uVar3 = *(ulong *)(*param_3 + uVar2 * 0x10);
        if (uVar3 == param_2) {
          if (*(int *)(*param_3 + uVar2 * 0x10 + 8) != 0) {
            return ZEXT816(0);
          }
          break;
        }
        uVar1 = uVar1 + 1;
        uVar2 = uVar1 + uVar2;
      } while (uVar3 != param_3[3] && uVar1 <= param_3[1] - 1U);
    }
    uVar1 = *(ulong *)(param_1 + 0x28);
  }
  auVar4._8_8_ = uVar1;
  auVar4._0_8_ = param_2;
  return auVar4;
}

