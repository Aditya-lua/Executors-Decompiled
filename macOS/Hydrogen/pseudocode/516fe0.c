
long FUN_00516fe0(void)

{
  undefined8 uVar1;
  undefined1 uVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 extraout_x1;
  ulong uVar7;
  ulong *unaff_x20;
  long unaff_x21;
  long *plVar8;
  ulong uVar9;
  long lVar10;
  long unaff_x24;
  long lVar11;
  ulong uVar12;
  undefined8 *unaff_x27;
  long lVar13;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000040;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  ulong in_stack_000000c8;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined1 uStack0000000000000110;
  undefined1 uStack0000000000000111;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  long lStack_188;
  long lStack_180;
  long lStack_178;
  long lStack_170;
  long lStack_168;
  long lStack_160;
  long lStack_158;
  long lStack_150;
  long lStack_148;
  long lStack_140;
  long lStack_138;
  long lStack_130;
  long lStack_128;
  long lStack_120;
  long lStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long lStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  undefined8 *puStack_b0;
  undefined8 *puStack_a8;
  
  do {
    uVar7 = unaff_x20[5];
    uVar12 = uVar7 * 8;
    lVar4 = unaff_x24;
    if (uVar7 >> 0x3d != 0 || 0x7ffffffffffffff8 < uVar12) goto LAB_00517130;
    uVar6 = *unaff_x28;
    uVar1 = unaff_x28[1];
    uVar2 = *(undefined1 *)((long)unaff_x20 + 0x61);
    uVar9 = unaff_x20[4];
    if (uVar12 == 0) {
      in_stack_00000040 = 0;
      lVar4 = 8;
    }
    else {
      lVar4 = func_0x00187bd0(uVar12,8);
      if (lVar4 == 0) goto LAB_00517134;
      in_stack_00000040 = uVar7;
    }
    _memcpy(lVar4,uVar9,uVar12);
    uVar12 = *unaff_x20;
    if ((int)uVar12 == 1) {
      in_stack_00000198 = unaff_x27[1];
      in_stack_00000190 = *unaff_x27;
    }
    else {
      uVar12 = 0;
    }
    func_0x004e2650(unaff_x29 + -0x80,unaff_x20 + 6);
    func_0x004e464c(unaff_x29 + -0xf8,unaff_x20 + 9);
    in_stack_000000c0 = in_stack_00000198;
    in_stack_000000b8 = in_stack_00000190;
    uStack0000000000000110 = (undefined1)unaff_x20[0xc];
    in_stack_000000c8 = in_stack_00000040;
    in_stack_000000e8 = in_stack_000001a8;
    in_stack_000000e0 = in_stack_000001a0;
    in_stack_000000f0 = *(undefined8 *)(unaff_x29 + -0x70);
    in_stack_00000100 = *(undefined8 *)(unaff_x29 + -0xf0);
    in_stack_000000f8 = *(undefined8 *)(unaff_x29 + -0xf8);
    in_stack_00000108 = *(undefined8 *)(unaff_x29 + -0xe8);
    uStack00000000000000b0 = uVar12;
    in_stack_000000d0 = lVar4;
    in_stack_000000d8 = uVar7;
    uStack0000000000000111 = uVar2;
    lVar5 = func_0x00518214(unaff_x29 + -0xf8,in_stack_00000028 + 0x40,uVar6,uVar1,
                            &uStack00000000000000b0);
    if (*(long *)(unaff_x29 + -0xf8) != 2) {
      lVar5 = func_0x00515db4(unaff_x29 + -0xf8);
    }
    unaff_x20 = unaff_x20 + 0xd;
    unaff_x27 = unaff_x27 + 0xd;
    unaff_x21 = unaff_x21 + -0x68;
    unaff_x28 = unaff_x28 + 2;
    if (unaff_x28 == in_stack_00000020) {
      return lVar5;
    }
    unaff_x24 = lVar4;
  } while (unaff_x21 != 0);
  func_0x007a23bc(&UNK_009e9c10);
LAB_00517130:
  in_stack_00000018 = 0;
  unaff_x24 = lVar4;
LAB_00517134:
  func_0x007a1f00(in_stack_00000018,uVar12,&UNK_009e7fe0);
  func_0x007a2570(unaff_x27,extraout_x1,&UNK_009e9b68);
  uVar6 = func_0x007a1f00(0,unaff_x28,&UNK_009e7fe0);
  func_0x004eabac(&uStack00000000000000b0);
  uVar6 = __Unwind_Resume(uVar6);
  func_0x00515c40(&uStack00000000000000b0);
  __Unwind_Resume(uVar6);
  func_0x00187bd4(unaff_x24,in_stack_00000040 << 3,8);
  __Unwind_Resume(uVar6);
  auVar14 = func_0x007a2668();
  lVar4 = auVar14._0_8_;
  if (*(long *)(lVar4 + 0x50) != 0) {
    lVar10 = 0;
    uVar7 = 0;
    uVar6 = *auVar14._8_8_;
    lVar5 = auVar14._8_8_[1];
    lVar11 = *(long *)(lVar4 + 0x50) << 4;
    plVar8 = (long *)(*(long *)(lVar4 + 0x48) + 8);
    do {
      if ((*plVar8 == lVar5) && (iVar3 = _memcmp(plVar8[-1],uVar6,lVar5), iVar3 == 0)) {
        if (uVar7 < *(ulong *)(lVar4 + 0x68)) {
          return *(long *)(lVar4 + 0x60) - lVar10;
        }
        auVar14 = func_0x007a2570(uVar7,*(ulong *)(lVar4 + 0x68),&UNK_009e9b68);
        lVar4 = auVar14._0_8_;
        uVar7 = *(ulong *)(lVar4 + 0x50);
        if (uVar7 == 0) {
          return 0;
        }
        lVar10 = 0;
        lVar5 = 0;
        uVar12 = 0;
        lVar13 = *(long *)(lVar4 + 0x48);
        uVar6 = *auVar14._8_8_;
        lVar11 = auVar14._8_8_[1];
        puStack_b0 = unaff_x28;
        puStack_a8 = unaff_x27;
        while ((*(long *)(lVar13 + lVar5 + 8) != lVar11 ||
               (iVar3 = _memcmp(*(undefined8 *)(lVar13 + lVar5),uVar6,lVar11), iVar3 != 0))) {
          uVar12 = uVar12 + 1;
          lVar5 = lVar5 + 0x10;
          lVar10 = lVar10 + 0x68;
          if (uVar7 * 0x10 == lVar5) {
            return 0;
          }
        }
        if (uVar12 < uVar7) {
          _memmove(lVar13 + lVar5,lVar13 + lVar5 + 0x10,(uVar7 * 0x10 - lVar5) + -0x10);
          *(ulong *)(lVar4 + 0x50) = uVar7 - 1;
          uVar7 = *(ulong *)(lVar4 + 0x68);
          if (uVar12 <= uVar7 && uVar7 - uVar12 != 0) {
            plVar8 = (long *)(*(long *)(lVar4 + 0x60) + lVar10);
            lVar5 = *plVar8;
            lStack_f8 = plVar8[6];
            lStack_100 = plVar8[5];
            lStack_e8 = plVar8[8];
            lStack_f0 = plVar8[7];
            lStack_d8 = plVar8[10];
            lStack_e0 = plVar8[9];
            lStack_c8 = plVar8[0xc];
            lStack_d0 = plVar8[0xb];
            lStack_118 = plVar8[2];
            lStack_120 = plVar8[1];
            lStack_108 = plVar8[4];
            lStack_110 = plVar8[3];
            _memmove(plVar8,plVar8 + 0xd,(uVar7 - uVar12) * 0x68 + -0x68);
            *(ulong *)(lVar4 + 0x68) = uVar7 - 1;
            if (lVar5 == 2) {
              return 0;
            }
            lStack_158 = lStack_f8;
            lStack_160 = lStack_100;
            lStack_148 = lStack_e8;
            lStack_150 = lStack_f0;
            lStack_138 = lStack_d8;
            lStack_140 = lStack_e0;
            lStack_128 = lStack_c8;
            lStack_130 = lStack_d0;
            lStack_178 = lStack_118;
            lStack_180 = lStack_120;
            lStack_168 = lStack_108;
            lStack_170 = lStack_110;
            lStack_188 = lVar5;
            func_0x00515db4(&lStack_188);
            return 1;
          }
        }
        else {
          func_0x007a2080(uVar12,uVar7,&UNK_009e9b38);
        }
        auVar14 = func_0x007a2080(uVar12,uVar7,&UNK_009e9b50);
        lVar4 = *(long *)(auVar14._0_8_ + 0x50);
        if (lVar4 == 0) {
          return 0;
        }
        uVar6 = *auVar14._8_8_;
        lVar5 = auVar14._8_8_[1];
        plVar8 = (long *)(*(long *)(auVar14._0_8_ + 0x48) + 8);
        lVar4 = lVar4 << 4;
        while ((*plVar8 != lVar5 || (iVar3 = _memcmp(plVar8[-1],uVar6,lVar5), iVar3 != 0))) {
          plVar8 = plVar8 + 2;
          lVar4 = lVar4 + -0x10;
          if (lVar4 == 0) {
            return 0;
          }
        }
        return 1;
      }
      lVar10 = lVar10 + -0x68;
      uVar7 = uVar7 + 1;
      lVar11 = lVar11 + -0x10;
      plVar8 = plVar8 + 2;
    } while (lVar11 != 0);
  }
  return 0;
}

