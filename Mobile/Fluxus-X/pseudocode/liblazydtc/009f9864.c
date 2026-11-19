/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9864
 */

undefined8 ASYNC_get_wait_ctx(long param_1)

{
  return *(undefined8 *)(param_1 + 0x20);
}

