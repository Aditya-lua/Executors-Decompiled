/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091ea58
 */

void FUN_0091ea58(char *param_1,ulong param_2)

{
  char *pcVar1;
  ulong uVar2;
  int iVar3;
  size_t sVar4;
  ulong uVar5;
  
  *param_1 = '\0';
  iVar3 = curl_strequal("identity","identity");
  uVar2 = 10;
  if (iVar3 != 0) {
    uVar2 = 0;
  }
  iVar3 = curl_strequal("deflate","identity");
  uVar5 = uVar2 + 9;
  if (iVar3 != 0) {
    uVar5 = uVar2;
  }
  iVar3 = curl_strequal(&DAT_002af2db,"identity");
  if (iVar3 == 0) {
    uVar5 = uVar5 + 6;
  }
  else if (uVar5 == 0) {
    if (param_2 < 9) {
      return;
    }
    builtin_strncpy(param_1,"identity",9);
    return;
  }
  if (uVar5 < param_2) {
    iVar3 = curl_strequal("identity","identity");
    if (iVar3 == 0) {
      builtin_strncpy(param_1,"identity",9);
      sVar4 = strlen(param_1);
      pcVar1 = param_1 + sVar4;
      param_1 = pcVar1 + 2;
      pcVar1[0] = ',';
      pcVar1[1] = ' ';
    }
    iVar3 = curl_strequal("deflate","identity");
    if (iVar3 == 0) {
      builtin_strncpy(param_1,"deflate",8);
      sVar4 = strlen(param_1);
      pcVar1 = param_1 + sVar4;
      param_1 = pcVar1 + 2;
      pcVar1[0] = ',';
      pcVar1[1] = ' ';
    }
    iVar3 = curl_strequal(&DAT_002af2db,"identity");
    if (iVar3 == 0) {
      builtin_strncpy(param_1,"gzip",5);
      sVar4 = strlen(param_1);
      pcVar1 = param_1 + sVar4;
      param_1 = pcVar1 + 2;
      pcVar1[0] = ',';
      pcVar1[1] = ' ';
    }
    param_1[-2] = '\0';
  }
  return;
}

