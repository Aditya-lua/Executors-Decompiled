/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd7a8
 */

int bwrite_conv(long param_1,undefined8 param_2,ulong param_3,long *param_4)

{
  long lVar1;
  int iVar2;
  undefined4 uVar3;
  
  uVar3 = (undefined4)param_3;
  if (0x7ffffffe < param_3) {
    uVar3 = 0x7fffffff;
  }
  iVar2 = (**(code **)(*(long *)(param_1 + 8) + 0x18))(param_1,param_2,uVar3);
  lVar1 = 0;
  if (0 < iVar2) {
    lVar1 = (long)iVar2;
  }
  *param_4 = lVar1;
  if (0 < iVar2) {
    iVar2 = 1;
  }
  return iVar2;
}

