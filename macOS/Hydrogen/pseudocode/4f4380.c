
/* WARNING: Type propagation algorithm not settling */

void FUN_004f4380(void)

{
  ushort uVar1;
  ushort uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined *puVar7;
  undefined8 *in_x3;
  long *extraout_x8;
  long *plVar8;
  long lVar9;
  undefined8 *puVar10;
  ulong unaff_x19;
  long lVar11;
  ulong unaff_x20;
  long *plVar12;
  ulong uVar13;
  long unaff_x21;
  long lVar14;
  long lVar15;
  long unaff_x22;
  long unaff_x23;
  ulong uVar16;
  long unaff_x24;
  long lVar17;
  ulong uVar18;
  long *unaff_x25;
  uint uVar19;
  ulong unaff_x26;
  long lVar20;
  long unaff_x27;
  long lVar21;
  long *unaff_x28;
  ulong uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 *in_stack_00000020;
  long *in_stack_00000028;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long *in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long lStack_c8;
  long lStack_c0;
  ulong uStack_b8;
  undefined8 uStack_b0;
  long lStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long alStack_70 [2];
  long lStack_60;
  long lStack_58;
  long lStack_50;
  undefined8 uStack_48;
  undefined8 *puStack_40;
  long lStack_38;
  long *plStack_30;
  long lStack_28;
  undefined8 *puStack_20;
  undefined8 uStack_18;
  
code_r0x004f4380:
  *(long *)((long)unaff_x25 + unaff_x24) = unaff_x22;
  _memmove((long)unaff_x28 + unaff_x24 + 0x180,(long)unaff_x28 + unaff_x23 + 0x170,unaff_x21);
  do {
    unaff_x28[unaff_x19 + 0x2e] = (long)in_stack_00000028;
    *(short *)((long)unaff_x28 + 0x16a) = (short)unaff_x20 + 1;
    if (unaff_x19 < unaff_x20 + 2) {
      lVar9 = unaff_x26 + 0x2f;
      do {
        puVar10 = (undefined8 *)unaff_x28[lVar9];
        *puVar10 = unaff_x28;
        *(short *)(puVar10 + 0x2d) = (short)lVar9 + -0x2e;
        lVar9 = lVar9 + 1;
      } while (lVar9 - unaff_x20 != 0x30);
    }
    plVar12 = uStack0000000000000088;
    if (uStack0000000000000088 == (long *)0x0) {
LAB_004f46e0:
      *in_stack_00000018 = in_stack_00000008;
      in_stack_00000018[1] = in_stack_00000000;
      in_stack_00000018[2] = in_stack_00000010;
      return;
    }
code_r0x004f42c0:
    unaff_x22 = in_stack_000000c0;
    lVar15 = in_stack_000000b8;
    lVar17 = in_stack_000000b0;
    lVar11 = in_stack_000000a8;
    lVar9 = in_stack_000000a0;
    in_stack_00000028 = in_stack_00000098;
    lVar21 = *plVar12;
    if (lVar21 == 0) {
      in_stack_00000020 = (undefined8 *)*in_stack_00000020;
      puVar10 = (undefined8 *)*in_stack_00000020;
      if (puVar10 == (undefined8 *)0x0) goto code_r0x004f472c;
      lVar14 = in_stack_00000020[1];
      puVar5 = (undefined8 *)func_0x00187bd0(0x1d0,8);
      if (puVar5 == (undefined8 *)0x0) goto code_r0x004f4738;
      *puVar5 = 0;
      *(undefined2 *)((long)puVar5 + 0x16a) = 0;
      puVar5[0x2e] = puVar10;
      *puVar10 = puVar5;
      *(undefined2 *)(puVar10 + 0x2d) = 0;
      *in_stack_00000020 = puVar5;
      in_stack_00000020[1] = lVar14 + 1;
      if (lVar9 == lVar14) {
        *(undefined2 *)((long)puVar5 + 0x16a) = 1;
        puVar5[2] = lVar17;
        puVar5[1] = lVar11;
        puVar5[3] = lVar15;
        puVar5[0x22] = unaff_x22;
        puVar5[0x2f] = in_stack_00000028;
        *in_stack_00000028 = (long)puVar5;
        *(undefined2 *)(in_stack_00000028 + 0x2d) = 1;
        *in_stack_00000018 = in_stack_00000008;
        in_stack_00000018[1] = in_stack_00000000;
        in_stack_00000018[2] = in_stack_00000010;
        return;
      }
      puVar7 = &UNK_009e8370;
      uVar6 = func_0x007a247c(&UNK_008a3c1b,0x30);
      func_0x007a200c(&uStack0000000000000088);
      __Unwind_Resume(uVar6);
      auVar25 = func_0x007a2668();
      puVar5 = auVar25._8_8_;
      plVar12 = auVar25._0_8_;
      uStack_48 = 0x18;
      lStack_38 = unaff_x22;
      lVar11 = *plVar12;
      uVar1 = *(ushort *)(lVar11 + 0x1c2);
      lStack_60 = lVar21;
      lStack_58 = unaff_x27;
      lStack_50 = lVar9;
      puStack_40 = &uStack0000000000000088;
      plStack_30 = in_stack_00000028;
      lStack_28 = lVar14;
      puStack_20 = puVar10;
      uStack_18 = uVar6;
      if (uVar1 < 0xb) {
        lVar9 = plVar12[1];
        uVar22 = plVar12[2];
        uVar13 = uVar22 + 1;
        puVar10 = (undefined8 *)(lVar11 + uVar22 * 0x20);
        if (uVar1 < uVar13) {
          uVar6 = *puVar5;
          uVar24 = puVar5[3];
          uVar23 = puVar5[2];
          puVar10[1] = puVar5[1];
          *puVar10 = uVar6;
          puVar10[3] = uVar24;
          puVar10[2] = uVar23;
        }
        else {
          lVar17 = uVar1 - uVar22;
          _memmove(lVar11 + uVar13 * 0x20,puVar10,lVar17 * 0x20);
          uVar6 = *puVar5;
          uVar24 = puVar5[3];
          uVar23 = puVar5[2];
          puVar10[1] = puVar5[1];
          *puVar10 = uVar6;
          puVar10[3] = uVar24;
          puVar10[2] = uVar23;
          _memmove(lVar11 + 0x168 + uVar13 * 8,lVar11 + 0x168 + uVar22 * 8,lVar17 * 8);
        }
        *(undefined **)(lVar11 + uVar22 * 8 + 0x168) = puVar7;
        *(ushort *)(lVar11 + 0x1c2) = uVar1 + 1;
        goto FUN_004f4c6c;
      }
      lStack_c0 = plVar12[1];
      uVar22 = plVar12[2];
      lStack_c8 = lVar11;
      if (uVar22 < 5) {
        uStack_b8 = 4;
LAB_004f487c:
        func_0x004f36f4(&uStack_b0,&lStack_c8);
        plVar12 = &lStack_80;
        plVar8 = &lStack_88;
      }
      else {
        uStack_b8 = uVar22;
        if (uVar22 == 5) goto LAB_004f487c;
        plVar12 = alStack_70;
        if (uVar22 == 6) {
          uStack_b8 = 5;
          func_0x004f36f4(&uStack_b0,&lStack_c8);
          uVar22 = 0;
        }
        else {
          uStack_b8 = 6;
          func_0x004f36f4(&uStack_b0,&lStack_c8);
          uVar22 = uVar22 - 7;
        }
        plVar8 = &lStack_78;
      }
      lVar9 = *plVar12;
      lVar11 = *plVar8;
      uVar1 = *(ushort *)(lVar11 + 0x1c2);
      puVar10 = (undefined8 *)(lVar11 + uVar22 * 0x20);
      lVar17 = uVar1 - uVar22;
      if (uVar1 < uVar22 || lVar17 == 0) {
        uVar6 = *puVar5;
        uVar24 = puVar5[3];
        uVar23 = puVar5[2];
        puVar10[1] = puVar5[1];
        *puVar10 = uVar6;
        puVar10[3] = uVar24;
        puVar10[2] = uVar23;
      }
      else {
        _memmove(lVar11 + (uVar22 + 1) * 0x20,puVar10,lVar17 * 0x20);
        uVar6 = *puVar5;
        uVar24 = puVar5[3];
        uVar23 = puVar5[2];
        puVar10[1] = puVar5[1];
        *puVar10 = uVar6;
        puVar10[3] = uVar24;
        puVar10[2] = uVar23;
        _memmove(lVar11 + 0x168 + (uVar22 + 1) * 8,lVar11 + 0x168 + uVar22 * 8,lVar17 * 8);
      }
      *(undefined **)(lVar11 + uVar22 * 8 + 0x168) = puVar7;
      *(ushort *)(lVar11 + 0x1c2) = uVar1 + 1;
      if (lStack_a8 == -0x8000000000000000) goto FUN_004f4c6c;
      lVar15 = *(long *)(lStack_88 + 0x160);
      uVar6 = uStack_b0;
      lVar21 = lStack_a8;
      uVar23 = uStack_a0;
      uVar24 = uStack_98;
      uVar3 = uStack_90;
      lVar17 = lStack_88;
      lVar14 = lStack_78;
      lVar20 = alStack_70[0];
      break;
    }
    if (in_stack_000000a0 != in_stack_00000090) {
      func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
code_r0x004f472c:
      func_0x007a23bc(&UNK_009e8340);
code_r0x004f4738:
      func_0x007a1f18(8,0x1d0);
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x4f4748);
      (*pcVar4)();
    }
    uVar1 = *(ushort *)(plVar12 + 0x2d);
    unaff_x26 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar21 + 0x16a);
    uVar13 = (ulong)uVar2;
    uVar19 = (uint)uVar1;
    if (uVar2 < 0xb) {
      uVar22 = unaff_x26 + 1;
      plVar12 = (long *)(lVar21 + 8 + unaff_x26 * 0x18);
      if (uVar19 < uVar2) {
        _memmove(lVar21 + 8 + uVar22 * 0x18,plVar12,(uVar13 - unaff_x26) * 0x18);
        plVar12[1] = lVar17;
        *plVar12 = lVar11;
        lVar11 = unaff_x26 * 8;
        plVar12[2] = lVar15;
        lVar9 = lVar21 + 0x110;
        lVar17 = (uVar13 - unaff_x26) * 8;
        _memmove(lVar9 + uVar22 * 8,lVar9 + lVar11,lVar17);
        *(long *)(lVar9 + lVar11) = unaff_x22;
        _memmove(lVar21 + 0x170 + lVar11 + 0x10,lVar21 + 0x170 + uVar22 * 8,lVar17);
      }
      else {
        plVar12[1] = in_stack_000000b0;
        *plVar12 = in_stack_000000a8;
        plVar12[2] = in_stack_000000b8;
        *(long *)(lVar21 + unaff_x26 * 8 + 0x110) = in_stack_000000c0;
      }
      *(long **)(lVar21 + uVar22 * 8 + 0x170) = in_stack_00000028;
      *(ushort *)(lVar21 + 0x16a) = uVar2 + 1;
      if (uVar22 < uVar13 + 2) {
        lVar9 = unaff_x26 + 0x2f;
        do {
          plVar12 = *(long **)(lVar21 + lVar9 * 8);
          *plVar12 = lVar21;
          *(short *)(plVar12 + 0x2d) = (short)lVar9 + -0x2e;
          lVar9 = lVar9 + 1;
        } while (lVar9 - uVar13 != 0x30);
      }
      goto LAB_004f46e0;
    }
    in_stack_00000078 = in_stack_00000090 + 1;
    uStack0000000000000070 = lVar21;
    if (uVar1 < 5) {
      in_stack_00000080 = 4;
      func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
      unaff_x20 = (ulong)*(ushort *)((long)uStack0000000000000088 + 0x16a);
      plVar12 = uStack0000000000000088 + 1;
      unaff_x19 = unaff_x26 + 1;
      plVar8 = plVar12 + (long)(int)uVar19 * 3;
      unaff_x27 = unaff_x20 - unaff_x26;
      unaff_x28 = uStack0000000000000088;
      if (!(unaff_x20 < unaff_x26 || unaff_x27 == 0)) goto code_r0x004f4334;
      goto code_r0x004f448c;
    }
    if (uVar1 == 5) {
      in_stack_00000080 = 5;
      func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
      plVar12 = uStack0000000000000088;
      uVar1 = *(ushort *)((long)uStack0000000000000088 + 0x16a);
      uVar13 = (ulong)uVar1;
      if (uVar13 < 6) goto code_r0x004f44ec;
      _memmove(uStack0000000000000088 + 0x13,uStack0000000000000088 + 0x10,(uVar13 - 5) * 0x18);
      plVar12[0x11] = lVar17;
      plVar12[0x10] = lVar11;
      plVar12[0x12] = lVar15;
      _memmove(plVar12 + 0x28,plVar12 + 0x27,(uVar13 - 5) * 8);
      plVar12[0x27] = unaff_x22;
      _memmove(plVar12 + 0x35,plVar12 + 0x34,uVar13 * 8 + -0x28);
      plVar12[0x34] = (long)in_stack_00000028;
      *(ushort *)((long)plVar12 + 0x16a) = uVar1 + 1;
      goto LAB_004f4510;
    }
    if (uVar19 == 6) {
      in_stack_00000080 = 5;
      func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
      unaff_x26 = 0;
    }
    else {
      in_stack_00000080 = 6;
      func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
      unaff_x26 = unaff_x26 - 7;
    }
    unaff_x20 = (ulong)*(ushort *)((long)in_stack_00000098 + 0x16a);
    plVar12 = in_stack_00000098 + 1;
    unaff_x19 = unaff_x26 + 1;
    plVar8 = plVar12 + (long)(int)unaff_x26 * 3;
    unaff_x27 = unaff_x20 - unaff_x26;
    unaff_x28 = in_stack_00000098;
    if (unaff_x26 <= unaff_x20 && unaff_x27 != 0) goto code_r0x004f4334;
