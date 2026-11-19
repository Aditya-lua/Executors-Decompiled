/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aceebc
 */

RSA_PSS_PARAMS * d2i_RSA_PSS_PARAMS(RSA_PSS_PARAMS **a,uchar **in,long len)

{
  RSA_PSS_PARAMS *pRVar1;
  
  pRVar1 = (RSA_PSS_PARAMS *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7cf18);
  return pRVar1;
}

