/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf8bc
 */

void OCSP_REVOKEDINFO_free(OCSP_REVOKEDINFO *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7a0b8);
  return;
}

