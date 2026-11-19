/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5d5b4
 */

undefined8 FUN_00b5d5b4(undefined8 *param_1,char *param_2,long param_3)

{
  int iVar1;
  int iVar2;
  size_t sVar3;
  long lVar4;
  undefined8 uVar5;
  char *pcVar6;
  undefined1 auStack_68 [56];
  
  if (param_2 == (char *)0x0) {
    return 1;
  }
  sVar3 = strlen(param_2);
  if (sVar3 < 0x32) {
    if (param_3 == 0) {
      param_3 = param_1[1];
    }
    lVar4 = EVP_MD_fetch(*param_1,param_2,param_3);
    if (lVar4 != 0) {
      iVar1 = ossl_digest_get_approved_nid_with_sha1
                        (*param_1,lVar4,*(int *)(param_1 + 0x2d) != 0x10);
      if (iVar1 < 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/ecdsa_sig.c",0xf4,"ecdsa_setup_md");
        ERR_set_error(0x39,0xae,"digest=%s",param_2);
LAB_00b5d6e8:
        EVP_MD_free(lVar4);
        return 0;
      }
      if ((*(byte *)((long)param_1 + 0x4a) & 1) == 0) {
        pcVar6 = (char *)(param_1 + 3);
        if ((*pcVar6 != '\0') && (iVar1 = EVP_MD_is_a(lVar4,pcVar6), iVar1 == 0)) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/ecdsa_sig.c",0xfc,"ecdsa_setup_md");
          ERR_set_error(0x39,0xae,"digest %s != %s",param_2,pcVar6);
          goto LAB_00b5d6e8;
        }
        EVP_MD_free(lVar4);
      }
      else {
        EVP_MD_CTX_free(param_1[0x2f]);
        EVP_MD_free(param_1[0x2e]);
        param_1[0x2b] = 0;
        iVar2 = WPACKET_init_der(auStack_68,(long)param_1 + 0x4b,0x100);
        if (((iVar2 != 0) &&
            (iVar1 = ossl_DER_w_algorithmIdentifier_ECDSA_with_MD
                               (auStack_68,0xffffffff,param_1[2],iVar1), iVar1 != 0)) &&
           (iVar1 = WPACKET_finish(auStack_68), iVar1 != 0)) {
          WPACKET_get_total_written(auStack_68,param_1 + 0x2b);
          uVar5 = WPACKET_get_curr(auStack_68);
          param_1[0x2a] = uVar5;
        }
        WPACKET_cleanup(auStack_68);
        param_1[0x2e] = lVar4;
        param_1[0x2f] = 0;
        iVar1 = EVP_MD_get_size(lVar4);
        param_1[0x2c] = (long)iVar1;
        OPENSSL_strlcpy(param_1 + 3,param_2,0x32);
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/ecdsa_sig.c",0xec,"ecdsa_setup_md");
    pcVar6 = "%s could not be fetched";
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/ecdsa_sig.c",0xe4,"ecdsa_setup_md");
    pcVar6 = "%s exceeds name buffer length";
  }
  ERR_set_error(0x39,0x7a,pcVar6,param_2);
  return 0;
}

