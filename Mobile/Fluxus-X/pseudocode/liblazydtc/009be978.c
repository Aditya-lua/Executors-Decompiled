/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be978
 */

void SSL_SESSION_get0_alpn_selected(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  *param_2 = *(undefined8 *)(param_1 + 0x358);
  *param_3 = *(undefined8 *)(param_1 + 0x360);
  return;
}

