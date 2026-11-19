/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ead0
 */

ulong FUN_00b5ead0(long param_1,uchar *param_2,undefined8 param_3,uchar *param_4,size_t param_5)

{
  uint siglen;
  int iVar1;
  ulong uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  void *pvVar5;
  uchar *puVar6;
  char *pcVar7;
  size_t local_48;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  siglen = (uint)param_3;
  if (*(long *)(param_1 + 0x20) == 0) {
    puVar6 = *(uchar **)(param_1 + 0xb8);
    if (puVar6 != (uchar *)0x0) {
LAB_00b5eb94:
      iVar1 = RSA_public_decrypt(siglen,param_2,puVar6,*(RSA **)(param_1 + 0x10),
                                 *(int *)(param_1 + 0x68));
      if (0 < iVar1) {
        local_48 = (size_t)iVar1;
LAB_00b5ec98:
        if (local_48 == param_5) {
          iVar1 = memcmp(param_4,*(void **)(param_1 + 0xb8),param_5);
          return (ulong)(iVar1 == 0);
        }
        return 0;
      }
      ERR_new();
      uVar4 = 0x341;
      goto LAB_00b5ed08;
    }
    iVar1 = RSA_size(*(RSA **)(param_1 + 0x10));
    puVar6 = CRYPTO_malloc(iVar1,"providers/implementations/signature/rsa_sig.c",0x1e7);
    *(uchar **)(param_1 + 0xb8) = puVar6;
    if (puVar6 != (uchar *)0x0) goto LAB_00b5eb94;
LAB_00b5ed1c:
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1e8,"setup_tbuf");
    uVar3 = 0xc0100;
  }
  else {
    iVar1 = *(int *)(param_1 + 0x68);
    if (iVar1 == 6) {
      iVar1 = EVP_MD_get_size();
      if ((long)iVar1 != param_5) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x31c,"rsa_verify");
        ERR_set_error(0x39,0xa6,"Should be %d, but got %d",(long)iVar1,param_5);
        return 0;
      }
      puVar6 = *(uchar **)(param_1 + 0xb8);
      if (puVar6 == (uchar *)0x0) {
        iVar1 = RSA_size(*(RSA **)(param_1 + 0x10));
        puVar6 = CRYPTO_malloc(iVar1,"providers/implementations/signature/rsa_sig.c",0x1e7);
        *(uchar **)(param_1 + 0xb8) = puVar6;
        if (puVar6 == (uchar *)0x0) goto LAB_00b5ed1c;
      }
      iVar1 = RSA_public_decrypt(siglen,param_2,puVar6,*(RSA **)(param_1 + 0x10),3);
      if (iVar1 < 1) {
        ERR_new();
        uVar4 = 0x327;
      }
      else {
        iVar1 = RSA_verify_PKCS1_PSS_mgf1
                          (*(RSA **)(param_1 + 0x10),param_4,*(EVP_MD **)(param_1 + 0x20),
                           *(EVP_MD **)(param_1 + 0x70),*(uchar **)(param_1 + 0xb8),
                           *(int *)(param_1 + 0xb0));
        if (0 < iVar1) {
          return 1;
        }
        ERR_new();
        uVar4 = 0x32f;
      }
    }
    else {
      if (iVar1 == 5) {
        pvVar5 = *(void **)(param_1 + 0xb8);
        if (pvVar5 == (void *)0x0) {
          iVar1 = RSA_size(*(RSA **)(param_1 + 0x10));
          pvVar5 = CRYPTO_malloc(iVar1,"providers/implementations/signature/rsa_sig.c",0x1e7);
          *(void **)(param_1 + 0xb8) = pvVar5;
          if (pvVar5 == (void *)0x0) goto LAB_00b5ed1c;
        }
        iVar1 = FUN_00b5ee30(param_1,pvVar5,&local_48,0,param_2,param_3);
        if (iVar1 < 1) {
          return 0;
        }
        goto LAB_00b5ec98;
      }
      if (iVar1 != 1) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x335,"rsa_verify");
        pcVar7 = "Only X.931, PKCS#1 v1.5 or PSS padding allowed";
        uVar3 = 0xa8;
        goto LAB_00b5ed48;
      }
      iVar1 = RSA_verify(*(int *)(param_1 + 0x30),param_4,(uint)param_5,param_2,siglen,
                         *(RSA **)(param_1 + 0x10));
      if (iVar1 != 0) {
        return 1;
      }
      ERR_new();
      uVar4 = 0x306;
    }
LAB_00b5ed08:
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",uVar4,"rsa_verify");
    uVar3 = 0x80004;
  }
  pcVar7 = (char *)0x0;
LAB_00b5ed48:
  ERR_set_error(0x39,uVar3,pcVar7);
  return 0;
}

