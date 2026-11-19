/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac488c
 */

int ossl_method_store_fetch
              (undefined8 *param_1,int param_2,long param_3,long *param_4,long *param_5)

{
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  int iVar8;
  long *plVar9;
  long lVar10;
  long lVar11;
  int iVar12;
  
  if (param_4 == (long *)0x0) {
    lVar11 = 0;
  }
  else {
    lVar11 = *param_4;
  }
  if ((param_1 == (undefined8 *)0x0) || (param_2 < 1)) {
    return 0;
  }
  if (param_5 == (long *)0x0) {
    return 0;
  }
  iVar1 = ossl_lib_ctx_is_default(*param_1);
  if ((iVar1 != 0) && (iVar1 = OPENSSL_init_crypto(0x40,0), iVar1 == 0)) {
    return 0;
  }
  iVar1 = CRYPTO_THREAD_read_lock(param_1[2]);
  if (iVar1 == 0) {
    return 0;
  }
  lVar4 = ossl_sa_get(param_1[1],(long)param_2);
  if (lVar4 == 0) {
    CRYPTO_THREAD_unlock(param_1[2]);
    return 0;
  }
  if (param_3 == 0) {
    lVar5 = 0;
  }
  else {
    lVar5 = ossl_parse_query(*param_1,param_3,0);
  }
  plVar6 = (long *)ossl_lib_ctx_get_data(*param_1,0xe,&DAT_00c7c670);
  lVar7 = lVar5;
  if ((plVar6 == (long *)0x0) || (lVar10 = *plVar6, lVar10 == 0)) {
    lVar10 = lVar5;
    if (lVar5 != 0) goto LAB_00ac49c8;
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8));
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        plVar6 = (long *)OPENSSL_sk_value(*(undefined8 *)(lVar4 + 8),iVar1);
        if ((plVar6 != (long *)0x0) && ((lVar11 == 0 || (*plVar6 == lVar11)))) {
          lVar7 = 0;
          iVar1 = 1;
          goto LAB_00ac4ac8;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8));
      } while (iVar1 < iVar2);
    }
    lVar7 = 0;
  }
  else {
    if (lVar5 != 0) {
      lVar7 = ossl_property_merge(lVar5,lVar10);
      ossl_property_free(lVar5);
      lVar10 = lVar7;
      if (lVar7 == 0) goto LAB_00ac4aec;
    }
LAB_00ac49c8:
    iVar2 = ossl_property_has_optional(lVar10);
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8));
    if (0 < iVar1) {
      iVar12 = 0;
      iVar1 = 0;
      iVar8 = -1;
      plVar9 = (long *)0x0;
      do {
        plVar6 = (long *)OPENSSL_sk_value(*(undefined8 *)(lVar4 + 8),iVar12);
        if (plVar6 != (long *)0x0) {
          if (lVar11 != 0) {
            if (*plVar6 != lVar11) goto LAB_00ac4a48;
          }
          iVar3 = ossl_property_match_count(lVar10,plVar6[1]);
          if (iVar8 < iVar3) {
            iVar1 = 1;
            plVar9 = plVar6;
            iVar8 = iVar3;
            if (iVar2 == 0) {
              iVar1 = 1;
              goto LAB_00ac4ac8;
            }
          }
        }
LAB_00ac4a48:
        plVar6 = plVar9;
        iVar12 = iVar12 + 1;
        iVar3 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8));
        plVar9 = plVar6;
      } while (iVar12 < iVar3);
      if (iVar1 == 0) goto LAB_00ac4af0;
LAB_00ac4ac8:
      iVar2 = (*(code *)plVar6[3])(plVar6[2]);
      if (iVar2 != 0) {
        *param_5 = plVar6[2];
        if (param_4 != (long *)0x0) {
          *param_4 = *plVar6;
        }
        goto LAB_00ac4af0;
      }
    }
  }
LAB_00ac4aec:
  iVar1 = 0;
LAB_00ac4af0:
  CRYPTO_THREAD_unlock(param_1[2]);
  ossl_property_free(lVar7);
  return iVar1;
}

