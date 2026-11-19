/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c220d0
 */

void FUN_00c220d0(long param_1,undefined8 *param_2)

{
  void *__ptr;
  long lVar1;
  size_t __size;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x10);
  (**(code **)(*plVar2 + 0x20))(plVar2);
  if ((*(ushort *)((long)plVar2 + 9) & 0xc0) != 0x40) {
    (**(code **)(*plVar2 + 0x28))(plVar2,param_2);
  }
  lVar1 = param_2[1];
  __ptr = (void *)*param_2;
  if ((ulong)param_2[2] < lVar1 + 2U) {
    __size = param_2[2] * 2;
    if (__size <= lVar1 + 0x3e2U) {
      __size = lVar1 + 0x3e2U;
    }
    param_2[2] = __size;
    __ptr = realloc(__ptr,__size);
    *param_2 = __ptr;
    if (__ptr == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    lVar1 = param_2[1];
  }
  *(undefined2 *)((long)__ptr + lVar1) = 0x3a3a;
  plVar2 = *(long **)(param_1 + 0x18);
  lVar1 = *plVar2;
  param_2[1] = param_2[1] + 2;
  (**(code **)(lVar1 + 0x20))(plVar2,param_2);
  if ((*(ushort *)((long)plVar2 + 9) & 0xc0) == 0x40) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00c221cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar2 + 0x28))(plVar2,param_2);
  return;
}

