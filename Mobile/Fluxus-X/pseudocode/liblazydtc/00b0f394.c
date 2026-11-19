/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f394
 */

void X509_STORE_CTX_set_cert(X509_STORE_CTX *c,X509 *x)

{
  *(X509 **)&c->current_method = x;
  return;
}

