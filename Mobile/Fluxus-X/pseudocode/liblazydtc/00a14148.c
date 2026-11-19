/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14148
 */

undefined4 SCT_get_log_entry_type(long param_1)

{
  return *(undefined4 *)(param_1 + 0x58);
}

