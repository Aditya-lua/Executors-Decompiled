/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ace54
 */

void SSL_CTX_set0_CA_list(long param_1,undefined8 param_2)

{
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x128),X509_NAME_free);
  *(undefined8 *)(param_1 + 0x128) = param_2;
  return;
}

