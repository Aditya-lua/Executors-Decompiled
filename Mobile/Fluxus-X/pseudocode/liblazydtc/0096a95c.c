/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096a95c
 */

undefined8 FUN_0096a95c(undefined8 *param_1,char *param_2)

{
  long lVar1;
  uint uVar2;
  size_t sVar3;
  char *__s;
  ulong uVar4;
  int iVar5;
  
  param_1[4] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  if ((param_2 == (char *)0x0) || (*(long *)(param_2 + 0x20) == 0)) {
    iVar5 = 0;
  }
  else {
    uVar4 = 0;
    iVar5 = 0;
    __s = param_2;
    do {
      sVar3 = strlen(__s);
      if ((9 < sVar3) || (uVar2 = (uint)sVar3 & 0xff, 0x1f < (int)(uVar2 + iVar5))) {
        return 2;
      }
      lVar1 = (long)iVar5 + 1;
      *(char *)((long)param_1 + (long)iVar5) = (char)sVar3;
      memcpy((void *)((long)param_1 + lVar1),__s,sVar3 & 0xff);
      uVar4 = uVar4 + 1;
      iVar5 = uVar2 + (int)lVar1;
      __s = __s + 10;
    } while (uVar4 < *(ulong *)(param_2 + 0x20));
  }
  *(int *)((long)param_1 + 0x24) = iVar5;
  return 0;
}

