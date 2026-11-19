/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06224
 */

stack_st_CONF_VALUE * X509V3_parse_list(char *line)

{
  int iVar1;
  int iVar2;
  byte *ptr;
  size_t sVar3;
  size_t sVar4;
  undefined8 uVar5;
  byte bVar6;
  uint uVar7;
  byte *pbVar8;
  byte *__s;
  byte *pbVar9;
  byte *pbVar10;
  stack_st_CONF_VALUE *local_48;
  
  local_48 = (stack_st_CONF_VALUE *)0x0;
  ptr = (byte *)CRYPTO_strdup(line,"crypto/x509/v3_utl.c",0x142);
  if (ptr != (byte *)0x0) {
    iVar1 = 1;
    pbVar8 = (byte *)0x0;
    __s = ptr;
    pbVar10 = ptr;
LAB_00b06278:
    do {
      while( true ) {
        uVar7 = (uint)*pbVar10;
        if ((*pbVar10 < 0xe) && ((1 << (ulong)(uVar7 & 0x1f) & 0x2401U) != 0)) {
          bVar6 = *__s;
          goto joined_r0x00b0654c;
        }
        if (iVar1 != 2) break;
        if (uVar7 == 0x2c) {
          *pbVar10 = 0;
          bVar6 = *__s;
          if (bVar6 != 0) {
            while (iVar1 = ossl_ctype_check(bVar6,8), iVar1 != 0) {
              __s = __s + 1;
              bVar6 = *__s;
              if (bVar6 == 0) goto LAB_00b06498;
            }
            if (*__s != 0) {
              sVar3 = strlen((char *)__s);
              do {
                sVar4 = sVar3;
                if (sVar4 - 1 == 0) goto LAB_00b06380;
                iVar1 = ossl_ctype_check(__s[sVar4 - 1],8);
                sVar3 = sVar4 - 1;
              } while (iVar1 != 0);
              __s[sVar4] = 0;
LAB_00b06380:
              if (*__s != 0) {
                sVar3 = strlen((char *)__s);
                iVar1 = FUN_00b0590c(pbVar8,__s,sVar3,&local_48);
                if (iVar1 != 0) {
                  __s = (byte *)0x0;
LAB_00b06460:
                  pbVar9 = pbVar10 + 1;
                  pbVar8 = __s;
LAB_00b06464:
                  iVar1 = 1;
                  __s = pbVar9;
                  goto LAB_00b06274;
                }
                goto LAB_00b06508;
              }
            }
          }
LAB_00b06498:
          ERR_new();
          uVar5 = 0x16c;
          goto LAB_00b064b0;
        }
        iVar1 = 2;
        pbVar10 = pbVar10 + 1;
      }
      if (iVar1 != 1) {
LAB_00b06274:
        pbVar10 = pbVar10 + 1;
        goto LAB_00b06278;
      }
      if (uVar7 == 0x2c) {
        *pbVar10 = 0;
        bVar6 = *__s;
        if (bVar6 != 0) {
          while (iVar1 = ossl_ctype_check(bVar6,8), iVar1 != 0) {
            __s = __s + 1;
            bVar6 = *__s;
            if (bVar6 == 0) goto LAB_00b064dc;
          }
          if (*__s != 0) {
            sVar3 = strlen((char *)__s);
            do {
              sVar4 = sVar3;
              if (sVar4 - 1 == 0) goto LAB_00b06440;
              iVar1 = ossl_ctype_check(__s[sVar4 - 1],8);
              sVar3 = sVar4 - 1;
            } while (iVar1 != 0);
            __s[sVar4] = 0;
LAB_00b06440:
            if (*__s != 0) {
              iVar1 = FUN_00b0590c(__s,0,0,&local_48);
              if (iVar1 != 0) goto LAB_00b06460;
              goto LAB_00b06508;
            }
          }
        }
LAB_00b064dc:
        ERR_new();
        uVar5 = 0x15d;
        goto LAB_00b064f4;
      }
      pbVar9 = __s;
      if (uVar7 != 0x3a) goto LAB_00b06464;
      *pbVar10 = 0;
      bVar6 = *__s;
      if (bVar6 == 0) goto LAB_00b064c0;
      while (iVar1 = ossl_ctype_check(bVar6,8), iVar1 != 0) {
        __s = __s + 1;
        bVar6 = *__s;
        if (bVar6 == 0) goto LAB_00b064c0;
      }
      if (*__s == 0) goto LAB_00b064c0;
      sVar3 = strlen((char *)__s);
      do {
        sVar4 = sVar3;
        if (sVar4 - 1 == 0) goto LAB_00b063ec;
        iVar1 = ossl_ctype_check(__s[sVar4 - 1],8);
        sVar3 = sVar4 - 1;
      } while (iVar1 != 0);
      __s[sVar4] = 0;
LAB_00b063ec:
      if (*__s == 0) goto LAB_00b064c0;
      pbVar9 = pbVar10 + 1;
      iVar1 = 2;
      pbVar10 = pbVar10 + 1;
      pbVar8 = __s;
      __s = pbVar9;
    } while( true );
  }
  ERR_new();
  ERR_set_debug("crypto/x509/v3_utl.c",0x144,"X509V3_parse_list");
  uVar5 = 0xc0100;
  goto LAB_00b06500;
joined_r0x00b0654c:
  if (bVar6 == 0) goto LAB_00b065dc;
  iVar2 = ossl_ctype_check(bVar6,8);
  if (iVar2 == 0) {
    if (*__s != 0) {
      sVar3 = strlen((char *)__s);
      goto LAB_00b0657c;
    }
    goto LAB_00b065dc;
  }
  __s = __s + 1;
  bVar6 = *__s;
  goto joined_r0x00b0654c;
LAB_00b065dc:
  pbVar10 = (byte *)0x0;
  if (iVar1 != 2) goto LAB_00b065bc;
LAB_00b065e8:
  if (pbVar10 == (byte *)0x0) {
    ERR_new();
    uVar5 = 0x17c;
LAB_00b064b0:
    ERR_set_debug("crypto/x509/v3_utl.c",uVar5,"X509V3_parse_list");
    uVar5 = 0x6d;
    goto LAB_00b06500;
  }
  sVar3 = strlen((char *)pbVar10);
  iVar1 = FUN_00b0590c(pbVar8,pbVar10,sVar3,&local_48);
joined_r0x00b065d4:
  if (iVar1 != 0) {
    CRYPTO_free(ptr);
    return local_48;
  }
  goto LAB_00b06508;
LAB_00b064c0:
  ERR_new();
  uVar5 = 0x154;
  goto LAB_00b064f4;
  while( true ) {
    iVar2 = ossl_ctype_check(__s[sVar4 - 1],8);
    sVar3 = sVar4 - 1;
    if (iVar2 == 0) break;
LAB_00b0657c:
    sVar4 = sVar3;
    if (sVar4 - 1 == 0) goto LAB_00b065a8;
  }
  __s[sVar4] = 0;
LAB_00b065a8:
  pbVar10 = (byte *)0x0;
  if (*__s != 0) {
    pbVar10 = __s;
  }
  if (iVar1 == 2) goto LAB_00b065e8;
LAB_00b065bc:
  if (pbVar10 != (byte *)0x0) {
    iVar1 = FUN_00b0590c(pbVar10,0,0,&local_48);
    goto joined_r0x00b065d4;
  }
  ERR_new();
  uVar5 = 0x185;
LAB_00b064f4:
  ERR_set_debug("crypto/x509/v3_utl.c",uVar5,"X509V3_parse_list");
  uVar5 = 0x6c;
LAB_00b06500:
  ERR_set_error(0x22,uVar5,0);
LAB_00b06508:
  CRYPTO_free(ptr);
  OPENSSL_sk_pop_free(local_48,X509V3_conf_free);
  return (stack_st_CONF_VALUE *)0x0;
}

