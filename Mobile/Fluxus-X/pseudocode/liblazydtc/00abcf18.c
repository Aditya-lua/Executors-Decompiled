/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcf18
 */

undefined8 PKCS12_SAFEBAG_get0_attrs(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

