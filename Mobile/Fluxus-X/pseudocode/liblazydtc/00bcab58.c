/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcab58
 */

void FUN_00bcab58(ulong *param_1,byte *param_2,char *param_3)

{
  ulong uVar1;
  size_t __n;
  ulong uVar2;
  byte bVar3;
  size_t __n_00;
  void *__dest;
  uint uVar4;
  byte *__src;
  
  bVar3 = *param_2;
  __n = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    __n = *(size_t *)(param_2 + 8);
  }
  __n_00 = strlen(param_3);
  uVar1 = __n + __n_00;
  if (0xfffffffffffffff7 < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (uVar1 < 0x17) {
    uVar4 = (int)uVar1 << 1;
    __dest = (void *)0x0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *(char *)param_1 = (char)uVar4;
  }
  else {
    uVar2 = 0x1a;
    if ((uVar1 | 7) != 0x17) {
      uVar2 = (uVar1 | 7) + 1;
    }
    __dest = operator_new(uVar2);
    param_1[1] = uVar1;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar2 | 1;
    uVar4 = (uint)(uVar2 | 1) & 0xff;
  }
  if ((uVar4 & 1) == 0) {
    __dest = (void *)((long)param_1 + 1);
  }
  if (__n != 0) {
    __src = *(byte **)(param_2 + 0x10);
    if ((bVar3 & 1) == 0) {
      __src = param_2 + 1;
    }
    memmove(__dest,__src,__n);
  }
  if (__n_00 != 0) {
    memmove((void *)((long)__dest + __n),param_3,__n_00);
  }
  *(undefined1 *)((long)((long)__dest + __n) + __n_00) = 0;
  return;
}

