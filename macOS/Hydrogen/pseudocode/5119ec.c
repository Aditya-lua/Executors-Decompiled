
void FUN_005119ec(void)

{
  long in_x17;
  long unaff_x21;
  ulong uVar1;
  long unaff_x25;
  long *in_stack_00000008;
  long in_stack_00000028;
  long in_stack_00000048;
  undefined8 uStack0000000000000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  
  uVar1 = in_stack_00000028 - in_x17;
  if ((ulong)(uStack0000000000000078 - unaff_x25) < uVar1) {
    func_0x007a5594(&uStack0000000000000078);
    unaff_x25 = in_stack_00000088;
  }
  _memcpy(in_stack_00000080 + unaff_x25,in_stack_00000048 + unaff_x21,uVar1);
  in_stack_000000a0 = unaff_x25 + uVar1;
  in_stack_00000098 = in_stack_00000080;
  in_stack_00000090 = uStack0000000000000078;
  if (*in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000048,*in_stack_00000008,1);
  }
  in_stack_00000008[1] = in_stack_00000098;
  *in_stack_00000008 = in_stack_00000090;
  in_stack_00000008[2] = in_stack_000000a0;
  return;
}

