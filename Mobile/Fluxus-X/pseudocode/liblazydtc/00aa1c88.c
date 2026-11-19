/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa1c88
 */

undefined8 FUN_00aa1c88(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = ossl_lib_ctx_get_data(param_2,0x12,&DAT_00c6d498);
  uVar3 = 0;
  if (lVar2 != 0) {
    uVar3 = (**(code **)(lVar2 + 0x30))(param_1);
    lVar2 = ossl_provider_find(param_2,uVar3,1);
    uVar3 = 0;
    if (lVar2 != 0) {
      ossl_provider_free();
      iVar1 = ossl_provider_is_child(lVar2);
      if ((iVar1 == 0) || (uVar3 = ossl_provider_deactivate(lVar2,1), (int)uVar3 != 0)) {
        uVar3 = 1;
      }
    }
  }
  return uVar3;
}

