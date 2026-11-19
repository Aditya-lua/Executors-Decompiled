/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5d33c
 */

undefined8
evp_generic_fetch(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  undefined8 uVar1;
  undefined8 auStack_68 [4];
  long local_48;
  
  local_48 = 0;
  auStack_68[0] = param_1;
  uVar1 = FUN_00a5d3a4(auStack_68,0,param_2,0,param_3,param_4,param_5,param_6,param_7);
  if (local_48 != 0) {
    ossl_method_store_free(local_48);
  }
  return uVar1;
}

