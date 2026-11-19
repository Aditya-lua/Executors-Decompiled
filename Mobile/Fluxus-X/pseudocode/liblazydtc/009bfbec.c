/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bfbec
 */

undefined8 tls1_change_cipher_state(long param_1,uint param_2)

{
  uchar *key;
  uchar *iv;
  uint uVar1;
  uint uVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  long lVar8;
  COMP_CTX *pCVar9;
  EVP_PKEY *pkey;
  undefined8 uVar10;
  void *__src;
  ulong uVar11;
  long lVar12;
  EVP_CIPHER *cipher;
  long lVar13;
  size_t *psVar14;
  long lVar15;
  EVP_CIPHER_CTX *pEVar16;
  void *pvVar17;
  undefined8 uVar18;
  size_t __n;
  uchar *local_68;
  
  cipher = *(EVP_CIPHER **)(param_1 + 800);
  uVar18 = *(undefined8 *)(param_1 + 0x328);
  iVar7 = *(int *)(param_1 + 0x330);
  lVar13 = *(long *)(param_1 + 0x340);
  if ((param_2 & 1) == 0) {
    *(undefined4 *)(param_1 + 0x7c) = 1;
    uVar11 = *(ulong *)(param_1 + 0xa8) & 0xfffffffffffffbff;
    if (*(int *)(param_1 + 0xb2c) != 0) {
      uVar11 = *(ulong *)(param_1 + 0xa8) | 0x400;
    }
    *(ulong *)(param_1 + 0xa8) = uVar11;
    uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x40);
    pEVar16 = *(EVP_CIPHER_CTX **)(param_1 + 0x878);
    uVar6 = *(uint *)(param_1 + 0x540) & 0xfffffffd;
    if ((uVar2 & 0x10000) != 0) {
      uVar6 = *(uint *)(param_1 + 0x540) | 2;
    }
    uVar1 = uVar6 & 0xfffffff7;
    if ((uVar2 & 0x20000) != 0) {
      uVar1 = uVar6 | 8;
    }
    *(uint *)(param_1 + 0x540) = uVar1;
    if ((pEVar16 == (EVP_CIPHER_CTX *)0x0) ||
       (uVar6 = *(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60), (uVar6 >> 3 & 1) != 0))
    {
      pEVar16 = EVP_CIPHER_CTX_new();
      *(EVP_CIPHER_CTX **)(param_1 + 0x878) = pEVar16;
      if (pEVar16 == (EVP_CIPHER_CTX *)0x0) {
        ERR_new();
        uVar18 = 0x123;
      }
      else {
        bVar3 = false;
        if ((*(uint *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0)
        goto LAB_009bfd38;
LAB_009bfca0:
        lVar8 = EVP_MD_CTX_new();
        if (lVar8 != 0) {
          *(long *)(param_1 + 0x890) = lVar8;
          goto LAB_009bfd4c;
        }
        ERR_new();
        uVar18 = 0x12a;
      }
LAB_009bffb0:
      ERR_set_debug("ssl/t1_enc.c",uVar18,"tls1_change_cipher_state");
      uVar18 = 0xc0100;
      goto LAB_009c01e0;
    }
    bVar3 = true;
    if ((uVar6 >> 3 & 1) != 0) goto LAB_009bfca0;
LAB_009bfd38:
    lVar8 = ssl_replace_hash(param_1 + 0x890,0);
    if (lVar8 == 0) {
      ERR_new();
      uVar18 = 0x131;
      goto LAB_009bffb0;
    }
LAB_009bfd4c:
    COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x868));
    *(undefined8 *)(param_1 + 0x868) = 0;
    if (lVar13 != 0) {
      pCVar9 = COMP_CTX_new(*(COMP_METHOD **)(lVar13 + 0x10));
      *(COMP_CTX **)(param_1 + 0x868) = pCVar9;
      if (pCVar9 == (COMP_CTX *)0x0) {
        ERR_new();
        uVar18 = 0x13c;
LAB_009bfffc:
        ERR_set_debug("ssl/t1_enc.c",uVar18,"tls1_change_cipher_state");
        uVar18 = 0x8e;
        goto LAB_009c01e0;
      }
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      RECORD_LAYER_reset_write_sequence(param_1 + 0xc58);
    }
    local_68 = (uchar *)(param_1 + 0x100);
    psVar14 = (size_t *)(param_1 + 0xf8);
    if (bVar3) {
LAB_009bfe14:
      EVP_CIPHER_CTX_reset(pEVar16);
    }
LAB_009bfe1c:
    __n = *(size_t *)(param_1 + 0x338);
    pvVar17 = *(void **)(param_1 + 0x318);
    *psVar14 = __n;
    iVar4 = EVP_CIPHER_get_key_length(cipher);
    iVar5 = EVP_CIPHER_get_mode(cipher);
    if ((iVar5 == 6) || (iVar5 = EVP_CIPHER_get_mode(cipher), iVar5 == 7)) {
      iVar5 = 4;
    }
    else {
      iVar5 = EVP_CIPHER_get_iv_length(cipher);
    }
    lVar13 = (long)iVar4;
    lVar12 = (long)iVar5;
    if ((param_2 == 0x21) || (param_2 == 0x12)) {
      lVar15 = __n * 2;
      lVar13 = lVar15 + lVar13 * 2;
      uVar11 = lVar13 + lVar12 * 2;
      __src = pvVar17;
    }
    else {
      lVar15 = lVar13 + __n * 2;
      lVar13 = lVar15 + lVar13 + lVar12;
      __src = (void *)((long)pvVar17 + __n);
      uVar11 = lVar13 + lVar12;
    }
    if (*(ulong *)(param_1 + 0x310) < uVar11) {
      ERR_new();
      uVar18 = 0x166;
    }
    else {
      memcpy(local_68,__src,__n);
      uVar6 = EVP_CIPHER_get_flags(cipher);
      if ((uVar6 >> 0x15 & 1) == 0) {
        if (iVar7 == 0x357) {
          pkey = (EVP_PKEY *)
                 EVP_PKEY_new_raw_private_key_ex
                           (**(undefined8 **)(param_1 + 0x9a8),&DAT_002c35d3,
                            (*(undefined8 **)(param_1 + 0x9a8))[0x88],local_68,*psVar14);
        }
        else {
          pkey = EVP_PKEY_new_mac_key(iVar7,(ENGINE *)0x0,local_68,(int)*psVar14);
        }
        if (pkey != (EVP_PKEY *)0x0) {
          uVar10 = EVP_MD_get0_name(uVar18);
          iVar7 = EVP_DigestSignInit_ex
                            (lVar8,0,uVar10,**(undefined8 **)(param_1 + 0x9a8),
                             (*(undefined8 **)(param_1 + 0x9a8))[0x88],pkey,0);
          if (0 < iVar7) {
            EVP_PKEY_free(pkey);
            goto LAB_009c0068;
          }
        }
        EVP_PKEY_free(pkey);
        ERR_new();
        uVar18 = 0x17f;
      }
      else {
LAB_009c0068:
        key = (uchar *)((long)pvVar17 + lVar15);
        iv = (uchar *)((long)pvVar17 + lVar13);
        iVar7 = EVP_CIPHER_get_mode(cipher);
        if (iVar7 == 6) {
          iVar7 = EVP_CipherInit_ex(pEVar16,cipher,(ENGINE *)0x0,key,(uchar *)0x0,param_2 & 2);
          if ((iVar7 != 0) && (iVar7 = EVP_CIPHER_CTX_ctrl(pEVar16,0x12,iVar5,iv), 0 < iVar7))
          goto LAB_009c0230;
          ERR_new();
          uVar18 = 0x18e;
        }
        else {
          iVar7 = EVP_CIPHER_get_mode(cipher);
          if (iVar7 == 7) {
            iVar7 = 0x10;
            if ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x24) & 0x30000) != 0) {
              iVar7 = 8;
            }
            iVar4 = EVP_CipherInit_ex(pEVar16,cipher,(ENGINE *)0x0,(uchar *)0x0,(uchar *)0x0,
                                      param_2 & 2);
            if ((((iVar4 == 0) ||
                 (iVar4 = EVP_CIPHER_CTX_ctrl(pEVar16,9,0xc,(void *)0x0), iVar4 < 1)) ||
                (iVar7 = EVP_CIPHER_CTX_ctrl(pEVar16,0x11,iVar7,(void *)0x0), iVar7 < 1)) ||
               ((iVar7 = EVP_CIPHER_CTX_ctrl(pEVar16,0x12,iVar5,iv), iVar7 < 1 ||
                (iVar7 = EVP_CipherInit_ex(pEVar16,(EVP_CIPHER *)0x0,(ENGINE *)0x0,key,(uchar *)0x0,
                                           -1), iVar7 == 0)))) {
              ERR_new();
              uVar18 = 0x19d;
            }
            else {
LAB_009c0230:
              uVar6 = EVP_CIPHER_get_flags(cipher);
              if (((uVar6 >> 0x15 & 1) == 0) ||
                 ((*psVar14 == 0 ||
                  (iVar7 = EVP_CIPHER_CTX_ctrl(pEVar16,0x17,(int)*psVar14,local_68), 0 < iVar7)))) {
                EVP_CIPHER_CTX_get0_cipher(pEVar16);
                lVar13 = EVP_CIPHER_get0_provider();
                if ((lVar13 == 0) ||
                   (uVar18 = tls_provider_set_tls_params(param_1,pEVar16,cipher,uVar18),
                   (int)uVar18 != 0)) {
                  *(undefined4 *)(param_1 + 0x7c) = 0;
                  return 1;
                }
                return uVar18;
              }
              ERR_new();
              uVar18 = 0x1ab;
            }
          }
          else {
            iVar7 = EVP_CipherInit_ex(pEVar16,cipher,(ENGINE *)0x0,key,iv,param_2 & 2);
            if (iVar7 != 0) goto LAB_009c0230;
            ERR_new();
            uVar18 = 0x1a2;
          }
        }
      }
    }
  }
  else {
    pEVar16 = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
    uVar11 = *(ulong *)(param_1 + 0xa8) & 0xfffffffffffffeff;
    if (*(int *)(param_1 + 0xb2c) != 0) {
      uVar11 = *(ulong *)(param_1 + 0xa8) | 0x100;
    }
    *(ulong *)(param_1 + 0xa8) = uVar11;
    uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x40);
    uVar6 = *(uint *)(param_1 + 0x540) & 0xfffffffe;
    if ((uVar2 & 0x10000) != 0) {
      uVar6 = *(uint *)(param_1 + 0x540) | 1;
    }
    uVar1 = uVar6 & 0xfffffffb;
    if ((uVar2 & 0x20000) != 0) {
      uVar1 = uVar6 | 4;
    }
    *(uint *)(param_1 + 0x540) = uVar1;
    if (pEVar16 == (EVP_CIPHER_CTX *)0x0) {
      pEVar16 = EVP_CIPHER_CTX_new();
      *(EVP_CIPHER_CTX **)(param_1 + 0x848) = pEVar16;
      if (pEVar16 == (EVP_CIPHER_CTX *)0x0) {
        ERR_new();
        uVar18 = 0xef;
        goto LAB_009bffb0;
      }
      EVP_CIPHER_CTX_reset();
      pEVar16 = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
      bVar3 = false;
    }
    else {
      bVar3 = true;
    }
    lVar8 = ssl_replace_hash(param_1 + 0x860,0);
    if (lVar8 != 0) {
      COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x870));
      *(undefined8 *)(param_1 + 0x870) = 0;
      if (lVar13 != 0) {
        pCVar9 = COMP_CTX_new(*(COMP_METHOD **)(lVar13 + 0x10));
        *(COMP_CTX **)(param_1 + 0x870) = pCVar9;
        if (pCVar9 == (COMP_CTX *)0x0) {
          ERR_new();
          uVar18 = 0x104;
          goto LAB_009bfffc;
        }
      }
      if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
        RECORD_LAYER_reset_read_sequence(param_1 + 0xc58);
      }
      local_68 = (uchar *)(param_1 + 0xb8);
      psVar14 = (size_t *)(param_1 + 0xb0);
      if (bVar3) goto LAB_009bfe14;
      goto LAB_009bfe1c;
    }
    ERR_new();
    uVar18 = 0xfa;
  }
  ERR_set_debug("ssl/t1_enc.c",uVar18,"tls1_change_cipher_state");
  uVar18 = 0xc0103;
LAB_009c01e0:
  ossl_statem_fatal(param_1,0x50,uVar18,0);
  return 0;
}

