/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf7cc
 */

void OCSP_REQUEST_free(OCSP_REQUEST *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c79fd8);
  return;
}

