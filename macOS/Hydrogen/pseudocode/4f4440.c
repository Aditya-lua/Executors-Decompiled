
/* WARNING: Type propagation algorithm not settling */

void FUN_004f4440(undefined8 param_1,undefined8 param_2,long param_3,undefined8 *param_4)

{
  ushort uVar1;
  ushort uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined *puVar7;
  long *extraout_x8;
  long *plVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong unaff_x19;
  long lVar12;
  short unaff_w20;
  ulong uVar13;
  long *plVar14;
  ulong uVar15;
  long *plVar16;
  long *unaff_x21;
  long *unaff_x22;
  undefined8 *unaff_x24;
  long lVar17;
  ulong uVar18;
  int iVar19;
  undefined8 unaff_x25;
  uint uVar20;
  ulong uVar21;
  long lVar22;
  long unaff_x27;
  long lVar23;
  long lVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined1 auVar27 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 *in_stack_00000020;
  long lStack0000000000000050;
  long lStack0000000000000058;
  long lStack0000000000000060;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  long *in_stack_00000098;
  long in_stack_000000a0;
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
  
code_r0x004f4440:
  _memmove(unaff_x21 + 0x35,unaff_x21 + 0x34,param_3);
  unaff_x21[0x34] = (long)unaff_x22;
  *(short *)((long)unaff_x21 + 0x16a) = unaff_w20;
LAB_004f4510:
  lVar9 = 0x34;
  do {
    puVar10 = (undefined8 *)unaff_x21[lVar9];
    *puVar10 = unaff_x21;
    *(short *)(puVar10 + 0x2d) = (short)lVar9 + -0x2e;
    lVar9 = lVar9 + 1;
  } while ((4 - unaff_x19) + lVar9 != 0x34);
code_r0x004f453c:
  lStack0000000000000058 = unaff_x24[5];
  lStack0000000000000050 = unaff_x24[4];
  lStack0000000000000060 = unaff_x24[6];
  do {
    lVar23 = in_stack_000000c0;
    lVar9 = in_stack_000000a0;
    unaff_x22 = in_stack_00000098;
    lVar24 = *unaff_x21;
    if (lVar24 == 0) {
      in_stack_00000020 = (undefined8 *)*in_stack_00000020;
      puVar10 = (undefined8 *)*in_stack_00000020;
      if (puVar10 == (undefined8 *)0x0) goto code_r0x004f472c;
      lVar12 = in_stack_00000020[1];
      puVar5 = (undefined8 *)func_0x00187bd0(0x1d0,8);
      if (puVar5 == (undefined8 *)0x0) goto code_r0x004f4738;
      *puVar5 = 0;
      *(undefined2 *)((long)puVar5 + 0x16a) = 0;
      puVar5[0x2e] = puVar10;
      *puVar10 = puVar5;
      *(undefined2 *)(puVar10 + 0x2d) = 0;
      *in_stack_00000020 = puVar5;
      in_stack_00000020[1] = lVar12 + 1;
      if (lVar9 == lVar12) {
        *(undefined2 *)((long)puVar5 + 0x16a) = 1;
        puVar5[2] = lStack0000000000000058;
        puVar5[1] = lStack0000000000000050;
        puVar5[3] = lStack0000000000000060;
        puVar5[0x22] = lVar23;
        puVar5[0x2f] = unaff_x22;
        *unaff_x22 = (long)puVar5;
        *(undefined2 *)(unaff_x22 + 0x2d) = 1;
        *in_stack_00000018 = in_stack_00000008;
        in_stack_00000018[1] = in_stack_00000000;
        in_stack_00000018[2] = in_stack_00000010;
        return;
      }
      puVar7 = &UNK_009e8370;
      uVar6 = func_0x007a247c(&UNK_008a3c1b,0x30);
      func_0x007a200c(&uStack0000000000000088);
      __Unwind_Resume(uVar6);
      auVar27 = func_0x007a2668();
      puVar5 = auVar27._8_8_;
      plVar14 = auVar27._0_8_;
      lStack_38 = lVar23;
      lVar23 = *plVar14;
      uVar1 = *(ushort *)(lVar23 + 0x1c2);
      lStack_60 = lVar24;
      lStack_58 = unaff_x27;
      lStack_50 = lVar9;
      uStack_48 = unaff_x25;
      puStack_40 = unaff_x24;
      plStack_30 = unaff_x22;
      lStack_28 = lVar12;
      puStack_20 = puVar10;
      uStack_18 = uVar6;
      if (uVar1 < 0xb) {
        lVar9 = plVar14[1];
        uVar21 = plVar14[2];
        uVar15 = uVar21 + 1;
        puVar10 = (undefined8 *)(lVar23 + uVar21 * 0x20);
        if (uVar1 < uVar15) {
          uVar6 = *puVar5;
          uVar26 = puVar5[3];
          uVar25 = puVar5[2];
          puVar10[1] = puVar5[1];
          *puVar10 = uVar6;
          puVar10[3] = uVar26;
          puVar10[2] = uVar25;
        }
        else {
          lVar24 = uVar1 - uVar21;
          _memmove(lVar23 + uVar15 * 0x20,puVar10,lVar24 * 0x20);
          uVar6 = *puVar5;
          uVar26 = puVar5[3];
          uVar25 = puVar5[2];
          puVar10[1] = puVar5[1];
          *puVar10 = uVar6;
          puVar10[3] = uVar26;
          puVar10[2] = uVar25;
          _memmove(lVar23 + 0x168 + uVar15 * 8,lVar23 + 0x168 + uVar21 * 8,lVar24 * 8);
        }
        *(undefined **)(lVar23 + uVar21 * 8 + 0x168) = puVar7;
        *(ushort *)(lVar23 + 0x1c2) = uVar1 + 1;
        goto FUN_004f4c6c;
      }
      lStack_c0 = plVar14[1];
      uVar21 = plVar14[2];
      lStack_c8 = lVar23;
      if (uVar21 < 5) {
        uStack_b8 = 4;
LAB_004f487c:
        func_0x004f36f4(&uStack_b0,&lStack_c8);
        plVar14 = &lStack_80;
        plVar8 = &lStack_88;
      }
      else {
        uStack_b8 = uVar21;
        if (uVar21 == 5) goto LAB_004f487c;
        plVar14 = alStack_70;
        if (uVar21 == 6) {
          uStack_b8 = 5;
          func_0x004f36f4(&uStack_b0,&lStack_c8);
          uVar21 = 0;
        }
        else {
          uStack_b8 = 6;
          func_0x004f36f4(&uStack_b0,&lStack_c8);
          uVar21 = uVar21 - 7;
        }
        plVar8 = &lStack_78;
      }
      lVar9 = *plVar14;
      lVar23 = *plVar8;
      uVar1 = *(ushort *)(lVar23 + 0x1c2);
      puVar10 = (undefined8 *)(lVar23 + uVar21 * 0x20);
      lVar24 = uVar1 - uVar21;
      if (uVar1 < uVar21 || lVar24 == 0) {
        uVar6 = *puVar5;
        uVar26 = puVar5[3];
        uVar25 = puVar5[2];
        puVar10[1] = puVar5[1];
        *puVar10 = uVar6;
        puVar10[3] = uVar26;
        puVar10[2] = uVar25;
      }
      else {
        _memmove(lVar23 + (uVar21 + 1) * 0x20,puVar10,lVar24 * 0x20);
        uVar6 = *puVar5;
        uVar26 = puVar5[3];
        uVar25 = puVar5[2];
        puVar10[1] = puVar5[1];
        *puVar10 = uVar6;
        puVar10[3] = uVar26;
        puVar10[2] = uVar25;
        _memmove(lVar23 + 0x168 + (uVar21 + 1) * 8,lVar23 + 0x168 + uVar21 * 8,lVar24 * 8);
      }
      *(undefined **)(lVar23 + uVar21 * 8 + 0x168) = puVar7;
      *(ushort *)(lVar23 + 0x1c2) = uVar1 + 1;
      if (lStack_a8 == -0x8000000000000000) goto FUN_004f4c6c;
      lVar12 = *(long *)(lStack_88 + 0x160);
      uVar6 = uStack_b0;
      lVar17 = lStack_a8;
      uVar25 = uStack_a0;
      uVar26 = uStack_98;
      uVar3 = uStack_90;
      lVar24 = lStack_88;
      lVar11 = lStack_78;
      lVar22 = alStack_70[0];
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
    uVar1 = *(ushort *)(unaff_x21 + 0x2d);
    uVar21 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar24 + 0x16a);
    uVar15 = (ulong)uVar2;
    uVar20 = (uint)uVar1;
    if (uVar2 < 0xb) {
      uVar13 = uVar21 + 1;
      plVar14 = (long *)(lVar24 + 8 + uVar21 * 0x18);
      if (uVar20 < uVar2) {
        _memmove(lVar24 + 8 + uVar13 * 0x18,plVar14,(uVar15 - uVar21) * 0x18);
        plVar14[1] = lStack0000000000000058;
        *plVar14 = lStack0000000000000050;
        lVar12 = uVar21 * 8;
        plVar14[2] = lStack0000000000000060;
        lVar9 = lVar24 + 0x110;
        lVar17 = (uVar15 - uVar21) * 8;
        _memmove(lVar9 + uVar13 * 8,lVar9 + lVar12,lVar17);
        *(long *)(lVar9 + lVar12) = lVar23;
        _memmove(lVar24 + 0x170 + lVar12 + 0x10,lVar24 + 0x170 + uVar13 * 8,lVar17);
      }
      else {
        plVar14[1] = lStack0000000000000058;
        *plVar14 = lStack0000000000000050;
        plVar14[2] = lStack0000000000000060;
        *(long *)(lVar24 + uVar21 * 8 + 0x110) = in_stack_000000c0;
      }
      *(long **)(lVar24 + uVar13 * 8 + 0x170) = unaff_x22;
      *(ushort *)(lVar24 + 0x16a) = uVar2 + 1;
      if (uVar13 < uVar15 + 2) {
        lVar9 = uVar21 + 0x2f;
        do {
          plVar14 = *(long **)(lVar24 + lVar9 * 8);
          *plVar14 = lVar24;
          *(short *)(plVar14 + 0x2d) = (short)lVar9 + -0x2e;
          lVar9 = lVar9 + 1;
        } while (lVar9 - uVar15 != 0x30);
      }
      goto LAB_004f46e0;
    }
    in_stack_00000078 = in_stack_00000090 + 1;
    iVar19 = (int)unaff_x25;
    uStack0000000000000070 = lVar24;
    if (uVar1 < 5) {
      in_stack_00000080 = 4;
      func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
      uVar13 = (ulong)*(ushort *)((long)uStack0000000000000088 + 0x16a);
      plVar14 = uStack0000000000000088 + 1;
      uVar15 = uVar21 + 1;
      plVar16 = (long *)((long)plVar14 + (long)(int)uVar20 * (long)iVar19);
      unaff_x27 = uVar13 - uVar21;
      plVar8 = uStack0000000000000088;
      if (!(uVar13 < uVar21 || unaff_x27 == 0)) goto code_r0x004f4334;
code_r0x004f448c:
      plVar16[1] = lStack0000000000000058;
      *plVar16 = lStack0000000000000050;
      plVar16[2] = lStack0000000000000060;
      plVar8[uVar21 + 0x22] = lVar23;
    }
    else {
      if (uVar1 == 5) goto code_r0x004f43d4;
      if (uVar20 == 6) {
        in_stack_00000080 = 5;
        func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
        uVar21 = 0;
      }
      else {
        in_stack_00000080 = 6;
        func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
        uVar21 = uVar21 - 7;
      }
      uVar13 = (ulong)*(ushort *)((long)in_stack_00000098 + 0x16a);
      plVar14 = in_stack_00000098 + 1;
      uVar15 = uVar21 + 1;
      plVar16 = (long *)((long)plVar14 + (long)(int)uVar21 * (long)iVar19);
      unaff_x27 = uVar13 - uVar21;
      plVar8 = in_stack_00000098;
      if (!(uVar21 <= uVar13 && unaff_x27 != 0)) goto code_r0x004f448c;
code_r0x004f4334:
      _memmove((long *)((long)plVar14 + (long)(int)uVar15 * (long)iVar19),plVar16,unaff_x27 * 0x18);
      plVar16[1] = lStack0000000000000058;
      *plVar16 = lStack0000000000000050;
      plVar16[2] = lStack0000000000000060;
      _memmove(plVar8 + uVar15 + 0x22,plVar8 + uVar21 + 0x22,unaff_x27 << 3);
      plVar8[uVar21 + 0x22] = lVar23;
      unaff_x25 = 0x18;
      unaff_x24 = &uStack0000000000000088;
      _memmove(plVar8 + uVar21 + 0x30,plVar8 + uVar15 + 0x2e,unaff_x27 << 3);
    }
    plVar8[uVar15 + 0x2e] = (long)unaff_x22;
    *(short *)((long)plVar8 + 0x16a) = (short)uVar13 + 1;
    if (uVar15 < uVar13 + 2) {
      lVar9 = uVar21 + 0x2f;
      do {
        puVar10 = (undefined8 *)plVar8[lVar9];
        *puVar10 = plVar8;
        *(short *)(puVar10 + 0x2d) = (short)lVar9 + -0x2e;
        lVar9 = lVar9 + 1;
      } while (lVar9 - uVar13 != 0x30);
    }
    lStack0000000000000058 = unaff_x24[5];
    lStack0000000000000050 = unaff_x24[4];
    lStack0000000000000060 = unaff_x24[6];
    unaff_x21 = uStack0000000000000088;
    if (uStack0000000000000088 == (long *)0x0) {
LAB_004f46e0:
      *in_stack_00000018 = in_stack_00000008;
      in_stack_00000018[1] = in_stack_00000000;
      in_stack_00000018[2] = in_stack_00000010;
      return;
    }
  } while( true );
joined_r0x004f4940:
  if (lVar12 == 0) {
    plVar14 = (long *)*param_4;
    lVar24 = *plVar14;
    if (lVar24 == 0) {
      func_0x007a23bc(&UNK_009e8340);
    }
    else {
      lVar12 = plVar14[1];
      puVar10 = (undefined8 *)func_0x00187bd0(0x228,8);
      if (puVar10 == (undefined8 *)0x0) {
        func_0x007a1f18(8,0x228);
      }
      else {
        puVar10[0x2c] = 0;
        *(undefined2 *)((long)puVar10 + 0x1c2) = 0;
        puVar10[0x39] = lVar24;
        *(undefined8 **)(lVar24 + 0x160) = puVar10;
        *(undefined2 *)(lVar24 + 0x1c0) = 0;
        *plVar14 = (long)puVar10;
        plVar14[1] = lVar12 + 1;
        if (lVar22 == lVar12) {
          *(undefined2 *)((long)puVar10 + 0x1c2) = 1;
          *puVar10 = uVar6;
          puVar10[1] = lVar17;
          puVar10[2] = uVar25;
          puVar10[3] = uVar26;
          puVar10[0x2d] = uVar3;
          puVar10[0x3a] = lVar11;
          *(undefined8 **)(lVar11 + 0x160) = puVar10;
          *(undefined2 *)(lVar11 + 0x1c0) = 1;
FUN_004f4c6c:
          *extraout_x8 = lVar23;
          extraout_x8[1] = lVar9;
          extraout_x8[2] = uVar21;
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
  if (lVar22 != lStack_80) {
    func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
    goto code_r0x004f4de4;
  }
  uVar1 = *(ushort *)(lVar24 + 0x1c0);
  uVar15 = (ulong)uVar1;
  uVar2 = *(ushort *)(lVar12 + 0x1c2);
  uVar13 = (ulong)uVar2;
  if (uVar2 < 0xb) {
    uVar18 = uVar15 + 1;
    puVar10 = (undefined8 *)(lVar12 + uVar15 * 0x20);
    if (uVar1 < uVar2) {
      _memmove(lVar12 + uVar18 * 0x20,puVar10,(uVar13 - uVar15) * 0x20);
      *puVar10 = uVar6;
      puVar10[1] = lVar17;
      lVar24 = lVar12 + 0x168;
      lVar22 = uVar15 * 8;
      lVar17 = (uVar13 - uVar15) * 8;
      puVar10[2] = uVar25;
      puVar10[3] = uVar26;
      _memmove(lVar24 + uVar18 * 8,lVar24 + lVar22,lVar17);
      *(undefined8 *)(lVar24 + lVar22) = uVar3;
      _memmove(lVar12 + 0x1c8 + lVar22 + 0x10,lVar12 + 0x1c8 + uVar18 * 8,lVar17);
    }
    else {
      *puVar10 = uVar6;
      puVar10[1] = lVar17;
      puVar10[2] = uVar25;
      puVar10[3] = uVar26;
      *(undefined8 *)(lVar12 + uVar15 * 8 + 0x168) = uVar3;
    }
    *(long *)(lVar12 + uVar18 * 8 + 0x1c8) = lVar11;
    *(ushort *)(lVar12 + 0x1c2) = uVar2 + 1;
    if (uVar18 < uVar13 + 2) {
      lVar24 = uVar15 + 0x3a;
      do {
        lVar17 = *(long *)(lVar12 + lVar24 * 8);
        *(long *)(lVar17 + 0x160) = lVar12;
        *(short *)(lVar17 + 0x1c0) = (short)lVar24 + -0x39;
        lVar24 = lVar24 + 1;
      } while (lVar24 - uVar13 != 0x3b);
    }
    goto FUN_004f4c6c;
  }
  lStack_c0 = lStack_80 + 1;
  lStack_c8 = lVar12;
  uStack_b0 = uVar6;
  lStack_a8 = lVar17;
  uStack_a0 = uVar25;
  uStack_98 = uVar26;
  uStack_90 = uVar3;
  lStack_78 = lVar11;
  alStack_70[0] = lVar22;
  if (uVar1 < 5) {
    uStack_b8 = 4;
    func_0x004f4e4c(&uStack_b0,&lStack_c8);
    plVar14 = &lStack_88;
FUN_004f4aa4:
    lVar12 = *plVar14;
    uVar1 = *(ushort *)(lVar12 + 0x1c2);
    uVar18 = (ulong)uVar1;
    uVar13 = uVar15 + 1;
    puVar10 = (undefined8 *)(lVar12 + uVar15 * 0x20);
    lVar24 = uVar18 - uVar15;
    if (uVar18 < uVar15 || lVar24 == 0) {
      *puVar10 = uVar6;
      puVar10[1] = lVar17;
      puVar10[2] = uVar25;
      puVar10[3] = uVar26;
      *(undefined8 *)(lVar12 + uVar15 * 8 + 0x168) = uVar3;
    }
    else {
      _memmove(lVar12 + uVar13 * 0x20,puVar10,lVar24 * 0x20);
      *puVar10 = uVar6;
      puVar10[1] = lVar17;
      lVar17 = lVar12 + 0x168;
      lVar22 = uVar15 * 8;
      puVar10[2] = uVar25;
      puVar10[3] = uVar26;
      _memmove(lVar17 + uVar13 * 8,lVar17 + lVar22,lVar24 * 8);
      *(undefined8 *)(lVar17 + lVar22) = uVar3;
      _memmove(lVar12 + 0x1c8 + lVar22 + 0x10,lVar12 + 0x1c8 + uVar13 * 8,lVar24 * 8);
    }
    *(long *)(lVar12 + uVar13 * 8 + 0x1c8) = lVar11;
    *(ushort *)(lVar12 + 0x1c2) = uVar1 + 1;
    lVar24 = lStack_88;
    if (uVar13 < uVar18 + 2) {
      lVar17 = uVar15 + 0x3a;
      do {
        lVar11 = *(long *)(lVar12 + lVar17 * 8);
        *(long *)(lVar11 + 0x160) = lVar12;
        *(short *)(lVar11 + 0x1c0) = (short)lVar17 + -0x39;
        lVar17 = lVar17 + 1;
      } while (lVar17 - uVar18 != 0x3b);
    }
  }
  else {
    if (uVar1 != 5) {
      if (uVar1 == 6) {
        uStack_b8 = 5;
        func_0x004f4e4c(&uStack_b0,&lStack_c8);
        uVar15 = 0;
      }
      else {
        uStack_b8 = 6;
        func_0x004f4e4c(&uStack_b0,&lStack_c8);
        uVar15 = uVar15 - 7;
      }
      plVar14 = &lStack_78;
      goto FUN_004f4aa4;
    }
    uStack_b8 = 5;
    func_0x004f4e4c(&uStack_b0,&lStack_c8);
    lVar24 = lStack_88;
    uVar1 = *(ushort *)(lStack_88 + 0x1c2);
    uVar15 = (ulong)uVar1;
    if (uVar15 < 6) {
      *(undefined8 *)(lStack_88 + 0xa0) = uVar6;
      *(long *)(lStack_88 + 0xa8) = lVar17;
      *(undefined8 *)(lStack_88 + 0xb0) = uVar25;
      *(undefined8 *)(lStack_88 + 0xb8) = uVar26;
      *(undefined8 *)(lStack_88 + 400) = uVar3;
      *(long *)(lStack_88 + 0x1f8) = lVar11;
      *(ushort *)(lStack_88 + 0x1c2) = uVar1 + 1;
      if (uVar1 == 5) goto code_r0x004f4ba8;
    }
    else {
      _memmove(lStack_88 + 0xc0,lStack_88 + 0xa0,(uVar15 - 5) * 0x20);
      *(undefined8 *)(lVar24 + 0xa0) = uVar6;
      *(long *)(lVar24 + 0xa8) = lVar17;
      *(undefined8 *)(lVar24 + 0xb0) = uVar25;
      *(undefined8 *)(lVar24 + 0xb8) = uVar26;
      _memmove(lVar24 + 0x198,lVar24 + 400,(uVar15 - 5) * 8);
      *(undefined8 *)(lVar24 + 400) = uVar3;
      _memmove(lVar24 + 0x200,lVar24 + 0x1f8,uVar15 * 8 + -0x28);
      *(long *)(lVar24 + 0x1f8) = lVar11;
      *(ushort *)(lVar24 + 0x1c2) = uVar1 + 1;
code_r0x004f4ba8:
      lVar12 = 0x3f;
      do {
        lVar17 = *(long *)(lVar24 + lVar12 * 8);
        *(long *)(lVar17 + 0x160) = lVar24;
        *(short *)(lVar17 + 0x1c0) = (short)lVar12 + -0x39;
        lVar12 = lVar12 + 1;
      } while ((4 - uVar15) + lVar12 != 0x3f);
    }
  }
  if (lStack_a8 == -0x8000000000000000) goto FUN_004f4c6c;
  lVar12 = *(long *)(lVar24 + 0x160);
  uVar6 = uStack_b0;
  lVar17 = lStack_a8;
  uVar25 = uStack_a0;
  uVar26 = uStack_98;
  uVar3 = uStack_90;
  lVar11 = lStack_78;
  lVar22 = alStack_70[0];
  goto joined_r0x004f4940;
code_r0x004f43d4:
  in_stack_00000080 = 5;
  func_0x004f5064(&uStack0000000000000088,&uStack0000000000000070);
  unaff_x21 = uStack0000000000000088;
  uVar1 = *(ushort *)((long)uStack0000000000000088 + 0x16a);
  unaff_x19 = (ulong)uVar1;
  unaff_w20 = uVar1 + 1;
  if (5 < unaff_x19) {
    _memmove(uStack0000000000000088 + 0x13,uStack0000000000000088 + 0x10,(unaff_x19 - 5) * 0x18);
    unaff_x21[0x11] = lStack0000000000000058;
    unaff_x21[0x10] = lStack0000000000000050;
    unaff_x21[0x12] = lStack0000000000000060;
    _memmove(unaff_x21 + 0x28,unaff_x21 + 0x27,(unaff_x19 - 5) * 8);
    unaff_x21[0x27] = lVar23;
    param_3 = unaff_x19 * 8 + -0x28;
    goto code_r0x004f4440;
  }
  uStack0000000000000088[0x11] = lStack0000000000000058;
  uStack0000000000000088[0x10] = lStack0000000000000050;
  uStack0000000000000088[0x12] = lStack0000000000000060;
  uStack0000000000000088[0x27] = lVar23;
  uStack0000000000000088[0x34] = (long)unaff_x22;
  *(short *)((long)uStack0000000000000088 + 0x16a) = unaff_w20;
  if (uVar1 == 5) goto LAB_004f4510;
  goto code_r0x004f453c;
}

