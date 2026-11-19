/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd910
 */

undefined8 BIO_meth_get_callback_ctrl(long param_1)

{
  return *(undefined8 *)(param_1 + 0x58);
}

