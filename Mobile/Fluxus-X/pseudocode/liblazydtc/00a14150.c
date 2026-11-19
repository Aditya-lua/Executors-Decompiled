/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14150
 */

undefined8 SCT_get0_log_id(long param_1,undefined8 *param_2)

{
  *param_2 = *(undefined8 *)(param_1 + 0x18);
  return *(undefined8 *)(param_1 + 0x20);
}

