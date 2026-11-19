/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5048
 */

undefined8 ossl_prop_defn_set(undefined8 param_1,char *param_2,undefined8 *param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  size_t sVar4;
  undefined8 *ptr;
  undefined8 uVar5;
  char *local_58 [3];
  
  lVar2 = ossl_lib_ctx_get_data(param_1,2,&DAT_00c7c688);
  if (lVar2 == 0) {
    return 0;
  }
  if (param_2 == (char *)0x0) {
    return 1;
  }
  iVar1 = ossl_lib_ctx_write_lock(param_1);
  if (iVar1 == 0) {
    return 0;
  }
  local_58[0] = param_2;
  if (param_3 == (undefined8 *)0x0) {
    OPENSSL_LH_delete(lVar2,local_58);
    uVar5 = 1;
  }
  else {
    lVar3 = OPENSSL_LH_retrieve(lVar2);
    if (lVar3 == 0) {
      sVar4 = strlen(param_2);
      ptr = CRYPTO_malloc((int)sVar4 + 0x18,"crypto/property/defn_cache.c",0x7e);
      if (ptr != (undefined8 *)0x0) {
        *ptr = ptr + 2;
        ptr[1] = *param_3;
        memcpy(ptr + 2,param_2,sVar4 + 1);
        lVar3 = OPENSSL_LH_insert(lVar2,ptr);
        if ((lVar3 != 0) || (iVar1 = OPENSSL_LH_error(lVar2), iVar1 == 0)) {
          uVar5 = 1;
          goto LAB_00ac5168;
        }
      }
      CRYPTO_free(ptr);
      uVar5 = 0;
    }
    else {
      ossl_property_free(*param_3);
      uVar5 = 1;
      *param_3 = *(undefined8 *)(lVar3 + 8);
    }
  }
LAB_00ac5168:
  ossl_lib_ctx_unlock(param_1);
  return uVar5;
}

