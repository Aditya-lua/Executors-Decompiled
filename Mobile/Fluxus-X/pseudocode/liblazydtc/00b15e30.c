/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b15e30
 */

PKCS7 * d2i_PKCS7_fp(FILE *fp,PKCS7 **p7)

{
  undefined8 uVar1;
  PKCS7 *pPVar2;
  uchar *puVar3;
  long lVar4;
  
  if ((p7 == (PKCS7 **)0x0) || (pPVar2 = *p7, pPVar2 == (PKCS7 *)0x0)) {
    puVar3 = (uchar *)0x0;
    lVar4 = 0;
  }
  else {
    puVar3 = pPVar2[1].asn1;
    lVar4 = pPVar2[1].length;
  }
  uVar1 = PKCS7_it();
  pPVar2 = (PKCS7 *)ASN1_item_d2i_fp_ex(uVar1,fp,p7,puVar3,lVar4);
  if (pPVar2 != (PKCS7 *)0x0) {
    ossl_pkcs7_resolve_libctx(pPVar2);
  }
  return pPVar2;
}

