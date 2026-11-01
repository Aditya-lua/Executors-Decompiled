
void FUN_0055eccc(undefined4 *param_1)

{
  ushort *puVar1;
  ulong uVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  ushort uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  undefined8 *extraout_x8;
  undefined8 *puVar9;
  undefined8 uVar10;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined4 unaff_w22;
  long unaff_x23;
  undefined8 uVar11;
  ulong unaff_x25;
  long unaff_x26;
  ulong uVar12;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined1 auVar15 [16];
  undefined1 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  ulong in_stack_00000090;
  long in_stack_00000098;
  ulong in_stack_000000a0;
  long in_stack_000000a8;
  ulong in_stack_000000b0;
  undefined8 uStack00000000000000b8;
  ulong in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e0;
  ulong in_stack_000000e8;
  long alStack_b0 [3];
  long alStack_98 [7];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined4 uStack_48;
  undefined8 uStack_40;
  long lStack_38;
  long lStack_30;
  ulong uStack_28;
  ulong uStack_20;
  ulong uStack_18;
  
  while( true ) {
    uVar11 = *(undefined8 *)(param_1 + 2);
    _memmove(param_1,param_1 + 4,unaff_x21 << 4);
    puVar3 = (undefined4 *)(unaff_x23 + unaff_x27 * 0x10);
    *puVar3 = unaff_w22;
    *(undefined8 *)(puVar3 + 2) = uVar11;
    _memcpy(unaff_x23 + unaff_x26 * 0x10,unaff_x19,unaff_x25 << 4);
    in_stack_00000050 = in_stack_00000050 + 1;
    lVar8 = unaff_x28 + in_stack_00000050 * 8;
    _memmove(lVar8 + 0x1c8,lVar8 + 0x1d0,unaff_x21 << 3);
    if (in_stack_00000050 < unaff_x20) {
      do {
        lVar8 = *(long *)(unaff_x28 + in_stack_00000050 * 8 + 0x1c8);
        *(short *)(lVar8 + 0x1c0) = (short)in_stack_00000050;
        in_stack_00000050 = in_stack_00000050 + 1;
        *(long *)(lVar8 + 0xb0) = unaff_x28;
      } while (unaff_x20 != in_stack_00000050);
    }
    *(short *)(unaff_x28 + 0x1c2) = *(short *)(unaff_x28 + 0x1c2) + -1;
    if (in_stack_00000058 < 2) {
      uVar11 = 0x1c8;
      in_stack_00000048 = unaff_x20;
    }
    else {
      if (unaff_x25 + 1 != in_stack_00000048 - unaff_x27) {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
        goto code_r0x0055ee70;
      }
      _memcpy(unaff_x23 + 0x1c8 + unaff_x26 * 8,unaff_x19 + 0x1c8,(unaff_x25 + 1) * 8);
      do {
        lVar8 = *(long *)(unaff_x23 + unaff_x26 * 8 + 0x1c8);
        *(short *)(lVar8 + 0x1c0) = (short)unaff_x26;
        unaff_x26 = unaff_x26 + 1;
        *(long *)(lVar8 + 0xb0) = unaff_x23;
      } while (in_stack_00000048 + 1 != unaff_x26);
      uVar11 = 0x228;
    }
    func_0x00187bd4(unaff_x19,uVar11,8);
    uVar5 = *(ushort *)(unaff_x28 + 0x1c2);
    unaff_x27 = (ulong)uVar5;
    if (4 < uVar5) goto code_r0x0055ede0;
    lVar8 = *(long *)(unaff_x28 + 0xb0);
    if (lVar8 == 0) break;
    uVar2 = in_stack_00000058 + 1;
    if (*(ushort *)(unaff_x28 + 0x1c0) == 0) {
      uVar5 = *(ushort *)(lVar8 + 0x1c2);
      if (uVar5 == 0) {
code_r0x0055ee70:
        *(undefined **)(unaff_x29 + -0x90) = &UNK_009ee080;
        *(undefined8 *)(unaff_x29 + -0x88) = 1;
        *(undefined8 *)(unaff_x29 + -0x78) = 0;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(long *)(unaff_x29 + -0x80) = unaff_x29 + -0x60;
        func_0x007a2420(unaff_x29 + -0x90,&UNK_009ee090);
        func_0x007a247c(&UNK_008aba5b,0x8e,&UNK_009ee1b0);
        uStack00000000000000b8 = &UNK_009ee080;
        in_stack_000000c0 = 1;
        in_stack_000000c8 = unaff_x29 + -0x60;
        in_stack_000000d0 = 0;
        in_stack_000000d8 = 0;
        auVar15 = func_0x007a2420(&uStack00000000000000b8,&UNK_009ee090);
        plVar6 = auVar15._0_8_;
        uStack_18 = in_stack_00000058;
        alStack_b0[0] = *plVar6;
        lVar8 = plVar6[1];
        alStack_b0[2] = plVar6[2];
        uStack_20 = in_stack_00000048;
        if (lVar8 == 0) {
          alStack_b0[1] = 0;
          func_0x0055e9b4(extraout_x8,alStack_b0,auVar15._8_8_);
        }
        else {
          alStack_98[0] = *(long *)(alStack_b0[0] + alStack_b0[2] * 8 + 0x1c8);
          while (lVar8 = lVar8 + -1, lVar8 != 0) {
            alStack_98[0] =
                 *(long *)(alStack_98[0] + (ulong)*(ushort *)(alStack_98[0] + 0x1c2) * 8 + 0x1c8);
          }
          alStack_98[2] = (ulong)*(ushort *)(alStack_98[0] + 0x1c2) - 1;
          alStack_98[1] = 0;
          func_0x0055e9b4(&uStack_60,alStack_98,auVar15._8_8_);
          if (*(ushort *)(lStack_38 + 0x1c2) <= uStack_28) {
            do {
              puVar1 = (ushort *)(lStack_38 + 0x1c0);
              uStack_28 = (ulong)*puVar1;
              lStack_38 = *(long *)(lStack_38 + 0xb0);
              lStack_30 = lStack_30 + 1;
            } while (*(ushort *)(lStack_38 + 0x1c2) <= *puVar1);
          }
          lVar8 = lStack_38 + uStack_28 * 0x18;
          uVar14 = *(undefined8 *)(lVar8 + 0xc0);
          uVar13 = *(undefined8 *)(lVar8 + 0xb8);
          puVar3 = (undefined4 *)(lStack_38 + uStack_28 * 0x10);
          uVar11 = *(undefined8 *)(lVar8 + 200);
          *(undefined8 *)(lVar8 + 0xc0) = uStack_58;
          *(undefined8 *)(lVar8 + 0xb8) = uStack_60;
          *(undefined8 *)(lVar8 + 200) = uStack_50;
          uVar4 = *puVar3;
          uVar10 = *(undefined8 *)(puVar3 + 2);
          *puVar3 = uStack_48;
          *(undefined8 *)(puVar3 + 2) = uStack_40;
          lVar8 = uStack_28 + 1;
          if (lStack_30 != 0) {
            lStack_38 = lStack_38 + lVar8 * 8;
            do {
              lStack_38 = *(long *)(lStack_38 + 0x1c8);
              lStack_30 = lStack_30 + -1;
            } while (lStack_30 != 0);
            lVar8 = 0;
          }
          extraout_x8[1] = uVar14;
          *extraout_x8 = uVar13;
          extraout_x8[2] = uVar11;
          *(undefined4 *)(extraout_x8 + 3) = uVar4;
          extraout_x8[4] = uVar10;
          extraout_x8[5] = lStack_38;
          extraout_x8[6] = 0;
          extraout_x8[7] = lVar8;
        }
        return;
      }
      unaff_x19 = *(long *)(lVar8 + 0x1d0);
      in_stack_000000c8 = 0;
      unaff_x26 = unaff_x27 + 1;
      unaff_x25 = (ulong)*(ushort *)(unaff_x19 + 0x1c2);
      in_stack_00000048 = unaff_x26 + unaff_x25;
      uStack00000000000000b8 = (undefined *)lVar8;
      in_stack_000000c0 = uVar2;
      in_stack_000000d0 = unaff_x28;
      in_stack_000000d8 = in_stack_00000058;
      in_stack_000000e0 = unaff_x19;
      in_stack_000000e8 = in_stack_00000058;
      if (0xb < in_stack_00000048) {
        func_0x0055e51c(&uStack00000000000000b8,5 - unaff_x27);
        goto code_r0x0055ede0;
      }
      in_stack_00000050 = 0;
      unaff_x23 = unaff_x28;
    }
    else {
      in_stack_00000050 = (ulong)*(ushort *)(unaff_x28 + 0x1c0) - 1;
      in_stack_00000098 = *(long *)(lVar8 + in_stack_00000050 * 8 + 0x1c8);
      uVar12 = (ulong)*(ushort *)(in_stack_00000098 + 0x1c2);
      uStack0000000000000080 = lVar8;
      in_stack_00000088 = uVar2;
      in_stack_00000090 = in_stack_00000050;
      in_stack_000000a0 = in_stack_00000058;
      in_stack_000000a8 = unaff_x28;
      in_stack_000000b0 = in_stack_00000058;
      if (0xb < unaff_x27 + uVar12 + 1) {
        func_0x0055e2f4(&uStack0000000000000080,5 - unaff_x27);
code_r0x0055ede0:
        in_stack_00000038[1] = in_stack_00000068;
        *in_stack_00000038 = in_stack_00000060;
        in_stack_00000038[2] = in_stack_00000070;
        *(undefined4 *)(in_stack_00000038 + 3) = in_stack_00000030._4_4_;
        in_stack_00000038[4] = in_stack_00000028;
        in_stack_00000038[5] = in_stack_00000010;
        in_stack_00000038[6] = in_stack_00000020;
        in_stack_00000038[7] = in_stack_00000018;
        return;
      }
      uVar5 = *(ushort *)(lVar8 + 0x1c2);
      unaff_x26 = uVar12 + 1;
      in_stack_00000048 = unaff_x26 + unaff_x27;
      unaff_x23 = in_stack_00000098;
      unaff_x25 = unaff_x27;
      unaff_x19 = unaff_x28;
      unaff_x27 = uVar12;
    }
    unaff_x20 = (ulong)uVar5;
    *(short *)(unaff_x23 + 0x1c2) = (short)in_stack_00000048;
    lVar7 = lVar8 + (long)(int)in_stack_00000050 * 0x18;
    uVar11 = *(undefined8 *)(lVar7 + 0xb8);
    *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(lVar7 + 0xc0);
    *(undefined8 *)(unaff_x29 + -0x90) = uVar11;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(lVar7 + 200);
    unaff_x21 = ~in_stack_00000050 + unaff_x20;
    _memmove(lVar7 + 0xb8,lVar7 + 0xd0,unaff_x21 * 0x18);
    puVar9 = (undefined8 *)(unaff_x23 + 0xb8 + unaff_x27 * 0x18);
    uVar11 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar10 = *(undefined8 *)(unaff_x29 + -0x90);
    puVar9[1] = *(undefined8 *)(unaff_x29 + -0x88);
    *puVar9 = uVar10;
    puVar9[2] = uVar11;
    _memcpy(unaff_x23 + 0xb8 + unaff_x26 * 0x18,unaff_x19 + 0xb8,unaff_x25 * 0x18);
    param_1 = (undefined4 *)(lVar8 + in_stack_00000050 * 0x10);
    unaff_w22 = *param_1;
    unaff_x28 = lVar8;
    in_stack_00000058 = uVar2;
  }
  if (uVar5 == 0) {
    *in_stack_00000008 = 1;
  }
  goto code_r0x0055ede0;
}

