/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b140a0
 */

int X509_VERIFY_PARAM_set1_policies(X509_VERIFY_PARAM *param,stack_st_ASN1_OBJECT *policies)

{
  int iVar1;
  int iVar2;
  stack_st_ASN1_OBJECT *psVar3;
  ASN1_OBJECT *pAVar4;
  
  if (param == (X509_VERIFY_PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vpm.c",0x161,"X509_VERIFY_PARAM_set1_policies");
    ERR_set_error(0xb,0xc0102,0);
    iVar1 = 0;
  }
  else {
    OPENSSL_sk_pop_free(param->policies,ASN1_OBJECT_free);
    if (policies == (stack_st_ASN1_OBJECT *)0x0) {
      param->policies = (stack_st_ASN1_OBJECT *)0x0;
    }
    else {
      psVar3 = (stack_st_ASN1_OBJECT *)OPENSSL_sk_new_null();
      param->policies = psVar3;
      if (psVar3 == (stack_st_ASN1_OBJECT *)0x0) {
        return 0;
      }
      iVar1 = OPENSSL_sk_num(policies);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          pAVar4 = (ASN1_OBJECT *)OPENSSL_sk_value(policies,iVar1);
          pAVar4 = OBJ_dup(pAVar4);
          if (pAVar4 == (ASN1_OBJECT *)0x0) {
            return 0;
          }
          iVar2 = OPENSSL_sk_push(param->policies,pAVar4);
          if (iVar2 == 0) {
            ASN1_OBJECT_free(pAVar4);
            return 0;
          }
          iVar1 = iVar1 + 1;
          iVar2 = OPENSSL_sk_num(policies);
        } while (iVar1 < iVar2);
      }
      param->flags = param->flags | 0x80;
    }
    iVar1 = 1;
  }
  return iVar1;
}

