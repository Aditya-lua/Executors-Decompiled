/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2b28
 */

int PKCS7_add_signer(PKCS7 *p7,PKCS7_SIGNER_INFO *p7i)

{
  PKCS7 *pPVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  X509_ALGOR *a;
  ASN1_TYPE *pAVar5;
  undefined8 uVar6;
  uchar *puVar7;
  uchar *puVar8;
  ASN1_OBJECT *pAVar9;
  
  iVar2 = OBJ_obj2nid(p7->type);
  if ((iVar2 == 0x18) || (iVar2 == 0x16)) {
    puVar8 = ((p7->d).data)->data;
    puVar7 = (p7->d).data[1].data;
    pAVar9 = p7i->digest_alg->algorithm;
    iVar2 = OPENSSL_sk_num(puVar8);
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        puVar4 = (undefined8 *)OPENSSL_sk_value(puVar8,iVar2);
        iVar3 = OBJ_cmp(pAVar9,(ASN1_OBJECT *)*puVar4);
        if (iVar3 == 0) goto LAB_00ac2c78;
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(puVar8);
      } while (iVar2 < iVar3);
    }
    a = X509_ALGOR_new();
    if (a != (X509_ALGOR *)0x0) {
      pAVar5 = ASN1_TYPE_new();
      a->parameter = pAVar5;
      if (pAVar5 != (ASN1_TYPE *)0x0) {
        iVar2 = OBJ_obj2nid(pAVar9);
        if (iVar2 == 0) {
          pAVar9 = OBJ_dup(pAVar9);
        }
        else {
          pAVar9 = OBJ_nid2obj(iVar2);
        }
        a->algorithm = pAVar9;
        a->parameter->type = 5;
        if ((pAVar9 == (ASN1_OBJECT *)0x0) || (iVar2 = OPENSSL_sk_push(puVar8,a), iVar2 == 0)) {
          X509_ALGOR_free(a);
          return 0;
        }
LAB_00ac2c78:
        pPVar1 = (PKCS7 *)0x0;
        if (p7 != (PKCS7 *)0x0) {
          pPVar1 = p7 + 1;
        }
        p7i[1].version = (ASN1_INTEGER *)pPVar1;
        iVar2 = OPENSSL_sk_push(puVar7,p7i);
        return (uint)(iVar2 != 0);
      }
    }
    X509_ALGOR_free(a);
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_lib.c",0xe3,"PKCS7_add_signer");
    uVar6 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_lib.c",0xcf,"PKCS7_add_signer");
    uVar6 = 0x71;
  }
  ERR_set_error(0x21,uVar6,0);
  return 0;
}

