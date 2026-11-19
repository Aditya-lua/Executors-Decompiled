/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c644
 */

void X509_REQ_set1_signature_algo(long param_1)

{
  X509_ALGOR_copy(param_1 + 0x38);
  return;
}

