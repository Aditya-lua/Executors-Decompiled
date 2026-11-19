/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38890
 */

int BN_uadd(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  int iVar1;
  
  iVar1 = BN_uadd(r,a,b);
  return iVar1;
}

