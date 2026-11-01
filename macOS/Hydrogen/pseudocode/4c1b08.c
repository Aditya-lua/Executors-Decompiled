
undefined8
FUN_004c1b08(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],long param_4)

{
  code *pcVar1;
  long lVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  ulong in_x10;
  long unaff_x19;
  long unaff_x20;
  undefined8 *unaff_x21;
  long lVar6;
  ulong unaff_x22;
  long unaff_x24;
  long *unaff_x25;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined4 in_stack_000000a0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000118;
  long in_stack_00000120;
  undefined8 in_stack_00000128;
  long in_stack_000001f0;
  long in_stack_000001f8;
  long in_stack_00000200;
  long in_stack_00000548;
  long in_stack_00000670;
  long in_stack_00000678;
  long in_stack_00000680;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  *(long *)(unaff_x20 + 0x68) = param_2._8_8_;
  *(long *)(unaff_x20 + 0x60) = param_2._0_8_;
  *(long *)(unaff_x20 + 0x78) = param_3._8_8_;
  *(long *)(unaff_x20 + 0x70) = param_3._0_8_;
  *(long *)(unaff_x20 + 0x58) = param_1._8_8_;
  *(long *)(unaff_x20 + 0x50) = param_1._0_8_;
  uVar5 = *(undefined8 *)(param_4 + 0x90);
  uVar4 = *(undefined8 *)(param_4 + 0x88);
  uVar8 = *(undefined8 *)(param_4 + 0xa0);
  uVar7 = *(undefined8 *)(param_4 + 0x98);
  uVar9 = *(undefined8 *)(param_4 + 0xa8);
  uVar11 = *(undefined8 *)(param_4 + 0xc0);
  uVar10 = *(undefined8 *)(param_4 + 0xb8);
  *(undefined8 *)(unaff_x20 + 0xa8) = *(undefined8 *)(param_4 + 0xb0);
  *(undefined8 *)(unaff_x20 + 0xa0) = uVar9;
  *(undefined8 *)(unaff_x20 + 0xb8) = uVar11;
  *(undefined8 *)(unaff_x20 + 0xb0) = uVar10;
  *(undefined8 *)(unaff_x20 + 0x88) = uVar5;
  *(undefined8 *)(unaff_x20 + 0x80) = uVar4;
  *(undefined8 *)(unaff_x20 + 0x98) = uVar8;
  *(undefined8 *)(unaff_x20 + 0x90) = uVar7;
  uVar5 = *(undefined8 *)(param_4 + 0xd0);
  uVar4 = *(undefined8 *)(param_4 + 200);
  uVar8 = *(undefined8 *)(param_4 + 0xe0);
  uVar7 = *(undefined8 *)(param_4 + 0xd8);
  uVar9 = *(undefined8 *)(param_4 + 0xe8);
  uVar11 = *(undefined8 *)(param_4 + 0x100);
  uVar10 = *(undefined8 *)(param_4 + 0xf8);
  *(undefined8 *)(unaff_x20 + 0xe8) = *(undefined8 *)(param_4 + 0xf0);
  *(undefined8 *)(unaff_x20 + 0xe0) = uVar9;
  *(undefined8 *)(unaff_x20 + 0xf8) = uVar11;
  *(undefined8 *)(unaff_x20 + 0xf0) = uVar10;
  *(undefined8 *)(unaff_x20 + 200) = uVar5;
  *(undefined8 *)(unaff_x20 + 0xc0) = uVar4;
  *(undefined8 *)(unaff_x20 + 0xd8) = uVar8;
  *(undefined8 *)(unaff_x20 + 0xd0) = uVar7;
  _memmove(param_4,param_4 + 0x108,(unaff_x24 + ~in_x10) * 0x108);
  unaff_x25[2] = unaff_x24 + -1;
  if (unaff_x19 != 0x18) {
    uVar4 = *(undefined8 *)(unaff_x20 + 0x350);
    unaff_x21[1] = *(undefined8 *)(unaff_x20 + 0x358);
    *unaff_x21 = uVar4;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x1a0);
    uVar7 = *(undefined8 *)(unaff_x20 + 0x1b8);
    uVar5 = *(undefined8 *)(unaff_x20 + 0x1b0);
    unaff_x21[0x27] = *(undefined8 *)(unaff_x20 + 0x1a8);
    unaff_x21[0x26] = uVar4;
    unaff_x21[0x29] = uVar7;
    unaff_x21[0x28] = uVar5;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x1c0);
    unaff_x21[0x2b] = *(undefined8 *)(unaff_x20 + 0x1c8);
    unaff_x21[0x2a] = uVar4;
    uVar5 = *(undefined8 *)(unaff_x20 + 0xe8);
    uVar4 = *(undefined8 *)(unaff_x20 + 0xe0);
    uVar7 = *(undefined8 *)(unaff_x20 + 0xf0);
    unaff_x21[0x20] = *(undefined8 *)(unaff_x20 + 0xf8);
    unaff_x21[0x1f] = uVar7;
    uVar8 = *(undefined8 *)(unaff_x20 + 0xd8);
    uVar7 = *(undefined8 *)(unaff_x20 + 0xd0);
    unaff_x21[0x1e] = uVar5;
    unaff_x21[0x1d] = uVar4;
    unaff_x21[0x1c] = uVar8;
    unaff_x21[0x1b] = uVar7;
    uVar7 = *(undefined8 *)(unaff_x20 + 0xb8);
    uVar5 = *(undefined8 *)(unaff_x20 + 0xb0);
    uVar4 = *(undefined8 *)(unaff_x20 + 0xc0);
    unaff_x21[0x1a] = *(undefined8 *)(unaff_x20 + 200);
    unaff_x21[0x19] = uVar4;
    unaff_x21[0x18] = uVar7;
    unaff_x21[0x17] = uVar5;
    uVar7 = *(undefined8 *)(unaff_x20 + 0x98);
    uVar5 = *(undefined8 *)(unaff_x20 + 0x90);
    uVar4 = *(undefined8 *)(unaff_x20 + 0xa0);
    unaff_x21[0x16] = *(undefined8 *)(unaff_x20 + 0xa8);
    unaff_x21[0x15] = uVar4;
    unaff_x21[0x14] = uVar7;
    unaff_x21[0x13] = uVar5;
    uVar8 = *(undefined8 *)(unaff_x20 + 0x78);
    uVar7 = *(undefined8 *)(unaff_x20 + 0x70);
    uVar4 = *(undefined8 *)(unaff_x20 + 0x80);
    unaff_x21[0x12] = *(undefined8 *)(unaff_x20 + 0x88);
    unaff_x21[0x11] = uVar4;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x50);
    uVar10 = *(undefined8 *)(unaff_x20 + 0x68);
    uVar9 = *(undefined8 *)(unaff_x20 + 0x60);
    unaff_x21[0xc] = *(undefined8 *)(unaff_x20 + 0x58);
    unaff_x21[0xb] = uVar4;
    uVar4 = *(undefined8 *)(unaff_x20 + 0x360);
    uVar5 = *(undefined8 *)(unaff_x20 + 0x1d0);
    unaff_x21[0x2c] = uVar5;
    unaff_x21[0xe] = uVar10;
    unaff_x21[0xd] = uVar9;
    unaff_x21[0x10] = uVar8;
    unaff_x21[0xf] = uVar7;
    unaff_x21[2] = uVar4;
    unaff_x21[3] = unaff_x19;
    unaff_x21[5] = unaff_x21[0x27];
    unaff_x21[4] = unaff_x21[0x26];
    unaff_x21[7] = unaff_x21[0x29];
    unaff_x21[6] = unaff_x21[0x28];
    unaff_x21[9] = unaff_x21[0x2b];
    unaff_x21[8] = unaff_x21[0x2a];
    unaff_x21[10] = uVar5;
    func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6750);
