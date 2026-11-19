/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f1434
 */

uchar * ASN1_STRING_data(ASN1_STRING *x)

{
  return x->data;
}

