
void FUN_005a77c8(void)

{
  ulong uVar1;
  ushort uVar2;
  ushort uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  undefined8 *puVar9;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  long lVar10;
  long *unaff_x21;
  long lVar11;
  long unaff_x22;
  long *plVar12;
  long *unaff_x23;
  ulong unaff_x24;
  ulong uVar13;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x29;
  long lVar14;
  undefined8 uVar15;
  long lVar16;
  undefined8 uVar17;
  long lVar18;
  long lVar19;
  undefined8 uVar20;
  long lVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 *in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_00000100;
  
code_r0x005a77c8:
  unaff_x23[8] = in_stack_00000100;
  unaff_x23[1] = in_stack_000000c8;
  *unaff_x23 = in_stack_000000c0;
  _memmove(unaff_x25 + 0x380 + unaff_x19 * 8 + 0x10,unaff_x25 + 0x380 + unaff_x26,unaff_x22);
LAB_005a782c:
  *unaff_x21 = in_stack_00000010;
  *(undefined8 **)(unaff_x25 + unaff_x24 * 8 + 0x380) = in_stack_00000038;
  *(short *)(unaff_x25 + 0x37a) = (short)unaff_x27 + 1;
  if (unaff_x24 < unaff_x27 + 2) {
    lVar7 = unaff_x19 + 0x71;
    do {
      plVar8 = *(long **)(unaff_x25 + lVar7 * 8);
      *plVar8 = unaff_x25;
      *(short *)(plVar8 + 0x6f) = (short)lVar7 + -0x70;
      lVar7 = lVar7 + 1;
    } while (lVar7 - unaff_x27 != 0x72);
  }
  in_stack_00000010 = *(long *)(unaff_x29 + -0xd0);
  in_stack_000000c0 = *(long *)(unaff_x29 + -200);
  lVar7 = *(long *)(unaff_x29 + -0xb8);
  in_stack_000000c8 = *(long *)(unaff_x29 + -0xc0);
  lVar21 = *(long *)(unaff_x29 + -0xa8);
  lVar18 = *(long *)(unaff_x29 + -0xb0);
  lVar16 = *(long *)(unaff_x29 + -0x98);
  lVar14 = *(long *)(unaff_x29 + -0xa0);
  in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
  lVar19 = *(long *)(unaff_x29 + -0x90);
  plVar8 = *(long **)(unaff_x29 + -0x80);
  do {
    if (in_stack_000000c0 == -0x8000000000000000) {
LAB_005a7ae0:
      *unaff_x20 = in_stack_00000020;
      unaff_x20[1] = in_stack_00000030;
      unaff_x20[2] = in_stack_00000018;
      return;
    }
    lVar6 = *(long *)(unaff_x29 + -0x78);
    in_stack_00000038 = *(undefined8 **)(unaff_x29 + -0x70);
    lVar11 = *(long *)(unaff_x29 + -0x68);
    lVar10 = *plVar8;
    if (lVar10 == 0) {
      *(long *)(unaff_x29 + -0xb8) = lVar7;
      *(long *)(unaff_x29 + -0xc0) = in_stack_000000c8;
      *(long *)(unaff_x29 + -0xa8) = lVar21;
      *(long *)(unaff_x29 + -0xb0) = lVar18;
      *(long *)(unaff_x29 + -0x98) = lVar16;
      *(long *)(unaff_x29 + -0xa0) = lVar14;
      *(long *)(unaff_x29 + -0x88) = in_stack_00000100;
      *(long *)(unaff_x29 + -0x90) = lVar19;
      *(long *)(unaff_x29 + -0xd0) = in_stack_00000010;
      *(long *)(unaff_x29 + -200) = in_stack_000000c0;
      *(long **)(unaff_x29 + -0x80) = plVar8;
      *(long *)(unaff_x29 + -0x78) = lVar6;
      *(undefined8 **)(unaff_x29 + -0x70) = in_stack_00000038;
      *(long *)(unaff_x29 + -0x68) = lVar11;
      in_stack_00000000 = (undefined8 *)*in_stack_00000000;
      puVar9 = (undefined8 *)*in_stack_00000000;
      if (puVar9 == (undefined8 *)0x0) {
        func_0x007a23bc(&UNK_009f1b98);
      }
      else {
        lVar7 = in_stack_00000000[1];
        puVar5 = (undefined8 *)func_0x00187bd0(0x3e0,8);
        if (puVar5 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x3e0);
        }
        else {
          *puVar5 = 0;
          *(undefined2 *)((long)puVar5 + 0x37a) = 0;
          puVar5[0x70] = puVar9;
          *puVar9 = puVar5;
          *(undefined2 *)(puVar9 + 0x6f) = 0;
          *in_stack_00000000 = puVar5;
          in_stack_00000000[1] = lVar7 + 1;
          if (lVar11 == lVar7) {
            *(undefined2 *)((long)puVar5 + 0x37a) = 1;
            puVar5[1] = in_stack_00000010;
            uVar17 = *(undefined8 *)(unaff_x29 + -0xb0);
            uVar15 = *(undefined8 *)(unaff_x29 + -0xb8);
            uVar20 = *(undefined8 *)(unaff_x29 + -0xa8);
            uVar23 = *(undefined8 *)(unaff_x29 + -0x90);
            uVar22 = *(undefined8 *)(unaff_x29 + -0x98);
            puVar5[0x11] = *(undefined8 *)(unaff_x29 + -0xa0);
            puVar5[0x10] = uVar20;
            puVar5[0x13] = uVar23;
            puVar5[0x12] = uVar22;
            puVar5[0x14] = *(undefined8 *)(unaff_x29 + -0x88);
            uVar20 = *(undefined8 *)(unaff_x29 + -200);
            puVar5[0xd] = *(undefined8 *)(unaff_x29 + -0xc0);
            puVar5[0xc] = uVar20;
            puVar5[0xf] = uVar17;
            puVar5[0xe] = uVar15;
            puVar5[0x71] = in_stack_00000038;
            *in_stack_00000038 = puVar5;
            *(undefined2 *)(in_stack_00000038 + 0x6f) = 1;
            goto LAB_005a7ae0;
          }
          func_0x007a247c(&UNK_008ae948,0x30,&UNK_009f1bc8);
        }
      }
code_r0x005a7b60:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x5a7b64);
      (*pcVar4)();
    }
    uVar2 = *(ushort *)(plVar8 + 0x6f);
    unaff_x19 = (ulong)uVar2;
    if (lVar11 != lVar6) {
      func_0x007a247c(&UNK_008ae9a0,0x35,&UNK_009f1c40);
      goto code_r0x005a7b60;
    }
    uVar3 = *(ushort *)(lVar10 + 0x37a);
    uVar13 = (ulong)uVar3;
    if (uVar3 < 0xb) {
      uVar1 = unaff_x19 + 1;
      plVar8 = (long *)(lVar10 + 8 + unaff_x19 * 8);
      if (uVar2 < uVar3) {
        lVar6 = (uVar13 - unaff_x19) * 8;
        _memmove(lVar10 + 8 + uVar1 * 8,plVar8,lVar6);
        plVar12 = (long *)(lVar10 + 0x60 + unaff_x19 * 0x48);
        _memmove(lVar10 + 0x60 + uVar1 * 0x48,plVar12,(uVar13 - unaff_x19) * 0x48);
        plVar12[3] = lVar18;
        plVar12[2] = lVar7;
        plVar12[5] = lVar14;
        plVar12[4] = lVar21;
        plVar12[7] = lVar19;
        plVar12[6] = lVar16;
        plVar12[8] = in_stack_00000100;
        plVar12[1] = in_stack_000000c8;
        *plVar12 = in_stack_000000c0;
        _memmove(lVar10 + 0x380 + unaff_x19 * 8 + 0x10,lVar10 + 0x380 + uVar1 * 8,lVar6);
      }
      else {
        lVar6 = lVar10 + unaff_x19 * 0x48;
        *(long *)(lVar6 + 0x78) = lVar18;
        *(long *)(lVar6 + 0x70) = lVar7;
        *(long *)(lVar6 + 0x88) = lVar14;
        *(long *)(lVar6 + 0x80) = lVar21;
        *(long *)(lVar6 + 0x98) = lVar19;
        *(long *)(lVar6 + 0x90) = lVar16;
        *(long *)(lVar6 + 0xa0) = in_stack_00000100;
        *(long *)(lVar6 + 0x68) = in_stack_000000c8;
        *(long *)(lVar6 + 0x60) = in_stack_000000c0;
      }
      *plVar8 = in_stack_00000010;
      *(undefined8 **)(lVar10 + uVar1 * 8 + 0x380) = in_stack_00000038;
      *(ushort *)(lVar10 + 0x37a) = uVar3 + 1;
      if (uVar1 < uVar13 + 2) {
        lVar7 = unaff_x19 + 0x71;
        do {
          plVar8 = *(long **)(lVar10 + lVar7 * 8);
          *plVar8 = lVar10;
          *(short *)(plVar8 + 0x6f) = (short)lVar7 + -0x70;
          lVar7 = lVar7 + 1;
        } while (lVar7 - uVar13 != 0x72);
      }
      goto LAB_005a7ae0;
    }
    *(long *)(unaff_x29 + -0xe8) = lVar10;
    *(long *)(unaff_x29 + -0xe0) = lVar6 + 1;
    if (uVar2 < 5) {
      *(undefined8 *)(unaff_x29 + -0xd8) = 4;
      func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
      plVar8 = in_stack_00000028;
      goto code_r0x005a7754;
    }
    if (uVar2 != 5) break;
    *(undefined8 *)(unaff_x29 + -0xd8) = 5;
    func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
    plVar8 = *(long **)(unaff_x29 + -0x80);
    uVar2 = *(ushort *)((long)plVar8 + 0x37a);
    uVar13 = (ulong)uVar2;
    if (uVar13 < 6) {
      plVar8[6] = in_stack_00000010;
      plVar8[0x41] = in_stack_00000100;
      plVar8[0x3e] = lVar14;
      plVar8[0x3d] = lVar21;
      plVar8[0x40] = lVar19;
      plVar8[0x3f] = lVar16;
      plVar8[0x3a] = in_stack_000000c8;
      plVar8[0x39] = in_stack_000000c0;
      plVar8[0x3c] = lVar18;
      plVar8[0x3b] = lVar7;
      plVar8[0x76] = (long)in_stack_00000038;
      *(ushort *)((long)plVar8 + 0x37a) = uVar2 + 1;
      if (uVar2 == 5) goto code_r0x005a78b4;
    }
    else {
      _memmove(plVar8 + 7,plVar8 + 6,(uVar13 - 5) * 8);
      _memmove(plVar8 + 0x42,plVar8 + 0x39,(uVar13 - 5) * 0x48);
      plVar8[6] = in_stack_00000010;
      plVar8[0x3e] = lVar14;
      plVar8[0x3d] = lVar21;
      plVar8[0x40] = lVar19;
      plVar8[0x3f] = lVar16;
      plVar8[0x41] = in_stack_00000100;
      plVar8[0x3a] = in_stack_000000c8;
      plVar8[0x39] = in_stack_000000c0;
      plVar8[0x3c] = lVar18;
      plVar8[0x3b] = lVar7;
      _memmove(plVar8 + 0x77,plVar8 + 0x76,uVar13 * 8 + -0x28);
      plVar8[0x76] = (long)in_stack_00000038;
      *(ushort *)((long)plVar8 + 0x37a) = uVar2 + 1;
code_r0x005a78b4:
      lVar7 = 0x76;
      do {
        puVar9 = (undefined8 *)plVar8[lVar7];
        *puVar9 = plVar8;
        *(short *)(puVar9 + 0x6f) = (short)lVar7 + -0x70;
        lVar7 = lVar7 + 1;
      } while ((4 - uVar13) + lVar7 != 0x76);
    }
    in_stack_00000010 = *(long *)(unaff_x29 + -0xd0);
    in_stack_000000c0 = *(long *)(unaff_x29 + -200);
    lVar7 = *(long *)(unaff_x29 + -0xb8);
    in_stack_000000c8 = *(long *)(unaff_x29 + -0xc0);
    lVar21 = *(long *)(unaff_x29 + -0xa8);
    lVar18 = *(long *)(unaff_x29 + -0xb0);
    lVar16 = *(long *)(unaff_x29 + -0x98);
    lVar14 = *(long *)(unaff_x29 + -0xa0);
    in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
    lVar19 = *(long *)(unaff_x29 + -0x90);
  } while( true );
  if (uVar2 == 6) {
    *(undefined8 *)(unaff_x29 + -0xd8) = 5;
    func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
    unaff_x19 = 0;
  }
  else {
    *(undefined8 *)(unaff_x29 + -0xd8) = 6;
    func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
    unaff_x19 = unaff_x19 - 7;
  }
  plVar8 = in_stack_00000008;
