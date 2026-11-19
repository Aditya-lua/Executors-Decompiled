/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada9e8
 */

/* WARNING: Type propagation algorithm not settling */

bool ossl_bn_rsa_fips186_4_gen_prob_primes
               (long param_1,long param_2,BIGNUM *param_3,BIGNUM *param_4,undefined8 param_5,
               BIGNUM *param_6,BIGNUM *param_7,int param_8,undefined8 param_9,BN_CTX *param_10,
               undefined8 param_11)

{
  int iVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  BIGNUM *a_02;
  undefined8 uVar6;
  
  if (param_1 == 0) {
    return false;
  }
  if (param_2 == 0) {
    return false;
  }
  BN_CTX_start(param_10);
  a = param_3;
  if (param_3 == (BIGNUM *)0x0) {
    a = BN_CTX_get(param_10);
  }
  a_00 = param_4;
  if (param_4 == (BIGNUM *)0x0) {
    a_00 = BN_CTX_get(param_10);
  }
  a_01 = param_6;
  if (param_6 == (BIGNUM *)0x0) {
    a_01 = BN_CTX_get(param_10);
  }
  a_02 = param_7;
  if (param_7 == (BIGNUM *)0x0) {
    a_02 = BN_CTX_get(param_10);
  }
  if ((((a != (BIGNUM *)0x0) && (a_00 != (BIGNUM *)0x0)) && (a_01 != (BIGNUM *)0x0)) &&
     (a_02 != (BIGNUM *)0x0)) {
    if (param_8 < 0x1000) {
      if (param_8 < 0xc00) {
        if (param_8 < 0x800) goto joined_r0x00adac0c;
        uVar6 = 0x8d;
      }
      else {
        uVar6 = 0xab;
      }
    }
    else {
      uVar6 = 0xc9;
    }
    if ((((param_6 != (BIGNUM *)0x0) ||
         (iVar3 = BN_priv_rand_ex(a_01,uVar6,0,1,0,param_10), iVar3 != 0)) &&
        ((param_7 != (BIGNUM *)0x0 ||
         (iVar3 = BN_priv_rand_ex(a_02,uVar6,0,1,0,param_10), iVar3 != 0)))) &&
       ((iVar3 = FUN_00adac80(a_01,a,param_10,param_11), iVar3 != 0 &&
        (iVar3 = FUN_00adac80(a_02,a_00,param_10), iVar3 != 0)))) {
      iVar4 = BN_num_bits(a);
      iVar5 = BN_num_bits(a_00);
      iVar3 = 0x5ee;
      if (param_8 < 0xc00) {
        iVar3 = 0x3ef;
      }
      iVar1 = 0x7ee;
      if (param_8 < 0x1000) {
        iVar1 = iVar3;
      }
      if (iVar5 + iVar4 < iVar1) {
        iVar3 = ossl_bn_rsa_fips186_4_derive_prime
                          (param_1,param_2,param_5,a,a_00,param_8,param_9,param_10,param_11);
        bVar2 = iVar3 != 0;
        goto joined_r0x00adac00;
      }
    }
  }
joined_r0x00adac0c:
  bVar2 = false;
joined_r0x00adac00:
  if (param_3 == (BIGNUM *)0x0) {
    BN_clear(a);
  }
  if (param_4 == (BIGNUM *)0x0) {
    BN_clear(a_00);
  }
  if (param_6 == (BIGNUM *)0x0) {
    BN_clear(a_01);
  }
  if (param_7 == (BIGNUM *)0x0) {
    BN_clear(a_02);
  }
  BN_CTX_end(param_10);
  return bVar2;
}

