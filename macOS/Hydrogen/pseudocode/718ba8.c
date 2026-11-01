
undefined1  [16] FUN_00718ba8(void)

{
  ulong *puVar1;
  long *plVar2;
  long lVar3;
  undefined4 uVar4;
  code *pcVar5;
  undefined1 uVar6;
  long lVar7;
  long lVar8;
  undefined8 *puVar9;
  ulong *puVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  ulong *puVar16;
  ulong uVar17;
  long unaff_x19;
  long unaff_x20;
  ulong uVar18;
  int unaff_w22;
  ulong *puVar19;
  ulong uVar20;
  undefined8 uVar21;
  undefined8 *unaff_x24;
  ulong *puVar22;
  ulong unaff_x26;
  undefined8 *unaff_x27;
  long unaff_x28;
  ulong *puVar23;
  ulong *puVar24;
  long unaff_x29;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000068;
  undefined4 *in_stack_00000070;
  uint uStack000000000000007c;
  undefined4 uStack0000000000000080;
  undefined4 uStack0000000000000084;
  undefined4 in_stack_00000088;
  undefined4 uStack000000000000008c;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined4 uStack00000000000000a0;
  undefined4 uStack00000000000000a4;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  ulong in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined1 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  
  func_0x00717434();
  uStack000000000000007c = (uint)uStack0000000000000090 & 0xff;
  in_stack_000000d8 = CONCAT44(uStack00000000000000a0,uStack0000000000000098._4_4_);
  in_stack_000000d0 = CONCAT44((undefined4)uStack0000000000000098,uStack0000000000000090._4_4_);
  in_stack_000000b8 = in_stack_000000b8 & 0xffffffffffffff00;
  in_stack_000000c8 = 0;
  if (unaff_w22 == 0x28) {
    if (*(int *)(unaff_x19 + 0x80) == 0x29) {
      in_stack_000000b8 = *(ulong *)(unaff_x28 + 4);
      in_stack_000000c0 = *(undefined8 *)(unaff_x19 + 0x8c);
      in_stack_000000c8 = 1;
      goto LAB_00718c5c;
    }
LAB_00718c68:
    func_0x00721808();
    func_0x007244d4();
  }
  else {
    if (*(int *)(unaff_x19 + 0x80) != 0x29) goto LAB_00718c68;
LAB_00718c5c:
    func_0x00710d48();
  }
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) = *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) + -1
  ;
  if (*(int *)(unaff_x19 + 0x80) == 0x3a) {
LAB_00718cc4:
    if ((unaff_x26 & 1) == 0) {
      *(undefined8 *)(unaff_x20 + 0x58) = *unaff_x27;
    }
    func_0x00710d48();
    uVar4 = *(undefined4 *)(unaff_x19 + 0x114);
    func_0x0071c0b4();
    if (*(int *)(unaff_x19 + 0x80) == 0x2c) {
      func_0x007181dc();
      func_0x00710d48();
    }
    *(undefined4 *)(unaff_x19 + 0x114) = uVar4;
    if (unaff_x24 != (undefined8 *)0x0) goto LAB_00718d18;
LAB_00718d68:
    lVar12 = *(long *)(unaff_x19 + 400);
    lVar13 = *(long *)(unaff_x19 + 0x198);
    puVar24 = *(ulong **)(unaff_x19 + 0x150);
    puVar10 = *(ulong **)(unaff_x19 + 0x158);
    uStack0000000000000048 = 0;
    if (puVar10 <= puVar24) goto LAB_00718d80;
  }
  else {
    if (*(int *)(unaff_x19 + 0x80) == 0x107) {
      func_0x007181dc();
      goto LAB_00718cc4;
    }
    if (unaff_x24 == (undefined8 *)0x0) goto LAB_00718d68;
LAB_00718d18:
    uStack0000000000000098._0_4_ = (undefined4)unaff_x24[1];
    uStack0000000000000098._4_4_ = (undefined4)((ulong)unaff_x24[1] >> 0x20);
    uStack0000000000000090._0_4_ = (uint)*unaff_x24;
    uStack0000000000000090._4_4_ = (undefined4)((ulong)*unaff_x24 >> 0x20);
    in_stack_000000a8 = 0;
    in_stack_000000b0 = 0;
    uStack00000000000000a0 = (undefined4)unaff_x24[2];
    uStack00000000000000a4 = (undefined4)((ulong)unaff_x24[2] >> 0x20);
    uStack0000000000000048 = func_0x007170f8();
    lVar12 = *(long *)(unaff_x19 + 400);
    lVar13 = *(long *)(unaff_x19 + 0x198);
    puVar24 = *(ulong **)(unaff_x19 + 0x150);
    puVar10 = *(ulong **)(unaff_x19 + 0x158);
    if (puVar10 <= puVar24) {
LAB_00718d80:
      puVar1 = (ulong *)(unaff_x19 + 0x148);
      puVar22 = (ulong *)*puVar1;
      lVar15 = (long)puVar24 - (long)puVar22 >> 3;
      uVar18 = lVar15 + 1;
      if (uVar18 >> 0x3d != 0) {
        func_0x00017f90(puVar1);
code_r0x007191b8:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x7191bc);
        (*pcVar5)();
      }
      uVar20 = (long)puVar10 - (long)puVar22 >> 2;
      if (uVar20 <= uVar18) {
        uVar20 = uVar18;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)puVar10 - (long)puVar22)) {
        uVar20 = 0x1fffffffffffffff;
      }
      if (uVar20 == 0) {
        lVar7 = 0;
      }
      else {
        if (uVar20 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x007191b8;
        }
        lVar7 = __Znwm(uVar20 << 3);
      }
      puVar10 = (ulong *)(lVar7 + lVar15 * 8);
      puVar19 = puVar10 + 1;
      *puVar10 = (ulong)uStack000000000000007c;
      if ((long)puVar24 - (long)puVar22 != 0) {
        uVar18 = ((long)puVar24 - (long)puVar22) - 8;
        puVar23 = puVar24;
        if ((uVar18 < 0x58) ||
           ((ulong)((long)puVar24 - (((long)puVar24 - (long)puVar22) + lVar7)) < 0x40)) {
LAB_00718e6c:
          do {
            puVar23 = puVar23 + -1;
            puVar10 = puVar10 + -1;
            *puVar10 = *puVar23;
          } while (puVar23 != puVar22);
        }
        else {
          uVar18 = (uVar18 >> 3) + 1;
          uVar14 = uVar18 & 0x3ffffffffffffff8;
          puVar23 = puVar24 + -uVar14;
          puVar10 = puVar10 + -uVar14;
          puVar24 = puVar24 + -4;
          puVar16 = (ulong *)(lVar7 + lVar15 * 8 + -0x20);
          uVar17 = uVar14;
          do {
            uVar27 = *puVar24;
            uVar26 = puVar24[3];
            uVar25 = puVar24[2];
            uVar31 = puVar24[-3];
            uVar30 = puVar24[-4];
            uVar29 = puVar24[-1];
            uVar28 = puVar24[-2];
            puVar16[1] = puVar24[1];
            *puVar16 = uVar27;
            puVar16[3] = uVar26;
            puVar16[2] = uVar25;
            puVar16[-3] = uVar31;
            puVar16[-4] = uVar30;
            puVar16[-1] = uVar29;
            puVar16[-2] = uVar28;
            puVar24 = puVar24 + -8;
            puVar16 = puVar16 + -8;
            uVar17 = uVar17 - 8;
          } while (uVar17 != 0);
          if (uVar18 != uVar14) goto LAB_00718e6c;
        }
        puVar24 = (ulong *)*puVar1;
      }
      *(ulong **)(unaff_x19 + 0x148) = puVar10;
      *(ulong **)(unaff_x19 + 0x150) = puVar19;
      *(ulong *)(unaff_x19 + 0x158) = lVar7 + uVar20 * 8;
      if (puVar24 != (ulong *)0x0) {
        __ZdlPv(puVar24);
      }
      goto LAB_00718e98;
    }
  }
  puVar19 = puVar24 + 1;
  *puVar24 = (ulong)uStack000000000000007c;
