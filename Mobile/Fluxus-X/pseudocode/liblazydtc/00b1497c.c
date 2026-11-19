/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1497c
 */

void X509_CRL_set1_lastUpdate(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  ossl_x509_set1_time(param_1 + 0x20);
  return;
}