LAB_004c5940:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
    (*pcVar1)();
  }
  uVar8 = *(undefined8 *)(unaff_x20 + 0x1b8);
  uVar7 = *(undefined8 *)(unaff_x20 + 0x1b0);
  uVar5 = *(undefined8 *)(unaff_x20 + 0x1c8);
  uVar4 = *(undefined8 *)(unaff_x20 + 0x1c0);
  unaff_x21[0x2b] = uVar5;
  unaff_x21[0x2a] = uVar4;
  *(undefined8 *)(unaff_x20 + 0x58) = *(undefined8 *)(unaff_x20 + 0x1a8);
  *(undefined8 *)(unaff_x20 + 0x50) = *(undefined8 *)(unaff_x20 + 0x1a0);
  *(undefined8 *)(unaff_x20 + 0x68) = uVar8;
  *(undefined8 *)(unaff_x20 + 0x60) = uVar7;
  *(undefined8 *)(unaff_x20 + 0x78) = uVar5;
  *(undefined8 *)(unaff_x20 + 0x70) = uVar4;
  *(undefined8 *)(unaff_x20 + 0x80) = *(undefined8 *)(unaff_x20 + 0x1d0);
  func_0x004d050c(auStack_7ffffffe + 0x8000033e,*(long *)(unaff_x20 + 0x2f8),
                  *(long *)(unaff_x20 + 0x2f8) + *(long *)(unaff_x20 + 0x300) * 0x18,&UNK_009e5910);
  func_0x005dc404(auStack_7ffffffe + 0x8000066e,auStack_7ffffffe + 0x8000033e,
                  auStack_7ffffffe + 0x80000206,auStack_7ffffffe + 0x8000031e);
  lVar6 = in_stack_00000200 + 1;
  lVar2 = in_stack_000001f8;
  while (lVar6 = lVar6 + -1, lVar6 != 0) {
    func_0x004ca5dc(lVar2);
    lVar2 = lVar2 + 0x18;
  }
  if (in_stack_000001f0 != 0) {
    func_0x00187bd4(in_stack_000001f8,in_stack_000001f0 * 0x18,8);
  }
  func_0x004bc780(auStack_7ffffffe + 0x8000040e);
  lVar6 = unaff_x25[2];
  if (lVar6 == *unaff_x25) {
    func_0x005bd0a4();
  }
  _memcpy(unaff_x25[1] + lVar6 * 0x108,auStack_7ffffffe + 0x8000066e,0x108);
  unaff_x25[2] = lVar6 + 1;
  func_0x00584fc4(auStack_7ffffffe + 0x8000066e,in_stack_000000f8,in_stack_00000118._4_4_);
  if (in_stack_00000670 != -0x8000000000000000) {
    lVar6 = in_stack_00000680 + 1;
    lVar2 = in_stack_00000678;
    while (lVar6 = lVar6 + -1, lVar6 != 0) {
      func_0x004caae8(lVar2);
      lVar2 = lVar2 + 0x108;
    }
    if (in_stack_00000670 != 0) {
      func_0x00187bd4(in_stack_00000678,in_stack_00000670 * 0x108,8);
    }
  }
  if ((unaff_x22 & 1) == 0) {
    func_0x0058497c(auStack_7ffffffe + 0x8000066e,in_stack_000000f8);
    func_0x004ce364(auStack_7ffffffe + 0x8000066e);
    if (in_stack_00000670 == 0) goto code_r0x004c20a4;
  }
  else {
    puVar3 = (undefined4 *)func_0x00187bd0(0x28,8);
    if (puVar3 == (undefined4 *)0x0) {
      func_0x007a1f18(8,0x28);
      goto LAB_004c5940;
    }
    *puVar3 = in_stack_000000a0;
    *(undefined8 *)(puVar3 + 2) = 0;
    *(undefined8 *)(puVar3 + 4) = 8;
    *(undefined8 *)(puVar3 + 6) = 0;
    *(undefined1 *)(puVar3 + 8) = 0;
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

