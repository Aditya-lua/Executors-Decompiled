/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84210
 */

undefined8
ossl_crypto_alloc_ex_data_intern
          (uint param_1,undefined8 param_2,undefined8 *param_3,undefined4 param_4)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  
  plVar1 = (long *)ossl_lib_ctx_get_ex_data_global(*param_3);
  if (plVar1 == (long *)0x0) {
    return 0;
  }
  if (param_1 < 0x12) {
    if (*plVar1 == 0) {
      return 0;
    }
    uVar2 = CRYPTO_THREAD_write_lock();
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    puVar3 = (undefined8 *)OPENSSL_sk_value(plVar1[(long)(int)param_1 + 1],param_4);
    CRYPTO_THREAD_unlock(*plVar1);
    if ((code *)puVar3[3] != (code *)0x0) {
      (*(code *)puVar3[3])(param_2,0,param_3,param_4,*puVar3,puVar3[1]);
      return 1;
    }
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
    ERR_set_error(0xf,0x80106,0);
  }
  return 0;
}

