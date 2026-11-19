/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a29bd8
 */

undefined8 ossl_ec_GF2m_simple_group_init(long param_1)

{
  BIGNUM *pBVar1;
  undefined8 uVar2;
  
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x40) = pBVar1;
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x60) = pBVar1;
  pBVar1 = BN_new();
  *(BIGNUM **)(param_1 + 0x68) = pBVar1;
  if (((*(BIGNUM **)(param_1 + 0x40) == (BIGNUM *)0x0) || (pBVar1 == (BIGNUM *)0x0)) ||
     (*(long *)(param_1 + 0x60) == 0)) {
    BN_free(*(BIGNUM **)(param_1 + 0x40));
    BN_free(*(BIGNUM **)(param_1 + 0x60));
    BN_free(*(BIGNUM **)(param_1 + 0x68));
    uVar2 = 0;
  }
  else {
    uVar2 = 1;
  }
  return uVar2;
}

