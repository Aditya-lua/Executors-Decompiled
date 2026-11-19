/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad21c
 */

void FUN_00aad21c(void)

{
  long lVar1;
  uint uVar2;
  
  DAT_00d22178 = 0;
  DAT_00d22168 = CRYPTO_THREAD_lock_new();
  if (DAT_00d22168 == 0) {
    lVar1 = 0;
  }
  else {
    DAT_00d22178 = OPENSSL_LH_new(FUN_00aada20,&LAB_00aada84);
    lVar1 = DAT_00d22168;
  }
  if (DAT_00d22178 == 0) {
    CRYPTO_THREAD_lock_free(lVar1);
    uVar2 = 0;
    DAT_00d22168 = 0;
  }
  else {
    uVar2 = (uint)(lVar1 != 0);
  }
  DAT_00d22164 = uVar2 & DAT_00d22178 != 0;
  return;
}

