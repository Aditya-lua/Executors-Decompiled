/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096d24c
 */

undefined8 FUN_0096d24c(long param_1,undefined8 param_2,undefined8 *param_3,X509 *param_4)

{
  char *pcVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  size_t sVar7;
  GENERAL_NAMES *a;
  int *piVar8;
  size_t sVar9;
  ulong uVar10;
  X509_NAME *name;
  X509_NAME_ENTRY *ne;
  ASN1_STRING *x;
  uchar *__dest;
  void *__src;
  bool bVar11;
  char *pcVar12;
  bool bVar13;
  undefined8 uVar14;
  size_t __n;
  int iVar15;
  size_t sVar16;
  ulong uVar17;
  uchar *local_80;
  undefined1 auStack_78 [16];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  pcVar12 = (char *)*param_3;
  sVar7 = strlen(pcVar12);
  iVar4 = *(int *)(param_3 + 3);
  if (iVar4 == 0) {
    __n = 0;
    iVar4 = 2;
LAB_0096d2f4:
    a = X509_get_ext_d2i(param_4,0x55,(int *)0x0,(int *)0x0);
    if (a == (GENERAL_NAMES *)0x0) {
      bVar11 = false;
LAB_0096d4a8:
      if (!bVar11) {
        local_80 = (uchar *)0x0;
        name = X509_get_subject_name(param_4);
        if (name == (X509_NAME *)0x0) {
LAB_0096d6c4:
          pcVar12 = "SSL: unable to obtain common name from peer certificate";
LAB_0096d6cc:
          FUN_00904b80(param_1,pcVar12);
          uVar14 = 0x3c;
        }
        else {
          iVar4 = -1;
          do {
            iVar5 = iVar4;
            iVar4 = X509_NAME_get_index_by_NID(name,0xd,iVar5);
          } while (-1 < iVar4);
          if (iVar5 < 0) goto LAB_0096d6c4;
          ne = X509_NAME_get_entry(name,iVar5);
          x = X509_NAME_ENTRY_get_data(ne);
          if (x == (ASN1_STRING *)0x0) goto LAB_0096d6c4;
          iVar4 = ASN1_STRING_type(x);
          if (iVar4 == 0xc) {
            iVar4 = ASN1_STRING_length(x);
            if (-1 < iVar4) {
              __dest = CRYPTO_malloc(iVar4 + 1,
                                     "/home/z/my-project/build/curl-8.9.1/lib/vtls/openssl.c",0x8c0)
              ;
              local_80 = __dest;
              if (__dest == (uchar *)0x0) {
                uVar14 = 0x1b;
                goto LAB_0096d6f0;
              }
              __src = (void *)ASN1_STRING_get0_data(x);
              memcpy(__dest,__src,(long)iVar4);
              local_80[iVar4] = '\0';
            }
          }
          else {
            iVar4 = ASN1_STRING_to_UTF8(&local_80,x);
          }
          if (local_80 == (uchar *)0x0) goto LAB_0096d6c4;
          strlen((char *)local_80);
          iVar5 = FUN_00963a5c();
          if (iVar5 != iVar4) {
            pcVar12 = "SSL: illegal cert name field";
            goto LAB_0096d6cc;
          }
          if (local_80 == (uchar *)0x0) goto LAB_0096d6c4;
          uVar17 = FUN_009717b4(local_80,(long)iVar4,*param_3,sVar7);
          if ((uVar17 & 1) == 0) {
            FUN_00904b80(param_1,
                         "SSL: certificate subject name \'%s\' does not match target hostname \'%s\'"
                         ,local_80,param_3[1]);
            uVar14 = 0x3c;
          }
          else {
            if (param_1 != 0) {
              uVar14 = 0;
              if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto joined_r0x0096d6bc;
              if ((*(long *)(param_1 + 0x12a0) == 0) ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
                FUN_00904c98(param_1," common name: %s (matched)",local_80);
              }
            }
            uVar14 = 0;
          }
        }
joined_r0x0096d6bc:
        if (local_80 != (uchar *)0x0) {
          CRYPTO_free(local_80);
        }
        goto LAB_0096d6f0;
      }
    }
    else {
      iVar5 = OPENSSL_sk_num(a);
      if (0 < iVar5) {
        bVar13 = false;
        bVar11 = false;
        bVar3 = false;
        iVar15 = 0;
        do {
          piVar8 = (int *)OPENSSL_sk_value(a,iVar15);
          iVar6 = *piVar8;
          if (iVar6 == 2) {
            bVar13 = true;
            if (iVar4 == 2) goto LAB_0096d388;
LAB_0096d46c:
            uVar17 = 0;
          }
          else {
            if (iVar6 == 7) {
              bVar11 = true;
            }
            if (iVar6 != iVar4) goto LAB_0096d46c;
LAB_0096d388:
            pcVar12 = (char *)ASN1_STRING_get0_data(*(undefined8 *)(piVar8 + 2));
            iVar6 = ASN1_STRING_length(*(ASN1_STRING **)(piVar8 + 2));
            sVar16 = (size_t)iVar6;
            if (iVar4 == 7) {
              if (__n != sVar16) goto LAB_0096d46c;
              iVar6 = memcmp(pcVar12,auStack_78,__n);
              bVar3 = (bool)(bVar3 | iVar6 == 0);
              uVar17 = 0;
              if ((iVar6 == 0) && (param_1 != 0)) {
                if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                   ((*(long *)(param_1 + 0x12a0) == 0 ||
                    (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                  FUN_00904c98(param_1," subjectAltName: host \"%s\" matched cert\'s IP address!",
                               param_3[1]);
                }
                uVar17 = 0;
                bVar3 = true;
              }
            }
            else {
              if ((iVar4 != 2) || (sVar9 = strlen(pcVar12), sVar9 != sVar16)) goto LAB_0096d46c;
              uVar14 = param_3[1];
              uVar10 = FUN_009717b4(pcVar12,sVar16,*param_3,sVar7);
              uVar17 = uVar10 & 0xffffffff;
              if ((param_1 != 0) && ((uVar10 & 1) != 0)) {
                if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) ||
                   ((*(long *)(param_1 + 0x12a0) != 0 &&
                    (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1)))) {
                  uVar17 = 1;
                }
                else {
                  FUN_00904c98(param_1," subjectAltName: host \"%s\" matched cert\'s \"%s\"",uVar14,
                               pcVar12);
                  uVar17 = 1;
                }
                goto LAB_0096d57c;
              }
            }
          }
          iVar15 = iVar15 + 1;
          if ((iVar5 <= iVar15) || ((uVar17 & 1) != 0)) goto LAB_0096d57c;
        } while( true );
      }
      uVar17 = 0;
      bVar3 = false;
      bVar11 = false;
      bVar13 = false;
LAB_0096d57c:
      GENERAL_NAMES_free(a);
      uVar14 = 0;
      if (((uVar17 & 1) != 0) || (bVar3)) goto LAB_0096d6f0;
      if (!bVar13) goto LAB_0096d4a8;
    }
    pcVar12 = "ipv4 address";
    if (*(int *)(param_3 + 3) != 1) {
      pcVar12 = "ipv6 address";
    }
    pcVar1 = "hostname";
    if (*(int *)(param_3 + 3) != 0) {
      pcVar1 = pcVar12;
    }
    if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1," subjectAltName does not match %s %s",pcVar1,param_3[1]);
    }
    FUN_00904b80(param_1,"SSL: no alternative certificate subject name matches target %s \'%s\'",
                 pcVar1,param_3[1]);
  }
  else if (iVar4 == 2) {
    iVar4 = inet_pton(10,pcVar12,auStack_78);
    if (iVar4 != 0) {
      iVar4 = 7;
      __n = 0x10;
      goto LAB_0096d2f4;
    }
  }
  else {
    if (iVar4 != 1) {
      FUN_00904b80(param_1,"unexpected ssl peer type: %d");
      uVar14 = 0x3c;
      goto LAB_0096d6f0;
    }
    iVar4 = inet_pton(2,pcVar12,auStack_78);
    if (iVar4 != 0) {
      iVar4 = 7;
      __n = 4;
      goto LAB_0096d2f4;
    }
  }
  uVar14 = 0x3c;
LAB_0096d6f0:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar14;
}

