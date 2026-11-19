/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb8d0
 */

POLICYQUALINFO * d2i_POLICYQUALINFO(POLICYQUALINFO **a,uchar **in,long len)

{
  POLICYQUALINFO *pPVar1;
  
  pPVar1 = (POLICYQUALINFO *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7efa0);
  return pPVar1;
}

