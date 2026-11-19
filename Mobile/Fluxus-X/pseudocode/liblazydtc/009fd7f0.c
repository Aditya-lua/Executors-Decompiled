/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd7f0
 */

undefined8 BIO_meth_set_write(long param_1,undefined8 param_2)

{
  *(code **)(param_1 + 0x10) = bwrite_conv;
  *(undefined8 *)(param_1 + 0x18) = param_2;
  return 1;
}

