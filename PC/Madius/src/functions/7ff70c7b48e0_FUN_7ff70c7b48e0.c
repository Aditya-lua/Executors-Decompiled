/* 7ff70c7b48e0 FUN_7ff70c7b48e0 */

longlong * FUN_7ff70c7b48e0(longlong *param_1,longlong *param_2,longlong *param_3)

{
  longlong lVar1;
  code *pcVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  longlong lVar5;
  longlong lVar6;
  byte bVar7;
  char cVar8;
  undefined1 uVar9;
  longlong *plVar10;
  longlong lVar11;
  longlong lVar12;
  uint uVar13;
  longlong lStack_58;
  uint uStack_50;
  longlong *plStack_48;
  undefined8 uStack_40;
  
  lVar11 = *param_1;
  lVar12 = *(longlong *)(lVar11 + 8);
  uVar13 = 0;
  lVar1 = lVar12;
  if (*(char *)(lVar12 + 0x19) == '\0') {
    do {
      lVar12 = lVar1;
      bVar7 = FUN_7ff70c7b18c0(param_1,lVar12 + 0x20,param_3);
      if (bVar7 == 0) {
        lVar11 = lVar12;
      }
      lVar1 = *(longlong *)(lVar12 + (ulonglong)bVar7 * 0x10);
    } while (*(char *)(lVar1 + 0x19) == '\0');
    uVar13 = (uint)(bVar7 ^ 1);
    cVar8 = *(char *)(lVar11 + 0x19);
  }
  else {
    cVar8 = *(char *)(lVar11 + 0x19);
  }
  if ((cVar8 == '\0') && (cVar8 = FUN_7ff70c7b18c0(param_1,param_3,lVar11 + 0x20), cVar8 == '\0')) {
    uVar9 = 0;
  }
  else {
    if (param_1[1] == 0x2aaaaaaaaaaaaaa) {
      FUN_7ff70ca3b460();
      pcVar2 = (code *)swi(3);
      plVar10 = (longlong *)(*pcVar2)();
      return plVar10;
    }
    lVar11 = *param_1;
    plStack_48 = param_1;
    plVar10 = (longlong *)FUN_7ff70ca8ff40(0x60);
    lVar1 = *param_3;
    lVar5 = param_3[1];
    uVar3 = *(undefined4 *)((longlong)param_3 + 0x14);
    lVar6 = param_3[3];
    uVar4 = *(undefined4 *)((longlong)param_3 + 0x1c);
    *(int *)(plVar10 + 6) = (int)param_3[2];
    *(undefined4 *)((longlong)plVar10 + 0x34) = uVar3;
    *(int *)(plVar10 + 7) = (int)lVar6;
    *(undefined4 *)((longlong)plVar10 + 0x3c) = uVar4;
    plVar10[4] = lVar1;
    plVar10[5] = lVar5;
    param_3[2] = 0;
    param_3[3] = 0xf;
    *(undefined1 *)param_3 = 0;
    plVar10[8] = 0;
    plVar10[9] = 0;
    plVar10[10] = 0;
    plVar10[0xb] = 0xf;
    *plVar10 = lVar11;
    plVar10[1] = lVar11;
    plVar10[2] = lVar11;
    *(undefined2 *)(plVar10 + 3) = 0;
    uStack_40 = 0;
    FUN_7ff70ca3e580(&plStack_48);
    lStack_58 = lVar12;
    uStack_50 = uVar13;
    lVar11 = FUN_7ff70ca3b1f0(param_1,&lStack_58,plVar10);
    uVar9 = 1;
  }
  *param_2 = lVar11;
  *(undefined1 *)(param_2 + 1) = uVar9;
  return param_2;
}


