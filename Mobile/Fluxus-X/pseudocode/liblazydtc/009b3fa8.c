/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3fa8
 */

int SSL_CTX_get_verify_mode(SSL_CTX *ctx)

{
  return *(int *)&ctx->default_verify_callback;
}

