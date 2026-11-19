/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ac8
 */

X509_STORE * SSL_CTX_get_cert_store(SSL_CTX *param_1)

{
  return (X509_STORE *)param_1->session_cache_size;
}

