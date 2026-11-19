/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cfe8
 */

undefined8 WPACKET_get_total_written(long param_1,undefined8 *param_2)

{
  if (param_2 == (undefined8 *)0x0) {
    return 0;
  }
  *param_2 = *(undefined8 *)(param_1 + 0x18);
  return 1;
}

