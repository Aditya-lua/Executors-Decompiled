
void FUN_00251578(void)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 unaff_w23;
  undefined1 unaff_w24;
  undefined2 unaff_w25;
  undefined2 unaff_w26;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  func_0x0079b61c();
  _memcpy(in_stack_00000030 + in_stack_00000038);
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[1] = in_stack_00000028;
  unaff_x19[3] = in_stack_00000038 + unaff_x20;
  *(undefined2 *)(unaff_x19 + 4) = unaff_w25;
  *(undefined2 *)((long)unaff_x19 + 0x22) = unaff_w26;
  *(undefined1 *)((long)unaff_x19 + 0x24) = unaff_w23;
  *(undefined1 *)((long)unaff_x19 + 0x25) = unaff_w24;
  *unaff_x19 = 0x8000000000000027;
  return;
}

