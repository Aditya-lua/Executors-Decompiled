/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00f60
 */

PROXY_POLICY * d2i_PROXY_POLICY(PROXY_POLICY **a,uchar **in,long len)

{
  PROXY_POLICY *pPVar1;
  
  pPVar1 = (PROXY_POLICY *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80948);
  return pPVar1;
}

