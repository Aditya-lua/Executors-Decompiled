/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f34c
 */

undefined8 DH_get0_q(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

