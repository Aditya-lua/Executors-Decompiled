/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abbc20
 */

bool FUN_00abbc20(long param_1,char *param_2,int param_3,uchar *param_4,uint *param_5)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  EVP_MD *pEVar6;
  char *name;
  EVP_MD *digest;
  long lVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  int *piVar10;
  HMAC_CTX *ctx;
  uchar *salt;
  ASN1_OBJECT *local_170;
  X509_ALGOR *local_168;
  char acStack_160 [80];
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  uchar auStack_c8 [64];
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  
  iVar2 = OBJ_obj2nid(*(ASN1_OBJECT **)(*(long *)(param_1 + 0x10) + 0x18));
  if (iVar2 != 0x15) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_mutl.c",0x61,"pkcs12_gen_mac");
    uVar8 = 0x79;
LAB_00abbce4:
    ERR_set_error(0x23,uVar8,0);
    return false;
  }
  if (*(long *)(*(long *)(param_1 + 0x10) + 0x20) == 0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_mutl.c",0x66,"pkcs12_gen_mac");
    uVar8 = 0x65;
    goto LAB_00abbce4;
  }
  puVar9 = *(undefined8 **)(param_1 + 8);
  salt = *(uchar **)((int *)puVar9[1] + 2);
  iVar2 = *(int *)puVar9[1];
  if ((ASN1_INTEGER *)puVar9[2] == (ASN1_INTEGER *)0x0) {
    uVar5 = 1;
  }
  else {
    uVar5 = ASN1_INTEGER_get((ASN1_INTEGER *)puVar9[2]);
    puVar9 = *(undefined8 **)(param_1 + 8);
  }
  X509_SIG_get0(*puVar9,&local_168,0);
  X509_ALGOR_get0(&local_170,(int *)0x0,(void **)0x0,local_168);
  iVar3 = OBJ_obj2txt(acStack_160,0x50,local_170,0);
  if (iVar3 < 0) {
    return false;
  }
  ERR_set_mark();
  pEVar6 = (EVP_MD *)
           EVP_MD_fetch(*(undefined8 *)(*(long *)(param_1 + 0x10) + 0x28),acStack_160,
                        *(undefined8 *)(*(long *)(param_1 + 0x10) + 0x30));
  digest = pEVar6;
  if (pEVar6 == (EVP_MD *)0x0) {
    iVar3 = OBJ_obj2nid(local_170);
    name = OBJ_nid2sn(iVar3);
    digest = EVP_get_digestbyname(name);
    if (digest == (EVP_MD *)0x0) {
      ERR_clear_last_mark();
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_mutl.c",0x7d,"pkcs12_gen_mac");
      uVar8 = 0x76;
      goto LAB_00abbce4;
    }
  }
  ERR_pop_to_mark();
  iVar3 = EVP_MD_get_size(digest);
  iVar4 = EVP_MD_get_type(digest);
  if (iVar3 < 0) {
LAB_00abbf44:
    ctx = (HMAC_CTX *)0x0;
  }
  else {
    if (((iVar4 - 0x3d6U < 2) || (iVar4 == 0x329)) &&
       (lVar7 = ossl_safe_getenv("LEGACY_GOST_PKCS12"), lVar7 == 0)) {
      iVar2 = PKCS5_PBKDF2_HMAC(param_2,param_3,salt,iVar2,(int)uVar5,digest,0x60,auStack_c8);
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_mutl.c",0x8d,"pkcs12_gen_mac");
        ERR_set_error(0x23,0x6b,0);
        goto LAB_00abbf44;
      }
      uStack_108 = uStack_80;
      local_110 = local_88;
      uStack_f8 = uStack_70;
      uStack_100 = local_78;
      OPENSSL_cleanse(auStack_c8,0x60);
      iVar3 = 0x20;
    }
    else {
      iVar2 = PKCS12_key_gen_utf8_ex
                        (param_2,param_3,salt,iVar2,3,uVar5 & 0xffffffff,iVar3,&local_110,digest,
                         *(undefined8 *)(*(long *)(param_1 + 0x10) + 0x28),
                         *(undefined8 *)(*(long *)(param_1 + 0x10) + 0x30));
      if (iVar2 == 0) {
        ERR_new();
        ERR_set_debug("crypto/pkcs12/p12_mutl.c",0x9d,"pkcs12_gen_mac");
        ERR_set_error(0x23,0x6b,0);
        goto LAB_00abbf44;
      }
    }
    ctx = (HMAC_CTX *)HMAC_CTX_new();
    if (((ctx != (HMAC_CTX *)0x0) &&
        (iVar2 = HMAC_Init_ex(ctx,&local_110,iVar3,digest,(ENGINE *)0x0), iVar2 != 0)) &&
       (piVar10 = *(int **)(*(long *)(param_1 + 0x10) + 0x20),
       iVar2 = HMAC_Update(ctx,*(uchar **)(piVar10 + 2),(long)*piVar10), iVar2 != 0)) {
      iVar2 = HMAC_Final(ctx,param_4,param_5);
      bVar1 = iVar2 != 0;
      goto LAB_00abbf4c;
    }
  }
  bVar1 = false;
LAB_00abbf4c:
  OPENSSL_cleanse(&local_110,0x40);
  HMAC_CTX_free(ctx);
  EVP_MD_free(pEVar6);
  return bVar1;
}

