/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b03358
 */

int FUN_00b03358(undefined8 param_1,long param_2,int param_3)

{
  int iVar1;
  int iVar2;
  
  iVar1 = FUN_00b03290();
  if ((((param_3 != 0) || (iVar1 == 0)) || ((*(byte *)(param_2 + 0xe8) >> 1 & 1) == 0)) ||
     (iVar2 = 0, (*(byte *)(param_2 + 0xec) >> 5 & 1) != 0)) {
    iVar2 = iVar1;
  }
  return iVar2;
}

