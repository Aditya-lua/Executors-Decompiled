/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01d98
 */

ulong ossl_x509v3_cache_extensions(X509 *param_1)

{
  char **ppcVar1;
  uint uVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  EVP_MD *type;
  long lVar7;
  BASIC_CONSTRAINTS *a;
  ASN1_INTEGER *a_00;
  ASN1_BIT_STRING *pAVar8;
  PROXY_CERT_INFO_EXTENSION *a_01;
  ASN1_STRING *pAVar9;
  void *pvVar10;
  ASN1_OBJECT *pAVar11;
  X509_NAME *pXVar12;
  X509_NAME *b;
  undefined8 uVar13;
  long *plVar14;
  ASN1_OCTET_STRING *pAVar15;
  X509_EXTENSION *ex;
  int *piVar16;
  uint uVar17;
  byte *pbVar18;
  int local_54;
  int local_48;
  int local_44;
  
  if (*(int *)&param_1[1].rfc3779_addr != 0) {
LAB_00b01dc4:
    return (ulong)(((ulong)param_1[1].name & 0x80) == 0);
  }
  uVar6 = CRYPTO_THREAD_write_lock(param_1[1].nc);
  if ((int)uVar6 == 0) {
    return uVar6;
  }
  if (((ulong)param_1[1].name & 0x100) != 0) {
    CRYPTO_THREAD_unlock(param_1[1].nc);
    goto LAB_00b01dc4;
  }
  ppcVar1 = &param_1[1].name;
  type = EVP_sha1();
  iVar4 = X509_digest(param_1,type,(uchar *)&param_1[1].akid,(uint *)0x0);
  if (iVar4 == 0) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x100000;
  }
  ERR_set_mark();
  lVar7 = X509_get_version(param_1);
  if (lVar7 == 0) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x40;
  }
  param_1[1].signature = (ASN1_BIT_STRING *)0xffffffffffffffff;
  a = X509_get_ext_d2i(param_1,0x57,&local_54,(int *)0x0);
  if (a == (BASIC_CONSTRAINTS *)0x0) {
    if (local_54 != -1) {
      uVar17 = 0x80;
      goto LAB_00b01f04;
    }
  }
  else {
    if (a->ca != 0) {
      *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x10;
    }
    a_00 = a->pathlen;
    if (a_00 != (ASN1_INTEGER *)0x0) {
      if (a_00->type == 0x102) {
        ERR_new();
        ERR_set_debug("crypto/x509/v3_purp.c",0x1b9,"ossl_x509v3_cache_extensions");
        ERR_set_error(0x22,0xa8,0);
        *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
      }
      else {
        pAVar8 = (ASN1_BIT_STRING *)ASN1_INTEGER_get(a_00);
        param_1[1].signature = pAVar8;
      }
    }
    BASIC_CONSTRAINTS_free(a);
    uVar17 = 1;
LAB_00b01f04:
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | uVar17;
  }
  a_01 = X509_get_ext_d2i(param_1,0x297,&local_54,(int *)0x0);
  if (a_01 == (PROXY_CERT_INFO_EXTENSION *)0x0) {
    if (local_54 != -1) {
      uVar17 = 0x80;
      goto LAB_00b01fa0;
    }
  }
  else {
    if ((((*(byte *)ppcVar1 >> 4 & 1) != 0) ||
        (iVar4 = X509_get_ext_by_NID(param_1,0x55,-1), -1 < iVar4)) ||
       (iVar4 = X509_get_ext_by_NID(param_1,0x56,-1), -1 < iVar4)) {
      *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
    }
    if (a_01->pcPathLengthConstraint == (ASN1_INTEGER *)0x0) {
      lVar7 = -1;
    }
    else {
      lVar7 = ASN1_INTEGER_get(a_01->pcPathLengthConstraint);
    }
    param_1[1].valid = (int)lVar7;
    param_1[1].references = (int)((ulong)lVar7 >> 0x20);
    PROXY_CERT_INFO_EXTENSION_free(a_01);
    uVar17 = 0x400;
LAB_00b01fa0:
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | uVar17;
  }
  pAVar9 = X509_get_ext_d2i(param_1,0x53,&local_54,(int *)0x0);
  if (pAVar9 == (ASN1_STRING *)0x0) {
    if (local_54 == -1) goto LAB_00b02054;
  }
  else {
    *(undefined4 *)((long)&param_1[1].name + 4) = 0;
    iVar4 = pAVar9->length;
    if (0 < iVar4) {
      pbVar18 = pAVar9->data;
      bVar3 = *pbVar18;
      *(uint *)((long)&param_1[1].name + 4) = (uint)bVar3;
      if (iVar4 != 1) {
        *(uint *)((long)&param_1[1].name + 4) = (uint)CONCAT11(pbVar18[1],bVar3);
      }
    }
    *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 2;
    ASN1_BIT_STRING_free(pAVar9);
    if (*(int *)((long)&param_1[1].name + 4) != 0) goto LAB_00b02054;
    ERR_new();
    ERR_set_debug("crypto/x509/v3_purp.c",0x1e2,"ossl_x509v3_cache_extensions");
    ERR_set_error(0x22,0xa9,0);
  }
  *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
