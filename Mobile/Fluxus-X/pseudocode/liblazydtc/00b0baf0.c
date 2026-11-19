/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0baf0
 */

char * X509_NAME_oneline(X509_NAME *a,char *buf,int size)

{
  uint uVar1;
  byte bVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  undefined8 *puVar7;
  char *__s;
  size_t sVar8;
  undefined8 uVar9;
  char cVar10;
  char *pcVar11;
  byte *pbVar12;
  byte *pbVar13;
  byte *pbVar14;
  uint *puVar15;
  ulong uVar16;
  int *piVar17;
  long lVar18;
  ulong uVar19;
  int iVar20;
  ulong uVar21;
  int iVar22;
  char *__dest;
  BUF_MEM *local_d8;
  char acStack_d0 [80];
  int local_80 [4];
  
  if (buf == (char *)0x0) {
    local_d8 = BUF_MEM_new();
    if (local_d8 == (BUF_MEM *)0x0) {
      local_d8 = (BUF_MEM *)0x0;
    }
    else {
      iVar4 = BUF_MEM_grow(local_d8,200);
      if (iVar4 != 0) {
        size = 200;
        *local_d8->data = '\0';
        goto joined_r0x00b0be78;
      }
    }
LAB_00b0beec:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_obj.c",0xb7,"X509_NAME_oneline");
    uVar9 = 0xc0100;
LAB_00b0bf68:
    ERR_set_error(0xb,uVar9,0);
    BUF_MEM_free(local_d8);
  }
  else {
    local_d8 = (BUF_MEM *)0x0;
    if (size != 0) {
joined_r0x00b0be78:
      if (a == (X509_NAME *)0x0) {
        if (local_d8 != (BUF_MEM *)0x0) {
          buf = local_d8->data;
          CRYPTO_free(local_d8);
        }
        strncpy(buf,"NO X509_NAME",(long)size);
        buf[(long)size - 1] = '\0';
        return buf;
      }
      iVar4 = OPENSSL_sk_num(a->entries);
      if (iVar4 < 1) {
        iVar4 = 0;
      }
      else {
        iVar4 = 0;
        iVar20 = -1;
        iVar22 = 0;
        do {
          puVar7 = (undefined8 *)OPENSSL_sk_value(a->entries,iVar4);
          iVar5 = OBJ_obj2nid((ASN1_OBJECT *)*puVar7);
          if ((iVar5 == 0) || (__s = OBJ_nid2sn(iVar5), __s == (char *)0x0)) {
            __s = acStack_d0;
            i2t_ASN1_OBJECT(acStack_d0,0x50,(ASN1_OBJECT *)*puVar7);
          }
          sVar8 = strlen(__s);
          puVar15 = (uint *)puVar7[1];
          uVar1 = *puVar15;
          uVar21 = (ulong)uVar1;
          if (0x100000 < (int)uVar1) {
            ERR_new();
            uVar9 = 0x4c;
LAB_00b0bf5c:
            ERR_set_debug("crypto/x509/x509_obj.c",uVar9,"X509_NAME_oneline");
            uVar9 = 0x86;
            goto LAB_00b0bf68;
          }
          pcVar11 = *(char **)(puVar15 + 2);
          if (((uVar1 & 3) == 0) && (puVar15[1] == 0x1b)) {
            local_80[0] = 0;
            local_80[1] = 0;
            local_80[2] = 0;
            local_80[3] = 0;
            if ((int)uVar1 < 1) {
              local_80[2] = 0;
              local_80[1] = 0;
            }
            else {
              if (uVar1 == 1) {
                uVar16 = 0;
                cVar10 = *pcVar11;
                goto joined_r0x00b0be48;
              }
              uVar16 = 0;
              if (3 < uVar21 - 1) goto LAB_00b0bc48;
              uVar19 = 0;
              uVar16 = uVar21 & 0xfffffffe;
              do {
                cVar10 = (pcVar11 + uVar19)[1];
                if (pcVar11[uVar19] != '\0') {
                  local_80[uVar19 & 2] = 1;
                }
                if (cVar10 != '\0') {
                  local_80[uVar19 + 1 & 3] = 1;
                }
                uVar19 = uVar19 + 2;
              } while (uVar16 != uVar19);
              for (; uVar16 != uVar21; uVar16 = uVar16 + 1) {
LAB_00b0bc48:
                cVar10 = pcVar11[uVar16];
joined_r0x00b0be48:
                if (cVar10 != '\0') {
                  local_80[uVar16 & 3] = 1;
                }
              }
            }
            if ((local_80[1] != 0 || local_80[0] != 0) || local_80[2] != 0) goto LAB_00b0bc88;
            local_80[2] = 0;
            local_80[0] = 0;
            local_80[1] = 0;
            piVar17 = local_80 + 3;
          }
          else {
LAB_00b0bc88:
            local_80[3] = 1;
            local_80[1] = 1;
            local_80[2] = 1;
            piVar17 = local_80;
          }
          *piVar17 = 1;
          if ((int)uVar1 < 1) {
            iVar5 = 0;
          }
          else {
            uVar16 = 0;
            iVar5 = 0;
            do {
              if (local_80[uVar16 & 3] != 0) {
                if (((byte)pcVar11[uVar16] | 4) == 0x2f) {
                  iVar5 = iVar5 + 2;
                }
                else {
                  iVar6 = 4;
                  if ((byte)pcVar11[uVar16] - 0x20 < 0x5f) {
                    iVar6 = 1;
                  }
                  iVar5 = iVar6 + iVar5;
                }
              }
              uVar16 = uVar16 + 1;
            } while (uVar21 != uVar16);
          }
          iVar6 = iVar5 + iVar22 + (int)sVar8;
          iVar5 = iVar6 + 2;
          if (0x100000 < iVar5) {
            ERR_new();
            uVar9 = 0x7a;
            goto LAB_00b0bf5c;
          }
          if (local_d8 == (BUF_MEM *)0x0) {
            pcVar11 = buf;
            if (size <= iVar5) goto joined_r0x00b0bf1c;
          }
          else {
            iVar6 = BUF_MEM_grow(local_d8,(long)(iVar6 + 3));
            if (iVar6 == 0) goto LAB_00b0beec;
            pcVar11 = local_d8->data;
          }
          pcVar11 = pcVar11 + iVar22;
          cVar10 = '+';
          if (iVar20 != *(int *)(puVar7 + 2)) {
            cVar10 = '/';
          }
          __dest = pcVar11 + 1;
          *pcVar11 = cVar10;
          memcpy(__dest,__s,sVar8 & 0xffffffff);
          pbVar12 = (byte *)(__dest + (int)sVar8 + 1);
          __dest[(int)sVar8] = '=';
          if (0 < (int)uVar1) {
            uVar16 = 0;
            lVar18 = *(long *)(puVar7[1] + 8);
            pbVar13 = pbVar12;
            do {
              pbVar12 = pbVar13;
              if (local_80[uVar16 & 3] != 0) {
                bVar2 = *(byte *)(lVar18 + uVar16);
                if (bVar2 - 0x20 < 0x5f) {
                  pbVar14 = pbVar13;
                  if ((bVar2 | 4) == 0x2f) {
                    pbVar14 = pbVar13 + 1;
                    *pbVar13 = 0x5c;
                  }
                  pbVar12 = pbVar14 + 1;
                  *pbVar14 = bVar2;
                }
                else {
                  bVar3 = "0123456789ABCDEF"[bVar2 >> 4];
                  bVar2 = "0123456789ABCDEF"[bVar2 & 0xf];
                  pbVar13[0] = 0x5c;
                  pbVar13[1] = 0x78;
                  pbVar13[2] = bVar3;
                  pbVar12 = pbVar13 + 4;
                  pbVar13[3] = bVar2;
                }
              }
              uVar16 = uVar16 + 1;
              pbVar13 = pbVar12;
            } while (uVar21 != uVar16);
          }
          *pbVar12 = 0;
          iVar20 = *(int *)(puVar7 + 2);
          iVar4 = iVar4 + 1;
          iVar6 = OPENSSL_sk_num(a->entries);
          iVar22 = iVar5;
        } while (iVar4 < iVar6);
      }
      if (local_d8 != (BUF_MEM *)0x0) {
        buf = local_d8->data;
        CRYPTO_free(local_d8);
      }
joined_r0x00b0bf1c:
      if (iVar4 == 0) {
        *buf = '\0';
        return buf;
      }
      return buf;
    }
  }
  return (char *)0x0;
}

