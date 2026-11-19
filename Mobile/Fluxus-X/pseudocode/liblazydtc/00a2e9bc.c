/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e9bc
 */

undefined8 EC_KEY_get0_engine(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

