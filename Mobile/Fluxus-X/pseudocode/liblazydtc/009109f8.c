/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009109f8
 */

void FUN_009109f8(long param_1,long param_2,uint param_3)

{
  char *pcVar1;
  long lVar2;
  code *pcVar3;
  uint uVar4;
  
  lVar2 = *(long *)(param_1 + 0xc0);
  uVar4 = (uint)*(undefined8 *)(param_1 + 0xa82);
  if (lVar2 != 0) {
    if (((uVar4 >> 0x1c & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      pcVar1 = "closing";
      if ((param_3 & 1) == 0) {
        pcVar1 = "shutting down";
      }
      FUN_00904c98(param_1,"%s connection #%ld",pcVar1,*(undefined8 *)(param_2 + 0x28));
      lVar2 = *(long *)(param_1 + 0xc0);
    }
    FUN_00910b38(lVar2 + 0x158,param_1,param_2,param_3 & 1);
    return;
  }
  if (((uVar4 >> 0x1c & 1) != 0) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    FUN_00904c98(param_1,"closing connection #%ld",*(undefined8 *)(param_2 + 0x28));
  }
  if (-1 < *(int *)(param_2 + 0x3a0)) {
    if (*(long *)(param_2 + 0x30) != 0) {
      FUN_00917b54(param_1);
      *(undefined8 *)(param_2 + 0x30) = 0;
    }
    FUN_00924ee4(param_2);
    if ((*(long *)(param_2 + 0x3a8) != 0) &&
       (pcVar3 = *(code **)(*(long *)(param_2 + 0x3a8) + 0x60), pcVar3 != (code *)0x0)) {
      (*pcVar3)(param_1,param_2,*(ulong *)(param_2 + 0x3a0) >> 0x1e & 1);
    }
    FUN_0090ea54(param_1);
    *(ulong *)(param_2 + 0x3a0) = *(ulong *)(param_2 + 0x3a0) | 0x80000000;
  }
  FUN_009103b0(param_1,param_2,0,~param_3 & 1);
  return;
}

