
void FUN_0055d1a0(undefined8 *param_1)

{
  ushort uVar1;
  ushort uVar2;
  long *plVar3;
  code *pcVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long lVar9;
  ulong unaff_x20;
  long *plVar10;
  long unaff_x22;
  long lVar11;
  long unaff_x23;
  ulong uVar12;
  int unaff_w25;
  long unaff_x26;
  long lVar13;
  long unaff_x27;
  undefined8 *in_stack_00000000;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  long *in_stack_00000020;
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
  
code_r0x0055d1a0:
  func_0x0055e0a4(param_1,&uStack0000000000000050);
  plVar10 = in_stack_00000038;
  do {
    lVar9 = *plVar10;
    uVar2 = *(ushort *)(lVar9 + 0x16a);
    uVar12 = (ulong)uVar2;
    uVar8 = unaff_x20 + 1;
    plVar10 = (long *)(lVar9 + 8 + (long)(int)unaff_x20 * (long)unaff_w25);
    lVar6 = uVar12 - unaff_x20;
    if (uVar12 < unaff_x20 || lVar6 == 0) {
      *plVar10 = unaff_x27;
      plVar10[1] = unaff_x26;
      plVar10[2] = unaff_x23;
      *(long *)(lVar9 + unaff_x20 * 8 + 0x110) = unaff_x22;
    }
    else {
      _memmove(lVar9 + 8 + (long)(int)uVar8 * 0x18,plVar10,lVar6 * 0x18);
      lVar11 = unaff_x20 * 8;
      *plVar10 = unaff_x27;
      plVar10[1] = unaff_x26;
      lVar13 = lVar9 + 0x110;
      plVar10[2] = unaff_x23;
      _memmove(lVar13 + uVar8 * 8,lVar13 + lVar11,lVar6 * 8);
      *(long *)(lVar13 + lVar11) = unaff_x22;
      _memmove(lVar9 + 0x170 + lVar11 + 0x10,lVar9 + 0x170 + uVar8 * 8,lVar6 * 8);
    }
    *(undefined8 **)(lVar9 + uVar8 * 8 + 0x170) = in_stack_00000040;
    *(ushort *)(lVar9 + 0x16a) = uVar2 + 1;
    if (uVar8 < uVar12 + 2) {
      lVar6 = unaff_x20 + 0x2f;
      do {
        plVar10 = *(long **)(lVar9 + lVar6 * 8);
        *plVar10 = lVar9;
        *(short *)(plVar10 + 0x2d) = (short)lVar6 + -0x2e;
        lVar6 = lVar6 + 1;
      } while (lVar6 - uVar12 != 0x30);
    }
    unaff_w25 = 0x18;
    unaff_x27 = uStack0000000000000068;
    unaff_x26 = in_stack_00000070;
    unaff_x23 = in_stack_00000078;
    unaff_x22 = in_stack_00000080;
    plVar3 = in_stack_00000088;
    plVar10 = in_stack_00000088;
    in_stack_00000040 = in_stack_00000098;
    lVar6 = in_stack_000000a0;
joined_r0x0055d14c:
    in_stack_00000088 = plVar3;
    if (unaff_x26 == 2) {
LAB_0055d458:
      *in_stack_00000008 = in_stack_00000030;
      in_stack_00000008[1] = in_stack_00000010;
      in_stack_00000008[2] = in_stack_00000018;
      return;
    }
    lVar9 = *in_stack_00000088;
    uStack0000000000000068 = unaff_x27;
    in_stack_00000070 = unaff_x26;
    in_stack_00000078 = unaff_x23;
    in_stack_00000080 = unaff_x22;
    in_stack_00000098 = in_stack_00000040;
    in_stack_000000a0 = lVar6;
    if (lVar9 == 0) {
      in_stack_00000000 = (undefined8 *)*in_stack_00000000;
      puVar7 = (undefined8 *)*in_stack_00000000;
      if (puVar7 == (undefined8 *)0x0) {
        func_0x007a23bc(&UNK_009ee038);
      }
      else {
        lVar9 = in_stack_00000000[1];
        puVar5 = (undefined8 *)func_0x00187bd0(0x1d0,8);
        if (puVar5 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x1d0);
        }
        else {
          *puVar5 = 0;
          *(undefined2 *)((long)puVar5 + 0x16a) = 0;
          puVar5[0x2e] = puVar7;
          *puVar7 = puVar5;
          *(undefined2 *)(puVar7 + 0x2d) = 0;
          *in_stack_00000000 = puVar5;
          in_stack_00000000[1] = lVar9 + 1;
          if (lVar6 == lVar9) {
            *(undefined2 *)((long)puVar5 + 0x16a) = 1;
            puVar5[2] = in_stack_00000070;
            puVar5[1] = uStack0000000000000068;
            puVar5[3] = in_stack_00000078;
            puVar5[0x22] = unaff_x22;
            puVar5[0x2f] = in_stack_00000040;
            *in_stack_00000040 = puVar5;
            *(undefined2 *)(in_stack_00000040 + 0x2d) = 1;
            goto LAB_0055d458;
          }
          uStack0000000000000050 = unaff_x22;
          func_0x007a247c(&UNK_008ab894,0x30,&UNK_009ee068);
        }
      }
LAB_0055d5d8:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x55d5dc);
      (*pcVar4)();
    }
    uVar2 = *(ushort *)(in_stack_00000088 + 0x2d);
    unaff_x20 = (ulong)uVar2;
    in_stack_00000088 = plVar10;
    if (lVar6 != in_stack_00000090) {
      func_0x007a247c(&UNK_008ab94a,0x35,&UNK_009ee108);
      goto LAB_0055d5d8;
    }
    uVar1 = *(ushort *)(lVar9 + 0x16a);
    uVar8 = (ulong)uVar1;
    if (uVar1 < 0xb) {
      uVar12 = unaff_x20 + 1;
      plVar10 = (long *)(lVar9 + 8 + unaff_x20 * 0x18);
      if (uVar2 < uVar1) {
        _memmove(lVar9 + 8 + uVar12 * 0x18,plVar10,(uVar8 - unaff_x20) * 0x18);
        lVar11 = unaff_x20 * 8;
        *plVar10 = unaff_x27;
        plVar10[1] = unaff_x26;
        lVar6 = lVar9 + 0x110;
        plVar10[2] = unaff_x23;
        lVar13 = (uVar8 - unaff_x20) * 8;
        _memmove(lVar6 + uVar12 * 8,lVar6 + lVar11,lVar13);
        *(long *)(lVar6 + lVar11) = unaff_x22;
        _memmove(lVar9 + 0x170 + lVar11 + 0x10,lVar9 + 0x170 + uVar12 * 8,lVar13);
      }
      else {
        *plVar10 = unaff_x27;
        plVar10[1] = unaff_x26;
        plVar10[2] = unaff_x23;
        *(long *)(lVar9 + unaff_x20 * 8 + 0x110) = unaff_x22;
      }
      *(undefined8 **)(lVar9 + uVar12 * 8 + 0x170) = in_stack_00000040;
      *(ushort *)(lVar9 + 0x16a) = uVar1 + 1;
      if (uVar12 < uVar8 + 2) {
        lVar6 = unaff_x20 + 0x2f;
        do {
          plVar10 = *(long **)(lVar9 + lVar6 * 8);
          *plVar10 = lVar9;
          *(short *)(plVar10 + 0x2d) = (short)lVar6 + -0x2e;
          lVar6 = lVar6 + 1;
        } while (lVar6 - uVar8 != 0x30);
      }
      goto LAB_0055d458;
    }
    in_stack_00000058 = in_stack_00000090 + 1;
    uStack0000000000000050 = lVar9;
    if (uVar2 < 5) {
      in_stack_00000060 = 4;
      param_1 = &uStack0000000000000068;
      goto code_r0x0055d1a0;
    }
    if (uVar2 == 5) {
      in_stack_00000060 = 5;
      func_0x0055e0a4(&uStack0000000000000068,&uStack0000000000000050);
      plVar3 = in_stack_00000088;
      uVar2 = *(ushort *)((long)in_stack_00000088 + 0x16a);
      uVar8 = (ulong)uVar2;
      if (uVar8 < 6) break;
      _memmove(in_stack_00000088 + 0x13,in_stack_00000088 + 0x10,(uVar8 - 5) * 0x18);
      plVar3[0x10] = unaff_x27;
      plVar3[0x11] = unaff_x26;
      plVar3[0x12] = unaff_x23;
      _memmove(plVar3 + 0x28,plVar3 + 0x27,(uVar8 - 5) * 8);
      plVar3[0x27] = unaff_x22;
      _memmove(plVar3 + 0x35,plVar3 + 0x34,uVar8 * 8 + -0x28);
      plVar3[0x34] = (long)in_stack_00000040;
      *(ushort *)((long)plVar3 + 0x16a) = uVar2 + 1;
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
    plVar10 = in_stack_00000020;
  } while( true );
  in_stack_00000088[0x10] = unaff_x27;
  in_stack_00000088[0x11] = unaff_x26;
  in_stack_00000088[0x12] = unaff_x23;
  in_stack_00000088[0x27] = unaff_x22;
  in_stack_00000088[0x34] = (long)in_stack_00000040;
  *(ushort *)((long)in_stack_00000088 + 0x16a) = uVar2 + 1;
  unaff_x27 = uStack0000000000000068;
  unaff_x26 = in_stack_00000070;
  unaff_x23 = in_stack_00000078;
  unaff_x22 = in_stack_00000080;
  plVar10 = in_stack_00000088;
  in_stack_00000040 = in_stack_00000098;
  lVar6 = in_stack_000000a0;
  if (uVar2 == 5) {
code_r0x0055d374:
    lVar9 = 0x34;
    do {
      puVar7 = (undefined8 *)plVar3[lVar9];
      *puVar7 = plVar3;
      *(short *)(puVar7 + 0x2d) = (short)lVar9 + -0x2e;
      lVar9 = lVar9 + 1;
      unaff_x27 = uStack0000000000000068;
      unaff_x26 = in_stack_00000070;
      unaff_x23 = in_stack_00000078;
      unaff_x22 = in_stack_00000080;
      plVar10 = in_stack_00000088;
      in_stack_00000040 = in_stack_00000098;
      lVar6 = in_stack_000000a0;
    } while ((4 - uVar8) + lVar9 != 0x34);
  }
  goto joined_r0x0055d14c;
}

