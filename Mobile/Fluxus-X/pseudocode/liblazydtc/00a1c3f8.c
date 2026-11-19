/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1c3f8
 */

int BN_mod_exp_mont_consttime
              (BIGNUM *rr,BIGNUM *a,BIGNUM *p,BIGNUM *m,BN_CTX *ctx,BN_MONT_CTX *in_mont)

{
  ulong *puVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  BIGNUM *r;
  BN_MONT_CTX *mont;
  undefined1 *puVar6;
  BIGNUM *pBVar7;
  ulong *puVar8;
  long lVar9;
  ulong *puVar10;
  long lVar11;
  BN_MONT_CTX *pBVar12;
  long lVar13;
  undefined8 *puVar14;
  uint uVar15;
  ulong uVar16;
  uint uVar17;
  BN_MONT_CTX *__s;
  ulong uVar18;
  long lVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  undefined1 auStack_e0 [8];
  undefined1 *local_d8;
  ulong local_d0;
  undefined1 *local_c8;
  int local_bc;
  BN_MONT_CTX *local_b8;
  uint local_ac;
  ulong local_a8;
  ulong local_a0;
  uint local_94;
  ulong *local_90;
  uint local_88;
  uint uStack_84;
  undefined8 local_80;
  BIGNUM local_78;
  
  iVar3 = BN_is_odd(m);
  if (iVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_exp.c",0x277,"BN_mod_exp_mont_consttime");
    ERR_set_error(3,0x66,0);
    return 0;
  }
  uVar15 = m->top;
  uVar16 = (ulong)uVar15;
  if (0xfffff < (int)uVar15) {
    iVar3 = BN_mod_exp_mont(rr,a,p,m,ctx,in_mont);
    return iVar3;
  }
  iVar3 = p->top;
  if (iVar3 == 0) {
    iVar3 = BN_abs_is_word(m,1);
    if (iVar3 == 0) {
      iVar3 = BN_set_word(rr,1);
      return iVar3;
    }
    BN_zero_ex(rr);
    return 1;
  }
  BN_CTX_start(ctx);
  mont = in_mont;
  if ((in_mont == (BN_MONT_CTX *)0x0) &&
     ((mont = BN_MONT_CTX_new(), mont == (BN_MONT_CTX *)0x0 ||
      (iVar4 = BN_MONT_CTX_set(mont,m,ctx), iVar4 == 0)))) {
    __s = (BN_MONT_CTX *)0x0;
    iVar3 = 0;
    puVar6 = (undefined1 *)0x0;
    uVar15 = 0;
  }
  else {
    if (a->neg == 0) {
      iVar4 = BN_ucmp(a,m);
      r = a;
      if (-1 < iVar4) goto LAB_00a1c4d0;
LAB_00a1c4fc:
      if (iVar3 < 0xf) {
        if (iVar3 < 5) {
          if (iVar3 < 2) {
            local_94 = 3;
            if (iVar3 != 1) {
              local_94 = 1;
            }
          }
          else {
            local_94 = 4;
          }
        }
        else {
          local_94 = 5;
        }
      }
      else {
        local_94 = 6;
      }
      local_ac = 1 << (ulong)local_94;
      uVar2 = uVar15 * 2;
      if ((int)(uVar15 * 2) <= (int)local_ac) {
        uVar2 = local_ac;
      }
      uVar2 = uVar2 + (uVar15 << (ulong)local_94);
      lVar13 = (ulong)uVar2 << 0x23;
      uVar20 = (ulong)uVar2 << 3;
      local_a8 = -(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | uVar20;
      lVar19 = lVar13 + 0x4000000000;
      if ((int)uVar20 < 0xc00) {
        puVar6 = auStack_e0 + -((lVar19 >> 0x20) + 0xfU & 0xfffffffffffffff0);
      }
      else {
        puVar6 = CRYPTO_malloc((int)((ulong)lVar19 >> 0x20),"crypto/bn/bn_exp.c",0x2e9);
        if (puVar6 == (undefined1 *)0x0) {
          iVar3 = (int)local_a8;
          goto joined_r0x00a1c5a8;
        }
      }
      local_d0 = (ulong)puVar6 & 0x3f;
      __s = (BN_MONT_CTX *)(puVar6 + (0x40 - local_d0));
      lVar19 = (long)(int)uVar15;
      local_bc = iVar3;
      local_b8 = mont;
      memset(__s,0,lVar13 >> 0x20);
      mont = local_b8;
      iVar4 = local_bc;
      local_78.top = 0;
      local_88 = 0;
      local_a0 = (ulong)local_ac;
      local_78.d = (ulong *)((long)__s->n0 + lVar19 * 8 * local_a0 + -0x50);
      local_90 = local_78.d + lVar19;
      local_80 = 0x200000000;
      local_78.neg = 0;
      local_78.flags = 2;
      puVar8 = m->d;
      iVar3 = (int)local_a8;
      local_c8 = (undefined1 *)0x0;
      if (0xbff < iVar3) {
        local_c8 = puVar6;
      }
      local_d8 = puVar6;
      uStack_84 = uVar15;
      local_78.dmax = uVar15;
      if ((long)puVar8[(int)(uVar15 - 1)] < 0) {
        *local_78.d = -*puVar8;
        if (1 < (int)uVar15) {
          if (uVar16 - 1 < 4) {
LAB_00a1c76c:
            lVar9 = 1;
          }
          else {
            lVar13 = lVar19 * local_a0 * 8;
            if ((local_d8 + ((lVar13 + 0x48) - local_d0) < puVar8 + uVar16) &&
               (puVar8 + 1 < local_d8 + ((lVar13 + uVar16 * 8 + 0x40) - local_d0)))
            goto LAB_00a1c76c;
            uVar2 = uVar15 - 1 & 3;
            lVar11 = (uVar16 - 1) - (ulong)uVar2;
            puVar10 = puVar8 + 3;
            lVar9 = lVar11 + 1;
            puVar14 = (undefined8 *)(local_d8 + ((lVar13 + 0x58) - local_d0));
            do {
              uVar18 = puVar10[-1];
              uVar20 = puVar10[-2];
              uVar22 = puVar10[1];
              uVar21 = *puVar10;
              lVar11 = lVar11 + -4;
              puVar10 = puVar10 + 4;
              puVar14[-1] = CONCAT17(~(byte)(uVar18 >> 0x38),
                                     CONCAT16(~(byte)(uVar18 >> 0x30),
                                              CONCAT15(~(byte)(uVar18 >> 0x28),
                                                       CONCAT14(~(byte)(uVar18 >> 0x20),
                                                                CONCAT13(~(byte)(uVar18 >> 0x18),
                                                                         CONCAT12(~(byte)(uVar18 >>
                                                                                         0x10),
                                                                                  CONCAT11(~(byte)(
                                                  uVar18 >> 8),~(byte)uVar18)))))));
              puVar14[-2] = CONCAT17(~(byte)(uVar20 >> 0x38),
                                     CONCAT16(~(byte)(uVar20 >> 0x30),
                                              CONCAT15(~(byte)(uVar20 >> 0x28),
                                                       CONCAT14(~(byte)(uVar20 >> 0x20),
                                                                CONCAT13(~(byte)(uVar20 >> 0x18),
                                                                         CONCAT12(~(byte)(uVar20 >>
                                                                                         0x10),
                                                                                  CONCAT11(~(byte)(
                                                  uVar20 >> 8),~(byte)uVar20)))))));
              puVar14[1] = CONCAT17(~(byte)(uVar22 >> 0x38),
                                    CONCAT16(~(byte)(uVar22 >> 0x30),
                                             CONCAT15(~(byte)(uVar22 >> 0x28),
                                                      CONCAT14(~(byte)(uVar22 >> 0x20),
                                                               CONCAT13(~(byte)(uVar22 >> 0x18),
                                                                        CONCAT12(~(byte)(uVar22 >>
                                                                                        0x10),
                                                                                 CONCAT11(~(byte)(
                                                  uVar22 >> 8),~(byte)uVar22)))))));
              *puVar14 = CONCAT17(~(byte)(uVar21 >> 0x38),
                                  CONCAT16(~(byte)(uVar21 >> 0x30),
                                           CONCAT15(~(byte)(uVar21 >> 0x28),
                                                    CONCAT14(~(byte)(uVar21 >> 0x20),
                                                             CONCAT13(~(byte)(uVar21 >> 0x18),
                                                                      CONCAT12(~(byte)(uVar21 >>
                                                                                      0x10),
                                                                               CONCAT11(~(byte)(
                                                  uVar21 >> 8),~(byte)uVar21)))))));
              puVar14 = puVar14 + 4;
            } while (lVar11 != 0);
            if (uVar2 == 0) goto LAB_00a1c7b0;
          }
          lVar13 = uVar16 - lVar9;
          puVar8 = puVar8 + lVar9;
          puVar10 = (ulong *)(local_d8 + ((lVar9 * 8 + lVar19 * local_a0 * 8 + 0x40) - local_d0));
          do {
            lVar13 = lVar13 + -1;
            *puVar10 = ~*puVar8;
            puVar8 = puVar8 + 1;
            puVar10 = puVar10 + 1;
          } while (lVar13 != 0);
        }
LAB_00a1c7b0:
        local_78.top = uVar15;
      }
      else {
        pBVar7 = BN_value_one();
        mont = local_b8;
        iVar5 = bn_to_mont_fixed_top(&local_78,pBVar7,local_b8,ctx);
        iVar4 = local_bc;
        puVar6 = local_c8;
        if (iVar5 == 0) goto joined_r0x00a1c5a8;
      }
      iVar5 = bn_to_mont_fixed_top(&local_90,r,mont,ctx);
      puVar8 = local_78.d;
      uVar16 = local_a0;
      puVar6 = local_c8;
      if (iVar5 == 0) goto joined_r0x00a1c5a8;
      uVar2 = local_78.top;
      if ((int)uVar15 <= local_78.top) {
        uVar2 = uVar15;
      }
      if (0 < (int)uVar2) {
        lVar19 = 0;
        pBVar12 = __s;
        do {
          puVar10 = puVar8 + lVar19;
          lVar19 = lVar19 + 1;
          *(ulong *)pBVar12 = *puVar10;
          pBVar12 = (BN_MONT_CTX *)(pBVar12->n0 + (uVar16 - 10));
        } while (lVar19 < (int)uVar2);
      }
      uVar16 = local_d0;
      uVar2 = local_88;
      if ((int)uVar15 <= (int)local_88) {
        uVar2 = uVar15;
      }
      if (0 < (int)uVar2) {
        puVar8 = (ulong *)(local_d8 + (0x48 - local_d0));
        lVar19 = 0;
        do {
          puVar10 = local_90 + lVar19;
          lVar19 = lVar19 + 1;
          *puVar8 = *puVar10;
          puVar8 = puVar8 + local_a0;
        } while (lVar19 < (int)uVar2);
      }
      local_b8 = __s;
      if (1 < local_94) {
        iVar3 = bn_mul_mont_fixed_top(&local_78,&local_90,&local_90,mont,ctx);
        uVar20 = local_a0;
        if (iVar3 == 0) {
LAB_00a1cb24:
          iVar3 = (int)local_a8;
          puVar6 = local_c8;
          __s = local_b8;
          goto joined_r0x00a1c5a8;
        }
        uVar2 = local_78.top;
        if ((int)uVar15 <= local_78.top) {
          uVar2 = uVar15;
        }
        if (0 < (int)uVar2) {
          puVar8 = (ulong *)(local_d8 + (0x50 - uVar16));
          lVar19 = 0;
          do {
            puVar10 = local_78.d + lVar19;
            lVar19 = lVar19 + 1;
            *puVar8 = *puVar10;
            puVar8 = puVar8 + local_a0;
          } while (lVar19 < (int)uVar2);
        }
        if (3 < (int)local_ac) {
          uVar18 = 3;
          puVar8 = (ulong *)(local_d8 + (0x58 - uVar16));
          do {
            iVar3 = bn_mul_mont_fixed_top(&local_78,&local_90,&local_78,mont,ctx);
            if (iVar3 == 0) goto LAB_00a1cb24;
            uVar2 = local_78.top;
            if ((int)uVar15 <= local_78.top) {
              uVar2 = uVar15;
            }
            if (0 < (int)uVar2) {
              lVar19 = 0;
              puVar10 = puVar8;
              do {
                puVar1 = local_78.d + lVar19;
                lVar19 = lVar19 + 1;
                *puVar10 = *puVar1;
                puVar10 = puVar10 + uVar20;
              } while (lVar19 < (int)uVar2);
            }
            uVar18 = uVar18 + 1;
            puVar8 = puVar8 + 1;
          } while (uVar18 < local_a0);
        }
      }
      __s = local_b8;
      iVar5 = iVar4 * 0x40 + -1;
      iVar3 = 0;
      if (local_94 != 0) {
        iVar3 = iVar5 / (int)local_94;
      }
      uVar2 = (iVar5 - iVar3 * local_94) + 1;
      iVar4 = iVar4 * 0x40 - uVar2;
      uVar16 = 0;
      iVar3 = iVar4 + 0x3f;
      if (-1 < iVar4) {
        iVar3 = iVar4;
      }
      if (-0x40 < iVar4) {
        iVar3 = iVar3 >> 6;
        uVar16 = 0;
        if (iVar3 < p->top) {
          uVar17 = iVar4 % 0x40;
          uVar16 = p->d[iVar3];
          if (uVar17 != 0) {
            uVar16 = uVar16 >> ((ulong)uVar17 & 0x3f);
            if ((int)((long)iVar3 + 1) < p->top) {
              uVar16 = p->d[(long)iVar3 + 1] << ((ulong)(0x40 - uVar17) & 0x3f) | uVar16;
            }
          }
        }
      }
      iVar3 = FUN_00a1cc0c(&local_78,uVar15,local_b8,
                           (1 << (ulong)(uVar2 & 0x1f)) - 1U & (uint)uVar16);
      if (iVar3 != 0) {
        uVar2 = local_ac - 1;
        do {
          if (iVar4 < 1) {
            iVar3 = BN_from_montgomery(rr,&local_78,mont,ctx);
            uVar15 = (uint)(iVar3 != 0);
            goto LAB_00a1cb14;
          }
          uVar17 = 0;
          do {
            iVar3 = bn_mul_mont_fixed_top(&local_78,&local_78,&local_78,mont,ctx);
            __s = local_b8;
            if (iVar3 == 0) goto LAB_00a1cb24;
            uVar17 = uVar17 + 1;
          } while (uVar17 < local_94);
          iVar4 = iVar4 - local_94;
          iVar3 = iVar4 + 0x3f;
          if (-1 < iVar4) {
            iVar3 = iVar4;
          }
          uVar16 = 0;
          if (-0x40 < iVar4) {
            iVar3 = iVar3 >> 6;
            uVar16 = 0;
            if (iVar3 < p->top) {
              uVar17 = iVar4 % 0x40;
              uVar16 = p->d[iVar3];
              if (uVar17 != 0) {
                uVar16 = uVar16 >> ((ulong)uVar17 & 0x3f);
                if ((int)((long)iVar3 + 1) < p->top) {
                  uVar16 = p->d[(long)iVar3 + 1] << ((ulong)(0x40 - uVar17) & 0x3f) | uVar16;
                }
              }
            }
          }
          iVar3 = FUN_00a1cc0c(&local_90,uVar15,local_b8,uVar2 & (uint)uVar16);
        } while ((iVar3 != 0) &&
                (iVar3 = bn_mul_mont_fixed_top(&local_78,&local_78,&local_90,mont,ctx), iVar3 != 0))
        ;
      }
      uVar15 = 0;
LAB_00a1cb14:
      iVar3 = (int)local_a8;
      puVar6 = local_c8;
    }
    else {
LAB_00a1c4d0:
      r = BN_CTX_get(ctx);
      if (r == (BIGNUM *)0x0) {
        iVar3 = 0;
        puVar6 = (undefined1 *)0x0;
        __s = (BN_MONT_CTX *)0x0;
      }
      else {
        iVar4 = BN_nnmod(r,a,m,ctx);
        if (iVar4 != 0) goto LAB_00a1c4fc;
        iVar3 = 0;
joined_r0x00a1c5a8:
        puVar6 = (undefined1 *)0x0;
        __s = (BN_MONT_CTX *)0x0;
      }
joined_r0x00a1c5a8:
      uVar15 = 0;
    }
    if (in_mont != (BN_MONT_CTX *)0x0) goto LAB_00a1cb40;
  }
  BN_MONT_CTX_free(mont);
LAB_00a1cb40:
  if (__s != (BN_MONT_CTX *)0x0) {
    OPENSSL_cleanse(__s,(long)iVar3);
    CRYPTO_free(puVar6);
  }
  BN_CTX_end(ctx);
  return uVar15;
}

