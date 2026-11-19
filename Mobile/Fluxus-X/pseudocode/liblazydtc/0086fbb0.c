/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086fbb0
 */

void FUN_0086fbb0(long *param_1,long *param_2)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long local_60 [5];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_2 != param_1) {
    plVar2 = (long *)param_1[4];
    plVar3 = (long *)param_2[4];
    if (plVar2 == param_1) {
      if (plVar3 == param_2) {
                    /* try { // try from 0086fc74 to 0086fc7b has its CatchHandler @ 0086fd0c */
        (**(code **)(*plVar2 + 0x18))(plVar2,local_60);
        (**(code **)(*(long *)param_1[4] + 0x20))();
        param_1[4] = 0;
                    /* try { // try from 0086fc9c to 0086fca3 has its CatchHandler @ 0086fd0c */
        (**(code **)(*(long *)param_2[4] + 0x18))((long *)param_2[4],param_1);
        (**(code **)(*(long *)param_2[4] + 0x20))();
        param_2[4] = 0;
        param_1[4] = (long)param_1;
                    /* try { // try from 0086fcc4 to 0086fccf has its CatchHandler @ 0086fd0c */
        (**(code **)(local_60[0] + 0x18))(local_60,param_2);
        (**(code **)(local_60[0] + 0x20))(local_60);
      }
      else {
                    /* try { // try from 0086fc14 to 0086fc1b has its CatchHandler @ 0086fd0c */
        (**(code **)(*plVar2 + 0x18))(plVar2,param_2);
        (**(code **)(*(long *)param_1[4] + 0x20))();
        param_1[4] = param_2[4];
      }
      param_2[4] = (long)param_2;
    }
    else if (plVar3 == param_2) {
                    /* try { // try from 0086fc40 to 0086fc4b has its CatchHandler @ 0086fd0c */
      (**(code **)(*plVar3 + 0x18))(plVar3,param_1);
      (**(code **)(*(long *)param_2[4] + 0x20))();
      param_2[4] = param_1[4];
      param_1[4] = (long)param_1;
    }
    else {
      param_1[4] = (long)plVar3;
      param_2[4] = (long)plVar2;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

