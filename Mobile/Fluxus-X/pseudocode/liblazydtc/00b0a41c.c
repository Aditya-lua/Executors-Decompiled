/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a41c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_STORE * X509_STORE_new(void)

{
  int iVar1;
  X509_STORE *obj;
  stack_st_X509_OBJECT *psVar2;
  stack_st_X509_LOOKUP *psVar3;
  X509_VERIFY_PARAM *pXVar4;
  undefined8 uVar5;
  
  obj = (X509_STORE *)CRYPTO_zalloc(0xa0,"crypto/x509/x509_lu.c",0xb6);
  if (obj == (X509_STORE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_lu.c",0xb9,"X509_STORE_new");
    ERR_set_error(0xb,0xc0100,0);
  }
  else {
    psVar2 = (stack_st_X509_OBJECT *)OPENSSL_sk_new(&LAB_00b0a5bc);
    obj->objs = psVar2;
    if (psVar2 == (stack_st_X509_OBJECT *)0x0) {
      ERR_new();
      uVar5 = 0xbd;
    }
    else {
      obj->cache = 1;
      psVar3 = (stack_st_X509_LOOKUP *)OPENSSL_sk_new_null();
      obj->get_cert_methods = psVar3;
      if (psVar3 == (stack_st_X509_LOOKUP *)0x0) {
        ERR_new();
        uVar5 = 0xc2;
      }
      else {
        pXVar4 = X509_VERIFY_PARAM_new();
        obj->param = pXVar4;
        if (pXVar4 == (X509_VERIFY_PARAM *)0x0) {
          ERR_new();
          uVar5 = 199;
        }
        else {
          iVar1 = CRYPTO_new_ex_data(4,obj,(CRYPTO_EX_DATA *)&(obj->ex_data).dummy);
          if (iVar1 == 0) {
            ERR_new();
            uVar5 = 0xcb;
          }
          else {
            psVar2 = (stack_st_X509_OBJECT *)CRYPTO_THREAD_lock_new();
            obj[1].objs = psVar2;
            if (psVar2 != (stack_st_X509_OBJECT *)0x0) {
              obj[1].cache = 1;
              return obj;
            }
            ERR_new();
            uVar5 = 0xd1;
          }
        }
      }
    }
    ERR_set_debug("crypto/x509/x509_lu.c",uVar5,"X509_STORE_new");
    ERR_set_error(0xb,0xc0100,0);
    X509_VERIFY_PARAM_free(obj->param);
    OPENSSL_sk_free(obj->objs);
    OPENSSL_sk_free(obj->get_cert_methods);
    CRYPTO_free(obj);
  }
  return (X509_STORE *)0x0;
}

