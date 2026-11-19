/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1798
 */

long OSSL_PROVIDER_try_load(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  long local_38;
  
  lVar3 = ossl_provider_find(param_1,param_2,0);
  if (lVar3 == 0) {
    lVar3 = ossl_provider_new(param_1,param_2,0,0);
    if (lVar3 == 0) {
      return 0;
    }
    bVar1 = true;
  }
  else {
    bVar1 = false;
  }
  iVar2 = ossl_provider_activate(lVar3,1,0);
  if (iVar2 != 0) {
    if (!bVar1) {
      return lVar3;
    }
    local_38 = lVar3;
    iVar2 = ossl_provider_add_to_store(lVar3,&local_38,param_3);
    if (iVar2 == 0) {
      ossl_provider_deactivate(lVar3,1);
    }
    else {
      if (local_38 == lVar3) {
        return lVar3;
      }
      iVar2 = ossl_provider_activate(local_38,1,0);
      lVar3 = local_38;
      if (iVar2 != 0) {
        return local_38;
      }
    }
  }
  ossl_provider_free(lVar3);
  return 0;
}

