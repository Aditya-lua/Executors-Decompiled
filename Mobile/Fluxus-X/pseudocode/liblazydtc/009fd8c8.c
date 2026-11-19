/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd8c8
 */

undefined8 BIO_meth_get_ctrl(long param_1)

{
  return *(undefined8 *)(param_1 + 0x40);
}

