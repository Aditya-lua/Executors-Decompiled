/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2a0c0
 */

undefined8 ossl_ec_GF2m_simple_point_copy(long param_1,long param_2)

{
  BIGNUM *pBVar1;
  undefined8 uVar2;
  
  pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x10),*(BIGNUM **)(param_2 + 0x10));
  uVar2 = 0;
  if (((pBVar1 != (BIGNUM *)0x0) &&
      (pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x18),*(BIGNUM **)(param_2 + 0x18)), uVar2 = 0,
      pBVar1 != (BIGNUM *)0x0)) &&
     (pBVar1 = BN_copy(*(BIGNUM **)(param_1 + 0x20),*(BIGNUM **)(param_2 + 0x20)), uVar2 = 0,
     pBVar1 != (BIGNUM *)0x0)) {
    uVar2 = 1;
    *(undefined4 *)(param_1 + 0x28) = *(undefined4 *)(param_2 + 0x28);
    *(undefined4 *)(param_1 + 8) = *(undefined4 *)(param_2 + 8);
  }
  return uVar2;
}

