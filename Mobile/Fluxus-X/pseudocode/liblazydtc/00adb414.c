/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adb414
 */

undefined8
ossl_rsa_sp800_56b_derive_params_from_pq(long param_1,int param_2,BIGNUM *param_3,BN_CTX *param_4)

{
  int iVar1;
  BIGNUM *d;
  BIGNUM *d_00;
  BIGNUM *n;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *pBVar2;
  long lVar3;
  undefined8 uVar4;
  
  BN_CTX_start(param_4);
  d = BN_CTX_get(param_4);
  d_00 = BN_CTX_get(param_4);
  n = BN_CTX_get(param_4);
  a = BN_CTX_get(param_4);
  a_00 = BN_CTX_get(param_4);
  if (a_00 == (BIGNUM *)0x0) {
LAB_00adb624:
    uVar4 = 0xffffffff;
  }
  else {
    BN_set_flags(d,4);
    BN_set_flags(d_00,4);
    BN_set_flags(n,4);
    BN_set_flags(a,4);
    BN_set_flags(a_00,4);
    iVar1 = ossl_rsa_get_lcm(param_4,*(undefined8 *)(param_1 + 0x40),*(undefined8 *)(param_1 + 0x48)
                             ,n,a_00,d,d_00,a);
    if (iVar1 != 1) goto LAB_00adb624;
    BN_free(*(BIGNUM **)(param_1 + 0x30));
    pBVar2 = BN_dup(param_3);
    *(BIGNUM **)(param_1 + 0x30) = pBVar2;
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_00adb624;
    BN_clear_free(*(BIGNUM **)(param_1 + 0x38));
    lVar3 = BN_secure_new();
    *(long *)(param_1 + 0x38) = lVar3;
    if (lVar3 == 0) goto LAB_00adb624;
    BN_set_flags(lVar3,4);
    pBVar2 = BN_mod_inverse(*(BIGNUM **)(param_1 + 0x38),param_3,n,param_4);
    if (pBVar2 == (BIGNUM *)0x0) goto LAB_00adb624;
    iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x38));
    uVar4 = 0;
    if (param_2 >> 1 < iVar1) {
      pBVar2 = *(BIGNUM **)(param_1 + 0x28);
      if (pBVar2 == (BIGNUM *)0x0) {
        pBVar2 = BN_new();
        *(BIGNUM **)(param_1 + 0x28) = pBVar2;
        if (pBVar2 == (BIGNUM *)0x0) goto LAB_00adb624;
      }
      iVar1 = BN_mul(pBVar2,*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_1 + 0x48),param_4);
      if (iVar1 != 0) {
        lVar3 = *(long *)(param_1 + 0x50);
        if (lVar3 == 0) {
          lVar3 = BN_secure_new();
          *(long *)(param_1 + 0x50) = lVar3;
          if (lVar3 == 0) goto LAB_00adb624;
        }
        BN_set_flags(lVar3,4);
        iVar1 = BN_div((BIGNUM *)0x0,*(BIGNUM **)(param_1 + 0x50),*(BIGNUM **)(param_1 + 0x38),d,
                       param_4);
        if (iVar1 != 0) {
          lVar3 = *(long *)(param_1 + 0x58);
          if (lVar3 == 0) {
            lVar3 = BN_secure_new();
            *(long *)(param_1 + 0x58) = lVar3;
            if (lVar3 == 0) goto LAB_00adb624;
          }
          BN_set_flags(lVar3,4);
          iVar1 = BN_div((BIGNUM *)0x0,*(BIGNUM **)(param_1 + 0x58),*(BIGNUM **)(param_1 + 0x38),
                         d_00,param_4);
          if (iVar1 != 0) {
            BN_free(*(BIGNUM **)(param_1 + 0x60));
            lVar3 = BN_secure_new();
            *(long *)(param_1 + 0x60) = lVar3;
            if (lVar3 != 0) {
              BN_set_flags(lVar3,4);
              pBVar2 = BN_mod_inverse(*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_1 + 0x48),
                                      *(BIGNUM **)(param_1 + 0x40),param_4);
              if (pBVar2 != (BIGNUM *)0x0) {
                uVar4 = 1;
                *(int *)(param_1 + 0xd8) = *(int *)(param_1 + 0xd8) + 1;
                goto LAB_00adb670;
              }
            }
          }
        }
      }
      goto LAB_00adb624;
    }
  }
  BN_free(*(BIGNUM **)(param_1 + 0x30));
  *(undefined8 *)(param_1 + 0x30) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x38));
  *(undefined8 *)(param_1 + 0x38) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x28));
  *(undefined8 *)(param_1 + 0x28) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x60));
  *(undefined8 *)(param_1 + 0x60) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x58));
  *(undefined8 *)(param_1 + 0x58) = 0;
  BN_free(*(BIGNUM **)(param_1 + 0x50));
  *(undefined8 *)(param_1 + 0x50) = 0;
LAB_00adb670:
  BN_clear(d);
  BN_clear(d_00);
  BN_clear(n);
  BN_clear(a);
  BN_clear(a_00);
  BN_CTX_end(param_4);
  return uVar4;
}

