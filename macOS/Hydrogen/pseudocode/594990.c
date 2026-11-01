
void FUN_00594990(undefined8 param_1)

{
  long extraout_x8;
  long unaff_x23;
  undefined1 uStack0000000000000018;
  undefined8 in_stack_00000038;
  
  if (unaff_x23 != 0) {
    func_0x00187bd4(in_stack_00000038,unaff_x23 * 0x48,8);
  }
  func_0x0059393c(&uStack0000000000000018);
  __Unwind_Resume(param_1);
  func_0x007a2668();
  func_0x0057ef94();
  *(undefined8 *)(extraout_x8 + 0x38) = 0;
  *(undefined8 *)(extraout_x8 + 0x30) = 0;
  *(undefined8 *)(extraout_x8 + 0x40) = 0xffffffffffffffff;
  return;
}

