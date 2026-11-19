/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b11520
 */

bool FUN_00b11520(long param_1,long *param_2,long *param_3,undefined8 *param_4,uint *param_5,
                 uint *param_6,undefined8 param_7)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  undefined8 *puVar6;
  int *piVar7;
  GENERAL_NAME *a;
  GENERAL_NAME *b;
  undefined8 uVar8;
  undefined8 uVar9;
  long lVar10;
  X509_NAME *pXVar11;
  X509_NAME *pXVar12;
  X509 *issuer;
  X509 *a_00;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  undefined8 *local_d0;
  X509 *local_b8;
  X509_NAME *local_b0;
  int *local_a8;
  long local_a0;
  X509 *local_98;
  int local_68;
  int local_64;
  
  a_00 = *(X509 **)(param_1 + 0xb8);
  uVar17 = *param_5;
  iVar1 = OPENSSL_sk_num(param_7);
  if (0 < iVar1) {
    iVar1 = 0;
    local_b8 = (X509 *)0x0;
    local_a0 = 0;
    local_98 = (X509 *)0x0;
    uVar15 = 0;
LAB_00b118e8:
    lVar10 = OPENSSL_sk_value(param_7,iVar1);
    uVar16 = *(uint *)(lVar10 + 0x98);
    if ((uVar16 >> 1 & 1) != 0) goto LAB_00b11ac8;
    uVar14 = *param_6;
    if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x19) >> 4 & 1) == 0) {
      if ((uVar16 & 0x60) == 0) goto LAB_00b1193c;
      goto LAB_00b11ac8;
    }
    if ((uVar16 >> 6 & 1) != 0) {
      if ((*(uint *)(lVar10 + 0x9c) & (uVar14 ^ 0xffffffff)) != 0) goto LAB_00b1193c;
      goto LAB_00b11ac8;
    }
    if (*(long *)(lVar10 + 0xa8) != 0) goto LAB_00b11ac8;
LAB_00b1193c:
    pXVar11 = X509_get_issuer_name(a_00);
    pXVar12 = (X509_NAME *)X509_CRL_get_issuer(lVar10);
    iVar4 = X509_NAME_cmp(pXVar11,pXVar12);
    if (iVar4 == 0) {
      uVar16 = 0x20;
LAB_00b1197c:
      uVar16 = (*(uint *)(lVar10 + 0x84) >> 1 & 0x100 | uVar16) ^ 0x100;
      iVar4 = FUN_00b11c58(param_1,lVar10,0);
      if (iVar4 != 0) {
        uVar16 = uVar16 | 0x40;
      }
      pXVar11 = (X509_NAME *)X509_CRL_get_issuer(lVar10);
      iVar4 = *(int *)(param_1 + 0xac);
      iVar5 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
      if (iVar4 != iVar5 + -1) {
        iVar4 = iVar4 + 1;
      }
      issuer = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
      iVar5 = X509_check_akid(issuer,*(AUTHORITY_KEYID **)(lVar10 + 0x88));
      if (((uVar16 >> 5 & 1) == 0) || (iVar5 != 0)) {
        do {
          iVar4 = iVar4 + 1;
          iVar5 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
          if (iVar5 <= iVar4) {
            if (((*(byte *)(*(long *)(param_1 + 0x20) + 0x19) >> 4 & 1) == 0) ||
               (iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x10)), iVar4 < 1))
            goto LAB_00b11ab8;
            iVar4 = 0;
            goto LAB_00b11a74;
          }
          issuer = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
          pXVar12 = X509_get_subject_name(issuer);
          iVar5 = X509_NAME_cmp(pXVar12,pXVar11);
        } while ((iVar5 != 0) ||
                (iVar5 = X509_check_akid(issuer,*(AUTHORITY_KEYID **)(lVar10 + 0x88)), iVar5 != 0));
        uVar16 = uVar16 | 0xc;
      }
      else {
        uVar16 = uVar16 | 0x1c;
      }
LAB_00b11a00:
      local_98 = issuer;
      goto LAB_00b11ab8;
    }
    uVar16 = 0;
    if ((*(byte *)(lVar10 + 0x98) >> 5 & 1) != 0) goto LAB_00b1197c;
    goto LAB_00b11970;
  }
  goto LAB_00b11c30;
  while( true ) {
    iVar4 = iVar4 + 1;
    iVar5 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x10));
    if (iVar5 <= iVar4) break;
LAB_00b11a74:
    issuer = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x10),iVar4);
    pXVar12 = X509_get_subject_name(issuer);
    iVar5 = X509_NAME_cmp(pXVar12,pXVar11);
    if ((iVar5 == 0) &&
       (iVar5 = X509_check_akid(issuer,*(AUTHORITY_KEYID **)(lVar10 + 0x88)), iVar5 == 0)) {
      uVar16 = uVar16 | 4;
      goto LAB_00b11a00;
    }
  }
