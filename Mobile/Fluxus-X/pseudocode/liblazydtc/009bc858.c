/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc858
 */

undefined4 SSL_CTX_use_serverinfo_file(long param_1,void *param_2)

{
  long lVar1;
  bool bVar2;
  char *__s1;
  int iVar3;
  undefined4 uVar4;
  BIO_METHOD *type;
  BIO *bp;
  long lVar5;
  size_t sVar6;
  void *pvVar7;
  undefined8 uVar8;
  void *addr;
  long lVar9;
  long lVar10;
  char *local_80;
  char *local_78;
  size_t local_70;
  uchar *local_68;
  
  local_70 = 0;
  local_68 = (uchar *)0x0;
  local_80 = (char *)0x0;
  local_78 = (char *)0x0;
  if ((param_1 == 0) || (param_2 == (void *)0x0)) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x337,"SSL_CTX_use_serverinfo_file");
    ERR_set_error(0x14,0xc0102,0);
    addr = (void *)0x0;
    uVar4 = 0;
    bp = (BIO *)0x0;
  }
  else {
    type = BIO_s_file();
    bp = BIO_new(type);
    if (bp == (BIO *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x33d,"SSL_CTX_use_serverinfo_file");
      uVar4 = 0x80007;
    }
    else {
      lVar5 = BIO_ctrl(bp,0x6c,3,param_2);
      if (0 < (int)lVar5) {
        iVar3 = PEM_read_bio(bp,&local_78,&local_80,&local_68,(long *)&local_70);
        if (iVar3 == 0) {
          pvVar7 = (void *)0x0;
        }
        else {
          lVar10 = 0;
          addr = (void *)0x0;
          lVar5 = 0;
          do {
            __s1 = local_78;
            sVar6 = strlen(local_78);
            if ((sVar6 & 0xffffffff) < 0xf) {
              ERR_new();
              uVar8 = 0x357;
LAB_009bcbe8:
              ERR_set_debug("ssl/ssl_rsa.c",uVar8,"SSL_CTX_use_serverinfo_file");
              uVar8 = 0x188;
LAB_009bcc1c:
              ERR_set_error(0x14,uVar8,0);
              goto LAB_009bcc24;
            }
            iVar3 = strncmp(__s1,"SERVERINFO FOR ",0xf);
            if (iVar3 != 0) {
              if ((sVar6 & 0xffffffff) < 0x11) {
                ERR_new();
                uVar8 = 0x35e;
                goto LAB_009bcbe8;
              }
              iVar3 = strncmp(__s1,"SERVERINFOV2 FOR ",0x11);
              if (iVar3 == 0) {
                if (((long)local_70 < 8) ||
                   ((ulong)CONCAT11(local_68[6],local_68[7]) != local_70 - 8)) {
                  ERR_new();
                  uVar8 = 0x377;
                  goto LAB_009bcbc0;
                }
                bVar2 = false;
                lVar9 = 0;
                goto LAB_009bc998;
              }
              ERR_new();
              ERR_set_debug("ssl/ssl_rsa.c",0x362,"SSL_CTX_use_serverinfo_file");
              uVar8 = 0x187;
              goto LAB_009bcc1c;
            }
            if (((long)local_70 < 4) || ((ulong)CONCAT11(local_68[2],local_68[3]) != local_70 - 4))
            {
              ERR_new();
              uVar8 = 0x36f;
LAB_009bcbc0:
              ERR_set_debug("ssl/ssl_rsa.c",uVar8,"SSL_CTX_use_serverinfo_file");
              uVar8 = 0x186;
              goto LAB_009bcc1c;
            }
            bVar2 = true;
            lVar9 = 4;
LAB_009bc998:
            lVar1 = local_70 + lVar5 + lVar9;
            pvVar7 = CRYPTO_realloc(addr,(int)lVar1,"ssl/ssl_rsa.c",0x37d);
            if (pvVar7 == (void *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/ssl_rsa.c",0x37f,"SSL_CTX_use_serverinfo_file");
              uVar8 = 0xc0100;
              goto LAB_009bcc1c;
            }
            if (bVar2) {
              *(undefined4 *)((long)pvVar7 + lVar5) = 0xd0010000;
            }
            memcpy((void *)((long)pvVar7 + lVar5 + lVar9),local_68,local_70);
            CRYPTO_free(local_78);
            local_78 = (char *)0x0;
            CRYPTO_free(local_80);
            local_80 = (char *)0x0;
            CRYPTO_free(local_68);
            local_68 = (uchar *)0x0;
            iVar3 = PEM_read_bio(bp,&local_78,&local_80,&local_68,(long *)&local_70);
            lVar10 = lVar10 + -1;
            addr = pvVar7;
            lVar5 = lVar1;
          } while (iVar3 != 0);
          if (lVar10 != 0) {
            uVar4 = SSL_CTX_use_serverinfo_ex(param_1,2,pvVar7,lVar1);
            goto LAB_009bcc28;
          }
        }
        ERR_new();
        ERR_set_debug("ssl/ssl_rsa.c",0x34f,"SSL_CTX_use_serverinfo_file");
        ERR_set_error(0x14,0x185,0);
        uVar4 = 0;
        addr = pvVar7;
        goto LAB_009bcc28;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_rsa.c",0x341,"SSL_CTX_use_serverinfo_file");
      uVar4 = 0x80002;
    }
    ERR_set_error(0x14,uVar4,0);
    addr = (void *)0x0;
LAB_009bcc24:
    uVar4 = 0;
  }
LAB_009bcc28:
  CRYPTO_free(local_78);
  CRYPTO_free(local_80);
  CRYPTO_free(local_68);
  CRYPTO_free(addr);
  BIO_free(bp);
  return uVar4;
}

