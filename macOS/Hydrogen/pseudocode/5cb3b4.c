
/* WARNING: Removing unreachable block (ram,0x005cb2f0) */

void FUN_005cb3b4(void)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 *puVar3;
  long *plVar4;
  long *plVar5;
  int in_w8;
  undefined8 *unaff_x20;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long in_stack_00000000;
  long in_stack_00000008;
  long *in_stack_00000010;
  char cStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 in_stack_00000040;
  undefined8 uStack00000000000000a0;
  long *in_stack_000000a8;
  undefined1 uStack00000000000000b0;
  undefined7 uStack00000000000000b1;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  
  if (in_w8 == 0xb) {
    in_stack_000000a8 = in_stack_00000010;
    uStack00000000000000a0 = (long *)in_stack_00000008;
    uStack00000000000000b0 = 10;
    func_0x005c16b4(&uStack00000000000000a0);
  }
  else if (in_w8 == 0xc) {
    in_stack_000000a8 = in_stack_00000010;
    uStack00000000000000a0 = (long *)in_stack_00000008;
    uStack00000000000000b0 = 9;
    func_0x005c16b4(&uStack00000000000000a0);
  }
  else {
    if (1 < in_w8 - 0xdU) {
      in_stack_00000040 = 0;
LAB_005cb470:
      *(long *)(unaff_x29 + -0x68) = in_stack_00000008;
      *(long *)(unaff_x29 + -0x70) = in_stack_00000000;
      *(undefined8 *)(unaff_x29 + -0x58) = _cStack0000000000000018;
      *(long **)(unaff_x29 + -0x60) = in_stack_00000010;
      *(undefined8 *)(unaff_x29 + -0x48) = in_stack_00000028;
      *(undefined8 *)(unaff_x29 + -0x50) = in_stack_00000020;
      *(undefined8 *)(unaff_x29 + -0x38) = in_stack_00000038;
      *(undefined8 *)(unaff_x29 + -0x40) = in_stack_00000030;
      puVar3 = (undefined8 *)func_0x00187bd0(0x40,8);
      if (puVar3 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x40);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x5cb630);
        (*pcVar1)();
      }
      uVar6 = *(undefined8 *)(unaff_x29 + -0x70);
      uVar8 = *(undefined8 *)(unaff_x29 + -0x58);
      uVar7 = *(undefined8 *)(unaff_x29 + -0x60);
      puVar3[1] = *(undefined8 *)(unaff_x29 + -0x68);
      *puVar3 = uVar6;
      puVar3[3] = uVar8;
      puVar3[2] = uVar7;
      uVar6 = *(undefined8 *)(unaff_x29 + -0x50);
      uVar8 = *(undefined8 *)(unaff_x29 + -0x38);
      uVar7 = *(undefined8 *)(unaff_x29 + -0x40);
      puVar3[5] = *(undefined8 *)(unaff_x29 + -0x48);
      puVar3[4] = uVar6;
      puVar3[7] = uVar8;
      puVar3[6] = uVar7;
      *(undefined1 *)(unaff_x20 + 2) = in_stack_00000040;
      *unaff_x20 = 8;
      unaff_x20[1] = puVar3;
      goto LAB_005cb5e8;
    }
    in_stack_000000a8 = (long *)func_0x005c9fc0(in_stack_00000008);
    uStack00000000000000b0 = 0;
    uStack00000000000000a0 = (long *)0x8;
    uVar2 = func_0x005cb794(&uStack00000000000000a0);
    if ((uVar2 & 1) == 0) {
      func_0x005c926c(&uStack00000000000000a0);
      in_stack_000000a8 = (long *)func_0x005c9fc0(in_stack_00000010);
      uStack00000000000000b0 = 0;
      uStack00000000000000a0 = (long *)0x8;
      uVar2 = func_0x005cb794(&uStack00000000000000a0);
      if ((uVar2 & 1) == 0) {
        func_0x005c926c(&uStack00000000000000a0);
        goto LAB_005cb470;
      }
      func_0x005c926c(&uStack00000000000000a0);
    }
    else {
      func_0x005c926c(&uStack00000000000000a0);
    }
    func_0x005cb1c8(&uStack00000000000000a0,in_stack_00000008,0);
    plVar4 = (long *)func_0x004afc0c();
    plVar4[1] = (long)in_stack_000000a8;
    *plVar4 = (long)uStack00000000000000a0;
    plVar4[3] = in_stack_000000b8;
    plVar4[2] = CONCAT71(uStack00000000000000b1,uStack00000000000000b0);
    plVar4[5] = in_stack_000000c8;
    plVar4[4] = in_stack_000000c0;
    plVar4[7] = in_stack_000000d8;
    plVar4[6] = in_stack_000000d0;
    func_0x005cb1c8(&uStack00000000000000a0,in_stack_00000010,0);
    plVar5 = (long *)func_0x004afc0c();
    plVar5[1] = (long)in_stack_000000a8;
    *plVar5 = (long)uStack00000000000000a0;
    plVar5[3] = in_stack_000000b8;
    plVar5[2] = CONCAT71(uStack00000000000000b1,uStack00000000000000b0);
    plVar5[5] = in_stack_000000c8;
    plVar5[4] = in_stack_000000c0;
    plVar5[7] = in_stack_000000d8;
    plVar5[6] = in_stack_000000d0;
    uStack00000000000000b0 = 0xd;
    if (cStack0000000000000018 == '\r') {
      uStack00000000000000b0 = 0xe;
    }
    uStack00000000000000a0 = plVar4;
    in_stack_000000a8 = plVar5;
    func_0x005c16b4(&uStack00000000000000a0);
  }
  if (in_stack_00000000 == 8) {
    func_0x005c926c(in_stack_00000008);
    func_0x00187bd4(in_stack_00000008,0x40,8);
  }
  else if (in_stack_00000000 != 9) {
    func_0x005c926c();
  }
LAB_005cb5e8:
  func_0x00187bd4();
  return;
}

