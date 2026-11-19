/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5e540
 */

undefined8
FUN_00b5e540(long param_1,uchar *param_2,ulong *param_3,ulong param_4,uchar *param_5,size_t param_6)

{
  undefined4 uVar1;
  uint m_length;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  void *pvVar6;
  uchar *puVar7;
  char *pcVar8;
  RSA *rsa;
  ulong uVar9;
  size_t sVar10;
  uint local_58;
  uint local_54;
  
  iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
  if (*(long *)(param_1 + 0x20) == 0) {
    sVar10 = 0;
    uVar5 = ossl_prov_is_running();
    iVar3 = (int)uVar5;
  }
  else {
    iVar3 = EVP_MD_get_size(*(long *)(param_1 + 0x20));
    sVar10 = (size_t)iVar3;
    uVar5 = ossl_prov_is_running();
    iVar3 = (int)uVar5;
  }
  if (iVar3 == 0) {
    return uVar5;
  }
  uVar9 = (ulong)iVar2;
  if (param_2 == (uchar *)0x0) {
    *param_3 = uVar9;
    return 1;
  }
  if (param_4 < uVar9) {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x213,"rsa_sign");
    ERR_set_error(0x39,0xb3,"is %zu, should be at least %zu",param_4,uVar9);
    return 0;
  }
  m_length = (uint)param_6;
  if (sVar10 == 0) {
    local_58 = RSA_private_encrypt(m_length,param_5,param_2,*(RSA **)(param_1 + 0x10),
                                   *(int *)(param_1 + 0x68));
joined_r0x00b5e6ac:
    if (0 < (int)local_58) {
      *param_3 = (long)(int)local_58;
      return 1;
    }
    ERR_new();
    uVar5 = 0x28c;
LAB_00b5e678:
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",uVar5,"rsa_sign");
    uVar5 = 0x80004;
  }
  else {
    if (sVar10 == param_6) {
      iVar2 = EVP_MD_is_a(*(undefined8 *)(param_1 + 0x20),&DAT_002ac3ff);
      if (iVar2 == 0) {
        iVar2 = *(int *)(param_1 + 0x68);
        if (iVar2 != 1) {
          if (iVar2 == 6) {
            iVar2 = *(int *)(param_1 + 0xb4);
            if (iVar2 != -1) {
              iVar3 = *(int *)(param_1 + 0xb0);
              if (iVar3 == -1) {
                iVar3 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
                if (iVar3 < iVar2) {
                  ERR_new();
                  ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x259,"rsa_sign");
                  uVar1 = *(undefined4 *)(param_1 + 0xb4);
                  uVar4 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
                  pcVar8 = "minimum salt length set to %d, but the digest only gives %d";
                  goto LAB_00b5e94c;
                }
                iVar3 = *(int *)(param_1 + 0xb0);
              }
              if ((-1 < iVar3) && (iVar3 < *(int *)(param_1 + 0xb4))) {
                ERR_new();
                ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x265,"rsa_sign");
                uVar4 = *(undefined4 *)(param_1 + 0xb0);
                uVar1 = *(undefined4 *)(param_1 + 0xb4);
                pcVar8 = 
                "minimum salt length set to %d, but theactual salt length is only set to %d";
LAB_00b5e94c:
                ERR_set_error(0x39,0xac,pcVar8,uVar1,uVar4);
                return 0;
              }
            }
            puVar7 = *(uchar **)(param_1 + 0xb8);
            if (puVar7 == (uchar *)0x0) {
              iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
              puVar7 = CRYPTO_malloc(iVar2,"providers/implementations/signature/rsa_sig.c",0x1e7);
              *(uchar **)(param_1 + 0xb8) = puVar7;
              if (puVar7 == (uchar *)0x0) {
                ERR_new();
                pcVar8 = "setup_tbuf";
                uVar5 = 0x1e8;
LAB_00b5ea68:
                ERR_set_debug("providers/implementations/signature/rsa_sig.c",uVar5,pcVar8);
                uVar5 = 0xc0100;
                goto LAB_00b5e6e0;
              }
            }
            iVar2 = RSA_padding_add_PKCS1_PSS_mgf1
                              (*(RSA **)(param_1 + 0x10),puVar7,param_5,*(EVP_MD **)(param_1 + 0x20)
                               ,*(EVP_MD **)(param_1 + 0x70),*(int *)(param_1 + 0xb0));
            if (iVar2 == 0) {
              ERR_new();
              uVar5 = 0x276;
              goto LAB_00b5e678;
            }
            iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
            puVar7 = *(uchar **)(param_1 + 0xb8);
            rsa = *(RSA **)(param_1 + 0x10);
            iVar3 = 3;
          }
          else {
            if (iVar2 != 5) {
              ERR_new();
              ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x27f,"rsa_sign");
              pcVar8 = "Only X.931, PKCS#1 v1.5 or PSS padding allowed";
              goto LAB_00b5e884;
            }
            iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
            uVar9 = param_6 + 1;
            if ((ulong)(long)iVar2 < uVar9) {
              ERR_new();
              ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x235,"rsa_sign");
              iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
              ERR_set_error(0x39,0xab,"RSA key size = %d, expected minimum = %d",iVar2,uVar9);
              return 0;
            }
            pvVar6 = *(void **)(param_1 + 0xb8);
            if (pvVar6 == (void *)0x0) {
              iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
              pvVar6 = CRYPTO_malloc(iVar2,"providers/implementations/signature/rsa_sig.c",0x1e7);
              *(void **)(param_1 + 0xb8) = pvVar6;
              if (pvVar6 == (void *)0x0) {
                ERR_new();
                ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1e8,"setup_tbuf");
                ERR_set_error(0x39,0xc0100,0);
                ERR_new();
                pcVar8 = "rsa_sign";
                uVar5 = 0x23b;
                goto LAB_00b5ea68;
              }
            }
            memcpy(pvVar6,param_5,param_6);
            iVar2 = RSA_X931_hash_id(*(int *)(param_1 + 0x30));
            iVar3 = 5;
            *(char *)(*(long *)(param_1 + 0xb8) + param_6) = (char)iVar2;
            puVar7 = *(uchar **)(param_1 + 0xb8);
            rsa = *(RSA **)(param_1 + 0x10);
            iVar2 = (int)uVar9;
          }
          local_58 = RSA_private_encrypt(iVar2,puVar7,param_2,rsa,iVar3);
          pvVar6 = *(void **)(param_1 + 0xb8);
          if (pvVar6 != (void *)0x0) {
            iVar2 = RSA_size(*(RSA **)(param_1 + 0x10));
            OPENSSL_cleanse(pvVar6,(long)iVar2);
          }
          goto joined_r0x00b5e6ac;
        }
        iVar2 = RSA_sign(*(int *)(param_1 + 0x30),param_5,m_length,param_2,&local_58,
                         *(RSA **)(param_1 + 0x10));
        if (0 < iVar2) goto joined_r0x00b5e6ac;
        ERR_new();
        uVar5 = 0x24c;
      }
      else {
        if (*(int *)(param_1 + 0x68) != 1) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x223,"rsa_sign");
          pcVar8 = "only PKCS#1 padding supported with MDC2";
LAB_00b5e884:
          uVar5 = 0xa8;
          goto LAB_00b5e6e4;
        }
        iVar2 = RSA_sign_ASN1_OCTET_STRING
                          (0,param_5,m_length,param_2,&local_54,*(RSA **)(param_1 + 0x10));
        local_58 = local_54;
        if (0 < iVar2) goto joined_r0x00b5e6ac;
        ERR_new();
        uVar5 = 0x22b;
      }
      goto LAB_00b5e678;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x21a,"rsa_sign");
    uVar5 = 0xa6;
  }
LAB_00b5e6e0:
  pcVar8 = (char *)0x0;
LAB_00b5e6e4:
  ERR_set_error(0x39,uVar5,pcVar8);
  return 0;
}

