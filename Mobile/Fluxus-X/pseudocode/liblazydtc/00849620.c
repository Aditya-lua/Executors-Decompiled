/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00849620
 */

void FUN_00849620(undefined8 param_1,long param_2,void *param_3,void *param_4)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  void *pvVar4;
  undefined8 local_70;
  ulong local_68;
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  uVar3 = (long)param_4 - (long)param_3;
  local_58 = *(long *)(lVar2 + 0x28);
  if (uVar3 < 0xfffffffffffffff8) {
    if (uVar3 < 0x17) {
      pvVar4 = (void *)((ulong)&local_70 | 1);
      local_70 = CONCAT71(local_70._1_7_,(char)((int)uVar3 << 1));
    }
    else {
      uVar1 = 0x1a;
      if ((uVar3 | 7) != 0x17) {
        uVar1 = (uVar3 | 7) + 1;
      }
      pvVar4 = operator_new(uVar1);
      local_70 = uVar1 | 1;
      local_68 = uVar3;
      local_60 = pvVar4;
    }
    if (param_4 != param_3) {
      memmove(pvVar4,param_3,uVar3);
    }
    *(undefined1 *)((long)pvVar4 + uVar3) = 0;
    if ((local_70 & 1) == 0) {
      uVar3 = local_70 >> 1 & 0x7f;
      pvVar4 = (void *)((long)&local_70 + 1);
    }
    else {
      uVar3 = local_68;
      pvVar4 = local_60;
    }
                    /* try { // try from 008496f4 to 008496ff has its CatchHandler @ 00849758 */
    (**(code **)(**(long **)(param_2 + 0x10) + 0x20))
              (param_1,*(long **)(param_2 + 0x10),pvVar4,(long)pvVar4 + uVar3);
    if ((local_70 & 1) != 0) {
      operator_delete(local_60,local_70 & 0xfffffffffffffffe);
    }
    if (*(long *)(lVar2 + 0x28) == local_58) {
      return;
    }
  }
  else if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

