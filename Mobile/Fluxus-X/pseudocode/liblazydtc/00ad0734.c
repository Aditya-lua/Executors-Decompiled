/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0734
 */

ulong RSA_check_key_ex(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *r_01;
  BIGNUM *r_02;
  BIGNUM *r_03;
  BN_CTX *ctx;
  undefined8 *puVar4;
  BIGNUM *pBVar5;
  undefined8 uVar6;
  BIGNUM *pBVar7;
  ulong uVar8;
  
  if ((((*(long *)(param_1 + 0x40) == 0) || (*(long *)(param_1 + 0x48) == 0)) ||
      (*(long *)(param_1 + 0x28) == 0)) ||
     ((*(long *)(param_1 + 0x30) == 0 || (*(long *)(param_1 + 0x38) == 0)))) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_chk.c",0x1f,"rsa_validate_keypair_multiprime");
    uVar6 = 0x93;
    goto LAB_00ad001c;
  }
  iVar1 = 0;
  if (*(int *)(param_1 + 0x10) == 1) {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x88));
    if (0 < iVar1) {
      iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 0x28));
      iVar2 = ossl_rsa_multip_cap(iVar2);
      if (iVar1 + 2 <= iVar2) goto LAB_00ad004c;
    }
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_chk.c",0x28,"rsa_validate_keypair_multiprime");
    uVar6 = 0xa7;
LAB_00ad001c:
    ERR_set_error(4,uVar6,0);
    return 0;
  }
