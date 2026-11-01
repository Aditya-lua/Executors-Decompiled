
long FUN_004edf20(void)

{
  long lVar1;
  undefined8 *puVar2;
  long unaff_x26;
  undefined8 in_stack_000000c8;
  long in_stack_000000e8;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  long in_stack_000002d0;
  long in_stack_000002d8;
  long in_stack_000002e0;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x005174c8();
  if (unaff_x26 != 0) {
    func_0x00187bd4();
  }
  if ((in_stack_00000100 != -0x8000000000000000) && (in_stack_00000100 != 0)) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100,1);
  }
  lVar1 = func_0x004f15d8(in_stack_000000e8,in_stack_000000c8);
  if ((lVar1 == 0) && (lVar1 = func_0x004f2ac4(in_stack_000000e8,in_stack_000000c8), lVar1 == 0)) {
    func_0x005053c0(auStack_7ffffffe + 0x800002ce,*(undefined8 *)(in_stack_000000e8 + 0x10));
    lVar1 = func_0x00521aa8(auStack_7ffffffe + 0x800002ce,in_stack_000000c8);
    if (in_stack_000002e0 != 0) {
      puVar2 = (undefined8 *)(in_stack_000002d8 + 8);
      do {
        if (puVar2[-1] != 0) {
          func_0x00187bd4(*puVar2,puVar2[-1] << 3,8);
        }
        puVar2 = puVar2 + 5;
        in_stack_000002e0 = in_stack_000002e0 + -1;
      } while (in_stack_000002e0 != 0);
    }
    if (in_stack_000002d0 != 0) {
      func_0x00187bd4(in_stack_000002d8,in_stack_000002d0 * 0x28,8);
    }
  }
  return lVar1;
}

