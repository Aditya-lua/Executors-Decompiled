/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a697dc
 */

undefined4
EVP_PBE_CipherInit_ex
          (ASN1_OBJECT *param_1,char *param_2,ulong param_3,undefined8 param_4,undefined8 param_5,
          undefined4 param_6,undefined8 param_7,undefined8 param_8)

{
  int n;
  code *pcVar1;
  code *pcVar2;
  int iVar3;
  undefined4 uVar4;
  uint uVar5;
  void *pvVar6;
  ulong uVar7;
  char *pcVar8;
  EVP_CIPHER *pEVar9;
  EVP_CIPHER *pEVar10;
  EVP_MD *pEVar11;
  EVP_MD *pEVar12;
  size_t sVar13;
  char local_b0 [4];
  int iStack_ac;
  
  sVar13 = param_3 & 0xffffffff;
  iVar3 = OBJ_obj2nid(param_1);
  if (iVar3 == 0) {
LAB_00a698a8:
    if (param_1 == (ASN1_OBJECT *)0x0) {
      uVar7 = OPENSSL_strlcpy(local_b0,&DAT_0029dc23,0x50);
    }
    else {
      uVar5 = i2t_ASN1_OBJECT(local_b0,0x50,param_1);
      uVar7 = (ulong)uVar5;
    }
    ERR_new(uVar7);
    ERR_set_debug("crypto/evp/evp_pbe.c",0x6d,"EVP_PBE_CipherInit_ex");
    ERR_set_error(6,0x79,"TYPE=%s",local_b0);
LAB_00a69908:
    pEVar9 = (EVP_CIPHER *)0x0;
LAB_00a6990c:
    pEVar11 = (EVP_MD *)0x0;
    uVar4 = 0;
    goto LAB_00a69a20;
  }
  local_b0[0] = '\0';
  local_b0[1] = '\0';
  local_b0[2] = '\0';
  local_b0[3] = '\0';
  iStack_ac = iVar3;
  if (DAT_00d21b40 == 0) {
LAB_00a69854:
    pvVar6 = OBJ_bsearch_(local_b0,&DAT_00c5e550,0x1d,0x20,(cmp *)&LAB_00a69e6c);
    if (pvVar6 == (void *)0x0) goto LAB_00a698a8;
  }
  else {
    uVar4 = OPENSSL_sk_find(DAT_00d21b40,local_b0);
    pvVar6 = (void *)OPENSSL_sk_value(DAT_00d21b40,uVar4);
    if (pvVar6 == (void *)0x0) goto LAB_00a69854;
  }
  iVar3 = *(int *)((long)pvVar6 + 8);
  n = *(int *)((long)pvVar6 + 0xc);
  pcVar1 = *(code **)((long)pvVar6 + 0x10);
  pcVar2 = *(code **)((long)pvVar6 + 0x18);
  if (param_2 == (char *)0x0) {
    sVar13 = 0;
  }
  else if ((int)param_3 == -1) {
    sVar13 = strlen(param_2);
  }
  if (iVar3 == -1) {
    pEVar10 = (EVP_CIPHER *)0x0;
    pEVar9 = (EVP_CIPHER *)0x0;
    if (n != -1) goto LAB_00a69970;
LAB_00a699f0:
    pEVar12 = (EVP_MD *)0x0;
    pEVar11 = (EVP_MD *)0x0;
    if (pcVar2 == (code *)0x0) {
LAB_00a69a00:
      uVar4 = (*pcVar1)(param_5,param_2,sVar13 & 0xffffffff,param_4,pEVar10,pEVar12,param_6);
      goto LAB_00a69a20;
    }
  }
  else {
    ERR_set_mark();
    pcVar8 = OBJ_nid2sn(iVar3);
    pEVar9 = (EVP_CIPHER *)EVP_CIPHER_fetch(param_7,pcVar8,param_8);
    pEVar10 = pEVar9;
    if (pEVar9 == (EVP_CIPHER *)0x0) {
      pcVar8 = OBJ_nid2sn(iVar3);
      pEVar10 = EVP_get_cipherbyname(pcVar8);
      if (pEVar10 == (EVP_CIPHER *)0x0) {
        ERR_clear_last_mark();
        ERR_new();
        ERR_set_debug("crypto/evp/evp_pbe.c",0x7f,"EVP_PBE_CipherInit_ex");
        pcVar8 = OBJ_nid2sn(iVar3);
        ERR_set_error(6,0xa0,pcVar8);
        goto LAB_00a69908;
      }
    }
    ERR_pop_to_mark();
    if (n == -1) goto LAB_00a699f0;
LAB_00a69970:
    ERR_set_mark();
    pcVar8 = OBJ_nid2sn(n);
    pEVar11 = (EVP_MD *)EVP_MD_fetch(param_7,pcVar8,param_8);
    pEVar12 = pEVar11;
    if (pEVar11 == (EVP_MD *)0x0) {
      pcVar8 = OBJ_nid2sn(n);
      pEVar12 = EVP_get_digestbyname(pcVar8);
      if (pEVar12 == (EVP_MD *)0x0) {
        ERR_clear_last_mark();
        ERR_new();
        ERR_set_debug("crypto/evp/evp_pbe.c",0x8f,"EVP_PBE_CipherInit_ex");
        ERR_set_error(6,0xa1,0);
        goto LAB_00a6990c;
      }
    }
    ERR_pop_to_mark();
    if (pcVar2 == (code *)0x0) goto LAB_00a69a00;
  }
  uVar4 = (*pcVar2)(param_5,param_2,sVar13 & 0xffffffff,param_4,pEVar10,pEVar12,param_6,param_7,
                    param_8);
LAB_00a69a20:
  EVP_CIPHER_free(pEVar9);
  EVP_MD_free(pEVar11);
  return uVar4;
}

