/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7ea4
 */

void ssl_clear_hash_ctx(undefined8 *param_1)

{
  EVP_MD_CTX_free(*param_1);
  *param_1 = 0;
  return;
}

