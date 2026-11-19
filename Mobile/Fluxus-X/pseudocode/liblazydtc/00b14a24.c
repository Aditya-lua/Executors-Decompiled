/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14a24
 */

void X509_CRL_get_version(undefined8 *param_1)

{
  ASN1_INTEGER_get((ASN1_INTEGER *)*param_1);
  return;
}

