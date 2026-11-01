
void FUN_0040c22c(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  long *unaff_x22;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  int in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  func_0x004096ac();
  if (in_stack_00000068 == 1) {
    unaff_x19[1] = in_stack_00000070;
    unaff_x19[2] = in_stack_00000078;
    *unaff_x19 = 0x8000000000000000;
  }
  else {
    func_0x0045b558(&uStack0000000000000050);
    uVar2 = in_stack_00000058;
    uVar1 = uStack0000000000000050;
    if (uStack0000000000000050 != 0x8000000000000001) {
      func_0x0044390c(&uStack0000000000000008,in_stack_00000058);
      if ((uVar1 | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4(uVar2,uVar1,1);
      }
                    /* WARNING: Could not recover jumptable at 0x0040c2c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)(&UNK_0040c2c4 + (ulong)(byte)(&UNK_00884e10)[*unaff_x22] * 4))();
      return;
    }
    unaff_x19[1] = in_stack_00000058;
    unaff_x19[2] = in_stack_00000060;
    *unaff_x19 = 0x8000000000000000;
    uStack0000000000000050 = 0x8000000000000001;
  }
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
  }
  return;
}

