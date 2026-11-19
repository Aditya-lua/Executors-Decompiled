/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891438
 */

uint FUN_00891438(undefined8 *param_1,undefined8 param_2,uint param_3,uint param_4)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  
  if (*(int *)(param_1 + 1) == 0) {
    FUN_0088d1d0(param_1,param_2,param_3,1);
  }
  else {
    lVar2 = FUN_00875ec8(*param_1);
    FUN_0088d1d0(param_1,param_2,param_3,1);
    lVar3 = FUN_00875ec8(*param_1);
    if ((((lVar3 == lVar2 + 1) && (uVar1 = FUN_00875ebc(*param_1), (uVar1 & 0xff) == 6)) &&
        ((param_3 & 0xff) == (uVar1 >> 8 & 0xff))) &&
       (((param_4 & 0xff) != (uVar1 >> 0x10 & 0xff) &&
        ((*(byte *)((long)param_1 + (ulong)(byte)(uVar1 >> 0x10) + 0x698) & 1) == 0)))) {
      FUN_00875d78(*param_1,6);
      param_3 = uVar1 >> 0x10;
    }
  }
  return param_3;
}

