/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4d6bc
 */

undefined8 FUN_00b4d6bc(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((param_2 == 8) && (iVar1 != 0)) {
    uVar2 = *param_1;
    *param_1 = 0;
  }
  return uVar2;
}

