/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1ada0
 */

int BN_generate_prime_ex(BIGNUM *ret,int bits,int safe,BIGNUM *add,BIGNUM *rem,BN_GENCB *cb)

{
  int iVar1;
  BN_CTX *c;
  
  c = BN_CTX_new();
  iVar1 = 0;
  if (c != (BN_CTX *)0x0) {
    iVar1 = BN_generate_prime_ex2(ret,bits,safe,add,rem,cb,c);
    BN_CTX_free(c);
  }
  return iVar1;
}

