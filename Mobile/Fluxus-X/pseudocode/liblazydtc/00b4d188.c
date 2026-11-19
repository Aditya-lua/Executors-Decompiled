/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d188
 */

undefined8 FUN_00b4d188(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if (((param_2 != 0) && (param_1 != 0)) && (iVar1 != 0)) {
    uVar2 = ossl_dsa_get0_params(param_2);
    *(undefined8 *)(param_1 + 8) = uVar2;
    uVar2 = 1;
  }
  return uVar2;
}

