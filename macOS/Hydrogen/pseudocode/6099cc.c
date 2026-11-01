
void FUN_006099cc(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 in_x9;
  long unaff_x22;
  long unaff_x23;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  ulong uStack0000000000000020;
  ulong uStack0000000000000028;
  
  *(undefined8 *)(unaff_x23 + 0x90) = in_x9;
  *(undefined8 *)(unaff_x23 + 0x98) = param_1;
  *(undefined **)(unaff_x23 + 0xa0) = &DAT_005f5eec;
  *(undefined **)(unaff_x23 + 0x48) = &DAT_005f57fc;
  *(undefined **)(unaff_x23 + 0x50) = &DAT_005f5844;
  *(undefined **)(unaff_x23 + 0x58) = &DAT_005f5984;
  *(undefined **)(unaff_x23 + 0xe8) = &DAT_005f63c0;
  *(undefined **)(unaff_x23 + 0x20) = &DAT_005f6838;
  *(undefined **)(unaff_x23 + 0xb0) = &DAT_005f9574;
  *(undefined **)(unaff_x23 + 0x68) = &DAT_005f850c;
  *(undefined **)(unaff_x23 + 0xf8) = &DAT_005fa300;
  *(undefined1 *)(unaff_x22 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  uStack0000000000000028 = in_stack_00000008;
  uStack0000000000000020 = in_stack_00000000;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  *puVar2 = 0;
  puVar2[1] = 0;
  func_0x00608f38();
  uVar1 = uStack0000000000000020;
  if (uStack0000000000000028 <= uStack0000000000000020) {
    uVar1 = uStack0000000000000028;
  }
  if (puVar2 != (undefined8 *)0x0) {
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      puVar2[uVar1 - 1] = 0;
    }
    func_0x00611644();
  }
  return;
}

