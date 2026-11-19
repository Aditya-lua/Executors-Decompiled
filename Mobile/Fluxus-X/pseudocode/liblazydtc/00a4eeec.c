/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4eeec
 */

undefined8 OSSL_DECODER_get0_description(long param_1)

{
  return *(undefined8 *)(*(long *)(param_1 + 0x18) + 0x18);
}

