/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6814
 */

undefined8 SSL_get_default_passwd_cb_userdata(long param_1)

{
  return *(undefined8 *)(param_1 + 0x1d20);
}

