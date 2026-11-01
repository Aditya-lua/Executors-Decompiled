
undefined8 FUN_004c1e14(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  undefined4 *puVar4;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x23;
  long *unaff_x25;
  long unaff_x29;
  undefined4 in_stack_000000a0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001f0;
  long in_stack_000001f8;
  long in_stack_00000548;
  long in_stack_00000670;
  long in_stack_00000678;
  long in_stack_00000680;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  if (*(long *)(unaff_x20 + 0x2f0) != -0x8000000000000000) {
    func_0x007a23bc(&UNK_009e6720);
LAB_004c5940:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  lVar2 = **(long **)(unaff_x20 + 0x2f8);
  **(long **)(unaff_x20 + 0x2f8) = lVar2 + 1;
  if (lVar2 < 0) {
    func_0x007a05dc();
    goto LAB_004c5940;
  }
  func_0x005db1b4(&stack0x000001f0,auStack_7ffffffe + 0x800004ee,unaff_x29 + -0xd0,
                  auStack_7ffffffe + 0x8000033e,*(undefined8 *)(unaff_x20 + 0x2f8),
                  auStack_7ffffffe + 0x8000031e);
  *(undefined8 *)(unaff_x20 + 0x248) = *(undefined8 *)(unaff_x20 + 0xf8);
  *(undefined8 *)(unaff_x20 + 0x240) = *(undefined8 *)(unaff_x20 + 0xf0);
  *(undefined8 *)(unaff_x20 + 600) = *(undefined8 *)(unaff_x20 + 0x108);
  *(undefined8 *)(unaff_x20 + 0x250) = *(undefined8 *)(unaff_x20 + 0x100);
  *(undefined8 *)(unaff_x20 + 0x268) = *(undefined8 *)(unaff_x20 + 0x118);
  *(undefined8 *)(unaff_x20 + 0x260) = *(undefined8 *)(unaff_x20 + 0x110);
  *(undefined8 *)(unaff_x20 + 0x208) = *(undefined8 *)(unaff_x20 + 0xb8);
  *(undefined8 *)(unaff_x20 + 0x200) = *(undefined8 *)(unaff_x20 + 0xb0);
  *(undefined8 *)(unaff_x20 + 0x218) = *(undefined8 *)(unaff_x20 + 200);
  *(undefined8 *)(unaff_x20 + 0x210) = *(undefined8 *)(unaff_x20 + 0xc0);
  *(undefined8 *)(unaff_x20 + 0x228) = *(undefined8 *)(unaff_x20 + 0xd8);
  *(undefined8 *)(unaff_x20 + 0x220) = *(undefined8 *)(unaff_x20 + 0xd0);
  *(undefined8 *)(unaff_x20 + 0x238) = *(undefined8 *)(unaff_x20 + 0xe8);
  *(undefined8 *)(unaff_x20 + 0x230) = *(undefined8 *)(unaff_x20 + 0xe0);
  *(undefined8 *)(unaff_x20 + 0x1c8) = *(undefined8 *)(unaff_x20 + 0x78);
  *(undefined8 *)(unaff_x20 + 0x1c0) = *(undefined8 *)(unaff_x20 + 0x70);
  *(undefined8 *)(unaff_x20 + 0x1d8) = *(undefined8 *)(unaff_x20 + 0x88);
  *(undefined8 *)(unaff_x20 + 0x1d0) = *(undefined8 *)(unaff_x20 + 0x80);
  *(undefined8 *)(unaff_x20 + 0x1e8) = *(undefined8 *)(unaff_x20 + 0x98);
  *(undefined8 *)(unaff_x20 + 0x1e0) = *(undefined8 *)(unaff_x20 + 0x90);
  *(undefined8 *)(unaff_x20 + 0x1f8) = *(undefined8 *)(unaff_x20 + 0xa8);
  *(undefined8 *)(unaff_x20 + 0x1f0) = *(undefined8 *)(unaff_x20 + 0xa0);
  *(undefined8 *)(unaff_x20 + 0x1a8) = *(undefined8 *)(unaff_x20 + 0x58);
  *(undefined8 *)(unaff_x20 + 0x1a0) = *(undefined8 *)(unaff_x20 + 0x50);
  *(undefined8 *)(unaff_x20 + 0x1b8) = *(undefined8 *)(unaff_x20 + 0x68);
  *(undefined8 *)(unaff_x20 + 0x1b0) = *(undefined8 *)(unaff_x20 + 0x60);
  func_0x004bb3f8(auStack_7ffffffe + 0x8000066e);
  func_0x004bb3f8(unaff_x19 + 0x58);
  func_0x004bb3f8(unaff_x19 + 0xb0);
  func_0x004bc41c(auStack_7ffffffe + 0x8000040e);
  lVar2 = unaff_x25[2];
  if (lVar2 == *unaff_x25) {
    func_0x005bd0a4();
  }
  _memcpy(unaff_x25[1] + lVar2 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  unaff_x25[2] = lVar2 + 1;
  func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
  if (in_stack_00000670 != -0x8000000000000000) {
    lVar2 = in_stack_00000680 + 1;
    lVar3 = in_stack_00000678;
    while (lVar2 = lVar2 + -1, lVar2 != 0) {
      func_0x004caae8(lVar3);
      lVar3 = lVar3 + 0x108;
    }
    if (in_stack_00000670 != 0) {
      func_0x00187bd4(in_stack_00000678,in_stack_00000670 * 0x108,8);
    }
  }
  if ((unaff_x23 & 1) == 0) {
    func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8);
    func_0x004ce364(auStack_7ffffffe + 0x8000066e);
    if (in_stack_00000670 == 0) goto code_r0x004c20a4;
  }
  else {
    puVar4 = (undefined4 *)func_0x00187bd0(0x28,8);
    if (puVar4 == (undefined4 *)0x0) {
      func_0x007a1f18(8,0x28);
      goto LAB_004c5940;
    }
    *puVar4 = in_stack_000000a0;
    *(undefined8 *)(puVar4 + 2) = 0;
    *(undefined8 *)(puVar4 + 4) = 8;
    *(undefined8 *)(puVar4 + 6) = 0;
    *(undefined1 *)(puVar4 + 8) = 0;
    func_0x00584c34(&stack0x000001f0,in_stack_000000f8);
    func_0x004ce364(&stack0x000001f0);
    if (in_stack_000001f0 == 0) goto code_r0x004c20a4;
    in_stack_00000678 = in_stack_000001f8;
    in_stack_00000670 = in_stack_000001f0;
  }
  func_0x00187bd4(in_stack_00000678,in_stack_00000670 * 0x28,8);
code_r0x004c20a4:
  func_0x004bea24(in_stack_000000f8);
  if ((in_stack_00000548 != 0x16) && (in_stack_00000548 != 0x19)) {
    func_0x004bba74(auStack_7ffffffe + 0x8000052e);
  }
  if (in_stack_00000120 != 0) {
    func_0x00187bd4(in_stack_00000128,in_stack_00000120 << 2,4);
  }
  return 1;
}

