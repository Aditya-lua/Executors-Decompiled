/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ad0
 */

void SSL_CTX_set_cert_store(SSL_CTX *param_1,X509_STORE *param_2)

{
  X509_STORE_free((X509_STORE *)param_1->session_cache_size);
  param_1->session_cache_size = (ulong)param_2;
  return;
}

