/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2020
 */

undefined8 RSA_get0_p(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

