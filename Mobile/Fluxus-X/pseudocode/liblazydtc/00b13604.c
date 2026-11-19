/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13604
 */

void ossl_policy_cache_find_data(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined1 auStack_40 [8];
  undefined8 local_38;
  
  local_38 = param_2;
  uVar1 = OPENSSL_sk_find(*(undefined8 *)(param_1 + 8),auStack_40);
  OPENSSL_sk_value(*(undefined8 *)(param_1 + 8),uVar1);
  return;
}

