/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf6dc
 */

void OCSP_SIGNATURE_free(OCSP_SIGNATURE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c79ef8);
  return;
}

