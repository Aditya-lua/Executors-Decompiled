
void FUN_0024a71c(void)

{
  long unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x27;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  
  if ((code *)*unaff_x21 != (code *)0x0) {
    (*(code *)*unaff_x21)();
  }
  if (unaff_x21[1] != 0) {
    func_0x00187bd4();
  }
  uVar1 = *(undefined8 *)(unaff_x29 + -0xd0);
  uVar3 = *(undefined8 *)(unaff_x29 + -0xb8);
  uVar2 = *(undefined8 *)(unaff_x29 + -0xc0);
  unaff_x27[1] = *(undefined8 *)(unaff_x29 + -200);
  *unaff_x27 = uVar1;
  unaff_x27[3] = uVar3;
  unaff_x27[2] = uVar2;
  uVar1 = *(undefined8 *)(unaff_x29 + -0xb0);
  unaff_x27[5] = *(undefined8 *)(unaff_x29 + -0xa8);
  unaff_x27[4] = uVar1;
  in_stack_00000008[2] = in_stack_000000a8;
  in_stack_00000008[1] = in_stack_000000a0;
  unaff_x27[6] = *(undefined8 *)(unaff_x29 + -0xa0);
  in_stack_00000008[4] = in_stack_000000b8;
  in_stack_00000008[3] = in_stack_000000b0;
  in_stack_00000008[6] = in_stack_000000c8;
  in_stack_00000008[5] = in_stack_000000c0;
  in_stack_00000008[7] = in_stack_000000d0;
  in_stack_00000008[8] = unaff_x22 + unaff_x20;
  *in_stack_00000008 = 1;
  return;
}

