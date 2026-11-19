/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02df8
 */

void X509_set_proxy_flag(long param_1)

{
  int iVar1;
  
  iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x158));
  if (iVar1 == 0) {
    return;
  }
  *(uint *)(param_1 + 0xe8) = *(uint *)(param_1 + 0xe8) | 0x400;
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x158));
  return;
}

