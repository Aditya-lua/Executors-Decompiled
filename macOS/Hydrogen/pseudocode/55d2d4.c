
void FUN_0055d2d4(void)

{
  ulong uVar1;
  ushort uVar2;
  ushort uVar3;
  long lVar4;
  long *plVar5;
  code *pcVar6;
  undefined8 *puVar7;
  long *plVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long unaff_x19;
  ulong unaff_x20;
  long lVar11;
  long *plVar12;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  long lVar13;
  long unaff_x26;
  long lVar14;
  long unaff_x27;
  ulong unaff_x28;
  long lVar15;
  undefined8 *in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long *in_stack_00000038;
  undefined8 *in_stack_00000040;
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
  
code_r0x0055d2d4:
  *(long *)(unaff_x26 + unaff_x22) = in_stack_00000028;
  _memmove(unaff_x19 + 0x170 + unaff_x22 + 0x10,unaff_x19 + 0x170 + unaff_x27,unaff_x21);
  do {
    *(undefined8 **)(unaff_x19 + unaff_x28 * 8 + 0x170) = in_stack_00000040;
    *(short *)(unaff_x19 + 0x16a) = (short)unaff_x24 + 1;
    lVar13 = uStack0000000000000068;
    lVar14 = in_stack_00000070;
    lVar4 = in_stack_00000078;
    in_stack_00000028 = in_stack_00000080;
    plVar5 = in_stack_00000088;
    plVar12 = in_stack_00000088;
    in_stack_00000040 = in_stack_00000098;
    lVar15 = in_stack_000000a0;
    if (unaff_x28 < unaff_x24 + 2) {
      lVar11 = unaff_x20 + 0x2f;
      do {
        plVar8 = *(long **)(unaff_x19 + lVar11 * 8);
        *plVar8 = unaff_x19;
        *(short *)(plVar8 + 0x2d) = (short)lVar11 + -0x2e;
        lVar11 = lVar11 + 1;
      } while (lVar11 - unaff_x24 != 0x30);
    }
joined_r0x0055d14c:
    in_stack_00000088 = plVar5;
    if (lVar14 == 2) {
LAB_0055d458:
      *in_stack_00000008 = in_stack_00000030;
      in_stack_00000008[1] = in_stack_00000010;
      in_stack_00000008[2] = in_stack_00000018;
      return;
    }
    lVar11 = *in_stack_00000088;
    uStack0000000000000068 = lVar13;
    in_stack_00000070 = lVar14;
    in_stack_00000078 = lVar4;
    in_stack_00000080 = in_stack_00000028;
    in_stack_00000098 = in_stack_00000040;
    in_stack_000000a0 = lVar15;
    if (lVar11 == 0) {
      in_stack_00000000 = (undefined8 *)*in_stack_00000000;
      puVar9 = (undefined8 *)*in_stack_00000000;
      if (puVar9 == (undefined8 *)0x0) {
        func_0x007a23bc(&UNK_009ee038);
      }
      else {
        lVar13 = in_stack_00000000[1];
        puVar7 = (undefined8 *)func_0x00187bd0(0x1d0,8);
        if (puVar7 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x1d0);
        }
        else {
          *puVar7 = 0;
          *(undefined2 *)((long)puVar7 + 0x16a) = 0;
          puVar7[0x2e] = puVar9;
          *puVar9 = puVar7;
          *(undefined2 *)(puVar9 + 0x2d) = 0;
          *in_stack_00000000 = puVar7;
          in_stack_00000000[1] = lVar13 + 1;
          if (lVar15 == lVar13) {
            *(undefined2 *)((long)puVar7 + 0x16a) = 1;
            puVar7[2] = in_stack_00000070;
            puVar7[1] = uStack0000000000000068;
            puVar7[3] = in_stack_00000078;
            puVar7[0x22] = in_stack_00000028;
            puVar7[0x2f] = in_stack_00000040;
            *in_stack_00000040 = puVar7;
            *(undefined2 *)(in_stack_00000040 + 0x2d) = 1;
            goto LAB_0055d458;
          }
          uStack0000000000000050 = in_stack_00000028;
          func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
        }
      }
LAB_0055d5d8:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x55d5dc);
      (*pcVar6)();
    }
    uVar2 = *(ushort *)(in_stack_00000088 + 0x2d);
    unaff_x20 = (ulong)uVar2;
    in_stack_00000088 = plVar12;
    if (lVar15 != in_stack_00000090) {
      func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
      goto LAB_0055d5d8;
    }
    uVar3 = *(ushort *)(lVar11 + 0x16a);
    uVar10 = (ulong)uVar3;
    if (uVar3 < 0xb) {
      uVar1 = unaff_x20 + 1;
      plVar12 = (long *)(lVar11 + 8 + unaff_x20 * 0x18);
      if (uVar2 < uVar3) {
        _memmove(lVar11 + 8 + uVar1 * 0x18,plVar12,(uVar10 - unaff_x20) * 0x18);
        lVar15 = unaff_x20 * 8;
        *plVar12 = lVar13;
        plVar12[1] = lVar14;
        lVar13 = lVar11 + 0x110;
        plVar12[2] = lVar4;
        lVar14 = (uVar10 - unaff_x20) * 8;
        _memmove(lVar13 + uVar1 * 8,lVar13 + lVar15,lVar14);
        *(long *)(lVar13 + lVar15) = in_stack_00000028;
        _memmove(lVar11 + 0x170 + lVar15 + 0x10,lVar11 + 0x170 + uVar1 * 8,lVar14);
      }
      else {
        *plVar12 = lVar13;
        plVar12[1] = lVar14;
        plVar12[2] = lVar4;
        *(long *)(lVar11 + unaff_x20 * 8 + 0x110) = in_stack_00000028;
      }
      *(undefined8 **)(lVar11 + uVar1 * 8 + 0x170) = in_stack_00000040;
      *(ushort *)(lVar11 + 0x16a) = uVar3 + 1;
      if (uVar1 < uVar10 + 2) {
        lVar13 = unaff_x20 + 0x2f;
        do {
          plVar12 = *(long **)(lVar11 + lVar13 * 8);
          *plVar12 = lVar11;
          *(short *)(plVar12 + 0x2d) = (short)lVar13 + -0x2e;
          lVar13 = lVar13 + 1;
        } while (lVar13 - uVar10 != 0x30);
      }
      goto LAB_0055d458;
    }
    in_stack_00000058 = in_stack_00000090 + 1;
    uStack0000000000000050 = lVar11;
    if (uVar2 < 5) {
      in_stack_00000060 = 4;
      func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
      plVar12 = in_stack_00000038;
    }
    else {
      if (uVar2 == 5) {
        in_stack_00000060 = 5;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        plVar5 = in_stack_00000088;
        uVar2 = *(ushort *)((long)in_stack_00000088 + 0x16a);
        uVar10 = (ulong)uVar2;
        if (uVar10 < 6) break;
        _memmove(in_stack_00000088 + 0x13,in_stack_00000088 + 0x10,(uVar10 - 5) * 0x18);
        plVar5[0x10] = lVar13;
        plVar5[0x11] = lVar14;
        plVar5[0x12] = lVar4;
        _memmove(plVar5 + 0x28,plVar5 + 0x27,(uVar10 - 5) * 8);
        plVar5[0x27] = in_stack_00000028;
        _memmove(plVar5 + 0x35,plVar5 + 0x34,uVar10 * 8 + -0x28);
        plVar5[0x34] = (long)in_stack_00000040;
        *(ushort *)((long)plVar5 + 0x16a) = uVar2 + 1;
        goto code_r0x0055d374;
      }
      if (uVar2 == 6) {
        in_stack_00000060 = 5;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        unaff_x20 = 0;
      }
      else {
        in_stack_00000060 = 6;
        func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
        unaff_x20 = unaff_x20 - 7;
      }
      plVar12 = in_stack_00000020;
    }
    unaff_x19 = *plVar12;
    unaff_x24 = (ulong)*(ushort *)(unaff_x19 + 0x16a);
    unaff_x28 = unaff_x20 + 1;
    plVar12 = (long *)(unaff_x19 + 8 + (long)(int)unaff_x20 * 0x18);
    lVar15 = unaff_x24 - unaff_x20;
    if (unaff_x20 <= unaff_x24 && lVar15 != 0) goto code_r0x0055d294;
    *plVar12 = lVar13;
    plVar12[1] = lVar14;
    plVar12[2] = lVar4;
    *(long *)(unaff_x19 + unaff_x20 * 8 + 0x110) = in_stack_00000028;
  } while( true );
  in_stack_00000088[0x10] = lVar13;
  in_stack_00000088[0x11] = lVar14;
  in_stack_00000088[0x12] = lVar4;
  in_stack_00000088[0x27] = in_stack_00000028;
  in_stack_00000088[0x34] = (long)in_stack_00000040;
  *(ushort *)((long)in_stack_00000088 + 0x16a) = uVar2 + 1;
  lVar13 = uStack0000000000000068;
  lVar14 = in_stack_00000070;
  lVar4 = in_stack_00000078;
  in_stack_00000028 = in_stack_00000080;
  plVar12 = in_stack_00000088;
  in_stack_00000040 = in_stack_00000098;
  lVar15 = in_stack_000000a0;
  if (uVar2 == 5) {
code_r0x0055d374:
    lVar11 = 0x34;
    do {
      puVar9 = (undefined8 *)plVar5[lVar11];
      *puVar9 = plVar5;
      *(short *)(puVar9 + 0x2d) = (short)lVar11 + -0x2e;
      lVar11 = lVar11 + 1;
      lVar13 = uStack0000000000000068;
      lVar14 = in_stack_00000070;
      lVar4 = in_stack_00000078;
      in_stack_00000028 = in_stack_00000080;
      plVar12 = in_stack_00000088;
      in_stack_00000040 = in_stack_00000098;
      lVar15 = in_stack_000000a0;
    } while ((4 - uVar10) + lVar11 != 0x34);
  }
  goto joined_r0x0055d14c;
code_r0x0055d294:
  _memmove(unaff_x19 + 8 + (long)(int)unaff_x28 * 0x18,plVar12,lVar15 * 0x18);
  unaff_x22 = unaff_x20 * 8;
  *plVar12 = lVar13;
  plVar12[1] = lVar14;
  unaff_x26 = unaff_x19 + 0x110;
  unaff_x27 = unaff_x28 * 8;
  plVar12[2] = lVar4;
  unaff_x21 = lVar15 * 8;
  _memmove(unaff_x26 + unaff_x27,unaff_x26 + unaff_x22,unaff_x21);
  goto code_r0x0055d2d4;
}

