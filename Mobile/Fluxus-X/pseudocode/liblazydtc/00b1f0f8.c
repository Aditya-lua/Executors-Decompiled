/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1f0f8
 */

void X509_VAL_free(X509_VAL *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c82bd8);
  return;
}

