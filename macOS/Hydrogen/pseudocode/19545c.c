
undefined8 FUN_0019545c(void)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x23;
  long lVar3;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x0018b2e8();
  }
  if (in_stack_00000008 != 0) {
    func_0x00187bd4();
  }
  __Unwind_Resume();
  func_0x007a2668();
  func_0x00195f10(&lStack_58);
  uVar1 = func_0x00195930(&lStack_58,in_stack_00000010,in_stack_00000018);
  lVar2 = lStack_50;
  for (lVar3 = lStack_48; lVar3 != 0; lVar3 = lVar3 + -1) {
    func_0x0019fb28(lVar2);
    func_0x0019e6a4(lVar2 + 8);
    lVar2 = lVar2 + 0x10;
  }
  if (lStack_58 != 0) {
    func_0x00187bd4(lStack_50,lStack_58 << 4,8);
  }
  return uVar1;
}

