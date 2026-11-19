/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65810
 */

long evp_keymgmt_util_export_to_provider(long param_1,long param_2,uint param_3)

{
  int iVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  long local_58;
  long local_50;
  uint local_48;
  
  if (param_2 != 0) {
    lVar5 = *(long *)(param_1 + 0x68);
    if (lVar5 == 0) {
      return 0;
    }
    lVar4 = *(long *)(param_1 + 0x60);
    if (lVar4 == param_2) {
      return lVar5;
    }
    if ((*(int *)(lVar4 + 4) == *(int *)(param_2 + 4)) &&
       (*(long *)(lVar4 + 0x18) == *(long *)(param_2 + 0x18))) {
      return lVar5;
    }
    iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 0x38));
    if (iVar1 != 0) {
      if ((*(long *)(param_1 + 0x70) == *(long *)(param_1 + 0x80)) &&
         (iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x78)), 0 < iVar1)) {
        iVar6 = 0;
        do {
          plVar2 = (long *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x78),iVar6);
          if ((param_3 & (*(uint *)(plVar2 + 2) ^ 0xffffffff)) == 0) {
            lVar5 = *plVar2;
            if (lVar5 == param_2) {
              if (lVar5 != 0) {
LAB_00a659bc:
                lVar5 = plVar2[1];
                CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
                return lVar5;
              }
              break;
            }
            if ((*(int *)(param_2 + 4) == *(int *)(lVar5 + 4)) &&
               (*(long *)(param_2 + 0x18) == *(long *)(lVar5 + 0x18))) goto LAB_00a659bc;
          }
          iVar6 = iVar6 + 1;
        } while (iVar6 < iVar1);
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
      lVar5 = *(long *)(param_1 + 0x60);
      if (*(long *)(lVar5 + 200) != 0) {
        uVar3 = EVP_KEYMGMT_get0_name(param_2);
        iVar1 = EVP_KEYMGMT_is_a(lVar5,uVar3);
        if (iVar1 != 0) {
          local_50 = 0;
          local_58 = param_2;
          local_48 = param_3;
          iVar1 = evp_keymgmt_export(*(undefined8 *)(param_1 + 0x60),*(undefined8 *)(param_1 + 0x68)
                                     ,param_3,evp_keymgmt_util_try_import,&local_58);
          if (iVar1 != 0) {
            iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x38));
            if (iVar1 != 0) {
              iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x78));
              if (0 < iVar1) {
                iVar6 = 0;
                do {
                  plVar2 = (long *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x78),iVar6);
                  if (((param_3 & (*(uint *)(plVar2 + 2) ^ 0xffffffff)) == 0) &&
                     ((lVar5 = *plVar2, lVar5 == param_2 ||
                      ((*(int *)(param_2 + 4) == *(int *)(lVar5 + 4) &&
                       (*(long *)(param_2 + 0x18) == *(long *)(lVar5 + 0x18))))))) {
                    lVar5 = plVar2[1];
                    if (lVar5 != 0) {
                      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
                      evp_keymgmt_freedata(param_2,local_50);
                      return lVar5;
                    }
                    break;
                  }
                  iVar6 = iVar6 + 1;
                } while (iVar6 < iVar1);
              }
              if (*(long *)(param_1 + 0x70) != *(long *)(param_1 + 0x80)) {
                OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x78),&LAB_00a65c4c);
                *(undefined8 *)(param_1 + 0x78) = 0;
              }
              iVar1 = evp_keymgmt_util_cache_keydata(param_1,param_2,local_50,param_3);
              if (iVar1 != 0) {
                *(undefined8 *)(param_1 + 0x80) = *(undefined8 *)(param_1 + 0x70);
                CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
                return local_50;
              }
              CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x38));
            }
            evp_keymgmt_freedata(param_2,local_50);
          }
        }
      }
    }
  }
  return 0;
}

