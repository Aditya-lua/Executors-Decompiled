/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb858
 */

CERTIFICATEPOLICIES * d2i_CERTIFICATEPOLICIES(CERTIFICATEPOLICIES **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ef30);
  return (CERTIFICATEPOLICIES *)pAVar1;
}

