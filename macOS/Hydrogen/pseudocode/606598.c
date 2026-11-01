
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00606598(ulong param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long in_x9;
  long in_x10;
  long lVar3;
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  
  do {
    lVar3 = param_1 * 8;
    *(ulong *)(in_x10 + lVar3) = *(ulong *)(in_x10 + lVar3) | *(ulong *)(in_x9 + lVar3);
    param_1 = param_1 + 1;
  } while (param_1 < *(ulong *)(unaff_x21 + 0x18));
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
  *unaff_x19 = &UNK_009f5d60;
  uVar1 = _UNK_008baa70;
  uStack0000000000000008 = _UNK_008baa78;
  uStack0000000000000000 = _UNK_008baa70;
  unaff_x19[3] = _UNK_008baa78;
  unaff_x19[2] = uVar1;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  *(undefined4 *)(unaff_x19 + 5) = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  unaff_x19[3] = in_stack_00000020;
  unaff_x19[2] = in_stack_00000018;
  unaff_x19[4] = in_stack_00000028;
  puVar2[1] = 0;
  *puVar2 = 0;
  func_0x00611644();
  return;
}

