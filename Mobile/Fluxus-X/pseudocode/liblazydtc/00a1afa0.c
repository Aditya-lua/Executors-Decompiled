/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1afa0
 */

undefined8
ossl_bn_miller_rabin_is_prime
          (BIGNUM *param_1,int param_2,BN_CTX *param_3,int *param_4,int param_5,undefined4 *param_6)

{
  bool bVar1;
  int iVar2;
  BIGNUM *r;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  BIGNUM *r_00;
  BIGNUM *r_01;
  BIGNUM *a_02;
  BIGNUM *pBVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  uint n;
  BN_MONT_CTX *mont;
  int local_88;
  uint local_84;
  
  iVar2 = BN_is_odd();
  if (iVar2 == 0) {
    return 0;
  }
  BN_CTX_start(param_3);
  r = BN_CTX_get(param_3);
  a = BN_CTX_get(param_3);
  a_00 = BN_CTX_get(param_3);
  a_01 = BN_CTX_get(param_3);
  r_00 = BN_CTX_get(param_3);
  r_01 = BN_CTX_get(param_3);
  a_02 = BN_CTX_get(param_3);
  if (((((a_02 == (BIGNUM *)0x0) || (pBVar3 = BN_copy(a,param_1), pBVar3 == (BIGNUM *)0x0)) ||
       (iVar2 = BN_sub_word(a,1), iVar2 == 0)) ||
      ((pBVar3 = BN_copy(a_00,param_1), pBVar3 == (BIGNUM *)0x0 ||
       (iVar2 = BN_sub_word(a_00,3), iVar2 == 0)))) ||
     ((iVar2 = BN_is_zero(a_00), iVar2 != 0 || (iVar2 = BN_is_negative(a_00), iVar2 != 0)))) {
    uVar5 = 0;
    mont = (BN_MONT_CTX *)0x0;
    goto LAB_00a1b0b0;
  }
  n = 0;
  do {
    n = n + 1;
    iVar2 = BN_is_bit_set(a,n);
  } while (iVar2 == 0);
  iVar2 = BN_rshift(r_00,a,n);
  if (iVar2 == 0) {
    uVar5 = 0;
    mont = (BN_MONT_CTX *)0x0;
    goto LAB_00a1b0b0;
  }
  mont = BN_MONT_CTX_new();
  if ((mont == (BN_MONT_CTX *)0x0) || (iVar2 = BN_MONT_CTX_set(mont,param_1,param_3), iVar2 == 0)) {
LAB_00a1b3c4:
    uVar5 = 0;
    goto LAB_00a1b0b0;
  }
  if (param_2 == 0) {
    iVar2 = BN_num_bits(param_1);
    param_2 = 0x80;
    if (iVar2 < 0x801) {
      param_2 = 0x40;
    }
LAB_00a1b1c0:
    local_88 = 0;
    do {
      iVar2 = BN_priv_rand_range_ex(a_02,a_00,0,param_3);
      if ((iVar2 == 0) || (iVar2 = BN_add_word(a_02,2), iVar2 == 0)) goto LAB_00a1b3c4;
      if (param_5 != 0) {
        iVar2 = BN_gcd(r,a_02,param_1,param_3);
        if (iVar2 == 0) goto LAB_00a1b3c4;
        iVar2 = BN_is_one(r);
        if (iVar2 != 0) goto LAB_00a1b218;
LAB_00a1b3d0:
        uVar5 = 1;
        *param_6 = 1;
        goto LAB_00a1b0b0;
      }
LAB_00a1b218:
      iVar2 = BN_mod_exp_mont(r_01,a_02,r_00,param_1,param_3,mont);
      if (iVar2 == 0) goto LAB_00a1b3c4;
      iVar2 = BN_is_one(r_01);
      if ((iVar2 == 0) && (iVar2 = BN_cmp(r_01,a), iVar2 != 0)) {
        pBVar3 = BN_copy(a_01,r_01);
        bVar1 = pBVar3 != (BIGNUM *)0x0;
        if (n < 2) {
LAB_00a1b33c:
          if (!bVar1) goto LAB_00a1b3c4;
          iVar2 = BN_mod_mul(r_01,a_01,a_01,param_1,param_3);
          if ((iVar2 == 0) ||
             ((iVar2 = BN_is_one(r_01), iVar2 == 0 &&
              (pBVar3 = BN_copy(a_01,r_01), pBVar3 == (BIGNUM *)0x0)))) {
            uVar5 = 0;
            goto LAB_00a1b0b0;
          }
LAB_00a1b378:
          if (param_5 == 0) {
            *param_6 = 0;
            goto LAB_00a1b194;
          }
          iVar2 = BN_sub_word(a_01,1);
          if ((iVar2 == 0) || (iVar2 = BN_gcd(r,a_01,param_1,param_3), iVar2 == 0)) {
            uVar5 = 0;
            goto LAB_00a1b0b0;
          }
          iVar2 = BN_is_one(r);
          if (iVar2 == 0) goto LAB_00a1b3d0;
          uVar4 = 2;
          goto LAB_00a1b18c;
        }
        local_84 = 1;
        while( true ) {
          if ((!bVar1) || (iVar2 = BN_mod_mul(r_01,a_01,a_01,param_1,param_3), iVar2 == 0))
          goto LAB_00a1b3c4;
          iVar2 = BN_cmp(r_01,a);
          if (iVar2 == 0) break;
          iVar2 = BN_is_one(r_01);
          if (iVar2 != 0) goto LAB_00a1b378;
          local_84 = local_84 + 1;
          pBVar3 = BN_copy(a_01,r_01);
          bVar1 = pBVar3 != (BIGNUM *)0x0;
          if (n <= local_84) goto LAB_00a1b33c;
        }
      }
      if (param_4 != (int *)0x0) {
        if (*param_4 == 2) {
          iVar2 = (**(code **)(param_4 + 4))(1,local_88,param_4);
          if (iVar2 == 0) goto LAB_00a1b3c4;
        }
        else {
          if (*param_4 != 1) goto LAB_00a1b3c4;
          if (*(code **)(param_4 + 4) != (code *)0x0) {
            (**(code **)(param_4 + 4))(1,local_88,*(undefined8 *)(param_4 + 2));
          }
        }
      }
      local_88 = local_88 + 1;
    } while (local_88 < param_2);
  }
  else if (0 < param_2) goto LAB_00a1b1c0;
  uVar4 = 3;
LAB_00a1b18c:
  *param_6 = uVar4;
LAB_00a1b194:
  uVar5 = 1;
LAB_00a1b0b0:
  BN_clear(r);
  BN_clear(a);
  BN_clear(a_00);
  BN_clear(a_01);
  BN_clear(r_00);
  BN_clear(r_01);
  BN_clear(a_02);
  BN_CTX_end(param_3);
  BN_MONT_CTX_free(mont);
  return uVar5;
}

