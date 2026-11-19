/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad103c
 */

int BN_BLINDING_convert_ex(BIGNUM *n,BIGNUM *r,BN_BLINDING *b,BN_CTX *param_4)

{
  int iVar1;
  BIGNUM *pBVar2;
  
  if ((*(long *)b == 0) || (*(long *)(b + 8) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_blind.c",0x8d,"BN_BLINDING_convert_ex");
    ERR_set_error(3,0x6b,0);
  }
  else {
    if (*(int *)(b + 0x28) == -1) {
      *(undefined4 *)(b + 0x28) = 0;
    }
    else {
      iVar1 = BN_BLINDING_update(b,param_4);
      if (iVar1 == 0) {
        return 0;
      }
    }
    if ((r == (BIGNUM *)0x0) || (pBVar2 = BN_copy(r,*(BIGNUM **)(b + 8)), pBVar2 != (BIGNUM *)0x0))
    {
      if (*(BN_MONT_CTX **)(b + 0x38) == (BN_MONT_CTX *)0x0) {
        iVar1 = BN_mod_mul(n,n,*(BIGNUM **)b,*(BIGNUM **)(b + 0x18),param_4);
        return iVar1;
      }
      iVar1 = BN_mod_mul_montgomery(n,n,*(BIGNUM **)b,*(BN_MONT_CTX **)(b + 0x38),param_4);
      return iVar1;
    }
  }
  return 0;
}

