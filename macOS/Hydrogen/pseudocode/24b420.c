
void FUN_0024b420(void)

{
  undefined4 in_w8;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000140;
  
  *(undefined4 *)(unaff_x29 + -0xe8) = in_w8;
  func_0x00248ae4();
  *(undefined1 *)(unaff_x20 + 0x335) = 1;
  uVar1 = *(undefined8 *)(unaff_x21 + 0x80);
  uVar3 = *(undefined8 *)(unaff_x21 + 0x98);
  uVar2 = *(undefined8 *)(unaff_x21 + 0x90);
  unaff_x19[2] = *(undefined8 *)(unaff_x21 + 0x88);
  unaff_x19[1] = uVar1;
  unaff_x19[4] = uVar3;
  unaff_x19[3] = uVar2;
  uVar1 = *(undefined8 *)(unaff_x21 + 0xa0);
  unaff_x19[6] = *(undefined8 *)(unaff_x21 + 0xa8);
  unaff_x19[5] = uVar1;
  unaff_x19[7] = in_stack_00000140;
  *unaff_x19 = 0x8000000000000007;
  return;
}

