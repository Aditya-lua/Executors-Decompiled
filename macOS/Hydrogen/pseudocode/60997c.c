
void FUN_0060997c(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  ulong uStack0000000000000000;
  ulong uStack0000000000000008;
  
  uStack0000000000000008 = *(ulong *)(param_1 + 0xa78);
  uStack0000000000000000 = *(ulong *)(param_1 + 0xa70);
  *(ulong *)(unaff_x19 + 0x18) = uStack0000000000000008;
  *(ulong *)(unaff_x19 + 0x10) = uStack0000000000000000;
  puVar3 = (undefined8 *)func_0x006115d0(0x10);
  uVar2 = uStack0000000000000008;
  uVar1 = uStack0000000000000000;
  *(undefined8 **)(unaff_x19 + 0x20) = puVar3;
  *(undefined4 *)(unaff_x19 + 0x28) = 0;
  *puVar3 = 0;
  puVar3[1] = 0;
  DataMemoryBarrier(2,3);
  if ((*(byte *)(unaff_x22 + 0x148) & 1) == 0) {
    unaff_x23[0x1b] = unaff_x25;
    unaff_x23[0x1c] = unaff_x28;
    *unaff_x23 = unaff_x27;
    unaff_x23[1] = unaff_x26;
    unaff_x23[2] = &DAT_005f50a8;
    unaff_x23[0x12] = &DAT_005f5e0c;
    unaff_x23[0x13] = &DAT_005f5e38;
    unaff_x23[0x14] = &DAT_005f5eec;
    unaff_x23[9] = &DAT_005f57fc;
    unaff_x23[10] = &DAT_005f5844;
    unaff_x23[0xb] = &DAT_005f5984;
    unaff_x23[0x1d] = &DAT_005f63c0;
    unaff_x23[4] = &DAT_005f6838;
    unaff_x23[0x16] = &DAT_005f9574;
    unaff_x23[0xd] = &DAT_005f850c;
    unaff_x23[0x1f] = &DAT_005fa300;
    *(undefined1 *)(unaff_x22 + 0x148) = 1;
    DataMemoryBarrier(2,3);
  }
  puVar3 = (undefined8 *)func_0x006115d0(0x10);
  *puVar3 = 0;
  puVar3[1] = 0;
  func_0x00608f38();
  if (uVar2 <= uVar1) {
    uVar1 = uVar2;
  }
  if (puVar3 != (undefined8 *)0x0) {
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      puVar3[uVar1 - 1] = 0;
    }
    func_0x00611644();
  }
  return;
}

