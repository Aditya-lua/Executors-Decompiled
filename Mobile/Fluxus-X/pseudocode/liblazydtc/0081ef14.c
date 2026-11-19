/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081ef14
 */

void FUN_0081ef14(ulong *param_1,byte *param_2,byte *param_3)

{
  ulong uVar1;
  size_t __n;
  size_t __n_00;
  ulong uVar2;
  byte bVar3;
  byte bVar4;
  void *__dest;
  uint uVar5;
  byte *pbVar6;
  
  bVar3 = *param_2;
  bVar4 = *param_3;
  __n = (ulong)(bVar3 >> 1);
  if ((bVar3 & 1) != 0) {
    __n = *(size_t *)(param_2 + 8);
  }
  __n_00 = (ulong)(bVar4 >> 1);
  if ((bVar4 & 1) != 0) {
    __n_00 = *(size_t *)(param_3 + 8);
  }
  uVar1 = __n_00 + __n;
  if (0xfffffffffffffff7 < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (uVar1 < 0x17) {
    uVar5 = (int)uVar1 << 1;
    __dest = (void *)0x0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    *(char *)param_1 = (char)uVar5;
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
    uVar5 = (uint)(uVar2 | 1) & 0xff;
  }
  if ((uVar5 & 1) == 0) {
    __dest = (void *)((long)param_1 + 1);
  }
  if (__n != 0) {
    pbVar6 = *(byte **)(param_2 + 0x10);
    if ((bVar3 & 1) == 0) {
      pbVar6 = param_2 + 1;
    }
    memmove(__dest,pbVar6,__n);
  }
  if (__n_00 != 0) {
    pbVar6 = *(byte **)(param_3 + 0x10);
    if ((bVar4 & 1) == 0) {
      pbVar6 = param_3 + 1;
    }
    memmove((void *)((long)__dest + __n),pbVar6,__n_00);
  }
  *(undefined1 *)((long)((long)__dest + __n) + __n_00) = 0;
  return;
}

