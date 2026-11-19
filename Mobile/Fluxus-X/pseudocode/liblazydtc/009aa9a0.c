/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa9a0
 */

undefined8 ssl3_change_cipher_state(long param_1,uint param_2)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  COMP_CTX *pCVar4;
  void *__src;
  undefined8 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  EVP_CIPHER *cipher;
  EVP_CIPHER_CTX *pEVar9;
  COMP_METHOD *meth;
  void *__dest;
  size_t __n;
  long lVar10;
  void *pvVar11;
  
  lVar8 = *(long *)(param_1 + 0x328);
  if (lVar8 == 0) {
    ERR_new();
    uVar5 = 0x6b;
  }
  else {
    cipher = *(EVP_CIPHER **)(param_1 + 800);
    if (*(long *)(param_1 + 0x340) == 0) {
      meth = (COMP_METHOD *)0x0;
      if ((param_2 & 1) != 0) goto LAB_009aaa70;
LAB_009aa9e0:
      pEVar9 = *(EVP_CIPHER_CTX **)(param_1 + 0x878);
      bVar1 = true;
      *(undefined4 *)(param_1 + 0x7c) = 1;
      if (pEVar9 == (EVP_CIPHER_CTX *)0x0) {
        pEVar9 = EVP_CIPHER_CTX_new();
        *(EVP_CIPHER_CTX **)(param_1 + 0x878) = pEVar9;
        if (pEVar9 != (EVP_CIPHER_CTX *)0x0) {
          EVP_CIPHER_CTX_reset();
          pEVar9 = *(EVP_CIPHER_CTX **)(param_1 + 0x878);
          bVar1 = false;
          goto LAB_009aaa08;
        }
        ERR_new();
        uVar5 = 0x9b;
      }
      else {
LAB_009aaa08:
        lVar3 = ssl_replace_hash(param_1 + 0x890,lVar8);
        if (lVar3 != 0) {
          COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x868));
          *(undefined8 *)(param_1 + 0x868) = 0;
          if (meth != (COMP_METHOD *)0x0) {
            pCVar4 = COMP_CTX_new(meth);
            *(COMP_CTX **)(param_1 + 0x868) = pCVar4;
            if (pCVar4 == (COMP_CTX *)0x0) {
              ERR_new();
              uVar5 = 0xb0;
LAB_009aaca8:
              ERR_set_debug("ssl/s3_enc.c",uVar5,"ssl3_change_cipher_state");
              uVar5 = 0x8e;
              goto LAB_009aace0;
            }
          }
          RECORD_LAYER_reset_write_sequence(param_1 + 0xc58);
          __dest = (void *)(param_1 + 0x100);
          if (bVar1) {
LAB_009aaad8:
            EVP_CIPHER_CTX_reset(pEVar9);
          }
          goto LAB_009aaae0;
        }
        ERR_new();
        uVar5 = 0xa5;
      }
LAB_009aac5c:
      ERR_set_debug("ssl/s3_enc.c",uVar5,"ssl3_change_cipher_state");
      uVar5 = 0xc0100;
      goto LAB_009aace0;
    }
    meth = *(COMP_METHOD **)(*(long *)(param_1 + 0x340) + 0x10);
    if ((param_2 & 1) == 0) goto LAB_009aa9e0;
LAB_009aaa70:
    pEVar9 = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
    if (pEVar9 == (EVP_CIPHER_CTX *)0x0) {
      pEVar9 = EVP_CIPHER_CTX_new();
      *(EVP_CIPHER_CTX **)(param_1 + 0x848) = pEVar9;
      if (pEVar9 != (EVP_CIPHER_CTX *)0x0) {
        EVP_CIPHER_CTX_reset();
        pEVar9 = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
        bVar1 = false;
        goto LAB_009aaa98;
      }
      ERR_new();
      uVar5 = 0x79;
      goto LAB_009aac5c;
    }
    bVar1 = true;
LAB_009aaa98:
    lVar3 = ssl_replace_hash(param_1 + 0x860,lVar8);
    if (lVar3 == 0) {
      ERR_new();
      uVar5 = 0x84;
      goto LAB_009aacd0;
    }
    COMP_CTX_free(*(COMP_CTX **)(param_1 + 0x870));
    *(undefined8 *)(param_1 + 0x870) = 0;
    if (meth != (COMP_METHOD *)0x0) {
      pCVar4 = COMP_CTX_new(meth);
      *(COMP_CTX **)(param_1 + 0x870) = pCVar4;
      if (pCVar4 != (COMP_CTX *)0x0) goto LAB_009aaac8;
      ERR_new();
      uVar5 = 0x8f;
      goto LAB_009aaca8;
    }
LAB_009aaac8:
    RECORD_LAYER_reset_read_sequence(param_1 + 0xc58);
    __dest = (void *)(param_1 + 0xb8);
    if (bVar1) goto LAB_009aaad8;
LAB_009aaae0:
    pvVar11 = *(void **)(param_1 + 0x318);
    iVar2 = EVP_MD_get_size(lVar8);
    if (iVar2 < 0) {
      ERR_new();
      uVar5 = 0xbf;
    }
    else {
      __n = (size_t)iVar2;
      iVar2 = EVP_CIPHER_get_key_length(cipher);
      lVar10 = (long)iVar2;
      iVar2 = EVP_CIPHER_get_iv_length(cipher);
      lVar3 = (long)iVar2;
      if ((param_2 == 0x21) || (param_2 == 0x12)) {
        lVar6 = __n * 2;
        lVar10 = lVar6 + lVar10 * 2;
        uVar7 = lVar10 + lVar3 * 2;
        __src = pvVar11;
      }
      else {
        lVar6 = lVar10 + __n * 2;
        lVar10 = lVar3 + lVar10 + lVar6;
        __src = (void *)((long)pvVar11 + __n);
        uVar7 = lVar10 + lVar3;
      }
      if (*(ulong *)(param_1 + 0x310) < uVar7) {
        ERR_new();
        uVar5 = 0xd9;
      }
      else {
        memcpy(__dest,__src,__n);
        iVar2 = EVP_CipherInit_ex(pEVar9,cipher,(ENGINE *)0x0,(uchar *)((long)pvVar11 + lVar6),
                                  (uchar *)((long)pvVar11 + lVar10),param_2 & 2);
        if (iVar2 != 0) {
          EVP_CIPHER_CTX_get0_cipher(pEVar9);
          lVar3 = EVP_CIPHER_get0_provider();
          if ((lVar3 == 0) ||
             (uVar5 = tls_provider_set_tls_params(param_1,pEVar9,cipher,lVar8), (int)uVar5 != 0)) {
            *(undefined4 *)(param_1 + 0x7c) = 0;
            return 1;
          }
          return uVar5;
        }
        ERR_new();
        uVar5 = 0xe0;
      }
    }
  }
LAB_009aacd0:
  ERR_set_debug("ssl/s3_enc.c",uVar5,"ssl3_change_cipher_state");
  uVar5 = 0xc0103;
LAB_009aace0:
  ossl_statem_fatal(param_1,0x50,uVar5,0);
  return 0;
}

