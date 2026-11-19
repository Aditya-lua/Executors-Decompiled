/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4340
 */

void SSL_get_all_async_fds(long param_1)

{
  if (*(long *)(param_1 + 0x1d30) == 0) {
    return;
  }
  ASYNC_WAIT_CTX_get_all_fds();
  return;
}

