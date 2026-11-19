/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a71364
 */

int FUN_00a71364(int param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  char *local_38;
  
  local_38 = (char *)0x0;
  iVar1 = FUN_00a70a34();
  if ((0 < iVar1) && (iVar1 = 0, *(int *)(param_3 + 8) == 2)) {
    if (param_1 == 7) {
      local_38 = (char *)(param_3 + 0x40);
      *(char ***)(param_3 + 0x20) = &local_38;
      *(undefined8 *)(param_3 + 0x28) = 0x32;
    }
    else if (param_1 == 1) {
      pcVar3 = OBJ_nid2sn(*(int *)(param_3 + 0x1c));
      *(char **)(param_3 + 0x20) = pcVar3;
      *(undefined4 *)(param_3 + 0x1c) = 0;
    }
    iVar1 = FUN_00a6fd84(param_1,param_2,param_3);
    if ((param_1 == 7) && (0 < iVar1)) {
      iVar2 = OBJ_sn2nid(local_38);
      *(int *)(param_3 + 0x1c) = iVar2;
      *(undefined8 *)(param_3 + 0x20) = 0;
    }
  }
  return iVar1;
}

