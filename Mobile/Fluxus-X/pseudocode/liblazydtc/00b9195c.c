/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9195c
 */

undefined4 mbedtls_ecp_get_type(long param_1)

{
  undefined4 uVar1;
  
  if (*(long *)(param_1 + 0x38) == 0) {
    return 0;
  }
  uVar1 = 1;
  if (*(long *)(param_1 + 0x48) == 0) {
    uVar1 = 2;
  }
  return uVar1;
}

