
undefined8 FUN_004c1ff4(void)

{
  code *pcVar1;
  undefined4 *puVar2;
  undefined4 in_stack_000000a0;
  undefined8 in_stack_000000f8;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001f0;
  undefined8 in_stack_000001f8;
  long in_stack_00000548;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  puVar2 = (undefined4 *)func_0x00187bd0(0x28,8);
  if (puVar2 == (undefined4 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  *puVar2 = in_stack_000000a0;
  *(undefined8 *)(puVar2 + 2) = 0;
  *(undefined8 *)(puVar2 + 4) = 8;
  *(undefined8 *)(puVar2 + 6) = 0;
  *(undefined1 *)(puVar2 + 8) = 0;
  func_0x00584c34(&stack0x000001f0,in_stack_000000f8);
  func_0x004ce364(&stack0x000001f0);
  if (in_stack_000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,in_stack_000001f0 * 0x28,8);
  }
  func_0x004bea24(in_stack_000000f8);
  if ((in_stack_00000548 != 0x16) && (in_stack_00000548 != 0x19)) {
    func_0x004bba74(auStack_7ffffffe + 0x8000052e);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

