/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca6e4
 */

void RECORD_LAYER_init(long *param_1,long param_2)

{
  *param_1 = param_2;
  *(undefined4 *)(param_2 + 0x1d08) = 1;
  SSL3_RECORD_clear(param_1 + 0xca,0x20);
  return;
}

