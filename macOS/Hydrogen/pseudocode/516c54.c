
long FUN_00516c54(ulong *param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  byte bVar3;
  byte bVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  ulong *puVar9;
  ulong *extraout_x1;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 *unaff_x19;
  long *plVar17;
  ulong uVar18;
  ulong *unaff_x20;
  undefined8 *puVar19;
  ulong uVar20;
  undefined8 *unaff_x21;
  ulong uVar21;
  ulong unaff_x22;
  ulong *unaff_x23;
  long lVar22;
  long unaff_x24;
  long lVar23;
  ulong unaff_x25;
  long lVar24;
  undefined *puVar25;
  long lVar26;
  ulong *unaff_x27;
  long lVar27;
  ulong *unaff_x28;
  long unaff_x29;
  undefined1 auVar28 [16];
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
  
code_r0x00516c54:
  unaff_x22 = unaff_x22 - 0x10;
  puVar9 = param_1;
  if (unaff_x22 == 0) goto LAB_00516c1c;
code_r0x00516c5c:
  param_1 = unaff_x23 + 2;
  if (*unaff_x23 != unaff_x25) goto LAB_00516c48;
  puVar25 = (undefined *)*unaff_x19;
  param_2 = _memcmp(puVar9[-1],puVar25,unaff_x25);
  if ((int)param_2 != 0) goto LAB_00516c48;
  puVar9 = *(ulong **)(in_stack_00000028 + 0x68);
  unaff_x23 = param_1;
  if (puVar9 <= unaff_x27) goto LAB_00517148;
  unaff_x22 = *(ulong *)(in_stack_00000028 + 0x60);
  plVar17 = (long *)(unaff_x22 + (long)unaff_x20);
  if (*(long *)(unaff_x24 + 0x10) != 0) {
    param_1 = (ulong *)0x0;
    unaff_x27 = (ulong *)0x0;
    plVar1 = (long *)(unaff_x24 + 8);
    unaff_x24 = *(long *)(unaff_x24 + 0x10) << 4;
    puVar9 = (ulong *)(*plVar1 + 8);
    do {
      unaff_x28 = puVar9 + 2;
      if ((*puVar9 == unaff_x25) && (iVar5 = _memcmp(puVar9[-1],puVar25,unaff_x25), iVar5 == 0)) {
        puVar9 = *(ulong **)(in_stack_00000020 + 0x28);
        unaff_x23 = param_1;
        if (puVar9 <= unaff_x27) goto LAB_00517148;
        plVar1 = (long *)(*(long *)(in_stack_00000020 + 0x20) + (long)param_1);
        bVar3 = *(byte *)((long)plVar1 + 0x61);
        if (bVar3 != 3) {
          bVar4 = *(byte *)((long)unaff_x20 + unaff_x22 + 0x61);
          if (bVar3 <= bVar4 && bVar4 != 3) {
            plVar1 = plVar17;
          }
          plVar17 = plVar1;
        }
        break;
      }
      param_1 = param_1 + 0xd;
      unaff_x27 = (ulong *)((long)unaff_x27 + 1);
      unaff_x24 = unaff_x24 + -0x10;
      puVar9 = unaff_x28;
    } while (unaff_x24 != 0);
  }
  unaff_x20 = (ulong *)plVar17[5];
  unaff_x28 = (ulong *)((long)unaff_x20 * 8);
  unaff_x23 = param_1;
  if ((ulong)unaff_x20 >> 0x3d != 0 || (ulong *)0x7ffffffffffffff8 < unaff_x28) goto LAB_00517158;
  bVar3 = *(byte *)((long)plVar17 + 0x61);
  unaff_x22 = (ulong)bVar3;
  unaff_x23 = (ulong *)plVar17[4];
  if (unaff_x28 == (ulong *)0x0) {
    puVar9 = (ulong *)0x0;
    lVar6 = 8;
  }
  else {
    lVar6 = func_0x00187bd0(unaff_x28,8);
    if (lVar6 == 0) goto LAB_0051715c;
    puVar9 = unaff_x20;
  }
  _memcpy(lVar6,unaff_x23,unaff_x28);
  unaff_x23 = (ulong *)*plVar17;
  if ((int)unaff_x23 == 1) {
    in_stack_000001a8 = plVar17[2];
    in_stack_000001a0 = plVar17[1];
  }
  else {
    unaff_x23 = (ulong *)0x0;
  }
  unaff_x28 = (ulong *)&UNK_009e9c28;
  func_0x004e2650(unaff_x29 + -0xf8,plVar17 + 6);
  func_0x004e464c(&uStack00000000000000b0,plVar17 + 9,&UNK_009e9c28);
  uStack00000000000000a8 = (undefined1)plVar17[0xc];
  in_stack_00000058 = in_stack_000001a8;
  in_stack_00000050 = in_stack_000001a0;
  in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0xf0);
  in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0xf8);
  in_stack_00000088 = *(undefined8 *)(unaff_x29 + -0xe8);
  in_stack_00000098 = in_stack_000000b8;
  in_stack_00000090 = uStack00000000000000b0;
  in_stack_000000a0 = in_stack_000000c0;
  uStack0000000000000048 = unaff_x23;
  in_stack_00000060 = puVar9;
  in_stack_00000068 = lVar6;
  in_stack_00000070 = unaff_x20;
  bStack00000000000000a9 = bVar3;
  param_2 = func_0x00518214(&uStack00000000000000b0,in_stack_00000020,puVar25,unaff_x25,
                            &uStack0000000000000048);
  unaff_x24 = in_stack_00000020;
  if (uStack00000000000000b0 != 2) {
    param_2 = func_0x00515db4(&uStack00000000000000b0);
  }
