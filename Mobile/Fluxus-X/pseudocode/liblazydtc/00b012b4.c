/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b012b4
 */

PKEY_USAGE_PERIOD * d2i_PKEY_USAGE_PERIOD(PKEY_USAGE_PERIOD **a,uchar **in,long len)

{
  PKEY_USAGE_PERIOD *pPVar1;
  
  pPVar1 = (PKEY_USAGE_PERIOD *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80bb0);
  return pPVar1;
}

