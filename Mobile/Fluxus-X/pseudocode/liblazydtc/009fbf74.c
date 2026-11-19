/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fbf74
 */

undefined4 BIO_get_shutdown(long param_1)

{
  return *(undefined4 *)(param_1 + 0x2c);
}

