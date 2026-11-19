/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ea050
 */

void FUN_008ea050(long *param_1,long param_2,long param_3,long param_4,long param_5,int param_6)

{
  ulong __n;
  long lVar1;
  long lVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  void *pvVar6;
  ulong local_80;
  ulong local_78;
  void *local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_1 != (long *)0x0) {
    lVar5 = param_3 - param_2;
    __n = *(long *)(param_5 + 0x18) - (param_4 - param_2);
    if (__n == 0 || *(long *)(param_5 + 0x18) < param_4 - param_2) {
      __n = 0;
    }
    if (0 < lVar5) {
      lVar2 = (**(code **)(*param_1 + 0x60))(param_1,param_2,lVar5);
      plVar4 = (long *)0x0;
      if (lVar2 != lVar5) goto LAB_008ea1b8;
    }
    if (0 < (long)__n) {
      local_80 = 0;
      local_78 = 0;
      local_70 = (void *)0x0;
      if (__n < 0x17) {
        pvVar6 = (void *)((ulong)&local_80 | 1);
        local_80 = (ulong)(byte)((int)__n << 1);
      }
      else {
        uVar3 = __n + 0x10 & 0xfffffffffffffff0;
        pvVar6 = operator_new(uVar3);
        local_80 = uVar3 | 1;
        local_78 = __n;
        local_70 = pvVar6;
      }
      memset(pvVar6,param_6,__n);
      *(undefined1 *)((long)pvVar6 + __n) = 0;
      pvVar6 = (void *)((ulong)&local_80 | 1);
      if ((local_80 & 1) != 0) {
        pvVar6 = local_70;
      }
                    /* try { // try from 008ea154 to 008ea15f has its CatchHandler @ 008ea1ec */
      uVar3 = (**(code **)(*param_1 + 0x60))(param_1,pvVar6,__n);
      if ((local_80 & 1) != 0) {
        operator_delete(local_70);
      }
      plVar4 = (long *)0x0;
      if (uVar3 != __n) goto LAB_008ea1b8;
    }
    param_4 = param_4 - param_3;
    if (0 < param_4) {
      lVar5 = (**(code **)(*param_1 + 0x60))(param_1,param_3,param_4);
      plVar4 = (long *)0x0;
      if (lVar5 != param_4) goto LAB_008ea1b8;
    }
    *(undefined8 *)(param_5 + 0x18) = 0;
  }
  plVar4 = param_1;
LAB_008ea1b8:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(plVar4);
  }
  return;
}

