
void FUN_0040dd8c(void)

{
  ulong uVar1;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong *in_stack_00000018;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 uStack00000000000000d8;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  ulong in_stack_000000f0;
  
  func_0x00187bd4();
  if (in_stack_000000c0 != 0) {
    func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
  }
  if ((*unaff_x20 & 1) == 0) {
    uStack00000000000000d8 = unaff_x21;
    in_stack_000000e0 = unaff_x24;
    in_stack_000000e8 = unaff_x23;
    in_stack_000000f0 = unaff_x19;
    if (*unaff_x20 != 0) {
      func_0x003f7a44(unaff_x20 + 1);
    }
    *unaff_x20 = 1;
    unaff_x20[2] = in_stack_000000e0;
    unaff_x20[1] = uStack00000000000000d8;
    unaff_x20[4] = in_stack_000000f0;
    unaff_x20[3] = in_stack_000000e8;
    uVar1 = unaff_x20[1];
  }
  else {
    func_0x003f7a44(&uStack00000000000000d8);
    uVar1 = unaff_x20[1];
  }
  if (uVar1 == 0) {
    uVar1 = unaff_x20[2];
    in_stack_00000018[1] = unaff_x20[3];
    *in_stack_00000018 = uVar1;
  }
  else {
    in_stack_00000018[1] = (ulong)(unaff_x20 + 1);
    *(undefined1 *)in_stack_00000018 = 0x4f;
  }
  return;
}

