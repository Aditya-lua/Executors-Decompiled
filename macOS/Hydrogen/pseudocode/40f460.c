
void FUN_0040f460(void)

{
  undefined4 uVar1;
  uint6 uVar2;
  code *pcVar3;
  ulong uVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 *unaff_x19;
  ulong *unaff_x20;
  long unaff_x21;
  ulong *puVar7;
  undefined8 unaff_x22;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x26;
  long lVar10;
  undefined8 unaff_x28;
  ulong uVar11;
  long unaff_x29;
  undefined8 uVar12;
  undefined8 in_stack_000000d8;
  ulong in_stack_000000e8;
  ulong in_stack_000000f0;
  ulong in_stack_00000100;
  undefined1 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000150;
  
  *(undefined8 *)(unaff_x29 + -0xe0) = 0;
  *(undefined8 *)(unaff_x29 + -0xd8) = 8;
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  *(undefined8 *)(unaff_x29 + -200) = 0;
  *(undefined8 *)(unaff_x29 + -0xc0) = 8;
  *(undefined8 *)(unaff_x29 + -0xb8) = 0;
  *(undefined1 *)(unaff_x29 + -0x70) = in_stack_00000108;
  *(undefined8 *)(unaff_x29 + -0x90) = in_stack_00000150;
  *(undefined8 *)(unaff_x29 + -0x88) = unaff_x28;
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x78) = in_stack_000000d8;
  func_0x0041032c(unaff_x29 + -0x100,unaff_x29 + -0xe0,0,0);
  uVar9 = (ulong)*(byte *)(unaff_x29 + -0x100);
  if (*(byte *)(unaff_x29 + -0x100) == 0x4f) {
    uVar9 = *(ulong *)(unaff_x29 + -0xb8);
    if (1 < uVar9) {
      if (uVar9 < 0x15) {
        func_0x003f96f8();
      }
      else {
        func_0x003f9f60(*(undefined8 *)(unaff_x29 + -0xc0),uVar9,unaff_x29 + -0x100);
      }
    }
    uVar4 = *(ulong *)(unaff_x29 + -0xd8);
    uVar9 = *(ulong *)(unaff_x29 + -0xd0);
    if (uVar9 < *(ulong *)(unaff_x29 + -0xe0)) {
      lVar10 = *(ulong *)(unaff_x29 + -0xe0) * 0x30;
      if (uVar9 == 0) {
        _in_stack_00000108 = 8;
        func_0x00187bd4(uVar4,lVar10,8);
      }
      else {
        _in_stack_00000108 = func_0x00187bd8(uVar4,lVar10,8,uVar9 * 0x30);
        if (_in_stack_00000108 == 0) {
          func_0x007a1f00(8,uVar9 * 0x30,&UNK_009d9e28);
          goto LAB_0040f7c8;
        }
      }
    }
    else {
      _in_stack_00000108 = uVar4;
    }
    uVar4 = *(ulong *)(unaff_x29 + -0xc0);
    in_stack_000000e8 = *(ulong *)(unaff_x29 + -0xb8);
    if (in_stack_000000e8 < *(ulong *)(unaff_x29 + -200)) {
      lVar10 = *(ulong *)(unaff_x29 + -200) << 5;
      if (in_stack_000000e8 == 0) {
        func_0x00187bd4(uVar4,lVar10,8);
        uVar4 = 8;
      }
      else {
        uVar4 = func_0x00187bd8(uVar4,lVar10,8,in_stack_000000e8 << 5);
        if (uVar4 == 0) {
          func_0x007a1f00(8,in_stack_000000e8 << 5,&UNK_009d9e40);
LAB_0040f7c8:
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x40f7cc);
          (*pcVar3)();
        }
      }
    }
    uVar11 = uVar9 >> 8;
    uVar8 = uVar9 >> 0x10;
  }
  else {
    uVar11 = (ulong)*(byte *)(unaff_x29 + -0xff);
    uVar2 = *(uint6 *)(unaff_x29 + -0xfe);
    unaff_x26 = (ulong)*(uint *)(unaff_x29 + -0xfe);
    uVar4 = *(ulong *)(unaff_x29 + -0xf8);
    if (*(long *)(unaff_x29 + -0xe0) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) * 0x30,8);
    }
    uVar8 = (ulong)uVar2;
    if (*(long *)(unaff_x29 + -200) != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xc0),*(long *)(unaff_x29 + -200) << 5,8);
    }
    _in_stack_00000108 = 0;
  }
  uVar9 = uVar8 << 0x10 | (uVar11 & 0xff) << 8 | uVar9 & 0xff;
  if ((*unaff_x20 & 1) == 0) {
    if ((*unaff_x20 != 0) && (unaff_x20[1] != 0)) {
      if (unaff_x20[2] != 0) {
        func_0x00187bd4(unaff_x20[1],unaff_x20[2] * 0x30,8);
      }
      if (unaff_x20[4] != 0) {
        func_0x00187bd4(unaff_x20[3],unaff_x20[4] << 5,8);
      }
    }
    *unaff_x20 = 1;
    unaff_x20[1] = _in_stack_00000108;
    unaff_x20[2] = uVar9;
    unaff_x20[3] = uVar4;
    unaff_x20[4] = in_stack_000000e8;
    unaff_x20[5] = in_stack_000000f0;
    unaff_x20[6] = unaff_x26;
    unaff_x20[7] = in_stack_00000100;
  }
  else if (_in_stack_00000108 != 0) {
    if (uVar9 != 0) {
      func_0x00187bd4(_in_stack_00000108,uVar9 * 0x30,8);
    }
    if (in_stack_000000e8 != 0) {
      func_0x00187bd4(uVar4,in_stack_000000e8 << 5,8);
    }
  }
  puVar7 = unaff_x20 + 1;
  if (*puVar7 == 0) {
    uVar9 = unaff_x20[2];
    puVar7 = (ulong *)unaff_x20[3];
    if ((char)uVar9 != 'O') {
      *(undefined4 *)((long)unaff_x19 + 0x11) = *(undefined4 *)((long)unaff_x20 + 0x11);
      *(undefined4 *)((long)unaff_x19 + 0x14) = *(undefined4 *)((long)unaff_x20 + 0x14);
      *(char *)(unaff_x19 + 2) = (char)uVar9;
      unaff_x19[3] = puVar7;
      goto code_r0x0040f1ec;
    }
  }
  if (*(long *)(unaff_x21 + 0x60) == 0x2f) {
    iVar5 = 2;
code_r0x0040f154:
    uVar12 = *(undefined8 *)(unaff_x29 + -0xdc);
    uVar1 = *(undefined4 *)(unaff_x29 + -0xcc);
    uVar6 = *(undefined8 *)(unaff_x29 + -200);
    *(undefined8 *)((long)unaff_x19 + 0x14) = *(undefined8 *)(unaff_x29 + -0xd4);
    *(undefined8 *)((long)unaff_x19 + 0xc) = uVar12;
    *(undefined4 *)((long)unaff_x19 + 0x1c) = uVar1;
    *unaff_x19 = puVar7;
    *(int *)(unaff_x19 + 1) = iVar5;
    unaff_x19[4] = uVar6;
    return;
  }
  func_0x0040c500(unaff_x29 + -0x100,unaff_x21 + 0x1c8,in_stack_00000110);
  if (*(char *)(unaff_x29 + -0x100) == 'O') {
    func_0x004435e0(unaff_x29 + -0xe0,*(undefined8 *)(unaff_x29 + -0xf8));
    iVar5 = *(int *)(unaff_x29 + -0xe0);
    if (iVar5 != 3) goto code_r0x0040f154;
  }
  else {
    *(undefined4 *)(unaff_x29 + -0xd7) = *(undefined4 *)(unaff_x29 + -0xff);
    *(undefined4 *)(unaff_x29 + -0xd4) = *(undefined4 *)(unaff_x29 + -0xfc);
    *(char *)(unaff_x29 + -0xd8) = *(char *)(unaff_x29 + -0x100);
    *(undefined8 *)(unaff_x29 + -0xd0) = *(undefined8 *)(unaff_x29 + -0xf8);
  }
  uVar6 = *(undefined8 *)(unaff_x29 + -0xd8);
  unaff_x19[3] = *(undefined8 *)(unaff_x29 + -0xd0);
  unaff_x19[2] = uVar6;
code_r0x0040f1ec:
  *(undefined4 *)(unaff_x19 + 1) = 3;
  return;
}

