/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968cd0
 */

void FUN_00968cd0(long *param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  
  lVar3 = param_1[2];
  if (*(int *)(lVar3 + 0x58) != 0) {
    iVar1 = FUN_00907c74(param_1[1],param_2);
    if (iVar1 != -1) {
      if ((*(byte *)(lVar3 + 0x58) >> 1 & 1) == 0) {
        FUN_0090843c(param_2,param_3,iVar1,1,2);
        if (param_2 == 0) {
          return;
        }
        if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) {
          return;
        }
        if ((*(long *)(param_2 + 0x12a0) != 0) && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1)) {
          return;
        }
        if (*(int *)(*param_1 + 0xc) < 1) {
          return;
        }
        pcVar2 = "adjust_pollset, POLLIN fd=%d";
      }
      else {
        FUN_0090843c(param_2,param_3,iVar1,2,1);
        if (param_2 == 0) {
          return;
        }
        if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) == 0) {
          return;
        }
        if ((*(long *)(param_2 + 0x12a0) != 0) && (*(int *)(*(long *)(param_2 + 0x12a0) + 8) < 1)) {
          return;
        }
        if (*(int *)(*param_1 + 0xc) < 1) {
          return;
        }
        pcVar2 = "adjust_pollset, POLLOUT fd=%d";
      }
      FUN_00904ddc(param_2,param_1,pcVar2,iVar1);
      return;
    }
  }
  return;
}

