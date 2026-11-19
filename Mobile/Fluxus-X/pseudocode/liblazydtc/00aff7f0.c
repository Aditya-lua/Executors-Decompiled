/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aff7f0
 */

undefined4 FUN_00aff7f0(int param_1,undefined4 *param_2,long param_3)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  byte bVar5;
  byte bVar6;
  ulong uVar7;
  long lVar8;
  int iVar9;
  byte *pbVar10;
  void *pvVar11;
  void *pvVar12;
  size_t sVar13;
  ulong uVar14;
  byte *pbVar15;
  long lVar16;
  byte *pbVar17;
  ulong uVar18;
  long lVar19;
  uint uVar20;
  long lVar21;
  undefined4 uVar22;
  char *__s2;
  X509_NAME *a;
  X509_NAME *a_00;
  void *pvVar23;
  size_t sVar24;
  byte *pbVar25;
  int *piVar26;
  long lVar27;
  byte local_160 [256];
  undefined8 local_58;
  
  pbVar25 = local_160;
  pbVar15 = local_160;
  uVar22 = 0x33;
  switch(*param_2) {
  case 0:
    if (param_1 != 1) {
      return 0x33;
    }
    piVar26 = *(int **)(*(long *)(param_2 + 2) + 8);
    local_58 = 0xff;
    iVar9 = **(int **)(param_3 + 8);
    pvVar11 = *(void **)(*(int **)(param_3 + 8) + 2);
    if ((iVar9 < 1) || (pvVar23 = memchr(pvVar11,0,(long)iVar9), pvVar23 == (void *)0x0)) {
      pbVar10 = (byte *)CRYPTO_strndup(pvVar11,(long)iVar9,"crypto/x509/v3_ncons.c",0x28c);
      if (pbVar10 == (byte *)0x0) {
        return 0x11;
      }
      if (*piVar26 == 0xc) {
        piVar26 = *(int **)(piVar26 + 2);
        uVar14 = (ulong)*piVar26;
        lVar21 = *(long *)(piVar26 + 2);
        lVar16 = uVar14 << 0x20;
        uVar7 = uVar14;
        do {
          lVar16 = lVar16 + -0x100000000;
          uVar18 = uVar7 - 1;
          if ((long)uVar7 < 1) {
            if ((int)uVar14 == 0) goto LAB_00affde4;
            break;
          }
          uVar14 = (ulong)((int)uVar14 - 1);
          uVar7 = uVar18;
        } while (*(char *)(lVar21 + uVar18) != '@');
        lVar16 = lVar21 + (lVar16 >> 0x20);
        if (lVar16 != 0) {
          memset(local_160,0,0x100);
          if (*pbVar10 == 0x2e) {
            local_58 = 0xfe;
            local_160[0] = *pbVar10;
            iVar9 = ossl_a2ulabel(pbVar10,(ulong)local_160 | 1,&local_58);
            if (iVar9 < 1) {
LAB_00afff0c:
              uVar22 = 1;
              goto LAB_00affde8;
            }
            iVar9 = *piVar26;
            sVar24 = strlen((char *)local_160);
            if (sVar24 < (ulong)(long)iVar9) {
              if (sVar24 != 0) {
                lVar16 = -sVar24;
                do {
                  bVar6 = *pbVar25;
                  bVar5 = *(byte *)(lVar21 + iVar9 + lVar16);
                  if ((uint)bVar6 != (uint)bVar5) {
                    bVar1 = bVar6 + 0x20;
                    if (0x19 < bVar6 - 0x41) {
                      bVar1 = bVar6;
                    }
                    bVar6 = bVar5 + 0x20;
                    if (0x19 < bVar5 - 0x41) {
                      bVar6 = bVar5;
                    }
                    if (bVar1 != bVar6) goto LAB_00afff14;
                  }
                  uVar22 = 0;
                  lVar16 = lVar16 + 1;
                  pbVar25 = pbVar25 + 1;
                } while (lVar16 != 0);
                goto LAB_00affde8;
              }
LAB_00afffe0:
              uVar22 = 0;
              goto LAB_00affde8;
            }
          }
          else {
            iVar9 = ossl_a2ulabel(pbVar10,local_160,&local_58);
            if (iVar9 < 1) goto LAB_00afff0c;
            lVar21 = *(long *)(piVar26 + 2);
            iVar9 = *piVar26;
            pbVar25 = (byte *)(lVar16 + 1);
            sVar24 = (lVar21 - (long)pbVar25) + (long)iVar9;
            sVar13 = strlen((char *)local_160);
            if (sVar24 == sVar13) {
              if (sVar24 != 0) {
                pbVar17 = pbVar25 + (-(long)iVar9 - lVar21);
                do {
                  bVar6 = *pbVar15;
                  bVar5 = *pbVar25;
                  if ((uint)bVar6 != (uint)bVar5) {
                    bVar1 = bVar6 + 0x20;
                    if (0x19 < bVar6 - 0x41) {
                      bVar1 = bVar6;
                    }
                    bVar6 = bVar5 + 0x20;
                    if (0x19 < bVar5 - 0x41) {
                      bVar6 = bVar5;
                    }
                    if (bVar1 != bVar6) goto LAB_00afff14;
                  }
                  uVar22 = 0;
                  pbVar15 = pbVar15 + 1;
                  pbVar17 = pbVar17 + 1;
                  pbVar25 = pbVar25 + 1;
                } while (pbVar17 != (byte *)0x0);
                goto LAB_00affde8;
              }
              goto LAB_00afffe0;
            }
          }
LAB_00afff14:
          uVar22 = 0x2f;
          goto LAB_00affde8;
        }
      }
LAB_00affde4:
      uVar22 = 0x35;
LAB_00affde8:
      CRYPTO_free(pbVar10);
      return uVar22;
    }
    break;
  case 1:
    lVar19 = 0;
    pbVar25 = *(byte **)(*(int **)(param_3 + 8) + 2);
    iVar9 = **(int **)(param_3 + 8);
    lVar21 = (long)iVar9;
    __s2 = *(char **)(*(int **)(param_2 + 2) + 2);
    lVar16 = lVar21 << 0x20;
    do {
      lVar16 = lVar16 + -0x100000000;
      if (lVar21 + lVar19 < 1) {
        if (iVar9 + (int)lVar19 == 0) {
          pbVar15 = (byte *)0x0;
          goto LAB_00affba0;
        }
        break;
      }
      lVar27 = lVar19 + lVar21;
      lVar19 = lVar19 + -1;
    } while (pbVar25[lVar27 + -1] != 0x40);
    pbVar15 = pbVar25 + (lVar16 >> 0x20);
LAB_00affba0:
    iVar4 = **(int **)(param_2 + 2);
    lVar27 = (long)iVar4;
    lVar19 = 0;
    lVar16 = lVar27 << 0x20;
    do {
      lVar16 = lVar16 + -0x100000000;
      if (lVar27 + lVar19 < 1) {
        if (iVar4 + (int)lVar19 == 0) goto LAB_00affc34;
        break;
      }
      lVar8 = lVar19 + lVar27;
      lVar19 = lVar19 + -1;
    } while (__s2[lVar8 + -1] != '@');
    sVar24 = lVar16 >> 0x20;
    if (__s2 + sVar24 != (char *)0x0) {
      if (pbVar15 == (byte *)0x0) {
        pbVar15 = pbVar25;
        if ((0 < iVar9) && (*pbVar25 == 0x2e)) {
          if (iVar4 <= iVar9) {
            return 0x2f;
          }
          lVar21 = -lVar21;
          uVar20 = 0x2e;
          do {
            pbVar25 = pbVar25 + 1;
            bVar6 = __s2[lVar21 + lVar27];
            if (uVar20 != bVar6) {
              uVar2 = uVar20 + 0x20;
              if (0x19 < (uVar20 - 0x41 & 0xff)) {
                uVar2 = uVar20;
              }
              uVar20 = bVar6 + 0x20;
              if (0x19 < bVar6 - 0x41) {
                uVar20 = (uint)bVar6;
              }
              if ((uVar2 & 0xff) != (uVar20 & 0xff)) {
                return 0x2f;
              }
            }
            if (lVar21 == -1) {
              return 0;
            }
            uVar20 = (uint)*pbVar25;
            lVar21 = lVar21 + 1;
          } while( true );
        }
        goto LAB_00afff34;
      }
      if (pbVar15 != pbVar25) {
        if ((long)pbVar15 - (long)pbVar25 != sVar24) {
          return 0x2f;
        }
        pvVar11 = memchr(pbVar25,0,sVar24);
        if ((pvVar11 != (void *)0x0) || (pvVar11 = memchr(__s2,0,sVar24), pvVar11 != (void *)0x0))
        break;
        iVar9 = strncmp((char *)pbVar25,__s2,sVar24);
        if (iVar9 != 0) {
          return 0x2f;
        }
      }
      pbVar15 = pbVar15 + 1;
LAB_00afff34:
      pbVar10 = (byte *)(__s2 + sVar24 + 1);
      if (pbVar25 + (lVar21 - (long)pbVar15) != (byte *)(__s2 + (lVar27 - (long)pbVar10))) {
        return 0x2f;
      }
      if (pbVar25 + (lVar21 - (long)pbVar15) == (byte *)0x0) {
        return 0;
      }
      pbVar25 = pbVar15 + (-(long)pbVar25 - lVar21);
      do {
        bVar6 = *pbVar15;
        bVar5 = *pbVar10;
        if ((uint)bVar6 != (uint)bVar5) {
          bVar1 = bVar6 + 0x20;
          if (0x19 < bVar6 - 0x41) {
            bVar1 = bVar6;
          }
          bVar6 = bVar5 + 0x20;
          if (0x19 < bVar5 - 0x41) {
            bVar6 = bVar5;
          }
          if (bVar1 != bVar6) {
            return 0x2f;
          }
        }
        pbVar15 = pbVar15 + 1;
        pbVar25 = pbVar25 + 1;
        pbVar10 = pbVar10 + 1;
        if (pbVar25 == (byte *)0x0) {
          return 0;
        }
      } while( true );
    }
    break;
  case 2:
    iVar9 = **(int **)(param_3 + 8);
    if (iVar9 == 0) {
      return 0;
    }
    iVar4 = **(int **)(param_2 + 2);
    if (iVar4 < iVar9) {
      return 0x2f;
    }
    pbVar15 = *(byte **)(*(int **)(param_3 + 8) + 2);
    pbVar25 = *(byte **)(*(int **)(param_2 + 2) + 2);
    if (((iVar9 < iVar4) && (pbVar25 = pbVar25 + (iVar4 - iVar9), *pbVar15 != 0x2e)) &&
       (pbVar25[-1] != 0x2e)) {
      return 0x2f;
    }
    lVar16 = -(long)iVar9;
    do {
      bVar6 = *pbVar15;
      bVar5 = *pbVar25;
      if ((uint)bVar6 != (uint)bVar5) {
        bVar1 = bVar6 + 0x20;
        if (0x19 < bVar6 - 0x41) {
          bVar1 = bVar6;
        }
        bVar6 = bVar5 + 0x20;
        if (0x19 < bVar5 - 0x41) {
          bVar6 = bVar5;
        }
        if (bVar1 != bVar6) {
          return 0x2f;
        }
      }
      pbVar15 = pbVar15 + 1;
      lVar16 = lVar16 + 1;
      pbVar25 = pbVar25 + 1;
      if (lVar16 == 0) {
        return 0;
      }
    } while( true );
  default:
    goto switchD_00aff830_caseD_3;
  case 4:
    a = *(X509_NAME **)(param_2 + 2);
    a_00 = *(X509_NAME **)(param_3 + 8);
    if (((a->modified != 0) && (iVar9 = i2d_X509_NAME(a,(uchar **)0x0), iVar9 < 0)) ||
       ((a_00->modified != 0 && (iVar9 = i2d_X509_NAME(a_00,(uchar **)0x0), iVar9 < 0)))) {
      return 0x11;
    }
    if (a->canon_enclen < a_00->canon_enclen) {
      return 0x2f;
    }
    iVar9 = memcmp(a_00->canon_enc,a->canon_enc,(long)a_00->canon_enclen);
    uVar22 = 0;
    if (iVar9 != 0) {
      uVar22 = 0x2f;
    }
    return uVar22;
  case 6:
    piVar26 = *(int **)(param_3 + 8);
    pvVar23 = *(void **)(*(int **)(param_2 + 2) + 2);
    sVar24 = (size_t)**(int **)(param_2 + 2);
    pbVar25 = *(byte **)(piVar26 + 2);
    pvVar11 = memchr(pvVar23,0x3a,sVar24);
    if ((((pvVar11 != (void *)0x0) && (2 < (long)(sVar24 + (long)pvVar23) - (long)pvVar11)) &&
        (*(char *)((long)pvVar11 + 1) == '/')) && (*(char *)((long)pvVar11 + 2) == '/')) {
      pbVar15 = (byte *)((long)pvVar11 + 3);
      sVar13 = (long)pvVar23 + (sVar24 - (long)pbVar15);
      pvVar12 = memchr(pbVar15,0x3a,sVar13);
      if ((pvVar12 == (void *)0x0) &&
         (pvVar12 = memchr(pbVar15,0x2f,sVar13), pvVar12 == (void *)0x0)) {
        pvVar12 = (void *)(sVar24 + (long)pvVar23);
      }
      iVar9 = (int)((long)pvVar12 - (long)pbVar15);
      if (iVar9 != 0) {
        iVar4 = *piVar26;
        if ((0 < iVar4) && (*pbVar25 == 0x2e)) {
          if (iVar9 <= iVar4) {
            return 0x2f;
          }
          lVar16 = 3 - (long)iVar4;
          uVar20 = 0x2e;
          do {
            pbVar25 = pbVar25 + 1;
            bVar6 = *(byte *)((long)pvVar11 + lVar16 + iVar9);
            if (bVar6 != uVar20) {
              uVar2 = bVar6 + 0x20;
              if (0x19 < bVar6 - 0x41) {
                uVar2 = (uint)bVar6;
              }
              uVar3 = uVar20 + 0x20;
              if (0x19 < (uVar20 - 0x41 & 0xff)) {
                uVar3 = uVar20;
              }
              if ((uVar2 & 0xff) != (uVar3 & 0xff)) {
                return 0x2f;
              }
            }
            if (lVar16 == 2) {
              return 0;
            }
            uVar20 = (uint)*pbVar25;
            lVar16 = lVar16 + 1;
          } while( true );
        }
        if (iVar4 != iVar9) {
          return 0x2f;
        }
        if (((long)pvVar12 - (long)pbVar15 & 0xffffffffU) == 0) {
          return 0;
        }
        lVar16 = -(long)iVar9;
        do {
          bVar6 = *pbVar15;
          bVar5 = *pbVar25;
          if ((uint)bVar6 != (uint)bVar5) {
            bVar1 = bVar6 + 0x20;
            if (0x19 < bVar6 - 0x41) {
              bVar1 = bVar6;
            }
            bVar6 = bVar5 + 0x20;
            if (0x19 < bVar5 - 0x41) {
              bVar6 = bVar5;
            }
            if (bVar1 != bVar6) {
              return 0x2f;
            }
          }
          pbVar15 = pbVar15 + 1;
          lVar16 = lVar16 + 1;
          pbVar25 = pbVar25 + 1;
          if (lVar16 == 0) {
            return 0;
          }
        } while( true );
      }
    }
    break;
  case 7:
    iVar9 = **(int **)(param_2 + 2);
    lVar16 = *(long *)(*(int **)(param_3 + 8) + 2);
    iVar4 = **(int **)(param_3 + 8);
    if (((iVar9 == 0x10) || (iVar9 == 4)) && ((iVar4 == 0x20 || (iVar4 == 8)))) {
      if (iVar9 * 2 != iVar4) {
        return 0x2f;
      }
      lVar21 = 0;
      do {
        if (((*(byte *)(lVar16 + lVar21) ^ *(byte *)(*(long *)(*(int **)(param_2 + 2) + 2) + lVar21)
             ) & *(byte *)(lVar16 + iVar9 + lVar21)) != 0) {
          return 0x2f;
        }
        lVar21 = lVar21 + 1;
      } while (lVar21 < iVar9);
      return 0;
    }
  }
LAB_00affc34:
  uVar22 = 0x35;
switchD_00aff830_caseD_3:
  return uVar22;
}

