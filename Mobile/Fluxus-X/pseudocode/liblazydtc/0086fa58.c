/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086fa58
 */

void FUN_0086fa58(long *param_1,long *param_2)

{
  char cVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long alStack_60 [4];
  long *local_40;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  cVar1 = (char)param_1[6];
  if (cVar1 == (char)param_2[6]) {
    if (cVar1 != '\0') {
      plVar3 = (long *)param_2[4];
      if (plVar3 == (long *)0x0) {
        local_40 = (long *)0x0;
      }
      else if (plVar3 == param_2) {
        local_40 = alStack_60;
        (**(code **)(*plVar3 + 0x18))(plVar3,alStack_60);
      }
      else {
        local_40 = (long *)(**(code **)(*plVar3 + 0x10))();
      }
      FUN_0086fbb0(alStack_60,param_1);
      if (local_40 == alStack_60) {
        lVar4 = 0x20;
      }
      else {
        if (local_40 == (long *)0x0) goto LAB_0086fb8c;
        lVar4 = 0x28;
      }
      (**(code **)(*local_40 + lVar4))();
    }
    goto LAB_0086fb8c;
  }
  if (cVar1 == '\0') {
    plVar3 = (long *)param_2[4];
    if (plVar3 == (long *)0x0) {
      param_1[4] = 0;
    }
    else if (plVar3 == param_2) {
      param_1[4] = (long)param_1;
      (**(code **)(*(long *)param_2[4] + 0x18))((long *)param_2[4],param_1);
    }
    else {
      lVar4 = (**(code **)(*plVar3 + 0x10))();
      param_1[4] = lVar4;
    }
    *(undefined1 *)(param_1 + 6) = 1;
    goto LAB_0086fb8c;
  }
  plVar3 = (long *)param_1[4];
  if (plVar3 == param_1) {
    lVar4 = 0x20;
LAB_0086fafc:
    (**(code **)(*plVar3 + lVar4))();
  }
  else if (plVar3 != (long *)0x0) {
    lVar4 = 0x28;
    goto LAB_0086fafc;
  }
  *(undefined1 *)(param_1 + 6) = 0;
LAB_0086fb8c:
  if (*(long *)(lVar2 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

