/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8cac
 */

void FUN_008b8cac(ulong param_1,undefined4 *param_2)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  long lVar17;
  bool bVar18;
  int iVar19;
  bool bVar20;
  byte *pbVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  uint uVar25;
  byte *pbVar26;
  byte *pbVar27;
  ulong uVar28;
  int iVar29;
  uint uVar30;
  byte bVar31;
  ulong uVar32;
  ulong uVar33;
  byte *pbVar34;
  ulong uVar35;
  int iVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  long lVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined2 auStack_30 [2];
  byte abStack_2c [20];
  long local_18;
  
  lVar17 = tpidr_el0;
  uVar30 = (uint)(param_1 >> 0x34) & 0x7ff;
  uVar28 = -((long)param_1 >> 0x3f);
  local_18 = *(long *)(lVar17 + 0x28);
  param_1 = param_1 & 0xfffffffffffff;
  if (uVar30 == 0x7ff) {
    if (param_1 == 0) {
      *param_2 = *(undefined4 *)(&DAT_002c6c1a + (uVar28 ^ 1));
      pbVar26 = (byte *)((long)param_2 + uVar28 + 3);
    }
    else {
      pbVar26 = (byte *)((long)param_2 + 3);
      *param_2 = 0x6e616e;
    }
    goto LAB_008b9188;
  }
  *(undefined1 *)param_2 = 0x2d;
  pbVar21 = (byte *)((long)param_2 + uVar28);
  if ((param_1 == 0) && (uVar30 == 0)) {
    pbVar26 = pbVar21 + 1;
    *pbVar21 = 0x30;
    goto LAB_008b9188;
  }
  iVar36 = -0x432;
  if (uVar30 != 0) {
    iVar36 = uVar30 - 0x433;
  }
  uVar25 = -iVar36;
  if (uVar30 != 0) {
    param_1 = param_1 | 0x10000000000000;
  }
  if ((uVar25 < 0x35) && ((param_1 & (-1L << ((ulong)uVar25 & 0x3f) ^ 0xffffffffffffffffU)) == 0)) {
    uVar24 = param_1 >> ((ulong)uVar25 & 0x3f);
    iVar29 = 0;
  }
  else {
    iVar29 = -0x1ffc0;
    uVar30 = (uint)(iVar36 != -0x432 && param_1 == 0x10000000000000);
    if (uVar30 == 0) {
      iVar29 = 0;
    }
    iVar29 = iVar29 + iVar36 * 0x4d104 >> 0x14;
    uVar25 = 0x124U - iVar29 & 0xf;
    lVar41 = (ulong)(0x124U - iVar29 >> 4) * 0x18;
    uVar40 = *(ulong *)(&DAT_00364a50 + (ulong)uVar25 * 8);
    uVar32 = (ulong)(iVar36 + (iVar29 * -0x35269e >> 0x14) + 1);
    uVar37 = *(ulong *)(&DAT_003646b8 + lVar41) >> (uVar25 << 2);
    uVar24 = uVar40 * *(ulong *)(&DAT_003646a8 + lVar41);
    uVar39 = (param_1 << 2) << (uVar32 & 0x3f);
    auVar1._8_8_ = 0;
    auVar1._0_8_ = uVar40;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = *(ulong *)(&DAT_003646b0 + lVar41);
    uVar23 = SUB168(auVar1 * auVar9,8);
    uVar35 = (param_1 << 2 | (ulong)uVar30) - 2 << (uVar32 & 0x3f);
    auVar2._8_8_ = 0;
    auVar2._0_8_ = uVar40;
    auVar10._8_8_ = 0;
    auVar10._0_8_ = *(ulong *)(&DAT_003646a8 + lVar41);
    lVar41 = SUB168(auVar2 * auVar10,8);
    uVar22 = uVar37 >> 3 & 1;
    uVar40 = uVar23 + uVar24;
    if (CARRY8(uVar23,uVar24)) {
      lVar41 = lVar41 + 1;
    }
    uVar23 = ((uVar40 << uVar22) - (uVar37 & 7)) + 4;
    uVar33 = (param_1 << 2 | 2) << (uVar32 & 0x3f);
    uVar40 = (lVar41 << uVar22) + (uVar37 >> 3 & uVar40 >> 0x3f);
    auVar3._8_8_ = 0;
    auVar3._0_8_ = uVar23;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar35;
    uVar24 = SUB168(auVar3 * auVar11,8);
    auVar4._8_8_ = 0;
    auVar4._0_8_ = uVar40;
    auVar12._8_8_ = 0;
    auVar12._0_8_ = uVar35;
    uVar22 = SUB168(auVar4 * auVar12,8);
    auVar5._8_8_ = 0;
    auVar5._0_8_ = uVar23;
    auVar13._8_8_ = 0;
    auVar13._0_8_ = uVar39;
    uVar32 = SUB168(auVar5 * auVar13,8);
    if (CARRY8(uVar40 * uVar35,uVar24)) {
      uVar22 = uVar22 + 1;
    }
    auVar6._8_8_ = 0;
    auVar6._0_8_ = uVar40;
    auVar14._8_8_ = 0;
    auVar14._0_8_ = uVar39;
    uVar37 = SUB168(auVar6 * auVar14,8);
    auVar7._8_8_ = 0;
    auVar7._0_8_ = uVar23;
    auVar15._8_8_ = 0;
    auVar15._0_8_ = uVar33;
    uVar38 = SUB168(auVar7 * auVar15,8);
    auVar8._8_8_ = 0;
    auVar8._0_8_ = uVar40;
    auVar16._8_8_ = 0;
    auVar16._0_8_ = uVar33;
    uVar23 = SUB168(auVar8 * auVar16,8);
    if (CARRY8(uVar40 * uVar39,uVar32)) {
      uVar37 = uVar37 + 1;
    }
    param_1 = param_1 & 1;
    if (CARRY8(uVar40 * uVar33,uVar38)) {
      uVar23 = uVar23 + 1;
    }
    uVar22 = uVar22 | 1 < uVar40 * uVar35 + uVar24;
    uVar23 = uVar23 | 1 < uVar40 * uVar33 + uVar38;
    if (0x27 < uVar37) {
      uVar24 = uVar37 / 0x28;
      uVar35 = uVar24 * 0x28;
      bVar20 = (param_1 | uVar24 * 0x28) + 0x28 <= uVar23;
      if (bVar20) {
        uVar24 = uVar24 + 1;
      }
      if (uVar35 < uVar22 + param_1 == bVar20) {
        iVar29 = iVar29 + 1;
        goto LAB_008b8f20;
      }
    }
    bVar20 = (uVar37 & 0xfffffffffffffffc | param_1) + 4 <= uVar23;
    bVar18 = (uVar37 | 3) - (uVar37 >> 2 & 1) <= (uVar37 | 1 < uVar40 * uVar39 + uVar32);
    if (bVar20 == (uVar37 & 0xfffffffffffffffc) < uVar22 + param_1) {
      bVar18 = bVar20;
    }
    uVar24 = (uVar37 >> 2) + (ulong)bVar18;
  }
