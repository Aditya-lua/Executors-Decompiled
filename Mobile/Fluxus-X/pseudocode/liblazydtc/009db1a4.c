/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009db1a4
 */

undefined8 ossl_statem_app_data_allowed(long param_1)

{
  int iVar1;
  
  if (((*(int *)(param_1 + 0x48) != 0) && (*(int *)(param_1 + 0x1b8) != 0)) &&
     (*(int *)(param_1 + 0x1b0) != 0)) {
    iVar1 = *(int *)(param_1 + 0x5c);
    if (*(int *)(param_1 + 0x38) == 0) {
      if (iVar1 == 0xc) {
        return 1;
      }
    }
    else if ((iVar1 == 0) || (iVar1 == 0x14)) {
      return 1;
    }
  }
  return 0;
}

