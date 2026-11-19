/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6ffc
 */

undefined8 tls13_change_cipher_state(long param_1,uint param_2)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  size_t cnt;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  undefined8 uVar4;
  void *__dest;
  undefined4 uVar5;
  EVP_CIPHER_CTX *pEVar6;
  long lVar7;
  char *pcVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 in_stack_fffffffffffffe88;
  void **ppvVar12;
  char *local_148;
  uchar *local_140;
  long local_138;
  ulong local_130;
  uchar auStack_128 [64];
  uint local_e8 [16];
  void *local_a8 [9];
  
  uVar5 = (undefined4)((ulong)in_stack_fffffffffffffe88 >> 0x20);
  local_138 = 0;
  local_130 = 0;
  if ((param_2 & 1) == 0) {
    *(undefined4 *)(param_1 + 0x7c) = 1;
    if (*(long *)(param_1 + 0x878) != 0) {
      EVP_CIPHER_CTX_reset();
      pEVar6 = *(EVP_CIPHER_CTX **)(param_1 + 0x878);
LAB_009c708c:
      lVar9 = param_1 + 0x880;
      RECORD_LAYER_reset_write_sequence(param_1 + 0xc58);
      goto LAB_009c7098;
    }
    pEVar6 = EVP_CIPHER_CTX_new();
    *(EVP_CIPHER_CTX **)(param_1 + 0x878) = pEVar6;
    if (pEVar6 != (EVP_CIPHER_CTX *)0x0) goto LAB_009c708c;
    ERR_new();
    uVar11 = 0x1d1;
LAB_009c75ec:
    ERR_set_debug("ssl/tls13_enc.c",uVar11,"tls13_change_cipher_state");
    uVar11 = 0xc0100;
    goto LAB_009c76d0;
  }
  if (*(long *)(param_1 + 0x848) == 0) {
    pEVar6 = EVP_CIPHER_CTX_new();
    *(EVP_CIPHER_CTX **)(param_1 + 0x848) = pEVar6;
    if (pEVar6 == (EVP_CIPHER_CTX *)0x0) {
      ERR_new();
      uVar11 = 0x1c2;
      goto LAB_009c75ec;
    }
  }
  else {
    EVP_CIPHER_CTX_reset();
    pEVar6 = *(EVP_CIPHER_CTX **)(param_1 + 0x848);
  }
  lVar9 = param_1 + 0x850;
  RECORD_LAYER_reset_read_sequence(param_1 + 0xc58);
