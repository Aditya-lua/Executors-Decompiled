/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bee60
 */

void SSL_CTX_set_stateless_cookie_generate_cb(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0xe0) = param_2;
  return;
}

