/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a5f4
 */

X509_ALGOR *
PKCS5_pbe2_set_iv_ex
          (EVP_CIPHER *param_1,undefined4 param_2,undefined8 param_3,undefined4 param_4,
          void *param_5,int param_6,undefined8 param_7)

{
  int n;
  int iVar1;
  undefined4 uVar2;
  ASN1_VALUE *val;
  ASN1_OBJECT *pAVar3;
  ASN1_TYPE *pAVar4;
  EVP_CIPHER_CTX *ctx;
  long lVar5;
  X509_ALGOR *a;
  undefined8 *puVar6;
  uchar auStack_70 [16];
  int local_54;
  
  local_54 = param_6;
  n = EVP_CIPHER_get_type();
  if (n == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_pbev2.c",0x37,"PKCS5_pbe2_set_iv_ex");
    ERR_set_error(0xd,0x6c,0);
    a = (X509_ALGOR *)0x0;
    ctx = (EVP_CIPHER_CTX *)0x0;
    val = (ASN1_VALUE *)0x0;
    goto LAB_00a6a864;
  }
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c5e9f0);
  if (val == (ASN1_VALUE *)0x0) {
LAB_00a6a82c:
    a = (X509_ALGOR *)0x0;
LAB_00a6a830:
    ERR_new();
    ERR_set_debug("crypto/asn1/p5_pbev2.c",0x89,"PKCS5_pbe2_set_iv_ex");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    puVar6 = *(undefined8 **)(val + 8);
    pAVar3 = OBJ_nid2obj(n);
    *puVar6 = pAVar3;
    pAVar4 = ASN1_TYPE_new();
    puVar6[1] = pAVar4;
    if (pAVar4 == (ASN1_TYPE *)0x0) goto LAB_00a6a82c;
    iVar1 = EVP_CIPHER_get_iv_length(param_1);
    if (iVar1 < 1) {
LAB_00a6a6f0:
      ctx = EVP_CIPHER_CTX_new();
joined_r0x00a6a694:
      if (ctx == (EVP_CIPHER_CTX *)0x0) goto LAB_00a6a82c;
      iVar1 = EVP_CipherInit_ex(ctx,param_1,(ENGINE *)0x0,(uchar *)0x0,auStack_70,0);
      if (iVar1 == 0) {
LAB_00a6a7b0:
        a = (X509_ALGOR *)0x0;
        goto LAB_00a6a864;
      }
      iVar1 = EVP_CIPHER_param_to_asn1(ctx,(ASN1_TYPE *)puVar6[1]);
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("crypto/asn1/p5_pbev2.c",0x55,"PKCS5_pbe2_set_iv_ex");
        ERR_set_error(0xd,0x72,0);
        goto LAB_00a6a7b0;
      }
      ERR_set_mark();
      if ((local_54 == -1) && (iVar1 = EVP_CIPHER_CTX_ctrl(ctx,7,0,&local_54), iVar1 < 1)) {
        local_54 = 799;
      }
      ERR_pop_to_mark();
      EVP_CIPHER_CTX_free(ctx);
      if (n == 0x25) {
        uVar2 = EVP_CIPHER_get_key_length(param_1);
      }
      else {
        uVar2 = 0xffffffff;
      }
      X509_ALGOR_free(*(X509_ALGOR **)val);
      lVar5 = PKCS5_pbkdf2_set_ex(param_2,param_3,param_4,local_54,uVar2,param_7);
      *(long *)val = lVar5;
      if (lVar5 == 0) goto LAB_00a6a82c;
      a = X509_ALGOR_new();
      if (a != (X509_ALGOR *)0x0) {
        pAVar3 = OBJ_nid2obj(0xa1);
        a->algorithm = pAVar3;
        lVar5 = ASN1_TYPE_pack_sequence(&DAT_00c5e9f0,val,&a->parameter);
        if (lVar5 != 0) {
          ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5e9f0);
          return a;
        }
      }
      goto LAB_00a6a830;
    }
    if (param_5 != (void *)0x0) {
      memcpy(auStack_70,param_5,(long)iVar1);
      ctx = EVP_CIPHER_CTX_new();
      goto joined_r0x00a6a694;
    }
    iVar1 = RAND_bytes_ex(param_7,auStack_70,(long)iVar1,0);
    if (0 < iVar1) goto LAB_00a6a6f0;
    a = (X509_ALGOR *)0x0;
  }
  ctx = (EVP_CIPHER_CTX *)0x0;
LAB_00a6a864:
  EVP_CIPHER_CTX_free(ctx);
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c5e9f0);
  X509_ALGOR_free(a);
  return (X509_ALGOR *)0x0;
}

