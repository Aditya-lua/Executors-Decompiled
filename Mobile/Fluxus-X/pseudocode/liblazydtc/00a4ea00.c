/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ea00
 */

undefined8 OSSL_DECODER_fetch(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 local_50 [4];
  long local_30;
  
  local_30 = 0;
  local_50[0] = param_1;
  uVar1 = FUN_00a4ea54(local_50,0,param_2,param_3);
  if (local_30 != 0) {
    ossl_method_store_free(local_30);
  }
  return uVar1;
}

