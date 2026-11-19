/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b87d8
 */

void SSL_CTX_set_default_ctlog_list_file(long param_1)

{
  CTLOG_STORE_load_default_file(*(undefined8 *)(param_1 + 0x1c8));
  return;
}

