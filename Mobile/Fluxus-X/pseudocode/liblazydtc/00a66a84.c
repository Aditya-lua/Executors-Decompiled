/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a66a84
 */

bool evp_keymgmt_has_load(long param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 != 0) {
    bVar1 = *(long *)(param_1 + 0x90) != 0;
  }
  return bVar1;
}

