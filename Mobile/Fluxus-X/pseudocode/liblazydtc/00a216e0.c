/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a216e0
 */

/* WARNING: Type propagation algorithm not settling */

int BN_mod_exp2_mont(BIGNUM *r,BIGNUM *a1,BIGNUM *p1,BIGNUM *a2,BIGNUM *p2,BIGNUM *m,BN_CTX *ctx,
                    BN_MONT_CTX *m_ctx)

{
  bool bVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  BIGNUM *pBVar9;
  BIGNUM *r_00;
  BIGNUM *pBVar10;
  BIGNUM *rem;
  BN_MONT_CTX *mont;
  uint uVar11;
  uint uVar12;
  long lVar13;
  uint uVar14;
  int iVar15;
  int iVar16;
  uint uVar17;
  int local_2a4;
  int local_2a0;
  BIGNUM *local_268 [32];
  BIGNUM *local_168 [33];
  
  iVar4 = BN_is_odd(m);
  if (iVar4 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp2.c",0x24,"BN_mod_exp2_mont");
    ERR_set_error(3,0x66,0);
    return 0;
  }
  iVar4 = BN_num_bits(p1);
  iVar5 = BN_num_bits(p2);
  if (iVar5 == 0 && iVar4 == 0) {
    iVar4 = BN_set_word(r,1);
    return iVar4;
  }
  iVar15 = iVar4;
  if (iVar4 <= iVar5) {
    iVar15 = iVar5;
  }
  BN_CTX_start(ctx);
  pBVar9 = BN_CTX_get(ctx);
  r_00 = BN_CTX_get(ctx);
  pBVar10 = BN_CTX_get(ctx);
  local_168[0] = pBVar10;
  rem = BN_CTX_get(ctx);
  local_268[0] = rem;
  if (rem == (BIGNUM *)0x0) {
    uVar12 = 0;
    mont = (BN_MONT_CTX *)0x0;
joined_r0x00a21814:
    if (m_ctx != (BN_MONT_CTX *)0x0) goto LAB_00a21d24;
  }
  else {
    mont = m_ctx;
    if (m_ctx != (BN_MONT_CTX *)0x0) {
joined_r0x00a21848:
      if (iVar4 < 0x2a0) {
        if (iVar4 < 0xf0) {
          if (iVar4 < 0x50) {
            uVar12 = 3;
            if (iVar4 < 0x18) {
              uVar12 = 1;
            }
          }
          else {
            uVar12 = 4;
          }
        }
        else {
          uVar12 = 5;
        }
      }
      else {
        uVar12 = 6;
      }
      if (iVar5 < 0x2a0) {
        if (iVar5 < 0xf0) {
          if (iVar5 < 0x50) {
            uVar11 = 3;
            if (iVar5 < 0x18) {
              uVar11 = 1;
            }
            iVar4 = a1->neg;
          }
          else {
            uVar11 = 4;
            iVar4 = a1->neg;
          }
        }
        else {
          uVar11 = 5;
          iVar4 = a1->neg;
        }
        if (iVar4 == 0) goto LAB_00a218e4;
LAB_00a218f4:
        iVar4 = BN_div((BIGNUM *)0x0,pBVar10,a1,m,ctx);
        a1 = pBVar10;
        if (iVar4 != 0) goto LAB_00a21914;
      }
      else {
        uVar11 = 6;
        if (a1->neg != 0) goto LAB_00a218f4;
LAB_00a218e4:
        iVar4 = BN_ucmp(a1,m);
        if (-1 < iVar4) goto LAB_00a218f4;
LAB_00a21914:
        iVar4 = BN_is_zero(a1);
        if (iVar4 != 0) {
LAB_00a21920:
          BN_zero_ex(r);
          uVar12 = 1;
          goto joined_r0x00a21814;
        }
        iVar4 = BN_to_montgomery(pBVar10,a1,mont,ctx);
        if (iVar4 != 0) {
          if (1 < uVar12) {
            iVar4 = BN_mod_mul_montgomery(pBVar9,pBVar10,pBVar10,mont,ctx);
            if (iVar4 == 0) goto LAB_00a21d0c;
            iVar4 = 1 << (ulong)(uVar12 - 1 & 0x1f);
            if (1 < iVar4) {
              lVar13 = 0;
              do {
                pBVar10 = BN_CTX_get(ctx);
                local_168[lVar13 + 1] = pBVar10;
                if ((pBVar10 == (BIGNUM *)0x0) ||
                   (iVar5 = BN_mod_mul_montgomery(pBVar10,local_168[lVar13],pBVar9,mont,ctx),
                   iVar5 == 0)) goto LAB_00a21d0c;
                lVar2 = lVar13 + 2;
                lVar13 = lVar13 + 1;
              } while (lVar2 < iVar4);
            }
          }
          if ((a2->neg != 0) || (iVar4 = BN_ucmp(a2,m), -1 < iVar4)) {
            iVar4 = BN_div((BIGNUM *)0x0,rem,a2,m,ctx);
            a2 = rem;
            if (iVar4 == 0) goto LAB_00a21d0c;
          }
          iVar4 = BN_is_zero(a2);
          if (iVar4 != 0) goto LAB_00a21920;
          iVar4 = BN_to_montgomery(rem,a2,mont,ctx);
          if (iVar4 != 0) {
            if (1 < uVar11) {
              iVar4 = BN_mod_mul_montgomery(pBVar9,rem,rem,mont,ctx);
              if (iVar4 == 0) goto LAB_00a21d0c;
              iVar4 = 1 << (ulong)(uVar11 - 1 & 0x1f);
              if (1 < iVar4) {
                lVar13 = 0;
                do {
                  pBVar10 = BN_CTX_get(ctx);
                  local_268[lVar13 + 1] = pBVar10;
                  if ((pBVar10 == (BIGNUM *)0x0) ||
                     (iVar5 = BN_mod_mul_montgomery(pBVar10,local_268[lVar13],pBVar9,mont,ctx),
                     iVar5 == 0)) goto LAB_00a21d0c;
                  lVar2 = lVar13 + 2;
                  lVar13 = lVar13 + 1;
                } while (lVar2 < iVar4);
              }
            }
            pBVar9 = BN_value_one();
            iVar4 = BN_to_montgomery(r_00,pBVar9,mont,ctx);
            if (iVar4 != 0) {
              if (0 < iVar15) {
                uVar17 = 0;
                uVar14 = 0;
                iVar4 = (iVar15 + -2) - uVar12;
                bVar3 = true;
                iVar5 = (iVar15 + -2) - uVar11;
                local_2a4 = 0;
                local_2a0 = 0;
                do {
                  if ((!bVar3) &&
                     (iVar6 = BN_mod_mul_montgomery(r_00,r_00,r_00,mont,ctx), iVar6 == 0))
                  goto LAB_00a21d0c;
                  iVar6 = iVar15 + -1;
                  if (uVar14 == 0) {
                    iVar7 = BN_is_bit_set(p1,iVar6);
                    if (iVar7 == 0) {
                      uVar14 = 0;
                    }
                    else {
                      iVar7 = iVar4;
                      do {
                        iVar16 = iVar7;
                        iVar8 = BN_is_bit_set(p1,iVar16 + 2);
                        iVar7 = iVar16 + 1;
                      } while (iVar8 == 0);
                      uVar14 = 1;
                      local_2a0 = iVar16 + 2;
                      for (iVar7 = iVar15 + -2; iVar16 + 1 < iVar7; iVar7 = iVar7 + -1) {
                        iVar8 = BN_is_bit_set(p1,iVar7);
                        uVar14 = (uint)(iVar8 != 0) | uVar14 << 1;
                      }
                    }
                  }
                  if (uVar17 == 0) {
                    iVar7 = BN_is_bit_set(p2,iVar6);
                    if (iVar7 == 0) {
                      uVar17 = 0;
                    }
                    else {
                      iVar7 = iVar5;
                      do {
                        iVar16 = iVar7;
                        iVar8 = BN_is_bit_set(p2,iVar16 + 2);
                        iVar7 = iVar16 + 1;
                      } while (iVar8 == 0);
                      uVar17 = 1;
                      local_2a4 = iVar16 + 2;
                      for (iVar7 = iVar15 + -2; iVar16 + 1 < iVar7; iVar7 = iVar7 + -1) {
                        iVar8 = BN_is_bit_set(p2,iVar7);
                        uVar17 = (uint)(iVar8 != 0) | uVar17 << 1;
                      }
                    }
                  }
                  if ((iVar6 == local_2a0) && (uVar14 != 0)) {
                    iVar7 = BN_mod_mul_montgomery(r_00,r_00,local_168[(int)uVar14 >> 1],mont,ctx);
                    uVar14 = 0;
                    bVar3 = false;
                    if (iVar7 == 0) goto LAB_00a21d0c;
                  }
                  if ((iVar6 == local_2a4) && (uVar17 != 0)) {
                    iVar7 = BN_mod_mul_montgomery(r_00,r_00,local_268[(int)uVar17 >> 1],mont,ctx);
                    uVar17 = 0;
                    bVar3 = false;
                    if (iVar7 == 0) goto LAB_00a21d0c;
                  }
                  iVar4 = iVar4 + -1;
                  iVar5 = iVar5 + -1;
                  bVar1 = 1 < iVar15;
                  iVar15 = iVar6;
                } while (bVar1);
              }
              iVar4 = BN_from_montgomery(r,r_00,mont,ctx);
              uVar12 = (uint)(iVar4 != 0);
              goto joined_r0x00a21814;
            }
          }
        }
      }
LAB_00a21d0c:
      uVar12 = 0;
      goto joined_r0x00a21814;
    }
    mont = BN_MONT_CTX_new();
    if (mont == (BN_MONT_CTX *)0x0) {
      mont = (BN_MONT_CTX *)0x0;
      uVar12 = 0;
    }
    else {
      iVar6 = BN_MONT_CTX_set(mont,m,ctx);
      if (iVar6 != 0) goto joined_r0x00a21848;
      uVar12 = 0;
    }
  }
  BN_MONT_CTX_free(mont);
LAB_00a21d24:
  BN_CTX_end(ctx);
  return uVar12;
}

