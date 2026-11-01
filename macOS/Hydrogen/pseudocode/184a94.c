
void FUN_00184a94(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  long *unaff_x21;
  undefined8 in_stack_000005a0;
  undefined8 in_stack_000005a8;
  undefined8 in_stack_000005b0;
  undefined8 in_stack_000005b8;
  undefined8 in_stack_000005c0;
  undefined8 in_stack_000005c8;
  undefined8 in_stack_000005d0;
  undefined1 auStack_7ffffffe [2147483646];
  
  puVar2 = (undefined8 *)func_0x00187bd0(0x38,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x38);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x184ba4);
    (*pcVar1)();
  }
  puVar2[1] = in_stack_000005a8;
  *puVar2 = in_stack_000005a0;
  puVar2[3] = in_stack_000005b8;
  puVar2[2] = in_stack_000005b0;
  puVar2[5] = in_stack_000005c8;
  puVar2[4] = in_stack_000005c0;
  puVar2[6] = in_stack_000005d0;
  *unaff_x21 = (long)puVar2;
  func_0x00178dac(auStack_7ffffffe + 0x800009de);
  return;
}

