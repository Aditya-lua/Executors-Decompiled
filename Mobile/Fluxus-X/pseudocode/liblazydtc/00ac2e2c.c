/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2e2c
 */

int PKCS7_SIGNER_INFO_set(PKCS7_SIGNER_INFO *p7i,X509 *x509,EVP_PKEY *pkey,EVP_MD *dgst)

{
  int iVar1;
  int pkey_nid;
  X509_NAME *name;
  ASN1_STRING *pAVar2;
  ASN1_OBJECT *pAVar3;
  undefined8 uVar4;
  code *pcVar5;
  EVP_PKEY *pEVar6;
  X509_ALGOR *pXVar7;
  PKCS7_ISSUER_AND_SERIAL *xn;
  int local_34;
  
  iVar1 = ASN1_INTEGER_set(p7i->version,1);
  if (iVar1 == 0) {
    return 0;
  }
  xn = p7i->issuer_and_serial;
  name = X509_get_issuer_name(x509);
  iVar1 = X509_NAME_set(&xn->issuer,name);
  if (iVar1 == 0) {
    return 0;
  }
  ASN1_INTEGER_free(p7i->issuer_and_serial->serial);
  pAVar2 = (ASN1_STRING *)X509_get0_serialNumber(x509);
  pAVar2 = ASN1_INTEGER_dup(pAVar2);
  p7i->issuer_and_serial->serial = pAVar2;
  if (pAVar2 == (ASN1_STRING *)0x0) {
    return 0;
  }
  EVP_PKEY_up_ref(pkey);
  pXVar7 = p7i->digest_alg;
  p7i->pkey = pkey;
  iVar1 = EVP_MD_get_type(dgst);
  pAVar3 = OBJ_nid2obj(iVar1);
  X509_ALGOR_set0(pXVar7,pAVar3,5,(void *)0x0);
  iVar1 = EVP_PKEY_is_a(pkey,&DAT_002cf33a);
  if ((iVar1 != 0) || (iVar1 = EVP_PKEY_is_a(pkey,&DAT_002c74e5), iVar1 != 0)) {
    if ((p7i->digest_alg != (X509_ALGOR *)0x0) &&
       (pAVar3 = p7i->digest_alg->algorithm, pAVar3 != (ASN1_OBJECT *)0x0)) {
      pEVar6 = p7i->pkey;
      pXVar7 = p7i->digest_enc_alg;
      iVar1 = OBJ_obj2nid(pAVar3);
      if (iVar1 != 0) {
        pkey_nid = EVP_PKEY_get_id(pEVar6);
        iVar1 = OBJ_find_sigid_by_algs(&local_34,iVar1,pkey_nid);
        if (iVar1 != 0) {
          pAVar3 = OBJ_nid2obj(local_34);
          iVar1 = -1;
          goto LAB_00ac2f80;
        }
      }
    }
    return -1;
  }
  iVar1 = EVP_PKEY_is_a(pkey,&DAT_002db996);
  if (iVar1 != 0) {
    pXVar7 = p7i->digest_enc_alg;
    if (pXVar7 == (X509_ALGOR *)0x0) {
      return 1;
    }
    pAVar3 = OBJ_nid2obj(6);
    iVar1 = 5;
LAB_00ac2f80:
    X509_ALGOR_set0(pXVar7,pAVar3,iVar1,(void *)0x0);
    return 1;
  }
  if ((*(long *)&pkey->references != 0) &&
     (pcVar5 = *(code **)(*(long *)&pkey->references + 0xb0), pcVar5 != (code *)0x0)) {
    iVar1 = (*pcVar5)(pkey,1,0,p7i);
    if (0 < iVar1) {
      return 1;
    }
    if (iVar1 != -2) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x17a,"PKCS7_SIGNER_INFO_set");
      uVar4 = 0x93;
      goto LAB_00ac2ff0;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x17e,"PKCS7_SIGNER_INFO_set");
  uVar4 = 0x94;
LAB_00ac2ff0:
  ERR_set_error(0x21,uVar4,0);
  return 0;
}

