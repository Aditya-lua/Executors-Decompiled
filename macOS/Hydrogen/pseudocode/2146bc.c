
/* WARNING: Removing unreachable block (ram,0x00214a84) */

void FUN_002146bc(ulong param_1)

{
  byte bVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  undefined8 in_x4;
  undefined *puVar6;
  long in_x9;
  long in_x10;
  long unaff_x19;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined1 uStack00000000000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined8 in_stack_00000108;
  ulong in_stack_00000750;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00235430(auStack_7ffffffe + 0x8000061e,auStack_7ffffffe + 0x800004ce,
                  auStack_7ffffffe + 0x80000286,auStack_7ffffffe + 0x8000038e,
                  in_x9 + (param_1 & 0xfffffffffffffff0) + 0x10,in_x4,in_x10 + 0x168);
  if (0x40 < in_stack_00000750) {
    func_0x007a28b0(in_stack_00000750,0x40,&UNK_009c9cd0);
    goto code_r0x00214fe4;
  }
  if (in_stack_00000750 == 0) {
    lVar4 = 1;
  }
  else {
    lVar4 = func_0x00187bd0(in_stack_00000750,1);
    if (lVar4 == 0) {
      func_0x007a1f00(1,in_stack_00000750,&UNK_009c64a8);
      goto code_r0x00214fe4;
    }
  }
  _memcpy(lVar4,auStack_7ffffffe + 0x8000047e,in_stack_00000750);
  func_0x0024a370(auStack_7ffffffe + 0x800002ce,auStack_7ffffffe + 0x8000061e);
  func_0x00248ae4();
  (**(code **)(uStack0000000000000100[0x1e] + 0x40))
            (uStack0000000000000100[0x1d] +
             (*(long *)(uStack0000000000000100[0x1e] + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
             &uStack00000000000000e0);
  bVar1 = *(byte *)(unaff_x24 + 0x331);
  if ((bVar1 & 1) == 0) {
    func_0x00248ae4();
    *(undefined1 *)(unaff_x24 + 0x335) = 1;
    *(undefined1 *)(unaff_x21 + 1) = 0x1b;
    *unaff_x21 = -0x7fffffffffffffe6;
code_r0x002149f0:
    func_0x00240a1c(auStack_7ffffffe + 0x8000047e);
    if ((bVar1 & 1) == 0) {
      func_0x00209afc(auStack_7ffffffe + 0x8000038e);
    }
    func_0x00240a1c(auStack_7ffffffe + 0x8000023e);
    in_stack_00000040._4_4_ = in_stack_00000040._4_4_ ^ 1;
    lVar4 = *uStack0000000000000100;
    *uStack0000000000000100 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9b44(&uStack0000000000000100);
    }
    if ((((uStack00000000000000e0 & 1) == 0) && (in_stack_000000e8 != -0x8000000000000000)) &&
       (in_stack_000000e8 != 0)) {
      func_0x00187bd4(in_stack_000000f0,in_stack_000000e8,1);
    }
    func_0x0020848c(&uStack0000000000000050);
    if (uStack00000000000000a0 == -0x7ffffffffffffffe) {
      in_stack_00000040._4_4_ = 1;
    }
    if ((in_stack_00000040._4_4_ & 1) == 0) {
      func_0x00208e34(&uStack00000000000000a0);
    }
    if ((((bVar1 ^ 1) & 1) == 0) || (in_stack_00000088 == -0x8000000000000000)) goto LAB_00214de4;
    lVar4 = in_stack_00000098 + 1;
    lVar5 = in_stack_00000090;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0016af10(lVar5);
      lVar5 = lVar5 + 0x70;
    }
  }
  else {
    func_0x0023554c(auStack_7ffffffe + 0x800004ce,auStack_7ffffffe + 0x8000061e);
    *(undefined1 *)(unaff_x24 + 0x333) = 1;
    func_0x00248970();
    lVar2 = in_stack_00000098;
    lVar5 = in_stack_00000090;
    lVar4 = in_stack_00000088;
    if (*(char *)(*(long *)(unaff_x22 + 8) + 0x20) == '\x04') {
      func_0x00248ae4();
      *(undefined1 *)(unaff_x24 + 0x335) = 1;
      unaff_x21[2] = lVar5;
      unaff_x21[1] = lVar4;
      unaff_x21[3] = lVar2;
      *unaff_x21 = -0x7fffffffffffffe7;
      func_0x00209afc(auStack_7ffffffe + 0x800004ce);
      goto code_r0x002149f0;
    }
    lVar4 = *uStack0000000000000100;
    *uStack0000000000000100 = lVar4 + 1;
    if ((lVar4 < 0) ||
       (lVar4 = *(long *)uStack0000000000000100[0x1d],
       *(long *)uStack0000000000000100[0x1d] = lVar4 + 1, lVar4 < 0)) {
code_r0x00214fe4:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x214fe8);
      (*pcVar3)();
    }
    if ((*(byte *)(unaff_x24 + 0x339) & 1) == 0) {
      lVar4 = func_0x00187bd0(0x168,8);
      if (lVar4 == 0) {
        func_0x007a1f18(8,0x168);
        goto code_r0x00214fe4;
      }
      _memcpy(lVar4,auStack_7ffffffe + 0x8000061e,0x168);
      puVar6 = &UNK_009c6910;
    }
    else {
      lVar4 = func_0x00187bd0(0x168,8);
      if (lVar4 == 0) {
        func_0x007a1f18(8,0x168);
        goto code_r0x00214fe4;
      }
      _memcpy(lVar4,auStack_7ffffffe + 0x8000061e,0x168);
      puVar6 = &UNK_009c68c8;
    }
    unaff_x21[1] = lVar4;
    unaff_x21[2] = (long)puVar6;
    *unaff_x21 = unaff_x19 + 0x25;
    func_0x00240a1c(auStack_7ffffffe + 0x8000047e);
    func_0x00240a1c(auStack_7ffffffe + 0x8000023e);
    lVar4 = *uStack0000000000000100;
    *uStack0000000000000100 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9b44(&uStack0000000000000100);
    }
    if ((in_stack_00000038 == -0x7ffffffffffffffe) &&
       (uStack00000000000000a0 != -0x7ffffffffffffffe)) {
      func_0x00208e34(&uStack00000000000000a0);
    }
    if (in_stack_00000088 == -0x8000000000000000) goto LAB_00214de4;
    lVar4 = in_stack_00000098 + 1;
    lVar5 = in_stack_00000090;
    while (lVar4 = lVar4 + -1, lVar4 != 0) {
      func_0x0016af10(lVar5);
      lVar5 = lVar5 + 0x70;
    }
  }
  if (in_stack_00000088 != 0) {
    func_0x00187bd4(in_stack_00000090,in_stack_00000088 * 0x70,8);
  }
LAB_00214de4:
  func_0x002087e4();
  func_0x00187bd4(in_stack_00000048,0x1a8,8);
  return;
}

