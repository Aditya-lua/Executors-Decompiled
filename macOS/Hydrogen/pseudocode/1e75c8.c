
void FUN_001e75c8(long param_1)

{
  undefined8 *unaff_x19;
  undefined1 unaff_w22;
  undefined1 uStack0000000000000008;
  undefined1 uStack000000000000000c;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000014;
  undefined1 uStack0000000000000018;
  undefined1 uStack000000000000001c;
  undefined1 in_stack_00000020;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  
  *(undefined1 *)(param_1 + 0x10) = uStack0000000000000010;
  *(undefined1 *)(param_1 + 0x11) = unaff_w22;
  *(undefined1 *)(param_1 + 0x12) = uStack0000000000000008;
  *(undefined1 *)(param_1 + 0x13) = uStack000000000000000c;
  *(undefined1 *)(param_1 + 0x14) = uStack0000000000000014;
  *(undefined1 *)(param_1 + 0x15) = uStack0000000000000018;
  *(undefined1 *)(param_1 + 0x16) = uStack000000000000001c;
  *(undefined1 *)(param_1 + 0x17) = in_stack_00000020;
  *(undefined8 *)(param_1 + 0x20) = in_stack_000000c8;
  *(undefined8 *)(param_1 + 0x18) = in_stack_000000c0;
  unaff_x19[1] = param_1;
  unaff_x19[2] = &UNK_009c4120;
  *unaff_x19 = 0x8000000000000027;
  return;
}

