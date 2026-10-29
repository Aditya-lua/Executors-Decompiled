/* 7ff70c992f40 FUN_7ff70c992f40 */

undefined8 FUN_7ff70c992f40(longlong *param_1)

{
  int iVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  longlong *plVar4;
  longlong lVar5;
  
  plVar2 = (longlong *)*param_1;
  if (*plVar2 != 0) {
    if (param_1[2] != 0) {
      puVar3 = *(undefined8 **)(param_1[2] + 0x10);
      param_1[2] = (longlong)puVar3;
      if (puVar3 != (undefined8 *)0x0) {
        return *puVar3;
      }
    }
    iVar1 = (int)param_1[1];
    if (iVar1 < (int)plVar2[4]) {
      plVar4 = (longlong *)((longlong)iVar1 * 0x20 + *plVar2);
      lVar5 = 0;
      do {
        puVar3 = (undefined8 *)*plVar4;
        if (puVar3 != (undefined8 *)0x0) {
          param_1[2] = (longlong)puVar3;
          *(int *)(param_1 + 1) = (iVar1 - (int)lVar5) + 1;
          return *puVar3;
        }
        lVar5 = lVar5 + -1;
        plVar4 = plVar4 + 4;
      } while ((longlong)iVar1 - (longlong)(int)plVar2[4] != lVar5);
      return 0;
    }
  }
  return 0;
}


