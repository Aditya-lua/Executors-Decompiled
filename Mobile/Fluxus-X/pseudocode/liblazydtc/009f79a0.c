/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f79a0
 */

void ASN1_INTEGER_free(ASN1_STRING *a)

{
  ASN1_STRING_free(a);
  return;
}

