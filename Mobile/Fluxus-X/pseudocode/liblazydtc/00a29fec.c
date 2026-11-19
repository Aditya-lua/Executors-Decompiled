/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29fec
 */

undefined8 ossl_ec_GF2m_simple_point_init(long param_1)

{
  BIGNUM *pBVar1;
  undefined8 uVar2;
  
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x10) = pBVar1;
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x18) = pBVar1;
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x20) = pBVar1;
  if (((*(BIGNUM **)(param_1 + 0x10) == (BIGNUM *)0x0) || (pBVar1 == (BIGNUM *)0x0)) ||
     (*(long *)(param_1 + 0x18) == 0)) {
    BN_free(*(BIGNUM **)(param_1 + 0x10));
    BN_free(*(BIGNUM **)(param_1 + 0x18));
    BN_free(*(BIGNUM **)(param_1 + 0x20));
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

