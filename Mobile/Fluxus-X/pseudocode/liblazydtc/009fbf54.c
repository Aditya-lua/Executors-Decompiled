/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbf54
 */

undefined8 BIO_get_data(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

