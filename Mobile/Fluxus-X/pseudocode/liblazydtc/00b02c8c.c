/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02c8c
 */

int X509_check_akid(X509 *issuer,AUTHORITY_KEYID *akid)

{
  int iVar1;
  int iVar2;
  ASN1_INTEGER *x;
  int *piVar3;
  X509_NAME *b;
  ASN1_STRING *b_00;
  GENERAL_NAMES *pGVar4;
  X509_NAME *a;
  
  if (akid != (AUTHORITY_KEYID *)0x0) {
    if (((akid->keyid != (ASN1_STRING *)0x0) &&
        (b_00 = *(ASN1_STRING **)&issuer[1].ex_data.dummy, b_00 != (ASN1_STRING *)0x0)) &&
       (iVar1 = ASN1_OCTET_STRING_cmp(akid->keyid,b_00), iVar1 != 0)) {
      return 0x1e;
    }
    if (akid->serial != (ASN1_INTEGER *)0x0) {
      x = (ASN1_INTEGER *)X509_get0_serialNumber(issuer);
      iVar1 = ASN1_INTEGER_cmp(x,akid->serial);
      if (iVar1 != 0) {
        return 0x1f;
      }
    }
    pGVar4 = akid->issuer;
    if ((pGVar4 != (GENERAL_NAMES *)0x0) && (iVar1 = OPENSSL_sk_num(pGVar4), 0 < iVar1)) {
      iVar1 = 0;
      do {
        piVar3 = (int *)OPENSSL_sk_value(pGVar4,iVar1);
        if (*piVar3 == 4) {
          a = *(X509_NAME **)(piVar3 + 2);
          if (a == (X509_NAME *)0x0) {
            return 0;
          }
          b = X509_get_issuer_name(issuer);
          iVar1 = X509_NAME_cmp(a,b);
          if (iVar1 == 0) {
            return 0;
          }
          return 0x1f;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(pGVar4);
      } while (iVar1 < iVar2);
    }
  }
  return 0;
}

