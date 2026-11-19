/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6700c
 */

undefined8 ossl_ccm_stream_final(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    iVar1 = FUN_00b66d70(param_1,param_2,param_3,0,0);
    if (iVar1 < 1) {
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
      *param_3 = 0;
    }
  }
  return uVar2;
}

