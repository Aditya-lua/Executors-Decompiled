/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0dcb0
 */

undefined8 FUN_00b0dcb0(long param_1)

{
  bool bVar1;
  uint *puVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  X509 *pXVar10;
  long lVar11;
  X509 *pXVar12;
  X509_NAME *pXVar13;
  long lVar14;
  X509_NAME_ENTRY *ne;
  ASN1_OBJECT *o;
  X509_NAME *name;
  GENERAL_NAMES *a;
  int *piVar15;
  code *pcVar16;
  undefined4 uVar17;
  uint uVar18;
  NAME_CONSTRAINTS *nc;
  uint uVar19;
  int iVar20;
  int local_68;
  int local_64;
  
  uVar9 = FUN_00b10a8c();
  if ((int)uVar9 < 1) {
    return uVar9;
  }
  iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  if (*(long *)(param_1 + 0xd8) == 0) {
    iVar20 = *(int *)(*(long *)(param_1 + 0x20) + 0x20);
    uVar19 = *(uint *)(*(long *)(param_1 + 0x20) + 0x18) >> 6 & 1;
  }
  else {
    uVar19 = 0;
    iVar20 = 6;
  }
  puVar2 = (uint *)(param_1 + 0xac);
  if (0 < iVar3) {
    iVar7 = 0;
    uVar18 = 0;
    iVar8 = 0;
    iVar6 = -1;
    do {
      pXVar10 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
      if (((*(byte *)(*(long *)(param_1 + 0x20) + 0x18) >> 4 & 1) == 0) &&
         ((*(byte *)((long)&pXVar10[1].name + 1) >> 1 & 1) != 0)) {
        *(X509 **)(param_1 + 0xb8) = pXVar10;
        *(uint *)(param_1 + 0xac) = uVar18;
        *(undefined4 *)(param_1 + 0xb0) = 0x22;
        uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
        if ((int)uVar9 == 0) {
          return uVar9;
        }
      }
      if ((uVar19 == 0) && ((*(byte *)((long)&pXVar10[1].name + 1) >> 2 & 1) != 0)) {
        *(X509 **)(param_1 + 0xb8) = pXVar10;
        *(uint *)(param_1 + 0xac) = uVar18;
        *(undefined4 *)(param_1 + 0xb0) = 0x28;
        uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
        if ((int)uVar9 == 0) {
          return uVar9;
        }
      }
      uVar4 = X509_check_ca(pXVar10);
      if (iVar6 == 0) {
        if (uVar4 != 0) {
          *puVar2 = uVar18;
          pXVar12 = pXVar10;
          if (pXVar10 == (X509 *)0x0) {
            pXVar12 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
          }
          pcVar16 = *(code **)(param_1 + 0x38);
          *(X509 **)(param_1 + 0xb8) = pXVar12;
          uVar17 = 0x25;
LAB_00b0de3c:
          *(undefined4 *)(param_1 + 0xb0) = uVar17;
          uVar9 = (*pcVar16)(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
      }
      else if (iVar6 == -1) {
        if (1 < uVar4) {
LAB_00b0de0c:
          if (((uint)*(undefined8 *)(*(long *)(param_1 + 0x20) + 0x18) >> 5 & 1) != 0)
          goto LAB_00b0de18;
        }
      }
      else {
        if (uVar4 == 0) {
LAB_00b0de18:
          *puVar2 = uVar18;
          pXVar12 = pXVar10;
          if (pXVar10 == (X509 *)0x0) {
            pXVar12 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
          }
          pcVar16 = *(code **)(param_1 + 0x38);
          uVar17 = 0x4f;
          *(X509 **)(param_1 + 0xb8) = pXVar12;
          goto LAB_00b0de3c;
        }
        if ((int)(uVar18 + 1) < iVar3) {
          if (uVar4 != 1) goto LAB_00b0de18;
        }
        else if (uVar4 != 1) goto LAB_00b0de0c;
      }
      if (iVar3 != 1) {
        lVar11 = X509_get0_pubkey(pXVar10);
        if (lVar11 == 0) {
LAB_00b0ded8:
          *puVar2 = uVar18;
          pXVar12 = pXVar10;
          if (pXVar10 == (X509 *)0x0) {
            pXVar12 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
          }
          pcVar16 = *(code **)(param_1 + 0x38);
          *(X509 **)(param_1 + 0xb8) = pXVar12;
          uVar17 = 1;
LAB_00b0defc:
          *(undefined4 *)(param_1 + 0xb0) = uVar17;
          uVar9 = (*pcVar16)(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
        else {
          iVar5 = EVP_PKEY_get_id();
          if (iVar5 == 0x198) {
            iVar5 = EVP_PKEY_get_int_param(lVar11,"decoded-from-explicit",&local_68);
            if (iVar5 != 1) goto LAB_00b0ded8;
            if (local_68 == 0) goto LAB_00b0df10;
            *puVar2 = uVar18;
            pXVar12 = pXVar10;
            if (pXVar10 == (X509 *)0x0) {
              pXVar12 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
            }
            pcVar16 = *(code **)(param_1 + 0x38);
            uVar17 = 0x5e;
            *(X509 **)(param_1 + 0xb8) = pXVar12;
            goto LAB_00b0defc;
          }
        }
LAB_00b0df10:
        if ((*(byte *)(*(long *)(param_1 + 0x20) + 0x18) >> 5 & 1) != 0) {
          if (pXVar10[1].signature != (ASN1_BIT_STRING *)0xffffffffffffffff) {
            if ((*(byte *)&pXVar10[1].name >> 4 & 1) == 0) {
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              *(undefined4 *)(param_1 + 0xb0) = 0x50;
              uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
            if ((*(byte *)((long)&pXVar10[1].name + 4) >> 2 & 1) == 0) {
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              *(undefined4 *)(param_1 + 0xb0) = 0x51;
              uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
          }
          uVar4 = *(uint *)&pXVar10[1].name;
          if ((uVar4 & 0x10011) == 0x11) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x59;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
            uVar4 = *(uint *)&pXVar10[1].name;
          }
          if ((uVar4 >> 4 & 1) == 0) {
            if ((*(byte *)((long)&pXVar10[1].name + 4) >> 2 & 1) != 0) {
              pcVar16 = *(code **)(param_1 + 0x38);
              uVar17 = 0x52;
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              goto LAB_00b0e000;
            }
          }
          else if ((uVar4 >> 1 & 1) == 0) {
            pcVar16 = *(code **)(param_1 + 0x38);
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            uVar17 = 0x5c;
LAB_00b0e000:
            *(undefined4 *)(param_1 + 0xb0) = uVar17;
            uVar9 = (*pcVar16)(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
          pXVar13 = X509_get_issuer_name(pXVar10);
          iVar5 = X509_NAME_entry_count(pXVar13);
          if (iVar5 == 0) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x53;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
          if ((((*(byte *)&pXVar10[1].name >> 4 & 1) != 0) ||
              ((*(byte *)((long)&pXVar10[1].name + 4) >> 1 & 1) != 0)) ||
             (pXVar10[1].ex_kusage == 0)) {
            pXVar13 = X509_get_subject_name(pXVar10);
            iVar5 = X509_NAME_entry_count(pXVar13);
            if (iVar5 == 0) {
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              *(undefined4 *)(param_1 + 0xb0) = 0x54;
              uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
          }
          pXVar13 = X509_get_subject_name(pXVar10);
          iVar5 = X509_NAME_entry_count(pXVar13);
          if (iVar5 == 0) {
            if (pXVar10[1].ex_kusage != 0) {
              if ((*(byte *)((long)&pXVar10[1].name + 2) >> 3 & 1) == 0) {
                *(X509 **)(param_1 + 0xb8) = pXVar10;
                *(uint *)(param_1 + 0xac) = uVar18;
                *(undefined4 *)(param_1 + 0xb0) = 0x58;
                uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
                if ((int)uVar9 == 0) {
                  return uVar9;
                }
              }
              goto LAB_00b0e094;
            }
          }
          else {
LAB_00b0e094:
            if ((pXVar10[1].ex_kusage != 0) && (iVar5 = OPENSSL_sk_num(), iVar5 < 1)) {
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              *(undefined4 *)(param_1 + 0xb0) = 0x57;
              uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
          }
          iVar5 = X509_ALGOR_cmp((X509_ALGOR *)&pXVar10->altname,(X509_ALGOR *)&pXVar10->name);
          if (iVar5 != 0) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x4e;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
          if ((pXVar10[1].ex_pathlen != 0) &&
             ((*(byte *)((long)&pXVar10[1].name + 2) >> 1 & 1) != 0)) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x5a;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
          if ((*(long *)&pXVar10[1].ex_data.dummy != 0) &&
             ((*(byte *)((long)&pXVar10[1].name + 2) >> 2 & 1) != 0)) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x5b;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
          lVar11 = X509_get_version(pXVar10);
          if (lVar11 < 2) {
            X509_get0_extensions(pXVar10);
            iVar5 = OPENSSL_sk_num();
            if (0 < iVar5) {
              pcVar16 = *(code **)(param_1 + 0x38);
              uVar17 = 0x5d;
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              goto LAB_00b0e224;
            }
          }
          else {
            if (((int)(uVar18 + 1) < iVar3) &&
               (((long *)pXVar10[1].ex_pathlen == (long *)0x0 ||
                (*(long *)pXVar10[1].ex_pathlen == 0)))) {
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              *(undefined4 *)(param_1 + 0xb0) = 0x55;
              uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
            if (((*(byte *)&pXVar10[1].name >> 4 & 1) != 0) &&
               (*(long *)&pXVar10[1].ex_data.dummy == 0)) {
              pcVar16 = *(code **)(param_1 + 0x38);
              *(X509 **)(param_1 + 0xb8) = pXVar10;
              *(uint *)(param_1 + 0xac) = uVar18;
              uVar17 = 0x56;
LAB_00b0e224:
              *(undefined4 *)(param_1 + 0xb0) = uVar17;
              uVar9 = (*pcVar16)(0,param_1);
              if ((int)uVar9 == 0) {
                return uVar9;
              }
            }
          }
        }
      }
      if (0 < iVar20) {
        if (((int)uVar18 < *(int *)(param_1 + 0x94)) ||
           (*(int *)(*(long *)(param_1 + 0x20) + 0x20) != iVar20)) {
LAB_00b0e27c:
          iVar6 = X509_check_purpose(pXVar10,iVar20,(uint)(0 < iVar6));
          if ((iVar6 == 0) ||
             ((iVar6 != 1 && ((*(byte *)(*(long *)(param_1 + 0x20) + 0x18) >> 5 & 1) != 0)))) {
LAB_00b0e2a8:
            *puVar2 = uVar18;
            pXVar12 = pXVar10;
            if (pXVar10 == (X509 *)0x0) {
              pXVar12 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar18);
            }
            *(X509 **)(param_1 + 0xb8) = pXVar12;
            *(undefined4 *)(param_1 + 0xb0) = 0x1a;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
          }
        }
        else {
          iVar5 = X509_check_trust(pXVar10,*(int *)(*(long *)(param_1 + 0x20) + 0x24),4);
          if (iVar5 != 1) {
            if (iVar5 != 2) goto LAB_00b0e27c;
            goto LAB_00b0e2a8;
          }
        }
      }
      if (uVar18 < 2) {
        if (uVar18 != 0) goto LAB_00b0e328;
        if ((*(uint *)&pXVar10[1].name >> 10 & 1) == 0) goto LAB_00b0e33c;
LAB_00b0e34c:
        lVar11._0_4_ = pXVar10[1].valid;
        lVar11._4_4_ = pXVar10[1].references;
        if (lVar11 != -1) {
          if (lVar11 < iVar7) {
            *(X509 **)(param_1 + 0xb8) = pXVar10;
            *(uint *)(param_1 + 0xac) = uVar18;
            *(undefined4 *)(param_1 + 0xb0) = 0x26;
            uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
            if ((int)uVar9 == 0) {
              return uVar9;
            }
            lVar11._0_4_ = pXVar10[1].valid;
            lVar11._4_4_ = pXVar10[1].references;
          }
          iVar7 = (int)lVar11;
        }
        iVar6 = 0;
        iVar7 = iVar7 + 1;
      }
      else {
        if ((pXVar10[1].signature != (ASN1_BIT_STRING *)0xffffffffffffffff) &&
           ((long)&(pXVar10[1].signature)->length + (long)iVar7 < (long)iVar8)) {
          *(X509 **)(param_1 + 0xb8) = pXVar10;
          *(uint *)(param_1 + 0xac) = uVar18;
          *(undefined4 *)(param_1 + 0xb0) = 0x19;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
LAB_00b0e328:
        iVar8 = ((*(uint *)&pXVar10[1].name >> 5 ^ 0xffffffff) & 1) + iVar8;
        if ((*(uint *)&pXVar10[1].name >> 10 & 1) != 0) goto LAB_00b0e34c;
LAB_00b0e33c:
        iVar6 = 1;
      }
      uVar18 = uVar18 + 1;
    } while ((int)uVar18 < iVar3);
  }
  iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  if ((0 < iVar3) && (0 < *(int *)(*(long *)(param_1 + 0x20) + 0x2c))) {
    uVar19 = 0;
    do {
      lVar11 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar19);
      if (uVar19 != 0) {
        lVar14 = X509_get0_pubkey(lVar11);
        iVar20 = *(int *)(*(long *)(param_1 + 0x20) + 0x2c);
        if (0 < iVar20) {
          if (lVar14 != 0) {
            if (4 < iVar20) {
              iVar20 = 5;
            }
            iVar7 = EVP_PKEY_get_security_bits();
            if ((int)(&UINT_0077b7f0)[iVar20] <= iVar7) goto LAB_00b0e458;
          }
          *puVar2 = uVar19;
          lVar14 = lVar11;
          if (lVar11 == 0) {
            lVar14 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar19);
          }
          *(long *)(param_1 + 0xb8) = lVar14;
          *(undefined4 *)(param_1 + 0xb0) = 0x43;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
      }
LAB_00b0e458:
      if ((int)uVar19 < iVar3 + -1) {
        local_64 = -1;
        iVar20 = *(int *)(*(long *)(param_1 + 0x20) + 0x2c);
        if (0 < iVar20) {
          iVar7 = X509_get_signature_info(lVar11,0,0,&local_64,0);
          if (iVar7 != 0) {
            if (4 < iVar20) {
              iVar20 = 5;
            }
            if ((int)(&UINT_0077b7f0)[iVar20] <= local_64) goto LAB_00b0e4e4;
          }
          *puVar2 = uVar19;
          if (lVar11 == 0) {
            lVar11 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),uVar19);
          }
          *(long *)(param_1 + 0xb8) = lVar11;
          *(undefined4 *)(param_1 + 0xb0) = 0x44;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
      }
LAB_00b0e4e4:
      uVar19 = uVar19 + 1;
    } while ((int)uVar19 < iVar3);
  }
  uVar9 = FUN_00b11384(param_1);
  if ((int)uVar9 < 1) {
    return uVar9;
  }
  iVar3 = X509_get_pubkey_parameters((EVP_PKEY *)0x0,*(stack_st_X509 **)(param_1 + 0x98));
  if (iVar3 == 0) {
    return 0xffffffff;
  }
  uVar9 = (**(code **)(param_1 + 0x50))(param_1);
  if ((int)uVar9 < 1) {
    return uVar9;
  }
  iVar3 = X509_chain_check_suiteb
                    (puVar2,0,*(undefined8 *)(param_1 + 0x98),
                     *(undefined8 *)(*(long *)(param_1 + 0x20) + 0x18));
  if (iVar3 != 0) {
    uVar9 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),*(undefined4 *)(param_1 + 0xac));
    *(undefined8 *)(param_1 + 0xb8) = uVar9;
    *(int *)(param_1 + 0xb0) = iVar3;
    uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
    if ((int)uVar9 == 0) {
      return uVar9;
    }
  }
  if (*(code **)(param_1 + 0x30) == (code *)0x0) {
    uVar9 = FUN_00b0fba0(param_1);
    iVar3 = (int)uVar9;
  }
  else {
    uVar9 = (**(code **)(param_1 + 0x30))(param_1);
    iVar3 = (int)uVar9;
  }
  if (iVar3 < 1) {
    return uVar9;
  }
  iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  if (0 < iVar3) {
    do {
      iVar20 = iVar3 + -1;
      pXVar10 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar20);
      if ((iVar20 == 0) || ((*(uint *)&pXVar10[1].name >> 5 & 1) == 0)) {
        if ((*(uint *)&pXVar10[1].name >> 10 & 1) != 0) {
          pXVar13 = X509_get_subject_name(pXVar10);
          name = X509_get_issuer_name(pXVar10);
          iVar7 = X509_NAME_entry_count(pXVar13);
          if (iVar7 < 2) {
LAB_00b0e6b4:
            iVar7 = 0x48;
          }
          else {
            iVar8 = X509_NAME_entry_count(pXVar13);
            iVar6 = X509_NAME_entry_count(name);
            if (iVar8 != iVar6 + 1) goto LAB_00b0e6b4;
            X509_NAME_get_entry(pXVar13,iVar7 + -1);
            iVar8 = X509_NAME_ENTRY_set();
            X509_NAME_get_entry(pXVar13,iVar7 + -2);
            iVar6 = X509_NAME_ENTRY_set();
            if (iVar8 == iVar6) goto LAB_00b0e6b4;
            pXVar13 = X509_NAME_dup(pXVar13);
            if (pXVar13 == (X509_NAME *)0x0) {
              ERR_new();
              ERR_set_debug("crypto/x509/x509_vfy.c",0x2c2,"check_name_constraints");
              ERR_set_error(0xb,0xc0100,0);
              *(undefined4 *)(param_1 + 0xb0) = 0x11;
              return 0xffffffff;
            }
            ne = X509_NAME_delete_entry(pXVar13,iVar7 + -1);
            o = X509_NAME_ENTRY_get_object(ne);
            iVar7 = OBJ_obj2nid(o);
            if ((iVar7 == 0xd) && (iVar7 = X509_NAME_cmp(pXVar13,name), iVar7 == 0)) {
              iVar7 = 0;
            }
            else {
              iVar7 = 0x48;
            }
            X509_NAME_ENTRY_free(ne);
            X509_NAME_free(pXVar13);
            if (iVar7 == 0) goto LAB_00b0e6d4;
          }
          *(X509 **)(param_1 + 0xb8) = pXVar10;
          *(int *)(param_1 + 0xac) = iVar20;
          *(int *)(param_1 + 0xb0) = iVar7;
          uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
          if ((int)uVar9 == 0) {
            return uVar9;
          }
        }
LAB_00b0e6d4:
        iVar7 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
        if (iVar3 < iVar7) {
          do {
            iVar7 = iVar7 + -1;
            lVar11 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar7);
            nc = *(NAME_CONSTRAINTS **)(lVar11 + 0x120);
            if (nc != (NAME_CONSTRAINTS *)0x0) {
              iVar8 = NAME_CONSTRAINTS_check(pXVar10,nc);
              if ((iVar8 == 0 && iVar20 == 0) &&
                 (uVar19 = *(uint *)(*(long *)(param_1 + 0x20) + 0x40), (uVar19 >> 5 & 1) == 0)) {
                if (((uVar19 & 1) == 0) &&
                   (a = X509_get_ext_d2i(pXVar10,0x55,(int *)0x0,(int *)0x0),
                   a != (GENERAL_NAMES *)0x0)) {
                  iVar6 = OPENSSL_sk_num();
                  if (0 < iVar6) {
                    iVar6 = 0;
                    do {
                      piVar15 = (int *)OPENSSL_sk_value(a,iVar6);
                      if (*piVar15 == 2) {
                        GENERAL_NAMES_free(a);
                        goto joined_r0x00b0e6f4;
                      }
                      iVar6 = iVar6 + 1;
                      iVar5 = OPENSSL_sk_num(a);
                    } while (iVar6 < iVar5);
                  }
                  GENERAL_NAMES_free(a);
                }
                iVar8 = NAME_CONSTRAINTS_check_CN(pXVar10,nc);
              }
joined_r0x00b0e6f4:
              if (iVar8 != 0) {
                if (iVar8 == 0x11) {
                  return 0xffffffff;
                }
                *(X509 **)(param_1 + 0xb8) = pXVar10;
                *(int *)(param_1 + 0xac) = iVar20;
                *(int *)(param_1 + 0xb0) = iVar8;
                uVar9 = (**(code **)(param_1 + 0x38))(0,param_1);
                if ((int)uVar9 == 0) {
                  return uVar9;
                }
              }
            }
          } while (iVar3 < iVar7);
        }
      }
      bVar1 = 1 < iVar3;
      iVar3 = iVar20;
    } while (bVar1);
  }
  uVar9 = X509v3_asid_validate_path(param_1);
  if ((int)uVar9 < 1) {
    return uVar9;
  }
  uVar9 = X509v3_addr_validate_path(param_1);
  if ((int)uVar9 < 1) {
    return uVar9;
  }
  if (*(char *)(*(long *)(param_1 + 0x20) + 0x18) < '\0') {
    uVar9 = (**(code **)(param_1 + 0x70))(param_1);
    return uVar9;
  }
  return uVar9;
}

