/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a71238
 */

int FUN_00a71238(int param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  
  iVar1 = FUN_00a70a34();
  if (iVar1 < 1) {
    return iVar1;
  }
  if (*(int *)(param_3 + 8) != 2) {
    return 0;
  }
  if (param_1 == 1) {
    if (*(int *)(param_3 + 0x1c) == 0) {
      pcVar3 = "explicit";
LAB_00a712a4:
      *(char **)(param_3 + 0x20) = pcVar3;
      *(undefined4 *)(param_3 + 0x1c) = 0;
      goto LAB_00a712ac;
    }
    if (*(int *)(param_3 + 0x1c) == 1) {
      pcVar3 = "named_curve";
      goto LAB_00a712a4;
    }
LAB_00a71308:
    ERR_new();
    ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x46d,"fix_ec_param_enc");
    ERR_set_error(6,0x93,0);
    iVar1 = -2;
  }
  else {
LAB_00a712ac:
    iVar1 = FUN_00a6fd84(param_1,param_2,param_3);
    if (param_1 != 7) {
      return iVar1;
    }
    if (iVar1 < 1) {
      return iVar1;
    }
    pcVar3 = *(char **)(param_3 + 0x20);
    iVar2 = strcmp(pcVar3,"explicit");
    if (iVar2 == 0) {
      *(undefined4 *)(param_3 + 0x1c) = 0;
    }
    else {
      iVar2 = strcmp(pcVar3,"named_curve");
      if (iVar2 != 0) {
        *(undefined4 *)(param_3 + 0x1c) = 0xfffffffe;
        *(undefined8 *)(param_3 + 0x20) = 0;
        goto LAB_00a71308;
      }
      *(undefined4 *)(param_3 + 0x1c) = 1;
    }
    *(undefined8 *)(param_3 + 0x20) = 0;
  }
  return iVar1;
}

