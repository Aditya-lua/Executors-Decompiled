
undefined8 FUN_00463708(undefined8 param_1,long param_2,undefined8 param_3,long param_4)

{
  ulong uVar1;
  long lVar2;
  code *pcVar3;
  undefined8 uStack0000000000000000;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  long lStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined *puStack0000000000000048;
  
  if (param_4 != 0) {
    puStack0000000000000048 = &DAT_00477a5c;
    _uStack0000000000000010 = &UNK_007fc120;
    uStack0000000000000018 = 1;
    uStack0000000000000028 = 1;
    uStack0000000000000030 = 0;
    lStack0000000000000020 = (long)register0x00000008 + 0x40;
    uStack0000000000000000 = param_3;
    uVar1 = func_0x0046849c(param_1,param_2,&uStack0000000000000010);
    if ((uVar1 & 1) != 0) {
      return 1;
    }
    lVar2 = param_4 * 2 + -2;
    if (lVar2 != 0) {
      pcVar3 = *(code **)(param_2 + 0x20);
      do {
        uVar1 = (*pcVar3)(param_1,0x3a);
        if ((uVar1 & 1) != 0) {
          return 1;
        }
        puStack0000000000000048 = &DAT_00477a5c;
        _uStack0000000000000010 = &UNK_007fc120;
        uStack0000000000000018 = 1;
        uStack0000000000000028 = 1;
        uStack0000000000000030 = 0;
        lStack0000000000000020 = (long)register0x00000008 + 0x40;
        uVar1 = func_0x0046849c(param_1,param_2,&uStack0000000000000010);
        if ((uVar1 & 1) != 0) {
          return 1;
        }
        lVar2 = lVar2 + -2;
      } while (lVar2 != 0);
    }
  }
  return 0;
}

