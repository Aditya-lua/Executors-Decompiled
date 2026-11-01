
/* WARNING: Removing unreachable block (ram,0x004c4fc4) */
/* WARNING: Removing unreachable block (ram,0x004c490c) */

undefined8 FUN_004c4d68(void)

{
  code *pcVar1;
  undefined4 *puVar2;
  long *unaff_x28;
  ulong in_stack_00000038;
  undefined4 in_stack_00000070;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined1 uStack00000000000001f0;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x004bdba4();
  func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
  func_0x004bcba8(auStack_7ffffffe + 0x8000066e);
  puVar2 = (undefined4 *)func_0x00187bd0(0x28,8);
  if (puVar2 == (undefined4 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  *puVar2 = in_stack_00000070;
  *(undefined8 *)(puVar2 + 2) = 0;
  *(undefined8 *)(puVar2 + 4) = 8;
  *(undefined8 *)(puVar2 + 6) = 0;
  *(undefined1 *)(puVar2 + 8) = 0;
  func_0x00584c34(auStack_7ffffffe + 0x8000052e,in_stack_000000f8);
  func_0x004bb068(auStack_7ffffffe + 0x8000052e);
  func_0x004bea24(in_stack_000000f8);
  if ((0x19 < (ulong)unaff_x28[0xd]) || ((1L << (unaff_x28[0xd] & 0x3fU) & 0x2410000U) == 0)) {
    func_0x004bba74(&uStack00000000000001f0);
  }
  if (((in_stack_00000038 & 0x100000000) != 0) && (*unaff_x28 != 0)) {
    func_0x00187bd4(unaff_x28[1],*unaff_x28 << 2,4);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

