/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f8f4
 */

undefined8 EVP_PKEY_settable_params(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x60) == 0)) {
    return 0;
  }
  uVar1 = EVP_KEYMGMT_settable_params();
  return uVar1;
}

