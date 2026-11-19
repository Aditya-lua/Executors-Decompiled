/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38ec0
 */

int BN_mod_add_quick(BIGNUM *r,BIGNUM *a,BIGNUM *b,BIGNUM *m)

{
  int iVar1;
  
  iVar1 = BN_mod_add_quick(r,a,b,m);
  return iVar1;
}

