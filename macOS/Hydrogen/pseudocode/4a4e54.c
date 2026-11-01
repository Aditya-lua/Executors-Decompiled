
void FUN_004a4e54(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  undefined4 uVar1;
  undefined4 *extraout_x1;
  undefined8 *extraout_x8;
  long unaff_x27;
  uint unaff_w28;
  long unaff_x29;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000068;
  long in_stack_00000080;
  undefined8 in_stack_00000088;
  
  func_0x0048a7a8(unaff_x29 + -0xc0);
  if (unaff_x27 != 0) {
    param_3 = 4;
    func_0x00187bd4();
  }
  if (in_stack_00000080 != 0) {
    param_3 = 4;
    func_0x00187bd4(in_stack_00000088,in_stack_00000080 << 2);
  }
  if ((unaff_w28 & 1) != 0) {
    if (uStack0000000000000050 != 2) {
      func_0x005ec378(&uStack0000000000000050,&uStack0000000000000068);
    }
    func_0x004a38e0(&uStack0000000000000050);
  }
  __Unwind_Resume();
  func_0x007a2668();
  func_0x007a2668();
  if (param_3 < 4) {
    *extraout_x8 = 1;
    extraout_x8[1] = extraout_x1;
    extraout_x8[2] = param_3;
    *(undefined1 *)(extraout_x8 + 3) = 0x17;
    return;
  }
  uVar1 = *extraout_x1;
  extraout_x8[1] = extraout_x1 + 1;
  extraout_x8[2] = param_3 - 4;
  *(undefined4 *)(extraout_x8 + 3) = uVar1;
  *extraout_x8 = 3;
  return;
}

