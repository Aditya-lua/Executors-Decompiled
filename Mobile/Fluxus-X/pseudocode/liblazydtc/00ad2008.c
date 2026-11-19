/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad2008
 */

undefined8 RSA_get0_n(long param_1)

{
  return *(undefined8 *)(param_1 + 0x28);
}

