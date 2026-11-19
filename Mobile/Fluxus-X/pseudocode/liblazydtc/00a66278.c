/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66278
 */

void evp_keymgmt_util_query_operation_name(long param_1,undefined4 param_2)

{
  long lVar1;
  
  if ((param_1 == 0) ||
     ((*(code **)(param_1 + 0x98) != (code *)0x0 &&
      (lVar1 = (**(code **)(param_1 + 0x98))(param_2), lVar1 != 0)))) {
    return;
  }
  EVP_KEYMGMT_get0_name(param_1);
  return;
}

