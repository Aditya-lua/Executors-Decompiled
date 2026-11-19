/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b87e8
 */

void SSL_CTX_set0_ctlog_store(long param_1,undefined8 param_2)

{
  CTLOG_STORE_free(*(undefined8 *)(param_1 + 0x1c8));
  *(undefined8 *)(param_1 + 0x1c8) = param_2;
  return;
}

