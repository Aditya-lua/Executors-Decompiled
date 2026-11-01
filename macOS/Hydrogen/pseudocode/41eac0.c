
undefined8 FUN_0041eac0(undefined8 param_1)

{
  ulong uVar1;
  ulong uVar2;
  undefined4 uVar3;
  uint uVar4;
  ulong uVar5;
  uint *puVar6;
  ulong uVar7;
  ulong *unaff_x19;
  ulong unaff_x21;
  undefined4 *unaff_x22;
  ulong unaff_x24;
  ulong unaff_x26;
  int unaff_w28;
  int iVar8;
  undefined1 auVar9 [16];
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong in_stack_00000018;
  undefined4 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  
code_r0x0041eac0:
  uStack0000000000000040 = param_1;
  func_0x0079a108(&uStack0000000000000020,1,unaff_x21,&uStack0000000000000038);
  if (uStack0000000000000020 == 1) {
    return 1;
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = in_stack_00000028;
  uVar7 = in_stack_00000028;
  iVar8 = unaff_w28;
  do {
    uVar1 = in_stack_00000018;
    if (unaff_x21 - unaff_x26 <= in_stack_00000018) {
      uVar1 = unaff_x21 - unaff_x26;
    }
    uVar3 = *unaff_x22;
    uVar2 = uVar1;
    if (0x7ffffffd < uVar1) {
      uVar2 = 0x7ffffffe;
    }
    do {
      uVar5 = _read(uVar3,uVar7 + unaff_x26,uVar2);
      if (uVar5 != 0xffffffffffffffff) {
        uVar7 = uVar5;
        if (uVar5 <= unaff_x24) {
          uVar7 = unaff_x24;
        }
        unaff_x26 = unaff_x19[2] + uVar5;
        unaff_x19[2] = unaff_x26;
        goto LAB_0041eb7c;
      }
      puVar6 = (uint *)___error();
      uVar4 = *puVar6;
    } while (uVar4 == 4);
    uVar5 = 0;
    unaff_x26 = unaff_x19[2];
    unaff_x19[2] = unaff_x26;
    uVar7 = unaff_x24;
    if (((ulong)uVar4 << 0x20 | 2) != 0) {
      return 1;
    }
LAB_0041eb7c:
    if (uVar5 == 0) {
      return 0;
    }
    unaff_x24 = uVar7 - uVar5;
    unaff_w28 = 0;
    if (uVar5 < uVar1) {
      unaff_w28 = iVar8 + 1;
    }
    if (in_stack_00000010._4_4_ != 0) {
      if (1 < unaff_w28 && uVar7 != uVar1) {
        in_stack_00000018 = 0xffffffffffffffff;
      }
      uVar7 = in_stack_00000018 << 1;
      if ((long)in_stack_00000018 < 0) {
        uVar7 = 0xffffffffffffffff;
      }
      if (uVar1 < in_stack_00000018 || uVar5 != uVar1) {
        uVar7 = in_stack_00000018;
      }
      in_stack_00000018 = uVar7;
    }
    if ((unaff_x26 == unaff_x21) && (unaff_x21 == in_stack_00000008)) {
      auVar9 = func_0x0041ec18(unaff_x22);
      if ((auVar9._0_8_ & 1) != 0) {
        return 1;
      }
      if (auVar9._8_8_ == 0) {
        return 0;
      }
      unaff_x21 = *unaff_x19;
      unaff_x26 = unaff_x19[2];
    }
    if (unaff_x26 == unaff_x21) break;
    unaff_x21 = *unaff_x19;
    uVar7 = unaff_x19[1];
    iVar8 = unaff_w28;
  } while( true );
  unaff_x21 = unaff_x26 + 0x20;
  if (unaff_x26 + 0x20 <= unaff_x26 * 2) {
    unaff_x21 = unaff_x26 * 2;
  }
  if ((long)unaff_x21 < 0) {
    return 1;
  }
  if (unaff_x26 == 0) {
    param_1 = 0;
  }
  else {
    uStack0000000000000038 = unaff_x19[1];
    param_1 = 1;
    in_stack_00000048 = unaff_x26;
  }
  goto code_r0x0041eac0;
}

