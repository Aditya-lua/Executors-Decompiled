/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8814
 */

undefined8 SSL_CTX_get0_ctlog_store(long param_1)

{
  return *(undefined8 *)(param_1 + 0x1c8);
}

