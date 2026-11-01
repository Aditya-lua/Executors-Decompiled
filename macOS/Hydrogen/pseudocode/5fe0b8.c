
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_005fe0b8(undefined8 *param_1,undefined4 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  DataMemoryBarrier(2,3);
  if ((bRam0000000000a3c148 & 1) == 0) {
    puRam0000000000a2ab70 = &DAT_005f6230;
    puRam0000000000a2ab78 = &DAT_005f627c;
    puRam0000000000a2aa98 = &DAT_005f4e6c;
    puRam0000000000a2aaa0 = &DAT_005f4ed4;
    puRam0000000000a2aaa8 = &DAT_005f50a8;
    puRam0000000000a2ab28 = &DAT_005f5e0c;
    puRam0000000000a2ab30 = &DAT_005f5e38;
    puRam0000000000a2ab38 = &DAT_005f5eec;
    puRam0000000000a2aae0 = &DAT_005f57fc;
    puRam0000000000a2aae8 = &DAT_005f5844;
    puRam0000000000a2aaf0 = &DAT_005f5984;
    puRam0000000000a2ab80 = &DAT_005f63c0;
    puRam0000000000a2aab8 = &DAT_005f6838;
    puRam0000000000a2ab48 = &DAT_005f9574;
    puRam0000000000a2ab00 = &DAT_005f850c;
    puRam0000000000a2ab90 = &DAT_005fa300;
    bRam0000000000a3c148 = 1;
    DataMemoryBarrier(2,3);
  }
  *param_1 = &UNK_009f5d60;
  uVar1 = _UNK_008baa70;
  param_1[3] = _UNK_008baa78;
  param_1[2] = uVar1;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  param_1[4] = puVar2;
  *(undefined4 *)(param_1 + 5) = param_2;
  *puVar2 = param_3;
  puVar2[1] = 0;
  return param_1;
}

