/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b52858
 */

undefined8 FUN_00b52858(undefined8 param_1,uint param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if (((param_2 & 3) != 0) && (iVar1 != 0)) {
    uVar2 = ossl_rsa_dup(param_1,param_2);
  }
  return uVar2;
}

