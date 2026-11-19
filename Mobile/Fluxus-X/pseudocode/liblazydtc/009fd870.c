/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd870
 */

undefined8 BIO_meth_set_read(long param_1,undefined8 param_2)

{
  *(code **)(param_1 + 0x20) = bread_conv;
  *(undefined8 *)(param_1 + 0x28) = param_2;
  return 1;
}

