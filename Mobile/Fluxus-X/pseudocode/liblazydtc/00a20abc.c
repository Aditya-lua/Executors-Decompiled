/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20abc
 */

undefined8 DSA_get0_g(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

