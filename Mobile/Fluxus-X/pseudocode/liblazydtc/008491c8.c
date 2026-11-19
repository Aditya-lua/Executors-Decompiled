/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008491c8
 */

void FUN_008491c8(ulong param_1,void *param_2,void *param_3,byte param_4)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  char *pcVar4;
  undefined8 local_70;
  ulong local_68;
  char *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  uVar3 = (long)param_3 - (long)param_2;
  local_58 = *(long *)(lVar2 + 0x28);
  if (uVar3 < 0xfffffffffffffff8) {
    if (uVar3 < 0x17) {
      pcVar4 = (char *)((ulong)&local_70 | 1);
      local_70 = CONCAT71(local_70._1_7_,(char)((int)uVar3 << 1));
    }
    else {
      uVar1 = 0x1a;
      if ((uVar3 | 7) != 0x17) {
        uVar1 = (uVar3 | 7) + 1;
      }
      pcVar4 = operator_new(uVar1);
      local_70 = uVar1 | 1;
      local_68 = uVar3;
      local_60 = pcVar4;
    }
    if (param_3 != param_2) {
      memcpy(pcVar4,param_2,uVar3);
    }
    pcVar4[uVar3] = '\0';
    if ((local_70 & 1) == 0) {
      uVar3 = local_70 >> 1 & 0x7f;
      pcVar4 = (char *)((long)&local_70 + 1);
    }
    else {
      uVar3 = local_68;
      pcVar4 = local_60;
    }
                    /* try { // try from 0084929c to 008492bf has its CatchHandler @ 00849324 */
    (**(code **)(**(long **)(param_1 + 8) + 0x30))(*(long **)(param_1 + 8),pcVar4,pcVar4 + uVar3);
    pcVar4 = (char *)((ulong)&local_70 | 1);
    if ((local_70 & 1) != 0) {
      pcVar4 = local_60;
    }
    param_1 = std::__ndk1::__get_classname(pcVar4,(bool)(param_4 & 1));
    if ((local_70 & 1) != 0) {
      param_1 = param_1 & 0xffffffff;
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
  __stack_chk_fail(param_1);
}

