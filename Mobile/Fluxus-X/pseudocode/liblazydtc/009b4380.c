/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4380
 */

undefined8 SSL_set_async_callback(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1d98) = param_2;
  return 1;
}

