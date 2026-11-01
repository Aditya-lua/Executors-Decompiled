
undefined8 FUN_00076c30(void)

{
  code *pcVar1;
  int iVar2;
  long *plVar3;
  undefined8 unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  undefined8 uStack0000000000000068;
  
  uStack0000000000000000 = 1;
  _fcntl();
  plVar3 = *(long **)(unaff_x20 + 0x18);
  if (plVar3 != (long *)0x0) {
    uStack0000000000000068._4_4_ = (undefined4)unaff_x19;
    (**(code **)(*plVar3 + 0x30))(plVar3,(long)&uStack0000000000000068 + 4);
  }
  iVar2 = _bind();
  if ((iVar2 != 0) || (iVar2 = _listen(), iVar2 != 0)) {
    _close();
    unaff_x19 = 0xffffffff;
  }
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x48)) {
    ___stack_chk_fail();
    func_0x00056004();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x76c9c);
    (*pcVar1)();
  }
  return unaff_x19;
}

