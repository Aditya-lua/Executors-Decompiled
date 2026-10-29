/* 7ff70c992c00 FUN_7ff70c992c00 */

undefined8 FUN_7ff70c992c00(longlong *param_1,undefined8 param_2,undefined8 param_3)

{
  longlong lVar1;
  longlong *plVar2;
  longlong lVar3;
  
  lVar1 = *param_1;
  if (lVar1 != 0) {
    lVar3 = (*(code *)param_1[1])(param_2,param_3,(longlong)(int)param_1[4]);
    for (plVar2 = *(longlong **)(lVar1 + lVar3 * 0x20); plVar2 != (longlong *)0x0;
        plVar2 = (longlong *)plVar2[2]) {
      lVar1 = *plVar2;
      lVar3 = (*(code *)param_1[2])(lVar1 + 0x28,*(undefined8 *)(lVar1 + 0x20),param_2,param_3);
      if (lVar3 != 0) {
        return *(undefined8 *)(lVar1 + 0x18);
      }
    }
  }
  return 0;
}


