
undefined8 FUN_00604000(ulong param_1,long param_2)

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  long in_x9;
  uint in_w10;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 unaff_x26;
  byte *unaff_x28;
  long unaff_x29;
  long *in_stack_00000010;
  undefined8 in_stack_00000018;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  ulong in_stack_00000110;
  ulong in_stack_00000118;
  long in_stack_00000120;
  undefined8 uStack0000000000000130;
  ulong in_stack_00000140;
  ulong in_stack_00000148;
  long in_stack_00000150;
  ulong in_stack_000001a0;
  ulong in_stack_000001a8;
  long in_stack_000001b0;
  undefined8 uStack00000000000001c8;
  ulong in_stack_000001d8;
  ulong in_stack_000001e0;
  long in_stack_000001e8;
  
  uVar4 = param_1;
  do {
    uVar5 = uVar4;
    if (uVar5 == 0) break;
    uVar4 = uVar5 - 1;
  } while (*(long *)(param_2 + uVar5 * 8 + -8) == 0);
  if (in_w10 == (uint)uVar5) {
    uVar4 = (ulong)in_w10;
    do {
      uVar4 = uVar4 - 1;
      if (uVar4 == 0xffffffffffffffff) break;
      uVar5 = *(ulong *)(in_x9 + uVar4 * 8);
      uVar6 = *(ulong *)(param_2 + uVar4 * 8);
      if (uVar6 < uVar5) {
        if (param_1 <= in_stack_000001d8) {
          in_stack_000001d8 = param_1;
        }
        goto joined_r0x00604314;
      }
    } while (uVar6 <= uVar5);
  }
  else if ((uint)uVar5 < in_w10) {
    if (param_1 <= in_stack_000001d8) {
      in_stack_000001d8 = param_1;
    }
    if (param_2 != 0) {
joined_r0x00604314:
      if (in_stack_000001d8 != 0) {
        do {
          *(undefined8 *)(param_2 + -8 + in_stack_000001d8 * 8) = 0;
          in_stack_000001d8 = in_stack_000001d8 - 1;
        } while (in_stack_000001d8 != 0);
      }
      func_0x00611644();
    }
    uVar7 = 0;
    if (in_stack_00000060 <= in_stack_00000058) {
      in_stack_00000058 = in_stack_00000060;
    }
    goto joined_r0x006043cc;
  }
  if (((*unaff_x28 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa3c150), iVar3 != 0)) {
    func_0x005fe1e8(0xa3c168,0);
    ___cxa_atexit(&SUB_00087574,0xa3c168,0);
    ___cxa_guard_release(0xa3c150);
  }
  func_0x00607398(unaff_x29 + -0x100,&uStack0000000000000130,&uStack00000000000001c8);
  func_0x006095dc(unaff_x29 + -0xb8,unaff_x29 + -0x100,&uStack00000000000000a0);
  func_0x00602f68();
  *(undefined8 *)(unaff_x29 + -0xb8) = unaff_x26;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar4 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xa0);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  *(undefined8 *)(unaff_x29 + -0x100) = unaff_x26;
  lVar1 = *(long *)(unaff_x29 + -0xe0);
  uVar4 = *(ulong *)(unaff_x29 + -0xf0);
  if (*(ulong *)(unaff_x29 + -0xe8) <= *(ulong *)(unaff_x29 + -0xf0)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xe8);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x00608730(unaff_x29 + -0xb8);
  func_0x005ffccc();
  *(undefined8 *)(unaff_x29 + -0xb8) = unaff_x26;
  lVar1 = *(long *)(unaff_x29 + -0x98);
  uVar4 = *(ulong *)(unaff_x29 + -0xa8);
  if (*(ulong *)(unaff_x29 + -0xa0) <= *(ulong *)(unaff_x29 + -0xa8)) {
    uVar4 = *(ulong *)(unaff_x29 + -0xa0);
  }
  if (lVar1 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x00603158();
  if (in_stack_000001e0 <= in_stack_000001d8) {
    in_stack_000001d8 = in_stack_000001e0;
  }
  if (in_stack_000001e8 != 0) {
    if (in_stack_000001d8 != 0) {
      do {
        *(undefined8 *)(in_stack_000001e8 + -8 + in_stack_000001d8 * 8) = 0;
        in_stack_000001d8 = in_stack_000001d8 - 1;
      } while (in_stack_000001d8 != 0);
    }
    func_0x00611644();
  }
  uVar7 = 1;
  if (in_stack_00000060 <= in_stack_00000058) {
    in_stack_00000058 = in_stack_00000060;
  }
joined_r0x006043cc:
  if (in_stack_00000068 != 0) {
    if (in_stack_00000058 != 0) {
      do {
        *(undefined1 *)(in_stack_00000068 + -1 + in_stack_00000058) = 0;
        in_stack_00000058 = in_stack_00000058 - 1;
      } while (in_stack_00000058 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000018._4_4_ != 0) {
    (**(code **)(*in_stack_00000010 + 8))();
  }
  if (in_stack_000000b8 <= in_stack_000000b0) {
    in_stack_000000b0 = in_stack_000000b8;
  }
  if (in_stack_000000c0 != 0) {
    if (in_stack_000000b0 != 0) {
      do {
        *(undefined8 *)(in_stack_000000c0 + -8 + in_stack_000000b0 * 8) = 0;
        in_stack_000000b0 = in_stack_000000b0 - 1;
      } while (in_stack_000000b0 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000118 <= in_stack_00000110) {
    in_stack_00000110 = in_stack_00000118;
  }
  if (in_stack_00000120 != 0) {
    if (in_stack_00000110 != 0) {
      do {
        *(undefined8 *)(in_stack_00000120 + -8 + in_stack_00000110 * 8) = 0;
        in_stack_00000110 = in_stack_00000110 - 1;
      } while (in_stack_00000110 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000148 <= in_stack_00000140) {
    in_stack_00000140 = in_stack_00000148;
  }
  if (in_stack_00000150 != 0) {
    if (in_stack_00000140 != 0) {
      do {
        *(undefined8 *)(in_stack_00000150 + -8 + in_stack_00000140 * 8) = 0;
        in_stack_00000140 = in_stack_00000140 - 1;
      } while (in_stack_00000140 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_000001a8 <= in_stack_000001a0) {
    in_stack_000001a0 = in_stack_000001a8;
  }
  if (in_stack_000001b0 != 0) {
    if (in_stack_000001a0 != 0) {
      do {
        *(undefined8 *)(in_stack_000001b0 + -8 + in_stack_000001a0 * 8) = 0;
        in_stack_000001a0 = in_stack_000001a0 - 1;
      } while (in_stack_000001a0 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60)) {
    ___stack_chk_fail();
    uVar7 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(unaff_x29 + -0xb8,"Integer: missing Max argument");
    func_0x0002703c(uVar7,unaff_x29 + -0xb8);
    ___cxa_throw(uVar7,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6045ac);
    (*pcVar2)();
  }
  return uVar7;
}

