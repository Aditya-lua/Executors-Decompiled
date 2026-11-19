/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7afc
 */

void SSL_CTX_set1_cert_store(long param_1,long param_2)

{
  if (param_2 != 0) {
    X509_STORE_up_ref(param_2);
  }
  X509_STORE_free(*(X509_STORE **)(param_1 + 0x28));
  *(long *)(param_1 + 0x28) = param_2;
  return;
}

