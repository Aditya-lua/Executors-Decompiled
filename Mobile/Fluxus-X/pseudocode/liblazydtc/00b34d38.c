/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34d38
 */

void ossl_b2i(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  int local_14;
  
  local_14 = -1;
  uVar2 = FUN_00b34d84(param_1,param_2,&local_14,param_3);
  uVar3 = 0x74;
  if (local_14 != 1) {
    uVar3 = 0;
  }
  uVar1 = 6;
  if (local_14 != 0) {
    uVar1 = uVar3;
  }
  FUN_00b34ee4(uVar2,uVar1);
  return;
}

