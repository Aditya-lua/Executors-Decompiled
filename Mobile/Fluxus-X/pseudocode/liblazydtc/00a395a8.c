/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a395a8
 */

undefined8 ossl_ec_GFp_simple_group_copy(long param_1,long param_2)

{
  BIGNUM *pBVar1;
  undefined8 uVar2;
  
  pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x40),*(BIGNUM **)(param_2 + 0x40));
  uVar2 = 0;
  if (((pBVar1 != (BIGNUM *)0x0) &&
      (pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x60),*(BIGNUM **)(param_2 + 0x60)), uVar2 = 0,
      pBVar1 != (BIGNUM *)0x0)) &&
     (pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x68),*(BIGNUM **)(param_2 + 0x68)), uVar2 = 0,
     pBVar1 != (BIGNUM *)0x0)) {
    uVar2 = 1;
    *(undefined4 *)(param_1 + 0x70) = *(undefined4 *)(param_2 + 0x70);
  }
  return uVar2;
}

