/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9dc0
 */

undefined4
EVP_RAND_generate(long *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined4 param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  undefined4 uVar2;
  
  if ((*(code **)(*param_1 + 0x78) == (code *)0x0) ||
     (iVar1 = (**(code **)(*param_1 + 0x78))(param_1[1]), iVar1 != 0)) {
    uVar2 = FUN_00ac9e68(param_1,param_2,param_3,param_4,param_5,param_6,param_7);
    if (*(code **)(*param_1 + 0x80) != (code *)0x0) {
      (**(code **)(*param_1 + 0x80))(param_1[1]);
    }
  }
  else {
    uVar2 = 0;
  }
  return uVar2;
}

