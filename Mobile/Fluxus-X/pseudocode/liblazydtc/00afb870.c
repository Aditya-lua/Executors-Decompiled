/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb870
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

CERTIFICATEPOLICIES * CERTIFICATEPOLICIES_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7ef30);
  return (CERTIFICATEPOLICIES *)pAVar1;
}

