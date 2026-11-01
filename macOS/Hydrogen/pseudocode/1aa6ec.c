
void FUN_001aa6ec(long param_1)

{
  uint uVar1;
  code *pcVar2;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong uVar3;
  uint unaff_w22;
  long unaff_x23;
  long lVar4;
  long unaff_x24;
  ulong unaff_x25;
  ushort uVar5;
  ushort unaff_w26;
  int unaff_w27;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
code_r0x001aa6ec:
  uVar3 = unaff_x21;
  lVar4 = unaff_x23;
  if (unaff_x24 == param_1) goto LAB_001aa754;
LAB_001aa764:
  uVar5 = (ushort)(unaff_w22 >> 8) & 0xff | (ushort)((unaff_w22 & 0xff00ff) << 8);
  ((ushort *)(in_stack_00000010 + unaff_x28))[-1] = unaff_w26;
  *(ushort *)(in_stack_00000010 + unaff_x28) = uVar5;
  unaff_x24 = unaff_x24 + 1;
  if (unaff_x20 <= uVar3) {
    unaff_x19[2] = in_stack_00000010;
    unaff_x19[1] = uStack0000000000000008;
    unaff_x19[3] = unaff_x24;
    *unaff_x19 = 0;
    return;
  }
  unaff_x28 = unaff_x28 + 4;
  unaff_x23 = lVar4 + 2;
  unaff_x21 = uVar3 + 2;
  in_stack_00000018 = unaff_x24;
  if (unaff_x25 < uVar3) {
    unaff_x19[2] = &UNK_00822043;
    unaff_x19[3] = 0xf;
    *(undefined1 *)(unaff_x19 + 1) = 0xc;
    *(ushort *)((long)unaff_x19 + 10) = unaff_w26;
    *(ushort *)((long)unaff_x19 + 0xc) = uVar5;
    *unaff_x19 = 1;
    if (uStack0000000000000008 == 0) {
      return;
    }
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008 << 2,2);
    return;
  }
  if (unaff_x20 < unaff_x21) {
    func_0x007a28b0(unaff_x21);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x1aa848);
    (*pcVar2)();
  }
  uVar5 = *(ushort *)(lVar4 + 3);
  unaff_w22 = (uint)uVar5;
  uVar1 = (uint)(uVar5 >> 8) | (uVar5 & 0xff00ff) << 8;
  unaff_w26 = 9;
  if (uVar1 < 0x303) {
    if (0x300 < uVar1) goto code_r0x001aa6d0;
    if (uVar1 == 2) {
      unaff_w26 = 0;
    }
    else {
      unaff_w26 = 1;
      if (uVar1 != 0x300) {
        unaff_w26 = 9;
      }
    }
  }
  else if (unaff_w27 < (int)uVar1) {
    if (uVar1 == 0xfefc) {
      unaff_w26 = 8;
    }
    else if (uVar1 == 0xfefd) {
      unaff_w26 = 7;
    }
    else if (uVar1 == 0xfeff) {
      unaff_w26 = 6;
    }
  }
  else if (uVar1 == 0x303) {
    unaff_w26 = 4;
  }
  else {
    unaff_w26 = 5;
    if (uVar1 != 0x304) {
      unaff_w26 = 9;
    }
  }
  uVar3 = unaff_x21;
  lVar4 = unaff_x23;
  if (unaff_x24 == uStack0000000000000008) {
LAB_001aa754:
    func_0x001d8d34(&uStack0000000000000008,&UNK_009c24d8);
    uVar3 = unaff_x21;
    lVar4 = unaff_x23;
  }
  goto LAB_001aa764;
code_r0x001aa6d0:
  uVar5 = 3;
  if (uVar1 != 0x302) {
    uVar5 = 9;
  }
  unaff_w26 = 2;
  if (uVar1 != 0x301) {
    unaff_w26 = uVar5;
  }
  param_1 = uStack0000000000000008;
  goto code_r0x001aa6ec;
}

