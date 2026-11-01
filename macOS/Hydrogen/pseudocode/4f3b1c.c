
void FUN_004f3b1c(void)

{
  ushort uVar1;
  ushort uVar2;
  undefined8 uVar3;
  long lVar4;
  code *pcVar5;
  bool in_ZR;
  bool in_CY;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  short unaff_w19;
  long unaff_x20;
  ulong uVar9;
  undefined8 unaff_x21;
  long lVar10;
  long lVar11;
  long *plVar12;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 *in_stack_00000000;
  long in_stack_00000010;
  long *in_stack_00000018;
  long *in_stack_00000028;
  long *in_stack_00000030;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  
  if (!in_CY || in_ZR) {
    uVar17 = *unaff_x22;
    uVar19 = unaff_x22[3];
    uVar18 = unaff_x22[2];
    unaff_x23[1] = unaff_x22[1];
    *unaff_x23 = uVar17;
    unaff_x23[3] = uVar19;
    unaff_x23[2] = uVar18;
  }
  else {
    _memmove(unaff_x27 + (unaff_x28 + 1) * 0x20);
    uVar17 = *unaff_x22;
    uVar19 = unaff_x22[3];
    uVar18 = unaff_x22[2];
    unaff_x23[1] = unaff_x22[1];
    *unaff_x23 = uVar17;
    unaff_x23[3] = uVar19;
    unaff_x23[2] = uVar18;
    _memmove(unaff_x27 + 0x168 + (unaff_x28 + 1) * 8,unaff_x27 + 0x168 + unaff_x28 * 8,
             unaff_x20 << 3);
  }
  *(undefined8 *)(unaff_x27 + unaff_x28 * 8 + 0x168) = unaff_x21;
  *(short *)(unaff_x27 + 0x1c2) = unaff_w19 + 1;
  if (in_stack_00000078 == -0x8000000000000000) {
FUN_004f3eb8:
    *in_stack_00000030 = unaff_x27;
    in_stack_00000030[1] = in_stack_00000010;
    in_stack_00000030[2] = unaff_x28;
    return;
  }
  lVar10 = *(long *)(in_stack_00000098 + 0x160);
  uVar17 = uStack0000000000000070;
  lVar8 = in_stack_00000078;
  uVar18 = in_stack_00000080;
  uVar19 = in_stack_00000088;
  uVar3 = in_stack_00000090;
  lVar16 = in_stack_00000098;
  lVar4 = in_stack_000000a8;
  lVar15 = in_stack_000000b0;
  while (uStack0000000000000070 = uVar17, in_stack_00000078 = lVar8, in_stack_00000080 = uVar18,
        in_stack_00000088 = uVar19, in_stack_00000090 = uVar3, in_stack_000000a8 = lVar4,
        in_stack_000000b0 = lVar15, lVar10 != 0) {
    if (lVar15 != in_stack_000000a0) {
      func_0x007a247c(&UNK_008a3c73,0x35,&UNK_009e83d0);
      goto code_r0x004f4034;
    }
    uVar1 = *(ushort *)(lVar16 + 0x1c0);
    uVar9 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar10 + 0x1c2);
    uVar13 = (ulong)uVar2;
    if (uVar2 < 0xb) {
      uVar14 = uVar9 + 1;
      puVar6 = (undefined8 *)(lVar10 + uVar9 * 0x20);
      if (uVar1 < uVar2) {
        _memmove(lVar10 + uVar14 * 0x20,puVar6,(uVar13 - uVar9) * 0x20);
        *puVar6 = uVar17;
        puVar6[1] = lVar8;
        lVar8 = lVar10 + 0x168;
        lVar15 = uVar9 * 8;
        lVar16 = (uVar13 - uVar9) * 8;
        puVar6[2] = uVar18;
        puVar6[3] = uVar19;
        _memmove(lVar8 + uVar14 * 8,lVar8 + lVar15,lVar16);
        *(undefined8 *)(lVar8 + lVar15) = uVar3;
        _memmove(lVar10 + 0x1c8 + lVar15 + 0x10,lVar10 + 0x1c8 + uVar14 * 8,lVar16);
      }
      else {
        *puVar6 = uVar17;
        puVar6[1] = lVar8;
        puVar6[2] = uVar18;
        puVar6[3] = uVar19;
        *(undefined8 *)(lVar10 + uVar9 * 8 + 0x168) = uVar3;
      }
      *(long *)(lVar10 + uVar14 * 8 + 0x1c8) = lVar4;
      *(ushort *)(lVar10 + 0x1c2) = uVar2 + 1;
      if (uVar14 < uVar13 + 2) {
        lVar8 = uVar9 + 0x3a;
        do {
          lVar16 = *(long *)(lVar10 + lVar8 * 8);
          *(long *)(lVar16 + 0x160) = lVar10;
          *(short *)(lVar16 + 0x1c0) = (short)lVar8 + -0x39;
          lVar8 = lVar8 + 1;
        } while (lVar8 - uVar13 != 0x3b);
      }
      goto FUN_004f3eb8;
    }
    in_stack_00000060 = in_stack_000000a0 + 1;
    uStack0000000000000058 = lVar10;
    if (uVar1 < 5) {
      in_stack_00000068 = 4;
      func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
      plVar12 = in_stack_00000028;
LAB_004f3cf4:
      lVar11 = *plVar12;
      uVar1 = *(ushort *)(lVar11 + 0x1c2);
      uVar14 = (ulong)uVar1;
      uVar13 = uVar9 + 1;
      puVar6 = (undefined8 *)(lVar11 + uVar9 * 0x20);
      lVar10 = uVar14 - uVar9;
      if (uVar14 < uVar9 || lVar10 == 0) {
        *puVar6 = uVar17;
        puVar6[1] = lVar8;
        puVar6[2] = uVar18;
        puVar6[3] = uVar19;
        *(undefined8 *)(lVar11 + uVar9 * 8 + 0x168) = uVar3;
      }
      else {
        _memmove(lVar11 + uVar13 * 0x20,puVar6,lVar10 * 0x20);
        *puVar6 = uVar17;
        puVar6[1] = lVar8;
        lVar8 = lVar11 + 0x168;
        lVar16 = uVar9 * 8;
        puVar6[2] = uVar18;
        puVar6[3] = uVar19;
        _memmove(lVar8 + uVar13 * 8,lVar8 + lVar16,lVar10 * 8);
        *(undefined8 *)(lVar8 + lVar16) = uVar3;
        _memmove(lVar11 + 0x1c8 + lVar16 + 0x10,lVar11 + 0x1c8 + uVar13 * 8,lVar10 * 8);
      }
      *(long *)(lVar11 + uVar13 * 8 + 0x1c8) = lVar4;
      *(ushort *)(lVar11 + 0x1c2) = uVar1 + 1;
      uVar17 = uStack0000000000000070;
      lVar8 = in_stack_00000078;
      uVar18 = in_stack_00000080;
      uVar19 = in_stack_00000088;
      uVar3 = in_stack_00000090;
      lVar16 = in_stack_00000098;
      lVar4 = in_stack_000000a8;
      lVar15 = in_stack_000000b0;
      if (uVar13 < uVar14 + 2) {
        lVar10 = uVar9 + 0x3a;
        do {
          lVar7 = *(long *)(lVar11 + lVar10 * 8);
          *(long *)(lVar7 + 0x160) = lVar11;
          *(short *)(lVar7 + 0x1c0) = (short)lVar10 + -0x39;
          lVar10 = lVar10 + 1;
        } while (lVar10 - uVar14 != 0x3b);
      }
    }
    else {
      if (uVar1 != 5) {
        if (uVar1 == 6) {
          in_stack_00000068 = 5;
          func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
          uVar9 = 0;
        }
        else {
          in_stack_00000068 = 6;
          func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
          uVar9 = uVar9 - 7;
        }
        plVar12 = in_stack_00000018;
        goto LAB_004f3cf4;
      }
      in_stack_00000068 = 5;
      func_0x004f4e4c(&uStack0000000000000070,&uStack0000000000000058);
      lVar16 = in_stack_00000098;
      uVar1 = *(ushort *)(in_stack_00000098 + 0x1c2);
      uVar9 = (ulong)uVar1;
      if (uVar9 < 6) {
        *(undefined8 *)(in_stack_00000098 + 0xa0) = uVar17;
        *(long *)(in_stack_00000098 + 0xa8) = lVar8;
        *(undefined8 *)(in_stack_00000098 + 0xb0) = uVar18;
        *(undefined8 *)(in_stack_00000098 + 0xb8) = uVar19;
        *(undefined8 *)(in_stack_00000098 + 400) = uVar3;
        *(long *)(in_stack_00000098 + 0x1f8) = lVar4;
        *(ushort *)(in_stack_00000098 + 0x1c2) = uVar1 + 1;
        uVar17 = uStack0000000000000070;
        lVar8 = in_stack_00000078;
        uVar18 = in_stack_00000080;
        uVar19 = in_stack_00000088;
        uVar3 = in_stack_00000090;
        lVar4 = in_stack_000000a8;
        lVar15 = in_stack_000000b0;
        if (uVar1 == 5) goto code_r0x004f3df8;
      }
      else {
        _memmove(in_stack_00000098 + 0xc0,in_stack_00000098 + 0xa0,(uVar9 - 5) * 0x20);
        *(undefined8 *)(lVar16 + 0xa0) = uVar17;
        *(long *)(lVar16 + 0xa8) = lVar8;
        *(undefined8 *)(lVar16 + 0xb0) = uVar18;
        *(undefined8 *)(lVar16 + 0xb8) = uVar19;
        _memmove(lVar16 + 0x198,lVar16 + 400,(uVar9 - 5) * 8);
        *(undefined8 *)(lVar16 + 400) = uVar3;
        _memmove(lVar16 + 0x200,lVar16 + 0x1f8,uVar9 * 8 + -0x28);
        *(long *)(lVar16 + 0x1f8) = lVar4;
        *(ushort *)(lVar16 + 0x1c2) = uVar1 + 1;
code_r0x004f3df8:
        lVar10 = 0x3f;
        do {
          lVar8 = *(long *)(lVar16 + lVar10 * 8);
          *(long *)(lVar8 + 0x160) = lVar16;
          *(short *)(lVar8 + 0x1c0) = (short)lVar10 + -0x39;
          lVar10 = lVar10 + 1;
          uVar17 = uStack0000000000000070;
          lVar8 = in_stack_00000078;
          uVar18 = in_stack_00000080;
          uVar19 = in_stack_00000088;
          uVar3 = in_stack_00000090;
          lVar4 = in_stack_000000a8;
          lVar15 = in_stack_000000b0;
        } while ((4 - uVar9) + lVar10 != 0x3f);
      }
    }
    if (lVar8 == -0x8000000000000000) goto FUN_004f3eb8;
    lVar10 = *(long *)(lVar16 + 0x160);
  }
  plVar12 = (long *)*in_stack_00000000;
  lVar10 = *plVar12;
  if (lVar10 == 0) {
    func_0x007a23bc(&UNK_009e8340);
  }
  else {
    lVar16 = plVar12[1];
    puVar6 = (undefined8 *)func_0x00187bd0(0x228,8);
    if (puVar6 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x228);
    }
    else {
      puVar6[0x2c] = 0;
      *(undefined2 *)((long)puVar6 + 0x1c2) = 0;
      puVar6[0x39] = lVar10;
      *(undefined8 **)(lVar10 + 0x160) = puVar6;
      *(undefined2 *)(lVar10 + 0x1c0) = 0;
      *plVar12 = (long)puVar6;
      plVar12[1] = lVar16 + 1;
      if (lVar15 == lVar16) {
        *(undefined2 *)((long)puVar6 + 0x1c2) = 1;
        *puVar6 = uVar17;
        puVar6[1] = lVar8;
        puVar6[2] = uVar18;
        puVar6[3] = uVar19;
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

