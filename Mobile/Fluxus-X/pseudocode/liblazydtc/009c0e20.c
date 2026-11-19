/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0e20
 */

void FUN_009c0e20(undefined8 param_1,undefined8 param_2)

{
  undefined8 local_20;
  undefined8 uStack_18;
  
  local_20 = param_2;
  uStack_18 = param_1;
  OSSL_PROVIDER_get_capabilities(param_1,"TLS-GROUP",&LAB_009c5ef0,&local_20);
  return;
}

