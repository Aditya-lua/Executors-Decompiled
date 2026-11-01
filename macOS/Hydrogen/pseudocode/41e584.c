
undefined8 FUN_0041e584(void)

{
  ulong uVar1;
  ulong uVar2;
  uint uVar3;
  ulong uVar4;
  uint *puVar5;
  ulong uVar6;
  ulong *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  ulong uVar7;
  int unaff_w26;
  int iVar8;
  ulong unaff_x28;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000008;
  undefined4 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  ulong uStack0000000000000038;
  
code_r0x0041e584:
  uStack0000000000000030 = 1;
  uStack0000000000000038 = unaff_x28;
code_r0x0041e58c:
  func_0x0079a108(&uStack0000000000000010,1,unaff_x20,&uStack0000000000000028);
  if (uStack0000000000000010 == 1) {
    return 1;
  }
  *unaff_x19 = unaff_x20;
  unaff_x19[1] = in_stack_00000018;
  uVar7 = unaff_x25;
  uVar6 = in_stack_00000018;
  iVar8 = unaff_w26;
  do {
    uVar1 = uVar7;
    if (unaff_x20 - unaff_x28 <= uVar7) {
      uVar1 = unaff_x20 - unaff_x28;
    }
    uVar2 = uVar1;
    if (0x7ffffffd < uVar1) {
      uVar2 = 0x7ffffffe;
    }
    do {
      uVar4 = _read(0,uVar6 + unaff_x28,uVar2);
      if (uVar4 != 0xffffffffffffffff) {
        uVar6 = uVar4;
        if (uVar4 <= unaff_x22) {
          uVar6 = unaff_x22;
        }
        unaff_x28 = unaff_x19[2] + uVar4;
        unaff_x19[2] = unaff_x28;
        goto code_r0x0041e63c;
      }
      puVar5 = (uint *)___error();
      uVar3 = *puVar5;
    } while (uVar3 == 4);
    uVar4 = 0;
    unaff_x28 = unaff_x19[2];
    unaff_x19[2] = unaff_x28;
    uVar6 = unaff_x22;
    if (((ulong)uVar3 << 0x20 | 2) != 0) {
      return 1;
    }
code_r0x0041e63c:
    if (uVar4 == 0) {
      return 0;
    }
    unaff_x22 = uVar6 - uVar4;
    unaff_w26 = 0;
    if (uVar4 < uVar1) {
      unaff_w26 = iVar8 + 1;
    }
    unaff_x25 = uVar7;
    if (in_stack_00000008._4_4_ != 0) {
      if (1 < unaff_w26 && uVar6 != uVar1) {
        uVar7 = 0xffffffffffffffff;
      }
      unaff_x25 = uVar7 << 1;
      if ((long)uVar7 < 0) {
        unaff_x25 = 0xffffffffffffffff;
      }
      if (uVar1 < uVar7 || uVar4 != uVar1) {
        unaff_x25 = uVar7;
      }
    }
    if ((unaff_x28 == unaff_x20) && (unaff_x20 == unaff_x23)) {
      auVar9 = func_0x0041edf8();
      if ((auVar9._0_8_ & 1) != 0) {
        return 1;
      }
      if (auVar9._8_8_ == 0) {
        return 0;
      }
      unaff_x20 = *unaff_x19;
      unaff_x28 = unaff_x19[2];
    }
    if (unaff_x28 == unaff_x20) break;
    unaff_x20 = *unaff_x19;
    uVar6 = unaff_x19[1];
    uVar7 = unaff_x25;
    iVar8 = unaff_w26;
  } while( true );
  unaff_x20 = unaff_x28 + 0x20;
  if (unaff_x28 + 0x20 <= unaff_x28 * 2) {
    unaff_x20 = unaff_x28 * 2;
  }
  if ((long)unaff_x20 < 0) {
    return 1;
  }
  if (unaff_x28 != 0) goto code_r0x0041e57c;
  uStack0000000000000030 = 0;
  goto code_r0x0041e58c;
code_r0x0041e57c:
  uStack0000000000000028 = unaff_x19[1];
  goto code_r0x0041e584;
}

