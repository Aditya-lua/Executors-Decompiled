/* 7ff70c931bb0 FUN_7ff70c931bb0 */

longlong * FUN_7ff70c931bb0(longlong *param_1,longlong *param_2)

{
  int *piVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  longlong lVar4;
  undefined8 *puVar5;
  
  *param_1 = 0;
  plVar2 = (longlong *)param_2[4];
  param_1[4] = (longlong)plVar2;
  (**(code **)(*plVar2 + 8))();
  lVar4 = FUN_7ff70c924760(param_1 + 3);
  param_1[1] = lVar4;
  lVar4 = FUN_7ff70c9248e0(param_1 + 3);
  param_1[2] = lVar4;
  lVar4 = *param_2;
  if (lVar4 != 0) {
    LOCK();
    *(int *)(lVar4 + 0x2c) = *(int *)(lVar4 + 0x2c) + 1;
    UNLOCK();
  }
  if (*param_1 != 0) {
    LOCK();
    piVar1 = (int *)(*param_1 + 0x2c);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    puVar5 = (undefined8 *)*param_1;
    if (puVar5 != (undefined8 *)0x0 && *piVar1 == 0) {
      do {
        puVar3 = (undefined8 *)puVar5[2];
        puVar5[2] = 0;
        (**(code **)*puVar5)(puVar5,1);
        puVar5 = puVar3;
      } while (puVar3 != (undefined8 *)0x0);
    }
  }
  *param_1 = lVar4;
  return param_1;
}


