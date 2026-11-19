/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd6f0
 */

long SSL_SESSION_get0_id_context(long param_1,undefined4 *param_2)

{
  if (param_2 != (undefined4 *)0x0) {
    *param_2 = (int)*(undefined8 *)(param_1 + 0x278);
  }
  return param_1 + 0x280;
}

