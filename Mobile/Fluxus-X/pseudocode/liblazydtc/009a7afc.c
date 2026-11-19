/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a7afc
 */

void DTLS_set_timer_cb(long param_1,undefined8 param_2)

{
  *(undefined8 *)(*(long *)(param_1 + 0x4b8) + 0x208) = param_2;
  return;
}

