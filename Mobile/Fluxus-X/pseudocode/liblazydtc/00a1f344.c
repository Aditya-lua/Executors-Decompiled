/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f344
 */

undefined8 DH_get0_p(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

