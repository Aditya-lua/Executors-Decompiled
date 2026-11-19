/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4390
 */

undefined8 SSL_set_async_callback_arg(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1da0) = param_2;
  return 1;
}

