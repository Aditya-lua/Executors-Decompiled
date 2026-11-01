
/* WARNING: Removing unreachable block (ram,0x00420014) */

void FUN_0041ffcc(void)

{
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x29;
  ulong in_stack_00000000;
  undefined *in_stack_00000008;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  
  _memcpy();
  *(undefined1 *)(unaff_x22 + unaff_x20) = 0;
  func_0x00462a54(unaff_x29 + -0x48,&uStack0000000000000048,unaff_x20 + 1);
  if (*(int *)(unaff_x29 + -0x48) == 1) {
    in_stack_00000008 = &UNK_009dae48;
  }
  else {
    func_0x00433174(&uStack0000000000000040,*(undefined8 *)(unaff_x29 + -0x40));
    if ((in_stack_00000000 & 1) == 0) {
      func_0x0041fc04();
      return;
    }
  }
  *unaff_x19 = 0;
  unaff_x19[1] = in_stack_00000008;
  return;
}

