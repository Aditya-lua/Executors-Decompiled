/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af7034
 */

long FUN_00af7034(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  char *__s;
  char cVar1;
  ASN1_VALUE *pAVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  long lVar7;
  char *pcVar8;
  ulong uVar9;
  size_t sVar10;
  size_t sVar11;
  ASN1_NULL *pAVar12;
  int *piVar13;
  long lVar14;
  char *__accept;
  undefined8 uVar15;
  uint *puVar16;
  uint local_94;
  undefined1 auStack_90 [16];
  undefined1 auStack_80 [16];
  char *local_70;
  ASN1_VALUE *local_68;
  
  lVar6 = OPENSSL_sk_new(&LAB_00af6bf8);
  if (lVar6 == 0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_addr.c",0x3a4,"v2i_IPAddrBlocks");
    ERR_set_error(0x22,0xc0100,0);
  }
  else {
    iVar3 = OPENSSL_sk_num(param_3);
    if (0 < iVar3) {
      iVar3 = 0;
      do {
        lVar7 = OPENSSL_sk_value(param_3,iVar3);
        iVar4 = ossl_v3_name_cmp(*(undefined8 *)(lVar7 + 8),&DAT_002cc160);
        if (iVar4 == 0) {
          uVar15 = 1;
          iVar4 = 4;
          __accept = "0123456789.";
LAB_00af7134:
          pcVar8 = CRYPTO_strdup(*(char **)(lVar7 + 0x10),"crypto/x509/v3_addr.c",0x3dd);
          puVar16 = (uint *)0x0;
          if (pcVar8 != (char *)0x0) goto LAB_00af71f4;
LAB_00af7530:
          ERR_new();
          uVar15 = 0x3e0;
LAB_00af7780:
          ERR_set_debug("crypto/x509/v3_addr.c",uVar15,"v2i_IPAddrBlocks");
          ERR_set_error(0x22,0xc0100,0);
          goto LAB_00af7798;
        }
        iVar4 = ossl_v3_name_cmp(*(undefined8 *)(lVar7 + 8),&DAT_002cd1d7);
        if (iVar4 == 0) {
          uVar15 = 2;
          iVar4 = 0x10;
          __accept = "0123456789.:abcdefABCDEF";
          goto LAB_00af7134;
        }
        iVar4 = ossl_v3_name_cmp(*(undefined8 *)(lVar7 + 8),"IPv4-SAFI");
        if (iVar4 == 0) {
          uVar15 = 1;
          iVar4 = 4;
          __accept = "0123456789.";
          pcVar8 = *(char **)(lVar7 + 0x10);
        }
        else {
          iVar4 = ossl_v3_name_cmp(*(undefined8 *)(lVar7 + 8),"IPv6-SAFI");
          if (iVar4 != 0) {
            ERR_new();
            ERR_set_debug("crypto/x509/v3_addr.c",0x3ba,"v2i_IPAddrBlocks");
            ERR_set_error(0x22,0x73,&DAT_002b6c62,*(undefined8 *)(lVar7 + 8));
            goto LAB_00af767c;
          }
          uVar15 = 2;
          iVar4 = 0x10;
          __accept = "0123456789.:abcdefABCDEF";
          pcVar8 = *(char **)(lVar7 + 0x10);
        }
        if (pcVar8 == (char *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_addr.c",0x3d0,"v2i_IPAddrBlocks");
          ERR_set_error(0x22,0x7c,0);
          goto LAB_00af767c;
        }
        uVar9 = strtoul(pcVar8,&local_70,0);
        pcVar8 = local_70;
        local_94 = (uint)uVar9;
        sVar10 = strspn(local_70," \t");
        pcVar8 = pcVar8 + sVar10;
        local_70 = pcVar8;
        if ((0xff < (uint)uVar9) || (__s = pcVar8 + 1, local_70 = __s, *pcVar8 != ':')) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_addr.c",0x3d6,"v2i_IPAddrBlocks");
          ERR_set_error(0x22,0xa4,0);
          ERR_add_error_data(4,"name=",*(undefined8 *)(lVar7 + 8),", value=",
                             *(undefined8 *)(lVar7 + 0x10));
          goto LAB_00af767c;
        }
        sVar10 = strspn(__s," \t");
        local_70 = __s + sVar10;
        pcVar8 = CRYPTO_strdup(local_70,"crypto/x509/v3_addr.c",0x3db);
        puVar16 = &local_94;
        if (pcVar8 == (char *)0x0) goto LAB_00af7530;
LAB_00af71f4:
        iVar5 = strcmp(pcVar8,"inherit");
        if (iVar5 != 0) {
          sVar10 = strspn(pcVar8,__accept);
          sVar11 = strspn(pcVar8 + (int)sVar10," \t");
          lVar14 = (long)((int)sVar10 + (int)sVar11);
          cVar1 = pcVar8[lVar14];
          pcVar8[(int)sVar10] = '\0';
          iVar5 = ossl_a2i_ipadd(auStack_80,pcVar8);
          if (iVar5 == iVar4) {
            if (cVar1 == '\0') {
              lVar7 = FUN_00af615c(lVar6,uVar15,puVar16);
              if ((lVar7 != 0) &&
                 (iVar4 = FUN_00af6210(&local_68,auStack_80,iVar4 << 3,iVar4), pAVar2 = local_68,
                 iVar4 != 0)) {
                iVar4 = OPENSSL_sk_push(lVar7,local_68);
                if (iVar4 != 0) goto LAB_00af747c;
                ASN1_item_free(pAVar2,(ASN1_ITEM *)&DAT_00c7e788);
              }
              ERR_new();
              uVar15 = 0x427;
              goto LAB_00af7780;
            }
            lVar14 = lVar14 + 1;
            iVar5 = (int)lVar14;
            if (cVar1 != '-') {
              if (cVar1 == '/') {
                uVar9 = strtoul(pcVar8 + iVar5,&local_70,10);
                if ((((local_70 != pcVar8 + iVar5) && (*local_70 == '\0')) &&
                    ((int)uVar9 <= iVar4 * 8)) && (-1 < (int)uVar9)) {
                  lVar7 = FUN_00af615c(lVar6,uVar15,puVar16);
                  if ((lVar7 != 0) &&
                     (iVar4 = FUN_00af6210(&local_68,auStack_80,uVar9 & 0xffffffff,iVar4),
                     pAVar2 = local_68, iVar4 != 0)) {
                    iVar4 = OPENSSL_sk_push(lVar7,local_68);
                    if (iVar4 != 0) goto LAB_00af747c;
                    ASN1_item_free(pAVar2,(ASN1_ITEM *)&DAT_00c7e788);
                  }
                  ERR_new();
                  uVar15 = 0x40a;
                  goto LAB_00af7780;
                }
                ERR_new();
                uVar15 = 0x405;
              }
              else {
                ERR_new();
                uVar15 = 0x42c;
              }
LAB_00af7638:
              ERR_set_debug("crypto/x509/v3_addr.c",uVar15,"v2i_IPAddrBlocks");
              uVar15 = 0x74;
              goto LAB_00af76d4;
            }
            sVar10 = strspn(pcVar8 + lVar14," \t");
            iVar5 = iVar5 + (int)sVar10;
            sVar10 = strspn(pcVar8 + iVar5,__accept);
            if (((int)sVar10 == 0) || (pcVar8[iVar5 + (int)sVar10] != '\0')) {
              ERR_new();
              uVar15 = 0x412;
              goto LAB_00af7638;
            }
            iVar5 = ossl_a2i_ipadd(auStack_90,pcVar8 + iVar5);
            if (iVar5 != iVar4) {
              ERR_new();
              uVar15 = 0x417;
              goto LAB_00af76c8;
            }
            iVar5 = memcmp(auStack_80,auStack_90,(long)iVar4);
            if (iVar5 < 1) {
              lVar7 = FUN_00af615c(lVar6,uVar15,puVar16);
              if ((lVar7 != 0) &&
                 (iVar4 = FUN_00af63d8(&local_68,auStack_80,auStack_90,iVar4), pAVar2 = local_68,
                 iVar4 != 0)) {
                iVar4 = OPENSSL_sk_push(lVar7,local_68);
                if (iVar4 != 0) goto LAB_00af747c;
                ASN1_item_free(pAVar2,(ASN1_ITEM *)&DAT_00c7e788);
              }
              ERR_new();
              uVar15 = 0x421;
              goto LAB_00af7780;
            }
            ERR_new();
            ERR_set_debug("crypto/x509/v3_addr.c",0x41c,"v2i_IPAddrBlocks");
            uVar15 = 0x74;
LAB_00af7504:
            ERR_set_error(0x22,uVar15,0);
            ERR_add_error_data(4,"name=",*(undefined8 *)(lVar7 + 8),", value=",
                               *(undefined8 *)(lVar7 + 0x10));
          }
          else {
            ERR_new();
            uVar15 = 0x3f9;
LAB_00af76c8:
            ERR_set_debug("crypto/x509/v3_addr.c",uVar15,"v2i_IPAddrBlocks");
            uVar15 = 0xa6;
LAB_00af76d4:
            ERR_set_error(0x22,uVar15,0);
            ERR_add_error_data(4,"name=",*(undefined8 *)(lVar7 + 8),", value=",
                               *(undefined8 *)(lVar7 + 0x10));
          }
          goto LAB_00af7798;
        }
        lVar14 = FUN_00af5f98(lVar6,uVar15,puVar16);
        if ((lVar14 == 0) || (piVar13 = *(int **)(lVar14 + 8), piVar13 == (int *)0x0)) {
LAB_00af74e0:
          ERR_new();
          ERR_set_debug("crypto/x509/v3_addr.c",0x3ea,"v2i_IPAddrBlocks");
          uVar15 = 0xa5;
          goto LAB_00af7504;
        }
        if (*piVar13 == 0) {
          if (*(long *)(piVar13 + 2) == 0) goto LAB_00af7460;
        }
        else {
          if (*piVar13 == 1) {
            if (*(long *)(piVar13 + 2) != 0) goto LAB_00af74e0;
LAB_00af7460:
            pAVar12 = ASN1_NULL_new();
            *(ASN1_NULL **)(*(long *)(lVar14 + 8) + 8) = pAVar12;
            if (pAVar12 == (ASN1_NULL *)0x0) goto LAB_00af74e0;
            piVar13 = *(int **)(lVar14 + 8);
          }
          else if (*(long *)(piVar13 + 2) == 0) goto LAB_00af7460;
          *piVar13 = 0;
        }
LAB_00af747c:
        CRYPTO_free(pcVar8);
        iVar3 = iVar3 + 1;
        iVar4 = OPENSSL_sk_num(param_3);
      } while (iVar3 < iVar4);
    }
    iVar3 = X509v3_addr_canonize(lVar6);
    if (iVar3 == 0) {
LAB_00af767c:
      pcVar8 = (char *)0x0;
LAB_00af7798:
      CRYPTO_free(pcVar8);
      OPENSSL_sk_pop_free(lVar6,IPAddressFamily_free);
      lVar6 = 0;
    }
  }
  return lVar6;
}

