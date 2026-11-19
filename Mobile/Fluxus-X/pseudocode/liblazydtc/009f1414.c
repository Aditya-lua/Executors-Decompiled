/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f1414
 */

int ASN1_STRING_length(ASN1_STRING *x)

{
  return x->length;
}

