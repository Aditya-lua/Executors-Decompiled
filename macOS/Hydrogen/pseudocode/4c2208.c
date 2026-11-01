
undefined8 FUN_004c2208(undefined4 *param_1)

{
  code *pcVar1;
  long lVar2;
  undefined4 unaff_w20;
  undefined8 *unaff_x26;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001f0;
  undefined8 in_stack_000001f8;
  long *in_stack_00000570;
  long *in_stack_00000578;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  if (param_1 == (undefined4 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  *param_1 = unaff_w20;
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 8;
  *(undefined8 *)(param_1 + 6) = 0;
  *(undefined1 *)(param_1 + 8) = 0;
  *unaff_x26 = 1;
  unaff_x26[1] = param_1;
  unaff_x26[2] = 1;
  func_0x00584c34(&stack0x000001f0,in_stack_000000f8,in_stack_00000118._4_4_,
                  auStack_7ffffffe + 0x8000066e);
  func_0x004ce364(&stack0x000001f0);
  if (in_stack_000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,in_stack_000001f0 * 0x28,8);
  }
  func_0x004bea24(in_stack_000000f8,in_stack_00000118._4_4_,1);
  lVar2 = *in_stack_00000570;
  *in_stack_00000570 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x8000056e);
  }
  lVar2 = *in_stack_00000578;
  *in_stack_00000578 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    func_0x005d2c74(auStack_7ffffffe + 0x80000576);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

