/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b17960
 */

ulong OSSL_HTTP_REQ_CTX_nbio(uint *param_1)

{
  bool bVar1;
  byte *pbVar2;
  char cVar3;
  byte bVar4;
  bool bVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  size_t sVar10;
  long lVar11;
  void *pvVar12;
  char *pcVar13;
  BIO *bp;
  undefined8 uVar14;
  undefined4 uVar15;
  long lVar16;
  uint uVar17;
  char *pcVar18;
  char *pcVar19;
  ulong uVar20;
  char *__nptr;
  char *local_78;
  byte *local_70;
  char *local_68;
  
  local_78 = (char *)0x0;
  if (param_1 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x215,"OSSL_HTTP_REQ_CTX_nbio");
    uVar14 = 0xc0102;
  }
  else {
    if (((*(long *)(param_1 + 0x16) != 0) && (*(long *)(param_1 + 6) != 0)) &&
       (*(long *)(param_1 + 8) != 0)) {
      bVar1 = false;
      bVar5 = false;
      param_1[0x2e] = 0;
      param_1[0x2f] = 0;
      pbVar2 = local_70;
LAB_00b17a70:
      local_70 = pbVar2;
      uVar9 = *param_1;
      pcVar18 = *(char **)(param_1 + 2);
      if ((uVar9 >> 0xc & 1) == 0) {
        if (param_1[0x1e] == 0) {
          ERR_set_mark();
          iVar7 = BIO_gets(*(BIO **)(param_1 + 8),pcVar18,param_1[4]);
          if (iVar7 == -2) {
            ERR_pop_to_mark();
            iVar7 = BIO_get_line(*(undefined8 *)(param_1 + 8),pcVar18,param_1[4]);
          }
          else {
            ERR_clear_last_mark();
          }
        }
        else {
          iVar7 = BIO_read(*(BIO **)(param_1 + 8),pcVar18,param_1[4]);
        }
        if (0 < iVar7) {
          iVar8 = BIO_write(*(BIO **)(param_1 + 0x16),*(void **)(param_1 + 2),iVar7);
          if (iVar8 != iVar7) {
            return 0;
          }
          uVar9 = *param_1;
          goto LAB_00b17af0;
        }
        iVar7 = BIO_test_flags(*(BIO **)(param_1 + 8),8);
        if (iVar7 != 0) {
          return 0xffffffff;
        }
        ERR_new();
        uVar14 = 0x230;
LAB_00b182f4:
        ERR_set_debug("crypto/http/http_client.c",uVar14,"OSSL_HTTP_REQ_CTX_nbio");
        uVar14 = 0x80;
        goto LAB_00b17a40;
      }
LAB_00b17af0:
      switch(uVar9) {
      case 0x1000:
        goto switchD_00b17b08_caseD_1000;
      case 0x1001:
        iVar7 = BIO_write(*(BIO **)(param_1 + 0x16),&DAT_002b917a,2);
        if (iVar7 == 2) {
          *param_1 = 0x1002;
          goto switchD_00b17b08_caseD_1002;
        }
        goto LAB_00b182bc;
      case 0x1002:
switchD_00b17b08_caseD_1002:
        lVar11 = BIO_ctrl(*(BIO **)(param_1 + 0x16),3,0,param_1 + 0x20);
        uVar9 = 0x1003;
        *(long *)(param_1 + 0x22) = lVar11;
        *param_1 = 0x1003;
        if (0 < lVar11) goto LAB_00b17b18;
LAB_00b17c14:
        if (uVar9 == 0x1003) {
          BIO_ctrl(*(BIO **)(param_1 + 0x16),1,0,(void *)0x0);
          *param_1 = 0x1004;
        }
        if ((*(BIO **)(param_1 + 0x18) == (BIO *)0x0) ||
           (lVar11 = BIO_ctrl(*(BIO **)(param_1 + 0x18),2,0,(void *)0x0), (int)lVar11 != 0)) {
          *param_1 = 0x1005;
          goto switchD_00b17b08_caseD_1005;
        }
        iVar7 = BIO_read(*(BIO **)(param_1 + 0x18),*(void **)(param_1 + 2),param_1[4]);
        if (iVar7 < 1) {
          iVar7 = BIO_test_flags(*(BIO **)(param_1 + 0x18),8);
          if (iVar7 != 0) {
            return 0xffffffff;
          }
          ERR_new();
          uVar14 = 0x262;
          goto LAB_00b182f4;
        }
        lVar11 = *(long *)(param_1 + 2);
        lVar16 = (long)iVar7;
LAB_00b17a6c:
        *(long *)(param_1 + 0x20) = lVar11;
        *(long *)(param_1 + 0x22) = lVar16;
        pbVar2 = local_70;
        goto LAB_00b17a70;
      case 0x1003:
      case 0x1004:
        lVar11 = *(long *)(param_1 + 0x22);
        if (lVar11 < 1) goto LAB_00b17c14;
LAB_00b17b18:
        iVar7 = BIO_write(*(BIO **)(param_1 + 6),*(void **)(param_1 + 0x20),(int)lVar11);
        if (0 < iVar7) {
          lVar11 = *(long *)(param_1 + 0x20) + (long)iVar7;
          lVar16 = *(long *)(param_1 + 0x22) - (long)iVar7;
          goto LAB_00b17a6c;
        }
        break;
      case 0x1005:
switchD_00b17b08_caseD_1005:
        lVar11 = BIO_ctrl(*(BIO **)(param_1 + 6),0xb,0,(void *)0x0);
        if (0 < (int)lVar11) {
          *param_1 = 1;
          pbVar2 = local_70;
          goto LAB_00b17a70;
        }
        break;
      default:
        if (uVar9 - 1 < 3) goto code_r0x00b17b4c;
        if (uVar9 == 4) {
LAB_00b17b80:
          lVar11 = BIO_ctrl(*(BIO **)(param_1 + 0x16),3,0,&local_70);
          pbVar2 = local_70;
          if (lVar11 < 2) goto LAB_00b17a70;
          pbVar2 = local_70 + 1;
          if (*local_70 != 0x30) {
            local_70 = pbVar2;
            ERR_new();
            ERR_set_debug("crypto/http/http_client.c",0x319,"OSSL_HTTP_REQ_CTX_nbio");
            uVar14 = 0x6e;
            goto LAB_00b17a40;
          }
          bVar4 = *pbVar2;
          if ((char)bVar4 < '\0') {
            if (lVar11 < 6) goto LAB_00b17a70;
            uVar9 = bVar4 & 0x7f;
            if (3 < uVar9 - 1) {
              local_70 = pbVar2;
              ERR_new();
              ERR_set_debug("crypto/http/http_client.c",0x328,"OSSL_HTTP_REQ_CTX_nbio");
              uVar14 = 0x6d;
              goto LAB_00b17a40;
            }
            uVar20 = 0;
            pbVar2 = local_70 + 3;
            uVar17 = uVar9;
            do {
              local_70 = pbVar2;
              uVar17 = uVar17 - 1;
              uVar20 = (ulong)local_70[-1] | uVar20 << 8;
              pbVar2 = local_70 + 1;
            } while (uVar17 != 0);
            lVar11 = uVar20 + (uVar9 + 2);
          }
          else {
            lVar11 = (ulong)bVar4 + 2;
            local_70 = pbVar2;
          }
          uVar20 = FUN_00b184b0(param_1,lVar11);
          if ((int)uVar20 == 0) {
            return uVar20;
          }
          *param_1 = 5;
        }
        uVar20 = BIO_ctrl(*(BIO **)(param_1 + 0x16),3,0,(void *)0x0);
        pbVar2 = local_70;
        if ((-1 < (long)uVar20) && (*(ulong *)(param_1 + 0x24) <= uVar20)) {
          uVar9 = 0x1006;
LAB_00b18320:
          *param_1 = uVar9;
          return 1;
        }
        goto LAB_00b17a70;
      }
      uVar9 = BIO_test_flags(*(BIO **)(param_1 + 6),8);
      uVar20 = (ulong)uVar9;
      if (uVar9 != 0) {
        return 0xffffffff;
      }
      goto LAB_00b182c0;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x219,"OSSL_HTTP_REQ_CTX_nbio");
    uVar14 = 0xc0101;
  }
