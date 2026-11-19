/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af47a0
 */

int X509V3_EXT_add_nconf_sk(CONF *conf,X509V3_CTX *ctx,char *section,stack_st_X509_EXTENSION **sk)

{
  int iVar1;
  int iVar2;
  stack_st_CONF_VALUE *psVar3;
  undefined8 *puVar4;
  X509_EXTENSION *ex;
  ASN1_OBJECT *obj;
  X509_EXTENSION *a;
  stack_st_X509_EXTENSION *psVar5;
  
  psVar3 = NCONF_get_section(conf,section);
  iVar1 = 0;
  if (psVar3 != (stack_st_CONF_VALUE *)0x0) {
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar4 = (undefined8 *)OPENSSL_sk_value(psVar3,iVar1);
        ex = (X509_EXTENSION *)FUN_00af3e8c(conf,ctx,*puVar4,puVar4[1],puVar4[2]);
        if (ex == (X509_EXTENSION *)0x0) {
          return 0;
        }
        if (sk != (stack_st_X509_EXTENSION **)0x0) {
          if (ctx->flags == 2) {
            psVar5 = *sk;
            obj = X509_EXTENSION_get_object(ex);
            iVar2 = X509v3_get_ext_by_OBJ(psVar5,obj,-1);
            if (-1 < iVar2) {
              do {
                a = X509v3_delete_ext(psVar5,iVar2);
                X509_EXTENSION_free(a);
                iVar2 = X509v3_get_ext_by_OBJ(psVar5,obj,-1);
              } while (-1 < iVar2);
            }
          }
          psVar5 = X509v3_add_ext(sk,ex,-1);
          if (psVar5 == (stack_st_X509_EXTENSION *)0x0) {
            X509_EXTENSION_free(ex);
            return 0;
          }
        }
        X509_EXTENSION_free(ex);
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(psVar3);
      } while (iVar1 < iVar2);
    }
    iVar1 = 1;
  }
  return iVar1;
}

