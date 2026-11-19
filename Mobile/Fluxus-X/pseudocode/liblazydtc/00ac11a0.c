/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac11a0
 */

PKCS7_ISSUER_AND_SERIAL * PKCS7_get_issuer_and_serial(PKCS7 *p7,int idx)

{
  int iVar1;
  PKCS7_ISSUER_AND_SERIAL *pPVar2;
  long lVar3;
  ASN1_INTEGER *pAVar4;
  
  iVar1 = OBJ_obj2nid(p7->type);
  pPVar2 = (PKCS7_ISSUER_AND_SERIAL *)0x0;
  if (iVar1 == 0x18) {
    if (((p7->d).sign == (PKCS7_SIGNED *)0x0) ||
       (pAVar4 = (p7->d).sign[1].version, pAVar4 == (ASN1_INTEGER *)0x0)) {
      pPVar2 = (PKCS7_ISSUER_AND_SERIAL *)0x0;
    }
    else {
      iVar1 = OPENSSL_sk_num(pAVar4);
      pPVar2 = (PKCS7_ISSUER_AND_SERIAL *)0x0;
      if (idx < iVar1) {
        lVar3 = OPENSSL_sk_value(pAVar4,idx);
        pPVar2 = *(PKCS7_ISSUER_AND_SERIAL **)(lVar3 + 8);
      }
    }
  }
  return pPVar2;
}

