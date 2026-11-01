
void FUN_006245f8(undefined8 param_1,long *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e0;
  
  uVar1 = (**(code **)(*param_2 + 0xa0))(param_2);
  func_0x0060986c(&uStack00000000000000c0,param_6,uVar1);
  func_0x005ffccc(param_6,&uStack00000000000000c0);
  uStack00000000000000c0 = &UNK_009f5d60;
  uVar2 = in_stack_000000d0;
  if (in_stack_000000d8 <= in_stack_000000d0) {
    uVar2 = in_stack_000000d8;
  }
  if (in_stack_000000e0 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e0 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  func_0x0060aaf0(&uStack00000000000000c0,param_4,uVar1);
  func_0x00608730(param_3,param_6);
  func_0x006072ac(&uStack0000000000000030);
  func_0x00608730(&uStack0000000000000060,&uStack00000000000000c0,&uStack0000000000000030);
  func_0x0060986c(&uStack0000000000000090,&uStack0000000000000060,uVar1);
  func_0x005ffccc(param_7,&uStack0000000000000090);
  uStack0000000000000090 = &UNK_009f5d60;
  uVar2 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar2 = in_stack_000000a8;
  }
  if (in_stack_000000b0 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000060 = &UNK_009f5d60;
  uVar2 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar2 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000030 = &UNK_009f5d60;
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  uStack00000000000000c0 = &UNK_009f5d60;
  uVar2 = in_stack_000000d0;
  if (in_stack_000000d8 <= in_stack_000000d0) {
    uVar2 = in_stack_000000d8;
  }
  if (in_stack_000000e0 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_000000e0 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

