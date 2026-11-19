/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccf88
 */

void SSL3_RECORD_set_seq_num(long param_1,undefined8 *param_2)

{
  *(undefined8 *)(param_1 + 0x48) = *param_2;
  return;
}

