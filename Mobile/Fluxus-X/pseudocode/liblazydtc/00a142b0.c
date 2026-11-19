/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a142b0
 */

undefined4 SCT_get_validation_status(long param_1)

{
  return *(undefined4 *)(param_1 + 0x60);
}