LAB_00b02054:
  *(undefined4 *)&param_1[1].ex_data.sk = 0;
  pvVar10 = X509_get_ext_d2i(param_1,0x7e,&local_54,(int *)0x0);
  if (pvVar10 == (void *)0x0) {
    if (local_54 != -1) {
      *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
    }
  }
  else {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 4;
    local_54 = 0;
    iVar4 = OPENSSL_sk_num();
    if (0 < iVar4) {
      do {
        pAVar11 = (ASN1_OBJECT *)OPENSSL_sk_value(pvVar10,local_54);
        iVar4 = OBJ_obj2nid(pAVar11);
        uVar17 = 1;
        switch(iVar4) {
        case 0x81:
          break;
        case 0x82:
          uVar17 = 2;
          break;
        case 0x83:
          uVar17 = 8;
          break;
        case 0x84:
          uVar17 = 4;
          break;
        case 0x85:
          uVar17 = 0x40;
          break;
        case 0x86:
        case 0x87:
        case 0x88:
        case 0x8a:
        case 0x8c:
        case 0x8d:
        case 0x8e:
        case 0x8f:
        case 0x90:
        case 0x91:
        case 0x92:
        case 0x93:
        case 0x94:
        case 0x95:
        case 0x96:
        case 0x97:
        case 0x98:
        case 0x99:
        case 0x9a:
        case 0x9b:
        case 0x9c:
        case 0x9d:
        case 0x9e:
        case 0x9f:
        case 0xa0:
        case 0xa1:
        case 0xa2:
        case 0xa3:
        case 0xa4:
        case 0xa5:
        case 0xa6:
        case 0xa7:
        case 0xa8:
        case 0xa9:
        case 0xaa:
        case 0xab:
        case 0xac:
        case 0xad:
        case 0xae:
        case 0xaf:
        case 0xb0:
        case 0xb1:
        case 0xb2:
        case 0xb3:
          goto switchD_00b020c0_caseD_86;
        case 0x89:
        case 0x8b:
          uVar17 = 0x10;
          break;
        case 0xb4:
          uVar17 = 0x20;
          break;
        default:
          if (iVar4 == 0x129) {
            uVar17 = 0x80;
          }
          else {
            if (iVar4 != 0x38e) goto switchD_00b020c0_caseD_86;
            uVar17 = 0x100;
          }
        }
        *(uint *)&param_1[1].ex_data.sk = *(uint *)&param_1[1].ex_data.sk | uVar17;
switchD_00b020c0_caseD_86:
        iVar4 = local_54 + 1;
        local_54 = iVar4;
        iVar5 = OPENSSL_sk_num(pvVar10);
      } while (iVar4 < iVar5);
    }
    OPENSSL_sk_pop_free(pvVar10,ASN1_OBJECT_free);
  }
  pAVar9 = X509_get_ext_d2i(param_1,0x47,&local_54,(int *)0x0);
  if (pAVar9 == (ASN1_STRING *)0x0) {
    if (local_54 != -1) {
      *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
    }
  }
  else {
    if (pAVar9->length < 1) {
      uVar17 = 0;
    }
    else {
      uVar17 = (uint)*pAVar9->data;
    }
    uVar2 = *(uint *)&param_1[1].name;
    *(uint *)((long)&param_1[1].ex_data.sk + 4) = uVar17;
    *(uint *)&param_1[1].name = uVar2 | 8;
    ASN1_BIT_STRING_free(pAVar9);
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x52,&local_54,(int *)0x0);
  *(void **)&param_1[1].ex_data.dummy = pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x5a,&local_54,(int *)0x0);
  param_1[1].ex_pathlen = (long)pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  pXVar12 = X509_get_subject_name(param_1);
  b = X509_get_issuer_name(param_1);
  iVar4 = X509_NAME_cmp(pXVar12,b);
  if (iVar4 == 0) {
    *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 0x20;
    iVar4 = X509_check_akid(param_1,(AUTHORITY_KEYID *)param_1[1].ex_pathlen);
    if (iVar4 == 0) {
      uVar13 = X509_get0_pubkey(param_1);
      iVar4 = FUN_00b02d6c(uVar13,param_1);
      if (iVar4 == 0) {
        *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x2000;
      }
    }
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x55,&local_54,(int *)0x0);
  param_1[1].ex_kusage = (ulong)pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x29a,&local_54,(int *)0x0);
  param_1[1].ex_xkusage = (ulong)pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x67,&local_44,(int *)0x0);
  param_1[1].ex_flags = (ulong)pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_44 != -1)) {
LAB_00b02320:
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  else {
    local_44 = 0;
    iVar4 = OPENSSL_sk_num();
    if (0 < iVar4) {
      do {
        plVar14 = (long *)OPENSSL_sk_value(param_1[1].ex_flags,local_44);
        if ((*plVar14 == 0) && (iVar4 = OPENSSL_sk_num(plVar14[2]), iVar4 < 1)) {
          ERR_new();
          ERR_set_debug("crypto/x509/v3_purp.c",0x139,"setup_dp");
          ERR_set_error(0xb,0x8f,0);
          goto LAB_00b02320;
        }
        piVar16 = (int *)plVar14[1];
        if (piVar16 == (int *)0x0) {
          *(undefined4 *)(plVar14 + 3) = 0x807f;
          piVar16 = (int *)*plVar14;
        }
        else {
          iVar4 = *piVar16;
          if (iVar4 < 1) {
            uVar17 = *(uint *)(plVar14 + 3);
          }
          else {
            pbVar18 = *(byte **)(piVar16 + 2);
            bVar3 = *pbVar18;
            uVar17 = (uint)bVar3;
            *(uint *)(plVar14 + 3) = (uint)bVar3;
            if (iVar4 != 1) {
              uVar17 = (uint)CONCAT11(pbVar18[1],bVar3);
              *(uint *)(plVar14 + 3) = uVar17;
            }
          }
          *(uint *)(plVar14 + 3) = uVar17 & 0x807f;
          piVar16 = (int *)*plVar14;
        }
        if ((piVar16 != (int *)0x0) && (*piVar16 == 1)) {
          iVar4 = OPENSSL_sk_num(plVar14[2]);
          if (0 < iVar4) {
            iVar4 = 0;
            do {
              piVar16 = (int *)OPENSSL_sk_value(plVar14[2],iVar4);
              if (*piVar16 == 4) {
                pXVar12 = *(X509_NAME **)(piVar16 + 2);
                if (pXVar12 != (X509_NAME *)0x0) goto LAB_00b02434;
                break;
              }
              iVar4 = iVar4 + 1;
              iVar5 = OPENSSL_sk_num(plVar14[2]);
            } while (iVar4 < iVar5);
          }
          pXVar12 = X509_get_issuer_name(param_1);
LAB_00b02434:
          iVar4 = DIST_POINT_set_dpname((DIST_POINT_NAME *)*plVar14,pXVar12);
          if (iVar4 == 0) goto LAB_00b02638;
        }
        iVar4 = local_44 + 1;
        local_44 = iVar4;
        iVar5 = OPENSSL_sk_num(param_1[1].ex_flags);
      } while (iVar4 < iVar5);
    }
  }
  pvVar10 = X509_get_ext_d2i(param_1,0x122,&local_54,(int *)0x0);
  param_1[1].ex_nscert = (ulong)pvVar10;
  if ((pvVar10 == (void *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  pAVar15 = X509_get_ext_d2i(param_1,0x123,&local_54,(int *)0x0);
  param_1[1].skid = pAVar15;
  if ((pAVar15 == (ASN1_OCTET_STRING *)0x0) && (local_54 != -1)) {
    *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x80;
  }
  local_54 = 0;
  iVar4 = X509_get_ext_count(param_1);
  if (0 < iVar4) {
    do {
      ex = X509_get_ext(param_1,local_54);
      pAVar11 = X509_EXTENSION_get_object(ex);
      iVar4 = OBJ_obj2nid(pAVar11);
      if (iVar4 == 0x359) {
        *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x1000;
      }
      iVar5 = X509_EXTENSION_get_critical(ex);
      if (iVar5 != 0) {
        pAVar11 = X509_EXTENSION_get_object(ex);
        local_48 = OBJ_obj2nid(pAVar11);
        if ((local_48 == 0) ||
           (pvVar10 = OBJ_bsearch_(&local_48,&DAT_0077b71c,0xf,4,(cmp *)&LAB_00b03718),
           pvVar10 == (void *)0x0)) {
          *(uint *)ppcVar1 = *(uint *)ppcVar1 | 0x200;
          break;
        }
        switch(iVar4) {
        case 0x52:
          uVar17 = *(uint *)ppcVar1 | 0x40000;
          break;
        default:
          goto switchD_00b02570_caseD_53;
        case 0x55:
          uVar17 = *(uint *)ppcVar1 | 0x80000;
          break;
        case 0x57:
          uVar17 = *(uint *)ppcVar1 | 0x10000;
          break;
        case 0x5a:
          uVar17 = *(uint *)ppcVar1 | 0x20000;
        }
        *(uint *)ppcVar1 = uVar17;
      }
switchD_00b02570_caseD_53:
      iVar4 = local_54 + 1;
      local_54 = iVar4;
      iVar5 = X509_get_ext_count(param_1);
    } while (iVar4 < iVar5);
  }
  ossl_x509_init_sig_info(param_1);
  *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 0x100;
  *(undefined4 *)&param_1[1].rfc3779_addr = 1;
  iVar4 = ERR_pop_to_mark();
  if ((*(uint *)&param_1[1].name & 0x100080) == 0) {
    CRYPTO_THREAD_unlock(param_1[1].nc);
    uVar6 = 1;
  }
  else {
    if ((*(uint *)&param_1[1].name >> 7 & 1) != 0) {
      ERR_new(iVar4);
      ERR_set_debug("crypto/x509/v3_purp.c",0x27b,"ossl_x509v3_cache_extensions");
      ERR_set_error(0x22,0x9e,0);
    }
LAB_00b02638:
    *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 0x100;
    CRYPTO_THREAD_unlock(param_1[1].nc);
    uVar6 = 0;
  }
  return uVar6;
}

