/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f364
 */

undefined8 DH_get0_pub_key(long param_1)

{
  return *(undefined8 *)(param_1 + 0x70);
}

