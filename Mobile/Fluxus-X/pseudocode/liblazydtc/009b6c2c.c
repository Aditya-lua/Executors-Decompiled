/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6c2c
 */

undefined8 SSL_CTX_get_ssl_method(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

