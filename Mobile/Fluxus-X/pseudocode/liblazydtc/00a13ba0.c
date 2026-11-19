/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13ba0
 */

undefined8 CT_POLICY_EVAL_CTX_get_time(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}

