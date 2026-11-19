/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa6f94
 */

undefined8 MDC2_Update(uint *param_1,void *param_2,size_t param_3)

{
  void *__dest;
  ulong uVar1;
  uint uVar2;
  size_t __n;
  
  uVar2 = *param_1;
  if (uVar2 != 0) {
    __n = 8 - (ulong)uVar2;
    __dest = (void *)((long)param_1 + (ulong)uVar2 + 4);
    if (param_3 < __n) {
      memcpy(__dest,param_2,param_3);
      param_3 = (size_t)(uVar2 + (int)param_3);
      goto LAB_00aa7040;
    }
    memcpy(__dest,param_2,__n);
    *param_1 = 0;
    param_3 = param_3 - __n;
    param_2 = (void *)((long)param_2 + __n);
    FUN_00aa705c(param_1,param_1 + 1,8);
  }
  uVar1 = param_3 & 0xfffffffffffffff8;
  if (uVar1 != 0) {
    FUN_00aa705c(param_1,param_2,uVar1);
  }
  param_3 = param_3 - uVar1;
  if (param_3 == 0) {
    return 1;
  }
  memcpy(param_1 + 1,(void *)((long)param_2 + uVar1),param_3);
LAB_00aa7040:
  *param_1 = (uint)param_3;
  return 1;
}

