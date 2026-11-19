/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7a60
 */

void ASN1_PRINTABLESTRING_free(ASN1_STRING *a)

{
  ASN1_STRING_free(a);
  return;
}

