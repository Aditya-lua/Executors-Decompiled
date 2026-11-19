/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b01c
 */

void X509_ATTRIBUTE_free(X509_ATTRIBUTE *a)

{
  ASN1_item_free((ASN1_VALUE *)a,(ASN1_ITEM *)&DAT_00c81fd0);
  return;
}

