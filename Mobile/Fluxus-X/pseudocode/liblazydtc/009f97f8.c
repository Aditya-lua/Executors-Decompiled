/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f97f8
 */

void ASYNC_cleanup_thread(void)

{
  int iVar1;
  
  iVar1 = OPENSSL_init_crypto(0x100,0);
  if (iVar1 == 0) {
    return;
  }
  FUN_009f9704(0);
  return;
}

