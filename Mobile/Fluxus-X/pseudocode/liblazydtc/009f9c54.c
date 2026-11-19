/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9c54
 */

undefined4 ASYNC_WAIT_CTX_get_status(long param_1)

{
  return *(undefined4 *)(param_1 + 0x28);
}