LAB_00516c1c:
  unaff_x19 = unaff_x21;
  if (unaff_x19 != in_stack_00000030) {
    unaff_x20 = (ulong *)0x0;
    unaff_x27 = (ulong *)0x0;
    unaff_x21 = unaff_x19 + 2;
    unaff_x25 = unaff_x19[1];
    puVar9 = in_stack_00000038;
    unaff_x22 = in_stack_00000040;
    unaff_x23 = in_stack_00000038;
    goto code_r0x00516c5c;
  }
  lVar6 = *(long *)(in_stack_00000028 + 0x70);
  if (lVar6 != 0) {
    in_stack_000000f8 = *(undefined8 *)(lVar6 + 0x20);
    uStack00000000000000f0 = *(undefined8 *)(lVar6 + 0x18);
    in_stack_00000108 = *(undefined8 *)(lVar6 + 0x30);
    in_stack_00000100 = *(undefined8 *)(lVar6 + 0x28);
    in_stack_00000118 = *(undefined8 *)(lVar6 + 0x40);
    in_stack_00000110 = *(undefined8 *)(lVar6 + 0x38);
    in_stack_00000120 = *(undefined8 *)(lVar6 + 0x48);
    *(undefined8 *)(lVar6 + 0x18) = 0;
    *(undefined8 *)(lVar6 + 0x20) = 8;
    *(undefined8 *)(lVar6 + 0x28) = 0;
    *(undefined8 *)(lVar6 + 0x30) = 0;
    *(undefined8 *)(lVar6 + 0x40) = 0;
    *(undefined8 *)(lVar6 + 0x48) = 0;
    *(undefined8 *)(lVar6 + 0x38) = 8;
    uStack00000000000000b0 = 2;
    func_0x00516bb0(&uStack00000000000000b0,in_stack_00000010,in_stack_00000018,unaff_x24);
    uVar10 = *(undefined8 *)(lVar6 + 0x18);
    *(undefined8 *)(lVar6 + 0x18) = uStack00000000000000f0;
    uVar11 = *(undefined8 *)(lVar6 + 0x20);
    *(undefined8 *)(lVar6 + 0x20) = in_stack_000000f8;
    uVar12 = *(undefined8 *)(lVar6 + 0x28);
    *(undefined8 *)(lVar6 + 0x28) = in_stack_00000100;
    uVar13 = *(undefined8 *)(lVar6 + 0x30);
    *(undefined8 *)(lVar6 + 0x30) = in_stack_00000108;
    uVar14 = *(undefined8 *)(lVar6 + 0x38);
    *(undefined8 *)(lVar6 + 0x38) = in_stack_00000110;
    uVar15 = *(undefined8 *)(lVar6 + 0x40);
    *(undefined8 *)(lVar6 + 0x40) = in_stack_00000118;
    uVar16 = *(undefined8 *)(lVar6 + 0x48);
    *(undefined8 *)(lVar6 + 0x48) = in_stack_00000120;
    uStack00000000000000f0 = uVar10;
    in_stack_000000f8 = uVar11;
    in_stack_00000100 = uVar12;
    in_stack_00000108 = uVar13;
    in_stack_00000110 = uVar14;
    in_stack_00000118 = uVar15;
    in_stack_00000120 = uVar16;
    param_2 = func_0x00515ce8(&uStack00000000000000f0);
    if (uStack00000000000000b0 != 2) {
      if (in_stack_000000d0 != 0) {
        puVar19 = (undefined8 *)(in_stack_000000c8 + 8);
        lVar6 = in_stack_000000d0;
        do {
          if (puVar19[-1] != 0) {
            param_2 = func_0x00187bd4(*puVar19,puVar19[-1],1);
          }
          puVar19 = puVar19 + 3;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      if (in_stack_000000c0 != 0) {
        param_2 = func_0x00187bd4(in_stack_000000c8,in_stack_000000c0 * 0x18,8);
      }
    }
  }
  if (*(long *)(unaff_x24 + 0x10) == 0) {
    return param_2;
  }
  unaff_x28 = *(ulong **)(unaff_x24 + 8);
  puVar9 = unaff_x28 + *(long *)(unaff_x24 + 0x10) * 2;
  unaff_x20 = *(ulong **)(unaff_x24 + 0x20);
  unaff_x27 = unaff_x20 + 1;
  unaff_x21 = (undefined8 *)(*(long *)(unaff_x24 + 0x28) * 0x68);
  in_stack_00000018 = 8;
  puVar25 = &UNK_009e9c28;
  do {
    if (unaff_x21 == (undefined8 *)0x0) {
      func_0x007a23bc(&UNK_009e9c10);
code_r0x00517130:
      in_stack_00000018 = 0;
code_r0x00517134:
      func_0x007a1f00(in_stack_00000018,unaff_x25,&UNK_009e7fe0);
      puVar9 = extraout_x1;
LAB_00517148:
      func_0x007a2570(unaff_x27,puVar9,&UNK_009e9b68);
LAB_00517158:
      in_stack_00000008 = 0;
LAB_0051715c:
      uVar10 = func_0x007a1f00(in_stack_00000008,unaff_x28,&UNK_009e7fe0);
      func_0x004eabac(&uStack00000000000000b0);
      uVar10 = __Unwind_Resume(uVar10);
      func_0x00515c40(&uStack00000000000000b0);
      __Unwind_Resume(uVar10);
      func_0x00187bd4(unaff_x24,in_stack_00000040 << 3,8);
      __Unwind_Resume(uVar10);
      auVar28 = func_0x007a2668();
      lVar6 = auVar28._0_8_;
      if (*(long *)(lVar6 + 0x50) != 0) {
        lVar22 = 0;
        uVar18 = 0;
        uVar11 = *auVar28._8_8_;
        lVar7 = auVar28._8_8_[1];
        lVar23 = *(long *)(lVar6 + 0x50) << 4;
        plVar17 = (long *)(*(long *)(lVar6 + 0x48) + 8);
        puStack_50 = puVar25;
        uStack_48 = unaff_x25;
        lStack_40 = unaff_x24;
        puStack_38 = unaff_x23;
        uStack_30 = unaff_x22;
        puStack_28 = unaff_x21;
        puStack_20 = unaff_x20;
        uStack_18 = uVar10;
        do {
          if ((*plVar17 == lVar7) && (iVar5 = _memcmp(plVar17[-1],uVar11,lVar7), iVar5 == 0)) {
            if (uVar18 < *(ulong *)(lVar6 + 0x68)) {
              return *(long *)(lVar6 + 0x60) - lVar22;
            }
            auVar28 = func_0x007a2570(uVar18,*(ulong *)(lVar6 + 0x68),&UNK_009e9b68);
            lVar8 = auVar28._0_8_;
            puStack_58 = &DAT_005172cc;
            uVar21 = *(ulong *)(lVar8 + 0x50);
            if (uVar21 != 0) {
              lVar24 = 0;
              lVar26 = 0;
              uVar20 = 0;
              lVar27 = *(long *)(lVar8 + 0x48);
              uVar10 = *auVar28._8_8_;
              lVar2 = auVar28._8_8_[1];
              puStack_b0 = unaff_x28;
              puStack_a8 = unaff_x27;
              puStack_a0 = puVar25;
              plStack_98 = plVar17 + 2;
              lStack_90 = lVar23;
              lStack_88 = lVar22;
              uStack_80 = uVar11;
              lStack_78 = lVar7;
              uStack_70 = uVar18;
              lStack_68 = lVar6;
              lStack_60 = (long)register0x00000008 + -0x10;
              do {
                if ((*(long *)(lVar27 + lVar26 + 8) == lVar2) &&
                   (iVar5 = _memcmp(*(undefined8 *)(lVar27 + lVar26),uVar10,lVar2), iVar5 == 0)) {
                  if (uVar20 < uVar21) {
                    _memmove(lVar27 + lVar26,lVar27 + lVar26 + 0x10,(uVar21 * 0x10 - lVar26) + -0x10
                            );
                    *(ulong *)(lVar8 + 0x50) = uVar21 - 1;
                    uVar21 = *(ulong *)(lVar8 + 0x68);
                    if (uVar20 <= uVar21 && uVar21 - uVar20 != 0) {
                      plVar17 = (long *)(*(long *)(lVar8 + 0x60) + lVar24);
                      lVar6 = *plVar17;
                      lStack_f8 = plVar17[6];
                      lStack_100 = plVar17[5];
                      lStack_e8 = plVar17[8];
                      lStack_f0 = plVar17[7];
                      lStack_d8 = plVar17[10];
                      lStack_e0 = plVar17[9];
                      lStack_c8 = plVar17[0xc];
                      lStack_d0 = plVar17[0xb];
                      lStack_118 = plVar17[2];
                      lStack_120 = plVar17[1];
                      lStack_108 = plVar17[4];
                      lStack_110 = plVar17[3];
                      _memmove(plVar17,plVar17 + 0xd,(uVar21 - uVar20) * 0x68 + -0x68);
                      *(ulong *)(lVar8 + 0x68) = uVar21 - 1;
                      if (lVar6 == 2) {
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
                      lStack_188 = lVar6;
                      func_0x00515db4(&lStack_188);
                      return 1;
                    }
                  }
                  else {
                    func_0x007a2080(uVar20,uVar21,&UNK_009e9b38);
                  }
                  auVar28 = func_0x007a2080(uVar20,uVar21,&UNK_009e9b50);
                  lVar6 = *(long *)(auVar28._0_8_ + 0x50);
                  if (lVar6 == 0) {
                    return 0;
                  }
                  uVar10 = *auVar28._8_8_;
                  lVar7 = auVar28._8_8_[1];
                  plVar17 = (long *)(*(long *)(auVar28._0_8_ + 0x48) + 8);
                  lVar6 = lVar6 << 4;
                  while ((*plVar17 != lVar7 ||
                         (iVar5 = _memcmp(plVar17[-1],uVar10,lVar7), iVar5 != 0))) {
                    plVar17 = plVar17 + 2;
                    lVar6 = lVar6 + -0x10;
                    if (lVar6 == 0) {
                      return 0;
                    }
                  }
                  return 1;
                }
                uVar20 = uVar20 + 1;
                lVar26 = lVar26 + 0x10;
                lVar24 = lVar24 + 0x68;
              } while (uVar21 * 0x10 != lVar26);
            }
            return 0;
          }
          lVar22 = lVar22 + -0x68;
          uVar18 = uVar18 + 1;
          lVar23 = lVar23 + -0x10;
          plVar17 = plVar17 + 2;
        } while (lVar23 != 0);
      }
      return 0;
    }
    uVar18 = unaff_x20[5];
    unaff_x25 = uVar18 * 8;
    if (uVar18 >> 0x3d != 0 || 0x7ffffffffffffff8 < unaff_x25) goto code_r0x00517130;
    uVar21 = *unaff_x28;
    uVar20 = unaff_x28[1];
    bVar3 = *(byte *)((long)unaff_x20 + 0x61);
    unaff_x23 = (ulong *)(ulong)bVar3;
    unaff_x22 = unaff_x20[4];
    if (unaff_x25 != 0) {
      lVar6 = func_0x00187bd0(unaff_x25,8);
      if (lVar6 != 0) {
        in_stack_00000040 = uVar18;
        goto code_r0x00517040;
      }
      goto code_r0x00517134;
    }
    in_stack_00000040 = 0;
    lVar6 = 8;
code_r0x00517040:
    _memcpy(lVar6,unaff_x22,unaff_x25);
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
    in_stack_000000d0 = lVar6;
    in_stack_000000d8 = uVar18;
    lVar7 = func_0x00518214(unaff_x29 + -0xf8,in_stack_00000028 + 0x40,uVar21,uVar20,
                            &uStack00000000000000b0);
    if (*(long *)(unaff_x29 + -0xf8) != 2) {
      lVar7 = func_0x00515db4(unaff_x29 + -0xf8);
    }
    unaff_x20 = unaff_x20 + 0xd;
    unaff_x27 = unaff_x27 + 0xd;
    unaff_x21 = unaff_x21 + -0xd;
    unaff_x28 = unaff_x28 + 2;
    unaff_x24 = lVar6;
    if (unaff_x28 == puVar9) {
      return lVar7;
    }
  } while( true );
LAB_00516c48:
  unaff_x20 = unaff_x20 + 0xd;
  unaff_x27 = (ulong *)((long)unaff_x27 + 1);
  unaff_x23 = param_1;
  goto code_r0x00516c54;
}

