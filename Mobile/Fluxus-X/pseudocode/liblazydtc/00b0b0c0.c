/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0b0c0
 */

undefined8 X509_STORE_get0_objects(long param_1)

{
  return *(undefined8 *)(param_1 + 8);
}

