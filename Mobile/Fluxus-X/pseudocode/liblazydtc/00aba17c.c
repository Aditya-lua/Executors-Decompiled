/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aba17c
 */

void PKCS12_MAC_DATA_free(PKCS12_MAC_DATA *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7b0c0);
  return;
}

