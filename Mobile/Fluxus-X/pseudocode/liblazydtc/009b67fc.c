/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b67fc
 */

void SSL_set_default_passwd_cb(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1d18) = param_2;
  return;
}

