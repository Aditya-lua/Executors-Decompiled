/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01f1c
 */

void FUN_00c01f1c(ulong *param_1,wchar_t *param_2)

{
  ulong uVar1;
  size_t sVar2;
  undefined1 *__dest;
  
  sVar2 = wcslen(param_2);
  if (0x3ffffffffffffff7 < sVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (sVar2 < 5) {
    __dest = (undefined1 *)((long)param_1 + 4);
    *(char *)param_1 = (char)((int)sVar2 << 1);
    if (sVar2 == 0) goto LAB_00c01fa0;
  }
  else {
    uVar1 = 8;
    if ((sVar2 | 1) != 5) {
      uVar1 = (sVar2 | 1) + 1;
    }
    __dest = operator_new(uVar1 << 2);
    param_1[1] = sVar2;
    param_1[2] = (ulong)__dest;
    *param_1 = uVar1 | 1;
  }
  memmove(__dest,param_2,sVar2 << 2);
LAB_00c01fa0:
  *(undefined4 *)(__dest + sVar2 * 4) = 0;
  return;
}

