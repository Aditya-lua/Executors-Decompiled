/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd424
 */

void FUN_00bcd424(undefined8 *param_1)

{
  undefined8 *puVar1;
  long lVar2;
  void *pvVar3;
  long *plVar4;
  undefined8 *puVar5;
  
  puVar1 = (undefined8 *)param_1[4];
  for (puVar5 = (undefined8 *)param_1[3]; puVar5 != puVar1; puVar5 = puVar5 + 2) {
    std::__ndk1::condition_variable::notify_all((condition_variable *)*puVar5);
    std::__ndk1::mutex::unlock((mutex *)puVar5[1]);
  }
  puVar1 = (undefined8 *)param_1[1];
  for (puVar5 = (undefined8 *)*param_1; puVar5 != puVar1; puVar5 = puVar5 + 1) {
                    /* try { // try from 00bcd47c to 00bcd47f has its CatchHandler @ 00bcd4ec */
    std::__ndk1::__assoc_sub_state::__make_ready((__assoc_sub_state *)*puVar5);
    plVar4 = (long *)*puVar5;
    lVar2 = FUN_00c2bd10(0xffffffffffffffff,plVar4 + 1);
    if (lVar2 == 0) {
      (**(code **)(*plVar4 + 0x10))(plVar4);
    }
  }
  pvVar3 = (void *)param_1[3];
  if (pvVar3 != (void *)0x0) {
    param_1[4] = pvVar3;
    operator_delete(pvVar3);
  }
  pvVar3 = (void *)*param_1;
  if (pvVar3 == (void *)0x0) {
    return;
  }
  param_1[1] = pvVar3;
  operator_delete(pvVar3);
  return;
}