code_r0x005a7754:
  unaff_x25 = *plVar8;
  unaff_x27 = (ulong)*(ushort *)(unaff_x25 + 0x37a);
  unaff_x24 = unaff_x19 + 1;
  unaff_x21 = (long *)(unaff_x25 + 8 + unaff_x19 * 8);
  lVar6 = unaff_x27 - unaff_x19;
  if (unaff_x19 <= unaff_x27 && lVar6 != 0) goto code_r0x005a7770;
  lVar6 = unaff_x25 + (long)(int)unaff_x19 * 0x48;
  *(long *)(lVar6 + 0x78) = lVar18;
  *(long *)(lVar6 + 0x70) = lVar7;
  *(long *)(lVar6 + 0x88) = lVar14;
  *(long *)(lVar6 + 0x80) = lVar21;
  *(long *)(lVar6 + 0x98) = lVar19;
  *(long *)(lVar6 + 0x90) = lVar16;
  *(long *)(lVar6 + 0xa0) = in_stack_00000100;
  *(long *)(lVar6 + 0x68) = in_stack_000000c8;
  *(long *)(lVar6 + 0x60) = in_stack_000000c0;
  goto LAB_005a782c;
code_r0x005a7770:
  unaff_x26 = unaff_x24 * 8;
  unaff_x22 = lVar6 * 8;
  _memmove(unaff_x25 + 8 + unaff_x26,unaff_x21,unaff_x22);
  unaff_x23 = (long *)(unaff_x25 + 0x60 + (long)(int)unaff_x19 * 0x48);
  _memmove(unaff_x25 + 0x60 + (long)(int)unaff_x24 * 0x48,unaff_x23,lVar6 * 0x48);
  unaff_x23[3] = lVar18;
  unaff_x23[2] = lVar7;
  unaff_x23[5] = lVar14;
  unaff_x23[4] = lVar21;
  unaff_x23[7] = lVar19;
  unaff_x23[6] = lVar16;
  goto code_r0x005a77c8;
}

