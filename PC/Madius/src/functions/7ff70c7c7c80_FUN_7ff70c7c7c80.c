/* 7ff70c7c7c80 FUN_7ff70c7c7c80 */

void FUN_7ff70c7c7c80(longlong param_1)

{
  code *pcVar1;
  longlong *plVar2;
  int iVar3;
  longlong *plVar4;
  longlong lVar5;
  ulonglong uVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  
  iVar3 = *(int *)(param_1 + 0x68);
  if ((longlong)iVar3 != 0) {
    lVar5 = *(longlong *)(param_1 + 0x70);
    lVar8 = 0;
    do {
      FUN_7ff70c7c8d40(param_1,*(undefined8 *)(lVar5 + lVar8));
      lVar8 = lVar8 + 8;
    } while ((longlong)iVar3 * 8 != lVar8);
  }
  lVar5 = *(longlong *)(param_1 + 0x2b0);
  if (lVar5 != 0) {
    if ((*(longlong *)(param_1 + 0x2b8) != 0) &&
       (pcVar1 = *(code **)(*(longlong *)(param_1 + 0x2b8) + 0x10), pcVar1 != (code *)0x0)) {
      (*pcVar1)(param_1);
      lVar5 = *(longlong *)(param_1 + 0x2b0);
      if (lVar5 == 0) goto LAB_7ff70c7c7d9f;
    }
    if (*(longlong *)(lVar5 + 0xe0) != 0) {
      FUN_7ff70c802510();
    }
    lVar8 = *(longlong *)(lVar5 + 0xd0);
    iVar3 = *(int *)(lVar5 + 200);
    if ((longlong)iVar3 != 0) {
      lVar9 = 0;
      do {
        FUN_7ff70c802510(*(undefined8 *)(lVar8 + lVar9));
        lVar9 = lVar9 + 8;
      } while ((longlong)iVar3 * 8 != lVar9);
      lVar8 = *(longlong *)(lVar5 + 0xd0);
    }
    if (lVar8 != 0) {
      FUN_7ff70c802510(lVar8);
    }
    if (*(longlong *)(lVar5 + 0x88) != 0) {
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar5 + 0x78) != 0) {
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar5 + 0x68) != 0) {
      FUN_7ff70c802510();
    }
    if (*(longlong *)(lVar5 + 0x58) != 0) {
      FUN_7ff70c802510();
    }
    FUN_7ff70c802510(lVar5);
  }
