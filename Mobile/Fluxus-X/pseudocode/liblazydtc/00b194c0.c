/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b194c0
 */

undefined8
OSSL_HTTP_proxy_connect
          (BIO *param_1,char *param_2,char *param_3,char *param_4,char *param_5,int param_6,
          BIO *param_7,char *param_8)

{
  int iVar1;
  uint uVar2;
  char *buf;
  BIO_METHOD *type;
  BIO *b;
  time_t tVar3;
  size_t sVar4;
  uchar *f;
  uchar *t;
  long lVar5;
  char *pcVar6;
  ulong uVar7;
  long lVar8;
  undefined8 uVar9;
  long lVar10;
  ulong uVar11;
  
  buf = CRYPTO_malloc(0x2000,"crypto/http/http_client.c",0x516);
  type = BIO_f_buffer();
  b = BIO_new(type);
  if (param_6 < 1) {
    lVar10 = 0;
    if (param_1 != (BIO *)0x0) goto LAB_00b19538;
LAB_00b19770:
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x520,"OSSL_HTTP_proxy_connect");
    ERR_set_error(0x3d,0xc0102,0);
LAB_00b197a0:
    uVar9 = 0;
LAB_00b197a4:
    if (b == (BIO *)0x0) goto LAB_00b197cc;
  }
  else {
    tVar3 = time((time_t *)0x0);
    lVar10 = tVar3 + param_6;
    if (param_1 == (BIO *)0x0) goto LAB_00b19770;
LAB_00b19538:
    if ((param_2 == (char *)0x0) || ((param_7 != (BIO *)0x0 && (param_8 == (char *)0x0))))
    goto LAB_00b19770;
    if ((param_3 == (char *)0x0) || (*param_3 == '\0')) {
      param_3 = "443";
    }
    if ((buf == (char *)0x0) || (b == (BIO *)0x0)) {
      pcVar6 = "%s: out of memory";
LAB_00b19808:
      BIO_printf(param_7,pcVar6,param_8);
      goto LAB_00b197a0;
    }
    BIO_push(b,param_1);
    BIO_printf(b,"CONNECT %s:%s HTTP/1.0\r\n",param_2,param_3);
    BIO_printf(b,"Proxy-Connection: Keep-Alive\r\n");
    if (param_4 == (char *)0x0) {
LAB_00b196ac:
      BIO_printf(b,"\r\n");
      do {
        lVar5 = BIO_ctrl(b,0xb,0,(void *)0x0);
        if ((int)lVar5 != 0) break;
        iVar1 = BIO_test_flags(b,8);
      } while (iVar1 != 0);
      do {
        iVar1 = BIO_wait(b,lVar10,100);
        if (iVar1 < 1) {
          pcVar6 = "timed out";
          if (iVar1 != 0) {
            pcVar6 = "failed waiting for data";
          }
          BIO_printf(param_7,"%s: HTTP CONNECT %s\n",param_8,pcVar6);
          goto LAB_00b197a0;
        }
        uVar2 = BIO_gets(b,buf,0x2000);
      } while ((int)uVar2 < 0xd);
      iVar1 = strncmp(buf,"HTTP/",5);
      if (iVar1 != 0) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x56c,"OSSL_HTTP_proxy_connect");
        ERR_set_error(0x3d,0x7e,0);
        pcVar6 = "%s: HTTP CONNECT failed, non-HTTP response\n";
        goto LAB_00b19808;
      }
      iVar1 = strncmp(buf + 5,"1.",2);
      if (iVar1 != 0) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x574,"OSSL_HTTP_proxy_connect");
        ERR_set_error(0x3d,0x6a,0);
        BIO_printf(param_7,"%s: HTTP CONNECT failed, bad HTTP version %.*s\n",param_8,3,buf + 5);
        goto LAB_00b197a0;
      }
      pcVar6 = buf + 8;
      iVar1 = strncmp(pcVar6," 2",2);
      if (iVar1 != 0) {
        lVar10 = (long)(int)uVar2;
        lVar5 = (ulong)uVar2 << 0x20;
        do {
          lVar8 = lVar5;
          if (lVar10 < 1) break;
          iVar1 = ossl_ctype_check(buf[lVar10 + -1],8);
          lVar10 = lVar10 + -1;
          lVar5 = lVar8 + -0x100000000;
        } while (iVar1 != 0);
        buf[lVar8 >> 0x20] = '\0';
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x582,"OSSL_HTTP_proxy_connect");
        ERR_set_error(0x3d,100,"reason=%s",pcVar6);
        BIO_printf(param_7,"%s: HTTP CONNECT failed, reason=%s\n",param_8,pcVar6);
        goto LAB_00b197a0;
      }
      uVar9 = 1;
      do {
        iVar1 = BIO_gets(b,buf,0x2000);
      } while (2 < iVar1);
      goto LAB_00b197a4;
    }
    sVar4 = strlen(param_4);
    uVar11 = sVar4 + 1;
    if (param_5 != (char *)0x0) {
      sVar4 = strlen(param_5);
      uVar11 = sVar4 + uVar11;
    }
    f = CRYPTO_malloc((int)(uVar11 + 1),"crypto/http/http_client.c",0x53b);
    if (f != (uchar *)0x0) {
      if (param_5 == (char *)0x0) {
        param_5 = "";
      }
      iVar1 = BIO_snprintf((char *)f,uVar11 + 1,"%s:%s",param_4,param_5);
      if (iVar1 == (int)uVar11) {
        uVar7 = uVar11 / 3;
        if (uVar11 != uVar7 * 3) {
          uVar7 = uVar7 + 1;
        }
        t = CRYPTO_malloc((uint)(uVar7 << 2) | 1,"crypto/http/http_client.c",0x4ff);
        if (t != (uchar *)0x0) {
          iVar1 = EVP_EncodeBlock(t,f,iVar1);
          if ((-1 < iVar1) && ((ulong)(long)iVar1 <= uVar7 << 2)) {
            BIO_printf(b,"Proxy-Authorization: Basic %s\r\n",(char *)t);
            sVar4 = strlen((char *)t);
            CRYPTO_clear_free(t,sVar4,"crypto/http/http_client.c",0x544);
            CRYPTO_clear_free(f,uVar11,"crypto/http/http_client.c",0x547);
            goto LAB_00b196ac;
          }
          CRYPTO_free(t);
        }
      }
      CRYPTO_clear_free(f,uVar11,"crypto/http/http_client.c",0x547);
    }
    uVar9 = 0;
  }
  BIO_ctrl(b,0xb,0,(void *)0x0);
  BIO_pop(b);
  BIO_free(b);
LAB_00b197cc:
  CRYPTO_free(buf);
  return uVar9;
}

