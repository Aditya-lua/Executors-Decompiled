/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7038
 */

undefined4
PEM_read_bio_ex(BIO *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
               long *param_5,uint param_6)

{
  uint uVar1;
  long lVar2;
  bool bVar3;
  bool bVar4;
  char cVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  BIO_METHOD *type;
  char *pcVar9;
  char *buf;
  void *pvVar10;
  size_t __n;
  long lVar11;
  undefined8 uVar12;
  uint uVar13;
  undefined4 uVar14;
  char *pcVar15;
  BIO *bp;
  BIO *bp_00;
  EVP_ENCODE_CTX *ctx;
  BIO *local_90;
  long *local_70;
  int local_68;
  int local_64;
  
  *param_5 = 0;
  *param_3 = 0;
  *param_2 = 0;
  *param_4 = 0;
  if ((~param_6 & 6) == 0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x3a5,"PEM_read_bio_ex");
    ERR_set_error(9,0x80106,0);
    bp = (BIO *)0x0;
    bp_00 = (BIO *)0x0;
    pcVar15 = (char *)0x0;
    ctx = (EVP_ENCODE_CTX *)0x0;
    uVar14 = 0;
    goto LAB_00ab72f4;
  }
  uVar1 = param_6 & 1;
  if ((param_6 & 1) == 0) {
    type = BIO_s_mem();
  }
  else {
    type = (BIO_METHOD *)BIO_s_secmem();
  }
  bp = BIO_new(type);
  bp_00 = BIO_new(type);
  if ((bp == (BIO *)0x0) || (bp_00 == (BIO *)0x0)) {
    ERR_new();
    pcVar15 = "PEM_read_bio_ex";
    uVar12 = 0x3ad;
LAB_00ab72d0:
    ERR_set_debug("crypto/pem/pem_lib.c",uVar12,pcVar15);
    ERR_set_error(9,0xc0100,0);
    pcVar15 = (char *)0x0;
LAB_00ab72ec:
    ctx = (EVP_ENCODE_CTX *)0x0;
  }
  else {
    if (uVar1 == 0) {
      pcVar9 = CRYPTO_malloc(0x100,"crypto/pem/pem_lib.c",0xe8);
    }
    else {
      pcVar9 = (char *)CRYPTO_secure_malloc(0x100,"crypto/pem/pem_lib.c",0xe7);
    }
    if (pcVar9 == (char *)0x0) {
      ERR_new();
      pcVar15 = "get_name";
      uVar12 = 0x2f3;
      goto LAB_00ab72d0;
    }
    iVar7 = BIO_gets(param_1,pcVar9,0xff);
    if (0 < iVar7) {
      uVar12 = 1;
      do {
        iVar7 = FUN_00ab79a0(pcVar9,iVar7,param_6 & 0xfffffffb,uVar12);
        iVar8 = strncmp(pcVar9,"-----BEGIN ",0xb);
        if (((5 < iVar7) && (iVar8 == 0)) &&
           (iVar8 = strncmp(pcVar9 + (long)iVar7 + -6,"-----\n",6), iVar8 == 0)) {
          iVar8 = iVar7 + -0x10;
          pcVar9[(long)iVar7 + -6] = '\0';
          if (uVar1 == 0) {
            pcVar15 = CRYPTO_malloc(iVar8,"crypto/pem/pem_lib.c",0xe8);
          }
          else {
            pcVar15 = (char *)CRYPTO_secure_malloc((long)iVar8,"crypto/pem/pem_lib.c",0xe7);
          }
          if (pcVar15 == (char *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/pem/pem_lib.c",0x30b,"get_name");
            ERR_set_error(9,0xc0100,0);
            bVar6 = false;
            if (uVar1 != 0) goto LAB_00ab7414;
            goto LAB_00ab7214;
          }
          memcpy(pcVar15,pcVar9 + 0xb,(long)iVar8);
          bVar6 = true;
          goto joined_r0x00ab7410;
        }
        iVar7 = BIO_gets(param_1,pcVar9,0xff);
        uVar12 = 0;
      } while (0 < iVar7);
    }
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x2fb,"get_name");
    ERR_set_error(9,0x6c,0);
    pcVar15 = (char *)0x0;
    bVar6 = false;
joined_r0x00ab7410:
    if (uVar1 != 0) {
LAB_00ab7414:
      CRYPTO_secure_clear_free(pcVar9,0x100,"crypto/pem/pem_lib.c",0xe0);
      pcVar9 = pcVar15;
      if (bVar6) goto LAB_00ab7230;
LAB_00ab7798:
      uVar14 = 0;
      ctx = (EVP_ENCODE_CTX *)0x0;
      goto LAB_00ab72f4;
    }
LAB_00ab7214:
    CRYPTO_free(pcVar9);
    pcVar9 = pcVar15;
    if (!bVar6) goto LAB_00ab7798;
LAB_00ab7230:
    if (uVar1 == 0) {
      buf = CRYPTO_malloc(0x100,"crypto/pem/pem_lib.c",0xe8);
    }
    else {
      buf = (char *)CRYPTO_secure_malloc(0x100,"crypto/pem/pem_lib.c",0xe7);
    }
    pcVar15 = pcVar9;
    if (buf == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pem/pem_lib.c",0x337,"get_header_and_data");
      ERR_set_error(9,0xc0100,0);
      goto LAB_00ab72ec;
    }
    iVar7 = BIO_gets(param_1,buf,0xff);
    if (0 < iVar7) {
      cVar5 = '\0';
      bVar6 = false;
      bVar3 = false;
      local_90 = bp;
      while( true ) {
        while( true ) {
          bVar4 = false;
          if (iVar7 == 0xfe) {
            bVar4 = buf[0xfd] != '\n';
          }
          if (cVar5 == '\0') {
            pvVar10 = memchr(buf,0x3a,(long)iVar7);
            cVar5 = pvVar10 != (void *)0x0;
          }
          iVar8 = strncmp(buf,"-----END ",9);
          uVar13 = 0xfffffffb;
          if (iVar8 != 0 && cVar5 != '\x01') {
            uVar13 = 0xffffffff;
          }
          iVar7 = FUN_00ab79a0(buf,iVar7,uVar13 & param_6,0);
          if (*buf == '\n') break;
          iVar8 = strncmp(buf,"-----END ",9);
          if (iVar8 == 0) {
            __n = strlen(pcVar9);
            iVar7 = strncmp(buf + 9,pcVar9,__n);
            if ((iVar7 == 0) && (iVar7 = strncmp(buf + 9 + __n,"-----\n",6), iVar7 == 0)) {
              bVar6 = true;
              if (cVar5 != '\0') {
                local_90 = bp_00;
                bp_00 = bp;
              }
              goto joined_r0x00ab7688;
            }
            ERR_new();
            uVar12 = 0x36b;
            goto LAB_00ab7638;
          }
          if (bVar6) {
            ERR_new();
            uVar12 = 0x375;
            goto LAB_00ab7638;
          }
          iVar8 = BIO_puts(local_90,buf);
          if ((iVar8 < 0) ||
             ((bVar6 = false, cVar5 == '\x02' && (bVar6 = iVar7 != 0x41, 0x41 < iVar7))))
          goto LAB_00ab764c;
          iVar7 = BIO_gets(param_1,buf,0xff);
          bVar3 = bVar4;
          if (iVar7 < 1) goto LAB_00ab75a4;
        }
        if (bVar3) {
        }
        else {
          if (cVar5 == '\x02') {
            ERR_new();
            uVar12 = 0x35c;
            goto LAB_00ab7638;
          }
          cVar5 = '\x02';
          local_90 = bp_00;
        }
        iVar7 = BIO_gets(param_1,buf,0xff);
        if (iVar7 < 1) break;
        bVar3 = bVar4;
      }
    }
LAB_00ab75a4:
    ERR_new();
    uVar12 = 0x33f;
LAB_00ab7638:
    ERR_set_debug("crypto/pem/pem_lib.c",uVar12,"get_header_and_data");
    ERR_set_error(9,0x66,0);
LAB_00ab764c:
    bVar6 = false;
    local_90 = bp_00;
    bp_00 = bp;
joined_r0x00ab7688:
    bp = bp_00;
    bp_00 = local_90;
    if (uVar1 == 0) {
      CRYPTO_free(buf);
    }
    else {
      CRYPTO_secure_clear_free(buf,0x100,"crypto/pem/pem_lib.c",0xe0);
    }
    if (!bVar6) goto LAB_00ab7798;
    BIO_ctrl(bp_00,0x73,0,&local_70);
    iVar7 = (int)*local_70;
    local_64 = iVar7;
    if (iVar7 == 0) goto LAB_00ab7798;
    ctx = (EVP_ENCODE_CTX *)EVP_ENCODE_CTX_new();
    if (ctx == (EVP_ENCODE_CTX *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pem/pem_lib.c",0x3bf,"PEM_read_bio_ex");
      uVar12 = 0xc0100;
LAB_00ab77f0:
      ERR_set_error(9,uVar12,0);
    }
    else {
      EVP_DecodeInit(ctx);
      iVar7 = EVP_DecodeUpdate(ctx,(uchar *)local_70[1],&local_64,(uchar *)local_70[1],iVar7);
      if ((iVar7 < 0) ||
         (iVar7 = EVP_DecodeFinal(ctx,(uchar *)(local_70[1] + (long)local_64),&local_68), iVar7 < 0)
         ) {
        ERR_new();
        ERR_set_debug("crypto/pem/pem_lib.c",0x3c8,"PEM_read_bio_ex");
        uVar12 = 100;
        goto LAB_00ab77f0;
      }
      lVar2 = (long)local_64;
      local_64 = (int)(lVar2 + local_68);
      *local_70 = lVar2 + local_68;
      lVar11 = BIO_ctrl(bp,3,0,(void *)0x0);
      lVar2 = (lVar11 << 0x20) + 0x100000000;
      if (uVar1 == 0) {
        pvVar10 = CRYPTO_malloc((int)((ulong)lVar2 >> 0x20),"crypto/pem/pem_lib.c",0xe8);
        *param_3 = pvVar10;
        pvVar10 = CRYPTO_malloc(local_64,"crypto/pem/pem_lib.c",0xe8);
      }
      else {
        uVar12 = CRYPTO_secure_malloc(lVar2 >> 0x20,"crypto/pem/pem_lib.c",0xe7);
        *param_3 = uVar12;
        pvVar10 = (void *)CRYPTO_secure_malloc((long)local_64,"crypto/pem/pem_lib.c",0xe7);
      }
      *param_4 = pvVar10;
      if ((pvVar10 != (void *)0x0) && (pvVar10 = (void *)*param_3, pvVar10 != (void *)0x0)) {
        iVar7 = (int)lVar11;
        if (iVar7 != 0) {
          iVar8 = BIO_read(bp,pvVar10,iVar7);
          if (iVar8 != iVar7) goto LAB_00ab789c;
          pvVar10 = (void *)*param_3;
        }
        *(undefined1 *)((long)pvVar10 + ((lVar11 << 0x20) >> 0x20)) = 0;
        iVar7 = BIO_read(bp_00,(void *)*param_4,local_64);
        if (iVar7 == local_64) {
          uVar14 = 1;
          pcVar15 = (char *)0x0;
          *param_5 = (long)iVar7;
          *param_2 = pcVar9;
          goto LAB_00ab72f4;
        }
      }
LAB_00ab789c:
      if (uVar1 == 0) {
        CRYPTO_free((void *)*param_3);
        *param_3 = 0;
        CRYPTO_free((void *)*param_4);
      }
      else {
        CRYPTO_secure_clear_free((void *)*param_3,0,"crypto/pem/pem_lib.c",0xe0);
        *param_3 = 0;
        CRYPTO_secure_clear_free(*param_4,0,"crypto/pem/pem_lib.c",0xe0);
      }
      *param_4 = 0;
    }
  }
  uVar14 = 0;
LAB_00ab72f4:
  EVP_ENCODE_CTX_free(ctx);
  if ((param_6 & 1) == 0) {
    CRYPTO_free(pcVar15);
  }
  else {
    CRYPTO_secure_clear_free(pcVar15,0,"crypto/pem/pem_lib.c",0xe0);
  }
  BIO_free(bp);
  BIO_free(bp_00);
  return uVar14;
}

