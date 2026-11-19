/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a40c
 */

undefined8 X509_LOOKUP_get_method_data(long param_1)

{
  return *(undefined8 *)(param_1 + 0x10);
}

