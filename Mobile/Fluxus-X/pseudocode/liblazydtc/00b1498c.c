/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1498c
 */

void X509_CRL_set1_nextUpdate(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  ossl_x509_set1_time(param_1 + 0x28);
  return;
}

