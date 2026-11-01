
undefined * FUN_0017146c(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long *unaff_x21;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack0000000000000018 = unaff_x19[1];
  _uStack0000000000000010 = *unaff_x19;
  uStack0000000000000028 = unaff_x19[3];
  uStack0000000000000020 = unaff_x19[2];
  func_0x0025a1fc(&uStack0000000000000030,in_stack_00000008,&uStack0000000000000010);
  if (uStack0000000000000030 == 2) {
    unaff_x19[1] = in_stack_00000040;
    *unaff_x19 = in_stack_00000038;
    unaff_x19[3] = in_stack_00000050;
    unaff_x19[2] = in_stack_00000048;
    unaff_x19[5] = in_stack_00000060;
    unaff_x19[4] = in_stack_00000058;
    func_0x007a2810(&UNK_00814ab0,0x2b,auStack_7ffffffe + 0x8000044e,&UNK_009bdb70,&UNK_009bdee8);
  }
  else {
    _memcpy(auStack_7ffffffe + 0x80000456,&uStack0000000000000030,0x420);
    unaff_x19[0x91] = 0;
    unaff_x19[0x90] = 0;
    lVar2 = func_0x00187bd0(0x490,8);
    if (lVar2 != 0) {
      _memcpy(lVar2,auStack_7ffffffe + 0x8000044e,0x490);
      *unaff_x21 = lVar2;
      return &UNK_00001b58;
    }
    func_0x007a1f18(8,0x490);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x171550);
  (*pcVar1)();
}

