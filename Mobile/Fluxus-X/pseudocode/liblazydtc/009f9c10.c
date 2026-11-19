/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9c10
 */

bool ASYNC_WAIT_CTX_set_callback(long param_1,undefined8 param_2,undefined8 param_3)

{
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0x18) = param_2;
    *(undefined8 *)(param_1 + 0x20) = param_3;
  }
  return param_1 != 0;
}

