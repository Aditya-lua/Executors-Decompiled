/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3a93c
 */

int ossl_ec_GFp_simple_invert(EC_GROUP *param_1,EC_POINT *param_2)

{
  int iVar1;
  
  iVar1 = EC_POINT_is_at_infinity(param_1,param_2);
  if ((iVar1 == 0) && (iVar1 = BN_is_zero(*(undefined8 *)(param_2 + 0x18)), iVar1 == 0)) {
    iVar1 = BN_usub(*(BIGNUM **)(param_2 + 0x18),*(BIGNUM **)(param_1 + 0x40),
                    *(BIGNUM **)(param_2 + 0x18));
    return iVar1;
  }
  return 1;
}