code_r0x004f448c:
    plVar8[1] = lVar17;
    *plVar8 = lVar11;
    plVar8[2] = lVar15;
    unaff_x28[unaff_x26 + 0x22] = unaff_x22;
  } while( true );
joined_r0x004f4940:
  if (lVar15 == 0) {
    plVar12 = (long *)*in_x3;
    lVar17 = *plVar12;
    if (lVar17 == 0) {
      func_0x007a23bc(&UNK_009e8340);
    }
    else {
      lVar15 = plVar12[1];
      puVar10 = (undefined8 *)func_0x00187bd0(0x228,8);
      if (puVar10 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x228);
      }
      else {
        puVar10[0x2c] = 0;
        *(undefined2 *)((long)puVar10 + 0x1c2) = 0;
        puVar10[0x39] = lVar17;
        *(undefined8 **)(lVar17 + 0x160) = puVar10;
        *(undefined2 *)(lVar17 + 0x1c0) = 0;
        *plVar12 = (long)puVar10;
        plVar12[1] = lVar15 + 1;
        if (lVar20 == lVar15) {
          *(undefined2 *)((long)puVar10 + 0x1c2) = 1;
          *puVar10 = uVar6;
          puVar10[1] = lVar21;
          puVar10[2] = uVar23;
          puVar10[3] = uVar24;
          puVar10[0x2d] = uVar3;
          puVar10[0x3a] = lVar14;
          *(undefined8 **)(lVar14 + 0x160) = puVar10;
          *(undefined2 *)(lVar14 + 0x1c0) = 1;
FUN_004f4c6c:
          *extraout_x8 = lVar11;
          extraout_x8[1] = lVar9;
          extraout_x8[2] = uVar22;
          return;
        }
        func_0x007a247c(&UNK_008a3c1b,0x30,&UNK_009e8370);
      }
    }
