/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c4740
 */

uint tls1_check_chain(SSL *param_1,X509 *param_2,long param_3,undefined8 param_4,uint param_5)

{
  int iVar1;
  bool bVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  uint uVar7;
  long lVar8;
  undefined8 uVar9;
  BIO_METHOD *pBVar10;
  X509_NAME *pXVar11;
  X509_NAME *pXVar12;
  X509 *a;
  long lVar13;
  char cVar14;
  uchar *puVar15;
  ulong uVar16;
  BUF_MEM *pBVar17;
  uint uVar18;
  BUF_MEM *pBVar19;
  void *pvVar20;
  ulong uVar21;
  dtls1_state_st *pdVar22;
  BIO *pBVar23;
  uint uVar24;
  BIO *pBVar25;
  uchar *local_70;
  ulong local_68;
  
  pdVar22 = param_1[3].d1;
  uVar24 = *(uint *)(pdVar22->cookie + 0x18);
  if (param_5 == 0xffffffff) {
    if (((param_2 == (X509 *)0x0) || (param_3 == 0)) ||
       (lVar8 = ssl_cert_lookup_by_pkey(param_3,&local_68), lVar8 == 0)) {
      return 0;
    }
    uVar18 = 0x50;
    if ((*(uint *)(pdVar22->cookie + 0x18) & 0x30001) != 0) {
      uVar18 = 0x6f0;
    }
    local_70 = param_1[1].sid_ctx + ((long)(local_68 << 0x20) >> 0x1e) + -4;
    uVar7 = 1;
    uVar16 = local_68;
    if ((uVar24 & 0x30000) != 0) goto LAB_009c4854;
LAB_009c4804:
    uVar24 = 0;
    uVar16 = local_68;
  }
  else {
    if (param_5 == 0xfffffffe) {
      puVar15 = *(uchar **)pdVar22;
      local_68 = ((long)puVar15 - (long)(pdVar22->cookie + 0x1c) >> 3) * -0x3333333333333333;
      param_5 = (uint)local_68;
    }
    else {
      puVar15 = pdVar22->cookie + (long)(int)param_5 * 0x28 + 0x1c;
      local_68 = (ulong)param_5;
    }
    param_2 = *(X509 **)puVar15;
    local_70 = param_1[1].sid_ctx + (long)(int)param_5 * 4 + -4;
    if ((param_2 == (X509 *)0x0) || (param_3 = *(long *)(puVar15 + 8), param_3 == 0)) {
LAB_009c4894:
      uVar18 = 0;
      uVar24 = 0;
      goto LAB_009c4e38;
    }
    param_4 = *(undefined8 *)(puVar15 + 0x10);
    uVar18 = 0;
    uVar7 = uVar24 & 0x30001;
    uVar16 = local_68;
    if ((uVar24 & 0x30000) == 0) goto LAB_009c4804;
LAB_009c4854:
    iVar3 = X509_chain_check_suiteb(0,param_2,param_4,uVar24 & 0x30000);
    uVar4 = 0;
    if (iVar3 != 0 || uVar18 != 0) {
      uVar4 = uVar18 | 0x800;
    }
    uVar24 = (uint)(iVar3 == 0) << 0xb;
    if (uVar18 == 0) {
      uVar18 = uVar4;
      if (iVar3 != 0) goto LAB_009c4894;
    }
    else {
      uVar18 = uVar4;
    }
  }
  uVar4 = SSL_version(param_1);
  if ((((uVar4 & 0xffffff00) == 0x300) && (iVar3 = SSL_version(param_1), uVar7 != 0)) &&
     (0x302 < iVar3)) {
    iVar3 = 0;
    if ((param_1[1].enc_write_ctx == (EVP_CIPHER_CTX *)0x0) &&
       (iVar3 = 0, param_1[1].expand == (COMP_CTX *)0x0)) {
      if (((uint)uVar16 < 7) && ((0x7dU >> (ulong)((uint)uVar16 & 0x1f) & 1) != 0)) {
        uVar16 = -(uVar16 >> 0x1f & 1) & 0xfffffffc00000000 | (uVar16 & 0xffffffff) << 2;
        lVar8 = *(long *)(pdVar22->rcvd_cookie + 0x94);
        iVar3 = *(int *)(&DAT_0074cde0 + uVar16);
        if (lVar8 != 0) {
          uVar21 = *(ulong *)(pdVar22->rcvd_cookie + 0x9c);
          if (uVar21 == 0) {
            iVar5 = 2;
            if (uVar18 != 0) {
              iVar5 = 7;
            }
          }
          else {
            iVar5 = *(int *)(&DAT_0074ce00 + uVar16);
            uVar16 = 0;
            do {
              lVar13 = FUN_009c21e4(param_1,*(undefined2 *)(lVar8 + uVar16 * 2));
              if (((lVar13 != 0) && (*(int *)(lVar13 + 0xc) == 0x40)) &&
                 (*(int *)(lVar13 + 0x14) == iVar5)) break;
              uVar16 = uVar16 + 1;
            } while (uVar16 < uVar21);
            iVar5 = 2;
            if (uVar18 != 0) {
              iVar5 = 7;
            }
            if (uVar16 != uVar21) goto LAB_009c4910;
          }
LAB_009c4c8c:
          bVar2 = true;
          if (iVar5 != 0) {
            if (iVar5 == 2) goto LAB_009c4e38;
            if (iVar5 != 7) {
              return 0;
            }
          }
          goto LAB_009c496c;
        }
      }
      else {
        iVar3 = -1;
      }
    }
LAB_009c4910:
    if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
        (iVar5 = param_1->method->version, 0x303 < iVar5)) && (iVar5 != 0x10000)) {
      lVar8 = FUN_009c4f6c(param_1,param_2,param_3);
      if (lVar8 != 0) {
        uVar24 = uVar24 | 0x10;
      }
      uVar7 = uVar24;
LAB_009c4b58:
      uVar24 = uVar7 | 0x20;
      iVar5 = OPENSSL_sk_num(param_4);
      if (iVar5 < 1) {
        bVar2 = true;
      }
      else {
        iVar5 = 0;
        do {
          OPENSSL_sk_value(param_4,iVar5);
          if (iVar3 != -1) {
            iVar6 = X509_get_signature_nid();
            if (iVar3 == 0) {
              if ((((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
                   (iVar1 = param_1->method->version, 0x303 < iVar1)) && (iVar1 != 0x10000)) &&
                 (param_1[1].enc_write_ctx != (EVP_CIPHER_CTX *)0x0)) {
                bVar2 = true;
                pBVar23 = (BIO *)param_1[1].compress;
              }
              else {
                bVar2 = false;
                pBVar23 = param_1[0xb].bbio;
              }
              if (pBVar23 == (BIO *)0x0) goto LAB_009c4c6c;
              pBVar25 = (BIO *)0x0;
              while( true ) {
                if (bVar2) {
                  pBVar10 = (BIO_METHOD *)
                            FUN_009c21e4(param_1,*(undefined2 *)
                                                  ((param_1[1].enc_write_ctx)->oiv +
                                                  (long)pBVar25 * 2 + -0x18));
                }
                else {
                  pBVar10 = (&(param_1[0xb].wbio)->method)[(long)pBVar25];
                }
                if ((pBVar10 != (BIO_METHOD *)0x0) && (iVar6 == *(int *)((long)&pBVar10->bread + 4))
                   ) break;
                pBVar25 = (BIO *)((long)&pBVar25->method + 1);
                if (pBVar23 <= pBVar25) goto LAB_009c4c6c;
              }
            }
            else if (iVar6 != iVar3) {
LAB_009c4c6c:
              if (uVar18 != 0) {
                uVar24 = uVar7;
              }
              iVar5 = (uint)(uVar18 == 0) << 1;
              goto LAB_009c4c8c;
            }
          }
          iVar5 = iVar5 + 1;
          iVar6 = OPENSSL_sk_num(param_4);
          bVar2 = true;
        } while (iVar5 < iVar6);
      }
      goto LAB_009c496c;
    }
    if (iVar3 == -1) {
LAB_009c4b54:
      uVar7 = uVar24 | 0x10;
      goto LAB_009c4b58;
    }
    iVar5 = X509_get_signature_nid(param_2);
    if (iVar3 == 0) {
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
          (iVar6 = param_1->method->version, 0x303 < iVar6)) &&
         ((iVar6 != 0x10000 && (param_1[1].enc_write_ctx != (EVP_CIPHER_CTX *)0x0)))) {
        bVar2 = true;
        pBVar23 = (BIO *)param_1[1].compress;
      }
      else {
        bVar2 = false;
        pBVar23 = param_1[0xb].bbio;
      }
      if (pBVar23 != (BIO *)0x0) {
        pBVar25 = (BIO *)0x0;
        do {
          if (bVar2) {
            pBVar10 = (BIO_METHOD *)
                      FUN_009c21e4(param_1,*(undefined2 *)
                                            ((param_1[1].enc_write_ctx)->oiv +
                                            (long)pBVar25 * 2 + -0x18));
          }
          else {
            pBVar10 = (&(param_1[0xb].wbio)->method)[(long)pBVar25];
          }
          if ((pBVar10 != (BIO_METHOD *)0x0) && (iVar5 == *(int *)((long)&pBVar10->bread + 4)))
          goto LAB_009c4b54;
          pBVar25 = (BIO *)((long)&pBVar25->method + 1);
        } while (pBVar25 < pBVar23);
      }
    }
    else if (iVar5 == iVar3) goto LAB_009c4b54;
    if (uVar18 != 0) {
      uVar7 = uVar24;
      goto LAB_009c4b58;
    }
