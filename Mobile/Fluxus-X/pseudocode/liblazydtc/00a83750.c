/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83750
 */

int ossl_crypto_get_ex_new_index_ex
              (undefined8 param_1,uint param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined4 param_8)

{
  int iVar1;
  long *plVar2;
  undefined8 *ptr;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long *plVar6;
  
  plVar2 = (long *)ossl_lib_ctx_get_ex_data_global();
  if (plVar2 == (long *)0x0) {
    return -1;
  }
  if (0x11 < param_2) {
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
    ERR_set_error(0xf,0x80106,0);
    return -1;
  }
  if (*plVar2 == 0) {
    return -1;
  }
  iVar1 = CRYPTO_THREAD_write_lock();
  if (iVar1 == 0) {
    return -1;
  }
  plVar6 = plVar2 + (long)(int)param_2 + 1;
  if (*plVar6 == 0) {
    lVar3 = OPENSSL_sk_new_null();
    *plVar6 = lVar3;
    lVar4 = 0;
    if (lVar3 != 0) {
      iVar1 = OPENSSL_sk_push(lVar3,0);
      if (iVar1 != 0) goto LAB_00a837ec;
      lVar4 = *plVar6;
    }
    OPENSSL_sk_free(lVar4);
    *plVar6 = 0;
    ERR_new();
    uVar5 = 0xa8;
LAB_00a838c8:
    ERR_set_debug("crypto/ex_data.c",uVar5,"ossl_crypto_get_ex_new_index_ex");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
LAB_00a837ec:
    ptr = CRYPTO_malloc(0x30,"crypto/ex_data.c",0xad);
    if (ptr == (undefined8 *)0x0) {
      ERR_new();
      uVar5 = 0xaf;
      goto LAB_00a838c8;
    }
    *ptr = param_3;
    ptr[1] = param_4;
    ptr[4] = param_7;
    ptr[5] = param_6;
    ptr[3] = param_5;
    *(undefined4 *)(ptr + 2) = param_8;
    iVar1 = OPENSSL_sk_push(*plVar6,0);
    if (iVar1 != 0) {
      iVar1 = OPENSSL_sk_num(*plVar6);
      iVar1 = iVar1 + -1;
      OPENSSL_sk_set(*plVar6,iVar1,ptr);
      goto LAB_00a8392c;
    }
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0xba,"ossl_crypto_get_ex_new_index_ex");
    ERR_set_error(0xf,0xc0100,0);
    CRYPTO_free(ptr);
  }
  iVar1 = -1;
LAB_00a8392c:
  CRYPTO_THREAD_unlock(*plVar2);
  return iVar1;
}

