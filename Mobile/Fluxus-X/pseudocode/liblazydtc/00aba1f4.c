/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba1f4
 */

void PKCS12_SAFEBAG_free(PKCS12_SAFEBAG *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b130);
  return;
}