LAB_00b17a40:
  ERR_set_error(0x3d,uVar14,0);
switchD_00b17b08_caseD_1000:
  return 0;
code_r0x00b17b4c:
  sVar10 = BIO_ctrl(*(BIO **)(param_1 + 0x16),3,0,&local_70);
  if (0 < (long)sVar10) {
LAB_00b17f54:
    pvVar12 = memchr(local_70,10,sVar10);
    if (pvVar12 != (void *)0x0) {
      uVar9 = BIO_gets(*(BIO **)(param_1 + 0x16),pcVar18,param_1[4]);
      if ((int)uVar9 < 1) {
        iVar7 = BIO_test_flags(*(BIO **)(param_1 + 0x16),8);
        pbVar2 = local_70;
        if (iVar7 != 0) goto LAB_00b17a70;
        uVar20 = 0;
        goto LAB_00b182c0;
      }
      if (uVar9 == param_1[4]) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x29c,"OSSL_HTTP_REQ_CTX_nbio");
        ERR_set_error(0x3d,0x71,0);
        goto LAB_00b182bc;
      }
      if (*param_1 == 1) {
        iVar7 = strncmp(pcVar18,"HTTP/1.",7);
        if (iVar7 == 0) {
          cVar3 = *pcVar18;
          bVar1 = 0x30 < (byte)pcVar18[7];
          if (cVar3 != '\0') {
            pcVar13 = pcVar18 + -1;
            __nptr = pcVar18;
            do {
              iVar7 = ossl_ctype_check(cVar3,8);
              if (iVar7 != 0) {
                cVar3 = *__nptr;
                if (cVar3 != '\0') goto LAB_00b17ff8;
                break;
              }
              __nptr = __nptr + 1;
              cVar3 = *__nptr;
              pcVar13 = pcVar13 + 1;
            } while (cVar3 != '\0');
          }
        }
        goto LAB_00b18198;
      }
      pcVar13 = strchr(pcVar18,0x3a);
      if (pcVar13 != (char *)0x0) {
        *pcVar13 = '\0';
        do {
          pcVar13 = pcVar13 + 1;
          iVar7 = ossl_ctype_check(*pcVar13,8);
        } while (iVar7 != 0);
        local_78 = strchr(pcVar13,0xd);
        if ((local_78 != (char *)0x0) || (local_78 = strchr(pcVar13,10), local_78 != (char *)0x0)) {
          *local_78 = '\0';
          uVar9 = *param_1;
          if (uVar9 == 3) {
            uVar20 = OPENSSL_strcasecmp(pcVar18,"Location");
            if ((int)uVar20 == 0) {
              *(char **)(param_1 + 0x2e) = pcVar13;
              return uVar20;
            }
            uVar9 = *param_1;
          }
          if (((uVar9 == 2) && (*(long *)(param_1 + 0x1c) != 0)) &&
             (iVar7 = OPENSSL_strcasecmp(pcVar18,"Content-Type"), iVar7 == 0)) {
            iVar7 = OPENSSL_strcasecmp(*(undefined8 *)(param_1 + 0x1c),pcVar13);
            if (iVar7 != 0) {
              ERR_new();
              ERR_set_debug("crypto/http/http_client.c",0x2ca,"OSSL_HTTP_REQ_CTX_nbio");
              ERR_set_error(0x3d,0x76,"expected=%s, actual=%s",*(undefined8 *)(param_1 + 0x1c),
                            pcVar13);
              return 0;
            }
            bVar5 = true;
          }
          iVar7 = OPENSSL_strcasecmp(pcVar18,"Connection");
          if (iVar7 == 0) {
            iVar7 = OPENSSL_strcasecmp(pcVar13,"keep-alive");
            if (iVar7 == 0) {
              bVar1 = true;
            }
            else {
              iVar7 = OPENSSL_strcasecmp(pcVar13,"close");
              bVar6 = false;
              if (iVar7 != 0) {
                bVar6 = bVar1;
              }
              bVar1 = bVar6;
            }
          }
          else {
            iVar7 = OPENSSL_strcasecmp(pcVar18,"Content-Length");
            if (iVar7 == 0) {
              uVar20 = strtoul(pcVar13,&local_78,10);
              if ((local_78 == pcVar13) || (*local_78 != '\0')) {
                ERR_new();
                ERR_set_debug("crypto/http/http_client.c",0x2db,"OSSL_HTTP_REQ_CTX_nbio");
                pcVar18 = "input=%s";
                uVar14 = 0x77;
                goto LAB_00b18444;
              }
              uVar20 = FUN_00b184b0(param_1,uVar20);
              if ((int)uVar20 == 0) {
                return uVar20;
              }
            }
          }
        }
      }
      local_70 = *(byte **)(param_1 + 2);
      while( true ) {
        bVar4 = *local_70;
        if ((bVar4 != 10) && (bVar4 != 0xd)) break;
        local_70 = local_70 + 1;
      }
      if (bVar4 != 0) {
        bp = *(BIO **)(param_1 + 0x16);
        goto LAB_00b18200;
      }
      if (((!bVar1) && (uVar9 = param_1[0x28], uVar9 != 0)) && (param_1[0x28] = 0, uVar9 == 2)) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x2f1,"OSSL_HTTP_REQ_CTX_nbio");
        uVar14 = 0x7f;
        goto LAB_00b17a40;
      }
      if (*param_1 == 0x1000) {
        return 0;
      }
      if ((!bVar5) && (*(long *)(param_1 + 0x1c) != 0)) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x2fb,"OSSL_HTTP_REQ_CTX_nbio");
        pcVar13 = *(char **)(param_1 + 0x1c);
        pcVar18 = "expected=%s";
        uVar14 = 0x79;
