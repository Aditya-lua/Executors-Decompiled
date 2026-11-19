/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c36970
 */

BIGNUM * BN_bin2bn(uchar *s,int len,BIGNUM *ret)

{
  BIGNUM *pBVar1;
  
  pBVar1 = BN_bin2bn(s,len,ret);
  return pBVar1;
}

