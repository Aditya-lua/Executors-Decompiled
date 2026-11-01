
void FUN_0042627c(void)

{
  ulong uVar1;
  ulong uVar2;
  bool in_ZR;
  ulong unaff_x19;
  long *unaff_x20;
  char *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  
  if ((unaff_x19 == 0) || (*unaff_x21 != '/')) {
    if (!in_ZR) {
      func_0x007a0000(&uStack0000000000000008);
      *(undefined1 *)(in_stack_00000010 + in_stack_00000018) = 0x2f;
      uVar2 = in_stack_00000018 + 1;
      unaff_x23 = in_stack_00000010;
      uVar1 = uStack0000000000000008 - (in_stack_00000018 + 1);
      goto joined_r0x004262e4;
    }
    if (unaff_x19 == 0) goto LAB_004262fc;
  }
  else {
    uVar2 = 0;
    uVar1 = unaff_x22;
joined_r0x004262e4:
    unaff_x22 = uVar2;
    in_stack_00000018 = unaff_x22;
    if (unaff_x19 <= uVar1) goto LAB_004262fc;
  }
  func_0x007a0000(&uStack0000000000000008,unaff_x22);
  unaff_x23 = in_stack_00000010;
  unaff_x22 = in_stack_00000018;
LAB_004262fc:
  _memcpy(unaff_x23 + unaff_x22);
  unaff_x20[2] = unaff_x22 + unaff_x19;
  unaff_x20[1] = in_stack_00000010;
  *unaff_x20 = uStack0000000000000008;
  return;
}

