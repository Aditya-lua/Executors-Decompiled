/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59d7c
 */

undefined8
FUN_00b59d7c(undefined8 param_1,undefined4 param_2,undefined4 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if ((iVar1 == 0) || (iVar1 = FUN_00b59e5c(param_1,param_6), iVar1 == 0)) {
    return 0;
  }
  uVar2 = ossl_prov_drbg_instantiate(param_1,param_2,param_3,param_4,param_5);
  return uVar2;
}

