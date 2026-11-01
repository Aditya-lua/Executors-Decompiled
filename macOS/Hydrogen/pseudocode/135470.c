
void FUN_00135470(void)

{
  undefined8 *puVar1;
  undefined4 unaff_w19;
  long unaff_x20;
  long unaff_x21;
  undefined4 unaff_w22;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  
  _memcpy();
  func_0x000b83d4(*(undefined8 *)(unaff_x20 + 0x298));
  *(long *)(unaff_x20 + 0x298) = unaff_x21;
  *(undefined4 *)(unaff_x20 + 0x294) = unaff_w22;
  puVar1 = (undefined8 *)(unaff_x21 + (long)*(int *)(unaff_x20 + 0x290) * 0x88);
  puVar1[1] = in_stack_00000008;
  *puVar1 = in_stack_00000000;
  puVar1[7] = in_stack_00000038;
  puVar1[6] = in_stack_00000030;
  puVar1[9] = in_stack_00000048;
  puVar1[8] = in_stack_00000040;
  puVar1[3] = in_stack_00000018;
  puVar1[2] = in_stack_00000010;
  puVar1[5] = in_stack_00000028;
  puVar1[4] = in_stack_00000020;
  puVar1[0x10] = in_stack_00000080;
  puVar1[0xd] = in_stack_00000068;
  puVar1[0xc] = in_stack_00000060;
  puVar1[0xf] = in_stack_00000078;
  puVar1[0xe] = uStack0000000000000070;
  puVar1[0xb] = in_stack_00000058;
  puVar1[10] = in_stack_00000050;
  *(int *)(unaff_x20 + 0x290) = *(int *)(unaff_x20 + 0x290) + 1;
  func_0x000efd64(&uStack0000000000000070);
  if (in_stack_00000080 != 0) {
    func_0x000b83d4();
  }
  if (in_stack_00000068 != 0) {
    func_0x000b83d4();
  }
  *(undefined4 *)(*(long *)(unaff_x20 + 0x298) + (long)*(int *)(unaff_x20 + 0x290) * 0x88 + -0x88) =
       unaff_w19;
  return;
}