LAB_00b18444:
        ERR_set_error(0x3d,uVar14,pcVar18,pcVar13);
        return 0;
      }
      if (*param_1 == 3) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x301,"OSSL_HTTP_REQ_CTX_nbio");
        uVar14 = 0x6f;
        goto LAB_00b17a40;
      }
      if (param_1[0x1e] == 0) {
        uVar9 = 0x1007;
        goto LAB_00b18320;
      }
      *param_1 = 4;
      goto LAB_00b17b80;
    }
  }
LAB_00b1821c:
  pbVar2 = local_70;
  if ((long)(int)param_1[4] <= (long)sVar10) {
LAB_00b182bc:
    uVar20 = 0;
LAB_00b182c0:
    *param_1 = 0x1000;
    return uVar20;
  }
  goto LAB_00b17a70;
  while( true ) {
    __nptr = __nptr + 1;
    cVar3 = *__nptr;
    pcVar13 = pcVar13 + 1;
    if (cVar3 == '\0') break;
LAB_00b17ff8:
    iVar7 = ossl_ctype_check(cVar3,8);
    if (iVar7 == 0) {
      cVar3 = *__nptr;
      if (cVar3 != '\0') {
        pcVar19 = __nptr;
        goto LAB_00b18024;
      }
      break;
    }
  }
  goto LAB_00b18198;
  while( true ) {
    pcVar19 = pcVar19 + 1;
    cVar3 = *pcVar19;
    pcVar13 = pcVar13 + 1;
    if (cVar3 == '\0') break;
LAB_00b18024:
    iVar7 = ossl_ctype_check(cVar3,8);
    if (iVar7 != 0) {
      if (*pcVar19 != '\0') {
        *pcVar19 = '\0';
        uVar20 = strtoul(__nptr,&local_68,10);
        if (*local_68 == '\0') {
          goto LAB_00b17d80;
        }
      }
      break;
    }
  }
