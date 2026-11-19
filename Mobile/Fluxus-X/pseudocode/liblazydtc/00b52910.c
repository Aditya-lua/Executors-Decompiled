/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b52910
 */

undefined8 FUN_00b52910(undefined8 *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((param_2 == 8) && (iVar1 != 0)) {
    uVar3 = *param_1;
    iVar1 = RSA_test_flags(uVar3,0xf000);
    uVar2 = 0;
    if (iVar1 == 0x1000) {
      *param_1 = 0;
      uVar2 = uVar3;
    }
  }
  return uVar2;
}

