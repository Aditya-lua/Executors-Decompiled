/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38870
 */

int BN_add(BIGNUM *r,BIGNUM *a,BIGNUM *b)

{
  int iVar1;
  
  iVar1 = BN_add(r,a,b);
  return iVar1;
}

