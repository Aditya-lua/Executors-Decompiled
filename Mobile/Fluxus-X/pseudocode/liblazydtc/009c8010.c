/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8010
 */

void ssl_hmac_old_free(long param_1)

{
  HMAC_CTX_free(*(undefined8 *)(param_1 + 8));
  return;
}

