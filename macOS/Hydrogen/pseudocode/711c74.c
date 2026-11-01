
/* WARNING: Possible PIC construction at 0x007120b0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007120b4) */

undefined8 * FUN_00711c74(void)

{
  long lVar1;
  int iVar2;
  undefined1 *puVar3;
  bool in_ZR;
  undefined1 uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong *puVar7;
  long lVar8;
  long lVar9;
  long extraout_x1;
  ulong uVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x19;
  undefined8 uVar16;
  ulong *puVar17;
  undefined8 *puVar18;
  int unaff_w22;
  undefined8 *puVar19;
  undefined8 uVar20;
  int unaff_w23;
  undefined8 *puVar21;
  undefined8 *puVar22;
  undefined8 *puVar23;
  undefined8 uVar24;
  long lVar25;
  uint uVar26;
  ulong unaff_x27;
  ulong unaff_x28;
  undefined8 uVar27;
  long unaff_x29;
  undefined1 *puVar28;
  undefined *puVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auStack_e0 [128];
  undefined1 auStack_6 [6];
  
  if (((in_ZR) && (unaff_w23 == *(int *)(unaff_x19 + 0x90))) &&
     (unaff_w22 == *(int *)(unaff_x19 + 0x8c))) {
    func_0x00710d48();
  }
  func_0x007167f8();
  puVar5 = (undefined8 *)func_0x00716770();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return puVar5;
  }
  auVar33 = ___stack_chk_fail();
  puVar22 = auVar33._0_8_;
  puVar28 = auStack_6 + -10;
  puVar17 = (ulong *)*puVar22;
  puVar5 = (undefined8 *)puVar17[1];
  if (puVar5 < (undefined8 *)puVar17[2]) {
    puVar19 = puVar5 + 1;
    *puVar5 = *auVar33._8_8_;
    puVar6 = puVar22;
    goto LAB_00711ef8;
  }
  puVar21 = (undefined8 *)*puVar17;
  lVar25 = (long)puVar5 - (long)puVar21;
  puVar23 = (undefined8 *)(lVar25 >> 3);
  uVar14 = (long)puVar23 + 1;
  if (uVar14 >> 0x3d != 0) {
    func_0x00017f90(puVar17);
LAB_00711f2c:
    puVar29 = &DAT_00711f30;
    auVar34 = func_0x00017514();
    lVar8 = auVar34._8_8_;
    puVar7 = auVar34._0_8_;
    puVar3 = auStack_e0 + 0x80;
    puVar22 = puVar5;
    while( true ) {
      *(ulong *)(puVar3 + -0x60) = unaff_x28;
      *(ulong *)(puVar3 + -0x58) = unaff_x27;
      *(long *)(puVar3 + -0x50) = lVar25;
      *(undefined8 **)(puVar3 + -0x48) = puVar23;
      *(undefined8 **)(puVar3 + -0x40) = puVar22;
      *(undefined8 **)(puVar3 + -0x38) = puVar21;
      *(long *)(puVar3 + -0x30) = auVar33._8_8_;
      *(undefined8 **)(puVar3 + -0x28) = puVar5;
      *(ulong **)(puVar3 + -0x20) = puVar17;
      *(long *)(puVar3 + -0x18) = auVar33._0_8_;
      *(undefined1 **)(puVar3 + -0x10) = puVar28;
      *(undefined **)(puVar3 + -8) = puVar29;
      puVar28 = puVar3 + -0x10;
      puVar21 = (undefined8 *)((long)puVar7 + 0x84);
      uVar16 = *puVar21;
      func_0x00710d48(puVar7,lVar8);
      puVar23 = (undefined8 *)func_0x007168a8(puVar7,0);
      uVar26 = (uint)puVar7[0x10];
      unaff_x27 = (ulong)uVar26;
      uVar20 = *puVar21;
      puVar5 = *(undefined8 **)((long)puVar7 + 0x8c);
      puVar3[-0x78] = 0;
      puVar3[-0x68] = 0;
      *(undefined8 *)(puVar3 + -0xa8) = uVar20;
      if (uVar26 == 0x134) {
        func_0x00710d48(puVar7);
        *(undefined8 *)(puVar3 + -0x78) = uVar20;
        *(undefined8 **)(puVar3 + -0x70) = puVar5;
        puVar3[-0x68] = 1;
      }
      else {
        func_0x0072447c(puVar7,0x134,"if statement");
      }
      puVar17 = puVar7 + 0x32;
      auVar33._8_8_ = puVar17;
      auVar33._0_8_ = uVar16;
      uVar14 = puVar7[0x32];
      uVar15 = puVar7[0x33];
      lVar25 = func_0x00711360(puVar7);
      uVar10 = puVar7[0x32];
      uVar13 = (long)(puVar7[0x33] - uVar10) >> 3;
      unaff_x28 = uVar15 - uVar14 >> 3 & 0xffffffff;
      if (unaff_x28 < uVar13) {
        *(long *)(puVar3 + -0xb0) = lVar25;
        do {
          uVar14 = uVar13 - 1;
          uVar20 = *(undefined8 *)(*(long *)(*puVar17 + uVar13 * 8 + -8) + 0x18);
          puVar5 = (undefined8 *)func_0x006db828(puVar7 + 0x2d);
          *puVar5 = uVar20;
          uVar13 = uVar14;
        } while (unaff_x28 < uVar14);
        uVar10 = puVar7[0x32];
        uVar13 = (long)(puVar7[0x33] - uVar10) >> 3;
        lVar25 = *(long *)(puVar3 + -0xb0);
        puVar5 = puVar23;
      }
      lVar8 = unaff_x28 - uVar13;
      if (unaff_x28 < uVar13 || lVar8 == 0) {
        if (unaff_x28 < uVar13) {
          puVar7[0x33] = uVar10 + unaff_x28 * 8;
        }
      }
      else {
        func_0x006cfeb0(puVar17);
        lVar8 = extraout_x1;
      }
      puVar3[-0x90] = 0;
      puVar3[-0x80] = 0;
      if ((int)puVar7[0x10] == 0x126) break;
      if ((int)puVar7[0x10] != 0x127) {
        lVar8 = 0;
        goto code_r0x00712194;
      }
      *(undefined1 *)(lVar25 + 0x30) = 1;
      puVar22 = (undefined8 *)(ulong)*(uint *)((long)puVar7 + 0x114);
      uVar26 = *(uint *)((long)puVar7 + 0x114) + 1;
      *(uint *)((long)puVar7 + 0x114) = uVar26;
      if (uRam0000000000a33728 < uVar26) {
        *(char **)(puVar3 + -0xc0) = "elseif";
        lVar8 = func_0x0070f408(puVar21,
                                "Exceeded allowed recursion depth; simplify your %s to make the code compile"
                               );
        *(ulong *)(puVar3 + -0x120) = unaff_x28;
        *(ulong *)(puVar3 + -0x118) = unaff_x27;
        *(long *)(puVar3 + -0x110) = lVar25;
        *(undefined8 **)(puVar3 + -0x108) = puVar23;
        *(undefined8 **)(puVar3 + -0x100) = puVar22;
        *(undefined8 **)(puVar3 + -0xf8) = puVar21;
        *(ulong **)(puVar3 + -0xf0) = puVar17;
        *(undefined8 **)(puVar3 + -0xe8) = puVar5;
        *(ulong **)(puVar3 + -0xe0) = puVar7;
        *(undefined8 *)(puVar3 + -0xd8) = uVar16;
        *(undefined1 **)(puVar3 + -0xd0) = puVar28;
        *(undefined **)(puVar3 + -200) = &DAT_00712240;
        uVar20 = *(undefined8 *)(lVar8 + 0x84);
        func_0x00710d48();
        uVar16 = func_0x007168a8(lVar8,0);
        uVar27 = *(undefined8 *)(lVar8 + 0x80);
        uVar30 = *(undefined8 *)(lVar8 + 0x98);
        uVar24 = *(undefined8 *)(lVar8 + 0x90);
        *(undefined8 *)(puVar3 + -0x138) = *(undefined8 *)(lVar8 + 0x88);
        *(undefined8 *)(puVar3 + -0x140) = uVar27;
        *(undefined8 *)(puVar3 + -0x128) = uVar30;
        *(undefined8 *)(puVar3 + -0x130) = uVar24;
        iVar2 = *(int *)(lVar8 + 0x80);
        if (iVar2 == 0x125) {
          func_0x00710d48(lVar8);
        }
        else {
          func_0x0072447c(lVar8,0x125,"while loop");
        }
        *(int *)(*(long *)(lVar8 + 0x150) + -4) = *(int *)(*(long *)(lVar8 + 0x150) + -4) + 1;
        lVar25 = *(long *)(lVar8 + 400);
        lVar1 = *(long *)(lVar8 + 0x198);
        lVar9 = func_0x00711360(lVar8);
        lVar11 = *(long *)(lVar8 + 400);
        uVar14 = *(long *)(lVar8 + 0x198) - lVar11 >> 3;
        uVar10 = (ulong)(lVar1 - lVar25) >> 3 & 0xffffffff;
        if (uVar10 < uVar14) {
          do {
            uVar15 = uVar14 - 1;
            uVar27 = *(undefined8 *)(*(long *)(*(long *)(lVar8 + 400) + uVar14 * 8 + -8) + 0x18);
            puVar5 = (undefined8 *)func_0x006db828(lVar8 + 0x168);
            *puVar5 = uVar27;
            uVar14 = uVar15;
          } while (uVar10 < uVar15);
          lVar11 = *(long *)(lVar8 + 400);
          uVar14 = *(long *)(lVar8 + 0x198) - lVar11 >> 3;
        }
        if (uVar10 < uVar14 || uVar10 - uVar14 == 0) {
          if (uVar10 < uVar14) {
            *(ulong *)(lVar8 + 0x198) = lVar11 + uVar10 * 8;
          }
        }
        else {
          func_0x006cfeb0((long *)(lVar8 + 400),uVar10 - uVar14);
        }
        *(int *)(*(long *)(lVar8 + 0x150) + -4) = *(int *)(*(long *)(lVar8 + 0x150) + -4) + -1;
        uVar24 = *(undefined8 *)(lVar8 + 0x8c);
        *(undefined4 *)(puVar3 + -0x150) = *(undefined4 *)(puVar3 + -0x140);
        *(undefined8 *)(puVar3 + -0x14c) = *(undefined8 *)(puVar3 + -0x13c);
        uVar4 = func_0x00716f30(lVar8,0x128,puVar3 + -0x150);
        *(undefined1 *)(lVar9 + 0x30) = uVar4;
        uVar27 = *(undefined8 *)(lVar8 + 0xd8);
        *(undefined8 *)(puVar3 + -0x150) = uVar20;
        *(undefined8 *)(puVar3 + -0x148) = uVar24;
        uVar20 = func_0x00704c24(uVar27,0x48);
        puVar5 = (undefined8 *)
                 func_0x00706e70(uVar20,puVar3 + -0x150,uVar16,lVar9,iVar2 == 0x125,
                                 (ulong)(puVar3 + -0x140) | 4);
        return puVar5;
      }
      uVar16 = *puVar21;
      *(undefined8 *)(puVar3 + -0x88) = *(undefined8 *)((long)puVar7 + 0x8c);
      *(undefined8 *)(puVar3 + -0x90) = uVar16;
      puVar3[-0x80] = 1;
      puVar29 = &UNK_007120b4;
      puVar3 = puVar3 + -0xc0;
      puVar17 = puVar7;
    }
    *(undefined1 *)(lVar25 + 0x30) = 1;
    uVar20 = *puVar21;
    *(undefined8 *)(puVar3 + -0x88) = *(undefined8 *)((long)puVar7 + 0x8c);
    *(undefined8 *)(puVar3 + -0x90) = uVar20;
    puVar3[-0x80] = 1;
    *(undefined8 *)(puVar3 + -0xa8) = *(undefined8 *)((long)puVar7 + 0x84);
    uVar20 = *(undefined8 *)((long)puVar7 + 0x8c);
    func_0x00710d48(puVar7,lVar8);
    uVar14 = puVar7[0x32];
    uVar15 = puVar7[0x33];
    lVar8 = func_0x00711360(puVar7);
    uVar10 = puVar7[0x32];
    uVar13 = (long)(puVar7[0x33] - uVar10) >> 3;
    uVar14 = uVar15 - uVar14 >> 3 & 0xffffffff;
    if (uVar14 < uVar13) {
      *(undefined8 **)(puVar3 + -0xb0) = puVar23;
      do {
        uVar10 = uVar13 - 1;
        uVar27 = *(undefined8 *)(*(long *)(*puVar17 + uVar13 * 8 + -8) + 0x18);
        puVar5 = (undefined8 *)func_0x006db828(puVar7 + 0x2d);
        *puVar5 = uVar27;
        uVar13 = uVar10;
      } while (uVar14 < uVar10);
      uVar10 = puVar7[0x32];
      uVar13 = (long)(puVar7[0x33] - uVar10) >> 3;
      puVar23 = *(undefined8 **)(puVar3 + -0xb0);
    }
    if (uVar14 < uVar13 || uVar14 - uVar13 == 0) {
      if (uVar14 < uVar13) {
        puVar7[0x33] = uVar10 + uVar14 * 8;
      }
    }
    else {
      func_0x006cfeb0(puVar17,uVar14 - uVar13);
    }
    *(undefined8 *)(lVar8 + 0xc) = uVar20;
    uVar26 = 0x126;
code_r0x00712194:
    uVar20 = *(undefined8 *)((long)puVar7 + 0x8c);
    *(uint *)(puVar3 + -0xa0) = uVar26;
    *(undefined8 *)(puVar3 + -0x9c) = *(undefined8 *)(puVar3 + -0xa8);
    uVar4 = func_0x00716f30(puVar7,0x128,puVar3 + -0xa0);
    if (lVar8 == 0) {
      *(undefined1 *)(lVar25 + 0x30) = uVar4;
    }
    else if (*(int *)(lVar8 + 8) == iRam0000000000a27b78) {
      *(undefined1 *)(lVar8 + 0x30) = uVar4;
    }
    uVar14 = puVar7[0x1b];
    *(undefined8 *)(puVar3 + -0xa0) = uVar16;
    *(undefined8 *)(puVar3 + -0x98) = uVar20;
    uVar16 = func_0x00704c24(uVar14,0x60);
    puVar5 = (undefined8 *)
             func_0x00706d94(uVar16,puVar3 + -0xa0,puVar23,lVar25,lVar8,puVar3 + -0x78,
                             puVar3 + -0x90);
    return puVar5;
  }
  uVar10 = (long)puVar17[2] - (long)puVar21;
  unaff_x27 = (long)uVar10 >> 2;
  if (unaff_x27 <= uVar14) {
    unaff_x27 = uVar14;
  }
  if (0x7ffffffffffffff7 < uVar10) {
    unaff_x27 = 0x1fffffffffffffff;
  }
  if (unaff_x27 == 0) {
    puVar6 = (undefined8 *)0x0;
  }
  else {
    if (unaff_x27 >> 0x3d != 0) goto LAB_00711f2c;
    puVar6 = (undefined8 *)__Znwm(unaff_x27 << 3);
  }
  puVar12 = puVar6 + (long)puVar23;
  puVar19 = puVar12 + 1;
  *puVar12 = *auVar33._8_8_;
  if ((long)puVar5 - (long)puVar21 != 0) {
    uVar14 = ((long)puVar5 - (long)puVar21) - 8;
    puVar18 = puVar5;
    if ((uVar14 < 0x58) || ((ulong)((long)puVar5 + (-lVar25 - (long)puVar6)) < 0x40)) {
code_r0x00711ed0:
      do {
        puVar18 = puVar18 + -1;
        puVar12 = puVar12 + -1;
        *puVar12 = *puVar18;
      } while (puVar18 != puVar21);
    }
    else {
      uVar14 = (uVar14 >> 3) + 1;
      uVar15 = uVar14 & 0x3ffffffffffffff8;
      puVar18 = puVar5 + -uVar15;
      puVar12 = puVar12 + -uVar15;
      puVar5 = puVar5 + -4;
      puVar23 = puVar6 + ((long)puVar23 - 4);
      uVar10 = uVar15;
      do {
        uVar27 = *puVar5;
        uVar20 = puVar5[3];
        uVar16 = puVar5[2];
        uVar32 = puVar5[-3];
        uVar31 = puVar5[-4];
        uVar30 = puVar5[-1];
        uVar24 = puVar5[-2];
        puVar23[1] = puVar5[1];
        *puVar23 = uVar27;
        puVar23[3] = uVar20;
        puVar23[2] = uVar16;
        puVar23[-3] = uVar32;
        puVar23[-4] = uVar31;
        puVar23[-1] = uVar30;
        puVar23[-2] = uVar24;
        puVar5 = puVar5 + -8;
        puVar23 = puVar23 + -8;
        uVar10 = uVar10 - 8;
      } while (uVar10 != 0);
      if (uVar14 != uVar15) goto code_r0x00711ed0;
    }
    puVar5 = (undefined8 *)*puVar17;
  }
  *puVar17 = (ulong)puVar12;
  puVar17[1] = (ulong)puVar19;
  puVar17[2] = (ulong)(puVar6 + unaff_x27);
  if (puVar5 != (undefined8 *)0x0) {
    puVar6 = (undefined8 *)__ZdlPv(puVar5);
  }
LAB_00711ef8:
  puVar17[1] = (ulong)puVar19;
  puVar22[2] = puVar22[2] + 1;
  return puVar6;
}

