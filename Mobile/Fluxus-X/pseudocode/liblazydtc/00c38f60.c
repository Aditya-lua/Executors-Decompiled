/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38f60
 */

BN_MONT_CTX * BN_MONT_CTX_copy(BN_MONT_CTX *to,BN_MONT_CTX *from)

{
  BN_MONT_CTX *pBVar1;
  
  pBVar1 = BN_MONT_CTX_copy(to,from);
  return pBVar1;
}

