
void FUN_00636fb0(void)

{
  undefined8 uVar1;
  ulong uVar2;
  long *unaff_x19;
  undefined8 unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  long in_stack_000000f0;
  undefined1 uStack0000000000000108;
  
  func_0x006373c0();
  func_0x0063754c();
  uVar1 = func_0x00604c44();
  func_0x005fe0b4(&uStack0000000000000008,uVar1);
  func_0x00604a88(&uStack0000000000000038);
  uStack0000000000000008 = &UNK_009f5d60;
  uVar2 = in_stack_00000018;
  if (in_stack_00000020 <= in_stack_00000018) {
    uVar2 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x00635108(unaff_x19 + 2,&uStack0000000000000108);
  (**(code **)(*unaff_x19 + 0x70))();
  func_0x005ffccc(unaff_x19 + 0x22,&uStack0000000000000068);
  func_0x005ffccc(unaff_x19 + 0x28,&uStack0000000000000038);
  uStack0000000000000038 = &UNK_009f5d60;
  uVar2 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar2 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000068 = &UNK_009f5d60;
  uVar2 = in_stack_00000078;
  if (in_stack_00000080 <= in_stack_00000078) {
    uVar2 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000e8 <= in_stack_000000e0) {
    in_stack_000000e0 = in_stack_000000e8;
  }
  if (in_stack_000000f0 != 0) {
    if (in_stack_000000e0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000f0 + -8 + in_stack_000000e0 * 8) = 0;
        in_stack_000000e0 = in_stack_000000e0 - 1;
      } while (in_stack_000000e0 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000000b8 <= in_stack_000000b0) {
    in_stack_000000b0 = in_stack_000000b8;
  }
  if (in_stack_000000c0 != 0) {
    if (in_stack_000000b0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000c0 + -8 + in_stack_000000b0 * 8) = 0;
        in_stack_000000b0 = in_stack_000000b0 - 1;
      } while (in_stack_000000b0 != 0);
    }
    func_0x00611644();
  }
  func_0x00653f88(&uStack0000000000000108);
  *(undefined8 *)(unaff_x29 + -0x50) = unaff_x21;
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    *(long *)(unaff_x29 + -0x40) = *(long *)(unaff_x29 + -0x48);
    __ZdlPv();
  }
  return;
}

