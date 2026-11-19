/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1322c
 */

long ossl_policy_cache_set(X509 *param_1)

{
  int iVar1;
  int iVar2;
  undefined8 *puVar3;
  POLICY_CONSTRAINTS *a;
  ASN1_INTEGER *pAVar4;
  long lVar5;
  void *pvVar6;
  undefined8 uVar7;
  ASN1_INTEGER *a_00;
  int iVar8;
  long *plVar9;
  long *plVar10;
  int local_64;
  
  if (param_1[1].ex_pcpathlen != 0) {
    return param_1[1].ex_pcpathlen;
  }
  iVar1 = CRYPTO_THREAD_write_lock(param_1[1].nc);
  if (iVar1 == 0) {
    return 0;
  }
  if (param_1[1].ex_pcpathlen != 0) goto LAB_00b1352c;
  puVar3 = CRYPTO_malloc(0x28,"crypto/x509/pcy_cache.c",0x5c);
  if (puVar3 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/pcy_cache.c",0x5e,"policy_cache_new");
    ERR_set_error(0x22,0xc0100,0);
    goto LAB_00b1352c;
  }
  puVar3[2] = -1;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[3] = 0xffffffffffffffff;
  puVar3[4] = 0xffffffffffffffff;
  param_1[1].ex_pcpathlen = (long)puVar3;
  a = X509_get_ext_d2i(param_1,0x191,&local_64,(int *)0x0);
  if (a == (POLICY_CONSTRAINTS *)0x0) {
    a_00 = (ASN1_INTEGER *)0x0;
    if (local_64 != -1) goto LAB_00b13510;
LAB_00b13358:
    pvVar6 = X509_get_ext_d2i(param_1,0x59,&local_64,(int *)0x0);
    if (pvVar6 == (void *)0x0) {
      a_00 = (ASN1_INTEGER *)0x0;
      if (local_64 == -1) goto LAB_00b1352c;
      goto LAB_00b13510;
    }
    plVar9 = (long *)param_1[1].ex_pcpathlen;
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      lVar5 = OPENSSL_sk_new(&LAB_00b13648);
      plVar10 = plVar9 + 1;
      *plVar10 = lVar5;
      if (lVar5 != 0) {
        iVar8 = 0;
        do {
          uVar7 = OPENSSL_sk_value(pvVar6,iVar8);
          lVar5 = ossl_policy_data_new(uVar7,0,local_64);
          if (lVar5 == 0) {
            ERR_new();
            uVar7 = 0x2d;
            goto LAB_00b13474;
          }
          iVar2 = OBJ_obj2nid(*(ASN1_OBJECT **)(lVar5 + 8));
          if (iVar2 == 0x2ea) {
            if (*plVar9 != 0) {
LAB_00b134a4:
              iVar1 = -1;
              *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 0x800;
              goto LAB_00b134b4;
            }
            *plVar9 = lVar5;
          }
          else {
            iVar2 = OPENSSL_sk_find(*plVar10,lVar5);
            if (-1 < iVar2) goto LAB_00b134a4;
            iVar2 = OPENSSL_sk_push(*plVar10,lVar5);
            if (iVar2 == 0) {
              ERR_new();
              ERR_set_debug("crypto/x509/pcy_cache.c",0x3d,"policy_cache_create");
              ERR_set_error(0x22,0xc0100,0);
              goto LAB_00b13438;
            }
          }
          iVar8 = iVar8 + 1;
        } while (iVar8 < iVar1);
        lVar5 = 0;
        iVar1 = 1;
        goto LAB_00b134b4;
      }
      ERR_new();
      uVar7 = 0x26;
LAB_00b13474:
      ERR_set_debug("crypto/x509/pcy_cache.c",uVar7,"policy_cache_create");
      ERR_set_error(0x22,0xc0100,0);
      OPENSSL_sk_pop_free(pvVar6,POLICYINFO_free);
      iVar1 = 0;
LAB_00b1355c:
      OPENSSL_sk_pop_free(plVar9[1],ossl_policy_data_free);
      plVar9[1] = 0;
      local_64 = iVar1;
      goto LAB_00b1352c;
    }
    lVar5 = 0;
LAB_00b13438:
    iVar1 = 0;
LAB_00b134b4:
    ossl_policy_data_free(lVar5);
    OPENSSL_sk_pop_free(pvVar6,POLICYINFO_free);
    if (iVar1 < 1) goto LAB_00b1355c;
    local_64 = 1;
    pvVar6 = X509_get_ext_d2i(param_1,0x2eb,&local_64,(int *)0x0);
    if (pvVar6 == (void *)0x0) {
      a_00 = (ASN1_INTEGER *)0x0;
      if (local_64 != -1) goto LAB_00b13510;
    }
    else {
      local_64 = ossl_policy_cache_set_mapping(param_1,pvVar6);
      if (local_64 < 1) goto LAB_00b1350c;
    }
    a_00 = X509_get_ext_d2i(param_1,0x2ec,&local_64,(int *)0x0);
    if (a_00 == (ASN1_INTEGER *)0x0) {
      if (local_64 != -1) goto LAB_00b13510;
    }
    else {
      if (a_00->type == 0x102) goto LAB_00b13510;
      lVar5 = ASN1_INTEGER_get(a_00);
      puVar3[2] = lVar5;
    }
  }
  else {
    pAVar4 = a->requireExplicitPolicy;
    if (pAVar4 != (ASN1_INTEGER *)0x0) {
      a_00 = (ASN1_INTEGER *)0x0;
      if (pAVar4->type == 0x102) goto LAB_00b13510;
      lVar5 = ASN1_INTEGER_get(pAVar4);
      puVar3[3] = lVar5;
      pAVar4 = a->inhibitPolicyMapping;
      if (pAVar4 == (ASN1_INTEGER *)0x0) goto LAB_00b13358;
LAB_00b13340:
      a_00 = (ASN1_INTEGER *)0x0;
      if (pAVar4->type != 0x102) {
        lVar5 = ASN1_INTEGER_get(pAVar4);
        puVar3[4] = lVar5;
        goto LAB_00b13358;
      }
      goto LAB_00b13510;
    }
    pAVar4 = a->inhibitPolicyMapping;
    if (pAVar4 != (ASN1_INTEGER *)0x0) goto LAB_00b13340;
LAB_00b1350c:
    a_00 = (ASN1_INTEGER *)0x0;
LAB_00b13510:
    *(uint *)&param_1[1].name = *(uint *)&param_1[1].name | 0x800;
  }
  POLICY_CONSTRAINTS_free(a);
  ASN1_INTEGER_free(a_00);
LAB_00b1352c:
  CRYPTO_THREAD_unlock(param_1[1].nc);
  return param_1[1].ex_pcpathlen;
}

