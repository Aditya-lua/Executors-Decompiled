
long FUN_00516d40(ulong *param_1)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  undefined1 in_ZR;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  ulong *puVar8;
  ulong *extraout_x1;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  long *unaff_x19;
  long lVar15;
  ulong *unaff_x20;
  undefined8 *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *unaff_x21;
  ulong uVar19;
  long *plVar20;
  ulong unaff_x22;
  ulong *unaff_x23;
  long lVar21;
  long unaff_x24;
  long lVar22;
  ulong unaff_x25;
  long lVar23;
  undefined *unaff_x26;
  long lVar24;
  ulong *unaff_x27;
  long lVar25;
  ulong *unaff_x28;
  long unaff_x29;
  undefined1 auVar26 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 *in_stack_00000030;
  ulong *in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  ulong *in_stack_00000060;
  long in_stack_00000068;
  ulong *in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  ulong in_stack_00000090;
  ulong in_stack_00000098;
  ulong in_stack_000000a0;
  undefined1 uStack00000000000000a8;
  byte bStack00000000000000a9;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  ulong in_stack_000000c8;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  ulong in_stack_00000190;
  ulong in_stack_00000198;
  long in_stack_000001a0;
  long in_stack_000001a8;
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
  ulong *puStack_b0;
  ulong *puStack_a8;
  undefined *puStack_a0;
  long *plStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 uStack_80;
  long lStack_78;
  ulong uStack_70;
  long lStack_68;
  long lStack_60;
  undefined *puStack_58;
  undefined *puStack_50;
  ulong uStack_48;
  long lStack_40;
  ulong *puStack_38;
  ulong uStack_30;
  undefined8 *puStack_28;
  ulong *puStack_20;
  undefined8 uStack_18;
  
