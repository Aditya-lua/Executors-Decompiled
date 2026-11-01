
void FUN_004f3a30(long *param_1,long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 *param_5)

{
  ushort uVar1;
  ushort uVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  undefined8 *puVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long unaff_x19;
  ulong uVar11;
  undefined8 unaff_x21;
  long lVar12;
  long lVar13;
  long *plVar14;
  undefined8 *unaff_x22;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 *puStack0000000000000000;
  long *plStack0000000000000018;
  int iStack0000000000000028;
  undefined4 uStack000000000000002c;
  long *in_stack_00000030;
  long lStack0000000000000060;
  ulong uStack0000000000000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  
  plStack0000000000000018 = (long *)(unaff_x19 + 0x38);
  lStack0000000000000060 = *(long *)(param_2 + 8);
  uVar20 = *(ulong *)(param_2 + 0x10);
  puStack0000000000000000 = param_5;
  _iStack0000000000000028 = param_1;
  if (uVar20 < 5) {
    uStack0000000000000068 = 4;
LAB_004f3acc:
    func_0x004f36f4(&uStack0000000000000070,(long)register0x00000008 + 0x58);
    plVar14 = (long *)(unaff_x19 + 0x30);
    plVar7 = _iStack0000000000000028;
  }
  else {
    uStack0000000000000068 = uVar20;
    if (uVar20 == 5) goto LAB_004f3acc;
    plVar14 = (long *)(unaff_x19 + 0x40);
    if (uVar20 == 6) {
      uStack0000000000000068 = 5;
      func_0x004f36f4(&uStack0000000000000070,(long)register0x00000008 + 0x58);
      uVar20 = 0;
    }
    else {
      uStack0000000000000068 = 6;
      func_0x004f36f4(&uStack0000000000000070,(long)register0x00000008 + 0x58);
      uVar20 = uVar20 - 7;
    }
    plVar7 = plStack0000000000000018;
  }
  lVar8 = *plVar14;
  lVar19 = *plVar7;
  uVar1 = *(ushort *)(lVar19 + 0x1c2);
  puVar6 = (undefined8 *)(lVar19 + uVar20 * 0x20);
  lVar12 = uVar1 - uVar20;
  if (uVar1 < uVar20 || lVar12 == 0) {
    uVar21 = *unaff_x22;
    uVar23 = unaff_x22[3];
    uVar22 = unaff_x22[2];
    puVar6[1] = unaff_x22[1];
    *puVar6 = uVar21;
    puVar6[3] = uVar23;
    puVar6[2] = uVar22;
  }
  else {
    _memmove(lVar19 + (uVar20 + 1) * 0x20,puVar6,lVar12 * 0x20);
    uVar21 = *unaff_x22;
    uVar23 = unaff_x22[3];
    uVar22 = unaff_x22[2];
    puVar6[1] = unaff_x22[1];
    *puVar6 = uVar21;
    puVar6[3] = uVar23;
    puVar6[2] = uVar22;
    _memmove(lVar19 + 0x168 + (uVar20 + 1) * 8,lVar19 + 0x168 + uVar20 * 8,lVar12 * 8);
  }
  *(undefined8 *)(lVar19 + uVar20 * 8 + 0x168) = unaff_x21;
  *(ushort *)(lVar19 + 0x1c2) = uVar1 + 1;
  if (in_stack_00000078 == -0x8000000000000000) {
FUN_004f3eb8:
    *in_stack_00000030 = lVar19;
    in_stack_00000030[1] = lVar8;
    in_stack_00000030[2] = uVar20;
    return;
  }
  lVar12 = *(long *)(in_stack_00000098 + 0x160);
  plVar14 = _iStack0000000000000028;
  uVar21 = uStack0000000000000070;
  lVar10 = in_stack_00000078;
  uVar22 = in_stack_00000080;
  uVar23 = in_stack_00000088;
  uVar3 = in_stack_00000090;
  lVar18 = in_stack_00000098;
  lVar4 = in_stack_000000a8;
  lVar17 = in_stack_000000b0;
  while (_iStack0000000000000028 = plVar14, uStack0000000000000070 = uVar21,
        in_stack_00000078 = lVar10, in_stack_00000080 = uVar22, in_stack_00000088 = uVar23,
        in_stack_00000090 = uVar3, in_stack_000000a8 = lVar4, in_stack_000000b0 = lVar17,
        lVar12 != 0) {
    if (lVar17 != in_stack_000000a0) {
      func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
      goto code_r0x004f4034;
    }
    uVar1 = *(ushort *)(lVar18 + 0x1c0);
    uVar11 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar12 + 0x1c2);
    uVar15 = (ulong)uVar2;
    if (uVar2 < 0xb) {
      iStack0000000000000028 = uVar2 + 1;
      uVar16 = uVar11 + 1;
      puVar6 = (undefined8 *)(lVar12 + uVar11 * 0x20);
      if (uVar1 < uVar2) {
        uStack000000000000002c = (undefined4)((ulong)plVar14 >> 0x20);
        _memmove(lVar12 + uVar16 * 0x20,puVar6,(uVar15 - uVar11) * 0x20);
        *puVar6 = uVar21;
        puVar6[1] = lVar10;
        lVar10 = lVar12 + 0x168;
        lVar17 = uVar11 * 8;
        lVar18 = (uVar15 - uVar11) * 8;
        puVar6[2] = uVar22;
        puVar6[3] = uVar23;
        _memmove(lVar10 + uVar16 * 8,lVar10 + lVar17,lVar18);
        *(undefined8 *)(lVar10 + lVar17) = uVar3;
        _memmove(lVar12 + 0x1c8 + lVar17 + 0x10,lVar12 + 0x1c8 + uVar16 * 8,lVar18);
      }
      else {
        *puVar6 = uVar21;
        puVar6[1] = lVar10;
        puVar6[2] = uVar22;
        puVar6[3] = uVar23;
        *(undefined8 *)(lVar12 + uVar11 * 8 + 0x168) = uVar3;
      }
      *(long *)(lVar12 + uVar16 * 8 + 0x1c8) = lVar4;
      *(short *)(lVar12 + 0x1c2) = (short)iStack0000000000000028;
      if (uVar16 < uVar15 + 2) {
        lVar10 = uVar11 + 0x3a;
        do {
          lVar18 = *(long *)(lVar12 + lVar10 * 8);
          *(long *)(lVar18 + 0x160) = lVar12;
          *(short *)(lVar18 + 0x1c0) = (short)lVar10 + -0x39;
          lVar10 = lVar10 + 1;
        } while (lVar10 - uVar15 != 0x3b);
      }
      goto FUN_004f3eb8;
    }
    lStack0000000000000060 = in_stack_000000a0 + 1;
    if (uVar1 < 5) {
      uStack0000000000000068 = 4;
      func_0x004f4e4c(&uStack0000000000000070,(long)register0x00000008 + 0x58);
      plVar14 = _iStack0000000000000028;
LAB_004f3cf4:
      lVar13 = *plVar14;
      uVar1 = *(ushort *)(lVar13 + 0x1c2);
      uVar16 = (ulong)uVar1;
      uVar15 = uVar11 + 1;
      puVar6 = (undefined8 *)(lVar13 + uVar11 * 0x20);
      lVar12 = uVar16 - uVar11;
      if (uVar16 < uVar11 || lVar12 == 0) {
        *puVar6 = uVar21;
        puVar6[1] = lVar10;
        puVar6[2] = uVar22;
        puVar6[3] = uVar23;
        *(undefined8 *)(lVar13 + uVar11 * 8 + 0x168) = uVar3;
      }
      else {
        _memmove(lVar13 + uVar15 * 0x20,puVar6,lVar12 * 0x20);
        *puVar6 = uVar21;
        puVar6[1] = lVar10;
        lVar10 = lVar13 + 0x168;
        lVar18 = uVar11 * 8;
        puVar6[2] = uVar22;
        puVar6[3] = uVar23;
        _memmove(lVar10 + uVar15 * 8,lVar10 + lVar18,lVar12 * 8);
        *(undefined8 *)(lVar10 + lVar18) = uVar3;
        _memmove(lVar13 + 0x1c8 + lVar18 + 0x10,lVar13 + 0x1c8 + uVar15 * 8,lVar12 * 8);
      }
      *(long *)(lVar13 + uVar15 * 8 + 0x1c8) = lVar4;
      *(ushort *)(lVar13 + 0x1c2) = uVar1 + 1;
      plVar14 = _iStack0000000000000028;
      uVar21 = uStack0000000000000070;
      lVar10 = in_stack_00000078;
      uVar22 = in_stack_00000080;
      uVar23 = in_stack_00000088;
      uVar3 = in_stack_00000090;
      lVar18 = in_stack_00000098;
      lVar4 = in_stack_000000a8;
      lVar17 = in_stack_000000b0;
      if (uVar15 < uVar16 + 2) {
        lVar12 = uVar11 + 0x3a;
        do {
          lVar9 = *(long *)(lVar13 + lVar12 * 8);
          *(long *)(lVar9 + 0x160) = lVar13;
          *(short *)(lVar9 + 0x1c0) = (short)lVar12 + -0x39;
          lVar12 = lVar12 + 1;
        } while (lVar12 - uVar16 != 0x3b);
      }
    }
    else {
      if (uVar1 != 5) {
        if (uVar1 == 6) {
          uStack0000000000000068 = 5;
          func_0x004f4e4c(&uStack0000000000000070,(long)register0x00000008 + 0x58);
          uVar11 = 0;
        }
        else {
          uStack0000000000000068 = 6;
          func_0x004f4e4c(&uStack0000000000000070,(long)register0x00000008 + 0x58);
          uVar11 = uVar11 - 7;
        }
        plVar14 = plStack0000000000000018;
        goto LAB_004f3cf4;
      }
      uStack0000000000000068 = 5;
      func_0x004f4e4c(&uStack0000000000000070,(long)register0x00000008 + 0x58);
      lVar18 = in_stack_00000098;
      uVar1 = *(ushort *)(in_stack_00000098 + 0x1c2);
      uVar11 = (ulong)uVar1;
      if (uVar11 < 6) {
        *(undefined8 *)(in_stack_00000098 + 0xa0) = uVar21;
        *(long *)(in_stack_00000098 + 0xa8) = lVar10;
        *(undefined8 *)(in_stack_00000098 + 0xb0) = uVar22;
        *(undefined8 *)(in_stack_00000098 + 0xb8) = uVar23;
        *(undefined8 *)(in_stack_00000098 + 400) = uVar3;
        *(long *)(in_stack_00000098 + 0x1f8) = lVar4;
        *(ushort *)(in_stack_00000098 + 0x1c2) = uVar1 + 1;
        plVar14 = _iStack0000000000000028;
        uVar21 = uStack0000000000000070;
        lVar10 = in_stack_00000078;
        uVar22 = in_stack_00000080;
        uVar23 = in_stack_00000088;
        uVar3 = in_stack_00000090;
        lVar4 = in_stack_000000a8;
        lVar17 = in_stack_000000b0;
        if (uVar1 == 5) goto code_r0x004f3df8;
      }
      else {
        _memmove(in_stack_00000098 + 0xc0,in_stack_00000098 + 0xa0,(uVar11 - 5) * 0x20);
        *(undefined8 *)(lVar18 + 0xa0) = uVar21;
        *(long *)(lVar18 + 0xa8) = lVar10;
        *(undefined8 *)(lVar18 + 0xb0) = uVar22;
        *(undefined8 *)(lVar18 + 0xb8) = uVar23;
        _memmove(lVar18 + 0x198,lVar18 + 400,(uVar11 - 5) * 8);
        *(undefined8 *)(lVar18 + 400) = uVar3;
        _memmove(lVar18 + 0x200,lVar18 + 0x1f8,uVar11 * 8 + -0x28);
        *(long *)(lVar18 + 0x1f8) = lVar4;
        *(ushort *)(lVar18 + 0x1c2) = uVar1 + 1;
code_r0x004f3df8:
        lVar12 = 0x3f;
        do {
          lVar10 = *(long *)(lVar18 + lVar12 * 8);
          *(long *)(lVar10 + 0x160) = lVar18;
          *(short *)(lVar10 + 0x1c0) = (short)lVar12 + -0x39;
          lVar12 = lVar12 + 1;
          plVar14 = _iStack0000000000000028;
          uVar21 = uStack0000000000000070;
          lVar10 = in_stack_00000078;
          uVar22 = in_stack_00000080;
          uVar23 = in_stack_00000088;
          uVar3 = in_stack_00000090;
          lVar4 = in_stack_000000a8;
          lVar17 = in_stack_000000b0;
        } while ((4 - uVar11) + lVar12 != 0x3f);
      }
    }
    if (lVar10 == -0x8000000000000000) goto FUN_004f3eb8;
    lVar12 = *(long *)(lVar18 + 0x160);
  }
  plVar14 = (long *)*puStack0000000000000000;
  lVar12 = *plVar14;
  if (lVar12 == 0) {
    func_0x007a23bc(&UNK_009e8340);
  }
  else {
    lVar18 = plVar14[1];
    puVar6 = (undefined8 *)func_0x00187bd0(0x228,8);
    if (puVar6 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x228);
    }
    else {
      puVar6[0x2c] = 0;
      *(undefined2 *)((long)puVar6 + 0x1c2) = 0;
      puVar6[0x39] = lVar12;
      *(undefined8 **)(lVar12 + 0x160) = puVar6;
      *(undefined2 *)(lVar12 + 0x1c0) = 0;
      *plVar14 = (long)puVar6;
      plVar14[1] = lVar18 + 1;
      if (lVar17 == lVar18) {
        *(undefined2 *)((long)puVar6 + 0x1c2) = 1;
        *puVar6 = uVar21;
        puVar6[1] = lVar10;
        puVar6[2] = uVar22;
        puVar6[3] = uVar23;
        puVar6[0x2d] = uVar3;
        puVar6[0x3a] = lVar4;
        *(undefined8 **)(lVar4 + 0x160) = puVar6;
        *(undefined2 *)(lVar4 + 0x1c0) = 1;
        goto FUN_004f3eb8;
      }
      func_0x007a247c(&UNK_008a3c1b,0x30,&UNK_009e8370);
    }
  }
code_r0x004f4034:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x4f4038);
  (*pcVar5)();
}

