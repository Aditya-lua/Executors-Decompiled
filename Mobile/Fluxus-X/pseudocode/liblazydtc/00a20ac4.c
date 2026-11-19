/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20ac4
 */

undefined8 DSA_get0_pub_key(long param_1)

{
  return *(undefined8 *)(param_1 + 0x68);
}

