
void FUN_00609778(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  
  *(undefined **)(unaff_x23 + 0x20) = &DAT_005f6838;
  *(undefined **)(unaff_x23 + 0xb0) = &DAT_005f9574;
  *(undefined **)(unaff_x23 + 0x68) = &DAT_005f850c;
  *(undefined **)(unaff_x23 + 0xf8) = &DAT_005fa300;
  *(undefined1 *)(unaff_x22 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  *unaff_x19 = unaff_x24;
  unaff_x19[3] = in_stack_00000008;
  unaff_x19[2] = in_stack_00000000;
  puVar1 = (undefined8 *)func_0x006115d0(0x10);
  unaff_x19[4] = puVar1;
  *(undefined4 *)(unaff_x19 + 5) = 0;
  *puVar1 = 0;
  puVar1[1] = 0;
  func_0x00608f38(&uStack0000000000000010);
  if (in_stack_00000028 <= in_stack_00000020) {
    in_stack_00000020 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (in_stack_00000020 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + in_stack_00000020 * 8) = 0;
        in_stack_00000020 = in_stack_00000020 - 1;
      } while (in_stack_00000020 != 0);
    }
    func_0x00611644();
  }
  return;
}

