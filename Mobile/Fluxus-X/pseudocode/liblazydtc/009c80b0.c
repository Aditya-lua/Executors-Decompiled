/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c80b0
 */

void ssl_hmac_old_size(long param_1)

{
  HMAC_size(*(undefined8 *)(param_1 + 8));
  return;
}

