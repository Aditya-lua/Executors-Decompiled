/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b506a4
 */

undefined8 FUN_00b506a4(undefined8 param_1,undefined4 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = ossl_ecx_key_dup(param_1,param_2);
  }
  return uVar2;
}