LAB_00b18198:
  uVar20 = 0;
  do {
    if (pcVar18[uVar20] == '\0') break;
    iVar7 = ossl_ctype_check(pcVar18[uVar20],0x100);
    if (iVar7 == 0) {
      pcVar18[uVar20] = ' ';
    }
    uVar20 = uVar20 + 1;
  } while (uVar20 < 0x3c);
  pcVar18[uVar20] = '\0';
  ERR_new();
  ERR_set_debug("crypto/http/http_client.c",0x1e4,"parse_http_line1");
  ERR_set_error(0x3d,0x7e,"content=%s",pcVar18);
  uVar9 = 0x1000;
LAB_00b181f8:
  bp = *(BIO **)(param_1 + 0x16);
  *param_1 = uVar9;
LAB_00b18200:
  sVar10 = BIO_ctrl(bp,3,0,&local_70);
  if ((long)sVar10 < 1) goto LAB_00b1821c;
  goto LAB_00b17f54;
  while( true ) {
    iVar7 = ossl_ctype_check(pcVar19[2],8);
    pcVar13 = pcVar19 + 1;
    if (iVar7 == 0) break;
LAB_00b17d80:
    pcVar19 = pcVar13;
    if (pcVar19[2] == '\0') goto LAB_00b17de8;
  }
  if (pcVar19[2] != '\0') {
    sVar10 = strlen(pcVar19 + 2);
    local_68 = pcVar13 + sVar10;
    iVar7 = ossl_ctype_check(pcVar13[sVar10],8);
    if (iVar7 != 0) {
      pcVar13 = pcVar19 + sVar10;
      do {
        pcVar13[1] = '\0';
        local_68 = pcVar13;
        iVar7 = ossl_ctype_check(*pcVar13,8);
        pcVar13 = pcVar13 + -1;
      } while (iVar7 != 0);
    }
  }
LAB_00b17de8:
  iVar7 = (int)uVar20;
  if ((1 < iVar7 - 0x12dU) && (iVar7 != 200)) {
    cVar3 = pcVar19[2];
    uVar15 = 0x72;
    if (399 < iVar7) {
      uVar15 = 0x69;
    }
    ERR_new();
    if (cVar3 == '\0') {
      ERR_set_debug("crypto/http/http_client.c",0x1d8,"parse_http_line1");
      ERR_set_error(0x3d,uVar15,"code=%s",__nptr);
    }
    else {
      ERR_set_debug("crypto/http/http_client.c",0x1da,"parse_http_line1");
      ERR_set_error(0x3d,uVar15,"code=%s, reason=%s",__nptr,pcVar19 + 2);
    }
  }
  if (iVar7 - 0x12dU < 2) {
    if (param_1[0x1a] == 0) {
      uVar9 = 3;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/http/http_client.c",0x2ad,"OSSL_HTTP_REQ_CTX_nbio");
      ERR_set_error(0x3d,0x74,0);
      uVar9 = 0x1000;
    }
  }
  else if (iVar7 == 200) {
    uVar9 = 2;
  }
  else {
    uVar9 = 0x1000;
  }
  goto LAB_00b181f8;
}

