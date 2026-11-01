
void FUN_005a76cc(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  long *plVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong unaff_x19;
  long unaff_x20;
  long lVar9;
  long lVar10;
  long *unaff_x23;
  long *plVar11;
  short unaff_w24;
  ulong uVar12;
  long unaff_x25;
  undefined8 *unaff_x26;
  undefined8 unaff_x27;
  ulong uVar13;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 *in_stack_00000000;
  long *in_stack_00000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  long *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  long in_stack_00000100;
  
code_r0x005a76cc:
  _memmove(unaff_x23 + 7,unaff_x23 + 6,unaff_x25 * 8);
  _memmove(unaff_x23 + 0x42,unaff_x23 + 0x39,unaff_x25 * 0x48);
  unaff_x23[6] = unaff_x20;
  unaff_x23[0x3e] = in_stack_000000e8;
  unaff_x23[0x3d] = in_stack_000000e0;
  unaff_x23[0x40] = in_stack_000000f8;
  unaff_x23[0x3f] = in_stack_000000f0;
  unaff_x23[0x41] = in_stack_00000100;
  unaff_x23[0x3a] = in_stack_000000c8;
  unaff_x23[0x39] = in_stack_000000c0;
  unaff_x23[0x3c] = in_stack_000000d8;
  unaff_x23[0x3b] = in_stack_000000d0;
  _memmove(unaff_x23 + 0x77,unaff_x23 + 0x76,unaff_x19 * 8 + -0x28);
  unaff_x23[0x76] = (long)in_stack_00000038;
  *(short *)((long)unaff_x23 + 0x37a) = unaff_w24;
LAB_005a78b4:
  lVar5 = 0x76;
  do {
    puVar7 = (undefined8 *)unaff_x23[lVar5];
    *puVar7 = unaff_x23;
    *(short *)(puVar7 + 0x6f) = (short)lVar5 + -0x70;
    lVar5 = lVar5 + 1;
  } while ((4 - unaff_x19) + lVar5 != 0x76);
code_r0x005a78e0:
  unaff_x20 = *(long *)(unaff_x29 + -0xd0);
  in_stack_000000c0 = *(long *)(unaff_x29 + -200);
  in_stack_000000d0 = *(long *)(unaff_x29 + -0xb8);
  in_stack_000000c8 = *(long *)(unaff_x29 + -0xc0);
  in_stack_000000e0 = *(long *)(unaff_x29 + -0xa8);
  in_stack_000000d8 = *(long *)(unaff_x29 + -0xb0);
  in_stack_000000f0 = *(long *)(unaff_x29 + -0x98);
  in_stack_000000e8 = *(long *)(unaff_x29 + -0xa0);
  in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
  in_stack_000000f8 = *(long *)(unaff_x29 + -0x90);
  do {
    if (in_stack_000000c0 == -0x8000000000000000) goto LAB_005a7ae0;
    lVar5 = *(long *)(unaff_x29 + -0x78);
    in_stack_00000038 = *(undefined8 **)(unaff_x29 + -0x70);
    lVar10 = *(long *)(unaff_x29 + -0x68);
    lVar9 = *unaff_x23;
    if (lVar9 == 0) {
      *(long *)(unaff_x29 + -0xb8) = in_stack_000000d0;
      *(long *)(unaff_x29 + -0xc0) = in_stack_000000c8;
      *(long *)(unaff_x29 + -0xa8) = in_stack_000000e0;
      *(long *)(unaff_x29 + -0xb0) = in_stack_000000d8;
      *(long *)(unaff_x29 + -0x98) = in_stack_000000f0;
      *(long *)(unaff_x29 + -0xa0) = in_stack_000000e8;
      *(long *)(unaff_x29 + -0x88) = in_stack_00000100;
      *(long *)(unaff_x29 + -0x90) = in_stack_000000f8;
      *(long *)(unaff_x29 + -0xd0) = unaff_x20;
      *(long *)(unaff_x29 + -200) = in_stack_000000c0;
      *(long **)(unaff_x29 + -0x80) = unaff_x23;
      *(long *)(unaff_x29 + -0x78) = lVar5;
      *(undefined8 **)(unaff_x29 + -0x70) = in_stack_00000038;
      *(long *)(unaff_x29 + -0x68) = lVar10;
      in_stack_00000000 = (undefined8 *)*in_stack_00000000;
      puVar7 = (undefined8 *)*in_stack_00000000;
      if (puVar7 == (undefined8 *)0x0) {
        func_0x007a23bc(&UNK_009f1b98);
      }
      else {
        lVar5 = in_stack_00000000[1];
        puVar4 = (undefined8 *)func_0x00187bd0(0x3e0,8);
        if (puVar4 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x3e0);
        }
        else {
          *puVar4 = 0;
          *(undefined2 *)((long)puVar4 + 0x37a) = 0;
          puVar4[0x70] = puVar7;
          *puVar7 = puVar4;
          *(undefined2 *)(puVar7 + 0x6f) = 0;
          *in_stack_00000000 = puVar4;
          in_stack_00000000[1] = lVar5 + 1;
          if (lVar10 == lVar5) {
            *(undefined2 *)((long)puVar4 + 0x37a) = 1;
            puVar4[1] = unaff_x20;
            uVar15 = *(undefined8 *)(unaff_x29 + -0xb0);
            uVar14 = *(undefined8 *)(unaff_x29 + -0xb8);
            uVar16 = *(undefined8 *)(unaff_x29 + -0xa8);
            uVar18 = *(undefined8 *)(unaff_x29 + -0x90);
            uVar17 = *(undefined8 *)(unaff_x29 + -0x98);
            puVar4[0x11] = *(undefined8 *)(unaff_x29 + -0xa0);
            puVar4[0x10] = uVar16;
            puVar4[0x13] = uVar18;
            puVar4[0x12] = uVar17;
            puVar4[0x14] = *(undefined8 *)(unaff_x29 + -0x88);
            uVar16 = *(undefined8 *)(unaff_x29 + -200);
            puVar4[0xd] = *(undefined8 *)(unaff_x29 + -0xc0);
            puVar4[0xc] = uVar16;
            puVar4[0xf] = uVar15;
            puVar4[0xe] = uVar14;
            puVar4[0x71] = in_stack_00000038;
            *in_stack_00000038 = puVar4;
            *(undefined2 *)(in_stack_00000038 + 0x6f) = 1;
            goto LAB_005a7ae0;
          }
          func_0x007a247c(&UNK_008ae948,0x30,&UNK_009f1bc8);
        }
      }
code_r0x005a7b60:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x5a7b64);
      (*pcVar3)();
    }
    uVar1 = *(ushort *)(unaff_x23 + 0x6f);
    uVar8 = (ulong)uVar1;
    if (lVar10 != lVar5) {
      func_0x007a247c(&UNK_008ae9a0,0x35,&UNK_009f1c40);
      goto code_r0x005a7b60;
    }
    uVar2 = *(ushort *)(lVar9 + 0x37a);
    uVar12 = (ulong)uVar2;
    if (uVar2 < 0xb) {
      uVar13 = uVar8 + 1;
      plVar6 = (long *)(lVar9 + 8 + uVar8 * 8);
      if (uVar1 < uVar2) {
        lVar5 = (uVar12 - uVar8) * 8;
        _memmove(lVar9 + 8 + uVar13 * 8,plVar6,lVar5);
        plVar11 = (long *)(lVar9 + 0x60 + uVar8 * 0x48);
        _memmove(lVar9 + 0x60 + uVar13 * 0x48,plVar11,(uVar12 - uVar8) * 0x48);
        plVar11[3] = in_stack_000000d8;
        plVar11[2] = in_stack_000000d0;
        plVar11[5] = in_stack_000000e8;
        plVar11[4] = in_stack_000000e0;
        plVar11[7] = in_stack_000000f8;
        plVar11[6] = in_stack_000000f0;
        plVar11[8] = in_stack_00000100;
        plVar11[1] = in_stack_000000c8;
        *plVar11 = in_stack_000000c0;
        _memmove(lVar9 + 0x380 + uVar8 * 8 + 0x10,lVar9 + 0x380 + uVar13 * 8,lVar5);
        unaff_x27 = in_stack_00000018;
      }
      else {
        lVar5 = lVar9 + uVar8 * 0x48;
        *(long *)(lVar5 + 0x78) = in_stack_000000d8;
        *(long *)(lVar5 + 0x70) = in_stack_000000d0;
        *(long *)(lVar5 + 0x88) = in_stack_000000e8;
        *(long *)(lVar5 + 0x80) = in_stack_000000e0;
        *(long *)(lVar5 + 0x98) = in_stack_000000f8;
        *(long *)(lVar5 + 0x90) = in_stack_000000f0;
        *(long *)(lVar5 + 0xa0) = in_stack_00000100;
        *(long *)(lVar5 + 0x68) = in_stack_000000c8;
        *(long *)(lVar5 + 0x60) = in_stack_000000c0;
      }
      *plVar6 = unaff_x20;
      *(undefined8 **)(lVar9 + uVar13 * 8 + 0x380) = in_stack_00000038;
      *(ushort *)(lVar9 + 0x37a) = uVar2 + 1;
      if (uVar13 < uVar12 + 2) {
        lVar5 = uVar8 + 0x71;
        do {
          plVar6 = *(long **)(lVar9 + lVar5 * 8);
          *plVar6 = lVar9;
          *(short *)(plVar6 + 0x6f) = (short)lVar5 + -0x70;
          lVar5 = lVar5 + 1;
        } while (lVar5 - uVar12 != 0x72);
      }
      unaff_x28 = in_stack_00000020;
LAB_005a7ae0:
      *unaff_x26 = unaff_x28;
      unaff_x26[1] = in_stack_00000030;
      unaff_x26[2] = unaff_x27;
      return;
    }
    *(long *)(unaff_x29 + -0xe8) = lVar9;
    *(long *)(unaff_x29 + -0xe0) = lVar5 + 1;
    if (uVar1 < 5) {
      *(undefined8 *)(unaff_x29 + -0xd8) = 4;
      func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
      plVar6 = in_stack_00000028;
    }
    else {
      if (uVar1 == 5) break;
      if (uVar1 == 6) {
        *(undefined8 *)(unaff_x29 + -0xd8) = 5;
        func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
        uVar8 = 0;
      }
      else {
        *(undefined8 *)(unaff_x29 + -0xd8) = 6;
        func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
        uVar8 = uVar8 - 7;
      }
      plVar6 = in_stack_00000008;
    }
    lVar9 = *plVar6;
    uVar1 = *(ushort *)(lVar9 + 0x37a);
    uVar13 = (ulong)uVar1;
    uVar12 = uVar8 + 1;
    plVar6 = (long *)(lVar9 + 8 + uVar8 * 8);
    lVar5 = uVar13 - uVar8;
    if (uVar13 < uVar8 || lVar5 == 0) {
      lVar5 = lVar9 + (long)(int)uVar8 * 0x48;
      *(long *)(lVar5 + 0x78) = in_stack_000000d8;
      *(long *)(lVar5 + 0x70) = in_stack_000000d0;
      *(long *)(lVar5 + 0x88) = in_stack_000000e8;
      *(long *)(lVar5 + 0x80) = in_stack_000000e0;
      *(long *)(lVar5 + 0x98) = in_stack_000000f8;
      *(long *)(lVar5 + 0x90) = in_stack_000000f0;
      *(long *)(lVar5 + 0xa0) = in_stack_00000100;
      *(long *)(lVar5 + 0x68) = in_stack_000000c8;
      *(long *)(lVar5 + 0x60) = in_stack_000000c0;
    }
    else {
      _memmove(lVar9 + 8 + uVar12 * 8,plVar6,lVar5 * 8);
      plVar11 = (long *)(lVar9 + 0x60 + (long)(int)uVar8 * 0x48);
      _memmove(lVar9 + 0x60 + (long)(int)uVar12 * 0x48,plVar11,lVar5 * 0x48);
      plVar11[3] = in_stack_000000d8;
      plVar11[2] = in_stack_000000d0;
      plVar11[5] = in_stack_000000e8;
      plVar11[4] = in_stack_000000e0;
      plVar11[7] = in_stack_000000f8;
      plVar11[6] = in_stack_000000f0;
      plVar11[8] = in_stack_00000100;
      plVar11[1] = in_stack_000000c8;
      *plVar11 = in_stack_000000c0;
      _memmove(lVar9 + 0x380 + uVar8 * 8 + 0x10,lVar9 + 0x380 + uVar12 * 8,lVar5 * 8);
    }
    *plVar6 = unaff_x20;
    *(undefined8 **)(lVar9 + uVar12 * 8 + 0x380) = in_stack_00000038;
    *(ushort *)(lVar9 + 0x37a) = uVar1 + 1;
    if (uVar12 < uVar13 + 2) {
      lVar5 = uVar8 + 0x71;
      do {
        plVar6 = *(long **)(lVar9 + lVar5 * 8);
        *plVar6 = lVar9;
        *(short *)(plVar6 + 0x6f) = (short)lVar5 + -0x70;
        lVar5 = lVar5 + 1;
      } while (lVar5 - uVar13 != 0x72);
    }
    unaff_x20 = *(long *)(unaff_x29 + -0xd0);
    in_stack_000000c0 = *(long *)(unaff_x29 + -200);
    in_stack_000000d0 = *(long *)(unaff_x29 + -0xb8);
    in_stack_000000c8 = *(long *)(unaff_x29 + -0xc0);
    in_stack_000000e0 = *(long *)(unaff_x29 + -0xa8);
    in_stack_000000d8 = *(long *)(unaff_x29 + -0xb0);
    in_stack_000000f0 = *(long *)(unaff_x29 + -0x98);
    in_stack_000000e8 = *(long *)(unaff_x29 + -0xa0);
    in_stack_00000100 = *(long *)(unaff_x29 + -0x88);
    in_stack_000000f8 = *(long *)(unaff_x29 + -0x90);
    unaff_x23 = *(long **)(unaff_x29 + -0x80);
    unaff_x27 = in_stack_00000018;
    unaff_x28 = in_stack_00000020;
  } while( true );
  *(undefined8 *)(unaff_x29 + -0xd8) = 5;
  func_0x005a7bd0(unaff_x29 + -0xd0,unaff_x29 + -0xe8);
  unaff_x23 = *(long **)(unaff_x29 + -0x80);
  uVar1 = *(ushort *)((long)unaff_x23 + 0x37a);
  unaff_x19 = (ulong)uVar1;
  unaff_w24 = uVar1 + 1;
  if (5 < unaff_x19) {
    unaff_x25 = unaff_x19 - 5;
    goto code_r0x005a76cc;
  }
  unaff_x23[6] = unaff_x20;
  unaff_x23[0x41] = in_stack_00000100;
  unaff_x23[0x3e] = in_stack_000000e8;
  unaff_x23[0x3d] = in_stack_000000e0;
  unaff_x23[0x40] = in_stack_000000f8;
  unaff_x23[0x3f] = in_stack_000000f0;
  unaff_x23[0x3a] = in_stack_000000c8;
  unaff_x23[0x39] = in_stack_000000c0;
  unaff_x23[0x3c] = in_stack_000000d8;
  unaff_x23[0x3b] = in_stack_000000d0;
  unaff_x23[0x76] = (long)in_stack_00000038;
  *(short *)((long)unaff_x23 + 0x37a) = unaff_w24;
  if (uVar1 == 5) goto LAB_005a78b4;
  goto code_r0x005a78e0;
}