code_r0x00516d40:
  if (!(bool)in_ZR || param_1 < unaff_x28) goto LAB_00517158;
  bVar3 = *(byte *)((long)unaff_x19 + 0x61);
  unaff_x22 = (ulong)bVar3;
  unaff_x23 = (ulong *)unaff_x19[4];
  if (unaff_x28 == (ulong *)0x0) {
    puVar8 = (ulong *)0x0;
    lVar5 = 8;
  }
  else {
    lVar5 = func_0x00187bd0(unaff_x28,8);
    if (lVar5 == 0) goto LAB_0051715c;
    puVar8 = unaff_x20;
  }
  _memcpy(lVar5,unaff_x23,unaff_x28);
  unaff_x23 = (ulong *)*unaff_x19;
  if ((int)unaff_x23 == 1) {
    in_stack_000001a8 = unaff_x19[2];
    in_stack_000001a0 = unaff_x19[1];
  }
  else {
    unaff_x23 = (ulong *)0x0;
  }
  unaff_x28 = (ulong *)&UNK_009e9c28;
  func_0x004e2650(unaff_x29 + -0xf8,unaff_x19 + 6);
  func_0x004e464c(&uStack00000000000000b0,unaff_x19 + 9,&UNK_009e9c28);
  uStack00000000000000a8 = (undefined1)unaff_x19[0xc];
  in_stack_00000058 = in_stack_000001a8;
  in_stack_00000050 = in_stack_000001a0;
  in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0xf0);
  in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0xf8);
  in_stack_00000088 = *(undefined8 *)(unaff_x29 + -0xe8);
  in_stack_00000098 = in_stack_000000b8;
  in_stack_00000090 = uStack00000000000000b0;
  in_stack_000000a0 = in_stack_000000c0;
  uStack0000000000000048 = unaff_x23;
  in_stack_00000060 = puVar8;
  in_stack_00000068 = lVar5;
  in_stack_00000070 = unaff_x20;
  bStack00000000000000a9 = bVar3;
  lVar5 = func_0x00518214(&uStack00000000000000b0,in_stack_00000020,unaff_x26,unaff_x25,
                          &uStack0000000000000048);
  if (uStack00000000000000b0 != 2) {
    lVar5 = func_0x00515db4(&uStack00000000000000b0);
  }
  while (puVar16 = unaff_x21, unaff_x24 = in_stack_00000020, puVar16 != in_stack_00000030) {
    unaff_x20 = (ulong *)0x0;
    unaff_x27 = (ulong *)0x0;
    unaff_x21 = puVar16 + 2;
    unaff_x25 = puVar16[1];
    unaff_x22 = in_stack_00000040;
    puVar8 = in_stack_00000038;
    do {
      unaff_x23 = puVar8 + 2;
      if (*puVar8 == unaff_x25) {
        unaff_x26 = (undefined *)*puVar16;
        lVar5 = _memcmp(puVar8[-1],unaff_x26,unaff_x25);
        if ((int)lVar5 == 0) {
          puVar8 = *(ulong **)(in_stack_00000028 + 0x68);
          if (puVar8 <= unaff_x27) goto code_r0x00517148;
          unaff_x22 = *(ulong *)(in_stack_00000028 + 0x60);
          unaff_x19 = (long *)(unaff_x22 + (long)unaff_x20);
          if (*(long *)(in_stack_00000020 + 0x10) == 0) goto code_r0x00516d2c;
          unaff_x23 = (ulong *)0x0;
          unaff_x27 = (ulong *)0x0;
          unaff_x24 = *(long *)(in_stack_00000020 + 0x10) << 4;
          puVar8 = (ulong *)(*(long *)(in_stack_00000020 + 8) + 8);
          goto code_r0x00516cd0;
        }
      }
      unaff_x20 = unaff_x20 + 0xd;
      unaff_x27 = (ulong *)((long)unaff_x27 + 1);
      unaff_x22 = unaff_x22 - 0x10;
      puVar8 = unaff_x23;
    } while (unaff_x22 != 0);
  }
  lVar15 = *(long *)(in_stack_00000028 + 0x70);
  if (lVar15 != 0) {
    in_stack_000000f8 = *(undefined8 *)(lVar15 + 0x20);
    uStack00000000000000f0 = *(undefined8 *)(lVar15 + 0x18);
    in_stack_00000108 = *(undefined8 *)(lVar15 + 0x30);
    in_stack_00000100 = *(undefined8 *)(lVar15 + 0x28);
    in_stack_00000118 = *(undefined8 *)(lVar15 + 0x40);
    in_stack_00000110 = *(undefined8 *)(lVar15 + 0x38);
    in_stack_00000120 = *(undefined8 *)(lVar15 + 0x48);
    *(undefined8 *)(lVar15 + 0x18) = 0;
    *(undefined8 *)(lVar15 + 0x20) = 8;
    *(undefined8 *)(lVar15 + 0x28) = 0;
    *(undefined8 *)(lVar15 + 0x30) = 0;
    *(undefined8 *)(lVar15 + 0x40) = 0;
    *(undefined8 *)(lVar15 + 0x48) = 0;
    *(undefined8 *)(lVar15 + 0x38) = 8;
    uStack00000000000000b0 = 2;
    func_0x00516bb0(&uStack00000000000000b0,in_stack_00000010,in_stack_00000018,in_stack_00000020);
    uVar6 = *(undefined8 *)(lVar15 + 0x18);
    *(undefined8 *)(lVar15 + 0x18) = uStack00000000000000f0;
    uVar9 = *(undefined8 *)(lVar15 + 0x20);
    *(undefined8 *)(lVar15 + 0x20) = in_stack_000000f8;
    uVar10 = *(undefined8 *)(lVar15 + 0x28);
    *(undefined8 *)(lVar15 + 0x28) = in_stack_00000100;
    uVar11 = *(undefined8 *)(lVar15 + 0x30);
    *(undefined8 *)(lVar15 + 0x30) = in_stack_00000108;
    uVar12 = *(undefined8 *)(lVar15 + 0x38);
    *(undefined8 *)(lVar15 + 0x38) = in_stack_00000110;
    uVar13 = *(undefined8 *)(lVar15 + 0x40);
    *(undefined8 *)(lVar15 + 0x40) = in_stack_00000118;
    uVar14 = *(undefined8 *)(lVar15 + 0x48);
    *(undefined8 *)(lVar15 + 0x48) = in_stack_00000120;
    uStack00000000000000f0 = uVar6;
    in_stack_000000f8 = uVar9;
    in_stack_00000100 = uVar10;
    in_stack_00000108 = uVar11;
    in_stack_00000110 = uVar12;
    in_stack_00000118 = uVar13;
    in_stack_00000120 = uVar14;
    lVar5 = func_0x00515ce8(&uStack00000000000000f0);
    if (uStack00000000000000b0 != 2) {
      if (in_stack_000000d0 != 0) {
        puVar16 = (undefined8 *)(in_stack_000000c8 + 8);
        lVar15 = in_stack_000000d0;
        do {
          if (puVar16[-1] != 0) {
            lVar5 = func_0x00187bd4(*puVar16,puVar16[-1],1);
          }
          puVar16 = puVar16 + 3;
          lVar15 = lVar15 + -1;
        } while (lVar15 != 0);
      }
      if (in_stack_000000c0 != 0) {
        lVar5 = func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
      }
    }
  }
  if (*(long *)(in_stack_00000020 + 0x10) == 0) {
    return lVar5;
  }
  unaff_x28 = *(ulong **)(in_stack_00000020 + 8);
  puVar8 = unaff_x28 + *(long *)(in_stack_00000020 + 0x10) * 2;
  unaff_x20 = *(ulong **)(in_stack_00000020 + 0x20);
  unaff_x27 = unaff_x20 + 1;
  unaff_x21 = (undefined8 *)(*(long *)(in_stack_00000020 + 0x28) * 0x68);
  in_stack_00000018 = 8;
  unaff_x26 = &UNK_009e9c28;
  do {
    if (unaff_x21 == (undefined8 *)0x0) {
      func_0x007a23bc(&UNK_009e9c10);
code_r0x00517130:
      in_stack_00000018 = 0;
code_r0x00517134:
      func_0x007a1f00(in_stack_00000018,unaff_x25,&UNK_009e7fe0);
      puVar8 = extraout_x1;
code_r0x00517148:
      func_0x007a2570(unaff_x27,puVar8,&UNK_009e9b68);
LAB_00517158:
      in_stack_00000008 = 0;
LAB_0051715c:
      uVar6 = func_0x007a1f00(in_stack_00000008,unaff_x28,&UNK_009e7fe0);
      func_0x004eabac(&uStack00000000000000b0);
      uVar6 = __Unwind_Resume(uVar6);
      func_0x00515c40(&uStack00000000000000b0);
      __Unwind_Resume(uVar6);
      func_0x00187bd4(unaff_x24,in_stack_00000040 << 3,8);
      __Unwind_Resume(uVar6);
      auVar26 = func_0x007a2668();
      lVar5 = auVar26._0_8_;
      if (*(long *)(lVar5 + 0x50) != 0) {
        lVar21 = 0;
        uVar17 = 0;
        uVar9 = *auVar26._8_8_;
        lVar15 = auVar26._8_8_[1];
        lVar22 = *(long *)(lVar5 + 0x50) << 4;
        plVar20 = (long *)(*(long *)(lVar5 + 0x48) + 8);
        puStack_50 = unaff_x26;
        uStack_48 = unaff_x25;
        lStack_40 = unaff_x24;
        puStack_38 = unaff_x23;
        uStack_30 = unaff_x22;
        puStack_28 = unaff_x21;
        puStack_20 = unaff_x20;
        uStack_18 = uVar6;
        do {
          if ((*plVar20 == lVar15) && (iVar4 = _memcmp(plVar20[-1],uVar9,lVar15), iVar4 == 0)) {
            if (uVar17 < *(ulong *)(lVar5 + 0x68)) {
              return *(long *)(lVar5 + 0x60) - lVar21;
            }
            auVar26 = func_0x007a2570(uVar17,*(ulong *)(lVar5 + 0x68),&UNK_009e9b68);
            lVar7 = auVar26._0_8_;
            puStack_58 = &DAT_005172cc;
            uVar19 = *(ulong *)(lVar7 + 0x50);
            if (uVar19 != 0) {
              lVar23 = 0;
              lVar24 = 0;
              uVar18 = 0;
              lVar25 = *(long *)(lVar7 + 0x48);
              uVar6 = *auVar26._8_8_;
              lVar1 = auVar26._8_8_[1];
              puStack_b0 = unaff_x28;
              puStack_a8 = unaff_x27;
              puStack_a0 = unaff_x26;
              plStack_98 = plVar20 + 2;
              lStack_90 = lVar22;
              lStack_88 = lVar21;
              uStack_80 = uVar9;
              lStack_78 = lVar15;
              uStack_70 = uVar17;
              lStack_68 = lVar5;
              lStack_60 = (long)register0x00000008 + -0x10;
              do {
                if ((*(long *)(lVar25 + lVar24 + 8) == lVar1) &&
                   (iVar4 = _memcmp(*(undefined8 *)(lVar25 + lVar24),uVar6,lVar1), iVar4 == 0)) {
                  if (uVar18 < uVar19) {
                    _memmove(lVar25 + lVar24,lVar25 + lVar24 + 0x10,(uVar19 * 0x10 - lVar24) + -0x10
                            );
                    *(ulong *)(lVar7 + 0x50) = uVar19 - 1;
                    uVar19 = *(ulong *)(lVar7 + 0x68);
                    if (uVar18 <= uVar19 && uVar19 - uVar18 != 0) {
                      plVar20 = (long *)(*(long *)(lVar7 + 0x60) + lVar23);
                      lVar5 = *plVar20;
                      lStack_f8 = plVar20[6];
                      lStack_100 = plVar20[5];
                      lStack_e8 = plVar20[8];
                      lStack_f0 = plVar20[7];
                      lStack_d8 = plVar20[10];
                      lStack_e0 = plVar20[9];
                      lStack_c8 = plVar20[0xc];
                      lStack_d0 = plVar20[0xb];
                      lStack_118 = plVar20[2];
                      lStack_120 = plVar20[1];
                      lStack_108 = plVar20[4];
                      lStack_110 = plVar20[3];
                      _memmove(plVar20,plVar20 + 0xd,(uVar19 - uVar18) * 0x68 + -0x68);
                      *(ulong *)(lVar7 + 0x68) = uVar19 - 1;
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
                    func_0x007a2080(uVar18,uVar19,&UNK_009e9b38);
                  }
                  auVar26 = func_0x007a2080(uVar18,uVar19,&UNK_009e9b50);
                  lVar5 = *(long *)(auVar26._0_8_ + 0x50);
                  if (lVar5 == 0) {
                    return 0;
                  }
                  uVar6 = *auVar26._8_8_;
                  lVar15 = auVar26._8_8_[1];
                  plVar20 = (long *)(*(long *)(auVar26._0_8_ + 0x48) + 8);
                  lVar5 = lVar5 << 4;
                  while ((*plVar20 != lVar15 ||
                         (iVar4 = _memcmp(plVar20[-1],uVar6,lVar15), iVar4 != 0))) {
                    plVar20 = plVar20 + 2;
                    lVar5 = lVar5 + -0x10;
                    if (lVar5 == 0) {
                      return 0;
                    }
                  }
                  return 1;
                }
                uVar18 = uVar18 + 1;
                lVar24 = lVar24 + 0x10;
                lVar23 = lVar23 + 0x68;
              } while (uVar19 * 0x10 != lVar24);
            }
            return 0;
          }
          lVar21 = lVar21 + -0x68;
          uVar17 = uVar17 + 1;
          lVar22 = lVar22 + -0x10;
          plVar20 = plVar20 + 2;
        } while (lVar22 != 0);
      }
      return 0;
    }
    uVar17 = unaff_x20[5];
    unaff_x25 = uVar17 * 8;
    if (uVar17 >> 0x3d != 0 || 0x7ffffffffffffff8 < unaff_x25) goto code_r0x00517130;
    uVar19 = *unaff_x28;
    uVar18 = unaff_x28[1];
    bVar3 = *(byte *)((long)unaff_x20 + 0x61);
    unaff_x23 = (ulong *)(ulong)bVar3;
    unaff_x22 = unaff_x20[4];
    if (unaff_x25 != 0) {
      lVar5 = func_0x00187bd0(unaff_x25,8);
      if (lVar5 != 0) {
        in_stack_00000040 = uVar17;
        goto code_r0x00517040;
      }
      goto code_r0x00517134;
    }
    in_stack_00000040 = 0;
    lVar5 = 8;
code_r0x00517040:
    _memcpy(lVar5,unaff_x22,unaff_x25);
    unaff_x25 = *unaff_x20;
    if ((int)unaff_x25 == 1) {
      in_stack_00000198 = unaff_x27[1];
      in_stack_00000190 = *unaff_x27;
    }
    else {
      unaff_x25 = 0;
    }
    func_0x004e2650(unaff_x29 + -0x80,unaff_x20 + 6,&UNK_009e9c28);
    func_0x004e464c(unaff_x29 + -0xf8,unaff_x20 + 9,&UNK_009e9c28);
    in_stack_000000c0 = in_stack_00000198;
    in_stack_000000b8 = in_stack_00000190;
    in_stack_000000c8 = in_stack_00000040;
    in_stack_000000e8 = in_stack_000001a8;
    in_stack_000000e0 = in_stack_000001a0;
    uStack00000000000000f0 = *(undefined8 *)(unaff_x29 + -0x70);
    in_stack_00000100 = *(undefined8 *)(unaff_x29 + -0xf0);
    in_stack_000000f8 = *(undefined8 *)(unaff_x29 + -0xf8);
    in_stack_00000108 = *(undefined8 *)(unaff_x29 + -0xe8);
    in_stack_00000110 = CONCAT71(CONCAT61(in_stack_00000110._2_6_,bVar3),(char)unaff_x20[0xc]);
    uStack00000000000000b0 = unaff_x25;
    in_stack_000000d0 = lVar5;
    in_stack_000000d8 = uVar17;
    lVar15 = func_0x00518214(unaff_x29 + -0xf8,in_stack_00000028 + 0x40,uVar19,uVar18,
                             &uStack00000000000000b0);
    if (*(long *)(unaff_x29 + -0xf8) != 2) {
      lVar15 = func_0x00515db4(unaff_x29 + -0xf8);
    }
    unaff_x20 = unaff_x20 + 0xd;
    unaff_x27 = unaff_x27 + 0xd;
    unaff_x21 = unaff_x21 + -0xd;
    unaff_x28 = unaff_x28 + 2;
    unaff_x24 = lVar5;
    if (unaff_x28 == puVar8) {
      return lVar15;
    }
  } while( true );
  while( true ) {
    unaff_x23 = unaff_x23 + 0xd;
    unaff_x27 = (ulong *)((long)unaff_x27 + 1);
    unaff_x24 = unaff_x24 + -0x10;
    puVar8 = unaff_x28;
    if (unaff_x24 == 0) break;
code_r0x00516cd0:
    unaff_x28 = puVar8 + 2;
    if ((*puVar8 == unaff_x25) && (iVar4 = _memcmp(puVar8[-1],unaff_x26,unaff_x25), iVar4 == 0)) {
      puVar8 = *(ulong **)(in_stack_00000020 + 0x28);
      if (puVar8 <= unaff_x27) goto code_r0x00517148;
      plVar20 = (long *)(*(long *)(in_stack_00000020 + 0x20) + (long)unaff_x23);
      bVar3 = *(byte *)((long)plVar20 + 0x61);
      if (bVar3 != 3) {
        bVar2 = *(byte *)((long)unaff_x20 + unaff_x22 + 0x61);
        if (bVar3 <= bVar2 && bVar2 != 3) {
          plVar20 = unaff_x19;
        }
        unaff_x19 = plVar20;
      }
      break;
    }
  }
code_r0x00516d2c:
  unaff_x20 = (ulong *)unaff_x19[5];
  unaff_x28 = (ulong *)((long)unaff_x20 << 3);
  in_ZR = (ulong)unaff_x20 >> 0x3d == 0;
  param_1 = (ulong *)0x7ffffffffffffff8;
  goto code_r0x00516d40;
}

