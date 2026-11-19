/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60444
 */

undefined8 FUN_00b60444(undefined8 *param_1,char *param_2,long param_3)

{
  int iVar1;
  int iVar2;
  long lVar3;
  size_t sVar4;
  char *pcVar5;
  
  if (param_3 == 0) {
    param_3 = param_1[1];
  }
  if (param_2 != (char *)0x0) {
    lVar3 = EVP_MD_fetch(*param_1,param_2,param_3);
    iVar1 = ossl_digest_rsa_sign_get_md_nid(*param_1,lVar3,*(int *)(param_1 + 3) != 0x10);
    sVar4 = strlen(param_2);
    if ((((lVar3 == 0) || (iVar1 < 1)) ||
        (iVar2 = FUN_00b60684(param_1,param_2,0,iVar1), 0x31 < sVar4)) || (iVar2 == 0)) {
      if (lVar3 == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x12d,"rsa_setup_md");
        ERR_set_error(0x39,0x7a,"%s could not be fetched",param_2);
      }
      if (iVar1 < 1) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x130,"rsa_setup_md");
        ERR_set_error(0x39,0xae,"digest=%s",param_2);
      }
      if (0x31 < sVar4) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x133,"rsa_setup_md");
        ERR_set_error(0x39,0x7a,"%s exceeds name buffer length",param_2);
      }
LAB_00b605c8:
      EVP_MD_free(lVar3);
      return 0;
    }
    if ((*(byte *)((long)param_1 + 0x1c) & 1) == 0) {
      pcVar5 = (char *)((long)param_1 + 0x34);
      if ((*pcVar5 != '\0') && (iVar1 = EVP_MD_is_a(lVar3,pcVar5), iVar1 == 0)) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x13b,"rsa_setup_md");
        ERR_set_error(0x39,0xae,"digest %s != %s",param_2,pcVar5);
        goto LAB_00b605c8;
      }
      EVP_MD_free(lVar3);
    }
    else {
      if ((*(byte *)((long)param_1 + 0x1c) >> 1 & 1) == 0) {
        iVar2 = EVP_MD_up_ref(lVar3);
        if (iVar2 == 0) goto LAB_00b605c8;
        EVP_MD_free(param_1[0xe]);
        param_1[0xe] = lVar3;
        *(int *)(param_1 + 0xf) = iVar1;
        OPENSSL_strlcpy((long)param_1 + 0x7c,param_2,0x32);
      }
      EVP_MD_CTX_free(param_1[5]);
      EVP_MD_free(param_1[4]);
      param_1[4] = lVar3;
      param_1[5] = 0;
      *(int *)(param_1 + 6) = iVar1;
      OPENSSL_strlcpy((long)param_1 + 0x34,param_2,0x32);
    }
  }
  return 1;
}

