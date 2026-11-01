
undefined1  [16] FUN_00718b0c(void)

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
  int iVar10;
  long lVar11;
  ulong *puVar12;
  long lVar13;
  long lVar14;
  ulong uVar15;
  long lVar16;
  ulong *puVar17;
  ulong uVar18;
  long unaff_x19;
  long unaff_x20;
  ulong uVar19;
  int unaff_w22;
  ulong *puVar20;
  ulong uVar21;
  undefined8 uVar22;
  undefined8 *unaff_x24;
  ulong *puVar23;
  ulong unaff_x26;
  undefined8 *unaff_x27;
  long unaff_x28;
  ulong *puVar24;
  ulong *puVar25;
  long unaff_x29;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
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
  
  func_0x00710d48();
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) = *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) + 1;
  lVar11 = *(long *)(unaff_x19 + 0x2a0);
  lVar14 = *(long *)(unaff_x19 + 0x298);
  *(long *)(unaff_x29 + -0xb8) = unaff_x19 + 0x298;
  *(long *)(unaff_x29 + -0xb0) = (lVar11 - lVar14 >> 3) * -0x3333333333333333;
  *(undefined8 *)(unaff_x29 + -0xa8) = 0;
  in_stack_000000d0 = 0;
  in_stack_000000d8 = 0;
  if (*(int *)(unaff_x19 + 0x80) == 0x29) {
    uStack000000000000007c = 0;
    iVar10 = *(int *)(unaff_x19 + 0x80);
joined_r0x00718c3c:
    in_stack_000000b8 = in_stack_000000b8 & 0xffffffffffffff00;
    if (unaff_w22 == 0x28) goto code_r0x00718c40;
code_r0x00718be4:
    in_stack_000000c8 = 0;
    if (iVar10 != 0x29) goto code_r0x00718c68;
code_r0x00718c5c:
    func_0x00710d48();
  }
  else {
    if ((unaff_x26 & 1) == 0) {
      func_0x00717434(&uStack0000000000000090);
      uStack000000000000007c = (uint)uStack0000000000000090 & 0xff;
      in_stack_000000d8 = CONCAT44(uStack00000000000000a0,uStack0000000000000098._4_4_);
      in_stack_000000d0 = CONCAT44((undefined4)uStack0000000000000098,uStack0000000000000090._4_4_);
      unaff_w22 = *(int *)(unaff_x29 + -0x9c);
      iVar10 = *(int *)(unaff_x19 + 0x80);
      goto joined_r0x00718c3c;
    }
    func_0x00717434(&uStack0000000000000090);
    uStack000000000000007c = (uint)uStack0000000000000090 & 0xff;
    in_stack_000000d8 = CONCAT44(uStack00000000000000a0,uStack0000000000000098._4_4_);
    in_stack_000000d0 = CONCAT44((undefined4)uStack0000000000000098,uStack0000000000000090._4_4_);
    in_stack_000000b8 = in_stack_000000b8 & 0xffffffffffffff00;
    iVar10 = *(int *)(unaff_x19 + 0x80);
    if (unaff_w22 != 0x28) goto code_r0x00718be4;
code_r0x00718c40:
    if (iVar10 == 0x29) {
      in_stack_000000b8 = *(ulong *)(unaff_x28 + 4);
      in_stack_000000c0 = *(undefined8 *)(unaff_x19 + 0x8c);
      in_stack_000000c8 = 1;
      goto code_r0x00718c5c;
    }
code_r0x00718c68:
    in_stack_000000c8 = 0;
    func_0x00721808();
    func_0x007244d4();
  }
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) = *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0xa4) + -1
  ;
  if (*(int *)(unaff_x19 + 0x80) == 0x3a) {
code_r0x00718cc4:
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
    if (unaff_x24 != (undefined8 *)0x0) goto code_r0x00718d18;
code_r0x00718d68:
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar14 = *(long *)(unaff_x19 + 0x198);
    puVar25 = *(ulong **)(unaff_x19 + 0x150);
    puVar12 = *(ulong **)(unaff_x19 + 0x158);
    uStack0000000000000048 = 0;
    if (puVar12 <= puVar25) goto code_r0x00718d80;
  }
  else {
    if (*(int *)(unaff_x19 + 0x80) == 0x107) {
      func_0x007181dc();
      goto code_r0x00718cc4;
    }
    if (unaff_x24 == (undefined8 *)0x0) goto code_r0x00718d68;
code_r0x00718d18:
    uStack0000000000000098._0_4_ = (undefined4)unaff_x24[1];
    uStack0000000000000098._4_4_ = (undefined4)((ulong)unaff_x24[1] >> 0x20);
    uStack0000000000000090._0_4_ = (uint)*unaff_x24;
    uStack0000000000000090._4_4_ = (undefined4)((ulong)*unaff_x24 >> 0x20);
    in_stack_000000a8 = 0;
    in_stack_000000b0 = 0;
    uStack00000000000000a0 = (undefined4)unaff_x24[2];
    uStack00000000000000a4 = (undefined4)((ulong)unaff_x24[2] >> 0x20);
    uStack0000000000000048 = func_0x007170f8();
    lVar11 = *(long *)(unaff_x19 + 400);
    lVar14 = *(long *)(unaff_x19 + 0x198);
    puVar25 = *(ulong **)(unaff_x19 + 0x150);
    puVar12 = *(ulong **)(unaff_x19 + 0x158);
    if (puVar12 <= puVar25) {
code_r0x00718d80:
      puVar1 = (ulong *)(unaff_x19 + 0x148);
      puVar23 = (ulong *)*puVar1;
      lVar16 = (long)puVar25 - (long)puVar23 >> 3;
      uVar19 = lVar16 + 1;
      if (uVar19 >> 0x3d != 0) {
        func_0x00017f90(puVar1);
code_r0x007191b8:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x7191bc);
        (*pcVar5)();
      }
      uVar21 = (long)puVar12 - (long)puVar23 >> 2;
      if (uVar21 <= uVar19) {
        uVar21 = uVar19;
      }
      if (0x7ffffffffffffff7 < (ulong)((long)puVar12 - (long)puVar23)) {
        uVar21 = 0x1fffffffffffffff;
      }
      if (uVar21 == 0) {
        lVar7 = 0;
      }
      else {
        if (uVar21 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x007191b8;
        }
        lVar7 = __Znwm(uVar21 << 3);
      }
      puVar12 = (ulong *)(lVar7 + lVar16 * 8);
      puVar20 = puVar12 + 1;
      *puVar12 = (ulong)uStack000000000000007c;
      if ((long)puVar25 - (long)puVar23 != 0) {
        uVar19 = ((long)puVar25 - (long)puVar23) - 8;
        puVar24 = puVar25;
        if ((uVar19 < 0x58) ||
           ((ulong)((long)puVar25 - (((long)puVar25 - (long)puVar23) + lVar7)) < 0x40)) {
code_r0x00718e6c:
          do {
            puVar24 = puVar24 + -1;
            puVar12 = puVar12 + -1;
            *puVar12 = *puVar24;
          } while (puVar24 != puVar23);
        }
        else {
          uVar19 = (uVar19 >> 3) + 1;
          uVar15 = uVar19 & 0x3ffffffffffffff8;
          puVar24 = puVar25 + -uVar15;
          puVar12 = puVar12 + -uVar15;
          puVar25 = puVar25 + -4;
          puVar17 = (ulong *)(lVar7 + lVar16 * 8 + -0x20);
          uVar18 = uVar15;
          do {
            uVar28 = *puVar25;
            uVar27 = puVar25[3];
            uVar26 = puVar25[2];
            uVar32 = puVar25[-3];
            uVar31 = puVar25[-4];
            uVar30 = puVar25[-1];
            uVar29 = puVar25[-2];
            puVar17[1] = puVar25[1];
            *puVar17 = uVar28;
            puVar17[3] = uVar27;
            puVar17[2] = uVar26;
            puVar17[-3] = uVar32;
            puVar17[-4] = uVar31;
            puVar17[-1] = uVar30;
            puVar17[-2] = uVar29;
            puVar25 = puVar25 + -8;
            puVar17 = puVar17 + -8;
            uVar18 = uVar18 - 8;
          } while (uVar18 != 0);
          if (uVar19 != uVar15) goto code_r0x00718e6c;
        }
        puVar25 = (ulong *)*puVar1;
      }
      *(ulong **)(unaff_x19 + 0x148) = puVar12;
      *(ulong **)(unaff_x19 + 0x150) = puVar20;
      *(ulong *)(unaff_x19 + 0x158) = lVar7 + uVar21 * 8;
      if (puVar25 != (ulong *)0x0) {
        __ZdlPv(puVar25);
      }
      goto code_r0x00718e98;
    }
  }
  puVar20 = puVar25 + 1;
  *puVar25 = (ulong)uStack000000000000007c;
