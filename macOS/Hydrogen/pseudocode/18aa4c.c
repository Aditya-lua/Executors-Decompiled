
void FUN_0018aa4c(long param_1)

{
  undefined8 *unaff_x20;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined *in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000090;
  
  in_stack_00000070 = func_0x001a03c4(param_1 + 0x5b8);
  uStack0000000000000050 = &UNK_00819a5e;
  in_stack_00000058 = 0x2d;
  in_stack_00000060 = &UNK_00819a5e;
  in_stack_00000068 = 0x2d;
  func_0x001a0298(&uStack0000000000000090,1,&uStack0000000000000050,0);
  uVar1 = *(undefined8 *)(unaff_x29 + -0x98);
  uVar3 = *(undefined8 *)(unaff_x29 + -0x80);
  uVar2 = *(undefined8 *)(unaff_x29 + -0x88);
  unaff_x20[1] = *(undefined8 *)(unaff_x29 + -0x90);
  *unaff_x20 = uVar1;
  unaff_x20[3] = uVar3;
  unaff_x20[2] = uVar2;
  uVar1 = *(undefined8 *)(unaff_x29 + -0x78);
  unaff_x20[5] = *(undefined8 *)(unaff_x29 + -0x70);
  unaff_x20[4] = uVar1;
  unaff_x20[6] = *(undefined8 *)(unaff_x29 + -0x68);
  if ((in_stack_00000008 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000000,in_stack_00000008,1);
  }
  return;
}

