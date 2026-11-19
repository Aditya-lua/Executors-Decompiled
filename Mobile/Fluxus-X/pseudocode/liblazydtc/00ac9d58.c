/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9d58
 */

undefined4 EVP_RAND_uninstantiate(long *param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  lVar3 = *param_1;
  if (*(code **)(lVar3 + 0x78) != (code *)0x0) {
    iVar1 = (**(code **)(lVar3 + 0x78))(param_1[1]);
    if (iVar1 == 0) {
      return 0;
    }
    lVar3 = *param_1;
  }
  uVar2 = (**(code **)(lVar3 + 0x50))(param_1[1]);
  if (*(code **)(*param_1 + 0x80) != (code *)0x0) {
    (**(code **)(*param_1 + 0x80))(param_1[1]);
  }
  return uVar2;
}

