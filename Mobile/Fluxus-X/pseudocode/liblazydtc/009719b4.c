/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009719b4
 */

void FUN_009719b4(char *param_1)

{
  long lVar1;
  FILE *__stream;
  undefined8 uVar2;
  size_t __n;
  size_t sVar3;
  char acStack_158 [256];
  long local_58;
  
  __stream = DAT_00d20260;
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar2 = 0;
  if ((param_1 != (char *)0x0) && (DAT_00d20260 != (FILE *)0x0)) {
    __n = strlen(param_1);
    uVar2 = 0;
    if (__n - 1 < 0xfe) {
      memcpy(acStack_158,param_1,__n);
      sVar3 = __n;
      if (param_1[__n - 1] != '\n') {
        sVar3 = __n + 1;
        acStack_158[__n] = '\n';
      }
      acStack_158[sVar3] = '\0';
      fputs(acStack_158,__stream);
      uVar2 = 1;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

