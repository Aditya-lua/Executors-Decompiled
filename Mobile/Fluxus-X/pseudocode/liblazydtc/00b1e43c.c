/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1e43c
 */

int FUN_00b1e43c(ASN1_VALUE **param_1,uchar **param_2,long param_3,undefined8 param_4,int param_5,
                int param_6,char param_7,ASN1_TLC *param_8,undefined8 param_9,undefined8 param_10)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  X509_ALGOR *pXVar4;
  ASN1_BIT_STRING *pAVar5;
  uchar *ptr;
  long lVar6;
  undefined8 uVar7;
  uchar *puVar8;
  ASN1_VALUE *pAVar9;
  ASN1_VALUE *pAVar10;
  long local_a0;
  char acStack_94 [52];
  uchar *local_58;
  
  pAVar10 = *param_1;
  puVar8 = *param_2;
  if (pAVar10 != (ASN1_VALUE *)0x0) {
    if (*(long *)pAVar10 != 0) goto LAB_00b1e4c0;
LAB_00b1e4b4:
    pXVar4 = X509_ALGOR_new();
    *(X509_ALGOR **)pAVar10 = pXVar4;
    if (pXVar4 != (X509_ALGOR *)0x0) goto LAB_00b1e4c0;
LAB_00b1e590:
    ERR_new();
    uVar7 = 0x90;
LAB_00b1e5a8:
    ERR_set_debug("crypto/x509/x_pubkey.c",uVar7,"x509_pubkey_ex_d2i_ex");
    uVar1 = 0xc0100;
LAB_00b1e5e8:
    ERR_set_error(0xd,uVar1,0);
    return 0;
  }
  iVar2 = FUN_00b1e310(param_1,param_4,param_9,param_10);
  if (iVar2 == 0) {
    return 0;
  }
  pAVar10 = *param_1;
  if (*(long *)pAVar10 == 0) goto LAB_00b1e4b4;
LAB_00b1e4c0:
  if (*(long *)(pAVar10 + 8) == 0) {
    pAVar5 = ASN1_BIT_STRING_new();
    *(ASN1_BIT_STRING **)(pAVar10 + 8) = pAVar5;
    if (pAVar5 == (ASN1_BIT_STRING *)0x0) goto LAB_00b1e590;
  }
  iVar2 = ASN1_item_ex_d2i(param_1,param_2,param_3,(ASN1_ITEM *)&DAT_00c826c0,param_5,param_6,
                           param_7,param_8);
  if (iVar2 < 1) {
    return iVar2;
  }
  lVar6 = (long)*param_2 - (long)puVar8;
  if (lVar6 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/x_pubkey.c",0x9c,"x509_pubkey_ex_d2i_ex");
    uVar1 = 0xc0103;
    goto LAB_00b1e5e8;
  }
  pAVar9 = *param_1;
  pAVar10 = pAVar9 + 0x10;
  EVP_PKEY_free(*(EVP_PKEY **)pAVar10);
  *(undefined8 *)pAVar10 = 0;
  ERR_set_mark();
  iVar2 = FUN_00b1cd70(pAVar10,pAVar9);
  if (iVar2 == -1) {
    ERR_clear_last_mark();
    lVar6 = 0;
    ptr = (uchar *)0x0;
    goto LAB_00b1e618;
  }
  if ((iVar2 < 1) && (((byte)pAVar9[0x28] & 1) == 0)) {
    local_a0 = lVar6;
    if (param_6 == 0) {
      ptr = (uchar *)0x0;
    }
    else {
      ptr = (uchar *)CRYPTO_memdup(puVar8,lVar6,"crypto/x509/x_pubkey.c",0xc0);
      if (ptr == (uchar *)0x0) {
        ERR_new();
        uVar7 = 0xc2;
        goto LAB_00b1e5a8;
      }
      *ptr = '0';
      puVar8 = ptr;
    }
    local_58 = puVar8;
    iVar3 = OBJ_obj2txt(acStack_94,0x32,(ASN1_OBJECT *)**(undefined8 **)pAVar9,0);
    if (iVar3 < 1) {
      ERR_clear_last_mark();
      lVar6 = 0;
      goto LAB_00b1e618;
    }
    lVar6 = OSSL_DECODER_CTX_new_for_pkey
                      (pAVar10,&DAT_002b7291,"SubjectPublicKeyInfo",acStack_94,0x86,
                       *(undefined8 *)(pAVar9 + 0x18),*(undefined8 *)(pAVar9 + 0x20));
    if (((lVar6 != 0) && (iVar3 = OSSL_DECODER_from_data(lVar6,&local_58,&local_a0), iVar3 != 0)) &&
       (local_a0 != 0)) {
      ERR_clear_last_mark();
      ERR_new();
      ERR_set_debug("crypto/x509/x_pubkey.c",0xe0,"x509_pubkey_ex_d2i_ex");
      ERR_set_error(0xd,0x72,0);
      goto LAB_00b1e618;
    }
  }
  else {
    lVar6 = 0;
    ptr = (uchar *)0x0;
  }
  ERR_pop_to_mark();
  iVar2 = 1;
LAB_00b1e618:
  OSSL_DECODER_CTX_free(lVar6);
  CRYPTO_free(ptr);
  return iVar2;
}

