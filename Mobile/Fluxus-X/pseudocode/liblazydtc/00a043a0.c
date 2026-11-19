/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a043a0
 */

undefined8
bn_div_fixed_top(BIGNUM *param_1,long param_2,long param_3,BIGNUM *param_4,BN_CTX *param_5)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  BIGNUM *pBVar9;
  BIGNUM *pBVar10;
  BIGNUM *a;
  BIGNUM *pBVar11;
  long lVar12;
  ulong uVar13;
  ulong *puVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong *puVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong *puVar27;
  ulong *rp;
  ulong *puVar28;
  ulong uVar29;
  ulong w;
  int iVar30;
  byte bVar31;
  byte bVar32;
  byte bVar33;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  
  BN_CTX_start(param_5);
  if (param_1 == (BIGNUM *)0x0) {
    param_1 = BN_CTX_get(param_5);
  }
  pBVar9 = BN_CTX_get(param_5);
  pBVar10 = BN_CTX_get(param_5);
  a = BN_CTX_get(param_5);
  if ((a != (BIGNUM *)0x0) && (pBVar11 = BN_copy(a,param_4), pBVar11 != (BIGNUM *)0x0)) {
    uVar2 = a->top;
    uVar26 = (ulong)uVar2;
    puVar28 = a->d;
    iVar7 = BN_num_bits_word(puVar28[(int)(uVar2 - 1)]);
    if (0 < (int)uVar2) {
      uVar21 = -(long)(iVar7 % 0x40);
      uVar15 = 0;
      do {
        uVar24 = *puVar28;
        uVar26 = uVar26 - 1;
        *puVar28 = uVar24 << ((ulong)(0x40U - iVar7) & 0x3f) | uVar15;
        uVar15 = uVar24 >> ((ulong)(uint)(iVar7 % 0x40) & 0x3f) & (uVar21 | uVar21 >> 8);
        puVar28 = puVar28 + 1;
      } while (uVar26 != 0);
    }
    a->neg = 0;
    iVar8 = bn_lshift_fixed_top(pBVar10,param_3);
    if (iVar8 != 0) {
      uVar2 = a->top;
      uVar26 = (ulong)uVar2;
      iVar3 = pBVar10->top;
      iVar8 = iVar3;
      if (iVar3 <= (int)uVar2) {
        iVar8 = uVar2 + 1;
        lVar12 = bn_wexpand(pBVar10,iVar8);
        if (lVar12 == 0) goto LAB_00a047fc;
        memset(pBVar10->d + iVar3,0,
               -(ulong)((uint)(iVar8 - iVar3) >> 0x1f) & 0xfffffff800000000 |
               (ulong)(uint)(iVar8 - iVar3) << 3);
        pBVar10->top = iVar8;
      }
      puVar28 = pBVar10->d;
      uVar15 = a->d[(int)(uVar2 - 1)];
      uVar21 = 0;
      iVar3 = iVar8 - uVar2;
      if (uVar2 - 1 != 0) {
        uVar21 = a->d[(int)(uVar2 - 2)];
      }
      lVar12 = bn_wexpand(param_1,iVar3);
      if (lVar12 != 0) {
        uVar4 = *(uint *)(param_3 + 0x10);
        uVar5 = param_4->neg;
        puVar27 = param_1->d;
        param_1->top = iVar3;
        param_1->neg = uVar5 ^ uVar4;
        lVar12 = bn_wexpand(pBVar9);
        if (lVar12 != 0) {
          if (0 < iVar3) {
            iVar30 = 0;
            rp = puVar28 + iVar3;
            uVar24 = uVar26 & 0xfffffffc;
            puVar27 = puVar27 + iVar3;
            puVar28 = puVar28 + (iVar8 + -1);
            do {
              uVar29 = puVar28[-1];
              if (*puVar28 == uVar15) {
                w = 0xffffffffffffffff;
              }
              else {
                if (puVar28 == rp) {
                  uVar13 = 0;
                }
                else {
                  uVar13 = puVar28[-2];
                }
                w = bn_div_words(*puVar28,uVar29,uVar15);
                uVar22 = (w >> 0x20) * (uVar21 & 0xffffffff);
                uVar25 = (w & 0xffffffff) * (uVar21 & 0xffffffff);
                uVar16 = (w & 0xffffffff) * (uVar21 >> 0x20);
                uVar19 = uVar22 + uVar16;
                uVar20 = uVar19 << 0x20;
                uVar17 = uVar25 + uVar20;
                uVar19 = (w >> 0x20) * (uVar21 >> 0x20) + (uVar19 >> 0x20) +
                         ((ulong)CARRY8(uVar22,uVar16) << 0x20);
                if (CARRY8(uVar25,uVar20)) {
                  uVar19 = uVar19 + 1;
                }
                if (uVar29 - w * uVar15 <= uVar19) {
                  lVar23 = 1 - w;
                  lVar12 = -uVar15 * w;
                  do {
                    if (((uVar17 <= uVar13) && (lVar12 + uVar29 == uVar19)) ||
                       (w = w - 1, uVar15 * lVar23 + uVar29 < uVar15)) break;
                    bVar6 = uVar17 < uVar21;
                    uVar17 = uVar17 - uVar21;
                    uVar29 = uVar29 + uVar15;
                    uVar19 = uVar19 - bVar6;
                  } while (lVar12 + uVar29 <= uVar19);
                }
              }
              uVar29 = bn_mul_words(pBVar9->d,a->d,uVar2,w);
              puVar14 = pBVar9->d;
              rp = rp + -1;
              puVar14[(int)uVar2] = uVar29;
              uVar29 = bn_sub_words(rp,rp,puVar14,uVar2 + 1);
              if ((int)uVar2 < 1) {
                puVar14 = pBVar9->d;
              }
              else {
                puVar18 = a->d;
                puVar14 = pBVar9->d;
                uVar20 = -uVar29;
                uVar13 = 0;
                if ((3 < uVar2) &&
                   ((puVar18 + uVar26 <= puVar14 || (uVar13 = 0, puVar14 + uVar26 <= puVar18)))) {
                  lVar12 = 0;
                  uVar13 = uVar24;
                  do {
                    puVar1 = (undefined8 *)((long)puVar18 + lVar12);
                    uVar40 = puVar1[1];
                    uVar39 = *puVar1;
                    uVar42 = puVar1[3];
                    uVar41 = puVar1[2];
                    puVar1 = (undefined8 *)((long)puVar14 + lVar12);
                    uVar13 = uVar13 - 4;
                    lVar12 = lVar12 + 0x20;
                    bVar31 = (byte)uVar20;
                    bVar32 = (byte)(uVar20 >> 8);
                    bVar33 = (byte)(uVar20 >> 0x10);
                    bVar34 = (byte)(uVar20 >> 0x18);
                    bVar35 = (byte)(uVar20 >> 0x20);
                    bVar36 = (byte)(uVar20 >> 0x28);
                    bVar37 = (byte)(uVar20 >> 0x30);
                    bVar38 = (byte)(uVar20 >> 0x38);
                    puVar1[1] = CONCAT17((byte)((ulong)uVar40 >> 0x38) & bVar38,
                                         CONCAT16((byte)((ulong)uVar40 >> 0x30) & bVar37,
                                                  CONCAT15((byte)((ulong)uVar40 >> 0x28) & bVar36,
                                                           CONCAT14((byte)((ulong)uVar40 >> 0x20) &
                                                                    bVar35,CONCAT13((byte)((ulong)
                                                  uVar40 >> 0x18) & bVar34,
                                                  CONCAT12((byte)((ulong)uVar40 >> 0x10) & bVar33,
                                                           CONCAT11((byte)((ulong)uVar40 >> 8) &
                                                                    bVar32,(byte)uVar40 & bVar31))))
                                                  )));
                    *puVar1 = CONCAT17((byte)((ulong)uVar39 >> 0x38) & bVar38,
                                       CONCAT16((byte)((ulong)uVar39 >> 0x30) & bVar37,
                                                CONCAT15((byte)((ulong)uVar39 >> 0x28) & bVar36,
                                                         CONCAT14((byte)((ulong)uVar39 >> 0x20) &
                                                                  bVar35,CONCAT13((byte)((ulong)
                                                  uVar39 >> 0x18) & bVar34,
                                                  CONCAT12((byte)((ulong)uVar39 >> 0x10) & bVar33,
                                                           CONCAT11((byte)((ulong)uVar39 >> 8) &
                                                                    bVar32,(byte)uVar39 & bVar31))))
                                                  )));
                    puVar1[3] = CONCAT17((byte)((ulong)uVar42 >> 0x38) & bVar38,
                                         CONCAT16((byte)((ulong)uVar42 >> 0x30) & bVar37,
                                                  CONCAT15((byte)((ulong)uVar42 >> 0x28) & bVar36,
                                                           CONCAT14((byte)((ulong)uVar42 >> 0x20) &
                                                                    bVar35,CONCAT13((byte)((ulong)
                                                  uVar42 >> 0x18) & bVar34,
                                                  CONCAT12((byte)((ulong)uVar42 >> 0x10) & bVar33,
                                                           CONCAT11((byte)((ulong)uVar42 >> 8) &
                                                                    bVar32,(byte)uVar42 & bVar31))))
                                                  )));
                    puVar1[2] = CONCAT17((byte)((ulong)uVar41 >> 0x38) & bVar38,
                                         CONCAT16((byte)((ulong)uVar41 >> 0x30) & bVar37,
                                                  CONCAT15((byte)((ulong)uVar41 >> 0x28) & bVar36,
                                                           CONCAT14((byte)((ulong)uVar41 >> 0x20) &
                                                                    bVar35,CONCAT13((byte)((ulong)
                                                  uVar41 >> 0x18) & bVar34,
                                                  CONCAT12((byte)((ulong)uVar41 >> 0x10) & bVar33,
                                                           CONCAT11((byte)((ulong)uVar41 >> 8) &
                                                                    bVar32,(byte)uVar41 & bVar31))))
                                                  )));
                  } while (uVar13 != 0);
                  uVar13 = uVar24;
                  if (uVar24 == uVar26) goto LAB_00a04790;
                }
                do {
                  uVar19 = uVar13 + 1;
                  puVar14[uVar13] = puVar18[uVar13] & uVar20;
                  uVar13 = uVar19;
                } while (uVar26 != uVar19);
              }
LAB_00a04790:
              uVar13 = bn_add_words(rp,rp,puVar14,uVar2);
              iVar30 = iVar30 + 1;
              *puVar28 = *puVar28 + uVar13;
              puVar27 = puVar27 + -1;
              *puVar27 = w - uVar29;
              puVar28 = puVar28 + -1;
            } while (iVar30 != iVar3);
          }
          pBVar10->top = uVar2;
          pBVar10->neg = uVar4;
          if ((param_2 == 0) ||
             (iVar7 = bn_rshift_fixed_top(param_2,pBVar10,0x40U - iVar7), iVar7 != 0)) {
            BN_CTX_end(param_5);
            return 1;
          }
        }
      }
    }
  }
LAB_00a047fc:
  BN_CTX_end(param_5);
  return 0;
}

