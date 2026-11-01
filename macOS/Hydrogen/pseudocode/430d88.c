
undefined1  [16] FUN_00430d88(void)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  uint *puVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  undefined1 auVar7 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong in_stack_00000018;
  undefined4 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  
  do {
    while (uVar3 = _read(), uVar3 != 0xffffffffffffffff) {
      unaff_x28 = unaff_x28 + uVar3;
      unaff_x20[2] = unaff_x28;
      if (uVar3 == 0) {
        uVar3 = unaff_x28 - in_stack_00000000;
        uVar5 = 0;
        goto LAB_00430e24;
      }
      uVar6 = uVar3;
      if (uVar3 <= in_stack_00000018) {
        uVar6 = in_stack_00000018;
      }
      in_stack_00000018 = uVar6 - uVar3;
      iVar2 = 0;
      if (uVar3 < unaff_x24) {
        iVar2 = in_stack_00000010._4_4_ + 1;
      }
      if (1 < iVar2 && uVar6 != unaff_x24) {
        unaff_x27 = 0xffffffffffffffff;
      }
      uVar6 = unaff_x27 << 1;
      if ((long)unaff_x27 < 0) {
        uVar6 = 0xffffffffffffffff;
      }
      if (unaff_x24 < unaff_x27 || uVar3 != unaff_x24) {
        uVar6 = unaff_x27;
      }
      if ((unaff_x25 == unaff_x26) && (unaff_x28 == unaff_x25)) {
        auVar7 = func_0x0041ec18(in_stack_00000008);
        uVar3 = auVar7._8_8_;
        if ((auVar7._0_8_ & 1) != 0) {
          uVar5 = 1;
          goto LAB_00430e24;
        }
        if (uVar3 == 0) {
          uVar5 = 0;
          uVar3 = unaff_x20[2] - in_stack_00000000;
          goto LAB_00430e24;
        }
        unaff_x25 = *unaff_x20;
        unaff_x28 = unaff_x20[2];
      }
      uVar3 = unaff_x25 - unaff_x28;
      if (uVar3 == 0) {
        uVar1 = unaff_x25 + 0x20;
        if (unaff_x25 + 0x20 <= unaff_x25 * 2) {
          uVar1 = unaff_x25 * 2;
        }
        if (-1 < (long)uVar1) {
          if (unaff_x25 != 0) {
            uStack0000000000000038 = unaff_x20[1];
            in_stack_00000048 = unaff_x25;
          }
          in_stack_00000040 = (ulong)(unaff_x25 != 0);
          func_0x0079a108(&uStack0000000000000020,1,uVar1,&uStack0000000000000038);
          if (uStack0000000000000020 != 1) {
            *unaff_x20 = uVar1;
            unaff_x20[1] = in_stack_00000028;
            uVar3 = uVar1 - unaff_x25;
            unaff_x25 = uVar1;
            goto code_r0x00430d68;
          }
        }
        uVar3 = 0x2600000003;
        goto LAB_00430e20;
      }
code_r0x00430d68:
      unaff_x24 = uVar6;
      unaff_x27 = uVar6;
      in_stack_00000010._4_4_ = iVar2;
      if (uVar3 <= uVar6) {
        unaff_x24 = uVar3;
      }
    }
    puVar4 = (uint *)___error();
  } while (*puVar4 == 4);
  uVar3 = unaff_x19 & 0xffffffff | (ulong)*puVar4 << 0x20;
  unaff_x20[2] = unaff_x28;
LAB_00430e20:
  uVar5 = 1;
LAB_00430e24:
  auVar7._8_8_ = uVar3;
  auVar7._0_8_ = uVar5;
  return auVar7;
}

