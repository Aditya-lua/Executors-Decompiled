/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcbe4
 */

PKCS12_SAFEBAG *
PKCS12_SAFEBAG_create_pkcs8_encrypt_ex
          (int param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,undefined4 param_5,
          undefined4 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  char *pcVar1;
  EVP_CIPHER *pEVar2;
  EVP_CIPHER *pEVar3;
  X509_SIG *a;
  PKCS12_SAFEBAG *pPVar4;
  ASN1_OBJECT *pAVar5;
  
  ERR_set_mark();
  pcVar1 = OBJ_nid2sn(param_1);
  pEVar2 = (EVP_CIPHER *)EVP_CIPHER_fetch(param_8,pcVar1,param_9);
  pEVar3 = pEVar2;
  if (pEVar2 == (EVP_CIPHER *)0x0) {
    pcVar1 = OBJ_nid2sn(param_1);
    pEVar3 = EVP_get_cipherbyname(pcVar1);
  }
  ERR_pop_to_mark();
  if (pEVar3 != (EVP_CIPHER *)0x0) {
    param_1 = -1;
  }
  a = (X509_SIG *)
      PKCS8_encrypt_ex(param_1,pEVar3,param_2,param_3,param_4,param_5,param_6,param_7,param_8,
                       param_9);
  if (a == (X509_SIG *)0x0) {
    pPVar4 = (PKCS12_SAFEBAG *)0x0;
  }
  else {
    pPVar4 = PKCS12_SAFEBAG_new();
    if (pPVar4 == (PKCS12_SAFEBAG *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_sbag.c",0xc1,"PKCS12_SAFEBAG_create0_pkcs8");
      ERR_set_error(0x23,0xc0100,0);
      X509_SIG_free(a);
    }
    else {
      pAVar5 = OBJ_nid2obj(0x97);
      pPVar4->type = pAVar5;
      (pPVar4->value).shkeybag = a;
    }
  }
  EVP_CIPHER_free(pEVar2);
  return pPVar4;
}

