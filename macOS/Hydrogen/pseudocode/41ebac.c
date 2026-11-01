
undefined8 FUN_0041ebac(ulong param_1,ulong param_2)

{
  ulong uVar1;
  undefined4 uVar2;
  uint uVar3;
  uint *puVar4;
  ulong uVar5;
  ulong *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined4 *unaff_x22;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong unaff_x26;
  int iVar6;
  int unaff_w28;
  undefined1 auVar7 [16];
  ulong in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong uStack0000000000000018;
  undefined4 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined8 uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  
  uStack0000000000000018 = param_1;
  do {
    uVar5 = uStack0000000000000018 << 1;
    if ((long)uStack0000000000000018 < 0) {
      uVar5 = 0xffffffffffffffff;
    }
    if (unaff_x25 < uStack0000000000000018 || param_2 != unaff_x25) {
      uVar5 = uStack0000000000000018;
    }
    iVar6 = unaff_w28;
    uStack0000000000000018 = uVar5;
    do {
      if ((unaff_x26 == unaff_x21) && (unaff_x21 == unaff_x20)) {
        auVar7 = func_0x0041ec18(unaff_x22);
        if ((auVar7._0_8_ & 1) != 0) {
          return 1;
        }
        if (auVar7._8_8_ == 0) {
          return 0;
        }
        unaff_x21 = *unaff_x19;
        unaff_x26 = unaff_x19[2];
      }
      if (unaff_x26 == unaff_x21) {
        unaff_x21 = unaff_x26 + 0x20;
        if (unaff_x26 + 0x20 <= unaff_x26 * 2) {
          unaff_x21 = unaff_x26 * 2;
        }
        if ((long)unaff_x21 < 0) {
          return 1;
        }
        if (unaff_x26 != 0) {
          uStack0000000000000038 = unaff_x19[1];
          in_stack_00000048 = unaff_x26;
        }
        in_stack_00000040 = (ulong)(unaff_x26 != 0);
        func_0x0079a108(&uStack0000000000000020,1,unaff_x21,&uStack0000000000000038);
        if (uStack0000000000000020 == 1) {
          return 1;
        }
        *unaff_x19 = unaff_x21;
        unaff_x19[1] = in_stack_00000028;
        uVar5 = in_stack_00000028;
      }
      else {
        unaff_x21 = *unaff_x19;
        uVar5 = unaff_x19[1];
      }
      unaff_x25 = uStack0000000000000018;
      if (unaff_x21 - unaff_x26 <= uStack0000000000000018) {
        unaff_x25 = unaff_x21 - unaff_x26;
      }
      uVar2 = *unaff_x22;
      uVar1 = unaff_x25;
      if (0x7ffffffd < unaff_x25) {
        uVar1 = 0x7ffffffe;
      }
      do {
        param_2 = _read(uVar2,uVar5 + unaff_x26,uVar1);
        if (param_2 != 0xffffffffffffffff) {
          uVar5 = param_2;
          if (param_2 <= unaff_x24) {
            uVar5 = unaff_x24;
          }
          unaff_x26 = unaff_x19[2] + param_2;
          unaff_x19[2] = unaff_x26;
          goto code_r0x0041eb7c;
        }
        puVar4 = (uint *)___error();
        uVar3 = *puVar4;
      } while (uVar3 == 4);
      param_2 = 0;
      unaff_x26 = unaff_x19[2];
      unaff_x19[2] = unaff_x26;
      uVar5 = unaff_x24;
      if (((ulong)uVar3 << 0x20 | 2) != 0) {
        return 1;
      }
code_r0x0041eb7c:
      if (param_2 == 0) {
        return 0;
      }
      unaff_x24 = uVar5 - param_2;
      unaff_w28 = 0;
      if (param_2 < unaff_x25) {
        unaff_w28 = iVar6 + 1;
      }
      unaff_x20 = in_stack_00000008;
      iVar6 = unaff_w28;
    } while (in_stack_00000010._4_4_ == 0);
    if (1 < unaff_w28 && uVar5 != unaff_x25) {
      uStack0000000000000018 = 0xffffffffffffffff;
    }
  } while( true );
}

