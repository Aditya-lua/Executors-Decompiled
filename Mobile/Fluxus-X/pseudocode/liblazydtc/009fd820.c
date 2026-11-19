/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd820
 */

undefined8 BIO_meth_get_read_ex(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}

