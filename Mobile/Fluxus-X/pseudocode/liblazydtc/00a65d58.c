/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65d58
 */

void evp_keymgmt_util_has(long param_1,undefined4 param_2)

{
  if (*(long *)(param_1 + 0x60) == 0) {
    return;
  }
  evp_keymgmt_has(*(long *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68),param_2);
  return;
}

