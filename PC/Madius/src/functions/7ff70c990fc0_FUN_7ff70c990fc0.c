/* 7ff70c990fc0 FUN_7ff70c990fc0 */

void FUN_7ff70c990fc0(longlong *param_1,longlong param_2,undefined8 param_3,undefined8 *param_4)

{
  longlong *plVar1;
  longlong *plVar2;
  
  *param_4 = param_3;
  if (param_1[3] == 0) {
    *param_1 = (longlong)param_4;
    param_4[1] = 0;
    *(undefined8 *)(*param_1 + 0x10) = 0;
    param_1[1] = (longlong)param_4;
    param_1[3] = param_1[3] + 1;
    return;
  }
  plVar1 = (longlong *)(param_2 + 0x10);
  plVar2 = plVar1;
  if (param_2 == 0) {
    plVar2 = param_1;
  }
  param_4[2] = *plVar2;
  param_4[1] = param_2;
  if (param_2 != 0) {
    plVar2 = (longlong *)*plVar1;
    if ((longlong *)*plVar1 == (longlong *)0x0) {
      plVar2 = param_1;
    }
    plVar2[1] = (longlong)param_4;
    *plVar1 = (longlong)param_4;
    param_1[3] = param_1[3] + 1;
    return;
  }
  *(undefined8 **)(*param_1 + 8) = param_4;
  *param_1 = (longlong)param_4;
  param_1[3] = param_1[3] + 1;
  return;
}


