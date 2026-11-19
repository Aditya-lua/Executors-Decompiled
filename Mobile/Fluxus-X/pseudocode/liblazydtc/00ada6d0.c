/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ada6d0
 */

uint ossl_rsa_sp800_56b_check_private(long param_1)

{
  int iVar1;
  uint uVar2;
  BIGNUM *b;
  BIGNUM *a;
  
  a = *(BIGNUM **)(param_1 + 0x38);
  if ((a != (BIGNUM *)0x0) && (*(long *)(param_1 + 0x28) != 0)) {
    b = BN_value_one();
    iVar1 = BN_cmp(a,b);
    if (-1 < iVar1) {
      uVar2 = BN_cmp(*(BIGNUM **)(param_1 + 0x38),*(BIGNUM **)(param_1 + 0x28));
      return uVar2 >> 0x1f;
    }
  }
  return 0;
}

