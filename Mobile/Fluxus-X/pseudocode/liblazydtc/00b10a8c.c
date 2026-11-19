/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b10a8c
 */

/* WARNING: Type propagation algorithm not settling */

int FUN_00b10a8c(long param_1)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  X509 *a;
  long lVar9;
  long lVar10;
  X509 *pXVar11;
  char *pcVar12;
  undefined8 uVar13;
  uint uVar14;
  undefined4 uVar15;
  long lVar16;
  uint uVar17;
  long lVar18;
  uint uVar19;
  int local_6c;
  X509 *local_68;
  
  lVar18 = *(long *)(param_1 + 0xf0);
  iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  lVar16 = 0;
  if ((iVar3 != 1) || (lVar16 = 0, *(int *)(param_1 + 0x94) != 1)) {
LAB_00b110dc:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0xcf3,"build_chain");
    ERR_set_error(0xb,0xc0103,0);
    uVar15 = 1;
LAB_00b11114:
    *(undefined4 *)(param_1 + 0xb0) = uVar15;
    OPENSSL_sk_free(lVar16);
    return -1;
  }
  uVar17 = (uint)(*(long *)(param_1 + 0x10) != 0);
  if ((lVar18 == 0) ||
     (((*(uint *)(lVar18 + 0x28) & 3) != 0 || ((*(uint *)(lVar18 + 0x28) & 0xc) == 0)))) {
    if ((*(long *)(param_1 + 0x10) == 0) ||
       (uVar14 = (uint)*(undefined8 *)(*(long *)(param_1 + 0x20) + 0x18), (uVar14 >> 0xf & 1) != 0))
    {
      uVar14 = 0;
      uVar17 = uVar17 | 2;
    }
    else {
      uVar17 = 1;
      uVar14 = (uVar14 >> 0x14 ^ 0xffffffff) & 1;
    }
    bVar2 = true;
  }
  else {
    bVar2 = false;
    uVar14 = 0;
  }
  lVar16 = OPENSSL_sk_new_null();
  if (((lVar16 == 0) ||
      ((((lVar18 != 0 && (iVar3 = OPENSSL_sk_num(*(undefined8 *)(lVar18 + 8)), 0 < iVar3)) &&
        (*(long *)(lVar18 + 0x10) != 0)) &&
       (iVar3 = X509_add_certs(lVar16,*(long *)(lVar18 + 0x10),0), iVar3 == 0)))) ||
     (iVar3 = X509_add_certs(lVar16,*(undefined8 *)(param_1 + 0x10),0), iVar3 == 0)) {
LAB_00b1115c:
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vfy.c",0xcf9,"build_chain");
    ERR_set_error(0xb,0xc0100,0);
    uVar15 = 0x11;
    goto LAB_00b11114;
  }
  iVar3 = *(int *)(*(long *)(param_1 + 0x20) + 0x28);
  if (0x3fffffff < iVar3) {
    iVar3 = 0x3fffffff;
    *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x28) = 0x3fffffff;
  }
  iVar3 = iVar3 + 1;
  if (uVar17 != 0) {
    iVar7 = 3;
    local_6c = 0;
LAB_00b10bb0:
    local_68 = (X509 *)0x0;
    iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
    *(int *)(param_1 + 0xac) = iVar4 + -1;
    uVar19 = uVar17;
    if ((uVar17 >> 1 & 1) != 0) {
      iVar6 = local_6c;
      if ((uVar17 & 4) == 0) {
        iVar6 = iVar4;
      }
      pXVar11 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar6 + -1);
      if (iVar4 <= iVar3) {
        uVar13 = *(undefined8 *)(param_1 + 0x98);
        *(undefined8 *)(param_1 + 0x98) = 0;
        iVar5 = (**(code **)(param_1 + 0x40))(&local_68,param_1,pXVar11);
        *(undefined8 *)(param_1 + 0x98) = uVar13;
        if (iVar5 < 0) {
          *(undefined4 *)(param_1 + 0xb0) = 0x46;
          iVar7 = -1;
          goto LAB_00b10f54;
        }
        if (iVar5 == 0) goto joined_r0x00b10cf8;
        lVar9 = X509_get0_pubkey(pXVar11);
        if (lVar9 == 0) {
          ERR_new();
          ERR_set_debug("crypto/x509/x509_vfy.c",0x62,"X509_self_signed");
          ERR_set_error(0xb,0x6c,0);
LAB_00b110d4:
          X509_free(local_68);
          goto LAB_00b110dc;
        }
        iVar5 = ossl_x509v3_cache_extensions(pXVar11);
        if (iVar5 == 0) goto LAB_00b110d4;
        uVar19 = *(uint *)&pXVar11[1].name >> 0xd & 1;
        if (uVar17 >> 2 == 0) goto LAB_00b10d0c;
        if (((iVar4 <= iVar6) || (iVar6 < 1)) || (uVar19 != 0)) goto LAB_00b110d4;
        do {
          a = (X509 *)OPENSSL_sk_pop(*(undefined8 *)(param_1 + 0x98));
          X509_free(a);
          iVar4 = iVar4 + -1;
        } while (iVar6 < iVar4);
        uVar17 = uVar17 & 0xfffffffb;
        *(int *)(param_1 + 0x94) = iVar6;
        iVar4 = iVar6;
        if (lVar18 == 0) {
LAB_00b10d0c:
          if (uVar19 == 0) goto LAB_00b10d10;
          iVar6 = X509_cmp(pXVar11,local_68);
          if (iVar6 != 0) {
            X509_free(local_68);
            goto joined_r0x00b10cf8;
          }
          X509_free(pXVar11);
          iVar4 = iVar4 + -1;
          *(int *)(param_1 + 0x94) = iVar4;
          OPENSSL_sk_set(*(undefined8 *)(param_1 + 0x98),iVar4,local_68);
        }
        else {
          iVar6 = OPENSSL_sk_num(*(undefined8 *)(lVar18 + 8));
          if ((0 < iVar6) && (*(int *)(param_1 + 0x94) <= *(int *)(lVar18 + 0x2c))) {
            *(undefined4 *)(lVar18 + 0x2c) = 0xffffffff;
            X509_free(*(X509 **)(lVar18 + 0x20));
            *(undefined8 *)(lVar18 + 0x20) = 0;
          }
          iVar6 = OPENSSL_sk_num(*(undefined8 *)(lVar18 + 8));
          if ((iVar6 < 1) || (*(int *)(lVar18 + 0x30) < *(int *)(param_1 + 0x94)))
          goto LAB_00b10d0c;
          *(undefined4 *)(lVar18 + 0x30) = 0xffffffff;
LAB_00b10d10:
          iVar7 = OPENSSL_sk_push(*(undefined8 *)(param_1 + 0x98),local_68);
          pXVar11 = local_68;
          if (iVar7 == 0) {
            X509_free(local_68);
            goto LAB_00b1115c;
          }
          lVar9 = X509_get0_pubkey(local_68);
          if (lVar9 == 0) {
            ERR_new();
            ERR_set_debug("crypto/x509/x509_vfy.c",0x62,"X509_self_signed");
            ERR_set_error(0xb,0x6c,0);
            goto LAB_00b110dc;
          }
          iVar7 = ossl_x509v3_cache_extensions(pXVar11);
          if (iVar7 == 0) goto LAB_00b110dc;
          uVar19 = *(uint *)&pXVar11[1].name >> 0xd & 1;
        }
        if (iVar4 < *(int *)(param_1 + 0x94)) goto LAB_00b110dc;
        iVar7 = FUN_00b121d0(param_1,iVar4);
        if (iVar7 != 3) goto LAB_00b10f54;
        uVar17 = uVar17 & 0xfffffffe;
        if (uVar19 != 0) goto joined_r0x00b10cf8;
        goto joined_r0x00b10ef8;
      }
joined_r0x00b10cf8:
      uVar19 = uVar17;
      if ((uVar17 & 1) != 0) goto joined_r0x00b10d00;
      if (uVar17 >> 2 != 0) {
        iVar4 = local_6c + -1;
        bVar1 = local_6c < 1;
        local_6c = iVar4;
        if (!(iVar4 == 0 || bVar1)) goto joined_r0x00b10ef8;
        goto LAB_00b10f54;
      }
      if ((uVar14 == 0) || (*(int *)(param_1 + 0x94) < 2)) goto LAB_00b10f54;
      local_6c = *(int *)(param_1 + 0x94) + -1;
      uVar17 = uVar17 | 4;
    }