code_r0x004f4de4:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x4f4de8);
    (*pcVar4)();
  }
  if (lVar20 != lStack_80) {
    func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
    goto code_r0x004f4de4;
  }
  uVar1 = *(ushort *)(lVar17 + 0x1c0);
  uVar13 = (ulong)uVar1;
  uVar2 = *(ushort *)(lVar15 + 0x1c2);
  uVar16 = (ulong)uVar2;
  if (uVar2 < 0xb) {
    uVar18 = uVar13 + 1;
    puVar10 = (undefined8 *)(lVar15 + uVar13 * 0x20);
    if (uVar1 < uVar2) {
      _memmove(lVar15 + uVar18 * 0x20,puVar10,(uVar16 - uVar13) * 0x20);
      *puVar10 = uVar6;
      puVar10[1] = lVar21;
      lVar17 = lVar15 + 0x168;
      lVar20 = uVar13 * 8;
      lVar21 = (uVar16 - uVar13) * 8;
      puVar10[2] = uVar23;
      puVar10[3] = uVar24;
      _memmove(lVar17 + uVar18 * 8,lVar17 + lVar20,lVar21);
      *(undefined8 *)(lVar17 + lVar20) = uVar3;
      _memmove(lVar15 + 0x1c8 + lVar20 + 0x10,lVar15 + 0x1c8 + uVar18 * 8,lVar21);
    }
    else {
      *puVar10 = uVar6;
      puVar10[1] = lVar21;
      puVar10[2] = uVar23;
      puVar10[3] = uVar24;
      *(undefined8 *)(lVar15 + uVar13 * 8 + 0x168) = uVar3;
    }
    *(long *)(lVar15 + uVar18 * 8 + 0x1c8) = lVar14;
    *(ushort *)(lVar15 + 0x1c2) = uVar2 + 1;
    if (uVar18 < uVar16 + 2) {
      lVar17 = uVar13 + 0x3a;
      do {
        lVar21 = *(long *)(lVar15 + lVar17 * 8);
        *(long *)(lVar21 + 0x160) = lVar15;
        *(short *)(lVar21 + 0x1c0) = (short)lVar17 + -0x39;
        lVar17 = lVar17 + 1;
      } while (lVar17 - uVar16 != 0x3b);
    }
    goto FUN_004f4c6c;
  }
  lStack_c0 = lStack_80 + 1;
  lStack_c8 = lVar15;
  uStack_b0 = uVar6;
  lStack_a8 = lVar21;
  uStack_a0 = uVar23;
  uStack_98 = uVar24;
  uStack_90 = uVar3;
  lStack_78 = lVar14;
  alStack_70[0] = lVar20;
  if (uVar1 < 5) {
    uStack_b8 = 4;
    func_0x004f4e4c(&uStack_b0,&lStack_c8);
    plVar12 = &lStack_88;
FUN_004f4aa4:
    lVar15 = *plVar12;
    uVar1 = *(ushort *)(lVar15 + 0x1c2);
    uVar18 = (ulong)uVar1;
    uVar16 = uVar13 + 1;
    puVar10 = (undefined8 *)(lVar15 + uVar13 * 0x20);
    lVar17 = uVar18 - uVar13;
    if (uVar18 < uVar13 || lVar17 == 0) {
      *puVar10 = uVar6;
      puVar10[1] = lVar21;
      puVar10[2] = uVar23;
      puVar10[3] = uVar24;
      *(undefined8 *)(lVar15 + uVar13 * 8 + 0x168) = uVar3;
    }
    else {
      _memmove(lVar15 + uVar16 * 0x20,puVar10,lVar17 * 0x20);
      *puVar10 = uVar6;
      puVar10[1] = lVar21;
      lVar21 = lVar15 + 0x168;
      lVar20 = uVar13 * 8;
      puVar10[2] = uVar23;
      puVar10[3] = uVar24;
      _memmove(lVar21 + uVar16 * 8,lVar21 + lVar20,lVar17 * 8);
      *(undefined8 *)(lVar21 + lVar20) = uVar3;
      _memmove(lVar15 + 0x1c8 + lVar20 + 0x10,lVar15 + 0x1c8 + uVar16 * 8,lVar17 * 8);
    }
    *(long *)(lVar15 + uVar16 * 8 + 0x1c8) = lVar14;
    *(ushort *)(lVar15 + 0x1c2) = uVar1 + 1;
    lVar17 = lStack_88;
    if (uVar16 < uVar18 + 2) {
      lVar21 = uVar13 + 0x3a;
      do {
        lVar14 = *(long *)(lVar15 + lVar21 * 8);
        *(long *)(lVar14 + 0x160) = lVar15;
        *(short *)(lVar14 + 0x1c0) = (short)lVar21 + -0x39;
        lVar21 = lVar21 + 1;
      } while (lVar21 - uVar18 != 0x3b);
    }
  }
  else {
    if (uVar1 != 5) {
      if (uVar1 == 6) {
        uStack_b8 = 5;
        func_0x004f4e4c(&uStack_b0,&lStack_c8);
        uVar13 = 0;
      }
      else {
        uStack_b8 = 6;
        func_0x004f4e4c(&uStack_b0,&lStack_c8);
        uVar13 = uVar13 - 7;
      }
      plVar12 = &lStack_78;
      goto FUN_004f4aa4;
    }
    uStack_b8 = 5;
    func_0x004f4e4c(&uStack_b0,&lStack_c8);
    lVar17 = lStack_88;
    uVar1 = *(ushort *)(lStack_88 + 0x1c2);
    uVar13 = (ulong)uVar1;
    if (uVar13 < 6) {
      *(undefined8 *)(lStack_88 + 0xa0) = uVar6;
      *(long *)(lStack_88 + 0xa8) = lVar21;
      *(undefined8 *)(lStack_88 + 0xb0) = uVar23;
      *(undefined8 *)(lStack_88 + 0xb8) = uVar24;
      *(undefined8 *)(lStack_88 + 400) = uVar3;
      *(long *)(lStack_88 + 0x1f8) = lVar14;
      *(ushort *)(lStack_88 + 0x1c2) = uVar1 + 1;
      if (uVar1 == 5) goto code_r0x004f4ba8;
    }
    else {
      _memmove(lStack_88 + 0xc0,lStack_88 + 0xa0,(uVar13 - 5) * 0x20);
      *(undefined8 *)(lVar17 + 0xa0) = uVar6;
      *(long *)(lVar17 + 0xa8) = lVar21;
      *(undefined8 *)(lVar17 + 0xb0) = uVar23;
      *(undefined8 *)(lVar17 + 0xb8) = uVar24;
      _memmove(lVar17 + 0x198,lVar17 + 400,(uVar13 - 5) * 8);
      *(undefined8 *)(lVar17 + 400) = uVar3;
      _memmove(lVar17 + 0x200,lVar17 + 0x1f8,uVar13 * 8 + -0x28);
      *(long *)(lVar17 + 0x1f8) = lVar14;
      *(ushort *)(lVar17 + 0x1c2) = uVar1 + 1;
code_r0x004f4ba8:
      lVar15 = 0x3f;
      do {
        lVar21 = *(long *)(lVar17 + lVar15 * 8);
        *(long *)(lVar21 + 0x160) = lVar17;
        *(short *)(lVar21 + 0x1c0) = (short)lVar15 + -0x39;
        lVar15 = lVar15 + 1;
      } while ((4 - uVar13) + lVar15 != 0x3f);
    }
  }
  if (lStack_a8 == -0x8000000000000000) goto FUN_004f4c6c;
  lVar15 = *(long *)(lVar17 + 0x160);
  uVar6 = uStack_b0;
  lVar21 = lStack_a8;
  uVar23 = uStack_a0;
  uVar24 = uStack_98;
  uVar3 = uStack_90;
  lVar14 = lStack_78;
  lVar20 = alStack_70[0];
  goto joined_r0x004f4940;
