/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b6804
 */

void SSL_set_default_passwd_cb_userdata(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1d20) = param_2;
  return;
}

