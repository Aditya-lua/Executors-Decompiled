/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b091e0
 */

ASN1_INTEGER * X509_get_serialNumber(X509 *x)

{
  return (ASN1_INTEGER *)&x->sig_alg;
}