joined_r0x00b10d00:
    if ((uVar19 & 1) != 0) {
      iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
      if (iVar4 != *(int *)(param_1 + 0x94)) goto LAB_00b110dc;
      lVar9 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4 + -1);
      lVar10 = X509_get0_pubkey();
      if (lVar10 == 0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_vfy.c",0x62,"X509_self_signed");
        ERR_set_error(0xb,0x6c,0);
LAB_00b10ed8:
        if (iVar4 <= iVar3) goto LAB_00b10e10;
LAB_00b10ee0:
        local_68 = (X509 *)0x0;
      }
      else {
        iVar6 = ossl_x509v3_cache_extensions(lVar9);
        if (iVar6 == 0) goto LAB_00b10ed8;
        if ((iVar3 < iVar4) || ((*(uint *)(lVar9 + 0xe8) >> 0xd & 1) != 0)) goto LAB_00b10ee0;
LAB_00b10e10:
        local_68 = (X509 *)FUN_00b11d6c(param_1,lVar16,lVar9);
        if (local_68 != (X509 *)0x0) {
          OPENSSL_sk_delete_ptr(lVar16,local_68);
          iVar7 = X509_add_cert(*(undefined8 *)(param_1 + 0x98),local_68,1);
          if (iVar7 == 0) goto LAB_00b110dc;
          iVar4 = *(int *)(param_1 + 0x94);
          iVar7 = 3;
          *(int *)(param_1 + 0x94) = iVar4 + 1;
          if (((*(long *)(param_1 + 0xf0) != 0) && (iVar4 != 0)) &&
             ((*(uint *)(*(long *)(param_1 + 0xf0) + 0x28) & 5) != 0)) {
            lVar9 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar4);
            if (lVar9 == 0) {
              iVar7 = 3;
            }
            else {
              iVar7 = FUN_00b11eb4(param_1,lVar9,iVar4);
              if (iVar7 < 0) goto joined_r0x00b10ef8;
              if (iVar7 != 0) {
                iVar7 = 1;
                *(int *)(param_1 + 0x94) = iVar4 + -1;
                goto LAB_00b10f54;
              }
              iVar7 = 3;
            }
          }
          goto joined_r0x00b10ef8;
        }
      }
      uVar17 = uVar17 & 0xfffffffe;
      if (bVar2) {
        uVar17 = uVar17 | 2;
      }
    }
