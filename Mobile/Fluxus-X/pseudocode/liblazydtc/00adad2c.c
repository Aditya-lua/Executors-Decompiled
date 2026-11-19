/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adad2c
 */

ulong ossl_bn_rsa_fips186_4_derive_prime
                (BIGNUM *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,BIGNUM *param_5,
                int param_6,BIGNUM *param_7,BN_CTX *param_8,BN_GENCB *param_9)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *ret;
  BIGNUM *r_01;
  BIGNUM *r_02;
  BIGNUM *a;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  ulong uVar6;
  
  BN_CTX_start(param_8);
  r = BN_CTX_get(param_8);
  r_00 = BN_CTX_get(param_8);
  ret = BN_CTX_get(param_8);
  r_01 = BN_CTX_get(param_8);
  r_02 = BN_CTX_get(param_8);
  a = BN_CTX_get(param_8);
  pBVar4 = BN_CTX_get(param_8);
  if (pBVar4 != (BIGNUM *)0x0) {
    param_6 = param_6 >> 1;
    if (param_3 == (BIGNUM *)0x0) {
      iVar2 = BN_num_bits((BIGNUM *)&ossl_bn_inv_sqrt_2);
      pBVar5 = (BIGNUM *)0x0;
      if (param_6 < iVar2) goto LAB_00adaf54;
      iVar2 = BN_num_bits((BIGNUM *)&ossl_bn_inv_sqrt_2);
      iVar2 = BN_lshift(r,(BIGNUM *)&ossl_bn_inv_sqrt_2,param_6 - iVar2);
      if (iVar2 != 0) {
        pBVar5 = BN_value_one();
        iVar2 = BN_lshift(r_00,pBVar5,param_6);
        if ((iVar2 != 0) && (iVar2 = BN_sub(r_00,r_00,r), iVar2 != 0)) goto LAB_00adade4;
      }
    }
    else {
      pBVar5 = BN_copy(param_2,param_3);
      if (pBVar5 != (BIGNUM *)0x0) {
LAB_00adade4:
        iVar2 = BN_lshift1(pBVar4,param_4);
        if ((((((iVar2 != 0) && (iVar2 = BN_gcd(r_01,pBVar4,param_5,param_8), iVar2 != 0)) &&
              (iVar2 = BN_is_one(r_01), iVar2 != 0)) &&
             (((pBVar5 = BN_mod_inverse(ret,param_5,pBVar4,param_8), pBVar5 != (BIGNUM *)0x0 &&
               (iVar2 = BN_mul(ret,ret,param_5,param_8), iVar2 != 0)) &&
              ((pBVar5 = BN_mod_inverse(r_01,pBVar4,param_5,param_8), pBVar5 != (BIGNUM *)0x0 &&
               ((iVar2 = BN_mul(r_01,r_01,pBVar4,param_8), iVar2 != 0 &&
                (iVar2 = BN_sub(ret,ret,r_01), iVar2 != 0)))))))) &&
            (iVar2 = BN_mul(r_02,pBVar4,param_5,param_8), iVar2 != 0)) &&
           ((iVar2 = BN_is_negative(ret), iVar2 == 0 || (iVar2 = BN_add(ret,ret,r_02), iVar2 != 0)))
           ) {
          if (param_3 != (BIGNUM *)0x0) goto LAB_00adafb4;
          while ((iVar2 = BN_priv_rand_range_ex(param_2,r_00,0,param_8), iVar2 != 0 &&
                 (iVar2 = BN_add(param_2,param_2,r), iVar2 != 0))) {
LAB_00adafb4:
            iVar2 = BN_mod_sub(param_1,ret,param_2,r_02,param_8);
            if ((iVar2 == 0) || (iVar2 = BN_add(param_1,param_1,param_2), iVar2 == 0)) break;
            iVar2 = 0;
            while (iVar3 = BN_num_bits(param_1), iVar3 <= param_6) {
              BN_GENCB_call(param_9,0,2);
              pBVar4 = BN_copy(a,param_1);
              if (((pBVar4 == (BIGNUM *)0x0) || (iVar3 = BN_sub_word(a,1), iVar3 == 0)) ||
                 (iVar3 = BN_gcd(r_01,a,param_7,param_8), iVar3 == 0)) goto LAB_00adaf50;
              iVar3 = BN_is_one(r_01);
              if (iVar3 != 0) {
                uVar6 = BN_check_prime(param_1,param_8,param_9);
                uVar1 = 7;
                if ((int)uVar6 < 1) {
                  uVar1 = (uint)(uVar6 >> 0x1e) & 2;
                }
                if (uVar1 != 0) {
                  if (uVar1 == 2) goto LAB_00adaf50;
                  if (uVar1 != 7) goto LAB_00adaf64;
                  BN_GENCB_call(param_9,3,0);
                  pBVar5 = (BIGNUM *)0x1;
                  goto LAB_00adaf54;
                }
              }
              iVar2 = iVar2 + 1;
              if (param_6 * 0x14 <= iVar2) {
                ERR_new();
                ERR_set_debug("crypto/bn/bn_rsa_fips186_4.c",0x161,
                              "ossl_bn_rsa_fips186_4_derive_prime");
                ERR_set_error(3,0x79,0);
                goto LAB_00adaf50;
              }
              iVar3 = BN_add(param_1,param_1,r_02);
              pBVar5 = (BIGNUM *)0x0;
              if (iVar3 == 0) goto LAB_00adaf54;
            }
            if (param_3 != (BIGNUM *)0x0) break;
          }
        }
      }
    }
  }
LAB_00adaf50:
  pBVar5 = (BIGNUM *)0x0;
LAB_00adaf54:
  BN_clear(a);
  BN_CTX_end(param_8);
  param_1 = pBVar5;
LAB_00adaf64:
  return (ulong)param_1 & 0xffffffff;
}