LAB_00b11ab8:
  if ((uVar16 >> 2 & 1) != 0) {
    uVar13 = *(uint *)(lVar10 + 0x98);
    if ((uVar13 >> 4 & 1) == 0) {
      if ((*(byte *)&a_00[1].name >> 4 & 1) == 0) {
        uVar13 = uVar13 >> 3;
      }
      else {
        uVar13 = uVar13 >> 2;
      }
      if ((uVar13 & 1) == 0) {
        uVar13 = *(uint *)(lVar10 + 0x9c);
        iVar4 = OPENSSL_sk_num(a_00[1].ex_flags);
        if (0 < iVar4) {
          iVar4 = 0;
          do {
            local_d0 = (undefined8 *)(lVar10 + 0x90);
            puVar6 = (undefined8 *)OPENSSL_sk_value(a_00[1].ex_flags,iVar4);
            pXVar11 = (X509_NAME *)X509_CRL_get_issuer(lVar10);
            if (puVar6[2] == 0) {
              if ((uVar16 >> 5 & 1) != 0) {
LAB_00b11660:
                if (((undefined8 *)*local_d0 == (undefined8 *)0x0) ||
                   ((local_a8 = (int *)*puVar6, local_a8 == (int *)0x0 ||
                    (piVar7 = *(int **)*local_d0, piVar7 == (int *)0x0)))) {
LAB_00b117f8:
                  uVar13 = *(uint *)(puVar6 + 3) & uVar13;
                  if ((uVar13 & (uVar14 ^ 0xffffffff)) != 0) goto LAB_00b11840;
                  goto LAB_00b11ac8;
                }
                if (*local_a8 == 1) {
                  local_b0 = *(X509_NAME **)(local_a8 + 4);
                  if (local_b0 != (X509_NAME *)0x0) {
                    if (*piVar7 == 1) {
                      if ((*(X509_NAME **)(piVar7 + 4) != (X509_NAME *)0x0) &&
                         (iVar5 = X509_NAME_cmp(local_b0,*(X509_NAME **)(piVar7 + 4)), iVar5 == 0))
                      goto LAB_00b117f8;
                    }
                    else {
                      local_a8 = piVar7;
LAB_00b11774:
                      uVar8 = *(undefined8 *)(local_a8 + 2);
                      iVar5 = OPENSSL_sk_num(uVar8);
                      if (0 < iVar5) {
                        iVar5 = 0;
                        do {
                          piVar7 = (int *)OPENSSL_sk_value(uVar8,iVar5);
                          if ((*piVar7 == 4) &&
                             (iVar2 = X509_NAME_cmp(local_b0,*(X509_NAME **)(piVar7 + 2)),
                             iVar2 == 0)) goto LAB_00b117f8;
                          iVar5 = iVar5 + 1;
                          iVar2 = OPENSSL_sk_num(uVar8);
                        } while (iVar5 < iVar2);
                      }
                    }
                  }
                }
                else if (*piVar7 == 1) {
                  local_b0 = *(X509_NAME **)(piVar7 + 4);
                  if (local_b0 != (X509_NAME *)0x0) goto LAB_00b11774;
                }
                else {
                  iVar5 = OPENSSL_sk_num(*(undefined8 *)(local_a8 + 2));
                  if (0 < iVar5) {
                    iVar5 = 0;
                    do {
                      a = (GENERAL_NAME *)OPENSSL_sk_value(*(undefined8 *)(local_a8 + 2),iVar5);
                      iVar2 = OPENSSL_sk_num(*(undefined8 *)(piVar7 + 2));
                      if (0 < iVar2) {
                        iVar2 = 0;
                        do {
                          b = (GENERAL_NAME *)OPENSSL_sk_value(*(undefined8 *)(piVar7 + 2),iVar2);
                          iVar3 = GENERAL_NAME_cmp(a,b);
                          if (iVar3 == 0) goto LAB_00b117f8;
                          iVar2 = iVar2 + 1;
                          iVar3 = OPENSSL_sk_num(*(undefined8 *)(piVar7 + 2));
                        } while (iVar2 < iVar3);
                      }
                      iVar5 = iVar5 + 1;
                      iVar2 = OPENSSL_sk_num(*(undefined8 *)(local_a8 + 2));
                    } while (iVar5 < iVar2);
                  }
                }
              }
            }
            else {
              iVar5 = OPENSSL_sk_num(puVar6[2]);
              if (0 < iVar5) {
                iVar5 = 0;
                do {
                  piVar7 = (int *)OPENSSL_sk_value(puVar6[2],iVar5);
                  if ((*piVar7 == 4) &&
                     (iVar2 = X509_NAME_cmp(*(X509_NAME **)(piVar7 + 2),pXVar11), iVar2 == 0))
                  goto LAB_00b11660;
                  iVar5 = iVar5 + 1;
                  iVar2 = OPENSSL_sk_num(puVar6[2]);
                } while (iVar5 < iVar2);
              }
            }
            iVar4 = iVar4 + 1;
            iVar5 = OPENSSL_sk_num(a_00[1].ex_flags);
          } while (iVar4 < iVar5);
        }
        if (*(long **)(lVar10 + 0x90) == (long *)0x0) {
          if ((uVar16 >> 5 & 1) != 0) goto LAB_00b11838;
        }
        else if (((uVar16 >> 5 & 1) != 0) && (**(long **)(lVar10 + 0x90) == 0)) {
LAB_00b11838:
          if ((uVar13 & (uVar14 ^ 0xffffffff)) == 0) goto LAB_00b11ac8;
LAB_00b11840:
          uVar14 = uVar13 | uVar14;
          uVar16 = uVar16 | 0x80;
        }
      }
    }
    if (((int)uVar17 <= (int)uVar16) && (uVar16 != 0)) {
      if ((local_a0 != 0) && (uVar16 == uVar17)) {
        uVar8 = X509_CRL_get0_lastUpdate(local_a0);
        uVar9 = X509_CRL_get0_lastUpdate(lVar10);
        iVar4 = ASN1_TIME_diff(&local_64,&local_68,uVar8,uVar9);
        if (iVar4 == 0) {
LAB_00b11970:
          uVar14 = uVar15;
          goto LAB_00b11acc;
        }
        if ((local_64 < 1) && (local_68 < 1)) {
          uVar14 = uVar15;
          goto LAB_00b11acc;
        }
      }
      local_b8 = local_98;
      uVar17 = uVar16;
      local_a0 = lVar10;
      goto LAB_00b11acc;
    }
  }
