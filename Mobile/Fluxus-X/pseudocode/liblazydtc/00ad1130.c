/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1130
 */

int BN_BLINDING_invert(BIGNUM *n,BN_BLINDING *b,BN_CTX *ctx)

{
  int iVar1;
  
  iVar1 = BN_BLINDING_invert_ex(n,(BIGNUM *)0x0,b,ctx);
  return iVar1;
}