LAB_008b8f20:
  if (uVar24 >> 4 < 0x271) {
    pbVar34 = abStack_2c;
    if (uVar24 < 10) goto LAB_008b9034;
LAB_008b8fb4:
    do {
      uVar40 = uVar24 & 0xffffffff;
      uVar30 = (uint)uVar24;
      iVar36 = (int)(uVar40 / 100);
      uVar24 = uVar40 / 100;
      pbVar34 = pbVar34 + -2;
      *(undefined2 *)pbVar34 =
           *(undefined2 *)
            (
            "00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899"
            + (ulong)(uVar30 + (int)uVar24 * -100) * 2);
    } while (999 < uVar30);
    iVar19 = (int)(uVar40 / 100);
  }
  else {
    pbVar26 = abStack_2c;
    uVar40 = uVar24;
    do {
      uVar24 = uVar40 / 10000;
      uVar25 = (int)uVar40 + (int)uVar24 * -10000;
      uVar30 = (uVar25 >> 2 & 0x3fff) / 0x19;
      pbVar34 = pbVar26 + -4;
      *(undefined2 *)pbVar34 =
           *(undefined2 *)
            (
            "00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899"
            + (ulong)uVar30 * 2);
      *(undefined2 *)(pbVar26 + -2) =
           *(undefined2 *)
            (
            "00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899"
            + ((ulong)(uVar25 + uVar30 * -100) & 0xffff) * 2);
      bVar20 = 99999999 < uVar40;
      pbVar26 = pbVar34;
      uVar40 = uVar24;
    } while (bVar20);
    if (9 < uVar24) goto LAB_008b8fb4;
LAB_008b9034:
    iVar36 = (int)uVar24;
    iVar19 = iVar36;
  }
  if (iVar19 != 0) {
    pbVar34 = pbVar34 + -1;
    *pbVar34 = (byte)iVar36 | 0x30;
  }
  uVar40 = (long)abStack_2c - (long)pbVar34;
  iVar36 = (int)uVar40;
  uVar30 = iVar29 + iVar36;
  if (uVar30 + 5 < 0x1b) {
    if ((int)uVar30 < 1) {
      *(undefined1 *)((long)param_2 + uVar28) = 0x30;
      pbVar27 = pbVar21 + 2;
      pbVar27[0] = 0x30;
      pbVar27[1] = 0x30;
      pbVar27[2] = 0x30;
      pbVar27[3] = 0x30;
      pbVar21[1] = 0x2e;
      pbVar21[6] = 0x30;
      uVar43 = *(undefined8 *)(pbVar34 + 8);
      uVar42 = *(undefined8 *)pbVar34;
      pbVar27 = pbVar27 + -uVar30;
      pbVar26 = (byte *)((long)param_2 + (ulong)-uVar30 + uVar28 + (long)iVar36 + 3);
      pbVar27[0x10] = pbVar34[0x10];
      *(undefined8 *)(pbVar27 + 8) = uVar43;
      *(undefined8 *)pbVar27 = uVar42;
      do {
        pbVar21 = pbVar26 + -2;
        pbVar26 = pbVar26 + -1;
      } while (*pbVar21 == 0x30);
    }
    else if (iVar29 == 0) {
      uVar43 = *(undefined8 *)(pbVar34 + 8);
      uVar42 = *(undefined8 *)pbVar34;
      pbVar26 = pbVar21 + uVar30;
      pbVar21[0x10] = pbVar34[0x10];
      *(undefined8 *)(pbVar21 + 8) = uVar43;
      *(undefined8 *)pbVar21 = uVar42;
    }
    else if (iVar29 < 0) {
      uVar42 = *(undefined8 *)pbVar34;
      pbVar27 = pbVar21 + uVar30;
      *(undefined8 *)(pbVar21 + 8) = *(undefined8 *)(pbVar34 + 8);
      *(undefined8 *)pbVar21 = uVar42;
      *pbVar27 = 0x2e;
      uVar42 = *(undefined8 *)(pbVar34 + uVar30);
      pbVar26 = (byte *)((long)param_2 + uVar28 + (uVar40 & 0xffffffff) + 2);
      *(undefined8 *)(pbVar27 + 9) = *(undefined8 *)(pbVar34 + uVar30 + 8);
      *(undefined8 *)(pbVar27 + 1) = uVar42;
      do {
        pbVar21 = pbVar26 + -2;
        pbVar26 = pbVar26 + -1;
      } while (*pbVar21 == 0x30);
    }
    else {
      uVar43 = *(undefined8 *)(pbVar34 + 8);
      uVar42 = *(undefined8 *)pbVar34;
      pbVar26 = pbVar21 + uVar30;
      pbVar21[0x10] = pbVar34[0x10];
      *(undefined8 *)(pbVar21 + 8) = uVar43;
      *(undefined8 *)pbVar21 = uVar42;
      pbVar21 = pbVar21 + iVar36;
      pbVar21[0] = 0x30;
      pbVar21[1] = 0x30;
      pbVar21[2] = 0x30;
      pbVar21[3] = 0x30;
      pbVar21[4] = 0x30;
      pbVar21[5] = 0x30;
      pbVar21[6] = 0x30;
      pbVar21[7] = 0x30;
    }
  }
  else {
    bVar31 = *pbVar34;
    pbVar21[1] = 0x2e;
    *pbVar21 = bVar31;
    uVar42 = *(undefined8 *)(pbVar34 + 1);
    *(undefined8 *)(pbVar21 + 10) = *(undefined8 *)(pbVar34 + 9);
    *(undefined8 *)(pbVar21 + 2) = uVar42;
    pbVar26 = pbVar21 + 1 + iVar36;
    do {
      pbVar21 = pbVar26;
      pbVar26 = pbVar21 + -1;
    } while (*pbVar26 == 0x30);
    if (*pbVar26 != 0x2e) {
      pbVar26 = pbVar21;
    }
    bVar31 = 0x2d;
    if (1 - uVar30 == 0 || 1 < (int)uVar30) {
      bVar31 = 0x2b;
    }
    uVar25 = uVar30 - 1;
    if ((int)(uVar30 - 1) < 0) {
      uVar25 = 1 - uVar30;
    }
    *pbVar26 = 0x65;
    pbVar26[1] = bVar31;
    if (uVar25 < 100) {
      pbVar21 = pbVar26 + 2;
    }
    else {
      pbVar21 = pbVar26 + 3;
      uVar30 = uVar25 / 100;
      uVar25 = uVar25 % 100;
      pbVar26[2] = (char)uVar30 + 0x30;
    }
    pbVar26 = pbVar21 + 2;
    *(undefined2 *)pbVar21 =
         *(undefined2 *)
          (
          "00010203040506070809101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899"
          + (ulong)uVar25 * 2);
  }
LAB_008b9188:
  if (*(long *)(lVar17 + 0x28) != local_18) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(pbVar26);
  }
  return;
}

