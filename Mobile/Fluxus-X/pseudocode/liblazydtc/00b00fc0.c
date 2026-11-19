/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00fc0
 */

void PROXY_CERT_INFO_EXTENSION_free(PROXY_CERT_INFO_EXTENSION *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c80980);
  return;
}

