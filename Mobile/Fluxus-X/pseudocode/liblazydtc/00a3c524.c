/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3c524
 */

undefined8
ossl_ec_GFp_simple_get_Jprojective_coordinates_GFp
          (long *param_1,long param_2,BIGNUM *param_3,BIGNUM *param_4,BIGNUM *param_5,
          BN_CTX *param_6)

{
  int iVar1;
  BIGNUM *pBVar2;
  BN_CTX *c;
  undefined8 uVar3;
  
  if (*(long *)(*param_1 + 0x120) == 0) {
    if ((((param_3 == (BIGNUM *)0x0) ||
         (pBVar2 = BN_copy(param_3,*(BIGNUM **)(param_2 + 0x10)), pBVar2 != (BIGNUM *)0x0)) &&
        ((param_4 == (BIGNUM *)0x0 ||
         (pBVar2 = BN_copy(param_4,*(BIGNUM **)(param_2 + 0x18)), pBVar2 != (BIGNUM *)0x0)))) &&
       ((param_5 == (BIGNUM *)0x0 ||
        (pBVar2 = BN_copy(param_5,*(BIGNUM **)(param_2 + 0x20)), pBVar2 != (BIGNUM *)0x0)))) {
      c = (BN_CTX *)0x0;
      goto LAB_00a3c62c;
    }
    c = (BN_CTX *)0x0;
  }
  else {
    c = (BN_CTX *)0x0;
    if ((param_6 == (BN_CTX *)0x0) &&
       (c = (BN_CTX *)BN_CTX_new_ex(param_1[0x15]), param_6 = c, c == (BN_CTX *)0x0)) {
      return 0;
    }
    if ((((param_3 == (BIGNUM *)0x0) ||
         (iVar1 = (**(code **)(*param_1 + 0x120))
                            (param_1,param_3,*(undefined8 *)(param_2 + 0x10),param_6), iVar1 != 0))
        && ((param_4 == (BIGNUM *)0x0 ||
            (iVar1 = (**(code **)(*param_1 + 0x120))
                               (param_1,param_4,*(undefined8 *)(param_2 + 0x18),param_6), iVar1 != 0
            )))) &&
       ((param_5 == (BIGNUM *)0x0 ||
        (iVar1 = (**(code **)(*param_1 + 0x120))
                           (param_1,param_5,*(undefined8 *)(param_2 + 0x20),param_6), iVar1 != 0))))
    {
LAB_00a3c62c:
      uVar3 = 1;
      goto LAB_00a3c63c;
    }
  }
  uVar3 = 0;
LAB_00a3c63c:
  BN_CTX_free(c);
  return uVar3;
}

