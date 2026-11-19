/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3a994
 */

ulong ossl_ec_GFp_simple_is_on_curve(EC_GROUP *param_1,EC_POINT *param_2,BN_CTX *param_3)

{
  code *pcVar1;
  code *pcVar2;
  int iVar3;
  BIGNUM *r;
  BIGNUM *b;
  BIGNUM *pBVar4;
  BIGNUM *pBVar5;
  BN_CTX *c;
  ulong uVar6;
  BIGNUM *m;
  
  iVar3 = EC_POINT_is_at_infinity(param_1,param_2);
  if (iVar3 != 0) {
    return 1;
  }
  m = *(BIGNUM **)(param_1 + 0x40);
  pcVar1 = *(code **)(*(long *)param_1 + 0xf8);
  pcVar2 = *(code **)(*(long *)param_1 + 0x100);
  c = (BN_CTX *)0x0;
  if ((param_3 == (BN_CTX *)0x0) &&
     (param_3 = (BN_CTX *)BN_CTX_new_ex(*(undefined8 *)(param_1 + 0xa8)), c = param_3,
     param_3 == (BN_CTX *)0x0)) {
    return 0xffffffff;
  }
  BN_CTX_start(param_3);
  r = BN_CTX_get(param_3);
  b = BN_CTX_get(param_3);
  pBVar4 = BN_CTX_get(param_3);
  pBVar5 = BN_CTX_get(param_3);
  if ((pBVar5 != (BIGNUM *)0x0) &&
     (iVar3 = (*pcVar2)(param_1,r,*(undefined8 *)(param_2 + 0x10),param_3), iVar3 != 0)) {
    if (*(int *)(param_2 + 0x28) == 0) {
      iVar3 = (*pcVar2)(param_1,b,*(undefined8 *)(param_2 + 0x20),param_3);
      if (((iVar3 != 0) && (iVar3 = (*pcVar2)(param_1,pBVar4,b,param_3), iVar3 != 0)) &&
         (iVar3 = (*pcVar1)(param_1,pBVar5,pBVar4,b,param_3), iVar3 != 0)) {
        if (*(int *)(param_1 + 0x70) == 0) {
          iVar3 = (*pcVar1)(param_1,b,pBVar4,*(undefined8 *)(param_1 + 0x60),param_3);
          if ((iVar3 != 0) && (iVar3 = BN_mod_add_quick(r,r,b,m), iVar3 != 0)) {
            iVar3 = (*pcVar1)(param_1,r,r,*(undefined8 *)(param_2 + 0x10),param_3);
            goto joined_r0x00a3abf8;
          }
        }
        else {
          iVar3 = BN_mod_lshift1_quick(b,pBVar4,m);
          if (((iVar3 != 0) && (iVar3 = BN_mod_add_quick(b,b,pBVar4,m), iVar3 != 0)) &&
             (iVar3 = BN_mod_sub_quick(r,r,b,m), iVar3 != 0)) {
            iVar3 = (*pcVar1)(param_1,r,r,*(undefined8 *)(param_2 + 0x10),param_3);
joined_r0x00a3abf8:
            if ((iVar3 != 0) &&
               (iVar3 = (*pcVar1)(param_1,b,*(undefined8 *)(param_1 + 0x68),pBVar5,param_3),
               iVar3 != 0)) {
              pBVar4 = b;
              goto LAB_00a3aa94;
            }
          }
        }
      }
    }
    else {
      iVar3 = BN_mod_add_quick(r,r,*(BIGNUM **)(param_1 + 0x60),m);
      if ((iVar3 != 0) &&
         (iVar3 = (*pcVar1)(param_1,r,r,*(undefined8 *)(param_2 + 0x10),param_3), iVar3 != 0)) {
        pBVar4 = *(BIGNUM **)(param_1 + 0x68);
LAB_00a3aa94:
        iVar3 = BN_mod_add_quick(r,r,pBVar4,m);
        if ((iVar3 != 0) &&
           (iVar3 = (*pcVar2)(param_1,b,*(undefined8 *)(param_2 + 0x18),param_3), iVar3 != 0)) {
          iVar3 = BN_ucmp(b,r);
          uVar6 = (ulong)(iVar3 == 0);
          goto LAB_00a3ac2c;
        }
      }
    }
  }
  uVar6 = 0xffffffff;
LAB_00a3ac2c:
  BN_CTX_end(param_3);
  BN_CTX_free(c);
  return uVar6;
}

