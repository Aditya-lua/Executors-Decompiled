
/* WARNING: Removing unreachable block (ram,0x001d4338) */

void FUN_001d4274(void)

{
  long lVar1;
  uint unaff_w20;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000088;
  long in_stack_000000a8;
  undefined1 uStack0000000000000100;
  undefined1 uStack00000000000001f0;
  long in_stack_00000540;
  undefined8 in_stack_00000548;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00187bd4();
  if ((unaff_w20 & 1) != 0) {
    func_0x00187bd4(in_stack_00000088,0x20,1);
  }
  if (in_stack_00000540 != 0) {
    func_0x00187bd4(in_stack_00000548,in_stack_00000540,1);
  }
  func_0x00252db4(auStack_7ffffffe + 0x800004f6);
  func_0x00240a1c(&uStack00000000000001f0);
  func_0x001bf718(&uStack0000000000000100);
  func_0x001be974(in_stack_00000038);
  lVar1 = **(long **)(in_stack_000000a8 + 0x38);
  **(long **)(in_stack_000000a8 + 0x38) = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4();
  }
  func_0x001be5e4(in_stack_000000a8);
  func_0x00187bd4(in_stack_000000a8,0x188,8);
  __Unwind_Resume();
  func_0x007a2668();
  func_0x007a2668();
  return;
}

