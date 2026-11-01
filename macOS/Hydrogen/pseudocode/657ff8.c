
undefined8 FUN_00657ff8(code *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x21;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000078;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  
  uVar1 = (*param_1)(param_2,param_3,in_stack_00000020,&uStack0000000000000078,
                     &uStack0000000000000048);
  uStack0000000000000048 = &UNK_009f5d60;
  uVar2 = in_stack_00000058;
  if (in_stack_00000060 <= in_stack_00000058) {
    uVar2 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000068 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000078 = &UNK_009f5d60;
  uVar2 = in_stack_00000088;
  if (in_stack_00000090 <= in_stack_00000088) {
    uVar2 = in_stack_00000090;
  }
  if (in_stack_00000098 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000098 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  if (unaff_x21 != 0) {
    if (in_stack_00000018._4_4_ != 0) {
      do {
        *(undefined1 *)(unaff_x21 + -1 + unaff_x19) = 0;
        unaff_x19 = unaff_x19 + -1;
      } while (unaff_x19 != 0);
    }
    func_0x00611644();
  }
  return uVar1;
}

