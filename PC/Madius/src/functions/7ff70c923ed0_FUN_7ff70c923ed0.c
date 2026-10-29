/* 7ff70c923ed0 FUN_7ff70c923ed0 */

void FUN_7ff70c923ed0(longlong *param_1)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  
  if (*param_1 != 0) {
    LOCK();
    piVar1 = (int *)(*param_1 + 0x2c);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    puVar3 = (undefined8 *)*param_1;
    if (puVar3 != (undefined8 *)0x0 && *piVar1 == 0) {
      do {
        puVar2 = (undefined8 *)puVar3[2];
        puVar3[2] = 0;
        (**(code **)*puVar3)(puVar3,1);
        puVar3 = puVar2;
      } while (puVar2 != (undefined8 *)0x0);
    }
  }
  *param_1 = 0;
  if (((longlong *)param_1[4] != (longlong *)0x0) &&
     (puVar3 = (undefined8 *)(**(code **)(*(longlong *)param_1[4] + 0x10))(),
     puVar3 != (undefined8 *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c923f4d. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)*puVar3)(puVar3,1,*(code **)*puVar3);
    return;
  }
  return;
}


