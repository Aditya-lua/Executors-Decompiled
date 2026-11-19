/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb0f8
 */

PKCS7 * PKCS12_pack_p7encdata_ex
                  (int param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
                  undefined4 param_5,undefined4 param_6,undefined8 param_7,undefined8 param_8,
                  undefined8 param_9)

{
  int iVar1;
  PKCS7 *p7;
  char *pcVar2;
  EVP_CIPHER *pEVar3;
  EVP_CIPHER *pEVar4;
  char **ppcVar5;
  undefined8 uVar6;
  ASN1_OBJECT *pAVar7;
  
  p7 = (PKCS7 *)PKCS7_new_ex(param_8,param_9);
  if (p7 == (PKCS7 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x67,"PKCS12_pack_p7encdata_ex");
    ERR_set_error(0x23,0xc0100,0);
    return (PKCS7 *)0x0;
  }
  iVar1 = PKCS7_set_type(p7,0x1a);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x6b,"PKCS12_pack_p7encdata_ex");
    ERR_set_error(0x23,0x78,0);
    pEVar3 = (EVP_CIPHER *)0x0;
    goto LAB_00abb328;
  }
  ERR_set_mark();
  pcVar2 = OBJ_nid2sn(param_1);
  pEVar3 = (EVP_CIPHER *)EVP_CIPHER_fetch(param_8,pcVar2,param_9);
  if (pEVar3 == (EVP_CIPHER *)0x0) {
    pcVar2 = OBJ_nid2sn(param_1);
    pEVar4 = EVP_get_cipherbyname(pcVar2);
    ERR_pop_to_mark();
    if (pEVar4 != (EVP_CIPHER *)0x0) goto LAB_00abb218;
    ppcVar5 = (char **)PKCS5_pbe_set_ex(param_1,param_6,param_4,param_5,param_8);
    if (ppcVar5 != (char **)0x0) goto LAB_00abb240;
LAB_00abb2f8:
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x7c,"PKCS12_pack_p7encdata_ex");
    uVar6 = 0xc0100;
  }
  else {
    ERR_pop_to_mark();
    pEVar4 = pEVar3;
LAB_00abb218:
    ppcVar5 = (char **)PKCS5_pbe2_set_iv_ex(pEVar4,param_6,param_4,param_5,0,0xffffffff,param_8);
    if (ppcVar5 == (char **)0x0) goto LAB_00abb2f8;
LAB_00abb240:
    X509_ALGOR_free(((p7->d).encrypted)->enc_data->algorithm);
    (((p7->d).sign)->md_algs->stack).data = ppcVar5;
    ASN1_OCTET_STRING_free((ASN1_STRING *)((p7->d).digest)->md[1].algorithm);
    uVar6 = PKCS12_SAFEBAGS_it();
    pAVar7 = (ASN1_OBJECT *)
             PKCS12_item_i2d_encrypt_ex(ppcVar5,uVar6,param_2,param_3,param_7,1,param_8,param_9);
    ((p7->d).digest)->md[1].algorithm = pAVar7;
    if (pAVar7 != (ASN1_OBJECT *)0x0) {
      EVP_CIPHER_free(pEVar3);
      return p7;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x85,"PKCS12_pack_p7encdata_ex");
    uVar6 = 0x67;
  }
  ERR_set_error(0x23,uVar6,0);
LAB_00abb328:
  PKCS7_free(p7);
  EVP_CIPHER_free(pEVar3);
  return (PKCS7 *)0x0;
}

