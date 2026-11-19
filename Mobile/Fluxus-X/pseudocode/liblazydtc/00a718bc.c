/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a718bc
 */

int FUN_00a718bc(int param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  size_t sVar3;
  undefined8 uVar4;
  long lVar5;
  int *piVar6;
  char *__s1;
  
  iVar1 = FUN_00a70a34();
  if (iVar1 < 1) {
    return iVar1;
  }
  iVar1 = *(int *)(param_3 + 8);
  if (param_1 == 1) {
    if (iVar1 == 1) {
      uVar4 = *(undefined8 *)(param_3 + 0x20);
      *(long *)(param_3 + 0x20) = param_3 + 0x40;
      *(undefined8 *)(param_3 + 0x38) = uVar4;
      *(undefined4 *)(param_3 + 0x1c) = 0x32;
    }
    else if (iVar1 == 2) goto LAB_00a71938;
  }
  else if ((param_1 == 8) && (iVar1 == 1)) {
LAB_00a71938:
    if (*(uint *)(param_3 + 0x1c) < 0xfffffffd) {
      BIO_snprintf((char *)(param_3 + 0x40),0x32,"%d");
    }
    else {
      strncpy((char *)(param_3 + 0x40),
              (&PTR_s_digest_00c602b0)
              [*(long *)(&DAT_007665d0 + (long)(int)(*(uint *)(param_3 + 0x1c) + 3) * 8) * 2],0x31);
      *(undefined1 *)(param_3 + 0x71) = 0;
    }
    *(char **)(param_3 + 0x20) = (char *)(param_3 + 0x40);
    sVar3 = strlen((char *)(param_3 + 0x40));
    *(int *)(param_3 + 0x1c) = (int)sVar3;
  }
  iVar1 = FUN_00a6fd84(param_1,param_2,param_3);
  if (iVar1 < 1) {
    return iVar1;
  }
  if ((param_1 != 7) || (*(int *)(param_3 + 8) != 2)) {
    if (param_1 != 2) {
      return iVar1;
    }
    if (*(int *)(param_3 + 8) != 1) {
      return iVar1;
    }
  }
  __s1 = *(char **)(param_3 + 0x20);
  iVar2 = strcmp(__s1,"digest");
  if (iVar2 == 0) {
    lVar5 = 0;
  }
  else {
    iVar2 = strcmp(__s1,"max");
    if (iVar2 == 0) {
      lVar5 = 1;
    }
    else {
      iVar2 = strcmp(__s1,"auto");
      if (iVar2 != 0) {
        iVar2 = atoi(__s1);
        goto joined_r0x00a71a64;
      }
      lVar5 = 2;
    }
  }
  iVar2 = (&DAT_00c602a8)[lVar5 * 4];
joined_r0x00a71a64:
  if (param_1 == 2) {
    piVar6 = *(int **)(param_3 + 0x38);
  }
  else {
    piVar6 = (int *)(param_3 + 0x1c);
  }
  *piVar6 = iVar2;
  *(undefined8 *)(param_3 + 0x20) = 0;
  return iVar1;
}

