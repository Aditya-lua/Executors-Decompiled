/* 7ff70c933ba0 FUN_7ff70c933ba0 */

longlong * FUN_7ff70c933ba0(longlong *param_1,longlong *param_2,int *param_3)

{
  char cVar1;
  int iVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  code *pcVar6;
  longlong *plVar7;
  longlong lVar8;
  undefined1 uVar9;
  uint uVar10;
  longlong lVar11;
  longlong lStack_40;
  uint uStack_38;
  
  lVar4 = *param_1;
  lVar11 = *(longlong *)(lVar4 + 8);
  uVar10 = 0;
  lVar8 = lVar4;
  if (*(char *)(lVar11 + 0x19) == '\0') {
    iVar2 = *param_3;
    lVar5 = lVar11;
    do {
      lVar11 = lVar5;
      iVar3 = *(int *)(lVar11 + 0x1c);
      if (iVar2 <= iVar3) {
        lVar8 = lVar11;
      }
      lVar5 = *(longlong *)(lVar11 + (ulonglong)(iVar3 < iVar2) * 0x10);
    } while (*(char *)(lVar5 + 0x19) == '\0');
    uVar10 = (uint)(iVar2 <= iVar3);
    cVar1 = *(char *)(lVar8 + 0x19);
  }
  else {
    cVar1 = *(char *)(lVar4 + 0x19);
  }
  if ((cVar1 == '\0') && (*(int *)(lVar8 + 0x1c) <= *param_3)) {
    uVar9 = 0;
  }
  else {
    if (param_1[1] == 0x7ffffffffffffff) {
      FUN_7ff70ca3b460();
      pcVar6 = (code *)swi(3);
      plVar7 = (longlong *)(*pcVar6)();
      return plVar7;
    }
    plVar7 = (longlong *)FUN_7ff70ca8ff40(0x20);
    *(int *)((longlong)plVar7 + 0x1c) = *param_3;
    *plVar7 = lVar4;
    plVar7[1] = lVar4;
    plVar7[2] = lVar4;
    *(undefined2 *)(plVar7 + 3) = 0;
    lStack_40 = lVar11;
    uStack_38 = uVar10;
    lVar8 = FUN_7ff70c7b1630(param_1,&lStack_40,plVar7);
    uVar9 = 1;
  }
  *param_2 = lVar8;
  *(undefined1 *)(param_2 + 1) = uVar9;
  return param_2;
}


