
void FUN_004777ac(undefined *param_1,ulong param_2,uint param_3,int param_4,long param_5)

{
  undefined *puVar1;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 *puVar9;
  bool bVar10;
  uint uVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  uint uVar15;
  int iVar16;
  ulong uVar17;
  undefined8 uVar18;
  ulong uVar19;
  char cVar20;
  char cVar21;
  undefined1 uVar22;
  ulong uVar23;
  undefined *puVar24;
  ulong uVar25;
  ulong uVar26;
  undefined8 unaff_x19;
  undefined *unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  undefined8 unaff_x23;
  undefined *unaff_x24;
  undefined *unaff_x25;
  long unaff_x26;
  ulong uVar27;
  ulong unaff_x27;
  ulong unaff_x28;
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  
  puVar9 = &uStack0000000000000010;
  while( true ) {
    *(ulong *)(puVar9 + -0x60) = unaff_x28;
    *(ulong *)(puVar9 + -0x58) = unaff_x27;
    *(long *)(puVar9 + -0x50) = unaff_x26;
    *(undefined **)(puVar9 + -0x48) = unaff_x25;
    *(undefined **)(puVar9 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar9 + -0x38) = unaff_x23;
    *(ulong *)(puVar9 + -0x30) = unaff_x22;
    *(undefined8 *)(puVar9 + -0x28) = unaff_x21;
    *(undefined **)(puVar9 + -0x20) = unaff_x20;
    *(undefined8 *)(puVar9 + -0x18) = unaff_x19;
    *(undefined8 *)(puVar9 + -0x10) = in_stack_00000000;
    *(undefined8 *)(puVar9 + -8) = in_stack_00000008;
    uVar27 = 0;
    uVar12 = (ulong)param_1 >> 1 | param_2 << 0x3f;
    uVar17 = uVar12 + (param_2 >> 1);
    if (CARRY8(uVar12,param_2 >> 1)) {
      uVar17 = uVar17 + 1;
    }
    unaff_x20 = param_1;
    if ((param_2 != 0 || CARRY8(param_2 - 1,(ulong)((undefined *)0x9 < param_1))) &&
       (((ulong)param_1 & 1) == 0 && uVar17 % 5 == 0)) {
      uVar27 = 0;
      uVar17 = param_2;
      do {
        uVar19 = (ulong)param_1 >> 1 | uVar17 << 0x3f;
        uVar23 = uVar17 >> 1;
        uVar12 = uVar19 + uVar23;
        if (CARRY8(uVar19,uVar23)) {
          uVar12 = uVar12 + 1;
        }
        uVar25 = uVar19 - uVar12 % 5;
        auVar29._8_8_ = 0;
        auVar29._0_8_ = uVar25;
        param_2 = SUB168(auVar29 * ZEXT816(0xcccccccccccccccd),8) + uVar25 * -0x3333333333333334 +
                  (uVar23 - (uVar19 < uVar12 % 5)) * -0x3333333333333333;
        unaff_x20 = (undefined *)(uVar25 * -0x3333333333333333);
        uVar27 = uVar27 + 1;
        uVar19 = (ulong)unaff_x20 >> 1 | param_2 << 0x3f;
        uVar12 = uVar19 + (param_2 >> 1);
        if (CARRY8(uVar19,param_2 >> 1)) {
          uVar12 = uVar12 + 1;
        }
      } while ((uVar17 != 0 || CARRY8(uVar17 - 1,(ulong)((undefined *)0x63 < param_1))) &&
              (param_1 = unaff_x20, uVar17 = param_2, ((ulong)unaff_x20 & 1) == 0 && uVar12 % 5 == 0
              ));
    }
    unaff_x28 = (ulong)*(uint *)(param_5 + 0x10);
    unaff_x27 = uVar27;
    if ((*(uint *)(param_5 + 0x10) >> 0x1c & 1) == 0) {
      unaff_x26 = 0;
      goto code_r0x00477544;
    }
    uVar17 = 0;
    uVar12 = (ulong)*(ushort *)(param_5 + 0x16);
    if (param_2 != 0 || CARRY8(param_2 - 1,(ulong)((undefined *)0x9 < unaff_x20))) {
      uVar17 = 0;
      puVar24 = unaff_x20;
      uVar19 = param_2;
      do {
        uVar25 = (ulong)puVar24 >> 1 | uVar19 << 0x3f;
        uVar26 = uVar19 >> 1;
        uVar23 = uVar25 + uVar26;
        if (CARRY8(uVar25,uVar26)) {
          uVar23 = uVar23 + 1;
        }
        uVar3 = uVar25 - uVar23 % 5;
        auVar28._8_8_ = 0;
        auVar28._0_8_ = uVar3;
        bVar10 = puVar24 < (undefined *)0x64;
        uVar2 = uVar19 + !bVar10;
        uVar19 = SUB168(auVar28 * ZEXT816(0xcccccccccccccccd),8) + uVar3 * -0x3333333333333334 +
                 (uVar26 - (uVar25 < uVar23 % 5)) * -0x3333333333333333;
        puVar24 = (undefined *)(uVar3 * -0x3333333333333333);
        uVar17 = uVar17 + 1;
      } while (!CARRY8(~uVar2,(ulong)bVar10));
    }
    unaff_x26 = 0;
    if (uVar17 <= uVar12) {
      unaff_x26 = uVar12 - uVar17;
    }
    uVar19 = 0;
    if (uVar12 <= uVar17) {
      uVar19 = uVar17 - uVar12;
    }
    if (uVar19 < 2) {
      if (uVar17 <= uVar12) goto code_r0x00477544;
      unaff_x25 = unaff_x20;
      unaff_x22 = param_2;
    }
    else {
      if (uVar17 <= uVar12) {
        uVar12 = uVar17;
      }
      lVar13 = ~uVar12 + uVar17;
      do {
        uVar12 = (ulong)unaff_x20 >> 1 | param_2 << 0x3f;
        param_2 = param_2 >> 1;
        uVar17 = uVar12 + param_2;
        if (CARRY8(uVar12,param_2)) {
          uVar17 = uVar17 + 1;
        }
        uVar23 = uVar12 - uVar17 % 5;
        auVar4._8_8_ = 0;
        auVar4._0_8_ = uVar23;
        param_2 = SUB168(auVar4 * ZEXT816(0xcccccccccccccccd),8) + uVar23 * -0x3333333333333334 +
                  (param_2 - (uVar12 < uVar17 % 5)) * -0x3333333333333333;
        unaff_x20 = (undefined *)(uVar23 * -0x3333333333333333);
        lVar13 = lVar13 + -1;
      } while (lVar13 != 0);
      uVar27 = (uVar19 + uVar27) - 1;
      unaff_x25 = unaff_x20;
      unaff_x22 = param_2;
    }
    uVar12 = (ulong)unaff_x25 >> 1 | unaff_x22 << 0x3f;
    uVar23 = unaff_x22 >> 1;
    uVar17 = uVar12 + uVar23;
    if (CARRY8(uVar12,uVar23)) {
      uVar17 = uVar17 + 1;
    }
    uVar25 = uVar12 - uVar17 % 5;
    auVar5._8_8_ = 0;
    auVar5._0_8_ = uVar25;
    param_2 = SUB168(auVar5 * ZEXT816(0xcccccccccccccccd),8) + uVar25 * -0x3333333333333334 +
              (uVar23 - (uVar12 < uVar17 % 5)) * -0x3333333333333333;
    unaff_x20 = (undefined *)(uVar25 * -0x3333333333333333);
    auVar6._8_8_ = 0;
    auVar6._0_8_ = unaff_x20;
    puVar24 = unaff_x25 + uVar25 * -2;
    lVar13 = unaff_x22 -
             (SUB168(auVar6 * ZEXT816(10),8) + param_2 * 10 +
             (ulong)(unaff_x25 < (undefined *)(uVar25 * 2)));
    unaff_x27 = uVar27 + 1;
    if ((CARRY8(~(lVar13 + (ulong)(puVar24 >= (undefined *)0x6)),(ulong)(puVar24 < (undefined *)0x6)
               )) &&
       ((puVar24 != (undefined *)0x5 || lVar13 != 0 ||
        ((uVar19 < 2 && (((ulong)unaff_x20 & 1) == 0)))))) {
      goto code_r0x00477544;
    }
    *(int *)(puVar9 + -0x100) = param_4;
    unaff_x24 = unaff_x20 + 1;
    if (unaff_x20 == (undefined *)0xffffffffffffffff) {
      param_2 = param_2 + 1;
    }
    unaff_x19 = 0xdbe6fecebdedd5bf;
    *(uint *)(puVar9 + -0x114) = param_3;
    *(ulong *)(puVar9 + -0x138) = uVar27;
    *(undefined **)(puVar9 + -0x128) = unaff_x24;
    *(ulong *)(puVar9 + -0x120) = param_2;
    if (~unaff_x22 < 0xffffceb239bb726d &&
        !CARRY8(~unaff_x22 + 0x314dc6448d93,(ulong)(unaff_x25 < (undefined *)0x38c15b09fffffff6)))
    break;
    *(long *)(puVar9 + -0x140) = param_5;
    unaff_x23 = 9999999999;
    unaff_x21 = 0xa7c5ac471b47843;
    puVar24 = (undefined *)func_0x00479b20(unaff_x24,param_2,10000000000000000,0);
    bVar10 = CARRY8(~(unaff_x22 + (unaff_x25 >= (undefined *)0x16345785d89fff6)),
                    (ulong)(unaff_x25 < (undefined *)0x16345785d89fff6));
    if (bVar10) {
      puVar24 = unaff_x24;
    }
    puVar1 = (undefined *)((ulong)puVar24 / 10000000000);
    if (puVar24 < (undefined *)0x2540be400) {
      puVar1 = puVar24;
    }
    uVar11 = 10;
    if (puVar24 < (undefined *)0x2540be400) {
      uVar11 = 0;
    }
    if (&UNK_0001869f < puVar1) {
      uVar11 = uVar11 | 5;
      puVar1 = (undefined *)((ulong)puVar1 / 100000);
    }
    if (!CARRY8(~(unaff_x22 + (unaff_x25 >= (undefined *)0xa)),(ulong)(unaff_x25 < (undefined *)0xa)
               )) {
      iVar16 = (int)puVar1;
      *(uint *)(puVar9 + -300) =
           uVar11 + (uint)!bVar10 * 0x10 +
           ((iVar16 + 0x5fff6U & iVar16 + 0x7ff9cU ^ iVar16 + 0xdfc18U & iVar16 + 0x7d8f0U) >> 0x11)
      ;
code_r0x00477410:
      puVar24 = (undefined *)func_0x00479b20(unaff_x25,unaff_x22,100000000000000000,0);
      bVar10 = CARRY8(~(unaff_x22 + (unaff_x25 >= (undefined *)0x16345785d8a0000)),
                      (ulong)(unaff_x25 < (undefined *)0x16345785d8a0000));
      if (bVar10) {
        puVar24 = unaff_x20;
      }
      puVar1 = (undefined *)((ulong)puVar24 / 10000000000);
      if (puVar24 < (undefined *)0x2540be400) {
        puVar1 = puVar24;
      }
      uVar11 = 10;
      if (puVar24 < (undefined *)0x2540be400) {
        uVar11 = 0;
      }
      if (&UNK_0001869f < puVar1) {
        uVar11 = uVar11 | 5;
        puVar1 = (undefined *)((ulong)puVar1 / 100000);
      }
      iVar16 = (int)puVar1;
      param_5 = *(long *)(puVar9 + -0x140);
      param_3 = *(uint *)(puVar9 + -0x114);
      param_4 = *(int *)(puVar9 + -0x100);
      unaff_x20 = *(undefined **)(puVar9 + -0x128);
      param_2 = *(ulong *)(puVar9 + -0x120);
      if (uVar11 + (uint)!bVar10 * 0x10 +
          ((iVar16 + 0x5fff6U & iVar16 + 0x7ff9cU ^ iVar16 + 0xdfc18U & iVar16 + 0x7d8f0U) >> 0x11)
          < *(uint *)(puVar9 + -300)) {
code_r0x004774f8:
        uVar17 = (ulong)unaff_x20 >> 1 | param_2 << 0x3f;
        param_2 = param_2 >> 1;
        uVar27 = uVar17 + param_2;
        if (CARRY8(uVar17,param_2)) {
          uVar27 = uVar27 + 1;
        }
        uVar12 = uVar17 - uVar27 % 5;
        auVar7._8_8_ = 0;
        auVar7._0_8_ = uVar12;
        param_2 = SUB168(auVar7 * ZEXT816(0xcccccccccccccccd),8) + uVar12 * -0x3333333333333334 +
                  (param_2 - (uVar17 < uVar27 % 5)) * -0x3333333333333333;
        unaff_x20 = (undefined *)(uVar12 * -0x3333333333333333);
        unaff_x27 = *(long *)(puVar9 + -0x138) + 2;
      }
code_r0x00477544:
      auVar8._8_8_ = param_2;
      auVar8._0_8_ = unaff_x20;
      if (param_2 == 0 && !CARRY8(param_2 - 1,(ulong)((undefined *)0x63 < unaff_x20))) {
        lVar13 = 0x28;
        uVar27 = unaff_x27;
      }
      else {
        *(long *)(puVar9 + -0x110) = unaff_x26;
        *(ulong *)(puVar9 + -0x108) = unaff_x28;
        *(int *)(puVar9 + -0x100) = param_4;
        lVar14 = 0;
        do {
          lVar13 = lVar14;
          auVar28 = func_0x00479b20(auVar8._0_8_,auVar8._8_8_,100,0);
          unaff_x20 = auVar28._0_8_;
          auVar29 = auVar8 >> 4;
          *(undefined2 *)(puVar9 + lVar13 + -0xd5) =
               *(undefined2 *)(&UNK_00893f27 + (auVar8._0_8_ + (long)unaff_x20 * -100) * 2);
          bVar10 = auVar29._0_8_ < 0x271;
          lVar14 = lVar13 + -2;
          auVar8 = auVar28;
        } while (!CARRY8(~(auVar29._8_8_ + (ulong)!bVar10),(ulong)bVar10));
        uVar27 = unaff_x27 - (lVar13 + -2);
        lVar13 = lVar13 + 0x26;
        param_4 = *(int *)(puVar9 + -0x100);
        unaff_x26 = *(long *)(puVar9 + -0x110);
        unaff_x28 = *(ulong *)(puVar9 + -0x108);
      }
      cVar21 = (char)unaff_x20;
      if ((undefined *)((long)&MACH_HEADER.cpusubtype + 1) < unaff_x20) {
        cVar20 = (char)(((uint)unaff_x20 & 0xff) / 10);
        puVar9[lVar13 + -0xfc] = cVar21 + cVar20 * -10 | 0x30;
        uVar27 = uVar27 + 1;
        lVar13 = lVar13 + -1;
        cVar21 = cVar20;
      }
      if ((unaff_x26 != 0) || (lVar14 = lVar13, uVar27 != unaff_x27)) {
        lVar14 = lVar13 + -1;
        puVar9[lVar13 + -0xfc] = 0x2e;
      }
      puVar9[lVar14 + -0xfc] = cVar21 + '0';
      uVar22 = 0x45;
      if (param_4 == 0) {
        uVar22 = 0x65;
      }
      puVar9[-0xd3] = uVar22;
      if (uVar27 < 10) {
        puVar9[-0xd2] = (byte)uVar27 | 0x30;
        uVar18 = 2;
      }
      else {
        *(undefined2 *)(puVar9 + -0xd2) = *(undefined2 *)(&UNK_00893f27 + uVar27 * 2);
        uVar18 = 3;
      }
      *(undefined2 *)(puVar9 + -0xd0) = 2;
      *(undefined1 **)(puVar9 + -200) = puVar9 + lVar14 + -0xfc;
      *(long *)(puVar9 + -0xc0) = 0x29 - lVar14;
      *(undefined2 *)(puVar9 + -0xb8) = 0;
      *(long *)(puVar9 + -0xb0) = unaff_x26;
      *(undefined2 *)(puVar9 + -0xa0) = 2;
      *(undefined1 **)(puVar9 + -0x98) = puVar9 + -0xd3;
      *(undefined8 *)(puVar9 + -0x90) = uVar18;
      puVar24 = &UNK_008934e8;
      if ((unaff_x28 & 0x200000) == 0) {
        puVar24 = (undefined *)0x1;
      }
      uVar27 = unaff_x28 >> 0x15 & 1;
      if (param_3 == 0) {
        puVar24 = &UNK_008934e7;
        uVar27 = 1;
      }
      *(undefined **)(puVar9 + -0x88) = puVar24;
      *(ulong *)(puVar9 + -0x80) = uVar27;
      *(undefined1 **)(puVar9 + -0x78) = puVar9 + -0xd0;
      *(undefined8 *)(puVar9 + -0x70) = 3;
      func_0x00468db8(param_5,puVar9 + -0x88);
      return;
    }
    auVar29 = func_0x007a20e8(&UNK_009e0d60);
    param_5 = auVar29._8_8_;
    *(undefined1 **)(puVar9 + -0x150) = puVar9 + -0x10;
    *(undefined **)(puVar9 + -0x148) =
         &
         __ZN4core3fmt3num54__LT_impl_u20_core__fmt__LowerExp_u20_for_u20_i128_GT_3fmt17h5cd2b68104e43ed4E
    ;
    uVar27 = auVar29._0_8_[1];
    uVar12 = (long)uVar27 >> 0x3f;
    uVar17 = *auVar29._0_8_ ^ uVar12;
    param_1 = (undefined *)(uVar17 - uVar12);
    param_2 = (uVar27 ^ uVar12) - (uVar12 + (uVar17 < uVar12));
    param_3 = (uint)(uVar27 >> 0x3f) ^ 1;
    param_4 = 0;
    in_stack_00000000 = *(undefined8 *)(puVar9 + -0x150);
    in_stack_00000008 = *(undefined8 *)(puVar9 + -0x148);
    puVar9 = puVar9 + -0x140;
  }
  *(long *)(puVar9 + -0x110) = unaff_x26;
  *(ulong *)(puVar9 + -0x108) = unaff_x28;
  uVar27 = func_0x00479b20(unaff_x24,param_2,0x85acef8100000000,0x4ee2d6d415b);
  uVar15 = (uint)(uVar27 >> 5) & 0x7ffffff;
  uVar11 = (uint)(uVar27 * 0x53e2d7 >> 0x27);
  if (uVar15 < 0xc35) {
    uVar11 = (uint)uVar27;
  }
  iVar16 = 0x25;
  if (uVar15 < 0xc35) {
    iVar16 = 0x20;
  }
  *(uint *)(puVar9 + -300) =
       iVar16 + ((uVar11 + 0x5fff6 & uVar11 + 0x7ff9c ^ uVar11 + 0xdfc18 & uVar11 + 0x7d8f0) >> 0x11
                );
  if (0xffffceb239bb726c < ~unaff_x22 ||
      CARRY8(~unaff_x22 + 0x314dc6448d93,(ulong)(unaff_x25 < (undefined *)0x38c15b0a00000000))) {
    *(long *)(puVar9 + -0x140) = param_5;
    unaff_x26 = *(long *)(puVar9 + -0x110);
    unaff_x28 = *(ulong *)(puVar9 + -0x108);
    goto code_r0x00477410;
  }
  lVar13 = func_0x00479b20(unaff_x25,unaff_x22,0x38c15b0a00000000,0x314dc6448d93);
  uVar15 = (uint)lVar13;
  uVar11 = (uint)((ulong)(lVar13 * 0x29f17) >> 0x22);
  if (uVar15 < 100000) {
    uVar11 = uVar15;
  }
  iVar16 = 0x25;
  if (uVar15 < 100000) {
    iVar16 = 0x20;
  }
  param_3 = *(uint *)(puVar9 + -0x114);
  unaff_x26 = *(long *)(puVar9 + -0x110);
  unaff_x28 = *(ulong *)(puVar9 + -0x108);
  param_4 = *(int *)(puVar9 + -0x100);
  unaff_x20 = *(undefined **)(puVar9 + -0x128);
  param_2 = *(ulong *)(puVar9 + -0x120);
  if (iVar16 + ((uVar11 + 0x5fff6 & uVar11 + 0x7ff9c ^ uVar11 + 0xdfc18 & uVar11 + 0x7d8f0) >> 0x11)
      < *(uint *)(puVar9 + -300)) goto code_r0x004774f8;
  goto code_r0x00477544;
}