code_r0x004f4334:
  _memmove(plVar12 + (long)(int)unaff_x19 * 3,plVar8,unaff_x27 * 0x18);
  plVar8[1] = lVar17;
  *plVar8 = lVar11;
  unaff_x24 = unaff_x26 * 8;
  plVar8[2] = lVar15;
  unaff_x25 = unaff_x28 + 0x22;
  unaff_x23 = unaff_x19 * 8;
  unaff_x21 = unaff_x27 << 3;
  _memmove(unaff_x25 + unaff_x19,unaff_x25 + unaff_x26,unaff_x21);
  goto code_r0x004f4380;
code_r0x004f44ec:
  uStack0000000000000088[0x11] = lVar17;
  uStack0000000000000088[0x10] = lVar11;
  uStack0000000000000088[0x12] = lVar15;
  uStack0000000000000088[0x27] = unaff_x22;
  uStack0000000000000088[0x34] = (long)in_stack_00000028;
  *(ushort *)((long)uStack0000000000000088 + 0x16a) = uVar1 + 1;
  if (uVar1 == 5) {
LAB_004f4510:
    lVar9 = 0x34;
    do {
      puVar10 = (undefined8 *)plVar12[lVar9];
      *puVar10 = plVar12;
      *(short *)(puVar10 + 0x2d) = (short)lVar9 + -0x2e;
      lVar9 = lVar9 + 1;
    } while ((4 - uVar13) + lVar9 != 0x34);
  }
  goto code_r0x004f42c0;
}

