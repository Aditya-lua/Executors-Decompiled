/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c1c
 */

int X509_PURPOSE_get_id(X509_PURPOSE *param_1)

{
  return param_1->purpose;
}

