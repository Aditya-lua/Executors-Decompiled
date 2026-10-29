/* 7ff70c941bc0 FUN_7ff70c941bc0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c941bc0(longlong *param_1,longlong *param_2)

{
  undefined8 *puVar1;
  longlong *plVar2;
  longlong lVar3;
  
  *(char *)(param_2 + 0xd) = (char)param_1[0xd];
  *(undefined4 *)((longlong)param_2 + 100) = *(undefined4 *)((longlong)param_1 + 100);
  *(undefined1 *)((longlong)param_2 + 0x69) = *(undefined1 *)((longlong)param_1 + 0x69);
  *(undefined1 *)((longlong)param_2 + 0x6a) = *(undefined1 *)((longlong)param_1 + 0x6a);
  *(undefined1 *)((longlong)param_2 + 0x6b) = *(undefined1 *)((longlong)param_1 + 0x6b);
  *(undefined1 *)((longlong)param_2 + 0x6c) = *(undefined1 *)((longlong)param_1 + 0x6c);
  *(char *)(param_2 + 0xc) = (char)param_1[0xc];
  puVar1 = (undefined8 *)param_1[8];
  if (puVar1 != (undefined8 *)0x0) {
    plVar2 = (longlong *)(*_DAT_7ff70cbebad0)(puVar1[1] + 0x18);
    if (plVar2 == (longlong *)0x0) {
      return 0;
    }
    plVar2[1] = puVar1[1];
    *(undefined4 *)(plVar2 + 2) = 1;
    *plVar2 = (longlong)(plVar2 + 3);
    FUN_7ff70cb12b60(plVar2 + 3,*puVar1,puVar1[1]);
    param_2[8] = (longlong)plVar2;
  }
  puVar1 = (undefined8 *)param_1[9];
  if (puVar1 != (undefined8 *)0x0) {
    plVar2 = (longlong *)(*_DAT_7ff70cbebad0)(puVar1[1] + 0x18);
    if (plVar2 == (longlong *)0x0) {
      return 0;
    }
    plVar2[1] = puVar1[1];
    *(undefined4 *)(plVar2 + 2) = 1;
    *plVar2 = (longlong)(plVar2 + 3);
    FUN_7ff70cb12b60(plVar2 + 3,*puVar1,puVar1[1]);
    param_2[9] = (longlong)plVar2;
  }
  puVar1 = (undefined8 *)param_1[10];
  if (puVar1 != (undefined8 *)0x0) {
    plVar2 = (longlong *)(*_DAT_7ff70cbebad0)(puVar1[1] + 0x18);
    if (plVar2 == (longlong *)0x0) {
      return 0;
    }
    plVar2[1] = puVar1[1];
    *(undefined4 *)(plVar2 + 2) = 1;
    *plVar2 = (longlong)(plVar2 + 3);
    FUN_7ff70cb12b60(plVar2 + 3,*puVar1,puVar1[1]);
    param_2[10] = (longlong)plVar2;
  }
  if (*param_1 == 0) {
    *param_2 = 0;
    lVar3 = param_1[1];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    *param_2 = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[1];
  }
  if (lVar3 == 0) {
    param_2[1] = 0;
    lVar3 = param_1[2];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[1] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[2];
  }
  if (lVar3 == 0) {
    param_2[2] = 0;
    lVar3 = param_1[3];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[2] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[3];
  }
  if (lVar3 == 0) {
    param_2[3] = 0;
    lVar3 = param_1[4];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[3] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[4];
  }
  if (lVar3 == 0) {
    param_2[4] = 0;
    lVar3 = param_1[5];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[4] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[5];
  }
  if (lVar3 == 0) {
    param_2[5] = 0;
    lVar3 = param_1[6];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[5] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[6];
  }
  if (lVar3 == 0) {
    param_2[6] = 0;
    lVar3 = param_1[0xb];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[6] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[0xb];
  }
  if (lVar3 == 0) {
    param_2[0xb] = 0;
    lVar3 = param_1[7];
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[0xb] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
    lVar3 = param_1[7];
  }
  if (lVar3 == 0) {
    param_2[7] = 0;
  }
  else {
    lVar3 = (*_DAT_7ff70cbebae8)();
    param_2[7] = lVar3;
    if (lVar3 == 0) {
      return 0;
    }
  }
  return 1;
}


