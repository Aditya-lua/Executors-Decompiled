/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5409c
 */

undefined8 ERR_load_strings_const(long *param_1)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  uVar2 = ossl_err_load_ERR_strings();
  if ((int)uVar2 != 0) {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21a20);
    if (iVar1 != 0) {
      lVar3 = *param_1;
      while (lVar3 != 0) {
        OPENSSL_LH_insert(DAT_00d21a28,param_1);
        param_1 = param_1 + 2;
        lVar3 = *param_1;
      }
      CRYPTO_THREAD_unlock(DAT_00d21a20);
    }
    uVar2 = 1;
  }
  return uVar2;
}

