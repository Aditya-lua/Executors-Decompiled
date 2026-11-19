/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20bc0
 */

void ossl_dsa_ffc_params_fromdata(long param_1)

{
  int iVar1;
  
  if ((param_1 != 0) && (iVar1 = ossl_ffc_params_fromdata(param_1 + 8), iVar1 != 0)) {
    *(long *)(param_1 + 0xc0) = *(long *)(param_1 + 0xc0) + 1;
  }
  return;
}

