/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcb00c
 */

void FUN_00bcb00c(ulong *param_1,undefined8 param_2,int param_3)

{
  ulong uVar1;
  int iVar2;
  int iVar3;
  int *piVar4;
  char *pcVar5;
  size_t __n;
  undefined1 *__dest;
  char *__s;
  char acStack_440 [1024];
  
  __s = acStack_440;
  piVar4 = (int *)__errno();
  iVar2 = *piVar4;
  pcVar5 = strerror_r(param_3,acStack_440,0x400);
  iVar3 = (int)pcVar5;
  if (iVar3 != 0) {
    if (iVar3 == -1) {
      iVar3 = *piVar4;
    }
    if (iVar3 != 0x16) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    __s = "";
  }
  if (*__s == '\0') {
    snprintf(acStack_440,0x400,"Unknown error %d",param_3);
    __s = acStack_440;
  }
  *piVar4 = iVar2;
  __n = strlen(__s);
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)__n << 1);
    if (__n == 0) goto LAB_00bcb0fc;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    param_1[1] = __n;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar1 | 1;
  }
  memmove(__dest,__s,__n);
LAB_00bcb0fc:
  __dest[__n] = 0;
  return;
}

