/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f98b0
 */

void ASYNC_unblock_pause(void)

{
  int iVar1;
  long lVar2;
  
  iVar1 = OPENSSL_init_crypto(0x100,0);
  if ((((iVar1 != 0) && (lVar2 = CRYPTO_THREAD_get_local(&DAT_00d218e8), lVar2 != 0)) &&
      (*(long *)(lVar2 + 8) != 0)) && (*(int *)(lVar2 + 0x10) != 0)) {
    *(int *)(lVar2 + 0x10) = *(int *)(lVar2 + 0x10) + -1;
  }
  return;
}

