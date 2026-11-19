/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa18b8
 */

undefined8 OSSL_PROVIDER_unload(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = ossl_provider_deactivate(param_1,1);
  if ((int)uVar1 != 0) {
    ossl_provider_free(param_1);
    uVar1 = 1;
  }
  return uVar1;
}

