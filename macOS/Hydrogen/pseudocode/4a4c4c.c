
void FUN_004a4c4c(void)

{
  undefined1 in_w9;
  undefined1 in_w12;
  undefined8 in_x15;
  long unaff_x19;
  undefined8 unaff_x22;
  int unaff_w28;
  undefined1 in_stack_00000030;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000044;
  undefined1 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000068;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  
  *(undefined8 *)(unaff_x19 + 0x88) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 0x90) = in_x15;
  *(undefined1 *)(unaff_x19 + 0x98) = in_w9;
  *(undefined1 *)(unaff_x19 + 0x99) = in_stack_00000030;
  *(undefined1 *)(unaff_x19 + 0x9a) = in_w12;
  *(undefined1 *)(unaff_x19 + 0x9b) = in_stack_00000048;
  *(undefined1 *)(unaff_x19 + 0x9c) = uStack0000000000000044;
  *(undefined1 *)(unaff_x19 + 0x9d) = uStack0000000000000040;
  if (in_stack_00000080 != 0) {
    func_0x00187bd4(in_stack_00000088,in_stack_00000080 << 2,4);
  }
  if (unaff_w28 != 0) {
    if (uStack0000000000000050 != 2) {
      func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068);
    }
    func_0x004a38e0(&uStack0000000000000050);
  }
  return;
}

