
undefined1  [16] FUN_00084118(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  undefined1 uVar1;
  undefined1 uVar2;
  code *pcVar3;
  undefined8 uVar4;
  long *plVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *puVar8;
  char *pcVar9;
  undefined1 *puVar10;
  ulong uVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined1 uStack0000000000000028;
  undefined1 uStack_60;
  undefined7 uStack_5f;
  undefined8 uStack_58;
  undefined1 uStack_50;
  undefined7 uStack_4f;
  undefined8 uStack_48;
  undefined1 uStack_38;
  undefined7 uStack_37;
  undefined8 uStack_30;
  undefined1 uStack_25;
  undefined4 uStack_24;
  
  uVar4 = func_0x0001753c();
  func_0x000780c4(&uStack0000000000000028);
  plVar5 = (long *)__Unwind_Resume(uVar4);
  if ((*(ulong *)(plVar5[4] + (plVar5[5] - 1U >> 3 & 0x1ffffffffffffff8)) >> (plVar5[5] - 1U & 0x3f)
      & 1) == 0) {
    return ZEXT816(0);
  }
  uStack_38 = 0;
  uStack_30 = 0;
  if ((param_3 & 1) == 0) {
    uStack_24 = (undefined4)((ulong)(plVar5[2] - plVar5[1]) >> 3);
    uStack_25 = 5;
    plVar6 = (long *)plVar5[0xf];
    if (plVar6 == (long *)0x0) {
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x84324);
      (*pcVar3)();
    }
    uVar7 = (**(code **)(*plVar6 + 0x30))(plVar6,&uStack_24,&uStack_25,&uStack_38);
    if ((uVar7 & 1) != 0) goto LAB_000841a8;
LAB_000842c0:
    uVar4 = 0;
    lVar12 = 0;
  }
  else {
LAB_000841a8:
    uVar4 = uStack_30;
    uVar2 = uStack_38;
    if (plVar5[1] == plVar5[2]) {
      uStack_38 = 0;
      uStack_30 = 0;
      puVar10 = (undefined1 *)*plVar5;
      uVar1 = *puVar10;
      *puVar10 = uVar2;
      _uStack_50 = CONCAT71(uStack_37,uVar1);
      uStack_48 = *(undefined8 *)(puVar10 + 8);
      *(undefined8 *)(puVar10 + 8) = uVar4;
      func_0x00078220((ulong)&uStack_50 | 8);
      lVar12 = *plVar5;
    }
    else {
      pcVar9 = *(char **)(plVar5[2] + -8);
      if (pcVar9 == (char *)0x0) goto LAB_000842c0;
      if (*pcVar9 == '\x02') {
        lVar12 = *(long *)(pcVar9 + 8);
        puVar8 = *(undefined8 **)(lVar12 + 8);
        if (puVar8 < *(undefined8 **)(lVar12 + 0x10)) {
          puVar8[1] = uStack_30;
          *puVar8 = CONCAT71(uStack_37,uStack_38);
          uStack_38 = 0;
          uStack_30 = 0;
          puVar8 = puVar8 + 2;
        }
        else {
          puVar8 = (undefined8 *)func_0x00082e88(lVar12,&uStack_38);
        }
        *(undefined8 **)(lVar12 + 8) = puVar8;
        lVar12 = *(long *)(*(long *)(*(long *)(plVar5[2] + -8) + 8) + 8) + -0x10;
      }
      else {
        uVar7 = plVar5[8] - 1;
        uVar11 = *(ulong *)(plVar5[7] + (uVar7 >> 3 & 0x1ffffffffffffff8));
        plVar5[8] = uVar7;
        if ((uVar11 >> (uVar7 & 0x3f) & 1) == 0) goto LAB_000842c0;
        uStack_38 = 0;
        uStack_30 = 0;
        puVar10 = (undefined1 *)plVar5[10];
        uVar1 = *puVar10;
        *puVar10 = uVar2;
        _uStack_60 = CONCAT71(uStack_37,uVar1);
        uStack_58 = *(undefined8 *)(puVar10 + 8);
        *(undefined8 *)(puVar10 + 8) = uVar4;
        func_0x00078220((ulong)&uStack_60 | 8);
        lVar12 = plVar5[10];
      }
    }
    uVar4 = 1;
  }
  func_0x00078220(&uStack_30,uStack_38);
  auVar13._8_8_ = lVar12;
  auVar13._0_8_ = uVar4;
  return auVar13;
}

