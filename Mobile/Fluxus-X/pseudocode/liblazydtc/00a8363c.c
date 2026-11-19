/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8363c
 */

undefined8 ossl_crypto_free_ex_index_ex(undefined8 param_1,uint param_2,int param_3)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  undefined8 uVar4;
  
  plVar2 = (long *)ossl_lib_ctx_get_ex_data_global();
  if (plVar2 == (long *)0x0) {
    return 0;
  }
  if (0x11 < param_2) {
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
    ERR_set_error(0xf,0x80106,0);
    return 0;
  }
  if (*plVar2 == 0) {
    return 0;
  }
  iVar1 = CRYPTO_THREAD_write_lock();
  if (iVar1 == 0) {
    return 0;
  }
  if (-1 < param_3) {
    iVar1 = OPENSSL_sk_num(plVar2[(long)(int)param_2 + 1]);
    uVar4 = 0;
    if (iVar1 <= param_3) goto LAB_00a83724;
    lVar3 = OPENSSL_sk_value(plVar2[(long)(int)param_2 + 1],param_3);
    if (lVar3 != 0) {
      uVar4 = 1;
      *(undefined1 **)(lVar3 + 0x28) = &LAB_00a83734;
      *(undefined **)(lVar3 + 0x20) = &DAT_00a8373c;
      *(undefined **)(lVar3 + 0x18) = &UNK_00a83730;
      goto LAB_00a83724;
    }
  }
  uVar4 = 0;
LAB_00a83724:
  CRYPTO_THREAD_unlock(*plVar2);
  return uVar4;
}