joined_r0x00b10ef8:
    if (uVar17 == 0) goto LAB_00b10f54;
    goto LAB_00b10bb0;
  }
  OPENSSL_sk_free(lVar16);
  iVar7 = 3;
  goto LAB_00b10f60;
LAB_00b10f54:
  OPENSSL_sk_free(lVar16);
  if (iVar7 < 0) {
    return iVar7;
  }
LAB_00b10f60:
  iVar4 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
  if (iVar3 < iVar4) {
LAB_00b11038:
    if (iVar7 == 1) {
      return 1;
    }
    if (iVar7 == 2) {
      return 0;
    }
  }
  else {
    if ((lVar18 == 0) || (iVar7 != 3)) {
      if (iVar7 != 3) goto LAB_00b11038;
    }
    else if ((*(byte *)(lVar18 + 0x28) >> 2 & 1) != 0) {
      lVar16 = *(long *)(param_1 + 0xf0);
      iVar7 = *(int *)(param_1 + 0x94) + -1;
      pXVar11 = (X509 *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar7);
      iVar6 = OPENSSL_sk_num(*(undefined8 *)(lVar16 + 8));
      if (0 < iVar6) {
        iVar5 = 0;
        do {
          pcVar12 = (char *)OPENSSL_sk_value(*(undefined8 *)(lVar16 + 8),iVar5);
          if (((*pcVar12 == '\x02') && (pcVar12[1] == '\x01')) &&
             ((pcVar12[2] == '\0' &&
              (iVar8 = X509_verify(pXVar11,*(EVP_PKEY **)(pcVar12 + 0x18)), 0 < iVar8)))) {
            X509_free(*(X509 **)(lVar16 + 0x20));
            *(undefined8 *)(lVar16 + 0x20) = 0;
            *(undefined4 *)(param_1 + 0xf8) = 1;
            *(int *)(lVar16 + 0x2c) = iVar7;
            *(char **)(lVar16 + 0x18) = pcVar12;
            iVar3 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x98));
            if (iVar3 <= *(int *)(param_1 + 0x94)) {
              return 1;
            }
            do {
              pXVar11 = (X509 *)OPENSSL_sk_pop(*(undefined8 *)(param_1 + 0x98));
              X509_free(pXVar11);
              iVar3 = iVar3 + -1;
            } while (*(int *)(param_1 + 0x94) < iVar3);
            return 1;
          }
          iVar5 = iVar5 + 1;
        } while (iVar5 < iVar6);
      }
    }
    if (iVar4 == *(int *)(param_1 + 0x94)) {
      iVar7 = FUN_00b121d0(param_1,iVar4);
      goto LAB_00b11038;
    }
  }
  uVar17 = *(uint *)(param_1 + 0xb0);
  if (uVar17 < 0xf) {
    if ((1 << (ulong)(uVar17 & 0x1f) & 0x6600U) != 0) {
      return 0;
    }
    if (uVar17 == 0) {
      if (iVar3 < iVar4) {
        if (iVar4 < 1) {
          iVar3 = *(int *)(param_1 + 0xac);
        }
        else {
          iVar3 = iVar4 + -1;
          *(int *)(param_1 + 0xac) = iVar3;
        }
        uVar13 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar3);
        *(undefined8 *)(param_1 + 0xb8) = uVar13;
        *(undefined4 *)(param_1 + 0xb0) = 0x16;
        iVar3 = (**(code **)(param_1 + 0x38))(0,param_1);
        if (iVar3 == 0) {
          return 0;
        }
      }
      if (((lVar18 != 0) && (iVar3 = OPENSSL_sk_num(*(undefined8 *)(lVar18 + 8)), 0 < iVar3)) &&
         (((*(byte *)(lVar18 + 0x28) & 3) == 0 || (-1 < *(int *)(lVar18 + 0x30))))) {
        if (iVar4 < 1) {
          iVar3 = *(int *)(param_1 + 0xac);
        }
        else {
          iVar3 = iVar4 + -1;
          *(int *)(param_1 + 0xac) = iVar3;
        }
        uVar13 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar3);
        *(undefined8 *)(param_1 + 0xb8) = uVar13;
        *(undefined4 *)(param_1 + 0xb0) = 0x41;
        iVar3 = (**(code **)(param_1 + 0x38))(0,param_1);
        if (iVar3 == 0) {
          return 0;
        }
      }
      iVar3 = iVar4 + -1;
      lVar16 = OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x98),iVar3);
      lVar18 = X509_get0_pubkey();
      if (lVar18 == 0) {
        ERR_new();
        ERR_set_debug("crypto/x509/x509_vfy.c",0x62,"X509_self_signed");
        ERR_set_error(0xb,0x6c,0);
LAB_00b11328:
        uVar17 = 2;
        if (iVar4 <= *(int *)(param_1 + 0x94)) {
          uVar17 = 0x14;
        }
        if (iVar4 < 1) goto LAB_00b112f4;
LAB_00b11344:
        *(int *)(param_1 + 0xac) = iVar3;
      }
      else {
        iVar7 = ossl_x509v3_cache_extensions(lVar16);
        if ((iVar7 == 0) || ((*(byte *)(lVar16 + 0xe9) >> 5 & 1) == 0)) goto LAB_00b11328;
        uVar17 = 0x12;
        if (iVar4 != 1) {
          uVar17 = 0x13;
        }
        if (0 < iVar4) goto LAB_00b11344;
LAB_00b112f4:
        iVar3 = *(int *)(param_1 + 0xac);
      }
      uVar13 = *(undefined8 *)(param_1 + 0x98);
      goto LAB_00b11350;
    }
  }
  if (iVar4 < 1) {
    iVar3 = *(int *)(param_1 + 0xac);
  }
  else {
    iVar3 = iVar4 + -1;
    *(int *)(param_1 + 0xac) = iVar3;
  }
  uVar13 = *(undefined8 *)(param_1 + 0x98);
LAB_00b11350:
  uVar13 = OPENSSL_sk_value(uVar13,iVar3);
  *(undefined8 *)(param_1 + 0xb8) = uVar13;
  *(uint *)(param_1 + 0xb0) = uVar17;
  iVar3 = (**(code **)(param_1 + 0x38))(0,param_1);
  return iVar3;
}

