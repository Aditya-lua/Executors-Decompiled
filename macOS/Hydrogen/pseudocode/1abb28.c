
void FUN_001abb28(void)

{
  undefined1 in_w8;
  undefined1 in_w9;
  undefined2 in_w10;
  undefined4 in_w13;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 *puVar1;
  undefined2 unaff_w23;
  undefined2 unaff_w24;
  undefined8 unaff_x26;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  *(undefined1 *)(unaff_x19 + 1) = in_w8;
  *(undefined1 *)((long)unaff_x19 + 9) = in_w9;
  *(undefined2 *)((long)unaff_x19 + 10) = in_w10;
  *(short *)((long)unaff_x19 + 0xc) = (short)((ulong)unaff_x20 >> 0x20);
  *(short *)((long)unaff_x19 + 0xe) = (short)((ulong)unaff_x20 >> 0x30);
  unaff_x19[2] = unaff_x26;
  *(undefined2 *)(unaff_x19 + 3) = unaff_w24;
  *(undefined2 *)((long)unaff_x19 + 0x1a) = unaff_w23;
  *(undefined4 *)((long)unaff_x19 + 0x1c) = in_w13;
  *unaff_x19 = 1;
  if (in_stack_00000028 != 0) {
    puVar1 = (undefined8 *)(in_stack_00000020 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 4;
      in_stack_00000028 = in_stack_00000028 + -1;
    } while (in_stack_00000028 != 0);
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 5,8);
  }
  return;
}

