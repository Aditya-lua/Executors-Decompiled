/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6b770
 */

int PKCS5_v2_PBKDF2_keyivgen_ex
              (EVP_CIPHER_CTX *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6,int param_7,undefined8 param_8,
              undefined8 param_9)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  PBKDF2PARAM *a;
  char *pcVar5;
  EVP_MD *pEVar6;
  EVP_MD *pEVar7;
  ASN1_STRING *pAVar8;
  uchar *puVar9;
  ulong len;
  int local_a4;
  uchar auStack_a0 [64];
  
  lVar3 = EVP_CIPHER_CTX_get0_cipher();
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/p5_crpt2.c",0xc3,"PKCS5_v2_PBKDF2_keyivgen_ex");
    ERR_set_error(6,0x83,0);
    iVar2 = 0;
    len = 0;
    a = (PBKDF2PARAM *)0x0;
    pEVar6 = (EVP_MD *)0x0;
    goto LAB_00a6ba24;
  }
  uVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
  if (0x40 < uVar1) {
                    /* WARNING: Subroutine does not return */
    OPENSSL_die("assertion failed: keylen <= sizeof(key)","crypto/evp/p5_crpt2.c",199);
  }
  len = (ulong)uVar1;
  uVar4 = PBKDF2PARAM_it();
  a = (PBKDF2PARAM *)ASN1_TYPE_unpack_sequence(uVar4,param_4);
  if (a == (PBKDF2PARAM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/p5_crpt2.c",0xce,"PKCS5_v2_PBKDF2_keyivgen_ex");
    uVar4 = 0x72;
  }
  else {
    uVar1 = EVP_CIPHER_CTX_get_key_length(param_1);
    if (-1 < (int)uVar1) {
      len = (ulong)uVar1;
      if ((a->keylength == (ASN1_INTEGER *)0x0) ||
         (lVar3 = ASN1_INTEGER_get(a->keylength), lVar3 == (int)uVar1)) {
        if (a->prf == (X509_ALGOR *)0x0) {
          iVar2 = 0xa3;
        }
        else {
          iVar2 = OBJ_obj2nid(a->prf->algorithm);
        }
        iVar2 = EVP_PBE_find(1,iVar2,(int *)0x0,&local_a4,(undefined1 **)0x0);
        if (iVar2 != 0) {
          ERR_set_mark();
          pcVar5 = OBJ_nid2sn(local_a4);
          pEVar6 = (EVP_MD *)EVP_MD_fetch(param_8,pcVar5,param_9);
          pEVar7 = pEVar6;
          if (pEVar6 == (EVP_MD *)0x0) {
            pcVar5 = OBJ_nid2sn(local_a4);
            pEVar7 = EVP_get_digestbyname(pcVar5);
            if (pEVar7 == (EVP_MD *)0x0) {
              ERR_clear_last_mark();
              ERR_new();
              uVar4 = 0xf0;
              goto LAB_00a6b9d0;
            }
          }
          iVar2 = ERR_pop_to_mark();
          if (a->salt->type == 4) {
            pAVar8 = (a->salt->value).asn1_string;
            puVar9 = pAVar8->data;
            iVar2 = pAVar8->length;
            lVar3 = ASN1_INTEGER_get(a->iter);
            iVar2 = ossl_pkcs5_pbkdf2_hmac_ex
                              (param_2,param_3,puVar9,iVar2,lVar3,pEVar7,len,auStack_a0,param_8,
                               param_9);
            if (iVar2 != 0) {
              iVar2 = EVP_CipherInit_ex(param_1,(EVP_CIPHER *)0x0,(ENGINE *)0x0,auStack_a0,
                                        (uchar *)0x0,param_7);
              goto LAB_00a6ba24;
            }
          }
          else {
            ERR_new(iVar2);
            ERR_set_debug("crypto/evp/p5_crpt2.c",0xf6,"PKCS5_v2_PBKDF2_keyivgen_ex");
            ERR_set_error(6,0x7e,0);
          }
          iVar2 = 0;
          goto LAB_00a6ba24;
        }
        ERR_new();
        uVar4 = 0xe6;
LAB_00a6b9d0:
        ERR_set_debug("crypto/evp/p5_crpt2.c",uVar4,"PKCS5_v2_PBKDF2_keyivgen_ex");
        uVar4 = 0x7d;
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/evp/p5_crpt2.c",0xdc,"PKCS5_v2_PBKDF2_keyivgen_ex");
        uVar4 = 0x7b;
      }
      ERR_set_error(6,uVar4,0);
      iVar2 = 0;
      pEVar6 = (EVP_MD *)0x0;
      goto LAB_00a6ba24;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/p5_crpt2.c",0xd4,"PKCS5_v2_PBKDF2_keyivgen_ex");
    uVar4 = 0x82;
  }
  ERR_set_error(6,uVar4,0);
  iVar2 = 0;
  pEVar6 = (EVP_MD *)0x0;
LAB_00a6ba24:
  OPENSSL_cleanse(auStack_a0,len);
  PBKDF2PARAM_free(a);
  EVP_MD_free(pEVar6);
  return iVar2;
}

