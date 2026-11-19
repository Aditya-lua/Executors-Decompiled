/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa3350
 */

undefined8 ossl_provider_deactivate(long param_1,undefined4 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (param_1 != 0) {
    iVar1 = FUN_00aa3c88(param_1,1,param_2);
    if (iVar1 < 0) {
      uVar2 = 0;
    }
    else {
      if (iVar1 == 0) {
        uVar2 = FUN_00aa3e00(param_1);
        return uVar2;
      }
      uVar2 = 1;
    }
  }
  return uVar2;
}

