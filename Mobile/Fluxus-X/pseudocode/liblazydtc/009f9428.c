/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9428
 */

undefined8 async_init(void)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = CRYPTO_THREAD_init_local(&DAT_00d218e8,0);
  if ((int)uVar2 != 0) {
    iVar1 = CRYPTO_THREAD_init_local(&DAT_00d218ec,0);
    if (iVar1 != 0) {
      return 1;
    }
    CRYPTO_THREAD_cleanup_local(&DAT_00d218e8);
    uVar2 = 0;
  }
  return uVar2;
}

