/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af1674
 */

undefined8 FUN_00af1674(long param_1)

{
  undefined8 *ptr;
  BUF_MEM *pBVar1;
  long lVar2;
  undefined8 uVar3;
  
  ptr = CRYPTO_malloc(0x18,"crypto/x509/by_dir.c",0x6e);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/by_dir.c",0x71,"new_dir");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    pBVar1 = BUF_MEM_new();
    *ptr = pBVar1;
    if (pBVar1 == (BUF_MEM *)0x0) {
      ERR_new();
      uVar3 = 0x76;
    }
    else {
      ptr[1] = 0;
      lVar2 = CRYPTO_THREAD_lock_new();
      ptr[2] = lVar2;
      if (lVar2 != 0) {
        *(undefined8 **)(param_1 + 0x10) = ptr;
        return 1;
      }
      BUF_MEM_free((BUF_MEM *)*ptr);
      ERR_new();
      uVar3 = 0x7d;
    }
    ERR_set_debug("crypto/x509/by_dir.c",uVar3,"new_dir");
    ERR_set_error(0xb,0xc0100,0);
    CRYPTO_free(ptr);
  }
  return 0;
}

