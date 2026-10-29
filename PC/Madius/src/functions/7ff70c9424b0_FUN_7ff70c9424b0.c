/* 7ff70c9424b0 FUN_7ff70c9424b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c9424b0(longlong *param_1,longlong param_2,longlong param_3,longlong param_4,
                undefined1 *param_5)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  char cVar5;
  longlong lVar6;
  ulonglong uVar7;
  undefined4 uVar8;
  ulonglong uVar9;
  undefined4 *puVar10;
  longlong *plVar11;
  int iVar12;
  longlong lVar13;
  longlong lStack_60;
  
  lVar13 = 0x1e8;
  if (*param_1 == 0x7ff70cbec850) {
    lVar13 = 600;
  }
  lVar1 = param_1[2];
  lVar2 = param_1[3];
  if (param_5 != (undefined1 *)0x0) {
    *param_5 = 0;
  }
  plVar11 = *(longlong **)(param_2 + 0xc70);
  if (plVar11 == (longlong *)0x0) {
    return 0;
  }
  iVar12 = (int)plVar11[5];
  lVar6 = (*_DAT_7ff70cbebae8)(*(undefined8 *)(lVar1 + 8));
  if (lVar6 == 0) {
    return 0x1b;
  }
  lVar3 = param_1[3];
  if (*(char *)(lVar3 + 0x2d1) == '\x01') {
    lStack_60 = (*_DAT_7ff70cbebae8)(*(undefined8 *)(lVar3 + 0xa0));
    if (lStack_60 == 0) goto LAB_7ff70c9427ce;
    lVar3 = param_1[3];
    cVar5 = *(char *)(lVar3 + 0x2d2);
  }
  else {
    lStack_60 = 0;
    cVar5 = *(char *)(lVar3 + 0x2d2);
  }
  uVar8 = 0xffffffff;
  if (cVar5 == '\x01') {
    uVar8 = *(undefined4 *)(lVar3 + 0x604);
  }
  lVar3 = *(longlong *)(param_2 + 0xe8);
  if ((lVar3 == 0) || ((*(byte *)(lVar3 + 4) & 0x10) == 0)) {
    puVar10 = (undefined4 *)(param_2 + 0xc78);
    uVar7 = *(ulonglong *)(param_2 + 0x6a8);
    uVar9 = 1;
    if (1 < uVar7) goto LAB_7ff70c9425e5;
LAB_7ff70c942627:
    if (uVar9 == uVar7) goto LAB_7ff70c94262c;
    plVar11 = (longlong *)(uVar9 * 0xa8 + *(longlong *)(param_2 + 0xc70));
  }
  else {
    puVar10 = (undefined4 *)(lVar3 + 0xd8);
    uVar7 = *(ulonglong *)(param_2 + 0x6a8);
    uVar9 = 1;
    if (uVar7 < 2) goto LAB_7ff70c942627;
LAB_7ff70c9425e5:
    uVar9 = 1;
    plVar4 = *(longlong **)(param_2 + 0xc70);
    do {
      if (plVar4[0x18] == 0) goto LAB_7ff70c942627;
      if ((int)plVar4[0x1a] < iVar12) {
        iVar12 = (int)plVar4[0x1a];
        plVar11 = plVar4 + 0x15;
      }
      uVar9 = uVar9 + 1;
      plVar4 = plVar4 + 0x15;
    } while (uVar7 != uVar9);
LAB_7ff70c94262c:
    FUN_7ff70c942320(plVar11);
  }
  plVar11[3] = param_3;
  plVar11[4] = param_4;
  *(undefined4 *)(plVar11 + 5) = *puVar10;
  (*_DAT_7ff70cbebad8)(*plVar11);
  (*_DAT_7ff70cbebad8)(plVar11[1]);
  *plVar11 = lVar6;
  plVar11[1] = lStack_60;
  *(undefined4 *)(plVar11 + 6) = uVar8;
  *(undefined4 *)((longlong)plVar11 + 0x2c) = *(undefined4 *)(lVar1 + 0x40);
  plVar11[2] = **(longlong **)(param_1[3] + 0x2e8);
  cVar5 = FUN_7ff70c941bc0(lVar13 + lVar2,plVar11 + 7);
  if (cVar5 != '\0') {
    if (param_5 == (undefined1 *)0x0) {
      return 0;
    }
    *param_5 = 1;
    return 0;
  }
  (*_DAT_7ff70cbebad8)(plVar11[7]);
  plVar11[7] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[8]);
  plVar11[8] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[9]);
  plVar11[9] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[10]);
  plVar11[10] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0xb]);
  plVar11[0xb] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0xc]);
  plVar11[0xc] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0xd]);
  plVar11[0xd] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0xf]);
  plVar11[0xf] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0x10]);
  plVar11[0x10] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0x11]);
  plVar11[0x11] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0x12]);
  plVar11[0x12] = 0;
  (*_DAT_7ff70cbebad8)(plVar11[0xe]);
  plVar11[0xe] = 0;
  plVar11[3] = 0;
  (*_DAT_7ff70cbebad8)(lVar6);
  lVar6 = lStack_60;
LAB_7ff70c9427ce:
  (*_DAT_7ff70cbebad8)(lVar6);
  return 0x1b;
}


