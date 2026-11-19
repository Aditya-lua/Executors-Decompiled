/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aceee0
 */

void RSA_PSS_PARAMS_free(RSA_PSS_PARAMS *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c7cf18);
  return;
}

