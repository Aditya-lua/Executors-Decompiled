/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccb34
 */

bool RECORD_LAYER_is_sslv2_record(long param_1)

{
  return *(int *)(param_1 + 0x650) == 2;
}

