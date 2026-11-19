/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c5e8
 */

void X509_REQ_get_version(long param_1)

{
  ASN1_INTEGER_get(*(ASN1_INTEGER **)(param_1 + 0x18));
  return;
}

