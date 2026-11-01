
void FUN_00263db8(void)

{
  long lVar1;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x22;
  ulong uVar2;
  long unaff_x26;
  char unaff_w27;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  if (uStack0000000000000008 == 1) {
    func_0x00458a18(&uStack0000000000000008,&UNK_009cb1d8);
  }
  *(char *)(in_stack_00000010 + 1) = -0x78 - unaff_w27;
  in_stack_00000018 = 2;
  uVar2 = (unaff_x26 + 8) - unaff_x22;
  if (uStack0000000000000008 - 2U < uVar2) {
    func_0x0079ce18(&uStack0000000000000008,2,uVar2,1,1);
  }
  lVar1 = in_stack_00000018;
  _memcpy(in_stack_00000010 + in_stack_00000018);
  in_stack_00000018 = lVar1 + uVar2;
  if ((ulong)(uStack0000000000000008 - in_stack_00000018) < unaff_x20) {
    func_0x0079ce18(&uStack0000000000000008,in_stack_00000018);
  }
  lVar1 = in_stack_00000018;
  _memcpy(in_stack_00000010 + in_stack_00000018);
  unaff_x19[2] = lVar1 + unaff_x20;
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  return;
}

