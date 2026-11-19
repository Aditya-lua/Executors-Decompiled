/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe10c
 */

void PKCS7_RECIP_INFO_free(PKCS7_RECIP_INFO *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b918);
  return;
}

