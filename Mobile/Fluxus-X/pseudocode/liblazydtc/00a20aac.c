/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20aac
 */

undefined8 DSA_get0_p(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

