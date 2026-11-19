/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abc194
 */

int PKCS12_setup_mac(PKCS12 *p12,int iter,uchar *salt,int saltlen,EVP_MD *md_type)

{
  int iVar1;
  PKCS12_MAC_DATA *pPVar2;
  ASN1_INTEGER *a;
  uchar *__dest;
  ASN1_OBJECT *aobj;
  undefined8 uVar3;
  ASN1_OCTET_STRING *pAVar4;
  X509_ALGOR *local_38;
  
  PKCS12_MAC_DATA_free(p12->mac);
  p12->mac = (PKCS12_MAC_DATA *)0x0;
  pPVar2 = PKCS12_MAC_DATA_new();
  p12->mac = pPVar2;
  if (pPVar2 == (PKCS12_MAC_DATA *)0x0) {
    return 0;
  }
  if (1 < iter) {
    a = ASN1_INTEGER_new();
    p12->mac->iter = a;
    if (a == (ASN1_INTEGER *)0x0) {
      ERR_new();
      uVar3 = 0xfe;
      goto LAB_00abc31c;
    }
    iVar1 = ASN1_INTEGER_set(a,(long)iter);
    if (iVar1 == 0) {
      ERR_new();
      uVar3 = 0x102;
      goto LAB_00abc31c;
    }
  }
  if (saltlen == 0) {
    saltlen = 8;
  }
  else if (saltlen < 0) {
    return 0;
  }
  __dest = CRYPTO_malloc(saltlen,"crypto/pkcs12/p12_mutl.c",0x10a);
  pAVar4 = p12->mac->salt;
  pAVar4->data = __dest;
  if (__dest == (uchar *)0x0) {
    ERR_new();
    uVar3 = 0x10b;
  }
  else {
    pAVar4->length = saltlen;
    if (salt == (uchar *)0x0) {
      iVar1 = RAND_bytes_ex(p12->authsafes[1].asn1,__dest,(long)saltlen,0);
      if (iVar1 < 1) {
        return 0;
      }
    }
    else {
      memcpy(__dest,salt,(long)saltlen);
    }
    X509_SIG_getm(p12->mac->dinfo,&local_38,0);
    iVar1 = EVP_MD_get_type(md_type);
    aobj = OBJ_nid2obj(iVar1);
    iVar1 = X509_ALGOR_set0(local_38,aobj,5,(void *)0x0);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar3 = 0x119;
  }
LAB_00abc31c:
  ERR_set_debug("crypto/pkcs12/p12_mutl.c",uVar3,"PKCS12_setup_mac");
  ERR_set_error(0x23,0xc0100,0);
  return 0;
}

