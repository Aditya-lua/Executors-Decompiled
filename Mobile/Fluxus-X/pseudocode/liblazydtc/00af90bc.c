/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af90bc
 */

AUTHORITY_KEYID * d2i_AUTHORITY_KEYID(AUTHORITY_KEYID **a,uchar **in,long len)

{
  AUTHORITY_KEYID *pAVar1;
  
  pAVar1 = (AUTHORITY_KEYID *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7eaa0);
  return pAVar1;
}

