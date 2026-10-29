/* 7ff70c924640 FUN_7ff70c924640 */

longlong * FUN_7ff70c924640(longlong *param_1,longlong *param_2)

{
  int *piVar1;
  undefined8 *puVar2;
  longlong lVar3;
  undefined8 *puVar4;
  
  *param_1 = 0;
  lVar3 = FUN_7ff70cb12730(1);
  param_1[4] = lVar3;
  lVar3 = FUN_7ff70c924760(param_1 + 3);
  param_1[1] = lVar3;
  lVar3 = FUN_7ff70c9248e0(param_1 + 3);
  param_1[2] = lVar3;
  if (param_1 != param_2) {
    if (*param_1 != 0) {
      LOCK();
      piVar1 = (int *)(*param_1 + 0x2c);
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      puVar4 = (undefined8 *)*param_1;
      if ((undefined8 *)*param_1 != (undefined8 *)0x0 && *piVar1 == 0) {
        do {
          puVar2 = (undefined8 *)puVar4[2];
          puVar4[2] = 0;
          (**(code **)*puVar4)(puVar4,1);
          puVar4 = puVar2;
        } while (puVar2 != (undefined8 *)0x0);
      }
    }
    *param_1 = 0;
    *param_1 = *param_2;
    *param_2 = 0;
  }
  return param_1;
}


