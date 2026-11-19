/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad7b78
 */

undefined8
RSA_generate_multi_prime_key
          (long param_1,uint param_2,ulong param_3,BIGNUM *param_4,BN_GENCB *param_5)

{
  uint uVar1;
  bool bVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  BIGNUM *pBVar9;
  BIGNUM *pBVar10;
  BIGNUM *r;
  BIGNUM *pBVar11;
  long *plVar12;
  long *plVar13;
  BIGNUM *pBVar14;
  undefined8 *puVar15;
  BIGNUM *pBVar16;
  code *UNRECOVERED_JUMPTABLE_00;
  long *plVar17;
  ulong uVar18;
  long lVar19;
  ulong uVar20;
  uint uVar21;
  BN_CTX *ctx;
  long *plVar22;
  uint uVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  int local_b8;
  int local_b0;
  int local_a8;
  int local_a4;
  long local_88;
  uint local_74 [2];
  undefined8 uStack_6c;
  undefined1 auStack_64 [4];
  
  UNRECOVERED_JUMPTABLE_00 = *(code **)(*(long *)(param_1 + 0x18) + 0x70);
  if (UNRECOVERED_JUMPTABLE_00 != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00ad7be8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar8 = (*UNRECOVERED_JUMPTABLE_00)(param_1,param_2,param_3 & 0xffffffff,param_4,param_5);
    return uVar8;
  }
  UNRECOVERED_JUMPTABLE_00 = *(code **)(*(long *)(param_1 + 0x18) + 0x68);
  uVar21 = (uint)param_3;
  if (UNRECOVERED_JUMPTABLE_00 != (code *)0x0) {
    if (uVar21 == 2) {
                    /* WARNING: Could not recover jumptable at 0x00ad7c2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar8 = (*UNRECOVERED_JUMPTABLE_00)(param_1,param_2,param_4,param_5);
      return uVar8;
    }
    return 0;
  }
  if (((int)param_2 < 0x800) || (uVar21 != 2)) {
    if (0x1ff < (int)param_2) {
      if (param_4 != (BIGNUM *)0x0) goto LAB_00ad7cb8;
      goto LAB_00ad7cc4;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_gen.c",0x5a,"rsa_multiprime_keygen");
    uVar8 = 0x78;
LAB_00ad7d00:
    ERR_set_error(4,uVar8,0);
    ctx = (BN_CTX *)0x0;
  }
  else {
    if ((param_4 == (BIGNUM *)0x0) || (iVar6 = BN_num_bits(param_4), 0x10 < iVar6)) {
      uVar8 = ossl_rsa_sp800_56b_generate_key(param_1,param_2,param_4,param_5);
      return uVar8;
    }
LAB_00ad7cb8:
    iVar6 = ossl_rsa_check_public_exponent(param_4);
    if (iVar6 == 0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_gen.c",0x60,"rsa_multiprime_keygen");
      ERR_set_error(4,0xb2,0);
      return 0;
    }
LAB_00ad7cc4:
    if (((int)uVar21 < 2) || (iVar6 = ossl_rsa_multip_cap(param_2), iVar6 < (int)uVar21)) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_gen.c",0x66,"rsa_multiprime_keygen");
      uVar8 = 0xa5;
      goto LAB_00ad7d00;
    }
    ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 8));
    if (ctx != (BN_CTX *)0x0) {
      BN_CTX_start(ctx);
      pBVar9 = BN_CTX_get(ctx);
      pBVar10 = BN_CTX_get(ctx);
      r = BN_CTX_get(ctx);
      if (r != (BIGNUM *)0x0) {
        uVar1 = 0;
        if (uVar21 != 0) {
          uVar1 = param_2 / uVar21;
        }
        uVar18 = 0;
        lVar19 = (long)(int)(param_2 - uVar1 * uVar21);
        if (uVar21 < 8) goto LAB_00ad7e60;
        lVar25 = 3;
        lVar24 = 2;
        lVar27 = 1;
        lVar26 = 0;
        uVar18 = param_3 & 0xfffffff8;
        puVar15 = (undefined8 *)auStack_64;
        uVar20 = uVar18;
        do {
          lVar28 = lVar26 + 4;
          lVar29 = lVar27 + 4;
          lVar30 = lVar24 + 4;
          lVar31 = lVar25 + 4;
          bVar2 = lVar26 < lVar19;
          bVar4 = lVar27 < lVar19;
          bVar3 = lVar24 < lVar19;
          bVar5 = lVar25 < lVar19;
          lVar24 = lVar24 + 8;
          lVar25 = lVar25 + 8;
          lVar26 = lVar26 + 8;
          lVar27 = lVar27 + 8;
          uVar20 = uVar20 - 8;
          puVar15[-1] = CONCAT44(uVar1 + bVar5,uVar1 + bVar3);
          puVar15[-2] = CONCAT44(uVar1 + bVar4,uVar1 + bVar2);
          puVar15[1] = CONCAT44(uVar1 + (lVar31 < lVar19),uVar1 + (lVar30 < lVar19));
          *puVar15 = CONCAT44(uVar1 + (lVar29 < lVar19),uVar1 + (lVar28 < lVar19));
          puVar15 = puVar15 + 4;
        } while (uVar20 != 0);
        for (; uVar18 != (param_3 & 0xffffffff); uVar18 = uVar18 + 1) {
LAB_00ad7e60:
          uVar23 = uVar1;
          if ((long)uVar18 < lVar19) {
            uVar23 = uVar1 + 1;
          }
          local_74[uVar18] = uVar23;
        }
        *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
        if (*(long *)(param_1 + 0x28) == 0) {
          pBVar11 = BN_new();
          *(BIGNUM **)(param_1 + 0x28) = pBVar11;
          if (pBVar11 == (BIGNUM *)0x0) goto LAB_00ad850c;
        }
        lVar19 = *(long *)(param_1 + 0x38);
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *(long *)(param_1 + 0x38) = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        if (*(long *)(param_1 + 0x30) == 0) {
          pBVar11 = BN_new();
          *(BIGNUM **)(param_1 + 0x30) = pBVar11;
          if (pBVar11 == (BIGNUM *)0x0) goto LAB_00ad850c;
        }
        plVar22 = (long *)(param_1 + 0x40);
        lVar19 = *plVar22;
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *plVar22 = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        plVar17 = (long *)(param_1 + 0x48);
        lVar19 = *plVar17;
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *plVar17 = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        lVar19 = *(long *)(param_1 + 0x50);
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *(long *)(param_1 + 0x50) = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        lVar19 = *(long *)(param_1 + 0x58);
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *(long *)(param_1 + 0x58) = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        lVar19 = *(long *)(param_1 + 0x60);
        if (lVar19 == 0) {
          lVar19 = BN_secure_new();
          *(long *)(param_1 + 0x60) = lVar19;
          if (lVar19 == 0) goto LAB_00ad850c;
        }
        BN_set_flags(lVar19,4);
        if ((int)uVar21 < 3) {
          plVar12 = (long *)0x0;
          local_88 = 0;
        }
        else {
          *(undefined4 *)(param_1 + 0x10) = 1;
          local_88 = OPENSSL_sk_new_reserve(0,uVar21 - 2);
          if (local_88 == 0) goto LAB_00ad850c;
          if (*(long *)(param_1 + 0x88) != 0) {
            OPENSSL_sk_pop_free(*(long *)(param_1 + 0x88),ossl_rsa_multip_info_free);
          }
          iVar6 = 2;
          *(long *)(param_1 + 0x88) = local_88;
          do {
            plVar12 = (long *)ossl_rsa_multip_info_new();
            if (plVar12 == (long *)0x0) goto LAB_00ad850c;
            OPENSSL_sk_push(local_88,plVar12);
            iVar6 = iVar6 + 1;
          } while (iVar6 < (int)uVar21);
        }
        pBVar11 = BN_copy(*(BIGNUM **)(param_1 + 0x30),param_4);
        if (pBVar11 != (BIGNUM *)0x0) {
          iVar6 = 0;
          local_b8 = 0;
          local_a8 = 0;
LAB_00ad7ff8:
          if (iVar6 == 0) {
            plVar13 = plVar22;
          }
          else {
            plVar13 = plVar17;
            if (iVar6 != 1) {
              plVar12 = (long *)OPENSSL_sk_value(local_88,iVar6 + -2);
              plVar13 = plVar12;
            }
          }
          pBVar11 = (BIGNUM *)*plVar13;
          BN_set_flags(pBVar11,4);
          uVar1 = local_74[iVar6];
          local_a4 = 0;
          local_b8 = uVar1 + local_b8;
          local_b0 = 0;
LAB_00ad805c:
          while( true ) {
            iVar7 = BN_generate_prime_ex2(pBVar11,local_a4 + uVar1,0,0,0,param_5,ctx);
            if (iVar7 == 0) goto LAB_00ad850c;
            if (0 < iVar6) {
              uVar23 = 0;
              do {
                while( true ) {
                  plVar13 = plVar22;
                  if (((uVar23 & 0x7fffffff) != 0) &&
                     (plVar13 = plVar17, (uVar23 & 0x7fffffff) != 1)) {
                    plVar13 = (long *)OPENSSL_sk_value(local_88,uVar23 - 2);
                  }
                  iVar7 = BN_cmp(pBVar11,(BIGNUM *)*plVar13);
                  if (iVar7 != 0) break;
                  iVar7 = BN_generate_prime_ex2(pBVar11,local_a4 + uVar1,0,0,0,param_5,ctx);
                  uVar23 = 0;
                  if (iVar7 == 0) goto LAB_00ad850c;
                }
                uVar23 = uVar23 + 1;
              } while ((int)uVar23 < iVar6);
            }
            pBVar14 = BN_value_one();
            iVar7 = BN_sub(r,pBVar11,pBVar14);
            if (iVar7 == 0) goto LAB_00ad850c;
            ERR_set_mark();
            BN_set_flags(r,4);
            pBVar14 = BN_mod_inverse(pBVar10,r,*(BIGNUM **)(param_1 + 0x30),ctx);
            if (pBVar14 != (BIGNUM *)0x0) break;
            uVar18 = ERR_peek_last_error();
            if (((uVar18 & 0xff800000) != 0x1800000) ||
               ((((int)(uint)uVar18 >> 0x1f & 0x7f800000U | 0x7fffff) & (uint)uVar18) != 0x6c))
            goto LAB_00ad850c;
            ERR_pop_to_mark();
            iVar7 = BN_GENCB_call(param_5,2,local_a8);
            local_a8 = local_a8 + 1;
            if (iVar7 == 0) goto LAB_00ad850c;
          }
          if (iVar6 == 1) {
            pBVar16 = (BIGNUM *)*plVar22;
            pBVar14 = (BIGNUM *)*plVar17;
          }
          else {
            if (iVar6 == 0) {
              iVar7 = BN_GENCB_call(param_5,3,0);
              if (iVar7 != 0) goto LAB_00ad82bc;
              goto LAB_00ad850c;
            }
            pBVar16 = *(BIGNUM **)(param_1 + 0x28);
            pBVar14 = pBVar11;
          }
          iVar7 = BN_mul(pBVar10,pBVar16,pBVar14,ctx);
          if ((iVar7 == 0) || (iVar7 = BN_rshift(r,pBVar10,local_b8 + -4), iVar7 == 0))
          goto LAB_00ad850c;
          uVar18 = BN_get_word(r);
          if (uVar18 - 9 < 7) {
            if ((((1 < iVar6) &&
                 (pBVar11 = BN_copy((BIGNUM *)plVar12[3],*(BIGNUM **)(param_1 + 0x28)),
                 pBVar11 == (BIGNUM *)0x0)) ||
                (pBVar11 = BN_copy(*(BIGNUM **)(param_1 + 0x28),pBVar10), pBVar11 == (BIGNUM *)0x0))
               || (iVar7 = BN_GENCB_call(param_5,3,iVar6), iVar7 == 0)) goto LAB_00ad850c;
            goto LAB_00ad82bc;
          }
          iVar7 = BN_GENCB_call(param_5,2,local_a8);
          if (iVar7 == 0) goto LAB_00ad850c;
          local_a8 = local_a8 + 1;
          if ((int)uVar21 < 5) {
            if (local_b0 == 4) goto LAB_00ad82b4;
          }
          else if (uVar18 < 9) {
            local_a4 = local_a4 + 1;
          }
          else {
            local_a4 = local_a4 + -1;
          }
          local_b0 = local_b0 + 1;
          goto LAB_00ad805c;
        }
      }
    }
LAB_00ad850c:
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_gen.c",0x19f,"rsa_multiprime_keygen");
    ERR_set_error(4,0x80003,0);
  }
  uVar8 = 0;
LAB_00ad7d10:
  BN_CTX_end(ctx);
  BN_CTX_free(ctx);
  return uVar8;
LAB_00ad82b4:
  local_b8 = 0;
  iVar6 = -1;
LAB_00ad82bc:
  iVar6 = iVar6 + 1;
  if ((int)uVar21 <= iVar6) goto code_r0x00ad82d0;
  goto LAB_00ad7ff8;
code_r0x00ad82d0:
  iVar6 = BN_cmp((BIGNUM *)*plVar22,(BIGNUM *)*plVar17);
  if (iVar6 < 0) {
    lVar19 = *plVar22;
    pBVar11 = (BIGNUM *)*plVar17;
    *plVar22 = (long)pBVar11;
    *plVar17 = lVar19;
  }
  else {
    pBVar11 = (BIGNUM *)*plVar22;
  }
  pBVar14 = BN_value_one();
  iVar6 = BN_sub(pBVar10,pBVar11,pBVar14);
  if (iVar6 != 0) {
    pBVar14 = (BIGNUM *)*plVar17;
    pBVar11 = BN_value_one();
    iVar6 = BN_sub(r,pBVar14,pBVar11);
    if ((iVar6 != 0) && (iVar6 = BN_mul(pBVar9,pBVar10,r,ctx), iVar6 != 0)) {
      if (2 < (int)uVar21) {
        iVar6 = 2;
        do {
          puVar15 = (undefined8 *)OPENSSL_sk_value(local_88,iVar6 + -2);
          pBVar11 = (BIGNUM *)*puVar15;
          pBVar14 = (BIGNUM *)puVar15[1];
          pBVar16 = BN_value_one();
          iVar7 = BN_sub(pBVar14,pBVar11,pBVar16);
          if ((iVar7 == 0) || (iVar7 = BN_mul(pBVar9,pBVar9,(BIGNUM *)puVar15[1],ctx), iVar7 == 0))
          goto LAB_00ad850c;
          iVar6 = iVar6 + 1;
        } while (iVar6 < (int)uVar21);
      }
      pBVar11 = BN_new();
      if (pBVar11 != (BIGNUM *)0x0) {
        BN_with_flags(pBVar11,pBVar9,4);
        pBVar9 = BN_mod_inverse(*(BIGNUM **)(param_1 + 0x38),*(BIGNUM **)(param_1 + 0x30),pBVar11,
                                ctx);
        BN_free(pBVar11);
        if ((pBVar9 != (BIGNUM *)0x0) && (pBVar9 = BN_new(), pBVar9 != (BIGNUM *)0x0)) {
          BN_with_flags(pBVar9,*(undefined8 *)(param_1 + 0x38),4);
          iVar6 = BN_div((BIGNUM *)0x0,*(BIGNUM **)(param_1 + 0x50),pBVar9,pBVar10,ctx);
          if ((iVar6 != 0) &&
             (iVar6 = BN_div((BIGNUM *)0x0,*(BIGNUM **)(param_1 + 0x58),pBVar9,r,ctx), iVar6 != 0))
          {
            if (2 < (int)uVar21) {
              iVar6 = 2;
              do {
                lVar19 = OPENSSL_sk_value(local_88,iVar6 + -2);
                iVar7 = BN_div((BIGNUM *)0x0,*(BIGNUM **)(lVar19 + 8),pBVar9,
                               *(BIGNUM **)(lVar19 + 8),ctx);
                if (iVar7 == 0) goto LAB_00ad8508;
                iVar6 = iVar6 + 1;
              } while (iVar6 < (int)uVar21);
            }
            BN_free(pBVar9);
            pBVar9 = BN_new();
            if (pBVar9 == (BIGNUM *)0x0) goto LAB_00ad850c;
            BN_with_flags(pBVar9,*(undefined8 *)(param_1 + 0x40),4);
            pBVar10 = BN_mod_inverse(*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_1 + 0x48),
                                     pBVar9,ctx);
            if (pBVar10 != (BIGNUM *)0x0) {
              if (2 < (int)uVar21) {
                iVar6 = 2;
                do {
                  puVar15 = (undefined8 *)OPENSSL_sk_value(local_88,iVar6 + -2);
                  BN_with_flags(pBVar9,*puVar15,4);
                  pBVar10 = BN_mod_inverse((BIGNUM *)puVar15[2],(BIGNUM *)puVar15[3],pBVar9,ctx);
                  if (pBVar10 == (BIGNUM *)0x0) goto LAB_00ad8508;
                  iVar6 = iVar6 + 1;
                } while (iVar6 < (int)uVar21);
              }
              BN_free(pBVar9);
              uVar8 = 1;
              goto LAB_00ad7d10;
            }
          }
LAB_00ad8508:
          BN_free(pBVar9);
        }
      }
    }
  }
  goto LAB_00ad850c;
}