LAB_7ff70c7c7d9f:
  *(undefined8 *)(param_1 + 0x2b0) = 0;
  iVar3 = *(int *)(param_1 + 0x68);
  if ((longlong)iVar3 != 0) {
    lVar5 = *(longlong *)(param_1 + 0x70);
    lVar8 = 0;
    do {
      FUN_7ff70c7c8d40(param_1,*(undefined8 *)(lVar5 + lVar8));
      lVar8 = lVar8 + 8;
    } while ((longlong)iVar3 * 8 != lVar8);
  }
  iVar3 = *(int *)(param_1 + 0x78);
  if ((longlong)iVar3 != 0) {
    lVar5 = *(longlong *)(param_1 + 0x80);
    lVar8 = 0;
    do {
      if (*(char *)(lVar5 + 0x34 + lVar8) == '\x01') {
        FUN_7ff70c802510(*(undefined8 *)(lVar5 + 0x28 + lVar8));
      }
      *(undefined8 *)(lVar5 + 0x28 + lVar8) = 0;
      if (*(longlong *)(lVar5 + 0x48 + lVar8) != 0) {
        FUN_7ff70c802510();
      }
      *(undefined8 *)(lVar5 + 0x48 + lVar8) = 0;
      lVar8 = lVar8 + 0x90;
    } while ((longlong)iVar3 * 0x90 != lVar8);
  }
  iVar3 = *(int *)(param_1 + 0x68);
  if ((longlong)iVar3 != 0) {
    lVar5 = *(longlong *)(param_1 + 0x70);
    lVar8 = 0;
    do {
      lVar9 = *(longlong *)(lVar5 + lVar8);
      if (*(longlong *)(lVar9 + 0x28) != 0) {
        *(undefined8 *)(lVar9 + 0x20) = 0;
        FUN_7ff70c802510();
        *(undefined8 *)(lVar9 + 0x28) = 0;
      }
      *(byte *)(lVar9 + 0x10) = *(byte *)(lVar9 + 0x10) | 4;
      lVar8 = lVar8 + 8;
    } while ((longlong)iVar3 * 8 != lVar8);
  }
  if (*(longlong *)(param_1 + 0x80) != 0) {
    *(undefined8 *)(param_1 + 0x78) = 0;
    FUN_7ff70c802510();
    *(undefined8 *)(param_1 + 0x80) = 0;
  }
  iVar3 = *(int *)(param_1 + 0x68);
  if (0 < iVar3) {
    lVar5 = 0;
    do {
      lVar8 = *(longlong *)(*(longlong *)(param_1 + 0x70) + lVar5 * 8);
      if (lVar8 != 0) {
        FUN_7ff70c7f71e0(lVar8);
        FUN_7ff70c802510(lVar8);
        iVar3 = *(int *)(param_1 + 0x68);
      }
      lVar5 = lVar5 + 1;
    } while (lVar5 < iVar3);
  }
  if (*(longlong *)(param_1 + 0x70) != 0) {
    *(undefined8 *)(param_1 + 0x68) = 0;
    FUN_7ff70c802510();
    *(undefined8 *)(param_1 + 0x70) = 0;
  }
  *(undefined1 *)(param_1 + 0x52) = 0;
  lVar5 = (longlong)*(int *)(param_1 + 0x2a0);
  if (lVar5 != 0) {
    plVar2 = *(longlong **)(param_1 + 0x2a8);
    uVar6 = lVar5 * 8 - 8;
    plVar4 = plVar2;
    if ((~(uint)uVar6 & 0x18) != 0) {
      uVar7 = (ulonglong)(((uint)(uVar6 >> 3) & 0x1fffffff) + 1 & 3);
      do {
        lVar8 = *plVar4;
        if (*(longlong *)(lVar8 + 0x10) == param_1) {
          *(undefined8 *)(lVar8 + 0x18) = 0;
          *(undefined8 *)(lVar8 + 0x20) = 0;
        }
        plVar4 = plVar4 + 1;
        uVar7 = uVar7 - 1;
      } while (uVar7 != 0);
    }
    if (0x17 < uVar6) {
      do {
        lVar8 = *plVar4;
        if (*(longlong *)(lVar8 + 0x10) == param_1) {
          *(undefined8 *)(lVar8 + 0x18) = 0;
          *(undefined8 *)(lVar8 + 0x20) = 0;
          lVar8 = plVar4[1];
          if (*(longlong *)(lVar8 + 0x10) == param_1) goto LAB_7ff70c7c7ffe;
LAB_7ff70c7c7fcc:
          lVar8 = plVar4[2];
          if (*(longlong *)(lVar8 + 0x10) != param_1) goto LAB_7ff70c7c7fd6;
LAB_7ff70c7c800c:
          *(undefined8 *)(lVar8 + 0x18) = 0;
          *(undefined8 *)(lVar8 + 0x20) = 0;
          lVar8 = plVar4[3];
          lVar9 = *(longlong *)(lVar8 + 0x10);
        }
        else {
          lVar8 = plVar4[1];
          if (*(longlong *)(lVar8 + 0x10) != param_1) goto LAB_7ff70c7c7fcc;
LAB_7ff70c7c7ffe:
          *(undefined8 *)(lVar8 + 0x18) = 0;
          *(undefined8 *)(lVar8 + 0x20) = 0;
          lVar8 = plVar4[2];
          if (*(longlong *)(lVar8 + 0x10) == param_1) goto LAB_7ff70c7c800c;
LAB_7ff70c7c7fd6:
          lVar8 = plVar4[3];
          lVar9 = *(longlong *)(lVar8 + 0x10);
        }
        if (lVar9 == param_1) {
          *(undefined8 *)(lVar8 + 0x18) = 0;
          *(undefined8 *)(lVar8 + 0x20) = 0;
        }
        plVar4 = plVar4 + 4;
      } while (plVar4 != plVar2 + lVar5);
    }
  }
  return;
}