code_r0x00718e98:
  *(ulong **)(unaff_x19 + 0x150) = puVar20;
  func_0x0071b484(&uStack0000000000000090);
  lVar7 = *(long *)(unaff_x19 + 400);
  lVar3 = *(long *)(unaff_x19 + 0x198);
  lVar8 = func_0x00711360();
  plVar2 = (long *)(unaff_x19 + 400);
  lVar13 = *(long *)(unaff_x19 + 400);
  lVar16 = *(long *)(unaff_x19 + 0x198);
  uVar19 = lVar16 - lVar13 >> 3;
  uVar21 = (ulong)(lVar3 - lVar7) >> 3 & 0xffffffff;
  if (uVar21 < uVar19) {
    do {
      uVar22 = *(undefined8 *)(*(long *)(*plVar2 + uVar19 * 8 + -8) + 0x18);
      puVar9 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar19 = uVar19 - 1;
      *puVar9 = uVar22;
    } while (uVar21 < uVar19);
    lVar13 = *(long *)(unaff_x19 + 400);
    lVar16 = *(long *)(unaff_x19 + 0x198);
    uVar19 = lVar16 - lVar13 >> 3;
  }
  if (uVar21 < uVar19 || uVar21 - uVar19 == 0) {
    if (uVar21 < uVar19) {
      lVar16 = lVar13 + uVar21 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar16;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar21 - uVar19);
    lVar13 = *(long *)(unaff_x19 + 400);
    lVar16 = *(long *)(unaff_x19 + 0x198);
  }
  *(long *)(unaff_x19 + 0x150) = *(long *)(unaff_x19 + 0x150) + -8;
  uVar19 = lVar16 - lVar13 >> 3;
  uVar21 = (ulong)(lVar14 - lVar11) >> 3 & 0xffffffff;
  if (uVar21 < uVar19) {
    do {
      uVar22 = *(undefined8 *)(*(long *)(*plVar2 + uVar19 * 8 + -8) + 0x18);
      puVar9 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar19 = uVar19 - 1;
      *puVar9 = uVar22;
    } while (uVar21 < uVar19);
    lVar13 = *(long *)(unaff_x19 + 400);
    uVar19 = *(long *)(unaff_x19 + 0x198) - lVar13 >> 3;
  }
  if (uVar21 < uVar19 || uVar21 - uVar19 == 0) {
    if (uVar21 < uVar19) {
      *(ulong *)(unaff_x19 + 0x198) = lVar13 + uVar21 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar2,uVar21 - uVar19);
  }
  uVar22 = *(undefined8 *)(unaff_x19 + 0x8c);
  uStack0000000000000080 = *in_stack_00000070;
  uStack0000000000000084 = (undefined4)*(undefined8 *)(in_stack_00000070 + 1);
  in_stack_00000088 = (undefined4)((ulong)*(undefined8 *)(in_stack_00000070 + 1) >> 0x20);
  uVar6 = func_0x00716f30();
  *(undefined1 *)(lVar8 + 0x30) = uVar6;
  uStack0000000000000080 = (undefined4)*(undefined8 *)(unaff_x29 + -0x70);
  uStack0000000000000084 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 0x20);
  in_stack_00000088 = (undefined4)uVar22;
  uStack000000000000008c = (undefined4)((ulong)uVar22 >> 0x20);
  auVar34._0_8_ = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0xc0);
  func_0x00706378(auVar34._0_8_,&uStack0000000000000080,in_stack_00000068,unaff_x29 + -0x90,
                  unaff_x29 + -0x80,
                  CONCAT44(uStack0000000000000090._4_4_,(uint)uStack0000000000000090),
                  &uStack0000000000000098,uStack000000000000007c != 0);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    *(undefined8 *)(unaff_x20 + 4) = *(undefined8 *)(in_stack_00000070 + 1);
    auVar33 = func_0x00717910();
    *(undefined1 (*) [16])(unaff_x20 + 0x30) = auVar33;
    lVar11 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar11 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (auVar34._0_8_ != *(ulong *)(unaff_x19 + 0x430)))
      {
        uVar19 = 0;
        uVar21 = auVar34._0_8_ >> 4 ^ auVar34._0_8_ >> 9;
        do {
          uVar21 = uVar21 & lVar11 - 1U;
          uVar18 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar21 * 0x10);
          if (uVar18 == auVar34._0_8_) goto code_r0x007190f8;
          uVar19 = uVar19 + 1;
          uVar21 = uVar19 + uVar21;
        } while (uVar18 != *(ulong *)(unaff_x19 + 0x430) && uVar19 <= lVar11 - 1U);
      }
      func_0x006db93c();
      lVar11 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x007190f8:
    lVar14 = *(long *)(unaff_x19 + 0x418);
    uVar19 = lVar11 - 1U & (auVar34._0_8_ >> 4 ^ auVar34._0_8_ >> 9);
    uVar21 = *(ulong *)(lVar14 + uVar19 * 0x10);
    if (uVar21 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar16 = 1;
      do {
        if (uVar21 == auVar34._0_8_) goto code_r0x00719158;
        uVar19 = uVar19 + lVar16 & lVar11 - 1U;
        uVar21 = *(ulong *)(lVar14 + uVar19 * 0x10);
        lVar16 = lVar16 + 1;
      } while (uVar21 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar14 + uVar19 * 0x10) = auVar34._0_8_;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00719158:
    *(long *)(lVar14 + uVar19 * 0x10 + 8) = unaff_x20;
  }
  plVar2 = *(long **)(unaff_x29 + -0xb8);
  lVar11 = *plVar2 + *(long *)(unaff_x29 + -0xb0) * 0x28;
  if (lVar11 != plVar2[1]) {
    plVar2[1] = lVar11;
  }
  auVar34._8_8_ = uStack0000000000000048;
  return auVar34;
}

