/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13978
 */

void ossl_policy_tree_find_sk(undefined8 param_1,undefined8 param_2)

{
  undefined4 uVar1;
  undefined1 *local_58 [3];
  undefined1 auStack_40 [8];
  undefined8 local_38;
  
  local_58[0] = auStack_40;
  local_38 = param_2;
  uVar1 = OPENSSL_sk_find(param_1,local_58);
  OPENSSL_sk_value(param_1,uVar1);
  return;
}

