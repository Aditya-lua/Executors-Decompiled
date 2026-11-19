/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29e9c
 */

undefined8
ossl_ec_GF2m_simple_group_get_curve(long param_1,BIGNUM *param_2,BIGNUM *param_3,BIGNUM *param_4)

{
  BIGNUM *pBVar1;
  undefined8 uVar2;
  
  if ((((param_2 == (BIGNUM *)0x0) ||
       (pBVar1 = BN_copy(param_2,*(BIGNUM **)(param_1 + 0x40)), uVar2 = 0, pBVar1 != (BIGNUM *)0x0))
      && ((param_3 == (BIGNUM *)0x0 ||
          (pBVar1 = BN_copy(param_3,*(BIGNUM **)(param_1 + 0x60)), uVar2 = 0,
          pBVar1 != (BIGNUM *)0x0)))) &&
     ((param_4 == (BIGNUM *)0x0 ||
      (pBVar1 = BN_copy(param_4,*(BIGNUM **)(param_1 + 0x68)), uVar2 = 0, pBVar1 != (BIGNUM *)0x0)))
     ) {
    uVar2 = 1;
  }
  return uVar2;
}

