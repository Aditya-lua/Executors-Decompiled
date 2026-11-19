/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009143c8
 */

ulong FUN_009143c8(char *param_1)

{
  ulong uVar1;
  ulong uVar2;
  char *__n;
  void *pvVar3;
  char *pcVar4;
  char *pcVar5;
  
  uVar2 = 0;
  if (param_1 != (char *)0x0) {
    uVar1 = FUN_009172dc(param_1);
    uVar2 = 0;
    if ((uVar1 & 1) == 0) {
      __n = (char *)strlen(param_1);
      pvVar3 = memrchr(param_1,0x2e,(size_t)__n);
      if ((pvVar3 == (void *)0x0) ||
         (pvVar3 = memrchr(param_1,0x2e,(long)pvVar3 - (long)param_1), pvVar3 == (void *)0x0)) {
        pcVar4 = (char *)0x0;
      }
      else {
        pcVar4 = (char *)((long)pvVar3 + 1);
        __n = param_1 + ((long)__n - (long)pcVar4);
      }
      if (pcVar4 != (char *)0x0) {
        param_1 = pcVar4;
      }
      if ((long)__n < 1) {
        uVar2 = 0x1a;
      }
      else {
        uVar2 = 0x1505;
        pcVar4 = param_1;
        do {
          pcVar5 = pcVar4 + 1;
          uVar1 = FUN_009416cc(*pcVar4);
          uVar2 = uVar2 * 0x21 ^ uVar1 & 0xff;
          pcVar4 = pcVar5;
        } while (pcVar5 < param_1 + (long)__n);
        uVar2 = uVar2 % 0x3f;
      }
    }
  }
  return uVar2;
}

