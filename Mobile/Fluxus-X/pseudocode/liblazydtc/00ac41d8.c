/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac41d8
 */

undefined8
ossl_method_store_add
          (undefined8 *param_1,long param_2,int param_3,undefined1 *param_4,long param_5,
          code *param_6,long param_7)

{
  undefined1 *puVar1;
  int iVar2;
  int iVar3;
  long *ptr;
  long lVar4;
  long lVar5;
  int *ptr_00;
  long *plVar6;
  long *plVar7;
  long lVar8;
  
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (param_3 < 1) {
    return 0;
  }
  if (param_5 == 0) {
    return 0;
  }
  puVar1 = &DAT_002ab32c;
  if (param_4 != (undefined1 *)0x0) {
    puVar1 = param_4;
  }
  if (param_2 == 0) {
    return 0;
  }
  ptr = CRYPTO_malloc(0x28,"crypto/property/property.c",0x13c);
  if (ptr == (long *)0x0) {
    return 0;
  }
  ptr[2] = param_5;
  ptr[3] = (long)param_6;
  ptr[4] = param_7;
  iVar2 = (*param_6)(param_5);
  if (iVar2 == 0) goto LAB_00ac4490;
  *ptr = param_2;
  iVar2 = CRYPTO_THREAD_write_lock(param_1[2]);
  if (iVar2 == 0) goto LAB_00ac4490;
  lVar8 = (long)param_3;
  lVar4 = ossl_sa_get(param_1[1],lVar8);
  if (lVar4 != 0) {
    lVar5 = OPENSSL_LH_num_items(*(undefined8 *)(lVar4 + 0x10));
    param_1[4] = param_1[4] - lVar5;
    OPENSSL_LH_doall(*(undefined8 *)(lVar4 + 0x10),&LAB_00ac4ea4);
    OPENSSL_LH_flush(*(undefined8 *)(lVar4 + 0x10));
  }
  lVar4 = ossl_prop_defn_get(*param_1,puVar1);
  plVar7 = ptr + 1;
  *plVar7 = lVar4;
  if (lVar4 == 0) {
    lVar4 = ossl_parse_property(*param_1,puVar1);
    *plVar7 = lVar4;
    if (lVar4 != 0) {
      iVar2 = ossl_prop_defn_set(*param_1,puVar1,plVar7);
      if (iVar2 != 0) goto LAB_00ac42cc;
      ossl_property_free(*plVar7);
      *plVar7 = 0;
    }
LAB_00ac4470:
    CRYPTO_THREAD_unlock(param_1[2]);
  }
  else {
LAB_00ac42cc:
    ptr_00 = (int *)ossl_sa_get(param_1[1],lVar8);
    if (ptr_00 == (int *)0x0) {
      ptr_00 = (int *)CRYPTO_zalloc(0x18,"crypto/property/property.c",0x15b);
      if (ptr_00 == (int *)0x0) goto LAB_00ac4470;
      lVar4 = OPENSSL_sk_new_null();
      *(long *)(ptr_00 + 2) = lVar4;
      if (lVar4 != 0) {
        lVar4 = OPENSSL_LH_new(&LAB_00ac44b4,FUN_00ac44bc);
        *(long *)(ptr_00 + 4) = lVar4;
        if (lVar4 != 0) {
          *ptr_00 = param_3;
          iVar2 = ossl_sa_set(param_1[1],lVar8,ptr_00);
          if (iVar2 != 0) goto LAB_00ac42e0;
        }
      }
      CRYPTO_THREAD_unlock(param_1[2]);
      OPENSSL_sk_pop_free(*(undefined8 *)(ptr_00 + 2),&LAB_00ac4510);
      OPENSSL_LH_doall(*(undefined8 *)(ptr_00 + 4),&LAB_00ac4ea4);
      OPENSSL_LH_free(*(undefined8 *)(ptr_00 + 4));
      CRYPTO_free(ptr_00);
    }
    else {
LAB_00ac42e0:
      iVar2 = OPENSSL_sk_num(*(undefined8 *)(ptr_00 + 2));
      if (iVar2 < 1) {
        iVar2 = 0;
      }
      else {
        iVar2 = 0;
        do {
          plVar6 = (long *)OPENSSL_sk_value(*(undefined8 *)(ptr_00 + 2),iVar2);
          if ((*plVar6 == *ptr) && (plVar6[1] == *plVar7)) break;
          iVar2 = iVar2 + 1;
          iVar3 = OPENSSL_sk_num(*(undefined8 *)(ptr_00 + 2));
        } while (iVar2 < iVar3);
      }
      iVar3 = OPENSSL_sk_num(*(undefined8 *)(ptr_00 + 2));
      if (iVar2 != iVar3) goto LAB_00ac4470;
      iVar2 = OPENSSL_sk_push(*(undefined8 *)(ptr_00 + 2),ptr);
      CRYPTO_THREAD_unlock(param_1[2]);
      if (iVar2 != 0) {
        return 1;
      }
    }
  }
  (*(code *)ptr[4])(ptr[2]);
LAB_00ac4490:
  CRYPTO_free(ptr);
  return 0;
}

