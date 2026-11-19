/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaf8f8
 */

void OCSP_CERTSTATUS_free(OCSP_CERTSTATUS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7a0f0);
  return;
}

