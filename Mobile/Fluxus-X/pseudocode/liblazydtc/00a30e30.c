/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30e30
 */

int EC_GROUP_get_cofactor(EC_GROUP *group,BIGNUM *cofactor,BN_CTX *ctx)

{
  int iVar1;
  uint uVar2;
  BIGNUM *pBVar3;
  
  if (*(BIGNUM **)(group + 0x18) == (BIGNUM *)0x0) {
    uVar2 = 0;
  }
  else {
    pBVar3 = BN_copy(cofactor,*(BIGNUM **)(group + 0x18));
    uVar2 = 0;
    if (pBVar3 != (BIGNUM *)0x0) {
      iVar1 = BN_is_zero(*(undefined8 *)(group + 0x18));
      uVar2 = (uint)(iVar1 == 0);
    }
  }
  return uVar2;
}

