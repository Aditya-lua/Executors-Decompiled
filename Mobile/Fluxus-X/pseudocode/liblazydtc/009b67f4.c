/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67f4
 */

undefined8 SSL_CTX_get_default_passwd_cb_userdata(long param_1)

{
  return *(undefined8 *)(param_1 + 0xc0);
}

