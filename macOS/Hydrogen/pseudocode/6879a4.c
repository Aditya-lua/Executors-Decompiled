
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_006879a4(long *param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar1 = (**(code **)(*param_1 + 0xd8))();
  if ((int)uVar1 != 0) {
    uVar2 = (**(code **)(*param_1 + 0xa0))(param_1);
    if ((uVar2 & 1) == 0) {
      uVar2 = param_1[0x11] + _UNK_008c2650;
      param_1[0x12] = param_1[0x12] + _UNK_008c2658;
      param_1[0x11] = uVar2;
      if (0x3ff < uVar2) {
        __ZdlPv(*(undefined8 *)param_1[0xe]);
        param_1[0xe] = param_1[0xe] + 8;
        param_1[0x11] = param_1[0x11] + -0x200;
      }
      uVar2 = param_1[0x17];
      if ((*(int *)(*(long *)(param_1[0x14] + (uVar2 >> 7 & 0x1fffffffffffff8)) +
                   (uVar2 & 0x3ff) * 4) == 0) && (1 < (ulong)param_1[0x18])) {
        param_1[0x17] = uVar2 + 1;
        param_1[0x18] = param_1[0x18] - 1;
        if (0x7ff < uVar2 + 1) {
          __ZdlPv(*(undefined8 *)param_1[0x14]);
          param_1[0x14] = param_1[0x14] + 8;
          param_1[0x17] = param_1[0x17] + -0x400;
          return 1;
        }
      }
      return 1;
    }
    uVar1 = 0;
  }
  return uVar1;
}

