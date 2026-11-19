/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26794
 */

undefined8 ECDSA_SIG_get0_s(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

