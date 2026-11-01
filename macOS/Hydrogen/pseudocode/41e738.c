
undefined8 FUN_0041e738(void)

{
  ulong uVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  uint *puVar5;
  ulong uVar6;
  ulong *unaff_x19;
  ulong uVar7;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong uVar8;
  ulong unaff_x26;
  int iVar9;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000018;
  undefined4 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  
  if (unaff_x22 - unaff_x23 < 0x20) {
    auVar10 = func_0x0041ed08();
    if ((auVar10._0_8_ & 1) != 0) {
      return 1;
    }
    if (auVar10._8_8_ == 0) {
      return 0;
    }
    unaff_x23 = unaff_x19[2];
    uVar7 = *unaff_x19;
  }
  else {
    uVar7 = unaff_x22;
  }
  uVar8 = 0;
  iVar9 = 0;
  do {
    if ((unaff_x23 == uVar7) && (uVar7 == unaff_x22)) {
      auVar10 = func_0x0041ed08();
      if ((auVar10._0_8_ & 1) != 0) {
        return 1;
      }
      if (auVar10._8_8_ == 0) {
        return 0;
      }
      uVar7 = *unaff_x19;
      unaff_x23 = unaff_x19[2];
    }
    if (unaff_x23 == uVar7) {
      uVar7 = unaff_x23 + 0x20;
      if (unaff_x23 + 0x20 <= unaff_x23 * 2) {
        uVar7 = unaff_x23 * 2;
      }
      if ((long)uVar7 < 0) {
        return 1;
      }
      if (unaff_x23 != 0) {
        uStack0000000000000038 = unaff_x19[1];
        in_stack_00000048 = unaff_x23;
      }
      in_stack_00000040 = (ulong)(unaff_x23 != 0);
      func_0x0079a108(&uStack0000000000000020,1,uVar7,&uStack0000000000000038);
      if (uStack0000000000000020 == 1) {
        return 1;
      }
      *unaff_x19 = uVar7;
      unaff_x19[1] = in_stack_00000028;
    }
    else {
      uVar7 = *unaff_x19;
    }
    uVar1 = unaff_x26;
    if (uVar7 - unaff_x23 <= unaff_x26) {
      uVar1 = uVar7 - unaff_x23;
    }
    do {
      uVar4 = _read();
      if (uVar4 != 0xffffffffffffffff) {
        uVar6 = uVar4;
        if (uVar4 <= uVar8) {
          uVar6 = uVar8;
        }
        unaff_x23 = unaff_x19[2] + uVar4;
        unaff_x19[2] = unaff_x23;
        goto LAB_0041e8d4;
      }
      puVar5 = (uint *)___error();
      uVar3 = *puVar5;
    } while (uVar3 == 4);
    uVar4 = 0;
    unaff_x23 = unaff_x19[2];
    unaff_x19[2] = unaff_x23;
    uVar6 = uVar8;
    if (((ulong)uVar3 << 0x20 | 2) != 0) {
      return 1;
    }
LAB_0041e8d4:
    if (uVar4 == 0) {
      return 0;
    }
    uVar8 = uVar6 - uVar4;
    iVar2 = 0;
    if (uVar4 < uVar1) {
      iVar2 = iVar9 + 1;
    }
    iVar9 = iVar2;
    if (in_stack_00000018._4_4_ != 0) {
      if (1 < iVar2 && uVar6 != uVar1) {
        unaff_x26 = 0xffffffffffffffff;
      }
      uVar6 = unaff_x26 << 1;
      if ((long)unaff_x26 < 0) {
        uVar6 = 0xffffffffffffffff;
      }
      if (uVar1 < unaff_x26 || uVar4 != uVar1) {
        uVar6 = unaff_x26;
      }
      unaff_x26 = uVar6;
    }
  } while( true );
}

