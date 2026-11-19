/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67ec
 */

undefined8 SSL_CTX_get_default_passwd_cb(long param_1)

{
  return *(undefined8 *)(param_1 + 0xb8);
}

