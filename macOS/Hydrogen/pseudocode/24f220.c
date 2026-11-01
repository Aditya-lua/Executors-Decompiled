
void FUN_0024f220(void)

{
  undefined2 in_w8;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x25;
  long unaff_x29;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000208;
  
  *(undefined2 *)(unaff_x29 + -0x48) = in_w8;
  *(undefined8 *)(unaff_x29 + -0x100) = 0x8000000000000001;
  *(undefined4 *)(unaff_x29 + -0xf8) = 0x10001;
  func_0x00248ae4();
  *(undefined1 *)(unaff_x22 + 0x335) = 1;
  uVar1 = *(undefined8 *)(unaff_x25 + 0xd8);
  uVar3 = *(undefined8 *)(unaff_x25 + 0xf0);
  uVar2 = *(undefined8 *)(unaff_x25 + 0xe8);
  unaff_x21[1] = *(undefined8 *)(unaff_x25 + 0xe0);
  *unaff_x21 = uVar1;
  unaff_x21[3] = uVar3;
  unaff_x21[2] = uVar2;
  uVar1 = *(undefined8 *)(unaff_x25 + 0xf8);
  unaff_x21[5] = *(undefined8 *)(unaff_x25 + 0x100);
  unaff_x21[4] = uVar1;
  unaff_x21[6] = in_stack_00000208;
  return;
}

