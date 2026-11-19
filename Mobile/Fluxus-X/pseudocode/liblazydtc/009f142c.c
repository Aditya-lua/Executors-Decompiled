/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f142c
 */

undefined8 ASN1_STRING_get0_data(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

