
void FUN_0055ebb0(ulong param_1)

{
  ushort *puVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  ushort uVar4;
  long *plVar5;
  long lVar6;
  long lVar7;
  undefined8 *extraout_x8;
  undefined8 *puVar8;
  ulong in_x10;
  undefined8 uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  ulong unaff_x19;
  ulong unaff_x20;
  long lVar13;
  ulong uVar14;
  long unaff_x25;
  long lVar15;
  ulong uVar16;
  long lVar17;
  long unaff_x29;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined1 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  ulong uStack0000000000000058;
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
  
  do {
    lVar17 = *(long *)(unaff_x25 + 0xb0);
    if (lVar17 == 0) {
      if ((int)param_1 == 0) {
        *in_stack_00000008 = 1;
      }
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
    uStack0000000000000058 = in_x10 + 1;
    if (*(ushort *)(unaff_x25 + 0x1c0) == 0) {
      uVar4 = *(ushort *)(lVar17 + 0x1c2);
      if (uVar4 == 0) goto LAB_0055ee70;
      lVar10 = *(long *)(lVar17 + 0x1d0);
      in_stack_000000c8 = 0;
      lVar15 = param_1 + 1;
      uVar14 = (ulong)*(ushort *)(lVar10 + 0x1c2);
      unaff_x20 = lVar15 + uVar14;
      uStack00000000000000b8 = (undefined *)lVar17;
      in_stack_000000c0 = uStack0000000000000058;
      in_stack_000000d0 = unaff_x25;
      in_stack_000000d8 = in_x10;
      in_stack_000000e0 = lVar10;
      in_stack_000000e8 = in_x10;
      if (0xb < unaff_x20) {
        func_0x0055e51c(&uStack00000000000000b8,5 - param_1);
        goto code_r0x0055ede0;
      }
      uVar11 = 0;
      lVar13 = unaff_x25;
    }
    else {
      uVar11 = (ulong)*(ushort *)(unaff_x25 + 0x1c0) - 1;
      in_stack_00000098 = *(long *)(lVar17 + uVar11 * 8 + 0x1c8);
      uVar16 = (ulong)*(ushort *)(in_stack_00000098 + 0x1c2);
      uStack0000000000000080 = lVar17;
      in_stack_00000088 = uStack0000000000000058;
      in_stack_00000090 = uVar11;
      in_stack_000000a0 = in_x10;
      in_stack_000000a8 = unaff_x25;
      in_stack_000000b0 = in_x10;
      if (0xb < param_1 + uVar16 + 1) {
        func_0x0055e2f4(&uStack0000000000000080,5 - param_1);
        goto code_r0x0055ede0;
      }
      uVar4 = *(ushort *)(lVar17 + 0x1c2);
      lVar15 = uVar16 + 1;
      unaff_x20 = lVar15 + param_1;
      lVar13 = in_stack_00000098;
      uVar14 = param_1;
      lVar10 = unaff_x25;
      param_1 = uVar16;
    }
    uVar16 = (ulong)uVar4;
    *(short *)(lVar13 + 0x1c2) = (short)unaff_x20;
    lVar6 = lVar17 + (long)(int)uVar11 * 0x18;
    uVar9 = *(undefined8 *)(lVar6 + 0xb8);
    *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(lVar6 + 0xc0);
    *(undefined8 *)(unaff_x29 + -0x90) = uVar9;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(lVar6 + 200);
    lVar7 = ~uVar11 + uVar16;
    _memmove(lVar6 + 0xb8,lVar6 + 0xd0,lVar7 * 0x18);
    puVar8 = (undefined8 *)(lVar13 + 0xb8 + (param_1 & 0xffffffff) * 0x18);
    uVar9 = *(undefined8 *)(unaff_x29 + -0x80);
    uVar12 = *(undefined8 *)(unaff_x29 + -0x90);
    puVar8[1] = *(undefined8 *)(unaff_x29 + -0x88);
    *puVar8 = uVar12;
    puVar8[2] = uVar9;
    _memcpy(lVar13 + 0xb8 + lVar15 * 0x18,lVar10 + 0xb8,uVar14 * 0x18);
    puVar2 = (undefined4 *)(lVar17 + uVar11 * 0x10);
    uVar3 = *puVar2;
    uVar9 = *(undefined8 *)(puVar2 + 2);
    _memmove(puVar2,puVar2 + 4,lVar7 * 0x10);
    puVar2 = (undefined4 *)(lVar13 + param_1 * 0x10);
    *puVar2 = uVar3;
    *(undefined8 *)(puVar2 + 2) = uVar9;
    _memcpy(lVar13 + lVar15 * 0x10,lVar10,uVar14 << 4);
    uVar11 = uVar11 + 1;
    lVar6 = lVar17 + uVar11 * 8;
    _memmove(lVar6 + 0x1c8,lVar6 + 0x1d0,lVar7 * 8);
    in_x10 = uStack0000000000000058;
    if (uVar11 < uVar16) {
      do {
        lVar7 = *(long *)(lVar17 + uVar11 * 8 + 0x1c8);
        *(short *)(lVar7 + 0x1c0) = (short)uVar11;
        uVar11 = uVar11 + 1;
        *(long *)(lVar7 + 0xb0) = lVar17;
      } while (uVar16 != uVar11);
    }
    *(short *)(lVar17 + 0x1c2) = *(short *)(lVar17 + 0x1c2) + -1;
    unaff_x19 = in_x10;
    if (uStack0000000000000058 < 2) {
      uVar9 = 0x1c8;
    }
    else {
      if (uVar14 + 1 != unaff_x20 - param_1) {
        func_0x007a247c(&UNK_008ab922,0x28,&UNK_009ee0c0);
LAB_0055ee70:
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
        auVar20 = func_0x007a2420(&uStack00000000000000b8,&UNK_009ee090);
        plVar5 = auVar20._0_8_;
        alStack_b0[0] = *plVar5;
        lVar17 = plVar5[1];
        alStack_b0[2] = plVar5[2];
        uStack_20 = unaff_x20;
        uStack_18 = unaff_x19;
        if (lVar17 == 0) {
          alStack_b0[1] = 0;
          func_0x0055e9b4(extraout_x8,alStack_b0,auVar20._8_8_);
        }
        else {
          alStack_98[0] = *(long *)(alStack_b0[0] + alStack_b0[2] * 8 + 0x1c8);
          while (lVar17 = lVar17 + -1, lVar17 != 0) {
            alStack_98[0] =
                 *(long *)(alStack_98[0] + (ulong)*(ushort *)(alStack_98[0] + 0x1c2) * 8 + 0x1c8);
          }
          alStack_98[2] = (ulong)*(ushort *)(alStack_98[0] + 0x1c2) - 1;
          alStack_98[1] = 0;
          func_0x0055e9b4(&uStack_60,alStack_98,auVar20._8_8_);
          if (*(ushort *)(lStack_38 + 0x1c2) <= uStack_28) {
            do {
              puVar1 = (ushort *)(lStack_38 + 0x1c0);
              uStack_28 = (ulong)*puVar1;
              lStack_38 = *(long *)(lStack_38 + 0xb0);
              lStack_30 = lStack_30 + 1;
            } while (*(ushort *)(lStack_38 + 0x1c2) <= *puVar1);
          }
          lVar17 = lStack_38 + uStack_28 * 0x18;
          uVar19 = *(undefined8 *)(lVar17 + 0xc0);
          uVar18 = *(undefined8 *)(lVar17 + 0xb8);
          puVar2 = (undefined4 *)(lStack_38 + uStack_28 * 0x10);
          uVar9 = *(undefined8 *)(lVar17 + 200);
          *(undefined8 *)(lVar17 + 0xc0) = uStack_58;
          *(undefined8 *)(lVar17 + 0xb8) = uStack_60;
          *(undefined8 *)(lVar17 + 200) = uStack_50;
          uVar3 = *puVar2;
          uVar12 = *(undefined8 *)(puVar2 + 2);
          *puVar2 = uStack_48;
          *(undefined8 *)(puVar2 + 2) = uStack_40;
          lVar17 = uStack_28 + 1;
          if (lStack_30 != 0) {
            lStack_38 = lStack_38 + lVar17 * 8;
            do {
              lStack_38 = *(long *)(lStack_38 + 0x1c8);
              lStack_30 = lStack_30 + -1;
            } while (lStack_30 != 0);
            lVar17 = 0;
          }
          extraout_x8[1] = uVar19;
          *extraout_x8 = uVar18;
          extraout_x8[2] = uVar9;
          *(undefined4 *)(extraout_x8 + 3) = uVar3;
          extraout_x8[4] = uVar12;
          extraout_x8[5] = lStack_38;
          extraout_x8[6] = 0;
          extraout_x8[7] = lVar17;
        }
        return;
      }
      _memcpy(lVar13 + 0x1c8 + lVar15 * 8,lVar10 + 0x1c8,(uVar14 + 1) * 8);
      do {
        lVar7 = *(long *)(lVar13 + lVar15 * 8 + 0x1c8);
        *(short *)(lVar7 + 0x1c0) = (short)lVar15;
        lVar15 = lVar15 + 1;
        *(long *)(lVar7 + 0xb0) = lVar13;
      } while (unaff_x20 + 1 != lVar15);
      uVar9 = 0x228;
      uVar16 = unaff_x20;
    }
    func_0x00187bd4(lVar10,uVar9,8);
    param_1 = (ulong)*(ushort *)(lVar17 + 0x1c2);
    if (4 < *(ushort *)(lVar17 + 0x1c2)) goto code_r0x0055ede0;
    unaff_x20 = uVar16;
    unaff_x25 = lVar17;
  } while( true );
}

