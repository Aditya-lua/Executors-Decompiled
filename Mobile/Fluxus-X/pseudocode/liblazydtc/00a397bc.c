/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a397bc
 */

undefined8
ossl_ec_GFp_simple_group_get_curve
          (long *param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4,BN_CTX *param_5)

{
  int iVar1;
  BIGNUM *pBVar2;
  undefined8 uVar3;
  BN_CTX *c;
  
  if ((param_2 != (BIGNUM *)0x0) &&
     (pBVar2 = BN_copy(param_2,(BIGNUM *)param_1[8]), pBVar2 == (BIGNUM *)0x0)) {
    return 0;
  }
  c = (BN_CTX *)0x0;
  if (param_3 != (BIGNUM *)0x0 || param_4 != (BIGNUM *)0x0) {
    if (*(long *)(*param_1 + 0x120) == 0) {
      if (((param_3 != (BIGNUM *)0x0) &&
          (pBVar2 = BN_copy(param_3,(BIGNUM *)param_1[0xc]), pBVar2 == (BIGNUM *)0x0)) ||
         ((param_4 != (BIGNUM *)0x0 &&
          (pBVar2 = BN_copy(param_4,(BIGNUM *)param_1[0xd]), pBVar2 == (BIGNUM *)0x0)))) {
        uVar3 = 0;
        c = (BN_CTX *)0x0;
        goto LAB_00a398b4;
      }
      c = (BN_CTX *)0x0;
    }
    else {
      c = (BN_CTX *)0x0;
      if ((param_5 == (BN_CTX *)0x0) &&
         (c = (BN_CTX *)BN_CTX_new_ex(param_1[0x15]), param_5 = c, c == (BN_CTX *)0x0)) {
        return 0;
      }
      if (((param_3 != (BIGNUM *)0x0) &&
          (iVar1 = (**(code **)(*param_1 + 0x120))(param_1,param_3,param_1[0xc],param_5), iVar1 == 0
          )) || ((param_4 != (BIGNUM *)0x0 &&
                 (iVar1 = (**(code **)(*param_1 + 0x120))(param_1,param_4,param_1[0xd],param_5),
                 iVar1 == 0)))) {
        uVar3 = 0;
        goto LAB_00a398b4;
      }
    }
  }
  uVar3 = 1;
LAB_00a398b4:
  BN_CTX_free(c);
  return uVar3;
}

