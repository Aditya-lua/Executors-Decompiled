/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1a64c
 */

undefined8
OSSL_parse_url(char *param_1,long *param_2,long *param_3,long *param_4,long *param_5,uint *param_6,
              long *param_7,long *param_8,long *param_9)

{
  byte *pbVar1;
  char *pcVar2;
  byte *__s;
  byte *pbVar3;
  byte *pbVar4;
  byte *pbVar5;
  byte *pbVar6;
  byte *pbVar7;
  int iVar8;
  char *pcVar9;
  char *pcVar10;
  byte *pbVar11;
  size_t sVar12;
  byte *pbVar13;
  long lVar14;
  void *ptr;
  char *pcVar15;
  char *pcVar16;
  byte *__s_00;
  byte *pbVar17;
  uint local_64;
  
  if (param_2 != (long *)0x0) {
    *param_2 = 0;
  }
  if (param_3 != (long *)0x0) {
    *param_3 = 0;
  }
  if (param_4 != (long *)0x0) {
    *param_4 = 0;
  }
  if (param_5 != (long *)0x0) {
    *param_5 = 0;
  }
  if (param_6 != (uint *)0x0) {
    *param_6 = 0;
  }
  if (param_7 != (long *)0x0) {
    *param_7 = 0;
  }
  if (param_9 != (long *)0x0) {
    *param_9 = 0;
  }
  if (param_8 != (long *)0x0) {
    *param_8 = 0;
  }
  if (param_1 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_lib.c",0x46,"OSSL_parse_url");
    ERR_set_error(0x3d,0xc0102,0);
    return 0;
  }
  pcVar9 = strstr(param_1,"://");
  pcVar16 = param_1;
  pcVar15 = param_1;
  if (pcVar9 == (char *)0x0) {
LAB_00b1a700:
    pcVar10 = strchr(pcVar15,0x40);
    pcVar9 = pcVar15;
    if (pcVar10 != (char *)0x0) {
      pcVar9 = pcVar10 + 1;
    }
    pcVar2 = pcVar15;
    if (pcVar10 != (char *)0x0) {
      pcVar2 = pcVar10;
    }
    if (*pcVar9 == '[') {
      pcVar10 = strchr(pcVar9 + 1,0x5d);
      if (pcVar10 == (char *)0x0) goto LAB_00b1aaa0;
      pbVar11 = (byte *)(pcVar10 + 1);
    }
    else {
      pbVar11 = (byte *)strchr(pcVar9,0x3a);
      if ((((pbVar11 == (byte *)0x0) &&
           (pbVar11 = (byte *)strchr(pcVar9,0x2f), pbVar11 == (byte *)0x0)) &&
          (pbVar11 = (byte *)strchr(pcVar9,0x3f), pbVar11 == (byte *)0x0)) &&
         (pbVar11 = (byte *)strchr(pcVar9,0x23), pbVar11 == (byte *)0x0)) {
        sVar12 = strlen(pcVar9);
        pbVar11 = (byte *)(pcVar9 + sVar12);
      }
    }
    __s_00 = pbVar11 + 1;
    pbVar1 = __s_00;
    if (*pbVar11 != 0x3a) {
      __s_00 = &DAT_002cb723;
      pbVar1 = pbVar11;
    }
    iVar8 = sscanf((char *)__s_00,"%u",&local_64);
    if ((iVar8 < 1) || (local_64 >> 0x10 != 0)) {
      ERR_new();
      ERR_set_debug("crypto/http/http_lib.c",0x7a,"OSSL_parse_url");
      ERR_set_error(0x3d,0x7b,&DAT_002b6c62,__s_00);
      goto joined_r0x00b1aa64;
    }
    pbVar17 = __s_00 + -1;
    do {
      pbVar17 = pbVar17 + 1;
    } while (*pbVar17 - 0x30 < 10);
    __s = pbVar1 + ((long)pbVar17 - (long)__s_00);
    if (__s_00 != pbVar1) {
      __s = pbVar1;
    }
    if ((0x3f < *__s) || ((1L << ((ulong)*__s & 0x3f) & 0x8000800800000001U) == 0)) {
      ERR_new();
      ERR_set_debug("crypto/http/http_lib.c",0x85,"OSSL_parse_url");
      ERR_set_error(0x3d,0x7d,0);
      goto LAB_00b1aaa0;
    }
    sVar12 = strlen((char *)__s);
    pbVar1 = __s + sVar12;
    pbVar13 = (byte *)strchr((char *)__s,0x3f);
    pbVar3 = __s;
    if (pbVar13 != (byte *)0x0) {
      pbVar3 = pbVar13;
    }
    pbVar4 = pbVar1;
    pbVar6 = pbVar1;
    if (param_8 != (long *)0x0 && pbVar13 != (byte *)0x0) {
      pbVar4 = pbVar13 + 1;
      pbVar6 = pbVar13;
    }
    pbVar13 = (byte *)strchr((char *)pbVar3,0x23);
    pbVar3 = pbVar13;
    if (pbVar4 != pbVar6) {
      pbVar3 = pbVar6;
    }
    pbVar5 = pbVar1;
    pbVar7 = pbVar1;
    if (pbVar13 != (byte *)0x0) {
      pbVar5 = pbVar13 + 1;
      pbVar7 = pbVar13;
      pbVar6 = pbVar3;
    }
    if (param_2 == (long *)0x0) {
LAB_00b1a90c:
      if (param_4 != (long *)0x0) {
        lVar14 = CRYPTO_strndup(pcVar9,(long)pbVar11 - (long)pcVar9,"crypto/http/http_lib.c",0x23);
        *param_4 = lVar14;
        if (lVar14 == 0) goto joined_r0x00b1aa64;
      }
      if (param_5 != (long *)0x0) {
        lVar14 = CRYPTO_strndup(__s_00,(long)pbVar17 - (long)__s_00,"crypto/http/http_lib.c",0x23);
        *param_5 = lVar14;
        if (lVar14 == 0) goto joined_r0x00b1aa64;
      }
      if (param_3 != (long *)0x0) {
        lVar14 = CRYPTO_strndup(pcVar15,(long)pcVar2 - (long)pcVar15,"crypto/http/http_lib.c",0x23);
        *param_3 = lVar14;
        if (lVar14 == 0) goto joined_r0x00b1aa64;
      }
      if (param_8 != (long *)0x0) {
        lVar14 = CRYPTO_strndup(pbVar4,(long)pbVar7 - (long)pbVar4,"crypto/http/http_lib.c",0x23);
        *param_8 = lVar14;
        if (lVar14 == 0) goto joined_r0x00b1aa64;
      }
      if (param_9 != (long *)0x0) {
        lVar14 = CRYPTO_strndup(pbVar5,(long)pbVar1 - (long)pbVar5,"crypto/http/http_lib.c",0x23);
        *param_9 = lVar14;
        if (lVar14 == 0) goto joined_r0x00b1aa64;
      }
      if (param_6 != (uint *)0x0) {
        *param_6 = local_64;
      }
      if (*__s == 0x2f) {
        if (param_7 == (long *)0x0) {
          return 1;
        }
        lVar14 = CRYPTO_strndup(__s,(long)pbVar6 - (long)__s,"crypto/http/http_lib.c",0x23);
        *param_7 = lVar14;
        if (lVar14 != 0) {
          return 1;
        }
      }
      else {
        if (param_7 == (long *)0x0) {
          return 1;
        }
        pcVar15 = CRYPTO_malloc((int)(pbVar6 + (2 - (long)__s)),"crypto/http/http_lib.c",0xac);
        *param_7 = (long)pcVar15;
        if (pcVar15 != (char *)0x0) {
          BIO_snprintf(pcVar15,(size_t)(pbVar6 + (2 - (long)__s)),"/%s",__s);
          return 1;
        }
      }
      goto joined_r0x00b1aa64;
    }
    lVar14 = CRYPTO_strndup(param_1,(long)pcVar16 - (long)param_1,"crypto/http/http_lib.c",0x23);
    *param_2 = lVar14;
    if (lVar14 != 0) goto LAB_00b1a90c;
    ptr = (void *)0x0;
  }
  else {
    if (pcVar9 != param_1) {
      pcVar15 = pcVar9 + 3;
      pcVar16 = pcVar9;
      goto LAB_00b1a700;
    }
LAB_00b1aaa0:
    ERR_new();
    ERR_set_debug("crypto/http/http_lib.c",0xb3,"OSSL_parse_url");
    ERR_set_error(0x3d,0x65,0);
joined_r0x00b1aa64:
    if (param_2 == (long *)0x0) goto LAB_00b1aae8;
    ptr = (void *)*param_2;
  }
  CRYPTO_free(ptr);
  *param_2 = 0;
LAB_00b1aae8:
  if (param_3 != (long *)0x0) {
    CRYPTO_free((void *)*param_3);
    *param_3 = 0;
  }
  if (param_4 != (long *)0x0) {
    CRYPTO_free((void *)*param_4);
    *param_4 = 0;
  }
  if (param_5 != (long *)0x0) {
    CRYPTO_free((void *)*param_5);
    *param_5 = 0;
  }
  if (param_7 != (long *)0x0) {
    CRYPTO_free((void *)*param_7);
    *param_7 = 0;
  }
  if (param_8 != (long *)0x0) {
    CRYPTO_free((void *)*param_8);
    *param_8 = 0;
  }
  if (param_9 == (long *)0x0) {
    return 0;
  }
  CRYPTO_free((void *)*param_9);
  *param_9 = 0;
  return 0;
}

