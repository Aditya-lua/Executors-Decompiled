/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccb44
 */

undefined8 RECORD_LAYER_get_rrec_length(long param_1)

{
  return *(undefined8 *)(param_1 + 0x658);
}