LAB_00ad004c:
  r = BN_new();
  r_00 = BN_new();
  r_01 = BN_new();
  r_02 = BN_new();
  r_03 = BN_new();
  ctx = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 8));
  if (((r == (BIGNUM *)0x0) || (r_00 == (BIGNUM *)0x0)) ||
     ((r_01 == (BIGNUM *)0x0 ||
      (((r_02 == (BIGNUM *)0x0 || (r_03 == (BIGNUM *)0x0)) || (ctx == (BN_CTX *)0x0)))))) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_chk.c",0x36,"rsa_validate_keypair_multiprime");
    ERR_set_error(4,0xc0100,0);
  }
  else {
    iVar2 = BN_is_one(*(undefined8 *)(param_1 + 0x30));
    if (iVar2 != 0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_chk.c",0x3c,"rsa_validate_keypair_multiprime");
      ERR_set_error(4,0x65,0);
    }
    uVar8 = (ulong)(iVar2 == 0);
    iVar2 = BN_is_odd(*(undefined8 *)(param_1 + 0x30));
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_chk.c",0x40,"rsa_validate_keypair_multiprime");
      ERR_set_error(4,0x65,0);
      uVar8 = 0;
    }
    iVar2 = BN_check_prime(*(undefined8 *)(param_1 + 0x40),ctx,param_2);
    if (iVar2 != 1) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_chk.c",0x46,"rsa_validate_keypair_multiprime");
      ERR_set_error(4,0x80,0);
      uVar8 = 0;
    }
    iVar2 = BN_check_prime(*(undefined8 *)(param_1 + 0x48),ctx,param_2);
    if (iVar2 != 1) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_chk.c",0x4c,"rsa_validate_keypair_multiprime");
      ERR_set_error(4,0x81,0);
      uVar8 = 0;
    }
    if (0 < iVar1) {
      iVar2 = 0;
      do {
        puVar4 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),iVar2);
        iVar3 = BN_check_prime(*puVar4,ctx,param_2);
        if (iVar3 != 1) {
          ERR_new();
          ERR_set_debug("crypto/rsa/rsa_chk.c",0x54,"rsa_validate_keypair_multiprime");
          ERR_set_error(4,0xaa,0);
          uVar8 = 0;
        }
        iVar2 = iVar2 + 1;
      } while (iVar1 != iVar2);
    }
    iVar2 = BN_mul(r,*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_1 + 0x48),ctx);
    if (iVar2 != 0) {
      if (0 < iVar1) {
        iVar2 = 0;
        do {
          puVar4 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),iVar2);
          iVar3 = BN_mul(r,r,(BIGNUM *)*puVar4,ctx);
          if (iVar3 == 0) goto LAB_00ad05ec;
          iVar2 = iVar2 + 1;
        } while (iVar2 < iVar1);
      }
      iVar2 = BN_cmp(r,*(BIGNUM **)(param_1 + 0x28));
      if (iVar2 != 0) {
        ERR_new();
        if (iVar1 == 0) {
          ERR_set_debug("crypto/rsa/rsa_chk.c",0x69,"rsa_validate_keypair_multiprime");
          uVar6 = 0x7f;
        }
        else {
          ERR_set_debug("crypto/rsa/rsa_chk.c",0x67,"rsa_validate_keypair_multiprime");
          uVar6 = 0xac;
        }
        ERR_set_error(4,uVar6,0);
        uVar8 = 0;
      }
      pBVar7 = *(BIGNUM **)(param_1 + 0x40);
      pBVar5 = BN_value_one();
      iVar2 = BN_sub(r,pBVar7,pBVar5);
      if (iVar2 != 0) {
        pBVar7 = *(BIGNUM **)(param_1 + 0x48);
        pBVar5 = BN_value_one();
        iVar2 = BN_sub(r_00,pBVar7,pBVar5);
        if (((iVar2 != 0) && (iVar2 = BN_mul(r_02,r,r_00,ctx), iVar2 != 0)) &&
           ((iVar2 = BN_gcd(r_03,r,r_00,ctx), iVar2 != 0 &&
            (iVar2 = BN_div(r_03,(BIGNUM *)0x0,r_02,r_03,ctx), iVar2 != 0)))) {
          if (0 < iVar1) {
            iVar2 = 0;
            do {
              puVar4 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88),iVar2);
              pBVar7 = (BIGNUM *)*puVar4;
              pBVar5 = BN_value_one();
              iVar3 = BN_sub(r_01,pBVar7,pBVar5);
              if (((iVar3 == 0) || (iVar3 = BN_mul(r_02,r_03,r_01,ctx), iVar3 == 0)) ||
                 ((iVar3 = BN_gcd(r_03,r_03,r_01,ctx), iVar3 == 0 ||
                  (iVar3 = BN_div(r_03,(BIGNUM *)0x0,r_02,r_03,ctx), iVar3 == 0))))
              goto LAB_00ad05ec;
              iVar2 = iVar2 + 1;
            } while (iVar2 < iVar1);
          }
          iVar2 = BN_mod_mul(r,*(BIGNUM **)(param_1 + 0x38),*(BIGNUM **)(param_1 + 0x30),r_03,ctx);
          if (iVar2 != 0) {
            iVar2 = BN_is_one(r);
            if (iVar2 == 0) {
              ERR_new();
              ERR_set_debug("crypto/rsa/rsa_chk.c",0x9d,"rsa_validate_keypair_multiprime");
              ERR_set_error(4,0x7b,0);
              uVar8 = 0;
            }
            if (((*(long *)(param_1 + 0x50) == 0) || (*(long *)(param_1 + 0x58) == 0)) ||
               (*(long *)(param_1 + 0x60) == 0)) {
joined_r0x00ad062c:
              if (0 < iVar1) {
                iVar2 = 0;
                do {
                  puVar4 = (undefined8 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x88));
                  pBVar7 = (BIGNUM *)*puVar4;
                  pBVar5 = BN_value_one();
                  iVar3 = BN_sub(r,pBVar7,pBVar5);
                  if ((iVar3 == 0) ||
                     (iVar3 = BN_div((BIGNUM *)0x0,r_00,*(BIGNUM **)(param_1 + 0x38),r,ctx),
                     iVar3 == 0)) goto LAB_00ad05ec;
                  iVar3 = BN_cmp(r_00,(BIGNUM *)puVar4[1]);
                  if (iVar3 != 0) {
                    ERR_new();
                    ERR_set_debug("crypto/rsa/rsa_chk.c",0xd5,"rsa_validate_keypair_multiprime");
                    ERR_set_error(4,0xa9,0);
                    uVar8 = 0;
                  }
                  pBVar5 = BN_mod_inverse(r,(BIGNUM *)puVar4[3],(BIGNUM *)*puVar4,ctx);
                  if (pBVar5 == (BIGNUM *)0x0) goto LAB_00ad05ec;
                  iVar3 = BN_cmp(r,(BIGNUM *)puVar4[2]);
                  if (iVar3 != 0) {
                    ERR_new();
                    ERR_set_debug("crypto/rsa/rsa_chk.c",0xde,"rsa_validate_keypair_multiprime");
                    ERR_set_error(4,0xa8,0);
                    uVar8 = 0;
                  }
                  iVar2 = iVar2 + 1;
                } while (iVar2 < iVar1);
              }
              goto LAB_00ad05f0;
            }
            pBVar7 = *(BIGNUM **)(param_1 + 0x40);
            pBVar5 = BN_value_one();
            iVar2 = BN_sub(r,pBVar7,pBVar5);
            if ((iVar2 != 0) &&
               (iVar2 = BN_div((BIGNUM *)0x0,r_00,*(BIGNUM **)(param_1 + 0x38),r,ctx), iVar2 != 0))
            {
              iVar2 = BN_cmp(r_00,*(BIGNUM **)(param_1 + 0x50));
              if (iVar2 != 0) {
                ERR_new();
                ERR_set_debug("crypto/rsa/rsa_chk.c",0xac,"rsa_validate_keypair_multiprime");
                ERR_set_error(4,0x7c,0);
                uVar8 = 0;
              }
              pBVar7 = *(BIGNUM **)(param_1 + 0x48);
              pBVar5 = BN_value_one();
              iVar2 = BN_sub(r,pBVar7,pBVar5);
              if ((iVar2 != 0) &&
                 (iVar2 = BN_div((BIGNUM *)0x0,r_00,*(BIGNUM **)(param_1 + 0x38),r,ctx), iVar2 != 0)
                 ) {
                iVar2 = BN_cmp(r_00,*(BIGNUM **)(param_1 + 0x58));
                if (iVar2 != 0) {
                  ERR_new();
                  ERR_set_debug("crypto/rsa/rsa_chk.c",0xba,"rsa_validate_keypair_multiprime");
                  ERR_set_error(4,0x7d,0);
                  uVar8 = 0;
                }
                pBVar5 = BN_mod_inverse(r,*(BIGNUM **)(param_1 + 0x48),*(BIGNUM **)(param_1 + 0x40),
                                        ctx);
                if (pBVar5 != (BIGNUM *)0x0) {
                  iVar2 = BN_cmp(r,*(BIGNUM **)(param_1 + 0x60));
                  if (iVar2 != 0) {
                    ERR_new();
                    ERR_set_debug("crypto/rsa/rsa_chk.c",0xc4,"rsa_validate_keypair_multiprime");
                    ERR_set_error(4,0x7e,0);
                    uVar8 = 0;
                  }
                  goto joined_r0x00ad062c;
                }
              }
            }
          }
        }
      }
    }
  }
LAB_00ad05ec:
  uVar8 = 0xffffffff;
LAB_00ad05f0:
  BN_free(r);
  BN_free(r_00);
  BN_free(r_01);
  BN_free(r_02);
  BN_free(r_03);
  BN_CTX_free(ctx);
  return uVar8;
}

