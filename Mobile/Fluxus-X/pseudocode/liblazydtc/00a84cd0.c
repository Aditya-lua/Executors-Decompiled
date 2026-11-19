/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84cd0
 */

void OSSL_CMP_log_close(void)

{
  OSSL_trace_set_channel(0xd,0);
  return;
}

