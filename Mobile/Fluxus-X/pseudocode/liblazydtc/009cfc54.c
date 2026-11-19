/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cfc54
 */

bool tls13_enc(long param_1,int *param_2,long param_3,int param_4)

{
  char cVar1;
  undefined8 *puVar2;
  uint uVar3;
  void *__src;
  bool bVar4;
  uint uVar5;
  int iVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  EVP_CIPHER_CTX *ctx;
  ulong uVar10;
  size_t __n;
  undefined8 uVar11;
  undefined1 auStack_c0 [56];
  int local_88;
  int local_84;
  long local_80;
  uchar auStack_78 [8];
  uchar auStack_70 [16];
  
  if (param_3 != 1) {
    ERR_new();
    uVar8 = 0x27;
    goto LAB_009cfd00;
  }
  lVar9 = 0x878;
  if (param_4 == 0) {
    lVar9 = 0x848;
  }
  ctx = *(EVP_CIPHER_CTX **)(param_1 + lVar9);
  puVar2 = (undefined8 *)(param_1 + 0x1d00);
  __src = (void *)(param_1 + 0x880);
  if (param_4 == 0) {
    puVar2 = (undefined8 *)(param_1 + 0x1cf8);
    __src = (void *)(param_1 + 0x850);
  }
  if ((ctx == (EVP_CIPHER_CTX *)0x0) || (param_2[1] == 0x15)) {
    memmove(*(void **)(param_2 + 8),*(void **)(param_2 + 10),*(size_t *)(param_2 + 2));
    *(undefined8 *)(param_2 + 10) = *(undefined8 *)(param_2 + 8);
    return true;
  }
  uVar7 = EVP_CIPHER_CTX_get_iv_length(ctx);
  iVar6 = (int)uVar7;
  if (iVar6 < 0) {
    ERR_new();
    uVar8 = 0x43;
    goto LAB_009cfd00;
  }
  if (*(int *)(param_1 + 0x84) - 3U < 2) {
    lVar9 = *(long *)(param_1 + 0x918);
    if (((lVar9 == 0) || (*(int *)(lVar9 + 0x354) == 0)) &&
       ((lVar9 = *(long *)(param_1 + 0x920), lVar9 == 0 || (*(int *)(lVar9 + 0x354) == 0)))) {
      ERR_new();
      uVar8 = 0x4e;
      goto LAB_009cfd00;
    }
    lVar9 = *(long *)(lVar9 + 0x2f8);
  }
  else {
    lVar9 = *(long *)(param_1 + 0x2e0);
    if (lVar9 == 0) {
      ERR_new();
      uVar8 = 0x59;
      goto LAB_009cfd00;
    }
  }
  uVar3 = *(uint *)(lVar9 + 0x24);
  if ((uVar3 & 0x3c000) == 0) {
    if ((uVar3 & 0x83000) == 0) {
      ERR_new();
      uVar8 = 0x6e;
      goto LAB_009cfd00;
    }
    uVar10 = 0x10;
    if (param_4 == 0) goto LAB_009cfe1c;
  }
  else {
    uVar10 = 0x10;
    if ((uVar3 & 0x30000) != 0) {
      uVar10 = 8;
    }
    if (param_4 == 0) {
LAB_009cfe1c:
      uVar7 = 0;
      if (*(ulong *)(param_2 + 2) < (uVar10 | 1)) {
        return false;
      }
      *(ulong *)(param_2 + 2) = *(ulong *)(param_2 + 2) - uVar10;
    }
    else {
      uVar5 = EVP_CIPHER_CTX_ctrl(ctx,0x11,(int)uVar10,(void *)0x0);
      uVar7 = (ulong)uVar5;
      if ((int)uVar5 < 1) {
        ERR_new();
        uVar8 = 0x66;
        goto LAB_009cfd00;
      }
    }
  }
  if (iVar6 < 8) {
    ERR_new(uVar7);
    uVar8 = 0x7f;
  }
  else {
    __n = (long)iVar6 - 8;
    memcpy(auStack_70,__src,__n);
    uVar8 = *(undefined8 *)((long)__src + __n);
    uVar11 = *puVar2;
    lVar9 = 7;
    *(ulong *)(auStack_78 + iVar6) =
         CONCAT17((byte)((ulong)uVar11 >> 0x38) ^ (byte)((ulong)uVar8 >> 0x38),
                  CONCAT16((byte)((ulong)uVar11 >> 0x30) ^ (byte)((ulong)uVar8 >> 0x30),
                           CONCAT15((byte)((ulong)uVar11 >> 0x28) ^ (byte)((ulong)uVar8 >> 0x28),
                                    CONCAT14((byte)((ulong)uVar11 >> 0x20) ^
                                             (byte)((ulong)uVar8 >> 0x20),
                                             CONCAT13((byte)((ulong)uVar11 >> 0x18) ^
                                                      (byte)((ulong)uVar8 >> 0x18),
                                                      CONCAT12((byte)((ulong)uVar11 >> 0x10) ^
                                                               (byte)((ulong)uVar8 >> 0x10),
                                                               CONCAT11((byte)((ulong)uVar11 >> 8) ^
                                                                        (byte)((ulong)uVar8 >> 8),
                                                                        (byte)uVar11 ^ (byte)uVar8))
                                                     )))));
    do {
      if (lVar9 == -1) {
        return false;
      }
      cVar1 = *(char *)((long)puVar2 + lVar9) + '\x01';
      *(char *)((long)puVar2 + lVar9) = cVar1;
      lVar9 = lVar9 + -1;
    } while (cVar1 == '\0');
    iVar6 = EVP_CipherInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,auStack_70,param_4);
    if ((iVar6 < 1) ||
       ((param_4 == 0 &&
        (iVar6 = EVP_CIPHER_CTX_ctrl(ctx,0x11,(int)uVar10,
                                     (void *)(*(long *)(param_2 + 8) + *(long *)(param_2 + 2))),
        iVar6 < 1)))) {
      ERR_new();
      uVar8 = 0x96;
    }
    else {
      iVar6 = WPACKET_init_static_len(auStack_c0,auStack_78,5,0);
      if (((((iVar6 == 0) ||
            (iVar6 = WPACKET_put_bytes__(auStack_c0,(long)param_2[1],1), iVar6 == 0)) ||
           (iVar6 = WPACKET_put_bytes__(auStack_c0,(long)*param_2,2), iVar6 == 0)) ||
          ((iVar6 = WPACKET_put_bytes__(auStack_c0,*(long *)(param_2 + 2) + uVar10,2), iVar6 == 0 ||
           (iVar6 = WPACKET_get_total_written(auStack_c0,&local_80), iVar6 == 0)))) ||
         ((local_80 != 5 || (iVar6 = WPACKET_finish(auStack_c0), iVar6 == 0)))) {
        ERR_new();
        ERR_set_debug("ssl/record/ssl3_record_tls13.c",0xa2,"tls13_enc");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        WPACKET_cleanup(auStack_c0);
        return false;
      }
      if (((uVar3 & 0x3c000) != 0) &&
         (iVar6 = EVP_CipherUpdate(ctx,(uchar *)0x0,&local_84,(uchar *)0x0,param_2[2]), iVar6 < 1))
      {
        return false;
      }
      iVar6 = EVP_CipherUpdate(ctx,(uchar *)0x0,&local_84,auStack_78,5);
      if (iVar6 < 1) {
        return false;
      }
      iVar6 = EVP_CipherUpdate(ctx,*(uchar **)(param_2 + 8),&local_84,*(uchar **)(param_2 + 10),
                               param_2[2]);
      if (iVar6 < 1) {
        return false;
      }
      iVar6 = EVP_CipherFinal_ex(ctx,(uchar *)(*(long *)(param_2 + 8) + (long)local_84),&local_88);
      if (iVar6 < 1) {
        return false;
      }
      bVar4 = *(long *)(param_2 + 2) == (long)local_88 + (long)local_84;
      if (!bVar4) {
        return bVar4;
      }
      if (param_4 == 0) {
        return bVar4;
      }
      iVar6 = EVP_CIPHER_CTX_ctrl(ctx,0x10,(int)uVar10,
                                  (void *)(*(long *)(param_2 + 8) + (long)local_88 + (long)local_84)
                                 );
      if (0 < iVar6) {
        *(ulong *)(param_2 + 2) = *(long *)(param_2 + 2) + uVar10;
        return true;
      }
      ERR_new();
      uVar8 = 0xba;
    }
  }
LAB_009cfd00:
  ERR_set_debug("ssl/record/ssl3_record_tls13.c",uVar8,"tls13_enc");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return false;
}

