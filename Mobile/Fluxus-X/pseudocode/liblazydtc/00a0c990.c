/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c990
 */

undefined8 * FUN_00a0c990(undefined8 param_1,char *param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 *ptr;
  char *pcVar2;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21940,FUN_00a0ccd0);
  if (iVar1 == 0) {
    return (undefined8 *)0x0;
  }
  if (DAT_00d21944 == 0) {
    return (undefined8 *)0x0;
  }
  iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21928);
  if (iVar1 != 0) {
    if ((DAT_00d21930 != 0) || (DAT_00d21930 = OPENSSL_sk_new_null(), DAT_00d21930 != 0)) {
      ptr = (undefined8 *)CRYPTO_zalloc(0x30,"crypto/conf/conf_mod.c",0x155);
      if (ptr == (undefined8 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/conf/conf_mod.c",0x156,"module_add");
        ERR_set_error(0xe,0xc0100,0);
      }
      else {
        *ptr = param_1;
        pcVar2 = CRYPTO_strdup(param_2,"crypto/conf/conf_mod.c",0x15b);
        ptr[1] = pcVar2;
        ptr[2] = param_3;
        ptr[3] = param_4;
        if ((pcVar2 == (char *)0x0) || (iVar1 = OPENSSL_sk_push(DAT_00d21930,ptr), iVar1 == 0)) {
          CRYPTO_THREAD_unlock(DAT_00d21928);
          CRYPTO_free((void *)ptr[1]);
          CRYPTO_free(ptr);
          return (undefined8 *)0x0;
        }
      }
      CRYPTO_THREAD_unlock(DAT_00d21928);
      return ptr;
    }
    CRYPTO_THREAD_unlock(DAT_00d21928);
  }
  return (undefined8 *)0x0;
}

