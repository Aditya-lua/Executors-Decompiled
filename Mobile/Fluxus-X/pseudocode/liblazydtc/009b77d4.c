/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b77d4
 */

bool SSL_CTX_set_default_verify_dir(long param_1)

{
  X509_LOOKUP_METHOD *m;
  X509_LOOKUP *ctx;
  X509_STORE *v;
  
  v = *(X509_STORE **)(param_1 + 0x28);
  m = X509_LOOKUP_hash_dir();
  ctx = X509_STORE_add_lookup(v,m);
  if (ctx != (X509_LOOKUP *)0x0) {
    ERR_set_mark();
    X509_LOOKUP_ctrl(ctx,2,(char *)0x0,3,(char **)0x0);
    ERR_pop_to_mark();
  }
  return ctx != (X509_LOOKUP *)0x0;
}

