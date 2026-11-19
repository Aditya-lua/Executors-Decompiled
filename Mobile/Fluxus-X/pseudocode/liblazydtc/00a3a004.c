/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3a004
 */

uint ossl_ec_GFp_simple_add
               (EC_GROUP *param_1,EC_POINT *param_2,EC_POINT *param_3,EC_POINT *param_4,
               BN_CTX *param_5)

{
  code *pcVar1;
  code *pcVar2;
  int iVar3;
  uint uVar4;
  BIGNUM *a;
  BIGNUM *a_00;
  BIGNUM *a_01;
  BIGNUM *a_02;
  BIGNUM *a_03;
  BIGNUM *r;
  BIGNUM *r_00;
  BIGNUM *pBVar5;
  BN_CTX *c;
  BIGNUM *m;
  
  if (param_3 == param_4) {
    uVar4 = EC_POINT_dbl(param_1,param_2,param_3,param_5);
    return uVar4;
  }
  iVar3 = EC_POINT_is_at_infinity(param_1,param_3);
  if (iVar3 != 0) {
    param_3 = param_4;
LAB_00a3a0a4:
    uVar4 = EC_POINT_copy(param_2,param_3);
    return uVar4;
  }
  iVar3 = EC_POINT_is_at_infinity(param_1,param_4);
  if (iVar3 != 0) goto LAB_00a3a0a4;
  m = *(BIGNUM **)(param_1 + 0x40);
  pcVar1 = *(code **)(*(long *)param_1 + 0xf8);
  pcVar2 = *(code **)(*(long *)param_1 + 0x100);
  c = (BN_CTX *)0x0;
  if (param_5 == (BN_CTX *)0x0) {
    param_5 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8));
    c = param_5;
    if (param_5 == (BN_CTX *)0x0) {
      return 0;
    }
  }
  BN_CTX_start(param_5);
  a = BN_CTX_get(param_5);
  a_00 = BN_CTX_get(param_5);
  a_01 = BN_CTX_get(param_5);
  a_02 = BN_CTX_get(param_5);
  a_03 = BN_CTX_get(param_5);
  r = BN_CTX_get(param_5);
  r_00 = BN_CTX_get(param_5);
  if (r_00 != (BIGNUM *)0x0) {
    if (*(int *)(param_4 + 0x28) == 0) {
      iVar3 = (*pcVar2)(param_1,a,*(undefined8 *)(param_4 + 0x20),param_5);
      if ((((iVar3 != 0) &&
           (iVar3 = (*pcVar1)(param_1,a_00,*(undefined8 *)(param_3 + 0x10),a,param_5), iVar3 != 0))
          && (iVar3 = (*pcVar1)(param_1,a,a,*(undefined8 *)(param_4 + 0x20),param_5), iVar3 != 0))
         && (iVar3 = (*pcVar1)(param_1,a_01,*(undefined8 *)(param_3 + 0x18),a,param_5), iVar3 != 0))
      goto LAB_00a3a178;
    }
    else {
      pBVar5 = BN_copy(a_00,*(BIGNUM **)(param_3 + 0x10));
      if ((pBVar5 != (BIGNUM *)0x0) &&
         (pBVar5 = BN_copy(a_01,*(BIGNUM **)(param_3 + 0x18)), pBVar5 != (BIGNUM *)0x0)) {
LAB_00a3a178:
        if (*(int *)(param_3 + 0x28) == 0) {
          iVar3 = (*pcVar2)(param_1,a,*(undefined8 *)(param_3 + 0x20),param_5);
          if (((iVar3 != 0) &&
              (iVar3 = (*pcVar1)(param_1,a_02,*(undefined8 *)(param_4 + 0x10),a,param_5), iVar3 != 0
              )) && ((iVar3 = (*pcVar1)(param_1,a,a,*(undefined8 *)(param_3 + 0x20),param_5),
                     iVar3 != 0 &&
                     (iVar3 = (*pcVar1)(param_1,a_03,*(undefined8 *)(param_4 + 0x18),a,param_5),
                     iVar3 != 0)))) goto LAB_00a3a1a0;
        }
        else {
          pBVar5 = BN_copy(a_02,*(BIGNUM **)(param_4 + 0x10));
          if ((pBVar5 != (BIGNUM *)0x0) &&
             (pBVar5 = BN_copy(a_03,*(BIGNUM **)(param_4 + 0x18)), pBVar5 != (BIGNUM *)0x0)) {
LAB_00a3a1a0:
            iVar3 = BN_mod_sub_quick(r,a_00,a_02,m);
            if ((iVar3 != 0) && (iVar3 = BN_mod_sub_quick(r_00,a_01,a_03,m), iVar3 != 0)) {
              iVar3 = BN_is_zero(r);
              if (iVar3 != 0) {
                iVar3 = BN_is_zero(r_00);
                if (iVar3 == 0) {
                  BN_zero_ex(*(undefined8 *)(param_2 + 0x20));
                  *(undefined4 *)(param_2 + 0x28) = 0;
                  uVar4 = 1;
                }
                else {
                  BN_CTX_end(param_5);
                  uVar4 = EC_POINT_dbl(param_1,param_2,param_3,param_5);
                  param_5 = (BN_CTX *)0x0;
                }
                goto LAB_00a3a508;
              }
              iVar3 = BN_mod_add_quick(a_00,a_00,a_02,m);
              if ((iVar3 == 0) || (iVar3 = BN_mod_add_quick(a_01,a_01,a_03,m), iVar3 == 0))
              goto LAB_00a3a504;
              if (*(int *)(param_3 + 0x28) == 0) {
                pBVar5 = *(BIGNUM **)(param_3 + 0x20);
                if (*(int *)(param_4 + 0x28) != 0) goto LAB_00a3a384;
                iVar3 = (*pcVar1)(param_1,a,pBVar5,*(undefined8 *)(param_4 + 0x20),param_5);
                if (iVar3 == 0) goto LAB_00a3a504;
LAB_00a3a3b0:
                iVar3 = (*pcVar1)(param_1,*(undefined8 *)(param_2 + 0x20),a,r,param_5);
                if (iVar3 == 0) goto LAB_00a3a504;
              }
              else {
                if (*(int *)(param_4 + 0x28) == 0) {
                  pBVar5 = *(BIGNUM **)(param_4 + 0x20);
LAB_00a3a384:
                  pBVar5 = BN_copy(a,pBVar5);
                  if (pBVar5 == (BIGNUM *)0x0) goto LAB_00a3a504;
                  goto LAB_00a3a3b0;
                }
                pBVar5 = BN_copy(*(BIGNUM **)(param_2 + 0x20),r);
                if (pBVar5 == (BIGNUM *)0x0) goto LAB_00a3a504;
              }
              *(undefined4 *)(param_2 + 0x28) = 0;
              iVar3 = (*pcVar2)(param_1,a,r_00,param_5);
              if (((((iVar3 != 0) && (iVar3 = (*pcVar2)(param_1,a_03,r,param_5), iVar3 != 0)) &&
                   (iVar3 = (*pcVar1)(param_1,a_02,a_00,a_03,param_5), iVar3 != 0)) &&
                  ((((iVar3 = BN_mod_sub_quick(*(BIGNUM **)(param_2 + 0x10),a,a_02,m), iVar3 != 0 &&
                     (iVar3 = BN_mod_lshift1_quick(a,*(BIGNUM **)(param_2 + 0x10),m), iVar3 != 0))
                    && ((iVar3 = BN_mod_sub_quick(a,a_02,a,m), iVar3 != 0 &&
                        ((iVar3 = (*pcVar1)(param_1,a,a,r_00,param_5), iVar3 != 0 &&
                         (iVar3 = (*pcVar1)(param_1,r,a_03,r,param_5), iVar3 != 0)))))) &&
                   (iVar3 = (*pcVar1)(param_1,a_00,a_01,r,param_5), iVar3 != 0)))) &&
                 ((iVar3 = BN_mod_sub_quick(a,a,a_00,m), iVar3 != 0 &&
                  ((iVar3 = BN_is_odd(a), iVar3 == 0 || (iVar3 = BN_add(a,a,m), iVar3 != 0)))))) {
                iVar3 = BN_rshift1(*(BIGNUM **)(param_2 + 0x18),a);
                uVar4 = (uint)(iVar3 != 0);
                goto LAB_00a3a508;
              }
            }
          }
        }
      }
    }
  }
LAB_00a3a504:
  uVar4 = 0;
LAB_00a3a508:
  BN_CTX_end(param_5);
  BN_CTX_free(c);
  return uVar4;
}