LAB_00718e98:
  *(ulong **)(unaff_x19 + 0x150) = puVar19;
  func_0x0071b484(&uStack0000000000000090);
  lVar7 = *(long *)(unaff_x19 + 400);
  lVar3 = *(long *)(unaff_x19 + 0x198);
  lVar8 = func_0x00711360();
  plVar2 = (long *)(unaff_x19 + 400);
  lVar11 = *(long *)(unaff_x19 + 400);
  lVar15 = *(long *)(unaff_x19 + 0x198);
  uVar18 = lVar15 - lVar11 >> 3;
  uVar20 = (ulong)(lVar3 - lVar7) >> 3 & 0xffffffff;
  if (uVar20 < uVar18) {
    do {
      uVar21 = *(undefined8 *)(*(long *)(*plVar2 + uVar18 * 8 + -8) + 0x18);
      puVar9 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar18 = uVar18 - 1;
      *puVar9 = uVar21;
    } while (uVar20 < uVar18);
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar15 = *(long *)(unaff_x19 + 0x198);
    uVar18 = lVar15 - lVar11 >> 3;
  }
  if (uVar20 < uVar18 || uVar20 - uVar18 == 0) {
    if (uVar20 < uVar18) {
      lVar15 = lVar11 + uVar20 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar15;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar20 - uVar18);
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar15 = *(long *)(unaff_x19 + 0x198);
  }
  *(long *)(unaff_x19 + 0x150) = *(long *)(unaff_x19 + 0x150) + -8;
  uVar18 = lVar15 - lVar11 >> 3;
  uVar20 = (ulong)(lVar13 - lVar12) >> 3 & 0xffffffff;
  if (uVar20 < uVar18) {
    do {
      uVar21 = *(undefined8 *)(*(long *)(*plVar2 + uVar18 * 8 + -8) + 0x18);
      puVar9 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar18 = uVar18 - 1;
      *puVar9 = uVar21;
    } while (uVar20 < uVar18);
    lVar11 = *(long *)(unaff_x19 + 400);
    uVar18 = *(long *)(unaff_x19 + 0x198) - lVar11 >> 3;
  }
  if (uVar20 < uVar18 || uVar20 - uVar18 == 0) {
    if (uVar20 < uVar18) {
      *(ulong *)(unaff_x19 + 0x198) = lVar11 + uVar20 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar20 - uVar18);
  }
  uVar21 = *(undefined8 *)(unaff_x19 + 0x8c);
  uStack0000000000000080 = *in_stack_00000070;
  uStack0000000000000084 = (undefined4)*(undefined8 *)(in_stack_00000070 + 1);
  in_stack_00000088 = (undefined4)((ulong)*(undefined8 *)(in_stack_00000070 + 1) >> 0x20);
  uVar6 = func_0x00716f30();
  *(undefined1 *)(lVar8 + 0x30) = uVar6;
  uStack0000000000000080 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000084 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
  in_stack_00000088 = (undefined4)uVar21;
  uStack000000000000008c = (undefined4)((ulong)uVar21 >> 0x20);
  auVar33._0_8_ = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0xc0);
  func_0x00706378(auVar33._0_8_,&uStack0000000000000080,in_stack_00000068,unaff_x29 + -0x90,
                  unaff_x29 + -0x80,
                  CONCAT44(uStack0000000000000090._4_4_,(uint)uStack0000000000000090),
                  &uStack0000000000000098,uStack000000000000007c != 0);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    *(undefined8 *)(unaff_x20 + 4) = *(undefined8 *)(in_stack_00000070 + 1);
    auVar32 = func_0x00717910();
    *(undefined1 (*) [16])(unaff_x20 + 0x30) = auVar32;
    lVar12 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar12 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (auVar33._0_8_ != *(ulong *)(unaff_x19 + 0x430)))
      {
        uVar18 = 0;
        uVar20 = auVar33._0_8_ >> 4 ^ auVar33._0_8_ >> 9;
        do {
          uVar20 = uVar20 & lVar12 - 1U;
          uVar17 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar20 * 0x10);
          if (uVar17 == auVar33._0_8_) goto code_r0x007190f8;
          uVar18 = uVar18 + 1;
          uVar20 = uVar18 + uVar20;
        } while (uVar17 != *(ulong *)(unaff_x19 + 0x430) && uVar18 <= lVar12 - 1U);
      }
      func_0x006db93c();
      lVar12 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x007190f8:
    lVar13 = *(long *)(unaff_x19 + 0x418);
    uVar18 = lVar12 - 1U & (auVar33._0_8_ >> 4 ^ auVar33._0_8_ >> 9);
    uVar20 = *(ulong *)(lVar13 + uVar18 * 0x10);
    if (uVar20 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar15 = 1;
      do {
        if (uVar20 == auVar33._0_8_) goto code_r0x00719158;
        uVar18 = uVar18 + lVar15 & lVar12 - 1U;
        uVar20 = *(ulong *)(lVar13 + uVar18 * 0x10);
        lVar15 = lVar15 + 1;
      } while (uVar20 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar13 + uVar18 * 0x10) = auVar33._0_8_;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00719158:
    *(long *)(lVar13 + uVar18 * 0x10 + 8) = unaff_x20;
  }
  plVar2 = *(long **)(unaff_x29 + -0xb8);
  lVar12 = *plVar2 + *(long *)(unaff_x29 + -0xb0) * 0x28;
  if (lVar12 != plVar2[1]) {
    plVar2[1] = lVar12;
  }
  auVar33._8_8_ = uStack0000000000000048;
  return auVar33;
}

