/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f141c
 */

void ASN1_STRING_length_set(ASN1_STRING *x,int n)

{
  x->length = n;
  return;
}

