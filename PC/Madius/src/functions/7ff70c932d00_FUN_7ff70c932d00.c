/* 7ff70c932d00 FUN_7ff70c932d00 */

void FUN_7ff70c932d00(longlong *param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  longlong *plVar6;
  longlong *plVar7;
  undefined8 *puVar8;
  longlong lVar9;
  longlong *plVar10;
  longlong lStack_48;
  
  puVar1 = (undefined8 *)*param_1;
  for (puVar8 = (undefined8 *)*puVar1; puVar8 != puVar1; puVar8 = (undefined8 *)*puVar8) {
    if (param_2 == param_3) {
      plVar10 = (longlong *)puVar8[1];
      *plVar10 = (longlong)puVar1;
      puVar1[1] = plVar10;
      lVar9 = 0;
      do {
        puVar2 = (undefined8 *)*puVar8;
        thunk_FUN_7ff70ca90250(puVar8,0x28);
        lVar9 = lVar9 + -1;
        puVar8 = puVar2;
      } while (puVar2 != puVar1);
      param_1[1] = param_1[1] + lVar9;
      return;
    }
    uVar3 = *(undefined4 *)((longlong)param_2 + 0x14);
    uVar4 = *(undefined4 *)(param_2 + 3);
    uVar5 = *(undefined4 *)((longlong)param_2 + 0x1c);
    *(undefined4 *)(puVar8 + 2) = *(undefined4 *)(param_2 + 2);
    *(undefined4 *)((longlong)puVar8 + 0x14) = uVar3;
    *(undefined4 *)(puVar8 + 3) = uVar4;
    *(undefined4 *)((longlong)puVar8 + 0x1c) = uVar5;
    *(undefined4 *)(puVar8 + 4) = *(undefined4 *)(param_2 + 4);
    param_2 = (undefined8 *)*param_2;
  }
  if (param_3 != param_2) {
    plVar6 = (longlong *)FUN_7ff70ca8ff40(0x28);
    plVar6[4] = param_2[4];
    uVar3 = *(undefined4 *)((longlong)param_2 + 0x14);
    uVar4 = *(undefined4 *)(param_2 + 3);
    uVar5 = *(undefined4 *)((longlong)param_2 + 0x1c);
    *(undefined4 *)(plVar6 + 2) = *(undefined4 *)(param_2 + 2);
    *(undefined4 *)((longlong)plVar6 + 0x14) = uVar3;
    *(undefined4 *)(plVar6 + 3) = uVar4;
    *(undefined4 *)((longlong)plVar6 + 0x1c) = uVar5;
    lStack_48 = 1;
    param_2 = (undefined8 *)*param_2;
    plVar10 = plVar6;
    if (param_2 == param_3) {
      lStack_48 = 1;
      plVar7 = plVar6;
    }
    else {
      do {
        plVar7 = (longlong *)FUN_7ff70ca8ff40(0x28);
        plVar7[4] = param_2[4];
        uVar3 = *(undefined4 *)((longlong)param_2 + 0x14);
        uVar4 = *(undefined4 *)(param_2 + 3);
        uVar5 = *(undefined4 *)((longlong)param_2 + 0x1c);
        *(undefined4 *)(plVar7 + 2) = *(undefined4 *)(param_2 + 2);
        *(undefined4 *)((longlong)plVar7 + 0x14) = uVar3;
        *(undefined4 *)(plVar7 + 3) = uVar4;
        *(undefined4 *)((longlong)plVar7 + 0x1c) = uVar5;
        *plVar10 = (longlong)plVar7;
        plVar7[1] = (longlong)plVar10;
        lStack_48 = lStack_48 + 1;
        param_2 = (undefined8 *)*param_2;
        plVar10 = plVar7;
      } while (param_2 != param_3);
      if (lStack_48 == 0) {
        return;
      }
    }
    lVar9 = *param_1;
    puVar1 = *(undefined8 **)(lVar9 + 8);
    plVar6[1] = (longlong)puVar1;
    *puVar1 = plVar6;
    *plVar7 = lVar9;
    *(longlong **)(lVar9 + 8) = plVar7;
    param_1[1] = param_1[1] + lStack_48;
  }
  return;
}


