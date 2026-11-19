/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb894
 */

POLICYINFO * d2i_POLICYINFO(POLICYINFO **a,uchar **in,long len)

{
  POLICYINFO *pPVar1;
  
  pPVar1 = (POLICYINFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ef68);
  return pPVar1;
}

