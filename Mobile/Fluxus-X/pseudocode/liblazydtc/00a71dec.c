/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a71dec
 */

undefined8 FUN_00a71dec(int param_1,undefined8 param_2,long param_3,int *param_4)

{
  int iVar1;
  undefined8 uVar2;
  char *__s;
  size_t sVar3;
  long lVar4;
  undefined4 uVar5;
  
  uVar2 = FUN_00a70a34();
  if ((int)uVar2 < 1) {
    return uVar2;
  }
  if (param_1 == 1) {
    if (*(int *)(param_3 + 8) != 0) {
      return 0;
    }
    if (*(int *)(param_3 + 0x1c) == -2) {
      *(long *)(param_3 + 0x20) = param_3 + 0x40;
      uVar5 = 1;
      *(undefined4 *)(param_3 + 0x1c) = 0x32;
    }
    else {
      uVar5 = 2;
    }
    *(undefined4 *)(param_3 + 8) = uVar5;
  }
  uVar2 = FUN_00a70a34(param_1,param_2);
  if ((int)uVar2 < 1) {
    return uVar2;
  }
  if (param_1 == 1) {
    if (*(int *)(param_3 + 8) == 2) {
LAB_00a71e80:
      __s = *(char **)(param_4 + 2);
      if (__s != (char *)0x0) {
        do {
          if (*(int *)(param_3 + 0x1c) == *param_4) {
            *(char **)(param_3 + 0x20) = __s;
            sVar3 = strlen(__s);
            *(int *)(param_3 + 0x1c) = (int)sVar3;
            goto LAB_00a71ed0;
          }
          __s = *(char **)(param_4 + 6);
          param_4 = param_4 + 4;
        } while (__s != (char *)0x0);
      }
      return 0xfffffffe;
    }
  }
  else if ((param_1 == 8) && (*(int *)(param_3 + 8) == 1)) goto LAB_00a71e80;
LAB_00a71ed0:
  uVar2 = FUN_00a6fd84(param_1,param_2,param_3);
  if ((int)uVar2 < 1) {
    return uVar2;
  }
  if (param_1 == 7) {
    if (*(int *)(param_3 + 8) == 1) {
      iVar1 = -2;
      goto LAB_00a71f64;
    }
    if (*(int *)(param_3 + 8) != 2) {
      return uVar2;
    }
  }
  else {
    if (param_1 != 2) {
      return uVar2;
    }
    if (*(int *)(param_3 + 8) != 1) {
      return uVar2;
    }
  }
  *(undefined4 *)(param_3 + 0x1c) = 0xffffffff;
  lVar4 = *(long *)(param_4 + 2);
  while( true ) {
    if (lVar4 == 0) {
      *(undefined8 *)(param_3 + 0x20) = 0;
      return 0xffffffff;
    }
    iVar1 = OPENSSL_strcasecmp(*(undefined8 *)(param_3 + 0x20));
    if (iVar1 == 0) break;
    lVar4 = *(long *)(param_4 + 6);
    param_4 = param_4 + 4;
  }
  iVar1 = *param_4;
  uVar2 = 1;
  *(undefined8 *)(param_3 + 0x20) = 0;
LAB_00a71f64:
  *(int *)(param_3 + 0x1c) = iVar1;
  return uVar2;
}