LAB_00b11ac8:
  uVar14 = uVar15;
LAB_00b11acc:
  iVar1 = iVar1 + 1;
  iVar4 = OPENSSL_sk_num(param_7);
  uVar15 = uVar14;
  if (iVar4 <= iVar1) goto code_r0x00b11ae0;
  goto LAB_00b118e8;
code_r0x00b11ae0:
  if (local_a0 != 0) {
    X509_CRL_free((X509_CRL *)*param_2);
    *param_2 = local_a0;
    *param_4 = local_b8;
    *param_5 = uVar17;
    *param_6 = uVar14;
    X509_CRL_up_ref(local_a0);
    X509_CRL_free((X509_CRL *)*param_3);
    *param_3 = 0;
    if (((*(byte *)(*(long *)(param_1 + 0x20) + 0x19) >> 5 & 1) != 0) &&
       (((*(uint *)(local_a0 + 0x84) | *(uint *)(*(long *)(param_1 + 0xb8) + 0xe8)) >> 0xc & 1) != 0
       )) {
      iVar1 = OPENSSL_sk_num(param_7);
      if (0 < iVar1) {
        iVar1 = 0;
        do {
          lVar10 = OPENSSL_sk_value(param_7,iVar1);
          if ((*(long *)(lVar10 + 0xa8) != 0) && (*(long *)(local_a0 + 0xa0) != 0)) {
            pXVar11 = (X509_NAME *)X509_CRL_get_issuer(local_a0);
            pXVar12 = (X509_NAME *)X509_CRL_get_issuer(lVar10);
            iVar4 = X509_NAME_cmp(pXVar11,pXVar12);
            if (((iVar4 == 0) &&
                (((iVar4 = FUN_00b0f224(lVar10,local_a0,0x5a), iVar4 != 0 &&
                  (iVar4 = FUN_00b0f224(lVar10,local_a0,0x302), iVar4 != 0)) &&
                 (iVar4 = ASN1_INTEGER_cmp(*(ASN1_INTEGER **)(lVar10 + 0xa8),
                                           *(ASN1_INTEGER **)(local_a0 + 0xa0)), iVar4 < 1)))) &&
               (iVar4 = ASN1_INTEGER_cmp(*(ASN1_INTEGER **)(lVar10 + 0xa0),
                                         *(ASN1_INTEGER **)(local_a0 + 0xa0)), 0 < iVar4)) {
              iVar1 = FUN_00b11c58(param_1,lVar10,0);
              if (iVar1 != 0) {
                *param_5 = *param_5 | 2;
              }
              X509_CRL_up_ref(lVar10);
              *param_3 = lVar10;
              goto LAB_00b11c30;
            }
          }
          iVar1 = iVar1 + 1;
          iVar4 = OPENSSL_sk_num(param_7);
        } while (iVar1 < iVar4);
      }
      *param_3 = 0;
    }
  }
LAB_00b11c30:
  return 0x1bf < (int)uVar17;
}

