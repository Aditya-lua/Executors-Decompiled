/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d914
 */

undefined8 FUN_00b2d914(undefined8 param_1,undefined8 param_2,undefined8 *param_3,ulong param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if (((0x1f < param_4) && (iVar1 != 0)) &&
     (uVar2 = ossl_blake2s_final(param_2,param_1), (int)uVar2 != 0)) {
    uVar2 = 1;
    *param_3 = 0x20;
  }
  return uVar2;
}

