/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ce0e8
 */

undefined8
ssl3_enc(long param_1,long param_2,long param_3,int param_4,long param_5,undefined8 param_6)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  ulong *puVar6;
  size_t __n;
  EVP_CIPHER_CTX *c;
  ulong uVar7;
  ulong uVar8;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined8 local_d8;
  undefined8 uStack_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  int local_64;
  
  if (param_3 != 1) {
    return 0;
  }
  if (param_4 == 0) {
    c = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
  }
  else {
    c = *(EVP_CIPHER_CTX **)(param_1 + 0x878);
  }
  if ((((c == (EVP_CIPHER_CTX *)0x0) || (lVar3 = EVP_CIPHER_CTX_get0_cipher(c), lVar3 == 0)) ||
      (c == (EVP_CIPHER_CTX *)0x0)) || (*(long *)(param_1 + 0x918) == 0)) {
    memmove(*(void **)(param_2 + 0x20),*(void **)(param_2 + 0x28),*(size_t *)(param_2 + 8));
    *(undefined8 *)(param_2 + 0x28) = *(undefined8 *)(param_2 + 0x20);
  }
  else {
    lVar4 = EVP_CIPHER_get0_provider(lVar3);
    puVar6 = (ulong *)(param_2 + 8);
    uVar8 = *puVar6;
    iVar2 = EVP_CIPHER_CTX_get_block_size(c);
    uVar7 = (ulong)iVar2;
    if (((lVar4 == 0) && (param_4 != 0)) && (iVar2 != 1)) {
      uVar1 = 0;
      if (uVar7 != 0) {
        uVar1 = uVar8 / uVar7;
      }
      __n = uVar7 - (uVar8 - uVar1 * uVar7);
      uVar8 = __n + uVar8;
      memset((void *)(*(long *)(param_2 + 0x28) + *(long *)(param_2 + 8)),0,__n);
      *(size_t *)(param_2 + 8) = *(long *)(param_2 + 8) + __n;
      *(char *)(*(long *)(param_2 + 0x28) + uVar8 + -1) = (char)__n + -1;
    }
    if (param_4 == 0) {
      if (uVar8 == 0) {
        return 0;
      }
      uVar1 = 0;
      if (uVar7 != 0) {
        uVar1 = uVar8 / uVar7;
      }
      if (uVar8 != uVar1 * uVar7) {
        return 0;
      }
    }
    lVar3 = EVP_CIPHER_get0_provider(lVar3);
    if (lVar3 == 0) {
      iVar2 = EVP_Cipher(c,*(uchar **)(param_2 + 0x20),*(uchar **)(param_2 + 0x28),(uint)uVar8);
      if (iVar2 < 1) {
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record.c",0x3af,"ssl3_enc");
        ossl_statem_fatal(param_1,0x14,0xc0103,0);
        return 0;
      }
      if (param_4 == 0) {
        lVar3 = 0;
        if (param_5 != 0) {
          lVar3 = param_5 + 8;
        }
        uVar5 = ssl3_cbc_remove_padding_and_mac
                          (puVar6,*(undefined8 *)(param_2 + 0x10),*(undefined8 *)(param_2 + 0x20),
                           param_5,lVar3,uVar7,param_6,**(undefined8 **)(param_1 + 0x9a8));
        return uVar5;
      }
    }
    else {
      iVar2 = EVP_CipherUpdate(c,*(uchar **)(param_2 + 0x20),&local_64,*(uchar **)(param_2 + 0x28),
                               (uint)uVar8);
      if (iVar2 == 0) {
        return 0;
      }
      *puVar6 = (long)local_64;
      if ((param_4 == 0) && (param_5 != 0)) {
        *(undefined4 *)(param_5 + 8) = 0;
        OSSL_PARAM_construct_octet_ptr(&local_e8,"tls-mac",param_5,param_6);
        local_a0 = local_c8;
        uStack_b8 = uStack_e0;
        local_c0 = local_e8;
        uStack_a8 = uStack_d0;
        uStack_b0 = local_d8;
        OSSL_PARAM_construct_end(&local_e8);
        local_78 = local_c8;
        uStack_80 = uStack_d0;
        local_88 = local_d8;
        uStack_90 = uStack_e0;
        local_98 = local_e8;
        iVar2 = EVP_CIPHER_CTX_get_params(c,&local_c0);
        if (iVar2 == 0) {
          ERR_new();
          ERR_set_debug("ssl/record/ssl3_record.c",0x3a8,"ssl3_enc");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          return 0;
        }
      }
    }
  }
  return 1;
}

