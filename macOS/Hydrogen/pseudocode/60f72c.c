
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0060f72c(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long in_x9;
  long in_x10;
  long in_x11;
  long unaff_x19;
  
  *(long *)(in_x10 + 0x10) = in_x11 + 0xa8;
  *(undefined **)(in_x10 + 0x90) = &DAT_005f5e0c;
  *(undefined **)(in_x10 + 0x98) = &DAT_005f5e38;
  *(undefined **)(in_x10 + 0xa0) = &DAT_005f5eec;
  *(undefined **)(in_x10 + 0x48) = &DAT_005f57fc;
  *(undefined **)(in_x10 + 0x50) = &DAT_005f5844;
  *(undefined **)(in_x10 + 0x58) = &DAT_005f5984;
  *(undefined **)(in_x10 + 0xe8) = &DAT_005f63c0;
  *(undefined **)(in_x10 + 0x20) = &DAT_005f6838;
  *(undefined **)(in_x10 + 0xb0) = &DAT_005f9574;
  *(undefined **)(in_x10 + 0x68) = &DAT_005f850c;
  *(undefined **)(in_x10 + 0xf8) = &DAT_005fa300;
  *(undefined1 *)(in_x9 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  *param_1 = &UNK_009f5d60;
  uVar1 = _UNK_008baa70;
  param_1[3] = _UNK_008baa78;
  param_1[2] = uVar1;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  *(undefined8 **)(unaff_x19 + 0x38) = puVar2;
  *(undefined4 *)(unaff_x19 + 0x40) = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  ___cxa_atexit(&SUB_00087574,unaff_x19 + 0x18,0);
  ___cxa_guard_release();
  return 0xa3c168;
}

