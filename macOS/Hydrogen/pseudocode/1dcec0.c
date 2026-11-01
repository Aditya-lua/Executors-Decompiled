
void FUN_001dcec0(undefined8 *param_1)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  long lVar4;
  undefined *puVar5;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  uint unaff_w26;
  long in_stack_00000008;
  long in_stack_00000028;
  undefined8 *in_stack_00000030;
  long *in_stack_00000048;
  uint in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack00000000000001c0;
  undefined1 uStack00000000000001c8;
  undefined8 in_stack_000002b0;
  undefined8 in_stack_000002b8;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00248ae4(*param_1,auStack_7ffffffe + 0x8000042e,0);
  if (unaff_x22 == 0) {
    uVar2 = 0;
    if (in_stack_00000068 == 0) {
      uVar2 = in_stack_00000058;
    }
  }
  else {
    *(undefined8 *)(unaff_x21 + 0x10) = in_stack_000002b8;
    *(undefined8 *)(unaff_x21 + 8) = in_stack_000002b0;
    if (*(byte *)(*(long *)(in_stack_00000060 + 8) + 0x18) - 1 < 2) {
      func_0x0020f000(*(long *)(*(long *)(unaff_x23 + 0x118) + 0x110) +
                      (*(long *)(*(long *)(*(long *)(unaff_x23 + 0x118) + 0x118) + 0x10) - 1U &
                      0xfffffffffffffff0) + 0x10);
    }
    uVar2 = 0;
    if (in_stack_00000068 == 0) {
      uVar2 = in_stack_00000058;
    }
  }
  if ((uVar2 & 1) == 0) {
    _memcpy(auStack_7ffffffe + 0x8000043e);
    lVar4 = func_0x00187bd0(0x2b8,8);
    if (lVar4 == 0) {
      func_0x007a1f18(8,0x2b8);
      goto LAB_001dd404;
    }
    _memcpy(lVar4,auStack_7ffffffe + 0x8000042e,0x2b8);
    puVar5 = &UNK_009c34b8;
  }
  else {
    _memcpy(auStack_7ffffffe + 0x8000043e);
    lVar4 = func_0x00187bd0(0x2d0,8);
    if (lVar4 == 0) {
      func_0x007a1f18(8,0x2d0);
LAB_001dd404:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x1dd408);
      (*pcVar3)();
    }
    _memcpy(lVar4,auStack_7ffffffe + 0x8000042e,0x2d0);
    puVar5 = &UNK_009c3500;
  }
  in_stack_00000030[1] = lVar4;
  in_stack_00000030[2] = puVar5;
  *in_stack_00000030 = 0x8000000000000027;
  uVar1 = 0;
  if (uStack00000000000001c0 != -0x7fffffffffffffe7) {
    uVar1 = unaff_w26;
  }
  if ((uVar1 & 1) != 0) {
    if (uStack00000000000001c0 == -0x7fffffffffffffe8) {
      func_0x001d4a90(&uStack00000000000001c8);
    }
    else {
      func_0x001d5248(&uStack00000000000001c0);
    }
  }
  if ((uVar2 & 1) == 0) {
    in_stack_00000008 = in_stack_00000008 + 1;
    lVar4 = in_stack_00000028;
    while (in_stack_00000008 = in_stack_00000008 + -1, in_stack_00000008 != 0) {
      func_0x001a09ec(lVar4);
      lVar4 = lVar4 + 0x40;
    }
    if (*in_stack_00000048 != 0) {
      func_0x00187bd4(in_stack_00000028,*in_stack_00000048 << 6,8);
    }
  }
  return;
}

