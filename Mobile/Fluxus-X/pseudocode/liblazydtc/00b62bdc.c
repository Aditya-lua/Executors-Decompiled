/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b62bdc
 */

undefined8 FUN_00b62bdc(undefined8 *param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  X509_NAME *a;
  ulong param3;
  undefined8 *puVar3;
  int local_44;
  long local_40;
  uchar *puStack_38;
  
  if (param_2 != 0) {
    if (*(int *)(param_1 + 2) != 1) {
      lVar1 = OSSL_PARAM_locate_const(param_2,"properties");
      if (lVar1 != 0) {
        puVar3 = param_1 + 6;
        CRYPTO_free((void *)*puVar3);
        *puVar3 = 0;
        uVar2 = OSSL_PARAM_get_utf8_string(lVar1,puVar3,0);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
      }
      lVar1 = OSSL_PARAM_locate_const(param_2,"input-type");
      if (lVar1 != 0) {
        puVar3 = param_1 + 5;
        CRYPTO_free((void *)*puVar3);
        *puVar3 = 0;
        uVar2 = OSSL_PARAM_get_utf8_string(lVar1,puVar3,0);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
      }
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"expect");
    if ((lVar1 != 0) && (uVar2 = OSSL_PARAM_get_int(lVar1,param_1 + 8), (int)uVar2 == 0)) {
      return uVar2;
    }
    lVar1 = OSSL_PARAM_locate_const(param_2,"subject");
    if (lVar1 != 0) {
      local_40 = 0;
      puStack_38 = (uchar *)0x0;
      if (*(int *)(param_1 + 2) == 1) {
        uVar2 = OSSL_PARAM_get_octet_string_ptr(lVar1,&puStack_38,&local_40);
        if ((int)uVar2 == 0) {
          return uVar2;
        }
        a = d2i_X509_NAME((X509_NAME **)0x0,&puStack_38,local_40);
        if (a == (X509_NAME *)0x0) {
          return 0;
        }
        uVar2 = ossl_prov_ctx_get0_libctx(*param_1);
        param3 = X509_NAME_hash_ex(a,uVar2,0,&local_44);
        BIO_snprintf((char *)((long)param_1 + 0x24),9,"%08lx",param3);
        X509_NAME_free(a);
        if (local_44 != 0) {
          return 1;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("providers/implementations/storemgmt/file_store.c",0x168,"file_set_ctx_params"
                     );
        ERR_set_error(0x39,0xde,0);
      }
      return 0;
    }
  }
  return 1;
}

