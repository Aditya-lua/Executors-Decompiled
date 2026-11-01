
/* WARNING: Type propagation algorithm not settling */

undefined8
FUN_00583b1c(long *param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined1 param_4 [16],
            undefined8 param_5)

{
  undefined8 uVar1;
  dword *pdVar2;
  long lVar3;
  long *plVar4;
  ulong uVar5;
  long in_x9;
  undefined8 *puVar6;
  long in_x10;
  long lVar7;
  long lVar8;
  long in_x11;
  long lVar9;
  long in_x13;
  long unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  ulong uVar10;
  long *unaff_x27;
  long *plVar11;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined8 uStack0000000000000010;
  dword *in_stack_00000018;
  ulong in_stack_00000020;
  dword *in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  ulong auStack_d8 [3];
  long lStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  ulong auStack_90 [3];
  long lStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulong uStack_30;
  ulong uStack_28;
  
  lVar14 = param_4._8_8_;
  lVar13 = param_4._0_8_;
  lVar9 = param_3._8_8_;
  lVar8 = param_3._0_8_;
  lVar3 = param_2._8_8_;
  lVar7 = param_2._0_8_;
  while( true ) {
    param_1[-2] = in_x11;
    param_1[-1] = in_x13;
    param_1[1] = lVar3;
    *param_1 = lVar7;
    param_1[3] = lVar9;
    param_1[2] = lVar8;
    param_1[5] = lVar14;
    param_1[4] = lVar13;
    unaff_x20[2] = unaff_x20[2] + 1;
    param_1 = param_1 + 0x21;
    in_x9 = in_x9 + -0x108;
    if (in_x9 == 0) break;
    if (unaff_x27 == unaff_x25) {
      return param_5;
    }
    in_x13 = *unaff_x27;
    *(long **)(unaff_x19 + 0x30) = unaff_x27 + 7;
    if (in_x13 == in_x10) {
      return param_5;
    }
    lVar3 = unaff_x27[2];
    lVar7 = unaff_x27[1];
    lVar9 = unaff_x27[4];
    lVar8 = unaff_x27[3];
    lVar14 = unaff_x27[6];
    lVar13 = unaff_x27[5];
    unaff_x27 = unaff_x27 + 7;
    in_stack_00000030 = lVar7;
    in_stack_00000038 = lVar3;
    in_stack_00000040 = lVar8;
    in_stack_00000048 = lVar9;
    in_stack_00000050 = lVar13;
    in_stack_00000058 = lVar14;
  }
  if ((long)unaff_x25 - (long)unaff_x27 != 0) {
    unaff_x21 = ((ulong)((long)unaff_x25 - (long)unaff_x27) >> 3) * 0x6db6db6db6db6db7;
    if ((ulong)(*unaff_x20 - (unaff_x23 + unaff_x24)) < unaff_x21) {
      func_0x007abb04();
    }
    lVar7 = unaff_x21 + unaff_x23;
    uVar1 = _memmove(unaff_x20[1] + lVar7 * 0x108,unaff_x20[1] + unaff_x23 * 0x108,unaff_x24 * 0x108
                    );
    *(long *)(unaff_x19 + 0x18) = lVar7;
    lVar3 = unaff_x20[2];
    if (lVar3 != lVar7) {
      plVar4 = (long *)(lVar3 * 0x108 + unaff_x20[1] + 0x28);
      lVar3 = lVar3 * -0x108 + lVar7 * 0x108;
      plVar11 = unaff_x27;
      do {
        if (plVar11 == unaff_x25) {
          return uVar1;
        }
        unaff_x27 = plVar11 + 7;
        lVar8 = *plVar11;
        *(long **)(unaff_x19 + 0x30) = unaff_x27;
        if (lVar8 == -0x8000000000000000) {
          return uVar1;
        }
        in_stack_00000038 = plVar11[2];
        in_stack_00000030 = plVar11[1];
        in_stack_00000048 = plVar11[4];
        in_stack_00000040 = plVar11[3];
        in_stack_00000058 = plVar11[6];
        in_stack_00000050 = plVar11[5];
        plVar4[-2] = 0xf;
        plVar4[-1] = lVar8;
        plVar4[1] = in_stack_00000038;
        *plVar4 = in_stack_00000030;
        plVar4[3] = in_stack_00000048;
        plVar4[2] = in_stack_00000040;
        plVar4[5] = in_stack_00000058;
        plVar4[4] = in_stack_00000050;
        unaff_x20[2] = unaff_x20[2] + 1;
        plVar4 = plVar4 + 0x21;
        lVar3 = lVar3 + -0x108;
        plVar11 = unaff_x27;
      } while (lVar3 != 0);
    }
    unaff_x23 = lVar7;
  }
  uVar1 = 0;
  uVar5 = (ulong)((long)unaff_x25 - (long)unaff_x27) >> 3;
  uVar10 = uVar5 * 0x6db6db6db6db6db7;
  uVar5 = uVar5 * 0x24924924924924b8;
  auVar16._8_8_ = 0;
  auVar16._0_8_ = uVar10;
  if ((SUB168(auVar16 * ZEXT816(0x108),8) != 0) || (0x7ffffffffffffff8 < uVar5)) {
code_r0x00583f48:
    uVar1 = func_0x007a1f00(uVar1,uVar5,&UNK_009f0678);
    func_0x00592e4c(&uStack0000000000000010);
    __Unwind_Resume(uVar1);
    func_0x007a2668();
    auVar16 = func_0x007a2668();
    plVar11 = auVar16._8_8_;
    plVar4 = auVar16._0_8_;
    lStack_50 = plVar4[2];
    if (lStack_50 != plVar11[2]) {
      return 0;
    }
    auStack_d8[2] = *plVar4;
    lStack_c0 = plVar4[1];
    lStack_98 = lStack_50;
    if (auStack_d8[2] == 0) {
      lStack_98 = 0;
    }
    auStack_d8[0] = (ulong)(auStack_d8[2] != 0);
    auStack_90[2] = *plVar11;
    lStack_78 = plVar11[1];
    if (auStack_90[2] == 0) {
      lStack_50 = 0;
    }
    auStack_90[0] = (ulong)(auStack_90[2] != 0);
    auStack_d8[1] = 0;
    uStack_b0 = 0;
    auStack_90[1] = 0;
    uStack_68 = 0;
    uStack_48 = 0;
    uStack_40 = 0;
    uStack_38 = 0;
    uStack_b8 = auStack_d8[0];
    lStack_a8 = auStack_d8[2];
    lStack_a0 = lStack_c0;
    uStack_70 = auStack_90[0];
    lStack_60 = auStack_90[2];
    lStack_58 = lStack_78;
    uStack_30 = uVar5;
    uStack_28 = unaff_x21;
    while( true ) {
      auVar16 = func_0x0058027c(auStack_d8);
      plVar4 = auVar16._0_8_;
      if (plVar4 == (long *)0x0) {
        return 1;
      }
      auVar17 = func_0x0058027c(auStack_90);
      plVar11 = auVar17._0_8_;
      if (plVar11 == (long *)0x0) break;
      if (((*plVar4 != *plVar11) || (plVar4[1] != plVar11[1] || plVar4[2] != plVar11[2])) ||
         (*auVar16._8_8_ != *auVar17._8_8_)) {
        return 0;
      }
    }
    return 1;
  }
  if (uVar5 == 0) {
    pdVar2 = &MACH_HEADER.cpusubtype;
    uVar10 = 0;
  }
  else {
    uVar1 = 8;
    pdVar2 = (dword *)func_0x00187bd0(uVar5,8);
    if (pdVar2 == (dword *)0x0) goto code_r0x00583f48;
  }
  in_stack_00000020 = uVar10;
  uStack0000000000000010 = pdVar2;
  in_stack_00000018 = pdVar2;
  if (unaff_x27 == unaff_x25) {
    in_stack_00000028 = pdVar2;
  }
  else {
    uVar10 = 0;
    plVar4 = (long *)(pdVar2 + 8);
    do {
      lVar7 = unaff_x27[6];
      lVar13 = unaff_x27[3];
      lVar9 = unaff_x27[2];
      lVar8 = unaff_x27[5];
      lVar3 = unaff_x27[4];
      plVar11 = unaff_x27 + 7;
      lVar15 = unaff_x27[1];
      lVar14 = *unaff_x27;
      plVar4[-1] = 0xf;
      plVar4[1] = lVar15;
      *plVar4 = lVar14;
      plVar4[3] = lVar13;
      plVar4[2] = lVar9;
      plVar4[5] = lVar8;
      plVar4[4] = lVar3;
      plVar4[6] = lVar7;
      uVar10 = uVar10 + 1;
      plVar4 = plVar4 + 0x21;
      unaff_x27 = plVar11;
    } while (plVar11 != unaff_x25);
    *(long **)(unaff_x19 + 0x30) = plVar11;
    in_stack_00000028 = pdVar2 + uVar10 * 0x42;
    if (uVar10 != 0) {
      if ((ulong)(*unaff_x20 - (unaff_x23 + unaff_x24)) < uVar10) {
        func_0x007abb04();
      }
      lVar7 = unaff_x23 + uVar10;
      _memmove(unaff_x20[1] + lVar7 * 0x108,unaff_x20[1] + unaff_x23 * 0x108,unaff_x24 * 0x108);
      *(long *)(unaff_x19 + 0x18) = lVar7;
      if (unaff_x20[2] != lVar7) {
        lVar8 = unaff_x20[1];
        puVar6 = (undefined8 *)(lVar8 + unaff_x20[2] * 0x108);
        lVar3 = uVar10 * 0x108;
        while( true ) {
          lVar3 = lVar3 + -0x108;
          in_stack_00000018 = pdVar2 + 0x42;
          lVar9 = *(long *)(pdVar2 + 6);
          if (lVar9 == 0x21) break;
          in_stack_000000e8 = *(undefined8 *)(pdVar2 + 0x36);
          in_stack_000000e0 = *(undefined8 *)(pdVar2 + 0x34);
          in_stack_000000f8 = *(undefined8 *)(pdVar2 + 0x3a);
          in_stack_000000f0 = *(undefined8 *)(pdVar2 + 0x38);
          in_stack_00000108 = *(undefined8 *)(pdVar2 + 0x3e);
          in_stack_00000100 = *(undefined8 *)(pdVar2 + 0x3c);
          in_stack_00000110 = *(undefined8 *)(pdVar2 + 0x40);
          in_stack_000000a8 = *(undefined8 *)(pdVar2 + 0x26);
          in_stack_000000a0 = *(undefined8 *)(pdVar2 + 0x24);
          in_stack_000000b8 = *(undefined8 *)(pdVar2 + 0x2a);
          in_stack_000000b0 = *(undefined8 *)(pdVar2 + 0x28);
          in_stack_000000c8 = *(undefined8 *)(pdVar2 + 0x2e);
          in_stack_000000c0 = *(undefined8 *)(pdVar2 + 0x2c);
          in_stack_000000d8 = *(undefined8 *)(pdVar2 + 0x32);
          in_stack_000000d0 = *(undefined8 *)(pdVar2 + 0x30);
          in_stack_00000068 = *(undefined8 *)(pdVar2 + 0x16);
          in_stack_00000060 = *(undefined8 *)(pdVar2 + 0x14);
          in_stack_00000078 = *(undefined8 *)(pdVar2 + 0x1a);
          in_stack_00000070 = *(undefined8 *)(pdVar2 + 0x18);
          in_stack_00000088 = *(undefined8 *)(pdVar2 + 0x1e);
          in_stack_00000080 = *(undefined8 *)(pdVar2 + 0x1c);
          in_stack_00000098 = *(undefined8 *)(pdVar2 + 0x22);
          in_stack_00000090 = *(undefined8 *)(pdVar2 + 0x20);
          in_stack_00000038 = *(long *)(pdVar2 + 10);
          in_stack_00000030 = *(long *)(pdVar2 + 8);
          in_stack_00000048 = *(long *)(pdVar2 + 0xe);
          in_stack_00000040 = *(long *)(pdVar2 + 0xc);
          in_stack_00000058 = *(long *)(pdVar2 + 0x12);
          in_stack_00000050 = *(long *)(pdVar2 + 0x10);
          uVar12 = *(undefined8 *)pdVar2;
          uVar1 = *(undefined8 *)(pdVar2 + 4);
          puVar6[1] = *(undefined8 *)(pdVar2 + 2);
          *puVar6 = uVar12;
          puVar6[2] = uVar1;
          puVar6[3] = lVar9;
          puVar6[0x1b] = in_stack_000000e8;
          puVar6[0x1a] = in_stack_000000e0;
          puVar6[0x1d] = in_stack_000000f8;
          puVar6[0x1c] = in_stack_000000f0;
          puVar6[0x1f] = in_stack_00000108;
          puVar6[0x1e] = in_stack_00000100;
          puVar6[0x20] = in_stack_00000110;
          puVar6[0x13] = in_stack_000000a8;
          puVar6[0x12] = in_stack_000000a0;
          puVar6[0x15] = in_stack_000000b8;
          puVar6[0x14] = in_stack_000000b0;
          puVar6[0x17] = in_stack_000000c8;
          puVar6[0x16] = in_stack_000000c0;
          puVar6[0x19] = in_stack_000000d8;
          puVar6[0x18] = in_stack_000000d0;
          puVar6[0xb] = in_stack_00000068;
          puVar6[10] = in_stack_00000060;
          puVar6[0xd] = in_stack_00000078;
          puVar6[0xc] = in_stack_00000070;
          puVar6[0xf] = in_stack_00000088;
          puVar6[0xe] = in_stack_00000080;
          puVar6[0x11] = in_stack_00000098;
          puVar6[0x10] = in_stack_00000090;
          puVar6[5] = in_stack_00000038;
          puVar6[4] = in_stack_00000030;
          puVar6[7] = in_stack_00000048;
          puVar6[6] = in_stack_00000040;
          puVar6[9] = in_stack_00000058;
          puVar6[8] = in_stack_00000050;
          unaff_x20[2] = unaff_x20[2] + 1;
          puVar6 = puVar6 + 0x21;
          if ((puVar6 == (undefined8 *)(lVar8 + lVar7 * 0x108)) ||
             (pdVar2 = in_stack_00000018, lVar3 == 0)) break;
        }
      }
    }
  }
  uVar1 = func_0x00592e4c(&uStack0000000000000010);
  return uVar1;
}

