
void FUN_00247f28(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  code *pcVar4;
  ulong uVar5;
  long *plVar6;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  ulong unaff_x28;
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
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  undefined1 uStack0000000000000088;
  undefined2 uStack000000000000008a;
  
  uVar8 = 0;
  do {
    lVar9 = *(long *)(unaff_x21 + 0xa8);
    uVar7 = lVar9 + 1;
    uVar2 = 0;
    if (*(ulong *)(unaff_x21 + 0x98) <= uVar7) {
      uVar2 = *(ulong *)(unaff_x21 + 0x98);
    }
    *(ulong *)(unaff_x21 + 0xa8) = uVar7 - uVar2;
    *(long *)(unaff_x21 + 0xb0) = param_1 + -1;
    plVar6 = (long *)(*(long *)(unaff_x21 + 0xa0) + lVar9 * 0x18);
    lVar9 = *plVar6;
    if (lVar9 == -0x8000000000000000) break;
    lVar1 = plVar6[1];
    uVar7 = plVar6[2];
    uVar5 = *(ulong *)(unaff_x21 + 0xb8);
    *(undefined8 *)(unaff_x21 + 0xb8) = 0;
    uVar2 = uVar7 - uVar5;
    if (uVar7 < uVar5) {
      func_0x007a28b0(uVar5,uVar7,&UNK_009c2450);
      goto code_r0x00248158;
    }
    if ((uVar5 != 0) && (uVar2 != 0)) {
      _memmove(lVar1,lVar1 + uVar5,uVar2);
    }
    uVar7 = uVar2 + uVar8;
    if (CARRY8(uVar2,uVar8)) {
      func_0x007a28bc(uVar8,uVar7,&UNK_009c9f20);
      goto code_r0x00248158;
    }
    if (in_stack_00000028 < uVar7) {
      func_0x007a28b0(uVar7,in_stack_00000028,&UNK_009c9f20);
      goto code_r0x00248158;
    }
    _memcpy(in_stack_00000020 + uVar8,lVar1,uVar2);
    if (lVar9 != 0) {
      func_0x00187bd4(lVar1,lVar9,1);
    }
    param_1 = *(long *)(unaff_x21 + 0xb0);
    uVar8 = uVar7;
  } while (param_1 != 0);
  in_stack_00000070 = unaff_x20;
  while( true ) {
    in_stack_00000078 = unaff_x28;
    if (in_stack_00000018 == 0) {
      if (in_stack_00000008 <= unaff_x28) {
        in_stack_00000078 = in_stack_00000008;
      }
      uVar7 = unaff_x28 - in_stack_00000078;
      lVar9 = in_stack_00000078 + in_stack_00000070;
    }
    else {
      uVar7 = unaff_x19;
      if (unaff_x28 + in_stack_00000008 <= unaff_x19) {
        uVar7 = unaff_x28 + in_stack_00000008;
      }
      lVar9 = in_stack_00000070;
    }
    uStack0000000000000088 = 3;
    uStack000000000000008a = 4;
    uStack0000000000000068 = in_stack_00000018;
    in_stack_00000080 = uVar7;
    func_0x002595f8(&uStack0000000000000048,in_stack_00000010,&uStack0000000000000068);
    func_0x00256764(&uStack0000000000000030,&uStack0000000000000048);
    uVar3 = in_stack_00000038;
    uVar2 = in_stack_00000040 + uVar8;
    if (CARRY8(in_stack_00000040,uVar8)) break;
    if (in_stack_00000028 < uVar2) {
      func_0x007a28b0(uVar2,in_stack_00000028,&UNK_009c9f38);
      goto code_r0x00248158;
    }
    _memcpy(in_stack_00000020 + uVar8,in_stack_00000038);
    if (uStack0000000000000030 != 0) {
      func_0x00187bd4(uVar3,uStack0000000000000030,1);
    }
    uVar5 = uVar7;
    if (in_stack_00000018 != 0) {
      uVar5 = unaff_x19 - uVar7;
    }
    in_stack_00000070 = lVar9;
    uVar8 = uVar2;
    unaff_x28 = uVar7;
    if (uVar5 == 0) {
      *in_stack_00000000 = 2;
      in_stack_00000000[1] = uVar2;
      return;
    }
  }
  func_0x007a28bc(uVar8,uVar2,&UNK_009c9f38);
code_r0x00248158:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x24815c);
  (*pcVar4)();
}