LAB_009c4e34:
    uVar18 = 0;
    goto LAB_009c4e38;
  }
  bVar2 = uVar7 != 0;
  if (uVar18 != 0) {
    uVar24 = uVar24 | 0x30;
  }
LAB_009c496c:
  iVar3 = FUN_009c517c(param_1,param_2,1);
  if (iVar3 == 0) {
    if (uVar18 == 0) goto LAB_009c4e38;
    iVar3 = param_1->server;
    uVar7 = uVar24;
  }
  else {
    uVar7 = uVar24 | 0x40;
    iVar3 = param_1->server;
  }
  if (iVar3 == 0) {
    uVar24 = uVar7 | 0x80;
LAB_009c49f4:
    if ((bool)(bVar2 ^ 1U | param_1->server != 0)) goto LAB_009c4a34;
    iVar3 = EVP_PKEY_is_a(param_3,&DAT_002db996);
    if (iVar3 == 0) {
      iVar3 = EVP_PKEY_is_a(param_3,&DAT_002c74e5);
      if (iVar3 != 0) {
        cVar14 = '\x02';
        pBVar17 = param_1[1].init_buf;
        goto joined_r0x009c4cd8;
      }
      iVar3 = EVP_PKEY_is_a(param_3,&DAT_002cf33a);
      if (iVar3 != 0) {
        cVar14 = '@';
        pBVar17 = param_1[1].init_buf;
        goto joined_r0x009c4cd8;
      }
      uVar24 = uVar24 | 0x400;
      pvVar20 = param_1[1].init_msg;
      if (pvVar20 != (void *)0x0) goto LAB_009c4d18;
      goto LAB_009c4e20;
    }
    cVar14 = '\x01';
    pBVar17 = param_1[1].init_buf;
joined_r0x009c4cd8:
    if (pBVar17 != (BUF_MEM *)0x0) {
      pBVar19 = (BUF_MEM *)0x0;
      do {
        if (cVar14 == *(char *)((long)&pBVar19->length + *(long *)&param_1[1].state)) {
          uVar24 = uVar24 | 0x400;
          break;
        }
        pBVar19 = (BUF_MEM *)((long)&pBVar19->length + 1);
      } while (pBVar19 < pBVar17);
    }
    if ((uVar24 & 0x400) == 0 && uVar18 == 0) goto LAB_009c4e38;
    pvVar20 = param_1[1].init_msg;
    if (pvVar20 == (void *)0x0) {
LAB_009c4e20:
      uVar24 = uVar24 | 0x200;
    }
    else {
LAB_009c4d18:
      iVar3 = OPENSSL_sk_num(pvVar20);
      if (iVar3 == 0) goto LAB_009c4e20;
      pXVar11 = X509_get_issuer_name(param_2);
      iVar3 = OPENSSL_sk_num(pvVar20);
      if (0 < iVar3) {
        iVar3 = 0;
        do {
          pXVar12 = (X509_NAME *)OPENSSL_sk_value(pvVar20,iVar3);
          iVar5 = X509_NAME_cmp(pXVar11,pXVar12);
          if (iVar5 == 0) goto LAB_009c4e20;
          iVar3 = iVar3 + 1;
          iVar5 = OPENSSL_sk_num(pvVar20);
        } while (iVar3 < iVar5);
      }
      iVar3 = OPENSSL_sk_num(param_4);
      if (0 < iVar3) {
        iVar3 = 0;
        do {
          a = (X509 *)OPENSSL_sk_value(param_4,iVar3);
          pXVar11 = X509_get_issuer_name(a);
          iVar5 = OPENSSL_sk_num(pvVar20);
          if (0 < iVar5) {
            iVar5 = 0;
            do {
              pXVar12 = (X509_NAME *)OPENSSL_sk_value(pvVar20,iVar5);
              iVar6 = X509_NAME_cmp(pXVar11,pXVar12);
              if (iVar6 == 0) goto LAB_009c4e20;
              iVar5 = iVar5 + 1;
              iVar6 = OPENSSL_sk_num(pvVar20);
            } while (iVar5 < iVar6);
          }
          iVar3 = iVar3 + 1;
          iVar5 = OPENSSL_sk_num(param_4);
        } while (iVar3 < iVar5);
      }
    }
    if ((uVar24 & 0x200) == 0 && uVar18 == 0) goto LAB_009c4e34;
  }
  else {
    uVar24 = uVar7;
    if (bVar2) {
      uVar24 = uVar7 | 0x80;
      iVar3 = OPENSSL_sk_num(param_4);
      if (0 < iVar3) {
        iVar3 = 0;
        do {
          uVar9 = OPENSSL_sk_value(param_4,iVar3);
          iVar5 = FUN_009c517c(param_1,uVar9,0);
          if (iVar5 == 0) {
            if (uVar18 == 0) goto LAB_009c4e38;
            uVar24 = uVar7;
            break;
          }
          iVar3 = iVar3 + 1;
          iVar5 = OPENSSL_sk_num(param_4);
        } while (iVar3 < iVar5);
      }
      goto LAB_009c49f4;
    }
LAB_009c4a34:
    uVar24 = uVar24 | 0x600;
  }
  uVar24 = uVar24 | (uVar18 == 0 || (uVar18 & (uVar24 ^ 0xffffffff)) == 0);
LAB_009c4e38:
  uVar7 = SSL_version(param_1);
  if ((uVar7 & 0xffffff00) == 0x300) {
    iVar3 = SSL_version(param_1);
    uVar7 = 0x102;
    if (0x302 < iVar3) {
      uVar7 = *(uint *)local_70 & 0x102;
    }
    uVar7 = uVar7 | uVar24;
  }
  else {
    uVar7 = uVar24 | 0x102;
  }
  if (uVar18 == 0) {
    if ((uVar24 & 1) == 0) {
      uVar7 = 0;
      *(uint *)local_70 = *(uint *)local_70 & 0x102;
    }
    else {
      *(uint *)local_70 = uVar7;
    }
  }
  return uVar7;
}

