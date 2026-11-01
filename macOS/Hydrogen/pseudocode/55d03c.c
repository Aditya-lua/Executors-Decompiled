
void FUN_0055d03c(undefined8 param_1)

{
  ushort uVar1;
  ushort uVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long unaff_x19;
  ulong uVar10;
  long lVar11;
  long *plVar13;
  ulong uVar12;
  undefined8 unaff_x21;
  long lVar14;
  long *plVar15;
  undefined8 *puVar16;
  undefined8 *unaff_x22;
  long lVar17;
  undefined8 *puVar18;
  ulong uVar19;
  long *unaff_x25;
  ulong unaff_x26;
  long lVar20;
  undefined8 *unaff_x27;
  long lVar21;
  undefined8 uVar22;
  long *in_stack_00000020;
  long *in_stack_00000038;
  undefined8 *puStack0000000000000040;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long *in_stack_00000088;
  long in_stack_00000090;
  undefined8 *in_stack_00000098;
  long in_stack_000000a0;
  
  func_0x0055cd88(param_1,&uStack0000000000000050);
  lVar8 = *(long *)(unaff_x19 + 0x28);
  lVar21 = *in_stack_00000038;
  uVar1 = *(ushort *)(lVar21 + 0x16a);
  puVar18 = (undefined8 *)(lVar21 + 8 + unaff_x26 * 0x18);
  lVar7 = uVar1 - unaff_x26;
  if (uVar1 < unaff_x26 || lVar7 == 0) {
    uVar22 = *unaff_x22;
    puVar18[1] = unaff_x22[1];
    *puVar18 = uVar22;
    puVar18[2] = unaff_x22[2];
  }
  else {
    _memmove(lVar21 + 8 + (unaff_x26 + 1) * 0x18,puVar18,lVar7 * 0x18);
    uVar22 = *unaff_x22;
    puVar18[1] = unaff_x22[1];
    *puVar18 = uVar22;
    puVar18[2] = unaff_x22[2];
    _memmove(lVar21 + 0x110 + (unaff_x26 + 1) * 8,lVar21 + 0x110 + unaff_x26 * 8,lVar7 * 8);
  }
  *(undefined8 *)(lVar21 + unaff_x26 * 8 + 0x110) = unaff_x21;
  *(ushort *)(lVar21 + 0x16a) = uVar1 + 1;
  if (in_stack_00000070 == 2) {
LAB_0055d458:
    *unaff_x25 = lVar21;
    unaff_x25[1] = lVar8;
    unaff_x25[2] = unaff_x26;
    return;
  }
  puStack0000000000000040 = in_stack_00000098;
  lVar14 = *in_stack_00000088;
  lVar20 = in_stack_000000a0;
  lVar7 = in_stack_00000080;
  if (lVar14 != 0) {
    plVar13 = in_stack_00000088;
    plVar15 = in_stack_00000088;
    do {
      in_stack_00000088 = plVar15;
      puVar18 = in_stack_00000098;
      lVar4 = in_stack_00000080;
      lVar3 = in_stack_00000078;
      lVar20 = in_stack_00000070;
      lVar7 = uStack0000000000000068;
      uVar1 = *(ushort *)(plVar13 + 0x2d);
      uVar12 = (ulong)uVar1;
      if (in_stack_000000a0 != in_stack_00000090) {
        func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
        goto LAB_0055d5d8;
      }
      uVar2 = *(ushort *)(lVar14 + 0x16a);
      uVar10 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        uVar19 = uVar12 + 1;
        plVar15 = (long *)(lVar14 + 8 + uVar12 * 0x18);
        if (uVar1 < uVar2) {
          _memmove(lVar14 + 8 + uVar19 * 0x18,plVar15,(uVar10 - uVar12) * 0x18);
          lVar11 = uVar12 * 8;
          *plVar15 = lVar7;
          plVar15[1] = lVar20;
          lVar7 = lVar14 + 0x110;
          plVar15[2] = lVar3;
          lVar20 = (uVar10 - uVar12) * 8;
          _memmove(lVar7 + uVar19 * 8,lVar7 + lVar11,lVar20);
          *(long *)(lVar7 + lVar11) = lVar4;
          _memmove(lVar14 + 0x170 + lVar11 + 0x10,lVar14 + 0x170 + uVar19 * 8,lVar20);
        }
        else {
          *plVar15 = uStack0000000000000068;
          plVar15[1] = in_stack_00000070;
          plVar15[2] = in_stack_00000078;
          *(long *)(lVar14 + uVar12 * 8 + 0x110) = in_stack_00000080;
        }
        *(undefined8 **)(lVar14 + uVar19 * 8 + 0x170) = puVar18;
        *(ushort *)(lVar14 + 0x16a) = uVar2 + 1;
        if (uVar19 < uVar10 + 2) {
          lVar7 = uVar12 + 0x2f;
          do {
            plVar15 = *(long **)(lVar14 + lVar7 * 8);
            *plVar15 = lVar14;
            *(short *)(plVar15 + 0x2d) = (short)lVar7 + -0x2e;
            lVar7 = lVar7 + 1;
          } while (lVar7 - uVar10 != 0x30);
        }
        goto LAB_0055d458;
      }
      in_stack_00000058 = in_stack_00000090 + 1;
      uStack0000000000000050 = lVar14;
      if (uVar1 < 5) {
        in_stack_00000060 = 4;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        plVar15 = in_stack_00000038;
LAB_0055d274:
        lVar11 = *plVar15;
        uVar1 = *(ushort *)(lVar11 + 0x16a);
        uVar19 = (ulong)uVar1;
        uVar10 = uVar12 + 1;
        plVar15 = (long *)(lVar11 + 8 + (long)(int)uVar12 * 0x18);
        lVar14 = uVar19 - uVar12;
        if (uVar19 < uVar12 || lVar14 == 0) {
          *plVar15 = lVar7;
          plVar15[1] = lVar20;
          plVar15[2] = lVar3;
          *(long *)(lVar11 + uVar12 * 8 + 0x110) = lVar4;
        }
        else {
          _memmove(lVar11 + 8 + (long)(int)uVar10 * 0x18,plVar15,lVar14 * 0x18);
          lVar17 = uVar12 * 8;
          *plVar15 = lVar7;
          plVar15[1] = lVar20;
          lVar7 = lVar11 + 0x110;
          plVar15[2] = lVar3;
          _memmove(lVar7 + uVar10 * 8,lVar7 + lVar17,lVar14 * 8);
          *(long *)(lVar7 + lVar17) = lVar4;
          _memmove(lVar11 + 0x170 + lVar17 + 0x10,lVar11 + 0x170 + uVar10 * 8,lVar14 * 8);
        }
        *(undefined8 **)(lVar11 + uVar10 * 8 + 0x170) = puVar18;
        *(ushort *)(lVar11 + 0x16a) = uVar1 + 1;
        lVar7 = in_stack_00000080;
        plVar13 = in_stack_00000088;
        plVar15 = in_stack_00000088;
        puStack0000000000000040 = in_stack_00000098;
        lVar20 = in_stack_000000a0;
        if (uVar10 < uVar19 + 2) {
          lVar14 = uVar12 + 0x2f;
          do {
            plVar9 = *(long **)(lVar11 + lVar14 * 8);
            *plVar9 = lVar11;
            *(short *)(plVar9 + 0x2d) = (short)lVar14 + -0x2e;
            lVar14 = lVar14 + 1;
          } while (lVar14 - uVar19 != 0x30);
        }
      }
      else {
        if (uVar1 != 5) {
          if (uVar1 == 6) {
            in_stack_00000060 = 5;
            func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
            uVar12 = 0;
          }
          else {
            in_stack_00000060 = 6;
            func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
            uVar12 = uVar12 - 7;
          }
          plVar15 = in_stack_00000020;
          goto LAB_0055d274;
        }
        in_stack_00000060 = 5;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        plVar13 = in_stack_00000088;
        uVar1 = *(ushort *)((long)in_stack_00000088 + 0x16a);
        uVar12 = (ulong)uVar1;
        if (uVar12 < 6) {
          in_stack_00000088[0x10] = lVar7;
          in_stack_00000088[0x11] = lVar20;
          in_stack_00000088[0x12] = lVar3;
          in_stack_00000088[0x27] = lVar4;
          in_stack_00000088[0x34] = (long)puVar18;
          *(ushort *)((long)in_stack_00000088 + 0x16a) = uVar1 + 1;
          lVar7 = in_stack_00000080;
          plVar15 = in_stack_00000088;
          puStack0000000000000040 = in_stack_00000098;
          lVar20 = in_stack_000000a0;
          if (uVar1 == 5) goto code_r0x0055d374;
        }
        else {
          _memmove(in_stack_00000088 + 0x13,in_stack_00000088 + 0x10,(uVar12 - 5) * 0x18);
          plVar13[0x10] = lVar7;
          plVar13[0x11] = lVar20;
          plVar13[0x12] = lVar3;
          _memmove(plVar13 + 0x28,plVar13 + 0x27,(uVar12 - 5) * 8);
          plVar13[0x27] = lVar4;
          _memmove(plVar13 + 0x35,plVar13 + 0x34,uVar12 * 8 + -0x28);
          plVar13[0x34] = (long)puVar18;
          *(ushort *)((long)plVar13 + 0x16a) = uVar1 + 1;
code_r0x0055d374:
          lVar14 = 0x34;
          do {
            puVar18 = (undefined8 *)plVar13[lVar14];
            *puVar18 = plVar13;
            *(short *)(puVar18 + 0x2d) = (short)lVar14 + -0x2e;
            lVar14 = lVar14 + 1;
            lVar7 = in_stack_00000080;
            plVar15 = in_stack_00000088;
            puStack0000000000000040 = in_stack_00000098;
            lVar20 = in_stack_000000a0;
          } while ((4 - uVar12) + lVar14 != 0x34);
        }
      }
      in_stack_00000088 = plVar13;
      if (in_stack_00000070 == 2) goto LAB_0055d458;
      lVar14 = *in_stack_00000088;
      plVar13 = in_stack_00000088;
      in_stack_00000080 = lVar7;
      in_stack_00000098 = puStack0000000000000040;
      in_stack_000000a0 = lVar20;
    } while (lVar14 != 0);
  }
  in_stack_00000098 = puStack0000000000000040;
  puVar18 = (undefined8 *)*unaff_x27;
  puVar16 = (undefined8 *)*puVar18;
  in_stack_00000080 = lVar7;
  in_stack_000000a0 = lVar20;
  if (puVar16 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009ee038);
  }
  else {
    lVar14 = puVar18[1];
    puVar6 = (undefined8 *)func_0x00187bd0(0x1d0,8);
    if (puVar6 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x1d0);
    }
    else {
      *puVar6 = 0;
      *(undefined2 *)((long)puVar6 + 0x16a) = 0;
      puVar6[0x2e] = puVar16;
      *puVar16 = puVar6;
      *(undefined2 *)(puVar16 + 0x2d) = 0;
      *puVar18 = puVar6;
      puVar18[1] = lVar14 + 1;
      if (lVar20 == lVar14) {
        *(undefined2 *)((long)puVar6 + 0x16a) = 1;
        puVar6[2] = in_stack_00000070;
        puVar6[1] = uStack0000000000000068;
        puVar6[3] = in_stack_00000078;
        puVar6[0x22] = lVar7;
        puVar6[0x2f] = puStack0000000000000040;
        *puStack0000000000000040 = puVar6;
        *(undefined2 *)(puStack0000000000000040 + 0x2d) = 1;
        goto LAB_0055d458;
      }
      uStack0000000000000050 = lVar7;
      func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
    }
  }
LAB_0055d5d8:
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x55d5dc);
  (*pcVar5)();
}

