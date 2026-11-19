/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a5c4
 */

PBKDF2PARAM * d2i_PBKDF2PARAM(PBKDF2PARAM **a,uchar **in,long len)

{
  PBKDF2PARAM *pPVar1;
  
  pPVar1 = (PBKDF2PARAM *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c5ea28);
  return pPVar1;
}

