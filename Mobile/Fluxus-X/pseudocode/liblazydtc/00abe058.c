/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe058
 */

void PKCS7_SIGNER_INFO_free(PKCS7_SIGNER_INFO *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b840);
  return;
}