LAB_009c7098:
  if ((((param_2 ^ 0xffffffff) & 0x12) == 0) || (((param_2 >> 5 & 1) != 0 && ((param_2 & 1) != 0))))
  {
    if ((param_2 >> 6 & 1) == 0) {
      if ((param_2 >> 7 & 1) == 0) {
        local_140 = (uchar *)(param_1 + 0x6c4);
        lVar7 = 0;
        lVar10 = 0;
        lVar3 = param_1 + 0x5c4;
        pcVar8 = "c ap traffic";
        local_148 = "CLIENT_TRAFFIC_SECRET_0";
      }
      else {
        lVar3 = param_1 + 0x584;
        lVar7 = param_1 + 0x644;
        ssl_handshake_md(param_1);
        iVar2 = EVP_MD_get_size();
        local_140 = (uchar *)(param_1 + 0x704);
        lVar10 = (long)iVar2;
        pcVar8 = "c hs traffic";
        local_148 = "CLIENT_HANDSHAKE_TRAFFIC_SECRET";
      }
      goto LAB_009c7304;
    }
    lVar3 = SSL_SESSION_get0_cipher(*(undefined8 *)(param_1 + 0x918));
    cnt = BIO_ctrl(*(BIO **)(param_1 + 0x188),3,0,local_a8);
    if ((long)cnt < 1) {
      ERR_new();
      ERR_set_debug("ssl/tls13_enc.c",0x1eb,"tls13_change_cipher_state");
      uVar11 = 0x14c;
LAB_009c76d0:
      ossl_statem_fatal(param_1,0x50,uVar11,0);
      uVar11 = 0;
      goto joined_r0x009c76e0;
    }
    if (((*(int *)(param_1 + 0x84) == 2) && (*(int *)(param_1 + 0x1d40) != 0)) &&
       (*(int *)(*(long *)(param_1 + 0x918) + 0x354) == 0)) {
      if ((*(long *)(param_1 + 0x920) != 0) &&
         (*(int *)(param_1 + 0x1d40) == *(int *)(*(long *)(param_1 + 0x920) + 0x354))) {
        lVar3 = SSL_SESSION_get0_cipher();
        goto joined_r0x009c7678;
      }
      ERR_new();
      uVar11 = 0x1fa;
LAB_009c76bc:
      ERR_set_debug("ssl/tls13_enc.c",uVar11,"tls13_change_cipher_state");
      uVar11 = 0xc0103;
      goto LAB_009c76d0;
    }
joined_r0x009c7678:
    if (lVar3 == 0) {
      ERR_new();
      ERR_set_debug("ssl/tls13_enc.c",0x200,"tls13_change_cipher_state");
      uVar11 = 0xdb;
      goto LAB_009c76d0;
    }
    ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
    if (ctx == (EVP_MD_CTX *)0x0) {
      ERR_new();
      uVar11 = 0x20b;
      goto LAB_009c75ec;
    }
    iVar2 = ssl_cipher_get_evp_cipher(*(undefined8 *)(param_1 + 0x9a8),lVar3,&local_138);
    if (iVar2 == 0) {
      ossl_statem_send_fatal(param_1,0x50);
LAB_009c7648:
      EVP_MD_CTX_free(ctx);
      goto joined_r0x009c7654;
    }
    type = (EVP_MD *)ssl_md(*(undefined8 *)(param_1 + 0x9a8),*(undefined4 *)(lVar3 + 0x40));
    if (((type == (EVP_MD *)0x0) || (iVar2 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0), iVar2 == 0))
       || ((iVar2 = EVP_DigestUpdate(ctx,local_a8[0],cnt), iVar2 == 0 ||
           (iVar2 = EVP_DigestFinal_ex(ctx,auStack_128,local_e8), iVar2 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/tls13_enc.c",0x21e,"tls13_change_cipher_state");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      goto LAB_009c7648;
    }
    local_130 = (ulong)local_e8[0];
    lVar3 = param_1 + 0x544;
    EVP_MD_CTX_free(ctx);
    uVar11 = CONCAT44(uVar5,1);
    iVar2 = tls13_hkdf_expand(param_1,type,lVar3,"e exp master",0xc,auStack_128,local_130,
                              param_1 + 0x804,local_130,uVar11);
    uVar5 = (undefined4)((ulong)uVar11 >> 0x20);
    if (iVar2 == 0) {
      ERR_new();
      uVar11 = 0x22b;
      goto LAB_009c76bc;
    }
    iVar2 = ssl_log_secret(param_1,"EARLY_EXPORTER_SECRET",param_1 + 0x804,local_130);
    if (iVar2 == 0) goto joined_r0x009c7654;
    local_140 = auStack_128;
    lVar7 = 0;
    lVar10 = 0;
    pcVar8 = "c e traffic";
    local_148 = "CLIENT_EARLY_TRAFFIC_SECRET";
    uVar11 = 0xb;
    if ((param_2 >> 6 & 1) == 0) goto LAB_009c7310;
LAB_009c734c:
    if (pcVar8 == "s ap traffic") {
      __dest = (void *)(param_1 + 0x6c4);
LAB_009c73e4:
      memcpy(__dest,auStack_128,local_130);
      bVar1 = false;
    }
    else {
      if (pcVar8 == "s hs traffic") {
        __dest = (void *)(param_1 + 0x704);
        goto LAB_009c73e4;
      }
      bVar1 = false;
      if (pcVar8 == "c ap traffic") {
        uVar4 = ssl_handshake_md(param_1);
        bVar1 = true;
        iVar2 = tls13_hkdf_expand(param_1,uVar4,lVar3,"res master",10,auStack_128,local_130,
                                  param_1 + 0x604,local_130,CONCAT44(uVar5,1));
        if (iVar2 == 0) goto joined_r0x009c7654;
      }
    }
    if (local_138 != 0) {
      ppvVar12 = local_a8;
      iVar2 = FUN_009c7704(param_1,param_2 & 2,type,local_138,lVar3,local_140,pcVar8,uVar11,local_e8
                           ,ppvVar12,lVar9,pEVar6);
      uVar5 = (undefined4)((ulong)ppvVar12 >> 0x20);
      if (iVar2 != 0) {
        if (pcVar8 == "s ap traffic") {
          memcpy((void *)(param_1 + 0x784),local_e8,local_130);
          uVar11 = ssl_handshake_md(param_1);
          uVar4 = CONCAT44(uVar5,1);
          iVar2 = tls13_hkdf_expand(param_1,uVar11,lVar3,"exp master",10,local_140,local_130,
                                    param_1 + 0x7c4,local_130,uVar4);
          uVar5 = (undefined4)((ulong)uVar4 >> 0x20);
          if ((iVar2 == 0) ||
             (iVar2 = ssl_log_secret(param_1,"EXPORTER_SECRET",param_1 + 0x7c4,local_130),
             iVar2 == 0)) goto joined_r0x009c7654;
        }
        else if (bVar1) {
          memcpy((void *)(param_1 + 0x744),local_e8,local_130);
        }
        iVar2 = ssl_log_secret(param_1,local_148,local_e8,local_130);
        if (iVar2 != 0) {
          if (lVar7 != 0) {
            uVar11 = ssl_handshake_md(param_1);
            iVar2 = tls13_hkdf_expand(param_1,uVar11,local_e8,"finished",8,0,0,lVar7,lVar10,
                                      CONCAT44(uVar5,1));
            if (iVar2 == 0) goto joined_r0x009c7654;
          }
          uVar5 = 2;
          if (*(int *)(param_1 + 0x38) != 0 || pcVar8 != "c e traffic") {
            uVar5 = 0;
          }
          *(undefined4 *)(param_1 + 0x7c) = uVar5;
          uVar11 = 1;
          goto joined_r0x009c76e0;
        }
      }
    }
  }
  else {
    if ((param_2 >> 7 & 1) == 0) {
      local_140 = auStack_128;
      lVar7 = 0;
      lVar10 = 0;
      lVar3 = param_1 + 0x5c4;
      pcVar8 = "s ap traffic";
      local_148 = "SERVER_TRAFFIC_SECRET_0";
    }
    else {
      local_140 = auStack_128;
      lVar3 = param_1 + 0x584;
      lVar7 = param_1 + 0x684;
      ssl_handshake_md(param_1);
      iVar2 = EVP_MD_get_size();
      lVar10 = (long)iVar2;
      pcVar8 = "s hs traffic";
      local_148 = "SERVER_HANDSHAKE_TRAFFIC_SECRET";
    }
LAB_009c7304:
    type = (EVP_MD *)0x0;
    uVar11 = 0xc;
    if ((param_2 >> 6 & 1) != 0) goto LAB_009c734c;
LAB_009c7310:
    type = (EVP_MD *)ssl_handshake_md(param_1);
    local_138 = *(long *)(param_1 + 800);
    iVar2 = ssl3_digest_cached_records(param_1,1);
    if ((iVar2 != 0) &&
       (iVar2 = ssl_handshake_hash(param_1,auStack_128,0x40,&local_130), iVar2 != 0))
    goto LAB_009c734c;
  }
joined_r0x009c7654:
  uVar11 = 0;
joined_r0x009c76e0:
  if ((param_2 >> 6 & 1) != 0) {
    ssl_evp_cipher_free(local_138);
  }
  OPENSSL_cleanse(local_a8,0x40);
  OPENSSL_cleanse(local_e8,0x40);
  return uVar11;
}

