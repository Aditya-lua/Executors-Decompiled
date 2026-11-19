/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ace20
 */

void SSL_set0_CA_list(long param_1,undefined8 param_2)

{
  OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x9d0),X509_NAME_free);
  *(undefined8 *)(param_1 + 0x9d0) = param_2;
  return;
}

