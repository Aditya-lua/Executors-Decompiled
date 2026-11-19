/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f90c
 */

undefined8 EVP_PKEY_gettable_params(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x60) == 0)) {
    return 0;
  }
  uVar1 = EVP_KEYMGMT_gettable_params();
  return uVar1;
}

