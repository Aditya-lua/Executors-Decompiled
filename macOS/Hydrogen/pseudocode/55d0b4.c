
void FUN_0055d0b4(void)

{
  ushort uVar1;
  ushort uVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  undefined8 *puVar6;
  long lVar7;
  long *plVar8;
  short unaff_w19;
  ulong uVar9;
  long lVar10;
  long unaff_x20;
  long *plVar12;
  ulong uVar11;
  undefined8 *puVar13;
  undefined8 unaff_x21;
  long lVar14;
  long *plVar15;
  undefined8 *puVar16;
  long unaff_x22;
  long lVar17;
  long unaff_x23;
  long unaff_x24;
  ulong uVar18;
  long *unaff_x25;
  long unaff_x26;
  long lVar19;
  undefined8 *unaff_x27;
  long unaff_x28;
  long in_stack_00000010;
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
  
  *(undefined8 *)(unaff_x23 + 0x10) = *(undefined8 *)(unaff_x22 + 0x10);
  _memmove(unaff_x28 + 0x110 + unaff_x24 * 8,unaff_x28 + 0x110 + unaff_x26 * 8,unaff_x20 << 3);
  *(undefined8 *)(unaff_x28 + unaff_x26 * 8 + 0x110) = unaff_x21;
  *(short *)(unaff_x28 + 0x16a) = unaff_w19 + 1;
  if (in_stack_00000070 == 2) {
LAB_0055d458:
    *unaff_x25 = unaff_x28;
    unaff_x25[1] = in_stack_00000010;
    unaff_x25[2] = unaff_x26;
    return;
  }
  puStack0000000000000040 = in_stack_00000098;
  lVar14 = *in_stack_00000088;
  lVar19 = in_stack_000000a0;
  lVar7 = in_stack_00000080;
  if (lVar14 != 0) {
    plVar12 = in_stack_00000088;
    plVar15 = in_stack_00000088;
    do {
      in_stack_00000088 = plVar15;
      puVar13 = in_stack_00000098;
      lVar4 = in_stack_00000080;
      lVar3 = in_stack_00000078;
      lVar19 = in_stack_00000070;
      lVar7 = uStack0000000000000068;
      uVar1 = *(ushort *)(plVar12 + 0x2d);
      uVar11 = (ulong)uVar1;
      if (in_stack_000000a0 != in_stack_00000090) {
        func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
        goto LAB_0055d5d8;
      }
      uVar2 = *(ushort *)(lVar14 + 0x16a);
      uVar9 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        uVar18 = uVar11 + 1;
        plVar15 = (long *)(lVar14 + 8 + uVar11 * 0x18);
        if (uVar1 < uVar2) {
          _memmove(lVar14 + 8 + uVar18 * 0x18,plVar15,(uVar9 - uVar11) * 0x18);
          lVar10 = uVar11 * 8;
          *plVar15 = lVar7;
          plVar15[1] = lVar19;
          lVar7 = lVar14 + 0x110;
          plVar15[2] = lVar3;
          lVar19 = (uVar9 - uVar11) * 8;
          _memmove(lVar7 + uVar18 * 8,lVar7 + lVar10,lVar19);
          *(long *)(lVar7 + lVar10) = lVar4;
          _memmove(lVar14 + 0x170 + lVar10 + 0x10,lVar14 + 0x170 + uVar18 * 8,lVar19);
        }
        else {
          *plVar15 = uStack0000000000000068;
          plVar15[1] = in_stack_00000070;
          plVar15[2] = in_stack_00000078;
          *(long *)(lVar14 + uVar11 * 8 + 0x110) = in_stack_00000080;
        }
        *(undefined8 **)(lVar14 + uVar18 * 8 + 0x170) = puVar13;
        *(ushort *)(lVar14 + 0x16a) = uVar2 + 1;
        if (uVar18 < uVar9 + 2) {
          lVar7 = uVar11 + 0x2f;
          do {
            plVar15 = *(long **)(lVar14 + lVar7 * 8);
            *plVar15 = lVar14;
            *(short *)(plVar15 + 0x2d) = (short)lVar7 + -0x2e;
            lVar7 = lVar7 + 1;
          } while (lVar7 - uVar9 != 0x30);
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
        lVar10 = *plVar15;
        uVar1 = *(ushort *)(lVar10 + 0x16a);
        uVar18 = (ulong)uVar1;
        uVar9 = uVar11 + 1;
        plVar15 = (long *)(lVar10 + 8 + (long)(int)uVar11 * 0x18);
        lVar14 = uVar18 - uVar11;
        if (uVar18 < uVar11 || lVar14 == 0) {
          *plVar15 = lVar7;
          plVar15[1] = lVar19;
          plVar15[2] = lVar3;
          *(long *)(lVar10 + uVar11 * 8 + 0x110) = lVar4;
        }
        else {
          _memmove(lVar10 + 8 + (long)(int)uVar9 * 0x18,plVar15,lVar14 * 0x18);
          lVar17 = uVar11 * 8;
          *plVar15 = lVar7;
          plVar15[1] = lVar19;
          lVar7 = lVar10 + 0x110;
          plVar15[2] = lVar3;
          _memmove(lVar7 + uVar9 * 8,lVar7 + lVar17,lVar14 * 8);
          *(long *)(lVar7 + lVar17) = lVar4;
          _memmove(lVar10 + 0x170 + lVar17 + 0x10,lVar10 + 0x170 + uVar9 * 8,lVar14 * 8);
        }
        *(undefined8 **)(lVar10 + uVar9 * 8 + 0x170) = puVar13;
        *(ushort *)(lVar10 + 0x16a) = uVar1 + 1;
        lVar7 = in_stack_00000080;
        plVar12 = in_stack_00000088;
        plVar15 = in_stack_00000088;
        puStack0000000000000040 = in_stack_00000098;
        lVar19 = in_stack_000000a0;
        if (uVar9 < uVar18 + 2) {
          lVar14 = uVar11 + 0x2f;
          do {
            plVar8 = *(long **)(lVar10 + lVar14 * 8);
            *plVar8 = lVar10;
            *(short *)(plVar8 + 0x2d) = (short)lVar14 + -0x2e;
            lVar14 = lVar14 + 1;
          } while (lVar14 - uVar18 != 0x30);
        }
      }
      else {
        if (uVar1 != 5) {
          if (uVar1 == 6) {
            in_stack_00000060 = 5;
            func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
            uVar11 = 0;
          }
          else {
            in_stack_00000060 = 6;
            func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
            uVar11 = uVar11 - 7;
          }
          plVar15 = in_stack_00000020;
          goto LAB_0055d274;
        }
        in_stack_00000060 = 5;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        plVar12 = in_stack_00000088;
        uVar1 = *(ushort *)((long)in_stack_00000088 + 0x16a);
        uVar11 = (ulong)uVar1;
        if (uVar11 < 6) {
          in_stack_00000088[0x10] = lVar7;
          in_stack_00000088[0x11] = lVar19;
          in_stack_00000088[0x12] = lVar3;
          in_stack_00000088[0x27] = lVar4;
          in_stack_00000088[0x34] = (long)puVar13;
          *(ushort *)((long)in_stack_00000088 + 0x16a) = uVar1 + 1;
          lVar7 = in_stack_00000080;
          plVar15 = in_stack_00000088;
          puStack0000000000000040 = in_stack_00000098;
          lVar19 = in_stack_000000a0;
          if (uVar1 == 5) goto code_r0x0055d374;
        }
        else {
          _memmove(in_stack_00000088 + 0x13,in_stack_00000088 + 0x10,(uVar11 - 5) * 0x18);
          plVar12[0x10] = lVar7;
          plVar12[0x11] = lVar19;
          plVar12[0x12] = lVar3;
          _memmove(plVar12 + 0x28,plVar12 + 0x27,(uVar11 - 5) * 8);
          plVar12[0x27] = lVar4;
          _memmove(plVar12 + 0x35,plVar12 + 0x34,uVar11 * 8 + -0x28);
          plVar12[0x34] = (long)puVar13;
          *(ushort *)((long)plVar12 + 0x16a) = uVar1 + 1;
code_r0x0055d374:
          lVar14 = 0x34;
          do {
            puVar13 = (undefined8 *)plVar12[lVar14];
            *puVar13 = plVar12;
            *(short *)(puVar13 + 0x2d) = (short)lVar14 + -0x2e;
            lVar14 = lVar14 + 1;
            lVar7 = in_stack_00000080;
            plVar15 = in_stack_00000088;
            puStack0000000000000040 = in_stack_00000098;
            lVar19 = in_stack_000000a0;
          } while ((4 - uVar11) + lVar14 != 0x34);
        }
      }
      in_stack_00000088 = plVar12;
      if (in_stack_00000070 == 2) goto LAB_0055d458;
      lVar14 = *in_stack_00000088;
      plVar12 = in_stack_00000088;
      in_stack_00000080 = lVar7;
      in_stack_00000098 = puStack0000000000000040;
      in_stack_000000a0 = lVar19;
    } while (lVar14 != 0);
  }
  in_stack_00000098 = puStack0000000000000040;
  puVar13 = (undefined8 *)*unaff_x27;
  puVar16 = (undefined8 *)*puVar13;
  in_stack_00000080 = lVar7;
  in_stack_000000a0 = lVar19;
  if (puVar16 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009ee038);
  }
  else {
    lVar14 = puVar13[1];
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
      *puVar13 = puVar6;
      puVar13[1] = lVar14 + 1;
      if (lVar19 == lVar14) {
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

