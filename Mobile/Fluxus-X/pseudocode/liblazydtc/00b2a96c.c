/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2a96c
 */

int FUN_00b2a96c(long param_1,undefined8 param_2,undefined8 param_3,long param_4,undefined8 param_5,
                undefined8 param_6)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = ossl_cipher_generic_dinit();
  if ((param_4 != 0) && (iVar1 != 0)) {
    (**(code **)(*(long *)(param_1 + 0xa8) + 0x20))(param_1);
  }
  if (iVar1 == 0) {
    iVar3 = 0;
  }
  else {
    iVar2 = FUN_00b2ad0c(param_1,param_6);
    iVar3 = 0;
    if (iVar2 != 0) {
      iVar3 = iVar1;
    }
  }
  return iVar3;
}

