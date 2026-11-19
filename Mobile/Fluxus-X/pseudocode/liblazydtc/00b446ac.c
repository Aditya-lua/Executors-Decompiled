/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b446ac
 */

undefined8 FUN_00b446ac(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = ossl_prov_ctx_get0_libctx(param_2);
  lVar2 = EVP_KDF_fetch(uVar1,"TLS1-PRF",0);
  uVar1 = 0;
  if (lVar2 != 0) {
    uVar1 = EVP_KDF_gettable_ctx_params();
    EVP_KDF_free(lVar2);
  }
  return uVar1;
}

