/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be5420
 */

long * FUN_00be5420(long *param_1,long param_2,long param_3,long param_4,long param_5,int param_6)

{
  ulong __n;
  long lVar1;
  ulong uVar2;
  long lVar3;
  void *pvVar4;
  undefined8 local_68;
  ulong local_60;
  void *local_58;
  
  if (param_1 == (long *)0x0) {
    return (long *)0x0;
  }
  lVar3 = param_3 - param_2;
  __n = *(long *)(param_5 + 0x18) - (param_4 - param_2);
  if (__n == 0 || *(long *)(param_5 + 0x18) < param_4 - param_2) {
    __n = 0;
  }
  if ((lVar3 < 1) || (lVar1 = (**(code **)(*param_1 + 0x60))(param_1,param_2,lVar3), lVar1 == lVar3)
     ) {
    if (0 < (long)__n) {
      if (__n < 0x17) {
        pvVar4 = (void *)((ulong)&local_68 | 1);
        local_68 = CONCAT71(local_68._1_7_,(char)((int)__n << 1));
      }
      else {
        uVar2 = 0x1a;
        if ((__n | 7) != 0x17) {
          uVar2 = (__n | 7) + 1;
        }
        pvVar4 = operator_new(uVar2);
        local_68 = uVar2 | 1;
        local_60 = __n;
        local_58 = pvVar4;
      }
      memset(pvVar4,param_6,__n);
      *(undefined1 *)((long)pvVar4 + __n) = 0;
      pvVar4 = local_58;
      if ((local_68 & 1) == 0) {
        pvVar4 = (void *)((long)&local_68 + 1);
      }
                    /* try { // try from 00be550c to 00be5517 has its CatchHandler @ 00be5598 */
      uVar2 = (**(code **)(*param_1 + 0x60))(param_1,pvVar4,__n);
      if ((local_68 & 1) != 0) {
        operator_delete(local_58,local_68 & 0xfffffffffffffffe);
      }
      if (uVar2 != __n) {
        return (long *)0x0;
      }
    }
    param_4 = param_4 - param_3;
    if ((param_4 < 1) ||
       (lVar3 = (**(code **)(*param_1 + 0x60))(param_1,param_3,param_4), lVar3 == param_4)) {
      *(undefined8 *)(param_5 + 0x18) = 0;
      return param_1;
    }
  }
  return (long *)0x0;
}

