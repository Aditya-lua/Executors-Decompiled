/* 7ff70c992b70 FUN_7ff70c992b70 */

undefined8 FUN_7ff70c992b70(longlong *param_1,undefined8 param_2,undefined8 param_3)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  
  lVar1 = *param_1;
  if (lVar1 != 0) {
    lVar2 = (*(code *)param_1[1])(param_2,param_3,(longlong)(int)param_1[4]);
    plVar4 = *(longlong **)(lVar1 + lVar2 * 0x20);
    if (plVar4 != (longlong *)0x0) {
      do {
        lVar3 = (*(code *)param_1[2])
                          (*plVar4 + 0x28,*(undefined8 *)(*plVar4 + 0x20),param_2,param_3);
        if (lVar3 != 0) {
          FUN_7ff70c991030(lVar1 + lVar2 * 0x20,plVar4,param_1);
          param_1[5] = param_1[5] + -1;
          return 0;
        }
        plVar4 = (longlong *)plVar4[2];
      } while (plVar4 != (longlong *)0x0);
    }
  }
  return 1;
}


