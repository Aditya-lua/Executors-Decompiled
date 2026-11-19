/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12000
 */

undefined8 * CTLOG_STORE_new_ex(undefined8 param_1,char *param_2)

{
  undefined8 *ptr;
  char *pcVar1;
  long lVar2;
  undefined8 uVar3;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x18,"crypto/ct/ct_log.c",0x69);
  if (ptr == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_log.c",0x6c,"CTLOG_STORE_new_ex");
    ERR_set_error(0x32,0xc0100,0);
    return (undefined8 *)0x0;
  }
  *ptr = param_1;
  if (param_2 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(param_2,"crypto/ct/ct_log.c",0x72);
    ptr[1] = pcVar1;
    if (pcVar1 == (char *)0x0) {
      ERR_new();
      uVar3 = 0x74;
      goto LAB_00a120cc;
    }
  }
  lVar2 = OPENSSL_sk_new_null();
  ptr[2] = lVar2;
  if (lVar2 != 0) {
    return ptr;
  }
  ERR_new();
  uVar3 = 0x7b;
LAB_00a120cc:
  ERR_set_debug("crypto/ct/ct_log.c",uVar3,"CTLOG_STORE_new_ex");
  ERR_set_error(0x32,0xc0100,0);
  CRYPTO_free((void *)ptr[1]);
  OPENSSL_sk_pop_free(ptr[2],CTLOG_free);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

