/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf880
 */

void OCSP_RESPID_free(OCSP_RESPID *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7a080);
  return;
}

