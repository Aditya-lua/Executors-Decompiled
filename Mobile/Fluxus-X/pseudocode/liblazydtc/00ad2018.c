/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2018
 */

undefined8 RSA_get0_d(long param_1)

{
  return *(undefined8 *)(param_1 + 0x38);
}

