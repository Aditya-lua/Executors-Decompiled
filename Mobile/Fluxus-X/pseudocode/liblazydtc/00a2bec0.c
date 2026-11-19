/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2bec0
 */

bool BN_GF2m_mod_sqr_arr(undefined8 param_1,long *param_2,undefined8 param_3,BN_CTX *param_4)

{
  ulong *puVar1;
  ulong *puVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  byte bVar5;
  byte bVar6;
  bool bVar7;
  int iVar8;
  BIGNUM *pBVar9;
  long lVar10;
  ulong *puVar11;
  ulong *puVar12;
  int iVar13;
  long lVar14;
  ulong uVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  int iVar20;
  int iVar21;
  ulong uVar22;
  ulong uVar23;
  uint uVar24;
  uint uVar25;
  
  BN_CTX_start(param_4);
  pBVar9 = BN_CTX_get(param_4);
  if ((pBVar9 == (BIGNUM *)0x0) || (lVar10 = bn_wexpand(pBVar9,(int)param_2[1] << 1), lVar10 == 0))
  {
    bVar7 = false;
    goto LAB_00a2c224;
  }
  iVar8 = (int)param_2[1];
  if (0 < iVar8) {
    uVar17 = (ulong)iVar8;
    lVar10 = *param_2;
    puVar11 = pBVar9->d;
    uVar15 = 0xfffffffffffffffe;
    if (-2 < (long)~uVar17) {
      uVar15 = ~uVar17;
    }
    iVar13 = iVar8;
    if (uVar15 + uVar17 < 0xfffffffffffffffe) {
      uVar18 = 0xfffffffffffffffe;
      if (-2 < (long)~uVar17) {
        uVar18 = ~uVar17;
      }
      uVar18 = uVar18 + uVar17 + 1;
      iVar20 = iVar8 * 2 + -1;
      auVar3._8_8_ = 0;
      auVar3._0_8_ = uVar18;
      puVar12 = puVar11 + iVar20;
      auVar4._8_8_ = 0;
      auVar4._0_8_ = uVar18;
      if ((((puVar12 + uVar18 * -2 <= puVar12) && (SUB168(auVar3 * ZEXT816(0x10),8) == 0)) &&
          (iVar21 = iVar8 * 2 + -2, puVar11 + iVar21 + uVar18 * -2 <= puVar11 + iVar21)) &&
         ((uVar19 = (lVar10 + uVar17 * 8) - 8, uVar19 + uVar18 * -8 <= uVar19 &&
          (SUB168(auVar4 * ZEXT816(8),8) == 0)))) {
        uVar18 = 0xfffffffffffffffe;
        if (-2 < (long)~uVar17) {
          uVar18 = ~uVar17;
        }
        puVar16 = (ulong *)((long)puVar11 + (((ulong)(long)iVar21 >> 1) << 4 | 8));
        puVar1 = (ulong *)(lVar10 + uVar17 * 8);
        puVar2 = (ulong *)(lVar10 + (-2 - uVar18) * 8);
        if (((!(puVar11 + (long)iVar20 + -2 + (uVar18 + uVar17) * -2 < puVar16 &&
               puVar11 + ((long)iVar21 - 2U) + (uVar18 + uVar17) * -2 < puVar12 + 1)) &&
            (!(puVar11 + (long)iVar20 + -2 + (uVar18 + uVar17) * -2 < puVar1 && puVar2 < puVar12 + 1
              ))) && (puVar1 <= puVar11 + ((long)iVar21 - 2U) + (uVar18 + uVar17) * -2 ||
                      puVar16 <= puVar2)) {
          uVar15 = uVar15 + uVar17 + 2;
          lVar14 = uVar17 * 8;
          uVar19 = uVar15 & 0xfffffffffffffffe;
          iVar21 = iVar8 + -1;
          uVar17 = uVar17 - uVar19;
          iVar13 = iVar8 - (int)uVar19;
          uVar18 = uVar19;
          iVar20 = iVar8;
          puVar12 = (ulong *)(lVar10 + lVar14);
          do {
            puVar16 = puVar12 + -2;
            uVar23 = puVar12[-1];
            uVar22 = *puVar16;
            uVar24 = iVar20 * 2 - 2;
            uVar25 = iVar21 * 2 - 2;
            bVar5 = (byte)(uVar22 >> 0x38);
            bVar6 = (byte)(uVar23 >> 0x38);
            puVar11[(int)(uVar24 | 1)] =
                 CONCAT17(bVar6 >> 2 & 0x10 | bVar6 >> 4 & 1 | bVar6 >> 1 & 0x40 | bVar6 >> 3 & 4,
                          CONCAT16((byte)(uVar23 >> 0x36) & 0x10 | bVar6 & 1 |
                                   (byte)(uVar23 >> 0x35) & 0x40 | (byte)(uVar23 >> 0x37) & 4,
                                   CONCAT15((byte)(uVar23 >> 0x32) & 0x10 |
                                            (byte)(uVar23 >> 0x34) & 1 |
                                            (byte)(uVar23 >> 0x31) & 0x40 |
                                            (byte)(uVar23 >> 0x33) & 4,
                                            CONCAT14((byte)(uVar23 >> 0x2e) & 0x10 |
                                                     (byte)(uVar23 >> 0x30) & 1 |
                                                     (byte)(uVar23 >> 0x2d) & 0x40 |
                                                     (byte)(uVar23 >> 0x2f) & 4,
                                                     CONCAT13((byte)(uVar23 >> 0x2a) & 0x10 |
                                                              (byte)(uVar23 >> 0x2c) & 1 |
                                                              (byte)(uVar23 >> 0x29) & 0x40 |
                                                              (byte)(uVar23 >> 0x2b) & 4,
                                                              CONCAT12((byte)(uVar23 >> 0x26) & 0x10
                                                                       | (byte)(uVar23 >> 0x28) & 1
                                                                       | (byte)(uVar23 >> 0x25) &
                                                                         0x40 | (byte)(uVar23 >>
                                                                                      0x27) & 4,
                                                                       CONCAT11((byte)(uVar23 >>
                                                                                      0x22) & 0x10 |
                                                                                (byte)(uVar23 >>
                                                                                      0x24) & 1 |
                                                                                (byte)(uVar23 >>
                                                                                      0x21) & 0x40 |
                                                                                (byte)(uVar23 >>
                                                                                      0x23) & 4,
                                                                                (byte)(uVar23 >>
                                                                                      0x1e) & 0x10 |
                                                                                (byte)(uVar23 >>
                                                                                      0x20) & 1 |
                                                                                (byte)(uVar23 >>
                                                                                      0x1d) & 0x40 |
                                                                                (byte)(uVar23 >>
                                                                                      0x1f) & 4)))))
                                  ));
            puVar11[(int)(uVar25 | 1)] =
                 CONCAT17(bVar5 >> 2 & 0x10 | bVar5 >> 4 & 1 | bVar5 >> 1 & 0x40 | bVar5 >> 3 & 4,
                          CONCAT16((byte)(uVar22 >> 0x36) & 0x10 | bVar5 & 1 |
                                   (byte)(uVar22 >> 0x35) & 0x40 | (byte)(uVar22 >> 0x37) & 4,
                                   CONCAT15((byte)(uVar22 >> 0x32) & 0x10 |
                                            (byte)(uVar22 >> 0x34) & 1 |
                                            (byte)(uVar22 >> 0x31) & 0x40 |
                                            (byte)(uVar22 >> 0x33) & 4,
                                            CONCAT14((byte)(uVar22 >> 0x2e) & 0x10 |
                                                     (byte)(uVar22 >> 0x30) & 1 |
                                                     (byte)(uVar22 >> 0x2d) & 0x40 |
                                                     (byte)(uVar22 >> 0x2f) & 4,
                                                     CONCAT13((byte)(uVar22 >> 0x2a) & 0x10 |
                                                              (byte)(uVar22 >> 0x2c) & 1 |
                                                              (byte)(uVar22 >> 0x29) & 0x40 |
                                                              (byte)(uVar22 >> 0x2b) & 4,
                                                              CONCAT12((byte)(uVar22 >> 0x26) & 0x10
                                                                       | (byte)(uVar22 >> 0x28) & 1
                                                                       | (byte)(uVar22 >> 0x25) &
                                                                         0x40 | (byte)(uVar22 >>
                                                                                      0x27) & 4,
                                                                       CONCAT11((byte)(uVar22 >>
                                                                                      0x22) & 0x10 |
                                                                                (byte)(uVar22 >>
                                                                                      0x24) & 1 |
                                                                                (byte)(uVar22 >>
                                                                                      0x21) & 0x40 |
                                                                                (byte)(uVar22 >>
                                                                                      0x23) & 4,
                                                                                (byte)(uVar22 >>
                                                                                      0x1e) & 0x10 |
                                                                                (byte)(uVar22 >>
                                                                                      0x20) & 1 |
                                                                                (byte)(uVar22 >>
                                                                                      0x1d) & 0x40 |
                                                                                (byte)(uVar22 >>
                                                                                      0x1f) & 4)))))
                                  ));
            uVar23 = puVar12[-1];
            uVar22 = *puVar16;
            uVar18 = uVar18 - 2;
            iVar20 = iVar20 + -2;
            iVar21 = iVar21 + -2;
            puVar11[(int)uVar24] =
                 CONCAT17((byte)(uVar23 >> 0x1a) & 0x10 | (byte)(uVar23 >> 0x1c) & 1 |
                          (byte)(uVar23 >> 0x19) & 0x40 | (byte)(uVar23 >> 0x1b) & 4,
                          CONCAT16((byte)(uVar23 >> 0x16) & 0x10 | (byte)(uVar23 >> 0x18) & 1 |
                                   (byte)(uVar23 >> 0x15) & 0x40 | (byte)(uVar23 >> 0x17) & 4,
                                   CONCAT15((byte)(uVar23 >> 0x12) & 0x10 |
                                            (byte)(uVar23 >> 0x14) & 1 |
                                            (byte)(uVar23 >> 0x11) & 0x40 |
                                            (byte)(uVar23 >> 0x13) & 4,
                                            CONCAT14((byte)(uVar23 >> 0xe) & 0x10 |
                                                     (byte)(uVar23 >> 0x10) & 1 |
                                                     (byte)(uVar23 >> 0xd) & 0x40 |
                                                     (byte)(uVar23 >> 0xf) & 4,
                                                     CONCAT13((byte)(uVar23 >> 10) & 0x10 |
                                                              (byte)(uVar23 >> 0xc) & 1 |
                                                              (byte)(uVar23 >> 9) & 0x40 |
                                                              (byte)(uVar23 >> 0xb) & 4,
                                                              CONCAT12((byte)(uVar23 >> 6) & 0x10 |
                                                                       (byte)(uVar23 >> 8) & 1 |
                                                                       (byte)(uVar23 >> 5) & 0x40 |
                                                                       (byte)(uVar23 >> 7) & 4,
                                                                       CONCAT11((byte)(uVar23 >> 2)
                                                                                & 0x10 | (byte)(
                                                  uVar23 >> 4) & 1 | (byte)(uVar23 >> 1) & 0x40 |
                                                  (byte)(uVar23 >> 3) & 4,
                                                  (byte)((uVar23 & 0x3fffffffffffffc4) << 2) |
                                                  (byte)uVar23 & 1 |
                                                  (byte)((uVar23 & 0x1fffffffffffffe8) << 3) |
                                                  (byte)((uVar23 & 0x7fffffffffffff82) << 1))))))));
            puVar11[(int)uVar25] =
                 CONCAT17((byte)(uVar22 >> 0x1a) & 0x10 | (byte)(uVar22 >> 0x1c) & 1 |
                          (byte)(uVar22 >> 0x19) & 0x40 | (byte)(uVar22 >> 0x1b) & 4,
                          CONCAT16((byte)(uVar22 >> 0x16) & 0x10 | (byte)(uVar22 >> 0x18) & 1 |
                                   (byte)(uVar22 >> 0x15) & 0x40 | (byte)(uVar22 >> 0x17) & 4,
                                   CONCAT15((byte)(uVar22 >> 0x12) & 0x10 |
                                            (byte)(uVar22 >> 0x14) & 1 |
                                            (byte)(uVar22 >> 0x11) & 0x40 |
                                            (byte)(uVar22 >> 0x13) & 4,
                                            CONCAT14((byte)(uVar22 >> 0xe) & 0x10 |
                                                     (byte)(uVar22 >> 0x10) & 1 |
                                                     (byte)(uVar22 >> 0xd) & 0x40 |
                                                     (byte)(uVar22 >> 0xf) & 4,
                                                     CONCAT13((byte)(uVar22 >> 10) & 0x10 |
                                                              (byte)(uVar22 >> 0xc) & 1 |
                                                              (byte)(uVar22 >> 9) & 0x40 |
                                                              (byte)(uVar22 >> 0xb) & 4,
                                                              CONCAT12((byte)(uVar22 >> 6) & 0x10 |
                                                                       (byte)(uVar22 >> 8) & 1 |
                                                                       (byte)(uVar22 >> 5) & 0x40 |
                                                                       (byte)(uVar22 >> 7) & 4,
                                                                       CONCAT11((byte)(uVar22 >> 2)
                                                                                & 0x10 | (byte)(
                                                  uVar22 >> 4) & 1 | (byte)(uVar22 >> 1) & 0x40 |
                                                  (byte)(uVar22 >> 3) & 4,
                                                  (byte)((uVar22 & 0x3fffffffffffffc4) << 2) |
                                                  (byte)uVar22 & 1 |
                                                  (byte)((uVar22 & 0x1fffffffffffffe8) << 3) |
                                                  (byte)((uVar22 & 0x7fffffffffffff82) << 1))))))));
            puVar12 = puVar16;
          } while (uVar18 != 0);
          if (uVar15 == uVar19) goto LAB_00a2c1f4;
        }
      }
    }
    puVar12 = puVar11 + (iVar13 * 2 + -2);
    puVar11 = puVar11 + (iVar13 * 2 + -1);
    do {
      lVar14 = (uVar17 - 1) * 8;
      uVar15 = *(ulong *)(lVar10 + lVar14);
      uVar24 = (uint)(uVar15 >> 0x20);
      *puVar11 = uVar15 >> 0x1e & 0x10 | uVar15 >> 0x20 & 1 | uVar15 >> 0x1d & 0x40 |
                 uVar15 >> 0x1f & 4 |
                 (ulong)(uVar24 >> 0x16 & 0x10 | (byte)(uVar15 >> 0x38) & 1 | uVar24 >> 0x15 & 0x40
                        | uVar24 >> 0x17 & 4) << 0x30 |
                 (ulong)(uVar24 >> 0x1a & 0x10 | uVar24 >> 0x1c & 1 | uVar24 >> 0x19 & 0x40 |
                        uVar24 >> 0x1b & 4) << 0x38 |
                 (ulong)(uVar24 >> 0x12 & 0x10 | uVar24 >> 0x14 & 1 | uVar24 >> 0x11 & 0x40 |
                        uVar24 >> 0x13 & 4) << 0x28 |
                 (ulong)(uVar24 >> 0xe & 0x10 | (ushort)(uVar15 >> 0x30) & 1 | uVar24 >> 0xd & 0x40
                        | uVar24 >> 0xf & 4) << 0x20 |
                 (uVar15 >> 0x2a & 0x10 | uVar15 >> 0x2c & 1 | uVar15 >> 0x29 & 0x40 |
                 uVar15 >> 0x2b & 4) << 0x18 |
                 (uVar15 >> 0x26 & 0x10 | uVar15 >> 0x28 & 1 | uVar15 >> 0x25 & 0x40 |
                 uVar15 >> 0x27 & 4) << 0x10 |
                 (uVar15 >> 0x22 & 0x10 | uVar15 >> 0x24 & 1 | uVar15 >> 0x21 & 0x40 |
                 uVar15 >> 0x23 & 4) << 8;
      uVar15 = *(ulong *)(lVar10 + lVar14);
      uVar24 = (uint)uVar15;
      *puVar12 = (uVar15 >> 2 & 1) << 4 | (uVar15 >> 3 & 1) << 6 |
                 uVar15 & 1 | (uVar15 >> 1 & 1) << 2 |
                 (ulong)((uint)(uVar15 >> 0x16) & 0x10 | uVar24 >> 0x18 & 1 |
                         (uint)(uVar15 >> 0x15) & 0x40 | (uint)(uVar15 >> 0x17) & 4) << 0x30 |
                 (ulong)((uint)(uVar15 >> 0x1a) & 0x10 | uVar24 >> 0x1c & 1 |
                         (uint)(uVar15 >> 0x19) & 0x40 | (uint)(uVar15 >> 0x1b) & 4) << 0x38 |
                 (ulong)((uint)(uVar15 >> 0x12) & 0x10 | uVar24 >> 0x14 & 1 |
                         (uint)(uVar15 >> 0x11) & 0x40 | (uint)(uVar15 >> 0x13) & 4) << 0x28 |
                 (ulong)((uint)(uVar15 >> 0xe) & 0x10 | uVar24 >> 0x10 & 1 |
                         (uint)(uVar15 >> 0xd) & 0x40 | (uint)(uVar15 >> 0xf) & 4) << 0x20 |
                 (uVar15 >> 10 & 0x10 | uVar15 >> 0xc & 1 | uVar15 >> 9 & 0x40 | uVar15 >> 0xb & 4)
                 << 0x18 | (uVar15 >> 6 & 0x10 | uVar15 >> 8 & 1 | uVar15 >> 5 & 0x40 |
                           uVar15 >> 7 & 4) << 0x10 |
                 (uVar15 >> 2 & 0x10 | uVar15 >> 4 & 1 | uVar15 >> 1 & 0x40 | uVar15 >> 3 & 4) << 8;
      bVar7 = 1 < (long)uVar17;
      puVar12 = puVar12 + -2;
      puVar11 = puVar11 + -2;
      uVar17 = uVar17 - 1;
    } while (bVar7);
  }
LAB_00a2c1f4:
  pBVar9->top = iVar8 << 1;
  bn_correct_top(pBVar9);
  iVar8 = BN_GF2m_mod_arr(param_1,pBVar9,param_3);
  bVar7 = iVar8 != 0;
LAB_00a2c224:
  BN_CTX_end(param_4);
  return bVar7;
}

