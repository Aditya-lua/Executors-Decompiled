/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5918
 */

void NETSCAPE_CERT_SEQUENCE_free(NETSCAPE_CERT_SEQUENCE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7aec8);
  return;
}

