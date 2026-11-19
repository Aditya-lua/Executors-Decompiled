/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b68184
 */

bool ossl_gcm_one_shot(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                      undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  bool bVar1;
  int iVar2;
  
  iVar2 = (**(code **)(*(long *)(param_1 + 0xf0) + 0x10))();
  if ((iVar2 == 0) ||
     (iVar2 = (**(code **)(*(long *)(param_1 + 0xf0) + 0x18))(param_1,param_4,param_5,param_6),
     iVar2 == 0)) {
    bVar1 = false;
  }
  else {
    *(undefined8 *)(param_1 + 0x18) = 0x10;
    iVar2 = (**(code **)(*(long *)(param_1 + 0xf0) + 0x20))(param_1,param_7);
    bVar1 = iVar2 != 0;
  }
  return bVar1;
}

