/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1baec
 */

int BN_mod_exp_mont(BIGNUM *r,BIGNUM *a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx,BN_MONT_CTX *m_ctx)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *pBVar4;
  BIGNUM *a_00;
  BIGNUM *pBVar5;
  BN_MONT_CTX *mont;
  ulong *puVar6;
  ulong *puVar7;
  long lVar8;
  ulong *puVar9;
  ulong *puVar10;
  uint uVar11;
  bool bVar12;
  long lVar13;
  uint uVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  uint local_16c;
  BIGNUM *local_168 [33];
  
  iVar1 = BN_is_odd(m);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x148,"BN_mod_exp_mont");
    ERR_set_error(3,0x66,0);
    return 0;
  }
  if ((m->top < 0x100000) &&
     (((iVar1 = BN_get_flags(p,4), iVar1 != 0 || (iVar1 = BN_get_flags(a,4), iVar1 != 0)) ||
      (iVar1 = BN_get_flags(m,4), iVar1 != 0)))) {
    iVar1 = BN_mod_exp_mont_consttime(r,a,p,m,ctx,m_ctx);
    return iVar1;
  }
  iVar1 = BN_num_bits(p);
  if (iVar1 == 0) {
    iVar1 = BN_abs_is_word(m,1);
    if (iVar1 == 0) {
      iVar1 = BN_set_word(r,1);
      return iVar1;
    }
    BN_zero_ex(r);
    return 1;
  }
  BN_CTX_start(ctx);
  pBVar4 = BN_CTX_get(ctx);
  a_00 = BN_CTX_get(ctx);
  pBVar5 = BN_CTX_get(ctx);
  local_168[0] = pBVar5;
  if (pBVar5 == (BIGNUM *)0x0) {
    uVar11 = 0;
    mont = (BN_MONT_CTX *)0x0;
joined_r0x00a1bc94:
    if (m_ctx != (BN_MONT_CTX *)0x0) goto LAB_00a1bfc8;
  }
  else {
    mont = m_ctx;
    if ((m_ctx != (BN_MONT_CTX *)0x0) ||
       ((mont = BN_MONT_CTX_new(), mont != (BN_MONT_CTX *)0x0 &&
        (iVar2 = BN_MONT_CTX_set(mont,m,ctx), iVar2 != 0)))) {
      if ((((a->neg == 0) && (iVar2 = BN_ucmp(a,m), iVar2 < 0)) ||
          (iVar2 = BN_nnmod(pBVar5,a,m,ctx), a = pBVar5, iVar2 != 0)) &&
         (iVar2 = bn_to_mont_fixed_top(pBVar5,a,mont,ctx), iVar2 != 0)) {
        if (iVar1 < 0x2a0) {
          if (0xef < iVar1) {
            local_16c = 5;
            goto LAB_00a1bd04;
          }
          if (0x4f < iVar1) {
            local_16c = 4;
            goto LAB_00a1bd04;
          }
          if (0x17 < iVar1) {
            local_16c = 3;
            goto LAB_00a1bd04;
          }
          local_16c = 1;
        }
        else {
          local_16c = 6;
LAB_00a1bd04:
          iVar2 = bn_mul_mont_fixed_top(pBVar4,pBVar5,pBVar5,mont,ctx);
          if (iVar2 == 0) goto LAB_00a1bfb8;
          iVar2 = 1 << (ulong)(local_16c - 1 & 0x1f);
          if (1 < iVar2) {
            lVar13 = 0;
            do {
              pBVar5 = BN_CTX_get(ctx);
              local_168[lVar13 + 1] = pBVar5;
              if ((pBVar5 == (BIGNUM *)0x0) ||
                 (iVar3 = bn_mul_mont_fixed_top(pBVar5,local_168[lVar13],pBVar4,mont,ctx),
                 iVar3 == 0)) {
                uVar11 = 0;
                goto joined_r0x00a1bc94;
              }
              lVar8 = lVar13 + 2;
              lVar13 = lVar13 + 1;
            } while (lVar8 < iVar2);
          }
        }
        uVar11 = m->top;
        uVar16 = (ulong)uVar11;
        if ((long)m->d[(int)(uVar11 - 1)] < 0) {
          lVar13 = bn_wexpand(a_00,uVar11);
          if (lVar13 != 0) {
            puVar6 = m->d;
            puVar7 = a_00->d;
            *puVar7 = -*puVar6;
            if (1 < (int)uVar11) {
              if ((uVar16 - 1 < 4) ||
                 ((puVar7 + 1 < puVar6 + uVar16 && (puVar6 + 1 < puVar7 + uVar16)))) {
                lVar13 = 1;
              }
              else {
                uVar15 = uVar11 - 1 & 3;
                lVar8 = (uVar16 - 1) - (ulong)uVar15;
                puVar9 = puVar6 + 3;
                lVar13 = lVar8 + 1;
                puVar10 = puVar7 + 3;
                do {
                  uVar18 = puVar9[-1];
                  uVar17 = puVar9[-2];
                  uVar20 = puVar9[1];
                  uVar19 = *puVar9;
                  puVar9 = puVar9 + 4;
                  lVar8 = lVar8 + -4;
                  puVar10[-1] = CONCAT17(~(byte)(uVar18 >> 0x38),
                                         CONCAT16(~(byte)(uVar18 >> 0x30),
                                                  CONCAT15(~(byte)(uVar18 >> 0x28),
                                                           CONCAT14(~(byte)(uVar18 >> 0x20),
                                                                    CONCAT13(~(byte)(uVar18 >> 0x18)
                                                                             ,CONCAT12(~(byte)(
                                                  uVar18 >> 0x10),
                                                  CONCAT11(~(byte)(uVar18 >> 8),~(byte)uVar18)))))))
                  ;
                  puVar10[-2] = CONCAT17(~(byte)(uVar17 >> 0x38),
                                         CONCAT16(~(byte)(uVar17 >> 0x30),
                                                  CONCAT15(~(byte)(uVar17 >> 0x28),
                                                           CONCAT14(~(byte)(uVar17 >> 0x20),
                                                                    CONCAT13(~(byte)(uVar17 >> 0x18)
                                                                             ,CONCAT12(~(byte)(
                                                  uVar17 >> 0x10),
                                                  CONCAT11(~(byte)(uVar17 >> 8),~(byte)uVar17)))))))
                  ;
                  puVar10[1] = CONCAT17(~(byte)(uVar20 >> 0x38),
                                        CONCAT16(~(byte)(uVar20 >> 0x30),
                                                 CONCAT15(~(byte)(uVar20 >> 0x28),
                                                          CONCAT14(~(byte)(uVar20 >> 0x20),
                                                                   CONCAT13(~(byte)(uVar20 >> 0x18),
                                                                            CONCAT12(~(byte)(uVar20 
                                                  >> 0x10),CONCAT11(~(byte)(uVar20 >> 8),
                                                                    ~(byte)uVar20)))))));
                  *puVar10 = CONCAT17(~(byte)(uVar19 >> 0x38),
                                      CONCAT16(~(byte)(uVar19 >> 0x30),
                                               CONCAT15(~(byte)(uVar19 >> 0x28),
                                                        CONCAT14(~(byte)(uVar19 >> 0x20),
                                                                 CONCAT13(~(byte)(uVar19 >> 0x18),
                                                                          CONCAT12(~(byte)(uVar19 >>
                                                                                          0x10),
                                                                                   CONCAT11(~(byte)(
                                                  uVar19 >> 8),~(byte)uVar19)))))));
                  puVar10 = puVar10 + 4;
                } while (lVar8 != 0);
                if (uVar15 == 0) goto LAB_00a1be74;
              }
              lVar8 = uVar16 - lVar13;
              puVar6 = puVar6 + lVar13;
              puVar7 = puVar7 + lVar13;
              do {
                lVar8 = lVar8 + -1;
                *puVar7 = ~*puVar6;
                puVar6 = puVar6 + 1;
                puVar7 = puVar7 + 1;
              } while (lVar8 != 0);
            }
LAB_00a1be74:
            a_00->top = uVar11;
            goto LAB_00a1be78;
          }
        }
        else {
          pBVar4 = BN_value_one();
          iVar2 = bn_to_mont_fixed_top(a_00,pBVar4,mont,ctx);
          if (iVar2 != 0) {
LAB_00a1be78:
            iVar1 = iVar1 + -1;
            bVar12 = true;
            do {
              while (iVar2 = BN_is_bit_set(p,iVar1), iVar2 == 0) {
                if ((!bVar12) &&
                   (iVar2 = bn_mul_mont_fixed_top(a_00,a_00,a_00,mont,ctx), iVar2 == 0))
                goto LAB_00a1bfb8;
                if (iVar1 == 0) goto LAB_00a1bf94;
                iVar1 = iVar1 + -1;
              }
              if (local_16c < 2) {
                uVar15 = 0;
                uVar11 = 1;
              }
              else {
                uVar15 = 0;
                uVar14 = 1;
                uVar11 = 1;
                iVar2 = iVar1;
                do {
                  iVar2 = iVar2 + -1;
                  if (iVar2 < 0) break;
                  iVar3 = BN_is_bit_set(p,iVar2);
                  if (iVar3 != 0) {
                    uVar11 = uVar11 << (ulong)(uVar14 - uVar15 & 0x1f) | 1;
                    uVar15 = uVar14;
                  }
                  uVar14 = uVar14 + 1;
                } while (uVar14 < local_16c);
              }
              if ((!bVar12) && (-1 < (int)uVar15)) {
                iVar2 = -1;
                do {
                  iVar3 = bn_mul_mont_fixed_top(a_00,a_00,a_00,mont,ctx);
                  if (iVar3 == 0) goto LAB_00a1bfb8;
                  iVar2 = iVar2 + 1;
                } while (iVar2 < (int)uVar15);
              }
              iVar2 = bn_mul_mont_fixed_top(a_00,a_00,local_168[(int)uVar11 >> 1],mont,ctx);
              if (iVar2 == 0) goto LAB_00a1bfb8;
              iVar1 = (iVar1 + -1) - uVar15;
              bVar12 = false;
            } while (-1 < iVar1);
LAB_00a1bf94:
            iVar1 = BN_from_montgomery(r,a_00,mont,ctx);
            uVar11 = (uint)(iVar1 != 0);
            goto joined_r0x00a1bc94;
          }
        }
      }
LAB_00a1bfb8:
      uVar11 = 0;
      goto joined_r0x00a1bc94;
    }
    uVar11 = 0;
  }
  BN_MONT_CTX_free(mont);
LAB_00a1bfc8:
  BN_CTX_end(ctx);
  return uVar11;
}

