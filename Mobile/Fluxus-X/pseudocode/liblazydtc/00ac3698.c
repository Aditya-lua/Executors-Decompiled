/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac3698
 */

int PKCS7_RECIP_INFO_set(PKCS7_RECIP_INFO *p7i,X509 *x509)

{
  int iVar1;
  X509_NAME *name;
  ASN1_STRING *pAVar2;
  long lVar3;
  ASN1_OBJECT *aobj;
  undefined8 uVar4;
  code *pcVar5;
  PKCS7_ISSUER_AND_SERIAL *xn;
  X509_ALGOR *alg;
  
  iVar1 = ASN1_INTEGER_set(p7i->version,0);
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
  lVar3 = X509_get0_pubkey(x509);
  if (lVar3 == 0) {
    return 0;
  }
  iVar1 = EVP_PKEY_is_a(lVar3,"RSA-PSS");
  if (iVar1 != 0) {
    return -2;
  }
  iVar1 = EVP_PKEY_is_a(lVar3,&DAT_002db996);
  if (iVar1 != 0) {
    alg = p7i->key_enc_algor;
    if (alg != (X509_ALGOR *)0x0) {
      aobj = OBJ_nid2obj(6);
      X509_ALGOR_set0(alg,aobj,5,(void *)0x0);
    }
LAB_00ac3760:
    X509_up_ref(x509);
    p7i->cert = x509;
    return 1;
  }
  if ((*(long *)(lVar3 + 8) == 0) ||
     (pcVar5 = *(code **)(*(long *)(lVar3 + 8) + 0xb0), pcVar5 == (code *)0x0)) {
    ERR_new();
    uVar4 = 0x286;
  }
  else {
    iVar1 = (*pcVar5)(lVar3,2,0,p7i);
    if (iVar1 != -2) {
      if (0 < iVar1) goto LAB_00ac3760;
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x291,"PKCS7_RECIP_INFO_set");
      uVar4 = 0x95;
      goto LAB_00ac37e0;
    }
    ERR_new();
    uVar4 = 0x28d;
  }
  ERR_set_debug("crypto/pkcs7/pk7_lib.c",uVar4,"PKCS7_RECIP_INFO_set");
  uVar4 = 0x96;
LAB_00ac37e0:
  ERR_set_error(0x21,uVar4,0);
  return 0;
}

