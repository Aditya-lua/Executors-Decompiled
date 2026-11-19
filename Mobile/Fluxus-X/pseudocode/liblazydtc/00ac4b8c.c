/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4b8c
 */

undefined8
ossl_method_store_cache_get
          (long param_1,undefined8 param_2,int param_3,long param_4,undefined8 *param_5)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 local_70;
  long lStack_68;
  
  if (param_1 == 0) {
    return 0;
  }
  if (param_3 < 1) {
    return 0;
  }
  if (param_4 == 0) {
    return 0;
  }
  iVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 0x10));
  if (iVar1 == 0) {
    return 0;
  }
  lVar2 = ossl_sa_get(*(undefined8 *)(param_1 + 8),(long)param_3);
  if (lVar2 != 0) {
    local_70 = param_2;
    lStack_68 = param_4;
    lVar2 = OPENSSL_LH_retrieve(*(undefined8 *)(lVar2 + 0x10),&local_70);
    uVar3 = 0;
    if (lVar2 == 0) goto LAB_00ac4c28;
    iVar1 = (**(code **)(lVar2 + 0x18))(*(undefined8 *)(lVar2 + 0x10));
    if (iVar1 != 0) {
      uVar3 = 1;
      *param_5 = *(undefined8 *)(lVar2 + 0x10);
      goto LAB_00ac4c28;
    }
  }
  uVar3 = 0;
LAB_00ac4c28:
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
  return uVar3;
}

