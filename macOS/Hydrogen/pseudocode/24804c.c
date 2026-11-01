
void FUN_0024804c(ulong param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  long in_x9;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong uVar3;
  ulong unaff_x23;
  ulong uVar4;
  undefined8 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  ulong in_stack_00000040;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000068;
  long lStack0000000000000070;
  ulong uStack0000000000000078;
  ulong uStack0000000000000080;
  
code_r0x0024804c:
  _uStack0000000000000068 = in_x9;
  lStack0000000000000070 = unaff_x20;
  uVar4 = unaff_x23;
  uStack0000000000000078 = param_1;
  do {
    uVar3 = unaff_x22;
    uStack0000000000000080 = uVar3;
    func_0x002595f8(&uStack0000000000000048,in_stack_00000010,&uStack0000000000000068);
    func_0x00256764(&uStack0000000000000030,&uStack0000000000000048);
    uVar1 = in_stack_00000038;
    unaff_x23 = in_stack_00000040 + uVar4;
    if (CARRY8(in_stack_00000040,uVar4)) {
      func_0x007a28bc(uVar4,unaff_x23,&UNK_009c9f38);
code_r0x00248158:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x24815c);
      (*pcVar2)();
    }
    if (in_stack_00000028 < unaff_x23) {
      func_0x007a28b0(unaff_x23,in_stack_00000028,&UNK_009c9f38);
      goto code_r0x00248158;
    }
    _memcpy(in_stack_00000020 + uVar4,in_stack_00000038);
    if (uStack0000000000000030 != 0) {
      func_0x00187bd4(uVar1,uStack0000000000000030,1);
    }
    uVar4 = uVar3;
    if (in_stack_00000018 != 0) {
      uVar4 = unaff_x19 - uVar3;
    }
    if (uVar4 == 0) {
      *in_stack_00000000 = 2;
      in_stack_00000000[1] = unaff_x23;
      return;
    }
    if (in_stack_00000018 == 0) break;
    unaff_x22 = unaff_x19;
    if (uVar3 + in_stack_00000008 <= unaff_x19) {
      unaff_x22 = uVar3 + in_stack_00000008;
    }
    _uStack0000000000000068 = in_stack_00000018;
    lStack0000000000000070 = unaff_x21;
    uVar4 = unaff_x23;
    uStack0000000000000078 = uVar3;
  } while( true );
  param_1 = uVar3;
  if (in_stack_00000008 <= uVar3) {
    param_1 = in_stack_00000008;
  }
  unaff_x22 = uVar3 - param_1;
  in_x9 = in_stack_00000018;
  unaff_x20 = unaff_x21;
  unaff_x21 = param_1 + unaff_x21;
  goto code_r0x0024804c;
}

