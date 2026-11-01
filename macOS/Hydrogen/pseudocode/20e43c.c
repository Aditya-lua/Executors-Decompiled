
void FUN_0020e43c(undefined1 param_1 [16],undefined1 param_2 [16])

{
  code *pcVar1;
  long lVar2;
  long in_x10;
  long unaff_x20;
  long *unaff_x25;
  undefined8 in_stack_000002f0;
  undefined8 in_stack_000002f8;
  undefined8 in_stack_00000300;
  undefined8 in_stack_00000308;
  undefined8 in_stack_00000330;
  undefined8 in_stack_00000338;
  undefined8 in_stack_00000340;
  undefined8 in_stack_00000348;
  undefined8 in_stack_00000350;
  undefined8 in_stack_00000358;
  undefined8 in_stack_00000360;
  undefined8 in_stack_00000368;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(long *)(in_x10 + 0x48) = param_2._8_8_;
  *(long *)(in_x10 + 0x40) = param_2._0_8_;
  *(long *)(in_x10 + 0x58) = param_1._8_8_;
  *(long *)(in_x10 + 0x50) = param_1._0_8_;
  *(undefined8 *)(in_x10 + 0x28) = in_stack_000002f8;
  *(undefined8 *)(in_x10 + 0x20) = in_stack_000002f0;
  *(undefined8 *)(in_x10 + 0x38) = in_stack_00000308;
  *(undefined8 *)(in_x10 + 0x30) = in_stack_00000300;
  *(undefined8 *)(in_x10 + 0x88) = in_stack_00000358;
  *(undefined8 *)(in_x10 + 0x80) = in_stack_00000350;
  *(undefined8 *)(in_x10 + 0x98) = in_stack_00000368;
  *(undefined8 *)(in_x10 + 0x90) = in_stack_00000360;
  *(undefined8 *)(in_x10 + 0x68) = in_stack_00000338;
  *(undefined8 *)(in_x10 + 0x60) = in_stack_00000330;
  *(undefined8 *)(in_x10 + 0x78) = in_stack_00000348;
  *(undefined8 *)(in_x10 + 0x70) = in_stack_00000340;
  lVar2 = func_0x00187bd0(0x1f0,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1f0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20e774);
    (*pcVar1)();
  }
  _memcpy(lVar2,auStack_7ffffffe + 0x8000037e,0x1f0);
  unaff_x25[1] = lVar2;
  unaff_x25[2] = (long)&UNK_009c6628;
  *unaff_x25 = unaff_x20 + 0xd;
  return;
}

