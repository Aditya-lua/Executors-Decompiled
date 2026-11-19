/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9824
 */

undefined8 ASYNC_get_current_job(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  iVar1 = OPENSSL_init_crypto(0x100,0);
  if (iVar1 == 0) {
    return 0;
  }
  lVar2 = CRYPTO_THREAD_get_local(&DAT_00d218e8);
  uVar3 = 0;
  if (lVar2 != 0) {
    uVar3 = *(undefined8 *)(lVar2 + 8);
  }
  return uVar3;
}

