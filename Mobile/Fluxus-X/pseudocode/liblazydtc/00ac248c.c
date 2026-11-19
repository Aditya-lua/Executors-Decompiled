/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac248c
 */

int PKCS7_simple_smimecap(stack_st_X509_ALGOR *sk,int nid,int arg)

{
  int iVar1;
  X509_ALGOR *a;
  ASN1_OBJECT *pAVar2;
  ASN1_TYPE *pAVar3;
  ASN1_INTEGER *a_00;
  
  a = X509_ALGOR_new();
  if (a == (X509_ALGOR *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_attr.c",0x3c,"PKCS7_simple_smimecap");
    ERR_set_error(0x21,0xc0100,0);
    return 0;
  }
  ASN1_OBJECT_free(a->algorithm);
  pAVar2 = OBJ_nid2obj(nid);
  a->algorithm = pAVar2;
  if (arg < 1) {
LAB_00ac250c:
    iVar1 = OPENSSL_sk_push(sk,a);
    if (iVar1 != 0) {
      return 1;
    }
  }
  else {
    pAVar3 = ASN1_TYPE_new();
    a->parameter = pAVar3;
    if (pAVar3 != (ASN1_TYPE *)0x0) {
      a_00 = ASN1_INTEGER_new();
      if ((a_00 == (ASN1_INTEGER *)0x0) || (iVar1 = ASN1_INTEGER_set(a_00,(long)arg), iVar1 == 0))
      goto LAB_00ac255c;
      (a->parameter->value).integer = a_00;
      a->parameter->type = 2;
      goto LAB_00ac250c;
    }
  }
  a_00 = (ASN1_STRING *)0x0;
LAB_00ac255c:
  ERR_new();
  ERR_set_debug("crypto/pkcs7/pk7_attr.c",0x54,"PKCS7_simple_smimecap");
  ERR_set_error(0x21,0xc0100,0);
  ASN1_INTEGER_free(a_00);
  X509_ALGOR_free(a);
  return 0;
}

