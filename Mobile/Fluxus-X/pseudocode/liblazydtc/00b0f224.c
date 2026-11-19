/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0f224
 */

bool FUN_00b0f224(X509_CRL *param_1,X509_CRL *param_2,int param_3)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  X509_EXTENSION *pXVar4;
  ASN1_OCTET_STRING *a;
  ASN1_OCTET_STRING *b;
  
  iVar2 = X509_CRL_get_ext_by_NID(param_1,param_3,-1);
  if (iVar2 < 0) {
    a = (ASN1_STRING *)0x0;
  }
  else {
    iVar3 = X509_CRL_get_ext_by_NID(param_1,param_3,iVar2);
    if (iVar3 != -1) {
      return false;
    }
    pXVar4 = X509_CRL_get_ext(param_1,iVar2);
    a = X509_EXTENSION_get_data(pXVar4);
  }
  iVar2 = X509_CRL_get_ext_by_NID(param_2,param_3,-1);
  if (iVar2 < 0) {
    b = (ASN1_STRING *)0x0;
    if (a == (ASN1_STRING *)0x0) {
      return true;
    }
  }
  else {
    iVar3 = X509_CRL_get_ext_by_NID(param_2,param_3,iVar2);
    if (iVar3 != -1) {
      return false;
    }
    pXVar4 = X509_CRL_get_ext(param_2,iVar2);
    b = X509_EXTENSION_get_data(pXVar4);
    if (a == (ASN1_STRING *)0x0 && b == (ASN1_OCTET_STRING *)0x0) {
      return true;
    }
  }
  if (a == (ASN1_STRING *)0x0) {
    bVar1 = false;
  }
  else {
    bVar1 = false;
    if (b != (ASN1_STRING *)0x0) {
      iVar2 = ASN1_OCTET_STRING_cmp(a,b);
      bVar1 = iVar2 == 0;
    }
  }
  return bVar1;
}

