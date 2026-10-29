/* 7ff70c7a7e90 FUN_7ff70c7a7e90 */

void FUN_7ff70c7a7e90(longlong param_1,longlong *param_2)

{
  longlong *plVar1;
  longlong *plVar2;
  longlong *plVar3;
  longlong lVar4;
  undefined8 uVar5;
  longlong lVar6;
  longlong *plVar7;
  longlong lVar8;
  
  plVar1 = (longlong *)(param_1 + 0xc0);
  if (plVar1 != param_2) {
    lVar6 = *(longlong *)(param_1 + 0xc0);
    FUN_7ff70ca3dc90(plVar1,plVar1,*(undefined8 *)(lVar6 + 8));
    *(longlong *)(lVar6 + 8) = lVar6;
    *(longlong *)lVar6 = lVar6;
    *(longlong *)(lVar6 + 0x10) = lVar6;
    *(undefined8 *)(param_1 + 200) = 0;
    uVar5 = FUN_7ff70c7ad230(plVar1,*(undefined8 *)(*param_2 + 8),*(undefined8 *)(param_1 + 0xc0));
    *(undefined8 *)(*(longlong *)(param_1 + 0xc0) + 8) = uVar5;
    *(longlong *)(param_1 + 200) = param_2[1];
    plVar2 = *(longlong **)(param_1 + 0xc0);
    plVar3 = (longlong *)plVar2[1];
    if (*(char *)(plVar2[1] + 0x19) == '\0') {
      do {
        plVar7 = plVar3;
        plVar3 = (longlong *)*plVar7;
      } while (*(char *)((longlong)plVar3 + 0x19) == '\0');
      *plVar2 = (longlong)plVar7;
      lVar6 = *plVar1;
      lVar4 = *(longlong *)(lVar6 + 8);
      do {
        lVar8 = lVar4;
        lVar4 = *(longlong *)(lVar8 + 0x10);
      } while (*(char *)(*(longlong *)(lVar8 + 0x10) + 0x19) == '\0');
    }
    else {
      *plVar2 = (longlong)plVar2;
      lVar6 = *plVar1;
      lVar8 = lVar6;
    }
    *(longlong *)(lVar6 + 0x10) = lVar8;
  }
  return;
}


