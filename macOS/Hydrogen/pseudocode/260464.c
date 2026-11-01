
void FUN_00260464(undefined8 param_1,undefined8 param_2)

{
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined1 unaff_w21;
  undefined8 *unaff_x22;
  undefined8 unaff_x23;
  undefined4 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  func_0x00267a48(&uStack0000000000000008,param_2);
  *(undefined4 *)((long)unaff_x22 + 0x19) = uStack0000000000000000;
  *(int *)((long)unaff_x22 + 0x1c) = (int)((ulong)_uStack0000000000000000 >> 0x18);
  unaff_x22[1] = in_stack_00000010;
  *unaff_x22 = uStack0000000000000008;
  unaff_x22[2] = in_stack_00000018;
  *(undefined1 *)(unaff_x22 + 3) = unaff_w21;
  unaff_x22[4] = unaff_x20;
  unaff_x22[5] = unaff_x19;
  unaff_x22[6] = unaff_x23;
  return;
}

