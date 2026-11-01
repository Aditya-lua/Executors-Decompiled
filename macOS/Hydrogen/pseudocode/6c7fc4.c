
void FUN_006c7fc4(void)

{
  undefined4 uVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  func_0x006c5ed4();
  if (*(uint *)(unaff_x20 + 0x1c) < 7) {
    uVar1 = *(undefined4 *)(&UNK_008c6f74 + (long)(int)*(uint *)(unaff_x20 + 0x1c) * 4);
  }
  else {
    uVar1 = 0;
  }
  func_0x006b1ccc(*unaff_x19,uVar1);
  func_0x006c9bf0();
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

