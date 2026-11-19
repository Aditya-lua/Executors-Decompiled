/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1874
 */

undefined8 OSSL_PROVIDER_load(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_provider_disable_fallback_loading();
  if (iVar1 == 0) {
    return 0;
  }
  uVar2 = OSSL_PROVIDER_try_load(param_1,param_2,0);
  return uVar2;
}

