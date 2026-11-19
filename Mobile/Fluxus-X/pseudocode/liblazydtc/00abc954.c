/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc954
 */

PKCS12_SAFEBAG * PKCS12_SAFEBAG_create_secret(int param_1,int param_2,void *param_3,int param_4)

{
  int iVar1;
  X509_SIG *a;
  ASN1_OBJECT *pAVar2;
  ASN1_OCTET_STRING *str;
  ASN1_TYPE *a_00;
  PKCS12_SAFEBAG *pPVar3;
  undefined8 uVar4;
  
  a = (X509_SIG *)PKCS12_BAGS_new();
  if (a == (X509_SIG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_sbag.c",0x7a,"PKCS12_SAFEBAG_create_secret");
    ERR_set_error(0x23,0xc0100,0);
    return (PKCS12_SAFEBAG *)0x0;
  }
  pAVar2 = OBJ_nid2obj(param_1);
  a->algor = (X509_ALGOR *)pAVar2;
  if (param_2 == 4) {
    str = ASN1_OCTET_STRING_new();
    if (str == (ASN1_OCTET_STRING *)0x0) {
      ERR_new();
      uVar4 = 0x85;
    }
    else {
      iVar1 = ASN1_OCTET_STRING_set(str,param_3,param_4);
      if (iVar1 == 0) {
        ASN1_OCTET_STRING_free(str);
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_sbag.c",0x8b,"PKCS12_SAFEBAG_create_secret");
        uVar4 = 0x66;
        goto LAB_00abcae0;
      }
      a_00 = ASN1_TYPE_new();
      ((_union_991 *)&a->digest)->other = a_00;
      if (a_00 == (ASN1_TYPE *)0x0) {
        ASN1_OCTET_STRING_free(str);
        ERR_new();
        uVar4 = 0x91;
      }
      else {
        ASN1_TYPE_set(a_00,4,str);
        pPVar3 = PKCS12_SAFEBAG_new();
        if (pPVar3 != (PKCS12_SAFEBAG *)0x0) {
          (pPVar3->value).shkeybag = a;
          pAVar2 = OBJ_nid2obj(0x9a);
          pPVar3->type = pAVar2;
          return pPVar3;
        }
        ERR_new();
        uVar4 = 0x9e;
      }
    }
    ERR_set_debug("crypto/pkcs12/p12_sbag.c",uVar4,"PKCS12_SAFEBAG_create_secret");
    uVar4 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_sbag.c",0x99,"PKCS12_SAFEBAG_create_secret");
    uVar4 = 0x70;
  }
LAB_00abcae0:
  ERR_set_error(0x23,uVar4,0);
  PKCS12_BAGS_free((PKCS12_BAGS *)a);
  return (PKCS12_SAFEBAG *)0x0;
}

