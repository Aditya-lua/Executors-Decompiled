/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b6a0
 */

long OPENSSL_strlcat(char *param_1,char *param_2,long param_3)

{
  size_t sVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  
  if (param_3 == 0) {
    lVar4 = 0;
    lVar5 = 0;
  }
  else {
    lVar2 = 0;
    do {
      if (*param_1 == '\0') {
        uVar3 = param_3 + lVar2;
        lVar4 = -lVar2;
        lVar5 = 0;
        if (uVar3 < 2) goto LAB_00a9b730;
        goto LAB_00a9b6f8;
      }
      lVar2 = lVar2 + -1;
      param_1 = param_1 + 1;
    } while (param_3 + lVar2 != 0);
    lVar5 = 0;
    lVar4 = -lVar2;
  }
  goto LAB_00a9b734;
  while( true ) {
    uVar3 = uVar3 - 1;
    param_1[lVar5] = param_2[lVar5];
    lVar5 = lVar5 + 1;
    if (uVar3 < 2) break;
LAB_00a9b6f8:
    if (param_2[lVar5] == '\0') {
      param_2 = param_2 + lVar5;
      goto LAB_00a9b72c;
    }
  }
  param_2 = param_2 + lVar5;
  if (param_3 + lVar2 != lVar5) {
LAB_00a9b72c:
    param_1 = param_1 + lVar5;
LAB_00a9b730:
    *param_1 = '\0';
  }
LAB_00a9b734:
  sVar1 = strlen(param_2);
  return lVar5 + lVar4 + sVar1;
}

